package org.apache.cordova;

import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.cordova.PluginResult;

public class NativeToJsMessageQueue {
    private static int COMBINED_RESPONSE_CUTOFF = 16777216;
    static final boolean DISABLE_EXEC_CHAINING = false;
    private static final boolean FORCE_ENCODE_USING_EVAL = false;
    private static final String LOG_TAG = "JsMessageQueue";
    private BridgeMode activeBridgeMode;
    private ArrayList<BridgeMode> bridgeModes = new ArrayList<>();
    private boolean paused;
    private final LinkedList<JsMessage> queue = new LinkedList<>();

    public static abstract class BridgeMode {
        public void notifyOfFlush(NativeToJsMessageQueue nativeToJsMessageQueue, boolean z3) {
        }

        public abstract void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue);

        public void reset() {
        }
    }

    public static class EvalBridgeMode extends BridgeMode {

        /* renamed from: cordova  reason: collision with root package name */
        private final CordovaInterface f15695cordova;
        /* access modifiers changed from: private */
        public final CordovaWebViewEngine engine;

        public EvalBridgeMode(CordovaWebViewEngine cordovaWebViewEngine, CordovaInterface cordovaInterface) {
            this.engine = cordovaWebViewEngine;
            this.f15695cordova = cordovaInterface;
        }

        public void onNativeToJsMessageAvailable(final NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f15695cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    String popAndEncodeAsJs = nativeToJsMessageQueue.popAndEncodeAsJs();
                    if (popAndEncodeAsJs != null) {
                        EvalBridgeMode.this.engine.evaluateJavascript(popAndEncodeAsJs, (ValueCallback<String>) null);
                    }
                }
            });
        }
    }

    public static class LoadUrlBridgeMode extends BridgeMode {

        /* renamed from: cordova  reason: collision with root package name */
        private final CordovaInterface f15696cordova;
        /* access modifiers changed from: private */
        public final CordovaWebViewEngine engine;

        public LoadUrlBridgeMode(CordovaWebViewEngine cordovaWebViewEngine, CordovaInterface cordovaInterface) {
            this.engine = cordovaWebViewEngine;
            this.f15696cordova = cordovaInterface;
        }

        public void onNativeToJsMessageAvailable(final NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f15696cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    String popAndEncodeAsJs = nativeToJsMessageQueue.popAndEncodeAsJs();
                    if (popAndEncodeAsJs != null) {
                        CordovaWebViewEngine access$000 = LoadUrlBridgeMode.this.engine;
                        access$000.loadUrl("javascript:" + popAndEncodeAsJs, false);
                    }
                }
            });
        }
    }

    public static class NoOpBridgeMode extends BridgeMode {
        public void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue) {
        }
    }

    public static class OnlineEventsBridgeMode extends BridgeMode {
        /* access modifiers changed from: private */
        public final OnlineEventsBridgeModeDelegate delegate;
        /* access modifiers changed from: private */
        public boolean ignoreNextFlush;
        /* access modifiers changed from: private */
        public boolean online;

        public interface OnlineEventsBridgeModeDelegate {
            void runOnUiThread(Runnable runnable);

            void setNetworkAvailable(boolean z3);
        }

        public OnlineEventsBridgeMode(OnlineEventsBridgeModeDelegate onlineEventsBridgeModeDelegate) {
            this.delegate = onlineEventsBridgeModeDelegate;
        }

        public void notifyOfFlush(NativeToJsMessageQueue nativeToJsMessageQueue, boolean z3) {
            if (z3 && !this.ignoreNextFlush) {
                this.online = !this.online;
            }
        }

        public void onNativeToJsMessageAvailable(final NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.delegate.runOnUiThread(new Runnable() {
                public void run() {
                    if (!nativeToJsMessageQueue.isEmpty()) {
                        boolean unused = OnlineEventsBridgeMode.this.ignoreNextFlush = false;
                        OnlineEventsBridgeMode.this.delegate.setNetworkAvailable(OnlineEventsBridgeMode.this.online);
                    }
                }
            });
        }

        public void reset() {
            this.delegate.runOnUiThread(new Runnable() {
                public void run() {
                    boolean unused = OnlineEventsBridgeMode.this.online = false;
                    boolean unused2 = OnlineEventsBridgeMode.this.ignoreNextFlush = true;
                    OnlineEventsBridgeMode.this.delegate.setNetworkAvailable(true);
                }
            });
        }
    }

    private int calculatePackedMessageLength(JsMessage jsMessage) {
        int calculateEncodedLength = jsMessage.calculateEncodedLength();
        return String.valueOf(calculateEncodedLength).length() + calculateEncodedLength + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void enqueueMessage(org.apache.cordova.NativeToJsMessageQueue.JsMessage r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r1.activeBridgeMode     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0010
            java.lang.String r2 = "JsMessageQueue"
            java.lang.String r0 = "Dropping Native->JS message due to disabled bridge"
            org.apache.cordova.LOG.d(r2, r0)     // Catch:{ all -> 0x000e }
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r2 = move-exception
            goto L_0x0020
        L_0x0010:
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r1.queue     // Catch:{ all -> 0x000e }
            r0.add(r2)     // Catch:{ all -> 0x000e }
            boolean r2 = r1.paused     // Catch:{ all -> 0x000e }
            if (r2 != 0) goto L_0x001e
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r2 = r1.activeBridgeMode     // Catch:{ all -> 0x000e }
            r2.onNativeToJsMessageAvailable(r1)     // Catch:{ all -> 0x000e }
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            return
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.NativeToJsMessageQueue.enqueueMessage(org.apache.cordova.NativeToJsMessageQueue$JsMessage):void");
    }

    private void packMessage(JsMessage jsMessage, StringBuilder sb) {
        sb.append(jsMessage.calculateEncodedLength());
        sb.append(' ');
        jsMessage.encodeAsMessage(sb);
    }

    public void addBridgeMode(BridgeMode bridgeMode) {
        this.bridgeModes.add(bridgeMode);
    }

    public void addJavaScript(String str) {
        enqueueMessage(new JsMessage(str));
    }

    public void addPluginResult(PluginResult pluginResult, String str) {
        boolean z3;
        if (str == null) {
            LOG.e(LOG_TAG, "Got plugin result with no callbackId", new Throwable());
            return;
        }
        if (pluginResult.getStatus() == PluginResult.Status.NO_RESULT.ordinal()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean keepCallback = pluginResult.getKeepCallback();
        if (!z3 || !keepCallback) {
            enqueueMessage(new JsMessage(pluginResult, str));
        }
    }

    public boolean isBridgeEnabled() {
        if (this.activeBridgeMode != null) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public String popAndEncode(boolean z3) {
        int i4;
        synchronized (this) {
            try {
                BridgeMode bridgeMode = this.activeBridgeMode;
                if (bridgeMode == null) {
                    return null;
                }
                bridgeMode.notifyOfFlush(this, z3);
                if (this.queue.isEmpty()) {
                    return null;
                }
                Iterator<JsMessage> it = this.queue.iterator();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int calculatePackedMessageLength = calculatePackedMessageLength(it.next());
                    if (i5 > 0 && (i4 = COMBINED_RESPONSE_CUTOFF) > 0 && i6 + calculatePackedMessageLength > i4) {
                        break;
                    }
                    i6 += calculatePackedMessageLength;
                    i5++;
                }
                StringBuilder sb = new StringBuilder(i6);
                for (int i7 = 0; i7 < i5; i7++) {
                    packMessage(this.queue.removeFirst(), sb);
                }
                if (!this.queue.isEmpty()) {
                    sb.append('*');
                }
                String sb2 = sb.toString();
                return sb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String popAndEncodeAsJs() {
        int i4;
        int i5;
        int i6;
        synchronized (this) {
            try {
                if (this.queue.size() == 0) {
                    return null;
                }
                Iterator<JsMessage> it = this.queue.iterator();
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int calculateEncodedLength = it.next().calculateEncodedLength() + 50;
                    if (i7 > 0 && (i6 = COMBINED_RESPONSE_CUTOFF) > 0 && i8 + calculateEncodedLength > i6) {
                        break;
                    }
                    i8 += calculateEncodedLength;
                    i7++;
                }
                if (i7 == this.queue.size()) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    i5 = 0;
                } else {
                    i5 = 100;
                }
                StringBuilder sb = new StringBuilder(i8 + i5);
                for (int i9 = 0; i9 < i7; i9++) {
                    JsMessage removeFirst = this.queue.removeFirst();
                    if (i4 == 0 || i9 + 1 != i7) {
                        sb.append("try{");
                        removeFirst.encodeAsJsMessage(sb);
                        sb.append("}finally{");
                    } else {
                        removeFirst.encodeAsJsMessage(sb);
                    }
                }
                if (i4 == 0) {
                    sb.append("window.setTimeout(function(){cordova.require('cordova/plugin/android/polling').pollOnce();},0);");
                }
                while (i4 < i7) {
                    sb.append('}');
                    i4++;
                }
                String sb2 = sb.toString();
                return sb2;
            } finally {
            }
        }
    }

    public void reset() {
        synchronized (this) {
            this.queue.clear();
            setBridgeMode(-1);
        }
    }

    public void setBridgeMode(int i4) {
        BridgeMode bridgeMode;
        String str;
        if (i4 < -1 || i4 >= this.bridgeModes.size()) {
            LOG.d(LOG_TAG, "Invalid NativeToJsBridgeMode: " + i4);
            return;
        }
        if (i4 < 0) {
            bridgeMode = null;
        } else {
            bridgeMode = this.bridgeModes.get(i4);
        }
        if (bridgeMode != this.activeBridgeMode) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set native->JS mode to ");
            if (bridgeMode == null) {
                str = "null";
            } else {
                str = bridgeMode.getClass().getSimpleName();
            }
            sb.append(str);
            LOG.d(LOG_TAG, sb.toString());
            synchronized (this) {
                try {
                    this.activeBridgeMode = bridgeMode;
                    if (bridgeMode != null) {
                        bridgeMode.reset();
                        if (!this.paused && !this.queue.isEmpty()) {
                            bridgeMode.onNativeToJsMessageAvailable(this);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setPaused(boolean z3) {
        BridgeMode bridgeMode;
        if (this.paused && z3) {
            LOG.e(LOG_TAG, "nested call to setPaused detected.", new Throwable());
        }
        this.paused = z3;
        if (!z3) {
            synchronized (this) {
                try {
                    if (!this.queue.isEmpty() && (bridgeMode = this.activeBridgeMode) != null) {
                        bridgeMode.onNativeToJsMessageAvailable(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class JsMessage {
        final String jsPayloadOrCallbackId;
        final PluginResult pluginResult;

        JsMessage(String str) {
            str.getClass();
            this.jsPayloadOrCallbackId = str;
            this.pluginResult = null;
        }

        static int calculateEncodedLengthHelper(PluginResult pluginResult2) {
            switch (pluginResult2.getMessageType()) {
                case 1:
                    return pluginResult2.getStrMessage().length() + 1;
                case 3:
                    return pluginResult2.getMessage().length() + 1;
                case 4:
                case 5:
                    return 1;
                case 6:
                    return pluginResult2.getMessage().length() + 1;
                case 7:
                    return pluginResult2.getMessage().length() + 1;
                case 8:
                    int i4 = 1;
                    for (int i5 = 0; i5 < pluginResult2.getMultipartMessagesSize(); i5++) {
                        int calculateEncodedLengthHelper = calculateEncodedLengthHelper(pluginResult2.getMultipartMessage(i5));
                        i4 += String.valueOf(calculateEncodedLengthHelper).length() + 1 + calculateEncodedLengthHelper;
                    }
                    return i4;
                default:
                    return pluginResult2.getMessage().length();
            }
        }

        static void encodeAsMessageHelper(StringBuilder sb, PluginResult pluginResult2) {
            switch (pluginResult2.getMessageType()) {
                case 1:
                    sb.append('s');
                    sb.append(pluginResult2.getStrMessage());
                    return;
                case 3:
                    sb.append('n');
                    sb.append(pluginResult2.getMessage());
                    return;
                case 4:
                    sb.append(pluginResult2.getMessage().charAt(0));
                    return;
                case 5:
                    sb.append('N');
                    return;
                case 6:
                    sb.append('A');
                    sb.append(pluginResult2.getMessage());
                    return;
                case 7:
                    sb.append('S');
                    sb.append(pluginResult2.getMessage());
                    return;
                case 8:
                    sb.append('M');
                    for (int i4 = 0; i4 < pluginResult2.getMultipartMessagesSize(); i4++) {
                        PluginResult multipartMessage = pluginResult2.getMultipartMessage(i4);
                        sb.append(String.valueOf(calculateEncodedLengthHelper(multipartMessage)));
                        sb.append(' ');
                        encodeAsMessageHelper(sb, multipartMessage);
                    }
                    return;
                default:
                    sb.append(pluginResult2.getMessage());
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        public void buildJsMessage(StringBuilder sb) {
            int messageType = this.pluginResult.getMessageType();
            if (messageType == 5) {
                sb.append("null");
            } else if (messageType == 6) {
                sb.append("cordova.require('cordova/base64').toArrayBuffer('");
                sb.append(this.pluginResult.getMessage());
                sb.append("')");
            } else if (messageType == 7) {
                sb.append("atob('");
                sb.append(this.pluginResult.getMessage());
                sb.append("')");
            } else if (messageType != 8) {
                sb.append(this.pluginResult.getMessage());
            } else {
                int multipartMessagesSize = this.pluginResult.getMultipartMessagesSize();
                for (int i4 = 0; i4 < multipartMessagesSize; i4++) {
                    new JsMessage(this.pluginResult.getMultipartMessage(i4), this.jsPayloadOrCallbackId).buildJsMessage(sb);
                    if (i4 < multipartMessagesSize - 1) {
                        sb.append(",");
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int calculateEncodedLength() {
            PluginResult pluginResult2 = this.pluginResult;
            if (pluginResult2 == null) {
                return this.jsPayloadOrCallbackId.length() + 1;
            }
            return String.valueOf(pluginResult2.getStatus()).length() + 3 + this.jsPayloadOrCallbackId.length() + 1 + calculateEncodedLengthHelper(this.pluginResult);
        }

        /* access modifiers changed from: package-private */
        public void encodeAsJsMessage(StringBuilder sb) {
            boolean z3;
            PluginResult pluginResult2 = this.pluginResult;
            if (pluginResult2 == null) {
                sb.append(this.jsPayloadOrCallbackId);
                return;
            }
            int status = pluginResult2.getStatus();
            if (status == PluginResult.Status.OK.ordinal() || status == PluginResult.Status.NO_RESULT.ordinal()) {
                z3 = true;
            } else {
                z3 = false;
            }
            sb.append("cordova.callbackFromNative('");
            sb.append(this.jsPayloadOrCallbackId);
            sb.append("',");
            sb.append(z3);
            sb.append(",");
            sb.append(status);
            sb.append(",[");
            buildJsMessage(sb);
            sb.append("],");
            sb.append(this.pluginResult.getKeepCallback());
            sb.append(");");
        }

        /* access modifiers changed from: package-private */
        public void encodeAsMessage(StringBuilder sb) {
            boolean z3;
            char c4;
            char c5;
            PluginResult pluginResult2 = this.pluginResult;
            if (pluginResult2 == null) {
                sb.append('J');
                sb.append(this.jsPayloadOrCallbackId);
                return;
            }
            int status = pluginResult2.getStatus();
            boolean z4 = false;
            if (status == PluginResult.Status.NO_RESULT.ordinal()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (status == PluginResult.Status.OK.ordinal()) {
                z4 = true;
            }
            boolean keepCallback = this.pluginResult.getKeepCallback();
            if (z3 || z4) {
                c4 = 'S';
            } else {
                c4 = 'F';
            }
            sb.append(c4);
            if (keepCallback) {
                c5 = '1';
            } else {
                c5 = '0';
            }
            sb.append(c5);
            sb.append(status);
            sb.append(' ');
            sb.append(this.jsPayloadOrCallbackId);
            sb.append(' ');
            encodeAsMessageHelper(sb, this.pluginResult);
        }

        JsMessage(PluginResult pluginResult2, String str) {
            if (str == null || pluginResult2 == null) {
                throw null;
            }
            this.jsPayloadOrCallbackId = str;
            this.pluginResult = pluginResult2;
        }
    }
}
