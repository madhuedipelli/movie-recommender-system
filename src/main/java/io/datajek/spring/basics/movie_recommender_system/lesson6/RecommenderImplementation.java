package io.datajek.spring.basics.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    private Filter filter;
    public String[] recommendMovies(String movie){
        System.out.println("\nName of the filter in use: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
