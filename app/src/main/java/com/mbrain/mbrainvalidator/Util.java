package com.mbrain.mbrainvalidator;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;


public class Util {
    private static Util util;
    private static AlertDialog dialog;

    public void hideSoftKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(
                activity.getCurrentFocus().getWindowToken(), 0);

    }


    public static Util getInstance() {

        if (util == null) {
            util = new Util();
        }
        return util;
    }

    public boolean isShowing(Activity activity) {
        boolean isShowing = false;
        if (dialog != null) {
            if (!activity.isFinishing()) {
                if (dialog.isShowing()) {
                    isShowing = true;
                }
            }
        }
        return isShowing;
    }

    public Button showErrorPopup(Activity activity, String title, String msg) {
        Button okButton = null;
        try {
            if (!activity.isFinishing()) {
                LayoutInflater inflater = activity.getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.popup_notification_alert, null);
                okButton = dialoglayout.findViewById(R.id.btn_close);
                TextView txtTitle = dialoglayout.findViewById(R.id.txt_title);
                TextView txtMsg = dialoglayout.findViewById(R.id.txt_msg);
                txtTitle.setText(title);
                txtMsg.setText(msg);

                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(dialoglayout);

                dialog = builder.show();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return okButton;
    }

    public Button showValidatorPopup(Activity activity, String title, String msg) {
        Button okButton = null;
        try {
            if (!activity.isFinishing()) {
                LayoutInflater inflater = activity.getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.popup_notification_alert, null);
                okButton = dialoglayout.findViewById(R.id.btn_close);
                TextView txtTitle = dialoglayout.findViewById(R.id.txt_title);
                TextView txtMsg = dialoglayout.findViewById(R.id.txt_msg);
                txtTitle.setText(title);
                txtMsg.setText(msg);

                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(dialoglayout);

                dialog = builder.show();

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return okButton;
    }


    public void hidePopup(Activity activity) {
        if (!activity.isFinishing() && dialog != null) {
            dialog.dismiss();
        }
    }

}
