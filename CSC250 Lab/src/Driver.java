import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class Driver {
	public static void main(String[] args) throws Exception {
		// Ask for input
		Scanner search=new Scanner(System.in);
		System.out.println("What Distance Are You Trying To Hit?:");
		String distance=search.nextLine();
		//System.out.println(distance);
		GolfBag clubs=new GolfBag("clubsList.dat");
		
		clubs.getRightClub(distance);
	}
}
