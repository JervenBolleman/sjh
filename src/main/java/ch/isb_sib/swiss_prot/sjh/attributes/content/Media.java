package ch.isb_sib.swiss_prot.sjh.attributes.content;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * Media attribute
 *
 * "The media attribute says which media the resource applies to. The value must
 * be a valid media query."
 * 
 * From W3C Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 * 
 * @see <a href= "https://www.w3.org/TR/html/single-page.html#attr-link-media">
 *      W3C HTML5 specification</a>
 * 
 */
public class Media implements Attribute {
    private static final byte[] NAME = Attribute.fromString("media");

    private final byte[] value;

    public Media(String value) {
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