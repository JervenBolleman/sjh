package ch.isb_sib.swiss_prot.sjh.attributes.script;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public enum Defer implements ScriptAttribute, BooleanAttribute {
    TRUE, FALSE;

    private static final byte[] LANG_IS = Attribute.fromString("defer");

    @Override
    public byte[] getAttributeName() {
        return LANG_IS;
    }

    @Override
    public boolean is() {
        return this == TRUE;
    }
}
