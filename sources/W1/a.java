package W1;

import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f1698a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f1699b;

    static {
        HashMap hashMap = new HashMap();
        f1698a = hashMap;
        HashMap hashMap2 = new HashMap();
        f1699b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i4) {
        Map map = f1698a;
        Integer valueOf = Integer.valueOf(i4);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f1699b.get(valueOf)) + ")";
    }
}
