package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public abstract class i implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    final Window.Callback f2808a;

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i4) {
            return callback.onWindowStartingActionMode(callback2, i4);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i4) {
            callback.onProvideKeyboardShortcuts(list, menu, i4);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean z3) {
            callback.onPointerCaptureChanged(z3);
        }
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f2808a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f2808a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2808a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2808a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f2808a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2808a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2808a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2808a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f2808a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f2808a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f2808a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i4, Menu menu) {
        return this.f2808a.onCreatePanelMenu(i4, menu);
    }

    public View onCreatePanelView(int i4) {
        return this.f2808a.onCreatePanelView(i4);
    }

    public void onDetachedFromWindow() {
        this.f2808a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f2808a.onMenuItemSelected(i4, menuItem);
    }

    public boolean onMenuOpened(int i4, Menu menu) {
        return this.f2808a.onMenuOpened(i4, menu);
    }

    public void onPanelClosed(int i4, Menu menu) {
        this.f2808a.onPanelClosed(i4, menu);
    }

    public void onPointerCaptureChanged(boolean z3) {
        c.a(this.f2808a, z3);
    }

    public boolean onPreparePanel(int i4, View view, Menu menu) {
        return this.f2808a.onPreparePanel(i4, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        b.a(this.f2808a, list, menu, i4);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f2808a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2808a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z3) {
        this.f2808a.onWindowFocusChanged(z3);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        return a.b(this.f2808a, callback, i4);
    }

    public boolean onSearchRequested() {
        return this.f2808a.onSearchRequested();
    }
}
