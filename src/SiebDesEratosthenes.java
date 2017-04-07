public class SiebDesEratosthenes
{
	private int[][] sieb;
	private int n;

	public void gebePrimzahlenAus(int grenze)
	{
		if (grenze < 1)
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
		sieb = new int[n][2]; // Zahl, Status: 0 ist nichts, 1 ist gerahmt, 2 ist gestrichen

		for (int pos = 0; pos < n; pos++)
		{
			sieb[pos][0] = pos + 1; // Zahlen eintragen ((pos+1) ist Zahl)
		}
		sieb[0][1] = 2; // Eins durchstreichen

		int pos = 0;
		do
		{
			if (sieb[pos][1] == 0) // Wenn Zahl nicht durchgestrichen oder gerahmt
			{
				sieb[pos][1] = 1; // Zahl einrahmen

				int posVielfache = (pos + 1) + (pos + 1) - 1; // Position des ersten Vielfachen der kleinsten nicht durchgestrichenen oder gerahmten Zahl
				while (posVielfache < n)
				{
					sieb[posVielfache][1] = 2; // Zahl durchstreichen
					posVielfache = (pos + 1) + (posVielfache + 1) - 1;
				}
			}
			pos++;
		}
		while ((pos + 1) * (pos + 1) <= n);

		return sieb;
	}
}
