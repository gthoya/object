package com.gthoya.app.sign;

import com.gthoya.app.sign.account.sub.Gender;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();

        user1.clickTerms(true, false, true, true);
        if (!user1.next()) {
            System.out.println("1. user 필수 동의 체크 안함");
        } else {
            System.out.println("1. user 필수 동의 체크");
        }

        user1.clickTerms(true, true, true, false);
        if (!user1.next()) {
            System.out.println("2. user 필수 동의 체크 안함");
        } else {
            System.out.println("2. user 필수 동의 체크");
        }

        boolean checkUser1 = user1.signUp("id1", "password1", "password2", "name1", "2020-01-01",
                Gender.Male, "id1@naver.com", "010-0000-0000");
        if (!checkUser1) {
            System.out.println("3. user 가입 실패");
        } else {
            System.out.println("3. user 가입 성공");
        }

        checkUser1 = user1.signUp("id1", "password", "password", "name1", "2020-01-01",
                Gender.Male, "id1@naver.com", "010-0000-0000");
        if (!checkUser1) {
            System.out.println("4. user 가입 실패");
        } else {
            System.out.println("4. user 가입 성공");
        }
    }
}
