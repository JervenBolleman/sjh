package swiss.sib.swissprot.sjh;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public final class Comment implements Element, FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent, MetaContent {
	private static final byte[] START = "<!--".getBytes(StandardCharsets.UTF_8);
	private static final byte[] END = "-->".getBytes(StandardCharsets.UTF_8);

	private final String content;
	
	public Comment(String content) {
		this.content =content;
	}
	
	@Override
	public void render(OutputStream stream) throws IOException {
		stream.write(START);
		stream.write(content.getBytes(StandardCharsets.UTF_8));
		stream.write(END);
	}

	@Override
	public void render(Writer write) throws IOException {
		write.write("<!--");
		write.write(content);
		write.write("-->");
	}

}
