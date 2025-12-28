package com.capacitorjs.plugins.splashscreen;

import android.widget.ImageView;
import com.getcapacitor.Logger;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.util.WebColor;
import java.util.Locale;

@CapacitorPlugin(name = "SplashScreen")
public class SplashScreenPlugin extends Plugin {
    private SplashScreenConfig config;
    private SplashScreen splashScreen;

    private SplashScreenSettings getSettings(PluginCall pluginCall) {
        SplashScreenSettings splashScreenSettings = new SplashScreenSettings();
        if (pluginCall.getInt("showDuration") != null) {
            splashScreenSettings.setShowDuration(pluginCall.getInt("showDuration"));
        }
        if (pluginCall.getInt("fadeInDuration") != null) {
            splashScreenSettings.setFadeInDuration(pluginCall.getInt("fadeInDuration"));
        }
        if (pluginCall.getInt("fadeOutDuration") != null) {
            splashScreenSettings.setFadeOutDuration(pluginCall.getInt("fadeOutDuration"));
        }
        if (pluginCall.getBoolean("autoHide") != null) {
            splashScreenSettings.setAutoHide(pluginCall.getBoolean("autoHide").booleanValue());
        }
        return splashScreenSettings;
    }

    private SplashScreenConfig getSplashScreenConfig() {
        ImageView.ScaleType scaleType;
        SplashScreenConfig splashScreenConfig = new SplashScreenConfig();
        String string = getConfig().getString("backgroundColor");
        if (string != null) {
            try {
                splashScreenConfig.setBackgroundColor(Integer.valueOf(WebColor.parseColor(string)));
            } catch (IllegalArgumentException unused) {
                Logger.debug("Background color not applied");
            }
        }
        splashScreenConfig.setLaunchShowDuration(Integer.valueOf(getConfig().getInt("launchShowDuration", splashScreenConfig.getLaunchShowDuration().intValue())));
        splashScreenConfig.setLaunchFadeOutDuration(Integer.valueOf(getConfig().getInt("launchFadeOutDuration", splashScreenConfig.getLaunchFadeOutDuration().intValue())));
        splashScreenConfig.setLaunchAutoHide(getConfig().getBoolean("launchAutoHide", splashScreenConfig.isLaunchAutoHide()));
        if (getConfig().getString("androidSplashResourceName") != null) {
            splashScreenConfig.setResourceName(getConfig().getString("androidSplashResourceName"));
        }
        splashScreenConfig.setImmersive(getConfig().getBoolean("splashImmersive", splashScreenConfig.isImmersive()));
        splashScreenConfig.setFullScreen(getConfig().getBoolean("splashFullScreen", splashScreenConfig.isFullScreen()));
        String string2 = getConfig().getString("androidSpinnerStyle");
        if (string2 != null) {
            String lowerCase = string2.toLowerCase(Locale.ROOT);
            lowerCase.hashCode();
            int i4 = 16842874;
            char c4 = 65535;
            switch (lowerCase.hashCode()) {
                case -1971382379:
                    if (lowerCase.equals("largeinverse")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 102742843:
                    if (lowerCase.equals("large")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 109548807:
                    if (lowerCase.equals("small")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1051779145:
                    if (lowerCase.equals("smallinverse")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 1387629604:
                    if (lowerCase.equals("horizontal")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 1959910192:
                    if (lowerCase.equals("inverse")) {
                        c4 = 5;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    i4 = 16843401;
                    break;
                case 2:
                    i4 = 16842873;
                    break;
                case 3:
                    i4 = 16843400;
                    break;
                case 4:
                    i4 = 16842872;
                    break;
                case 5:
                    i4 = 16843399;
                    break;
            }
            splashScreenConfig.setSpinnerStyle(Integer.valueOf(i4));
        }
        String string3 = getConfig().getString("spinnerColor");
        if (string3 != null) {
            try {
                splashScreenConfig.setSpinnerColor(Integer.valueOf(WebColor.parseColor(string3)));
            } catch (IllegalArgumentException unused2) {
                Logger.debug("Spinner color not applied");
            }
        }
        String string4 = getConfig().getString("androidScaleType");
        if (string4 != null) {
            try {
                scaleType = ImageView.ScaleType.valueOf(string4);
            } catch (IllegalArgumentException unused3) {
                scaleType = ImageView.ScaleType.FIT_XY;
            }
            splashScreenConfig.setScaleType(scaleType);
        }
        splashScreenConfig.setShowSpinner(getConfig().getBoolean("showSpinner", splashScreenConfig.isShowSpinner()));
        splashScreenConfig.setUsingDialog(getConfig().getBoolean("useDialog", splashScreenConfig.isUsingDialog()));
        if (getConfig().getString("layoutName") != null) {
            splashScreenConfig.setLayoutName(getConfig().getString("layoutName"));
        }
        return splashScreenConfig;
    }

    /* access modifiers changed from: protected */
    public void handleOnDestroy() {
        this.splashScreen.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void handleOnPause() {
        this.splashScreen.onPause();
    }

    @PluginMethod
    public void hide(PluginCall pluginCall) {
        if (this.config.isUsingDialog()) {
            this.splashScreen.hideDialog(getActivity());
        } else {
            this.splashScreen.hide(getSettings(pluginCall));
        }
        pluginCall.resolve();
    }

    public void load() {
        this.config = getSplashScreenConfig();
        this.splashScreen = new SplashScreen(getContext(), this.config);
        if (this.bridge.isMinimumWebViewInstalled() || this.bridge.getConfig().getErrorPath() == null || this.config.isLaunchAutoHide()) {
            this.splashScreen.showOnLaunch(getActivity());
        }
    }

    @PluginMethod
    public void show(final PluginCall pluginCall) {
        this.splashScreen.show(getActivity(), getSettings(pluginCall), new SplashListener() {
            public void completed() {
                pluginCall.resolve();
            }

            public void error() {
                pluginCall.reject("An error occurred while showing splash");
            }
        });
    }
}
