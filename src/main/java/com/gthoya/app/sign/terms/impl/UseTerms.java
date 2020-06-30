package com.gthoya.app.sign.terms.impl;

import com.gthoya.app.sign.terms.Terms;

public class UseTerms implements Terms {
    private final boolean required = true;
    private final boolean check;

    public UseTerms(boolean check) {
        this.check = check;
    }

    @Override
    public boolean isRequired() {
        return this.required;
    }

    @Override
    public boolean isChecked() {
        return this.check;
    }
}
