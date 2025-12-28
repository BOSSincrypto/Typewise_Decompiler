package androidx.browser.customtabs;

import android.os.Bundle;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f3680a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f3681b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f3682c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f3683d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    public static final class C0056a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f3684a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f3685b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f3686c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f3687d;

        public a a() {
            return new a(this.f3684a, this.f3685b, this.f3686c, this.f3687d);
        }

        public C0056a b(int i4) {
            this.f3684a = Integer.valueOf(i4 | -16777216);
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f3680a = num;
        this.f3681b = num2;
        this.f3682c = num3;
        this.f3683d = num4;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f3680a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f3681b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f3682c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f3683d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
