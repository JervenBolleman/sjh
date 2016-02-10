package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Legend extends CommonElement {
	private final static byte[] NAME = "legend".getBytes(UTF_8);

	@Override
	protected byte[] getName() {
		return NAME;
	}

	public Legend(Stream<GlobalAttribute> ga,
			Stream<? extends PhrasingContent> childreren) {
		super(ga, childreren);
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes() {
		return Stream.empty();
	}
}
