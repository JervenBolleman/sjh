package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.SandBox;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.SrcDoc;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.EmbeddedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class Iframe
    extends CommonElement
    implements FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent,
    PalpabaleContent
{
	private final static byte[] NAME = "iframe".getBytes(UTF_8);
	private final Src src;
	private final SrcDoc srcdoc;
	private final Name name;
	private final SandBox sandbox;
	private final Width width;
	private final Height height;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Iframe(GlobalAttribute[] ga, Src src, SrcDoc srcdoc, Name name, SandBox sandbox, Width width, Height height)
	{
		super(ga);
		this.src = src;
		this.srcdoc = srcdoc;
		this.name = name;
		this.sandbox = sandbox;
		this.width = width;
		this.height = height;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		return Stream.of(src, srcdoc, name, sandbox, width, height).filter(Objects::nonNull);
	}
}
