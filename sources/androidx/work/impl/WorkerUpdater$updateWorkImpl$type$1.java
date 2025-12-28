package androidx.work.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import l0.v;
import u2.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/v;", "spec", "", "invoke", "(Ll0/v;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class WorkerUpdater$updateWorkImpl$type$1 extends Lambda implements l {
    public static final WorkerUpdater$updateWorkImpl$type$1 INSTANCE = new WorkerUpdater$updateWorkImpl$type$1();

    WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    public final String invoke(v vVar) {
        o.e(vVar, "spec");
        return vVar.j() ? "Periodic" : "OneTime";
    }
}
