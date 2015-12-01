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
field_other : field_composer | field_length | field_meter | field_tempo
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
chord : BEGIN_BRACKET note+ END_BRACKET;
duplet : DUPLET (note | chord) (note | chord);
triplet : TRIPLET (note | chord) (note | chord) (note | chord);
quadruplet : QUADRUPLET (note | chord) (note | chord) (note | chord) (note | chord);

INDEX : 'X:' SPACE NUMBER ' '* NEWLINE;
TITLE : 'T:' SPACE [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ SPACE NEWLINE;
COMPOSER : 'C:' SPACE [a-zA-Z0-9'.'' ']+ SPACE NEWLINE;
LENGTH : 'L:' SPACE NUMBER '/' NUMBER SPACE NEWLINE;
METER : 'M:' SPACE ('C' | 'C|' | NUMBER '/' NUMBER) SPACE NEWLINE;
TEMPO : 'Q:' SPACE (NUMBER '/' NUMBER SPACE '=')? SPACE NUMBER SPACE NEWLINE;
KEY : 'K:' SPACE LETTER ['#''b']? 'm'? SPACENEWLINE;

NUMBER : [0-9]+;
SPACE : ' '* ;
NEWLINE : [\n\r]+;
LETTER : [a-gA-G];

NOTE :  ACCIDENTAL LETTER OCTAVE ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST : 'z' ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
OCTAVE : ('\'' | ',')*;
ACCIDENTAL : ('^'|'^^'|'_'|'__' \ '=')?;
DUPLET : '(' '2';
TRIPLET : '(' '3';
QUADRUPLET : '(' '4';
BARLINE : '|' | '[|';
BEGIN_REPEAT : '|:';
END_REPEAT : ':|';
ONE_REPEAT : '[1';
TWO_REPEAT : '[2';
BEGIN_BRACKET : '[';
END_BRACKET : ']';