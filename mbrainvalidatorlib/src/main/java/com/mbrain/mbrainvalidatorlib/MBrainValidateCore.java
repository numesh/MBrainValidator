package com.mbrain.mbrainvalidatorlib;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import org.apache.commons.validator.routines.EmailValidator;

public class MBrainValidateCore implements MBrainValidator {
    private static MBrainValidateCore mBrainValidator;

    public static MBrainValidateCore getInstance() {
        if (mBrainValidator == null) {
            mBrainValidator = new MBrainValidateCore();

        }
        return mBrainValidator;
    }

    private boolean isValidInput(EditText editText) {
        boolean isValid = true;

        if (!(editText != null & editText.getText().toString() != null & !editText.getText().toString().isEmpty())) {
            isValid = false;
        }

        return isValid;
    }

    private boolean isValidEmail(EditText editText) {
        boolean isValid = true;

        if (!(editText != null & editText.getText().toString() != null & !editText.getText().toString().isEmpty())) {
            isValid = false;
        } else if (!EmailValidator.getInstance().isValid(editText.getText().toString())) {
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    private boolean isValidInput(EditText editText, String regX) {
        boolean isValid = true;

        if (!(editText != null & editText.getText().toString() != null & !editText.getText().toString().isEmpty())) {
            isValid = false;
        } else if (!editText.getText().toString().toUpperCase().matches(regX)) {
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }


    private boolean isValidateInput(final Activity activity, EditText editText, String fieldsName, int min, int max, String errorMsg) {
        boolean isValid = true;

        if (editText != null & editText.getText().toString() != null & !editText.getText().toString().isEmpty()) {

            if ((editText.getText().length()) >= min && editText.getText().length() <= max) {
//                if (fieldsName.equals("CNIC Number")) {
//
//                }
            } else {

                isValid = false;


                isValid = false;
            }


        } else {

            isValid = false;

        }

        return isValid;
    }

//    private boolean isValidateList(final Activity activity, List<String> list, String errorMsg) {
//        boolean isValid = true;
//
//
//        if (list != null & list.size() > 0) {
//
//
//        } else {
//            Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", errorMsg).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Util.getInstance().hidePopup(activity);
//                }
//            });
//            isValid = false;
//
//        }
//
//        return isValid;
//    }
//
//    private boolean isValidateMultipleInput(final Activity activity, List<ValidateModel> validateModelList) {
//        boolean isValid = true;
//
//        for (ValidateModel validateModel : validateModelList) {
//
//            System.out.println("asmndkanskjdnakjsn 1 : " + validateModel.fieldsName);
//            System.out.println("asmndkanskjdnakjsn 1 : " + validateModel.type);
//            if (validateModel.getEditText() != null & validateModel.getEditText().getText().toString() != null & !validateModel.getEditText().getText().toString().isEmpty()) {
//
//                if (validateModel.getType().equals(Constants.VAL_EMAIL)) {
//                    EmailValidator ev = EmailValidator.getInstance();
//                    if (!ev.isValid(validateModel.getEditText().getText().toString())) {
//                        Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", "Not a valid Email Address").setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(activity);
//                            }
//                        });
//                        isValid = false;
//                        break;
//                    } else if ((validateModel.getEditText().getText().length()) >= validateModel.getMin() && validateModel.getEditText().getText().length() <= validateModel.getMax()) {
//                        Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", validateModel.errorMsg).setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(activity);
//                            }
//                        });
//                        isValid = false;
//                        break;
//                    }
//                } else if (validateModel.getType().equals(Constants.VAL_REGX)) {
//
//                    if ((validateModel.getEditText().getText().length()) >= validateModel.getMin() && validateModel.getEditText().getText().length() <= validateModel.getMax()) {
//
//                    } else {
//
//
////                SpannableString str = new SpannableString(editText.getText());
////                str.setSpan(new BackgroundColorSpan(Color.YELLOW), 0, editText.getText().length(), 0);
////                editText.setText(str);
//
//                        Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", validateModel.getErrorMsgLength()).setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(activity);
//                            }
//                        });
//                        isValid = false;
//                        break;
//
//                    }
//
//                    if (validateModel.getEditText().getText().toString().matches(validateModel.getRegx())) {
//                        System.out.println("asdjlajsdlkalj 1");
//                    } else {
//                        System.out.println("asdjlajsdlkalj 2");
//
////                SpannableString str = new SpannableString(editText.getText());
////                str.setSpan(new BackgroundColorSpan(Color.YELLOW), 0, editText.getText().length(), 0);
////                editText.setText(str);
//
//                        Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", validateModel.getErrorMsg()).setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(activity);
//                            }
//                        });
//                        isValid = false;
//                        break;
//
//                    }
//
//                } else {
//
//                    if ((validateModel.getEditText().getText().length()) >= validateModel.getMin() && validateModel.getEditText().getText().length() <= validateModel.getMax()) {
//
//                    } else {
//
//
////                SpannableString str = new SpannableString(editText.getText());
////                str.setSpan(new BackgroundColorSpan(Color.YELLOW), 0, editText.getText().length(), 0);
////                editText.setText(str);
//
//                        Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", validateModel.getErrorMsg()).setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Util.getInstance().hidePopup(activity);
//                            }
//                        });
//                        isValid = false;
//                        break;
//
//                    }
//                }
//
//            } else {
////            SpannableString str = new SpannableString("");
////            str.setSpan(new BackgroundColorSpan(Color.YELLOW), 0, 0, 0);
////            editText.setText(str);
//
////                if (validateModel.getType().equals(Constants.VAL_EMAIL)) {
////                    Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", "E-mail can not be Empty").setOnClickListener(new View.OnClickListener() {
////                        @Override
////                        public void onClick(View view) {
////                            Util.getInstance().hidePopup(activity);
////                        }
////                    });
////                } else {
//                Util.getInstance().showValidatorPopup(activity, "Not a Valid Input", validateModel.getFieldsName() + " can not be Empty").setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                        Util.getInstance().hidePopup(activity);
//                    }
//                });
////                }
//                isValid = false;
//                break;
//            }
//        }
//
//        return isValid;
//    }

    @Override
    public void isEmpty(final EditText editText, final MBrainValidateCallBack mBrainValidateCallBack) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!isValidInput(editText)) {
                    mBrainValidateCallBack.onTextChangedListener(false);
                } else {
                    mBrainValidateCallBack.onTextChangedListener(true);
                }
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (!isValidInput(editText)) {
                        mBrainValidateCallBack.onFocusChangeListener(false);
                    } else {
                        mBrainValidateCallBack.onFocusChangeListener(true);
                    }


                }
            }
        });
    }

    @Override
    public void isValidEmail(final EditText editText, final MBrainValidateCallBack mBrainValidateCallBack) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!isValidEmail(editText)) {
                    mBrainValidateCallBack.onTextChangedListener(false);
                } else {
                    mBrainValidateCallBack.onTextChangedListener(true);
                }
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (!isValidEmail(editText)) {
                        mBrainValidateCallBack.onFocusChangeListener(false);
                    } else {
                        mBrainValidateCallBack.onFocusChangeListener(true);
                    }


                }
            }
        });

    }

    @Override
    public void isValidInput(final EditText editText, final String regx, final MBrainValidateCallBack mBrainValidateCallBack) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!isValidInput(editText, regx)) {
                    mBrainValidateCallBack.onTextChangedListener(false);
                } else {
                    mBrainValidateCallBack.onTextChangedListener(true);
                }
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (!isValidInput(editText, regx)) {
                        mBrainValidateCallBack.onFocusChangeListener(false);
                    } else {
                        mBrainValidateCallBack.onFocusChangeListener(true);
                    }


                }
            }
        });
    }


    private static class ValidateModel {
        private EditText editText;
        private String type;
        private String fieldsName;
        private int min;
        private int max;
        private String errorMsg;
        private String regx;
        private String errorMsgLength;


        public ValidateModel(EditText editText, String type, String fieldsName, int min, int max, String errorMsg) {
            this.editText = editText;
            this.type = type;
            this.fieldsName = fieldsName;
            this.min = min;
            this.max = max;
            this.errorMsg = errorMsg;
        }

        public ValidateModel(EditText editText, String type, String fieldsName) {
            this.editText = editText;
            this.fieldsName = fieldsName;
            this.type = type;
        }

        public ValidateModel(EditText editText, String type, String fieldsName, String regx, String errorMsg, String errorMsgLength) {
            this.editText = editText;
            this.type = type;
            this.fieldsName = fieldsName;
            this.regx = regx;
            this.errorMsg = errorMsg;
            this.errorMsgLength = errorMsgLength;
        }

        public ValidateModel(EditText editText, String type, String fieldsName, String regx, int min, int max, String errorMsg, String errorMsgLength) {
            this.editText = editText;
            this.type = type;
            this.fieldsName = fieldsName;
            this.regx = regx;
            this.min = min;
            this.max = max;
            this.errorMsg = errorMsg;
            this.errorMsgLength = errorMsgLength;
        }

        public ValidateModel() {
        }

        public String getErrorMsgLength() {
            return errorMsgLength;
        }

        public void setErrorMsgLength(String errorMsgLength) {
            this.errorMsgLength = errorMsgLength;
        }

        public String getRegx() {
            return regx;
        }

        public void setRegx(String regx) {
            this.regx = regx;
        }

        public String getFieldsName() {
            return fieldsName;
        }

        public void setFieldsName(String fieldsName) {
            this.fieldsName = fieldsName;
        }

        public EditText getEditText() {
            return editText;
        }

        public void setEditText(EditText editText) {
            this.editText = editText;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
