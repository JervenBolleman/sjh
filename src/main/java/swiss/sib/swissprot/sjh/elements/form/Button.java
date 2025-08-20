package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.form.AutoComplete;
import swiss.sib.swissprot.sjh.attributes.form.AutoFocus;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.form.Multiple;
import swiss.sib.swissprot.sjh.attributes.form.Required;
import swiss.sib.swissprot.sjh.attributes.form.Size;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Button extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "button".getBytes(UTF_8);
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

    public Button(Stream<GlobalAttribute> ga, AutoComplete autoComplete, AutoFocus autofocus, Disabled disabled,
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

    public Button(Stream<GlobalAttribute> ga, Stream<OptionOrOptGroup> childreren) {
        super(ga, childreren);
        this.autoComplete = null;
        this.autofocus = null;
        this.disabled = null;
        this.form = null;
        this.multiple = null;
        this.name = null;
        this.required = null;
        this.size = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(this.autoComplete, this.autofocus, this.disabled, this.form, this.multiple, this.name,
                this.required, this.size).filter(Objects::nonNull);
    }
}
