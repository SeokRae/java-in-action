package kr.seok.chapter11.biling.step04;

import kr.seok.chapter10.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableRegularPhone
        extends RateDiscountableRegularPhone {
    private double taxRate;

    public RateDiscountableAndTaxableRegularPhone(Money amount, Duration seconds, Money discountAmount, double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
