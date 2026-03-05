package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		//call method to get recommendations

		ContentBasedFilter cf1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cf2 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cf3 = appContext.getBean(ContentBasedFilter.class);


		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);

		String[] result = recommender.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));
	}
}