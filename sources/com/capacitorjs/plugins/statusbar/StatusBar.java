package com.capacitorjs.plugins.statusbar;

import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0370d;
import androidx.core.view.C0403a0;
import androidx.core.view.C0435o0;
import androidx.core.view.P;

public class StatusBar {
    private final C0370d activity;
    private int currentStatusBarColor;
    private final String defaultStyle = getStyle();

    public StatusBar(C0370d dVar) {
        this.activity = dVar;
        this.currentStatusBarColor = dVar.getWindow().getStatusBarColor();
    }

    private boolean getIsOverlaid() {
        if ((this.activity.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024) {
            return true;
        }
        return false;
    }

    private String getStyle() {
        if (C0403a0.a(this.activity.getWindow(), this.activity.getWindow().getDecorView()).b()) {
            return "LIGHT";
        }
        return "DARK";
    }

    public StatusBarInfo getInfo() {
        boolean z3;
        Window window = this.activity.getWindow();
        C0435o0 H3 = P.H(window.getDecorView());
        if (H3 == null || !H3.o(C0435o0.m.e())) {
            z3 = false;
        } else {
            z3 = true;
        }
        StatusBarInfo statusBarInfo = new StatusBarInfo();
        statusBarInfo.setStyle(getStyle());
        statusBarInfo.setOverlays(getIsOverlaid());
        statusBarInfo.setVisible(z3);
        statusBarInfo.setColor(String.format("#%06X", new Object[]{Integer.valueOf(window.getStatusBarColor() & 16777215)}));
        return statusBarInfo;
    }

    public void hide() {
        C0403a0.a(this.activity.getWindow(), this.activity.getWindow().getDecorView()).a(C0435o0.m.e());
    }

    public void setBackgroundColor(int i4) {
        Window window = this.activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i4);
        this.currentStatusBarColor = i4;
    }

    public void setOverlaysWebView(Boolean bool) {
        View decorView = this.activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (bool.booleanValue()) {
            decorView.setSystemUiVisibility(systemUiVisibility | 1280);
            this.currentStatusBarColor = this.activity.getWindow().getStatusBarColor();
            this.activity.getWindow().setStatusBarColor(0);
            return;
        }
        decorView.setSystemUiVisibility(systemUiVisibility & -1281);
        this.activity.getWindow().setStatusBarColor(this.currentStatusBarColor);
    }

    public void setStyle(String str) {
        Window window = this.activity.getWindow();
        View decorView = window.getDecorView();
        if (str.equals("DEFAULT")) {
            str = this.defaultStyle;
        }
        C0403a0.a(window, decorView).d(!str.equals("DARK"));
    }

    public void show() {
        C0403a0.a(this.activity.getWindow(), this.activity.getWindow().getDecorView()).e(C0435o0.m.e());
    }
}
