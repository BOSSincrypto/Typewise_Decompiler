package p000.p001;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: ī.íì.wl4  reason: invalid package */
class wl4 implements View.OnClickListener {
    private final AlertDialog val$create;

    wl4(AlertDialog alertDialog) {
        this.val$create = alertDialog;
    }

    public void onClick(View view) {
        this.val$create.dismiss();
    }
}
