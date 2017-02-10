package ch.isb_sib.swiss_prot.sjh.attributes;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public interface Attribute {
    static final byte DOUBLE_QUOTE = '"';
    static final byte[] EQUALS_DOUBLE_QUOTE = new byte[] { '=', '"' };

    byte[] getValue();

    byte[] getAttributeName();

    public default void render(OutputStream stream) throws IOException {
	stream.write(getAttributeName());
	stream.write(EQUALS_DOUBLE_QUOTE);
	stream.write(getValue());
	stream.write(DOUBLE_QUOTE);
    }

    public default void render(Writer stream) throws IOException {
	stream.write(new String(getAttributeName(), StandardCharsets.UTF_8));
	stream.write(new String(EQUALS_DOUBLE_QUOTE, StandardCharsets.UTF_8));
	stream.write(new String(getValue(), StandardCharsets.UTF_8));
	stream.write(DOUBLE_QUOTE);
    }

    
    public static byte[] fromString(String asbyte) {
	return asbyte.getBytes(UTF_8);
    }
}
