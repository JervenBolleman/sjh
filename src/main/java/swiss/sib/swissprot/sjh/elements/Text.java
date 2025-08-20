package swiss.sib.swissprot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Objects;

import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Text implements Element, PhrasingContent, FlowContent {
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
