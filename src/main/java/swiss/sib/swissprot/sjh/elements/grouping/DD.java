package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;

public non-sealed class DD extends CommonElement implements DtOrDd {
    private final static byte[] NAME = "dd".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public DD(Stream<GlobalAttribute> ga, Stream<RdfaAttribute> rdfa, Stream<? extends FlowContent> childeren) {
        super(ga, rdfa, childeren);
    }
    public DD(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
    }

    public DD() {
        super();
    }
    
    @Override
   	public void render(OutputStream stream) throws IOException {
   		super.render(stream);
   		stream.write('\n');
   	}
}
