package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.form.AutoComplete;
import swiss.sib.swissprot.sjh.attributes.form.AutoFocus;
import swiss.sib.swissprot.sjh.attributes.form.Cols;
import swiss.sib.swissprot.sjh.attributes.form.DirName;
import swiss.sib.swissprot.sjh.attributes.form.Disabled;
import swiss.sib.swissprot.sjh.attributes.form.MaxLength;
import swiss.sib.swissprot.sjh.attributes.form.MinLength;
import swiss.sib.swissprot.sjh.attributes.form.PlaceHolder;
import swiss.sib.swissprot.sjh.attributes.form.ReadOnly;
import swiss.sib.swissprot.sjh.attributes.form.Required;
import swiss.sib.swissprot.sjh.attributes.form.Rows;
import swiss.sib.swissprot.sjh.attributes.form.Wrap;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Text;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class TextArea extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "textarea".getBytes(UTF_8);
    private final Form form;
    private final AutoFocus autofocus;
    private final Disabled disabled;
    private final Name name;
    private final AutoComplete autoComplete;

    private final Required required;
    private final Cols cols;
    private final DirName dirname;
    private final MaxLength maxlength;
    private final MinLength minLength;
    private final PlaceHolder placeHolder;
    private final ReadOnly readOnly;
    private final Rows rows;
    private final Wrap wrap;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public TextArea(Stream<GlobalAttribute> ga, AutoComplete autoComplete, AutoFocus autofocus, Cols cols,
            DirName dirname, Disabled disabled, Form form, MaxLength maxlength, MinLength minLength, Name name,
            PlaceHolder placeHolder, ReadOnly readOnly, Required required, Rows rows, Wrap wrap, Text text) {
        super(ga, Stream.of(text));
        this.autoComplete = autoComplete;
        this.autofocus = autofocus;
        this.cols = cols;
        this.dirname = dirname;
        this.disabled = disabled;
        this.form = form;
        this.maxlength = maxlength;
        this.minLength = minLength;

        this.name = name;
        this.placeHolder = placeHolder;
        this.readOnly = readOnly;
        this.required = required;
        this.rows = rows;
        this.wrap = wrap;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(autoComplete, autofocus, cols, dirname, disabled, form, maxlength, minLength, name,
                placeHolder, readOnly, required, rows, wrap).filter(Objects::nonNull);
    }
}
