package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class DataList extends CommonElement implements FlowContent,
		PhrasingContent {
	private final static byte[] NAME = "datalist".getBytes(UTF_8);

	@Override
	protected byte[] getName() {
		return NAME;
	}

	public DataList(Stream<GlobalAttribute> ga,
			Stream<? extends PhrasingContent> childeren) {
		super(ga, childeren);
	}

	public DataList(Stream<GlobalAttribute> ga, Option... childeren) {
		super(ga, Stream.of(childeren));
	}

}
