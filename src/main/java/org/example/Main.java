package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {

        /** Создаём экземпляры классов Meat и Apple */
        Meat meat = new Meat(5,100);
        Apple appleRed = new Apple(10,50, RED);
        Apple appleGreen = new Apple(8,60, GREEN);

        /** Объявляем массив из элементов созданных экземпляров */
        Food[] items = {meat, appleRed, appleGreen};

        /** Создаём экземпляр массива */
        ShoppingCart shoppingCart = new ShoppingCart(items);

        /** Выводим результат в консоль */
        System.out.printf("Общая сумму товаров без скидки: %.2f%n", shoppingCart.getTotalPriceWithoutDiscount());
        System.out.printf("Общая сумму товаров со скидкой: %.2f%n", shoppingCart.getTotalPriceWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f%n", shoppingCart.getTotalPriceVegetarian());

    }
}