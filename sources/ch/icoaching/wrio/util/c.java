package ch.icoaching.wrio.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.logging.Log;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import org.apache.commons.lang3.time.FastDateFormat;

public abstract class c {
    public static final void a(Context context) {
        o.e(context, "applicationContext");
        String format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", TimeZone.getDefault()).format(System.currentTimeMillis());
        b(context, new String[]{"android-logs@typewise.app"}, "Typewise Android log file recorded on " + format, "", Log.f10572a.g());
    }

    public static final void b(Context context, String[] strArr, String str, String str2, Uri uri) {
        o.e(context, "context");
        o.e(strArr, "to");
        o.e(str, "subject");
        o.e(str2, "content");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        try {
            Intent flags = Intent.createChooser(intent, context.getString(C.send_email)).setFlags(268435456);
            o.d(flags, "setFlags(...)");
            context.startActivity(flags);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, C.no_email_client_found, 0).show();
        }
    }
}
