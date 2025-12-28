package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0412d;
import androidx.core.view.D;

public final class k implements D {

    private static final class a {
        static CharSequence a(Context context, ClipData.Item item, int i4) {
            if ((i4 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
    }

    private static CharSequence b(Context context, ClipData.Item item, int i4) {
        return a.a(context, item, i4);
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    public C0412d a(View view, C0412d dVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(dVar);
        }
        if (dVar.d() == 2) {
            return dVar;
        }
        ClipData b4 = dVar.b();
        int c4 = dVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i4 = 0; i4 < b4.getItemCount(); i4++) {
            CharSequence b5 = b(context, b4.getItemAt(i4), c4);
            if (b5 != null) {
                if (!z3) {
                    c(editable, b5);
                    z3 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b5);
                }
            }
        }
        return null;
    }
}
