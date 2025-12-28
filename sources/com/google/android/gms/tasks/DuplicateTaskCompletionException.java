package com.google.android.gms.tasks;

import y1.C0950d;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException of(C0950d dVar) {
        String str;
        if (!dVar.g()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception d4 = dVar.d();
        if (d4 != null) {
            str = "failure";
        } else if (dVar.h()) {
            str = "result ".concat(String.valueOf(dVar.e()));
        } else if (dVar.f()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), d4);
    }
}
