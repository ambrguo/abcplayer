/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root : body EOF;



body : line+;
line : NEWLINE* measure+ NEWLINE* | VOICE;
measure : (BEGIN_REPEAT | ONE_REPEAT | TWO_REPEAT | BARLINE)? ' ' (element ' '?)+ (BARLINE | END_NOTES | NEWLINE | END_REPEAT)?;
VOICE : ('V: '[.]+ NEWLINE)*;

element : note | rest | chord | tuplet;
tuplet : duplet | triplet | quadruplet;
note : NOTE;
rest : REST;
chord : '[' note+ ']';
duplet : DUPLET (note | chord) (note | chord);
triplet : TRIPLET (note | chord) (note | chord) (note | chord);
quadruplet : QUADRUPLET (note | chord) (note | chord) (note | chord) (note | chord);


NUMBER : [0-9]+;
NEWLINE : [\n\r]+;
LETTER : [a-gA-G];

NOTE :  ACCIDENTAL LETTER OCTAVE DURATION;
REST : 'z' DURATION;
DURATION: ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
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