
public class GolfClub extends Object{
	
	private String club;
	private int distance;
	
	public GolfClub(String club, int distance) {
		this.club=club;
		this.distance=distance;
	}
	
	public GolfClub(String s)
	{
		String[] parts = s.split(",");
		this.club = parts[0];
		this.distance = Integer.parseInt(parts[1]);
	}
	
	public String club() {
		return this.club;
	}
	
	public int distance() {
		return this.distance;
	}

}
