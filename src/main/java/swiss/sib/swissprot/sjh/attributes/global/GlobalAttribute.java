package swiss.sib.swissprot.sjh.attributes.global;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface GlobalAttribute extends Attribute
        permits Translate, Hidden, Id, Lang, SpellCheck, Style, TabIndex, Dir, Clazz, ATitle, AccessKey {
}
