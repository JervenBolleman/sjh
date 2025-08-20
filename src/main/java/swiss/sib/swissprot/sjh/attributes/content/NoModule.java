package swiss.sib.swissprot.sjh.attributes.content;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * The nomodule attribute is a boolean attribute that prevents a script from being executed in user agents that support
 * module scripts. This allows selective execution of module scripts in modern user agents and classic scripts in older
 * user agents, as shown below. The nomodule attribute must not be specified on module scripts (and will be ignored if
 * it is).
 */

public enum NoModule implements BooleanAttribute, ContentAttribute {
    TRUE, FALSE;

    private static final byte[] NAME = Attribute.fromString("nomodule");

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }

    @Override
    public boolean is() {
        return this == TRUE;
    }
}
