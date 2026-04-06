package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.Value;
import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

public class LI extends CommonElement {
    private final static byte[] NAME = "li".getBytes(UTF_8);
	private final Value value;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public LI(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
        this.value = null;
    }
    
    public LI(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren, Value value) {
        super(ga, childeren);
		this.value = value;
    }
    
    public LI(Stream<GlobalAttribute> ga, Stream<RdfaAttribute> rdf, Stream<? extends FlowContent> childeren) {
        super(ga, rdf, childeren);
		this.value = null;
    }
    
    public LI(Stream<GlobalAttribute> ga, Stream<RdfaAttribute> rdf, Stream<? extends FlowContent> childeren, Value value) {
        super(ga, rdf, childeren);
		this.value = value;
    }

    public LI() {
        super();
        this.value = null;
    }

	@Override
	public void render(OutputStream stream) throws IOException {
		super.render(stream);
		stream.write('\n');
	}
	
	@Override
	protected Stream<Value> getElementSpecificAttributes() {
		return  Stream.of(value).filter(Objects::nonNull);
	}
}
