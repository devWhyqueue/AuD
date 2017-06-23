package sortingAlgorithms;

public class HeapSort
{
	// Versickere das Element mit Index zuversickern in dem Teilfeld von Index links bis einschließlich Index rechts
	public static void versickere(int[] array, int zuversickern, int links, int rechts)
	{
		int m = ((rechts - links + 1) / 2) - 1 + links; // Startpunkt in der Mitte

		while (zuversickern <= m)
		{
			int kindIndex = ((zuversickern + 1) * 2) - 1; // Index des linken Kinds

			if (kindIndex + 1 <= rechts) // Existiert rechtes Kind?
			{
				if (array[kindIndex] < array[kindIndex + 1]) // Drehe hier den Vergleichsoperator, um die Sortierrichtung umzukehren.
				{
					kindIndex++; // Wenn rechtes Kind größer, wähle dieses
				}
			}

			// Prüfe, ob Element versickern muss
			if (array[zuversickern] < array[kindIndex]) // Drehe hier den Vergleichsoperator, um die Sortierrichtung umzukehren.
			{
				int help = array[zuversickern];
				array[zuversickern] = array[kindIndex];
				array[kindIndex] = help;

				zuversickern = kindIndex; // Wiederhole den Vorgang mit der neuen Position
			}
			else
				break;
		}
	}

	public static void heapsort(int[] array, int links, int rechts)
	{
		int m = ((rechts - links + 1) / 2) - 1 + links; // Startpunkt in der Mitte

		for (int i = m; i >= links; i--)
			versickere(array, i, links, rechts); // Erzeuge den Heap

		for (int i = rechts; i > links; i--)
		{
			int help = array[links];
			array[links] = array[i];
			array[i] = help; // Schiebe größtes Element nach hinten

			versickere(array, links, links, i - 1); // Wiederhole Prozess mit um 1 verkleinertem Heap
		}
	}
}