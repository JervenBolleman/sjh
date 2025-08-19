package ch.isb_sib.swiss_prot.sjh.attributes.meta;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface MetaAttribute extends Attribute permits Charset, Content, HttpEquiv, Name {

}
