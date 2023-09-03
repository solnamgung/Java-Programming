package streams;

import java.util.List;

public class StreamDemo {
	
	public static void show() {
		List<Movie> movies = List.of(
				new Movie("app", 10),
				new Movie("lou", 13),
				new Movie("gikkjd", 15)	
	);
		
		//imperative Programming
		int count = 0;
		for(var movie : movies) {
			if(movie.getLikes() > 10) 
				count++;
		}
		
		System.out.print("count >>> " + count);
		
		var likesCount = movies.stream()
						.filter(mov -> mov.getLikes() > 10)
						.count();
		
		System.out.print("likesCount >>> " + likesCount);
						
	}
	
	public static void main(String[] args) {
		StreamDemo strDemo = new StreamDemo();
		strDemo.show();
		
	}
	
}
