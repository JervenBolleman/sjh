package swiss.sib.swissprot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.Download;
import swiss.sib.swissprot.sjh.attributes.content.Href;
import swiss.sib.swissprot.sjh.attributes.content.HrefLang;
import swiss.sib.swissprot.sjh.attributes.content.Rel;
import swiss.sib.swissprot.sjh.attributes.content.Target;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class A extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "a".getBytes(UTF_8);
    private final Href href;
    private final Target target;
    private final Download download;
    private final Rel rel;
    private final HrefLang hreflang;
    private final Type type;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public A(Stream<GlobalAttribute> ga, Stream<Element> childeren, Href href) {
        this(ga, childeren, href, null, null, null, null, null);
    }

    public A(Stream<GlobalAttribute> ga, Stream<Element> childeren, Href href, Target target, Download download,
            Rel rel, HrefLang hreflang, Type type) {
        super(ga, childeren);
        this.href = href;
        this.target = target;
        this.download = download;
        this.rel = rel;
        this.hreflang = hreflang;
        this.type = type;
    }

    public A(Stream<Element> childeren) {
        super(Stream.<GlobalAttribute> empty(), childeren);
        this.href = null;
        this.target = null;
        this.download = null;
        this.rel = null;
        this.hreflang = null;
        this.type = null;
    }

    public A(Stream<GlobalAttribute> ga, Stream<Element> childeren) {
        super(ga, childeren);
        this.href = null;
        this.target = null;
        this.download = null;
        this.rel = null;
        this.hreflang = null;
        this.type = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(href, target, download, rel, hreflang, type).filter(Objects::nonNull);
    }
}
