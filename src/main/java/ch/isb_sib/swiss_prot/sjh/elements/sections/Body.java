package ch.isb_sib.swiss_prot.sjh.elements.sections;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.SectioningRoot;

public class Body extends CommonElement implements SectioningRoot {
    private final static byte[] NAME = "body".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Body(Stream<GlobalAttribute> ga, Stream<Element> childeren) {
	super(ga, childeren);
    }

    public Body() {
	super();
    }
}
