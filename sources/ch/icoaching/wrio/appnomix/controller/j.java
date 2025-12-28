package ch.icoaching.wrio.appnomix.controller;

import kotlin.coroutines.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchController f9245a;

    public j(SearchController searchController) {
        this.f9245a = searchController;
    }

    public final Object emit(Object obj, c cVar) {
        g gVar = (g) obj;
        if (gVar.f9241a || gVar.f9242b) {
            this.f9245a.f9212d.b();
        } else {
            this.f9245a.f9212d.a();
        }
        return q.f14567a;
    }
}
