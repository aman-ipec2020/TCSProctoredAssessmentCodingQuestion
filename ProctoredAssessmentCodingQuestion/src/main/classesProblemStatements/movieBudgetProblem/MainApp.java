package main.classesProblemStatements.movieBudgetProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

private static List<Movie> movieList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("aaa","Arka","Action",250000000);
			movieList.add(movie1);
		Movie movie2 = new Movie("bbb","GeethaArts","Comedy",25000000);
			movieList.add(movie2);
		Movie movie3 = new Movie("ccc","Marvel","Art",2000000);
			movieList.add(movie3);
		Movie movie4 = new Movie("ddd","Mythri","Action",300000000);
			movieList.add(movie4);
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Genre : ");
			String str = sc.nextLine();
			
			getMovieByGenre(str);
	}
	
	public static void getMovieByGenre(String genre)	{
		
		for(Movie obj : movieList)	{
			if(genre.equalsIgnoreCase(obj.getGenre()))
					if(obj.getBudget()<80000000)
						System.out.println("High Budget Movie");
					else
						System.out.println("Low Budget Movie");
		}
	}

}
