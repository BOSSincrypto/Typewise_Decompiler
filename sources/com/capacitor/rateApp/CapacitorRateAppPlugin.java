package com.capacitor.rateApp;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "RateApp")
public class CapacitorRateAppPlugin extends Plugin {
    private CapacitorRateApp implementation = new CapacitorRateApp();

    @PluginMethod
    public void requestReview(PluginCall pluginCall) {
        this.implementation.requestReview(pluginCall, getActivity());
        pluginCall.resolve();
    }
}
