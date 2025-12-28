package com.capacitorjs.plugins.browser;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;

public class Browser {
    public static final int BROWSER_FINISHED = 2;
    public static final int BROWSER_LOADED = 1;
    private static final String CUSTOM_TAB_PACKAGE_NAME = "com.android.chrome";
    private BrowserEventListener browserEventListener;
    private f browserSession;
    private e connection = new e() {
        public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            Browser.this.customTabsClient = cVar;
            cVar.e(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private Context context;
    /* access modifiers changed from: private */
    public c customTabsClient;
    private EventGroup group;
    private boolean isInitialLoad = false;

    interface BrowserEventListener {
        void onBrowserEvent(int i4);
    }

    public Browser(Context context2) {
        this.context = context2;
        this.group = new EventGroup(new a(this));
    }

    private f getCustomTabsSession() {
        c cVar = this.customTabsClient;
        if (cVar == null) {
            return null;
        }
        if (this.browserSession == null) {
            this.browserSession = cVar.c(new b() {
                public void onNavigationEvent(int i4, Bundle bundle) {
                    Browser.this.handledNavigationEvent(i4);
                }
            });
        }
        return this.browserSession;
    }

    /* access modifiers changed from: private */
    public void handleGroupCompletion() {
        BrowserEventListener browserEventListener2 = this.browserEventListener;
        if (browserEventListener2 != null) {
            browserEventListener2.onBrowserEvent(2);
        }
    }

    /* access modifiers changed from: private */
    public void handledNavigationEvent(int i4) {
        if (i4 != 2) {
            if (i4 == 5) {
                this.group.enter();
            } else if (i4 == 6) {
                this.group.leave();
            }
        } else if (this.isInitialLoad) {
            BrowserEventListener browserEventListener2 = this.browserEventListener;
            if (browserEventListener2 != null) {
                browserEventListener2.onBrowserEvent(1);
            }
            this.isInitialLoad = false;
        }
    }

    public boolean bindService() {
        boolean a4 = c.a(this.context, CUSTOM_TAB_PACKAGE_NAME, this.connection);
        this.group.leave();
        return a4;
    }

    public BrowserEventListener getBrowserEventListenerListener() {
        return this.browserEventListener;
    }

    public void open(Uri uri) {
        open(uri, (Integer) null);
    }

    public void setBrowserEventListener(BrowserEventListener browserEventListener2) {
        this.browserEventListener = browserEventListener2;
    }

    public void unbindService() {
        this.context.unbindService(this.connection);
        this.group.enter();
    }

    public void open(Uri uri, Integer num) {
        d.C0059d dVar = new d.C0059d(getCustomTabsSession());
        dVar.g(1);
        if (num != null) {
            dVar.c(new a.C0056a().b(num.intValue()).a());
        }
        d a4 = dVar.a();
        Intent intent = a4.f3727a;
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse("2//" + this.context.getPackageName()));
        this.isInitialLoad = true;
        this.group.reset();
        a4.a(this.context, uri);
    }
}
