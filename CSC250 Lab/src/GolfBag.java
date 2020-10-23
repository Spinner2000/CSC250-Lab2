import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class GolfBag extends Object {
	private ArrayList<GolfClub> clubs;
	
	public GolfBag()
	{
		this.clubs = new ArrayList<GolfClub>();
	}
	public GolfBag(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
			while(input.hasNext())
			{
				this.clubs.add(new GolfClub(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}
	
	public void getRightClub(String distance)throws Exception {
		int n=this.clubs.size();
		for (int i = 0; i < n+1; i++){ 
			if(this.clubs.get(i).distance()<=Integer.parseInt(distance)) {
				if(Integer.parseInt(distance)<this.clubs.get(i+1).distance()) {
					System.out.println("Try Using A "+this.clubs.get(i).club());
				}
			}
			
		}
	}

}
