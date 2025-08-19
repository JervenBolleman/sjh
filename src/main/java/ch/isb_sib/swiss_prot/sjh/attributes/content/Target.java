package ch.isb_sib.swiss_prot.sjh.attributes.content;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * Target attribute From W3C Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 *
 * @see <a href= "https://www.w3.org/TR/html/single-page.html#attr-hyperlink-target"> W3C HTML5 specification</a>
 */
public non-sealed class Target implements ContentAttribute {
    private static final byte[] NAME = Attribute.fromString("target");

    private final byte[] value;

    public Target(String value) {
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
