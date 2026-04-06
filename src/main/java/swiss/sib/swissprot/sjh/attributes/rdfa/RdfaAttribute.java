package swiss.sib.swissprot.sjh.attributes.rdfa;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.rdfa.core.RdfaCoreAttribute;
import swiss.sib.swissprot.sjh.attributes.rdfa.lite.RdfaLiteAttribute;
public sealed interface RdfaAttribute  extends Attribute permits RdfaLiteAttribute, RdfaCoreAttribute {

}
