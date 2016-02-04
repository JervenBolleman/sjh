package ch.isb_sib.swiss_prot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.AccessKey;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Clazz;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Dir;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Hidden;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Id;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Lang;
import ch.isb_sib.swiss_prot.sjh.attributes.global.SpellCheck;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Style;
import ch.isb_sib.swiss_prot.sjh.attributes.global.TabIndex;
import ch.isb_sib.swiss_prot.sjh.attributes.global.ATitle;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Translate;


public class HTML
    extends CommonElement
{
	private final static byte[] NAME = "html".getBytes(UTF_8);
	private static final byte[] DOCTYPE = "<!DOCTYPE html>".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public HTML(GlobalAttribute[] ga, Head head, Body body)
	{
		super(ga, Stream.of(head, body));
	}

	public HTML()
	{
		super();
	}

	public HTML(Head head, Body body)
	{
		super(Stream.of(head, body));
	}

	@Override
	public void render(OutputStream stream)
	    throws IOException
	{
		stream.write(DOCTYPE);
		super.render(stream);
	}
}
