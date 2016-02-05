package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.BlockQuoteCite;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.SectioningRoot;


public class BlockQuote
    extends CommonElement
    implements FlowContent, SectioningRoot
{
	private final static byte[] NAME = "blockquote".getBytes(UTF_8);
	private final BlockQuoteCite cite;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public BlockQuote(GlobalAttribute[] ga, BlockQuoteCite cite, Stream<? extends FlowContent> childeren)
	{
		super(ga, childeren);
		this.cite = cite;
	}

	public BlockQuote()
	{
		super();
		this.cite = null;
	}

	public BlockQuote(Stream<? extends FlowContent> childeren)
	{
		super(childeren);
		this.cite = null;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		if (this.cite != null)
			return Stream.of(this.cite);
		else
			return Stream.empty();
	}

}