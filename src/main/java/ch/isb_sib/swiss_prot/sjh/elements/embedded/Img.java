package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Alt;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.IsMap;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.UseMap;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.EmbeddedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FormAssociatedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Img extends CommonElement implements FlowContent, PhrasingContent, EmbeddedContent,
        FormAssociatedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "img".getBytes(UTF_8);
    private final Alt alt;
    private final Src src;
    private final CrossOrigin co;
    private final UseMap um;
    private final IsMap im;
    private final Width width;
    private final Height height;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Img(Stream<GlobalAttribute> ga, Alt alt, Src src, CrossOrigin co, UseMap um, IsMap im, Width width,
            Height height) {
        super(ga, Stream.empty());
        this.alt = alt;
        this.src = src;
        this.co = co;
        this.um = um;
        this.im = im;
        this.width = width;
        this.height = height;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(alt, src, co, um, im, width, height).filter(Objects::nonNull);
    }
}
