package swiss.sib.swissprot.sjh.elements.raw;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class EscapedRawPhrasingContent implements PhrasingContent {

    private final String raw;

    public EscapedRawPhrasingContent(String raw) {
        super();
        this.raw = raw;
    }

    @Override
    public void render(OutputStream stream) throws IOException {
        byte[] bytes = raw.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes)
            if (b == '<') {
                stream.write('&');
                stream.write('l');
                stream.write('t');
                stream.write(';');
            } else
                stream.write(b);

    }

    @Override
    public void render(Writer write) throws IOException {

        for (int i = 0; i < raw.length(); i++) {
            char b = raw.charAt(i);
            if (b == '<') {
                write.write('&');
                write.write('l');
                write.write('t');
                write.write(';');
            } else
                write.write(b);
        }
    }

}
