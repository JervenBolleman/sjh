package swiss.sib.swissprot.sjh.elements;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;

public abstract class CommonElement implements Element {
    private final Stream<GlobalAttribute> attributes;
    private final Stream<RdfaAttribute> rdfaAttr;
    private final Stream<? extends Element> childeren;

    protected abstract byte[] getName();

    public void render(OutputStream stream) throws IOException {
        stream.write('<');
        stream.write(getName());

        writeAttributes(stream, attributes);
        writeAttributes(stream, rdfaAttr);
        writeAttributes(stream, getElementSpecificAttributes());
        if (childeren != null) {

            Iterator<? extends Element> iter = childeren.iterator();
            if (iter.hasNext()) {
                stream.write('>');
                while (iter.hasNext())
                    iter.next().render(stream);
                stream.write('<');
                stream.write('/');
                stream.write(getName());
                stream.write('>');
            } else {
                stream.write('/');
                stream.write('>');
            }
        } else {
            stream.write('/');
            stream.write('>');
        }
    }
	
    public void render(Writer writer) throws IOException {
        writer.write('<');
        writer.write(new String(getName(), StandardCharsets.UTF_8));
        writeAttributes(writer, attributes);
        writeAttributes(writer, rdfaAttr);
        writeAttributes(writer, getElementSpecificAttributes());
        if (childeren != null) {

            Iterator<? extends Element> iter = childeren.iterator();
            if (iter.hasNext()) {
                writer.write('>');
                while (iter.hasNext())
                    iter.next().render(writer);
                writer.write('<');
                writer.write('/');
                writer.write(new String(getName(), StandardCharsets.UTF_8));
                writer.write('>');
            } else {
                writer.write('/');
                writer.write('>');
            }
        } else {
            writer.write('/');
            writer.write('>');
        }
    }

    protected CommonElement(Stream<GlobalAttribute> ga, Stream<? extends Element> childeren) {
        super();
        this.attributes = ga;
		this.rdfaAttr = null;
        this.childeren = childeren.filter(Objects::nonNull);
    }
    
    protected CommonElement(Stream<GlobalAttribute> ga, Stream<RdfaAttribute> rdfa, Stream<? extends Element> childeren) {
        super();
        this.attributes = ga;
		this.rdfaAttr = rdfa;
        this.childeren = childeren.filter(Objects::nonNull);
    }

    protected CommonElement() {
        super();
        this.attributes = null;
		this.rdfaAttr = null;
        this.childeren = null;
    }
    
    private void writeAttributes(OutputStream stream, Stream<? extends Attribute> sa) throws IOException {
		if (sa == null)
			return;

		Iterator<? extends Attribute> iter = sa.iterator();
		if (iter.hasNext())
			stream.write(' ');
		while (iter.hasNext()) {
			iter.next().render(stream);
			if (iter.hasNext())
				stream.write(' ');
		}
	}

	private void writeAttributes(Writer stream, Stream<? extends Attribute> sa) throws IOException {
		if (sa == null)
			return;

		Iterator<? extends Attribute> iter = sa.iterator();
		if (iter.hasNext())
			stream.write(' ');
		while (iter.hasNext()) {
			iter.next().render(stream);
			if (iter.hasNext())
				stream.write(' ');
		}
	}
    
	protected Stream<? extends Attribute> getElementSpecificAttributes() {
        return Stream.empty();
    }
}
