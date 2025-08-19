package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Border;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Sortable;
import ch.isb_sib.swiss_prot.sjh.attributes.table.TableAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;

public class Table extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "table".getBytes(UTF_8);
    private final Border border;
    private final Sortable sortable;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Table(Stream<GlobalAttribute> ga, Caption caption, Stream<ColGroup> colGroups, THead thead, TFoot tfoot,
	    Stream<TBody> tbodies, Stream<TR> rows, Border border, Sortable sortable) {
	super(ga,
		Stream.concat(Stream.concat(
			Stream.concat(Stream.concat(Stream.of(caption), colGroups), Stream.of(thead, tfoot)), tbodies),
			rows));
	this.border = border;
	this.sortable = sortable;
    }

    public Table(Stream<GlobalAttribute> ga, Caption caption, Stream<ColGroup> colGroups, THead thead,
	    Stream<TBody> tbodies, Stream<TR> rows, TFoot tfoot, Border border, Sortable sortable) {
	super(ga,
		Stream.concat(Stream.concat(Stream.concat(
			Stream.concat(Stream.concat(Stream.of(caption), colGroups), Stream.of(thead)), tbodies), rows),
			Stream.of(tfoot)));
	this.border = border;
	this.sortable = sortable;
    }

    @Override
    protected Stream<TableAttribute> getElementSpecificAttributes() {
	return Stream.of(border, sortable).filter(Objects::nonNull);
    }
}
