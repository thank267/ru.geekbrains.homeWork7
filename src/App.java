import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utils.Plate;

public class App {
    public static void main(String[] args) throws Exception {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Уголек", 6));
        cats.add(new Cat("Скай", 11));
        cats.add(new Cat("Барсик", 12));
        cats.add(new Cat("Мурзик", 16));
        cats.add(new Cat("Соня", 3));


        Plate plate = new Plate(100);
        plate.info();
        System.out.println("----------------------------------");

        for (int day = 1; day < 5; day++) {
           
            cats.forEach(cat -> {
                cat.eat(plate);
            });
           
            plate.increaseFood(new Random().nextInt(30));
            System.out.printf("День %s прошел, добавляем корма в тарелку\n",day);
            plate.info();
            System.out.println("----------------------------------");
        }
        

    }
}
