package com.google.android.play.core.review;

import W1.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

public class ReviewException extends ApiException {
    public ReviewException(int i4) {
        super(new Status(i4, String.format(Locale.getDefault(), "Review Error(%d): %s", new Object[]{Integer.valueOf(i4), a.a(i4)})));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
