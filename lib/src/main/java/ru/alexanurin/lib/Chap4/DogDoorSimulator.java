package ru.alexanurin.lib.Chap4;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        dogDoor.addBark(new Bark("woof"));
        dogDoor.addBark(new Bark("woolf"));
        dogDoor.addBark(new Bark("rawlf"));
        dogDoor.addBark(new Bark("rawooolf"));

        BarkRecognizer barkRecognizer = new BarkRecognizer(dogDoor);
        System.out.println("Fido barks to go outside...");
        barkRecognizer.recognize(new Bark("woof"));
        System.out.println("Fido has gone outside....");
//        remote.pressButton();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        Simulate a hardware hearing a bark not Bruce... a smallDog
        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts Barking");

        barkRecognizer.recognize(smallDogBark);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fido is all done....");
        System.out.println("But he is stuck outside....");
        System.out.println("Fido starts barking.....");

        barkRecognizer.recognize(new Bark("rawlf"));


//        remote.pressButton();
//        System.out.println();
        System.out.println("Fido is back inside...");
//        remote.pressButton();


    }

}
