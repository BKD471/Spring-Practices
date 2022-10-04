package Services;

import Interfaces.Speakers;
import Interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speaker;
    @Autowired
    private Tyres tyre;

    public Tyres getTyre() {
        return tyre;
    }

    public void setTyre(Tyres tyre) {
        this.tyre = tyre;
    }

    public Speakers getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speakers speaker) {
        this.speaker = speaker;
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
