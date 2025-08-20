package swiss.sib.swissprot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.content.ContentAttribute;
import swiss.sib.swissprot.sjh.attributes.content.Media;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Text;

public class Style extends CommonElement {
    private final static byte[] NAME = "style".getBytes(UTF_8);
    private final Media media;
    private final Type type;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Style(Stream<GlobalAttribute> ga, Media media, Type type, Text text) {
        super(ga, Stream.of(text));
        this.media = media;
        this.type = type;
    }

    public Style() {
        super();
        this.media = null;
        this.type = null;
    }

    public Style(Text text) {
        super(Stream.<GlobalAttribute> empty(), Stream.of(text));
        this.media = null;
        this.type = null;
    }

    @Override
    protected Stream<ContentAttribute> getElementSpecificAttributes() {
        return Stream.of(media, type).filter(Objects::nonNull);
    }
}
