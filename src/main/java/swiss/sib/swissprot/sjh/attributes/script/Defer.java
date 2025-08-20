package swiss.sib.swissprot.sjh.attributes.script;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

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
