package Implementation;
import Interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component(value="JBL")
public class JblSpeakers implements Speakers {
    private String name = "JBL";
    @Override
    public String blow() {return "I am the " + name;}
}
