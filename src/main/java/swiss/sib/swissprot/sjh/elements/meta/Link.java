package swiss.sib.swissprot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.content.ContentAttribute;
import swiss.sib.swissprot.sjh.attributes.content.CrossOrigin;
import swiss.sib.swissprot.sjh.attributes.content.Href;
import swiss.sib.swissprot.sjh.attributes.content.HrefLang;
import swiss.sib.swissprot.sjh.attributes.content.Media;
import swiss.sib.swissprot.sjh.attributes.content.Rel;
import swiss.sib.swissprot.sjh.attributes.content.Sizes;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;

public non-sealed class Link extends CommonElement implements MetaContent {
    private final static byte[] NAME = "link".getBytes(UTF_8);
    private final Href href;
    private final CrossOrigin co;
    private final Rel rel;
    private final Media media;
    private final HrefLang hrefLang;
    private final Type type;
    private final Sizes size;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Link(Stream<GlobalAttribute> ga, Href href, CrossOrigin co, Rel rel, Media media, HrefLang hreflang,
            Type type, Sizes size) {
        super(ga, Stream.empty());
        this.href = href;
        this.co = co;
        this.rel = rel;
        this.media = media;
        this.hrefLang = hreflang;
        this.type = type;
        this.size = size;
    }

    @Override
    protected Stream<ContentAttribute> getElementSpecificAttributes() {
        return Stream.of(href, co, rel, media, hrefLang, type, size).filter(Objects::nonNull);
    }

}
