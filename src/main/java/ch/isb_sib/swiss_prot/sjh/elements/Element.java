package ch.isb_sib.swiss_prot.sjh.elements;

import java.io.IOException;
import java.io.OutputStream;


public interface Element
{
	public void render(OutputStream stream)
	    throws IOException;
}
