package domaci08152019;

public class PravougaonikMeni {

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik ("Najbolji", 5, 5);
		Pravougaonik p2 = new Pravougaonik ("Vrlo dobar", 4);
		System.out.println(p1.ispisPravougaonika());
		System.out.println();
		
		System.out.print("Duzina stranice a iznosi: ");
		System.out.println(p1.getA());
		System.out.print("Duzina stranice b iznosi: ");
		System.out.println(p1.getB());
		System.out.println("-----------------------------------");
		
		System.out.println(p2.ispisPravougaonika());
		System.out.println();
		
		System.out.print("Duzina stranice a iznosi: ");
		System.out.println(p2.getA());
		System.out.print("Duzina stranice b iznosi: ");
		System.out.println(p2.getB());
	}

}
