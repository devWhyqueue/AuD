
public class Main
{

	public static void main(String[] args)
	{
		executeFunction(6, 1000);
		executeFunction(1, 1000);
		executeFunction(2, 1000);
		System.out.println();
		executeFunction(6, 50000);
		executeFunction(1, 50000);
		executeFunction(2, 50000);
		System.out.println();
		executeFunction(6, 100000);
		executeFunction(1, 100000);
		executeFunction(2, 100000);
	}

	private static void executeFunction(int func, int n)
	{
		Zeitmessung eineMessung = new Zeitmessung();
		StopUhr eineUhr = new StopUhr();

		switch (func)
		{
			case 1:
				eineUhr.start();
				eineMessung.func1(n);
				eineUhr.stop();
				System.out.println("Die lineare Funktion 1 ben�tigte bei einem Problemumfang von " + n
					+ " eine Dauer von " + eineUhr.getDuration() + " Nanosekunden zur Ausf�hrung.");
			break;
			case 2:
				eineUhr.start();
				eineMessung.func2(n);
				eineUhr.stop();
				System.out.println("Die quadratische Funktion 2 ben�tigte bei einem Problemumfang von " + n
					+ " eine Dauer von " + eineUhr.getDuration() + " Nanosekunden zur Ausf�hrung.");
			break;
			case 6:
				eineUhr.start();
				eineMessung.func6(n);
				eineUhr.stop();
				System.out.println("Die logarithmische Funktion 6 ben�tigte bei einem Problemumfang von " + n
					+ " eine Dauer von " + eineUhr.getDuration() + " Nanosekunden zur Ausf�hrung.");
			break;
			default:
				System.err.println("Ung�ltige Eingabe!");

		}
	}

}
