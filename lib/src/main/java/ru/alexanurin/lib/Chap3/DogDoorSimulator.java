package ru.alexanurin.lib.Chap3;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        BarkRecognizer barkRecognizer = new BarkRecognizer(dogDoor);
        System.out.println("Fido barks to go outside...");
        barkRecognizer.recognize("woof");
        System.out.println("Fido has gone outside....");
//        remote.pressButton();
        System.out.println("Fido is all done....");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("But he is stuck outside....");
        System.out.println("Fido starts barking.....");
//        System.out.println("....so Gina grabs the remote control");
//        remote.pressButton();
        barkRecognizer.recognize("woof");


//        remote.pressButton();
//        System.out.println();
        System.out.println("Fido is back inside...");
//        remote.pressButton();


    }

}
