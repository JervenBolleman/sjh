package swiss.sib.swissprot.sjh.attributes.embedded;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * When present, it specifies that the image is part of a server-side image map (an image map is an image with clickable
 * areas). When clicking on a server-side image map, the click coordinates are sent to the server as a URL query string.
 * Note: The ismap attribute is allowed only if the <img> element is a descendant of an <a> element with a valid href
 * attribute.
 */

// TODO: make sure that this is only used in the right context, i.e. that it is
// only used if the <img> element is a descendant of an <a> element with a valid
// href attribute.
public enum IsMap implements EmbeddedAttribute, BooleanAttribute {

    TRUE, FALSE;

    private static final byte[] NAME = Attribute.fromString("ismap");

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }

    @Override
    public boolean is() {
        return this == TRUE;
    }
}
