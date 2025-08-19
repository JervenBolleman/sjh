package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;

public non-sealed class UL extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "ul".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public UL(Stream<GlobalAttribute> ga, Stream<LI> childeren) {
	super(ga, childeren);
    }

    public UL() {
	super();
    }
}
