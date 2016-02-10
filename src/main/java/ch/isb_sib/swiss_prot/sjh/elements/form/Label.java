package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.form.For;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Label extends CommonElement implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "label".getBytes(UTF_8);
    private final Form form;
    private final For fora;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Label(Stream<GlobalAttribute> ga, Form form, For fora) {
	super(ga, Stream.empty());
	this.form = form;
	this.fora = fora;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(form, fora).filter(Objects::nonNull);
    }
}
