package service;

import model.Food;

public class ShoppingCart {

    /** Объявление пустого массива*/
    private final Food[] items;

    /** Конструктор класса с аргументом массива*/
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    /** Получить общую сумму товаров в корзине без скидки */
    public double getTotalPriceWithoutDiscount() {

        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i].getTotalPrice();
        }
        return sum;
    }

    /** Получить общую сумму товаров в корзине со скидкой */
    public double getTotalPriceWithDiscount() {

        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i].getTotalDiscount();
        }
        return sum;
    }

    /** Получить общую сумму всех вегетарианских продуктов в корзине без скидки */
    public double getTotalPriceVegetarian() {
        double sum = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].isVegetarian()) {
                    sum += items[i].getTotalPrice();
                }
            }
            return sum;
    }

}
