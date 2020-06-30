package com.gthoya.app.sign.terms.impl;

import com.gthoya.app.sign.terms.Terms;

public class LocationTerms implements Terms {
    private final boolean required = false;
    private final boolean check;

    public LocationTerms(boolean check) {
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
