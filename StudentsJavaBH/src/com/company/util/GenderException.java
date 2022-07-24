package com.company.util;

import com.company.exceptions.WrongGenderExeption;

public class GenderException {
    public static boolean checkGender(String gender) throws WrongGenderExeption {
        if(!gender.contains("retired")){
            return true;
        }else {
            throw new WrongGenderExeption();
        }
    }
}
