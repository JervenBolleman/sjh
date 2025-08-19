package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Br extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "br".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Br(Stream<GlobalAttribute> ga) {
        super(ga, Stream.empty());
    }

    public Br() {
        super();
    }
}
