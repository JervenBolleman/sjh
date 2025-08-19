package ch.isb_sib.swiss_prot.sjh.attributes.global;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public enum Hidden implements GlobalAttribute, BooleanAttribute {

    TRUE, FALSE;

    private static final byte[] NAME = Attribute.fromString("hidden");

    private Hidden() {

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
