/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root : body EOF;



body : line+;

line :  NEWLINE* (measure+ | voice) NEWLINE;
measure : NEWLINE* (BEGIN_REPEAT | ONE_REPEAT | TWO_REPEAT | BARLINE)? SPACE* (element SPACE*)+ SPACE* (BARLINE| END_REPEAT| NEWLINE) SPACE*;
voice : VOICE_PREFIX (.|SPACE)+ NEWLINE;
element : note | rest | chord | tuplet;
tuplet : duplet | triplet | quadruplet;
note : (accidental? LETTER octave? duration?);
rest : REST duration?;
duration: DURATION;
octave: OCTAVE;
accidental: ACCIDENTAL;
chord : '[' note+ ']';
duplet : DUPLET (note | chord) (note | chord);
triplet : TRIPLET (note | chord) (note | chord) (note | chord);
quadruplet : QUADRUPLET (note | chord) (note | chord) (note | chord) (note | chord);






NEWLINE : [\n\r]+;
LETTER : [a-gA-G];
REST: 'z';

SPACE: ' ';
DURATION: ([1-9]+| ' / ' | [1-9]* '/' [1-9]*);
OCTAVE : ('\'' | ',')+;
ACCIDENTAL : ('^'|'^^'|'_'|'__' | '=');
DUPLET : '(' '2';
TRIPLET : '(' '3';
QUADRUPLET : '(' '4';
BARLINE : '|' | '[|';
BEGIN_REPEAT : '|:';
END_REPEAT : ':|';

ONE_REPEAT : '[1';
TWO_REPEAT : '[2';

VOICE_PREFIX: 'V:';

/* tell Antlr to ignore spaces around tokens. */
SPACES : [ ]+ -> skip;
PERCENT : [%]+ -> skip;