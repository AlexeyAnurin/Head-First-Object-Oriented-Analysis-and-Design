package ru.alexanurin.lib.Chap4;

public class Remote {

    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor)
    {
        this.dogDoor = dogDoor;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button...");
        if (dogDoor.isOpen()) {
            dogDoor.close();
        }
        else {
            dogDoor.open();
        }
    }
}
