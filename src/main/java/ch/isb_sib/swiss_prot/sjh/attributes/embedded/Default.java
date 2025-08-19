package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public enum Default implements EmbeddedAttribute, BooleanAttribute {
    TRUE(), FALSE();

    private Default() {
    }

    private static final byte[] NAME = Attribute.fromString("default");

    @Override
    public byte[] getAttributeName() {
	return NAME;
    }

    @Override
    public boolean is() {

	return this == TRUE;
    }
}