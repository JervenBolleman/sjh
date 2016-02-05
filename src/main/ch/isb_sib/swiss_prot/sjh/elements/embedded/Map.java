package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class Map
    extends CommonElement
    implements FlowContent, PhrasingContent, PalpabaleContent
{
	private final static byte[] NAME = "map".getBytes(UTF_8);
	private final Name name;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Map(GlobalAttribute[] ga, Name name, Stream<? extends FlowContent> childeren)
	{
		super(ga, childeren);
		this.name = name;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		if (name != null)
			return Stream.of(name);
		else
			return Stream.empty();
	}
}
