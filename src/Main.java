
public class Main
{

	public static void main(String[] args)
	{
		SiebDesEratosthenes sieb = new SiebDesEratosthenes();
		sieb.gebePrimzahlenAus(-5);
		sieb.gebePrimzahlenAus(0);
		sieb.gebePrimzahlenAus(1);
		System.out.println();
		sieb.gebePrimzahlenAus(2);
		System.out.println();
		sieb.gebePrimzahlenAus(25);
		System.out.println();
		sieb.gebePrimzahlenAus(5000);

	}

}
