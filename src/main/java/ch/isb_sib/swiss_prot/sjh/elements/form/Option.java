package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Label;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Selected;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Text;

public non-sealed class Option extends CommonElement implements OptionOrOptGroup {
    private final static byte[] NAME = "option".getBytes(UTF_8);
    private final Disabled disabled;
    private final Label label;
    private final Selected selected;
    private final Value value;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Option(Stream<GlobalAttribute> ga, Disabled disabled, Label label, Selected selected, Value value) {
	super(ga, Stream.empty());
	this.disabled = disabled;
	this.label = label;
	this.selected = selected;
	this.value = value;
    }

    public Option(Stream<GlobalAttribute> ga, Disabled disabled, Label label, Selected selected, Text text) {
	super(ga, Stream.of(text));
	this.disabled = disabled;
	this.label = label;
	this.selected = selected;
	this.value = null;
    }
    
    public Option(Stream<GlobalAttribute> ga, Disabled disabled, Label label, Selected selected, Value value, Text text) {
	super(ga, Stream.of(text));
	this.disabled = disabled;
	this.label = label;
	this.selected = selected;
	this.value = value;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(disabled, label, selected, value).filter(Objects::nonNull);
    }
}
