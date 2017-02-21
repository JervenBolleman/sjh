package ch.isb_sib.swiss_prot.sjh.attributes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import static java.nio.charset.StandardCharsets.UTF_8;;

public abstract class BooleanAttribute implements Attribute {

    private final static class CharSequenceOfBytesValueLessThan128 implements CharSequence {
	private final byte[] attributeName;

	private CharSequenceOfBytesValueLessThan128(byte[] attributeName) {
	    super();
	    this.attributeName = attributeName;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
	    return new String(attributeName, UTF_8).subSequence(start, end);
	}

	@Override
	public int length() {
	    return attributeName.length;
	}

	@Override
	public char charAt(int index) {
	    return (char) attributeName[index];
	}

	@Override
	public String toString() 
	{
	    return new String(attributeName, UTF_8);
	}

    }

    protected static final byte[] EMPTY = new byte[0];
    protected final boolean val;

    public BooleanAttribute(boolean val) {
	this.val = val;
    }

    @Override
    public final byte[] getValue() {
	return EMPTY;
    }

    public final void render(OutputStream stream) throws IOException {
	if (val)
	    stream.write(getAttributeName());
    }

    public final void render(Writer stream) throws IOException {
	if (val)
	    stream.append(charSeq(getAttributeName()));
    }

    private CharSequence charSeq(byte[] attributeName) {
	return new CharSequenceOfBytesValueLessThan128(attributeName);
    }
}
