package com.gthoya.app.sign.terms;

public class Terms {
    private final boolean required;
    private final boolean checked;

    public Terms(boolean required, boolean checked) {
        this.required = required;
        this.checked = checked;
    }

    public boolean isRequiredCheck() {
        return !this.required || this.checked;
    }
}
