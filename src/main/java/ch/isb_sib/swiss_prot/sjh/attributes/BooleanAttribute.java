package ch.isb_sib.swiss_prot.sjh.attributes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import ch.isb_sib.swiss_prot.sjh.attributes.content.NoModule;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Open;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Autoplay;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Controls;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Default;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.IsMap;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Loop;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Muted;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.TypeMustMatch;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoFocus;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Checked;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormNoValidate;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Multiple;
import ch.isb_sib.swiss_prot.sjh.attributes.form.NoValidate;
import ch.isb_sib.swiss_prot.sjh.attributes.form.ReadOnly;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Required;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Selected;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Hidden;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Reversed;
import ch.isb_sib.swiss_prot.sjh.attributes.script.Async;
import ch.isb_sib.swiss_prot.sjh.attributes.script.Defer;;

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
