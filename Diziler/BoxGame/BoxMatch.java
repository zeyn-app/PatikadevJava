package Class;

public class BoxMatch {

	public static void main(String[] args) {

		int marcDodge = (int) (Math.random() * 100 + 1);
		int marcAlex = (int) (Math.random() * 100 + 1);

		//System.out.println("marcDodge: " + marcDodge + "marcAlex: " + marcAlex);

		Fighter marc = new Fighter("Marc", 15, 100, 90, marcDodge);
		Fighter alex = new Fighter("Alex", 10, 95, 100, marcAlex);
		Ring r = new Ring(marc, alex, 90, 100);
		r.run();
	}
}