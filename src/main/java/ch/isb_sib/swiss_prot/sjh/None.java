package ch.isb_sib.swiss_prot.sjh;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import ch.isb_sib.swiss_prot.sjh.elements.Element;

/**
 * This class is to be inserted in places where an element is expected but for
 * some reason you don't actually want to give the element.
 */
public class None implements Element {
	public static final None none = new None();

	private None() {

	}

	@Override
	public void render(OutputStream stream) throws IOException {

	}

	@Override
	public void render(Writer write) throws IOException {

	}

}
