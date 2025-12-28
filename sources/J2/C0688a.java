package j2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.RSRuntimeException;
import android.view.View;

/* renamed from: j2.a  reason: case insensitive filesystem */
abstract class C0688a {
    public static Bitmap a(Context context, Bitmap bitmap, C0689b bVar) {
        Bitmap bitmap2;
        int i4 = bVar.f13759a;
        int i5 = bVar.f13762d;
        int i6 = i4 / i5;
        int i7 = bVar.f13760b / i5;
        if (C0691d.a(i6, i7)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i8 = bVar.f13762d;
        canvas.scale(1.0f / ((float) i8), 1.0f / ((float) i8));
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(bVar.f13763e, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            bitmap2 = c(context, createBitmap, bVar.f13761c);
        } catch (RSRuntimeException unused) {
            bitmap2 = d(createBitmap, bVar.f13761c, true);
        }
        if (bVar.f13762d == 1) {
            return bitmap2;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, bVar.f13759a, bVar.f13760b, true);
        bitmap2.recycle();
        return createScaledBitmap;
    }

    public static Bitmap b(View view, C0689b bVar) {
        view.setDrawingCacheEnabled(true);
        view.destroyDrawingCache();
        view.setDrawingCacheQuality(524288);
        Bitmap drawingCache = view.getDrawingCache();
        Bitmap a4 = a(view.getContext(), drawingCache, bVar);
        drawingCache.recycle();
        return a4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap c(android.content.Context r5, android.graphics.Bitmap r6, int r7) {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch:{ all -> 0x004c }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            r5.setMessageHandler(r1)     // Catch:{ all -> 0x0048 }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x0048 }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x0048 }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x0043 }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x0043 }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x003e }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch:{ all -> 0x003e }
            r0.setInput(r1)     // Catch:{ all -> 0x003e }
            float r7 = (float) r7     // Catch:{ all -> 0x003e }
            r0.setRadius(r7)     // Catch:{ all -> 0x003e }
            r0.forEach(r2)     // Catch:{ all -> 0x003e }
            r2.copyTo(r6)     // Catch:{ all -> 0x003e }
            r5.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r6
        L_0x003e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0050
        L_0x0043:
            r6 = move-exception
            r2 = r0
        L_0x0045:
            r0 = r5
            r5 = r2
            goto L_0x0050
        L_0x0048:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x0045
        L_0x004c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.destroy()
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.destroy()
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2.destroy()
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r5.destroy()
        L_0x0064:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C0688a.c(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap d(android.graphics.Bitmap r37, int r38, boolean r39) {
        /*
            r0 = r38
            r1 = 1
            if (r39 == 0) goto L_0x0008
            r2 = r37
            goto L_0x0012
        L_0x0008:
            android.graphics.Bitmap$Config r2 = r37.getConfig()
            r3 = r37
            android.graphics.Bitmap r2 = r3.copy(r2, r1)
        L_0x0012:
            if (r0 >= r1) goto L_0x0016
            r0 = 0
            return r0
        L_0x0016:
            int r11 = r2.getWidth()
            int r12 = r2.getHeight()
            int r13 = r11 * r12
            int[] r14 = new int[r13]
            r7 = 0
            r8 = 0
            r5 = 0
            r3 = r2
            r4 = r14
            r6 = r11
            r9 = r11
            r10 = r12
            r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
            int r3 = r11 + -1
            int r4 = r12 + -1
            int r5 = r0 + r0
            int r6 = r5 + 1
            int[] r7 = new int[r13]
            int[] r8 = new int[r13]
            int[] r9 = new int[r13]
            int r10 = java.lang.Math.max(r11, r12)
            int[] r10 = new int[r10]
            r13 = 2
            int r5 = r5 + r13
            int r5 = r5 >> r1
            int r5 = r5 * r5
            int r15 = r5 * 256
            int[] r1 = new int[r15]
            r13 = 0
        L_0x004a:
            if (r13 >= r15) goto L_0x0053
            int r17 = r13 / r5
            r1[r13] = r17
            int r13 = r13 + 1
            goto L_0x004a
        L_0x0053:
            r13 = 2
            int[] r5 = new int[r13]
            r13 = 3
            r15 = 1
            r5[r15] = r13
            r13 = 0
            r5[r13] = r6
            java.lang.Class r13 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r13, r5)
            int[][] r5 = (int[][]) r5
            int r13 = r0 + 1
            r15 = 0
            r17 = 0
            r18 = 0
        L_0x006c:
            if (r15 >= r12) goto L_0x0182
            r19 = r2
            int r2 = -r0
            r28 = r12
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r12 = r2
            r2 = 0
        L_0x0085:
            r29 = 65280(0xff00, float:9.1477E-41)
            r30 = 16711680(0xff0000, float:2.3418052E-38)
            if (r12 > r0) goto L_0x00e2
            r31 = r4
            r32 = r10
            r4 = 0
            int r10 = java.lang.Math.max(r12, r4)
            int r10 = java.lang.Math.min(r3, r10)
            int r10 = r17 + r10
            r10 = r14[r10]
            int r33 = r12 + r0
            r33 = r5[r33]
            r30 = r10 & r30
            int r30 = r30 >> 16
            r33[r4] = r30
            r29 = r10 & r29
            int r29 = r29 >> 8
            r16 = 1
            r33[r16] = r29
            r10 = r10 & 255(0xff, float:3.57E-43)
            r29 = 2
            r33[r29] = r10
            int r10 = java.lang.Math.abs(r12)
            int r10 = r13 - r10
            r30 = r33[r4]
            int r4 = r30 * r10
            int r2 = r2 + r4
            r4 = r33[r16]
            int r34 = r4 * r10
            int r20 = r20 + r34
            r33 = r33[r29]
            int r10 = r10 * r33
            int r21 = r21 + r10
            if (r12 <= 0) goto L_0x00d5
            int r25 = r25 + r30
            int r26 = r26 + r4
            int r27 = r27 + r33
            goto L_0x00db
        L_0x00d5:
            int r22 = r22 + r30
            int r23 = r23 + r4
            int r24 = r24 + r33
        L_0x00db:
            int r12 = r12 + 1
            r4 = r31
            r10 = r32
            goto L_0x0085
        L_0x00e2:
            r31 = r4
            r32 = r10
            r10 = r0
            r4 = r2
            r2 = 0
        L_0x00e9:
            if (r2 >= r11) goto L_0x0172
            r12 = r1[r4]
            r7[r17] = r12
            r12 = r1[r20]
            r8[r17] = r12
            r12 = r1[r21]
            r9[r17] = r12
            int r4 = r4 - r22
            int r20 = r20 - r23
            int r21 = r21 - r24
            int r12 = r10 - r0
            int r12 = r12 + r6
            int r12 = r12 % r6
            r12 = r5[r12]
            r33 = 0
            r34 = r12[r33]
            int r22 = r22 - r34
            r16 = 1
            r33 = r12[r16]
            int r23 = r23 - r33
            r33 = 2
            r34 = r12[r33]
            int r24 = r24 - r34
            if (r15 != 0) goto L_0x0124
            int r33 = r2 + r0
            r34 = r1
            int r1 = r33 + 1
            int r1 = java.lang.Math.min(r1, r3)
            r32[r2] = r1
            goto L_0x0126
        L_0x0124:
            r34 = r1
        L_0x0126:
            r1 = r32[r2]
            int r1 = r18 + r1
            r1 = r14[r1]
            r33 = r1 & r30
            int r33 = r33 >> 16
            r35 = 0
            r12[r35] = r33
            r35 = r1 & r29
            int r35 = r35 >> 8
            r16 = 1
            r12[r16] = r35
            r1 = r1 & 255(0xff, float:3.57E-43)
            r36 = 2
            r12[r36] = r1
            int r25 = r25 + r33
            int r26 = r26 + r35
            int r27 = r27 + r1
            int r4 = r4 + r25
            int r20 = r20 + r26
            int r21 = r21 + r27
            int r10 = r10 + 1
            int r10 = r10 % r6
            int r1 = r10 % r6
            r1 = r5[r1]
            r12 = 0
            r33 = r1[r12]
            int r22 = r22 + r33
            r12 = 1
            r35 = r1[r12]
            int r23 = r23 + r35
            r12 = 2
            r1 = r1[r12]
            int r24 = r24 + r1
            int r25 = r25 - r33
            int r26 = r26 - r35
            int r27 = r27 - r1
            int r17 = r17 + 1
            int r2 = r2 + 1
            r1 = r34
            goto L_0x00e9
        L_0x0172:
            r34 = r1
            int r18 = r18 + r11
            int r15 = r15 + 1
            r2 = r19
            r12 = r28
            r4 = r31
            r10 = r32
            goto L_0x006c
        L_0x0182:
            r34 = r1
            r19 = r2
            r31 = r4
            r32 = r10
            r28 = r12
            r1 = 0
        L_0x018d:
            if (r1 >= r11) goto L_0x02b6
            int r2 = -r0
            int r3 = r2 * r11
            r21 = r6
            r22 = r14
            r4 = 0
            r10 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r6 = r2
            r14 = r3
            r2 = 0
            r3 = 0
        L_0x01a4:
            if (r6 > r0) goto L_0x020c
            r23 = r11
            r11 = 0
            int r24 = java.lang.Math.max(r11, r14)
            int r24 = r24 + r1
            int r25 = r6 + r0
            r25 = r5[r25]
            r26 = r7[r24]
            r25[r11] = r26
            r11 = r8[r24]
            r16 = 1
            r25[r16] = r11
            r11 = r9[r24]
            r26 = 2
            r25[r26] = r11
            int r11 = java.lang.Math.abs(r6)
            int r11 = r13 - r11
            r26 = r7[r24]
            int r26 = r26 * r11
            int r2 = r2 + r26
            r26 = r8[r24]
            int r26 = r26 * r11
            int r3 = r3 + r26
            r24 = r9[r24]
            int r24 = r24 * r11
            int r4 = r4 + r24
            if (r6 <= 0) goto L_0x01f1
            r11 = 0
            r24 = r25[r11]
            int r17 = r17 + r24
            r16 = 1
            r24 = r25[r16]
            int r18 = r18 + r24
            r24 = 2
            r25 = r25[r24]
            int r20 = r20 + r25
        L_0x01ee:
            r11 = r31
            goto L_0x0201
        L_0x01f1:
            r11 = 0
            r16 = 1
            r24 = 2
            r26 = r25[r11]
            int r10 = r10 + r26
            r11 = r25[r16]
            int r12 = r12 + r11
            r11 = r25[r24]
            int r15 = r15 + r11
            goto L_0x01ee
        L_0x0201:
            if (r6 >= r11) goto L_0x0205
            int r14 = r14 + r23
        L_0x0205:
            int r6 = r6 + 1
            r31 = r11
            r11 = r23
            goto L_0x01a4
        L_0x020c:
            r23 = r11
            r11 = r31
            r25 = r0
            r24 = r1
            r14 = r28
            r6 = 0
        L_0x0217:
            if (r6 >= r14) goto L_0x02a0
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r27 = r22[r24]
            r26 = r27 & r26
            r27 = r34[r2]
            int r27 = r27 << 16
            r26 = r26 | r27
            r27 = r34[r3]
            int r27 = r27 << 8
            r26 = r26 | r27
            r27 = r34[r4]
            r26 = r26 | r27
            r22[r24] = r26
            int r2 = r2 - r10
            int r3 = r3 - r12
            int r4 = r4 - r15
            int r26 = r25 - r0
            int r26 = r26 + r21
            int r26 = r26 % r21
            r26 = r5[r26]
            r27 = 0
            r28 = r26[r27]
            int r10 = r10 - r28
            r16 = 1
            r27 = r26[r16]
            int r12 = r12 - r27
            r27 = 2
            r28 = r26[r27]
            int r15 = r15 - r28
            if (r1 != 0) goto L_0x025a
            int r0 = r6 + r13
            int r0 = java.lang.Math.min(r0, r11)
            int r0 = r0 * r23
            r32[r6] = r0
        L_0x025a:
            r0 = r32[r6]
            int r0 = r0 + r1
            r27 = r7[r0]
            r28 = 0
            r26[r28] = r27
            r28 = r8[r0]
            r16 = 1
            r26[r16] = r28
            r0 = r9[r0]
            r29 = 2
            r26[r29] = r0
            int r17 = r17 + r27
            int r18 = r18 + r28
            int r20 = r20 + r0
            int r2 = r2 + r17
            int r3 = r3 + r18
            int r4 = r4 + r20
            int r25 = r25 + 1
            int r25 = r25 % r21
            r0 = r5[r25]
            r26 = 0
            r27 = r0[r26]
            int r10 = r10 + r27
            r16 = 1
            r28 = r0[r16]
            int r12 = r12 + r28
            r29 = 2
            r0 = r0[r29]
            int r15 = r15 + r0
            int r17 = r17 - r27
            int r18 = r18 - r28
            int r20 = r20 - r0
            int r24 = r24 + r23
            int r6 = r6 + 1
            r0 = r38
            goto L_0x0217
        L_0x02a0:
            r16 = 1
            r26 = 0
            r29 = 2
            int r1 = r1 + 1
            r0 = r38
            r31 = r11
            r28 = r14
            r6 = r21
            r14 = r22
            r11 = r23
            goto L_0x018d
        L_0x02b6:
            r23 = r11
            r22 = r14
            r14 = r28
            r7 = 0
            r8 = 0
            r5 = 0
            r3 = r19
            r4 = r22
            r6 = r23
            r9 = r23
            r10 = r14
            r3.setPixels(r4, r5, r6, r7, r8, r9, r10)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C0688a.d(android.graphics.Bitmap, int, boolean):android.graphics.Bitmap");
    }
}
