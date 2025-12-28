package androidx.work.impl;

import androidx.work.ExistingWorkPolicy;
import androidx.work.u;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.Lambda;
import m0.C0804c;
import u2.C0906a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll2/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 extends Lambda implements C0906a {
    final /* synthetic */ String $name;
    final /* synthetic */ o $operation;
    final /* synthetic */ F $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ u $workRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(u uVar, F f4, String str, o oVar) {
        super(0);
        this.$workRequest = uVar;
        this.$this_enqueueUniquelyNamedPeriodic = f4;
        this.$name = str;
        this.$operation = oVar;
    }

    public final void invoke() {
        new C0804c(new x(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, C0718m.e(this.$workRequest)), this.$operation).run();
    }
}
