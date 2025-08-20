package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.embedded.Data;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.TypeMustMatch;
import swiss.sib.swissprot.sjh.attributes.embedded.UseMap;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FormAssociatedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Object extends CommonElement implements FlowContent, PhrasingContent, EmbeddedContent,
        FormAssociatedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "object".getBytes(UTF_8);
    private final Data data;
    private final Type type;
    @SuppressWarnings("deprecation")
    private final TypeMustMatch typemustmatch;
    private final UseMap um;
    private final Form form;
    private final Width width;
    private final Height height;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    @SuppressWarnings("deprecation")
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
