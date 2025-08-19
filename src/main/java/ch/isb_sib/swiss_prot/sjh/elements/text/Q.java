package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.Cite;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Q extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "q".getBytes(UTF_8);
    private final Cite cite;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Q(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren, Cite cite) {
	super(ga, childeren);
	this.cite = cite;
    }

    public Q(Stream<? extends PhrasingContent> childeren) {
	super(Stream.<GlobalAttribute> empty(), childeren);
	this.cite = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	if (this.cite != null)
	    return Stream.of(this.cite);
	else
	    return Stream.empty();
    }
}
