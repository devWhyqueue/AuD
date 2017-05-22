public class Main
{

	public static void main(String[] args)
	{
		printFibonacciNumber(7, true); // rekursiv
		printFibonacciNumber(9, false); // iterativ
		System.out.println();
		calculateFirst50Numbers();

	}

	private static void calculateFirst50Numbers()
	{
		StopUhr ersteUhr = new StopUhr();
		StopUhr zweiteUhr = new StopUhr();
		StopUhr dritteUhr = new StopUhr();

		ersteUhr.start();
		for (int i = 1; i < 51; i++)
			fibonacciIterativ(i);
		ersteUhr.stop();
		System.out.println("Die iterative Berechnung der ersten 50 Fibonaccizahlen benötigte "
				+ ersteUhr.getDuration() / Math.pow(10, 6) + " Millisekunden.");

		zweiteUhr.start();
		for (int i = 1; i < 51; i++)
			fibonacciRekursivOptimiert(i, 0, 1);
		zweiteUhr.stop();
		System.out.println("Die optimierte rekursive Berechnung der ersten 50 Fibonaccizahlen benötigte "
				+ zweiteUhr.getDuration() / Math.pow(10, 6) + " Millisekunden.");

		dritteUhr.start();
		for (int i = 1; i < 51; i++)
			fibonacciRekursiv(i);
		dritteUhr.stop();
		System.out.println("Die rekursive Berechnung der ersten 50 Fibonaccizahlen benötigte "
				+ dritteUhr.getDuration() / Math.pow(10, 9) + " Sekunden.");
	}

	private static long fibonacciRekursivOptimiert(int grenze, long fib1, long fib2)
	{
		if (grenze <= 1)
			return fib2;

		return fibonacciRekursivOptimiert(grenze - 1, fib2, fib1 + fib2);
	}

	private static void printFibonacciNumber(int n, boolean rekursiv)
	{
		long fibonacciNumber;

		if (n >= 0)
		{
			if (rekursiv)
				fibonacciNumber = fibonacciRekursiv((n));
															
			else
				fibonacciNumber = fibonacciIterativ(n);

			System.out.println("Die " + n + "te Fibonaccizahl ist " + fibonacciNumber + ".");
		} else
			System.err.println("Ungültige Eingabe!");
	}

	private static long fibonacciRekursiv(long n)
	{
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n >= 2)
			return fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2);
		else
			return -1; // Fehler
	}

	private static long fibonacciIterativ(int n)
	{
		long[] fibonacciNumbers;

		if(n==0)
			return 0;
		else if (n == 1)
			return 1;
		else
			fibonacciNumbers = new long[n + 1];
		
		fibonacciNumbers[0] = 0;
		fibonacciNumbers[1] = 1;

		for (int i = 2; i < fibonacciNumbers.length; i++)
			fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];

		return fibonacciNumbers[n];
	}

}
