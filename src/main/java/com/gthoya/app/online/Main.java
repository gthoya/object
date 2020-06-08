package com.gthoya.app.online;

import com.gthoya.app.online.discount.condition.impl.PeriodCondition;
import com.gthoya.app.online.discount.condition.impl.SequenceCondition;
import com.gthoya.app.online.discount.policy.impl.ext.AmountDiscountPolicy;
import com.gthoya.app.online.money.Money;
import com.gthoya.app.online.theater.Movie;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Movie avatar = new Movie("avatar",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))));
    }
}
