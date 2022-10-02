package Config;

import Beans.Person;
import Beans.Speakers;
import Beans.Tyres;
import Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="Beans")
public class ProjectConfig {

    @Bean
    @Primary
    Tyres Michelin(){
        var michelin=new Tyres();
        michelin.setName("Michelin Tyres");
        return michelin;
    }

    @Bean
    Tyres BridgeStone(){
        var bridgeStone=new Tyres();
        bridgeStone.setName("BridgeStone");
        return bridgeStone;
    }

    @Bean
    @Primary
    Speakers Jbl(){
        var jbl=new Speakers();
        jbl.setName("Jbl Speakers");
        return jbl;
    }

    @Bean
    Speakers Boat(){
        var boat=new Speakers();
        boat.setName("Boat Speakers");
        return boat;
    }


}
