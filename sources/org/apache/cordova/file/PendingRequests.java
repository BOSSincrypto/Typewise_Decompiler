package org.apache.cordova.file;

import android.util.SparseArray;
import org.apache.cordova.CallbackContext;

class PendingRequests {
    /* access modifiers changed from: private */
    public int currentReqId = 0;
    private SparseArray<Request> requests = new SparseArray<>();

    public class Request {
        private int action;
        private CallbackContext callbackContext;
        private String rawArgs;
        /* access modifiers changed from: private */
        public int requestCode;

        public int getAction() {
            return this.action;
        }

        public CallbackContext getCallbackContext() {
            return this.callbackContext;
        }

        public String getRawArgs() {
            return this.rawArgs;
        }

        private Request(String str, int i4, CallbackContext callbackContext2) {
            this.rawArgs = str;
            this.action = i4;
            this.callbackContext = callbackContext2;
            int a4 = PendingRequests.this.currentReqId;
            PendingRequests.this.currentReqId = a4 + 1;
            this.requestCode = a4;
        }
    }

    PendingRequests() {
    }

    public synchronized int createRequest(String str, int i4, CallbackContext callbackContext) {
        Request request;
        request = new Request(str, i4, callbackContext);
        this.requests.put(request.requestCode, request);
        return request.requestCode;
    }

    public synchronized Request getAndRemove(int i4) {
        Request request;
        request = this.requests.get(i4);
        this.requests.remove(i4);
        return request;
    }
}
