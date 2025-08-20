package swiss.sib.swissprot.sjh.attributes.script;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface ScriptAttribute extends Attribute permits Async, Defer, Nonce {

}
