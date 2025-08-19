package ch.isb_sib.swiss_prot.sjh.elements.text.ruby;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Rp extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "rp".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Rp(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren) {
        super(ga, childeren);
    }

    public Rp() {
        super();
    }
}
