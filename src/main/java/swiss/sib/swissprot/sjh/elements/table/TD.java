package swiss.sib.swissprot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.table.ColSpan;
import swiss.sib.swissprot.sjh.attributes.table.Headers;
import swiss.sib.swissprot.sjh.attributes.table.RowSpan;
import swiss.sib.swissprot.sjh.attributes.table.TableAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

public non-sealed class TD extends CommonElement implements TDOrTH {
    private final static byte[] NAME = "td".getBytes(UTF_8);
    private final ColSpan colspan;
    private final RowSpan rowspan;
    private final Headers headers;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public TD(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> children, ColSpan colspan, RowSpan rowspan,
            Headers headers) {
        super(ga, children);
        this.colspan = colspan;
        this.rowspan = rowspan;
        this.headers = headers;
    }

    @Override
    protected Stream<TableAttribute> getElementSpecificAttributes() {
        return Stream.of(rowspan, colspan, headers).filter(Objects::nonNull);
    }
}
