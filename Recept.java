package huisarts;

public class Recept {
	boolean placebo;
	String naam;

	Recept(boolean placebo) {

		if (placebo) {
			naam = "paracetamol";
			placebo = true;
			System.out.println(
					"Hier is je recept voor " + naam + ". Het komt vast wel goed, en anders trek je maar aan de bel.");
		} else {
			naam = "een kuurtje zware tabletten";
			System.out.println("Hier is je recept voor " + naam
					+ ". Lees de bijsluiter goed door, en als je nog vragen hebt, kun je die aan de apotheker stellen.");
		}
	}
}
