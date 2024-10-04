package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENTAGE = 45.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENTAGE;
    }
}