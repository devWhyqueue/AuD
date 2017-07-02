
public class BinarySearch
{

	public static void main(String[] args)
	{
		String[] tiere = { "Affe", "Antilope", "Esel", "Krokodil", "Pinguin", "Schaf" };
		String erstesTier = "Pinguin";
		String zweitesTier = "Kuh";

		if (binaereSuche(tiere, erstesTier))
			System.out.println("\"" + erstesTier + "\" ist ist unter den vorhandenen Tieren.");
		else
			System.out.println("\"" + erstesTier + "\" ist ist nicht unter den vorhandenen Tieren.");

		if (binaereSuche(tiere, zweitesTier))
			System.out.println("\"" + zweitesTier + "\" ist ist unter den vorhandenen Tieren.");
		else
			System.out.println("\"" + zweitesTier + "\" ist ist nicht unter den vorhandenen Tieren.");
	}

	public static boolean binaereSuche(String[] worte, String begriff)
	{
		int start = 0;
		int ende = worte.length - 1;

		while (start <= ende)
		{
			int mitte = (start + ende) / 2;

			if (worte[mitte].compareTo(begriff) > 0)
				ende = mitte - 1;
			else if (worte[mitte].compareTo(begriff) < 0)
				start = mitte + 1;
			else
				return true;
		}
		return false;
	}

}
