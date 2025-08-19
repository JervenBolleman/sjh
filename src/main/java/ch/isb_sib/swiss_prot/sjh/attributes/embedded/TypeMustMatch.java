package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * Avoid using object elements with untrusted resources.
 */
@Deprecated(since = "1.0.0")
public enum TypeMustMatch implements EmbeddedAttribute, BooleanAttribute {

    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("typemustmatch");

    private TypeMustMatch() {
    }

    @Override
    public byte[] getAttributeName() {
	return NAME;
    }

    @Override
    public boolean is() {
	return this == TRUE;
    }
}