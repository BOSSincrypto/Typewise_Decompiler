package E0;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;

public abstract class c {
    public static final String b(byte[] bArr) {
        o.e(bArr, "<this>");
        byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
        o.d(digest, "digest(...)");
        return C0713h.R(digest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new b(), 30, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final CharSequence c(byte b4) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b4)}, 1));
        o.d(format, "format(...)");
        return format;
    }
}
