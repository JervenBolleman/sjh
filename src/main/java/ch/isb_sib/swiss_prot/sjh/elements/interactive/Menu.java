package ch.isb_sib.swiss_prot.sjh.elements.interactive;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.menu.Type;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Text;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.ScriptSupporting;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.HR;

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
