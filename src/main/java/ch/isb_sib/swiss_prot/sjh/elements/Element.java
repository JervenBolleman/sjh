package ch.isb_sib.swiss_prot.sjh.elements;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public interface Element {
    public void render(OutputStream stream) throws IOException;

    public void render(Writer write) throws IOException;
}
