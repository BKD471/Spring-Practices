package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    private final Tyres tyre;
    private final Speakers speaker;

    @Autowired
    public VehicleService(Tyres tyre,Speakers speaker) {
        this.speaker = speaker;
        this.tyre = tyre;
    }


    public Tyres getTyre() {
        return tyre;
    }

    public Speakers getSpeaker() {
        return speaker;
    }

    @Override
    public String toString() {
        return "VehicleService{" +
                "tyre=" + tyre +
                ", speaker=" + speaker +
                '}';
    }
}
