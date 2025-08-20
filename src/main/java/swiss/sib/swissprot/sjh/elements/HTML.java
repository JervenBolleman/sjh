package swiss.sib.swissprot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.meta.Head;
import swiss.sib.swissprot.sjh.elements.sections.Body;

public class HTML extends CommonElement {
    private final static byte[] NAME = "html".getBytes(UTF_8);
    private static final byte[] DOCTYPE = "<!DOCTYPE html>".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public HTML(Stream<GlobalAttribute> ga, Head head, Body body) {
        super(ga, Stream.of(head, body));
    }

    public HTML() {
        super();
    }

    public HTML(Head head, Body body) {
        super(Stream.<GlobalAttribute> empty(), Stream.of(head, body));
    }

    @Override
    public void render(OutputStream stream) throws IOException {
        stream.write(DOCTYPE);
        super.render(stream);
    }
}
