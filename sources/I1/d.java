package i1;

import X0.f;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.s;
import java.io.File;
import java.io.IOException;
import p1.C0851a;

public class d implements f {
    public EncodeStrategy b(X0.d dVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: c */
    public boolean a(s sVar, File file, X0.d dVar) {
        try {
            C0851a.f(((c) sVar.get()).c(), file);
            return true;
        } catch (IOException e4) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e4);
            }
            return false;
        }
    }
}
