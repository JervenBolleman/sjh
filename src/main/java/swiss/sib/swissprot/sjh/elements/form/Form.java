package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.Target;
import swiss.sib.swissprot.sjh.attributes.form.AcceptCharset;
import swiss.sib.swissprot.sjh.attributes.form.Action;
import swiss.sib.swissprot.sjh.attributes.form.AutoComplete;
import swiss.sib.swissprot.sjh.attributes.form.EncType;
import swiss.sib.swissprot.sjh.attributes.form.Method;
import swiss.sib.swissprot.sjh.attributes.form.NoValidate;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Form extends CommonElement implements FlowContent, PhrasingContent {
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

    public Form(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
        this.ac = null;
        this.action = null;
        this.autocomplete = null;
        this.enctype = null;
        this.method = null;
        this.name = null;
        this.novalidate = null;
        this.target = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(ac, action, autocomplete, enctype, method, name, novalidate, target).filter(Objects::nonNull);
    }
}
