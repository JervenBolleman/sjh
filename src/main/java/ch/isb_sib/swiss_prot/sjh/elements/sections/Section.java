package ch.isb_sib.swiss_prot.sjh.elements.sections;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.SectioningContent;

public class Section extends CommonElement implements FlowContent, SectioningContent, PalpabaleContent {
    private final static byte[] NAME = "section".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Section(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
	super(ga, childeren);
    }

    public Section() {
	super();
    }
}
