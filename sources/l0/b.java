package L0;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;

public abstract class b {
    public static final String a(long j4) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j4);
        Locale locale = Locale.US;
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(instance.getTime());
        int offset = TimeZone.getDefault().getOffset(instance.getTimeInMillis());
        int i4 = offset / 3600000;
        int abs = Math.abs((offset / 60000) % 60);
        u uVar = u.f13912a;
        String format2 = String.format(locale, "%+03d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(abs)}, 2));
        o.d(format2, "format(...)");
        return format + format2;
    }
}
