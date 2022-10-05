package Implementation;
import Interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component(value="BRIDGESTONE")
public class BridgeStone  implements Tyres {
    private String name="BridgeStone";
    @Override
    public String rotate(){return name+" Tyres totating...";}
}
