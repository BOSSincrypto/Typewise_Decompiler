package com.capacitorjs.plugins.browser;

import com.capacitorjs.plugins.browser.EventGroup;

public final /* synthetic */ class a implements EventGroup.EventGroupCompletion {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Browser f11309a;

    public /* synthetic */ a(Browser browser) {
        this.f11309a = browser;
    }

    public final void onGroupCompletion() {
        this.f11309a.handleGroupCompletion();
    }
}
