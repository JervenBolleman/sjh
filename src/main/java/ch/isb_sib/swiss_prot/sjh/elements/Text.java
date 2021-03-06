package ch.isb_sib.swiss_prot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Text implements Element, PhrasingContent, FlowContent {
    private final byte[] value;

    @Override
    public void render(OutputStream stream) throws IOException {
	stream.write(value);
    }

    
    @Override
    public void render(Writer writer) throws IOException {
	writer.write(new String(value, UTF_8));
    }
    
    public Text(String value) {
	super();
	Objects.nonNull(value);
	this.value = value.getBytes(UTF_8);
    }

}
