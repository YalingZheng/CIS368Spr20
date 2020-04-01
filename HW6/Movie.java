import java.util.ArrayList;

/**
 * Datatype for Movies. Each movie has a name and a list of Actors
 *
 */
public class Movie {
	/**
	 * Name of the Movie -- assumed to be unique
	 */
	private String name;
	private ArrayList<String> Actors;
	private double rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getActors() {
		return Actors;
	}

	public void setActors(ArrayList<String> myActors) {
		this.Actors = myActors;
	}

	public Movie(String title) {
		name = title;
		Actors = new ArrayList<String>();
	}

	/**
	 * Add an Actor to our list of cast members
	 * 
	 * @param person Actor that appeared in this Movie
	 */
	public void addActor(String person) {
		Actors.add(person);
	}


	/**
	 * The name of the Movie is assumed to be unique, so it is used as a HashCode
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return name.hashCode();
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
