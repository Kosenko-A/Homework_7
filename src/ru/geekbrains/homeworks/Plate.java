package ru.geekbrains.homeworks;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public int getFood(){return food;}
    public void setFood (int food){this.food = food;}

    public void decreaseFood(int n) {
        if(n<=food) {
            food -= n;
        } else{
            food -=0;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
    public int addFood(int n){
        return food+=n;
    }
}
