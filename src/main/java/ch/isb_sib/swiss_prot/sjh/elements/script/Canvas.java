package ch.isb_sib.swiss_prot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class Canvas
    extends CommonElement
    implements FlowContent,PhrasingContent,PalpabaleContent, MetaContent
{
	private final static byte[] NAME = "canvas".getBytes(UTF_8);
	private Width width;
	private Height height;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Canvas(GlobalAttribute[] ga, Width width, Height height, Stream<? extends FlowContent> childeren)
	{
		super(ga, childeren);
		this.width = width;
		this.height = height;
	}

	public Canvas()
	{
		super();
	}

	public Canvas(Stream<? extends FlowContent> childeren)
	{
		super(childeren);
	}

	public Canvas(GlobalAttribute[] globalAttributes)
	{
		super(globalAttributes);
	}
	
	@Override
	protected Stream<Attribute> getElementSpecificAttributes() {
		return Stream.of(width, height)
				.filter(Objects::nonNull);
	}
}
