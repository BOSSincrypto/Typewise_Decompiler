package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f12532a;

    private final void a() {
        ResultReceiver resultReceiver = this.f12532a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i4, int i5, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 0 && (resultReceiver = this.f12532a) != null) {
            if (i5 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i5 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f12532a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                a();
                finish();
            }
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                a();
                finish();
            }
        } else {
            this.f12532a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f12532a);
    }
}
