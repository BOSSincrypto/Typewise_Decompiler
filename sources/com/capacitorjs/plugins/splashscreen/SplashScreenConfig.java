package com.capacitorjs.plugins.splashscreen;

import android.widget.ImageView;

public class SplashScreenConfig {
    private Integer backgroundColor;
    private boolean fullScreen = false;
    private boolean immersive = false;
    private boolean launchAutoHide = true;
    private Integer launchFadeInDuration = 0;
    private Integer launchFadeOutDuration = 200;
    private Integer launchShowDuration = 500;
    private String layoutName;
    private String resourceName = "splash";
    private ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
    private boolean showSpinner = false;
    private Integer spinnerColor;
    private Integer spinnerStyle;
    private boolean usingDialog = false;

    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public Integer getLaunchFadeInDuration() {
        return this.launchFadeInDuration;
    }

    public Integer getLaunchFadeOutDuration() {
        return this.launchFadeOutDuration;
    }

    public Integer getLaunchShowDuration() {
        return this.launchShowDuration;
    }

    public String getLayoutName() {
        return this.layoutName;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public Integer getSpinnerColor() {
        return this.spinnerColor;
    }

    public Integer getSpinnerStyle() {
        return this.spinnerStyle;
    }

    public boolean isFullScreen() {
        return this.fullScreen;
    }

    public boolean isImmersive() {
        return this.immersive;
    }

    public boolean isLaunchAutoHide() {
        return this.launchAutoHide;
    }

    public boolean isShowSpinner() {
        return this.showSpinner;
    }

    public boolean isUsingDialog() {
        return this.usingDialog;
    }

    public void setBackgroundColor(Integer num) {
        this.backgroundColor = num;
    }

    public void setFullScreen(boolean z3) {
        this.fullScreen = z3;
    }

    public void setImmersive(boolean z3) {
        this.immersive = z3;
    }

    public void setLaunchAutoHide(boolean z3) {
        this.launchAutoHide = z3;
    }

    public void setLaunchFadeOutDuration(Integer num) {
        this.launchFadeOutDuration = num;
    }

    public void setLaunchShowDuration(Integer num) {
        this.launchShowDuration = num;
    }

    public void setLayoutName(String str) {
        this.layoutName = str;
    }

    public void setResourceName(String str) {
        this.resourceName = str;
    }

    public void setScaleType(ImageView.ScaleType scaleType2) {
        this.scaleType = scaleType2;
    }

    public void setShowSpinner(boolean z3) {
        this.showSpinner = z3;
    }

    public void setSpinnerColor(Integer num) {
        this.spinnerColor = num;
    }

    public void setSpinnerStyle(Integer num) {
        this.spinnerStyle = num;
    }

    public void setUsingDialog(boolean z3) {
        this.usingDialog = z3;
    }
}
