package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.CrossOrigin;
import swiss.sib.swissprot.sjh.attributes.embedded.Alt;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.IsMap;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.embedded.UseMap;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FormAssociatedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

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
