package ch.icoaching.wrio.keyboard.view;

import K2.C0341a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.h;
import ch.icoaching.wrio.C0501a;
import ch.icoaching.wrio.C0548l;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.ThemeConfig;
import ch.icoaching.wrio.keyboard.view.C0531f;
import ch.icoaching.wrio.logging.Log;
import com.capacitorjs.plugins.localnotifications.LocalNotificationManager;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.o;

public abstract class D {
    public static final ColorStateList a(int i4, int i5) {
        return new ColorStateList(new int[][]{new int[]{C0531f.a.DEFAULT.b()}, new int[]{C0531f.a.ACTIVE.b()}}, new int[]{i4, i5});
    }

    public static final ColorStateList b(int i4, int i5) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}}, new int[]{i4, i5});
    }

    public static final ThemeConfig c(AssetManager assetManager, String str, String str2, C0341a aVar) {
        o.e(assetManager, "<this>");
        o.e(str, "name");
        o.e(str2, LocalNotificationManager.DEFAULT_NOTIFICATION_CHANNEL_ID);
        o.e(aVar, "json");
        return d(assetManager, "keyboard_themes/" + str + ".json", "keyboard_themes/" + str2 + ".json", aVar);
    }

    private static final ThemeConfig d(AssetManager assetManager, String str, String str2, C0341a aVar) {
        String str3;
        try {
            str3 = C0501a.a(assetManager, str);
        } catch (FileNotFoundException unused) {
            Log log = Log.f10572a;
            Log.f(log, "ThemeUtils", "loadKeyboardThemeFromPath() :: Couldn't load theme from path: " + str + ". Defaulting to: " + str2, (Throwable) null, 4, (Object) null);
            str3 = C0501a.a(assetManager, str2);
        }
        aVar.a();
        return (ThemeConfig) aVar.c(ThemeConfig.Companion.serializer(), str3);
    }

    private static final ThemeModel.AIAssistantTheme e(ThemeConfig.AIAssistantConfig aIAssistantConfig) {
        if (aIAssistantConfig != null) {
            return new ThemeModel.AIAssistantTheme(new ThemeModel.AIAssistantTheme.AIAssistantBarTheme(C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getBackgroundColor()), C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getFontColor()), C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getErrorFontColor()), C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getAiPromptConfig().getDefaultState().getBackgroundColor()), C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getAiPromptConfig().getActiveState().getBackgroundColor()), C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getAiPromptConfig().getDefaultState().getFontColor()), C0548l.b(aIAssistantConfig.getAiAssistantBarConfig().getAiPromptConfig().getActiveState().getFontColor())), new ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme(C0548l.b(aIAssistantConfig.getAiAssistantDropDownConfig().getBackgroundColor()), C0548l.b(aIAssistantConfig.getAiAssistantDropDownConfig().getFontColor()), C0548l.b(aIAssistantConfig.getAiAssistantDropDownConfig().getOptionBackgroundColor()), C0548l.b(aIAssistantConfig.getAiAssistantDropDownConfig().getOptionFontColor()), C0548l.b(aIAssistantConfig.getAiAssistantDropDownConfig().getOptionSelectedBackgroundColor()), C0548l.b(aIAssistantConfig.getAiAssistantDropDownConfig().getOptionSelectedFontColor())));
        }
        return null;
    }

    private static final ThemeModel.c f(ThemeConfig.KeysConfig keysConfig) {
        return new ThemeModel.c(h(keysConfig.getCharacter()), h(keysConfig.getSpace()), new ThemeModel.c.a(h(keysConfig.getCaps().getHexagon()), h(keysConfig.getCaps().getRectangle())), new ThemeModel.c.a(h(keysConfig.getDelete().getHexagon()), h(keysConfig.getDelete().getRectangle())), g(keysConfig.getReturnKeyConfig()), j(keysConfig.getSplit()), j(keysConfig.getSplitEmojiNumber()), h(keysConfig.getMoreCharacters()), h(keysConfig.getEmoji()), h(keysConfig.getMoreMaths()), h(keysConfig.getMoreNumbers()), h(keysConfig.getMainLayout()));
    }

    private static final ThemeModel.c.b g(ThemeConfig.KeysConfig.IconKeyConfig iconKeyConfig) {
        ColorStateList colorStateList;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (iconKeyConfig.getStateDefault().getBackgroundColor() == null && iconKeyConfig.getStateActive().getBackgroundColor() == null) {
            colorStateList = null;
        } else {
            String backgroundColor = iconKeyConfig.getStateDefault().getBackgroundColor();
            if (backgroundColor != null) {
                i5 = C0548l.b(backgroundColor);
            } else {
                i5 = 0;
            }
            String backgroundColor2 = iconKeyConfig.getStateActive().getBackgroundColor();
            if (backgroundColor2 != null) {
                i6 = C0548l.b(backgroundColor2);
            } else {
                i6 = 0;
            }
            colorStateList = a(i5, i6);
        }
        String fontColor = iconKeyConfig.getStateDefault().getFontColor();
        if (fontColor != null) {
            i4 = C0548l.b(fontColor);
        } else {
            i4 = 0;
        }
        String fontColor2 = iconKeyConfig.getStateActive().getFontColor();
        if (fontColor2 != null) {
            i7 = C0548l.b(fontColor2);
        }
        return new ThemeModel.c.b(colorStateList, a(i4, i7));
    }

    private static final ThemeModel.c.b h(ThemeConfig.KeysConfig.RegularKeyConfig regularKeyConfig) {
        ColorStateList colorStateList;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (regularKeyConfig.getStateDefault().getBackgroundColor() == null && regularKeyConfig.getStateActive().getBackgroundColor() == null) {
            colorStateList = null;
        } else {
            String backgroundColor = regularKeyConfig.getStateDefault().getBackgroundColor();
            if (backgroundColor != null) {
                i5 = C0548l.b(backgroundColor);
            } else {
                i5 = 0;
            }
            String backgroundColor2 = regularKeyConfig.getStateActive().getBackgroundColor();
            if (backgroundColor2 != null) {
                i6 = C0548l.b(backgroundColor2);
            } else {
                i6 = 0;
            }
            colorStateList = a(i5, i6);
        }
        String fontColor = regularKeyConfig.getStateDefault().getFontColor();
        if (fontColor != null) {
            i4 = C0548l.b(fontColor);
        } else {
            i4 = 0;
        }
        String fontColor2 = regularKeyConfig.getStateActive().getFontColor();
        if (fontColor2 != null) {
            i7 = C0548l.b(fontColor2);
        }
        return new ThemeModel.c.b(colorStateList, a(i4, i7));
    }

    private static final ThemeModel.SmartBarTheme i(ThemeConfig.SmartBarConfig smartBarConfig) {
        int i4;
        int i5;
        int i6;
        int i7;
        int b4 = C0548l.b(smartBarConfig.getFontColor());
        int b5 = C0548l.b(smartBarConfig.getBackgroundColor());
        int b6 = C0548l.b(smartBarConfig.getDividerColor());
        int b7 = C0548l.b(smartBarConfig.getArrowCloseIconFontColor());
        int b8 = C0548l.b(smartBarConfig.getSelectedBackgroundColor());
        int b9 = C0548l.b(smartBarConfig.getSelectedFontColor());
        int b10 = C0548l.b(smartBarConfig.getUnselectedBackgroundColor());
        int b11 = C0548l.b(smartBarConfig.getUnselectedFontColor());
        int b12 = C0548l.b(smartBarConfig.getUndoBackgroundColor());
        int b13 = C0548l.b(smartBarConfig.getUndoFontColor());
        int b14 = C0548l.b(smartBarConfig.getUndoIconColor());
        int b15 = C0548l.b(smartBarConfig.getDeleteBackgroundColor());
        int b16 = C0548l.b(smartBarConfig.getDeleteFontColor());
        String spinnerColor = smartBarConfig.getSpinnerColor();
        if (spinnerColor != null) {
            i4 = C0548l.b(spinnerColor);
        } else {
            i4 = b4;
        }
        String proFeatureColor = smartBarConfig.getProFeatureColor();
        if (proFeatureColor != null) {
            i5 = C0548l.b(proFeatureColor);
        } else {
            i5 = b4;
        }
        String passwordManagerColor = smartBarConfig.getPasswordManagerColor();
        if (passwordManagerColor != null) {
            i6 = C0548l.b(passwordManagerColor);
        } else {
            i6 = 0;
        }
        String passwordManagerFontColor = smartBarConfig.getPasswordManagerFontColor();
        if (passwordManagerFontColor != null) {
            i7 = C0548l.b(passwordManagerFontColor);
        } else {
            i7 = 0;
        }
        return new ThemeModel.SmartBarTheme(b5, b4, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, i4, i5, i6, i7);
    }

    private static final ThemeModel.c.C0153c j(ThemeConfig.KeysConfig.SplitKeyConfig splitKeyConfig) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ThemeConfig.KeysConfig.SplitKeyConfig.TertiaryCharacterConfig.TertiaryCharacterStateConfig stateActive;
        String fontColor;
        ThemeConfig.KeysConfig.SplitKeyConfig.TertiaryCharacterConfig.TertiaryCharacterStateConfig stateDefault;
        String fontColor2;
        ColorStateList a4 = a(C0548l.b(splitKeyConfig.getTopPart().getStateDefault().getBackgroundColor()), C0548l.b(splitKeyConfig.getTopPart().getStateActive().getBackgroundColor()));
        String fontColor3 = splitKeyConfig.getTopPart().getStateDefault().getFontColor();
        int i9 = 0;
        if (fontColor3 != null) {
            i4 = C0548l.b(fontColor3);
        } else {
            i4 = 0;
        }
        String fontColor4 = splitKeyConfig.getTopPart().getStateActive().getFontColor();
        if (fontColor4 != null) {
            i5 = C0548l.b(fontColor4);
        } else {
            i5 = 0;
        }
        ColorStateList a5 = a(i4, i5);
        ColorStateList a6 = a(C0548l.b(splitKeyConfig.getBottomPart().getStateDefault().getBackgroundColor()), C0548l.b(splitKeyConfig.getBottomPart().getStateActive().getBackgroundColor()));
        String fontColor5 = splitKeyConfig.getBottomPart().getStateDefault().getFontColor();
        if (fontColor5 != null) {
            i6 = C0548l.b(fontColor5);
        } else {
            i6 = 0;
        }
        String fontColor6 = splitKeyConfig.getBottomPart().getStateActive().getFontColor();
        if (fontColor6 != null) {
            i7 = C0548l.b(fontColor6);
        } else {
            i7 = 0;
        }
        ColorStateList a7 = a(i6, i7);
        ThemeConfig.KeysConfig.SplitKeyConfig.TertiaryCharacterConfig tertiaryKey = splitKeyConfig.getTertiaryKey();
        if (tertiaryKey == null || (stateDefault = tertiaryKey.getStateDefault()) == null || (fontColor2 = stateDefault.getFontColor()) == null) {
            i8 = 0;
        } else {
            i8 = C0548l.b(fontColor2);
        }
        ThemeConfig.KeysConfig.SplitKeyConfig.TertiaryCharacterConfig tertiaryKey2 = splitKeyConfig.getTertiaryKey();
        if (!(tertiaryKey2 == null || (stateActive = tertiaryKey2.getStateActive()) == null || (fontColor = stateActive.getFontColor()) == null)) {
            i9 = C0548l.b(fontColor);
        }
        return new ThemeModel.c.C0153c(a4, a6, a5, a7, a(i8, i9));
    }

    public static final ThemeModel k(ThemeConfig themeConfig, Context context) {
        Drawable colorDrawable;
        Drawable e4;
        Integer num;
        boolean z3;
        int i4;
        o.e(themeConfig, "<this>");
        o.e(context, "context");
        String backgroundImage = themeConfig.getBackgroundImage();
        if (backgroundImage == null || backgroundImage.length() == 0) {
            colorDrawable = new ColorDrawable(C0548l.b(themeConfig.getBackgroundColor()));
        } else {
            int identifier = context.getResources().getIdentifier(kotlin.text.o.C(themeConfig.getBackgroundImage(), "-", "_", false, 4, (Object) null), "drawable", context.getPackageName());
            if (identifier == 0) {
                colorDrawable = new ColorDrawable(C0548l.b(themeConfig.getBackgroundColor()));
            } else {
                colorDrawable = h.e(context.getResources(), identifier, context.getTheme());
                o.b(colorDrawable);
            }
        }
        Drawable drawable = colorDrawable;
        String C3 = kotlin.text.o.C(themeConfig.getIconName(), "-", "_", false, 4, (Object) null);
        int identifier2 = context.getResources().getIdentifier(C3, "drawable", context.getPackageName());
        if (identifier2 == 0) {
            Log.d(Log.f10572a, "ThemeUtils", "Can't find " + C3 + " in drawable resources! Returning a transparent drawable as icon", (Throwable) null, 4, (Object) null);
            e4 = new ColorDrawable(0);
        } else {
            e4 = h.e(context.getResources(), identifier2, context.getTheme());
            o.b(e4);
        }
        Drawable drawable2 = e4;
        String boxShadowColor = themeConfig.getBoxShadowColor();
        if (boxShadowColor == null || boxShadowColor.length() == 0) {
            num = null;
        } else {
            num = Integer.valueOf(C0548l.b(themeConfig.getBoxShadowColor()));
        }
        Integer num2 = num;
        String themeName = themeConfig.getThemeName();
        boolean isPremium = themeConfig.isPremium();
        Boolean ignoreBackgroundImageInLandscape = themeConfig.getIgnoreBackgroundImageInLandscape();
        if (ignoreBackgroundImageInLandscape != null) {
            z3 = ignoreBackgroundImageInLandscape.booleanValue();
        } else {
            z3 = false;
        }
        int b4 = C0548l.b(themeConfig.getBackgroundColor());
        boolean areNavigationBarButtonsDark = themeConfig.getAreNavigationBarButtonsDark();
        int b5 = C0548l.b(themeConfig.getGestureOverlayConfig().getBackgroundColor());
        int b6 = C0548l.b(themeConfig.getAlternativeCharactersPopupConfig().getBackgroundColor());
        String backgroundColor = themeConfig.getAlternativeCharactersPopupConfig().getCharacter().getStateActive().getBackgroundColor();
        if (backgroundColor != null) {
            i4 = C0548l.b(backgroundColor);
        } else {
            i4 = -16776961;
        }
        ThemeModel.b bVar = new ThemeModel.b(b6, i4, a(C0548l.b(themeConfig.getAlternativeCharactersPopupConfig().getCharacter().getStateDefault().getFontColor()), C0548l.b(themeConfig.getAlternativeCharactersPopupConfig().getCharacter().getStateActive().getFontColor())));
        ThemeModel.a aVar = r2;
        ThemeModel.a aVar2 = new ThemeModel.a(C0548l.b(themeConfig.getCharacterPreviewPopUp().getBackgroundColor()), C0548l.b(themeConfig.getCharacterPreviewPopUp().getFontColor()));
        ThemeModel.GestureOverlayTheme gestureOverlayTheme = r2;
        ThemeModel.GestureOverlayTheme gestureOverlayTheme2 = new ThemeModel.GestureOverlayTheme(C0548l.b(themeConfig.getGestureOverlayConfig().getBackgroundColor()), C0548l.b(themeConfig.getGestureOverlayConfig().getFallbackBackgroundColor()));
        ThemeModel.SmartBarTheme i5 = i(themeConfig.getSmartBarConfig());
        ThemeModel.SpecialOverlaysTheme specialOverlaysTheme = r20;
        ThemeModel.SpecialOverlaysTheme specialOverlaysTheme2 = new ThemeModel.SpecialOverlaysTheme(C0548l.b(themeConfig.getSpecialOverlaysConfig().getBackgroundColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getFallbackBackgroundColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getTitleConfig().getFontColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getCharacterConfig().getFontColor()), new ThemeModel.SpecialOverlaysTheme.b(C0548l.b(themeConfig.getSpecialOverlaysConfig().getSidebarConfig().getBackgroundColor()), b(C0548l.b(themeConfig.getSpecialOverlaysConfig().getSidebarConfig().getIconConfig().getStateDefault().getColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getSidebarConfig().getIconConfig().getStateActive().getColor())), b(C0548l.b(themeConfig.getSpecialOverlaysConfig().getSidebarConfig().getExitIconConfig().getStateDefault().getColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getSidebarConfig().getExitIconConfig().getStateActive().getColor()))), new ThemeModel.SpecialOverlaysTheme.a(C0548l.b(themeConfig.getSpecialOverlaysConfig().getEmojiSidebarConfig().getBackgroundColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getEmojiSidebarConfig().getIconConfig().getStateDefault().getColor()), C0548l.b(themeConfig.getSpecialOverlaysConfig().getEmojiSidebarConfig().getIconConfig().getStateActive().getColor())));
        return new ThemeModel(themeName, isPremium, z3, drawable, b4, drawable2, areNavigationBarButtonsDark, num2, b5, bVar, aVar, gestureOverlayTheme, i5, specialOverlaysTheme, f(themeConfig.getKeysConfig()), e(themeConfig.getAiAssistantConfig()));
    }
}
