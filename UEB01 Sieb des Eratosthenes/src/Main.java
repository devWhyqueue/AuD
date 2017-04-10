import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		SiebDesEratosthenes sieb = new SiebDesEratosthenes();
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Geben Sie hier die gewünschte Obergrenze ein!");
//		int eingabe = sc.nextInt();
//		sc.close();
//		System.out.println("Es werden nun alle Primzahlen von 1 bis " + eingabe + " angezeigt!");
//		sieb.gebePrimzahlenAus(eingabe);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Geben Sie hier die gewünschte Obergrenze ein!");
//		int eingabe = sc.nextInt();
//		sc.close();
//		System.out.println("Es wird nun die Anzahl aller Primzahlen von 1 bis " + eingabe + " angezeigt!");
//		System.out.println(sieb.berechneAnzPrimzahlen(eingabe));
		
		System.out.println(sieb.berechneAnzPrimzahlen(1000000000));
//		sieb.gebePrimzahlenAus(1000000000);

	}

}
