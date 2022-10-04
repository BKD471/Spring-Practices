package Implementation;
import Interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoatSpeakers implements Speakers {
    private String name = "Boat";
    @Override
    public String blow() {return "I am the " + name;}
}
