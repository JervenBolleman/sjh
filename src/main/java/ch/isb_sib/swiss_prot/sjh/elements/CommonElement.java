package ch.isb_sib.swiss_prot.sjh.elements;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;

public abstract class CommonElement implements Element {
    private final Stream<GlobalAttribute> attributes;
    private final Stream<? extends Element> childeren;

    protected abstract byte[] getName();

    public void render(OutputStream stream) throws IOException {
        stream.write('<');
        stream.write(getName());
        Iterator<Attribute> sa = getAttributes().iterator();
        if (sa.hasNext())
            stream.write(' ');
        while (sa.hasNext()) {
            sa.next().render(stream);
            if (sa.hasNext())
                stream.write(' ');
        }
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
        Iterator<Attribute> sa = getAttributes().iterator();
        if (sa.hasNext())
            writer.write(' ');
        while (sa.hasNext()) {
            sa.next().render(writer);
            if (sa.hasNext())
                writer.write(' ');
        }
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
        this.childeren = childeren.filter(Objects::nonNull);
    }

    protected CommonElement() {
        super();
        this.attributes = null;
        this.childeren = null;
    }

    private Stream<GlobalAttribute> getGlobalAttributes() {
        if (attributes != null)
            return attributes.filter(Objects::nonNull);
        else
            return Stream.empty();
    }

    private final Stream<Attribute> getAttributes() {
        return Stream.concat(getGlobalAttributes(), getElementSpecificAttributes()).filter(Objects::nonNull);
    }

    protected Stream<? extends Attribute> getElementSpecificAttributes() {
        return Stream.empty();
    }
}
