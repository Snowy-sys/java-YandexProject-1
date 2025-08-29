package model;

public class Meat extends Food {

    /** Конструктор класса со ссылкой на конструктор абстрактного класса Food */
    public Meat(int amount, double price) {
        super(amount, price, false);
    }


}
