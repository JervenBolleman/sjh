package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public enum Loop implements BooleanAttribute {

    TRUE(), FALSE();

    private Loop() {
    }

    private static final byte[] NAME = Attribute.fromString("loop");

    @Override
    public byte[] getAttributeName() {
	return NAME;
    }

    @Override
    public boolean is() {
	return this == TRUE;
    }
}