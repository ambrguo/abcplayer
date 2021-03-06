package abc.parser;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.XyzParser.CharactersContext;
import abc.parser.XyzParser.ComposerContext;
import abc.parser.XyzParser.HeaderContext;
import abc.parser.XyzParser.IndexContext;
import abc.parser.XyzParser.KeyContext;
import abc.parser.XyzParser.LengthContext;
import abc.parser.XyzParser.MeterContext;
import abc.parser.XyzParser.RootContext;
import abc.parser.XyzParser.TempoContext;
import abc.parser.XyzParser.TitleContext;
import abc.parser.XyzParser.VoiceContext;
import abc.sound.Header;
import abc.sound.Key;
import abc.sound.RatNum;

public class MakeHeader implements XyzListener {
	private Header header;
	
	private int index;
	private String title;
	private String composer;
	private RatNum length;
	private RatNum meter;
	private RatNum tempoLength;
	private Integer tempo;
	private Key key;
	
	private Set<String> voices = new HashSet<>();
	
	public Header getHeader() {
		return header;
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRoot(RootContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRoot(RootContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterHeader(HeaderContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitHeader(HeaderContext ctx) {
		try {
			header = new Header(index, title, key);
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
		if (composer != null) {
			header.setComposer(composer);
		}
		
		if (length != null) {
			header.setDefaultLength(length);
		}
		
		if (meter != null) {
			header.setMeter(meter);
			if (length == null) {
				if (meter.toDouble() < 0.75) {
					length = new RatNum(1, 16);
					header.setDefaultLength(length);
				}
				else {
					length = new RatNum(1, 8);
					header.setDefaultLength(length);
				}
			}
		}
		
		if (tempo != null) {
			if (tempoLength.equals(length)) {
				header.setTempo(tempo);
			}
			else {
				int factor = tempoLength.divide(length).toDouble().intValue();
				header.setTempo(tempo*factor);
			}
		}
		
		if (!voices.isEmpty()) {
			header.setVoice(voices);
		}
 	}

	@Override
	public void enterIndex(IndexContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIndex(IndexContext ctx) {
		index = Integer.parseInt(ctx.DIGITS().getText());
		
	}

	@Override
	public void enterTitle(TitleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTitle(TitleContext ctx) {
		title = ctx.characters().getText().trim();
		
	}

	@Override
	public void enterComposer(ComposerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComposer(ComposerContext ctx) {
		if (ctx.characters() != null) composer = ctx.characters().getText();
		
	}

	@Override
	public void enterLength(LengthContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLength(LengthContext ctx) {
		if ((ctx.DIGITS(0)) != null && (ctx.DIGITS(1)) != null) {
			String num = ctx.DIGITS(0).getText();
			String denom = ctx.DIGITS(1).getText();
			length = new RatNum(Integer.parseInt(num), Integer.parseInt(denom));
		}
		
	}

	@Override
	public void enterMeter(MeterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMeter(MeterContext ctx) {
//		String commonTime = ctx.C_LETTER().getText();
//		String cutTime = ctx.CL_LETTER().getText();
//		String num = ctx.DIGITS(0).getText();
//		String denom = ctx.DIGITS(1).getText();
		
		if (ctx.C_LETTER() != null) {
			meter = new RatNum(4, 4);
		}
		else if (ctx.CL_LETTER() != null) {
			meter = new RatNum(2, 4);
		}
		else {
			String num = ctx.DIGITS(0).getText();
			String denom = ctx.DIGITS(1).getText();
			meter = new RatNum(Integer.parseInt(num), Integer.parseInt(denom));
		}
		
	}

	@Override
	public void enterTempo(TempoContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTempo(TempoContext ctx) {
		if ((ctx.DIGITS(0) != null) && (ctx.DIGITS(1) != null)) {
			String num = ctx.DIGITS(0).getText();
			String denom = ctx.DIGITS(1).getText();
			tempoLength = new RatNum(Integer.parseInt(num), Integer.parseInt(denom));
			tempo = Integer.parseInt(ctx.DIGITS(2).getText());
		}
		
	}

	@Override
	public void enterKey(KeyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitKey(KeyContext ctx) {
		String musicLetter = "";
		if (ctx.MUSIC_LETTER() != null) musicLetter = ctx.MUSIC_LETTER().getText();
		else if (ctx.FLAT(0) != null) musicLetter = ctx.FLAT(0).getText();
		else if (ctx.C_LETTER() != null) musicLetter = ctx.C_LETTER().getText();
//		String flat = ctx.FLAT(1).getText();
//		String sharp = ctx.SHARP().getText();
//		String minor = ctx.MINOR().getText();
		String ks;
		if (ctx.MINOR() == null) {
			// is major key
			if (ctx.FLAT(1) == null) {
				if (ctx.SHARP() == null) {
					ks = musicLetter.toUpperCase() + "_MAJOR";
				}
				else {
					ks = musicLetter.toUpperCase() + "_SHARP_MAJOR";
				}
			}
			else {
				ks = musicLetter.toUpperCase() + "_FLAT_MAJOR";
			}
		}
		else {
			// is minor key
			if (ctx.FLAT(1) == null) {
				if (ctx.SHARP() == null) {
					ks = musicLetter.toUpperCase() + "_MINOR";
				}
				else {
					ks = musicLetter.toUpperCase() + "_SHARP_MINOR";
				}
			}
			else {
				ks = musicLetter.toUpperCase() + "_FLAT_MINOR";
			}
		}
		
		key = Key.valueOf(ks);
		
	}

	@Override
	public void enterVoice(VoiceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVoice(VoiceContext ctx) {
		if (ctx.characters() != null) {
			String voice = ctx.characters().getText().trim();
//			System.out.println(voice);
//			System.out.println(voices);
			voices.add(voice);
		}
//		String voice = ctx.characters().getText().trim();
//		System.out.println(voice);
//		voices.add(voice);
	}

	@Override
	public void enterCharacters(CharactersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCharacters(CharactersContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
}