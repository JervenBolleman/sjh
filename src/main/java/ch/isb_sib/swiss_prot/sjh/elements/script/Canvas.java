package ch.isb_sib.swiss_prot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.embedded.EmbeddedAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

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
