package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoFocus;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Challenge;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.form.KeyType;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class KeyGen extends CommonElement implements FlowContent,
		PhrasingContent, InteractiveContent, PalpabaleContent {
	private final static byte[] NAME = "keygen".getBytes(UTF_8);
	private final Form form;
	private final AutoFocus autofocus;
	private final Disabled disabled;
	private final Name name;

	private final Challenge challenge;
	private final KeyType keytype;

	@Override
	protected byte[] getName() {
		return NAME;
	}

	public KeyGen(GlobalAttribute[] ga, AutoFocus autofocus,
			Challenge challenge, Disabled disabled, Form form, KeyType keytype,
			Name name) {
		super(ga);
		this.autofocus = autofocus;
		this.challenge = challenge;
		this.disabled = disabled;
		this.form = form;
		this.keytype = keytype;
		this.name = name;

	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes() {
		return Stream.of(this.autofocus, challenge, this.disabled, this.form,
				this.keytype, this.name).filter(Objects::nonNull);
	}
}
