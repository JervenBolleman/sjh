package ch.isb_sib.swiss_prot.sjh.attributes.script;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed interface ScriptAttribute extends Attribute permits Async, Defer, Nonce {

}
