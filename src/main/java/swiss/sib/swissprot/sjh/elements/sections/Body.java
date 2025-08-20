package swiss.sib.swissprot.sjh.elements.sections;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.SectioningRoot;

public non-sealed class Body extends CommonElement implements SectioningRoot {
    private final static byte[] NAME = "body".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Body(Stream<GlobalAttribute> ga, Stream<Element> childeren) {
        super(ga, childeren);
    }

    public Body() {
        super();
    }
}
