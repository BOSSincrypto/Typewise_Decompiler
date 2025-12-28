package ch.icoaching.wrio.keyboard;

import android.view.inputmethod.InlineSuggestion;
import android.widget.inline.InlineContentView;
import java.util.List;
import java.util.function.Consumer;

public final /* synthetic */ class s implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f10107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InlineSuggestion f10108b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10109c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DefaultSmartBarController f10110d;

    public /* synthetic */ s(List list, InlineSuggestion inlineSuggestion, int i4, DefaultSmartBarController defaultSmartBarController) {
        this.f10107a = list;
        this.f10108b = inlineSuggestion;
        this.f10109c = i4;
        this.f10110d = defaultSmartBarController;
    }

    public final void accept(Object obj) {
        DefaultSmartBarController.B(this.f10107a, this.f10108b, this.f10109c, this.f10110d, (InlineContentView) obj);
    }
}
