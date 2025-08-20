package swiss.sib.swissprot.sjh.attributes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import swiss.sib.swissprot.sjh.attributes.content.NoModule;
import swiss.sib.swissprot.sjh.attributes.content.Open;
import swiss.sib.swissprot.sjh.attributes.embedded.Autoplay;
import swiss.sib.swissprot.sjh.attributes.embedded.Controls;
import swiss.sib.swissprot.sjh.attributes.embedded.Default;
import swiss.sib.swissprot.sjh.attributes.embedded.IsMap;
import swiss.sib.swissprot.sjh.attributes.embedded.Loop;
import swiss.sib.swissprot.sjh.attributes.embedded.Muted;
import swiss.sib.swissprot.sjh.attributes.embedded.TypeMustMatch;
import swiss.sib.swissprot.sjh.attributes.form.AutoFocus;
import swiss.sib.swissprot.sjh.attributes.form.Checked;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.form.FormNoValidate;
import swiss.sib.swissprot.sjh.attributes.form.Multiple;
import swiss.sib.swissprot.sjh.attributes.form.NoValidate;
import swiss.sib.swissprot.sjh.attributes.form.ReadOnly;
import swiss.sib.swissprot.sjh.attributes.form.Required;
import swiss.sib.swissprot.sjh.attributes.form.Selected;
import swiss.sib.swissprot.sjh.attributes.global.Hidden;
import swiss.sib.swissprot.sjh.attributes.grouping.Reversed;
import swiss.sib.swissprot.sjh.attributes.script.Async;
import swiss.sib.swissprot.sjh.attributes.script.Defer;;

@SuppressWarnings("deprecation")
public sealed interface BooleanAttribute extends Attribute
        permits Async, NoModule, Open, Autoplay, Controls, Default, IsMap, Loop, Muted, TypeMustMatch, AutoFocus,
        Checked, Disabled, FormNoValidate, Selected, Required, ReadOnly, NoValidate, Multiple, Hidden, Reversed, Defer {

    static final byte[] EMPTY = new byte[0];

    boolean is();

    public default void render(OutputStream stream) throws IOException {
        if (is())
            stream.write(getAttributeName());
    }

    @Override
    public default byte[] getValue() {
        return null;
    }

    public default void render(Writer stream) throws IOException {
        if (is())
            stream.append(new CharSequenceOfBytesValueLessThan128(getAttributeName()));
    }
}
