package main.classesProblemStatements.movieBudgetProblem;

public class Movie {

	private String movieName;
	private String company;
	private String genre;
	private int budget;
	
	public Movie() {
		
	}

	public Movie(String movieName, String company, String genre, int budget) {
		super();
		this.movieName = movieName;
		this.company = company;
		this.genre = genre;
		this.budget = budget;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", company=" + company + ", genre=" + genre + ", budget=" + budget
				+ "]";
	}
}