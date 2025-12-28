package c;

import android.content.SharedPreferences;

/* renamed from: c.c  reason: case insensitive filesystem */
public abstract class C0490c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f7507a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f7508b = true;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f7509c = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f7510d = true;

    /* renamed from: e  reason: collision with root package name */
    private static int f7511e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f7512f = false;

    /* renamed from: g  reason: collision with root package name */
    private static String f7513g = "";

    /* renamed from: h  reason: collision with root package name */
    public static boolean f7514h = true;

    public static String a() {
        return f7513g;
    }

    public static void b(SharedPreferences sharedPreferences) {
        f7507a = sharedPreferences.getBoolean("settings_userspecificlanguage", false);
        f7508b = sharedPreferences.getBoolean("settings_predictions", true);
        f7509c = sharedPreferences.getBoolean("settings_learningmode", true);
        f7510d = sharedPreferences.getBoolean("use_dictionaries", true);
        f7512f = sharedPreferences.getBoolean("optimizeDictionary", false);
        f7513g = sharedPreferences.getString("settings_reset", "");
        f7514h = sharedPreferences.getBoolean("settings_easymode_button", true);
        f7511e = sharedPreferences.getInt("emoji_font", 0);
    }

    public static boolean c() {
        return f7509c;
    }

    public static boolean d() {
        return f7508b;
    }
}
