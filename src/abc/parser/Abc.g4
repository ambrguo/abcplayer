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
measure :  (BEGIN_REPEAT | ONE_REPEAT | TWO_REPEAT | BARLINE)?  (element)+  (BARLINE|END_REPEAT);
voice : VOICE_PREFIX (LETTER|OTHER_LETTERS|DURATION|ZERO|BARLINE|REST)+;
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
OTHER_LETTERS : [g-yH-Z];
REST: 'z';

ZERO: '0';
DURATION: ([1-9]+| ' / ' | [1-9]* '/' [1-9]*);
OCTAVE : ('\'' | ',')+;
ACCIDENTAL : ('^'|'^^'|'_'|'__' | '=');
DUPLET : '(' '2';
TRIPLET : '(' '3';
QUADRUPLET : '(' '4';
BARLINE : '|' | '[|'| '|]';
BEGIN_REPEAT : '|:';
END_REPEAT : ':|';

ONE_REPEAT : '[1';
TWO_REPEAT : '[2';

VOICE_PREFIX: 'V:';

/* tell Antlr to ignore spaces around tokens. */
SPACES :  [ \t]+ -> skip;
PERCENT : [ %]+ -> skip;
