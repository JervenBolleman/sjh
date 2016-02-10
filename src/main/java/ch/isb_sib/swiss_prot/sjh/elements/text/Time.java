package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.DateTime;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Time extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "time".getBytes(UTF_8);
    private final DateTime datetime;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Time(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren, DateTime datetime) {
	super(ga, childeren);
	this.datetime = datetime;
    }

    public Time() {
	super();
	datetime = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	if (datetime != null)
	    return Stream.of(datetime);
	else
	    return Stream.empty();
    }
}
