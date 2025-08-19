package ch.isb_sib.swiss_prot.sjh.attributes.content;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * Media attribute
 * 
 * "The types of link indicated (the relationships) are given by the value of
 * the rel attribute, which, if present, must have a value that is a set of
 * space-separated tokens. The allowed keywords and their meanings are defined
 * in a later section. If the rel attribute is absent, has no keywords, or if
 * none of the keywords used are allowed according to the definitions in this
 * specification, then the element does not create any links."
 * 
 * From W3C Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 * 
 * @see <a href= "https://www.w3.org/TR/html/single-page.html#attr-link-rel">
 *      W3C HTML5 specification</a>
 * 
 */
public non-sealed class Rel implements ContentAttribute {
    private static final byte[] NAME = Attribute.fromString("rel");

    private final byte[] value;

    public Rel(String value) {
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