package ch.isb_sib.swiss_prot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Charset;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Content;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.HttpEquiv;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.MetaAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;

public non-sealed class Meta extends CommonElement implements MetaContent {
    private final static byte[] NAME = "meta".getBytes(UTF_8);
    private final Name name;
    private final HttpEquiv httpEquiv;
    private final Content content;
    private final Charset charset;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Meta(Stream<GlobalAttribute> ga, Name name, HttpEquiv httpEquiv, Content content, Charset charset) {
	super(ga, Stream.empty());
	this.name = name;
	this.httpEquiv = httpEquiv;
	this.content = content;
	this.charset = charset;
    }

    @Override
    protected Stream<MetaAttribute> getElementSpecificAttributes() {
	return Stream.of(name, httpEquiv, content, charset).filter(Objects::nonNull);
    }

}
