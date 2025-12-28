package ch.icoaching.wrio.ai_assistant.network;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9193a;

    public i() {
        Charset charset = StandardCharsets.UTF_8;
        o.d(charset, "UTF_8");
        byte[] bytes = "0123456789ab".getBytes(charset);
        o.d(bytes, "getBytes(...)");
        this.f9193a = bytes;
    }

    private final Pair b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.setTime(new Date());
        String format = simpleDateFormat.format(instance.getTime());
        instance.add(11, -1);
        String format2 = simpleDateFormat.format(instance.getTime());
        o.b(format);
        SecretKeySpec secretKeySpec = new SecretKeySpec(c(format), "AES");
        o.b(format2);
        return new Pair(secretKeySpec, new SecretKeySpec(c(format2), "AES"));
    }

    private final byte[] c(String str) {
        Charset charset = StandardCharsets.UTF_8;
        o.d(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        o.d(bytes, "getBytes(...)");
        List b02 = C0713h.b0(bytes);
        while (b02.size() < 32) {
            b02.add((byte) 0);
        }
        return C0718m.x0(C0718m.v0(b02, 32));
    }

    public final String a(String str) {
        o.e(str, "plainText");
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, (SecretKey) b().component1(), new GCMParameterSpec(Uuid.SIZE_BITS, this.f9193a));
        Charset charset = StandardCharsets.UTF_8;
        o.d(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        o.d(bytes, "getBytes(...)");
        byte[] doFinal = instance.doFinal(bytes);
        byte[] bArr = this.f9193a;
        o.b(doFinal);
        String encodeToString = Base64.encodeToString(C0713h.l(bArr, doFinal), 0);
        o.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
