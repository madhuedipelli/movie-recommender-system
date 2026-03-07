package io.datajek.spring.basics.movie_recommender_system.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation_setter_injection {
    private Filter filter;

    @Autowired
    @Qualifier("collaborativeFilter")
    public void setFilter(Filter filter){
        this.filter = filter;
    }


    public String[] recommendMovies(String movie){
        System.out.println("\nName of the filter in use: " + filter + "\n");
        return filter.getRecommendations(movie);
    }
}
