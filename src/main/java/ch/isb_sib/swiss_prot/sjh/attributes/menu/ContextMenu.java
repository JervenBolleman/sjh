package ch.isb_sib.swiss_prot.sjh.attributes.menu;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * The contextmenu attribute gives the element's context menu. The value must be the ID of a menu element in the same
 * tree whose type attribute is in the context menu state. When a user right-clicks on an element with a contextmenu
 * attribute, the user agent will first fire a contextmenu event at the element, and then, if that event is not
 * canceled, a show event at the menu element. Here is an example of a context menu for an input control:
 * <form name="npc"> <label>Character name: <input name=char type=text contextmenu=namemenu required></label>
 * <menu type=context id=namemenu> <menuitem onclick= "document.forms.npc.elements.char.value = getRandomName()"> Pick
 * random name </menuitem> <menuitem onclick="prefillFields(document.forms.npc.elements.char.value)"> Prefill other
 * fields based on name </menuitem> </menu> </form> This adds two items to the control's context menu, one called "Pick
 * random name", and one called "Prefill other fields based on name". They invoke scripts that are not shown in the
 * example above.
 */
public non-sealed class ContextMenu implements MenuAttribute {

    private final static byte[] NAME = "contextmenu".getBytes(UTF_8);

    private byte[] value;

    private ContextMenu(String bytes) {
        this.value = Attribute.fromString(bytes);
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
