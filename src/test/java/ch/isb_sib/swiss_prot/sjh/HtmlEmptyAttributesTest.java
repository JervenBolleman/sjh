package ch.isb_sib.swiss_prot.sjh;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

import org.junit.Test;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.ATitle;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Clazz;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.HttpEquiv;


public class HtmlEmptyAttributesTest
{
	@Test
	public void basic()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method[] methods = Attributes.class.getDeclaredMethods();
		for (Method method : methods)
		{

			if (method.getParameterCount() == 1)
			{
				String name = method.getReturnType().getSimpleName();
				if (method.getParameters()[0].getType() == String.class)
				{
					Attribute el = (Attribute) method.invoke(null, "test");
					if (el instanceof Clazz)
						test(el, "class=\"test\"");
					else if (el instanceof ATitle)
						test(el, "title=\"test\"");
					else if (el instanceof HttpEquiv)
						test(el, "http-equiv=\"test\"");
					else
						test(el, name.toLowerCase() + "=\"test\"");
				}
				else if (method.getParameters()[0].getType() == TemporalAccessor.class)
				{
					LocalDate now = LocalDate.now();
					Attribute el = (Attribute) method.invoke(null, now);
					test(el, name.toLowerCase() + "=\"" + DateTimeFormatter.ISO_LOCAL_DATE.format(now) + "\"");
				}

			}
		}
	}

	private void test(Attribute el, String expectedRaw)
	    throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		el.render(boas);
		assertEquals(expectedRaw,
		    new String(boas.toByteArray(), UTF_8));
	}
}
