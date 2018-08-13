# MBrainValidator
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.numesh:MBrainValidator:v0.0.1'
	}
	
```
## isEmpty Validaor
```
MBrainValidateCore.getInstance().isEmpty(editText, new MBrainValidateCallBack() {
            @Override
            public void onTextChangedListener(boolean isValid) {
                if (!isValid) {
                    editText.setError("Cannot be Empty");
                } else {
                    editText.setError(null);
                }
            }

            @Override
            public void onFocusChangeListener(boolean isValid) {
                if (!isValid) {
                    editText.setError("Cannot be Empty");
                } else {
                    editText.setError(null);
                }
            }
        });
```
## e-mail Validaor
```
MBrainValidateCore.getInstance().isValidEmail(editText, new MBrainValidateCallBack() {
            @Override
            public void onTextChangedListener(boolean isValid) {
                if (!isValid) {
                    editText.setError("Cannot be Empty");
                } else {
                    editText.setError(null);
                }
            }

            @Override
            public void onFocusChangeListener(boolean isValid) {
                if (!isValid) {
                    editText.setError("Cannot be Empty");
                } else {
                    editText.setError(null);
                }
            }
        });
```
## Regular Expression Validaor
```
MBrainValidateCore.getInstance().isValidInput(editText,regular_expression new MBrainValidateCallBack() {
            @Override
            public void onTextChangedListener(boolean isValid) {
                if (!isValid) {
                    editText.setError("Cannot be Empty");
                } else {
                    editText.setError(null);
                }
            }

            @Override
            public void onFocusChangeListener(boolean isValid) {
                if (!isValid) {
                    editText.setError("Cannot be Empty");
                } else {
                    editText.setError(null);
                }
            }
        });
```
