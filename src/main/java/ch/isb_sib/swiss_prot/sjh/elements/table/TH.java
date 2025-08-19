package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Abbr;
import ch.isb_sib.swiss_prot.sjh.attributes.table.ColSpan;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Headers;
import ch.isb_sib.swiss_prot.sjh.attributes.table.RowSpan;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Scope;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Sorted;
import ch.isb_sib.swiss_prot.sjh.attributes.table.TableAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;

public non-sealed class TH extends CommonElement implements TDOrTH {
    private final static byte[] NAME = "th".getBytes(UTF_8);
    private final ColSpan colspan;
    private final RowSpan rowspan;
    private final Headers headers;
    private final Scope scope;
    private final Abbr abbr;
    private final Sorted sorted;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public TH(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> children, ColSpan colspan, RowSpan rowspan,
            Headers headers, Scope scope, Abbr abbr, Sorted sorted) {
        super(ga, children);
        this.colspan = colspan;
        this.rowspan = rowspan;
        this.headers = headers;
        this.scope = scope;
        this.abbr = abbr;
        this.sorted = sorted;
    }

    @Override
    protected Stream<TableAttribute> getElementSpecificAttributes() {
        return Stream.of(colspan, rowspan, headers, scope, abbr, sorted).filter(Objects::nonNull);
    }
}
