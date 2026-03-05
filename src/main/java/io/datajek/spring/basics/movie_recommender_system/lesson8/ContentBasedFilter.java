package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

//@Scope("prototype") -- other way to change bean scope

//@Qualifier("CBF") will be same along with line @Component
public class ContentBasedFilter  implements Filter {

    public String[] getRecommendations(String movie){
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
