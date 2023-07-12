import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.println(explorer.calculateSurfaceArea(scan.nextDouble()));

	}

}
