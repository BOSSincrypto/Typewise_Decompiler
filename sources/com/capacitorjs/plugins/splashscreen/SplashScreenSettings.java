package com.capacitorjs.plugins.splashscreen;

public class SplashScreenSettings {
    private boolean autoHide = true;
    private Integer fadeInDuration = 200;
    private Integer fadeOutDuration = 200;
    private Integer showDuration = 3000;

    public Integer getFadeInDuration() {
        return this.fadeInDuration;
    }

    public Integer getFadeOutDuration() {
        return this.fadeOutDuration;
    }

    public Integer getShowDuration() {
        return this.showDuration;
    }

    public boolean isAutoHide() {
        return this.autoHide;
    }

    public void setAutoHide(boolean z3) {
        this.autoHide = z3;
    }

    public void setFadeInDuration(Integer num) {
        this.fadeInDuration = num;
    }

    public void setFadeOutDuration(Integer num) {
        this.fadeOutDuration = num;
    }

    public void setShowDuration(Integer num) {
        this.showDuration = num;
    }
}
