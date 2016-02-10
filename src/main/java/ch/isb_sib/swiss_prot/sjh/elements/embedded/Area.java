package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.Download;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.HrefLang;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Target;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Alt;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Coords;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Shape;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class Area
    extends CommonElement
    implements FlowContent, PhrasingContent
{
	private final static byte[] NAME = "area".getBytes(UTF_8);
	private final Alt alt;
	private final Coords coords;
	private final Download download;
	private final Href href;
	private final HrefLang hreflang;
	private final Rel rel;
	private final Target target;
	private final Type type;
	private final Shape shape;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

    public Area(Stream<GlobalAttribute> ga, Alt alt, Coords coords, Download download, Href href, HrefLang hreflang,
	    Rel rel,
	    Shape shape, Target target, Type type)
	{
	super(ga, Stream.empty());
		this.alt = alt;
		this.coords = coords;
		this.download = download;
		this.href = href;
		this.hreflang = hreflang;
		this.rel = rel;
		this.target = target;
		this.shape = shape;
		this.type = type;
	}

    public Area(Stream<GlobalAttribute> ga)
	{
	super(ga, Stream.empty());
		this.alt = null;
		this.coords = null;
		this.download = null;
		this.href = null;
		this.hreflang = null;
		this.rel = null;
		this.target = null;
		this.shape = null;
		this.type = null;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		return Stream.of(alt, coords, download, href, hreflang, rel, target, type, shape).filter(Objects::nonNull);
	}
}
