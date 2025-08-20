package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;

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
