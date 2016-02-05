package ch.isb_sib.swiss_prot.sjh.attributes.grouping;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Reversed
    implements Attribute
{
	private static final byte[] NAME = Attribute.fromString("reversed");

	private final byte[] value;

	public Reversed(String value)
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