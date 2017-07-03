
public class BinarySearch
{

	public static void main(String[] args)
	{
		String[] tiere = { "Affe", "Antilope", "Esel", "Krokodil", "Pinguin", "Schaf" };
		String erstesTier = "Pinguin";
		String zweitesTier = "Kuh";

		if (binaereSuche(tiere, erstesTier))
			System.out.println("\"" + erstesTier + "\" ist unter den vorhandenen Tieren.");
		else
			System.out.println("\"" + erstesTier + "\" ist nicht unter den vorhandenen Tieren.");

		if (binaereSuche(tiere, zweitesTier))
			System.out.println("\"" + zweitesTier + "\" ist unter den vorhandenen Tieren.");
		else
			System.out.println("\"" + zweitesTier + "\" ist nicht unter den vorhandenen Tieren.");
	}

	public static boolean binaereSuche(String[] worte, String begriff)
	{
		int start = 0;
		int ende = worte.length - 1;

		while (start <= ende)
		{
			int mitte = (start + ende) / 2;
			int comp = worte[mitte].compareTo(begriff);

			if (comp > 0)
				ende = mitte - 1;
			else if (comp < 0)
				start = mitte + 1;
			else
				return true;
		}
		return false;
	}

}
