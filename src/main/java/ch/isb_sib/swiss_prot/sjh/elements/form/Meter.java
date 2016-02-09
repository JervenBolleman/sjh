package ch.isb_sib.swiss_prot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.form.High;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Low;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Max;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Min;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Optimum;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Meter extends CommonElement implements FlowContent,
		PhrasingContent, InteractiveContent, PalpabaleContent {
	private final static byte[] NAME = "meter".getBytes(UTF_8);
	private final Max max;
	private final Value value;
	private final High high;
	private final Min min;
	private final Low low;
	private final Optimum optimum;

	@Override
	protected byte[] getName() {
		return NAME;
	}

	public Meter(GlobalAttribute[] ga, Value value, Min min, Max max, Low low,
			High high, Optimum optimum) {
		super(ga);
		this.value = value;
		this.min = min;
		this.max = max;
		this.low = low;
		this.high = high;
		this.optimum = optimum;

	}

	public Meter(GlobalAttribute[] ga, Value value, Min min, Max max, Low low,
			Optimum optimum, High high,
			Stream<? extends PhrasingContent> childeren) {
		super(ga, childeren);
		this.value = value;
		this.min = min;
		this.max = max;
		this.low = low;
		this.optimum = optimum;
		this.high = high;

	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes() {
		return Stream.of(value, max, min, low, high, optimum).filter(Objects::nonNull);
	}
}
