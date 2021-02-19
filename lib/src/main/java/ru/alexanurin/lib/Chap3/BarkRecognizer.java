package ru.alexanurin.lib.Chap3;

public class BarkRecognizer {

    private DogDoor dogDoor;

    BarkRecognizer(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void recognize(String bark){
        System.out.println(" BarkRecgonizer heard a :" + bark);

        if (bark.equals("woof")){
            dogDoor.open();
        }

    }
}
