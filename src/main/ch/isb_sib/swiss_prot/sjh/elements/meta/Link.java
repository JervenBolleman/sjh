package ch.isb_sib.swiss_prot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.HrefLang;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Media;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Sizes;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;


public class Link
    extends CommonElement
    implements MetaContent
{
	private final static byte[] NAME = "link".getBytes(UTF_8);
	private final Href href;
	private final CrossOrigin co;
	private final Rel rel;
	private final Media media;
	private final HrefLang hrefLang;
	private final Type type;
	private final Sizes size;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Link(GlobalAttribute[] ga, Href href, CrossOrigin co, Rel rel, Media media, HrefLang hreflang, Type type,
	    Sizes size)
	{
		super(ga);
		this.href = href;
		this.co = co;
		this.rel = rel;
		this.media = media;
		this.hrefLang = hreflang;
		this.type = type;
		this.size = size;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		return Stream.of(href, co, rel, media, hrefLang, type, size)
		    .filter(Objects::nonNull);
	}

}
