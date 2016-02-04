package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Id
    implements GlobalAttribute
{
	private static final byte[] NAME = Attribute.fromString("id");

	private final byte[] value;

	public Id(String value)
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
		return NAME;
	}
}
