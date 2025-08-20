package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.Value;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

public class LI extends CommonElement {
    private final static byte[] NAME = "li".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public LI(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren, Value value) {
        super(ga, childeren);
    }

    public LI() {
        super();
    }
}
