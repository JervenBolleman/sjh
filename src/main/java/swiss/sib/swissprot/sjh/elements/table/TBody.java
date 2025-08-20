package swiss.sib.swissprot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;

public class TBody extends CommonElement {
    private final static byte[] NAME = "tbody".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public TBody(Stream<GlobalAttribute> ga, Stream<TR> children) {
        super(ga, children);
    }
}
