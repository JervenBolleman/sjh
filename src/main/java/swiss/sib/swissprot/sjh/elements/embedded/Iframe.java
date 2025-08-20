package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.SandBox;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.embedded.SrcDoc;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Iframe extends CommonElement
        implements FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "iframe".getBytes(UTF_8);
    private final Src src;
    private final SrcDoc srcdoc;
    private final Name name;
    private final SandBox sandbox;
    private final Width width;
    private final Height height;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Iframe(Stream<GlobalAttribute> ga, Src src, SrcDoc srcdoc, Name name, SandBox sandbox, Width width,
            Height height) {
        super(ga, Stream.empty());
        this.src = src;
        this.srcdoc = srcdoc;
        this.name = name;
        this.sandbox = sandbox;
        this.width = width;
        this.height = height;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(src, srcdoc, name, sandbox, width, height).filter(Objects::nonNull);
    }
}
