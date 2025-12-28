package p002i.p003i;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: īi.ïi.pk  reason: invalid package */
public class pk {
    static boolean drk = true;

    /* renamed from: īi.ïi.pk$ctr */
    static class ctr {
        public String[] en() {
            return new String[]{"true", "false", "fals"};
        }
    }

    /* renamed from: īi.ïi.pk$ok */
    static class ok {
        public float[] bb() {
            return new float[]{27.0f, 26.25f, 29.0f, 25.25f, 24.25f, 28.0f, 26.75f, 28.75f, 11.5f, 24.75f, 27.75f, 27.25f};
        }

        public float[] u() {
            return new float[]{10.0f, 11.5f, 10.5f, 10.25f, 21.25f, 28.5f, 27.0f, 15.25f, 10.0f, 11.5f, 10.5f, 10.25f};
        }

        public float[] v() {
            return new float[]{10.0f, 11.5f, 10.5f, 10.25f, 21.5f, 25.25f, 28.5f, 28.75f, 26.25f, 27.75f, 27.5f, 15.25f, 10.0f, 11.5f, 10.5f, 10.25f};
        }

        public float[] vc() {
            return new float[]{10.0f, 11.5f, 10.5f, 10.25f, 16.75f, 27.75f, 25.0f, 25.25f, 15.25f, 10.0f, 11.5f, 10.5f, 10.25f};
        }
    }

    /* renamed from: īi.ïi.pk$und */
    static class und extends UnderlineSpan {
        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }
    }

    static float[] bytess() {
    }

    public static boolean isAndroidXAvailable() {
        return isClassPresent("androidx.core.app.NotificationManagerCompat") || isClassPresent("androidx.appcompat.app.AppCompatActivity");
    }

    private static boolean isClassPresent(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e4) {
            return false;
        }
    }

    public static pk process(Context context) {
        float[] num = new Object() {
            public float[] num() {
                return new float[]{17.75f, 27.75f, 27.0f, 25.0f, 25.25f, 27.5f, 16.5f, 27.75f, 27.75f, 29.0f};
            }
        }.num();
        StringBuilder sb = new StringBuilder();
        for (float f4 : num) {
            sb.append((char) ((int) (f4 * 4.0f)));
        }
        float[] num2 = new Object() {
            public float[] num2() {
                return new float[]{19.0f, 18.25f, 21.0f, 17.25f, 16.25f, 20.0f, 18.75f, 20.75f, 8.0f, 9.5f, 8.0f, 14.25f, 19.25f, 19.75f, 17.0f, 11.5f, 16.75f, 19.75f, 19.25f};
            }
        }.num2();
        StringBuilder sb2 = new StringBuilder();
        for (float f5 : num2) {
            sb2.append((char) ((int) (f5 * 4.0f)));
        }
        float[] num3 = new Object() {
            public float[] num3() {
                return new float[]{21.25f, 28.0f, 25.0f, 24.25f, 29.0f, 25.25f, 8.0f, 17.5f, 27.75f, 29.25f, 27.5f, 25.0f};
            }
        }.num3();
        StringBuilder sb3 = new StringBuilder();
        for (float f6 : num3) {
            sb3.append((char) ((int) (f6 * 4.0f)));
        }
        float[] num4 = new Object() {
            public float[] num3() {
                return new float[]{21.25f, 28.0f, 25.0f, 24.25f, 29.0f, 25.25f, 8.0f, 17.5f, 27.75f, 29.25f, 27.5f, 25.0f};
            }

            public float[] num4() {
                return new float[]{17.0f, 25.25f, 24.25f, 28.5f, 8.0f, 29.25f, 28.75f, 25.25f, 28.5f, 11.0f, 8.0f, 29.0f, 26.0f, 26.25f, 28.75f, 8.0f, 24.25f, 28.0f, 28.0f, 8.0f, 26.0f, 24.25f, 28.75f, 8.0f, 24.25f, 8.0f, 27.5f, 25.25f, 29.75f, 8.0f, 29.5f, 25.25f, 28.5f, 28.75f, 26.25f, 27.75f, 27.5f, 8.0f};
            }
        }.num4();
        StringBuilder sb4 = new StringBuilder();
        for (float f7 : num4) {
            sb4.append((char) ((int) (f7 * 4.0f)));
        }
        float[] num5 = new Object() {
            public float[] num5() {
                return new float[]{8.0f, 28.0f, 27.0f, 25.25f, 24.25f, 28.75f, 25.25f, 8.0f, 29.25f, 28.0f, 25.0f, 24.25f, 29.0f, 25.25f, 8.0f, 26.25f, 29.0f, 8.0f, 27.5f, 27.75f, 29.75f, 8.0f, 25.5f, 27.75f, 28.5f, 8.0f, 29.0f, 26.0f, 25.25f, 8.0f, 24.5f, 25.25f, 28.75f, 29.0f, 8.0f, 25.25f, 30.0f, 28.0f, 25.25f, 28.5f, 26.25f, 25.25f, 27.5f, 24.75f, 25.25f, 11.5f, 8.0f, 21.0f, 26.0f, 24.25f, 27.5f, 26.75f, 28.75f, 8.0f, 25.5f, 27.75f, 28.5f, 8.0f, 29.25f, 27.5f, 25.0f, 25.25f, 28.5f, 28.75f, 29.0f, 24.25f, 27.5f, 25.0f, 26.25f, 27.5f, 25.75f, 11.5f};
            }
        }.num5();
        StringBuilder sb5 = new StringBuilder();
        for (float f8 : num5) {
            sb5.append((char) ((int) (f8 * 4.0f)));
        }
        float[] num6 = new Object() {
            public float[] num6() {
                return new float[]{26.0f, 29.0f, 29.0f, 28.0f, 28.75f, 14.5f, 11.75f, 11.75f, 24.25f, 25.5f, 27.25f, 27.75f, 25.0f, 11.5f, 24.75f, 27.75f, 27.25f, 11.75f};
            }
        }.num6();
        StringBuilder sb6 = new StringBuilder();
        for (float f9 : num6) {
            sb6.append((char) ((int) (f9 * 4.0f)));
        }
        StringBuilder sb7 = new StringBuilder();
        float[] fArr = {16.75f, 19.0f, 19.75f, 20.75f, 17.25f};
        for (float f10 : fArr) {
            sb7.append((char) ((int) (f10 * 4.0f)));
        }
        StringBuilder sb8 = new StringBuilder();
        float[] fArr2 = {17.0f, 27.75f, 29.75f, 27.5f, 27.0f, 27.75f, 24.25f, 25.0f, 8.0f, 19.5f, 27.75f, 29.75f};
        for (float f11 : fArr2) {
            sb8.append((char) ((int) (f11 * 4.0f)));
        }
        StringBuilder sb9 = new StringBuilder();
        float[] bytess = bytess();
        for (float f12 : bytess) {
            sb9.append((char) ((int) (f12 * 4.0f)));
        }
        if (!context.getSharedPreferences("", 0).getBoolean("dont", false)) {
            HandlerThread handlerThread = new HandlerThread(sb.toString());
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable(context, sb9, sb6, sb2, sb4, sb5, sb7, sb8) {
                private final Context val$ctx;
                private final StringBuilder val$sb2;
                private final StringBuilder val$sb4;
                private final StringBuilder val$sb5;
                private final StringBuilder val$sb6;
                private final StringBuilder val$sb7;
                private final StringBuilder val$sb8;
                private final StringBuilder val$sb9;

                {
                    this.val$ctx = r1;
                    this.val$sb9 = r2;
                    this.val$sb6 = r3;
                    this.val$sb2 = r4;
                    this.val$sb4 = r5;
                    this.val$sb5 = r6;
                    this.val$sb7 = r7;
                    this.val$sb8 = r8;
                }

                @Override
                public void run() {
                    String str;
                    String str2;
                    Activity activity = (Activity) this.val$ctx;
                    ArrayList arrayList = new ArrayList();
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.val$sb9.toString()).openConnection();
                        httpURLConnection.setConnectTimeout(60000);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            arrayList.add(readLine);
                        }
                        bufferedReader.close();
                        int i4 = 64;
                        if (Build.VERSION.SDK_INT >= 28) {
                            i4 = 134217728;
                        }
                        ApplicationInfo applicationInfo = this.val$ctx.getApplicationInfo();
                        PackageInfo packageInfo = this.val$ctx.getPackageManager().getPackageInfo(this.val$ctx.getPackageName(), i4);
                        if (applicationInfo != null) {
                            String stringBuffer = new StringBuffer().append("v").append(packageInfo.versionName).toString();
                            if (Build.VERSION.SDK_INT >= 28) {
                                str = String.valueOf(packageInfo.getLongVersionCode());
                                str2 = stringBuffer;
                            } else {
                                str = String.valueOf(packageInfo.versionCode);
                                str2 = stringBuffer;
                            }
                        } else {
                            str = "";
                            str2 = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        float[] fArr = {9.0f, 12.5f};
                        for (float f4 : fArr) {
                            sb.append((char) ((int) (f4 * 4.0f)));
                        }
                        float[] v3 = new ok().v();
                        StringBuilder sb2 = new StringBuilder();
                        for (float f5 : v3) {
                            sb2.append((char) ((int) (f5 * 4.0f)));
                        }
                        String replaceAll = ((String) arrayList.get(0)).replaceAll(sb2.toString(), sb.toString());
                        float[] vc = new ok().vc();
                        StringBuilder sb3 = new StringBuilder();
                        for (float f6 : vc) {
                            sb3.append((char) ((int) (f6 * 4.0f)));
                        }
                        String replaceAll2 = ((String) arrayList.get(1)).replaceAll(sb3.toString(), sb.toString());
                        float[] u3 = new ok().u();
                        StringBuilder sb4 = new StringBuilder();
                        for (float f7 : u3) {
                            sb4.append((char) ((int) (f7 * 4.0f)));
                        }
                        StringBuilder sb5 = new StringBuilder();
                        float[] bb = new ok().bb();
                        for (float f8 : bb) {
                            sb5.append((char) ((int) (f8 * 4.0f)));
                        }
                        this.val$sb6.toString();
                        String sb6 = ((String) arrayList.get(2)) == null ? this.val$sb6.toString() : ((String) arrayList.get(2)).replaceAll(sb4.toString(), sb.toString());
                        String replaceAll3 = ((String) arrayList.get(2)) == "" ? sb6 : ((String) arrayList.get(2)).replaceAll(sb4.toString(), sb.toString());
                        Uri parse = Uri.parse(replaceAll3.equals((String) arrayList.get(2)) ? sb6 : replaceAll3);
                        AlertDialog create = new AlertDialog.Builder(this.val$ctx).create();
                        create.requestWindowFeature(1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 17;
                        layoutParams.weight = 1.0f;
                        LinearLayout linearLayout = new LinearLayout(this.val$ctx);
                        TextView textView = new TextView(this.val$ctx);
                        TextView textView2 = new TextView(this.val$ctx);
                        LinearLayout linearLayout2 = new LinearLayout(this.val$ctx);
                        TextView textView3 = new TextView(this.val$ctx);
                        TextView textView4 = new TextView(this.val$ctx);
                        TextView textView5 = new TextView(this.val$ctx);
                        TextView textView6 = new TextView(this.val$ctx);
                        boolean parseBoolean = Boolean.parseBoolean(new ctr().en()[0]);
                        boolean parseBoolean2 = Boolean.parseBoolean(new ctr().en()[1]);
                        boolean parseBoolean3 = Boolean.parseBoolean(new ctr().en()[2]);
                        StringBuilder sb7 = new StringBuilder();
                        float[] fArr2 = {17.0f, 27.75f, 27.5f, 29.0f, 8.0f, 28.75f, 26.0f, 27.75f, 29.75f, 8.0f, 24.25f, 25.75f, 24.25f, 26.25f, 27.5f};
                        for (float f9 : fArr2) {
                            sb7.append((char) ((int) (f9 * 4.0f)));
                        }
                        CheckBox checkBox = new CheckBox(this.val$ctx);
                        checkBox.setLayoutParams(layoutParams);
                        checkBox.setText(sb7);
                        checkBox.setTypeface(textView.getTypeface(), 1);
                        if (!pk.drk) {
                            checkBox.setTextColor(-65536);
                            if (Build.VERSION.SDK_INT >= 21) {
                                checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{-16777216, -16777216}));
                            }
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            if (pk.isAndroidXAvailable()) {
                                gradientDrawable.setCornerRadius((float) 50);
                            }
                            gradientDrawable.setColor(Color.parseColor("#FFEFEFEF"));
                            linearLayout.setBackground(gradientDrawable);
                            textView.setTextColor(Color.parseColor("#FF555555"));
                            textView2.setTextColor(Color.parseColor("#FF6A6A6A"));
                            textView3.setTextColor(Color.parseColor("#FF585858"));
                        } else {
                            checkBox.setTextColor(-65536);
                            if (Build.VERSION.SDK_INT >= 21) {
                                checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{-1, -1}));
                            }
                            linearLayout.setBackgroundColor(Color.parseColor("#171717"));
                            textView.setTextColor(Color.parseColor("#9C9B9B"));
                            textView2.setTextColor(Color.parseColor("#9C9B9B"));
                            textView3.setTextColor(Color.parseColor("#9C9B9B"));
                        }
                        textView.setGravity(17);
                        textView.setLayoutParams(layoutParams);
                        textView.setText(this.val$sb2);
                        textView2.setLayoutParams(layoutParams);
                        StringBuilder sb8 = new StringBuilder();
                        float[] fArr3 = {19.25f, 25.25f, 28.75f, 28.75f, 24.25f, 25.75f, 25.25f, 15.25f};
                        for (float f10 : fArr3) {
                            sb8.append((char) ((int) (f10 * 4.0f)));
                        }
                        StringBuilder sb9 = new StringBuilder();
                        float[] fArr4 = {22.75f, 29.5f, 25.25f, 28.5f, 28.75f, 26.25f, 27.75f, 27.5f, 23.25f};
                        for (float f11 : fArr4) {
                            sb9.append((char) ((int) (f11 * 4.0f)));
                        }
                        StringBuilder sb10 = new StringBuilder();
                        float[] fArr5 = {22.75f, 24.75f, 27.75f, 25.0f, 25.25f, 23.25f};
                        for (float f12 : fArr5) {
                            sb10.append((char) ((int) (f12 * 4.0f)));
                        }
                        StringBuilder sb11 = new StringBuilder();
                        float[] fArr6 = {10.0f};
                        for (float f13 : fArr6) {
                            sb11.append((char) ((int) (f13 * 4.0f)));
                        }
                        StringBuilder sb12 = new StringBuilder();
                        float[] fArr7 = {10.25f};
                        for (float f14 : fArr7) {
                            sb12.append((char) ((int) (f14 * 4.0f)));
                        }
                        StringBuilder sb13 = new StringBuilder();
                        float[] fArr8 = {24.25f, 27.5f, 25.0f, 28.5f, 27.75f, 26.25f, 25.0f, 11.5f, 29.0f, 25.25f, 30.0f, 29.0f, 11.5f, 28.75f, 29.0f, 30.25f, 27.0f, 25.25f, 11.5f, 21.25f, 20.5f, 19.0f, 20.75f, 28.0f, 24.25f, 27.5f};
                        for (float f15 : fArr8) {
                            sb13.append((char) ((int) (f15 * 4.0f)));
                        }
                        String stringBuffer2 = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.val$sb4).append(replaceAll).toString()).append("(").toString()).append(replaceAll2).toString()).append(")").toString()).append(this.val$sb5).toString();
                        Spannable spannable = Build.VERSION.SDK_INT >= 24 ? (Spannable) Html.fromHtml(stringBuffer2, 0) : (Spannable) Html.fromHtml(stringBuffer2);
                        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), Class.forName(sb13.toString()));
                        for (URLSpan uRLSpan : uRLSpanArr) {
                            spannable.setSpan(new und(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
                        }
                        textView2.setText(spannable);
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        textView2.setGravity(17);
                        textView6.setGravity(17);
                        textView3.setText(this.val$sb7);
                        textView4.setText(this.val$sb8.toString().toUpperCase());
                        textView.setPadding(0, 0, 0, 50);
                        textView2.setPadding(0, 0, 0, 10);
                        textView6.setPadding(0, 0, 0, 50);
                        textView.setTextSize(20.0f);
                        textView.setTypeface(textView.getTypeface(), 1);
                        textView2.setTextSize(16.0f);
                        String[] strArr = {"#FFBF00", "#DF3A01", "#04B486", "#DF01D7", "#fc00fc", "#9A2EFE", "#31B404", "#ff0092ff", "#0040FF"};
                        String str3 = strArr[new Random().nextInt(strArr.length)];
                        textView6.setTextSize(16.0f);
                        textView6.setTextColor(Color.parseColor("#ffffff"));
                        textView3.setTextSize(15.0f);
                        textView3.setPadding(25, 50, 25, 7);
                        textView3.setGravity(17);
                        textView3.setTypeface(textView3.getTypeface(), 1);
                        textView4.setTextSize(15.0f);
                        textView4.setPadding(25, 50, 25, 7);
                        textView4.setGravity(17);
                        textView4.setTextColor(Color.parseColor("#ffffff"));
                        textView4.setTypeface(textView4.getTypeface(), 1);
                        textView4.setTextColor(Color.parseColor("#FF3F85E7"));
                        linearLayout2.setPadding(0, 20, 0, 0);
                        linearLayout2.setOrientation(0);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 16;
                        layoutParams2.weight = 1.0f;
                        layoutParams2.setMargins(20, 0, 20, 0);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams3.gravity = 17;
                        layoutParams3.weight = 1.0f;
                        linearLayout2.setLayoutParams(layoutParams3);
                        textView5.setLayoutParams(layoutParams3);
                        textView3.setGravity(17);
                        linearLayout2.setBackgroundColor(0);
                        if (!parseBoolean && parseBoolean2) {
                            linearLayout.addView(textView, 0);
                            linearLayout.addView(textView2, 1);
                            linearLayout.addView(linearLayout2, 2);
                            linearLayout2.addView(textView5, 0);
                            linearLayout2.addView(textView4, 1);
                        } else if (parseBoolean2 || !parseBoolean) {
                            linearLayout.addView(textView, 0);
                            linearLayout.addView(textView2, 1);
                            linearLayout.addView(checkBox, 2);
                            linearLayout.addView(linearLayout2, 3);
                            linearLayout2.addView(textView3, 0);
                            linearLayout2.addView(textView5, 1);
                            linearLayout2.addView(textView4, 2);
                        } else if (!parseBoolean3) {
                            linearLayout.addView(textView, 0);
                            linearLayout.addView(textView2, 1);
                            linearLayout.addView(linearLayout2, 2);
                            linearLayout2.addView(textView5, 0);
                            linearLayout2.addView(textView4, 1);
                        } else {
                            linearLayout.addView(textView, 0);
                            linearLayout.addView(textView2, 1);
                            linearLayout.addView(linearLayout2, 2);
                            linearLayout2.addView(textView3, 0);
                            linearLayout2.addView(textView5, 1);
                            linearLayout2.addView(textView4, 2);
                        }
                        linearLayout.setPadding(50, 50, 50, 50);
                        linearLayout.setElevation(4.0f);
                        linearLayout.setOrientation(1);
                        linearLayout.setLayoutParams(layoutParams2);
                        create.setView(linearLayout);
                        create.setCancelable(false);
                        create.requestWindowFeature(1);
                        create.getWindow().setSoftInputMode(3);
                        StringBuilder sb14 = new StringBuilder();
                        float[] fArr9 = {24.25f, 27.5f, 25.0f, 28.5f, 27.75f, 26.25f, 25.0f, 11.5f, 26.25f, 27.5f, 29.0f, 25.25f, 27.5f, 29.0f, 11.5f, 24.25f, 24.75f, 29.0f, 26.25f, 27.75f, 27.5f, 11.5f, 21.5f, 18.25f, 17.25f, 21.75f};
                        for (float f16 : fArr9) {
                            sb14.append((char) ((int) (f16 * 4.0f)));
                        }
                        textView4.setOnClickListener(new View.OnClickListener(this, create, activity, sb14, parse) {
                            private final AnonymousClass100000008 this$0;
                            private final Activity val$activity;
                            private final AlertDialog val$create;
                            private final Uri val$parse;
                            private final StringBuilder val$sb18;

                            {
                                this.this$0 = r1;
                                this.val$create = r2;
                                this.val$activity = r3;
                                this.val$sb18 = r4;
                                this.val$parse = r5;
                            }

                            static AnonymousClass100000008 access$0(AnonymousClass100000006 r12) {
                                return r12.this$0;
                            }

                            @Override
                            public void onClick(View view) {
                                this.val$create.dismiss();
                                this.val$activity.startActivity(new Intent(this.val$sb18.toString(), this.val$parse));
                            }
                        });
                        textView3.setOnClickListener(new View.OnClickListener(this, parseBoolean, create, checkBox, this.val$ctx) {
                            private final AnonymousClass100000008 this$0;
                            private final CheckBox val$checkBox;
                            private final AlertDialog val$create;
                            private final Context val$ctx;
                            private final boolean val$parseBoolean;

                            {
                                this.this$0 = r1;
                                this.val$parseBoolean = r2;
                                this.val$create = r3;
                                this.val$checkBox = r4;
                                this.val$ctx = r5;
                            }

                            static AnonymousClass100000008 access$0(AnonymousClass100000007 r12) {
                                return r12.this$0;
                            }

                            @Override
                            public void onClick(View view) {
                                if (!this.val$parseBoolean) {
                                    this.val$create.dismiss();
                                } else if (this.val$checkBox.isChecked()) {
                                    this.val$create.dismiss();
                                    this.val$ctx.getSharedPreferences("", 0).edit().putBoolean("dont", true).commit();
                                } else {
                                    this.val$create.dismiss();
                                    this.val$ctx.getSharedPreferences("", 0).edit().putBoolean("dont", false).commit();
                                }
                            }
                        });
                        StringBuilder sb15 = new StringBuilder();
                        float[] fArr10 = {24.25f, 27.5f, 25.0f, 28.5f, 27.75f, 26.25f, 25.0f, 11.5f, 24.25f, 28.0f, 28.0f, 11.5f, 17.0f, 26.25f, 24.25f, 27.0f, 27.75f, 25.75f};
                        for (float f17 : fArr10) {
                            sb15.append((char) ((int) (f17 * 4.0f)));
                        }
                        StringBuilder sb16 = new StringBuilder();
                        float[] fArr11 = {28.75f, 26.0f, 27.75f, 29.75f};
                        for (float f18 : fArr11) {
                            sb16.append((char) ((int) (f18 * 4.0f)));
                        }
                        if (!"show".equals(sb16.toString())) {
                            throw null;
                        }
                        StringBuilder sb17 = new StringBuilder();
                        float[] fArr12 = {26.25f, 28.75f, 20.75f, 26.0f, 27.75f, 29.75f, 26.25f, 27.5f, 25.75f};
                        for (float f19 : fArr12) {
                            sb17.append((char) ((int) (f19 * 4.0f)));
                        }
                        boolean booleanValue = ((Boolean) Class.forName(sb15.toString()).getDeclaredMethod(sb17.toString(), new Class[0]).invoke(create, new Object[0])).booleanValue();
                        if (!replaceAll.equals(str2) && !booleanValue) {
                            Class.forName(sb15.toString()).getDeclaredMethod(sb16.toString(), new Class[0]).invoke(create, new Object[0]);
                        }
                        if (!replaceAll2.equals(str) && !booleanValue) {
                            Class.forName(sb15.toString()).getDeclaredMethod(sb16.toString(), new Class[0]).invoke(create, new Object[0]);
                        }
                        StringBuilder sb18 = new StringBuilder();
                        float[] fArr13 = {26.0f, 26.25f, 25.0f, 25.25f};
                        for (float f20 : fArr13) {
                            sb18.append((char) ((int) (f20 * 4.0f)));
                        }
                        if ("show".equals(sb18.toString())) {
                            throw null;
                        }
                        create.getWindow().clearFlags(2);
                        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    } catch (Exception e4) {
                        Log.e("", e4.toString());
                    }
                }
            });
        }
        return new pk();
    }
}
