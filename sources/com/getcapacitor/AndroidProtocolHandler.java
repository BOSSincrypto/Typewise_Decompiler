package com.getcapacitor;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class AndroidProtocolHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Context context;

    public AndroidProtocolHandler(Context context2) {
        this.context = context2;
    }

    private static int getFieldId(Context context2, String str, String str2) {
        ClassLoader classLoader = context2.getClassLoader();
        return classLoader.loadClass(context2.getPackageName() + ".R$" + str).getField(str2).getInt((Object) null);
    }

    private static int getValueType(Context context2, int i4) {
        TypedValue typedValue = new TypedValue();
        context2.getResources().getValue(i4, typedValue, true);
        return typedValue.type;
    }

    public InputStream openAsset(String str) {
        return this.context.getAssets().open(str, 2);
    }

    public InputStream openContentUrl(Uri uri) {
        int port = uri.getPort();
        Integer valueOf = Integer.valueOf(port);
        String str = uri.getScheme() + "://" + uri.getHost();
        if (port != -1) {
            str = str + ":" + valueOf;
        }
        try {
            return this.context.getContentResolver().openInputStream(Uri.parse(uri.toString().replace(str + Bridge.CAPACITOR_CONTENT_START, "content:/")));
        } catch (SecurityException e4) {
            Logger.error("Unable to open content URL: " + uri, e4);
            return null;
        }
    }

    public InputStream openFile(String str) {
        return new FileInputStream(new File(str.replace(Bridge.CAPACITOR_FILE_START, "")));
    }

    public InputStream openResource(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(pathSegments.size() - 2);
        String str2 = pathSegments.get(pathSegments.size() - 1).split("\\.")[0];
        try {
            if (this.context.getApplicationContext() != null) {
                this.context = this.context.getApplicationContext();
            }
            int fieldId = getFieldId(this.context, str, str2);
            if (getValueType(this.context, fieldId) == 3) {
                return this.context.getResources().openRawResource(fieldId);
            }
            Logger.error("Asset not of type string: " + uri);
            return null;
        } catch (ClassNotFoundException e4) {
            e = e4;
            Logger.error("Unable to open resource URL: " + uri, e);
            return null;
        } catch (IllegalAccessException e5) {
            e = e5;
            Logger.error("Unable to open resource URL: " + uri, e);
            return null;
        } catch (NoSuchFieldException e6) {
            e = e6;
            Logger.error("Unable to open resource URL: " + uri, e);
            return null;
        }
    }
}
