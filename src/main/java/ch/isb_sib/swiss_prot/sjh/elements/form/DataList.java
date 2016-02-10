package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class DataList<T extends Element> extends CommonElement implements FlowContent, PhrasingContent {
    private final static byte[] NAME = "datalist".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public DataList(Stream<GlobalAttribute> ga, Stream<T> childeren) {
	super(ga, childeren);
    }
}
