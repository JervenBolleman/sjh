package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public class Disabled extends BooleanAttribute {
    private static final byte[] NAME = Attribute.fromString("disabled");

    public Disabled(boolean value) {
	super(value);
    }

    @Override
    public byte[] getAttributeName() {
	if (val)
	    return NAME;
	else 
	    return EMPTY;
    }
}