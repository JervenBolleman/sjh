package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoComplete;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoFocus;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Cols;
import ch.isb_sib.swiss_prot.sjh.attributes.form.DirName;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.form.MaxLength;
import ch.isb_sib.swiss_prot.sjh.attributes.form.MinLength;
import ch.isb_sib.swiss_prot.sjh.attributes.form.PlaceHolder;
import ch.isb_sib.swiss_prot.sjh.attributes.form.ReadOnly;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Required;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Rows;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Wrap;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Text;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class TextArea extends CommonElement implements FlowContent,
		PhrasingContent, InteractiveContent, PalpabaleContent {
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

	public TextArea(Stream<GlobalAttribute> ga, AutoComplete autoComplete,
			AutoFocus autofocus, Cols cols, DirName dirname, Disabled disabled,
			Form form, MaxLength maxlength, MinLength minLength, Name name,
			PlaceHolder placeHolder, ReadOnly readOnly, Required required,
			Rows rows, Wrap wrap, Text text) {
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
		return Stream.of(autoComplete, autofocus, cols, dirname, disabled,
				form, maxlength, minLength, name, placeHolder, readOnly,
				required, rows, wrap).filter(Objects::nonNull);
	}
}
