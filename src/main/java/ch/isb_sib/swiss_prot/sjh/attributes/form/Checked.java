package ch.isb_sib.swiss_prot.sjh.attributes.form;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public class Checked extends BooleanAttribute {
    private static final byte[] NAME = Attribute.fromString("checked");

    public Checked(boolean bool) {
	super(bool);
    }

    @Override
    public byte[] getAttributeName() {
	if (val)
	    return NAME;
	else 
	    return EMPTY;
    }
}