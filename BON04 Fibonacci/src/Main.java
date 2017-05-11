public class Main
{

	public static void main(String[] args)
	{
		printFibonacciNumber(5, true); // rekursiv
		printFibonacciNumber(8, false); // iterativ
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
			fibonacciRekursivOptimiert(i - 1, 0, 1);
		zweiteUhr.stop();
		System.out.println("Die optimierte rekursive Berechnung der ersten 50 Fibonaccizahlen benötigte "
			+ zweiteUhr.getDuration() / Math.pow(10, 6) + " Millisekunden.");

		dritteUhr.start();
		for (int i = 1; i < 51; i++)
			fibonacciRekursiv(i - 1);
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
		int fibonacciNumber;

		if (n > 0)
		{
			if (rekursiv)
				fibonacciNumber = fibonacciRekursiv((n - 1)); // Nötig, da ab 0 gezählt wird
			else
				fibonacciNumber = fibonacciIterativ(n);

			System.out.println("Die " + n + "te Fibonaccizahl ist " + fibonacciNumber + ".");
		}
		else
			System.err.println("Ungültige Eingabe!");
	}

	private static int fibonacciRekursiv(int n)
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

	private static int fibonacciIterativ(int n)
	{
		int[] fibonacciNumbers;

		if (n < 2)
			fibonacciNumbers = new int[2];
		else
			fibonacciNumbers = new int[n];
		fibonacciNumbers[0] = 0;
		fibonacciNumbers[1] = 1;

		for (int i = 2; i < fibonacciNumbers.length; i++)
			fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];

		return fibonacciNumbers[n - 1];
	}

}
