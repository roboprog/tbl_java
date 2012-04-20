import static java.lang.Double.MAX_VALUE;

/**
 * Demo of more compact, maintainable, table driven code.
 */
public
class					GoodDemo
	{

	/** cutoff quantify column in rate table */
	private static final
	int					CUTOFF = 0;

	/** rate column in rate table */
	private static final
	int					RATE = 1;

	/** quantity vs rate table */
	private static final
	double [][]			RATE_TBL = new double [][]
		{	//			CUTOFF		RATE
		new double [] {	10,			1.50 },
		new double [] { 100,		1.00 },
		new double [] { 1000,		0.95 },
		new double [] { 2000,		0.94 },
		new double [] { 5000,		0.93 },
		new double [] { 10000,		0.92 },
		new double [] { 20000,		0.91 },
		new double [] { MAX_VALUE,	0.90 },
		};

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
		for ( double []	row : RATE_TBL)

			{
			if ( qty < row[ CUTOFF ])
				{
				return row[ RATE ];  // === found ===
				}  // found quantity range?

			}  // scan each row

		throw new RuntimeException( "This can't happen");
		}  // __________

	}  // ==============

// vi: ts=4 sw=4 ai
// *** EOF ***
