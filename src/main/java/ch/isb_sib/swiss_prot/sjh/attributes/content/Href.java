package ch.isb_sib.swiss_prot.sjh.attributes.content;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * Href attribute "The destination of the link(s) is given by the href attribute, which must be present and must contain
 * a valid non-empty URL potentially surrounded by spaces. If the href attribute is absent, then the element does not
 * define a link." From W3C Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 *
 * @see <a href= "https://www.w3.org/TR/html/single-page.html#attr-hyperlink-href">W3C HTML5 specification</a>
 */
public non-sealed class Href implements ContentAttribute {
    private static final byte[] NAME = Attribute.fromString("href");

    private final byte[] value;

    public Href(String value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(value);
    }

    @Override
    public byte[] getValue() {
        return value;
    }

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }
}
