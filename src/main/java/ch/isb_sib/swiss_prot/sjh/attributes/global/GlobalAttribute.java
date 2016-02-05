package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.ArrayList;
import java.util.List;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public interface GlobalAttribute
    extends Attribute
{
	public static GlobalAttribute[] ga(AccessKey accesskey, Clazz clazz, Dir dir, Hidden hidden, Id id, Lang lang,
	    SpellCheck check, Style style, TabIndex tabindex, ATitle title, Translate translate)
	{
		List<GlobalAttribute> l = new ArrayList<>(12);
		add(l, accesskey);
		add(l, clazz);
		add(l, dir);
		add(l, hidden);
		add(l, id);
		add(l, lang);
		add(l, check);
		add(l, style);
		add(l, tabindex);
		add(l, title);
		add(l, translate);
		return l.toArray(new GlobalAttribute[l.size()]);
	}

	public static void add(List<GlobalAttribute> l, GlobalAttribute ga)
	{
		if (ga != null)
			l.add(ga);
	}
}
