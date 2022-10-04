package Implementation;
import Interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    private String name="Michelin";
    @Override
    public String rotate(){ return name+" Tyres rotating..."; }
}
