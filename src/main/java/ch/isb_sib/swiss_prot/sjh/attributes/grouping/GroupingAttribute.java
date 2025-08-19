package ch.isb_sib.swiss_prot.sjh.attributes.grouping;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface GroupingAttribute extends Attribute permits Kind, Reversed, Start, Value {

}
