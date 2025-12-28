package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class m0 extends U {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f3640c;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f3641b;

    public m0(Context context, Resources resources) {
        super(resources);
        this.f3641b = new WeakReference(context);
    }

    public static boolean b() {
        return f3640c;
    }

    public static boolean c() {
        b();
        return false;
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i4) {
        return super.getAnimation(i4);
    }

    public /* bridge */ /* synthetic */ boolean getBoolean(int i4) {
        return super.getBoolean(i4);
    }

    public /* bridge */ /* synthetic */ int getColor(int i4) {
        return super.getColor(i4);
    }

    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i4) {
        return super.getColorStateList(i4);
    }

    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    public /* bridge */ /* synthetic */ float getDimension(int i4) {
        return super.getDimension(i4);
    }

    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i4) {
        return super.getDimensionPixelOffset(i4);
    }

    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i4) {
        return super.getDimensionPixelSize(i4);
    }

    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    public /* bridge */ /* synthetic */ Drawable getDrawable(int i4, Resources.Theme theme) {
        return super.getDrawable(i4, theme);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i4, int i5) {
        return super.getDrawableForDensity(i4, i5);
    }

    public /* bridge */ /* synthetic */ float getFraction(int i4, int i5, int i6) {
        return super.getFraction(i4, i5, i6);
    }

    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ int[] getIntArray(int i4) {
        return super.getIntArray(i4);
    }

    public /* bridge */ /* synthetic */ int getInteger(int i4) {
        return super.getInteger(i4);
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i4) {
        return super.getLayout(i4);
    }

    public /* bridge */ /* synthetic */ Movie getMovie(int i4) {
        return super.getMovie(i4);
    }

    public /* bridge */ /* synthetic */ String getQuantityString(int i4, int i5) {
        return super.getQuantityString(i4, i5);
    }

    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i4, int i5) {
        return super.getQuantityText(i4, i5);
    }

    public /* bridge */ /* synthetic */ String getResourceEntryName(int i4) {
        return super.getResourceEntryName(i4);
    }

    public /* bridge */ /* synthetic */ String getResourceName(int i4) {
        return super.getResourceName(i4);
    }

    public /* bridge */ /* synthetic */ String getResourcePackageName(int i4) {
        return super.getResourcePackageName(i4);
    }

    public /* bridge */ /* synthetic */ String getResourceTypeName(int i4) {
        return super.getResourceTypeName(i4);
    }

    public /* bridge */ /* synthetic */ String getString(int i4) {
        return super.getString(i4);
    }

    public /* bridge */ /* synthetic */ String[] getStringArray(int i4) {
        return super.getStringArray(i4);
    }

    public /* bridge */ /* synthetic */ CharSequence getText(int i4) {
        return super.getText(i4);
    }

    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i4) {
        return super.getTextArray(i4);
    }

    public /* bridge */ /* synthetic */ void getValue(int i4, TypedValue typedValue, boolean z3) {
        super.getValue(i4, typedValue, z3);
    }

    public /* bridge */ /* synthetic */ void getValueForDensity(int i4, int i5, TypedValue typedValue, boolean z3) {
        super.getValueForDensity(i4, i5, typedValue, z3);
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i4) {
        return super.getXml(i4);
    }

    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i4) {
        return super.obtainTypedArray(i4);
    }

    public /* bridge */ /* synthetic */ InputStream openRawResource(int i4) {
        return super.openRawResource(i4);
    }

    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i4) {
        return super.openRawResourceFd(i4);
    }

    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    public Drawable getDrawable(int i4) {
        Context context = (Context) this.f3641b.get();
        if (context != null) {
            return T.h().t(context, this, i4);
        }
        return a(i4);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i4, int i5, Resources.Theme theme) {
        return super.getDrawableForDensity(i4, i5, theme);
    }

    public /* bridge */ /* synthetic */ String getQuantityString(int i4, int i5, Object[] objArr) {
        return super.getQuantityString(i4, i5, objArr);
    }

    public /* bridge */ /* synthetic */ String getString(int i4, Object[] objArr) {
        return super.getString(i4, objArr);
    }

    public /* bridge */ /* synthetic */ CharSequence getText(int i4, CharSequence charSequence) {
        return super.getText(i4, charSequence);
    }

    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z3) {
        super.getValue(str, typedValue, z3);
    }

    public /* bridge */ /* synthetic */ InputStream openRawResource(int i4, TypedValue typedValue) {
        return super.openRawResource(i4, typedValue);
    }
}
