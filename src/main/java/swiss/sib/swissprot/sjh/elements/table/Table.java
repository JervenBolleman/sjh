package swiss.sib.swissprot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.stream.Stream.of;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.table.Border;
import swiss.sib.swissprot.sjh.attributes.table.Sortable;
import swiss.sib.swissprot.sjh.attributes.table.TableAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;

public non-sealed class Table extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "table".getBytes(UTF_8);
    private final Border border;
    private final Sortable sortable;

    @Override
    protected byte[] getName() {
        return NAME;
    }
    
    public Table(Stream<GlobalAttribute> ga, THead thead, TFoot tfoot,
            Stream<TBody> tbodies) {
        super(ga, concat(singles(thead, tfoot), multi(tbodies)));
        this.border = null;
        this.sortable = null;
    }

    public Table(Stream<GlobalAttribute> ga, Caption caption, Stream<ColGroup> colGroups, THead thead, TFoot tfoot,
            Stream<TBody> tbodies, Stream<TR> rows, Border border, Sortable sortable) {
        super(ga, concat(singles(caption, thead, tfoot), multi(colGroups, tbodies, rows)));
        this.border = border;
        this.sortable = sortable;
    }

	private static Stream<CommonElement> concat(List<CommonElement> singles, List<Stream<? extends CommonElement>> multi){
		if (singles.isEmpty() && multi.isEmpty()) {
			return null;
		} else if (singles.isEmpty()) {
			return multi.stream().flatMap((a) -> a);
		} else if (multi.isEmpty()) {
			return singles.stream();
		} else {
			return Stream.concat(singles.stream(), multi.stream().flatMap((a) -> a));
		}
	}

	@SafeVarargs
	private static List<Stream<? extends CommonElement>> multi(Stream<? extends CommonElement>... colGroups) {
		List<Stream<? extends CommonElement>> of = Arrays.asList(colGroups);
		List<Stream<? extends CommonElement>> multi = of.stream().filter(Objects::nonNull).toList();
		return multi;
	}

	private static List<CommonElement> singles(CommonElement... caption) {
		return Arrays.asList(caption).stream().filter(Objects::nonNull).toList();
	}

    public Table(Stream<GlobalAttribute> ga, Caption caption, Stream<ColGroup> colGroups, THead thead,
            Stream<TBody> tbodies, Stream<TR> rows, TFoot tfoot, Border border, Sortable sortable) {
        super(ga,
                Stream.concat(Stream.concat(Stream.concat(
                        Stream.concat(Stream.concat(of(caption), colGroups), of(thead)), tbodies), rows),
                        of(tfoot)));
        this.border = border;
        this.sortable = sortable;
    }

    @Override
    protected Stream<TableAttribute> getElementSpecificAttributes() {
        return of(border, sortable).filter(Objects::nonNull);
    }
    
    @Override
   	public void render(OutputStream stream) throws IOException {
   		super.render(stream);
   		stream.write('\n');
   	}
}
