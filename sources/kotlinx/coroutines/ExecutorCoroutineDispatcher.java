package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.coroutines.b;
import kotlin.jvm.internal.i;

public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public static final Key f13994c = new Key((i) null);

    public static final class Key extends b {
        public /* synthetic */ Key(i iVar) {
            this();
        }

        private Key() {
            super(CoroutineDispatcher.f13989b, AnonymousClass1.INSTANCE);
        }
    }
}
