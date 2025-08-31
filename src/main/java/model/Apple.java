package model;

import model.constants.Colour;

import java.util.Objects;

import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {

    /** Дополнительное поле цвета яблок */
    private final String colour;

    /** Конструктор класса со ссылкой на конструктор абстрактного класса Food */
    public Apple(int amount, double price, String colour) {
        super(amount,price,true);
        this.colour = colour;
    }

    /** Переопределение метода getDiscount. Условие с Objects прописал по совету наставника*/
    @Override
    public double getDiscount() {
        return Objects.equals(Colour.RED, colour)
            ? DISCOUNT
            : super.getDiscount();
    }

}
