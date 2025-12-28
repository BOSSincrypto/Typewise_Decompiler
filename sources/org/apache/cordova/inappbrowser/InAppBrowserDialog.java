package org.apache.cordova.inappbrowser;

import android.app.Dialog;
import android.content.Context;

public class InAppBrowserDialog extends Dialog {
    Context context;
    InAppBrowser inAppBrowser = null;

    public InAppBrowserDialog(Context context2, int i4) {
        super(context2, i4);
        this.context = context2;
    }

    public void onBackPressed() {
        InAppBrowser inAppBrowser2 = this.inAppBrowser;
        if (inAppBrowser2 == null) {
            dismiss();
        } else if (!inAppBrowser2.hardwareBack() || !this.inAppBrowser.canGoBack()) {
            this.inAppBrowser.closeDialog();
        } else {
            this.inAppBrowser.goBack();
        }
    }

    public void setInAppBroswer(InAppBrowser inAppBrowser2) {
        this.inAppBrowser = inAppBrowser2;
    }
}
