package ch.isb_sib.swiss_prot.sjh.attributes.content;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * HrefLang attribute
 * 
 * "The hreflang attribute on a and area elements that create hyperlinks, if
 * present, gives the language of the linked resource. It is purely advisory.
 * The value must be a valid BCP 47 language tag. [BCP47] User agents must not
 * consider this attribute authoritative — upon fetching the resource, user
 * agents must use only language information associated with the resource to
 * determine its language, not metadata included in the link to the resource."
 * 
 * From W3C Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 * 
 * @see <a href=
 *      "https://www.w3.org/TR/html/single-page.html#attr-hyperlink-hreflang">
 *      W3C HTML5 specification</a>
 * 
 */
public non-sealed class HrefLang implements ContentAttribute {
    private static final byte[] NAME = Attribute.fromString("hreflang");

    private final byte[] value;

    public HrefLang(String value) {
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