
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
				System.out.println("Die lineare Funktion 1 benötigte bei einem Problemumfang von " + n
					+ " eine Dauer von " + eineUhr.getDuration() + " Nanosekunden zur Ausführung.");
			break;
			case 2:
				eineUhr.start();
				eineMessung.func2(n);
				eineUhr.stop();
				System.out.println("Die quadratische Funktion 2 benötigte bei einem Problemumfang von " + n
					+ " eine Dauer von " + eineUhr.getDuration() + " Nanosekunden zur Ausführung.");
			break;
			case 6:
				eineUhr.start();
				eineMessung.func6(n);
				eineUhr.stop();
				System.out.println("Die logarithmische Funktion 6 benötigte bei einem Problemumfang von " + n
					+ " eine Dauer von " + eineUhr.getDuration() + " Nanosekunden zur Ausführung.");
			break;
			default:
				System.err.println("Ungültige Eingabe!");

		}
	}

}
