package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    private String name;
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService=vehicleService;
    }

    @PostConstruct
    private void initialize(){
        this.name="Ferrari";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void display(){
        System.out.println("I am legendary car the "+name);
    }

    public VehicleService getVehicleService(){
        return vehicleService;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", vehicleService=" + vehicleService +
                '}';
    }
}
