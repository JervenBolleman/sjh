package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.form.For;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Label extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "label".getBytes(UTF_8);
    private final Form form;
    private final For fora;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Label(Stream<GlobalAttribute> ga, Form form, For fora) {
        super(ga, Stream.empty());
        this.form = form;
        this.fora = fora;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(form, fora).filter(Objects::nonNull);
    }
}
