package com.gthoya.app.sign.terms.impl;

import com.gthoya.app.sign.terms.Terms;

public class PrivacyTerms implements Terms {
    private final boolean check;

    public PrivacyTerms(boolean check) {
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
