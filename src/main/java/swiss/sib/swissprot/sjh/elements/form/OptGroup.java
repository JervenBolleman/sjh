package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Label;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;

public non-sealed class OptGroup extends CommonElement implements OptionOrOptGroup {
    private final static byte[] NAME = "optgroup".getBytes(UTF_8);
    private final Disabled disabled;
    private final Label label;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public OptGroup(Stream<GlobalAttribute> ga, Disabled disabled, Label label, Stream<Option> childreren) {
        super(ga, childreren);
        this.disabled = disabled;
        this.label = label;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(this.disabled, this.label).filter(Objects::nonNull);
    }
}
