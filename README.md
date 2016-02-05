# What is SJH

A proof of concept for generating HTML using java directly, hopefully no uglier than necesarry. While making it difficult to generate invalid HTML by leveraging the typesystem. 

#Why
Generating HTML for Java projects has always been done by non Java templates. e.g. JSPX or ThymeLeaf. These templates would have some programming support as well as accessing values from Java objects using the Java bean syntax.

However, these types of templates are dynamic runtime validated. This does not match nicely with the rest of the Java code which is statically typed. Here we try to see how far java8 can be stretched to generate readable code for generating HTML.

The idea is that it can fit in nicely with JAX-RS&JSR-371 as a good method for generating HTML views.

#Status

This is a proof of concept code base only.


#Main idea

Assume JAX-RS, 
```java

@Path("hello")
public class Hello {
	@GET
	public Response hello() {

		HTML html = html(head(title("hello")),
				 body(main(h1("hello"))));
		return Response.status(Response.OK)
				.entity(html().build();
	}
}

```

```java
@Path("users")
public class Users {
	@GET
	public Response user(@QueryParam("id") long userid) {

		User user = findUserEtc(userid);
		HTML html = html(head(title("hello")),
				 body(main(new UserGreeting(user))));
		return Response.status(Response.OK)
				.entity(html().build();

	private static class UserGreeting 
		extends H1 {
		private UserGreeting(User user) {
			super("hello, dear ", user.getPrefferedName());
		}
	}
}
```

Which means if you decide to refactor the getPrefferedName() into getNickName(), your standard refactoring tools will be able to change it. Unlike when you are using JSPX or JSF.



