package model;

import static model.constants.Discount.DEFAULT;


public abstract class Food implements Discountable{

   protected int amount;                     /** количество продукта в килограммах (целое число) */
   protected double price;                   /** цена за единицу (вещественное число) */
   protected boolean isVegetarian;           /** флаг, который показывает, вегетарианский ли продукт */

   /** Конструктор абстрактного класса с инициализацией основных полей */
    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    /** Геттер флага*/
    public boolean isVegetarian() {
        return isVegetarian;
    }

    /** Переопределение метода getDiscount из интерфейса */
    @Override
    public double getDiscount() {
        return DEFAULT;
    }

    /** Метод возвращающий общую сумму всех товаров */
    public double getTotalPrice() {
        return amount * price;
    }

    /** Метод возвращающий сумму товаров со скидкой*/
    public double getTotalDiscount() {
        double discount = (100 - getDiscount()) / 100;
        return getTotalPrice() * discount;
    }


}
