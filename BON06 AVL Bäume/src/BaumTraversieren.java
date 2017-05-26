import java.util.*;

public class BaumTraversieren
{
	private AVLBaum einBaum;

	public BaumTraversieren(AVLBaum einBaum)
	{
		this.einBaum = einBaum;
	}

	// Pre-Order
	public String traversierePreOrder()
	{
		if (einBaum.getWurzel() == null)
			return "Der Baum ist leer.";

		String travBaum = "";
		Deque<AVLKnoten<String>> notVisited = new LinkedList<AVLKnoten<String>>();
		notVisited.push(einBaum.getWurzel());

		AVLKnoten<String> aktKnoten = notVisited.peek();

		while (!notVisited.isEmpty())
		{
			aktKnoten = notVisited.pop();

			travBaum += aktKnoten.toString() + " ";

			if (aktKnoten.getKnotenRechts() != null)
				notVisited.push(aktKnoten.getKnotenRechts());
			if (aktKnoten.getKnotenLinks() != null)
				notVisited.push(aktKnoten.getKnotenLinks());
		}
		return travBaum;
	}
}