/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Xyz;
import Configuration;

root: header EOF;

header : index title (composer | length | meter | tempo | voice)* key;



index : INDEX_PREFIX ' '* NUMBER ' '* NEWLINE;
title : TITLE_PREFIX name NEWLINE;
composer : COMPOSER_PREFIX name NEWLINE;
length : LENGTH_PREFIX NUMBER NEWLINE;
meter : METER_PREFIX ( METER_LETTER |NUMBER) NEWLINE;
tempo : TEMPO_PREFIX (NUMBER'=')? NUMBER NEWLINE;
key : KEY_PREFIX  MUSIC_LETTER (SHARP|FLAT)? (MINOR)? NEWLINE;
voice : VOICE_PREFIX (.|' ')+ NEWLINE;

name: (LETTERS| MUSIC_LETTER |NUMBER| ' '| '.')+;

NUMBER : [0-9]+'/'?[0-9]*;
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
