package swiss.sib.swissprot.sjh.attributes.embedded;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * Avoid using object elements with untrusted resources.
 */
@Deprecated(since = "1.0.0")
public enum TypeMustMatch implements EmbeddedAttribute, BooleanAttribute {

    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("typemustmatch");

    private TypeMustMatch() {
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
