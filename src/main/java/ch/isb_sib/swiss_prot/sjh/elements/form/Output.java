package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.form.For;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Output extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "output".getBytes(UTF_8);
    private final Form form;
    private final For fora;
    private final Name name;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Output(Stream<GlobalAttribute> ga, For fora, Form form, Name name) {
        super(ga, Stream.empty());
        this.fora = fora;
        this.form = form;
        this.name = name;

    }

    public Output(Stream<GlobalAttribute> ga, For fora, Form form, Name name,
            Stream<? extends PhrasingContent> childeren) {
        super(ga, childeren);
        this.fora = fora;
        this.form = form;
        this.name = name;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(this.form, this.fora, this.name).filter(Objects::nonNull);
    }
}
