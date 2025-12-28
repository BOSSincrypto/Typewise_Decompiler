package ch.icoaching.wrio.input;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import ch.icoaching.wrio.C;
import kotlin.jvm.internal.o;

public abstract class e {
    /* access modifiers changed from: private */
    public static final void b(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("application/octet-stream");
        intent.putExtra("android.intent.extra.STREAM", uri);
        try {
            Intent flags = Intent.createChooser(intent, context.getString(C.export_file)).setFlags(268435456);
            o.d(flags, "setFlags(...)");
            context.startActivity(flags);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, C.no_client_found, 0).show();
        }
    }
}
