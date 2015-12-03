/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Xyz;
import Configuration;

root: header EOF;

header : index title (composer | length | meter | tempo)* key;



index : INDEX_PREFIX ' '* NUMBER ' '* NEWLINE;
title : TITLE_PREFIX (VARIABLE |LETTER| NUMBER| ' '| '.')+ NEWLINE;
composer : COMPOSER_PREFIX (.|' ')+ NEWLINE;
length : LENGTH_PREFIX NUMBER NEWLINE;
meter : METER_PREFIX ( LETTER |NUMBER) NEWLINE;
tempo : TEMPO_PREFIX (NUMBER'=')? NUMBER NEWLINE;
key : KEY_PREFIX  LETTER ('#'|'b')? ('m')? NEWLINE;
voice : VOICE_PREFIX (.|' ')+ NEWLINE;

NUMBER : [0-9]+'/'?[0-9]*;
NEWLINE : [\n\r]+;
LETTER : [a-gA-G];
VARIABLE: [H-Zh-z];



INDEX_PREFIX : 'X:';
TITLE_PREFIX : 'T:';
COMPOSER_PREFIX: 'C:';
LENGTH_PREFIX: 'L:';
METER_PREFIX: 'M:';
TEMPO_PREFIX: 'Q:';
KEY_PREFIX: 'K:';
VOICE_PREFIX: 'V:';
