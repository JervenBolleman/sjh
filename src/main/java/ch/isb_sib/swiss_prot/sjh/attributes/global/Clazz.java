package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Clazz
    implements GlobalAttribute
{
	private static final byte[] CLAZZ = Attribute.fromString("class");

	private final byte[] value;

	public Clazz(String value)
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
		return CLAZZ;
	}
}
