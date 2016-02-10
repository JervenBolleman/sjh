package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Default;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Label;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.SrcLang;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Kind;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class Source extends CommonElement {
    private final static byte[] NAME = "source".getBytes(UTF_8);
    private final Kind kind;
    private final Src src;
    private final Label label;
    private final SrcLang srclang;
    private final Default def;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Source(Stream<GlobalAttribute> ga, Kind kind, Src src, Label label, SrcLang srclang, Default def) {
	super(ga, Stream.empty());
	this.kind = kind;
	this.src = src;
	this.label = label;
	this.srclang = srclang;
	this.def = def;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(kind, src, label, srclang, def).filter(Objects::nonNull);
    }
}
