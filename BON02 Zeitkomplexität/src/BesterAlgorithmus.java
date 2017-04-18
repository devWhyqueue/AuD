import java.math.BigInteger;

public class BesterAlgorithmus
{
	// 1000n
	public static double g1(int n)
	{
		return 1000 * n;
	}

	// 100n * log2(n+1)
	public static double g2(int n)
	{
		return (100 * n) * (Math.log(n + 1) / Math.log(2));
	}

	// 10 * n * n
	public static double g3(int n)
	{
		double d = n;
		return 10 * d * d;
	}

	// n * n * n
	public static double g4(int n)
	{
		double d = n;
		return d * d * d;
	}

	// 2 hoch n
	public static double g5(int n)
	{
		return Math.pow(2, n);
	}

	// n!
	public static double g6(int n)
	{
		return factorial(BigInteger.valueOf(n));
	}

	public static double factorial(BigInteger n)
	{
		BigInteger factorial = BigInteger.valueOf(1);

		for (int i = 1; i <= n.intValue(); i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		return factorial.doubleValue();
	}

	// Bestimmt fuer alle 6 Funktionen den Wert von
	// gi(n) und gibt den Index der Funktion mit
	// dem minimalen Wert zurueck
	public static int gewinnerFuerN(int n)
	{
		double[] complexities = new double[6];

		complexities[0] = g1(n);
		complexities[1] = g2(n);
		complexities[2] = g3(n);
		complexities[3] = g4(n);
		complexities[4] = g5(n);
		complexities[5] = g6(n);

		int minIndex = 0;
		for (int pos = 1; pos < complexities.length; pos++)
		{
			if (complexities[pos] < complexities[minIndex])
				minIndex = pos;
		}
		return minIndex + 1;
	}

	// Gibt für jede Zahl n zwischen 1 und 2000 aus, welcher der
	// 6 Algorithmen (A1 .. A6) für das betrachtete n der Beste ist
	public static void main(String[] args)
	{
		for (int n = 1000; n <= 1500; n++)
		{
			System.out
				.println("Der Gewinner für den Problemumfang " + n + " ist der Algorithmus " + gewinnerFuerN(n) + ".");
		}
	}
}
