package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.Download;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.HrefLang;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Target;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

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
