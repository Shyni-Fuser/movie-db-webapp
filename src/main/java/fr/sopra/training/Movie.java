package fr.sopra.training;
import java.util.Date;
import java.util.List;

public class Movie {
	
	String id, name;
	java.util.Date releaseDate; 
	Studio studio;
	Realisator realisator;
	List<Actor> actors;
	public Movie(String id, String name, Date releaseDate, Studio studio, Realisator realisator, List<Actor> actors) {
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.studio = studio;
		this.realisator = realisator;
		this.actors = actors;
	}
	
}
