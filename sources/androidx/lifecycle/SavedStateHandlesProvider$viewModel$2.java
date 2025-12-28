package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u2.C0906a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/A;", "invoke", "()Landroidx/lifecycle/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SavedStateHandlesProvider$viewModel$2 extends Lambda implements C0906a {
    final /* synthetic */ J $viewModelStoreOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavedStateHandlesProvider$viewModel$2(J j4) {
        super(0);
        this.$viewModelStoreOwner = j4;
    }

    public final A invoke() {
        return SavedStateHandleSupport.e(this.$viewModelStoreOwner);
    }
}
