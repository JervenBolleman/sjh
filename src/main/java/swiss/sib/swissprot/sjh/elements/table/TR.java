package swiss.sib.swissprot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;

public class TR extends CommonElement {
    private final static byte[] NAME = "tr".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public TR(Stream<GlobalAttribute> ga, Stream<TDOrTH> children) {
        super(ga, children);
    }
}
