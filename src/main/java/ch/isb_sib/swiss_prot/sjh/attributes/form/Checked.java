package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public enum Checked implements FormAttribute, BooleanAttribute {
    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("checked");

    private Checked() {
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