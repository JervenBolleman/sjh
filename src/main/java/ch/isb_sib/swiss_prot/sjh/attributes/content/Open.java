package ch.isb_sib.swiss_prot.sjh.attributes.content;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * Whether the dialog box is showing or Whether the details are visible
 * 
 * @author jbollema
 *
 */
public class Open extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("open");

	public Open(boolean val) {
		super(val);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}

}
