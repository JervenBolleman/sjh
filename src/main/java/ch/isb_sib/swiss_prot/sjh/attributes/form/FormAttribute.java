package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface FormAttribute extends Attribute permits Accept, AcceptCharset, Action, AutoComplete, Challenge,
	Checked, Cols, DirName, Disabled, EncType, For, FormAction, FormEnctype, FormMethod, FormNoValidate, FormTarget,
	High, InputMode, KeyType, List, Low, Max, MaxLength, Menu, Method, Min, MinLength, Multiple, NoValidate,
	Pattern, PlaceHolder, ReadOnly, Required, Rows, Selected, Size, Step, Type, Wrap, Optimum {

}
