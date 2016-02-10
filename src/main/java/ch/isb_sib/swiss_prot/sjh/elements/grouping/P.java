package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class P extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "p".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public P(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren) {
	super(ga, childeren);
    }

    public P() {
	super();
    }

}
