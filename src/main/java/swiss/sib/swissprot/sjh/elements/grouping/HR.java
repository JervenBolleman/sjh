package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

public non-sealed class HR extends CommonElement implements FlowContent {
    private final static byte[] NAME = "hr".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public HR(Stream<GlobalAttribute> ga) {
        super(ga, Stream.empty());
    }

    public HR() {
        super();
    }
}
