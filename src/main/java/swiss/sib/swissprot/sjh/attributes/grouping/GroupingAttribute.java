package swiss.sib.swissprot.sjh.attributes.grouping;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface GroupingAttribute extends Attribute permits Kind, Reversed, Start, Value {

}
