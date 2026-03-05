package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    //logic of collaborative filter
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}

