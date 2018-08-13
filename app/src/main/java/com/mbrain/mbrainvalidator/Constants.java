package com.mbrain.mbrainvalidator;

/**
 * Created by NumeshDilusha on 8/24/17.
 */

public class Constants {


    public static final String VAL_STRING = "string";
    public static final String VAL_TEXT = "text";
    public static final String VAL_NUMBER = "number";
    public static final String VAL_EMAIL = "email";
    public static final String VAL_REGX = "regx";
    public static final String VAL_MOBILE = "mobile";

    public static final String REGX_NATINOL_ID = "[0-9]{9,9}V|[0-9]{9,9}X|[0-9]{12,12}";
    public static final String REGX_COMPLAIN_NUMBER = "^[0-9-a-zA-Z\\s]{1,40}$";
    public static final String REGX_PASSWORD = "^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$";
    public static final String REGX_CNIC = "^[0-9]{3}[0][0-9]-[0-9]{7}-[0-9]{1}$";
    public static final String REGX_PHONE_NUMBER = "^[1-9][0-9]+$";



}
