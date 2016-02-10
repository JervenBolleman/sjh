package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Data;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.TypeMustMatch;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.UseMap;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.EmbeddedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FormAssociatedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Object extends CommonElement implements FlowContent, PhrasingContent, EmbeddedContent,
	FormAssociatedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "object".getBytes(UTF_8);
    private final Data data;
    private final Type type;
    private final TypeMustMatch typemustmatch;
    private final UseMap um;
    private final Form form;
    private final Width width;
    private final Height height;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Object(Stream<GlobalAttribute> ga, Data data, Type type, TypeMustMatch typemustmatch, Name name, UseMap um,
	    Form form, Width width, Height height, Stream<Param> param) {
	super(ga, param);
	this.data = data;
	this.type = type;
	this.typemustmatch = typemustmatch;
	this.um = um;
	this.form = form;
	this.width = width;
	this.height = height;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(data, type, typemustmatch, um, form, width, height).filter(Objects::nonNull);
    }
}
