package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.b f5487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.h f5488b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5489c;

    public /* synthetic */ g(EmojiCompatInitializer.b bVar, f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f5487a = bVar;
        this.f5488b = hVar;
        this.f5489c = threadPoolExecutor;
    }

    public final void run() {
        this.f5487a.d(this.f5488b, this.f5489c);
    }
}
