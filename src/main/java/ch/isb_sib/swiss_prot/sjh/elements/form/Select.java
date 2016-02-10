package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoComplete;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoFocus;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Multiple;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Required;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Size;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Select extends CommonElement
	implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "select".getBytes(UTF_8);
    private final Form form;
    private final AutoFocus autofocus;
    private final Disabled disabled;
    private final Name name;
    private final AutoComplete autoComplete;
    private final Multiple multiple;
    private final Required required;
    private final Size size;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Select(Stream<GlobalAttribute> ga, AutoComplete autoComplete, AutoFocus autofocus, Disabled disabled,
	    Form form, Multiple multiple, Required required, Name name, Size size,
	    Stream<OptionOrOptGroup> childreren) {
	super(ga, childreren);
	this.autoComplete = autoComplete;
	this.autofocus = autofocus;
	this.disabled = disabled;
	this.form = form;
	this.multiple = multiple;
	this.name = name;
	this.required = required;
	this.size = size;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(this.autoComplete, this.autofocus, this.disabled, this.form, this.multiple, this.name,
		this.required, this.size).filter(Objects::nonNull);
    }
}
