/**
 * Demo of bloated code to be refactored with table driven methods.
 */
public
class					BadDemo
	{

	/**
	 * Program entry point.
	 */
	public static
	void				main
		(
		String []		argv
		)
		{
		double			qty;
		double			rate;

		qty = 2500;
		rate = getRate( qty);
		System.out.println(
				"Extended cost for " + qty + " widgets: $" + ( qty * rate) );
		}  // __________

	/**
	 * Return the charge rate for a given volume of product.
	 */
	private static
	double				getRate
		(
		double			qty
		)
		{
		if ( qty < 10)
			return 1.50;
		else if ( qty < 100)
			return 1.00;
		else if ( qty < 1000)
			return 0.95;
		else if ( qty < 2000)
			return 0.94;
		else if ( qty < 5000)
			return 0.93;
		else if ( qty < 10000)
			return 0.92;
		else if ( qty < 20000)
			return 0.91;
		else
			return 0.90;
		}  // __________

	}  // ==============

// vi: ts=4 sw=4 ai
// *** EOF ***
