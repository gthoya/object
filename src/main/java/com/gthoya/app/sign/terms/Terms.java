package com.gthoya.app.sign.terms;

public interface Terms {
    boolean isRequired();
    boolean isChecked();

    default boolean isRequiredCheck() {
        return !this.isRequired() || this.isChecked();
    }
}
