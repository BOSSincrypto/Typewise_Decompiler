package org.apache.cordova;

import android.util.Pair;
import android.util.SparseArray;

public class CallbackMap {
    private SparseArray<Pair<CordovaPlugin, Integer>> callbacks = new SparseArray<>();
    private int currentCallbackId = 0;

    public synchronized Pair<CordovaPlugin, Integer> getAndRemoveCallback(int i4) {
        Pair<CordovaPlugin, Integer> pair;
        pair = this.callbacks.get(i4);
        this.callbacks.remove(i4);
        return pair;
    }

    public synchronized int registerCallback(CordovaPlugin cordovaPlugin, int i4) {
        int i5;
        i5 = this.currentCallbackId;
        this.currentCallbackId = i5 + 1;
        this.callbacks.put(i5, new Pair(cordovaPlugin, Integer.valueOf(i4)));
        return i5;
    }
}
