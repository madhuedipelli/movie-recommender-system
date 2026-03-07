package io.datajek.spring.basics.movie_recommender_system.lesson9;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    //logic of collaborative filter
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}

