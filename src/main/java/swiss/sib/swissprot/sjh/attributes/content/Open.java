package swiss.sib.swissprot.sjh.attributes.content;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * Whether the dialog box is showing or Whether the details are visible
 *
 * @author jbollema
 */
public enum Open implements BooleanAttribute, ContentAttribute {

    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("open");

    private Open() {

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
