package com.capacitor.rateApp;

import U1.a;
import U1.b;
import U1.c;
import androidx.appcompat.app.C0370d;
import com.getcapacitor.PluginCall;
import y1.C0947a;
import y1.C0948b;
import y1.C0949c;
import y1.C0950d;

public class CapacitorRateApp {
    public void requestReview(final PluginCall pluginCall, final C0370d dVar) {
        final b a4 = c.a(dVar);
        C0950d a5 = a4.a();
        a5.b(new C0948b() {
            public void onFailure(Exception exc) {
                exc.printStackTrace();
                pluginCall.reject("Request review failed", exc);
            }
        });
        a5.a(new C0947a() {
            public void onComplete(C0950d dVar) {
                if (dVar.h()) {
                    C0950d b4 = a4.b(dVar, (a) dVar.e());
                    b4.a(new C0947a() {
                        public void onComplete(C0950d dVar) {
                            pluginCall.resolve();
                        }
                    });
                    b4.c(new C0949c() {
                        public void onSuccess(Void voidR) {
                            pluginCall.resolve();
                        }
                    });
                    b4.b(new C0948b() {
                        public void onFailure(Exception exc) {
                            exc.printStackTrace();
                            pluginCall.reject("Request review flow Failed", exc);
                        }
                    });
                    return;
                }
                pluginCall.reject("Request review task Failed");
            }
        });
    }
}
