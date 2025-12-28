package com.getcapacitor;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.C0370d;
import com.getcapacitor.Bridge;
import com.getcapacitor.android.R;
import java.util.ArrayList;
import java.util.List;
import p000.p001.bi;

public class BridgeActivity extends C0370d {
    protected int activityDepth = 0;
    protected Bridge bridge;
    protected final Bridge.Builder bridgeBuilder = new Bridge.Builder((C0370d) this);
    protected CapConfig config;
    protected List<Class<? extends Plugin>> initialPlugins = new ArrayList();
    protected boolean keepRunning = true;

    public Bridge getBridge() {
        return this.bridge;
    }

    /* access modifiers changed from: protected */
    public void load() {
        Logger.debug("Starting BridgeActivity");
        Bridge create = this.bridgeBuilder.addPlugins(this.initialPlugins).setConfig(this.config).create();
        this.bridge = create;
        this.keepRunning = create.shouldKeepRunning();
        onNewIntent(getIntent());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i4, int i5, Intent intent) {
        Bridge bridge2 = this.bridge;
        if (bridge2 != null && !bridge2.onActivityResult(i4, i5, intent)) {
            super.onActivityResult(i4, i5, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Bridge bridge2 = this.bridge;
        if (bridge2 != null) {
            bridge2.onConfigurationChanged(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        bi.b(this);
        super.onCreate(bundle);
        this.bridgeBuilder.setInstanceState(bundle);
        getApplication().setTheme(getResources().getIdentifier("AppTheme_NoActionBar", "style", getPackageName()));
        setTheme(getResources().getIdentifier("AppTheme_NoActionBar", "style", getPackageName()));
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.bridge_layout_main);
        try {
            this.bridgeBuilder.addPlugins(new PluginManager(getAssets()).loadPluginClasses());
        } catch (PluginLoadException e4) {
            Logger.error("Error loading plugins.", e4);
        }
        load();
    }

    public void onDestroy() {
        super.onDestroy();
        this.bridge.onDestroy();
        Logger.debug("App destroyed");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bridge.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bridge bridge2 = this.bridge;
        if (bridge2 != null && intent != null) {
            bridge2.onNewIntent(intent);
        }
    }

    public void onPause() {
        super.onPause();
        this.bridge.onPause();
        Logger.debug("App paused");
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        Bridge bridge2 = this.bridge;
        if (bridge2 != null && !bridge2.onRequestPermissionsResult(i4, strArr, iArr)) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        }
    }

    public void onRestart() {
        super.onRestart();
        this.bridge.onRestart();
        Logger.debug("App restarted");
    }

    public void onResume() {
        super.onResume();
        this.bridge.getApp().fireStatusChange(true);
        this.bridge.onResume();
        Logger.debug("App resumed");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.bridge.saveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.activityDepth++;
        this.bridge.onStart();
        Logger.debug("App started");
    }

    public void onStop() {
        super.onStop();
        int max = Math.max(0, this.activityDepth - 1);
        this.activityDepth = max;
        if (max == 0) {
            this.bridge.getApp().fireStatusChange(false);
        }
        this.bridge.onStop();
        Logger.debug("App stopped");
    }

    public void registerPlugin(Class<? extends Plugin> cls) {
        this.bridgeBuilder.addPlugin(cls);
    }

    public void registerPlugins(List<Class<? extends Plugin>> list) {
        this.bridgeBuilder.addPlugins(list);
    }
}
