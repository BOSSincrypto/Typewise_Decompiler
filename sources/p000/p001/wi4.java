package p000.p001;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: ī.íì.wi4  reason: invalid package */
class wi4 implements View.OnClickListener {
    private final AlertDialog val$create;

    wi4(AlertDialog alertDialog) {
        this.val$create = alertDialog;
    }

    public void onClick(View view) {
        this.val$create.dismiss();
    }
}
