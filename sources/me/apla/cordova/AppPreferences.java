package me.apla.cordova;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppPreferences extends CordovaPlugin implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final int COMMIT_FAILED = 2;
    private static final int NULL_VALUE = 3;
    private static CordovaWebView cdvWebView;
    private static boolean watchChanges;

    private boolean clearAll(final SharedPreferences sharedPreferences, final CallbackContext callbackContext) {
        this.f15693cordova.getThreadPool().execute(new Runnable() {
            public void run() {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.commit();
                if (edit.commit()) {
                    callbackContext.success();
                    return;
                }
                try {
                    callbackContext.error(AppPreferences.this.createErrorObj(2, "Cannot commit change"));
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    public JSONObject createErrorObj(int i4, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i4);
        jSONObject.put("message", str);
        return jSONObject;
    }

    private boolean fetchValueByKey(final SharedPreferences sharedPreferences, final String str, final CallbackContext callbackContext) {
        this.f15693cordova.getThreadPool().execute(new Runnable() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r4 = this;
                    android.content.SharedPreferences r0 = r3
                    java.lang.String r1 = r4
                    boolean r0 = r0.contains(r1)
                    r1 = 0
                    if (r0 == 0) goto L_0x00d1
                    android.content.SharedPreferences r0 = r3
                    java.util.Map r0 = r0.getAll()
                    java.lang.String r2 = r4
                    java.lang.Object r0 = r0.get(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getName()
                    java.lang.String r3 = "java.lang.Integer"
                    boolean r3 = r2.equals(r3)
                    if (r3 != 0) goto L_0x00c7
                    java.lang.String r3 = "java.lang.Long"
                    boolean r3 = r2.equals(r3)
                    if (r3 == 0) goto L_0x0031
                    goto L_0x00c7
                L_0x0031:
                    java.lang.String r3 = "java.lang.Float"
                    boolean r3 = r2.equals(r3)
                    if (r3 != 0) goto L_0x00c2
                    java.lang.String r3 = "java.lang.Double"
                    boolean r3 = r2.equals(r3)
                    if (r3 == 0) goto L_0x0043
                    goto L_0x00c2
                L_0x0043:
                    java.lang.String r3 = "java.lang.Boolean"
                    boolean r3 = r2.equals(r3)
                    if (r3 == 0) goto L_0x005b
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x0058
                    java.lang.String r0 = "true"
                L_0x0055:
                    r1 = r0
                    goto L_0x00cb
                L_0x0058:
                    java.lang.String r0 = "false"
                    goto L_0x0055
                L_0x005b:
                    java.lang.String r3 = "java.lang.String"
                    boolean r3 = r2.equals(r3)
                    if (r3 == 0) goto L_0x00b4
                    android.content.SharedPreferences r1 = r3
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "_"
                    r2.append(r3)
                    java.lang.String r3 = r4
                    r2.append(r3)
                    java.lang.String r3 = "_type"
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    boolean r1 = r1.contains(r2)
                    if (r1 == 0) goto L_0x0087
                    r1 = r0
                    java.lang.String r1 = (java.lang.String) r1
                    goto L_0x00cb
                L_0x0087:
                    org.json.JSONStringer r1 = new org.json.JSONStringer     // Catch:{ JSONException -> 0x00a9 }
                    r1.<init>()     // Catch:{ JSONException -> 0x00a9 }
                    org.json.JSONStringer r1 = r1.array()     // Catch:{ JSONException -> 0x00a9 }
                    java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x00a9 }
                    org.json.JSONStringer r0 = r1.value(r0)     // Catch:{ JSONException -> 0x00a9 }
                    org.json.JSONStringer r0 = r0.endArray()     // Catch:{ JSONException -> 0x00a9 }
                    java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00a9 }
                    int r1 = r0.length()
                    r2 = 1
                    int r1 = r1 - r2
                    java.lang.String r1 = r0.substring(r2, r1)
                    goto L_0x00cb
                L_0x00a9:
                    r0 = move-exception
                    r0.printStackTrace()
                    org.apache.cordova.CallbackContext r0 = r5
                    r1 = 0
                    r0.error((int) r1)
                    return
                L_0x00b4:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r3 = "unhandled type: "
                    r0.append(r3)
                    r0.append(r2)
                    goto L_0x00cb
                L_0x00c2:
                    java.lang.String r1 = r0.toString()
                    goto L_0x00cb
                L_0x00c7:
                    java.lang.String r1 = r0.toString()
                L_0x00cb:
                    org.apache.cordova.CallbackContext r0 = r5
                    r0.success((java.lang.String) r1)
                    goto L_0x00d6
                L_0x00d1:
                    org.apache.cordova.CallbackContext r0 = r5
                    r0.success((java.lang.String) r1)
                L_0x00d6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: me.apla.cordova.AppPreferences.AnonymousClass3.run():void");
            }
        });
        return true;
    }

    private boolean removeValueByKey(final SharedPreferences sharedPreferences, final String str, final CallbackContext callbackContext) {
        this.f15693cordova.getThreadPool().execute(new Runnable() {
            public void run() {
                if (sharedPreferences.contains(str)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove(str);
                    SharedPreferences sharedPreferences = sharedPreferences;
                    if (sharedPreferences.contains("_" + str + "_type")) {
                        edit.remove("_" + str + "_type");
                    }
                    if (edit.commit()) {
                        callbackContext.success();
                        return;
                    }
                    try {
                        callbackContext.error(AppPreferences.this.createErrorObj(2, "Cannot commit change"));
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                } else {
                    callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.NO_RESULT));
                }
            }
        });
        return true;
    }

    private boolean showPreferencesActivity(final CallbackContext callbackContext) {
        this.f15693cordova.getThreadPool().execute(new Runnable() {
            public void run() {
                try {
                    AppPreferences.this.f15693cordova.getActivity().startActivity(new Intent(AppPreferences.this.f15693cordova.getActivity(), Class.forName("me.apla.cordova.AppPreferencesActivity")));
                    callbackContext.success((String) null);
                } catch (ClassNotFoundException e4) {
                    callbackContext.error("Class me.apla.cordova.AppPreferencesActivity not found. Please run preference generator.");
                    e4.printStackTrace();
                } catch (Exception e5) {
                    callbackContext.error("Intent launch error");
                    e5.printStackTrace();
                }
            }
        });
        return true;
    }

    private boolean storeValueByKey(SharedPreferences sharedPreferences, String str, String str2, String str3, CallbackContext callbackContext) {
        final SharedPreferences sharedPreferences2 = sharedPreferences;
        final String str4 = str3;
        final CallbackContext callbackContext2 = callbackContext;
        final String str5 = str2;
        final String str6 = str;
        this.f15693cordova.getThreadPool().execute(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x010b  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0111 A[SYNTHETIC, Splitter:B:40:0x0111] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    android.content.SharedPreferences r0 = r3
                    android.content.SharedPreferences$Editor r0 = r0.edit()
                    org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch:{ NullPointerException -> 0x0014, JSONException -> 0x0012 }
                    java.lang.String r2 = r4     // Catch:{ NullPointerException -> 0x0014, JSONException -> 0x0012 }
                    r1.<init>(r2)     // Catch:{ NullPointerException -> 0x0014, JSONException -> 0x0012 }
                    java.lang.Object r1 = r1.nextValue()     // Catch:{ NullPointerException -> 0x0014, JSONException -> 0x0012 }
                    goto L_0x001e
                L_0x0012:
                    r1 = move-exception
                    goto L_0x0016
                L_0x0014:
                    r1 = move-exception
                    goto L_0x001a
                L_0x0016:
                    r1.printStackTrace()
                    goto L_0x001d
                L_0x001a:
                    r1.printStackTrace()
                L_0x001d:
                    r1 = 0
                L_0x001e:
                    if (r1 != 0) goto L_0x0033
                    org.apache.cordova.CallbackContext r2 = r5     // Catch:{ JSONException -> 0x002f }
                    me.apla.cordova.AppPreferences r3 = me.apla.cordova.AppPreferences.this     // Catch:{ JSONException -> 0x002f }
                    java.lang.String r4 = "Error creating/getting json token"
                    r5 = 3
                    org.json.JSONObject r3 = r3.createErrorObj(r5, r4)     // Catch:{ JSONException -> 0x002f }
                    r2.error((org.json.JSONObject) r3)     // Catch:{ JSONException -> 0x002f }
                    return
                L_0x002f:
                    r2 = move-exception
                    r2.printStackTrace()
                L_0x0033:
                    java.lang.Class r2 = r1.getClass()
                    java.lang.String r2 = r2.getName()
                    java.lang.String r3 = r6
                    if (r3 == 0) goto L_0x0105
                    android.content.SharedPreferences r3 = r3
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "_"
                    r4.append(r5)
                    java.lang.String r6 = r7
                    r4.append(r6)
                    java.lang.String r6 = "_type"
                    r4.append(r6)
                    java.lang.String r4 = r4.toString()
                    boolean r3 = r3.contains(r4)
                    if (r3 == 0) goto L_0x0076
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r3.append(r5)
                    java.lang.String r4 = r7
                    r3.append(r4)
                    r3.append(r6)
                    java.lang.String r3 = r3.toString()
                    r0.remove(r3)
                L_0x0076:
                    java.lang.String r3 = r6
                    java.lang.String r4 = "string"
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L_0x0089
                    java.lang.String r2 = r7
                    java.lang.String r1 = (java.lang.String) r1
                    r0.putString(r2, r1)
                    goto L_0x0105
                L_0x0089:
                    java.lang.String r3 = r6
                    java.lang.String r4 = "number"
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L_0x00cf
                    java.lang.String r3 = "java.lang.Double"
                    boolean r3 = r2.equals(r3)
                    if (r3 == 0) goto L_0x00a7
                    java.lang.String r2 = r7
                    java.lang.Double r1 = (java.lang.Double) r1
                    float r1 = r1.floatValue()
                    r0.putFloat(r2, r1)
                    goto L_0x0105
                L_0x00a7:
                    java.lang.String r3 = "java.lang.Integer"
                    boolean r3 = r2.equals(r3)
                    if (r3 == 0) goto L_0x00bb
                    java.lang.String r2 = r7
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r0.putInt(r2, r1)
                    goto L_0x0105
                L_0x00bb:
                    java.lang.String r3 = "java.lang.Long"
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L_0x0105
                    java.lang.String r2 = r7
                    java.lang.Long r1 = (java.lang.Long) r1
                    long r3 = r1.longValue()
                    r0.putLong(r2, r3)
                    goto L_0x0105
                L_0x00cf:
                    java.lang.String r2 = r6
                    java.lang.String r3 = "boolean"
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L_0x00e5
                    java.lang.String r2 = r7
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    r0.putBoolean(r2, r1)
                    goto L_0x0105
                L_0x00e5:
                    java.lang.String r1 = r7
                    java.lang.String r2 = r4
                    r0.putString(r1, r2)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r5)
                    java.lang.String r2 = r7
                    r1.append(r2)
                    r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "json"
                    r0.putString(r1, r2)
                L_0x0105:
                    boolean r0 = r0.commit()
                    if (r0 == 0) goto L_0x0111
                    org.apache.cordova.CallbackContext r0 = r5
                    r0.success()
                    goto L_0x0124
                L_0x0111:
                    org.apache.cordova.CallbackContext r0 = r5     // Catch:{ JSONException -> 0x0120 }
                    me.apla.cordova.AppPreferences r1 = me.apla.cordova.AppPreferences.this     // Catch:{ JSONException -> 0x0120 }
                    java.lang.String r2 = "Cannot commit change"
                    r3 = 2
                    org.json.JSONObject r1 = r1.createErrorObj(r3, r2)     // Catch:{ JSONException -> 0x0120 }
                    r0.error((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x0120 }
                    goto L_0x0124
                L_0x0120:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0124:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: me.apla.cordova.AppPreferences.AnonymousClass5.run():void");
            }
        });
        return true;
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        SharedPreferences defaultSharedPreferences;
        JSONObject jSONObject = new JSONObject();
        if (jSONArray.length() > 0) {
            jSONObject = jSONArray.optJSONObject(0);
        }
        String optString = jSONObject.optString("suiteName", (String) null);
        if (optString == null || optString == "") {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f15693cordova.getActivity());
        } else {
            defaultSharedPreferences = this.f15693cordova.getActivity().getSharedPreferences(optString, 0);
        }
        SharedPreferences sharedPreferences = defaultSharedPreferences;
        if (str.equals("show")) {
            return showPreferencesActivity(callbackContext);
        }
        if (str.equals("clearAll")) {
            return clearAll(sharedPreferences, callbackContext);
        }
        if (str.equals("watch")) {
            boolean optBoolean = jSONObject.optBoolean("subscribe", true);
            watchChanges = optBoolean;
            if (!optBoolean) {
                onPause(false);
            } else {
                onResume(false);
            }
            callbackContext.success();
            return true;
        }
        String string = jSONObject.getString("key");
        String optString2 = jSONObject.optString("dict");
        if (!"".equals(optString2)) {
            string = optString2 + '.' + string;
        }
        String str2 = string;
        if (str.equals("fetch")) {
            return fetchValueByKey(sharedPreferences, str2, callbackContext);
        }
        if (str.equals("store")) {
            return storeValueByKey(sharedPreferences, str2, jSONObject.optString("type"), jSONObject.getString("value"), callbackContext);
        } else if (str.equals("remove")) {
            return removeValueByKey(sharedPreferences, str2, callbackContext);
        } else {
            return false;
        }
    }

    public void onPause(boolean z3) {
        if (watchChanges) {
            PreferenceManager.getDefaultSharedPreferences(this.f15693cordova.getActivity()).unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public void onResume(boolean z3) {
        if (watchChanges) {
            PreferenceManager.getDefaultSharedPreferences(this.f15693cordova.getActivity()).registerOnSharedPreferenceChangeListener(this);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PREFERENCE CHANGE DETECTED FOR ");
        sb.append(str);
        CordovaWebView cordovaWebView = cdvWebView;
        cordovaWebView.loadUrl("javascript:cordova.fireDocumentEvent('preferencesChanged',{'key': '" + str + "'})");
    }

    /* access modifiers changed from: protected */
    public void pluginInitialize() {
        cdvWebView = this.webView;
        Context applicationContext = this.f15693cordova.getActivity().getApplicationContext();
        int identifier = applicationContext.getResources().getIdentifier("apppreferences", "xml", applicationContext.getPackageName());
        if (identifier > 0) {
            PreferenceManager.setDefaultValues(applicationContext, identifier, false);
        }
    }
}
