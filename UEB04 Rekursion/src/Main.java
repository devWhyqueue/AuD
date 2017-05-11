
public class Main
{

	public static void main(String[] args)
	{
		System.out.println(revIterativ(1234));
		ulam(3);
		System.out.println();
		ulamIterativ(3);

	}

	private static int revIterativ(int n)
	{
		int revNumber = 0;
		int exponent = (int) Math.log10(n);

		while (n > 0)
		{
			revNumber += (n % 10) * Math.pow(10, exponent);
			n /= 10;
			exponent--;
		}

		return revNumber;
	}

	private static void ulam(int n)
	{
		System.out.print(n + " ");

		if (n % 2 == 0 && n > 1)
			ulam(n / 2);
		else if (n % 2 != 0 && n > 1)
			ulam(3 * n + 1);
	}

	private static void ulamIterativ(int n)
	{
		while (n > 0)
		{
			System.out.print(n + " ");

			if (n == 1)
				n--;
			else if (n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;
		}
	}

}
