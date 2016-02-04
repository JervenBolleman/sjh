package ch.isb_sib.swiss_prot.sjh.attributes.meta;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class HttpEquiv
    implements Attribute
{
	private static final byte[] LANG_IS = Attribute.fromString("http-equiv");

	private final byte[] value;

	public HttpEquiv(String value)
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