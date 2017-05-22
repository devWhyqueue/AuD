public class BaumTraversieren
{
	private Baum einBaum;

	public BaumTraversieren(Baum einBaum) {
		this.einBaum = einBaum;
	}

	// Pre-Order
	public String traversierePreOrder()
	{
		return (einBaum.getWurzel() != null) ? traversierePreOrder(einBaum.getWurzel()) : "Der Baum ist leer.";
	}

	private String traversierePreOrder(Knoten einKnoten)
	{
		// Diese Methode wird im Praktikum implementiert
		// TODO
		String traversiert = "";
		
		traversiert += einKnoten.getDaten() + " ";

		if (einKnoten.getKnotenLinks() != null)
			traversiert += traversierePreOrder(einKnoten.getKnotenLinks());
		
		if (einKnoten.getKnotenRechts() != null)
			traversiert += traversierePreOrder(einKnoten.getKnotenRechts());

		return traversiert;
	}

	// In-Order
	public String traversiereInOrder()
	{
		return (einBaum.getWurzel() != null) ? traversiereInOrder(einBaum.getWurzel()) : "Der Baum ist leer.";
	}

	private String traversiereInOrder(Knoten einKnoten)
	{
		// Diese Methode wird im Praktikum implementiert
		// TODO
		
		String traversiert = "";

		if (einKnoten.getKnotenLinks() != null)
			traversiert += traversiereInOrder(einKnoten.getKnotenLinks());

		traversiert += einKnoten.getDaten() + " ";

		if (einKnoten.getKnotenRechts() != null)
			traversiert += traversiereInOrder(einKnoten.getKnotenRechts());

		return traversiert;
	}

	// Post-Order
	public String traversierePostOrder()
	{
		return (einBaum.getWurzel() != null) ? traversierePostOrder(einBaum.getWurzel()) : "Der Baum ist leer.";
	}

	private String traversierePostOrder(Knoten einKnoten)
	{
		// Diese Methode wird im Praktikum implementiert
		// TODO
		String traversiert = "";

		if (einKnoten.getKnotenLinks() != null)
			traversiert += traversierePostOrder(einKnoten.getKnotenLinks());
		
		if (einKnoten.getKnotenRechts() != null)
			traversiert += traversierePostOrder(einKnoten.getKnotenRechts());
		
		traversiert += einKnoten.getDaten() + " ";

		return traversiert;
	}
}