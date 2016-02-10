package ch.isb_sib.swiss_prot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class NoScript extends CommonElement implements FlowContent, PhrasingContent, MetaContent {
    private final static byte[] NAME = "noscript".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public NoScript(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
	super(ga, childeren);
    }

    public NoScript() {
	super();
    }
}
