package Implementation;
import Interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="BOAT")
//@Primary
public class BoatSpeakers implements Speakers {
    private String name = "Boat";
    @Override
    public String blow() {return "I am the " + name;}
}
