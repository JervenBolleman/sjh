package swiss.sib.swissprot.sjh.attributes.script;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

public enum Async implements BooleanAttribute, ScriptAttribute {

    TRUE, FALSE;

    private static final byte[] LANG_IS = Attribute.fromString("async");

    @Override
    public byte[] getAttributeName() {
        return LANG_IS;
    }

    @Override
    public boolean is() {
        return this == TRUE;
    }
}
