package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;

public class FigCaption extends CommonElement {
    private final static byte[] NAME = "figcaption".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public FigCaption(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
    }

    public FigCaption() {
        super();
    }
}
