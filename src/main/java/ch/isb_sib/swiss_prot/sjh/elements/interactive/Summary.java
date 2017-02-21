package ch.isb_sib.swiss_prot.sjh.elements.interactive;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.HeadingContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Summary extends CommonElement {
	private final static byte[] NAME = "summary".getBytes(UTF_8);

	public Summary(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childern) {
		super(ga, childern);
	}

	public Summary(Stream<GlobalAttribute> ga, HeadingContent heading) {
		super(ga, Stream.of(heading));
	}

	@Override
	protected byte[] getName() {
		return NAME;
	}

}
