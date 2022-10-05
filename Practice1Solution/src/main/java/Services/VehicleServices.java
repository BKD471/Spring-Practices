package Services;

import Interfaces.Speakers;
import Interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

//    @Autowired
//    @Qualifier("JBL")
//      private  Speakers speaker;
//    @Autowired
//    @Qualifier("BRIDGESTONE")
//      private  Tyres tyre;

    private final Speakers speaker;
    private final Tyres tyre;


    public VehicleServices(@Qualifier("BOAT") Speakers speaker, @Qualifier("MICHELIN") Tyres tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public Tyres getTyre() {
        return tyre;
    }
    public Speakers getSpeaker() {
        return speaker;
    }


    public void start() {
        String move = tyre.rotate();
        System.out.println(move);
    }

    public void playMusic() {
        String mv = speaker.blow();
        System.out.println(mv);
    }
}
