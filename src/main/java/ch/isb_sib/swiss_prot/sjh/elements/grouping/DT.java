package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;

public non-sealed class DT extends CommonElement implements DtOrDd {
    private final static byte[] NAME = "dt".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public DT(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
	super(ga, childeren);
    }

    public DT() {
	super();
    }
}
