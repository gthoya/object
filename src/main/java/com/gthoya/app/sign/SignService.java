package com.gthoya.app.sign;

import com.gthoya.app.sign.account.Account;
import com.gthoya.app.sign.account.AccountInfo;
import com.gthoya.app.sign.account.sub.*;
import com.gthoya.app.sign.terms.Terms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SignService {
    private final List<Terms> terms;

    public SignService() {
        this.terms = new ArrayList<>();
    }

    public void clickUseTerms(Terms useTerms) {
        terms.add(useTerms);
    }

    public void clickPrivacyTerms(Terms privacyTerms) {
        terms.add(privacyTerms);
    }

    public void clickLocationTerms(Terms locationTerms) {
        terms.add(locationTerms);
    }

    public void clickEventTerms(Terms eventTerms) {
        terms.add(eventTerms);
    }

    public boolean isValidTerms() {
        for (Terms terms : terms) {
            if (terms.isRequired() && !terms.isChecked()) {
                return false;
            }
        }

        return true;
    }

    public boolean signUp(String id, String password1, String password2, String name,
                          String birthday, Gender gender, String email, String phone) {
        Password password = new Password(password1);
        if (!password.isEqualPassword(password2)) {
            return false;
        }

        Account account = new Account(new ID(id), password);
        if (!account.isValidAccount()) {
            return false;
        }

        AccountInfo accountInfo = new AccountInfo(account, name, LocalDate.parse(birthday),
                gender, new Email(email), new Phone(phone));
        if (!accountInfo.isValidAccountInfo()) {
            return false;
        }

        return true;
    }
}
