/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root : header body EOF;

header : field_number field_title field_other* field_key;

field_number : INDEX;
field_title : TITLE;
field_other : field_composer | field_length | field_meter | field_tempo;
field_composer : COMPOSER;
field_length : LENGTH;
field_meter : METER;
field_tempo : TEMPO;
field_key : KEY;

body : line+;
line : NEWLINE* measure+ NEWLINE*;
measure : (BEGIN_REPEAT | ONE_REPEAT | TWO_REPEAT | BARLINE)? element+ (BARLINE | END_NOTES | NEWLINE | END_REPEAT)?;

element : note | rest | chord | tuplet;
tuplet : duplet | triplet | quadruplet;
note : NOTE;
rest : REST;
chord : '[' note+ ']';
duplet : DUPLET (note | chord) (note | chord);
triplet : TRIPLET (note | chord) (note | chord) (note | chord);
quadruplet : QUADRUPLET (note | chord) (note | chord) (note | chord) (note | chord);

INDEX : 'X:' NUMBER ' '* NEWLINE;
TITLE : 'T:' [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ NEWLINE;
COMPOSER : 'C:' [a-zA-Z0-9'.'' ']+ NEWLINE;
LENGTH : 'L:' NUMBER '/' NUMBER NEWLINE;
METER : 'M:' ('C' | 'C|' | NUMBER '/' NUMBER) NEWLINE;
TEMPO : 'Q:' (NUMBER '/' NUMBER '=')? NUMBER NEWLINE;
KEY : 'K:' LETTER ['#''b']? 'm'? NEWLINE;

NUMBER : [0-9]+;
NEWLINE : [\n\r]+;
LETTER : [a-gA-G];

NOTE :  ACCIDENTAL LETTER OCTAVE ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST : 'z' ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
OCTAVE : ('\'' | ',')*;
ACCIDENTAL : ('^'|'^^'|'_'|'__' | '=')?;
DUPLET : '(' '2';
TRIPLET : '(' '3';
QUADRUPLET : '(' '4';
BARLINE : '|' | '[|';
BEGIN_REPEAT : '|:';
END_REPEAT : ':|';
ONE_REPEAT : '[1';
TWO_REPEAT : '[2';

/* tell Antlr to ignore spaces around tokens. */
SPACES : [ ]+ -> skip;