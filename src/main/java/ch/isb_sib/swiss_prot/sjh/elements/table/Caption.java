package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;

public class Caption extends CommonElement {
    private final static byte[] NAME = "caption".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Caption(GlobalAttribute[] ga, Stream<? extends FlowContent> childeren) {
	super(ga, childeren);
    }
}
