./*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Xyz;
import Configuration;

root: header body EOF;

header : field_number field_title field_other* field_key;

field_number : INDEX;
field_title : TITLE;
field_other : field_composer | field_length | field_meter | field_tempo;
field_composer : COMPOSER;
field_length : LENGTH;
field_meter : METER;
field_tempo : TEMPO;
field_key : KEY;

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
