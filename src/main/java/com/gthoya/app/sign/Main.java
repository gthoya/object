package com.gthoya.app.sign;

import com.gthoya.app.sign.account.sub.Gender;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();

        user1.clickTerms(true, false, true, true);
        if (!user1.next()) {
            System.out.println("user1-1 필수 동의 체크 안함");
        }

        user1.clickTerms(true, true, true, true);
        if (!user1.next()) {
            System.out.println("user1-2 필수 동의 체크 안함");
        }

        boolean checkUser1 = user1.signUp("id1", "password1", "password2", "name1", "2020-01-01",
                Gender.Male, "id1@naver.com", "010-0000-0000");
        if (!checkUser1) {
            System.out.println("user2-1 가입 실패");
        }

        checkUser1 = user1.signUp("id1", "password", "password", "name1", "2020-01-01",
                Gender.Male, "id1@naver.com", "010-0000-0000");
        if (!checkUser1) {
            System.out.println("user2-2 가입 실패");
        }
    }
}
