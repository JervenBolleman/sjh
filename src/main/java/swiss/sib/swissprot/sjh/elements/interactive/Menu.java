package swiss.sib.swissprot.sjh.elements.interactive;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.menu.Type;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Text;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.ScriptSupporting;
import swiss.sib.swissprot.sjh.elements.grouping.HR;

public non-sealed class Menu extends CommonElement implements FlowContent {
    private final static byte[] NAME = "menu".getBytes(UTF_8);
    private final Type type;

    public Menu(Stream<GlobalAttribute> ga, Text text) {
        super(ga, Stream.of(text));
        type = Type.toolbar;
    }

    public Menu(Stream<GlobalAttribute> ga, Stream<FlowContent> flows) {
        super(ga, flows);
        type = Type.toolbar;
    }

    public Menu(Stream<GlobalAttribute> ga, Stream<MenuItem> menuitems, Stream<HR> hrs, Stream<Menu> menus,
            Stream<ScriptSupporting> supporting) {
        super(ga, Stream.concat(Stream.concat(menuitems, hrs), Stream.concat(menus, supporting)));
        type = Type.context;
    }

    @Override
    protected byte[] getName() {
        return NAME;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(type);
    }
}
