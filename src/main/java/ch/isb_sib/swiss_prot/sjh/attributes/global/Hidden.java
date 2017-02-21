package ch.isb_sib.swiss_prot.sjh.attributes.global;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public class Hidden extends BooleanAttribute implements GlobalAttribute {
    private static final byte[] NAME = Attribute.fromString("hidden");

    public Hidden(boolean bool) {
	super(bool);
    }

    @Override
    public byte[] getAttributeName() {
	return NAME;
    }
}
