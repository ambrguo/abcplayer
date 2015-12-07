/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Xyz;
import Configuration;

root: header EOF;

header : index title (composer | length | meter | tempo | voice)* key;

DIGITS: [0-9]+;

index : INDEX_PREFIX SPACE* DIGITS SPACE* NEWLINE;
title : TITLE_PREFIX characters NEWLINE;
composer : COMPOSER_PREFIX characters NEWLINE;
length : LENGTH_PREFIX SPACE* DIGITS SLASH DIGITS SPACE* NEWLINE;
meter : METER_PREFIX SPACE* ( C_LETTER|CL_LETTER |DIGITS SLASH DIGITS) SPACE* NEWLINE;
tempo : TEMPO_PREFIX SPACE* (DIGITS SLASH DIGITS SPACE* '=')? SPACE* DIGITS SPACE* NEWLINE;
key : KEY_PREFIX  SPACE* (MUSIC_LETTER|FLAT|C_LETTER) (SHARP|FLAT)? (MINOR)? SPACE* NEWLINE;
voice : VOICE_PREFIX characters NEWLINE;


SLASH: '/';
SPACE: ' ';
NEWLINE : [\n\r]+;
LETTERS : [h-ln-zH-Z];
SHARP: '#';
FLAT: 'b';
MINOR: 'm';
C_LETTER: 'C' ;
CL_LETTER: 'C|';
MUSIC_LETTER: [ABD-Gac-g];
SPECIAL: [$&+,:;=?@|'<>\.^*()%!-_\\];

characters : (MUSIC_LETTER|LETTERS|SPECIAL|SLASH|DIGITS|SPACE|SHARP|MINOR|FLAT|C_LETTER)+;




INDEX_PREFIX : 'X:';
TITLE_PREFIX : 'T:';
COMPOSER_PREFIX: 'C:';
LENGTH_PREFIX: 'L:';
METER_PREFIX: 'M:';
TEMPO_PREFIX: 'Q:';
KEY_PREFIX: 'K:';
VOICE_PREFIX: 'V:';
