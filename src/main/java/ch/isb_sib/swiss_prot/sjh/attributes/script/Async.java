package ch.isb_sib.swiss_prot.sjh.attributes.script;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Async
    implements Attribute
{
	private static final byte[] LANG_IS = Attribute.fromString("async");

	private final byte[] value;

	public Async(String value)
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