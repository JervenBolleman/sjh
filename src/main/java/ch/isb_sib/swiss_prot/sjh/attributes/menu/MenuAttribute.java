package ch.isb_sib.swiss_prot.sjh.attributes.menu;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface MenuAttribute extends Attribute permits ContextMenu, Icon, RadioGroup, Type {

}
