package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.stereotype.Component;

@Component()
//@Qualifier("CBF") will be same along with line @Component
public class ContentBasedFilter  implements Filter {

    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
