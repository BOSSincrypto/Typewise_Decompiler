package i2;

import J2.G0;
import J2.K;
import J2.O;
import K2.C0341a;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.icoaching.wrio.SharedPreferencesKt;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import ch.icoaching.wrio.ai_assistant.ui.a;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import ch.icoaching.wrio.keyboard.L;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k2.C0705a;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.c;
import u2.l;

/* renamed from: i2.a  reason: case insensitive filesystem */
public final class C0680a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13724a;

    /* renamed from: b  reason: collision with root package name */
    private final C0341a f13725b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f13726c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedPreferences.Editor f13727d;

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    public static final class C0192a {

        /* renamed from: a  reason: collision with root package name */
        private final Map f13728a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f13729b;

        public C0192a(Map map, Map map2) {
            o.e(map, "lowerCaseShortcuts");
            o.e(map2, "shortcuts");
            this.f13728a = map;
            this.f13729b = map2;
        }

        public final Map a() {
            return this.f13728a;
        }

        public final Map b() {
            return this.f13729b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0192a)) {
                return false;
            }
            C0192a aVar = (C0192a) obj;
            if (o.a(this.f13728a, aVar.f13728a) && o.a(this.f13729b, aVar.f13729b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13728a.hashCode() * 31) + this.f13729b.hashCode();
        }

        public String toString() {
            return "Shortcuts(lowerCaseShortcuts=" + this.f13728a + ", shortcuts=" + this.f13729b + ')';
        }
    }

    public C0680a(Context context, C0341a aVar) {
        o.e(context, "applicationContext");
        o.e(aVar, "json");
        this.f13724a = context;
        this.f13725b = aVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        o.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f13726c = defaultSharedPreferences;
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        o.d(edit, "edit(...)");
        this.f13727d = edit;
        N0();
    }

    private final void N0() {
        if (!this.f13726c.contains("install_date")) {
            this.f13727d.putLong("install_date", System.currentTimeMillis() / 1000).apply();
        }
        if (this.f13726c.getInt("settings_version", 0) < 1) {
            new C0705a(this.f13724a, this.f13726c, this.f13727d).a();
            this.f13727d.putInt("settings_version", 1).apply();
        }
    }

    public final void A(long j4) {
        this.f13726c.edit().putLong("last_shown", j4).apply();
    }

    public final boolean A0() {
        if (this.f13726c.contains("flickdown_to_undo")) {
            return this.f13726c.getBoolean("flickdown_to_undo", false);
        }
        return false;
    }

    public final void B(a aVar) {
        o.e(aVar, "value");
        C0341a.C0006a aVar2 = C0341a.f812d;
        aVar2.a();
        this.f13726c.edit().putString("lastUsedAiAssistantPrompt", aVar2.b(a.f9202d.serializer(), aVar)).apply();
    }

    public final List B0() {
        ArrayList arrayList;
        int i4 = 0;
        if (this.f13726c.contains("split1_customcharacters")) {
            String string = this.f13726c.getString("split1_customcharacters", ":;");
            o.b(string);
            arrayList = new ArrayList(string.length());
            while (i4 < string.length()) {
                arrayList.add(Character.valueOf(string.charAt(i4)));
                i4++;
            }
        } else {
            arrayList = new ArrayList(2);
            while (i4 < 2) {
                arrayList.add(Character.valueOf(":;".charAt(i4)));
                i4++;
            }
        }
        return arrayList;
    }

    public final void C(KeyboardLayoutType keyboardLayoutType) {
        o.e(keyboardLayoutType, "value");
        this.f13726c.edit().putString("keyboardLayout", keyboardLayoutType.getValue()).apply();
    }

    public final boolean C0() {
        if (this.f13726c.contains("tutorialDone")) {
            return this.f13726c.getBoolean("tutorialDone", false);
        }
        return false;
    }

    public final void D(String str) {
        this.f13726c.edit().putString("themeType_darkMode", str).apply();
    }

    public final boolean D0() {
        if (this.f13726c.contains("is_unlock_ai_assistant_banner_closed_by_user")) {
            return this.f13726c.getBoolean("is_unlock_ai_assistant_banner_closed_by_user", false);
        }
        return false;
    }

    public final void E(Map map) {
        o.e(map, "promptUsage");
        SharedPreferences.Editor edit = this.f13726c.edit();
        C0341a.C0006a aVar = C0341a.f812d;
        aVar.a();
        edit.putString("aiPromptUsageData", aVar.b(new O(PromptItemType.Companion.serializer(), K.f636a), map));
        edit.apply();
    }

    public final String E0() {
        if (!this.f13726c.contains("inapp_product_ids")) {
            return "";
        }
        String string = this.f13726c.getString("inapp_product_ids", "");
        o.b(string);
        return string;
    }

    public final void F(boolean z3) {
        this.f13726c.edit().putBoolean("settings_aiassistant_relay_server", z3).apply();
    }

    public final boolean F0() {
        if (this.f13726c.contains("settings_userspecificlanguage")) {
            return this.f13726c.getBoolean("settings_userspecificlanguage", false);
        }
        return false;
    }

    public final boolean G() {
        if (this.f13726c.contains("database_building")) {
            return this.f13726c.getBoolean("database_building", false);
        }
        return false;
    }

    public final long G0() {
        if (!this.f13726c.contains("install_date")) {
            return 0;
        }
        try {
            return this.f13726c.getLong("install_date", 0);
        } catch (ClassCastException unused) {
            return (long) this.f13726c.getInt("install_date", 0);
        }
    }

    public final int H() {
        if (this.f13726c.contains("settings_autocaps_level")) {
            return this.f13726c.getInt("settings_autocaps_level", 2);
        }
        return 2;
    }

    public final boolean H0() {
        if (this.f13726c.contains("settings_vibration_feedback")) {
            return this.f13726c.getBoolean("settings_vibration_feedback", false);
        }
        return false;
    }

    public final void I(int i4) {
        this.f13726c.edit().putInt("autocorrectionCounter", i4).apply();
    }

    public final KeyboardLayoutType I0() {
        String string;
        if (!this.f13726c.contains("keyboardLayout") || (string = this.f13726c.getString("keyboardLayout", (String) null)) == null) {
            return null;
        }
        return L.a(string);
    }

    public final void J(long j4) {
        this.f13726c.edit().putLong("PurchaseValidationInfoDate", j4).apply();
    }

    public final c J0() {
        return SharedPreferencesKt.a(this.f13726c);
    }

    public final void K(KeyboardLayoutType keyboardLayoutType) {
        o.e(keyboardLayoutType, "value");
        this.f13726c.edit().putString("lastUsedHexagonKeyboardLayout", keyboardLayoutType.getValue()).apply();
    }

    public final List K0() {
        if (!this.f13726c.contains("langs")) {
            return C0718m.j();
        }
        String string = this.f13726c.getString("langs", "system");
        o.b(string);
        return kotlin.text.o.t0(string, new String[]{","}, false, 0, 6, (Object) null);
    }

    public final void L(String str) {
        this.f13726c.edit().putString("themeType", str).apply();
    }

    public final void L0() {
        this.f13727d.putBoolean("settings_vibration_feedback", false).putInt("settings_vibration_duration", 20).putInt("settings_vibration_intensity", 0).putBoolean("settings_autocorrect", true).putBoolean("settings_movecursor", true).putBoolean("settings_predictions", true).putBoolean("settings_learningmode", true).putBoolean("settings_smartbar", true).putBoolean("use_dictionaries", true).putInt("settings_autocaps_level", 2).putBoolean("settings_autospace", false).putBoolean("settings_dot_shortcut", true).putInt("settings_space_key_size", 2).putInt("font_size", 0).putBoolean("settings_back_to_letters", false).putBoolean("settings_debug", false).putInt("swipe_distance_vert", 1).putInt("swipe_distance_horz", 1).putInt("hold_duration_id", 1).putBoolean("flickdown_to_undo", false).putBoolean("settings_always_landscape", false).putBoolean("optimizeDictionary", false).putString("settings_reset", "").putInt("emoji_font", 0).putBoolean("settings_easymode_button", true).putBoolean("numberFieldLeft", false).apply();
        this.f13727d.putString("langs", C0718m.Z(C0681b.a(C0718m.o("system")), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null)).apply();
    }

    public final void M(Map map) {
        o.e(map, "languageUsage");
        SharedPreferences.Editor edit = this.f13726c.edit();
        C0341a.C0006a aVar = C0341a.f812d;
        aVar.a();
        edit.putString("translatePromptUsage", aVar.b(new O(G0.f622a, K.f636a), map));
        edit.apply();
    }

    public final long M0() {
        if (this.f13726c.contains("PurchaseValidationInfoDate")) {
            return this.f13726c.getLong("PurchaseValidationInfoDate", 0);
        }
        return 0;
    }

    public final boolean N() {
        if (this.f13726c.contains("settings_movecursor")) {
            return this.f13726c.getBoolean("settings_movecursor", true);
        }
        return true;
    }

    public final int O() {
        if (this.f13726c.contains("autocorrectionCounter")) {
            return this.f13726c.getInt("autocorrectionCounter", 0);
        }
        return 0;
    }

    public final int O0() {
        if (!this.f13726c.contains("lastRatingDate")) {
            return 0;
        }
        try {
            return this.f13726c.getInt("lastRatingDate", 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public final void P(int i4) {
        this.f13726c.edit().putInt("autocorrectionUndoCounter", i4).apply();
    }

    public final int P0() {
        if (this.f13726c.contains("lastRatingNotificationDate")) {
            return this.f13726c.getInt("lastRatingNotificationDate", 0);
        }
        return 0;
    }

    public final boolean Q() {
        if (this.f13726c.contains("is_dominant_language_data_loaded")) {
            return this.f13726c.getBoolean("is_dominant_language_data_loaded", false);
        }
        return false;
    }

    public final a Q0() {
        if (!this.f13726c.contains("lastUsedAiAssistantPrompt")) {
            return a.f9202d.a();
        }
        String string = this.f13726c.getString("lastUsedAiAssistantPrompt", "");
        if (string == null || string.length() == 0) {
            return a.f9202d.a();
        }
        C0341a.C0006a aVar = C0341a.f812d;
        o.b(string);
        aVar.a();
        return (a) aVar.c(a.f9202d.serializer(), string);
    }

    public final int R() {
        if (this.f13726c.contains("autocorrectionUndoCounter")) {
            return this.f13726c.getInt("autocorrectionUndoCounter", 0);
        }
        return 0;
    }

    public final void S(String str) {
        o.e(str, "value");
        this.f13726c.edit().putString("onboardingState", str).apply();
    }

    public final void T(boolean z3) {
        this.f13726c.edit().putBoolean("database_building", z3).apply();
    }

    public final boolean U() {
        if (this.f13726c.contains("settings_dot_shortcut")) {
            return this.f13726c.getBoolean("settings_dot_shortcut", true);
        }
        return true;
    }

    public final int V() {
        if (this.f13726c.contains("settings_bottom_margin")) {
            return this.f13726c.getInt("settings_bottom_margin", 2);
        }
        return 2;
    }

    public final void W(int i4) {
        this.f13726c.edit().putInt("lastRatingNotificationDate", i4).apply();
    }

    public final void X(String str) {
        o.e(str, "value");
        this.f13726c.edit().putString("unique_id", str).apply();
    }

    public final boolean Y() {
        if (this.f13726c.contains("hexagonSpecialCharacters")) {
            return this.f13726c.getBoolean("hexagonSpecialCharacters", true);
        }
        return true;
    }

    public final void Z(int i4) {
        this.f13726c.edit().putInt("ratingCounter", i4).apply();
    }

    public final KeyboardLayoutType a() {
        String string;
        if (!this.f13726c.contains("lastUsedHexagonKeyboardLayout") || (string = this.f13726c.getString("lastUsedHexagonKeyboardLayout", (String) null)) == null) {
            return null;
        }
        return L.a(string);
    }

    public final void a0(boolean z3) {
        this.f13726c.edit().putBoolean("onboardingCorrectionDone", z3).apply();
    }

    public final int b() {
        if (this.f13726c.contains("hold_duration_id")) {
            return this.f13726c.getInt("hold_duration_id", 1);
        }
        return 1;
    }

    public final boolean b0() {
        if (this.f13726c.contains("visualTypingFeedback")) {
            return this.f13726c.getBoolean("visualTypingFeedback", true);
        }
        return true;
    }

    public final boolean c() {
        if (this.f13726c.contains("onboardingDone")) {
            return this.f13726c.getBoolean("onboardingDone", false);
        }
        return false;
    }

    public final boolean c0() {
        if (this.f13726c.contains("debug_mode")) {
            return this.f13726c.getBoolean("debug_mode", false);
        }
        return false;
    }

    public final String d() {
        if (!this.f13726c.contains("onboardingState")) {
            return "";
        }
        String string = this.f13726c.getString("onboardingState", "");
        o.b(string);
        return string;
    }

    public final boolean d0() {
        if (this.f13726c.contains("onboardingCorrectionDone")) {
            return this.f13726c.getBoolean("onboardingCorrectionDone", false);
        }
        return false;
    }

    public final List e() {
        ArrayList arrayList;
        int i4 = 0;
        if (this.f13726c.contains("quickaccess_specialcharacters")) {
            String string = this.f13726c.getString("quickaccess_specialcharacters", "#?!@()/+-_%&=*€$");
            o.b(string);
            arrayList = new ArrayList(string.length());
            while (i4 < string.length()) {
                arrayList.add(Character.valueOf(string.charAt(i4)));
                i4++;
            }
        } else {
            arrayList = new ArrayList(16);
            while (i4 < 16) {
                arrayList.add(Character.valueOf("#?!@()/+-_%&=*€$".charAt(i4)));
                i4++;
            }
        }
        return arrayList;
    }

    public final boolean e0() {
        if (this.f13726c.contains("settings_offlinemode")) {
            return this.f13726c.getBoolean("settings_offlinemode", false);
        }
        return false;
    }

    public final int f() {
        if (this.f13726c.contains("ratingCounter")) {
            return this.f13726c.getInt("ratingCounter", 0);
        }
        return 0;
    }

    public final String f0() {
        if (this.f13726c.contains("themeType_darkMode")) {
            return this.f13726c.getString("themeType_darkMode", (String) null);
        }
        return null;
    }

    public final List g() {
        String str;
        ArrayList arrayList;
        int i4 = 0;
        if (!kotlin.text.o.G((String) K0().get(0), "es", false, 2, (Object) null)) {
            str = "'\"";
        } else {
            str = "¿¡'\"";
        }
        if (this.f13726c.contains("split2_customcharacters")) {
            String string = this.f13726c.getString("split2_customcharacters", str);
            o.b(string);
            arrayList = new ArrayList(string.length());
            while (i4 < string.length()) {
                arrayList.add(Character.valueOf(string.charAt(i4)));
                i4++;
            }
        } else {
            arrayList = new ArrayList(str.length());
            while (i4 < str.length()) {
                arrayList.add(Character.valueOf(str.charAt(i4)));
                i4++;
            }
        }
        return arrayList;
    }

    public final boolean g0() {
        if (this.f13726c.contains("settings_always_landscape")) {
            return this.f13726c.getBoolean("settings_always_landscape", false);
        }
        return false;
    }

    public final int h() {
        if (this.f13726c.contains("settings_senddebuglog_timestamp")) {
            return this.f13726c.getInt("settings_senddebuglog_timestamp", 0);
        }
        return 0;
    }

    public final String h0() {
        if (this.f13726c.contains("themeType")) {
            return this.f13726c.getString("themeType", (String) null);
        }
        return null;
    }

    public final C0192a i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str = "";
        if (this.f13726c.contains("shortcuts")) {
            str = this.f13726c.getString("shortcuts", str);
            o.b(str);
        }
        for (String str2 : (String[]) kotlin.text.o.t0(str, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0])) {
            String string = this.f13726c.getString(String.format("shortcut.%s", new Object[]{str2}), (String) null);
            if (string != null) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                o.d(lowerCase, "toLowerCase(...)");
                linkedHashMap.put(lowerCase, string);
                linkedHashMap2.put(str2, string);
            }
        }
        return new C0192a(linkedHashMap, linkedHashMap2);
    }

    public final void i0(boolean z3) {
        this.f13726c.edit().putBoolean("do_run_integrity_check", z3).apply();
    }

    public final int j() {
        if (this.f13726c.contains("settings_space_key_size")) {
            return this.f13726c.getInt("settings_space_key_size", 2);
        }
        return 2;
    }

    public final boolean j0() {
        if (this.f13726c.contains("isInTabletModeOnUnfoldedDevices")) {
            return this.f13726c.getBoolean("isInTabletModeOnUnfoldedDevices", false);
        }
        return false;
    }

    public final long k() {
        if (!this.f13726c.contains("subscription_expiration_date")) {
            return 0;
        }
        try {
            return 1000 * ((long) this.f13726c.getInt("subscription_expiration_date", 0));
        } catch (ClassCastException unused) {
            return this.f13726c.getLong("subscription_expiration_date", 0);
        }
    }

    public final String k0() {
        if (!this.f13726c.contains("settings_additional_diacritics")) {
            return "";
        }
        String string = this.f13726c.getString("settings_additional_diacritics", "");
        o.b(string);
        return string;
    }

    public final boolean l() {
        if (this.f13726c.contains("premium")) {
            return this.f13726c.getBoolean("premium", false);
        }
        return false;
    }

    public final void l0(boolean z3) {
        this.f13726c.edit().putBoolean("is_dominant_language_data_loaded", z3).apply();
    }

    public final int m() {
        if (this.f13726c.contains("swipe_distance_horz")) {
            return this.f13726c.getInt("swipe_distance_horz", 1);
        }
        return 1;
    }

    public final boolean m0() {
        if (this.f13726c.contains("tutorialMode")) {
            return this.f13726c.getBoolean("tutorialMode", false);
        }
        return false;
    }

    public final int n() {
        if (this.f13726c.contains("swipe_distance_vert")) {
            return this.f13726c.getInt("swipe_distance_vert", 1);
        }
        return 1;
    }

    public final String n0() {
        if (!this.f13726c.contains("settings_custom_keyboard_layout")) {
            return "auto";
        }
        String string = this.f13726c.getString("settings_custom_keyboard_layout", "auto");
        o.b(string);
        return string;
    }

    public final boolean o() {
        if (this.f13726c.contains("tapSound")) {
            return this.f13726c.getBoolean("tapSound", false);
        }
        return false;
    }

    public final void o0(boolean z3) {
        this.f13726c.edit().putBoolean("debug_mode", z3).apply();
    }

    public final boolean p() {
        if (this.f13726c.contains("tinyCharacterHints")) {
            return this.f13726c.getBoolean("tinyCharacterHints", true);
        }
        return true;
    }

    public final boolean p0() {
        if (this.f13726c.contains("isLanguageFlagVisible")) {
            return this.f13726c.getBoolean("isLanguageFlagVisible", true);
        }
        return true;
    }

    public final Map q() {
        String string = this.f13726c.getString("translatePromptUsage", "");
        if (string == null || kotlin.text.o.X(string)) {
            return D.h();
        }
        C0341a.C0006a aVar = C0341a.f812d;
        aVar.a();
        return (Map) aVar.c(new O(G0.f622a, K.f636a), string);
    }

    public final long q0() {
        if (this.f13726c.contains("last_shown")) {
            return this.f13726c.getLong("last_shown", 0);
        }
        return 0;
    }

    public final String r() {
        if (!this.f13726c.contains("unique_id")) {
            return "";
        }
        String string = this.f13726c.getString("unique_id", "");
        o.b(string);
        return string;
    }

    public final boolean r0() {
        if (this.f13726c.contains("numberFieldLeft")) {
            return this.f13726c.getBoolean("numberFieldLeft", false);
        }
        return false;
    }

    public final int s() {
        if (this.f13726c.contains("settings_vibration_duration")) {
            return this.f13726c.getInt("settings_vibration_duration", 20);
        }
        return 20;
    }

    public final void s0(boolean z3) {
        this.f13726c.edit().putBoolean("onboardingDone", z3).apply();
    }

    public final int t() {
        if (this.f13726c.contains("settings_vibration_intensity")) {
            return this.f13726c.getInt("settings_vibration_intensity", 0);
        }
        return 0;
    }

    public final boolean t0() {
        if (this.f13726c.contains("numbersOnLongPress")) {
            return this.f13726c.getBoolean("numbersOnLongPress", false);
        }
        return false;
    }

    public final boolean u() {
        if (this.f13726c.contains("settings_aiassistant_relay_server")) {
            return this.f13726c.getBoolean("settings_aiassistant_relay_server", true);
        }
        return true;
    }

    public final boolean u0() {
        if (this.f13726c.contains("settings_easymode")) {
            return this.f13726c.getBoolean("settings_easymode", false);
        }
        return false;
    }

    public final boolean v() {
        if (this.f13726c.contains("settings_autospace")) {
            return this.f13726c.getBoolean("settings_autospace", false);
        }
        return false;
    }

    public final boolean v0() {
        if (this.f13726c.contains("do_run_integrity_check")) {
            return this.f13726c.getBoolean("do_run_integrity_check", true);
        }
        return true;
    }

    public final boolean w() {
        if (this.f13726c.contains("settings_autocorrect")) {
            return this.f13726c.getBoolean("settings_autocorrect", true);
        }
        return true;
    }

    public final boolean w0() {
        if (this.f13726c.contains("isShiftVisible")) {
            return this.f13726c.getBoolean("isShiftVisible", true);
        }
        return true;
    }

    public final boolean x() {
        if (this.f13726c.contains("settings_back_to_letters")) {
            return this.f13726c.getBoolean("settings_back_to_letters", false);
        }
        return false;
    }

    public final List x0() {
        if (!this.f13726c.contains("downloaded_languages_list")) {
            return C0718m.j();
        }
        String string = this.f13726c.getString("downloaded_languages_list", "");
        o.b(string);
        return kotlin.text.o.t0(string, new String[]{","}, false, 0, 6, (Object) null);
    }

    public final boolean y() {
        if (this.f13726c.contains("isDeleteVisible")) {
            return this.f13726c.getBoolean("isDeleteVisible", true);
        }
        return true;
    }

    public final boolean y0() {
        if (this.f13726c.contains("settings_smartbar")) {
            return this.f13726c.getBoolean("settings_smartbar", true);
        }
        return true;
    }

    public final Map z() {
        String string = this.f13726c.getString("aiPromptUsageData", "");
        if (string == null || kotlin.text.o.X(string)) {
            return D.h();
        }
        C0341a.C0006a aVar = C0341a.f812d;
        aVar.a();
        return (Map) aVar.c(new O(PromptItemType.Companion.serializer(), K.f636a), string);
    }

    public final void z0(boolean z3) {
        this.f13726c.edit().putBoolean("is_unlock_ai_assistant_banner_closed_by_user", z3).apply();
    }
}
