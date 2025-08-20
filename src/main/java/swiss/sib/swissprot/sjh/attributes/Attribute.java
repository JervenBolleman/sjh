package swiss.sib.swissprot.sjh.attributes;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import swiss.sib.swissprot.sjh.attributes.content.ContentAttribute;
import swiss.sib.swissprot.sjh.attributes.embedded.EmbeddedAttribute;
import swiss.sib.swissprot.sjh.attributes.event.EventAttribute;
import swiss.sib.swissprot.sjh.attributes.form.FormAttribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.GroupingAttribute;
import swiss.sib.swissprot.sjh.attributes.head.Manifest;
import swiss.sib.swissprot.sjh.attributes.menu.MenuAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.MetaAttribute;
import swiss.sib.swissprot.sjh.attributes.script.ScriptAttribute;
import swiss.sib.swissprot.sjh.attributes.table.TableAttribute;
import swiss.sib.swissprot.sjh.elements.interactive.MenuItem;

public sealed interface Attribute permits BooleanAttribute, GlobalAttribute, FormAttribute, Cite, DateTime, Download,
        ContentAttribute, GroupingAttribute, EmbeddedAttribute, EventAttribute, Manifest, MenuAttribute, MetaAttribute,
        ScriptAttribute, TableAttribute, MenuItem.Type {
    static final byte DOUBLE_QUOTE = '"';
    static final byte[] EQUALS_DOUBLE_QUOTE = new byte[] { '=', '"' };

    byte[] getValue();

    byte[] getAttributeName();

    public default void render(OutputStream stream) throws IOException {
        stream.write(getAttributeName());
        stream.write(EQUALS_DOUBLE_QUOTE);
        stream.write(getValue());
        stream.write(DOUBLE_QUOTE);
    }

    public default void render(Writer stream) throws IOException {
        stream.write(new String(getAttributeName(), StandardCharsets.UTF_8));
        stream.write(new String(EQUALS_DOUBLE_QUOTE, StandardCharsets.UTF_8));
        stream.write(new String(getValue(), StandardCharsets.UTF_8));
        stream.write(DOUBLE_QUOTE);
    }

    public static byte[] fromString(String asbyte) {
        return asbyte.getBytes(UTF_8);
    }
}
