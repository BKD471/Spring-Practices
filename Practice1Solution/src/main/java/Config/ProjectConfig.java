package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Beans","Implementation","Services"})
//@ComponentScan(basePackageClasses = {Beans.Vehicle.class,Beans.Person.class})
public class ProjectConfig {
}
