package ch.isb_sib.swiss_prot.sjh.attributes.content;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * CrossOrgin attribute "The crossorigin attribute is a CORS settings attribute. It is intended for use with external
 * resource links. The exact behavior for links to external resources depends on the exact relationship, as defined for
 * the relevant link type. Some of the attributes control whether or not the external resource is to be applied (as
 * defined below)." From W3C Recommendation Copyright © 2014 W3C® (MIT, ERCIM, Keio, Beihang)
 *
 * @see <a href= "https://www.w3.org/TR/html/single-page.html#attr-link-crossorigin">W3C HTML5 specification</a>
 */

public non-sealed class CrossOrigin implements ContentAttribute {
    private static final byte[] NAME = Attribute.fromString("crossorigin");

    private final byte[] value;

    public CrossOrigin(String value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(value);
    }

    @Override
    public byte[] getValue() {
        return value;
    }

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }
}
