package com.mbrain.mbrainvalidator;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mbrain.mbrainvalidatorlib.MBrainValidateCallBack;
import com.mbrain.mbrainvalidatorlib.MBrainValidateCore;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout txtName = findViewById(R.id.txt_name);
        final TextInputLayout txtEmail = findViewById(R.id.txt_email);
        final TextInputLayout txtId = findViewById(R.id.txt_id);

        MBrainValidateCore.getInstance().isEmpty(txtName.getEditText(), new MBrainValidateCallBack() {
            @Override
            public void onTextChangedListener(boolean isValid) {
                if (!isValid) {
                    txtName.setError("Cannot be Empty");
                } else {
                    txtName.setError(null);
                }
            }

            @Override
            public void onFocusChangeListener(boolean isValid) {
                if (!isValid) {
                    txtName.setError("Cannot be Empty");
                    Util.getInstance().showValidatorPopup(MainActivity.this, "Not a Valid Input", "Not a valid Name").setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Util.getInstance().hidePopup(MainActivity.this);
                        }
                    });
                } else {
                    txtName.setError(null);
                }
            }

        });
        MBrainValidateCore.getInstance().isValidEmail(txtEmail.getEditText(), new MBrainValidateCallBack() {
            @Override
            public void onTextChangedListener(boolean isValid) {
                if (!isValid) {
                    txtEmail.setError("Not a Valid Email");
                } else {
                    txtEmail.setError(null);
                }
            }

            @Override
            public void onFocusChangeListener(boolean isValid) {
                if (!isValid) {
                    txtEmail.setError("Not a Valid Email");
                    Util.getInstance().showValidatorPopup(MainActivity.this, "Not a Valid Input", "Not a valid Name").setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Util.getInstance().hidePopup(MainActivity.this);
                        }
                    });
                } else {
                    txtEmail.setError(null);
                }
            }

        });
        MBrainValidateCore.getInstance().isValidInput(txtId.getEditText(), Constants.REGX_NATINOL_ID, new MBrainValidateCallBack() {
            @Override
            public void onTextChangedListener(boolean isValid) {
                if (!isValid) {
                    txtId.setError("Not a Valid ID");
                } else {
                    txtId.setError(null);
                }
            }

            @Override
            public void onFocusChangeListener(boolean isValid) {
                if (!isValid) {
                    txtId.setError("Not a Valid ID");
                    Util.getInstance().showValidatorPopup(MainActivity.this, "Not a Valid Input", "Not a Valid ID").setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Util.getInstance().hidePopup(MainActivity.this);
                        }
                    });
                } else {
                    txtId.setError(null);
                }
            }

        });


    }


//        txtName.getEditText().addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if (!MBrainValidator.getInstance().isValidInput(txtName.getEditText())) {
//                    txtName.setError("Cannot be Empty");
//                } else {
//                    txtName.setError(null);
//                }
//            }
//        });
//
//        txtName.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (!hasFocus) {
//                    if (!MBrainValidator.getInstance().isValidInput(txtName.getEditText())) {
//                        txtName.setError("Cannot be Empty");
//                        Util.getInstance().showValidatorPopup(MainActivity.this, "Not a Valid Input", "Not a valid Name").setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(MainActivity.this);
//                            }
//                        });
//                    } else {
//                        txtName.setError(null);
//                    }
//
//
//                }
//            }
//        });
//        txtEmail.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (!hasFocus) {
//                    if (!MBrainValidator.getInstance().isValidEmail(txtEmail.getEditText())) {
//                        txtEmail.setError("Not a Valid Email");
//                        Util.getInstance().showValidatorPopup(MainActivity.this, "Not a Valid Input", "Not a Valid Email").setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(MainActivity.this);
//                            }
//                        });
//                    } else {
//                        txtEmail.setError(null);
//                    }
//                }
//            }
//        });
//        txtId.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (!hasFocus) {
//                    if (!MBrainValidator.getInstance().isValidInput(txtId.getEditText(), Constants.REGX_NATINOL_ID)) {
//                        txtId.setError("Not a Valid ID");
//                        Util.getInstance().showValidatorPopup(MainActivity.this, "Not a Valid Input", "Not a Valid ID").setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(MainActivity.this);
//                            }
//                        });
//                    } else {
//                        txtId.setError(null);
//                    }
//                }
//            }
//        });
//
//        txtEmail.getEditText().addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//
//                if (!MBrainValidator.getInstance().isValidEmail(txtEmail.getEditText())) {
//                    txtEmail.setError("Not a Valid Email");
//                } else {
//                    txtEmail.setError(null);
//                }
//            }
//        });
//
//        txtId.getEditText().addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//
//                if (!MBrainValidator.getInstance().isValidInput(txtId.getEditText(), Constants.REGX_NATINOL_ID)) {
//                    txtId.setError("Not a Valid ID");
//                } else {
//                    txtId.setError(null);
//                }
//            }
//        });

//}


}
