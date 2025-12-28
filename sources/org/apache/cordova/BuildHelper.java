package org.apache.cordova;

import android.content.Context;

public class BuildHelper {
    private static String TAG = "BuildHelper";

    public static Object getBuildConfigValue(Context context, String str) {
        try {
            return Class.forName(context.getClass().getPackage().getName() + ".BuildConfig").getField(str).get((Object) null);
        } catch (ClassNotFoundException e4) {
            LOG.d(TAG, "Unable to get the BuildConfig, is this built with ANT?");
            e4.printStackTrace();
            return null;
        } catch (NoSuchFieldException unused) {
            String str2 = TAG;
            LOG.d(str2, str + " is not a valid field. Check your build.gradle");
            return null;
        } catch (IllegalAccessException e5) {
            LOG.d(TAG, "Illegal Access Exception: Let's print a stack trace.");
            e5.printStackTrace();
            return null;
        } catch (NullPointerException e6) {
            LOG.d(TAG, "Null Pointer Exception: Let's print a stack trace.");
            e6.printStackTrace();
            return null;
        }
    }
}
