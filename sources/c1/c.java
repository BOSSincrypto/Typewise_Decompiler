package c1;

import X0.a;
import X0.d;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p1.C0851a;

public class c implements a {
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, d dVar) {
        try {
            C0851a.f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
