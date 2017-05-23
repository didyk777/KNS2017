import net.sf.jclec.exprtree.fun.AbstractPrimitive;
import net.sf.jclec.exprtree.fun.ExprTreeFunction;

public class Add extends AbstractPrimitive
{
	public Add()
	{
		super(new Class<?> [] {Double.class, Double.class}, Double.class);
	}
	
	@Override
	protected void evaluate(ExprTreeFunction context)
	{
		// Get arguments (in context stack)
		Double arg1 = pop(context);
		Double arg2 = pop(context);
		// Push result in context stack
		push(context, arg1+arg2);
	}
	
	 // java.lang.Object methods
	
	public boolean equals(Object other)
	{
		return other instanceof Add;
	}
	
	public String toString()
	{
		return "+";
	}
}