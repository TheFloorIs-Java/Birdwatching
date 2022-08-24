import Bird.Bird;
import EndangeredBird.EndangeredBird;

public class BirdApp {
    public static void main(String[] args) {
        /*
        Bird bird1 = new Bird();
        bird1.ageMonths = 2;
        String sound = bird1.sound();
        System.out.println(sound);

         */
        Bird[] birdArray = new Bird[6];
        for(int i = 0; i < birdArray.length; i++){
            birdArray[i] = new Bird();
//            birdArray[i].ageMonths = i;
        }
        birdArray[0].setAge(-2);
        birdArray[1].setAge(6);
        birdArray[2].setAge(3);
        birdArray[3].setAge(1);
        birdArray[4].setAge(7);
        birdArray[5].setAge(9);
        for(int i = 0; i < birdArray.length; i++){
            System.out.println(birdArray[i].sound());
        }
        System.out.println("number of birds: "+ Bird.numberOfBirds);

        EndangeredBird endangeredBird = new EndangeredBird();
        endangeredBird.setAge(5);
        System.out.println("endangeredBirdSound: "+endangeredBird.sound());

        System.out.println(endangeredBird);
        Object obj = new Object();
    }
}
