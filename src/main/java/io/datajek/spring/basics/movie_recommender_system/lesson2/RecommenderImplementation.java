package io.datajek.spring.basics.movie_recommender_system.lesson2;

import io.datajek.spring.basics.movie_recommender_system.lesson1.ContentBasedFilter;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }
    public String[] recommendMovies(String movie){
        return filter.getRecommendations(movie);
    }
}
