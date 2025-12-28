package com.capacitorjs.plugins.keyboard;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0370d;
import com.getcapacitor.Logger;

public class Keyboard {
    static final String EVENT_KB_DID_HIDE = "keyboardDidHide";
    static final String EVENT_KB_DID_SHOW = "keyboardDidShow";
    static final String EVENT_KB_WILL_HIDE = "keyboardWillHide";
    static final String EVENT_KB_WILL_SHOW = "keyboardWillShow";
    private C0370d activity;
    /* access modifiers changed from: private */
    public FrameLayout.LayoutParams frameLayoutParams = ((FrameLayout.LayoutParams) this.mChildOfContent.getLayoutParams());
    /* access modifiers changed from: private */
    public KeyboardEventListener keyboardEventListener;
    private ViewTreeObserver.OnGlobalLayoutListener list;
    /* access modifiers changed from: private */
    public View mChildOfContent;
    /* access modifiers changed from: private */
    public View rootView;
    /* access modifiers changed from: private */
    public int usableHeightPrevious;

    interface KeyboardEventListener {
        void onKeyboardEvent(String str, int i4);
    }

    public Keyboard(final C0370d dVar, final boolean z3) {
        this.activity = dVar;
        final float f4 = dVar.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = (FrameLayout) dVar.getWindow().getDecorView().findViewById(16908290);
        this.rootView = frameLayout.getRootView();
        this.list = new ViewTreeObserver.OnGlobalLayoutListener() {
            int previousHeightDiff = 0;

            private int computeUsableHeight() {
                Rect rect = new Rect();
                Keyboard.this.mChildOfContent.getWindowVisibleDisplayFrame(rect);
                if (isOverlays()) {
                    return rect.bottom;
                }
                return rect.height();
            }

            private boolean isOverlays() {
                if ((dVar.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024) {
                    return true;
                }
                return false;
            }

            private void possiblyResizeChildOfContent() {
                int computeUsableHeight = computeUsableHeight();
                if (Keyboard.this.usableHeightPrevious != computeUsableHeight) {
                    Keyboard.this.frameLayoutParams.height = computeUsableHeight;
                    Keyboard.this.mChildOfContent.requestLayout();
                    Keyboard.this.usableHeightPrevious = computeUsableHeight;
                }
            }

            public void onGlobalLayout() {
                int g4;
                if (z3) {
                    possiblyResizeChildOfContent();
                }
                Rect rect = new Rect();
                Keyboard.this.rootView.getWindowVisibleDisplayFrame(rect);
                int height = Keyboard.this.rootView.getRootView().getHeight();
                int i4 = rect.bottom;
                if (Build.VERSION.SDK_INT >= 30) {
                    g4 = Keyboard.this.rootView.getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).bottom;
                } else {
                    g4 = Keyboard.this.getLegacyStableInsetBottom(Keyboard.this.rootView.getRootWindowInsets());
                }
                int i5 = (int) (((float) (height - (i4 + g4))) / f4);
                if (Keyboard.this.keyboardEventListener == null) {
                    Logger.warn("Native Keyboard Event Listener not found");
                } else if (i5 <= 100 || i5 == this.previousHeightDiff) {
                    int i6 = this.previousHeightDiff;
                    if (i5 != i6 && i6 - i5 > 100) {
                        Keyboard.this.keyboardEventListener.onKeyboardEvent(Keyboard.EVENT_KB_WILL_HIDE, 0);
                        Keyboard.this.keyboardEventListener.onKeyboardEvent(Keyboard.EVENT_KB_DID_HIDE, 0);
                    }
                } else {
                    Keyboard.this.keyboardEventListener.onKeyboardEvent(Keyboard.EVENT_KB_WILL_SHOW, i5);
                    Keyboard.this.keyboardEventListener.onKeyboardEvent(Keyboard.EVENT_KB_DID_SHOW, i5);
                }
                this.previousHeightDiff = i5;
            }
        };
        this.mChildOfContent = frameLayout.getChildAt(0);
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.list);
    }

    private Point getLegacySizePoint() {
        Display defaultDisplay = this.activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* access modifiers changed from: private */
    public int getLegacyStableInsetBottom(WindowInsets windowInsets) {
        return windowInsets.getStableInsetBottom();
    }

    public KeyboardEventListener getKeyboardEventListener() {
        return this.keyboardEventListener;
    }

    public boolean hide() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
        View currentFocus = this.activity.getCurrentFocus();
        if (currentFocus == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        return true;
    }

    public void setKeyboardEventListener(KeyboardEventListener keyboardEventListener2) {
        this.keyboardEventListener = keyboardEventListener2;
    }

    public void show() {
        ((InputMethodManager) this.activity.getSystemService("input_method")).showSoftInput(this.activity.getCurrentFocus(), 0);
    }
}
