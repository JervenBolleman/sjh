package ch.isb_sib.swiss_prot.sjh.elements.sections.header;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.HeadingContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.SectioningContent;

public class H5 extends CommonElement implements FlowContent, SectioningContent, PalpabaleContent, HeadingContent {
    private final static byte[] NAME = "h5".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public H5(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren) {
	super(ga, childeren);
    }

    public H5() {
	super();
    }
}
