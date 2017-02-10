package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Alt;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Accept;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoComplete;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoFocus;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Checked;
import ch.isb_sib.swiss_prot.sjh.attributes.form.DirName;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormAction;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormEnctype;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormMethod;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormNoValidate;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormTarget;
import ch.isb_sib.swiss_prot.sjh.attributes.form.InputMode;
import ch.isb_sib.swiss_prot.sjh.attributes.form.List;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Max;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Min;
import ch.isb_sib.swiss_prot.sjh.attributes.form.MinLength;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Multiple;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Pattern;
import ch.isb_sib.swiss_prot.sjh.attributes.form.PlaceHolder;
import ch.isb_sib.swiss_prot.sjh.attributes.form.ReadOnly;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Required;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Size;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Step;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Input extends CommonElement implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "input".getBytes(UTF_8);
    private final Form form;
    private final Accept accept;
    private final Alt alt;
    private final Checked checked;
    private final FormEnctype formentype;
    private final FormNoValidate formnovalidate;
    private final Height height;
    private final InputMode inputMode;
    private final Min min;
    private final PlaceHolder placeholder;
    private final Src src;
    private final Value value;
    private final Width width;
    private final AutoComplete autoComplete;
    private final AutoFocus autofocus;
    private final DirName dirname;
    private final Disabled disabled;
    private final FormAction formaction;
    private final FormMethod formmethod;
    private final FormTarget formtarget;
    private final List list;
    private final Max max;
    private final MinLength minlength;
    private final Multiple multiple;
    private final Pattern pattern;
    private final ReadOnly readonly;
    private final Required required;
    private final Size size;
    private final Step step;
    private final Type type;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Input(Stream<GlobalAttribute> ga, Accept accept, Alt alt, AutoComplete autoComplete, AutoFocus autofocus,
	    Checked checked, DirName dirname, Disabled disabled, Form form, FormAction formaction,
	    FormEnctype formentype, FormMethod formmethod, FormNoValidate formnovalidate, FormTarget formtarget,
	    Height height, InputMode inputMode, List list, Max max, MinLength minlength, Min min, Multiple multiple,
	    Pattern pattern, PlaceHolder placeholder, ReadOnly readonly, Required required, Size size, Src src,
	    Step step, Type type, Value value, Width width) {
	super(ga, Stream.empty());
	this.accept = accept;
	this.alt = alt;
	this.autoComplete = autoComplete;
	this.autofocus = autofocus;
	this.checked = checked;
	this.dirname = dirname;
	this.disabled = disabled;
	this.form = form;
	this.formaction = formaction;
	this.formentype = formentype;
	this.formmethod = formmethod;
	this.formnovalidate = formnovalidate;
	this.formtarget = formtarget;
	this.height = height;
	this.inputMode = inputMode;
	this.list = list;
	this.max = max;
	this.minlength = minlength;
	this.min = min;
	this.multiple = multiple;
	this.pattern = pattern;
	this.placeholder = placeholder;
	this.readonly = readonly;
	this.required = required;
	this.size = size;
	this.src = src;
	this.step = step;
	this.type = type;
	this.value = value;
	this.width = width;
    }

    public Input(Stream<GlobalAttribute> ga, Type type) {
	super(ga, Stream.empty());
	this.accept = null;
	this.alt = null;
	this.autoComplete = null;
	this.autofocus = null;
	this.checked = null;
	this.dirname = null;
	this.disabled = null;
	this.form = null;
	this.formaction = null;
	this.formentype = null;
	this.formmethod = null;
	this.formnovalidate = null;
	this.formtarget = null;
	this.height = null;
	this.inputMode = null;
	this.list = null;
	this.max = null;
	this.minlength = null;
	this.min = null;
	this.multiple = null;
	this.pattern = null;
	this.placeholder = null;
	this.readonly = null;
	this.required = null;
	this.size = null;
	this.src = null;
	this.step = null;
	this.type = type;
	this.value = null;
	this.width = null;
	    
	}
    
    public Input(Stream<GlobalAttribute> ga, Checked checked, Disabled disabled, Type type) {
   	super(ga, Stream.empty());
   	this.accept = null;
   	this.alt = null;
   	this.autoComplete = null;
   	this.autofocus = null;
   	this.checked = checked;
   	this.dirname = null;
   	this.disabled = disabled;
   	this.form = null;
   	this.formaction = null;
   	this.formentype = null;
   	this.formmethod = null;
   	this.formnovalidate = null;
   	this.formtarget = null;
   	this.height = null;
   	this.inputMode = null;
   	this.list = null;
   	this.max = null;
   	this.minlength = null;
   	this.min = null;
   	this.multiple = null;
   	this.pattern = null;
   	this.placeholder = null;
   	this.readonly = null;
   	this.required = null;
   	this.size = null;
   	this.src = null;
   	this.step = null;
   	this.type = type;
   	this.value = null;
   	this.width = null;
   	    
   	}
    public Input(Stream<GlobalAttribute> ga) {
	this(ga, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
		null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream
		.of(accept, alt, autoComplete, autofocus, checked, dirname, disabled, form, formaction, formentype,
			formmethod, formnovalidate, formtarget, height, inputMode, list, max, minlength, min, multiple,
			pattern, placeholder, readonly, required, size, src, step, type, value, width)
		.filter(Objects::nonNull);
    }
}
