package ru.alexanurin.lib.Chap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private List<Bark> allowedBarks;

    DogDoor(){
        this.open = false;
        this.allowedBarks = new ArrayList<>();
    }

    public boolean isOpen(){
        return open;
    }

    public void open(){
        System.out.println("The dog door opens");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door closes");
        open = false;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void addBark(Bark bark){
        allowedBarks.add(bark);
    }

}
