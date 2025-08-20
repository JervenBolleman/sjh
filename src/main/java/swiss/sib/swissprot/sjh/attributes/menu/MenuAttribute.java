package swiss.sib.swissprot.sjh.attributes.menu;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface MenuAttribute extends Attribute permits ContextMenu, Icon, RadioGroup, Type {

}
