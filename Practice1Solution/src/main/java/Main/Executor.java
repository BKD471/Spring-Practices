package Main;

import Beans.Person;
import Beans.Vehicle;
import Config.ProjectConfig;
import Services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons=context.getBeanNamesForType(Person.class);
        String[] vehicles=context.getBeanNamesForType(Vehicle.class);
        System.out.println(persons[0]+"------>"+vehicles[0]);
        System.out.println("----------------------------------------------------------------------->");

        var person=context.getBean(Person.class);
        person.getVehicle().getVehicleServices().start();
        person.getVehicle().getVehicleServices().playMusic();


        System.out.println("-----------------> Bean Scopes------------------------------------------->");
        var vs1=context.getBean(VehicleServices.class);
        var vs2=context.getBean(VehicleServices.class);

        System.out.println(vs1.hashCode());
        System.out.println(vs2.hashCode());
    }

}
