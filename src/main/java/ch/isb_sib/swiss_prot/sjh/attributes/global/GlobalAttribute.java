package ch.isb_sib.swiss_prot.sjh.attributes.global;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface GlobalAttribute extends Attribute
        permits Translate, Hidden, Id, Lang, SpellCheck, Style, TabIndex, Dir, Clazz, ATitle, AccessKey {
}
