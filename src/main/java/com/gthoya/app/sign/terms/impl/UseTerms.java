package com.gthoya.app.sign.terms.impl;

import com.gthoya.app.sign.terms.Terms;

public class UseTerms implements Terms {
    private final boolean check;

    public UseTerms(boolean check) {
        this.check = check;
    }

    @Override
    public boolean isRequired() {
        return true;
    }

    @Override
    public boolean isChecked() {
        return check;
    }
}
