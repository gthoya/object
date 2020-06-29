package com.gthoya.app.sign.terms.impl;

import com.gthoya.app.sign.terms.Terms;

public class EventTerms implements Terms {
    private final boolean check;

    public EventTerms(boolean check) {
        this.check = check;
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public boolean isChecked() {
        return check;
    }
}
