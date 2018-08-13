package com.mbrain.mbrainvalidatorlib;

import android.widget.EditText;

/**
 * Created by NumeshDilusha on 5/3/18.
 */

public interface MBrainValidator {

    void isEmpty(EditText editText, MBrainValidateCallBack MBrainValidateCallBack);

    void isValidEmail(EditText editText, MBrainValidateCallBack MBrainValidateCallBack);

    void isValidInput(EditText editText, String regx, MBrainValidateCallBack MBrainValidateCallBack);

}
