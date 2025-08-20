package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Default;
import swiss.sib.swissprot.sjh.attributes.embedded.Label;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.embedded.SrcLang;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.Kind;
import swiss.sib.swissprot.sjh.elements.CommonElement;

public class Source extends CommonElement {
    private final static byte[] NAME = "source".getBytes(UTF_8);
    private final Kind kind;
    private final Src src;
    private final Label label;
    private final SrcLang srclang;
    private final Default def;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Source(Stream<GlobalAttribute> ga, Kind kind, Src src, Label label, SrcLang srclang, Default def) {
        super(ga, Stream.empty());
        this.kind = kind;
        this.src = src;
        this.label = label;
        this.srclang = srclang;
        this.def = def;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(kind, src, label, srclang, def).filter(Objects::nonNull);
    }
}
