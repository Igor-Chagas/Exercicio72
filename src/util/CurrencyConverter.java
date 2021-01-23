package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double pagar (double cambio, double valDollar){ 
	valDollar += valDollar*IOF;
	return valDollar * cambio;
	}
}
