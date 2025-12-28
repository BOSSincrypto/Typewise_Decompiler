package com.capacitorjs.plugins.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.webkit.WebView;

public class Device {
    private Context context;

    Device(Context context2) {
        this.context = context2;
    }

    public float getBatteryLevel() {
        int i4;
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i5 = -1;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            i4 = registerReceiver.getIntExtra("scale", -1);
            i5 = intExtra;
        } else {
            i4 = -1;
        }
        return ((float) i5) / ((float) i4);
    }

    public long getDiskFree() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public long getDiskTotal() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public long getMemUsed() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public String getName() {
        if (Build.VERSION.SDK_INT >= 25) {
            return Settings.Global.getString(this.context.getContentResolver(), "device_name");
        }
        return null;
    }

    public String getPlatform() {
        return "android";
    }

    public long getRealDiskFree() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public long getRealDiskTotal() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public String getUuid() {
        return Settings.Secure.getString(this.context.getContentResolver(), "android_id");
    }

    public String getWebViewVersion() {
        PackageInfo packageInfo;
        String str;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            if (i4 >= 24) {
                str = "com.android.chrome";
            } else {
                str = "com.google.android.webview";
            }
            try {
                packageInfo = this.context.getPackageManager().getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException e4) {
                e4.printStackTrace();
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return Build.VERSION.RELEASE;
    }

    public boolean isCharging() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public boolean isVirtual() {
        if (Build.FINGERPRINT.contains("generic") || Build.PRODUCT.contains("sdk")) {
            return true;
        }
        return false;
    }
}
