package ch.isb_sib.swiss_prot.sjh.attributes.table;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface TableAttribute extends Attribute
	permits Abbr, Border, ColSpan, Headers, RowSpan, Scope, Sortable, Sorted, Span {

}
