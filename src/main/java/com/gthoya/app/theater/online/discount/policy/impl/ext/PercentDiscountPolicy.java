package com.gthoya.app.theater.online.discount.policy.impl.ext;

import com.gthoya.app.theater.online.discount.condition.DiscountCondition;
import com.gthoya.app.theater.online.discount.policy.impl.DefaultDiscountPolicy;
import com.gthoya.app.theater.online.money.Money;
import com.gthoya.app.theater.online.reservation.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
