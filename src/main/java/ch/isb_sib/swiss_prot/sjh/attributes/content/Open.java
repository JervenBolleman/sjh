package ch.isb_sib.swiss_prot.sjh.attributes.content;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

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
