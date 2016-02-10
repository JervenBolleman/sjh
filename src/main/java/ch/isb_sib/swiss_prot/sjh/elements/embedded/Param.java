package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class Param extends CommonElement {
    private final static byte[] NAME = "param".getBytes(UTF_8);
    private final Name name;
    private final Value value;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Param(Stream<GlobalAttribute> ga, Name name, Value value) {
	super(ga, Stream.empty());
	this.name = name;
	this.value = value;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	if (name != null) {
	    if (value != null)
		return Stream.of(name, value);
	    else
		return Stream.of(name);
	} else if (value != null)
	    return Stream.of(value);
	else
	    return Stream.empty();
    }
}
