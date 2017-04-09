public class SiebDesEratosthenes
{
	private int[][] sieb;
	private int n;

	public void gebePrimzahlenAus(int grenze)
	{
		if (grenze < 2)
			System.err.println("Ungültige Eingabe!");
		else
		{
			n = grenze;
			findePrimzahlen();

			for (int i = 0; i < sieb.length; i++)
			{
				if (sieb[i][1] != 2)
					System.out.print(sieb[i][0] + " ");
			}
		}

	}

	private int[][] findePrimzahlen()
	{
		if(n % 2 == 0)
			sieb = new int[n/2 + 1][2]; // Zahl, Status: 0 ist nichts, 1 ist gerahmt, 2 ist gestrichen
		else
			sieb = new int[n/2 + 2][2]; // bei ungeradem n wird eine Postion mehr benötigt

		int pos = 0;
		for (int zahl = 1; zahl <= n; zahl++)
		{
			if(zahl == 2 || zahl % 2 != 0){  // Nur ungerade Zahlen (Ausnahme 2)
				sieb[pos][0] = zahl; // Zahlen eintragen ((pos+1) ist Zahl)
				pos++;
			}
		}
		sieb[0][1] = 2; // Eins durchstreichen

		pos = 0;
		int zahl = 1;
		do
		{
			if (sieb[pos][1] == 0) // Wenn Zahl nicht durchgestrichen oder gerahmt
			{
				sieb[pos][1] = 1; // Zahl einrahmen
				zahl = sieb[pos][0]; // Zahl speichern
				
				for(int i = pos + 1; i < sieb.length; i++){
					if(sieb[i][0] % zahl == 0) // Wenn Zahl Vielfaches von eingerahmter Zahl
						sieb[i][1] = 2; // Zahl durchstreichen
				}
			}
			pos++;
		}
		while ((pos + 1) * (pos + 1) <= n);

		return sieb;
	}
}
