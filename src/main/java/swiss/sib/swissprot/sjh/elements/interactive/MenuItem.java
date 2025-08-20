package swiss.sib.swissprot.sjh.elements.interactive;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Default;
import swiss.sib.swissprot.sjh.attributes.embedded.Label;
import swiss.sib.swissprot.sjh.attributes.form.Checked;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.menu.Icon;
import swiss.sib.swissprot.sjh.attributes.menu.RadioGroup;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Text;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

public non-sealed class MenuItem extends CommonElement implements FlowContent {
    private final static byte[] ATTR_NAME = "type".getBytes(UTF_8);
    private final static byte[] NAME = "menuitem".getBytes(UTF_8);

    public enum Type implements Attribute {
        command("command"), // The "command" keyword maps to the Command state
        checkbox("checkbox"), // the "checkbox" keyword maps to the Checkbox
                              // state
        radio("radio");// the "radio" keyword maps to the Radio state.

        private Type(String value) {
            this.value = Attribute.fromString(value);
        }

        private final byte[] value;

        @Override
        public byte[] getValue() {
            return value;
        }

        @Override
        public byte[] getAttributeName() {
            return ATTR_NAME;
        }

    }

    private final Type type;
    private final Label label;
    private final Icon icon;
    private final Disabled disabled;
    private final Checked checked;
    private final RadioGroup radioGroup;
    private final Default def;

    public MenuItem(Stream<GlobalAttribute> ga, Type type, Text text) {
        super(ga, Stream.of(text));
        this.type = type;
        this.label = null;
        this.icon = null;
        this.disabled = null;
        this.checked = null;
        this.radioGroup = null;
        this.def = null;
    }

    public MenuItem(Stream<GlobalAttribute> ga, Type type, Label label, Icon icon, Disabled disabled, Checked checked,
            RadioGroup radiogroup, Default def, Text text) {
        super(ga, Stream.of(text));
        this.type = type;
        this.label = label;
        this.icon = icon;
        this.disabled = disabled;
        this.checked = checked;
        this.radioGroup = radiogroup;
        this.def = def;
    }

    @Override
    protected byte[] getName() {
        return NAME;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(type, label, icon, disabled, checked, radioGroup, def);
    }
}
