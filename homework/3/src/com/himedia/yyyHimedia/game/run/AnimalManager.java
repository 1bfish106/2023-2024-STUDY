package com.himedia.yyyHimedia.game.run;

import com.himedia.yyyHimedia.game.model.*;

import java.util.Random;

public class AnimalManager {

    public Animal randomAnimal() {
        Animal a2 = null;
        Random random = new Random();
        int randomIndex = random.nextInt(4);
        switch (randomIndex){
            case 0 :
                return new Alien();
            case 1 :
                return new Dragon();
            case 2 :
                return new Unicorn();
            case 3 :
                return new Uparupa();



        }return a2;
    }
}
