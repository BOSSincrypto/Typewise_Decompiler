package com.getcapacitor.plugin.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.StrictMode;
import androidx.core.content.FileProvider;
import com.getcapacitor.Bridge;
import com.getcapacitor.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public final class AssetUtil {
    public static final int RESOURCE_ID_ZERO_VALUE = 0;
    private static final String STORAGE_FOLDER = "/capacitorassets";
    private final Context context;

    private AssetUtil(Context context2) {
        this.context = context2;
    }

    private void copyFile(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
            } catch (Exception e4) {
                Logger.error("Error copying", e4);
                return;
            }
        }
    }

    private String getBaseName(String str) {
        String str2;
        if (str.contains("/")) {
            str2 = str.substring(str.lastIndexOf(47) + 1);
        } else {
            str2 = str;
        }
        if (str.contains(".")) {
            return str2.substring(0, str2.lastIndexOf(46));
        }
        return str2;
    }

    public static AssetUtil getInstance(Context context2) {
        return new AssetUtil(context2);
    }

    private String getPkgName(Resources resources) {
        if (resources == Resources.getSystem()) {
            return "android";
        }
        return this.context.getPackageName();
    }

    public static String getResourceBaseName(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("/")) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        if (str.contains(".")) {
            return str.substring(0, str.lastIndexOf(46));
        }
        return str;
    }

    public static int getResourceID(Context context2, String str, String str2) {
        return context2.getResources().getIdentifier(str, str2, context2.getPackageName());
    }

    private File getTmpFile() {
        return getTmpFile(UUID.randomUUID().toString());
    }

    private Uri getUriForResourcePath(String str) {
        Resources resources = this.context.getResources();
        String replaceFirst = str.replaceFirst("res://", "");
        int resId = getResId(replaceFirst);
        if (resId != 0) {
            return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(resId)).appendPath(resources.getResourceTypeName(resId)).appendPath(resources.getResourceEntryName(resId)).build();
        }
        Logger.error("File not found: " + replaceFirst);
        return Uri.EMPTY;
    }

    private Uri getUriFromAsset(String str) {
        String replaceFirst = str.replaceFirst("file:/", "www").replaceFirst("\\?.*$", "");
        File tmpFile = getTmpFile(replaceFirst.substring(replaceFirst.lastIndexOf(47) + 1));
        if (tmpFile == null) {
            return Uri.EMPTY;
        }
        try {
            copyFile(this.context.getAssets().open(replaceFirst), new FileOutputStream(tmpFile));
            return getUriFromFile(tmpFile);
        } catch (Exception unused) {
            Logger.error("File not found: assets/" + replaceFirst);
            return Uri.EMPTY;
        }
    }

    private Uri getUriFromFile(File file) {
        try {
            return FileProvider.g(this.context, this.context.getPackageName() + ".provider", file);
        } catch (IllegalArgumentException e4) {
            Logger.error("File not supported by provider", e4);
            return Uri.EMPTY;
        }
    }

    private Uri getUriFromPath(String str) {
        File file = new File(str.replaceFirst("file://", "").replaceFirst("\\?.*$", ""));
        if (file.exists()) {
            return getUriFromFile(file);
        }
        Logger.error("File not found: " + file.getAbsolutePath());
        return Uri.EMPTY;
    }

    private Uri getUriFromRemote(String str) {
        File tmpFile = getTmpFile();
        if (tmpFile == null) {
            return Uri.EMPTY;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            copyFile(httpURLConnection.getInputStream(), new FileOutputStream(tmpFile));
            return getUriFromFile(tmpFile);
        } catch (MalformedURLException e4) {
            Logger.error(Logger.tags("Asset"), "Incorrect URL", e4);
            return Uri.EMPTY;
        } catch (FileNotFoundException e5) {
            Logger.error(Logger.tags("Asset"), "Failed to create new File from HTTP Content", e5);
            return Uri.EMPTY;
        } catch (IOException e6) {
            Logger.error(Logger.tags("Asset"), "No Input can be created from http Stream", e6);
            return Uri.EMPTY;
        }
    }

    public Bitmap getIconFromUri(Uri uri) {
        return BitmapFactory.decodeStream(this.context.getContentResolver().openInputStream(uri));
    }

    public int getResId(String str) {
        int resId = getResId(this.context.getResources(), str);
        return resId == 0 ? getResId(Resources.getSystem(), str) : resId;
    }

    public Uri parse(String str) {
        if (str == null || str.isEmpty()) {
            return Uri.EMPTY;
        }
        if (str.startsWith("res:")) {
            return getUriForResourcePath(str);
        }
        if (str.startsWith("file:///")) {
            return getUriFromPath(str);
        }
        if (str.startsWith("file://")) {
            return getUriFromAsset(str);
        }
        if (str.startsWith(Bridge.CAPACITOR_HTTP_SCHEME)) {
            return getUriFromRemote(str);
        }
        if (str.startsWith("content://")) {
            return Uri.parse(str);
        }
        return Uri.EMPTY;
    }

    private File getTmpFile(String str) {
        File externalCacheDir = this.context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.context.getCacheDir();
        }
        if (externalCacheDir == null) {
            Logger.error(Logger.tags("Asset"), "Missing cache dir", (Throwable) null);
            return null;
        }
        String str2 = externalCacheDir.toString() + STORAGE_FOLDER;
        new File(str2).mkdir();
        return new File(str2, str);
    }

    private int getResId(Resources resources, String str) {
        String pkgName = getPkgName(resources);
        String baseName = getBaseName(str);
        int identifier = resources.getIdentifier(baseName, "mipmap", pkgName);
        if (identifier == 0) {
            identifier = resources.getIdentifier(baseName, "drawable", pkgName);
        }
        return identifier == 0 ? resources.getIdentifier(baseName, "raw", pkgName) : identifier;
    }
}
