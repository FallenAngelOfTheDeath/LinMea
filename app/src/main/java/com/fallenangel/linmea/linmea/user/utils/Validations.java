package com.fallenangel.linmea.linmea.user.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by NineB on 8/30/2017.
 */

public class Validations {

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";

    public static boolean validatePassword(String password) {
        return password.length() > 6;
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean passwordComparison (String password1, String password2){
        return  password1 == null ? password2 == null : password1.equals(password2);
    }
}
