package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Embed extends CommonElement
        implements FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "embed".getBytes(UTF_8);
    private final Src src;
    private final Width width;
    private final Height height;
    private Type type;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Embed(Stream<GlobalAttribute> ga, Src src, Type type, Width width, Height height) {
        super(ga, Stream.empty());
        this.src = src;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(src, type, width, height).filter(Objects::nonNull);
    }
}
