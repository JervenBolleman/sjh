package ch.isb_sib.swiss_prot.sjh.attributes.script;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Nonce
    implements Attribute
{
	private static final byte[] LANG_IS = Attribute.fromString("nonce");

	private final byte[] value;

	public Nonce(String value)
	{
		Objects.nonNull(value);
		this.value = Attribute.fromString(value);
	}

	@Override
	public byte[] getValue()
	{
		return value;
	}

	@Override
	public byte[] getAttributeName()
	{
		return LANG_IS;
	}
}