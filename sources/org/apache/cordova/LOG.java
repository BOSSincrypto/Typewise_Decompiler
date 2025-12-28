package org.apache.cordova;

import android.util.Log;

public class LOG {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static int LOGLEVEL = 6;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
        if (6 >= LOGLEVEL) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
    }

    public static boolean isLoggable(int i4) {
        if (i4 >= LOGLEVEL) {
            return true;
        }
        return false;
    }

    public static void setLogLevel(int i4) {
        LOGLEVEL = i4;
        StringBuilder sb = new StringBuilder();
        sb.append("Changing log level to ");
        sb.append(i4);
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
        if (5 >= LOGLEVEL) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2, Throwable th) {
        if (6 >= LOGLEVEL) {
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, Throwable th) {
        if (5 >= LOGLEVEL) {
            Log.w(str, th);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (3 >= LOGLEVEL) {
            String.format(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (6 >= LOGLEVEL) {
            Log.e(str, String.format(str2, objArr));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (4 >= LOGLEVEL) {
            String.format(str2, objArr);
        }
    }

    public static void setLogLevel(String str) {
        if ("VERBOSE".equals(str)) {
            LOGLEVEL = 2;
        } else if ("DEBUG".equals(str)) {
            LOGLEVEL = 3;
        } else if ("INFO".equals(str)) {
            LOGLEVEL = 4;
        } else if ("WARN".equals(str)) {
            LOGLEVEL = 5;
        } else if ("ERROR".equals(str)) {
            LOGLEVEL = 6;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Changing log level to ");
        sb.append(str);
        sb.append("(");
        sb.append(LOGLEVEL);
        sb.append(")");
    }

    public static void v(String str, String str2, Object... objArr) {
        if (2 >= LOGLEVEL) {
            String.format(str2, objArr);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (5 >= LOGLEVEL) {
            Log.w(str, str2, th);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (5 >= LOGLEVEL) {
            Log.w(str, String.format(str2, objArr));
        }
    }
}
