package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Target;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AcceptCharset;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Action;
import ch.isb_sib.swiss_prot.sjh.attributes.form.EncType;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Method;
import ch.isb_sib.swiss_prot.sjh.attributes.form.NoValidate;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoComplete;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Form extends CommonElement implements FlowContent, PhrasingContent {
    private final static byte[] NAME = "form".getBytes(UTF_8);
    private final AcceptCharset ac;
    private final Action action;
    private final AutoComplete autocomplete;
    private final EncType enctype;
    private final Method method;
    private final Name name;
    private final NoValidate novalidate;
    private final Target target;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Form(Stream<GlobalAttribute> ga, AcceptCharset ac, Action action, AutoComplete autocomplete, EncType enctype,
	    Method method, Name name, NoValidate novalidate, Target target, Stream<? extends FlowContent> childeren) {
	super(ga, childeren);
	this.ac = ac;
	this.action = action;
	this.autocomplete = autocomplete;
	this.enctype = enctype;
	this.method = method;
	this.name = name;
	this.novalidate = novalidate;
	this.target = target;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(ac, action, autocomplete, enctype, method, name, novalidate, target).filter(Objects::nonNull);
    }
}
