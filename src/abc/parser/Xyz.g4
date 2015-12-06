/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Xyz;
import Configuration;

root: header EOF;

header : index title (composer | length | meter | tempo | voice)* key;



index : INDEX_PREFIX SPACE* number SPACE* NEWLINE;
title : TITLE_PREFIX characters NEWLINE;
composer : COMPOSER_PREFIX characters NEWLINE;
length : LENGTH_PREFIX number NEWLINE;
meter : METER_PREFIX ( METER_LETTER |number) NEWLINE;
tempo : TEMPO_PREFIX (number '=')? temp_bpm NEWLINE;
key : KEY_PREFIX  MUSIC_LETTER (SHARP|FLAT)? (MINOR)? NEWLINE;
voice : VOICE_PREFIX characters NEWLINE;


characters : (MUSIC_LETTER|LETTERS|SPECIAL|DIGIT|SPACE)+;
temp_bpm: DIGIT+;
number: DIGIT+ '/'? DIGIT*;

SPECIAL: [$&+,:;=?@#|'<>.^*()%!-];
DIGIT: [0-9];
SPACE: ' ';
NEWLINE : [\n\r]+;
LETTERS : [h-zH-Z];
SHARP: '#';
FLAT: 'b';
MINOR: 'm';
METER_LETTER: 'C' | 'C|';
MUSIC_LETTER: [A-Ga-g];




INDEX_PREFIX : 'X:';
TITLE_PREFIX : 'T:';
COMPOSER_PREFIX: 'C:';
LENGTH_PREFIX: 'L:';
METER_PREFIX: 'M:';
TEMPO_PREFIX: 'Q:';
KEY_PREFIX: 'K:';
VOICE_PREFIX: 'V:';
