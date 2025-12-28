package ch.icoaching.wrio.keyboard.model.config;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bY\b\b\u0018\u0000 s2\u00020\u0001:\u000btuvwxyz{|}~B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB­\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010+J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010+J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010+J\u0010\u00105\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bA\u0010BJ¬\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010+J\u0010\u0010F\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\u00042\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010K\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010+R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010O\u0012\u0004\bP\u0010N\u001a\u0004\b\u0005\u0010-R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010Q\u0012\u0004\bS\u0010N\u001a\u0004\bR\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010K\u0012\u0004\bU\u0010N\u001a\u0004\bT\u0010+R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010K\u0012\u0004\bW\u0010N\u001a\u0004\bV\u0010+R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010K\u0012\u0004\bY\u0010N\u001a\u0004\bX\u0010+R \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010O\u0012\u0004\b[\u0010N\u001a\u0004\bZ\u0010-R \u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010K\u0012\u0004\b]\u0010N\u001a\u0004\b\\\u0010+R \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010^\u0012\u0004\b`\u0010N\u001a\u0004\b_\u00106R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010a\u0012\u0004\bc\u0010N\u001a\u0004\bb\u00108R \u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010d\u0012\u0004\bf\u0010N\u001a\u0004\be\u0010:R \u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010g\u0012\u0004\bi\u0010N\u001a\u0004\bh\u0010<R \u0010\u0015\u001a\u00020\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010j\u0012\u0004\bl\u0010N\u001a\u0004\bk\u0010>R \u0010\u0017\u001a\u00020\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010m\u0012\u0004\bo\u0010N\u001a\u0004\bn\u0010@R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010p\u0012\u0004\br\u0010N\u001a\u0004\bq\u0010B¨\u0006"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig;", "", "", "themeName", "", "isPremium", "ignoreBackgroundImageInLandscape", "backgroundImage", "backgroundColor", "boxShadowColor", "areNavigationBarButtonsDark", "iconName", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;", "alternativeCharactersPopupConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;", "characterPreviewPopUp", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;", "smartBarConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;", "gestureOverlayConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;", "specialOverlaysConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;", "keysConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;", "aiAssistantConfig", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "component9", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;", "component10", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;", "component11", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;", "component12", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;", "component13", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;", "component14", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;", "component15", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;", "copy", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getThemeName", "getThemeName$annotations", "()V", "Z", "isPremium$annotations", "Ljava/lang/Boolean;", "getIgnoreBackgroundImageInLandscape", "getIgnoreBackgroundImageInLandscape$annotations", "getBackgroundImage", "getBackgroundImage$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getBoxShadowColor", "getBoxShadowColor$annotations", "getAreNavigationBarButtonsDark", "getAreNavigationBarButtonsDark$annotations", "getIconName", "getIconName$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;", "getAlternativeCharactersPopupConfig", "getAlternativeCharactersPopupConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;", "getCharacterPreviewPopUp", "getCharacterPreviewPopUp$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;", "getSmartBarConfig", "getSmartBarConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;", "getGestureOverlayConfig", "getGestureOverlayConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;", "getSpecialOverlaysConfig", "getSpecialOverlaysConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;", "getKeysConfig", "getKeysConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;", "getAiAssistantConfig", "getAiAssistantConfig$annotations", "Companion", "AlternativeCharactersPopupConfig", "CharacterPreviewPopupConfig", "GestureOverlayConfig", "SmartBarConfig", "AIAssistantConfig", "AIAssistantBarConfig", "AIAssistantDropDownConfig", "SpecialOverlaysConfig", "KeysConfig", "b", "a", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class ThemeConfig {
    public static final a Companion = new a((i) null);
    private final AIAssistantConfig aiAssistantConfig;
    private final AlternativeCharactersPopupConfig alternativeCharactersPopupConfig;
    private final boolean areNavigationBarButtonsDark;
    private final String backgroundColor;
    private final String backgroundImage;
    private final String boxShadowColor;
    private final CharacterPreviewPopupConfig characterPreviewPopUp;
    private final GestureOverlayConfig gestureOverlayConfig;
    private final String iconName;
    private final Boolean ignoreBackgroundImageInLandscape;
    private final boolean isPremium;
    private final KeysConfig keysConfig;
    private final SmartBarConfig smartBarConfig;
    private final SpecialOverlaysConfig specialOverlaysConfig;
    private final String themeName;

    @m
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 22\u00020\u0001:\u00043456B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001d¨\u00067"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;", "", "", "backgroundColor", "fontColor", "errorFontColor", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;", "aiPromptConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "getErrorFontColor", "getErrorFontColor$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;", "getAiPromptConfig", "getAiPromptConfig$annotations", "Companion", "AiPromptConfig", "AiPromptStateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AIAssistantBarConfig {
        public static final b Companion = new b((i) null);
        private final AiPromptConfig aiPromptConfig;
        private final String backgroundColor;
        private final String errorFontColor;
        private final String fontColor;

        @m
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;", "defaultState", "activeState", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;", "getDefaultState", "getDefaultState$annotations", "()V", "getActiveState", "getActiveState$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AiPromptConfig {
            public static final b Companion = new b((i) null);
            private final AiPromptStateConfig activeState;
            private final AiPromptStateConfig defaultState;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10040a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10041b;

                static {
                    a aVar = new a();
                    f10040a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantBarConfig.AiPromptConfig", aVar, 2);
                    s0Var.p("state-default", false);
                    s0Var.p("state-active", false);
                    f10041b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10041b;
                }

                public final F2.b[] c() {
                    AiPromptStateConfig.a aVar = AiPromptStateConfig.a.f10042a;
                    return new F2.b[]{aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final AiPromptConfig b(e eVar) {
                    AiPromptStateConfig aiPromptStateConfig;
                    int i4;
                    AiPromptStateConfig aiPromptStateConfig2;
                    o.e(eVar, "decoder");
                    f fVar = f10041b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        AiPromptStateConfig.a aVar = AiPromptStateConfig.a.f10042a;
                        aiPromptStateConfig = (AiPromptStateConfig) d4.E(fVar, 0, aVar, (Object) null);
                        aiPromptStateConfig2 = (AiPromptStateConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        aiPromptStateConfig2 = null;
                        AiPromptStateConfig aiPromptStateConfig3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                aiPromptStateConfig3 = (AiPromptStateConfig) d4.E(fVar, 0, AiPromptStateConfig.a.f10042a, aiPromptStateConfig3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                aiPromptStateConfig2 = (AiPromptStateConfig) d4.E(fVar, 1, AiPromptStateConfig.a.f10042a, aiPromptStateConfig2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        aiPromptStateConfig = aiPromptStateConfig3;
                    }
                    d4.c(fVar);
                    return new AiPromptConfig(i4, aiPromptStateConfig, aiPromptStateConfig2, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, AiPromptConfig aiPromptConfig) {
                    o.e(fVar, "encoder");
                    o.e(aiPromptConfig, "value");
                    f fVar2 = f10041b;
                    d d4 = fVar.d(fVar2);
                    AiPromptConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(aiPromptConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10040a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ AiPromptConfig(int i4, AiPromptStateConfig aiPromptStateConfig, AiPromptStateConfig aiPromptStateConfig2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10040a.a());
                }
                this.defaultState = aiPromptStateConfig;
                this.activeState = aiPromptStateConfig2;
            }

            public static /* synthetic */ AiPromptConfig copy$default(AiPromptConfig aiPromptConfig, AiPromptStateConfig aiPromptStateConfig, AiPromptStateConfig aiPromptStateConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    aiPromptStateConfig = aiPromptConfig.defaultState;
                }
                if ((i4 & 2) != 0) {
                    aiPromptStateConfig2 = aiPromptConfig.activeState;
                }
                return aiPromptConfig.copy(aiPromptStateConfig, aiPromptStateConfig2);
            }

            public static /* synthetic */ void getActiveState$annotations() {
            }

            public static /* synthetic */ void getDefaultState$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(AiPromptConfig aiPromptConfig, d dVar, f fVar) {
                AiPromptStateConfig.a aVar = AiPromptStateConfig.a.f10042a;
                dVar.f(fVar, 0, aVar, aiPromptConfig.defaultState);
                dVar.f(fVar, 1, aVar, aiPromptConfig.activeState);
            }

            public final AiPromptStateConfig component1() {
                return this.defaultState;
            }

            public final AiPromptStateConfig component2() {
                return this.activeState;
            }

            public final AiPromptConfig copy(AiPromptStateConfig aiPromptStateConfig, AiPromptStateConfig aiPromptStateConfig2) {
                o.e(aiPromptStateConfig, "defaultState");
                o.e(aiPromptStateConfig2, "activeState");
                return new AiPromptConfig(aiPromptStateConfig, aiPromptStateConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AiPromptConfig)) {
                    return false;
                }
                AiPromptConfig aiPromptConfig = (AiPromptConfig) obj;
                return o.a(this.defaultState, aiPromptConfig.defaultState) && o.a(this.activeState, aiPromptConfig.activeState);
            }

            public final AiPromptStateConfig getActiveState() {
                return this.activeState;
            }

            public final AiPromptStateConfig getDefaultState() {
                return this.defaultState;
            }

            public int hashCode() {
                return (this.defaultState.hashCode() * 31) + this.activeState.hashCode();
            }

            public String toString() {
                return "AiPromptConfig(defaultState=" + this.defaultState + ", activeState=" + this.activeState + ')';
            }

            public AiPromptConfig(AiPromptStateConfig aiPromptStateConfig, AiPromptStateConfig aiPromptStateConfig2) {
                o.e(aiPromptStateConfig, "defaultState");
                o.e(aiPromptStateConfig2, "activeState");
                this.defaultState = aiPromptStateConfig;
                this.activeState = aiPromptStateConfig2;
            }
        }

        @m
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;", "", "", "backgroundColor", "fontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig$AiPromptStateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AiPromptStateConfig {
            public static final b Companion = new b((i) null);
            private final String backgroundColor;
            private final String fontColor;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10042a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10043b;

                static {
                    a aVar = new a();
                    f10042a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantBarConfig.AiPromptStateConfig", aVar, 2);
                    s0Var.p("background-color", false);
                    s0Var.p("font-color", false);
                    f10043b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10043b;
                }

                public final F2.b[] c() {
                    G0 g02 = G0.f622a;
                    return new F2.b[]{g02, g02};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final AiPromptStateConfig b(e eVar) {
                    int i4;
                    String str;
                    String str2;
                    o.e(eVar, "decoder");
                    f fVar = f10043b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        str2 = d4.z(fVar, 0);
                        str = d4.z(fVar, 1);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        str2 = null;
                        String str3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                str2 = d4.z(fVar, 0);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                str3 = d4.z(fVar, 1);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        str = str3;
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new AiPromptStateConfig(i4, str2, str, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, AiPromptStateConfig aiPromptStateConfig) {
                    o.e(fVar, "encoder");
                    o.e(aiPromptStateConfig, "value");
                    f fVar2 = f10043b;
                    d d4 = fVar.d(fVar2);
                    AiPromptStateConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(aiPromptStateConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10042a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ AiPromptStateConfig(int i4, String str, String str2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10042a.a());
                }
                this.backgroundColor = str;
                this.fontColor = str2;
            }

            public static /* synthetic */ AiPromptStateConfig copy$default(AiPromptStateConfig aiPromptStateConfig, String str, String str2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = aiPromptStateConfig.backgroundColor;
                }
                if ((i4 & 2) != 0) {
                    str2 = aiPromptStateConfig.fontColor;
                }
                return aiPromptStateConfig.copy(str, str2);
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getFontColor$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(AiPromptStateConfig aiPromptStateConfig, d dVar, f fVar) {
                dVar.p(fVar, 0, aiPromptStateConfig.backgroundColor);
                dVar.p(fVar, 1, aiPromptStateConfig.fontColor);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final String component2() {
                return this.fontColor;
            }

            public final AiPromptStateConfig copy(String str, String str2) {
                o.e(str, "backgroundColor");
                o.e(str2, "fontColor");
                return new AiPromptStateConfig(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AiPromptStateConfig)) {
                    return false;
                }
                AiPromptStateConfig aiPromptStateConfig = (AiPromptStateConfig) obj;
                return o.a(this.backgroundColor, aiPromptStateConfig.backgroundColor) && o.a(this.fontColor, aiPromptStateConfig.fontColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getFontColor() {
                return this.fontColor;
            }

            public int hashCode() {
                return (this.backgroundColor.hashCode() * 31) + this.fontColor.hashCode();
            }

            public String toString() {
                return "AiPromptStateConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ')';
            }

            public AiPromptStateConfig(String str, String str2) {
                o.e(str, "backgroundColor");
                o.e(str2, "fontColor");
                this.backgroundColor = str;
                this.fontColor = str2;
            }
        }

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10044a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10045b;

            static {
                a aVar = new a();
                f10044a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantBarConfig", aVar, 4);
                s0Var.p("background-color", false);
                s0Var.p("font-color", false);
                s0Var.p("error-font-color", false);
                s0Var.p("ai-prompt", false);
                f10045b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10045b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                return new F2.b[]{g02, g02, g02, AiPromptConfig.a.f10040a};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final AIAssistantBarConfig b(e eVar) {
                AiPromptConfig aiPromptConfig;
                String str;
                String str2;
                String str3;
                int i4;
                e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f10045b;
                c d4 = eVar2.d(fVar);
                String str4 = null;
                if (d4.p()) {
                    String z3 = d4.z(fVar, 0);
                    String z4 = d4.z(fVar, 1);
                    String z5 = d4.z(fVar, 2);
                    str3 = z3;
                    aiPromptConfig = (AiPromptConfig) d4.E(fVar, 3, AiPromptConfig.a.f10040a, (Object) null);
                    str = z5;
                    str2 = z4;
                    i4 = 15;
                } else {
                    boolean z6 = true;
                    int i5 = 0;
                    String str5 = null;
                    String str6 = null;
                    AiPromptConfig aiPromptConfig2 = null;
                    while (z6) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z6 = false;
                        } else if (e4 == 0) {
                            str4 = d4.z(fVar, 0);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            str5 = d4.z(fVar, 1);
                            i5 |= 2;
                        } else if (e4 == 2) {
                            str6 = d4.z(fVar, 2);
                            i5 |= 4;
                        } else if (e4 == 3) {
                            aiPromptConfig2 = (AiPromptConfig) d4.E(fVar, 3, AiPromptConfig.a.f10040a, aiPromptConfig2);
                            i5 |= 8;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i5;
                    str3 = str4;
                    str2 = str5;
                    str = str6;
                    aiPromptConfig = aiPromptConfig2;
                }
                d4.c(fVar);
                return new AIAssistantBarConfig(i4, str3, str2, str, aiPromptConfig, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, AIAssistantBarConfig aIAssistantBarConfig) {
                o.e(fVar, "encoder");
                o.e(aIAssistantBarConfig, "value");
                f fVar2 = f10045b;
                d d4 = fVar.d(fVar2);
                AIAssistantBarConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(aIAssistantBarConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10044a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ AIAssistantBarConfig(int i4, String str, String str2, String str3, AiPromptConfig aiPromptConfig2, C0 c02) {
            if (15 != (i4 & 15)) {
                C0317n0.a(i4, 15, a.f10044a.a());
            }
            this.backgroundColor = str;
            this.fontColor = str2;
            this.errorFontColor = str3;
            this.aiPromptConfig = aiPromptConfig2;
        }

        public static /* synthetic */ AIAssistantBarConfig copy$default(AIAssistantBarConfig aIAssistantBarConfig, String str, String str2, String str3, AiPromptConfig aiPromptConfig2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aIAssistantBarConfig.backgroundColor;
            }
            if ((i4 & 2) != 0) {
                str2 = aIAssistantBarConfig.fontColor;
            }
            if ((i4 & 4) != 0) {
                str3 = aIAssistantBarConfig.errorFontColor;
            }
            if ((i4 & 8) != 0) {
                aiPromptConfig2 = aIAssistantBarConfig.aiPromptConfig;
            }
            return aIAssistantBarConfig.copy(str, str2, str3, aiPromptConfig2);
        }

        public static /* synthetic */ void getAiPromptConfig$annotations() {
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getErrorFontColor$annotations() {
        }

        public static /* synthetic */ void getFontColor$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(AIAssistantBarConfig aIAssistantBarConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, aIAssistantBarConfig.backgroundColor);
            dVar.p(fVar, 1, aIAssistantBarConfig.fontColor);
            dVar.p(fVar, 2, aIAssistantBarConfig.errorFontColor);
            dVar.f(fVar, 3, AiPromptConfig.a.f10040a, aIAssistantBarConfig.aiPromptConfig);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final String component2() {
            return this.fontColor;
        }

        public final String component3() {
            return this.errorFontColor;
        }

        public final AiPromptConfig component4() {
            return this.aiPromptConfig;
        }

        public final AIAssistantBarConfig copy(String str, String str2, String str3, AiPromptConfig aiPromptConfig2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fontColor");
            o.e(str3, "errorFontColor");
            o.e(aiPromptConfig2, "aiPromptConfig");
            return new AIAssistantBarConfig(str, str2, str3, aiPromptConfig2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIAssistantBarConfig)) {
                return false;
            }
            AIAssistantBarConfig aIAssistantBarConfig = (AIAssistantBarConfig) obj;
            return o.a(this.backgroundColor, aIAssistantBarConfig.backgroundColor) && o.a(this.fontColor, aIAssistantBarConfig.fontColor) && o.a(this.errorFontColor, aIAssistantBarConfig.errorFontColor) && o.a(this.aiPromptConfig, aIAssistantBarConfig.aiPromptConfig);
        }

        public final AiPromptConfig getAiPromptConfig() {
            return this.aiPromptConfig;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getErrorFontColor() {
            return this.errorFontColor;
        }

        public final String getFontColor() {
            return this.fontColor;
        }

        public int hashCode() {
            return (((((this.backgroundColor.hashCode() * 31) + this.fontColor.hashCode()) * 31) + this.errorFontColor.hashCode()) * 31) + this.aiPromptConfig.hashCode();
        }

        public String toString() {
            return "AIAssistantBarConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ", errorFontColor=" + this.errorFontColor + ", aiPromptConfig=" + this.aiPromptConfig + ')';
        }

        public AIAssistantBarConfig(String str, String str2, String str3, AiPromptConfig aiPromptConfig2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fontColor");
            o.e(str3, "errorFontColor");
            o.e(aiPromptConfig2, "aiPromptConfig");
            this.backgroundColor = str;
            this.fontColor = str2;
            this.errorFontColor = str3;
            this.aiPromptConfig = aiPromptConfig2;
        }
    }

    @m
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006/"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;", "aiAssistantBarConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;", "aiAssistantDropDownConfig", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;", "component2", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantBarConfig;", "getAiAssistantBarConfig", "getAiAssistantBarConfig$annotations", "()V", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;", "getAiAssistantDropDownConfig", "getAiAssistantDropDownConfig$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AIAssistantConfig {
        public static final b Companion = new b((i) null);
        private final AIAssistantBarConfig aiAssistantBarConfig;
        private final AIAssistantDropDownConfig aiAssistantDropDownConfig;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10046a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10047b;

            static {
                a aVar = new a();
                f10046a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantConfig", aVar, 2);
                s0Var.p("aiassistant-bar", false);
                s0Var.p("aiassistant-dropdown", false);
                f10047b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10047b;
            }

            public final F2.b[] c() {
                return new F2.b[]{AIAssistantBarConfig.a.f10044a, AIAssistantDropDownConfig.a.f10050a};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final AIAssistantConfig b(e eVar) {
                int i4;
                AIAssistantDropDownConfig aIAssistantDropDownConfig;
                AIAssistantBarConfig aIAssistantBarConfig;
                o.e(eVar, "decoder");
                f fVar = f10047b;
                c d4 = eVar.d(fVar);
                if (d4.p()) {
                    aIAssistantBarConfig = (AIAssistantBarConfig) d4.E(fVar, 0, AIAssistantBarConfig.a.f10044a, (Object) null);
                    aIAssistantDropDownConfig = (AIAssistantDropDownConfig) d4.E(fVar, 1, AIAssistantDropDownConfig.a.f10050a, (Object) null);
                    i4 = 3;
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    aIAssistantBarConfig = null;
                    AIAssistantDropDownConfig aIAssistantDropDownConfig2 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            aIAssistantBarConfig = (AIAssistantBarConfig) d4.E(fVar, 0, AIAssistantBarConfig.a.f10044a, aIAssistantBarConfig);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            aIAssistantDropDownConfig2 = (AIAssistantDropDownConfig) d4.E(fVar, 1, AIAssistantDropDownConfig.a.f10050a, aIAssistantDropDownConfig2);
                            i5 |= 2;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    aIAssistantDropDownConfig = aIAssistantDropDownConfig2;
                    i4 = i5;
                }
                d4.c(fVar);
                return new AIAssistantConfig(i4, aIAssistantBarConfig, aIAssistantDropDownConfig, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, AIAssistantConfig aIAssistantConfig) {
                o.e(fVar, "encoder");
                o.e(aIAssistantConfig, "value");
                f fVar2 = f10047b;
                d d4 = fVar.d(fVar2);
                AIAssistantConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(aIAssistantConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10046a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ AIAssistantConfig(int i4, AIAssistantBarConfig aIAssistantBarConfig, AIAssistantDropDownConfig aIAssistantDropDownConfig, C0 c02) {
            if (3 != (i4 & 3)) {
                C0317n0.a(i4, 3, a.f10046a.a());
            }
            this.aiAssistantBarConfig = aIAssistantBarConfig;
            this.aiAssistantDropDownConfig = aIAssistantDropDownConfig;
        }

        public static /* synthetic */ AIAssistantConfig copy$default(AIAssistantConfig aIAssistantConfig, AIAssistantBarConfig aIAssistantBarConfig, AIAssistantDropDownConfig aIAssistantDropDownConfig, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                aIAssistantBarConfig = aIAssistantConfig.aiAssistantBarConfig;
            }
            if ((i4 & 2) != 0) {
                aIAssistantDropDownConfig = aIAssistantConfig.aiAssistantDropDownConfig;
            }
            return aIAssistantConfig.copy(aIAssistantBarConfig, aIAssistantDropDownConfig);
        }

        public static /* synthetic */ void getAiAssistantBarConfig$annotations() {
        }

        public static /* synthetic */ void getAiAssistantDropDownConfig$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(AIAssistantConfig aIAssistantConfig, d dVar, f fVar) {
            dVar.f(fVar, 0, AIAssistantBarConfig.a.f10044a, aIAssistantConfig.aiAssistantBarConfig);
            dVar.f(fVar, 1, AIAssistantDropDownConfig.a.f10050a, aIAssistantConfig.aiAssistantDropDownConfig);
        }

        public final AIAssistantBarConfig component1() {
            return this.aiAssistantBarConfig;
        }

        public final AIAssistantDropDownConfig component2() {
            return this.aiAssistantDropDownConfig;
        }

        public final AIAssistantConfig copy(AIAssistantBarConfig aIAssistantBarConfig, AIAssistantDropDownConfig aIAssistantDropDownConfig) {
            o.e(aIAssistantBarConfig, "aiAssistantBarConfig");
            o.e(aIAssistantDropDownConfig, "aiAssistantDropDownConfig");
            return new AIAssistantConfig(aIAssistantBarConfig, aIAssistantDropDownConfig);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIAssistantConfig)) {
                return false;
            }
            AIAssistantConfig aIAssistantConfig = (AIAssistantConfig) obj;
            return o.a(this.aiAssistantBarConfig, aIAssistantConfig.aiAssistantBarConfig) && o.a(this.aiAssistantDropDownConfig, aIAssistantConfig.aiAssistantDropDownConfig);
        }

        public final AIAssistantBarConfig getAiAssistantBarConfig() {
            return this.aiAssistantBarConfig;
        }

        public final AIAssistantDropDownConfig getAiAssistantDropDownConfig() {
            return this.aiAssistantDropDownConfig;
        }

        public int hashCode() {
            return (this.aiAssistantBarConfig.hashCode() * 31) + this.aiAssistantDropDownConfig.hashCode();
        }

        public String toString() {
            return "AIAssistantConfig(aiAssistantBarConfig=" + this.aiAssistantBarConfig + ", aiAssistantDropDownConfig=" + this.aiAssistantDropDownConfig + ')';
        }

        public AIAssistantConfig(AIAssistantBarConfig aIAssistantBarConfig, AIAssistantDropDownConfig aIAssistantDropDownConfig) {
            o.e(aIAssistantBarConfig, "aiAssistantBarConfig");
            o.e(aIAssistantDropDownConfig, "aiAssistantDropDownConfig");
            this.aiAssistantBarConfig = aIAssistantBarConfig;
            this.aiAssistantDropDownConfig = aIAssistantDropDownConfig;
        }
    }

    @m
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 72\u00020\u0001:\u000389:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\u001a¨\u0006;"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;", "", "", "backgroundColor", "fontColor", "optionBackgroundColor", "optionFontColor", "optionSelectedBackgroundColor", "optionSelectedFontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "getOptionBackgroundColor", "getOptionBackgroundColor$annotations", "getOptionFontColor", "getOptionFontColor$annotations", "getOptionSelectedBackgroundColor", "getOptionSelectedBackgroundColor$annotations", "getOptionSelectedFontColor", "getOptionSelectedFontColor$annotations", "Companion", "ActionButtonStateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AIAssistantDropDownConfig {
        public static final b Companion = new b((i) null);
        private final String backgroundColor;
        private final String fontColor;
        private final String optionBackgroundColor;
        private final String optionFontColor;
        private final String optionSelectedBackgroundColor;
        private final String optionSelectedFontColor;

        @m
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig$ActionButtonStateConfig;", "", "", "backgroundColor", "fontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig$ActionButtonStateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AIAssistantDropDownConfig$ActionButtonStateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ActionButtonStateConfig {
            public static final b Companion = new b((i) null);
            private final String backgroundColor;
            private final String fontColor;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10048a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10049b;

                static {
                    a aVar = new a();
                    f10048a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantDropDownConfig.ActionButtonStateConfig", aVar, 2);
                    s0Var.p("background-color", false);
                    s0Var.p("font-color", false);
                    f10049b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10049b;
                }

                public final F2.b[] c() {
                    G0 g02 = G0.f622a;
                    return new F2.b[]{g02, g02};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final ActionButtonStateConfig b(e eVar) {
                    int i4;
                    String str;
                    String str2;
                    o.e(eVar, "decoder");
                    f fVar = f10049b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        str2 = d4.z(fVar, 0);
                        str = d4.z(fVar, 1);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        str2 = null;
                        String str3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                str2 = d4.z(fVar, 0);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                str3 = d4.z(fVar, 1);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        str = str3;
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new ActionButtonStateConfig(i4, str2, str, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, ActionButtonStateConfig actionButtonStateConfig) {
                    o.e(fVar, "encoder");
                    o.e(actionButtonStateConfig, "value");
                    f fVar2 = f10049b;
                    d d4 = fVar.d(fVar2);
                    ActionButtonStateConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(actionButtonStateConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10048a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ ActionButtonStateConfig(int i4, String str, String str2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10048a.a());
                }
                this.backgroundColor = str;
                this.fontColor = str2;
            }

            public static /* synthetic */ ActionButtonStateConfig copy$default(ActionButtonStateConfig actionButtonStateConfig, String str, String str2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = actionButtonStateConfig.backgroundColor;
                }
                if ((i4 & 2) != 0) {
                    str2 = actionButtonStateConfig.fontColor;
                }
                return actionButtonStateConfig.copy(str, str2);
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getFontColor$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(ActionButtonStateConfig actionButtonStateConfig, d dVar, f fVar) {
                dVar.p(fVar, 0, actionButtonStateConfig.backgroundColor);
                dVar.p(fVar, 1, actionButtonStateConfig.fontColor);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final String component2() {
                return this.fontColor;
            }

            public final ActionButtonStateConfig copy(String str, String str2) {
                o.e(str, "backgroundColor");
                o.e(str2, "fontColor");
                return new ActionButtonStateConfig(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButtonStateConfig)) {
                    return false;
                }
                ActionButtonStateConfig actionButtonStateConfig = (ActionButtonStateConfig) obj;
                return o.a(this.backgroundColor, actionButtonStateConfig.backgroundColor) && o.a(this.fontColor, actionButtonStateConfig.fontColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getFontColor() {
                return this.fontColor;
            }

            public int hashCode() {
                return (this.backgroundColor.hashCode() * 31) + this.fontColor.hashCode();
            }

            public String toString() {
                return "ActionButtonStateConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ')';
            }

            public ActionButtonStateConfig(String str, String str2) {
                o.e(str, "backgroundColor");
                o.e(str2, "fontColor");
                this.backgroundColor = str;
                this.fontColor = str2;
            }
        }

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10050a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10051b;

            static {
                a aVar = new a();
                f10050a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantDropDownConfig", aVar, 6);
                s0Var.p("background-color", false);
                s0Var.p("font-color", false);
                s0Var.p("option-background-color", false);
                s0Var.p("option-font-color", false);
                s0Var.p("option-selected-background", false);
                s0Var.p("option-selected-font", false);
                f10051b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10051b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                return new F2.b[]{g02, g02, g02, g02, g02, g02};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final AIAssistantDropDownConfig b(e eVar) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                int i4;
                e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f10051b;
                c d4 = eVar2.d(fVar);
                if (d4.p()) {
                    String z3 = d4.z(fVar, 0);
                    String z4 = d4.z(fVar, 1);
                    String z5 = d4.z(fVar, 2);
                    String z6 = d4.z(fVar, 3);
                    String z7 = d4.z(fVar, 4);
                    str6 = z3;
                    str = d4.z(fVar, 5);
                    str3 = z6;
                    str2 = z7;
                    str4 = z5;
                    str5 = z4;
                    i4 = 63;
                } else {
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    boolean z8 = true;
                    int i5 = 0;
                    while (z8) {
                        int e4 = d4.e(fVar);
                        switch (e4) {
                            case -1:
                                z8 = false;
                                continue;
                            case 0:
                                str7 = d4.z(fVar, 0);
                                i5 |= 1;
                                continue;
                            case 1:
                                str12 = d4.z(fVar, 1);
                                i5 |= 2;
                                break;
                            case 2:
                                str11 = d4.z(fVar, 2);
                                i5 |= 4;
                                break;
                            case 3:
                                str9 = d4.z(fVar, 3);
                                i5 |= 8;
                                break;
                            case 4:
                                str10 = d4.z(fVar, 4);
                                i5 |= 16;
                                break;
                            case 5:
                                str8 = d4.z(fVar, 5);
                                i5 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(e4);
                        }
                    }
                    str6 = str7;
                    str = str8;
                    str3 = str9;
                    str2 = str10;
                    str4 = str11;
                    str5 = str12;
                    i4 = i5;
                }
                d4.c(fVar);
                return new AIAssistantDropDownConfig(i4, str6, str5, str4, str3, str2, str, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, AIAssistantDropDownConfig aIAssistantDropDownConfig) {
                o.e(fVar, "encoder");
                o.e(aIAssistantDropDownConfig, "value");
                f fVar2 = f10051b;
                d d4 = fVar.d(fVar2);
                AIAssistantDropDownConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(aIAssistantDropDownConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10050a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ AIAssistantDropDownConfig(int i4, String str, String str2, String str3, String str4, String str5, String str6, C0 c02) {
            if (63 != (i4 & 63)) {
                C0317n0.a(i4, 63, a.f10050a.a());
            }
            this.backgroundColor = str;
            this.fontColor = str2;
            this.optionBackgroundColor = str3;
            this.optionFontColor = str4;
            this.optionSelectedBackgroundColor = str5;
            this.optionSelectedFontColor = str6;
        }

        public static /* synthetic */ AIAssistantDropDownConfig copy$default(AIAssistantDropDownConfig aIAssistantDropDownConfig, String str, String str2, String str3, String str4, String str5, String str6, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aIAssistantDropDownConfig.backgroundColor;
            }
            if ((i4 & 2) != 0) {
                str2 = aIAssistantDropDownConfig.fontColor;
            }
            String str7 = str2;
            if ((i4 & 4) != 0) {
                str3 = aIAssistantDropDownConfig.optionBackgroundColor;
            }
            String str8 = str3;
            if ((i4 & 8) != 0) {
                str4 = aIAssistantDropDownConfig.optionFontColor;
            }
            String str9 = str4;
            if ((i4 & 16) != 0) {
                str5 = aIAssistantDropDownConfig.optionSelectedBackgroundColor;
            }
            String str10 = str5;
            if ((i4 & 32) != 0) {
                str6 = aIAssistantDropDownConfig.optionSelectedFontColor;
            }
            return aIAssistantDropDownConfig.copy(str, str7, str8, str9, str10, str6);
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getFontColor$annotations() {
        }

        public static /* synthetic */ void getOptionBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getOptionFontColor$annotations() {
        }

        public static /* synthetic */ void getOptionSelectedBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getOptionSelectedFontColor$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(AIAssistantDropDownConfig aIAssistantDropDownConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, aIAssistantDropDownConfig.backgroundColor);
            dVar.p(fVar, 1, aIAssistantDropDownConfig.fontColor);
            dVar.p(fVar, 2, aIAssistantDropDownConfig.optionBackgroundColor);
            dVar.p(fVar, 3, aIAssistantDropDownConfig.optionFontColor);
            dVar.p(fVar, 4, aIAssistantDropDownConfig.optionSelectedBackgroundColor);
            dVar.p(fVar, 5, aIAssistantDropDownConfig.optionSelectedFontColor);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final String component2() {
            return this.fontColor;
        }

        public final String component3() {
            return this.optionBackgroundColor;
        }

        public final String component4() {
            return this.optionFontColor;
        }

        public final String component5() {
            return this.optionSelectedBackgroundColor;
        }

        public final String component6() {
            return this.optionSelectedFontColor;
        }

        public final AIAssistantDropDownConfig copy(String str, String str2, String str3, String str4, String str5, String str6) {
            o.e(str, "backgroundColor");
            o.e(str2, "fontColor");
            o.e(str3, "optionBackgroundColor");
            o.e(str4, "optionFontColor");
            o.e(str5, "optionSelectedBackgroundColor");
            o.e(str6, "optionSelectedFontColor");
            return new AIAssistantDropDownConfig(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIAssistantDropDownConfig)) {
                return false;
            }
            AIAssistantDropDownConfig aIAssistantDropDownConfig = (AIAssistantDropDownConfig) obj;
            return o.a(this.backgroundColor, aIAssistantDropDownConfig.backgroundColor) && o.a(this.fontColor, aIAssistantDropDownConfig.fontColor) && o.a(this.optionBackgroundColor, aIAssistantDropDownConfig.optionBackgroundColor) && o.a(this.optionFontColor, aIAssistantDropDownConfig.optionFontColor) && o.a(this.optionSelectedBackgroundColor, aIAssistantDropDownConfig.optionSelectedBackgroundColor) && o.a(this.optionSelectedFontColor, aIAssistantDropDownConfig.optionSelectedFontColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getFontColor() {
            return this.fontColor;
        }

        public final String getOptionBackgroundColor() {
            return this.optionBackgroundColor;
        }

        public final String getOptionFontColor() {
            return this.optionFontColor;
        }

        public final String getOptionSelectedBackgroundColor() {
            return this.optionSelectedBackgroundColor;
        }

        public final String getOptionSelectedFontColor() {
            return this.optionSelectedFontColor;
        }

        public int hashCode() {
            return (((((((((this.backgroundColor.hashCode() * 31) + this.fontColor.hashCode()) * 31) + this.optionBackgroundColor.hashCode()) * 31) + this.optionFontColor.hashCode()) * 31) + this.optionSelectedBackgroundColor.hashCode()) * 31) + this.optionSelectedFontColor.hashCode();
        }

        public String toString() {
            return "AIAssistantDropDownConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ", optionBackgroundColor=" + this.optionBackgroundColor + ", optionFontColor=" + this.optionFontColor + ", optionSelectedBackgroundColor=" + this.optionSelectedBackgroundColor + ", optionSelectedFontColor=" + this.optionSelectedFontColor + ')';
        }

        public AIAssistantDropDownConfig(String str, String str2, String str3, String str4, String str5, String str6) {
            o.e(str, "backgroundColor");
            o.e(str2, "fontColor");
            o.e(str3, "optionBackgroundColor");
            o.e(str4, "optionFontColor");
            o.e(str5, "optionSelectedBackgroundColor");
            o.e(str6, "optionSelectedFontColor");
            this.backgroundColor = str;
            this.fontColor = str2;
            this.optionBackgroundColor = str3;
            this.optionFontColor = str4;
            this.optionSelectedBackgroundColor = str5;
            this.optionSelectedFontColor = str6;
        }
    }

    @m
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\u00020\u0001:\u0003+,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006."}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;", "", "", "backgroundColor", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;", "character", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;", "getCharacter", "getCharacter$annotations", "Companion", "CharacterConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlternativeCharactersPopupConfig {
        public static final b Companion = new b((i) null);
        private final String backgroundColor;
        private final CharacterConfig character;

        @m
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 )2\u00020\u0001:\u0003*+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006-"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;", "stateDefault", "stateActive", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;", "getStateDefault", "getStateDefault$annotations", "()V", "getStateActive", "getStateActive$annotations", "Companion", "StateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CharacterConfig {
            public static final b Companion = new b((i) null);
            private final StateConfig stateActive;
            private final StateConfig stateDefault;

            @m
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;", "", "", "backgroundColor", "fontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$AlternativeCharactersPopupConfig$CharacterConfig$StateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class StateConfig {
                public static final b Companion = new b((i) null);
                private final String backgroundColor;
                private final String fontColor;

                public /* synthetic */ class a implements F {

                    /* renamed from: a  reason: collision with root package name */
                    public static final a f10052a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final f f10053b;

                    static {
                        a aVar = new a();
                        f10052a = aVar;
                        C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig.CharacterConfig.StateConfig", aVar, 2);
                        s0Var.p("background-color", false);
                        s0Var.p("font-color", false);
                        f10053b = s0Var;
                    }

                    private a() {
                    }

                    public final f a() {
                        return f10053b;
                    }

                    public final F2.b[] c() {
                        G0 g02 = G0.f622a;
                        return new F2.b[]{G2.a.u(g02), g02};
                    }

                    public F2.b[] d() {
                        return F.a.a(this);
                    }

                    /* renamed from: f */
                    public final StateConfig b(e eVar) {
                        int i4;
                        String str;
                        String str2;
                        o.e(eVar, "decoder");
                        f fVar = f10053b;
                        c d4 = eVar.d(fVar);
                        if (d4.p()) {
                            str2 = (String) d4.m(fVar, 0, G0.f622a, (Object) null);
                            str = d4.z(fVar, 1);
                            i4 = 3;
                        } else {
                            boolean z3 = true;
                            int i5 = 0;
                            str2 = null;
                            String str3 = null;
                            while (z3) {
                                int e4 = d4.e(fVar);
                                if (e4 == -1) {
                                    z3 = false;
                                } else if (e4 == 0) {
                                    str2 = (String) d4.m(fVar, 0, G0.f622a, str2);
                                    i5 |= 1;
                                } else if (e4 == 1) {
                                    str3 = d4.z(fVar, 1);
                                    i5 |= 2;
                                } else {
                                    throw new UnknownFieldException(e4);
                                }
                            }
                            str = str3;
                            i4 = i5;
                        }
                        d4.c(fVar);
                        return new StateConfig(i4, str2, str, (C0) null);
                    }

                    /* renamed from: g */
                    public final void e(I2.f fVar, StateConfig stateConfig) {
                        o.e(fVar, "encoder");
                        o.e(stateConfig, "value");
                        f fVar2 = f10053b;
                        d d4 = fVar.d(fVar2);
                        StateConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(stateConfig, d4, fVar2);
                        d4.c(fVar2);
                    }
                }

                public static final class b {
                    private b() {
                    }

                    public final F2.b serializer() {
                        return a.f10052a;
                    }

                    public /* synthetic */ b(i iVar) {
                        this();
                    }
                }

                public /* synthetic */ StateConfig(int i4, String str, String str2, C0 c02) {
                    if (3 != (i4 & 3)) {
                        C0317n0.a(i4, 3, a.f10052a.a());
                    }
                    this.backgroundColor = str;
                    this.fontColor = str2;
                }

                public static /* synthetic */ StateConfig copy$default(StateConfig stateConfig, String str, String str2, int i4, Object obj) {
                    if ((i4 & 1) != 0) {
                        str = stateConfig.backgroundColor;
                    }
                    if ((i4 & 2) != 0) {
                        str2 = stateConfig.fontColor;
                    }
                    return stateConfig.copy(str, str2);
                }

                public static /* synthetic */ void getBackgroundColor$annotations() {
                }

                public static /* synthetic */ void getFontColor$annotations() {
                }

                public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(StateConfig stateConfig, d dVar, f fVar) {
                    dVar.o(fVar, 0, G0.f622a, stateConfig.backgroundColor);
                    dVar.p(fVar, 1, stateConfig.fontColor);
                }

                public final String component1() {
                    return this.backgroundColor;
                }

                public final String component2() {
                    return this.fontColor;
                }

                public final StateConfig copy(String str, String str2) {
                    o.e(str2, "fontColor");
                    return new StateConfig(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof StateConfig)) {
                        return false;
                    }
                    StateConfig stateConfig = (StateConfig) obj;
                    return o.a(this.backgroundColor, stateConfig.backgroundColor) && o.a(this.fontColor, stateConfig.fontColor);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final String getFontColor() {
                    return this.fontColor;
                }

                public int hashCode() {
                    String str = this.backgroundColor;
                    return ((str == null ? 0 : str.hashCode()) * 31) + this.fontColor.hashCode();
                }

                public String toString() {
                    return "StateConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ')';
                }

                public StateConfig(String str, String str2) {
                    o.e(str2, "fontColor");
                    this.backgroundColor = str;
                    this.fontColor = str2;
                }
            }

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10054a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10055b;

                static {
                    a aVar = new a();
                    f10054a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig.CharacterConfig", aVar, 2);
                    s0Var.p("state-default", false);
                    s0Var.p("state-active", false);
                    f10055b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10055b;
                }

                public final F2.b[] c() {
                    StateConfig.a aVar = StateConfig.a.f10052a;
                    return new F2.b[]{aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final CharacterConfig b(e eVar) {
                    StateConfig stateConfig;
                    int i4;
                    StateConfig stateConfig2;
                    o.e(eVar, "decoder");
                    f fVar = f10055b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        StateConfig.a aVar = StateConfig.a.f10052a;
                        stateConfig = (StateConfig) d4.E(fVar, 0, aVar, (Object) null);
                        stateConfig2 = (StateConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        stateConfig2 = null;
                        StateConfig stateConfig3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                stateConfig3 = (StateConfig) d4.E(fVar, 0, StateConfig.a.f10052a, stateConfig3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                stateConfig2 = (StateConfig) d4.E(fVar, 1, StateConfig.a.f10052a, stateConfig2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        stateConfig = stateConfig3;
                    }
                    d4.c(fVar);
                    return new CharacterConfig(i4, stateConfig, stateConfig2, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, CharacterConfig characterConfig) {
                    o.e(fVar, "encoder");
                    o.e(characterConfig, "value");
                    f fVar2 = f10055b;
                    d d4 = fVar.d(fVar2);
                    CharacterConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(characterConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10054a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ CharacterConfig(int i4, StateConfig stateConfig, StateConfig stateConfig2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10054a.a());
                }
                this.stateDefault = stateConfig;
                this.stateActive = stateConfig2;
            }

            public static /* synthetic */ CharacterConfig copy$default(CharacterConfig characterConfig, StateConfig stateConfig, StateConfig stateConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    stateConfig = characterConfig.stateDefault;
                }
                if ((i4 & 2) != 0) {
                    stateConfig2 = characterConfig.stateActive;
                }
                return characterConfig.copy(stateConfig, stateConfig2);
            }

            public static /* synthetic */ void getStateActive$annotations() {
            }

            public static /* synthetic */ void getStateDefault$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(CharacterConfig characterConfig, d dVar, f fVar) {
                StateConfig.a aVar = StateConfig.a.f10052a;
                dVar.f(fVar, 0, aVar, characterConfig.stateDefault);
                dVar.f(fVar, 1, aVar, characterConfig.stateActive);
            }

            public final StateConfig component1() {
                return this.stateDefault;
            }

            public final StateConfig component2() {
                return this.stateActive;
            }

            public final CharacterConfig copy(StateConfig stateConfig, StateConfig stateConfig2) {
                o.e(stateConfig, "stateDefault");
                o.e(stateConfig2, "stateActive");
                return new CharacterConfig(stateConfig, stateConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CharacterConfig)) {
                    return false;
                }
                CharacterConfig characterConfig = (CharacterConfig) obj;
                return o.a(this.stateDefault, characterConfig.stateDefault) && o.a(this.stateActive, characterConfig.stateActive);
            }

            public final StateConfig getStateActive() {
                return this.stateActive;
            }

            public final StateConfig getStateDefault() {
                return this.stateDefault;
            }

            public int hashCode() {
                return (this.stateDefault.hashCode() * 31) + this.stateActive.hashCode();
            }

            public String toString() {
                return "CharacterConfig(stateDefault=" + this.stateDefault + ", stateActive=" + this.stateActive + ')';
            }

            public CharacterConfig(StateConfig stateConfig, StateConfig stateConfig2) {
                o.e(stateConfig, "stateDefault");
                o.e(stateConfig2, "stateActive");
                this.stateDefault = stateConfig;
                this.stateActive = stateConfig2;
            }
        }

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10056a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10057b;

            static {
                a aVar = new a();
                f10056a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig", aVar, 2);
                s0Var.p("background", false);
                s0Var.p("character", false);
                f10057b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10057b;
            }

            public final F2.b[] c() {
                return new F2.b[]{G0.f622a, CharacterConfig.a.f10054a};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final AlternativeCharactersPopupConfig b(e eVar) {
                int i4;
                CharacterConfig characterConfig;
                String str;
                o.e(eVar, "decoder");
                f fVar = f10057b;
                c d4 = eVar.d(fVar);
                if (d4.p()) {
                    str = d4.z(fVar, 0);
                    characterConfig = (CharacterConfig) d4.E(fVar, 1, CharacterConfig.a.f10054a, (Object) null);
                    i4 = 3;
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    str = null;
                    CharacterConfig characterConfig2 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            str = d4.z(fVar, 0);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            characterConfig2 = (CharacterConfig) d4.E(fVar, 1, CharacterConfig.a.f10054a, characterConfig2);
                            i5 |= 2;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    characterConfig = characterConfig2;
                    i4 = i5;
                }
                d4.c(fVar);
                return new AlternativeCharactersPopupConfig(i4, str, characterConfig, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, AlternativeCharactersPopupConfig alternativeCharactersPopupConfig) {
                o.e(fVar, "encoder");
                o.e(alternativeCharactersPopupConfig, "value");
                f fVar2 = f10057b;
                d d4 = fVar.d(fVar2);
                AlternativeCharactersPopupConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(alternativeCharactersPopupConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10056a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ AlternativeCharactersPopupConfig(int i4, String str, CharacterConfig characterConfig, C0 c02) {
            if (3 != (i4 & 3)) {
                C0317n0.a(i4, 3, a.f10056a.a());
            }
            this.backgroundColor = str;
            this.character = characterConfig;
        }

        public static /* synthetic */ AlternativeCharactersPopupConfig copy$default(AlternativeCharactersPopupConfig alternativeCharactersPopupConfig, String str, CharacterConfig characterConfig, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = alternativeCharactersPopupConfig.backgroundColor;
            }
            if ((i4 & 2) != 0) {
                characterConfig = alternativeCharactersPopupConfig.character;
            }
            return alternativeCharactersPopupConfig.copy(str, characterConfig);
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getCharacter$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(AlternativeCharactersPopupConfig alternativeCharactersPopupConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, alternativeCharactersPopupConfig.backgroundColor);
            dVar.f(fVar, 1, CharacterConfig.a.f10054a, alternativeCharactersPopupConfig.character);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final CharacterConfig component2() {
            return this.character;
        }

        public final AlternativeCharactersPopupConfig copy(String str, CharacterConfig characterConfig) {
            o.e(str, "backgroundColor");
            o.e(characterConfig, "character");
            return new AlternativeCharactersPopupConfig(str, characterConfig);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlternativeCharactersPopupConfig)) {
                return false;
            }
            AlternativeCharactersPopupConfig alternativeCharactersPopupConfig = (AlternativeCharactersPopupConfig) obj;
            return o.a(this.backgroundColor, alternativeCharactersPopupConfig.backgroundColor) && o.a(this.character, alternativeCharactersPopupConfig.character);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CharacterConfig getCharacter() {
            return this.character;
        }

        public int hashCode() {
            return (this.backgroundColor.hashCode() * 31) + this.character.hashCode();
        }

        public String toString() {
            return "AlternativeCharactersPopupConfig(backgroundColor=" + this.backgroundColor + ", character=" + this.character + ')';
        }

        public AlternativeCharactersPopupConfig(String str, CharacterConfig characterConfig) {
            o.e(str, "backgroundColor");
            o.e(characterConfig, "character");
            this.backgroundColor = str;
            this.character = characterConfig;
        }
    }

    @m
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;", "", "", "backgroundColor", "fontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$CharacterPreviewPopupConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CharacterPreviewPopupConfig {
        public static final b Companion = new b((i) null);
        private final String backgroundColor;
        private final String fontColor;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10058a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10059b;

            static {
                a aVar = new a();
                f10058a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.CharacterPreviewPopupConfig", aVar, 2);
                s0Var.p("background", false);
                s0Var.p("font-color", false);
                f10059b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10059b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                return new F2.b[]{g02, g02};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final CharacterPreviewPopupConfig b(e eVar) {
                int i4;
                String str;
                String str2;
                o.e(eVar, "decoder");
                f fVar = f10059b;
                c d4 = eVar.d(fVar);
                if (d4.p()) {
                    str2 = d4.z(fVar, 0);
                    str = d4.z(fVar, 1);
                    i4 = 3;
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    str2 = null;
                    String str3 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            str2 = d4.z(fVar, 0);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            str3 = d4.z(fVar, 1);
                            i5 |= 2;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    str = str3;
                    i4 = i5;
                }
                d4.c(fVar);
                return new CharacterPreviewPopupConfig(i4, str2, str, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, CharacterPreviewPopupConfig characterPreviewPopupConfig) {
                o.e(fVar, "encoder");
                o.e(characterPreviewPopupConfig, "value");
                f fVar2 = f10059b;
                d d4 = fVar.d(fVar2);
                CharacterPreviewPopupConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(characterPreviewPopupConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10058a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ CharacterPreviewPopupConfig(int i4, String str, String str2, C0 c02) {
            if (3 != (i4 & 3)) {
                C0317n0.a(i4, 3, a.f10058a.a());
            }
            this.backgroundColor = str;
            this.fontColor = str2;
        }

        public static /* synthetic */ CharacterPreviewPopupConfig copy$default(CharacterPreviewPopupConfig characterPreviewPopupConfig, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = characterPreviewPopupConfig.backgroundColor;
            }
            if ((i4 & 2) != 0) {
                str2 = characterPreviewPopupConfig.fontColor;
            }
            return characterPreviewPopupConfig.copy(str, str2);
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getFontColor$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(CharacterPreviewPopupConfig characterPreviewPopupConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, characterPreviewPopupConfig.backgroundColor);
            dVar.p(fVar, 1, characterPreviewPopupConfig.fontColor);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final String component2() {
            return this.fontColor;
        }

        public final CharacterPreviewPopupConfig copy(String str, String str2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fontColor");
            return new CharacterPreviewPopupConfig(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CharacterPreviewPopupConfig)) {
                return false;
            }
            CharacterPreviewPopupConfig characterPreviewPopupConfig = (CharacterPreviewPopupConfig) obj;
            return o.a(this.backgroundColor, characterPreviewPopupConfig.backgroundColor) && o.a(this.fontColor, characterPreviewPopupConfig.fontColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getFontColor() {
            return this.fontColor;
        }

        public int hashCode() {
            return (this.backgroundColor.hashCode() * 31) + this.fontColor.hashCode();
        }

        public String toString() {
            return "CharacterPreviewPopupConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ')';
        }

        public CharacterPreviewPopupConfig(String str, String str2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fontColor");
            this.backgroundColor = str;
            this.fontColor = str2;
        }
    }

    @m
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;", "", "", "backgroundColor", "fallbackBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$GestureOverlayConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFallbackBackgroundColor", "getFallbackBackgroundColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GestureOverlayConfig {
        public static final b Companion = new b((i) null);
        private final String backgroundColor;
        private final String fallbackBackgroundColor;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10060a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10061b;

            static {
                a aVar = new a();
                f10060a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.GestureOverlayConfig", aVar, 2);
                s0Var.p("background-color", false);
                s0Var.p("fallback-background", false);
                f10061b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10061b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                return new F2.b[]{g02, g02};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final GestureOverlayConfig b(e eVar) {
                int i4;
                String str;
                String str2;
                o.e(eVar, "decoder");
                f fVar = f10061b;
                c d4 = eVar.d(fVar);
                if (d4.p()) {
                    str2 = d4.z(fVar, 0);
                    str = d4.z(fVar, 1);
                    i4 = 3;
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    str2 = null;
                    String str3 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            str2 = d4.z(fVar, 0);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            str3 = d4.z(fVar, 1);
                            i5 |= 2;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    str = str3;
                    i4 = i5;
                }
                d4.c(fVar);
                return new GestureOverlayConfig(i4, str2, str, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, GestureOverlayConfig gestureOverlayConfig) {
                o.e(fVar, "encoder");
                o.e(gestureOverlayConfig, "value");
                f fVar2 = f10061b;
                d d4 = fVar.d(fVar2);
                GestureOverlayConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(gestureOverlayConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10060a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ GestureOverlayConfig(int i4, String str, String str2, C0 c02) {
            if (3 != (i4 & 3)) {
                C0317n0.a(i4, 3, a.f10060a.a());
            }
            this.backgroundColor = str;
            this.fallbackBackgroundColor = str2;
        }

        public static /* synthetic */ GestureOverlayConfig copy$default(GestureOverlayConfig gestureOverlayConfig, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = gestureOverlayConfig.backgroundColor;
            }
            if ((i4 & 2) != 0) {
                str2 = gestureOverlayConfig.fallbackBackgroundColor;
            }
            return gestureOverlayConfig.copy(str, str2);
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getFallbackBackgroundColor$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(GestureOverlayConfig gestureOverlayConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, gestureOverlayConfig.backgroundColor);
            dVar.p(fVar, 1, gestureOverlayConfig.fallbackBackgroundColor);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final String component2() {
            return this.fallbackBackgroundColor;
        }

        public final GestureOverlayConfig copy(String str, String str2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fallbackBackgroundColor");
            return new GestureOverlayConfig(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GestureOverlayConfig)) {
                return false;
            }
            GestureOverlayConfig gestureOverlayConfig = (GestureOverlayConfig) obj;
            return o.a(this.backgroundColor, gestureOverlayConfig.backgroundColor) && o.a(this.fallbackBackgroundColor, gestureOverlayConfig.fallbackBackgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getFallbackBackgroundColor() {
            return this.fallbackBackgroundColor;
        }

        public int hashCode() {
            return (this.backgroundColor.hashCode() * 31) + this.fallbackBackgroundColor.hashCode();
        }

        public String toString() {
            return "GestureOverlayConfig(backgroundColor=" + this.backgroundColor + ", fallbackBackgroundColor=" + this.fallbackBackgroundColor + ')';
        }

        public GestureOverlayConfig(String str, String str2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fallbackBackgroundColor");
            this.backgroundColor = str;
            this.fallbackBackgroundColor = str2;
        }
    }

    @m
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b(\b\b\u0018\u0000 Z2\u00020\u0001:\u0007[\\]^_`aBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010=\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010#R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010C\u0012\u0004\bE\u0010@\u001a\u0004\bD\u0010&R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bG\u0010@\u001a\u0004\bF\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bJ\u0010@\u001a\u0004\bI\u0010)R \u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010H\u0012\u0004\bL\u0010@\u001a\u0004\bK\u0010)R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\bO\u0010@\u001a\u0004\bN\u0010,R \u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\bQ\u0010@\u001a\u0004\bP\u0010#R \u0010\u000e\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\bS\u0010@\u001a\u0004\bR\u0010#R \u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\bU\u0010@\u001a\u0004\bT\u0010#R \u0010\u0010\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\bW\u0010@\u001a\u0004\bV\u0010#R \u0010\u0011\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\bY\u0010@\u001a\u0004\bX\u0010#¨\u0006b"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "character", "space", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;", "split", "splitEmojiNumber", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;", "caps", "delete", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;", "returnKeyConfig", "moreCharacters", "emoji", "moreMaths", "moreNumbers", "mainLayout", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "component2", "component3", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;", "component4", "component5", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;", "component6", "component7", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;", "component8", "component9", "component10", "component11", "component12", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "getCharacter", "getCharacter$annotations", "()V", "getSpace", "getSpace$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;", "getSplit", "getSplit$annotations", "getSplitEmojiNumber", "getSplitEmojiNumber$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;", "getCaps", "getCaps$annotations", "getDelete", "getDelete$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;", "getReturnKeyConfig", "getReturnKeyConfig$annotations", "getMoreCharacters", "getMoreCharacters$annotations", "getEmoji", "getEmoji$annotations", "getMoreMaths", "getMoreMaths$annotations", "getMoreNumbers", "getMoreNumbers$annotations", "getMainLayout", "getMainLayout$annotations", "Companion", "IconKeyConfig", "LayoutDependentKeyConfig", "RegularKeyConfig", "SplitKeyConfig", "KeyStateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KeysConfig {
        public static final b Companion = new b((i) null);
        private final LayoutDependentKeyConfig caps;
        private final RegularKeyConfig character;
        private final LayoutDependentKeyConfig delete;
        private final RegularKeyConfig emoji;
        private final RegularKeyConfig mainLayout;
        private final RegularKeyConfig moreCharacters;
        private final RegularKeyConfig moreMaths;
        private final RegularKeyConfig moreNumbers;
        private final IconKeyConfig returnKeyConfig;
        private final RegularKeyConfig space;
        private final SplitKeyConfig split;
        private final SplitKeyConfig splitEmojiNumber;

        @m
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00061"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;", "", "", "iconName", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "stateDefault", "stateActive", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "component3", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$IconKeyConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconName", "getIconName$annotations", "()V", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "getStateDefault", "getStateDefault$annotations", "getStateActive", "getStateActive$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconKeyConfig {
            public static final b Companion = new b((i) null);
            private final String iconName;
            private final KeyStateConfig stateActive;
            private final KeyStateConfig stateDefault;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10062a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10063b;

                static {
                    a aVar = new a();
                    f10062a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.IconKeyConfig", aVar, 3);
                    s0Var.p("icon", false);
                    s0Var.p("state-default", false);
                    s0Var.p("state-active", false);
                    f10063b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10063b;
                }

                public final F2.b[] c() {
                    KeyStateConfig.a aVar = KeyStateConfig.a.f10064a;
                    return new F2.b[]{G0.f622a, aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final IconKeyConfig b(e eVar) {
                    KeyStateConfig keyStateConfig;
                    KeyStateConfig keyStateConfig2;
                    String str;
                    int i4;
                    e eVar2 = eVar;
                    o.e(eVar2, "decoder");
                    f fVar = f10063b;
                    c d4 = eVar2.d(fVar);
                    String str2 = null;
                    if (d4.p()) {
                        String z3 = d4.z(fVar, 0);
                        KeyStateConfig.a aVar = KeyStateConfig.a.f10064a;
                        str = z3;
                        keyStateConfig = (KeyStateConfig) d4.E(fVar, 2, aVar, (Object) null);
                        keyStateConfig2 = (KeyStateConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 7;
                    } else {
                        boolean z4 = true;
                        int i5 = 0;
                        KeyStateConfig keyStateConfig3 = null;
                        KeyStateConfig keyStateConfig4 = null;
                        while (z4) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z4 = false;
                            } else if (e4 == 0) {
                                str2 = d4.z(fVar, 0);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                keyStateConfig3 = (KeyStateConfig) d4.E(fVar, 1, KeyStateConfig.a.f10064a, keyStateConfig3);
                                i5 |= 2;
                            } else if (e4 == 2) {
                                keyStateConfig4 = (KeyStateConfig) d4.E(fVar, 2, KeyStateConfig.a.f10064a, keyStateConfig4);
                                i5 |= 4;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        str = str2;
                        keyStateConfig2 = keyStateConfig3;
                        keyStateConfig = keyStateConfig4;
                    }
                    d4.c(fVar);
                    return new IconKeyConfig(i4, str, keyStateConfig2, keyStateConfig, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, IconKeyConfig iconKeyConfig) {
                    o.e(fVar, "encoder");
                    o.e(iconKeyConfig, "value");
                    f fVar2 = f10063b;
                    d d4 = fVar.d(fVar2);
                    IconKeyConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(iconKeyConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10062a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ IconKeyConfig(int i4, String str, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2, C0 c02) {
                if (7 != (i4 & 7)) {
                    C0317n0.a(i4, 7, a.f10062a.a());
                }
                this.iconName = str;
                this.stateDefault = keyStateConfig;
                this.stateActive = keyStateConfig2;
            }

            public static /* synthetic */ IconKeyConfig copy$default(IconKeyConfig iconKeyConfig, String str, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = iconKeyConfig.iconName;
                }
                if ((i4 & 2) != 0) {
                    keyStateConfig = iconKeyConfig.stateDefault;
                }
                if ((i4 & 4) != 0) {
                    keyStateConfig2 = iconKeyConfig.stateActive;
                }
                return iconKeyConfig.copy(str, keyStateConfig, keyStateConfig2);
            }

            public static /* synthetic */ void getIconName$annotations() {
            }

            public static /* synthetic */ void getStateActive$annotations() {
            }

            public static /* synthetic */ void getStateDefault$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(IconKeyConfig iconKeyConfig, d dVar, f fVar) {
                dVar.p(fVar, 0, iconKeyConfig.iconName);
                KeyStateConfig.a aVar = KeyStateConfig.a.f10064a;
                dVar.f(fVar, 1, aVar, iconKeyConfig.stateDefault);
                dVar.f(fVar, 2, aVar, iconKeyConfig.stateActive);
            }

            public final String component1() {
                return this.iconName;
            }

            public final KeyStateConfig component2() {
                return this.stateDefault;
            }

            public final KeyStateConfig component3() {
                return this.stateActive;
            }

            public final IconKeyConfig copy(String str, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2) {
                o.e(str, "iconName");
                o.e(keyStateConfig, "stateDefault");
                o.e(keyStateConfig2, "stateActive");
                return new IconKeyConfig(str, keyStateConfig, keyStateConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconKeyConfig)) {
                    return false;
                }
                IconKeyConfig iconKeyConfig = (IconKeyConfig) obj;
                return o.a(this.iconName, iconKeyConfig.iconName) && o.a(this.stateDefault, iconKeyConfig.stateDefault) && o.a(this.stateActive, iconKeyConfig.stateActive);
            }

            public final String getIconName() {
                return this.iconName;
            }

            public final KeyStateConfig getStateActive() {
                return this.stateActive;
            }

            public final KeyStateConfig getStateDefault() {
                return this.stateDefault;
            }

            public int hashCode() {
                return (((this.iconName.hashCode() * 31) + this.stateDefault.hashCode()) * 31) + this.stateActive.hashCode();
            }

            public String toString() {
                return "IconKeyConfig(iconName=" + this.iconName + ", stateDefault=" + this.stateDefault + ", stateActive=" + this.stateActive + ')';
            }

            public IconKeyConfig(String str, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2) {
                o.e(str, "iconName");
                o.e(keyStateConfig, "stateDefault");
                o.e(keyStateConfig2, "stateActive");
                this.iconName = str;
                this.stateDefault = keyStateConfig;
                this.stateActive = keyStateConfig2;
            }
        }

        @m
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "", "", "backgroundColor", "fontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class KeyStateConfig {
            public static final b Companion = new b((i) null);
            private final String backgroundColor;
            private final String fontColor;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10064a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10065b;

                static {
                    a aVar = new a();
                    f10064a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.KeyStateConfig", aVar, 2);
                    s0Var.p("background-color", false);
                    s0Var.p("font-color", false);
                    f10065b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10065b;
                }

                public final F2.b[] c() {
                    G0 g02 = G0.f622a;
                    return new F2.b[]{G2.a.u(g02), G2.a.u(g02)};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final KeyStateConfig b(e eVar) {
                    String str;
                    int i4;
                    String str2;
                    o.e(eVar, "decoder");
                    f fVar = f10065b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        G0 g02 = G0.f622a;
                        str = (String) d4.m(fVar, 0, g02, (Object) null);
                        str2 = (String) d4.m(fVar, 1, g02, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        str2 = null;
                        String str3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                str3 = (String) d4.m(fVar, 0, G0.f622a, str3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                str2 = (String) d4.m(fVar, 1, G0.f622a, str2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        str = str3;
                    }
                    d4.c(fVar);
                    return new KeyStateConfig(i4, str, str2, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, KeyStateConfig keyStateConfig) {
                    o.e(fVar, "encoder");
                    o.e(keyStateConfig, "value");
                    f fVar2 = f10065b;
                    d d4 = fVar.d(fVar2);
                    KeyStateConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(keyStateConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10064a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ KeyStateConfig(int i4, String str, String str2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10064a.a());
                }
                this.backgroundColor = str;
                this.fontColor = str2;
            }

            public static /* synthetic */ KeyStateConfig copy$default(KeyStateConfig keyStateConfig, String str, String str2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = keyStateConfig.backgroundColor;
                }
                if ((i4 & 2) != 0) {
                    str2 = keyStateConfig.fontColor;
                }
                return keyStateConfig.copy(str, str2);
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getFontColor$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(KeyStateConfig keyStateConfig, d dVar, f fVar) {
                G0 g02 = G0.f622a;
                dVar.o(fVar, 0, g02, keyStateConfig.backgroundColor);
                dVar.o(fVar, 1, g02, keyStateConfig.fontColor);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final String component2() {
                return this.fontColor;
            }

            public final KeyStateConfig copy(String str, String str2) {
                return new KeyStateConfig(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KeyStateConfig)) {
                    return false;
                }
                KeyStateConfig keyStateConfig = (KeyStateConfig) obj;
                return o.a(this.backgroundColor, keyStateConfig.backgroundColor) && o.a(this.fontColor, keyStateConfig.fontColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getFontColor() {
                return this.fontColor;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int i4 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.fontColor;
                if (str2 != null) {
                    i4 = str2.hashCode();
                }
                return hashCode + i4;
            }

            public String toString() {
                return "KeyStateConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ')';
            }

            public KeyStateConfig(String str, String str2) {
                this.backgroundColor = str;
                this.fontColor = str2;
            }
        }

        @m
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "hexagon", "rectangle", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$LayoutDependentKeyConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "getHexagon", "getHexagon$annotations", "()V", "getRectangle", "getRectangle$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LayoutDependentKeyConfig {
            public static final b Companion = new b((i) null);
            private final RegularKeyConfig hexagon;
            private final RegularKeyConfig rectangle;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10066a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10067b;

                static {
                    a aVar = new a();
                    f10066a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig", aVar, 2);
                    s0Var.p("hexagon", false);
                    s0Var.p("rectangle", false);
                    f10067b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10067b;
                }

                public final F2.b[] c() {
                    RegularKeyConfig.a aVar = RegularKeyConfig.a.f10068a;
                    return new F2.b[]{aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final LayoutDependentKeyConfig b(e eVar) {
                    RegularKeyConfig regularKeyConfig;
                    int i4;
                    RegularKeyConfig regularKeyConfig2;
                    o.e(eVar, "decoder");
                    f fVar = f10067b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        RegularKeyConfig.a aVar = RegularKeyConfig.a.f10068a;
                        regularKeyConfig = (RegularKeyConfig) d4.E(fVar, 0, aVar, (Object) null);
                        regularKeyConfig2 = (RegularKeyConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        regularKeyConfig2 = null;
                        RegularKeyConfig regularKeyConfig3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                regularKeyConfig3 = (RegularKeyConfig) d4.E(fVar, 0, RegularKeyConfig.a.f10068a, regularKeyConfig3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                regularKeyConfig2 = (RegularKeyConfig) d4.E(fVar, 1, RegularKeyConfig.a.f10068a, regularKeyConfig2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        regularKeyConfig = regularKeyConfig3;
                    }
                    d4.c(fVar);
                    return new LayoutDependentKeyConfig(i4, regularKeyConfig, regularKeyConfig2, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, LayoutDependentKeyConfig layoutDependentKeyConfig) {
                    o.e(fVar, "encoder");
                    o.e(layoutDependentKeyConfig, "value");
                    f fVar2 = f10067b;
                    d d4 = fVar.d(fVar2);
                    LayoutDependentKeyConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(layoutDependentKeyConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10066a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ LayoutDependentKeyConfig(int i4, RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10066a.a());
                }
                this.hexagon = regularKeyConfig;
                this.rectangle = regularKeyConfig2;
            }

            public static /* synthetic */ LayoutDependentKeyConfig copy$default(LayoutDependentKeyConfig layoutDependentKeyConfig, RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    regularKeyConfig = layoutDependentKeyConfig.hexagon;
                }
                if ((i4 & 2) != 0) {
                    regularKeyConfig2 = layoutDependentKeyConfig.rectangle;
                }
                return layoutDependentKeyConfig.copy(regularKeyConfig, regularKeyConfig2);
            }

            public static /* synthetic */ void getHexagon$annotations() {
            }

            public static /* synthetic */ void getRectangle$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(LayoutDependentKeyConfig layoutDependentKeyConfig, d dVar, f fVar) {
                RegularKeyConfig.a aVar = RegularKeyConfig.a.f10068a;
                dVar.f(fVar, 0, aVar, layoutDependentKeyConfig.hexagon);
                dVar.f(fVar, 1, aVar, layoutDependentKeyConfig.rectangle);
            }

            public final RegularKeyConfig component1() {
                return this.hexagon;
            }

            public final RegularKeyConfig component2() {
                return this.rectangle;
            }

            public final LayoutDependentKeyConfig copy(RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2) {
                o.e(regularKeyConfig, "hexagon");
                o.e(regularKeyConfig2, "rectangle");
                return new LayoutDependentKeyConfig(regularKeyConfig, regularKeyConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LayoutDependentKeyConfig)) {
                    return false;
                }
                LayoutDependentKeyConfig layoutDependentKeyConfig = (LayoutDependentKeyConfig) obj;
                return o.a(this.hexagon, layoutDependentKeyConfig.hexagon) && o.a(this.rectangle, layoutDependentKeyConfig.rectangle);
            }

            public final RegularKeyConfig getHexagon() {
                return this.hexagon;
            }

            public final RegularKeyConfig getRectangle() {
                return this.rectangle;
            }

            public int hashCode() {
                return (this.hexagon.hashCode() * 31) + this.rectangle.hashCode();
            }

            public String toString() {
                return "LayoutDependentKeyConfig(hexagon=" + this.hexagon + ", rectangle=" + this.rectangle + ')';
            }

            public LayoutDependentKeyConfig(RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2) {
                o.e(regularKeyConfig, "hexagon");
                o.e(regularKeyConfig2, "rectangle");
                this.hexagon = regularKeyConfig;
                this.rectangle = regularKeyConfig2;
            }
        }

        @m
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "stateDefault", "stateActive", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$RegularKeyConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$KeyStateConfig;", "getStateDefault", "getStateDefault$annotations", "()V", "getStateActive", "getStateActive$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RegularKeyConfig {
            public static final b Companion = new b((i) null);
            private final KeyStateConfig stateActive;
            private final KeyStateConfig stateDefault;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10068a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10069b;

                static {
                    a aVar = new a();
                    f10068a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig", aVar, 2);
                    s0Var.p("state-default", false);
                    s0Var.p("state-active", false);
                    f10069b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10069b;
                }

                public final F2.b[] c() {
                    KeyStateConfig.a aVar = KeyStateConfig.a.f10064a;
                    return new F2.b[]{aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final RegularKeyConfig b(e eVar) {
                    KeyStateConfig keyStateConfig;
                    int i4;
                    KeyStateConfig keyStateConfig2;
                    o.e(eVar, "decoder");
                    f fVar = f10069b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        KeyStateConfig.a aVar = KeyStateConfig.a.f10064a;
                        keyStateConfig = (KeyStateConfig) d4.E(fVar, 0, aVar, (Object) null);
                        keyStateConfig2 = (KeyStateConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        keyStateConfig2 = null;
                        KeyStateConfig keyStateConfig3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                keyStateConfig3 = (KeyStateConfig) d4.E(fVar, 0, KeyStateConfig.a.f10064a, keyStateConfig3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                keyStateConfig2 = (KeyStateConfig) d4.E(fVar, 1, KeyStateConfig.a.f10064a, keyStateConfig2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        keyStateConfig = keyStateConfig3;
                    }
                    d4.c(fVar);
                    return new RegularKeyConfig(i4, keyStateConfig, keyStateConfig2, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, RegularKeyConfig regularKeyConfig) {
                    o.e(fVar, "encoder");
                    o.e(regularKeyConfig, "value");
                    f fVar2 = f10069b;
                    d d4 = fVar.d(fVar2);
                    RegularKeyConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(regularKeyConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10068a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ RegularKeyConfig(int i4, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10068a.a());
                }
                this.stateDefault = keyStateConfig;
                this.stateActive = keyStateConfig2;
            }

            public static /* synthetic */ RegularKeyConfig copy$default(RegularKeyConfig regularKeyConfig, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    keyStateConfig = regularKeyConfig.stateDefault;
                }
                if ((i4 & 2) != 0) {
                    keyStateConfig2 = regularKeyConfig.stateActive;
                }
                return regularKeyConfig.copy(keyStateConfig, keyStateConfig2);
            }

            public static /* synthetic */ void getStateActive$annotations() {
            }

            public static /* synthetic */ void getStateDefault$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(RegularKeyConfig regularKeyConfig, d dVar, f fVar) {
                KeyStateConfig.a aVar = KeyStateConfig.a.f10064a;
                dVar.f(fVar, 0, aVar, regularKeyConfig.stateDefault);
                dVar.f(fVar, 1, aVar, regularKeyConfig.stateActive);
            }

            public final KeyStateConfig component1() {
                return this.stateDefault;
            }

            public final KeyStateConfig component2() {
                return this.stateActive;
            }

            public final RegularKeyConfig copy(KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2) {
                o.e(keyStateConfig, "stateDefault");
                o.e(keyStateConfig2, "stateActive");
                return new RegularKeyConfig(keyStateConfig, keyStateConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RegularKeyConfig)) {
                    return false;
                }
                RegularKeyConfig regularKeyConfig = (RegularKeyConfig) obj;
                return o.a(this.stateDefault, regularKeyConfig.stateDefault) && o.a(this.stateActive, regularKeyConfig.stateActive);
            }

            public final KeyStateConfig getStateActive() {
                return this.stateActive;
            }

            public final KeyStateConfig getStateDefault() {
                return this.stateDefault;
            }

            public int hashCode() {
                return (this.stateDefault.hashCode() * 31) + this.stateActive.hashCode();
            }

            public String toString() {
                return "RegularKeyConfig(stateDefault=" + this.stateDefault + ", stateActive=" + this.stateActive + ')';
            }

            public RegularKeyConfig(KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2) {
                o.e(keyStateConfig, "stateDefault");
                o.e(keyStateConfig2, "stateActive");
                this.stateDefault = keyStateConfig;
                this.stateActive = keyStateConfig2;
            }
        }

        @m
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 02\u00020\u0001:\u00041234B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001b¨\u00065"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;", "topPart", "bottomPart", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;", "tertiaryKey", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;", "component2", "component3", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;", "getTopPart", "getTopPart$annotations", "()V", "getBottomPart", "getBottomPart$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;", "getTertiaryKey", "getTertiaryKey$annotations", "Companion", "Part", "TertiaryCharacterConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SplitKeyConfig {
            public static final b Companion = new b((i) null);
            private final Part bottomPart;
            private final TertiaryCharacterConfig tertiaryKey;
            private final Part topPart;

            @m
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 )2\u00020\u0001:\u0003*+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006-"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;", "stateDefault", "stateActive", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;", "getStateDefault", "getStateDefault$annotations", "()V", "getStateActive", "getStateActive$annotations", "Companion", "KeyStateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Part {
                public static final b Companion = new b((i) null);
                private final KeyStateConfig stateActive;
                private final KeyStateConfig stateDefault;

                @m
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;", "", "", "backgroundColor", "fontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$Part$KeyStateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class KeyStateConfig {
                    public static final b Companion = new b((i) null);
                    private final String backgroundColor;
                    private final String fontColor;

                    public /* synthetic */ class a implements F {

                        /* renamed from: a  reason: collision with root package name */
                        public static final a f10070a;

                        /* renamed from: b  reason: collision with root package name */
                        private static final f f10071b;

                        static {
                            a aVar = new a();
                            f10070a = aVar;
                            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.Part.KeyStateConfig", aVar, 2);
                            s0Var.p("background-color", false);
                            s0Var.p("font-color", false);
                            f10071b = s0Var;
                        }

                        private a() {
                        }

                        public final f a() {
                            return f10071b;
                        }

                        public final F2.b[] c() {
                            G0 g02 = G0.f622a;
                            return new F2.b[]{g02, G2.a.u(g02)};
                        }

                        public F2.b[] d() {
                            return F.a.a(this);
                        }

                        /* renamed from: f */
                        public final KeyStateConfig b(e eVar) {
                            int i4;
                            String str;
                            String str2;
                            o.e(eVar, "decoder");
                            f fVar = f10071b;
                            c d4 = eVar.d(fVar);
                            if (d4.p()) {
                                str2 = d4.z(fVar, 0);
                                str = (String) d4.m(fVar, 1, G0.f622a, (Object) null);
                                i4 = 3;
                            } else {
                                boolean z3 = true;
                                int i5 = 0;
                                str2 = null;
                                String str3 = null;
                                while (z3) {
                                    int e4 = d4.e(fVar);
                                    if (e4 == -1) {
                                        z3 = false;
                                    } else if (e4 == 0) {
                                        str2 = d4.z(fVar, 0);
                                        i5 |= 1;
                                    } else if (e4 == 1) {
                                        str3 = (String) d4.m(fVar, 1, G0.f622a, str3);
                                        i5 |= 2;
                                    } else {
                                        throw new UnknownFieldException(e4);
                                    }
                                }
                                str = str3;
                                i4 = i5;
                            }
                            d4.c(fVar);
                            return new KeyStateConfig(i4, str2, str, (C0) null);
                        }

                        /* renamed from: g */
                        public final void e(I2.f fVar, KeyStateConfig keyStateConfig) {
                            o.e(fVar, "encoder");
                            o.e(keyStateConfig, "value");
                            f fVar2 = f10071b;
                            d d4 = fVar.d(fVar2);
                            KeyStateConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(keyStateConfig, d4, fVar2);
                            d4.c(fVar2);
                        }
                    }

                    public static final class b {
                        private b() {
                        }

                        public final F2.b serializer() {
                            return a.f10070a;
                        }

                        public /* synthetic */ b(i iVar) {
                            this();
                        }
                    }

                    public /* synthetic */ KeyStateConfig(int i4, String str, String str2, C0 c02) {
                        if (3 != (i4 & 3)) {
                            C0317n0.a(i4, 3, a.f10070a.a());
                        }
                        this.backgroundColor = str;
                        this.fontColor = str2;
                    }

                    public static /* synthetic */ KeyStateConfig copy$default(KeyStateConfig keyStateConfig, String str, String str2, int i4, Object obj) {
                        if ((i4 & 1) != 0) {
                            str = keyStateConfig.backgroundColor;
                        }
                        if ((i4 & 2) != 0) {
                            str2 = keyStateConfig.fontColor;
                        }
                        return keyStateConfig.copy(str, str2);
                    }

                    public static /* synthetic */ void getBackgroundColor$annotations() {
                    }

                    public static /* synthetic */ void getFontColor$annotations() {
                    }

                    public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(KeyStateConfig keyStateConfig, d dVar, f fVar) {
                        dVar.p(fVar, 0, keyStateConfig.backgroundColor);
                        dVar.o(fVar, 1, G0.f622a, keyStateConfig.fontColor);
                    }

                    public final String component1() {
                        return this.backgroundColor;
                    }

                    public final String component2() {
                        return this.fontColor;
                    }

                    public final KeyStateConfig copy(String str, String str2) {
                        o.e(str, "backgroundColor");
                        return new KeyStateConfig(str, str2);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof KeyStateConfig)) {
                            return false;
                        }
                        KeyStateConfig keyStateConfig = (KeyStateConfig) obj;
                        return o.a(this.backgroundColor, keyStateConfig.backgroundColor) && o.a(this.fontColor, keyStateConfig.fontColor);
                    }

                    public final String getBackgroundColor() {
                        return this.backgroundColor;
                    }

                    public final String getFontColor() {
                        return this.fontColor;
                    }

                    public int hashCode() {
                        int hashCode = this.backgroundColor.hashCode() * 31;
                        String str = this.fontColor;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "KeyStateConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ')';
                    }

                    public KeyStateConfig(String str, String str2) {
                        o.e(str, "backgroundColor");
                        this.backgroundColor = str;
                        this.fontColor = str2;
                    }
                }

                public /* synthetic */ class a implements F {

                    /* renamed from: a  reason: collision with root package name */
                    public static final a f10072a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final f f10073b;

                    static {
                        a aVar = new a();
                        f10072a = aVar;
                        C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.Part", aVar, 2);
                        s0Var.p("state-default", false);
                        s0Var.p("state-active", false);
                        f10073b = s0Var;
                    }

                    private a() {
                    }

                    public final f a() {
                        return f10073b;
                    }

                    public final F2.b[] c() {
                        KeyStateConfig.a aVar = KeyStateConfig.a.f10070a;
                        return new F2.b[]{aVar, aVar};
                    }

                    public F2.b[] d() {
                        return F.a.a(this);
                    }

                    /* renamed from: f */
                    public final Part b(e eVar) {
                        KeyStateConfig keyStateConfig;
                        int i4;
                        KeyStateConfig keyStateConfig2;
                        o.e(eVar, "decoder");
                        f fVar = f10073b;
                        c d4 = eVar.d(fVar);
                        if (d4.p()) {
                            KeyStateConfig.a aVar = KeyStateConfig.a.f10070a;
                            keyStateConfig = (KeyStateConfig) d4.E(fVar, 0, aVar, (Object) null);
                            keyStateConfig2 = (KeyStateConfig) d4.E(fVar, 1, aVar, (Object) null);
                            i4 = 3;
                        } else {
                            boolean z3 = true;
                            int i5 = 0;
                            keyStateConfig2 = null;
                            KeyStateConfig keyStateConfig3 = null;
                            while (z3) {
                                int e4 = d4.e(fVar);
                                if (e4 == -1) {
                                    z3 = false;
                                } else if (e4 == 0) {
                                    keyStateConfig3 = (KeyStateConfig) d4.E(fVar, 0, KeyStateConfig.a.f10070a, keyStateConfig3);
                                    i5 |= 1;
                                } else if (e4 == 1) {
                                    keyStateConfig2 = (KeyStateConfig) d4.E(fVar, 1, KeyStateConfig.a.f10070a, keyStateConfig2);
                                    i5 |= 2;
                                } else {
                                    throw new UnknownFieldException(e4);
                                }
                            }
                            i4 = i5;
                            keyStateConfig = keyStateConfig3;
                        }
                        d4.c(fVar);
                        return new Part(i4, keyStateConfig, keyStateConfig2, (C0) null);
                    }

                    /* renamed from: g */
                    public final void e(I2.f fVar, Part part) {
                        o.e(fVar, "encoder");
                        o.e(part, "value");
                        f fVar2 = f10073b;
                        d d4 = fVar.d(fVar2);
                        Part.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(part, d4, fVar2);
                        d4.c(fVar2);
                    }
                }

                public static final class b {
                    private b() {
                    }

                    public final F2.b serializer() {
                        return a.f10072a;
                    }

                    public /* synthetic */ b(i iVar) {
                        this();
                    }
                }

                public /* synthetic */ Part(int i4, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2, C0 c02) {
                    if (3 != (i4 & 3)) {
                        C0317n0.a(i4, 3, a.f10072a.a());
                    }
                    this.stateDefault = keyStateConfig;
                    this.stateActive = keyStateConfig2;
                }

                public static /* synthetic */ Part copy$default(Part part, KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2, int i4, Object obj) {
                    if ((i4 & 1) != 0) {
                        keyStateConfig = part.stateDefault;
                    }
                    if ((i4 & 2) != 0) {
                        keyStateConfig2 = part.stateActive;
                    }
                    return part.copy(keyStateConfig, keyStateConfig2);
                }

                public static /* synthetic */ void getStateActive$annotations() {
                }

                public static /* synthetic */ void getStateDefault$annotations() {
                }

                public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Part part, d dVar, f fVar) {
                    KeyStateConfig.a aVar = KeyStateConfig.a.f10070a;
                    dVar.f(fVar, 0, aVar, part.stateDefault);
                    dVar.f(fVar, 1, aVar, part.stateActive);
                }

                public final KeyStateConfig component1() {
                    return this.stateDefault;
                }

                public final KeyStateConfig component2() {
                    return this.stateActive;
                }

                public final Part copy(KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2) {
                    o.e(keyStateConfig, "stateDefault");
                    o.e(keyStateConfig2, "stateActive");
                    return new Part(keyStateConfig, keyStateConfig2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Part)) {
                        return false;
                    }
                    Part part = (Part) obj;
                    return o.a(this.stateDefault, part.stateDefault) && o.a(this.stateActive, part.stateActive);
                }

                public final KeyStateConfig getStateActive() {
                    return this.stateActive;
                }

                public final KeyStateConfig getStateDefault() {
                    return this.stateDefault;
                }

                public int hashCode() {
                    return (this.stateDefault.hashCode() * 31) + this.stateActive.hashCode();
                }

                public String toString() {
                    return "Part(stateDefault=" + this.stateDefault + ", stateActive=" + this.stateActive + ')';
                }

                public Part(KeyStateConfig keyStateConfig, KeyStateConfig keyStateConfig2) {
                    o.e(keyStateConfig, "stateDefault");
                    o.e(keyStateConfig2, "stateActive");
                    this.stateDefault = keyStateConfig;
                    this.stateActive = keyStateConfig2;
                }
            }

            @m
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 )2\u00020\u0001:\u0003*+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006-"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;", "stateDefault", "stateActive", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;", "getStateDefault", "getStateDefault$annotations", "()V", "getStateActive", "getStateActive$annotations", "Companion", "TertiaryCharacterStateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class TertiaryCharacterConfig {
                public static final b Companion = new b((i) null);
                private final TertiaryCharacterStateConfig stateActive;
                private final TertiaryCharacterStateConfig stateDefault;

                @m
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;", "", "", "fontColor", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$KeysConfig$SplitKeyConfig$TertiaryCharacterConfig$TertiaryCharacterStateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFontColor", "getFontColor$annotations", "()V", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class TertiaryCharacterStateConfig {
                    public static final b Companion = new b((i) null);
                    private final String fontColor;

                    public /* synthetic */ class a implements F {

                        /* renamed from: a  reason: collision with root package name */
                        public static final a f10074a;

                        /* renamed from: b  reason: collision with root package name */
                        private static final f f10075b;

                        static {
                            a aVar = new a();
                            f10074a = aVar;
                            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.TertiaryCharacterConfig.TertiaryCharacterStateConfig", aVar, 1);
                            s0Var.p("font-color", false);
                            f10075b = s0Var;
                        }

                        private a() {
                        }

                        public final f a() {
                            return f10075b;
                        }

                        public final F2.b[] c() {
                            return new F2.b[]{G0.f622a};
                        }

                        public F2.b[] d() {
                            return F.a.a(this);
                        }

                        /* renamed from: f */
                        public final TertiaryCharacterStateConfig b(e eVar) {
                            String str;
                            o.e(eVar, "decoder");
                            f fVar = f10075b;
                            c d4 = eVar.d(fVar);
                            int i4 = 1;
                            if (d4.p()) {
                                str = d4.z(fVar, 0);
                            } else {
                                boolean z3 = true;
                                int i5 = 0;
                                str = null;
                                while (z3) {
                                    int e4 = d4.e(fVar);
                                    if (e4 == -1) {
                                        z3 = false;
                                    } else if (e4 == 0) {
                                        str = d4.z(fVar, 0);
                                        i5 = 1;
                                    } else {
                                        throw new UnknownFieldException(e4);
                                    }
                                }
                                i4 = i5;
                            }
                            d4.c(fVar);
                            return new TertiaryCharacterStateConfig(i4, str, (C0) null);
                        }

                        /* renamed from: g */
                        public final void e(I2.f fVar, TertiaryCharacterStateConfig tertiaryCharacterStateConfig) {
                            o.e(fVar, "encoder");
                            o.e(tertiaryCharacterStateConfig, "value");
                            f fVar2 = f10075b;
                            d d4 = fVar.d(fVar2);
                            d4.p(fVar2, 0, tertiaryCharacterStateConfig.fontColor);
                            d4.c(fVar2);
                        }
                    }

                    public static final class b {
                        private b() {
                        }

                        public final F2.b serializer() {
                            return a.f10074a;
                        }

                        public /* synthetic */ b(i iVar) {
                            this();
                        }
                    }

                    public /* synthetic */ TertiaryCharacterStateConfig(int i4, String str, C0 c02) {
                        if (1 != (i4 & 1)) {
                            C0317n0.a(i4, 1, a.f10074a.a());
                        }
                        this.fontColor = str;
                    }

                    public static /* synthetic */ TertiaryCharacterStateConfig copy$default(TertiaryCharacterStateConfig tertiaryCharacterStateConfig, String str, int i4, Object obj) {
                        if ((i4 & 1) != 0) {
                            str = tertiaryCharacterStateConfig.fontColor;
                        }
                        return tertiaryCharacterStateConfig.copy(str);
                    }

                    public static /* synthetic */ void getFontColor$annotations() {
                    }

                    public final String component1() {
                        return this.fontColor;
                    }

                    public final TertiaryCharacterStateConfig copy(String str) {
                        o.e(str, "fontColor");
                        return new TertiaryCharacterStateConfig(str);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof TertiaryCharacterStateConfig) && o.a(this.fontColor, ((TertiaryCharacterStateConfig) obj).fontColor);
                    }

                    public final String getFontColor() {
                        return this.fontColor;
                    }

                    public int hashCode() {
                        return this.fontColor.hashCode();
                    }

                    public String toString() {
                        return "TertiaryCharacterStateConfig(fontColor=" + this.fontColor + ')';
                    }

                    public TertiaryCharacterStateConfig(String str) {
                        o.e(str, "fontColor");
                        this.fontColor = str;
                    }
                }

                public /* synthetic */ class a implements F {

                    /* renamed from: a  reason: collision with root package name */
                    public static final a f10076a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final f f10077b;

                    static {
                        a aVar = new a();
                        f10076a = aVar;
                        C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.TertiaryCharacterConfig", aVar, 2);
                        s0Var.p("state-default", false);
                        s0Var.p("state-active", false);
                        f10077b = s0Var;
                    }

                    private a() {
                    }

                    public final f a() {
                        return f10077b;
                    }

                    public final F2.b[] c() {
                        TertiaryCharacterStateConfig.a aVar = TertiaryCharacterStateConfig.a.f10074a;
                        return new F2.b[]{aVar, aVar};
                    }

                    public F2.b[] d() {
                        return F.a.a(this);
                    }

                    /* renamed from: f */
                    public final TertiaryCharacterConfig b(e eVar) {
                        TertiaryCharacterStateConfig tertiaryCharacterStateConfig;
                        int i4;
                        TertiaryCharacterStateConfig tertiaryCharacterStateConfig2;
                        o.e(eVar, "decoder");
                        f fVar = f10077b;
                        c d4 = eVar.d(fVar);
                        if (d4.p()) {
                            TertiaryCharacterStateConfig.a aVar = TertiaryCharacterStateConfig.a.f10074a;
                            tertiaryCharacterStateConfig = (TertiaryCharacterStateConfig) d4.E(fVar, 0, aVar, (Object) null);
                            tertiaryCharacterStateConfig2 = (TertiaryCharacterStateConfig) d4.E(fVar, 1, aVar, (Object) null);
                            i4 = 3;
                        } else {
                            boolean z3 = true;
                            int i5 = 0;
                            tertiaryCharacterStateConfig2 = null;
                            TertiaryCharacterStateConfig tertiaryCharacterStateConfig3 = null;
                            while (z3) {
                                int e4 = d4.e(fVar);
                                if (e4 == -1) {
                                    z3 = false;
                                } else if (e4 == 0) {
                                    tertiaryCharacterStateConfig3 = (TertiaryCharacterStateConfig) d4.E(fVar, 0, TertiaryCharacterStateConfig.a.f10074a, tertiaryCharacterStateConfig3);
                                    i5 |= 1;
                                } else if (e4 == 1) {
                                    tertiaryCharacterStateConfig2 = (TertiaryCharacterStateConfig) d4.E(fVar, 1, TertiaryCharacterStateConfig.a.f10074a, tertiaryCharacterStateConfig2);
                                    i5 |= 2;
                                } else {
                                    throw new UnknownFieldException(e4);
                                }
                            }
                            i4 = i5;
                            tertiaryCharacterStateConfig = tertiaryCharacterStateConfig3;
                        }
                        d4.c(fVar);
                        return new TertiaryCharacterConfig(i4, tertiaryCharacterStateConfig, tertiaryCharacterStateConfig2, (C0) null);
                    }

                    /* renamed from: g */
                    public final void e(I2.f fVar, TertiaryCharacterConfig tertiaryCharacterConfig) {
                        o.e(fVar, "encoder");
                        o.e(tertiaryCharacterConfig, "value");
                        f fVar2 = f10077b;
                        d d4 = fVar.d(fVar2);
                        TertiaryCharacterConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(tertiaryCharacterConfig, d4, fVar2);
                        d4.c(fVar2);
                    }
                }

                public static final class b {
                    private b() {
                    }

                    public final F2.b serializer() {
                        return a.f10076a;
                    }

                    public /* synthetic */ b(i iVar) {
                        this();
                    }
                }

                public /* synthetic */ TertiaryCharacterConfig(int i4, TertiaryCharacterStateConfig tertiaryCharacterStateConfig, TertiaryCharacterStateConfig tertiaryCharacterStateConfig2, C0 c02) {
                    if (3 != (i4 & 3)) {
                        C0317n0.a(i4, 3, a.f10076a.a());
                    }
                    this.stateDefault = tertiaryCharacterStateConfig;
                    this.stateActive = tertiaryCharacterStateConfig2;
                }

                public static /* synthetic */ TertiaryCharacterConfig copy$default(TertiaryCharacterConfig tertiaryCharacterConfig, TertiaryCharacterStateConfig tertiaryCharacterStateConfig, TertiaryCharacterStateConfig tertiaryCharacterStateConfig2, int i4, Object obj) {
                    if ((i4 & 1) != 0) {
                        tertiaryCharacterStateConfig = tertiaryCharacterConfig.stateDefault;
                    }
                    if ((i4 & 2) != 0) {
                        tertiaryCharacterStateConfig2 = tertiaryCharacterConfig.stateActive;
                    }
                    return tertiaryCharacterConfig.copy(tertiaryCharacterStateConfig, tertiaryCharacterStateConfig2);
                }

                public static /* synthetic */ void getStateActive$annotations() {
                }

                public static /* synthetic */ void getStateDefault$annotations() {
                }

                public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(TertiaryCharacterConfig tertiaryCharacterConfig, d dVar, f fVar) {
                    TertiaryCharacterStateConfig.a aVar = TertiaryCharacterStateConfig.a.f10074a;
                    dVar.f(fVar, 0, aVar, tertiaryCharacterConfig.stateDefault);
                    dVar.f(fVar, 1, aVar, tertiaryCharacterConfig.stateActive);
                }

                public final TertiaryCharacterStateConfig component1() {
                    return this.stateDefault;
                }

                public final TertiaryCharacterStateConfig component2() {
                    return this.stateActive;
                }

                public final TertiaryCharacterConfig copy(TertiaryCharacterStateConfig tertiaryCharacterStateConfig, TertiaryCharacterStateConfig tertiaryCharacterStateConfig2) {
                    o.e(tertiaryCharacterStateConfig, "stateDefault");
                    o.e(tertiaryCharacterStateConfig2, "stateActive");
                    return new TertiaryCharacterConfig(tertiaryCharacterStateConfig, tertiaryCharacterStateConfig2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TertiaryCharacterConfig)) {
                        return false;
                    }
                    TertiaryCharacterConfig tertiaryCharacterConfig = (TertiaryCharacterConfig) obj;
                    return o.a(this.stateDefault, tertiaryCharacterConfig.stateDefault) && o.a(this.stateActive, tertiaryCharacterConfig.stateActive);
                }

                public final TertiaryCharacterStateConfig getStateActive() {
                    return this.stateActive;
                }

                public final TertiaryCharacterStateConfig getStateDefault() {
                    return this.stateDefault;
                }

                public int hashCode() {
                    return (this.stateDefault.hashCode() * 31) + this.stateActive.hashCode();
                }

                public String toString() {
                    return "TertiaryCharacterConfig(stateDefault=" + this.stateDefault + ", stateActive=" + this.stateActive + ')';
                }

                public TertiaryCharacterConfig(TertiaryCharacterStateConfig tertiaryCharacterStateConfig, TertiaryCharacterStateConfig tertiaryCharacterStateConfig2) {
                    o.e(tertiaryCharacterStateConfig, "stateDefault");
                    o.e(tertiaryCharacterStateConfig2, "stateActive");
                    this.stateDefault = tertiaryCharacterStateConfig;
                    this.stateActive = tertiaryCharacterStateConfig2;
                }
            }

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10078a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10079b;

                static {
                    a aVar = new a();
                    f10078a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig", aVar, 3);
                    s0Var.p("top", false);
                    s0Var.p("bottom", false);
                    s0Var.p("tiny", false);
                    f10079b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10079b;
                }

                public final F2.b[] c() {
                    F2.b u3 = G2.a.u(TertiaryCharacterConfig.a.f10076a);
                    Part.a aVar = Part.a.f10072a;
                    return new F2.b[]{aVar, aVar, u3};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final SplitKeyConfig b(e eVar) {
                    TertiaryCharacterConfig tertiaryCharacterConfig;
                    Part part;
                    Part part2;
                    int i4;
                    e eVar2 = eVar;
                    o.e(eVar2, "decoder");
                    f fVar = f10079b;
                    c d4 = eVar2.d(fVar);
                    Part part3 = null;
                    if (d4.p()) {
                        Part.a aVar = Part.a.f10072a;
                        part = (Part) d4.E(fVar, 1, aVar, (Object) null);
                        tertiaryCharacterConfig = (TertiaryCharacterConfig) d4.m(fVar, 2, TertiaryCharacterConfig.a.f10076a, (Object) null);
                        i4 = 7;
                        part2 = (Part) d4.E(fVar, 0, aVar, (Object) null);
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        Part part4 = null;
                        TertiaryCharacterConfig tertiaryCharacterConfig2 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                part3 = (Part) d4.E(fVar, 0, Part.a.f10072a, part3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                part4 = (Part) d4.E(fVar, 1, Part.a.f10072a, part4);
                                i5 |= 2;
                            } else if (e4 == 2) {
                                tertiaryCharacterConfig2 = (TertiaryCharacterConfig) d4.m(fVar, 2, TertiaryCharacterConfig.a.f10076a, tertiaryCharacterConfig2);
                                i5 |= 4;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        part2 = part3;
                        part = part4;
                        tertiaryCharacterConfig = tertiaryCharacterConfig2;
                    }
                    d4.c(fVar);
                    return new SplitKeyConfig(i4, part2, part, tertiaryCharacterConfig, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, SplitKeyConfig splitKeyConfig) {
                    o.e(fVar, "encoder");
                    o.e(splitKeyConfig, "value");
                    f fVar2 = f10079b;
                    d d4 = fVar.d(fVar2);
                    SplitKeyConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(splitKeyConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10078a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ SplitKeyConfig(int i4, Part part, Part part2, TertiaryCharacterConfig tertiaryCharacterConfig, C0 c02) {
                if (7 != (i4 & 7)) {
                    C0317n0.a(i4, 7, a.f10078a.a());
                }
                this.topPart = part;
                this.bottomPart = part2;
                this.tertiaryKey = tertiaryCharacterConfig;
            }

            public static /* synthetic */ SplitKeyConfig copy$default(SplitKeyConfig splitKeyConfig, Part part, Part part2, TertiaryCharacterConfig tertiaryCharacterConfig, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    part = splitKeyConfig.topPart;
                }
                if ((i4 & 2) != 0) {
                    part2 = splitKeyConfig.bottomPart;
                }
                if ((i4 & 4) != 0) {
                    tertiaryCharacterConfig = splitKeyConfig.tertiaryKey;
                }
                return splitKeyConfig.copy(part, part2, tertiaryCharacterConfig);
            }

            public static /* synthetic */ void getBottomPart$annotations() {
            }

            public static /* synthetic */ void getTertiaryKey$annotations() {
            }

            public static /* synthetic */ void getTopPart$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(SplitKeyConfig splitKeyConfig, d dVar, f fVar) {
                Part.a aVar = Part.a.f10072a;
                dVar.f(fVar, 0, aVar, splitKeyConfig.topPart);
                dVar.f(fVar, 1, aVar, splitKeyConfig.bottomPart);
                dVar.o(fVar, 2, TertiaryCharacterConfig.a.f10076a, splitKeyConfig.tertiaryKey);
            }

            public final Part component1() {
                return this.topPart;
            }

            public final Part component2() {
                return this.bottomPart;
            }

            public final TertiaryCharacterConfig component3() {
                return this.tertiaryKey;
            }

            public final SplitKeyConfig copy(Part part, Part part2, TertiaryCharacterConfig tertiaryCharacterConfig) {
                o.e(part, "topPart");
                o.e(part2, "bottomPart");
                return new SplitKeyConfig(part, part2, tertiaryCharacterConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SplitKeyConfig)) {
                    return false;
                }
                SplitKeyConfig splitKeyConfig = (SplitKeyConfig) obj;
                return o.a(this.topPart, splitKeyConfig.topPart) && o.a(this.bottomPart, splitKeyConfig.bottomPart) && o.a(this.tertiaryKey, splitKeyConfig.tertiaryKey);
            }

            public final Part getBottomPart() {
                return this.bottomPart;
            }

            public final TertiaryCharacterConfig getTertiaryKey() {
                return this.tertiaryKey;
            }

            public final Part getTopPart() {
                return this.topPart;
            }

            public int hashCode() {
                int hashCode = ((this.topPart.hashCode() * 31) + this.bottomPart.hashCode()) * 31;
                TertiaryCharacterConfig tertiaryCharacterConfig = this.tertiaryKey;
                return hashCode + (tertiaryCharacterConfig == null ? 0 : tertiaryCharacterConfig.hashCode());
            }

            public String toString() {
                return "SplitKeyConfig(topPart=" + this.topPart + ", bottomPart=" + this.bottomPart + ", tertiaryKey=" + this.tertiaryKey + ')';
            }

            public SplitKeyConfig(Part part, Part part2, TertiaryCharacterConfig tertiaryCharacterConfig) {
                o.e(part, "topPart");
                o.e(part2, "bottomPart");
                this.topPart = part;
                this.bottomPart = part2;
                this.tertiaryKey = tertiaryCharacterConfig;
            }
        }

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10080a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10081b;

            static {
                a aVar = new a();
                f10080a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig", aVar, 12);
                s0Var.p("character", false);
                s0Var.p("space", false);
                s0Var.p("split", false);
                s0Var.p("split_emojinumber", false);
                s0Var.p("caps", false);
                s0Var.p("delete", false);
                s0Var.p("return", false);
                s0Var.p("morecharacters", false);
                s0Var.p("emoji", false);
                s0Var.p("moremaths", false);
                s0Var.p("morenumbers", false);
                s0Var.p("mainlayout", false);
                f10081b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10081b;
            }

            public final F2.b[] c() {
                RegularKeyConfig.a aVar = RegularKeyConfig.a.f10068a;
                SplitKeyConfig.a aVar2 = SplitKeyConfig.a.f10078a;
                LayoutDependentKeyConfig.a aVar3 = LayoutDependentKeyConfig.a.f10066a;
                return new F2.b[]{aVar, aVar, aVar2, aVar2, aVar3, aVar3, IconKeyConfig.a.f10062a, aVar, aVar, aVar, aVar, aVar};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$IconKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig b(I2.e r34) {
                /*
                    r33 = this;
                    r0 = r34
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f10081b
                    I2.c r0 = r0.d(r1)
                    boolean r2 = r0.p()
                    r4 = 10
                    r5 = 9
                    r6 = 7
                    r7 = 6
                    r8 = 5
                    r9 = 3
                    r10 = 8
                    r11 = 4
                    r12 = 2
                    r13 = 1
                    r14 = 0
                    r15 = 0
                    if (r2 == 0) goto L_0x0092
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r2 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    java.lang.Object r14 = r0.E(r1, r14, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r14 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r14
                    java.lang.Object r13 = r0.E(r1, r13, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r13 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r13
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig$a r3 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.a.f10078a
                    java.lang.Object r12 = r0.E(r1, r12, r3, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig r12 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig) r12
                    java.lang.Object r3 = r0.E(r1, r9, r3, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig r3 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig) r3
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig$a r9 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig.a.f10066a
                    java.lang.Object r11 = r0.E(r1, r11, r9, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig r11 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig) r11
                    java.lang.Object r8 = r0.E(r1, r8, r9, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig r8 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig) r8
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$IconKeyConfig$a r9 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.IconKeyConfig.a.f10062a
                    java.lang.Object r7 = r0.E(r1, r7, r9, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$IconKeyConfig r7 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.IconKeyConfig) r7
                    java.lang.Object r6 = r0.E(r1, r6, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r6 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r6
                    java.lang.Object r9 = r0.E(r1, r10, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r9 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r9
                    java.lang.Object r5 = r0.E(r1, r5, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r5 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r5
                    java.lang.Object r4 = r0.E(r1, r4, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r4 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r4
                    r10 = 11
                    java.lang.Object r2 = r0.E(r1, r10, r2, r15)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r2 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r2
                    r10 = 4095(0xfff, float:5.738E-42)
                    r31 = r2
                    r23 = r3
                    r30 = r4
                    r29 = r5
                    r27 = r6
                    r26 = r7
                    r25 = r8
                    r28 = r9
                    r19 = r10
                    r24 = r11
                    r22 = r12
                    r21 = r13
                    r20 = r14
                    goto L_0x01b0
                L_0x0092:
                    r17 = r13
                    r2 = r14
                    r3 = r15
                    r5 = r3
                    r6 = r5
                    r7 = r6
                    r8 = r7
                    r9 = r8
                    r10 = r9
                    r11 = r10
                    r12 = r11
                    r13 = r12
                    r14 = r13
                L_0x00a0:
                    if (r17 == 0) goto L_0x0193
                    int r4 = r0.e(r1)
                    switch(r4) {
                        case -1: goto L_0x0186;
                        case 0: goto L_0x016f;
                        case 1: goto L_0x015f;
                        case 2: goto L_0x014e;
                        case 3: goto L_0x013d;
                        case 4: goto L_0x012d;
                        case 5: goto L_0x011d;
                        case 6: goto L_0x010d;
                        case 7: goto L_0x00fc;
                        case 8: goto L_0x00ea;
                        case 9: goto L_0x00d8;
                        case 10: goto L_0x00c3;
                        case 11: goto L_0x00af;
                        default: goto L_0x00a9;
                    }
                L_0x00a9:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r4)
                    throw r0
                L_0x00af:
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r18 = r15
                    r15 = 11
                    java.lang.Object r4 = r0.E(r1, r15, r4, r5)
                    r5 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r5 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r5
                    r2 = r2 | 2048(0x800, float:2.87E-42)
                L_0x00be:
                    r15 = r18
                L_0x00c0:
                    r4 = 10
                    goto L_0x00a0
                L_0x00c3:
                    r18 = r15
                    r15 = 11
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r15 = 10
                    java.lang.Object r4 = r0.E(r1, r15, r4, r10)
                    r10 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r10 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r10
                    r2 = r2 | 1024(0x400, float:1.435E-42)
                    r4 = r15
                    r15 = r18
                    goto L_0x00a0
                L_0x00d8:
                    r18 = r15
                    r15 = 10
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r15 = 9
                    java.lang.Object r4 = r0.E(r1, r15, r4, r6)
                    r6 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r6 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r6
                    r2 = r2 | 512(0x200, float:7.175E-43)
                    goto L_0x00be
                L_0x00ea:
                    r18 = r15
                    r15 = 9
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r15 = 8
                    java.lang.Object r4 = r0.E(r1, r15, r4, r7)
                    r7 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r7 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r7
                    r2 = r2 | 256(0x100, float:3.59E-43)
                    goto L_0x00be
                L_0x00fc:
                    r18 = r15
                    r15 = 8
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r15 = 7
                    java.lang.Object r4 = r0.E(r1, r15, r4, r8)
                    r8 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r8 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r8
                    r2 = r2 | 128(0x80, float:1.794E-43)
                    goto L_0x00be
                L_0x010d:
                    r18 = r15
                    r15 = 7
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$IconKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.IconKeyConfig.a.f10062a
                    r15 = 6
                    java.lang.Object r4 = r0.E(r1, r15, r4, r11)
                    r11 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$IconKeyConfig r11 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.IconKeyConfig) r11
                    r2 = r2 | 64
                    goto L_0x00be
                L_0x011d:
                    r18 = r15
                    r15 = 6
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig.a.f10066a
                    r15 = 5
                    java.lang.Object r4 = r0.E(r1, r15, r4, r9)
                    r9 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig r9 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig) r9
                    r2 = r2 | 32
                    goto L_0x00be
                L_0x012d:
                    r18 = r15
                    r15 = 5
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig.a.f10066a
                    r15 = 4
                    java.lang.Object r4 = r0.E(r1, r15, r4, r12)
                    r12 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$LayoutDependentKeyConfig r12 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.LayoutDependentKeyConfig) r12
                    r2 = r2 | 16
                    goto L_0x00be
                L_0x013d:
                    r18 = r15
                    r15 = 4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.a.f10078a
                    r15 = 3
                    java.lang.Object r4 = r0.E(r1, r15, r4, r13)
                    r13 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig r13 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig) r13
                    r2 = r2 | 8
                    goto L_0x00be
                L_0x014e:
                    r18 = r15
                    r15 = 3
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig.a.f10078a
                    r15 = 2
                    java.lang.Object r4 = r0.E(r1, r15, r4, r14)
                    r14 = r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$SplitKeyConfig r14 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.SplitKeyConfig) r14
                    r2 = r2 | 4
                    goto L_0x00be
                L_0x015f:
                    r18 = r15
                    r15 = 2
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r15 = 1
                    java.lang.Object r3 = r0.E(r1, r15, r4, r3)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r3 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r3
                    r2 = r2 | 2
                    goto L_0x00be
                L_0x016f:
                    r18 = r15
                    r15 = 1
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig$a r4 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig.a.f10068a
                    r16 = r3
                    r3 = r18
                    r15 = 0
                    java.lang.Object r3 = r0.E(r1, r15, r4, r3)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$RegularKeyConfig r3 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.RegularKeyConfig) r3
                    r2 = r2 | 1
                    r15 = r3
                    r3 = r16
                    goto L_0x00c0
                L_0x0186:
                    r16 = r3
                    r3 = r15
                    r15 = 0
                    r17 = r15
                    r4 = 10
                    r15 = r3
                    r3 = r16
                    goto L_0x00a0
                L_0x0193:
                    r16 = r3
                    r3 = r15
                    r19 = r2
                    r20 = r3
                    r31 = r5
                    r29 = r6
                    r28 = r7
                    r27 = r8
                    r25 = r9
                    r30 = r10
                    r26 = r11
                    r24 = r12
                    r23 = r13
                    r22 = r14
                    r21 = r16
                L_0x01b0:
                    r0.c(r1)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig r0 = new ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig
                    r32 = 0
                    r18 = r0
                    r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.a.b(I2.e):ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, KeysConfig keysConfig) {
                o.e(fVar, "encoder");
                o.e(keysConfig, "value");
                f fVar2 = f10081b;
                d d4 = fVar.d(fVar2);
                KeysConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(keysConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10080a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ KeysConfig(int i4, RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2, SplitKeyConfig splitKeyConfig, SplitKeyConfig splitKeyConfig2, LayoutDependentKeyConfig layoutDependentKeyConfig, LayoutDependentKeyConfig layoutDependentKeyConfig2, IconKeyConfig iconKeyConfig, RegularKeyConfig regularKeyConfig3, RegularKeyConfig regularKeyConfig4, RegularKeyConfig regularKeyConfig5, RegularKeyConfig regularKeyConfig6, RegularKeyConfig regularKeyConfig7, C0 c02) {
            if (4095 != (i4 & 4095)) {
                C0317n0.a(i4, 4095, a.f10080a.a());
            }
            this.character = regularKeyConfig;
            this.space = regularKeyConfig2;
            this.split = splitKeyConfig;
            this.splitEmojiNumber = splitKeyConfig2;
            this.caps = layoutDependentKeyConfig;
            this.delete = layoutDependentKeyConfig2;
            this.returnKeyConfig = iconKeyConfig;
            this.moreCharacters = regularKeyConfig3;
            this.emoji = regularKeyConfig4;
            this.moreMaths = regularKeyConfig5;
            this.moreNumbers = regularKeyConfig6;
            this.mainLayout = regularKeyConfig7;
        }

        public static /* synthetic */ KeysConfig copy$default(KeysConfig keysConfig, RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2, SplitKeyConfig splitKeyConfig, SplitKeyConfig splitKeyConfig2, LayoutDependentKeyConfig layoutDependentKeyConfig, LayoutDependentKeyConfig layoutDependentKeyConfig2, IconKeyConfig iconKeyConfig, RegularKeyConfig regularKeyConfig3, RegularKeyConfig regularKeyConfig4, RegularKeyConfig regularKeyConfig5, RegularKeyConfig regularKeyConfig6, RegularKeyConfig regularKeyConfig7, int i4, Object obj) {
            KeysConfig keysConfig2 = keysConfig;
            int i5 = i4;
            return keysConfig.copy((i5 & 1) != 0 ? keysConfig2.character : regularKeyConfig, (i5 & 2) != 0 ? keysConfig2.space : regularKeyConfig2, (i5 & 4) != 0 ? keysConfig2.split : splitKeyConfig, (i5 & 8) != 0 ? keysConfig2.splitEmojiNumber : splitKeyConfig2, (i5 & 16) != 0 ? keysConfig2.caps : layoutDependentKeyConfig, (i5 & 32) != 0 ? keysConfig2.delete : layoutDependentKeyConfig2, (i5 & 64) != 0 ? keysConfig2.returnKeyConfig : iconKeyConfig, (i5 & Uuid.SIZE_BITS) != 0 ? keysConfig2.moreCharacters : regularKeyConfig3, (i5 & 256) != 0 ? keysConfig2.emoji : regularKeyConfig4, (i5 & 512) != 0 ? keysConfig2.moreMaths : regularKeyConfig5, (i5 & 1024) != 0 ? keysConfig2.moreNumbers : regularKeyConfig6, (i5 & 2048) != 0 ? keysConfig2.mainLayout : regularKeyConfig7);
        }

        public static /* synthetic */ void getCaps$annotations() {
        }

        public static /* synthetic */ void getCharacter$annotations() {
        }

        public static /* synthetic */ void getDelete$annotations() {
        }

        public static /* synthetic */ void getEmoji$annotations() {
        }

        public static /* synthetic */ void getMainLayout$annotations() {
        }

        public static /* synthetic */ void getMoreCharacters$annotations() {
        }

        public static /* synthetic */ void getMoreMaths$annotations() {
        }

        public static /* synthetic */ void getMoreNumbers$annotations() {
        }

        public static /* synthetic */ void getReturnKeyConfig$annotations() {
        }

        public static /* synthetic */ void getSpace$annotations() {
        }

        public static /* synthetic */ void getSplit$annotations() {
        }

        public static /* synthetic */ void getSplitEmojiNumber$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(KeysConfig keysConfig, d dVar, f fVar) {
            RegularKeyConfig.a aVar = RegularKeyConfig.a.f10068a;
            dVar.f(fVar, 0, aVar, keysConfig.character);
            dVar.f(fVar, 1, aVar, keysConfig.space);
            SplitKeyConfig.a aVar2 = SplitKeyConfig.a.f10078a;
            dVar.f(fVar, 2, aVar2, keysConfig.split);
            dVar.f(fVar, 3, aVar2, keysConfig.splitEmojiNumber);
            LayoutDependentKeyConfig.a aVar3 = LayoutDependentKeyConfig.a.f10066a;
            dVar.f(fVar, 4, aVar3, keysConfig.caps);
            dVar.f(fVar, 5, aVar3, keysConfig.delete);
            dVar.f(fVar, 6, IconKeyConfig.a.f10062a, keysConfig.returnKeyConfig);
            dVar.f(fVar, 7, aVar, keysConfig.moreCharacters);
            dVar.f(fVar, 8, aVar, keysConfig.emoji);
            dVar.f(fVar, 9, aVar, keysConfig.moreMaths);
            dVar.f(fVar, 10, aVar, keysConfig.moreNumbers);
            dVar.f(fVar, 11, aVar, keysConfig.mainLayout);
        }

        public final RegularKeyConfig component1() {
            return this.character;
        }

        public final RegularKeyConfig component10() {
            return this.moreMaths;
        }

        public final RegularKeyConfig component11() {
            return this.moreNumbers;
        }

        public final RegularKeyConfig component12() {
            return this.mainLayout;
        }

        public final RegularKeyConfig component2() {
            return this.space;
        }

        public final SplitKeyConfig component3() {
            return this.split;
        }

        public final SplitKeyConfig component4() {
            return this.splitEmojiNumber;
        }

        public final LayoutDependentKeyConfig component5() {
            return this.caps;
        }

        public final LayoutDependentKeyConfig component6() {
            return this.delete;
        }

        public final IconKeyConfig component7() {
            return this.returnKeyConfig;
        }

        public final RegularKeyConfig component8() {
            return this.moreCharacters;
        }

        public final RegularKeyConfig component9() {
            return this.emoji;
        }

        public final KeysConfig copy(RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2, SplitKeyConfig splitKeyConfig, SplitKeyConfig splitKeyConfig2, LayoutDependentKeyConfig layoutDependentKeyConfig, LayoutDependentKeyConfig layoutDependentKeyConfig2, IconKeyConfig iconKeyConfig, RegularKeyConfig regularKeyConfig3, RegularKeyConfig regularKeyConfig4, RegularKeyConfig regularKeyConfig5, RegularKeyConfig regularKeyConfig6, RegularKeyConfig regularKeyConfig7) {
            o.e(regularKeyConfig, "character");
            RegularKeyConfig regularKeyConfig8 = regularKeyConfig2;
            o.e(regularKeyConfig8, "space");
            SplitKeyConfig splitKeyConfig3 = splitKeyConfig;
            o.e(splitKeyConfig3, "split");
            SplitKeyConfig splitKeyConfig4 = splitKeyConfig2;
            o.e(splitKeyConfig4, "splitEmojiNumber");
            LayoutDependentKeyConfig layoutDependentKeyConfig3 = layoutDependentKeyConfig;
            o.e(layoutDependentKeyConfig3, "caps");
            LayoutDependentKeyConfig layoutDependentKeyConfig4 = layoutDependentKeyConfig2;
            o.e(layoutDependentKeyConfig4, "delete");
            IconKeyConfig iconKeyConfig2 = iconKeyConfig;
            o.e(iconKeyConfig2, "returnKeyConfig");
            RegularKeyConfig regularKeyConfig9 = regularKeyConfig3;
            o.e(regularKeyConfig9, "moreCharacters");
            RegularKeyConfig regularKeyConfig10 = regularKeyConfig4;
            o.e(regularKeyConfig10, "emoji");
            RegularKeyConfig regularKeyConfig11 = regularKeyConfig5;
            o.e(regularKeyConfig11, "moreMaths");
            RegularKeyConfig regularKeyConfig12 = regularKeyConfig6;
            o.e(regularKeyConfig12, "moreNumbers");
            RegularKeyConfig regularKeyConfig13 = regularKeyConfig7;
            o.e(regularKeyConfig13, "mainLayout");
            return new KeysConfig(regularKeyConfig, regularKeyConfig8, splitKeyConfig3, splitKeyConfig4, layoutDependentKeyConfig3, layoutDependentKeyConfig4, iconKeyConfig2, regularKeyConfig9, regularKeyConfig10, regularKeyConfig11, regularKeyConfig12, regularKeyConfig13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeysConfig)) {
                return false;
            }
            KeysConfig keysConfig = (KeysConfig) obj;
            return o.a(this.character, keysConfig.character) && o.a(this.space, keysConfig.space) && o.a(this.split, keysConfig.split) && o.a(this.splitEmojiNumber, keysConfig.splitEmojiNumber) && o.a(this.caps, keysConfig.caps) && o.a(this.delete, keysConfig.delete) && o.a(this.returnKeyConfig, keysConfig.returnKeyConfig) && o.a(this.moreCharacters, keysConfig.moreCharacters) && o.a(this.emoji, keysConfig.emoji) && o.a(this.moreMaths, keysConfig.moreMaths) && o.a(this.moreNumbers, keysConfig.moreNumbers) && o.a(this.mainLayout, keysConfig.mainLayout);
        }

        public final LayoutDependentKeyConfig getCaps() {
            return this.caps;
        }

        public final RegularKeyConfig getCharacter() {
            return this.character;
        }

        public final LayoutDependentKeyConfig getDelete() {
            return this.delete;
        }

        public final RegularKeyConfig getEmoji() {
            return this.emoji;
        }

        public final RegularKeyConfig getMainLayout() {
            return this.mainLayout;
        }

        public final RegularKeyConfig getMoreCharacters() {
            return this.moreCharacters;
        }

        public final RegularKeyConfig getMoreMaths() {
            return this.moreMaths;
        }

        public final RegularKeyConfig getMoreNumbers() {
            return this.moreNumbers;
        }

        public final IconKeyConfig getReturnKeyConfig() {
            return this.returnKeyConfig;
        }

        public final RegularKeyConfig getSpace() {
            return this.space;
        }

        public final SplitKeyConfig getSplit() {
            return this.split;
        }

        public final SplitKeyConfig getSplitEmojiNumber() {
            return this.splitEmojiNumber;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.character.hashCode() * 31) + this.space.hashCode()) * 31) + this.split.hashCode()) * 31) + this.splitEmojiNumber.hashCode()) * 31) + this.caps.hashCode()) * 31) + this.delete.hashCode()) * 31) + this.returnKeyConfig.hashCode()) * 31) + this.moreCharacters.hashCode()) * 31) + this.emoji.hashCode()) * 31) + this.moreMaths.hashCode()) * 31) + this.moreNumbers.hashCode()) * 31) + this.mainLayout.hashCode();
        }

        public String toString() {
            return "KeysConfig(character=" + this.character + ", space=" + this.space + ", split=" + this.split + ", splitEmojiNumber=" + this.splitEmojiNumber + ", caps=" + this.caps + ", delete=" + this.delete + ", returnKeyConfig=" + this.returnKeyConfig + ", moreCharacters=" + this.moreCharacters + ", emoji=" + this.emoji + ", moreMaths=" + this.moreMaths + ", moreNumbers=" + this.moreNumbers + ", mainLayout=" + this.mainLayout + ')';
        }

        public KeysConfig(RegularKeyConfig regularKeyConfig, RegularKeyConfig regularKeyConfig2, SplitKeyConfig splitKeyConfig, SplitKeyConfig splitKeyConfig2, LayoutDependentKeyConfig layoutDependentKeyConfig, LayoutDependentKeyConfig layoutDependentKeyConfig2, IconKeyConfig iconKeyConfig, RegularKeyConfig regularKeyConfig3, RegularKeyConfig regularKeyConfig4, RegularKeyConfig regularKeyConfig5, RegularKeyConfig regularKeyConfig6, RegularKeyConfig regularKeyConfig7) {
            o.e(regularKeyConfig, "character");
            o.e(regularKeyConfig2, "space");
            o.e(splitKeyConfig, "split");
            o.e(splitKeyConfig2, "splitEmojiNumber");
            o.e(layoutDependentKeyConfig, "caps");
            o.e(layoutDependentKeyConfig2, "delete");
            o.e(iconKeyConfig, "returnKeyConfig");
            o.e(regularKeyConfig3, "moreCharacters");
            o.e(regularKeyConfig4, "emoji");
            o.e(regularKeyConfig5, "moreMaths");
            o.e(regularKeyConfig6, "moreNumbers");
            o.e(regularKeyConfig7, "mainLayout");
            this.character = regularKeyConfig;
            this.space = regularKeyConfig2;
            this.split = splitKeyConfig;
            this.splitEmojiNumber = splitKeyConfig2;
            this.caps = layoutDependentKeyConfig;
            this.delete = layoutDependentKeyConfig2;
            this.returnKeyConfig = iconKeyConfig;
            this.moreCharacters = regularKeyConfig3;
            this.emoji = regularKeyConfig4;
            this.moreMaths = regularKeyConfig5;
            this.moreNumbers = regularKeyConfig6;
            this.mainLayout = regularKeyConfig7;
        }
    }

    @m
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b*\b\b\u0018\u0000 c2\u00020\u0001:\u0002deB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015BÅ\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010%J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010%JÂ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010?\u0012\u0004\bD\u0010B\u001a\u0004\bC\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010?\u0012\u0004\bF\u0010B\u001a\u0004\bE\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010?\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010%R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010?\u0012\u0004\bJ\u0010B\u001a\u0004\bI\u0010%R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bL\u0010B\u001a\u0004\bK\u0010%R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bN\u0010B\u001a\u0004\bM\u0010%R \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bP\u0010B\u001a\u0004\bO\u0010%R \u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bR\u0010B\u001a\u0004\bQ\u0010%R \u0010\f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bT\u0010B\u001a\u0004\bS\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010?\u0012\u0004\bV\u0010B\u001a\u0004\bU\u0010%R \u0010\u000e\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bX\u0010B\u001a\u0004\bW\u0010%R \u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010?\u0012\u0004\bZ\u0010B\u001a\u0004\bY\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010?\u0012\u0004\b\\\u0010B\u001a\u0004\b[\u0010%R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\b^\u0010B\u001a\u0004\b]\u0010%R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010?\u0012\u0004\b`\u0010B\u001a\u0004\b_\u0010%R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010?\u0012\u0004\bb\u0010B\u001a\u0004\ba\u0010%¨\u0006f"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;", "", "", "backgroundColor", "fontColor", "dividerColor", "arrowCloseIconFontColor", "selectedBackgroundColor", "selectedFontColor", "unselectedBackgroundColor", "unselectedFontColor", "undoBackgroundColor", "undoFontColor", "undoIconColor", "deleteBackgroundColor", "deleteFontColor", "spinnerColor", "proFeatureColor", "passwordManagerColor", "passwordManagerFontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SmartBarConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFontColor", "getFontColor$annotations", "getDividerColor", "getDividerColor$annotations", "getArrowCloseIconFontColor", "getArrowCloseIconFontColor$annotations", "getSelectedBackgroundColor", "getSelectedBackgroundColor$annotations", "getSelectedFontColor", "getSelectedFontColor$annotations", "getUnselectedBackgroundColor", "getUnselectedBackgroundColor$annotations", "getUnselectedFontColor", "getUnselectedFontColor$annotations", "getUndoBackgroundColor", "getUndoBackgroundColor$annotations", "getUndoFontColor", "getUndoFontColor$annotations", "getUndoIconColor", "getUndoIconColor$annotations", "getDeleteBackgroundColor", "getDeleteBackgroundColor$annotations", "getDeleteFontColor", "getDeleteFontColor$annotations", "getSpinnerColor", "getSpinnerColor$annotations", "getProFeatureColor", "getProFeatureColor$annotations", "getPasswordManagerColor", "getPasswordManagerColor$annotations", "getPasswordManagerFontColor", "getPasswordManagerFontColor$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SmartBarConfig {
        public static final b Companion = new b((i) null);
        private final String arrowCloseIconFontColor;
        private final String backgroundColor;
        private final String deleteBackgroundColor;
        private final String deleteFontColor;
        private final String dividerColor;
        private final String fontColor;
        private final String passwordManagerColor;
        private final String passwordManagerFontColor;
        private final String proFeatureColor;
        private final String selectedBackgroundColor;
        private final String selectedFontColor;
        private final String spinnerColor;
        private final String undoBackgroundColor;
        private final String undoFontColor;
        private final String undoIconColor;
        private final String unselectedBackgroundColor;
        private final String unselectedFontColor;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10082a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10083b;

            static {
                a aVar = new a();
                f10082a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig", aVar, 17);
                s0Var.p("background-color", false);
                s0Var.p("font-color", false);
                s0Var.p("divider-color", false);
                s0Var.p("arrow-close-icon", false);
                s0Var.p("selected-background", false);
                s0Var.p("selected-font-color", false);
                s0Var.p("unselected-background", false);
                s0Var.p("unselected-font-color", false);
                s0Var.p("undo-background", false);
                s0Var.p("undo-font-color", false);
                s0Var.p("undo-icon-color", false);
                s0Var.p("delete-background", false);
                s0Var.p("delete-font-color", false);
                s0Var.p("spinner-color", false);
                s0Var.p("pro-feature", false);
                s0Var.p("password-manager-color", false);
                s0Var.p("password-manager-font", false);
                f10083b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10083b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                return new F2.b[]{g02, g02, g02, g02, g02, g02, g02, g02, g02, g02, g02, g02, g02, G2.a.u(g02), G2.a.u(g02), G2.a.u(g02), G2.a.u(g02)};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x00e9, code lost:
                r2 = r2 | r14;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0199, code lost:
                r7 = 11;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x01c9, code lost:
                r12 = 5;
             */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig b(I2.e r54) {
                /*
                    r53 = this;
                    r0 = r54
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f10083b
                    I2.c r0 = r0.d(r1)
                    boolean r2 = r0.p()
                    r7 = 11
                    r8 = 10
                    r9 = 9
                    r10 = 7
                    r11 = 6
                    r12 = 5
                    r13 = 3
                    r15 = 8
                    r14 = 4
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    r6 = 0
                    if (r2 == 0) goto L_0x00af
                    java.lang.String r2 = r0.z(r1, r5)
                    java.lang.String r4 = r0.z(r1, r4)
                    java.lang.String r3 = r0.z(r1, r3)
                    java.lang.String r5 = r0.z(r1, r13)
                    java.lang.String r13 = r0.z(r1, r14)
                    java.lang.String r12 = r0.z(r1, r12)
                    java.lang.String r11 = r0.z(r1, r11)
                    java.lang.String r10 = r0.z(r1, r10)
                    java.lang.String r14 = r0.z(r1, r15)
                    java.lang.String r9 = r0.z(r1, r9)
                    java.lang.String r8 = r0.z(r1, r8)
                    java.lang.String r7 = r0.z(r1, r7)
                    r15 = 12
                    java.lang.String r15 = r0.z(r1, r15)
                    r19 = r2
                    J2.G0 r2 = J2.G0.f622a
                    r20 = r3
                    r3 = 13
                    java.lang.Object r3 = r0.m(r1, r3, r2, r6)
                    java.lang.String r3 = (java.lang.String) r3
                    r18 = r3
                    r3 = 14
                    java.lang.Object r3 = r0.m(r1, r3, r2, r6)
                    java.lang.String r3 = (java.lang.String) r3
                    r17 = r3
                    r3 = 15
                    java.lang.Object r3 = r0.m(r1, r3, r2, r6)
                    java.lang.String r3 = (java.lang.String) r3
                    r16 = r3
                    r3 = 16
                    java.lang.Object r2 = r0.m(r1, r3, r2, r6)
                    java.lang.String r2 = (java.lang.String) r2
                    r3 = 131071(0x1ffff, float:1.8367E-40)
                    r51 = r2
                    r34 = r3
                    r36 = r4
                    r38 = r5
                    r46 = r7
                    r45 = r8
                    r44 = r9
                    r42 = r10
                    r41 = r11
                    r40 = r12
                    r39 = r13
                    r43 = r14
                    r47 = r15
                    r50 = r16
                    r49 = r17
                    r48 = r18
                    r35 = r19
                    r37 = r20
                    goto L_0x01f1
                L_0x00af:
                    r32 = r4
                    r2 = r5
                    r3 = r6
                    r4 = r3
                    r5 = r4
                    r13 = r5
                    r20 = r13
                    r21 = r20
                    r22 = r21
                    r23 = r22
                    r24 = r23
                    r25 = r24
                    r26 = r25
                    r27 = r26
                    r28 = r27
                    r29 = r28
                    r30 = r29
                    r31 = r30
                L_0x00ce:
                    if (r32 == 0) goto L_0x01cd
                    int r14 = r0.e(r1)
                    switch(r14) {
                        case -1: goto L_0x01c3;
                        case 0: goto L_0x01b4;
                        case 1: goto L_0x01a8;
                        case 2: goto L_0x019c;
                        case 3: goto L_0x018e;
                        case 4: goto L_0x017d;
                        case 5: goto L_0x016e;
                        case 6: goto L_0x0163;
                        case 7: goto L_0x0158;
                        case 8: goto L_0x014c;
                        case 9: goto L_0x0140;
                        case 10: goto L_0x0134;
                        case 11: goto L_0x0128;
                        case 12: goto L_0x011c;
                        case 13: goto L_0x010c;
                        case 14: goto L_0x00fc;
                        case 15: goto L_0x00ec;
                        case 16: goto L_0x00dd;
                        default: goto L_0x00d7;
                    }
                L_0x00d7:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r14)
                    throw r0
                L_0x00dd:
                    J2.G0 r14 = J2.G0.f622a
                    r12 = 16
                    java.lang.Object r5 = r0.m(r1, r12, r14, r5)
                    java.lang.String r5 = (java.lang.String) r5
                    r14 = 65536(0x10000, float:9.18355E-41)
                L_0x00e9:
                    r2 = r2 | r14
                    goto L_0x01c9
                L_0x00ec:
                    r12 = 16
                    J2.G0 r14 = J2.G0.f622a
                    r12 = 15
                    java.lang.Object r13 = r0.m(r1, r12, r14, r13)
                    java.lang.String r13 = (java.lang.String) r13
                    r14 = 32768(0x8000, float:4.5918E-41)
                    goto L_0x00e9
                L_0x00fc:
                    r12 = 15
                    J2.G0 r14 = J2.G0.f622a
                    r12 = 14
                    java.lang.Object r3 = r0.m(r1, r12, r14, r3)
                    java.lang.String r3 = (java.lang.String) r3
                    r2 = r2 | 16384(0x4000, float:2.2959E-41)
                    goto L_0x01c9
                L_0x010c:
                    r12 = 14
                    J2.G0 r14 = J2.G0.f622a
                    r12 = 13
                    java.lang.Object r4 = r0.m(r1, r12, r14, r4)
                    java.lang.String r4 = (java.lang.String) r4
                    r2 = r2 | 8192(0x2000, float:1.14794E-41)
                    goto L_0x01c9
                L_0x011c:
                    r12 = 13
                    r14 = 12
                    java.lang.String r31 = r0.z(r1, r14)
                    r2 = r2 | 4096(0x1000, float:5.74E-42)
                    goto L_0x01c9
                L_0x0128:
                    r12 = 13
                    r14 = 12
                    java.lang.String r30 = r0.z(r1, r7)
                    r2 = r2 | 2048(0x800, float:2.87E-42)
                    goto L_0x01c9
                L_0x0134:
                    r12 = 13
                    r14 = 12
                    java.lang.String r29 = r0.z(r1, r8)
                    r2 = r2 | 1024(0x400, float:1.435E-42)
                    goto L_0x01c9
                L_0x0140:
                    r12 = 13
                    r14 = 12
                    java.lang.String r28 = r0.z(r1, r9)
                    r2 = r2 | 512(0x200, float:7.175E-43)
                    goto L_0x01c9
                L_0x014c:
                    r12 = 13
                    r14 = 12
                    java.lang.String r27 = r0.z(r1, r15)
                    r2 = r2 | 256(0x100, float:3.59E-43)
                    goto L_0x01c9
                L_0x0158:
                    r12 = 13
                    r14 = 12
                    java.lang.String r26 = r0.z(r1, r10)
                    r2 = r2 | 128(0x80, float:1.794E-43)
                    goto L_0x01c9
                L_0x0163:
                    r12 = 13
                    r14 = 12
                    java.lang.String r25 = r0.z(r1, r11)
                    r2 = r2 | 64
                    goto L_0x01c9
                L_0x016e:
                    r7 = r12
                    r12 = 13
                    r14 = 12
                    java.lang.String r24 = r0.z(r1, r7)
                    r2 = r2 | 32
                    r12 = r7
                    r7 = 11
                    goto L_0x01ca
                L_0x017d:
                    r7 = 4
                    r12 = 13
                    r14 = 12
                    java.lang.String r23 = r0.z(r1, r7)
                    r2 = r2 | 16
                    r14 = r7
                    r7 = 11
                    r12 = 5
                    goto L_0x00ce
                L_0x018e:
                    r7 = 3
                    r12 = 13
                    r14 = 12
                    java.lang.String r22 = r0.z(r1, r7)
                    r2 = r2 | 8
                L_0x0199:
                    r7 = 11
                    goto L_0x01c9
                L_0x019c:
                    r7 = 2
                    r12 = 13
                    r14 = 12
                    java.lang.String r21 = r0.z(r1, r7)
                    r2 = r2 | 4
                    goto L_0x0199
                L_0x01a8:
                    r7 = 1
                    r12 = 13
                    r14 = 12
                    java.lang.String r20 = r0.z(r1, r7)
                    r2 = r2 | 2
                    goto L_0x0199
                L_0x01b4:
                    r6 = 0
                    r7 = 1
                    r12 = 13
                    r14 = 12
                    java.lang.String r19 = r0.z(r1, r6)
                    r2 = r2 | 1
                    r6 = r19
                    goto L_0x0199
                L_0x01c3:
                    r14 = 12
                    r19 = 0
                    r32 = r19
                L_0x01c9:
                    r12 = 5
                L_0x01ca:
                    r14 = 4
                    goto L_0x00ce
                L_0x01cd:
                    r34 = r2
                    r49 = r3
                    r48 = r4
                    r51 = r5
                    r35 = r6
                    r50 = r13
                    r36 = r20
                    r37 = r21
                    r38 = r22
                    r39 = r23
                    r40 = r24
                    r41 = r25
                    r42 = r26
                    r43 = r27
                    r44 = r28
                    r45 = r29
                    r46 = r30
                    r47 = r31
                L_0x01f1:
                    r0.c(r1)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig r0 = new ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig
                    r33 = r0
                    r52 = 0
                    r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig.a.b(I2.e):ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, SmartBarConfig smartBarConfig) {
                o.e(fVar, "encoder");
                o.e(smartBarConfig, "value");
                f fVar2 = f10083b;
                d d4 = fVar.d(fVar2);
                SmartBarConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(smartBarConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10082a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ SmartBarConfig(int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C0 c02) {
            if (131071 != (i4 & 131071)) {
                C0317n0.a(i4, 131071, a.f10082a.a());
            }
            this.backgroundColor = str;
            this.fontColor = str2;
            this.dividerColor = str3;
            this.arrowCloseIconFontColor = str4;
            this.selectedBackgroundColor = str5;
            this.selectedFontColor = str6;
            this.unselectedBackgroundColor = str7;
            this.unselectedFontColor = str8;
            this.undoBackgroundColor = str9;
            this.undoFontColor = str10;
            this.undoIconColor = str11;
            this.deleteBackgroundColor = str12;
            this.deleteFontColor = str13;
            this.spinnerColor = str14;
            this.proFeatureColor = str15;
            this.passwordManagerColor = str16;
            this.passwordManagerFontColor = str17;
        }

        public static /* synthetic */ SmartBarConfig copy$default(SmartBarConfig smartBarConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i4, Object obj) {
            SmartBarConfig smartBarConfig2 = smartBarConfig;
            int i5 = i4;
            return smartBarConfig.copy((i5 & 1) != 0 ? smartBarConfig2.backgroundColor : str, (i5 & 2) != 0 ? smartBarConfig2.fontColor : str2, (i5 & 4) != 0 ? smartBarConfig2.dividerColor : str3, (i5 & 8) != 0 ? smartBarConfig2.arrowCloseIconFontColor : str4, (i5 & 16) != 0 ? smartBarConfig2.selectedBackgroundColor : str5, (i5 & 32) != 0 ? smartBarConfig2.selectedFontColor : str6, (i5 & 64) != 0 ? smartBarConfig2.unselectedBackgroundColor : str7, (i5 & Uuid.SIZE_BITS) != 0 ? smartBarConfig2.unselectedFontColor : str8, (i5 & 256) != 0 ? smartBarConfig2.undoBackgroundColor : str9, (i5 & 512) != 0 ? smartBarConfig2.undoFontColor : str10, (i5 & 1024) != 0 ? smartBarConfig2.undoIconColor : str11, (i5 & 2048) != 0 ? smartBarConfig2.deleteBackgroundColor : str12, (i5 & 4096) != 0 ? smartBarConfig2.deleteFontColor : str13, (i5 & 8192) != 0 ? smartBarConfig2.spinnerColor : str14, (i5 & 16384) != 0 ? smartBarConfig2.proFeatureColor : str15, (i5 & 32768) != 0 ? smartBarConfig2.passwordManagerColor : str16, (i5 & 65536) != 0 ? smartBarConfig2.passwordManagerFontColor : str17);
        }

        public static /* synthetic */ void getArrowCloseIconFontColor$annotations() {
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getDeleteBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getDeleteFontColor$annotations() {
        }

        public static /* synthetic */ void getDividerColor$annotations() {
        }

        public static /* synthetic */ void getFontColor$annotations() {
        }

        public static /* synthetic */ void getPasswordManagerColor$annotations() {
        }

        public static /* synthetic */ void getPasswordManagerFontColor$annotations() {
        }

        public static /* synthetic */ void getProFeatureColor$annotations() {
        }

        public static /* synthetic */ void getSelectedBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getSelectedFontColor$annotations() {
        }

        public static /* synthetic */ void getSpinnerColor$annotations() {
        }

        public static /* synthetic */ void getUndoBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getUndoFontColor$annotations() {
        }

        public static /* synthetic */ void getUndoIconColor$annotations() {
        }

        public static /* synthetic */ void getUnselectedBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getUnselectedFontColor$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(SmartBarConfig smartBarConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, smartBarConfig.backgroundColor);
            dVar.p(fVar, 1, smartBarConfig.fontColor);
            dVar.p(fVar, 2, smartBarConfig.dividerColor);
            dVar.p(fVar, 3, smartBarConfig.arrowCloseIconFontColor);
            dVar.p(fVar, 4, smartBarConfig.selectedBackgroundColor);
            dVar.p(fVar, 5, smartBarConfig.selectedFontColor);
            dVar.p(fVar, 6, smartBarConfig.unselectedBackgroundColor);
            dVar.p(fVar, 7, smartBarConfig.unselectedFontColor);
            dVar.p(fVar, 8, smartBarConfig.undoBackgroundColor);
            dVar.p(fVar, 9, smartBarConfig.undoFontColor);
            dVar.p(fVar, 10, smartBarConfig.undoIconColor);
            dVar.p(fVar, 11, smartBarConfig.deleteBackgroundColor);
            dVar.p(fVar, 12, smartBarConfig.deleteFontColor);
            G0 g02 = G0.f622a;
            dVar.o(fVar, 13, g02, smartBarConfig.spinnerColor);
            dVar.o(fVar, 14, g02, smartBarConfig.proFeatureColor);
            dVar.o(fVar, 15, g02, smartBarConfig.passwordManagerColor);
            dVar.o(fVar, 16, g02, smartBarConfig.passwordManagerFontColor);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final String component10() {
            return this.undoFontColor;
        }

        public final String component11() {
            return this.undoIconColor;
        }

        public final String component12() {
            return this.deleteBackgroundColor;
        }

        public final String component13() {
            return this.deleteFontColor;
        }

        public final String component14() {
            return this.spinnerColor;
        }

        public final String component15() {
            return this.proFeatureColor;
        }

        public final String component16() {
            return this.passwordManagerColor;
        }

        public final String component17() {
            return this.passwordManagerFontColor;
        }

        public final String component2() {
            return this.fontColor;
        }

        public final String component3() {
            return this.dividerColor;
        }

        public final String component4() {
            return this.arrowCloseIconFontColor;
        }

        public final String component5() {
            return this.selectedBackgroundColor;
        }

        public final String component6() {
            return this.selectedFontColor;
        }

        public final String component7() {
            return this.unselectedBackgroundColor;
        }

        public final String component8() {
            return this.unselectedFontColor;
        }

        public final String component9() {
            return this.undoBackgroundColor;
        }

        public final SmartBarConfig copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            String str18 = str;
            o.e(str18, "backgroundColor");
            o.e(str2, "fontColor");
            o.e(str3, "dividerColor");
            o.e(str4, "arrowCloseIconFontColor");
            o.e(str5, "selectedBackgroundColor");
            o.e(str6, "selectedFontColor");
            o.e(str7, "unselectedBackgroundColor");
            o.e(str8, "unselectedFontColor");
            o.e(str9, "undoBackgroundColor");
            o.e(str10, "undoFontColor");
            o.e(str11, "undoIconColor");
            o.e(str12, "deleteBackgroundColor");
            o.e(str13, "deleteFontColor");
            return new SmartBarConfig(str18, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmartBarConfig)) {
                return false;
            }
            SmartBarConfig smartBarConfig = (SmartBarConfig) obj;
            return o.a(this.backgroundColor, smartBarConfig.backgroundColor) && o.a(this.fontColor, smartBarConfig.fontColor) && o.a(this.dividerColor, smartBarConfig.dividerColor) && o.a(this.arrowCloseIconFontColor, smartBarConfig.arrowCloseIconFontColor) && o.a(this.selectedBackgroundColor, smartBarConfig.selectedBackgroundColor) && o.a(this.selectedFontColor, smartBarConfig.selectedFontColor) && o.a(this.unselectedBackgroundColor, smartBarConfig.unselectedBackgroundColor) && o.a(this.unselectedFontColor, smartBarConfig.unselectedFontColor) && o.a(this.undoBackgroundColor, smartBarConfig.undoBackgroundColor) && o.a(this.undoFontColor, smartBarConfig.undoFontColor) && o.a(this.undoIconColor, smartBarConfig.undoIconColor) && o.a(this.deleteBackgroundColor, smartBarConfig.deleteBackgroundColor) && o.a(this.deleteFontColor, smartBarConfig.deleteFontColor) && o.a(this.spinnerColor, smartBarConfig.spinnerColor) && o.a(this.proFeatureColor, smartBarConfig.proFeatureColor) && o.a(this.passwordManagerColor, smartBarConfig.passwordManagerColor) && o.a(this.passwordManagerFontColor, smartBarConfig.passwordManagerFontColor);
        }

        public final String getArrowCloseIconFontColor() {
            return this.arrowCloseIconFontColor;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getDeleteBackgroundColor() {
            return this.deleteBackgroundColor;
        }

        public final String getDeleteFontColor() {
            return this.deleteFontColor;
        }

        public final String getDividerColor() {
            return this.dividerColor;
        }

        public final String getFontColor() {
            return this.fontColor;
        }

        public final String getPasswordManagerColor() {
            return this.passwordManagerColor;
        }

        public final String getPasswordManagerFontColor() {
            return this.passwordManagerFontColor;
        }

        public final String getProFeatureColor() {
            return this.proFeatureColor;
        }

        public final String getSelectedBackgroundColor() {
            return this.selectedBackgroundColor;
        }

        public final String getSelectedFontColor() {
            return this.selectedFontColor;
        }

        public final String getSpinnerColor() {
            return this.spinnerColor;
        }

        public final String getUndoBackgroundColor() {
            return this.undoBackgroundColor;
        }

        public final String getUndoFontColor() {
            return this.undoFontColor;
        }

        public final String getUndoIconColor() {
            return this.undoIconColor;
        }

        public final String getUnselectedBackgroundColor() {
            return this.unselectedBackgroundColor;
        }

        public final String getUnselectedFontColor() {
            return this.unselectedFontColor;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((((((((((this.backgroundColor.hashCode() * 31) + this.fontColor.hashCode()) * 31) + this.dividerColor.hashCode()) * 31) + this.arrowCloseIconFontColor.hashCode()) * 31) + this.selectedBackgroundColor.hashCode()) * 31) + this.selectedFontColor.hashCode()) * 31) + this.unselectedBackgroundColor.hashCode()) * 31) + this.unselectedFontColor.hashCode()) * 31) + this.undoBackgroundColor.hashCode()) * 31) + this.undoFontColor.hashCode()) * 31) + this.undoIconColor.hashCode()) * 31) + this.deleteBackgroundColor.hashCode()) * 31) + this.deleteFontColor.hashCode()) * 31;
            String str = this.spinnerColor;
            int i4 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.proFeatureColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.passwordManagerColor;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.passwordManagerFontColor;
            if (str4 != null) {
                i4 = str4.hashCode();
            }
            return hashCode4 + i4;
        }

        public String toString() {
            return "SmartBarConfig(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ", dividerColor=" + this.dividerColor + ", arrowCloseIconFontColor=" + this.arrowCloseIconFontColor + ", selectedBackgroundColor=" + this.selectedBackgroundColor + ", selectedFontColor=" + this.selectedFontColor + ", unselectedBackgroundColor=" + this.unselectedBackgroundColor + ", unselectedFontColor=" + this.unselectedFontColor + ", undoBackgroundColor=" + this.undoBackgroundColor + ", undoFontColor=" + this.undoFontColor + ", undoIconColor=" + this.undoIconColor + ", deleteBackgroundColor=" + this.deleteBackgroundColor + ", deleteFontColor=" + this.deleteFontColor + ", spinnerColor=" + this.spinnerColor + ", proFeatureColor=" + this.proFeatureColor + ", passwordManagerColor=" + this.passwordManagerColor + ", passwordManagerFontColor=" + this.passwordManagerFontColor + ')';
        }

        public SmartBarConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            String str18 = str;
            String str19 = str2;
            String str20 = str3;
            String str21 = str4;
            String str22 = str5;
            String str23 = str6;
            String str24 = str7;
            String str25 = str8;
            String str26 = str9;
            String str27 = str10;
            String str28 = str11;
            String str29 = str12;
            String str30 = str13;
            o.e(str18, "backgroundColor");
            o.e(str19, "fontColor");
            o.e(str20, "dividerColor");
            o.e(str21, "arrowCloseIconFontColor");
            o.e(str22, "selectedBackgroundColor");
            o.e(str23, "selectedFontColor");
            o.e(str24, "unselectedBackgroundColor");
            o.e(str25, "unselectedFontColor");
            o.e(str26, "undoBackgroundColor");
            o.e(str27, "undoFontColor");
            o.e(str28, "undoIconColor");
            o.e(str29, "deleteBackgroundColor");
            o.e(str30, "deleteFontColor");
            this.backgroundColor = str18;
            this.fontColor = str19;
            this.dividerColor = str20;
            this.arrowCloseIconFontColor = str21;
            this.selectedBackgroundColor = str22;
            this.selectedFontColor = str23;
            this.unselectedBackgroundColor = str24;
            this.unselectedFontColor = str25;
            this.undoBackgroundColor = str26;
            this.undoFontColor = str27;
            this.undoIconColor = str28;
            this.deleteBackgroundColor = str29;
            this.deleteFontColor = str30;
            this.spinnerColor = str14;
            this.proFeatureColor = str15;
            this.passwordManagerColor = str16;
            this.passwordManagerFontColor = str17;
        }
    }

    @m
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 @2\u00020\u0001:\u0007ABCDEFGB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JL\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010 R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010 R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010#R \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010%¨\u0006H"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;", "", "", "backgroundColor", "fallbackBackgroundColor", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;", "titleConfig", "characterConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;", "sidebarConfig", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;", "emojiSidebarConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;", "component4", "component5", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;", "component6", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "getFallbackBackgroundColor", "getFallbackBackgroundColor$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;", "getTitleConfig", "getTitleConfig$annotations", "getCharacterConfig", "getCharacterConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;", "getSidebarConfig", "getSidebarConfig$annotations", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;", "getEmojiSidebarConfig", "getEmojiSidebarConfig$annotations", "Companion", "SpecialOverlaySectionConfig", "SpecialOverlaySidebarConfig", "EmojiSidebarConfig", "SpecialOverlayIconConfig", "SpecialOverlayIconStateConfig", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpecialOverlaysConfig {
        public static final b Companion = new b((i) null);
        private final String backgroundColor;
        private final SpecialOverlaySectionConfig characterConfig;
        private final EmojiSidebarConfig emojiSidebarConfig;
        private final String fallbackBackgroundColor;
        private final SpecialOverlaySidebarConfig sidebarConfig;
        private final SpecialOverlaySectionConfig titleConfig;

        @m
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;", "", "", "backgroundColor", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "iconConfig", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "getIconConfig", "getIconConfig$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class EmojiSidebarConfig {
            public static final b Companion = new b((i) null);
            private final String backgroundColor;
            private final SpecialOverlayIconConfig iconConfig;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10084a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10085b;

                static {
                    a aVar = new a();
                    f10084a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.EmojiSidebarConfig", aVar, 2);
                    s0Var.p("background-color", false);
                    s0Var.p("icon", false);
                    f10085b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10085b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{G0.f622a, SpecialOverlayIconConfig.a.f10086a};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final EmojiSidebarConfig b(e eVar) {
                    int i4;
                    SpecialOverlayIconConfig specialOverlayIconConfig;
                    String str;
                    o.e(eVar, "decoder");
                    f fVar = f10085b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        str = d4.z(fVar, 0);
                        specialOverlayIconConfig = (SpecialOverlayIconConfig) d4.E(fVar, 1, SpecialOverlayIconConfig.a.f10086a, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        str = null;
                        SpecialOverlayIconConfig specialOverlayIconConfig2 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                str = d4.z(fVar, 0);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                specialOverlayIconConfig2 = (SpecialOverlayIconConfig) d4.E(fVar, 1, SpecialOverlayIconConfig.a.f10086a, specialOverlayIconConfig2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        specialOverlayIconConfig = specialOverlayIconConfig2;
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new EmojiSidebarConfig(i4, str, specialOverlayIconConfig, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, EmojiSidebarConfig emojiSidebarConfig) {
                    o.e(fVar, "encoder");
                    o.e(emojiSidebarConfig, "value");
                    f fVar2 = f10085b;
                    d d4 = fVar.d(fVar2);
                    EmojiSidebarConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(emojiSidebarConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10084a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ EmojiSidebarConfig(int i4, String str, SpecialOverlayIconConfig specialOverlayIconConfig, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10084a.a());
                }
                this.backgroundColor = str;
                this.iconConfig = specialOverlayIconConfig;
            }

            public static /* synthetic */ EmojiSidebarConfig copy$default(EmojiSidebarConfig emojiSidebarConfig, String str, SpecialOverlayIconConfig specialOverlayIconConfig, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = emojiSidebarConfig.backgroundColor;
                }
                if ((i4 & 2) != 0) {
                    specialOverlayIconConfig = emojiSidebarConfig.iconConfig;
                }
                return emojiSidebarConfig.copy(str, specialOverlayIconConfig);
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getIconConfig$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(EmojiSidebarConfig emojiSidebarConfig, d dVar, f fVar) {
                dVar.p(fVar, 0, emojiSidebarConfig.backgroundColor);
                dVar.f(fVar, 1, SpecialOverlayIconConfig.a.f10086a, emojiSidebarConfig.iconConfig);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final SpecialOverlayIconConfig component2() {
                return this.iconConfig;
            }

            public final EmojiSidebarConfig copy(String str, SpecialOverlayIconConfig specialOverlayIconConfig) {
                o.e(str, "backgroundColor");
                o.e(specialOverlayIconConfig, "iconConfig");
                return new EmojiSidebarConfig(str, specialOverlayIconConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmojiSidebarConfig)) {
                    return false;
                }
                EmojiSidebarConfig emojiSidebarConfig = (EmojiSidebarConfig) obj;
                return o.a(this.backgroundColor, emojiSidebarConfig.backgroundColor) && o.a(this.iconConfig, emojiSidebarConfig.iconConfig);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final SpecialOverlayIconConfig getIconConfig() {
                return this.iconConfig;
            }

            public int hashCode() {
                return (this.backgroundColor.hashCode() * 31) + this.iconConfig.hashCode();
            }

            public String toString() {
                return "EmojiSidebarConfig(backgroundColor=" + this.backgroundColor + ", iconConfig=" + this.iconConfig + ')';
            }

            public EmojiSidebarConfig(String str, SpecialOverlayIconConfig specialOverlayIconConfig) {
                o.e(str, "backgroundColor");
                o.e(specialOverlayIconConfig, "iconConfig");
                this.backgroundColor = str;
                this.iconConfig = specialOverlayIconConfig;
            }
        }

        @m
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;", "stateDefault", "stateActive", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;", "component2", "copy", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;", "getStateDefault", "getStateDefault$annotations", "()V", "getStateActive", "getStateActive$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpecialOverlayIconConfig {
            public static final b Companion = new b((i) null);
            private final SpecialOverlayIconStateConfig stateActive;
            private final SpecialOverlayIconStateConfig stateDefault;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10086a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10087b;

                static {
                    a aVar = new a();
                    f10086a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlayIconConfig", aVar, 2);
                    s0Var.p("state-default", false);
                    s0Var.p("state-active", false);
                    f10087b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10087b;
                }

                public final F2.b[] c() {
                    SpecialOverlayIconStateConfig.a aVar = SpecialOverlayIconStateConfig.a.f10088a;
                    return new F2.b[]{aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final SpecialOverlayIconConfig b(e eVar) {
                    SpecialOverlayIconStateConfig specialOverlayIconStateConfig;
                    int i4;
                    SpecialOverlayIconStateConfig specialOverlayIconStateConfig2;
                    o.e(eVar, "decoder");
                    f fVar = f10087b;
                    c d4 = eVar.d(fVar);
                    if (d4.p()) {
                        SpecialOverlayIconStateConfig.a aVar = SpecialOverlayIconStateConfig.a.f10088a;
                        specialOverlayIconStateConfig = (SpecialOverlayIconStateConfig) d4.E(fVar, 0, aVar, (Object) null);
                        specialOverlayIconStateConfig2 = (SpecialOverlayIconStateConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        specialOverlayIconStateConfig2 = null;
                        SpecialOverlayIconStateConfig specialOverlayIconStateConfig3 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                specialOverlayIconStateConfig3 = (SpecialOverlayIconStateConfig) d4.E(fVar, 0, SpecialOverlayIconStateConfig.a.f10088a, specialOverlayIconStateConfig3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                specialOverlayIconStateConfig2 = (SpecialOverlayIconStateConfig) d4.E(fVar, 1, SpecialOverlayIconStateConfig.a.f10088a, specialOverlayIconStateConfig2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        specialOverlayIconStateConfig = specialOverlayIconStateConfig3;
                    }
                    d4.c(fVar);
                    return new SpecialOverlayIconConfig(i4, specialOverlayIconStateConfig, specialOverlayIconStateConfig2, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, SpecialOverlayIconConfig specialOverlayIconConfig) {
                    o.e(fVar, "encoder");
                    o.e(specialOverlayIconConfig, "value");
                    f fVar2 = f10087b;
                    d d4 = fVar.d(fVar2);
                    SpecialOverlayIconConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(specialOverlayIconConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10086a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ SpecialOverlayIconConfig(int i4, SpecialOverlayIconStateConfig specialOverlayIconStateConfig, SpecialOverlayIconStateConfig specialOverlayIconStateConfig2, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f10086a.a());
                }
                this.stateDefault = specialOverlayIconStateConfig;
                this.stateActive = specialOverlayIconStateConfig2;
            }

            public static /* synthetic */ SpecialOverlayIconConfig copy$default(SpecialOverlayIconConfig specialOverlayIconConfig, SpecialOverlayIconStateConfig specialOverlayIconStateConfig, SpecialOverlayIconStateConfig specialOverlayIconStateConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    specialOverlayIconStateConfig = specialOverlayIconConfig.stateDefault;
                }
                if ((i4 & 2) != 0) {
                    specialOverlayIconStateConfig2 = specialOverlayIconConfig.stateActive;
                }
                return specialOverlayIconConfig.copy(specialOverlayIconStateConfig, specialOverlayIconStateConfig2);
            }

            public static /* synthetic */ void getStateActive$annotations() {
            }

            public static /* synthetic */ void getStateDefault$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(SpecialOverlayIconConfig specialOverlayIconConfig, d dVar, f fVar) {
                SpecialOverlayIconStateConfig.a aVar = SpecialOverlayIconStateConfig.a.f10088a;
                dVar.f(fVar, 0, aVar, specialOverlayIconConfig.stateDefault);
                dVar.f(fVar, 1, aVar, specialOverlayIconConfig.stateActive);
            }

            public final SpecialOverlayIconStateConfig component1() {
                return this.stateDefault;
            }

            public final SpecialOverlayIconStateConfig component2() {
                return this.stateActive;
            }

            public final SpecialOverlayIconConfig copy(SpecialOverlayIconStateConfig specialOverlayIconStateConfig, SpecialOverlayIconStateConfig specialOverlayIconStateConfig2) {
                o.e(specialOverlayIconStateConfig, "stateDefault");
                o.e(specialOverlayIconStateConfig2, "stateActive");
                return new SpecialOverlayIconConfig(specialOverlayIconStateConfig, specialOverlayIconStateConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SpecialOverlayIconConfig)) {
                    return false;
                }
                SpecialOverlayIconConfig specialOverlayIconConfig = (SpecialOverlayIconConfig) obj;
                return o.a(this.stateDefault, specialOverlayIconConfig.stateDefault) && o.a(this.stateActive, specialOverlayIconConfig.stateActive);
            }

            public final SpecialOverlayIconStateConfig getStateActive() {
                return this.stateActive;
            }

            public final SpecialOverlayIconStateConfig getStateDefault() {
                return this.stateDefault;
            }

            public int hashCode() {
                return (this.stateDefault.hashCode() * 31) + this.stateActive.hashCode();
            }

            public String toString() {
                return "SpecialOverlayIconConfig(stateDefault=" + this.stateDefault + ", stateActive=" + this.stateActive + ')';
            }

            public SpecialOverlayIconConfig(SpecialOverlayIconStateConfig specialOverlayIconStateConfig, SpecialOverlayIconStateConfig specialOverlayIconStateConfig2) {
                o.e(specialOverlayIconStateConfig, "stateDefault");
                o.e(specialOverlayIconStateConfig2, "stateActive");
                this.stateDefault = specialOverlayIconStateConfig;
                this.stateActive = specialOverlayIconStateConfig2;
            }
        }

        @m
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;", "", "", "color", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconStateConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getColor$annotations", "()V", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpecialOverlayIconStateConfig {
            public static final b Companion = new b((i) null);
            private final String color;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10088a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10089b;

                static {
                    a aVar = new a();
                    f10088a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlayIconStateConfig", aVar, 1);
                    s0Var.p("color", false);
                    f10089b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10089b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{G0.f622a};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final SpecialOverlayIconStateConfig b(e eVar) {
                    String str;
                    o.e(eVar, "decoder");
                    f fVar = f10089b;
                    c d4 = eVar.d(fVar);
                    int i4 = 1;
                    if (d4.p()) {
                        str = d4.z(fVar, 0);
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        str = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                str = d4.z(fVar, 0);
                                i5 = 1;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new SpecialOverlayIconStateConfig(i4, str, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, SpecialOverlayIconStateConfig specialOverlayIconStateConfig) {
                    o.e(fVar, "encoder");
                    o.e(specialOverlayIconStateConfig, "value");
                    f fVar2 = f10089b;
                    d d4 = fVar.d(fVar2);
                    d4.p(fVar2, 0, specialOverlayIconStateConfig.color);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10088a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ SpecialOverlayIconStateConfig(int i4, String str, C0 c02) {
                if (1 != (i4 & 1)) {
                    C0317n0.a(i4, 1, a.f10088a.a());
                }
                this.color = str;
            }

            public static /* synthetic */ SpecialOverlayIconStateConfig copy$default(SpecialOverlayIconStateConfig specialOverlayIconStateConfig, String str, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = specialOverlayIconStateConfig.color;
                }
                return specialOverlayIconStateConfig.copy(str);
            }

            public static /* synthetic */ void getColor$annotations() {
            }

            public final String component1() {
                return this.color;
            }

            public final SpecialOverlayIconStateConfig copy(String str) {
                o.e(str, "color");
                return new SpecialOverlayIconStateConfig(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpecialOverlayIconStateConfig) && o.a(this.color, ((SpecialOverlayIconStateConfig) obj).color);
            }

            public final String getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color.hashCode();
            }

            public String toString() {
                return "SpecialOverlayIconStateConfig(color=" + this.color + ')';
            }

            public SpecialOverlayIconStateConfig(String str) {
                o.e(str, "color");
                this.color = str;
            }
        }

        @m
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;", "", "", "fontColor", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFontColor", "getFontColor$annotations", "()V", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpecialOverlaySectionConfig {
            public static final b Companion = new b((i) null);
            private final String fontColor;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10090a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10091b;

                static {
                    a aVar = new a();
                    f10090a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig", aVar, 1);
                    s0Var.p("font-color", false);
                    f10091b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10091b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{G0.f622a};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final SpecialOverlaySectionConfig b(e eVar) {
                    String str;
                    o.e(eVar, "decoder");
                    f fVar = f10091b;
                    c d4 = eVar.d(fVar);
                    int i4 = 1;
                    if (d4.p()) {
                        str = d4.z(fVar, 0);
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        str = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                str = d4.z(fVar, 0);
                                i5 = 1;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new SpecialOverlaySectionConfig(i4, str, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, SpecialOverlaySectionConfig specialOverlaySectionConfig) {
                    o.e(fVar, "encoder");
                    o.e(specialOverlaySectionConfig, "value");
                    f fVar2 = f10091b;
                    d d4 = fVar.d(fVar2);
                    d4.p(fVar2, 0, specialOverlaySectionConfig.fontColor);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10090a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ SpecialOverlaySectionConfig(int i4, String str, C0 c02) {
                if (1 != (i4 & 1)) {
                    C0317n0.a(i4, 1, a.f10090a.a());
                }
                this.fontColor = str;
            }

            public static /* synthetic */ SpecialOverlaySectionConfig copy$default(SpecialOverlaySectionConfig specialOverlaySectionConfig, String str, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = specialOverlaySectionConfig.fontColor;
                }
                return specialOverlaySectionConfig.copy(str);
            }

            public static /* synthetic */ void getFontColor$annotations() {
            }

            public final String component1() {
                return this.fontColor;
            }

            public final SpecialOverlaySectionConfig copy(String str) {
                o.e(str, "fontColor");
                return new SpecialOverlaySectionConfig(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpecialOverlaySectionConfig) && o.a(this.fontColor, ((SpecialOverlaySectionConfig) obj).fontColor);
            }

            public final String getFontColor() {
                return this.fontColor;
            }

            public int hashCode() {
                return this.fontColor.hashCode();
            }

            public String toString() {
                return "SpecialOverlaySectionConfig(fontColor=" + this.fontColor + ')';
            }

            public SpecialOverlaySectionConfig(String str) {
                o.e(str, "fontColor");
                this.fontColor = str;
            }
        }

        @m
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00061"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;", "", "", "backgroundColor", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "iconConfig", "exitIconConfig", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "component3", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig$SpecialOverlaysConfig$SpecialOverlayIconConfig;", "getIconConfig", "getIconConfig$annotations", "getExitIconConfig", "getExitIconConfig$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpecialOverlaySidebarConfig {
            public static final b Companion = new b((i) null);
            private final String backgroundColor;
            private final SpecialOverlayIconConfig exitIconConfig;
            private final SpecialOverlayIconConfig iconConfig;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10092a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10093b;

                static {
                    a aVar = new a();
                    f10092a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySidebarConfig", aVar, 3);
                    s0Var.p("background-color", false);
                    s0Var.p("icon", false);
                    s0Var.p("exit-icon", false);
                    f10093b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10093b;
                }

                public final F2.b[] c() {
                    SpecialOverlayIconConfig.a aVar = SpecialOverlayIconConfig.a.f10086a;
                    return new F2.b[]{G0.f622a, aVar, aVar};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final SpecialOverlaySidebarConfig b(e eVar) {
                    SpecialOverlayIconConfig specialOverlayIconConfig;
                    SpecialOverlayIconConfig specialOverlayIconConfig2;
                    String str;
                    int i4;
                    e eVar2 = eVar;
                    o.e(eVar2, "decoder");
                    f fVar = f10093b;
                    c d4 = eVar2.d(fVar);
                    String str2 = null;
                    if (d4.p()) {
                        String z3 = d4.z(fVar, 0);
                        SpecialOverlayIconConfig.a aVar = SpecialOverlayIconConfig.a.f10086a;
                        str = z3;
                        specialOverlayIconConfig = (SpecialOverlayIconConfig) d4.E(fVar, 2, aVar, (Object) null);
                        specialOverlayIconConfig2 = (SpecialOverlayIconConfig) d4.E(fVar, 1, aVar, (Object) null);
                        i4 = 7;
                    } else {
                        boolean z4 = true;
                        int i5 = 0;
                        SpecialOverlayIconConfig specialOverlayIconConfig3 = null;
                        SpecialOverlayIconConfig specialOverlayIconConfig4 = null;
                        while (z4) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z4 = false;
                            } else if (e4 == 0) {
                                str2 = d4.z(fVar, 0);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                specialOverlayIconConfig3 = (SpecialOverlayIconConfig) d4.E(fVar, 1, SpecialOverlayIconConfig.a.f10086a, specialOverlayIconConfig3);
                                i5 |= 2;
                            } else if (e4 == 2) {
                                specialOverlayIconConfig4 = (SpecialOverlayIconConfig) d4.E(fVar, 2, SpecialOverlayIconConfig.a.f10086a, specialOverlayIconConfig4);
                                i5 |= 4;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        str = str2;
                        specialOverlayIconConfig2 = specialOverlayIconConfig3;
                        specialOverlayIconConfig = specialOverlayIconConfig4;
                    }
                    d4.c(fVar);
                    return new SpecialOverlaySidebarConfig(i4, str, specialOverlayIconConfig2, specialOverlayIconConfig, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, SpecialOverlaySidebarConfig specialOverlaySidebarConfig) {
                    o.e(fVar, "encoder");
                    o.e(specialOverlaySidebarConfig, "value");
                    f fVar2 = f10093b;
                    d d4 = fVar.d(fVar2);
                    SpecialOverlaySidebarConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(specialOverlaySidebarConfig, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10092a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ SpecialOverlaySidebarConfig(int i4, String str, SpecialOverlayIconConfig specialOverlayIconConfig, SpecialOverlayIconConfig specialOverlayIconConfig2, C0 c02) {
                if (7 != (i4 & 7)) {
                    C0317n0.a(i4, 7, a.f10092a.a());
                }
                this.backgroundColor = str;
                this.iconConfig = specialOverlayIconConfig;
                this.exitIconConfig = specialOverlayIconConfig2;
            }

            public static /* synthetic */ SpecialOverlaySidebarConfig copy$default(SpecialOverlaySidebarConfig specialOverlaySidebarConfig, String str, SpecialOverlayIconConfig specialOverlayIconConfig, SpecialOverlayIconConfig specialOverlayIconConfig2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = specialOverlaySidebarConfig.backgroundColor;
                }
                if ((i4 & 2) != 0) {
                    specialOverlayIconConfig = specialOverlaySidebarConfig.iconConfig;
                }
                if ((i4 & 4) != 0) {
                    specialOverlayIconConfig2 = specialOverlaySidebarConfig.exitIconConfig;
                }
                return specialOverlaySidebarConfig.copy(str, specialOverlayIconConfig, specialOverlayIconConfig2);
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getExitIconConfig$annotations() {
            }

            public static /* synthetic */ void getIconConfig$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(SpecialOverlaySidebarConfig specialOverlaySidebarConfig, d dVar, f fVar) {
                dVar.p(fVar, 0, specialOverlaySidebarConfig.backgroundColor);
                SpecialOverlayIconConfig.a aVar = SpecialOverlayIconConfig.a.f10086a;
                dVar.f(fVar, 1, aVar, specialOverlaySidebarConfig.iconConfig);
                dVar.f(fVar, 2, aVar, specialOverlaySidebarConfig.exitIconConfig);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final SpecialOverlayIconConfig component2() {
                return this.iconConfig;
            }

            public final SpecialOverlayIconConfig component3() {
                return this.exitIconConfig;
            }

            public final SpecialOverlaySidebarConfig copy(String str, SpecialOverlayIconConfig specialOverlayIconConfig, SpecialOverlayIconConfig specialOverlayIconConfig2) {
                o.e(str, "backgroundColor");
                o.e(specialOverlayIconConfig, "iconConfig");
                o.e(specialOverlayIconConfig2, "exitIconConfig");
                return new SpecialOverlaySidebarConfig(str, specialOverlayIconConfig, specialOverlayIconConfig2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SpecialOverlaySidebarConfig)) {
                    return false;
                }
                SpecialOverlaySidebarConfig specialOverlaySidebarConfig = (SpecialOverlaySidebarConfig) obj;
                return o.a(this.backgroundColor, specialOverlaySidebarConfig.backgroundColor) && o.a(this.iconConfig, specialOverlaySidebarConfig.iconConfig) && o.a(this.exitIconConfig, specialOverlaySidebarConfig.exitIconConfig);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final SpecialOverlayIconConfig getExitIconConfig() {
                return this.exitIconConfig;
            }

            public final SpecialOverlayIconConfig getIconConfig() {
                return this.iconConfig;
            }

            public int hashCode() {
                return (((this.backgroundColor.hashCode() * 31) + this.iconConfig.hashCode()) * 31) + this.exitIconConfig.hashCode();
            }

            public String toString() {
                return "SpecialOverlaySidebarConfig(backgroundColor=" + this.backgroundColor + ", iconConfig=" + this.iconConfig + ", exitIconConfig=" + this.exitIconConfig + ')';
            }

            public SpecialOverlaySidebarConfig(String str, SpecialOverlayIconConfig specialOverlayIconConfig, SpecialOverlayIconConfig specialOverlayIconConfig2) {
                o.e(str, "backgroundColor");
                o.e(specialOverlayIconConfig, "iconConfig");
                o.e(specialOverlayIconConfig2, "exitIconConfig");
                this.backgroundColor = str;
                this.iconConfig = specialOverlayIconConfig;
                this.exitIconConfig = specialOverlayIconConfig2;
            }
        }

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10094a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10095b;

            static {
                a aVar = new a();
                f10094a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig", aVar, 6);
                s0Var.p("background-color", false);
                s0Var.p("fallback-background", false);
                s0Var.p("sectiontitle", false);
                s0Var.p("character", false);
                s0Var.p("sidebar", false);
                s0Var.p("emoji-sidebar", false);
                f10095b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10095b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                SpecialOverlaySectionConfig.a aVar = SpecialOverlaySectionConfig.a.f10090a;
                return new F2.b[]{g02, g02, aVar, aVar, SpecialOverlaySidebarConfig.a.f10092a, EmojiSidebarConfig.a.f10084a};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig b(I2.e r26) {
                /*
                    r25 = this;
                    r0 = r26
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f10095b
                    I2.c r0 = r0.d(r1)
                    boolean r2 = r0.p()
                    r3 = 5
                    r4 = 3
                    r5 = 4
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    r9 = 0
                    if (r2 == 0) goto L_0x0052
                    java.lang.String r2 = r0.z(r1, r8)
                    java.lang.String r7 = r0.z(r1, r7)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig.a.f10090a
                    java.lang.Object r6 = r0.E(r1, r6, r8, r9)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig r6 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig) r6
                    java.lang.Object r4 = r0.E(r1, r4, r8, r9)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig r4 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig) r4
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySidebarConfig.a.f10092a
                    java.lang.Object r5 = r0.E(r1, r5, r8, r9)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig r5 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySidebarConfig) r5
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.EmojiSidebarConfig.a.f10084a
                    java.lang.Object r3 = r0.E(r1, r3, r8, r9)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig r3 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.EmojiSidebarConfig) r3
                    r8 = 63
                    r18 = r2
                    r23 = r3
                    r21 = r4
                    r22 = r5
                    r20 = r6
                    r19 = r7
                    r17 = r8
                    goto L_0x00b9
                L_0x0052:
                    r15 = r7
                    r2 = r8
                    r10 = r9
                    r11 = r10
                    r12 = r11
                    r13 = r12
                    r14 = r13
                L_0x0059:
                    if (r15 == 0) goto L_0x00ab
                    int r8 = r0.e(r1)
                    switch(r8) {
                        case -1: goto L_0x00a8;
                        case 0: goto L_0x00a0;
                        case 1: goto L_0x0099;
                        case 2: goto L_0x008d;
                        case 3: goto L_0x0081;
                        case 4: goto L_0x0075;
                        case 5: goto L_0x0068;
                        default: goto L_0x0062;
                    }
                L_0x0062:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r8)
                    throw r0
                L_0x0068:
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.EmojiSidebarConfig.a.f10084a
                    java.lang.Object r8 = r0.E(r1, r3, r8, r14)
                    r14 = r8
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$EmojiSidebarConfig r14 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.EmojiSidebarConfig) r14
                    r2 = r2 | 32
                L_0x0073:
                    r8 = 0
                    goto L_0x0059
                L_0x0075:
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySidebarConfig.a.f10092a
                    java.lang.Object r8 = r0.E(r1, r5, r8, r13)
                    r13 = r8
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySidebarConfig r13 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySidebarConfig) r13
                    r2 = r2 | 16
                    goto L_0x0073
                L_0x0081:
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig.a.f10090a
                    java.lang.Object r8 = r0.E(r1, r4, r8, r12)
                    r12 = r8
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig r12 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig) r12
                    r2 = r2 | 8
                    goto L_0x0073
                L_0x008d:
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig.a.f10090a
                    java.lang.Object r8 = r0.E(r1, r6, r8, r11)
                    r11 = r8
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$SpecialOverlaySectionConfig r11 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.SpecialOverlaySectionConfig) r11
                    r2 = r2 | 4
                    goto L_0x0073
                L_0x0099:
                    java.lang.String r10 = r0.z(r1, r7)
                    r2 = r2 | 2
                    goto L_0x0073
                L_0x00a0:
                    r8 = 0
                    java.lang.String r9 = r0.z(r1, r8)
                    r2 = r2 | 1
                    goto L_0x0059
                L_0x00a8:
                    r8 = 0
                    r15 = r8
                    goto L_0x0059
                L_0x00ab:
                    r17 = r2
                    r18 = r9
                    r19 = r10
                    r20 = r11
                    r21 = r12
                    r22 = r13
                    r23 = r14
                L_0x00b9:
                    r0.c(r1)
                    ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig r0 = new ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig
                    r24 = 0
                    r16 = r0
                    r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.a.b(I2.e):ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, SpecialOverlaysConfig specialOverlaysConfig) {
                o.e(fVar, "encoder");
                o.e(specialOverlaysConfig, "value");
                f fVar2 = f10095b;
                d d4 = fVar.d(fVar2);
                SpecialOverlaysConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(specialOverlaysConfig, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10094a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ SpecialOverlaysConfig(int i4, String str, String str2, SpecialOverlaySectionConfig specialOverlaySectionConfig, SpecialOverlaySectionConfig specialOverlaySectionConfig2, SpecialOverlaySidebarConfig specialOverlaySidebarConfig, EmojiSidebarConfig emojiSidebarConfig2, C0 c02) {
            if (63 != (i4 & 63)) {
                C0317n0.a(i4, 63, a.f10094a.a());
            }
            this.backgroundColor = str;
            this.fallbackBackgroundColor = str2;
            this.titleConfig = specialOverlaySectionConfig;
            this.characterConfig = specialOverlaySectionConfig2;
            this.sidebarConfig = specialOverlaySidebarConfig;
            this.emojiSidebarConfig = emojiSidebarConfig2;
        }

        public static /* synthetic */ SpecialOverlaysConfig copy$default(SpecialOverlaysConfig specialOverlaysConfig, String str, String str2, SpecialOverlaySectionConfig specialOverlaySectionConfig, SpecialOverlaySectionConfig specialOverlaySectionConfig2, SpecialOverlaySidebarConfig specialOverlaySidebarConfig, EmojiSidebarConfig emojiSidebarConfig2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = specialOverlaysConfig.backgroundColor;
            }
            if ((i4 & 2) != 0) {
                str2 = specialOverlaysConfig.fallbackBackgroundColor;
            }
            String str3 = str2;
            if ((i4 & 4) != 0) {
                specialOverlaySectionConfig = specialOverlaysConfig.titleConfig;
            }
            SpecialOverlaySectionConfig specialOverlaySectionConfig3 = specialOverlaySectionConfig;
            if ((i4 & 8) != 0) {
                specialOverlaySectionConfig2 = specialOverlaysConfig.characterConfig;
            }
            SpecialOverlaySectionConfig specialOverlaySectionConfig4 = specialOverlaySectionConfig2;
            if ((i4 & 16) != 0) {
                specialOverlaySidebarConfig = specialOverlaysConfig.sidebarConfig;
            }
            SpecialOverlaySidebarConfig specialOverlaySidebarConfig2 = specialOverlaySidebarConfig;
            if ((i4 & 32) != 0) {
                emojiSidebarConfig2 = specialOverlaysConfig.emojiSidebarConfig;
            }
            return specialOverlaysConfig.copy(str, str3, specialOverlaySectionConfig3, specialOverlaySectionConfig4, specialOverlaySidebarConfig2, emojiSidebarConfig2);
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getCharacterConfig$annotations() {
        }

        public static /* synthetic */ void getEmojiSidebarConfig$annotations() {
        }

        public static /* synthetic */ void getFallbackBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getSidebarConfig$annotations() {
        }

        public static /* synthetic */ void getTitleConfig$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(SpecialOverlaysConfig specialOverlaysConfig, d dVar, f fVar) {
            dVar.p(fVar, 0, specialOverlaysConfig.backgroundColor);
            dVar.p(fVar, 1, specialOverlaysConfig.fallbackBackgroundColor);
            SpecialOverlaySectionConfig.a aVar = SpecialOverlaySectionConfig.a.f10090a;
            dVar.f(fVar, 2, aVar, specialOverlaysConfig.titleConfig);
            dVar.f(fVar, 3, aVar, specialOverlaysConfig.characterConfig);
            dVar.f(fVar, 4, SpecialOverlaySidebarConfig.a.f10092a, specialOverlaysConfig.sidebarConfig);
            dVar.f(fVar, 5, EmojiSidebarConfig.a.f10084a, specialOverlaysConfig.emojiSidebarConfig);
        }

        public final String component1() {
            return this.backgroundColor;
        }

        public final String component2() {
            return this.fallbackBackgroundColor;
        }

        public final SpecialOverlaySectionConfig component3() {
            return this.titleConfig;
        }

        public final SpecialOverlaySectionConfig component4() {
            return this.characterConfig;
        }

        public final SpecialOverlaySidebarConfig component5() {
            return this.sidebarConfig;
        }

        public final EmojiSidebarConfig component6() {
            return this.emojiSidebarConfig;
        }

        public final SpecialOverlaysConfig copy(String str, String str2, SpecialOverlaySectionConfig specialOverlaySectionConfig, SpecialOverlaySectionConfig specialOverlaySectionConfig2, SpecialOverlaySidebarConfig specialOverlaySidebarConfig, EmojiSidebarConfig emojiSidebarConfig2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fallbackBackgroundColor");
            o.e(specialOverlaySectionConfig, "titleConfig");
            o.e(specialOverlaySectionConfig2, "characterConfig");
            o.e(specialOverlaySidebarConfig, "sidebarConfig");
            o.e(emojiSidebarConfig2, "emojiSidebarConfig");
            return new SpecialOverlaysConfig(str, str2, specialOverlaySectionConfig, specialOverlaySectionConfig2, specialOverlaySidebarConfig, emojiSidebarConfig2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecialOverlaysConfig)) {
                return false;
            }
            SpecialOverlaysConfig specialOverlaysConfig = (SpecialOverlaysConfig) obj;
            return o.a(this.backgroundColor, specialOverlaysConfig.backgroundColor) && o.a(this.fallbackBackgroundColor, specialOverlaysConfig.fallbackBackgroundColor) && o.a(this.titleConfig, specialOverlaysConfig.titleConfig) && o.a(this.characterConfig, specialOverlaysConfig.characterConfig) && o.a(this.sidebarConfig, specialOverlaysConfig.sidebarConfig) && o.a(this.emojiSidebarConfig, specialOverlaysConfig.emojiSidebarConfig);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final SpecialOverlaySectionConfig getCharacterConfig() {
            return this.characterConfig;
        }

        public final EmojiSidebarConfig getEmojiSidebarConfig() {
            return this.emojiSidebarConfig;
        }

        public final String getFallbackBackgroundColor() {
            return this.fallbackBackgroundColor;
        }

        public final SpecialOverlaySidebarConfig getSidebarConfig() {
            return this.sidebarConfig;
        }

        public final SpecialOverlaySectionConfig getTitleConfig() {
            return this.titleConfig;
        }

        public int hashCode() {
            return (((((((((this.backgroundColor.hashCode() * 31) + this.fallbackBackgroundColor.hashCode()) * 31) + this.titleConfig.hashCode()) * 31) + this.characterConfig.hashCode()) * 31) + this.sidebarConfig.hashCode()) * 31) + this.emojiSidebarConfig.hashCode();
        }

        public String toString() {
            return "SpecialOverlaysConfig(backgroundColor=" + this.backgroundColor + ", fallbackBackgroundColor=" + this.fallbackBackgroundColor + ", titleConfig=" + this.titleConfig + ", characterConfig=" + this.characterConfig + ", sidebarConfig=" + this.sidebarConfig + ", emojiSidebarConfig=" + this.emojiSidebarConfig + ')';
        }

        public SpecialOverlaysConfig(String str, String str2, SpecialOverlaySectionConfig specialOverlaySectionConfig, SpecialOverlaySectionConfig specialOverlaySectionConfig2, SpecialOverlaySidebarConfig specialOverlaySidebarConfig, EmojiSidebarConfig emojiSidebarConfig2) {
            o.e(str, "backgroundColor");
            o.e(str2, "fallbackBackgroundColor");
            o.e(specialOverlaySectionConfig, "titleConfig");
            o.e(specialOverlaySectionConfig2, "characterConfig");
            o.e(specialOverlaySidebarConfig, "sidebarConfig");
            o.e(emojiSidebarConfig2, "emojiSidebarConfig");
            this.backgroundColor = str;
            this.fallbackBackgroundColor = str2;
            this.titleConfig = specialOverlaySectionConfig;
            this.characterConfig = specialOverlaySectionConfig2;
            this.sidebarConfig = specialOverlaySidebarConfig;
            this.emojiSidebarConfig = emojiSidebarConfig2;
        }
    }

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f10096a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10096a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f10097b;

        static {
            b bVar = new b();
            f10096a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.ThemeConfig", bVar, 15);
            s0Var.p("name", false);
            s0Var.p("isPremium", false);
            s0Var.p("ignoreBackgroundImgInLandscape", false);
            s0Var.p("background-img", false);
            s0Var.p("background-color", false);
            s0Var.p("box-shadow-color", false);
            s0Var.p("are-navigation-bar-buttons-dark", false);
            s0Var.p("typewise-icon", false);
            s0Var.p("alternativecharacterspopup", false);
            s0Var.p("keypopup", false);
            s0Var.p("smartbar", false);
            s0Var.p("gestureoverlay", false);
            s0Var.p("specialoverlays", false);
            s0Var.p("keys", false);
            s0Var.p("aiassistant", true);
            f10097b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f10097b;
        }

        public final F2.b[] c() {
            G0 g02 = G0.f622a;
            C0306i iVar = C0306i.f706a;
            return new F2.b[]{g02, iVar, G2.a.u(iVar), G2.a.u(g02), g02, g02, iVar, g02, AlternativeCharactersPopupConfig.a.f10056a, CharacterPreviewPopupConfig.a.f10058a, SmartBarConfig.a.f10082a, GestureOverlayConfig.a.f10060a, SpecialOverlaysConfig.a.f10094a, KeysConfig.a.f10080a, G2.a.u(AIAssistantConfig.a.f10046a)};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AlternativeCharactersPopupConfig} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$CharacterPreviewPopupConfig} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$GestureOverlayConfig} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AIAssistantConfig} */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00e9, code lost:
            r7 = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x012c, code lost:
            r6 = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0156, code lost:
            r6 = 11;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.wrio.keyboard.model.config.ThemeConfig b(I2.e r43) {
            /*
                r42 = this;
                r0 = r43
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f10097b
                I2.c r0 = r0.d(r1)
                boolean r2 = r0.p()
                r6 = 11
                r7 = 10
                r8 = 9
                r9 = 7
                r10 = 6
                r11 = 5
                r12 = 3
                r13 = 8
                r14 = 4
                r15 = 2
                r3 = 1
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x00b4
                java.lang.String r2 = r0.z(r1, r4)
                boolean r3 = r0.n(r1, r3)
                J2.i r4 = J2.C0306i.f706a
                java.lang.Object r4 = r0.m(r1, r15, r4, r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                J2.G0 r15 = J2.G0.f622a
                java.lang.Object r12 = r0.m(r1, r12, r15, r5)
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r14 = r0.z(r1, r14)
                java.lang.String r11 = r0.z(r1, r11)
                boolean r10 = r0.n(r1, r10)
                java.lang.String r9 = r0.z(r1, r9)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AlternativeCharactersPopupConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig.a.f10056a
                java.lang.Object r13 = r0.E(r1, r13, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AlternativeCharactersPopupConfig r13 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig) r13
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$CharacterPreviewPopupConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.CharacterPreviewPopupConfig.a.f10058a
                java.lang.Object r8 = r0.E(r1, r8, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$CharacterPreviewPopupConfig r8 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.CharacterPreviewPopupConfig) r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig.a.f10082a
                java.lang.Object r7 = r0.E(r1, r7, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig r7 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig) r7
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$GestureOverlayConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.GestureOverlayConfig.a.f10060a
                java.lang.Object r6 = r0.E(r1, r6, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$GestureOverlayConfig r6 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.GestureOverlayConfig) r6
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.a.f10094a
                r18 = r2
                r2 = 12
                java.lang.Object r2 = r0.E(r1, r2, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig r2 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig) r2
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.a.f10080a
                r17 = r2
                r2 = 13
                java.lang.Object r2 = r0.E(r1, r2, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig r2 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig) r2
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AIAssistantConfig$a r15 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantConfig.a.f10046a
                r16 = r2
                r2 = 14
                java.lang.Object r2 = r0.m(r1, r2, r15, r5)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AIAssistantConfig r2 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantConfig) r2
                r5 = 32767(0x7fff, float:4.5916E-41)
                r40 = r2
                r27 = r3
                r28 = r4
                r25 = r5
                r37 = r6
                r36 = r7
                r35 = r8
                r33 = r9
                r32 = r10
                r31 = r11
                r29 = r12
                r34 = r13
                r30 = r14
                r39 = r16
                r38 = r17
                r26 = r18
                goto L_0x01dd
            L_0x00b4:
                r23 = r3
                r2 = r4
                r22 = r2
                r3 = r5
                r9 = r3
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r18 = r15
                r19 = r18
                r20 = r19
                r21 = r20
                r4 = r21
                r5 = r22
            L_0x00cd:
                if (r23 == 0) goto L_0x01bd
                int r8 = r0.e(r1)
                switch(r8) {
                    case -1: goto L_0x01b7;
                    case 0: goto L_0x01ad;
                    case 1: goto L_0x01a3;
                    case 2: goto L_0x0195;
                    case 3: goto L_0x0186;
                    case 4: goto L_0x017b;
                    case 5: goto L_0x0170;
                    case 6: goto L_0x0165;
                    case 7: goto L_0x0159;
                    case 8: goto L_0x0145;
                    case 9: goto L_0x012f;
                    case 10: goto L_0x011c;
                    case 11: goto L_0x010e;
                    case 12: goto L_0x00fe;
                    case 13: goto L_0x00ee;
                    case 14: goto L_0x00dc;
                    default: goto L_0x00d6;
                }
            L_0x00d6:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r8)
                throw r0
            L_0x00dc:
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AIAssistantConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantConfig.a.f10046a
                r7 = 14
                java.lang.Object r8 = r0.m(r1, r7, r8, r13)
                r13 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AIAssistantConfig r13 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantConfig) r13
                r5 = r5 | 16384(0x4000, float:2.2959E-41)
            L_0x00e9:
                r7 = 10
            L_0x00eb:
                r8 = 9
                goto L_0x00cd
            L_0x00ee:
                r7 = 14
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig.a.f10080a
                r7 = 13
                java.lang.Object r8 = r0.E(r1, r7, r8, r9)
                r9 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$KeysConfig r9 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig) r9
                r5 = r5 | 8192(0x2000, float:1.14794E-41)
                goto L_0x00e9
            L_0x00fe:
                r7 = 13
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig.a.f10094a
                r7 = 12
                java.lang.Object r8 = r0.E(r1, r7, r8, r10)
                r10 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SpecialOverlaysConfig r10 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig) r10
                r5 = r5 | 4096(0x1000, float:5.74E-42)
                goto L_0x00e9
            L_0x010e:
                r7 = 12
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$GestureOverlayConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.GestureOverlayConfig.a.f10060a
                java.lang.Object r8 = r0.E(r1, r6, r8, r11)
                r11 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$GestureOverlayConfig r11 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.GestureOverlayConfig) r11
                r5 = r5 | 2048(0x800, float:2.87E-42)
                goto L_0x00e9
            L_0x011c:
                r7 = 12
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig.a.f10082a
                r6 = 10
                java.lang.Object r8 = r0.E(r1, r6, r8, r14)
                r14 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$SmartBarConfig r14 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig) r14
                r5 = r5 | 1024(0x400, float:1.435E-42)
                r7 = r6
            L_0x012c:
                r6 = 11
                goto L_0x00eb
            L_0x012f:
                r6 = r7
                r7 = 12
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$CharacterPreviewPopupConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.CharacterPreviewPopupConfig.a.f10058a
                r6 = 9
                java.lang.Object r8 = r0.E(r1, r6, r8, r12)
                r12 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$CharacterPreviewPopupConfig r12 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.CharacterPreviewPopupConfig) r12
                r5 = r5 | 512(0x200, float:7.175E-43)
                r8 = r6
                r6 = 11
                r7 = 10
                goto L_0x00cd
            L_0x0145:
                r6 = 9
                r7 = 12
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AlternativeCharactersPopupConfig$a r8 = ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig.a.f10056a
                r6 = 8
                java.lang.Object r8 = r0.E(r1, r6, r8, r15)
                r15 = r8
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig$AlternativeCharactersPopupConfig r15 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig) r15
                r5 = r5 | 256(0x100, float:3.59E-43)
            L_0x0156:
                r6 = 11
                goto L_0x00e9
            L_0x0159:
                r6 = 8
                r7 = 12
                r8 = 7
                java.lang.String r21 = r0.z(r1, r8)
                r5 = r5 | 128(0x80, float:1.794E-43)
                goto L_0x0156
            L_0x0165:
                r6 = 6
                r7 = 12
                r8 = 7
                boolean r22 = r0.n(r1, r6)
                r5 = r5 | 64
                goto L_0x0156
            L_0x0170:
                r6 = 5
                r7 = 12
                r8 = 7
                java.lang.String r20 = r0.z(r1, r6)
                r5 = r5 | 32
                goto L_0x0156
            L_0x017b:
                r6 = 4
                r7 = 12
                r8 = 7
                java.lang.String r19 = r0.z(r1, r6)
                r5 = r5 | 16
                goto L_0x0156
            L_0x0186:
                r7 = 12
                r8 = 7
                J2.G0 r6 = J2.G0.f622a
                r7 = 3
                java.lang.Object r3 = r0.m(r1, r7, r6, r3)
                java.lang.String r3 = (java.lang.String) r3
                r5 = r5 | 8
                goto L_0x0156
            L_0x0195:
                r7 = 3
                r8 = 7
                J2.i r6 = J2.C0306i.f706a
                r7 = 2
                java.lang.Object r4 = r0.m(r1, r7, r6, r4)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                r5 = r5 | 4
                goto L_0x0156
            L_0x01a3:
                r6 = 1
                r7 = 2
                r8 = 7
                boolean r2 = r0.n(r1, r6)
                r5 = r5 | 2
                goto L_0x0156
            L_0x01ad:
                r6 = 0
                r7 = 2
                r8 = 7
                java.lang.String r18 = r0.z(r1, r6)
                r5 = r5 | 1
                goto L_0x0156
            L_0x01b7:
                r6 = 0
                r8 = 7
                r23 = r6
                goto L_0x012c
            L_0x01bd:
                r27 = r2
                r29 = r3
                r28 = r4
                r25 = r5
                r39 = r9
                r38 = r10
                r37 = r11
                r35 = r12
                r40 = r13
                r36 = r14
                r34 = r15
                r26 = r18
                r30 = r19
                r31 = r20
                r33 = r21
                r32 = r22
            L_0x01dd:
                r0.c(r1)
                ch.icoaching.wrio.keyboard.model.config.ThemeConfig r0 = new ch.icoaching.wrio.keyboard.model.config.ThemeConfig
                r24 = r0
                r41 = 0
                r24.<init>((int) r25, (java.lang.String) r26, (boolean) r27, (java.lang.Boolean) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (boolean) r32, (java.lang.String) r33, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AlternativeCharactersPopupConfig) r34, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.CharacterPreviewPopupConfig) r35, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SmartBarConfig) r36, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.GestureOverlayConfig) r37, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.SpecialOverlaysConfig) r38, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.KeysConfig) r39, (ch.icoaching.wrio.keyboard.model.config.ThemeConfig.AIAssistantConfig) r40, (J2.C0) r41)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.model.config.ThemeConfig.b.b(I2.e):ch.icoaching.wrio.keyboard.model.config.ThemeConfig");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, ThemeConfig themeConfig) {
            o.e(fVar, "encoder");
            o.e(themeConfig, "value");
            f fVar2 = f10097b;
            d d4 = fVar.d(fVar2);
            ThemeConfig.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(themeConfig, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ ThemeConfig(int i4, String str, boolean z3, Boolean bool, String str2, String str3, String str4, boolean z4, String str5, AlternativeCharactersPopupConfig alternativeCharactersPopupConfig2, CharacterPreviewPopupConfig characterPreviewPopupConfig, SmartBarConfig smartBarConfig2, GestureOverlayConfig gestureOverlayConfig2, SpecialOverlaysConfig specialOverlaysConfig2, KeysConfig keysConfig2, AIAssistantConfig aIAssistantConfig, C0 c02) {
        AIAssistantConfig aIAssistantConfig2;
        int i5 = i4;
        if (16383 != (i5 & 16383)) {
            C0317n0.a(i4, 16383, b.f10096a.a());
        }
        this.themeName = str;
        this.isPremium = z3;
        this.ignoreBackgroundImageInLandscape = bool;
        this.backgroundImage = str2;
        this.backgroundColor = str3;
        this.boxShadowColor = str4;
        this.areNavigationBarButtonsDark = z4;
        this.iconName = str5;
        this.alternativeCharactersPopupConfig = alternativeCharactersPopupConfig2;
        this.characterPreviewPopUp = characterPreviewPopupConfig;
        this.smartBarConfig = smartBarConfig2;
        this.gestureOverlayConfig = gestureOverlayConfig2;
        this.specialOverlaysConfig = specialOverlaysConfig2;
        this.keysConfig = keysConfig2;
        if ((i5 & 16384) == 0) {
            aIAssistantConfig2 = null;
        } else {
            aIAssistantConfig2 = aIAssistantConfig;
        }
        this.aiAssistantConfig = aIAssistantConfig2;
    }

    public static /* synthetic */ ThemeConfig copy$default(ThemeConfig themeConfig, String str, boolean z3, Boolean bool, String str2, String str3, String str4, boolean z4, String str5, AlternativeCharactersPopupConfig alternativeCharactersPopupConfig2, CharacterPreviewPopupConfig characterPreviewPopupConfig, SmartBarConfig smartBarConfig2, GestureOverlayConfig gestureOverlayConfig2, SpecialOverlaysConfig specialOverlaysConfig2, KeysConfig keysConfig2, AIAssistantConfig aIAssistantConfig, int i4, Object obj) {
        ThemeConfig themeConfig2 = themeConfig;
        int i5 = i4;
        return themeConfig.copy((i5 & 1) != 0 ? themeConfig2.themeName : str, (i5 & 2) != 0 ? themeConfig2.isPremium : z3, (i5 & 4) != 0 ? themeConfig2.ignoreBackgroundImageInLandscape : bool, (i5 & 8) != 0 ? themeConfig2.backgroundImage : str2, (i5 & 16) != 0 ? themeConfig2.backgroundColor : str3, (i5 & 32) != 0 ? themeConfig2.boxShadowColor : str4, (i5 & 64) != 0 ? themeConfig2.areNavigationBarButtonsDark : z4, (i5 & Uuid.SIZE_BITS) != 0 ? themeConfig2.iconName : str5, (i5 & 256) != 0 ? themeConfig2.alternativeCharactersPopupConfig : alternativeCharactersPopupConfig2, (i5 & 512) != 0 ? themeConfig2.characterPreviewPopUp : characterPreviewPopupConfig, (i5 & 1024) != 0 ? themeConfig2.smartBarConfig : smartBarConfig2, (i5 & 2048) != 0 ? themeConfig2.gestureOverlayConfig : gestureOverlayConfig2, (i5 & 4096) != 0 ? themeConfig2.specialOverlaysConfig : specialOverlaysConfig2, (i5 & 8192) != 0 ? themeConfig2.keysConfig : keysConfig2, (i5 & 16384) != 0 ? themeConfig2.aiAssistantConfig : aIAssistantConfig);
    }

    public static /* synthetic */ void getAiAssistantConfig$annotations() {
    }

    public static /* synthetic */ void getAlternativeCharactersPopupConfig$annotations() {
    }

    public static /* synthetic */ void getAreNavigationBarButtonsDark$annotations() {
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    public static /* synthetic */ void getBoxShadowColor$annotations() {
    }

    public static /* synthetic */ void getCharacterPreviewPopUp$annotations() {
    }

    public static /* synthetic */ void getGestureOverlayConfig$annotations() {
    }

    public static /* synthetic */ void getIconName$annotations() {
    }

    public static /* synthetic */ void getIgnoreBackgroundImageInLandscape$annotations() {
    }

    public static /* synthetic */ void getKeysConfig$annotations() {
    }

    public static /* synthetic */ void getSmartBarConfig$annotations() {
    }

    public static /* synthetic */ void getSpecialOverlaysConfig$annotations() {
    }

    public static /* synthetic */ void getThemeName$annotations() {
    }

    public static /* synthetic */ void isPremium$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(ThemeConfig themeConfig, d dVar, f fVar) {
        dVar.p(fVar, 0, themeConfig.themeName);
        dVar.j(fVar, 1, themeConfig.isPremium);
        dVar.o(fVar, 2, C0306i.f706a, themeConfig.ignoreBackgroundImageInLandscape);
        dVar.o(fVar, 3, G0.f622a, themeConfig.backgroundImage);
        dVar.p(fVar, 4, themeConfig.backgroundColor);
        dVar.p(fVar, 5, themeConfig.boxShadowColor);
        dVar.j(fVar, 6, themeConfig.areNavigationBarButtonsDark);
        dVar.p(fVar, 7, themeConfig.iconName);
        dVar.f(fVar, 8, AlternativeCharactersPopupConfig.a.f10056a, themeConfig.alternativeCharactersPopupConfig);
        dVar.f(fVar, 9, CharacterPreviewPopupConfig.a.f10058a, themeConfig.characterPreviewPopUp);
        dVar.f(fVar, 10, SmartBarConfig.a.f10082a, themeConfig.smartBarConfig);
        dVar.f(fVar, 11, GestureOverlayConfig.a.f10060a, themeConfig.gestureOverlayConfig);
        dVar.f(fVar, 12, SpecialOverlaysConfig.a.f10094a, themeConfig.specialOverlaysConfig);
        dVar.f(fVar, 13, KeysConfig.a.f10080a, themeConfig.keysConfig);
        if (dVar.n(fVar, 14) || themeConfig.aiAssistantConfig != null) {
            dVar.o(fVar, 14, AIAssistantConfig.a.f10046a, themeConfig.aiAssistantConfig);
        }
    }

    public final String component1() {
        return this.themeName;
    }

    public final CharacterPreviewPopupConfig component10() {
        return this.characterPreviewPopUp;
    }

    public final SmartBarConfig component11() {
        return this.smartBarConfig;
    }

    public final GestureOverlayConfig component12() {
        return this.gestureOverlayConfig;
    }

    public final SpecialOverlaysConfig component13() {
        return this.specialOverlaysConfig;
    }

    public final KeysConfig component14() {
        return this.keysConfig;
    }

    public final AIAssistantConfig component15() {
        return this.aiAssistantConfig;
    }

    public final boolean component2() {
        return this.isPremium;
    }

    public final Boolean component3() {
        return this.ignoreBackgroundImageInLandscape;
    }

    public final String component4() {
        return this.backgroundImage;
    }

    public final String component5() {
        return this.backgroundColor;
    }

    public final String component6() {
        return this.boxShadowColor;
    }

    public final boolean component7() {
        return this.areNavigationBarButtonsDark;
    }

    public final String component8() {
        return this.iconName;
    }

    public final AlternativeCharactersPopupConfig component9() {
        return this.alternativeCharactersPopupConfig;
    }

    public final ThemeConfig copy(String str, boolean z3, Boolean bool, String str2, String str3, String str4, boolean z4, String str5, AlternativeCharactersPopupConfig alternativeCharactersPopupConfig2, CharacterPreviewPopupConfig characterPreviewPopupConfig, SmartBarConfig smartBarConfig2, GestureOverlayConfig gestureOverlayConfig2, SpecialOverlaysConfig specialOverlaysConfig2, KeysConfig keysConfig2, AIAssistantConfig aIAssistantConfig) {
        String str6 = str;
        o.e(str6, "themeName");
        String str7 = str3;
        o.e(str7, "backgroundColor");
        String str8 = str4;
        o.e(str8, "boxShadowColor");
        String str9 = str5;
        o.e(str9, "iconName");
        AlternativeCharactersPopupConfig alternativeCharactersPopupConfig3 = alternativeCharactersPopupConfig2;
        o.e(alternativeCharactersPopupConfig3, "alternativeCharactersPopupConfig");
        CharacterPreviewPopupConfig characterPreviewPopupConfig2 = characterPreviewPopupConfig;
        o.e(characterPreviewPopupConfig2, "characterPreviewPopUp");
        SmartBarConfig smartBarConfig3 = smartBarConfig2;
        o.e(smartBarConfig3, "smartBarConfig");
        GestureOverlayConfig gestureOverlayConfig3 = gestureOverlayConfig2;
        o.e(gestureOverlayConfig3, "gestureOverlayConfig");
        SpecialOverlaysConfig specialOverlaysConfig3 = specialOverlaysConfig2;
        o.e(specialOverlaysConfig3, "specialOverlaysConfig");
        KeysConfig keysConfig3 = keysConfig2;
        o.e(keysConfig3, "keysConfig");
        return new ThemeConfig(str6, z3, bool, str2, str7, str8, z4, str9, alternativeCharactersPopupConfig3, characterPreviewPopupConfig2, smartBarConfig3, gestureOverlayConfig3, specialOverlaysConfig3, keysConfig3, aIAssistantConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeConfig)) {
            return false;
        }
        ThemeConfig themeConfig = (ThemeConfig) obj;
        return o.a(this.themeName, themeConfig.themeName) && this.isPremium == themeConfig.isPremium && o.a(this.ignoreBackgroundImageInLandscape, themeConfig.ignoreBackgroundImageInLandscape) && o.a(this.backgroundImage, themeConfig.backgroundImage) && o.a(this.backgroundColor, themeConfig.backgroundColor) && o.a(this.boxShadowColor, themeConfig.boxShadowColor) && this.areNavigationBarButtonsDark == themeConfig.areNavigationBarButtonsDark && o.a(this.iconName, themeConfig.iconName) && o.a(this.alternativeCharactersPopupConfig, themeConfig.alternativeCharactersPopupConfig) && o.a(this.characterPreviewPopUp, themeConfig.characterPreviewPopUp) && o.a(this.smartBarConfig, themeConfig.smartBarConfig) && o.a(this.gestureOverlayConfig, themeConfig.gestureOverlayConfig) && o.a(this.specialOverlaysConfig, themeConfig.specialOverlaysConfig) && o.a(this.keysConfig, themeConfig.keysConfig) && o.a(this.aiAssistantConfig, themeConfig.aiAssistantConfig);
    }

    public final AIAssistantConfig getAiAssistantConfig() {
        return this.aiAssistantConfig;
    }

    public final AlternativeCharactersPopupConfig getAlternativeCharactersPopupConfig() {
        return this.alternativeCharactersPopupConfig;
    }

    public final boolean getAreNavigationBarButtonsDark() {
        return this.areNavigationBarButtonsDark;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBoxShadowColor() {
        return this.boxShadowColor;
    }

    public final CharacterPreviewPopupConfig getCharacterPreviewPopUp() {
        return this.characterPreviewPopUp;
    }

    public final GestureOverlayConfig getGestureOverlayConfig() {
        return this.gestureOverlayConfig;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final Boolean getIgnoreBackgroundImageInLandscape() {
        return this.ignoreBackgroundImageInLandscape;
    }

    public final KeysConfig getKeysConfig() {
        return this.keysConfig;
    }

    public final SmartBarConfig getSmartBarConfig() {
        return this.smartBarConfig;
    }

    public final SpecialOverlaysConfig getSpecialOverlaysConfig() {
        return this.specialOverlaysConfig;
    }

    public final String getThemeName() {
        return this.themeName;
    }

    public int hashCode() {
        int hashCode = ((this.themeName.hashCode() * 31) + androidx.work.c.a(this.isPremium)) * 31;
        Boolean bool = this.ignoreBackgroundImageInLandscape;
        int i4 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundImage;
        int hashCode3 = (((((((((((((((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.backgroundColor.hashCode()) * 31) + this.boxShadowColor.hashCode()) * 31) + androidx.work.c.a(this.areNavigationBarButtonsDark)) * 31) + this.iconName.hashCode()) * 31) + this.alternativeCharactersPopupConfig.hashCode()) * 31) + this.characterPreviewPopUp.hashCode()) * 31) + this.smartBarConfig.hashCode()) * 31) + this.gestureOverlayConfig.hashCode()) * 31) + this.specialOverlaysConfig.hashCode()) * 31) + this.keysConfig.hashCode()) * 31;
        AIAssistantConfig aIAssistantConfig = this.aiAssistantConfig;
        if (aIAssistantConfig != null) {
            i4 = aIAssistantConfig.hashCode();
        }
        return hashCode3 + i4;
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public String toString() {
        return "ThemeConfig(themeName=" + this.themeName + ", isPremium=" + this.isPremium + ", ignoreBackgroundImageInLandscape=" + this.ignoreBackgroundImageInLandscape + ", backgroundImage=" + this.backgroundImage + ", backgroundColor=" + this.backgroundColor + ", boxShadowColor=" + this.boxShadowColor + ", areNavigationBarButtonsDark=" + this.areNavigationBarButtonsDark + ", iconName=" + this.iconName + ", alternativeCharactersPopupConfig=" + this.alternativeCharactersPopupConfig + ", characterPreviewPopUp=" + this.characterPreviewPopUp + ", smartBarConfig=" + this.smartBarConfig + ", gestureOverlayConfig=" + this.gestureOverlayConfig + ", specialOverlaysConfig=" + this.specialOverlaysConfig + ", keysConfig=" + this.keysConfig + ", aiAssistantConfig=" + this.aiAssistantConfig + ')';
    }

    public ThemeConfig(String str, boolean z3, Boolean bool, String str2, String str3, String str4, boolean z4, String str5, AlternativeCharactersPopupConfig alternativeCharactersPopupConfig2, CharacterPreviewPopupConfig characterPreviewPopupConfig, SmartBarConfig smartBarConfig2, GestureOverlayConfig gestureOverlayConfig2, SpecialOverlaysConfig specialOverlaysConfig2, KeysConfig keysConfig2, AIAssistantConfig aIAssistantConfig) {
        String str6 = str3;
        String str7 = str4;
        String str8 = str5;
        AlternativeCharactersPopupConfig alternativeCharactersPopupConfig3 = alternativeCharactersPopupConfig2;
        CharacterPreviewPopupConfig characterPreviewPopupConfig2 = characterPreviewPopupConfig;
        SmartBarConfig smartBarConfig3 = smartBarConfig2;
        GestureOverlayConfig gestureOverlayConfig3 = gestureOverlayConfig2;
        SpecialOverlaysConfig specialOverlaysConfig3 = specialOverlaysConfig2;
        KeysConfig keysConfig3 = keysConfig2;
        o.e(str, "themeName");
        o.e(str6, "backgroundColor");
        o.e(str7, "boxShadowColor");
        o.e(str8, "iconName");
        o.e(alternativeCharactersPopupConfig3, "alternativeCharactersPopupConfig");
        o.e(characterPreviewPopupConfig2, "characterPreviewPopUp");
        o.e(smartBarConfig3, "smartBarConfig");
        o.e(gestureOverlayConfig3, "gestureOverlayConfig");
        o.e(specialOverlaysConfig3, "specialOverlaysConfig");
        o.e(keysConfig3, "keysConfig");
        this.themeName = str;
        this.isPremium = z3;
        this.ignoreBackgroundImageInLandscape = bool;
        this.backgroundImage = str2;
        this.backgroundColor = str6;
        this.boxShadowColor = str7;
        this.areNavigationBarButtonsDark = z4;
        this.iconName = str8;
        this.alternativeCharactersPopupConfig = alternativeCharactersPopupConfig3;
        this.characterPreviewPopUp = characterPreviewPopupConfig2;
        this.smartBarConfig = smartBarConfig3;
        this.gestureOverlayConfig = gestureOverlayConfig3;
        this.specialOverlaysConfig = specialOverlaysConfig3;
        this.keysConfig = keysConfig3;
        this.aiAssistantConfig = aIAssistantConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThemeConfig(String str, boolean z3, Boolean bool, String str2, String str3, String str4, boolean z4, String str5, AlternativeCharactersPopupConfig alternativeCharactersPopupConfig2, CharacterPreviewPopupConfig characterPreviewPopupConfig, SmartBarConfig smartBarConfig2, GestureOverlayConfig gestureOverlayConfig2, SpecialOverlaysConfig specialOverlaysConfig2, KeysConfig keysConfig2, AIAssistantConfig aIAssistantConfig, int i4, i iVar) {
        this(str, z3, bool, str2, str3, str4, z4, str5, alternativeCharactersPopupConfig2, characterPreviewPopupConfig, smartBarConfig2, gestureOverlayConfig2, specialOverlaysConfig2, keysConfig2, (i4 & 16384) != 0 ? null : aIAssistantConfig);
    }
}
