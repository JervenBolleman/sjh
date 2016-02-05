package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class AccessKey
    implements GlobalAttribute
{
	private static final byte[] LANG_IS = Attribute.fromString("accesskey");

	private final byte[] value;

	public AccessKey(String value)
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
