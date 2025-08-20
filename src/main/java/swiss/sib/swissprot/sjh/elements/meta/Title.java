package swiss.sib.swissprot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Text;

public class Title extends CommonElement {
    private final static byte[] NAME = "title".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Title(Stream<GlobalAttribute> ga, Text text) {
        super(ga, Stream.of(text));
    }

    public Title() {
        super();
    }

    public Title(Text text) {
        super(Stream.<GlobalAttribute> empty(), Stream.of(text));
    }
}
