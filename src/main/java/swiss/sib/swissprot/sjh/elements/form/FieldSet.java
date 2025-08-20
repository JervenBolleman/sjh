package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class FieldSet extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "fieldset".getBytes(UTF_8);
    private final Disabled disabled;
    private final Form form;
    private final Name name;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public FieldSet(Stream<GlobalAttribute> ga, Disabled disabled, Form form, Name name, Legend legend,
            Stream<? extends FlowContent> childreren) {
        super(ga, Stream.concat(Stream.of(legend), childreren));
        this.disabled = disabled;
        this.form = form;
        this.name = name;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(this.disabled, this.form, this.name).filter(Objects::nonNull);
    }
}
