package EndangeredBird;

import Bird.Bird;

public class EndangeredBird extends Bird {
    public void setColor(String newColor){
        color = newColor;
    }
    public String sound(){
        return "ChirpChirp";
    }
    /*
    public void setNumberOfEggs(String newNum){
        numberOfEggs = Integer.parseInt(newNum);
    }
    */
    public String toString(){
        return "endangered bird age: "+getAge() + " color: "+color;
    }
}
