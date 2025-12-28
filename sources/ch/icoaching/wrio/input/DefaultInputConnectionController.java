package ch.icoaching.wrio.input;

import a2.C0359a;
import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c.C0489b;
import c.C0490c;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.wrio.data.h;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.personalization.dictionary.c;
import ch.icoaching.wrio.util.Pair;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.d;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.sync.b;
import l2.q;
import u2.l;
import u2.p;

public final class DefaultInputConnectionController implements c {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final List f9658A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final InputFieldState f9659B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public m f9660C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public InputConnection f9661D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public j f9662E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public EditorInfo f9663F;

    /* renamed from: a  reason: collision with root package name */
    private final Context f9664a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f9665b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineDispatcher f9666c;

    /* renamed from: d  reason: collision with root package name */
    private final D f9667d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final c f9668e;

    /* renamed from: f  reason: collision with root package name */
    private final i f9669f;

    /* renamed from: g  reason: collision with root package name */
    private final ch.icoaching.wrio.data.c f9670g;

    /* renamed from: h  reason: collision with root package name */
    private final h f9671h;

    /* renamed from: i  reason: collision with root package name */
    private final C0489b f9672i;

    /* renamed from: j  reason: collision with root package name */
    private final AILibrarySingletonProvider f9673j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final d f9674k;

    /* renamed from: l  reason: collision with root package name */
    private final List f9675l = C0718m.m(199, 231, 7838, 223, 304, 305);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public l f9676m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public String f9677n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public String f9678o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f9679p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f9680q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public long f9681r;

    /* renamed from: s  reason: collision with root package name */
    private volatile long f9682s;

    /* renamed from: t  reason: collision with root package name */
    private final String f9683t = "[#*0-9]\\x{FE0F}?\\x{20E3}|[\\xA9\\xAE\\x{203C}\\x{2049}\\x{2122}\\x{2139}\\x{2194}-\\x{2199}\\x{21A9}\\x{21AA}\\x{231A}\\x{231B}\\x{2328}\\x{23CF}\\x{23ED}-\\x{23EF}\\x{23F1}\\x{23F2}\\x{23F8}-\\x{23FA}\\x{24C2}\\x{25AA}\\x{25AB}\\x{25B6}\\x{25C0}\\x{25FB}\\x{25FC}\\x{25FE}\\x{2600}-\\x{2604}\\x{260E}\\x{2611}\\x{2614}\\x{2615}\\x{2618}\\x{2620}\\x{2622}\\x{2623}\\x{2626}\\x{262A}\\x{262E}\\x{262F}\\x{2638}-\\x{263A}\\x{2640}\\x{2642}\\x{2648}-\\x{2653}\\x{265F}\\x{2660}\\x{2663}\\x{2665}\\x{2666}\\x{2668}\\x{267B}\\x{267E}\\x{267F}\\x{2692}\\x{2694}-\\x{2697}\\x{2699}\\x{269B}\\x{269C}\\x{26A0}\\x{26A7}\\x{26AA}\\x{26B0}\\x{26B1}\\x{26BD}\\x{26BE}\\x{26C4}\\x{26C8}\\x{26CF}\\x{26D1}\\x{26D3}\\x{26E9}\\x{26F0}-\\x{26F5}\\x{26F7}\\x{26F8}\\x{26FA}\\x{2702}\\x{2708}\\x{2709}\\x{270F}\\x{2712}\\x{2714}\\x{2716}\\x{271D}\\x{2721}\\x{2733}\\x{2734}\\x{2744}\\x{2747}\\x{2757}\\x{2763}\\x{27A1}\\x{2934}\\x{2935}\\x{2B05}-\\x{2B07}\\x{2B1B}\\x{2B1C}\\x{2B55}\\x{3030}\\x{303D}\\x{3297}\\x{3299}\\x{1F004}\\x{1F170}\\x{1F171}\\x{1F17E}\\x{1F17F}\\x{1F202}\\x{1F237}\\x{1F321}\\x{1F324}-\\x{1F32C}\\x{1F336}\\x{1F37D}\\x{1F396}\\x{1F397}\\x{1F399}-\\x{1F39B}\\x{1F39E}\\x{1F39F}\\x{1F3CD}\\x{1F3CE}\\x{1F3D4}-\\x{1F3DF}\\x{1F3F5}\\x{1F3F7}\\x{1F43F}\\x{1F4FD}\\x{1F549}\\x{1F54A}\\x{1F56F}\\x{1F570}\\x{1F573}\\x{1F576}-\\x{1F579}\\x{1F587}\\x{1F58A}-\\x{1F58D}\\x{1F5A5}\\x{1F5A8}\\x{1F5B1}\\x{1F5B2}\\x{1F5BC}\\x{1F5C2}-\\x{1F5C4}\\x{1F5D1}-\\x{1F5D3}\\x{1F5DC}-\\x{1F5DE}\\x{1F5E1}\\x{1F5E3}\\x{1F5E8}\\x{1F5EF}\\x{1F5F3}\\x{1F5FA}\\x{1F6CB}\\x{1F6CD}-\\x{1F6CF}\\x{1F6E0}-\\x{1F6E5}\\x{1F6E9}\\x{1F6F0}\\x{1F6F3}]\\x{FE0F}?|[\\x{261D}\\x{270C}\\x{270D}\\x{1F574}\\x{1F590}][\\x{FE0F}\\x{1F3FB}-\\x{1F3FF}]?|[\\x{26F9}\\x{1F3CB}\\x{1F3CC}\\x{1F575}][\\x{FE0F}\\x{1F3FB}-\\x{1F3FF}]?(?:\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|[\\x{270A}\\x{270B}\\x{1F385}\\x{1F3C2}\\x{1F3C7}\\x{1F442}\\x{1F443}\\x{1F446}-\\x{1F450}\\x{1F466}\\x{1F467}\\x{1F46B}-\\x{1F46D}\\x{1F472}\\x{1F474}-\\x{1F476}\\x{1F478}\\x{1F47C}\\x{1F483}\\x{1F485}\\x{1F48F}\\x{1F491}\\x{1F4AA}\\x{1F57A}\\x{1F595}\\x{1F596}\\x{1F64C}\\x{1F64F}\\x{1F6C0}\\x{1F6CC}\\x{1F90C}\\x{1F90F}\\x{1F918}-\\x{1F91F}\\x{1F930}-\\x{1F934}\\x{1F936}\\x{1F977}\\x{1F9B5}\\x{1F9B6}\\x{1F9BB}\\x{1F9D2}\\x{1F9D3}\\x{1F9D5}\\x{1FAC3}-\\x{1FAC5}\\x{1FAF0}\\x{1FAF2}-\\x{1FAF8}][\\x{1F3FB}-\\x{1F3FF}]?|[\\x{1F3C3}\\x{1F3C4}\\x{1F3CA}\\x{1F46E}\\x{1F470}\\x{1F471}\\x{1F473}\\x{1F477}\\x{1F481}\\x{1F482}\\x{1F486}\\x{1F487}\\x{1F645}-\\x{1F647}\\x{1F64B}\\x{1F64D}\\x{1F64E}\\x{1F6A3}\\x{1F6B4}-\\x{1F6B6}\\x{1F926}\\x{1F935}\\x{1F937}-\\x{1F939}\\x{1F93D}\\x{1F93E}\\x{1F9B8}\\x{1F9B9}\\x{1F9CD}-\\x{1F9CF}\\x{1F9D4}\\x{1F9D6}-\\x{1F9DD}][\\x{1F3FB}-\\x{1F3FF}]?(?:\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|[\\x{1F408}\\x{1F426}](?:\\x{200D}\\x{2B1B})?|[\\x{1F46F}\\x{1F9DE}\\x{1F9DF}](?:\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|[\\x{23E9}-\\x{23EC}\\x{23F0}\\x{23F3}\\x{25FD}\\x{2693}\\x{26A1}\\x{26AB}\\x{26C5}\\x{26CE}\\x{26D4}\\x{26EA}\\x{26FD}\\x{2705}\\x{2728}\\x{274C}\\x{274E}\\x{2753}-\\x{2755}\\x{2795}-\\x{2797}\\x{27B0}\\x{27BF}\\x{2B50}\\x{1F0CF}\\x{1F18E}\\x{1F191}-\\x{1F19A}\\x{1F201}\\x{1F21A}\\x{1F22F}\\x{1F232}-\\x{1F236}\\x{1F238}-\\x{1F23A}\\x{1F250}\\x{1F251}\\x{1F300}-\\x{1F320}\\x{1F32D}-\\x{1F335}\\x{1F337}-\\x{1F37C}\\x{1F37E}-\\x{1F384}\\x{1F386}-\\x{1F393}\\x{1F3A0}-\\x{1F3C1}\\x{1F3C5}\\x{1F3C6}\\x{1F3C8}\\x{1F3C9}\\x{1F3CF}-\\x{1F3D3}\\x{1F3E0}-\\x{1F3F0}\\x{1F3F8}-\\x{1F407}\\x{1F409}-\\x{1F414}\\x{1F416}-\\x{1F425}\\x{1F427}-\\x{1F43A}\\x{1F43C}-\\x{1F43E}\\x{1F440}\\x{1F444}\\x{1F445}\\x{1F451}-\\x{1F465}\\x{1F46A}\\x{1F479}-\\x{1F47B}\\x{1F47D}-\\x{1F480}\\x{1F484}\\x{1F488}-\\x{1F48E}\\x{1F490}\\x{1F492}-\\x{1F4A9}\\x{1F4AB}-\\x{1F4FC}\\x{1F4FF}-\\x{1F53D}\\x{1F54B}-\\x{1F54E}\\x{1F550}-\\x{1F567}\\x{1F5A4}\\x{1F5FB}-\\x{1F62D}\\x{1F62F}-\\x{1F634}\\x{1F637}-\\x{1F644}\\x{1F648}-\\x{1F64A}\\x{1F680}-\\x{1F6A2}\\x{1F6A4}-\\x{1F6B3}\\x{1F6B7}-\\x{1F6BF}\\x{1F6C1}-\\x{1F6C5}\\x{1F6D0}-\\x{1F6D2}\\x{1F6D5}-\\x{1F6D7}\\x{1F6DC}-\\x{1F6DF}\\x{1F6EB}\\x{1F6EC}\\x{1F6F4}-\\x{1F6FC}\\x{1F7E0}-\\x{1F7EB}\\x{1F7F0}\\x{1F90D}\\x{1F90E}\\x{1F910}-\\x{1F917}\\x{1F920}-\\x{1F925}\\x{1F927}-\\x{1F92F}\\x{1F93A}\\x{1F93F}-\\x{1F945}\\x{1F947}-\\x{1F976}\\x{1F978}-\\x{1F9B4}\\x{1F9B7}\\x{1F9BA}\\x{1F9BC}-\\x{1F9CC}\\x{1F9D0}\\x{1F9E0}-\\x{1F9FF}\\x{1FA70}-\\x{1FA7C}\\x{1FA80}-\\x{1FA88}\\x{1FA90}-\\x{1FABD}\\x{1FABF}-\\x{1FAC2}\\x{1FACE}-\\x{1FADB}\\x{1FAE0}-\\x{1FAE8}]|\\x{2764}\\x{FE0F}?(?:\\x{200D}[\\x{1F525}\\x{1FA79}])?|\\x{1F1E6}[\\x{1F1E8}-\\x{1F1EC}\\x{1F1EE}\\x{1F1F1}\\x{1F1F2}\\x{1F1F4}\\x{1F1F6}-\\x{1F1FA}\\x{1F1FC}\\x{1F1FD}\\x{1F1FF}]|\\x{1F1E7}[\\x{1F1E6}\\x{1F1E7}\\x{1F1E9}-\\x{1F1EF}\\x{1F1F1}-\\x{1F1F4}\\x{1F1F6}-\\x{1F1F9}\\x{1F1FB}\\x{1F1FC}\\x{1F1FE}\\x{1F1FF}]|\\x{1F1E8}[\\x{1F1E6}\\x{1F1E8}\\x{1F1E9}\\x{1F1EB}-\\x{1F1EE}\\x{1F1F0}-\\x{1F1F5}\\x{1F1F7}\\x{1F1FA}-\\x{1F1FF}]|\\x{1F1E9}[\\x{1F1EA}\\x{1F1EC}\\x{1F1EF}\\x{1F1F0}\\x{1F1F2}\\x{1F1F4}\\x{1F1FF}]|\\x{1F1EA}[\\x{1F1E6}\\x{1F1E8}\\x{1F1EA}\\x{1F1EC}\\x{1F1ED}\\x{1F1F7}-\\x{1F1FA}]|\\x{1F1EB}[\\x{1F1EE}-\\x{1F1F0}\\x{1F1F2}\\x{1F1F4}\\x{1F1F7}]|\\x{1F1EC}[\\x{1F1E6}\\x{1F1E7}\\x{1F1E9}-\\x{1F1EE}\\x{1F1F1}-\\x{1F1F3}\\x{1F1F5}-\\x{1F1FA}\\x{1F1FC}\\x{1F1FE}]|\\x{1F1ED}[\\x{1F1F0}\\x{1F1F2}\\x{1F1F3}\\x{1F1F7}\\x{1F1F9}\\x{1F1FA}]|\\x{1F1EE}[\\x{1F1E8}-\\x{1F1EA}\\x{1F1F1}-\\x{1F1F4}\\x{1F1F6}-\\x{1F1F9}]|\\x{1F1EF}[\\x{1F1EA}\\x{1F1F2}\\x{1F1F4}\\x{1F1F5}]|\\x{1F1F0}[\\x{1F1EA}\\x{1F1EC}-\\x{1F1EE}\\x{1F1F2}\\x{1F1F3}\\x{1F1F5}\\x{1F1F7}\\x{1F1FC}\\x{1F1FE}\\x{1F1FF}]|\\x{1F1F1}[\\x{1F1E6}-\\x{1F1E8}\\x{1F1EE}\\x{1F1F0}\\x{1F1F7}-\\x{1F1FB}\\x{1F1FE}]|\\x{1F1F2}[\\x{1F1E6}\\x{1F1E8}-\\x{1F1ED}\\x{1F1F0}-\\x{1F1FF}]|\\x{1F1F3}[\\x{1F1E6}\\x{1F1E8}\\x{1F1EA}-\\x{1F1EC}\\x{1F1EE}\\x{1F1F1}\\x{1F1F4}\\x{1F1F5}\\x{1F1F7}\\x{1F1FA}\\x{1F1FF}]|\\x{1F1F4}\\x{1F1F2}|\\x{1F1F5}[\\x{1F1E6}\\x{1F1EA}-\\x{1F1ED}\\x{1F1F0}-\\x{1F1F3}\\x{1F1F7}-\\x{1F1F9}\\x{1F1FC}\\x{1F1FE}]|\\x{1F1F6}\\x{1F1E6}|\\x{1F1F7}[\\x{1F1EA}\\x{1F1F4}\\x{1F1F8}\\x{1F1FA}\\x{1F1FC}]|\\x{1F1F8}[\\x{1F1E6}-\\x{1F1EA}\\x{1F1EC}-\\x{1F1F4}\\x{1F1F7}-\\x{1F1F9}\\x{1F1FB}\\x{1F1FD}-\\x{1F1FF}]|\\x{1F1F9}[\\x{1F1E6}\\x{1F1E8}\\x{1F1E9}\\x{1F1EB}-\\x{1F1ED}\\x{1F1EF}-\\x{1F1F4}\\x{1F1F7}\\x{1F1F9}\\x{1F1FB}\\x{1F1FC}\\x{1F1FF}]|\\x{1F1FA}[\\x{1F1E6}\\x{1F1EC}\\x{1F1F2}\\x{1F1F3}\\x{1F1F8}\\x{1F1FE}\\x{1F1FF}]|\\x{1F1FB}[\\x{1F1E6}\\x{1F1E8}\\x{1F1EA}\\x{1F1EC}\\x{1F1EE}\\x{1F1F3}\\x{1F1FA}]|\\x{1F1FC}[\\x{1F1EB}\\x{1F1F8}]|\\x{1F1FD}\\x{1F1F0}|\\x{1F1FE}[\\x{1F1EA}\\x{1F1F9}]|\\x{1F1FF}[\\x{1F1E6}\\x{1F1F2}\\x{1F1FC}]|\\x{1F3F3}\\x{FE0F}?(?:\\x{200D}(?:\\x{26A7}\\x{FE0F}?|\\x{1F308}))?|\\x{1F3F4}(?:\\x{200D}\\x{2620}\\x{FE0F}?|\\x{E0067}\\x{E0062}(?:\\x{E0065}\\x{E006E}\\x{E0067}|\\x{E0073}\\x{E0063}\\x{E0074}|\\x{E0077}\\x{E006C}\\x{E0073})\\x{E007F})?|\\x{1F415}(?:\\x{200D}\\x{1F9BA})?|\\x{1F43B}(?:\\x{200D}\\x{2744}\\x{FE0F}?)?|\\x{1F441}\\x{FE0F}?(?:\\x{200D}\\x{1F5E8}\\x{FE0F}?)?|\\x{1F468}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F468}\\x{1F469}]\\x{200D}(?:\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?)|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}|\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?)|\\x{1F3FB}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FC}-\\x{1F3FF}]))?|\\x{1F3FC}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}]))?|\\x{1F3FD}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}]))?|\\x{1F3FE}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}]))?|\\x{1F3FF}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}-\\x{1F3FE}]))?)?|\\x{1F469}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?[\\x{1F468}\\x{1F469}]|\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?|\\x{1F469}\\x{200D}(?:\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?))|\\x{1F3FB}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FC}-\\x{1F3FF}]))?|\\x{1F3FC}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}]))?|\\x{1F3FD}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}]))?|\\x{1F3FE}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}]))?|\\x{1F3FF}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}-\\x{1F3FE}]))?)?|\\x{1F62E}(?:\\x{200D}\\x{1F4A8})?|\\x{1F635}(?:\\x{200D}\\x{1F4AB})?|\\x{1F636}(?:\\x{200D}\\x{1F32B}\\x{FE0F}?)?|\\x{1F93C}(?:[\\x{1F3FB}-\\x{1F3FF}]|\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|\\x{1F9D1}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{1F91D}\\x{200D}\\x{1F9D1})|\\x{1F3FB}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FC}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FC}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FD}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FE}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FF}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FE}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?)?|\\x{1FAF1}(?:\\x{1F3FB}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FC}-\\x{1F3FF}])?|\\x{1F3FC}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}])?|\\x{1F3FD}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}])?|\\x{1F3FE}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}])?|\\x{1F3FF}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}-\\x{1F3FE}])?)?";

    /* renamed from: u  reason: collision with root package name */
    private final Pattern f9684u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public long f9685v;

    /* renamed from: w  reason: collision with root package name */
    private final KeyCharacterMap f9686w;

    /* renamed from: x  reason: collision with root package name */
    private final List f9687x;

    /* renamed from: y  reason: collision with root package name */
    private final List f9688y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final List f9689z;

    @kotlin.coroutines.jvm.internal.d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$1", f = "DefaultInputConnectionController.kt", l = {123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lch/icoaching/wrio/input/DefaultInputConnectionController$a;", "it", "Ll2/q;", "<anonymous>", "(Lch/icoaching/wrio/input/DefaultInputConnectionController$a;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.input.DefaultInputConnectionController$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultInputConnectionController this$0;

        {
            this.this$0 = r1;
        }

        public final kotlin.coroutines.c<q> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(a aVar, kotlin.coroutines.c<? super q> cVar) {
            return ((AnonymousClass1) create(aVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            switch (this.label) {
                case 0:
                    kotlin.f.b(obj);
                    a aVar = (a) this.L$0;
                    if (aVar instanceof a.f) {
                        this.label = 1;
                        if (this.this$0.G((a.f) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.g) {
                        this.label = 2;
                        if (this.this$0.H((a.g) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.l) {
                        this.label = 3;
                        if (this.this$0.M((a.l) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.n) {
                        DefaultInputConnectionController defaultInputConnectionController = this.this$0;
                        this.label = 4;
                        if (defaultInputConnectionController.I0(this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.j) {
                        this.label = 5;
                        if (this.this$0.K((a.j) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.C0152a) {
                        DefaultInputConnectionController defaultInputConnectionController2 = this.this$0;
                        this.label = 6;
                        if (defaultInputConnectionController2.c0(this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.c) {
                        this.label = 7;
                        if (this.this$0.F((a.c) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.m) {
                        this.label = 8;
                        if (this.this$0.N((a.m) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.d) {
                        DefaultInputConnectionController defaultInputConnectionController3 = this.this$0;
                        this.label = 9;
                        if (defaultInputConnectionController3.C0(this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.o) {
                        this.label = 10;
                        if (this.this$0.O((a.o) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.h) {
                        this.label = 11;
                        if (this.this$0.I((a.h) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.i) {
                        this.label = 12;
                        if (this.this$0.J((a.i) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.e) {
                        DefaultInputConnectionController defaultInputConnectionController4 = this.this$0;
                        this.label = 13;
                        if (defaultInputConnectionController4.G0(this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.k) {
                        this.label = 14;
                        if (this.this$0.L((a.k) aVar, this) == f4) {
                            return f4;
                        }
                    } else if (aVar instanceof a.b) {
                        DefaultInputConnectionController defaultInputConnectionController5 = this.this$0;
                        this.label = 15;
                        if (defaultInputConnectionController5.s0(this) == f4) {
                            return f4;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    kotlin.f.b(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return q.f14567a;
        }
    }

    private static final class AutoSpaceUseCase {

        /* renamed from: a  reason: collision with root package name */
        private final String f9690a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9691b;

        /* renamed from: c  reason: collision with root package name */
        private final j f9692c;

        /* renamed from: d  reason: collision with root package name */
        private final InputConnection f9693d;

        /* renamed from: e  reason: collision with root package name */
        private final InputFieldState f9694e;

        /* renamed from: f  reason: collision with root package name */
        private final DefaultInputConnectionController f9695f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f9696g;

        /* renamed from: h  reason: collision with root package name */
        private final String f9697h = "AutoSpaceUseCase";

        public AutoSpaceUseCase(String str, String str2, j jVar, InputConnection inputConnection, InputFieldState inputFieldState, DefaultInputConnectionController defaultInputConnectionController, boolean z3) {
            o.e(str2, "change");
            o.e(jVar, "inputSession");
            o.e(inputConnection, "inputConnection");
            o.e(inputFieldState, "inputFieldState");
            o.e(defaultInputConnectionController, "inputConnectionController");
            this.f9690a = str;
            this.f9691b = str2;
            this.f9692c = jVar;
            this.f9693d = inputConnection;
            this.f9694e = inputFieldState;
            this.f9695f = defaultInputConnectionController;
            this.f9696g = z3;
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final ch.icoaching.wrio.util.Pair a(java.lang.String r9, java.lang.String r10, boolean r11) {
            /*
                r8 = this;
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "\\s+"
                r0.<init>((java.lang.String) r1)
                r1 = 0
                java.util.List r10 = r0.split(r10, r1)
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r10 = r10.toArray(r0)
                java.lang.String[] r10 = (java.lang.String[]) r10
                int r0 = r10.length
                java.lang.String r2 = ""
                if (r0 != 0) goto L_0x001b
                r0 = r2
                goto L_0x0021
            L_0x001b:
                java.lang.Object r0 = kotlin.collections.C0713h.U(r10)
                java.lang.String r0 = (java.lang.String) r0
            L_0x0021:
                int r3 = r10.length
                r4 = 2
                if (r3 < r4) goto L_0x0029
                int r2 = r10.length
                int r2 = r2 - r4
                r2 = r10[r2]
            L_0x0029:
                int r10 = r9.hashCode()
                r3 = 33
                java.lang.String r5 = "."
                r6 = 1
                r7 = 0
                if (r10 == r3) goto L_0x0125
                r3 = 34
                if (r10 == r3) goto L_0x00d8
                r3 = 41
                if (r10 == r3) goto L_0x00ad
                r3 = 44
                if (r10 == r3) goto L_0x00a3
                r3 = 46
                if (r10 == r3) goto L_0x009b
                r3 = 63
                if (r10 == r3) goto L_0x0091
                r3 = 93
                if (r10 == r3) goto L_0x0087
                r3 = 125(0x7d, float:1.75E-43)
                if (r10 == r3) goto L_0x007d
                r3 = 187(0xbb, float:2.62E-43)
                if (r10 == r3) goto L_0x0073
                r3 = 58
                if (r10 == r3) goto L_0x0069
                r3 = 59
                if (r10 == r3) goto L_0x005f
                goto L_0x012d
            L_0x005f:
                java.lang.String r10 = ";"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x0130
                goto L_0x012d
            L_0x0069:
                java.lang.String r10 = ":"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x0130
                goto L_0x012d
            L_0x0073:
                java.lang.String r10 = "»"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x00b7
                goto L_0x012d
            L_0x007d:
                java.lang.String r10 = "}"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x00b7
                goto L_0x012d
            L_0x0087:
                java.lang.String r10 = "]"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x00b7
                goto L_0x012d
            L_0x0091:
                java.lang.String r10 = "?"
                boolean r10 = r9.equals(r10)
                if (r10 == 0) goto L_0x012d
                goto L_0x0130
            L_0x009b:
                boolean r10 = r9.equals(r5)
                if (r10 != 0) goto L_0x0130
                goto L_0x012d
            L_0x00a3:
                java.lang.String r10 = ","
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x0130
                goto L_0x012d
            L_0x00ad:
                java.lang.String r10 = ")"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x00b7
                goto L_0x012d
            L_0x00b7:
                java.lang.String r10 = r8.e(r9)
                int r3 = r0.length()
                if (r3 != 0) goto L_0x00c9
                boolean r3 = kotlin.text.o.G(r2, r10, r1, r4, r7)
                if (r3 == 0) goto L_0x00c9
                r3 = r6
                goto L_0x00ca
            L_0x00c9:
                r3 = r1
            L_0x00ca:
                if (r3 != 0) goto L_0x00d2
                boolean r10 = kotlin.text.o.G(r0, r10, r1, r4, r7)
                goto L_0x0140
            L_0x00d2:
                boolean r10 = kotlin.text.o.G(r2, r10, r1, r4, r7)
                goto L_0x0140
            L_0x00d8:
                java.lang.String r10 = "\""
                boolean r3 = r9.equals(r10)
                if (r3 != 0) goto L_0x00e1
                goto L_0x012d
            L_0x00e1:
                int r3 = r0.length()
                if (r3 != 0) goto L_0x0110
                int r3 = r2.length()
                if (r3 <= 0) goto L_0x0110
                boolean r3 = kotlin.text.o.G(r2, r10, r1, r4, r7)
                if (r3 == 0) goto L_0x012d
                boolean r10 = kotlin.text.o.u(r2, r10, r1, r4, r7)
                if (r10 != 0) goto L_0x012d
                int r10 = r2.length()
                if (r10 < r4) goto L_0x010e
                int r10 = r2.length()
                int r10 = r10 - r6
                char r10 = r2.charAt(r10)
                boolean r10 = java.lang.Character.isLetter(r10)
            L_0x010c:
                r3 = r6
                goto L_0x0140
            L_0x010e:
                r10 = r1
                goto L_0x010c
            L_0x0110:
                int r10 = r0.length()
                if (r10 < r4) goto L_0x012d
                int r10 = r0.length()
                int r10 = r10 - r6
                char r10 = r0.charAt(r10)
                boolean r10 = java.lang.Character.isLetter(r10)
                r3 = r1
                goto L_0x0140
            L_0x0125:
                java.lang.String r10 = "!"
                boolean r10 = r9.equals(r10)
                if (r10 != 0) goto L_0x0130
            L_0x012d:
                r10 = r1
            L_0x012e:
                r3 = r10
                goto L_0x0140
            L_0x0130:
                int r10 = r0.length()
                if (r10 != 0) goto L_0x013e
                int r10 = r2.length()
                if (r10 <= 0) goto L_0x013e
                r10 = r6
                goto L_0x012e
            L_0x013e:
                r3 = r1
                r10 = r6
            L_0x0140:
                java.lang.String r2 = "@"
                boolean r2 = kotlin.text.o.L(r0, r2, r1, r4, r7)
                if (r2 == 0) goto L_0x0149
                r10 = r1
            L_0x0149:
                java.lang.String r2 = "www"
                boolean r2 = e3.c.b(r0, r2)
                if (r2 == 0) goto L_0x0152
                r10 = r1
            L_0x0152:
                boolean r2 = kotlin.text.o.L(r0, r5, r1, r4, r7)
                if (r2 == 0) goto L_0x0159
                r10 = r1
            L_0x0159:
                if (r11 == 0) goto L_0x0164
                java.lang.String r11 = " "
                boolean r9 = kotlin.text.o.u(r9, r11, r1, r4, r7)
                if (r9 == 0) goto L_0x0164
                goto L_0x0165
            L_0x0164:
                r6 = r3
            L_0x0165:
                kotlin.text.Regex r9 = new kotlin.text.Regex
                java.lang.String r11 = ".*\\d+.*"
                r9.<init>((java.lang.String) r11)
                boolean r9 = r9.matches(r0)
                if (r9 == 0) goto L_0x0174
                r10 = r1
                goto L_0x0175
            L_0x0174:
                r1 = r6
            L_0x0175:
                ch.icoaching.wrio.util.Pair r9 = new ch.icoaching.wrio.util.Pair
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                r9.<init>(r10, r11)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.AutoSpaceUseCase.a(java.lang.String, java.lang.String, boolean):ch.icoaching.wrio.util.Pair");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(boolean r18, boolean r19, kotlin.coroutines.c r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                boolean r4 = r3 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$autoSpace$1
                if (r4 == 0) goto L_0x001b
                r4 = r3
                ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$autoSpace$1 r4 = (ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$autoSpace$1) r4
                int r5 = r4.label
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r5 & r6
                if (r7 == 0) goto L_0x001b
                int r5 = r5 - r6
                r4.label = r5
                goto L_0x0020
            L_0x001b:
                ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$autoSpace$1 r4 = new ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$autoSpace$1
                r4.<init>(r0, r3)
            L_0x0020:
                java.lang.Object r3 = r4.result
                java.lang.Object r5 = kotlin.coroutines.intrinsics.a.f()
                int r6 = r4.label
                java.lang.String r7 = " | "
                java.lang.String r8 = "' | "
                r9 = 1
                if (r6 == 0) goto L_0x004e
                if (r6 != r9) goto L_0x0046
                int r1 = r4.I$1
                int r2 = r4.I$0
                boolean r5 = r4.Z$1
                boolean r6 = r4.Z$0
                java.lang.Object r4 = r4.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase r4 = (ch.icoaching.wrio.input.DefaultInputConnectionController.AutoSpaceUseCase) r4
                kotlin.f.b(r3)
                r3 = r1
                r1 = r6
                r6 = r2
                r2 = r5
                goto L_0x00ce
            L_0x0046:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004e:
                kotlin.f.b(r3)
                ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
                java.lang.String r11 = r0.f9697h
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "autoSpace() :: "
                r6.append(r10)
                r6.append(r1)
                java.lang.String r10 = ", "
                r6.append(r10)
                r6.append(r2)
                java.lang.String r12 = r6.toString()
                r14 = 4
                r15 = 0
                r13 = 0
                r10 = r3
                ch.icoaching.wrio.logging.Log.d(r10, r11, r12, r13, r14, r15)
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r6 = r0.f9694e
                int r6 = r6.i()
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r10 = r0.f9694e
                int r15 = r10.h()
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r10 = r0.f9694e
                java.lang.String r10 = r10.f()
                java.lang.String r11 = r0.f9697h
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "autoSpace() :: FROM: '"
                r12.append(r13)
                java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r15)
                java.lang.CharSequence r10 = ch.icoaching.wrio.I.a(r10, r13)
                r12.append(r10)
                r12.append(r8)
                r12.append(r6)
                r12.append(r7)
                r12.append(r15)
                java.lang.String r12 = r12.toString()
                r16 = 0
                r13 = 0
                r10 = r3
                r3 = r15
                r15 = r16
                ch.icoaching.wrio.logging.Log.d(r10, r11, r12, r13, r14, r15)
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r10 = r0.f9694e
                r4.L$0 = r0
                r4.Z$0 = r1
                r4.Z$1 = r2
                r4.I$0 = r6
                r4.I$1 = r3
                r4.label = r9
                java.lang.Object r4 = r10.a(r1, r2, r4)
                if (r4 != r5) goto L_0x00cd
                return r5
            L_0x00cd:
                r4 = r0
            L_0x00ce:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r5 = r4.f9694e
                java.lang.String r5 = r5.f()
                ch.icoaching.wrio.logging.Log r10 = ch.icoaching.wrio.logging.Log.f10572a
                java.lang.String r11 = r4.f9697h
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "autoSpace() :: TO: '"
                r12.append(r13)
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r13 = r4.f9694e
                int r13 = r13.h()
                java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r13)
                java.lang.CharSequence r5 = ch.icoaching.wrio.I.a(r5, r13)
                r12.append(r5)
                r12.append(r8)
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r5 = r4.f9694e
                int r5 = r5.i()
                r12.append(r5)
                r12.append(r7)
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r5 = r4.f9694e
                int r5 = r5.h()
                r12.append(r5)
                java.lang.String r12 = r12.toString()
                r14 = 4
                r15 = 0
                r13 = 0
                ch.icoaching.wrio.logging.Log.d(r10, r11, r12, r13, r14, r15)
                android.view.inputmethod.InputConnection r5 = r4.f9693d
                r5.beginBatchEdit()
                if (r2 == 0) goto L_0x0131
                android.view.inputmethod.InputConnection r2 = r4.f9693d
                int r5 = r6 + -2
                int r6 = r6 - r9
                r2.setSelection(r5, r6)
                android.view.inputmethod.InputConnection r2 = r4.f9693d
                java.lang.String r5 = ""
                r2.commitText(r5, r9)
                android.view.inputmethod.InputConnection r2 = r4.f9693d
                int r3 = r3 - r9
                r2.setSelection(r6, r3)
            L_0x0131:
                android.view.inputmethod.InputConnection r2 = r4.f9693d
                r2.endBatchEdit()
                if (r1 == 0) goto L_0x013f
                android.view.inputmethod.InputConnection r1 = r4.f9693d
                java.lang.String r2 = " "
                r1.commitText(r2, r9)
            L_0x013f:
                ch.icoaching.wrio.input.DefaultInputConnectionController r1 = r4.f9695f
                long r2 = android.os.SystemClock.elapsedRealtime()
                r1.f9679p = r2
                l2.q r1 = l2.q.f14567a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.AutoSpaceUseCase.d(boolean, boolean, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.String e(java.lang.String r3) {
            /*
                r2 = this;
                int r0 = r3.hashCode()
                r1 = 41
                if (r0 == r1) goto L_0x0039
                r1 = 93
                if (r0 == r1) goto L_0x002d
                r1 = 125(0x7d, float:1.75E-43)
                if (r0 == r1) goto L_0x0021
                r1 = 187(0xbb, float:2.62E-43)
                if (r0 == r1) goto L_0x0015
                goto L_0x0041
            L_0x0015:
                java.lang.String r0 = "»"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x001e
                goto L_0x0041
            L_0x001e:
                java.lang.String r3 = "«"
                goto L_0x0046
            L_0x0021:
                java.lang.String r0 = "}"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x002a
                goto L_0x0041
            L_0x002a:
                java.lang.String r3 = "{"
                goto L_0x0046
            L_0x002d:
                java.lang.String r0 = "]"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x0036
                goto L_0x0041
            L_0x0036:
                java.lang.String r3 = "["
                goto L_0x0046
            L_0x0039:
                java.lang.String r0 = ")"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x0044
            L_0x0041:
                java.lang.String r3 = ""
                goto L_0x0046
            L_0x0044:
                java.lang.String r3 = "("
            L_0x0046:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.AutoSpaceUseCase.e(java.lang.String):java.lang.String");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(kotlin.coroutines.c r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$execute$1
                if (r0 == 0) goto L_0x0013
                r0 = r6
                ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$execute$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$execute$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase$execute$1
                r0.<init>(r5, r6)
            L_0x0018:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.AutoSpaceUseCase) r0
                kotlin.f.b(r6)
                goto L_0x0080
            L_0x002d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0035:
                kotlin.f.b(r6)
                java.lang.String r6 = r5.f9690a
                if (r6 == 0) goto L_0x009e
                ch.icoaching.wrio.input.j r6 = r5.f9692c
                boolean r6 = r6.c()
                if (r6 == 0) goto L_0x0048
                boolean r6 = r5.f9696g
                if (r6 != 0) goto L_0x0050
            L_0x0048:
                ch.icoaching.wrio.input.DefaultInputConnectionController r6 = r5.f9695f
                boolean r6 = r6.f9680q
                if (r6 == 0) goto L_0x009e
            L_0x0050:
                java.lang.String r6 = r5.f9691b
                java.lang.String r2 = r5.f9690a
                ch.icoaching.wrio.input.DefaultInputConnectionController r4 = r5.f9695f
                boolean r4 = r4.f9680q
                ch.icoaching.wrio.util.Pair r6 = r5.a(r6, r2, r4)
                F r2 = r6.first
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                S r6 = r6.second
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                kotlin.jvm.internal.o.b(r2)
                boolean r2 = r2.booleanValue()
                kotlin.jvm.internal.o.b(r6)
                boolean r6 = r6.booleanValue()
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r6 = r5.d(r2, r6, r0)
                if (r6 != r1) goto L_0x007f
                return r1
            L_0x007f:
                r0 = r5
            L_0x0080:
                ch.icoaching.wrio.input.DefaultInputConnectionController r6 = r0.f9695f
                r1 = 0
                r6.f9680q = r1
                ch.icoaching.wrio.input.t r6 = new ch.icoaching.wrio.input.t
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r1 = r0.f9694e
                java.lang.String r1 = r1.f()
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r0.f9694e
                java.util.List r2 = r2.g()
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = r0.f9694e
                int r0 = r0.i()
                r6.<init>(r1, r2, r0)
                return r6
            L_0x009e:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.AutoSpaceUseCase.c(kotlin.coroutines.c):java.lang.Object");
        }
    }

    public static final class InputFieldState {

        /* renamed from: a  reason: collision with root package name */
        private final Pattern f9698a;

        /* renamed from: b  reason: collision with root package name */
        private final StringBuilder f9699b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private final List f9700c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private int f9701d;

        /* renamed from: e  reason: collision with root package name */
        private int f9702e;

        /* renamed from: f  reason: collision with root package name */
        private final Stack f9703f = new Stack();

        /* renamed from: g  reason: collision with root package name */
        private final Stack f9704g = new Stack();

        /* renamed from: h  reason: collision with root package name */
        private final b f9705h = kotlinx.coroutines.sync.c.b(false, 1, (Object) null);

        /* renamed from: i  reason: collision with root package name */
        private List f9706i = C0718m.j();

        public InputFieldState(Pattern pattern) {
            o.e(pattern, "emojiPattern");
            this.f9698a = pattern;
        }

        private final String d() {
            String substring = this.f9699b.substring(0, this.f9701d);
            o.b(substring);
            String w3 = w(substring);
            if (w3 != null) {
                int length = this.f9701d - w3.length();
                int i4 = this.f9701d;
                this.f9704g.push(w3);
                this.f9699b.delete(length, i4);
                this.f9703f.push(f.f(this.f9700c, length, i4));
                this.f9701d -= w3.length();
                this.f9702e -= w3.length();
                return w3;
            }
            int i5 = this.f9701d - 1;
            String valueOf = String.valueOf(this.f9699b.charAt(i5));
            this.f9704g.push(valueOf);
            this.f9699b.deleteCharAt(i5);
            this.f9703f.push(C0718m.e((PointF) this.f9700c.get(i5)));
            this.f9700c.remove(i5);
            this.f9701d--;
            this.f9702e--;
            return valueOf;
        }

        private final String w(String str) {
            C0359a g4 = C0359a.g();
            g4.u(new StringCharacterIterator(str));
            int q4 = g4.q(str.length());
            if (q4 < 0) {
                return null;
            }
            String substring = str.substring(q4);
            o.d(substring, "substring(...)");
            if (!this.f9698a.matcher(substring).find()) {
                return null;
            }
            String substring2 = str.substring(q4);
            o.d(substring2, "substring(...)");
            return substring2;
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(boolean r6, boolean r7, kotlin.coroutines.c r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$autoSpace$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$autoSpace$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$autoSpace$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$autoSpace$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$autoSpace$1
                r0.<init>(r5, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                boolean r7 = r0.Z$1
                boolean r6 = r0.Z$0
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r8)
                goto L_0x0056
            L_0x0036:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003e:
                kotlin.f.b(r8)
                kotlinx.coroutines.sync.b r8 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r8
                r0.Z$0 = r6
                r0.Z$1 = r7
                r0.label = r3
                java.lang.Object r0 = r8.a(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
                r1 = r8
            L_0x0056:
                int r8 = r0.f9701d     // Catch:{ all -> 0x006d }
                int r2 = r0.f9702e     // Catch:{ all -> 0x006d }
                if (r7 == 0) goto L_0x006f
                int r7 = r8 + -2
                java.lang.StringBuilder r3 = r0.f9699b     // Catch:{ all -> 0x006d }
                r3.deleteCharAt(r7)     // Catch:{ all -> 0x006d }
                java.util.List r3 = r0.f9700c     // Catch:{ all -> 0x006d }
                r3.remove(r7)     // Catch:{ all -> 0x006d }
                int r8 = r8 + -1
                int r2 = r2 + -1
                goto L_0x006f
            L_0x006d:
                r6 = move-exception
                goto L_0x008b
            L_0x006f:
                if (r6 == 0) goto L_0x0081
                java.lang.StringBuilder r6 = r0.f9699b     // Catch:{ all -> 0x006d }
                r7 = 32
                r6.insert(r8, r7)     // Catch:{ all -> 0x006d }
                java.util.List r6 = r0.f9700c     // Catch:{ all -> 0x006d }
                r6.add(r8, r4)     // Catch:{ all -> 0x006d }
                int r8 = r8 + 1
                int r2 = r2 + 1
            L_0x0081:
                r0.f9701d = r8     // Catch:{ all -> 0x006d }
                r0.f9702e = r2     // Catch:{ all -> 0x006d }
                l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x006d }
                r1.b(r4)
                return r6
            L_0x008b:
                r1.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.a(boolean, boolean, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(kotlin.coroutines.c r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$clear$1
                if (r0 == 0) goto L_0x0013
                r0 = r6
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$clear$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$clear$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$clear$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$clear$1
                r0.<init>(r5, r6)
            L_0x0018:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r6)
                goto L_0x004e
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x003a:
                kotlin.f.b(r6)
                kotlinx.coroutines.sync.b r6 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r0 = r6.a(r4, r0)
                if (r0 != r1) goto L_0x004c
                return r1
            L_0x004c:
                r0 = r5
                r1 = r6
            L_0x004e:
                java.lang.StringBuilder r6 = r0.f9699b     // Catch:{ all -> 0x006d }
                kotlin.text.o.i(r6)     // Catch:{ all -> 0x006d }
                java.util.Stack r6 = r0.f9704g     // Catch:{ all -> 0x006d }
                r6.clear()     // Catch:{ all -> 0x006d }
                java.util.List r6 = r0.f9700c     // Catch:{ all -> 0x006d }
                r6.clear()     // Catch:{ all -> 0x006d }
                java.util.Stack r6 = r0.f9703f     // Catch:{ all -> 0x006d }
                r6.clear()     // Catch:{ all -> 0x006d }
                r6 = 0
                r0.f9701d = r6     // Catch:{ all -> 0x006d }
                r0.f9702e = r6     // Catch:{ all -> 0x006d }
                l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x006d }
                r1.b(r4)
                return r6
            L_0x006d:
                r6 = move-exception
                r1.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.b(kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(int r6, kotlin.coroutines.c r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteCharacters$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteCharacters$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteCharacters$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteCharacters$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteCharacters$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                int r6 = r0.I$0
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r7)
                goto L_0x0052
            L_0x0034:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003c:
                kotlin.f.b(r7)
                kotlinx.coroutines.sync.b r7 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r7
                r0.I$0 = r6
                r0.label = r3
                java.lang.Object r0 = r7.a(r4, r0)
                if (r0 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r0 = r5
                r1 = r7
            L_0x0052:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
                r7.<init>()     // Catch:{ all -> 0x0068 }
            L_0x0057:
                if (r6 <= 0) goto L_0x006a
                int r2 = r0.f9701d     // Catch:{ all -> 0x0068 }
                if (r2 <= 0) goto L_0x006a
                java.lang.String r2 = r0.d()     // Catch:{ all -> 0x0068 }
                r3 = 0
                r7.insert(r3, r2)     // Catch:{ all -> 0x0068 }
                int r6 = r6 + -1
                goto L_0x0057
            L_0x0068:
                r6 = move-exception
                goto L_0x0075
            L_0x006a:
                java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0068 }
                r1.b(r4)
                kotlin.jvm.internal.o.b(r6)
                return r6
            L_0x0075:
                r1.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.c(int, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object e(kotlin.coroutines.c r14) {
            /*
                r13 = this;
                java.lang.String r0 = "substring(...)"
                boolean r1 = r14 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteSelection$1
                if (r1 == 0) goto L_0x0015
                r1 = r14
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteSelection$1 r1 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteSelection$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.label = r2
                goto L_0x001a
            L_0x0015:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteSelection$1 r1 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$deleteSelection$1
                r1.<init>(r13, r14)
            L_0x001a:
                java.lang.Object r14 = r1.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
                int r3 = r1.label
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x003c
                if (r3 != r4) goto L_0x0034
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.b) r2
                java.lang.Object r1 = r1.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r1 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r1
                kotlin.f.b(r14)
                goto L_0x0050
            L_0x0034:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x003c:
                kotlin.f.b(r14)
                kotlinx.coroutines.sync.b r14 = r13.f9705h
                r1.L$0 = r13
                r1.L$1 = r14
                r1.label = r4
                java.lang.Object r1 = r14.a(r5, r1)
                if (r1 != r2) goto L_0x004e
                return r2
            L_0x004e:
                r1 = r13
                r2 = r14
            L_0x0050:
                int r14 = r1.f9701d     // Catch:{ all -> 0x006f }
                int r3 = r1.f9702e     // Catch:{ all -> 0x006f }
                java.lang.StringBuilder r6 = r1.f9699b     // Catch:{ all -> 0x006f }
                java.lang.String r6 = r6.substring(r14, r3)     // Catch:{ all -> 0x006f }
                int r7 = r6.length()     // Catch:{ all -> 0x006f }
                r8 = r6
            L_0x005f:
                if (r7 <= 0) goto L_0x00a2
                kotlin.jvm.internal.o.b(r8)     // Catch:{ all -> 0x006f }
                java.lang.String r9 = r1.w(r8)     // Catch:{ all -> 0x006f }
                if (r9 == 0) goto L_0x0071
                int r9 = r9.length()     // Catch:{ all -> 0x006f }
                goto L_0x0072
            L_0x006f:
                r14 = move-exception
                goto L_0x00ae
            L_0x0071:
                r9 = r4
            L_0x0072:
                int r7 = r7 - r9
                java.util.Stack r10 = r1.f9704g     // Catch:{ all -> 0x006f }
                kotlin.jvm.internal.o.b(r8)     // Catch:{ all -> 0x006f }
                java.lang.String r11 = r8.substring(r7)     // Catch:{ all -> 0x006f }
                kotlin.jvm.internal.o.d(r11, r0)     // Catch:{ all -> 0x006f }
                r10.push(r11)     // Catch:{ all -> 0x006f }
                kotlin.jvm.internal.o.b(r8)     // Catch:{ all -> 0x006f }
                r10 = 0
                java.lang.String r8 = r8.substring(r10, r7)     // Catch:{ all -> 0x006f }
                kotlin.jvm.internal.o.d(r8, r0)     // Catch:{ all -> 0x006f }
                java.util.List r10 = r1.f9700c     // Catch:{ all -> 0x006f }
                int r11 = r1.f9702e     // Catch:{ all -> 0x006f }
                int r12 = r11 - r9
                java.util.List r10 = ch.icoaching.wrio.input.f.f(r10, r12, r11)     // Catch:{ all -> 0x006f }
                java.util.Stack r11 = r1.f9703f     // Catch:{ all -> 0x006f }
                r11.push(r10)     // Catch:{ all -> 0x006f }
                int r10 = r1.f9702e     // Catch:{ all -> 0x006f }
                int r10 = r10 - r9
                r1.f9702e = r10     // Catch:{ all -> 0x006f }
                goto L_0x005f
            L_0x00a2:
                java.lang.StringBuilder r0 = r1.f9699b     // Catch:{ all -> 0x006f }
                r0.delete(r14, r3)     // Catch:{ all -> 0x006f }
                r2.b(r5)
                kotlin.jvm.internal.o.b(r6)
                return r6
            L_0x00ae:
                r2.b(r5)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.e(kotlin.coroutines.c):java.lang.Object");
        }

        public final String f() {
            String sb = this.f9699b.toString();
            o.d(sb, "toString(...)");
            return sb;
        }

        public final List g() {
            return new ArrayList(this.f9700c);
        }

        public final int h() {
            return this.f9702e;
        }

        public final int i() {
            return this.f9701d;
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object j(char r12, android.graphics.PointF r13, kotlin.coroutines.c r14) {
            /*
                r11 = this;
                boolean r0 = r14 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertCharacter$1
                if (r0 == 0) goto L_0x0013
                r0 = r14
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertCharacter$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertCharacter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertCharacter$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertCharacter$1
                r0.<init>(r11, r14)
            L_0x0018:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                char r12 = r0.C$0
                java.lang.Object r13 = r0.L$2
                kotlinx.coroutines.sync.b r13 = (kotlinx.coroutines.sync.b) r13
                java.lang.Object r1 = r0.L$1
                android.graphics.PointF r1 = (android.graphics.PointF) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r14)
                r14 = r13
                r13 = r1
                goto L_0x0059
            L_0x003a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0042:
                kotlin.f.b(r14)
                kotlinx.coroutines.sync.b r14 = r11.f9705h
                r0.L$0 = r11
                r0.L$1 = r13
                r0.L$2 = r14
                r0.C$0 = r12
                r0.label = r3
                java.lang.Object r0 = r14.a(r4, r0)
                if (r0 != r1) goto L_0x0058
                return r1
            L_0x0058:
                r0 = r11
            L_0x0059:
                ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x00c0 }
                java.lang.String r6 = "DefaultInputConnectionController"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
                r1.<init>()     // Catch:{ all -> 0x00c0 }
                java.lang.String r2 = "insertCharacter() :: '"
                r1.append(r2)     // Catch:{ all -> 0x00c0 }
                char r12 = (char) r12     // Catch:{ all -> 0x00c0 }
                r1.append(r12)     // Catch:{ all -> 0x00c0 }
                java.lang.String r2 = "' at "
                r1.append(r2)     // Catch:{ all -> 0x00c0 }
                int r2 = r0.f9701d     // Catch:{ all -> 0x00c0 }
                r1.append(r2)     // Catch:{ all -> 0x00c0 }
                java.lang.String r2 = " of '"
                r1.append(r2)     // Catch:{ all -> 0x00c0 }
                java.lang.StringBuilder r2 = r0.f9699b     // Catch:{ all -> 0x00c0 }
                int r7 = r0.f9702e     // Catch:{ all -> 0x00c0 }
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r7)     // Catch:{ all -> 0x00c0 }
                java.lang.CharSequence r2 = ch.icoaching.wrio.I.a(r2, r7)     // Catch:{ all -> 0x00c0 }
                r1.append(r2)     // Catch:{ all -> 0x00c0 }
                r2 = 39
                r1.append(r2)     // Catch:{ all -> 0x00c0 }
                java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00c0 }
                r9 = 4
                r10 = 0
                r8 = 0
                ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c0 }
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x00c0 }
                int r2 = r0.f9701d     // Catch:{ all -> 0x00c0 }
                r1.insert(r2, r12)     // Catch:{ all -> 0x00c0 }
                java.util.List r12 = r0.f9700c     // Catch:{ all -> 0x00c0 }
                int r1 = r0.f9701d     // Catch:{ all -> 0x00c0 }
                r12.add(r1, r13)     // Catch:{ all -> 0x00c0 }
                int r12 = r0.f9701d     // Catch:{ all -> 0x00c0 }
                int r12 = r12 + r3
                r0.f9701d = r12     // Catch:{ all -> 0x00c0 }
                int r12 = r0.f9702e     // Catch:{ all -> 0x00c0 }
                int r12 = r12 + r3
                r0.f9702e = r12     // Catch:{ all -> 0x00c0 }
                java.util.Stack r12 = r0.f9703f     // Catch:{ all -> 0x00c0 }
                r12.clear()     // Catch:{ all -> 0x00c0 }
                java.util.Stack r12 = r0.f9704g     // Catch:{ all -> 0x00c0 }
                r12.clear()     // Catch:{ all -> 0x00c0 }
                l2.q r12 = l2.q.f14567a     // Catch:{ all -> 0x00c0 }
                r14.b(r4)
                return r12
            L_0x00c0:
                r12 = move-exception
                r14.b(r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.j(char, android.graphics.PointF, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object k(java.lang.String r6, kotlin.coroutines.c r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertString$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertString$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertString$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertString$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$insertString$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.b) r6
                java.lang.Object r1 = r0.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r7)
                r7 = r6
                r6 = r1
                goto L_0x0055
            L_0x0038:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0040:
                kotlin.f.b(r7)
                kotlinx.coroutines.sync.b r7 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.a(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
            L_0x0055:
                int r1 = r6.length()     // Catch:{ all -> 0x008f }
                android.graphics.PointF[] r1 = new android.graphics.PointF[r1]     // Catch:{ all -> 0x008f }
                java.util.List r1 = kotlin.collections.C0713h.a0(r1)     // Catch:{ all -> 0x008f }
                java.lang.StringBuilder r2 = r0.f9699b     // Catch:{ all -> 0x008f }
                int r3 = r0.f9701d     // Catch:{ all -> 0x008f }
                r2.insert(r3, r6)     // Catch:{ all -> 0x008f }
                java.util.List r2 = r0.f9700c     // Catch:{ all -> 0x008f }
                int r3 = r0.f9701d     // Catch:{ all -> 0x008f }
                r2.addAll(r3, r1)     // Catch:{ all -> 0x008f }
                int r1 = r0.f9701d     // Catch:{ all -> 0x008f }
                int r2 = r6.length()     // Catch:{ all -> 0x008f }
                int r1 = r1 + r2
                r0.f9701d = r1     // Catch:{ all -> 0x008f }
                int r1 = r0.f9702e     // Catch:{ all -> 0x008f }
                int r6 = r6.length()     // Catch:{ all -> 0x008f }
                int r1 = r1 + r6
                r0.f9702e = r1     // Catch:{ all -> 0x008f }
                java.util.Stack r6 = r0.f9703f     // Catch:{ all -> 0x008f }
                r6.clear()     // Catch:{ all -> 0x008f }
                java.util.Stack r6 = r0.f9704g     // Catch:{ all -> 0x008f }
                r6.clear()     // Catch:{ all -> 0x008f }
                l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x008f }
                r7.b(r4)
                return r6
            L_0x008f:
                r6 = move-exception
                r7.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.k(java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object l(int r6, kotlin.coroutines.c r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$moveSelection$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$moveSelection$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$moveSelection$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$moveSelection$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$moveSelection$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                int r6 = r0.I$0
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r7)
                goto L_0x0052
            L_0x0034:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003c:
                kotlin.f.b(r7)
                kotlinx.coroutines.sync.b r7 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r7
                r0.I$0 = r6
                r0.label = r3
                java.lang.Object r0 = r7.a(r4, r0)
                if (r0 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r0 = r5
                r1 = r7
            L_0x0052:
                int r7 = r0.f9701d     // Catch:{ all -> 0x0068 }
                int r7 = r7 + r6
                if (r7 >= 0) goto L_0x0059
                r7 = 0
                goto L_0x006a
            L_0x0059:
                java.lang.StringBuilder r6 = r0.f9699b     // Catch:{ all -> 0x0068 }
                int r6 = r6.length()     // Catch:{ all -> 0x0068 }
                if (r7 <= r6) goto L_0x006a
                java.lang.StringBuilder r6 = r0.f9699b     // Catch:{ all -> 0x0068 }
                int r7 = r6.length()     // Catch:{ all -> 0x0068 }
                goto L_0x006a
            L_0x0068:
                r6 = move-exception
                goto L_0x007d
            L_0x006a:
                int r6 = r0.f9701d     // Catch:{ all -> 0x0068 }
                int r6 = r7 - r6
                r0.f9701d = r7     // Catch:{ all -> 0x0068 }
                int r7 = r0.f9702e     // Catch:{ all -> 0x0068 }
                int r7 = r7 + r6
                r0.f9702e = r7     // Catch:{ all -> 0x0068 }
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)     // Catch:{ all -> 0x0068 }
                r1.b(r4)
                return r6
            L_0x007d:
                r1.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.l(int, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(android.view.inputmethod.CorrectionInfo r8, kotlin.coroutines.c r9) {
            /*
                r7 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                boolean r1 = r9 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processCorrection$1
                if (r1 == 0) goto L_0x0015
                r1 = r9
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processCorrection$1 r1 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processCorrection$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.label = r2
                goto L_0x001a
            L_0x0015:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processCorrection$1 r1 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processCorrection$1
                r1.<init>(r7, r9)
            L_0x001a:
                java.lang.Object r9 = r1.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
                int r3 = r1.label
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0042
                if (r3 != r4) goto L_0x003a
                java.lang.Object r8 = r1.L$2
                kotlinx.coroutines.sync.b r8 = (kotlinx.coroutines.sync.b) r8
                java.lang.Object r2 = r1.L$1
                android.view.inputmethod.CorrectionInfo r2 = (android.view.inputmethod.CorrectionInfo) r2
                java.lang.Object r1 = r1.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r1 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r1
                kotlin.f.b(r9)
                r9 = r8
                r8 = r2
                goto L_0x0057
            L_0x003a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0042:
                kotlin.f.b(r9)
                kotlinx.coroutines.sync.b r9 = r7.f9705h
                r1.L$0 = r7
                r1.L$1 = r8
                r1.L$2 = r9
                r1.label = r4
                java.lang.Object r1 = r9.a(r5, r1)
                if (r1 != r2) goto L_0x0056
                return r2
            L_0x0056:
                r1 = r7
            L_0x0057:
                java.lang.CharSequence r2 = r8.getOldText()     // Catch:{ all -> 0x0093 }
                kotlin.jvm.internal.o.c(r2, r0)     // Catch:{ all -> 0x0093 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0093 }
                int r3 = r8.getOffset()     // Catch:{ all -> 0x0093 }
                java.lang.CharSequence r8 = r8.getNewText()     // Catch:{ all -> 0x0093 }
                kotlin.jvm.internal.o.c(r8, r0)     // Catch:{ all -> 0x0093 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0093 }
                int r0 = r2.length()     // Catch:{ all -> 0x0093 }
                int r0 = r0 + r3
                java.lang.StringBuilder r4 = r1.f9699b     // Catch:{ all -> 0x0093 }
                int r4 = r4.length()     // Catch:{ all -> 0x0093 }
                if (r0 > r4) goto L_0x00b8
                java.lang.StringBuilder r4 = r1.f9699b     // Catch:{ all -> 0x0093 }
                r4.replace(r3, r0, r8)     // Catch:{ all -> 0x0093 }
                java.util.List r4 = r1.f9700c     // Catch:{ all -> 0x0093 }
                java.util.List unused = ch.icoaching.wrio.input.f.f(r4, r3, r0)     // Catch:{ all -> 0x0093 }
                int r0 = r8.length()     // Catch:{ all -> 0x0093 }
                r4 = 0
            L_0x0089:
                if (r4 >= r0) goto L_0x0096
                java.util.List r6 = r1.f9700c     // Catch:{ all -> 0x0093 }
                r6.add(r3, r5)     // Catch:{ all -> 0x0093 }
                int r4 = r4 + 1
                goto L_0x0089
            L_0x0093:
                r8 = move-exception
                goto L_0x0119
            L_0x0096:
                int r0 = r1.f9701d     // Catch:{ all -> 0x0093 }
                int r3 = r2.length()     // Catch:{ all -> 0x0093 }
                int r0 = r0 - r3
                int r3 = r8.length()     // Catch:{ all -> 0x0093 }
                int r0 = r0 + r3
                r1.f9701d = r0     // Catch:{ all -> 0x0093 }
                int r0 = r1.f9702e     // Catch:{ all -> 0x0093 }
                int r2 = r2.length()     // Catch:{ all -> 0x0093 }
                int r0 = r0 - r2
                int r8 = r8.length()     // Catch:{ all -> 0x0093 }
                int r0 = r0 + r8
                r1.f9702e = r0     // Catch:{ all -> 0x0093 }
                l2.q r8 = l2.q.f14567a     // Catch:{ all -> 0x0093 }
                r9.b(r5)
                return r8
            L_0x00b8:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
                r0.<init>()     // Catch:{ all -> 0x0093 }
                java.lang.String r4 = "Text length: "
                r0.append(r4)     // Catch:{ all -> 0x0093 }
                java.lang.StringBuilder r4 = r1.f9699b     // Catch:{ all -> 0x0093 }
                int r4 = r4.length()     // Catch:{ all -> 0x0093 }
                r0.append(r4)     // Catch:{ all -> 0x0093 }
                java.lang.String r4 = ", touch points length: "
                r0.append(r4)     // Catch:{ all -> 0x0093 }
                java.util.List r1 = r1.f9700c     // Catch:{ all -> 0x0093 }
                int r1 = r1.size()     // Catch:{ all -> 0x0093 }
                r0.append(r1)     // Catch:{ all -> 0x0093 }
                java.lang.String r1 = ", original length: "
                r0.append(r1)     // Catch:{ all -> 0x0093 }
                int r1 = r2.length()     // Catch:{ all -> 0x0093 }
                r0.append(r1)     // Catch:{ all -> 0x0093 }
                java.lang.String r1 = ", replace length: "
                r0.append(r1)     // Catch:{ all -> 0x0093 }
                int r8 = r8.length()     // Catch:{ all -> 0x0093 }
                r0.append(r8)     // Catch:{ all -> 0x0093 }
                java.lang.String r8 = ", offset: "
                r0.append(r8)     // Catch:{ all -> 0x0093 }
                r0.append(r3)     // Catch:{ all -> 0x0093 }
                r8 = 46
                r0.append(r8)     // Catch:{ all -> 0x0093 }
                java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0093 }
                ch.icoaching.wrio.input.DefaultInputConnectionController$ProcessCorrectionException r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$ProcessCorrectionException     // Catch:{ all -> 0x0093 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
                r1.<init>()     // Catch:{ all -> 0x0093 }
                java.lang.String r2 = "Correction corrects words past the current text end! "
                r1.append(r2)     // Catch:{ all -> 0x0093 }
                r1.append(r8)     // Catch:{ all -> 0x0093 }
                java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0093 }
                r0.<init>(r8)     // Catch:{ all -> 0x0093 }
                throw r0     // Catch:{ all -> 0x0093 }
            L_0x0119:
                r9.b(r5)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.m(android.view.inputmethod.CorrectionInfo, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object n(int r12, int r13, java.lang.String r14, kotlin.coroutines.c r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processPrediction$1
                if (r0 == 0) goto L_0x0013
                r0 = r15
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processPrediction$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processPrediction$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processPrediction$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processPrediction$1
                r0.<init>(r11, r15)
            L_0x0018:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0044
                if (r2 != r3) goto L_0x003c
                int r13 = r0.I$1
                int r12 = r0.I$0
                java.lang.Object r14 = r0.L$2
                kotlinx.coroutines.sync.b r14 = (kotlinx.coroutines.sync.b) r14
                java.lang.Object r1 = r0.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r15)
                r15 = r14
                r14 = r1
                goto L_0x008d
            L_0x003c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0044:
                kotlin.f.b(r15)
                ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r2 = "processPrediction() :: "
                r15.append(r2)
                r15.append(r12)
                java.lang.String r2 = ", "
                r15.append(r2)
                r15.append(r13)
                java.lang.String r2 = ", '"
                r15.append(r2)
                r15.append(r14)
                r2 = 39
                r15.append(r2)
                java.lang.String r7 = r15.toString()
                r9 = 4
                r10 = 0
                java.lang.String r6 = "DefaultInputConnectionController"
                r8 = 0
                ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.sync.b r15 = r11.f9705h
                r0.L$0 = r11
                r0.L$1 = r14
                r0.L$2 = r15
                r0.I$0 = r12
                r0.I$1 = r13
                r0.label = r3
                java.lang.Object r0 = r15.a(r4, r0)
                if (r0 != r1) goto L_0x008c
                return r1
            L_0x008c:
                r0 = r11
            L_0x008d:
                int r13 = r13 + r12
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x00a7 }
                r1.replace(r12, r13, r14)     // Catch:{ all -> 0x00a7 }
                java.util.List r1 = r0.f9700c     // Catch:{ all -> 0x00a7 }
                java.util.List unused = ch.icoaching.wrio.input.f.f(r1, r12, r13)     // Catch:{ all -> 0x00a7 }
                int r13 = r14.length()     // Catch:{ all -> 0x00a7 }
                r1 = 0
            L_0x009d:
                if (r1 >= r13) goto L_0x00a9
                java.util.List r2 = r0.f9700c     // Catch:{ all -> 0x00a7 }
                r2.add(r12, r4)     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + 1
                goto L_0x009d
            L_0x00a7:
                r12 = move-exception
                goto L_0x00b8
            L_0x00a9:
                int r13 = r14.length()     // Catch:{ all -> 0x00a7 }
                int r12 = r12 + r13
                r0.f9701d = r12     // Catch:{ all -> 0x00a7 }
                r0.f9702e = r12     // Catch:{ all -> 0x00a7 }
                l2.q r12 = l2.q.f14567a     // Catch:{ all -> 0x00a7 }
                r15.b(r4)
                return r12
            L_0x00b8:
                r15.b(r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.n(int, int, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object o(java.lang.String r7, java.lang.String r8, kotlin.coroutines.c r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processShortcut$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processShortcut$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processShortcut$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processShortcut$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$processShortcut$1
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0044
                if (r2 != r3) goto L_0x003c
                java.lang.Object r7 = r0.L$3
                kotlinx.coroutines.sync.b r7 = (kotlinx.coroutines.sync.b) r7
                java.lang.Object r8 = r0.L$2
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r1 = r0.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r9)
                r9 = r7
                r7 = r1
                goto L_0x005b
            L_0x003c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0044:
                kotlin.f.b(r9)
                kotlinx.coroutines.sync.b r9 = r6.f9705h
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.L$3 = r9
                r0.label = r3
                java.lang.Object r0 = r9.a(r4, r0)
                if (r0 != r1) goto L_0x005a
                return r1
            L_0x005a:
                r0 = r6
            L_0x005b:
                int r1 = r0.f9701d     // Catch:{ all -> 0x007f }
                int r2 = r7.length()     // Catch:{ all -> 0x007f }
                int r1 = r1 - r2
                int r1 = r1 - r3
                int r2 = r0.f9701d     // Catch:{ all -> 0x007f }
                int r2 = r2 - r3
                java.lang.StringBuilder r3 = r0.f9699b     // Catch:{ all -> 0x007f }
                r3.replace(r1, r2, r8)     // Catch:{ all -> 0x007f }
                java.util.List r3 = r0.f9700c     // Catch:{ all -> 0x007f }
                java.util.List unused = ch.icoaching.wrio.input.f.f(r3, r1, r2)     // Catch:{ all -> 0x007f }
                int r2 = r8.length()     // Catch:{ all -> 0x007f }
                r3 = 0
            L_0x0075:
                if (r3 >= r2) goto L_0x0081
                java.util.List r5 = r0.f9700c     // Catch:{ all -> 0x007f }
                r5.add(r1, r4)     // Catch:{ all -> 0x007f }
                int r3 = r3 + 1
                goto L_0x0075
            L_0x007f:
                r7 = move-exception
                goto L_0x00a3
            L_0x0081:
                int r1 = r0.f9701d     // Catch:{ all -> 0x007f }
                int r2 = r7.length()     // Catch:{ all -> 0x007f }
                int r1 = r1 - r2
                int r2 = r8.length()     // Catch:{ all -> 0x007f }
                int r1 = r1 + r2
                r0.f9701d = r1     // Catch:{ all -> 0x007f }
                int r1 = r0.f9702e     // Catch:{ all -> 0x007f }
                int r7 = r7.length()     // Catch:{ all -> 0x007f }
                int r1 = r1 - r7
                int r7 = r8.length()     // Catch:{ all -> 0x007f }
                int r1 = r1 + r7
                r0.f9702e = r1     // Catch:{ all -> 0x007f }
                l2.q r7 = l2.q.f14567a     // Catch:{ all -> 0x007f }
                r9.b(r4)
                return r7
            L_0x00a3:
                r9.b(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.o(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object p(char r6, android.graphics.PointF r7, kotlin.coroutines.c r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceCharacter$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceCharacter$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceCharacter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceCharacter$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceCharacter$1
                r0.<init>(r5, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                char r6 = r0.C$0
                java.lang.Object r7 = r0.L$2
                kotlinx.coroutines.sync.b r7 = (kotlinx.coroutines.sync.b) r7
                java.lang.Object r1 = r0.L$1
                android.graphics.PointF r1 = (android.graphics.PointF) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r8)
                r8 = r7
                r7 = r1
                goto L_0x0059
            L_0x003a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0042:
                kotlin.f.b(r8)
                kotlinx.coroutines.sync.b r8 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r7
                r0.L$2 = r8
                r0.C$0 = r6
                r0.label = r3
                java.lang.Object r0 = r8.a(r4, r0)
                if (r0 != r1) goto L_0x0058
                return r1
            L_0x0058:
                r0 = r5
            L_0x0059:
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x007a }
                int r2 = r0.f9701d     // Catch:{ all -> 0x007a }
                int r2 = r2 - r3
                char r6 = (char) r6     // Catch:{ all -> 0x007a }
                r1.setCharAt(r2, r6)     // Catch:{ all -> 0x007a }
                java.util.List r6 = r0.f9700c     // Catch:{ all -> 0x007a }
                int r1 = r0.f9701d     // Catch:{ all -> 0x007a }
                int r1 = r1 - r3
                r6.set(r1, r7)     // Catch:{ all -> 0x007a }
                java.util.Stack r6 = r0.f9703f     // Catch:{ all -> 0x007a }
                r6.clear()     // Catch:{ all -> 0x007a }
                java.util.Stack r6 = r0.f9704g     // Catch:{ all -> 0x007a }
                r6.clear()     // Catch:{ all -> 0x007a }
                l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x007a }
                r8.b(r4)
                return r6
            L_0x007a:
                r6 = move-exception
                r8.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.p(char, android.graphics.PointF, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object q(java.lang.String r7, kotlin.coroutines.c r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceEmoji$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceEmoji$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceEmoji$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceEmoji$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceEmoji$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.L$2
                kotlinx.coroutines.sync.b r7 = (kotlinx.coroutines.sync.b) r7
                java.lang.Object r1 = r0.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r8)
                goto L_0x0055
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                kotlin.f.b(r8)
                kotlinx.coroutines.sync.b r8 = r6.f9705h
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r0 = r8.a(r4, r0)
                if (r0 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r0 = r6
                r1 = r7
                r7 = r8
            L_0x0055:
                java.lang.String r8 = r0.d()     // Catch:{ all -> 0x0091 }
                int r2 = r1.length()     // Catch:{ all -> 0x0091 }
                android.graphics.PointF[] r2 = new android.graphics.PointF[r2]     // Catch:{ all -> 0x0091 }
                java.util.List r2 = kotlin.collections.C0713h.a0(r2)     // Catch:{ all -> 0x0091 }
                java.lang.StringBuilder r3 = r0.f9699b     // Catch:{ all -> 0x0091 }
                int r5 = r0.f9701d     // Catch:{ all -> 0x0091 }
                r3.insert(r5, r1)     // Catch:{ all -> 0x0091 }
                java.util.List r3 = r0.f9700c     // Catch:{ all -> 0x0091 }
                int r5 = r0.f9701d     // Catch:{ all -> 0x0091 }
                r3.addAll(r5, r2)     // Catch:{ all -> 0x0091 }
                int r2 = r0.f9701d     // Catch:{ all -> 0x0091 }
                int r3 = r1.length()     // Catch:{ all -> 0x0091 }
                int r2 = r2 + r3
                r0.f9701d = r2     // Catch:{ all -> 0x0091 }
                int r2 = r0.f9702e     // Catch:{ all -> 0x0091 }
                int r1 = r1.length()     // Catch:{ all -> 0x0091 }
                int r2 = r2 + r1
                r0.f9702e = r2     // Catch:{ all -> 0x0091 }
                java.util.Stack r1 = r0.f9703f     // Catch:{ all -> 0x0091 }
                r1.clear()     // Catch:{ all -> 0x0091 }
                java.util.Stack r0 = r0.f9704g     // Catch:{ all -> 0x0091 }
                r0.clear()     // Catch:{ all -> 0x0091 }
                r7.b(r4)
                return r8
            L_0x0091:
                r8 = move-exception
                r7.b(r4)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.q(java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object r(int r7, java.lang.String r8, int r9, int r10, kotlin.coroutines.c r11) {
            /*
                r6 = this;
                boolean r0 = r11 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceTailWith$1
                if (r0 == 0) goto L_0x0013
                r0 = r11
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceTailWith$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceTailWith$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceTailWith$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$replaceTailWith$1
                r0.<init>(r6, r11)
            L_0x0018:
                java.lang.Object r11 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                int r10 = r0.I$2
                int r9 = r0.I$1
                int r7 = r0.I$0
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.sync.b r8 = (kotlinx.coroutines.sync.b) r8
                java.lang.Object r1 = r0.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r11)
                r11 = r8
                r8 = r1
                goto L_0x0061
            L_0x003e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0046:
                kotlin.f.b(r11)
                kotlinx.coroutines.sync.b r11 = r6.f9705h
                r0.L$0 = r6
                r0.L$1 = r8
                r0.L$2 = r11
                r0.I$0 = r7
                r0.I$1 = r9
                r0.I$2 = r10
                r0.label = r3
                java.lang.Object r0 = r11.a(r4, r0)
                if (r0 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r0 = r6
            L_0x0061:
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x0084 }
                int r1 = r1.length()     // Catch:{ all -> 0x0084 }
                int r7 = java.lang.Math.min(r7, r1)     // Catch:{ all -> 0x0084 }
                r1 = 0
            L_0x006c:
                if (r1 >= r7) goto L_0x0087
                java.lang.StringBuilder r2 = r0.f9699b     // Catch:{ all -> 0x0084 }
                int r5 = r2.length()     // Catch:{ all -> 0x0084 }
                int r5 = r5 - r3
                r2.deleteCharAt(r5)     // Catch:{ all -> 0x0084 }
                java.util.List r2 = r0.f9700c     // Catch:{ all -> 0x0084 }
                int r5 = kotlin.collections.C0718m.l(r2)     // Catch:{ all -> 0x0084 }
                r2.remove(r5)     // Catch:{ all -> 0x0084 }
                int r1 = r1 + 1
                goto L_0x006c
            L_0x0084:
                r7 = move-exception
                goto L_0x0134
            L_0x0087:
                int r7 = r8.length()     // Catch:{ all -> 0x0084 }
                android.graphics.PointF[] r7 = new android.graphics.PointF[r7]     // Catch:{ all -> 0x0084 }
                java.util.List r7 = kotlin.collections.C0713h.a0(r7)     // Catch:{ all -> 0x0084 }
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x0084 }
                r1.append(r8)     // Catch:{ all -> 0x0084 }
                java.util.List r8 = r0.f9700c     // Catch:{ all -> 0x0084 }
                r8.addAll(r7)     // Catch:{ all -> 0x0084 }
                java.lang.StringBuilder r7 = r0.f9699b     // Catch:{ all -> 0x0084 }
                int r7 = r7.length()     // Catch:{ all -> 0x0084 }
                java.lang.String r8 = " and new content.length is "
                if (r9 > r7) goto L_0x010d
                java.lang.StringBuilder r7 = r0.f9699b     // Catch:{ all -> 0x0084 }
                int r7 = r7.length()     // Catch:{ all -> 0x0084 }
                if (r10 > r7) goto L_0x00e6
                if (r10 < r9) goto L_0x00c3
                r0.f9701d = r9     // Catch:{ all -> 0x0084 }
                r0.f9702e = r10     // Catch:{ all -> 0x0084 }
                java.util.Stack r7 = r0.f9703f     // Catch:{ all -> 0x0084 }
                r7.clear()     // Catch:{ all -> 0x0084 }
                java.util.Stack r7 = r0.f9704g     // Catch:{ all -> 0x0084 }
                r7.clear()     // Catch:{ all -> 0x0084 }
                l2.q r7 = l2.q.f14567a     // Catch:{ all -> 0x0084 }
                r11.b(r4)
                return r7
            L_0x00c3:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
                r7.<init>()     // Catch:{ all -> 0x0084 }
                java.lang.String r8 = "End cursor position must be greater or equal to start cursor position. end is "
                r7.append(r8)     // Catch:{ all -> 0x0084 }
                r7.append(r10)     // Catch:{ all -> 0x0084 }
                java.lang.String r8 = " and start is "
                r7.append(r8)     // Catch:{ all -> 0x0084 }
                r7.append(r9)     // Catch:{ all -> 0x0084 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0084 }
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0084 }
                r8.<init>(r7)     // Catch:{ all -> 0x0084 }
                throw r8     // Catch:{ all -> 0x0084 }
            L_0x00e6:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
                r7.<init>()     // Catch:{ all -> 0x0084 }
                java.lang.String r9 = "End cursor position must be smaller or equal to input field's new content length. end is "
                r7.append(r9)     // Catch:{ all -> 0x0084 }
                r7.append(r10)     // Catch:{ all -> 0x0084 }
                r7.append(r8)     // Catch:{ all -> 0x0084 }
                java.lang.StringBuilder r8 = r0.f9699b     // Catch:{ all -> 0x0084 }
                int r8 = r8.length()     // Catch:{ all -> 0x0084 }
                r7.append(r8)     // Catch:{ all -> 0x0084 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0084 }
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0084 }
                r8.<init>(r7)     // Catch:{ all -> 0x0084 }
                throw r8     // Catch:{ all -> 0x0084 }
            L_0x010d:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
                r7.<init>()     // Catch:{ all -> 0x0084 }
                java.lang.String r10 = "Start cursor position must be smaller or equal to input field's new content length. start is "
                r7.append(r10)     // Catch:{ all -> 0x0084 }
                r7.append(r9)     // Catch:{ all -> 0x0084 }
                r7.append(r8)     // Catch:{ all -> 0x0084 }
                java.lang.StringBuilder r8 = r0.f9699b     // Catch:{ all -> 0x0084 }
                int r8 = r8.length()     // Catch:{ all -> 0x0084 }
                r7.append(r8)     // Catch:{ all -> 0x0084 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0084 }
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0084 }
                r8.<init>(r7)     // Catch:{ all -> 0x0084 }
                throw r8     // Catch:{ all -> 0x0084 }
            L_0x0134:
                r11.b(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.r(int, java.lang.String, int, int, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object s(int r8, kotlin.coroutines.c r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$restoreCharacters$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$restoreCharacters$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$restoreCharacters$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$restoreCharacters$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$restoreCharacters$1
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                int r8 = r0.I$0
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r9)
                goto L_0x0052
            L_0x0034:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003c:
                kotlin.f.b(r9)
                kotlinx.coroutines.sync.b r9 = r7.f9705h
                r0.L$0 = r7
                r0.L$1 = r9
                r0.I$0 = r8
                r0.label = r3
                java.lang.Object r0 = r9.a(r4, r0)
                if (r0 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r0 = r7
                r1 = r9
            L_0x0052:
                java.util.Stack r9 = r0.f9704g     // Catch:{ all -> 0x005d }
                int r9 = r9.size()     // Catch:{ all -> 0x005d }
                if (r9 >= r3) goto L_0x005f
                java.lang.String r8 = ""
                goto L_0x00b0
            L_0x005d:
                r8 = move-exception
                goto L_0x00b4
            L_0x005f:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r9.<init>()     // Catch:{ all -> 0x005d }
            L_0x0064:
                if (r8 <= 0) goto L_0x00a7
                java.util.Stack r2 = r0.f9704g     // Catch:{ all -> 0x005d }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x005d }
                if (r2 != 0) goto L_0x00a7
                java.util.Stack r2 = r0.f9704g     // Catch:{ all -> 0x005d }
                java.lang.Object r2 = r2.pop()     // Catch:{ all -> 0x005d }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r3 = r0.f9699b     // Catch:{ all -> 0x005d }
                int r5 = r0.f9701d     // Catch:{ all -> 0x005d }
                r3.insert(r5, r2)     // Catch:{ all -> 0x005d }
                java.util.Stack r3 = r0.f9703f     // Catch:{ all -> 0x005d }
                java.lang.Object r3 = r3.pop()     // Catch:{ all -> 0x005d }
                java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x005d }
                java.util.List r5 = r0.f9700c     // Catch:{ all -> 0x005d }
                int r6 = r0.f9701d     // Catch:{ all -> 0x005d }
                kotlin.jvm.internal.o.b(r3)     // Catch:{ all -> 0x005d }
                r5.addAll(r6, r3)     // Catch:{ all -> 0x005d }
                r9.append(r2)     // Catch:{ all -> 0x005d }
                int r3 = r0.f9701d     // Catch:{ all -> 0x005d }
                int r5 = r2.length()     // Catch:{ all -> 0x005d }
                int r3 = r3 + r5
                r0.f9701d = r3     // Catch:{ all -> 0x005d }
                int r3 = r0.f9702e     // Catch:{ all -> 0x005d }
                int r2 = r2.length()     // Catch:{ all -> 0x005d }
                int r3 = r3 + r2
                r0.f9702e = r3     // Catch:{ all -> 0x005d }
                int r8 = r8 + -1
                goto L_0x0064
            L_0x00a7:
                java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x005d }
                java.lang.String r9 = "toString(...)"
                kotlin.jvm.internal.o.d(r8, r9)     // Catch:{ all -> 0x005d }
            L_0x00b0:
                r1.b(r4)
                return r8
            L_0x00b4:
                r1.b(r4)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.s(int, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object t(java.lang.CharSequence r6, int r7, int r8, kotlin.coroutines.c r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCurrentTextAndCursorPosition$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCurrentTextAndCursorPosition$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCurrentTextAndCursorPosition$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCurrentTextAndCursorPosition$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCurrentTextAndCursorPosition$1
                r0.<init>(r5, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0044
                if (r2 != r3) goto L_0x003c
                int r8 = r0.I$1
                int r7 = r0.I$0
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.b) r6
                java.lang.Object r1 = r0.L$1
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r9)
                r9 = r6
                r6 = r1
                goto L_0x005d
            L_0x003c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0044:
                kotlin.f.b(r9)
                kotlinx.coroutines.sync.b r9 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r9
                r0.I$0 = r7
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r0 = r9.a(r4, r0)
                if (r0 != r1) goto L_0x005c
                return r1
            L_0x005c:
                r0 = r5
            L_0x005d:
                r1 = -1
                if (r7 <= r1) goto L_0x0112
                int r1 = r6.length()     // Catch:{ all -> 0x0098 }
                java.lang.String r2 = " and new content.length is "
                if (r7 > r1) goto L_0x00ed
                int r1 = r6.length()     // Catch:{ all -> 0x0098 }
                if (r8 > r1) goto L_0x00c8
                if (r8 < r7) goto L_0x00a5
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x0098 }
                kotlin.text.o.i(r1)     // Catch:{ all -> 0x0098 }
                java.util.Stack r1 = r0.f9704g     // Catch:{ all -> 0x0098 }
                r1.clear()     // Catch:{ all -> 0x0098 }
                java.util.List r1 = r0.f9700c     // Catch:{ all -> 0x0098 }
                r1.clear()     // Catch:{ all -> 0x0098 }
                java.util.Stack r1 = r0.f9703f     // Catch:{ all -> 0x0098 }
                r1.clear()     // Catch:{ all -> 0x0098 }
                java.lang.StringBuilder r1 = r0.f9699b     // Catch:{ all -> 0x0098 }
                r1.append(r6)     // Catch:{ all -> 0x0098 }
                int r6 = r6.length()     // Catch:{ all -> 0x0098 }
                r1 = 0
            L_0x008e:
                if (r1 >= r6) goto L_0x009b
                java.util.List r2 = r0.f9700c     // Catch:{ all -> 0x0098 }
                r2.add(r4)     // Catch:{ all -> 0x0098 }
                int r1 = r1 + 1
                goto L_0x008e
            L_0x0098:
                r6 = move-exception
                goto L_0x012d
            L_0x009b:
                r0.f9701d = r7     // Catch:{ all -> 0x0098 }
                r0.f9702e = r8     // Catch:{ all -> 0x0098 }
                l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x0098 }
                r9.b(r4)
                return r6
            L_0x00a5:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
                r6.<init>()     // Catch:{ all -> 0x0098 }
                java.lang.String r0 = "End cursor position must be greater or equal to start cursor position. end is "
                r6.append(r0)     // Catch:{ all -> 0x0098 }
                r6.append(r8)     // Catch:{ all -> 0x0098 }
                java.lang.String r8 = " and start is "
                r6.append(r8)     // Catch:{ all -> 0x0098 }
                r6.append(r7)     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0098 }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0098 }
                r7.<init>(r6)     // Catch:{ all -> 0x0098 }
                throw r7     // Catch:{ all -> 0x0098 }
            L_0x00c8:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
                r7.<init>()     // Catch:{ all -> 0x0098 }
                java.lang.String r0 = "End cursor position must be smaller or equal to input field's new content length. end is "
                r7.append(r0)     // Catch:{ all -> 0x0098 }
                r7.append(r8)     // Catch:{ all -> 0x0098 }
                r7.append(r2)     // Catch:{ all -> 0x0098 }
                int r6 = r6.length()     // Catch:{ all -> 0x0098 }
                r7.append(r6)     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0098 }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0098 }
                r7.<init>(r6)     // Catch:{ all -> 0x0098 }
                throw r7     // Catch:{ all -> 0x0098 }
            L_0x00ed:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
                r8.<init>()     // Catch:{ all -> 0x0098 }
                java.lang.String r0 = "Start cursor position must be smaller or equal to input field's new content length. start is "
                r8.append(r0)     // Catch:{ all -> 0x0098 }
                r8.append(r7)     // Catch:{ all -> 0x0098 }
                r8.append(r2)     // Catch:{ all -> 0x0098 }
                int r6 = r6.length()     // Catch:{ all -> 0x0098 }
                r8.append(r6)     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0098 }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0098 }
                r7.<init>(r6)     // Catch:{ all -> 0x0098 }
                throw r7     // Catch:{ all -> 0x0098 }
            L_0x0112:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
                r6.<init>()     // Catch:{ all -> 0x0098 }
                java.lang.String r8 = "Start cursor position must be greater than -1. start is "
                r6.append(r8)     // Catch:{ all -> 0x0098 }
                r6.append(r7)     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0098 }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0098 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0098 }
                r7.<init>(r6)     // Catch:{ all -> 0x0098 }
                throw r7     // Catch:{ all -> 0x0098 }
            L_0x012d:
                r9.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.t(java.lang.CharSequence, int, int, kotlin.coroutines.c):java.lang.Object");
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object u(int r6, int r7, kotlin.coroutines.c r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCursorPosition$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCursorPosition$1 r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCursorPosition$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCursorPosition$1 r0 = new ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState$setCursorPosition$1
                r0.<init>(r5, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r7 = r0.I$1
                int r6 = r0.I$0
                java.lang.Object r1 = r0.L$1
                kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
                java.lang.Object r0 = r0.L$0
                ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r0 = (ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState) r0
                kotlin.f.b(r8)
                goto L_0x0056
            L_0x0036:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003e:
                kotlin.f.b(r8)
                kotlinx.coroutines.sync.b r8 = r5.f9705h
                r0.L$0 = r5
                r0.L$1 = r8
                r0.I$0 = r6
                r0.I$1 = r7
                r0.label = r3
                java.lang.Object r0 = r8.a(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
                r1 = r8
            L_0x0056:
                java.lang.StringBuilder r8 = r0.f9699b     // Catch:{ all -> 0x007e }
                int r8 = r8.length()     // Catch:{ all -> 0x007e }
                java.lang.String r2 = " and content.length is "
                if (r6 > r8) goto L_0x00ca
                java.lang.StringBuilder r8 = r0.f9699b     // Catch:{ all -> 0x007e }
                int r8 = r8.length()     // Catch:{ all -> 0x007e }
                if (r7 > r8) goto L_0x00a3
                if (r7 < r6) goto L_0x0080
                r0.f9701d = r6     // Catch:{ all -> 0x007e }
                r0.f9702e = r7     // Catch:{ all -> 0x007e }
                java.util.Stack r6 = r0.f9704g     // Catch:{ all -> 0x007e }
                r6.clear()     // Catch:{ all -> 0x007e }
                java.util.Stack r6 = r0.f9703f     // Catch:{ all -> 0x007e }
                r6.clear()     // Catch:{ all -> 0x007e }
                l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x007e }
                r1.b(r4)
                return r6
            L_0x007e:
                r6 = move-exception
                goto L_0x00f1
            L_0x0080:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r8.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r0 = "End cursor position must be greater or equal to start cursor position. end is "
                r8.append(r0)     // Catch:{ all -> 0x007e }
                r8.append(r7)     // Catch:{ all -> 0x007e }
                java.lang.String r7 = " and start is "
                r8.append(r7)     // Catch:{ all -> 0x007e }
                r8.append(r6)     // Catch:{ all -> 0x007e }
                java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x007e }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007e }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007e }
                r7.<init>(r6)     // Catch:{ all -> 0x007e }
                throw r7     // Catch:{ all -> 0x007e }
            L_0x00a3:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r6.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r8 = "End cursor position must be smaller or equal to input field's content length. end is "
                r6.append(r8)     // Catch:{ all -> 0x007e }
                r6.append(r7)     // Catch:{ all -> 0x007e }
                r6.append(r2)     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r7 = r0.f9699b     // Catch:{ all -> 0x007e }
                int r7 = r7.length()     // Catch:{ all -> 0x007e }
                r6.append(r7)     // Catch:{ all -> 0x007e }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007e }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007e }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007e }
                r7.<init>(r6)     // Catch:{ all -> 0x007e }
                throw r7     // Catch:{ all -> 0x007e }
            L_0x00ca:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r7.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r8 = "Start cursor position must be smaller or equal to input field's content length. start is "
                r7.append(r8)     // Catch:{ all -> 0x007e }
                r7.append(r6)     // Catch:{ all -> 0x007e }
                r7.append(r2)     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r6 = r0.f9699b     // Catch:{ all -> 0x007e }
                int r6 = r6.length()     // Catch:{ all -> 0x007e }
                r7.append(r6)     // Catch:{ all -> 0x007e }
                java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x007e }
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007e }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007e }
                r7.<init>(r6)     // Catch:{ all -> 0x007e }
                throw r7     // Catch:{ all -> 0x007e }
            L_0x00f1:
                r1.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController.InputFieldState.u(int, int, kotlin.coroutines.c):java.lang.Object");
        }

        public final void v(List list) {
            o.e(list, "emojis");
            this.f9706i = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/wrio/input/DefaultInputConnectionController$ProcessCorrectionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ProcessCorrectionException extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProcessCorrectionException(String str) {
            super(str);
            o.e(str, "message");
        }
    }

    private static abstract class a {

        /* renamed from: ch.icoaching.wrio.input.DefaultInputConnectionController$a$a  reason: collision with other inner class name */
        public static final class C0152a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0152a f9707a = new C0152a();

            private C0152a() {
                super((kotlin.jvm.internal.i) null);
            }
        }

        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f9708a = new b();

            private b() {
                super((kotlin.jvm.internal.i) null);
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f9709a;

            public c(int i4) {
                super((kotlin.jvm.internal.i) null);
                this.f9709a = i4;
            }

            public final int a() {
                return this.f9709a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f9709a == ((c) obj).f9709a;
            }

            public int hashCode() {
                return this.f9709a;
            }

            public String toString() {
                return "DeleteInputEvent(count=" + this.f9709a + ')';
            }
        }

        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f9710a = new d();

            private d() {
                super((kotlin.jvm.internal.i) null);
            }
        }

        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f9711a = new e();

            private e() {
                super((kotlin.jvm.internal.i) null);
            }
        }

        public static final class f extends a {

            /* renamed from: a  reason: collision with root package name */
            private final char f9712a;

            /* renamed from: b  reason: collision with root package name */
            private final PointF f9713b;

            public f(char c4, PointF pointF) {
                super((kotlin.jvm.internal.i) null);
                this.f9712a = c4;
                this.f9713b = pointF;
            }

            public final char a() {
                return this.f9712a;
            }

            public final PointF b() {
                return this.f9713b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f9712a == fVar.f9712a && kotlin.jvm.internal.o.a(this.f9713b, fVar.f9713b);
            }

            public int hashCode() {
                int i4 = this.f9712a * 31;
                PointF pointF = this.f9713b;
                return i4 + (pointF == null ? 0 : pointF.hashCode());
            }

            public String toString() {
                return "InsertCharacterInputEvent(char=" + this.f9712a + ", touchPoint=" + this.f9713b + ')';
            }
        }

        public static final class g extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f9714a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super((kotlin.jvm.internal.i) null);
                kotlin.jvm.internal.o.e(str, "emoji");
                this.f9714a = str;
            }

            public final String a() {
                return this.f9714a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && kotlin.jvm.internal.o.a(this.f9714a, ((g) obj).f9714a);
            }

            public int hashCode() {
                return this.f9714a.hashCode();
            }

            public String toString() {
                return "InsertEmojiInputEvent(emoji=" + this.f9714a + ')';
            }
        }

        public static final class h extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f9715a;

            public h(int i4) {
                super((kotlin.jvm.internal.i) null);
                this.f9715a = i4;
            }

            public final int a() {
                return this.f9715a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f9715a == ((h) obj).f9715a;
            }

            public int hashCode() {
                return this.f9715a;
            }

            public String toString() {
                return "MoveCursorInputEvent(count=" + this.f9715a + ')';
            }
        }

        public static final class i extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f9716a;

            /* renamed from: b  reason: collision with root package name */
            private final String f9717b;

            /* renamed from: c  reason: collision with root package name */
            private final String f9718c;

            /* renamed from: d  reason: collision with root package name */
            private final PredictionsResult.Candidate.Type f9719d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public i(int i4, String str, String str2, PredictionsResult.Candidate.Type type) {
                super((kotlin.jvm.internal.i) null);
                kotlin.jvm.internal.o.e(str, "originalWordStart");
                kotlin.jvm.internal.o.e(str2, "prediction");
                kotlin.jvm.internal.o.e(type, "type");
                this.f9716a = i4;
                this.f9717b = str;
                this.f9718c = str2;
                this.f9719d = type;
            }

            public final String a() {
                return this.f9717b;
            }

            public final String b() {
                return this.f9718c;
            }

            public final int c() {
                return this.f9716a;
            }

            public final PredictionsResult.Candidate.Type d() {
                return this.f9719d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.f9716a == iVar.f9716a && kotlin.jvm.internal.o.a(this.f9717b, iVar.f9717b) && kotlin.jvm.internal.o.a(this.f9718c, iVar.f9718c) && this.f9719d == iVar.f9719d;
            }

            public int hashCode() {
                return (((((this.f9716a * 31) + this.f9717b.hashCode()) * 31) + this.f9718c.hashCode()) * 31) + this.f9719d.hashCode();
            }

            public String toString() {
                return "ProcessPredictionInputEvent(startIndex=" + this.f9716a + ", originalWordStart=" + this.f9717b + ", prediction=" + this.f9718c + ", type=" + this.f9719d + ')';
            }
        }

        public static final class j extends a {

            /* renamed from: a  reason: collision with root package name */
            private final char f9720a;

            /* renamed from: b  reason: collision with root package name */
            private final PointF f9721b;

            public j(char c4, PointF pointF) {
                super((kotlin.jvm.internal.i) null);
                this.f9720a = c4;
                this.f9721b = pointF;
            }

            public final char a() {
                return this.f9720a;
            }

            public final PointF b() {
                return this.f9721b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f9720a == jVar.f9720a && kotlin.jvm.internal.o.a(this.f9721b, jVar.f9721b);
            }

            public int hashCode() {
                int i4 = this.f9720a * 31;
                PointF pointF = this.f9721b;
                return i4 + (pointF == null ? 0 : pointF.hashCode());
            }

            public String toString() {
                return "ReplaceCharacterInputEvent(char=" + this.f9720a + ", touchPoint=" + this.f9721b + ')';
            }
        }

        public static final class k extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f9722a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public k(String str) {
                super((kotlin.jvm.internal.i) null);
                kotlin.jvm.internal.o.e(str, "replacementText");
                this.f9722a = str;
            }

            public final String a() {
                return this.f9722a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && kotlin.jvm.internal.o.a(this.f9722a, ((k) obj).f9722a);
            }

            public int hashCode() {
                return this.f9722a.hashCode();
            }

            public String toString() {
                return "ReplaceCurrentTextEvent(replacementText=" + this.f9722a + ')';
            }
        }

        public static final class l extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f9723a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public l(String str) {
                super((kotlin.jvm.internal.i) null);
                kotlin.jvm.internal.o.e(str, "emoji");
                this.f9723a = str;
            }

            public final String a() {
                return this.f9723a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && kotlin.jvm.internal.o.a(this.f9723a, ((l) obj).f9723a);
            }

            public int hashCode() {
                return this.f9723a.hashCode();
            }

            public String toString() {
                return "ReplaceEmojiInputEvent(emoji=" + this.f9723a + ')';
            }
        }

        public static final class m extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f9724a;

            public m(int i4) {
                super((kotlin.jvm.internal.i) null);
                this.f9724a = i4;
            }

            public final int a() {
                return this.f9724a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.f9724a == ((m) obj).f9724a;
            }

            public int hashCode() {
                return this.f9724a;
            }

            public String toString() {
                return "RestoreInputEvent(count=" + this.f9724a + ')';
            }
        }

        public static final class n extends a {

            /* renamed from: a  reason: collision with root package name */
            private final PointF f9725a;

            public n(PointF pointF) {
                super((kotlin.jvm.internal.i) null);
                this.f9725a = pointF;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && kotlin.jvm.internal.o.a(this.f9725a, ((n) obj).f9725a);
            }

            public int hashCode() {
                PointF pointF = this.f9725a;
                if (pointF == null) {
                    return 0;
                }
                return pointF.hashCode();
            }

            public String toString() {
                return "ReturnSwipeUpInputEvent(touchPoint=" + this.f9725a + ')';
            }
        }

        public static final class o extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f9726a;

            /* renamed from: b  reason: collision with root package name */
            private final int f9727b;

            /* renamed from: c  reason: collision with root package name */
            private final int f9728c;

            /* renamed from: d  reason: collision with root package name */
            private final int f9729d;

            /* renamed from: e  reason: collision with root package name */
            private final int f9730e;

            /* renamed from: f  reason: collision with root package name */
            private final int f9731f;

            /* renamed from: g  reason: collision with root package name */
            private final boolean f9732g;

            public o(int i4, int i5, int i6, int i7, int i8, int i9, boolean z3) {
                super((kotlin.jvm.internal.i) null);
                this.f9726a = i4;
                this.f9727b = i5;
                this.f9728c = i6;
                this.f9729d = i7;
                this.f9730e = i8;
                this.f9731f = i9;
                this.f9732g = z3;
            }

            public final int a() {
                return this.f9729d;
            }

            public final int b() {
                return this.f9728c;
            }

            public final int c() {
                return this.f9727b;
            }

            public final int d() {
                return this.f9726a;
            }

            public final boolean e() {
                return this.f9732g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return this.f9726a == oVar.f9726a && this.f9727b == oVar.f9727b && this.f9728c == oVar.f9728c && this.f9729d == oVar.f9729d && this.f9730e == oVar.f9730e && this.f9731f == oVar.f9731f && this.f9732g == oVar.f9732g;
            }

            public int hashCode() {
                return (((((((((((this.f9726a * 31) + this.f9727b) * 31) + this.f9728c) * 31) + this.f9729d) * 31) + this.f9730e) * 31) + this.f9731f) * 31) + androidx.work.c.a(this.f9732g);
            }

            public String toString() {
                return "UpdateSelectionInputEvent(oldSelectionStart=" + this.f9726a + ", oldSelectionEnd=" + this.f9727b + ", newSelectionStart=" + this.f9728c + ", newSelectionEnd=" + this.f9729d + ", candidatesStart=" + this.f9730e + ", candidatesEnd=" + this.f9731f + ", isFromUser=" + this.f9732g + ')';
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public DefaultInputConnectionController(Context context, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, D d4, c cVar, i iVar, ch.icoaching.wrio.data.c cVar2, h hVar, C0489b bVar, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(context, "applicationContext");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(coroutineDispatcher2, "mainDispatcher");
        o.e(d4, "serviceScope");
        o.e(cVar, "specialInputHandler");
        o.e(iVar, "inputFieldWordCounters");
        o.e(cVar2, "languageSettings");
        o.e(hVar, "dictionarySettings");
        o.e(bVar, "databaseHandler");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9664a = context;
        this.f9665b = coroutineDispatcher;
        this.f9666c = coroutineDispatcher2;
        this.f9667d = d4;
        this.f9668e = cVar;
        this.f9669f = iVar;
        this.f9670g = cVar2;
        this.f9671h = hVar;
        this.f9672i = bVar;
        this.f9673j = aILibrarySingletonProvider;
        d b4 = f.b(-2, (BufferOverflow) null, (l) null, 6, (Object) null);
        this.f9674k = b4;
        Pattern compile = Pattern.compile("[#*0-9]\\x{FE0F}?\\x{20E3}|[\\xA9\\xAE\\x{203C}\\x{2049}\\x{2122}\\x{2139}\\x{2194}-\\x{2199}\\x{21A9}\\x{21AA}\\x{231A}\\x{231B}\\x{2328}\\x{23CF}\\x{23ED}-\\x{23EF}\\x{23F1}\\x{23F2}\\x{23F8}-\\x{23FA}\\x{24C2}\\x{25AA}\\x{25AB}\\x{25B6}\\x{25C0}\\x{25FB}\\x{25FC}\\x{25FE}\\x{2600}-\\x{2604}\\x{260E}\\x{2611}\\x{2614}\\x{2615}\\x{2618}\\x{2620}\\x{2622}\\x{2623}\\x{2626}\\x{262A}\\x{262E}\\x{262F}\\x{2638}-\\x{263A}\\x{2640}\\x{2642}\\x{2648}-\\x{2653}\\x{265F}\\x{2660}\\x{2663}\\x{2665}\\x{2666}\\x{2668}\\x{267B}\\x{267E}\\x{267F}\\x{2692}\\x{2694}-\\x{2697}\\x{2699}\\x{269B}\\x{269C}\\x{26A0}\\x{26A7}\\x{26AA}\\x{26B0}\\x{26B1}\\x{26BD}\\x{26BE}\\x{26C4}\\x{26C8}\\x{26CF}\\x{26D1}\\x{26D3}\\x{26E9}\\x{26F0}-\\x{26F5}\\x{26F7}\\x{26F8}\\x{26FA}\\x{2702}\\x{2708}\\x{2709}\\x{270F}\\x{2712}\\x{2714}\\x{2716}\\x{271D}\\x{2721}\\x{2733}\\x{2734}\\x{2744}\\x{2747}\\x{2757}\\x{2763}\\x{27A1}\\x{2934}\\x{2935}\\x{2B05}-\\x{2B07}\\x{2B1B}\\x{2B1C}\\x{2B55}\\x{3030}\\x{303D}\\x{3297}\\x{3299}\\x{1F004}\\x{1F170}\\x{1F171}\\x{1F17E}\\x{1F17F}\\x{1F202}\\x{1F237}\\x{1F321}\\x{1F324}-\\x{1F32C}\\x{1F336}\\x{1F37D}\\x{1F396}\\x{1F397}\\x{1F399}-\\x{1F39B}\\x{1F39E}\\x{1F39F}\\x{1F3CD}\\x{1F3CE}\\x{1F3D4}-\\x{1F3DF}\\x{1F3F5}\\x{1F3F7}\\x{1F43F}\\x{1F4FD}\\x{1F549}\\x{1F54A}\\x{1F56F}\\x{1F570}\\x{1F573}\\x{1F576}-\\x{1F579}\\x{1F587}\\x{1F58A}-\\x{1F58D}\\x{1F5A5}\\x{1F5A8}\\x{1F5B1}\\x{1F5B2}\\x{1F5BC}\\x{1F5C2}-\\x{1F5C4}\\x{1F5D1}-\\x{1F5D3}\\x{1F5DC}-\\x{1F5DE}\\x{1F5E1}\\x{1F5E3}\\x{1F5E8}\\x{1F5EF}\\x{1F5F3}\\x{1F5FA}\\x{1F6CB}\\x{1F6CD}-\\x{1F6CF}\\x{1F6E0}-\\x{1F6E5}\\x{1F6E9}\\x{1F6F0}\\x{1F6F3}]\\x{FE0F}?|[\\x{261D}\\x{270C}\\x{270D}\\x{1F574}\\x{1F590}][\\x{FE0F}\\x{1F3FB}-\\x{1F3FF}]?|[\\x{26F9}\\x{1F3CB}\\x{1F3CC}\\x{1F575}][\\x{FE0F}\\x{1F3FB}-\\x{1F3FF}]?(?:\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|[\\x{270A}\\x{270B}\\x{1F385}\\x{1F3C2}\\x{1F3C7}\\x{1F442}\\x{1F443}\\x{1F446}-\\x{1F450}\\x{1F466}\\x{1F467}\\x{1F46B}-\\x{1F46D}\\x{1F472}\\x{1F474}-\\x{1F476}\\x{1F478}\\x{1F47C}\\x{1F483}\\x{1F485}\\x{1F48F}\\x{1F491}\\x{1F4AA}\\x{1F57A}\\x{1F595}\\x{1F596}\\x{1F64C}\\x{1F64F}\\x{1F6C0}\\x{1F6CC}\\x{1F90C}\\x{1F90F}\\x{1F918}-\\x{1F91F}\\x{1F930}-\\x{1F934}\\x{1F936}\\x{1F977}\\x{1F9B5}\\x{1F9B6}\\x{1F9BB}\\x{1F9D2}\\x{1F9D3}\\x{1F9D5}\\x{1FAC3}-\\x{1FAC5}\\x{1FAF0}\\x{1FAF2}-\\x{1FAF8}][\\x{1F3FB}-\\x{1F3FF}]?|[\\x{1F3C3}\\x{1F3C4}\\x{1F3CA}\\x{1F46E}\\x{1F470}\\x{1F471}\\x{1F473}\\x{1F477}\\x{1F481}\\x{1F482}\\x{1F486}\\x{1F487}\\x{1F645}-\\x{1F647}\\x{1F64B}\\x{1F64D}\\x{1F64E}\\x{1F6A3}\\x{1F6B4}-\\x{1F6B6}\\x{1F926}\\x{1F935}\\x{1F937}-\\x{1F939}\\x{1F93D}\\x{1F93E}\\x{1F9B8}\\x{1F9B9}\\x{1F9CD}-\\x{1F9CF}\\x{1F9D4}\\x{1F9D6}-\\x{1F9DD}][\\x{1F3FB}-\\x{1F3FF}]?(?:\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|[\\x{1F408}\\x{1F426}](?:\\x{200D}\\x{2B1B})?|[\\x{1F46F}\\x{1F9DE}\\x{1F9DF}](?:\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|[\\x{23E9}-\\x{23EC}\\x{23F0}\\x{23F3}\\x{25FD}\\x{2693}\\x{26A1}\\x{26AB}\\x{26C5}\\x{26CE}\\x{26D4}\\x{26EA}\\x{26FD}\\x{2705}\\x{2728}\\x{274C}\\x{274E}\\x{2753}-\\x{2755}\\x{2795}-\\x{2797}\\x{27B0}\\x{27BF}\\x{2B50}\\x{1F0CF}\\x{1F18E}\\x{1F191}-\\x{1F19A}\\x{1F201}\\x{1F21A}\\x{1F22F}\\x{1F232}-\\x{1F236}\\x{1F238}-\\x{1F23A}\\x{1F250}\\x{1F251}\\x{1F300}-\\x{1F320}\\x{1F32D}-\\x{1F335}\\x{1F337}-\\x{1F37C}\\x{1F37E}-\\x{1F384}\\x{1F386}-\\x{1F393}\\x{1F3A0}-\\x{1F3C1}\\x{1F3C5}\\x{1F3C6}\\x{1F3C8}\\x{1F3C9}\\x{1F3CF}-\\x{1F3D3}\\x{1F3E0}-\\x{1F3F0}\\x{1F3F8}-\\x{1F407}\\x{1F409}-\\x{1F414}\\x{1F416}-\\x{1F425}\\x{1F427}-\\x{1F43A}\\x{1F43C}-\\x{1F43E}\\x{1F440}\\x{1F444}\\x{1F445}\\x{1F451}-\\x{1F465}\\x{1F46A}\\x{1F479}-\\x{1F47B}\\x{1F47D}-\\x{1F480}\\x{1F484}\\x{1F488}-\\x{1F48E}\\x{1F490}\\x{1F492}-\\x{1F4A9}\\x{1F4AB}-\\x{1F4FC}\\x{1F4FF}-\\x{1F53D}\\x{1F54B}-\\x{1F54E}\\x{1F550}-\\x{1F567}\\x{1F5A4}\\x{1F5FB}-\\x{1F62D}\\x{1F62F}-\\x{1F634}\\x{1F637}-\\x{1F644}\\x{1F648}-\\x{1F64A}\\x{1F680}-\\x{1F6A2}\\x{1F6A4}-\\x{1F6B3}\\x{1F6B7}-\\x{1F6BF}\\x{1F6C1}-\\x{1F6C5}\\x{1F6D0}-\\x{1F6D2}\\x{1F6D5}-\\x{1F6D7}\\x{1F6DC}-\\x{1F6DF}\\x{1F6EB}\\x{1F6EC}\\x{1F6F4}-\\x{1F6FC}\\x{1F7E0}-\\x{1F7EB}\\x{1F7F0}\\x{1F90D}\\x{1F90E}\\x{1F910}-\\x{1F917}\\x{1F920}-\\x{1F925}\\x{1F927}-\\x{1F92F}\\x{1F93A}\\x{1F93F}-\\x{1F945}\\x{1F947}-\\x{1F976}\\x{1F978}-\\x{1F9B4}\\x{1F9B7}\\x{1F9BA}\\x{1F9BC}-\\x{1F9CC}\\x{1F9D0}\\x{1F9E0}-\\x{1F9FF}\\x{1FA70}-\\x{1FA7C}\\x{1FA80}-\\x{1FA88}\\x{1FA90}-\\x{1FABD}\\x{1FABF}-\\x{1FAC2}\\x{1FACE}-\\x{1FADB}\\x{1FAE0}-\\x{1FAE8}]|\\x{2764}\\x{FE0F}?(?:\\x{200D}[\\x{1F525}\\x{1FA79}])?|\\x{1F1E6}[\\x{1F1E8}-\\x{1F1EC}\\x{1F1EE}\\x{1F1F1}\\x{1F1F2}\\x{1F1F4}\\x{1F1F6}-\\x{1F1FA}\\x{1F1FC}\\x{1F1FD}\\x{1F1FF}]|\\x{1F1E7}[\\x{1F1E6}\\x{1F1E7}\\x{1F1E9}-\\x{1F1EF}\\x{1F1F1}-\\x{1F1F4}\\x{1F1F6}-\\x{1F1F9}\\x{1F1FB}\\x{1F1FC}\\x{1F1FE}\\x{1F1FF}]|\\x{1F1E8}[\\x{1F1E6}\\x{1F1E8}\\x{1F1E9}\\x{1F1EB}-\\x{1F1EE}\\x{1F1F0}-\\x{1F1F5}\\x{1F1F7}\\x{1F1FA}-\\x{1F1FF}]|\\x{1F1E9}[\\x{1F1EA}\\x{1F1EC}\\x{1F1EF}\\x{1F1F0}\\x{1F1F2}\\x{1F1F4}\\x{1F1FF}]|\\x{1F1EA}[\\x{1F1E6}\\x{1F1E8}\\x{1F1EA}\\x{1F1EC}\\x{1F1ED}\\x{1F1F7}-\\x{1F1FA}]|\\x{1F1EB}[\\x{1F1EE}-\\x{1F1F0}\\x{1F1F2}\\x{1F1F4}\\x{1F1F7}]|\\x{1F1EC}[\\x{1F1E6}\\x{1F1E7}\\x{1F1E9}-\\x{1F1EE}\\x{1F1F1}-\\x{1F1F3}\\x{1F1F5}-\\x{1F1FA}\\x{1F1FC}\\x{1F1FE}]|\\x{1F1ED}[\\x{1F1F0}\\x{1F1F2}\\x{1F1F3}\\x{1F1F7}\\x{1F1F9}\\x{1F1FA}]|\\x{1F1EE}[\\x{1F1E8}-\\x{1F1EA}\\x{1F1F1}-\\x{1F1F4}\\x{1F1F6}-\\x{1F1F9}]|\\x{1F1EF}[\\x{1F1EA}\\x{1F1F2}\\x{1F1F4}\\x{1F1F5}]|\\x{1F1F0}[\\x{1F1EA}\\x{1F1EC}-\\x{1F1EE}\\x{1F1F2}\\x{1F1F3}\\x{1F1F5}\\x{1F1F7}\\x{1F1FC}\\x{1F1FE}\\x{1F1FF}]|\\x{1F1F1}[\\x{1F1E6}-\\x{1F1E8}\\x{1F1EE}\\x{1F1F0}\\x{1F1F7}-\\x{1F1FB}\\x{1F1FE}]|\\x{1F1F2}[\\x{1F1E6}\\x{1F1E8}-\\x{1F1ED}\\x{1F1F0}-\\x{1F1FF}]|\\x{1F1F3}[\\x{1F1E6}\\x{1F1E8}\\x{1F1EA}-\\x{1F1EC}\\x{1F1EE}\\x{1F1F1}\\x{1F1F4}\\x{1F1F5}\\x{1F1F7}\\x{1F1FA}\\x{1F1FF}]|\\x{1F1F4}\\x{1F1F2}|\\x{1F1F5}[\\x{1F1E6}\\x{1F1EA}-\\x{1F1ED}\\x{1F1F0}-\\x{1F1F3}\\x{1F1F7}-\\x{1F1F9}\\x{1F1FC}\\x{1F1FE}]|\\x{1F1F6}\\x{1F1E6}|\\x{1F1F7}[\\x{1F1EA}\\x{1F1F4}\\x{1F1F8}\\x{1F1FA}\\x{1F1FC}]|\\x{1F1F8}[\\x{1F1E6}-\\x{1F1EA}\\x{1F1EC}-\\x{1F1F4}\\x{1F1F7}-\\x{1F1F9}\\x{1F1FB}\\x{1F1FD}-\\x{1F1FF}]|\\x{1F1F9}[\\x{1F1E6}\\x{1F1E8}\\x{1F1E9}\\x{1F1EB}-\\x{1F1ED}\\x{1F1EF}-\\x{1F1F4}\\x{1F1F7}\\x{1F1F9}\\x{1F1FB}\\x{1F1FC}\\x{1F1FF}]|\\x{1F1FA}[\\x{1F1E6}\\x{1F1EC}\\x{1F1F2}\\x{1F1F3}\\x{1F1F8}\\x{1F1FE}\\x{1F1FF}]|\\x{1F1FB}[\\x{1F1E6}\\x{1F1E8}\\x{1F1EA}\\x{1F1EC}\\x{1F1EE}\\x{1F1F3}\\x{1F1FA}]|\\x{1F1FC}[\\x{1F1EB}\\x{1F1F8}]|\\x{1F1FD}\\x{1F1F0}|\\x{1F1FE}[\\x{1F1EA}\\x{1F1F9}]|\\x{1F1FF}[\\x{1F1E6}\\x{1F1F2}\\x{1F1FC}]|\\x{1F3F3}\\x{FE0F}?(?:\\x{200D}(?:\\x{26A7}\\x{FE0F}?|\\x{1F308}))?|\\x{1F3F4}(?:\\x{200D}\\x{2620}\\x{FE0F}?|\\x{E0067}\\x{E0062}(?:\\x{E0065}\\x{E006E}\\x{E0067}|\\x{E0073}\\x{E0063}\\x{E0074}|\\x{E0077}\\x{E006C}\\x{E0073})\\x{E007F})?|\\x{1F415}(?:\\x{200D}\\x{1F9BA})?|\\x{1F43B}(?:\\x{200D}\\x{2744}\\x{FE0F}?)?|\\x{1F441}\\x{FE0F}?(?:\\x{200D}\\x{1F5E8}\\x{FE0F}?)?|\\x{1F468}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F468}\\x{1F469}]\\x{200D}(?:\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?)|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}|\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?)|\\x{1F3FB}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FC}-\\x{1F3FF}]))?|\\x{1F3FC}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}]))?|\\x{1F3FD}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}]))?|\\x{1F3FE}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}]))?|\\x{1F3FF}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F468}[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F468}[\\x{1F3FB}-\\x{1F3FE}]))?)?|\\x{1F469}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?[\\x{1F468}\\x{1F469}]|\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?|\\x{1F469}\\x{200D}(?:\\x{1F466}(?:\\x{200D}\\x{1F466})?|\\x{1F467}(?:\\x{200D}[\\x{1F466}\\x{1F467}])?))|\\x{1F3FB}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FC}-\\x{1F3FF}]))?|\\x{1F3FC}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}]))?|\\x{1F3FD}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}]))?|\\x{1F3FE}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}]))?|\\x{1F3FF}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:[\\x{1F468}\\x{1F469}]|\\x{1F48B}\\x{200D}[\\x{1F468}\\x{1F469}])[\\x{1F3FB}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}[\\x{1F468}\\x{1F469}][\\x{1F3FB}-\\x{1F3FE}]))?)?|\\x{1F62E}(?:\\x{200D}\\x{1F4A8})?|\\x{1F635}(?:\\x{200D}\\x{1F4AB})?|\\x{1F636}(?:\\x{200D}\\x{1F32B}\\x{FE0F}?)?|\\x{1F93C}(?:[\\x{1F3FB}-\\x{1F3FF}]|\\x{200D}[\\x{2640}\\x{2642}]\\x{FE0F}?)?|\\x{1F9D1}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{1F91D}\\x{200D}\\x{1F9D1})|\\x{1F3FB}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FC}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FC}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FD}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FE}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?|\\x{1F3FF}(?:\\x{200D}(?:[\\x{2695}\\x{2696}\\x{2708}]\\x{FE0F}?|[\\x{1F33E}\\x{1F373}\\x{1F37C}\\x{1F384}\\x{1F393}\\x{1F3A4}\\x{1F3A8}\\x{1F3EB}\\x{1F3ED}\\x{1F4BB}\\x{1F4BC}\\x{1F527}\\x{1F52C}\\x{1F680}\\x{1F692}\\x{1F9AF}-\\x{1F9B3}\\x{1F9BC}\\x{1F9BD}]|\\x{2764}\\x{FE0F}?\\x{200D}(?:\\x{1F48B}\\x{200D})?\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FE}]|\\x{1F91D}\\x{200D}\\x{1F9D1}[\\x{1F3FB}-\\x{1F3FF}]))?)?|\\x{1FAF1}(?:\\x{1F3FB}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FC}-\\x{1F3FF}])?|\\x{1F3FC}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}\\x{1F3FD}-\\x{1F3FF}])?|\\x{1F3FD}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}\\x{1F3FC}\\x{1F3FE}\\x{1F3FF}])?|\\x{1F3FE}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}-\\x{1F3FD}\\x{1F3FF}])?|\\x{1F3FF}(?:\\x{200D}\\x{1FAF2}[\\x{1F3FB}-\\x{1F3FE}])?)?");
        this.f9684u = compile;
        this.f9685v = SystemClock.elapsedRealtime();
        KeyCharacterMap load = KeyCharacterMap.load(-1);
        o.d(load, "load(...)");
        this.f9686w = load;
        this.f9687x = new ArrayList();
        this.f9688y = new ArrayList();
        this.f9689z = new ArrayList();
        this.f9658A = new ArrayList();
        o.d(compile, "emojiPattern");
        this.f9659B = new InputFieldState(compile);
        e.j(e.k(e.d(b4), new AnonymousClass1(this, (kotlin.coroutines.c<? super AnonymousClass1>) null)), d4);
    }

    private final Object C(int i4, int i5, String str, InputConnection inputConnection, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$insertPrediction$2(this, i4, i5, str, inputConnection, (kotlin.coroutines.c<? super DefaultInputConnectionController$insertPrediction$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object C0(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object D(int i4, String str, String str2, kotlin.coroutines.c cVar) {
        int i5;
        boolean z3;
        InputConnection inputConnection = this.f9661D;
        if (inputConnection == null) {
            return q.f14567a;
        }
        j jVar = this.f9662E;
        if (jVar == null) {
            return q.f14567a;
        }
        String f4 = this.f9659B.f();
        if (i4 > f4.length()) {
            Log.p(Log.f10572a, "DefaultInputConnectionController", "processCorrectionSuggestion() :: Start index is greater than text length (" + i4 + " > " + f4.length() + "). Not processing the correction.", (Throwable) null, 4, (Object) null);
            return q.f14567a;
        }
        int length = str2.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            if (o.f(str2.charAt(i5), 32) <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z4) {
                if (!z3) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else if (!z3) {
                break;
            } else {
                length--;
            }
        }
        f.g(i4, str2.subSequence(i6, length + 1).toString(), f4, jVar, this.f9669f);
        Object C3 = C(i4, str.length(), str2, inputConnection, cVar);
        if (C3 == kotlin.coroutines.intrinsics.a.f()) {
            return C3;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object E(InputConnection inputConnection, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f9665b, new DefaultInputConnectionController$getExtractedText$2(inputConnection, (kotlin.coroutines.c<? super DefaultInputConnectionController$getExtractedText$2>) null), cVar);
    }

    /* access modifiers changed from: private */
    public final Object F(a.c cVar, kotlin.coroutines.c cVar2) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processDeleteInputEvent$2(this, cVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$processDeleteInputEvent$2>) null), cVar2);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object G(a.f fVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processInsertCharacterInputEvent$2(fVar, this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processInsertCharacterInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object G0(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object H(a.g gVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processInsertEmojiInputEvent$2(gVar, this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processInsertEmojiInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object I(a.h hVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processMoveCursorInputEvent$2(this, hVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$processMoveCursorInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object I0(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processReturnSwipeUpEvent$2(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processReturnSwipeUpEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object J(a.i iVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processPredictionInputEvent$2(iVar, this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processPredictionInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object K(a.j jVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processReplaceCharacterInputEvent$2(this, jVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$processReplaceCharacterInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object L(a.k kVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processReplaceCurrentTextEvent$2(this, kVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$processReplaceCurrentTextEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object M(a.l lVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processReplaceEmojiInputEvent$2(lVar, this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processReplaceEmojiInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object N(a.m mVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processRestoreInputEvent$2(this, mVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$processRestoreInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object O(a.o oVar, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processUpdateSelectionInputEvent$2(this, oVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$processUpdateSelectionInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final Object c0(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q e0(DefaultInputConnectionController defaultInputConnectionController, g0 g0Var, Throwable th) {
        defaultInputConnectionController.f9658A.remove(g0Var);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void f0(InputConnection inputConnection, char c4) {
        KeyEvent[] events = this.f9686w.getEvents(new char[]{c4});
        if (events == null || events.length == 0 || this.f9675l.contains(Character.valueOf(c4))) {
            inputConnection.commitText(String.valueOf(c4), 1);
            return;
        }
        Iterator a4 = kotlin.jvm.internal.b.a(events);
        while (a4.hasNext()) {
            inputConnection.sendKeyEvent(KeyEvent.changeFlags((KeyEvent) a4.next(), 6));
        }
    }

    /* access modifiers changed from: private */
    public final void m0(l lVar) {
        Log.d(Log.f10572a, "DefaultInputConnectionController", "deliverOnContentChangeEvent()", (Throwable) null, 4, (Object) null);
        g0 d4 = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$deliverOnContentChangeEvent$job$1(this, lVar, (kotlin.coroutines.c<? super DefaultInputConnectionController$deliverOnContentChangeEvent$job$1>) null), 3, (Object) null);
        d4.G(new b(this, d4));
        this.f9658A.add(d4);
    }

    /* access modifiers changed from: private */
    public final void n0(String str, int i4) {
        for (o g4 : this.f9688y) {
            g4.g(str, i4);
        }
    }

    /* access modifiers changed from: private */
    public final Object p0(int i4, String str, String str2, kotlin.coroutines.c cVar) {
        int i5;
        boolean z3;
        InputConnection inputConnection = this.f9661D;
        if (inputConnection == null) {
            return q.f14567a;
        }
        j jVar = this.f9662E;
        if (jVar == null) {
            return q.f14567a;
        }
        String f4 = this.f9659B.f();
        if (i4 < 0) {
            Log.p(Log.f10572a, "DefaultInputConnectionController", "processNormalPrediction() :: Start index is less than 0 (" + i4 + "). Not processing the prediction.", (Throwable) null, 4, (Object) null);
            return q.f14567a;
        } else if (i4 > f4.length()) {
            Log.p(Log.f10572a, "DefaultInputConnectionController", "processNormalPrediction() :: Start index is greater than text length (" + i4 + " > " + f4.length() + "). Not processing the prediction.", (Throwable) null, 4, (Object) null);
            return q.f14567a;
        } else {
            int length = str2.length() - 1;
            int i6 = 0;
            boolean z4 = false;
            while (i6 <= length) {
                if (!z4) {
                    i5 = i6;
                } else {
                    i5 = length;
                }
                if (o.f(str2.charAt(i5), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z4) {
                    if (!z3) {
                        z4 = true;
                    } else {
                        i6++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            f.g(i4, str2.subSequence(i6, length + 1).toString(), f4, jVar, this.f9669f);
            Object C3 = C(i4, str.length(), str2, inputConnection, cVar);
            if (C3 == kotlin.coroutines.intrinsics.a.f()) {
                return C3;
            }
            return q.f14567a;
        }
    }

    /* access modifiers changed from: private */
    public final Object s0(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f9666c, new DefaultInputConnectionController$processClearInputEvent$2(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$processClearInputEvent$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void x0(String str, int i4) {
        Log.d(Log.f10572a, "DefaultInputConnectionController", "deliverOnUpdateSelectionUseCases()", (Throwable) null, 4, (Object) null);
        for (p g4 : this.f9687x) {
            g4.g(str, i4);
        }
    }

    /* access modifiers changed from: private */
    public final Object z0(int i4, String str, String str2, kotlin.coroutines.c cVar) {
        int i5;
        boolean z3;
        InputConnection inputConnection = this.f9661D;
        if (inputConnection == null) {
            return q.f14567a;
        }
        EditorInfo editorInfo = this.f9663F;
        if (editorInfo == null) {
            return q.f14567a;
        }
        String f4 = this.f9659B.f();
        int length = f4.length() - 1;
        int i6 = 0;
        boolean z4 = false;
        while (i6 <= length) {
            if (!z4) {
                i5 = i6;
            } else {
                i5 = length;
            }
            if (o.f(f4.charAt(i5), 32) <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z4) {
                if (!z3) {
                    z4 = true;
                } else {
                    i6++;
                }
            } else if (!z3) {
                break;
            } else {
                length--;
            }
        }
        this.f9668e.b(f4.subSequence(i6, length + 1).toString(), editorInfo);
        Object C3 = C(i4, str.length(), str2, inputConnection, cVar);
        if (C3 == kotlin.coroutines.intrinsics.a.f()) {
            return C3;
        }
        return q.f14567a;
    }

    public void A(m mVar) {
        this.f9660C = mVar;
    }

    public void a() {
        this.f9663F = null;
        this.f9662E = null;
        this.f9661D = null;
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onFinishInput$1(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$onFinishInput$1>) null), 3, (Object) null);
    }

    public void b() {
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onDeleteRestoreDone$1(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$onDeleteRestoreDone$1>) null), 3, (Object) null);
    }

    public void c() {
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onCharacterChangeDone$1(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$onCharacterChangeDone$1>) null), 3, (Object) null);
    }

    public String d() {
        return this.f9659B.f();
    }

    public Pair e() {
        Log.d(Log.f10572a, "DefaultInputConnectionController", "Get current text and touch points", (Throwable) null, 4, (Object) null);
        return new Pair(this.f9659B.f(), this.f9659B.g());
    }

    public void f(int i4) {
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onMoveCursor$1(this, i4, (kotlin.coroutines.c<? super DefaultInputConnectionController$onMoveCursor$1>) null), 3, (Object) null);
    }

    public void g(List list) {
        o.e(list, "emojis");
        this.f9659B.v(list);
    }

    public void h(int i4) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultInputConnectionController", "onRestoreCharacters() :: " + i4, (Throwable) null, 4, (Object) null);
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onRestoreCharacters$1(this, i4, (kotlin.coroutines.c<? super DefaultInputConnectionController$onRestoreCharacters$1>) null), 3, (Object) null);
    }

    public void i(int i4) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultInputConnectionController", "onDeleteCharacters() :: " + i4, (Throwable) null, 4, (Object) null);
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onDeleteCharacters$1(this, i4, (kotlin.coroutines.c<? super DefaultInputConnectionController$onDeleteCharacters$1>) null), 3, (Object) null);
    }

    public void j() {
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onStartInputView$1(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$onStartInputView$1>) null), 3, (Object) null);
    }

    public void k(PointF pointF) {
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onReturnSwipeUp$1(this, pointF, (kotlin.coroutines.c<? super DefaultInputConnectionController$onReturnSwipeUp$1>) null), 3, (Object) null);
    }

    public void l(String str) {
        o.e(str, "emojiString");
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onReplaceEmoji$1(this, str, (kotlin.coroutines.c<? super DefaultInputConnectionController$onReplaceEmoji$1>) null), 3, (Object) null);
    }

    public void m(Emoji emoji) {
        o.e(emoji, "emoji");
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onEmojiClick$1(this, emoji, (kotlin.coroutines.c<? super DefaultInputConnectionController$onEmojiClick$1>) null), 3, (Object) null);
    }

    public void n(char c4, PointF pointF) {
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onReplaceCharacter$1(this, c4, pointF, (kotlin.coroutines.c<? super DefaultInputConnectionController$onReplaceCharacter$1>) null), 3, (Object) null);
    }

    public void o(char c4, PointF pointF) {
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onCharacterClick$1(this, c4, pointF, (kotlin.coroutines.c<? super DefaultInputConnectionController$onCharacterClick$1>) null), 3, (Object) null);
    }

    public void p() {
        EditorInfo editorInfo;
        j jVar = this.f9662E;
        if (jVar != null && (editorInfo = this.f9663F) != null) {
            this.f9668e.b(this.f9659B.f(), editorInfo);
            if (jVar.f() && C0490c.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - this.f9682s > 2500) {
                    this.f9682s = elapsedRealtime;
                    new SaveWordsUseCase(this.f9664a, this.f9667d, this.f9665b, this.f9666c, this.f9669f, this.f9672i, this.f9671h, this.f9673j).d(this.f9659B.f(), this.f9670g.b());
                }
            }
        }
    }

    public void q(InputConnection inputConnection, EditorInfo editorInfo, j jVar) {
        o.e(editorInfo, "editorInfo");
        o.e(jVar, "inputSession");
        this.f9661D = inputConnection;
        this.f9662E = jVar;
        this.f9663F = editorInfo;
        this.f9680q = false;
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onStartInput$1(this, (kotlin.coroutines.c<? super DefaultInputConnectionController$onStartInput$1>) null), 3, (Object) null);
    }

    public void r(int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z3;
        if (SystemClock.elapsedRealtime() - this.f9685v > 100) {
            z3 = true;
        } else {
            z3 = false;
        }
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$onUpdateSelection$1(this, new a.o(i4, i5, i6, i7, i8, i9, z3), (kotlin.coroutines.c<? super DefaultInputConnectionController$onUpdateSelection$1>) null), 3, (Object) null);
    }

    public void s(List list) {
        this.f9688y.clear();
        if (list != null) {
            this.f9688y.addAll(list);
        }
    }

    public Object t(CorrectionInfo correctionInfo, boolean z3, boolean z4, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f9666c, new DefaultInputConnectionController$processCorrection$2(correctionInfo, z3, this, z4, (kotlin.coroutines.c<? super DefaultInputConnectionController$processCorrection$2>) null), cVar);
    }

    public void u(List list) {
        this.f9687x.clear();
        if (list != null) {
            this.f9687x.addAll(list);
        }
    }

    public void v(int i4, String str, String str2, PredictionsResult.Candidate.Type type) {
        o.e(str, "originalWordStart");
        o.e(str2, "prediction");
        o.e(type, "type");
        this.f9685v = SystemClock.elapsedRealtime();
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$processPrediction$1(this, i4, str, str2, type, (kotlin.coroutines.c<? super DefaultInputConnectionController$processPrediction$1>) null), 3, (Object) null);
    }

    public void w(List list) {
        this.f9689z.clear();
        if (list != null) {
            this.f9689z.addAll(list);
        }
    }

    public Object x(String str, String str2, boolean z3, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f9666c, new DefaultInputConnectionController$applyAutoSpace$2(this, str, str2, z3, (kotlin.coroutines.c<? super DefaultInputConnectionController$applyAutoSpace$2>) null), cVar);
    }

    public Object y(String str, kotlin.coroutines.c cVar) {
        g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$replaceCurrentText$2(this, str, (kotlin.coroutines.c<? super DefaultInputConnectionController$replaceCurrentText$2>) null), 3, (Object) null);
        return q.f14567a;
    }

    public Object z(String str, String str2, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f9666c, new DefaultInputConnectionController$processShortcut$2(this, str, str2, (kotlin.coroutines.c<? super DefaultInputConnectionController$processShortcut$2>) null), cVar);
    }

    public int f() {
        return this.f9659B.i();
    }

    public void c(String str) {
        o.e(str, "prediction");
        EditorInfo editorInfo = this.f9663F;
        if (editorInfo != null) {
            g0 unused = C0739h.d(this.f9667d, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionController$removePrediction$1(this, str, editorInfo, (kotlin.coroutines.c<? super DefaultInputConnectionController$removePrediction$1>) null), 3, (Object) null);
        }
    }
}
