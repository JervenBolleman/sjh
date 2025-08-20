package swiss.sib.swissprot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.embedded.EmbeddedAttribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Canvas extends CommonElement
        implements FlowContent, PhrasingContent, PalpabaleContent, MetaContent {
    private final static byte[] NAME = "canvas".getBytes(UTF_8);
    private Width width;
    private Height height;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Canvas(Stream<GlobalAttribute> ga, Width width, Height height, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
        this.width = width;
        this.height = height;
    }

    public Canvas() {
        super();
    }

    @Override
    protected Stream<EmbeddedAttribute> getElementSpecificAttributes() {
        return Stream.of(width, height).filter(Objects::nonNull);
    }
}
