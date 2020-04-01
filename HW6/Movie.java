import java.util.ArrayList;

/**
 * Datatype for Movies. Each movie has a name and a list of
 * Actors
 *
 */
public class Movie {
	/**
	 * Name of the Movie -- assumed to be unique
	 */
	public String name;
	private ArrayList<Actor> myActors;
		
	public Movie(String title)
	{
		name = title;
		myActors = new ArrayList<Actor>();
	}
	/**
	 * Add an Actor to our list of cast members
	 * @param person Actor that appeared in this Movie
	 */
	public void addActor(Actor person) {
		myActors.add(person);
	}

	/**
	 * Return an iterator over all Actors in this Movie
	 * @return an iterator over all Actors in this Movie
	 */
	public Iterable<Actor> getActors()
	{
		return myActors;
	}
	/**
	 * The name of the Movie is assumed to be unique, so it
	 * is used as a HashCode
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return name.hashCode();
	}
}
