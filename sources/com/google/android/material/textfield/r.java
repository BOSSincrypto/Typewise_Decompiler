package com.google.android.material.textfield;

import android.widget.EditText;

abstract class r {
    static boolean a(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }
}
