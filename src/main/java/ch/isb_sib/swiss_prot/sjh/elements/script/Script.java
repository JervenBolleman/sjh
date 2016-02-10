package ch.isb_sib.swiss_prot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Charset;
import ch.isb_sib.swiss_prot.sjh.attributes.script.Async;
import ch.isb_sib.swiss_prot.sjh.attributes.script.Defer;
import ch.isb_sib.swiss_prot.sjh.attributes.script.Nonce;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Text;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;

public class Script extends CommonElement implements FlowContent, MetaContent {
	private final static byte[] NAME = "script".getBytes(UTF_8);
	private final Src src;
	private final Type type;
	private final Charset charset;
	private final Async async;
	private final Defer defer;
	private final CrossOrigin crossOrigin;
	private final Nonce nonce;

	@Override
	protected byte[] getName() {
		return NAME;
	}

	public Script(Stream<GlobalAttribute> ga, Src src, Type type, Charset charset,
			Async async, Defer defer, CrossOrigin crossOrigin, Nonce nonce,
			Text content) {
		super(ga, Stream.of(content));
		this.src = src;
		this.type = type;
		this.charset = charset;
		this.async = async;
		this.defer = defer;
		this.crossOrigin = crossOrigin;
		this.nonce = nonce;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes() {
		return Stream.of(src, type, charset, async, defer, crossOrigin, nonce)
				.filter(Objects::nonNull);
	}

}
