package swiss.sib.swissprot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;

public class Head extends CommonElement {
    private final static byte[] NAME = "head".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Head(Stream<GlobalAttribute> ga, Title title, Base base, Stream<MetaContent> metacontent) {
        super(ga, concat(title, base, metacontent));
    }

    public Head(Title title, Base base, Stream<MetaContent> metacontent) {
        super(Stream.<GlobalAttribute> empty(), concat(title, base, metacontent));
    }

    public Head(Title title) {
        super(Stream.<GlobalAttribute> empty(), Stream.of(title));
    }

    public Head(Title title, Stream<MetaContent> metacontent) {
        super(Stream.<GlobalAttribute> empty(), Stream.concat(Stream.of(title), metacontent));
    }

    private static Stream<Element> concat(Title title, Base base, Stream<MetaContent> metacontent) {
        return Stream.<Element> concat(Stream.of(title), Stream.<Element> concat(Stream.of(base), metacontent));
    }
}
