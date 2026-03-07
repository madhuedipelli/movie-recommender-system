package io.datajek.spring.basics.movie_recommender_system.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ContentBasedFilter  implements Filter {

    private static int instances=0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter(){
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }

    public Movie getMovie(){
        return this.movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
