package swiss.sib.swissprot.sjh.attributes.meta;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface MetaAttribute extends Attribute permits Charset, Content, HttpEquiv, Name {

}
