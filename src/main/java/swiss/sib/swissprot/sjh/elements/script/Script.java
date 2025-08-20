package swiss.sib.swissprot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.CrossOrigin;
import swiss.sib.swissprot.sjh.attributes.content.NoModule;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Charset;
import swiss.sib.swissprot.sjh.attributes.script.Async;
import swiss.sib.swissprot.sjh.attributes.script.Defer;
import swiss.sib.swissprot.sjh.attributes.script.Nonce;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Text;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;
import swiss.sib.swissprot.sjh.elements.contenttype.ScriptSupporting;

public non-sealed class Script extends CommonElement implements FlowContent, MetaContent, ScriptSupporting {
    private final static byte[] NAME = "script".getBytes(UTF_8);
    private final Src src;
    private final Type type;
    private final Charset charset;
    private final Async async;
    private final Defer defer;
    private final CrossOrigin crossOrigin;
    private final Nonce nonce;
    private final NoModule nomodule;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Script(Stream<GlobalAttribute> ga, Src src, Type type, Charset charset, Async async, Defer defer,
            CrossOrigin crossOrigin, Nonce nonce, NoModule nomudle, Text content) {
        super(ga, Stream.of(content));
        this.src = src;
        this.type = type;
        this.charset = charset;
        this.async = async;
        this.defer = defer;
        this.crossOrigin = crossOrigin;
        this.nonce = nonce;
        this.nomodule = nomudle;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(src, type, charset, async, defer, crossOrigin, nomodule, nonce).filter(Objects::nonNull);
    }

}
