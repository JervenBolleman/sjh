package swiss.sib.swissprot.sjh.attributes.table;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface TableAttribute extends Attribute
        permits Abbr, Border, ColSpan, Headers, RowSpan, Scope, Sortable, Sorted, Span {

}
