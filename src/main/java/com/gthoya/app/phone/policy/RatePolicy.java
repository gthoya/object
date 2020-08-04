package com.gthoya.app.phone.policy;

import com.gthoya.app.phone.phone.Phone;
import com.gthoya.app.phone.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
