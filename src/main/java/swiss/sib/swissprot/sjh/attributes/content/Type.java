package swiss.sib.swissprot.sjh.attributes.content;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

/**
 * Type attribute "The type attribute, if present, gives the MIME type of the linked resource. It is purely advisory.
 * The value must be a valid MIME type. User agents must not consider the type attribute authoritative — upon fetching
 * the resource, user agents must not use metadata included in the link to the resource to determine its type." From W3C
 * Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 *
 * @see <a href= "https://www.w3.org/TR/html/single-page.html#attr-hyperlink-type"> W3C HTML5 specification</a>
 */
public non-sealed class Type implements ContentAttribute {
    private static final byte[] NAME = Attribute.fromString("type");

    private final byte[] value;

    public Type(String value) {
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
