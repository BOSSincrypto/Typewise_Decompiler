package l1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l1.b  reason: case insensitive filesystem */
public final class C0788b {

    /* renamed from: a  reason: collision with root package name */
    private final List f14531a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f14531a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f14531a;
    }
}
