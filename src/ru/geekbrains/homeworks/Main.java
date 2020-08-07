package ru.geekbrains.homeworks;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(70);

        Cat cats[] = new Cat[5];
        cats[0] = new Cat("Kitty", 10, false);
        cats[1] = new Cat("Rovena", 15, false);
        cats[2] = new Cat("Maks", 5, false);
        cats[3] = new Cat("Kurapiko", 25, false);
        cats[4] = new Cat("Baks", 25, false);

            while (true){
                System.out.println("Кормим котов");
                for (int i = 0; i < cats.length; i++) {
                    plate.info();
                    System.out.println("Кот ест...");
                    if (plate.getFood() <= cats[i].getAppetite()) {
                        cats[i].eat(plate);
                        System.out.println("Еды мало, кот не наелся");
                        System.out.println("Нужно накормить всех котов. Добавляем еды...");
                        break;
                    }
                    cats[i].eat(plate);
                    System.out.println("Кот " + cats[i].getName() + " наелся: " + fullInfo(plate, cats[i]));
                    plate.info();
                    System.out.println();

                }
                boolean a = check(plate,cats);
                plate.addFood(100);
                plate.info();
                if (a){
                    System.out.println("конец цикла");
                    break;
                }
            }
    }
    public static boolean fullInfo (Plate plate, Cat cat){
        if (plate.getFood()>=0){
            cat.setFull(true);
        }else {
            cat.setFull(false);
        }
        return cat.getFull();
    }
    public static boolean check (Plate plate, Cat cats[]) {

        return plate.getFood()>=cats[cats.length-1].getAppetite();
    }
}
