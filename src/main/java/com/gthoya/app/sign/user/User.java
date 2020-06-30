package com.gthoya.app.sign.user;

import com.gthoya.app.sign.account.sub.Gender;
import com.gthoya.app.sign.service.SignService;
import com.gthoya.app.sign.terms.impl.EventTerms;
import com.gthoya.app.sign.terms.impl.LocationTerms;
import com.gthoya.app.sign.terms.impl.PrivacyTerms;
import com.gthoya.app.sign.terms.impl.UseTerms;

public class User {
    private SignService signService = new SignService();

    public void clickTerms(boolean useTerms, boolean privacyTerms, boolean locationTerms, boolean eventTerms) {
        signService = new SignService();
        signService.clickUseTerms(new UseTerms(useTerms));
        signService.clickPrivacyTerms(new PrivacyTerms(privacyTerms));
        signService.clickLocationTerms(new LocationTerms(locationTerms));
        signService.clickEventTerms(new EventTerms(eventTerms));
    }

    public boolean next() {
        return signService.isValidTerms();
    }

    public boolean signUp(String id, String password1, String password2, String name,
                          String birthday, Gender gender, String phone) {
        return this.signUp(id, password1, password2, name, birthday, gender, null, phone);
    }

    public boolean signUp(String id, String password1, String password2, String name,
                          String birthday, Gender gender, String email, String phone) {
        return signService.signUp(id, password1, password2, name, birthday, gender, email, phone);
    }
}