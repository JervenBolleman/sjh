package ch.isb_sib.swiss_prot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Media;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Text;


public class Style
    extends CommonElement
{
	private final static byte[] NAME = "style".getBytes(UTF_8);
	private final Media media;
	private final Type type;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Style(Stream<GlobalAttribute> ga, Media media, Type type, Text text)
	{
		super(ga, Stream.of(text));
		this.media = media;
		this.type = type;
	}

	public Style()
	{
		super();
		this.media = null;
		this.type = null;
	}

	public Style(Text text)
	{
	super(Stream.<GlobalAttribute> empty(), Stream.of(text));
		this.media = null;
		this.type = null;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		return Stream.of(media, type).filter(Objects::nonNull);
	}
}
