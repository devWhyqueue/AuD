package bucketSort;

public class BucketSort
{
	private Linkable[] buckets;

	public BucketSort(int count)
	{
		buckets = new Linkable[count];
	}

	public void addToBucket(Linkable item, int bucket)
	{
		assert (bucket >= 0);
		assert (bucket < buckets.length);

		if (buckets[bucket] == null)
			buckets[bucket] = item; // Wenn Bucket leer, lege Klausur rein (unterste Klausur, hat keinen Nachfolger)
		else
		{
			item.setNext(buckets[bucket]); // Aktuell auf dem Stapel liegende Klausur ist Nachfolger ("next"), der neu hinzugefügten
			buckets[bucket] = item; // Lege Klausur auf Stapel
		}
	}

	public void printBucket(int bucket)
	{
		assert (bucket >= 0);
		assert (bucket < buckets.length);

		Linkable klausur = buckets[bucket]; // Erste Klausur ist oben auf dem Stapel

		while (klausur != null)
		{
			System.out.println(klausur);
			klausur = klausur.getNext(); // Hole die darunterliegende Klausur
		}
		System.out.println();
	}
}