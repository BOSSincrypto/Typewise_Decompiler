package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0412d;
import androidx.core.view.P;

/* renamed from: androidx.appcompat.widget.x  reason: case insensitive filesystem */
abstract class C0399x {

    /* renamed from: androidx.appcompat.widget.x$a */
    private static final class a {
        /* JADX INFO: finally extract failed */
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                P.e0(textView, new C0412d.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            P.e0(view, new C0412d.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    static boolean a(View view, DragEvent dragEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31 && i4 >= 24 && dragEvent.getLocalState() == null && P.E(view) != null) {
            Activity c4 = c(view);
            if (c4 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return a.a(dragEvent, (TextView) view, c4);
                    }
                    return a.b(dragEvent, view, c4);
                }
            }
        }
        return false;
    }

    static boolean b(TextView textView, int i4) {
        ClipData clipData;
        int i5 = 0;
        if (Build.VERSION.SDK_INT >= 31 || P.E(textView) == null || (i4 != 16908322 && i4 != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            C0412d.a aVar = new C0412d.a(clipData, 1);
            if (i4 != 16908322) {
                i5 = 1;
            }
            P.e0(textView, aVar.c(i5).a());
        }
        return true;
    }

    static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
