package ch.isb_sib.swiss_prot.sjh.attributes.content;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The nomodule attribute is a boolean attribute that prevents a script from
 * being executed in user agents that support module scripts. This allows
 * selective execution of module scripts in modern user agents and classic
 * scripts in older user agents, as shown below. The nomodule attribute must not
 * be specified on module scripts (and will be ignored if it is).
 * 
 */

public class NoModule extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("nomodule");

	public NoModule(boolean val) {
		super(val);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}
}