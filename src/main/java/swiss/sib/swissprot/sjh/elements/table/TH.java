package swiss.sib.swissprot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.table.Abbr;
import swiss.sib.swissprot.sjh.attributes.table.ColSpan;
import swiss.sib.swissprot.sjh.attributes.table.Headers;
import swiss.sib.swissprot.sjh.attributes.table.RowSpan;
import swiss.sib.swissprot.sjh.attributes.table.Scope;
import swiss.sib.swissprot.sjh.attributes.table.Sorted;
import swiss.sib.swissprot.sjh.attributes.table.TableAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

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
