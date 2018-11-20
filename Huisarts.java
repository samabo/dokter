package huisarts;

public class Huisarts {
	public static void main(String[] args) {
		Patiënt p1 = new Patiënt();
		p1.naam = "Marie";

		Patiënt p2 = new Patiënt();
		p2.naam = "Henk";
		p2.ziekte.echtZiek = true;

		Huisarts h = new Huisarts();
		h.spreekuur(p1);
		h.spreekuur(p2);

	}

	Recept spreekuur(Patiënt p) {
		if (p.ziekte.echtZiek == true) {
			System.out.println("\n" + p.naam + ", die schimmelinfectie gaat inderdaad niet vanzelf weg.");
			return new Recept(false);

		} else {
			System.out.println("\nDat was een heel verhaal " + p.naam
					+ ". Kijk het maar een weekje aan.");
			return new Recept(true);
		}
	}
}