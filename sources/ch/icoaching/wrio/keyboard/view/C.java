package ch.icoaching.wrio.keyboard.view;

import ch.icoaching.wrio.keyboard.view.SymbolsRecyclerViewAdapter;
import u2.l;

public final /* synthetic */ class C implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SymbolsRecyclerViewAdapter.SymbolsViewHolder f10123a;

    public /* synthetic */ C(SymbolsRecyclerViewAdapter.SymbolsViewHolder symbolsViewHolder) {
        this.f10123a = symbolsViewHolder;
    }

    public final Object invoke(Object obj) {
        return SymbolsRecyclerViewAdapter.SymbolsViewHolder.N(this.f10123a, ((Character) obj).charValue());
    }
}
