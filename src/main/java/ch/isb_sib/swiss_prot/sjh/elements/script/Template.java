package ch.isb_sib.swiss_prot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;
import ch.isb_sib.swiss_prot.sjh.elements.table.ColOrTemplate;


public class Template
    extends CommonElement
    implements FlowContent, PhrasingContent, MetaContent, PalpabaleContent, ColOrTemplate
{
	private final static byte[] NAME = "template".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Template(GlobalAttribute[] ga, Stream<? extends FlowContent> childeren)
	{
		super(ga, childeren);
	}

	public Template()
	{
		super();
	}

	public Template(Stream<? extends FlowContent> childeren)
	{
		super(childeren);
	}

	public Template(GlobalAttribute[] globalAttributes)
	{
		super(globalAttributes);
	}
}
