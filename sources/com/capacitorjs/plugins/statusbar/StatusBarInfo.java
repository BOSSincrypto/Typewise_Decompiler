package com.capacitorjs.plugins.statusbar;

public class StatusBarInfo {
    private String color;
    private boolean overlays;
    private String style;
    private boolean visible;

    public String getColor() {
        return this.color;
    }

    public String getStyle() {
        return this.style;
    }

    public boolean isOverlays() {
        return this.overlays;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setOverlays(boolean z3) {
        this.overlays = z3;
    }

    public void setStyle(String str) {
        this.style = str;
    }

    public void setVisible(boolean z3) {
        this.visible = z3;
    }
}
