package p000.p001;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: ī.íì.bl4  reason: invalid package */
class bl4 implements View.OnClickListener {
    private final AlertDialog val$create;

    bl4(AlertDialog alertDialog) {
        this.val$create = alertDialog;
    }

    public void onClick(View view) {
        this.val$create.dismiss();
    }
}
