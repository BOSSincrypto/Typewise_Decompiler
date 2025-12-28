package J;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.g;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f588a = new String[0];

    private static class a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i4) {
            editorInfo.setInitialSurroundingSubText(charSequence, i4);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] a4 = editorInfo.contentMimeTypes;
            if (a4 != null) {
                return a4;
            }
            return f588a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f588a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray != null) {
            return stringArray;
        }
        return f588a;
    }

    private static boolean b(CharSequence charSequence, int i4, int i5) {
        if (i5 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i4));
        }
        if (i5 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i4));
    }

    private static boolean c(int i4) {
        int i5 = i4 & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            return true;
        }
        return false;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i4) {
        int i5;
        int i6;
        g.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i4);
            return;
        }
        int i7 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        if (i7 > i8) {
            i5 = i8 - i4;
        } else {
            i5 = i7 - i4;
        }
        if (i7 > i8) {
            i6 = i7 - i4;
        } else {
            i6 = i8 - i4;
        }
        int length = charSequence.length();
        if (i4 < 0 || i5 < 0 || i6 > length) {
            g(editorInfo, (CharSequence) null, 0, 0);
        } else if (c(editorInfo.inputType)) {
            g(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i5, i6);
        } else {
            h(editorInfo, charSequence, i5, i6);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        int i6;
        CharSequence charSequence2;
        int i7 = i5 - i4;
        if (i7 > 1024) {
            i6 = 0;
        } else {
            i6 = i7;
        }
        int i8 = 2048 - i6;
        int min = Math.min(charSequence.length() - i5, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (b(charSequence, i9, 0)) {
            i9++;
            min2--;
        }
        if (b(charSequence, (i5 + min) - 1, 1)) {
            min--;
        }
        int i10 = min2 + i6 + min;
        if (i6 != i7) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i5, min + i5)});
        } else {
            charSequence2 = charSequence.subSequence(i9, i10 + i9);
        }
        g(editorInfo, charSequence2, min2, i6 + min2);
    }
}
