package com.revenuecat.purchases.capacitor;

import android.app.Activity;
import android.util.Log;
import androidx.appcompat.app.C0370d;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 e2\u00020\u0001:\u0002efB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u0011*\u00020\u00142\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u0005*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u0004\u0018\u00010\b*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u0004\u0018\u00010\r*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u0004\u0018\u00010\u0016*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010&J%\u0010\u001f\u001a\u0004\u0018\u00010\u0005*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010'J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b+\u0010)J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b-\u0010)J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b.\u0010)J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b/\u0010)J\u0017\u00100\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b0\u0010)J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b1\u0010)J\u0017\u00102\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b2\u0010)J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b3\u0010)J\u0017\u00104\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b4\u0010)J\u0017\u00105\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b5\u0010)J\u0017\u00106\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b6\u0010)J\u0017\u00107\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b7\u0010)J\u0017\u00108\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b8\u0010)J\u0017\u00109\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b9\u0010)J\u0017\u0010:\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b:\u0010)J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b;\u0010)J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b<\u0010)J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b=\u0010)J\u0017\u0010>\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b>\u0010)J\u0017\u0010?\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b?\u0010)J\u0017\u0010@\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b@\u0010)J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bA\u0010)J\u0017\u0010B\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bB\u0010)J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bC\u0010)J\u0017\u0010D\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bD\u0010)J\u0017\u0010E\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bE\u0010)J\u0017\u0010F\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bF\u0010)J\u0017\u0010G\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bG\u0010)J\u0017\u0010H\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bH\u0010)J\u0017\u0010I\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bI\u0010)J\u0017\u0010J\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bJ\u0010)J\u0017\u0010K\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bK\u0010)J\u0017\u0010L\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bL\u0010)J\u0017\u0010M\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bM\u0010)J\u0017\u0010N\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bN\u0010)J\u0017\u0010O\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bO\u0010)J\u0017\u0010P\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bP\u0010)J\u0017\u0010Q\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bQ\u0010)J\u0017\u0010R\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bR\u0010)J\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bS\u0010)J\u0017\u0010T\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bT\u0010)J\u0017\u0010U\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bU\u0010)J\u0017\u0010V\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bV\u0010)J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bW\u0010)J\u0017\u0010X\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bX\u0010)J\u0017\u0010Y\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bY\u0010)J\u0017\u0010Z\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bZ\u0010)J\u0017\u0010[\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b[\u0010)J\u0017\u0010\\\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\\\u0010)J\u0017\u0010]\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b]\u0010)J\u0017\u0010^\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b^\u0010)J\u0017\u0010_\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b_\u0010)J\u0017\u0010`\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b`\u0010)R\u0014\u0010d\u001a\u00020a8BX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/revenuecat/purchases/capacitor/PurchasesPlugin;", "Lcom/getcapacitor/Plugin;", "<init>", "()V", "", "", "", "readableMap", "Lcom/getcapacitor/JSObject;", "convertMapToJSObject", "(Ljava/util/Map;)Lcom/getcapacitor/JSObject;", "", "array", "Lcom/getcapacitor/JSArray;", "convertListToJSArray", "(Ljava/util/List;)Lcom/getcapacitor/JSArray;", "functionName", "Ll2/q;", "logNotSupportedFunctionalityInAndroid", "(Ljava/lang/String;)V", "Lcom/getcapacitor/PluginCall;", "call", "", "rejectIfNotConfigured", "(Lcom/getcapacitor/PluginCall;)Z", "rejectNotSupportedInAndroid", "(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V", "map", "resolveWithMap", "(Lcom/getcapacitor/PluginCall;Ljava/util/Map;)V", "key", "getStringOrReject", "(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Ljava/lang/String;", "getObjectOrReject", "(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Lcom/getcapacitor/JSObject;", "getArrayOrReject", "(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Lcom/getcapacitor/JSArray;", "getBooleanOrReject", "(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Ljava/lang/Boolean;", "(Lcom/getcapacitor/JSObject;Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Ljava/lang/String;", "configure", "(Lcom/getcapacitor/PluginCall;)V", "setMockWebResults", "setFinishTransactions", "setSimulatesAskToBuyInSandbox", "addCustomerInfoUpdateListener", "removeCustomerInfoUpdateListener", "getOfferings", "getProducts", "purchaseStoreProduct", "purchaseDiscountedProduct", "purchaseDiscountedPackage", "purchasePackage", "purchaseSubscriptionOption", "restorePurchases", "getAppUserID", "logIn", "logOut", "setLogLevel", "setLogHandler", "getCustomerInfo", "syncPurchases", "syncObserverModeAmazonPurchase", "enableAdServicesAttributionTokenCollection", "isAnonymous", "checkTrialOrIntroductoryPriceEligibility", "getPromotionalOffer", "invalidateCustomerInfoCache", "presentCodeRedemptionSheet", "setAttributes", "setEmail", "setPhoneNumber", "setDisplayName", "setPushToken", "setProxyURL", "collectDeviceIdentifiers", "setAdjustID", "setAppsflyerID", "setFBAnonymousID", "setMparticleID", "setCleverTapID", "setMixpanelDistinctID", "setFirebaseAppInstanceID", "setOnesignalID", "setAirshipChannelID", "setMediaSource", "setCampaign", "setAdGroup", "setAd", "setKeyword", "setCreative", "canMakePayments", "beginRefundRequestForActiveEntitlement", "beginRefundRequestForEntitlement", "beginRefundRequestForProduct", "showInAppMessages", "isConfigured", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Companion", "PurchaseOptionalInfoParams", "revenuecat-purchases-capacitor_paidRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@CapacitorPlugin(name = "Purchases")
public final class PurchasesPlugin extends Plugin {
    private static final String CUSTOMER_INFO_KEY = "customerInfo";
    public static final Companion Companion = new Companion((i) null);
    private static final String PLATFORM_NAME = "capacitor";
    private static final String PLUGIN_VERSION = "7.0.0";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/capacitor/PurchasesPlugin$Companion;", "", "<init>", "()V", "PLATFORM_NAME", "", "PLUGIN_VERSION", "CUSTOMER_INFO_KEY", "revenuecat-purchases-capacitor_paidRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/capacitor/PurchasesPlugin$PurchaseOptionalInfoParams;", "", "oldProductIdentifier", "", "prorationMode", "", "isPersonalizedPrice", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getOldProductIdentifier", "()Ljava/lang/String;", "getProrationMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/capacitor/PurchasesPlugin$PurchaseOptionalInfoParams;", "equals", "other", "hashCode", "toString", "Companion", "revenuecat-purchases-capacitor_paidRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class PurchaseOptionalInfoParams {
        public static final Companion Companion = new Companion((i) null);
        private final Boolean isPersonalizedPrice;
        private final String oldProductIdentifier;
        private final Integer prorationMode;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/capacitor/PurchasesPlugin$PurchaseOptionalInfoParams$Companion;", "", "<init>", "()V", "fromCall", "Lcom/revenuecat/purchases/capacitor/PurchasesPlugin$PurchaseOptionalInfoParams;", "call", "Lcom/getcapacitor/PluginCall;", "revenuecat-purchases-capacitor_paidRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final PurchaseOptionalInfoParams fromCall(PluginCall pluginCall) {
                String str;
                o.e(pluginCall, "call");
                JSObject object = pluginCall.getObject("googleProductChangeInfo");
                Boolean bool = pluginCall.getBoolean("googleIsPersonalizedPrice");
                Integer num = null;
                if (object != null) {
                    str = object.getString("oldProductIdentifier");
                } else {
                    str = null;
                }
                if (object != null) {
                    num = object.getInteger("prorationMode");
                }
                return new PurchaseOptionalInfoParams(str, num, bool);
            }

            private Companion() {
            }
        }

        public PurchaseOptionalInfoParams(String str, Integer num, Boolean bool) {
            this.oldProductIdentifier = str;
            this.prorationMode = num;
            this.isPersonalizedPrice = bool;
        }

        public static /* synthetic */ PurchaseOptionalInfoParams copy$default(PurchaseOptionalInfoParams purchaseOptionalInfoParams, String str, Integer num, Boolean bool, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = purchaseOptionalInfoParams.oldProductIdentifier;
            }
            if ((i4 & 2) != 0) {
                num = purchaseOptionalInfoParams.prorationMode;
            }
            if ((i4 & 4) != 0) {
                bool = purchaseOptionalInfoParams.isPersonalizedPrice;
            }
            return purchaseOptionalInfoParams.copy(str, num, bool);
        }

        public final String component1() {
            return this.oldProductIdentifier;
        }

        public final Integer component2() {
            return this.prorationMode;
        }

        public final Boolean component3() {
            return this.isPersonalizedPrice;
        }

        public final PurchaseOptionalInfoParams copy(String str, Integer num, Boolean bool) {
            return new PurchaseOptionalInfoParams(str, num, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseOptionalInfoParams)) {
                return false;
            }
            PurchaseOptionalInfoParams purchaseOptionalInfoParams = (PurchaseOptionalInfoParams) obj;
            return o.a(this.oldProductIdentifier, purchaseOptionalInfoParams.oldProductIdentifier) && o.a(this.prorationMode, purchaseOptionalInfoParams.prorationMode) && o.a(this.isPersonalizedPrice, purchaseOptionalInfoParams.isPersonalizedPrice);
        }

        public final String getOldProductIdentifier() {
            return this.oldProductIdentifier;
        }

        public final Integer getProrationMode() {
            return this.prorationMode;
        }

        public int hashCode() {
            String str = this.oldProductIdentifier;
            int i4 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.prorationMode;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.isPersonalizedPrice;
            if (bool != null) {
                i4 = bool.hashCode();
            }
            return hashCode2 + i4;
        }

        public final Boolean isPersonalizedPrice() {
            return this.isPersonalizedPrice;
        }

        public String toString() {
            return "PurchaseOptionalInfoParams(oldProductIdentifier=" + this.oldProductIdentifier + ", prorationMode=" + this.prorationMode + ", isPersonalizedPrice=" + this.isPersonalizedPrice + ')';
        }
    }

    private final JSArray convertListToJSArray(List<?> list) {
        JSArray jSArray = new JSArray();
        for (Object next : list) {
            if (next == null) {
                jSArray.put(JSONObject.NULL);
            } else if (next instanceof Map) {
                o.c(next, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSArray.put(convertMapToJSObject((Map) next));
            } else if (next instanceof List) {
                jSArray.put(convertListToJSArray((List) next));
            } else {
                jSArray.put(next);
            }
        }
        return jSArray;
    }

    private final JSObject convertMapToJSObject(Map<String, ? extends Object> map) {
        JSObject jSObject = new JSObject();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == null) {
                jSObject.put(str, JSONObject.NULL);
            } else if (value instanceof Map) {
                o.c(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                jSObject.put(str, (Object) convertMapToJSObject((Map) value));
            } else if (value instanceof List) {
                jSObject.put(str, (Object) convertListToJSArray((List) value));
            } else {
                jSObject.put(str, value);
            }
        }
        return jSObject;
    }

    private final Activity getActivity() {
        C0370d activity = this.bridge.getActivity();
        o.d(activity, "getActivity(...)");
        return activity;
    }

    private final JSArray getArrayOrReject(PluginCall pluginCall, String str) {
        JSArray array = pluginCall.getArray(str);
        if (array != null) {
            return array;
        }
        pluginCall.reject("Missing " + str + " parameter");
        return null;
    }

    private final Boolean getBooleanOrReject(PluginCall pluginCall, String str) {
        Boolean bool = pluginCall.getBoolean(str);
        if (bool != null) {
            return bool;
        }
        pluginCall.reject("Missing " + str + " parameter");
        return null;
    }

    private final JSObject getObjectOrReject(PluginCall pluginCall, String str) {
        JSObject object = pluginCall.getObject(str);
        if (object != null) {
            return object;
        }
        pluginCall.reject("Missing " + str + " parameter");
        return null;
    }

    private final String getStringOrReject(PluginCall pluginCall, String str) {
        String string = pluginCall.getString(str);
        if (string != null) {
            return string;
        }
        pluginCall.reject("Missing " + str + " parameter");
        return null;
    }

    private final void logNotSupportedFunctionalityInAndroid(String str) {
        Log.e("PurchasesCapacitor", "Functionality not supported in Android. Function: " + str);
    }

    private final boolean rejectIfNotConfigured(PluginCall pluginCall) {
        return false;
    }

    private final void rejectNotSupportedInAndroid(PluginCall pluginCall, String str) {
    }

    private final void resolveWithMap(PluginCall pluginCall, Map<String, ?> map) {
    }

    @PluginMethod(returnType = "callback")
    public final void addCustomerInfoUpdateListener(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void beginRefundRequestForActiveEntitlement(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void beginRefundRequestForEntitlement(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void beginRefundRequestForProduct(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void canMakePayments(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void checkTrialOrIntroductoryPriceEligibility(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void collectDeviceIdentifiers(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void configure(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void enableAdServicesAttributionTokenCollection(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void getAppUserID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void getCustomerInfo(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void getOfferings(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void getProducts(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void getPromotionalOffer(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void invalidateCustomerInfoCache(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void isAnonymous(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void isConfigured(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void logIn(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void logOut(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void presentCodeRedemptionSheet(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void purchaseDiscountedPackage(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void purchaseDiscountedProduct(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void purchasePackage(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void purchaseStoreProduct(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void purchaseSubscriptionOption(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void removeCustomerInfoUpdateListener(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "promise")
    public final void restorePurchases(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setAd(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setAdGroup(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setAdjustID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setAirshipChannelID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setAppsflyerID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setAttributes(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setCampaign(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setCleverTapID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setCreative(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setDisplayName(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setEmail(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setFBAnonymousID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setFinishTransactions(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setFirebaseAppInstanceID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setKeyword(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "callback")
    public final void setLogHandler(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setLogLevel(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setMediaSource(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setMixpanelDistinctID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setMockWebResults(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setMparticleID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setOnesignalID(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setPhoneNumber(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setProxyURL(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setPushToken(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void setSimulatesAskToBuyInSandbox(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void showInAppMessages(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void syncObserverModeAmazonPurchase(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    @PluginMethod(returnType = "none")
    public final void syncPurchases(PluginCall pluginCall) {
        o.e(pluginCall, "call");
    }

    private final String getStringOrReject(JSObject jSObject, PluginCall pluginCall, String str) {
        String string = jSObject.getString(str);
        if (string != null) {
            return string;
        }
        pluginCall.reject("Missing " + str + " parameter in " + jSObject);
        return null;
    }
}
