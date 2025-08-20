package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.Value;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;

public class Param extends CommonElement {
    private final static byte[] NAME = "param".getBytes(UTF_8);
    private final Name name;
    private final Value value;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Param(Stream<GlobalAttribute> ga, Name name, Value value) {
        super(ga, Stream.empty());
        this.name = name;
        this.value = value;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (name != null) {
            if (value != null)
                return Stream.of(name, value);
            else
                return Stream.of(name);
        } else if (value != null)
            return Stream.of(value);
        else
            return Stream.empty();
    }
}
