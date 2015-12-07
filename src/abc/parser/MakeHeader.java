package abc.parser;

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
	private Integer tempo;
	private Key key;

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
					header.setDefaultLength(new RatNum(1, 16));
				}
				else {
					header.setDefaultLength(new RatNum(1, 8));
				}
			}
		}
		
		if (tempo != null) {
			header.setTempo(tempo);
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
		title = ctx.characters().getText();
		
	}

	@Override
	public void enterComposer(ComposerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComposer(ComposerContext ctx) {
		composer = ctx.characters().getText();
		
	}

	@Override
	public void enterLength(LengthContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLength(LengthContext ctx) {
		String str = ctx.getText().substring(2).trim();
		String[] split = str.split("/");
		length = new RatNum(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		
	}

	@Override
	public void enterMeter(MeterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMeter(MeterContext ctx) {
		String str = ctx.getText().substring(2).trim();
		if (str.equals("C")) meter = new RatNum(4, 4);
		else if (str.equals("C|")) meter = new RatNum(2, 2);
		else {
			String[] split = str.split("/");
			meter = new RatNum(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		}
		
	}

	@Override
	public void enterTempo(TempoContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTempo(TempoContext ctx) {
		tempo = Integer.parseInt(ctx.getText().substring(2).trim());
		
	}

	@Override
	public void enterKey(KeyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitKey(KeyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVoice(VoiceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVoice(VoiceContext ctx) {
		// TODO Auto-generated method stub
		
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