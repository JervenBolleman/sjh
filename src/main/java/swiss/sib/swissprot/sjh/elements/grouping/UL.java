package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;

public non-sealed class UL extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "ul".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public UL(Stream<GlobalAttribute> ga, Stream<LI> childeren) {
        super(ga, childeren);
    }
    
    public UL(Stream<GlobalAttribute> ga, Stream<RdfaAttribute> rdfaStream, Stream<LI> childeren) {
        super(ga, rdfaStream, childeren);
    }
   
    public UL() {
        super();
    }
    
    @Override
   	public void render(OutputStream stream) throws IOException {
   		super.render(stream);
   		stream.write('\n');
   	}
}
