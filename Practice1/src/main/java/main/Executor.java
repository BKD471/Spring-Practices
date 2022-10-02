package main;

import Beans.Person;
import Beans.Speakers;
import Beans.Tyres;
import Beans.VehicleService;
import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {

    public static  void main(String[] args){
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
//        var sp=context.getBean("Boat",Speakers.class);
//        var ty=context.getBean("BridgeStone",Tyres.class);
//
//        System.out.println(sp.getName());
//        System.out.println(ty.getName());
//
//        var vs=context.getBean(VehicleService.class);
//        System.out.println(vs.getSpeaker());
//        System.out.println(vs.getTyre());

        var p=context.getBean(Person.class);
        System.out.println(p.getVehicle());
        System.out.println(p);

    }
}
