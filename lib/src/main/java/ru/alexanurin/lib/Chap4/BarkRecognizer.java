package ru.alexanurin.lib.Chap4;

import java.util.List;

public class BarkRecognizer {


    private DogDoor dogDoor;

    BarkRecognizer(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark barkObj){
        System.out.println(" BarkRecgonizer heard a :" + barkObj.getSound());

        List<Bark> allowedbarks = dogDoor.getAllowedBarks();

        for (Bark allowedBark: allowedbarks){
            if (allowedBark.equals(barkObj)) {
                dogDoor.open();
                return;
            }
        }

        System.out.println("This dog is not allowed");
    }
}
