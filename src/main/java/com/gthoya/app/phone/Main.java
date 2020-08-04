package com.gthoya.app.phone;

import com.gthoya.app.phone.call.Call;
import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.phone.Phone;
import com.gthoya.app.phone.policy.ext.NightlyDiscountPolicy;
import com.gthoya.app.phone.policy.ext.RegularPolicy;
import com.gthoya.app.phone.policy.ext.TaxablePolicy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] ar) {
        Call call = new Call(LocalDateTime.of(2020, 8, 3, 22, 0, 0),
                LocalDateTime.of(2020, 8, 3, 22, 1, 0));

        System.out.println(call.getDuration().getSeconds());

        Phone phone1 = new Phone(new RegularPolicy(Money.wons(10), Duration.ofSeconds(10)));
        phone1.setCalls(Arrays.asList(call));
        System.out.println(phone1.calculateFee().getAmount());

        Phone phone2 = new Phone(new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)));
        phone2.setCalls(Arrays.asList(call));
        System.out.println(phone2.calculateFee().getAmount());

        Phone phone3 = new Phone(new TaxablePolicy(0.05, new RegularPolicy(Money.wons(10), Duration.ofSeconds(10))));
        phone3.setCalls(Arrays.asList(call));
        System.out.println(phone3.calculateFee().getAmount());
    }
}
