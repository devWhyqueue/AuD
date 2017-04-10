import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		SiebDesEratosthenes sieb = new SiebDesEratosthenes();
		
//		sieb.gebePrimzahlenAus(-5);
//		sieb.gebePrimzahlenAus(0);
//		sieb.gebePrimzahlenAus(1); // Ungültige Eingaben
//		
//		
//		sieb.gebePrimzahlenAus(2);
//		System.out.println();
//		sieb.gebePrimzahlenAus(4);  // 3 nötig => n/2 + 1
//		System.out.println();
//		sieb.gebePrimzahlenAus(7); // 5 nötig => n/2 + 2
//		System.out.println();
//		sieb.gebePrimzahlenAus(10); // 6 nötig
//		System.out.println();
//		sieb.gebePrimzahlenAus(25); // 14 nötig
//		
//		System.out.println();
//		sieb.gebePrimzahlenAus(100);
//		System.out.println();
//		sieb.gebePrimzahlenAus(1000);
//		System.out.println();
//		sieb.gebePrimzahlenAus(7500); // Maximalwert (nur innerhalb von Eclipse!)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Geben Sie hier die gewünschte Obergrenze ein!");
//		int eingabe = sc.nextInt();
//		sc.close();
//		System.out.println("Es werden nun alle Primzahlen von 1 bis " + eingabe + " angezeigt!");
//		sieb.gebePrimzahlenAus(eingabe);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie hier die gewünschte Obergrenze ein!");
		int eingabe = sc.nextInt();
		sc.close();
		System.out.println("Es wird nun die Anzahl aller Primzahlen von 1 bis " + eingabe + " angezeigt!");
		System.out.println(sieb.berechneAnzPrimzahlen(eingabe));

	}

}
