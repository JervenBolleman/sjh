package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.form.AutoFocus;
import swiss.sib.swissprot.sjh.attributes.form.Challenge;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.form.KeyType;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

@Deprecated(since = "0.1.0")
public non-sealed class KeyGen extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "keygen".getBytes(UTF_8);
    private final Form form;
    private final AutoFocus autofocus;
    private final Disabled disabled;
    private final Name name;

    private final Challenge challenge;
    private final KeyType keytype;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public KeyGen(Stream<GlobalAttribute> ga, AutoFocus autofocus, Challenge challenge, Disabled disabled, Form form,
            KeyType keytype, Name name) {
        super(ga, Stream.empty());
        this.autofocus = autofocus;
        this.challenge = challenge;
        this.disabled = disabled;
        this.form = form;
        this.keytype = keytype;
        this.name = name;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(this.autofocus, challenge, this.disabled, this.form, this.keytype, this.name)
                .filter(Objects::nonNull);
    }
}
