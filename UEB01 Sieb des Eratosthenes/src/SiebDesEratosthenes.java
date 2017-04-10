public class SiebDesEratosthenes
{
	private boolean[] sieb;
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
				if (!sieb[i])
					if(i == 0)
						System.out.print(2 + " ");
					else
						System.out.print(((2 * i) + 1) + " ");
			}
		}
	}
	
	
	public long berechneAnzPrimzahlen(int grenze)
	{
		long anz = 0;
		
		if (grenze < 2)
			System.err.println("Ungültige Eingabe!");
		else
		{
			n = grenze;
			findePrimzahlen();

			for (int i = 0; i < sieb.length; i++)
			{
				if (!sieb[i])
					anz++;
			}
		}
		return anz;
	}
	
	private void findePrimzahlen(){
		
		if(n % 2 == 0)
			sieb = new boolean[n/2]; 
		else
			sieb = new boolean[n/2 + 1]; // bei ungeradem n wird eine Postion mehr benötigt (Beginn bei 2!!!)
		
		int pos = 1;
		int zahl = 3;
		int posVielfaches = pos + zahl;
		do
		{
			if (!sieb[pos]) // Wenn Zahl nicht durchgestrichen
			{
				zahl = 2 * pos + 1;
				for(posVielfaches = pos + zahl; posVielfaches < sieb.length; posVielfaches += zahl){
					if(!sieb[posVielfaches] ) // Wenn Zahl Vielfaches und nicht durchgestrichen 
						sieb[posVielfaches] = true; // Zahl durchstreichen
				}
			}
			pos++;
		}
		while (zahl * zahl <= n);
	}

}
