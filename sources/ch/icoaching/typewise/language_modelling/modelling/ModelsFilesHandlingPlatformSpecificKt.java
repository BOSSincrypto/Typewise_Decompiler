package ch.icoaching.typewise.language_modelling.modelling;

import D0.C0266b;
import D0.Q;
import D0.h0;
import java.util.Map;
import kotlin.jvm.internal.o;

public abstract class ModelsFilesHandlingPlatformSpecificKt {
    public static final StatefulLanguageModel a(String str, Map map, h0 h0Var, Q q4) {
        o.e(str, "hardwareLibrary");
        o.e(map, "modelFilePaths");
        o.e(h0Var, "modelConfig");
        o.e(q4, "platformDependencies");
        if (!o.a(str, "tf_lite")) {
            throw new IllegalArgumentException("Cannot instantiate a model for hardware library of type '" + str + "'.");
        } else if (q4 instanceof C0266b) {
            h0.d e4 = h0Var.e();
            Integer h4 = e4.h();
            o.b(h4);
            int intValue = h4.intValue();
            Integer d4 = e4.d();
            o.b(d4);
            int intValue2 = d4.intValue();
            String g4 = e4.g();
            o.b(g4);
            Boolean i4 = e4.i();
            o.b(i4);
            boolean booleanValue = i4.booleanValue();
            String e5 = h0Var.e().e();
            o.b(e5);
            Object obj = map.get("checkpoint");
            o.b(obj);
            return new TFLiteModel(e5, (String) obj, intValue, intValue2, g4, booleanValue, (C0266b) q4);
        } else {
            throw new IllegalArgumentException("Platform dependencies must be of type AndroidPlatformDependencies.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(java.lang.String r6, D0.Q r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt$checkModelFileStructure$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt$checkModelFileStructure$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt$checkModelFileStructure$1) r0
            int r1 = r0.f8679d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8679d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt$checkModelFileStructure$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt$checkModelFileStructure$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f8678c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8679d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.f.b(r8)
            goto L_0x0093
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f8677b
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.f8676a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.f.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x006a
        L_0x0043:
            kotlin.f.b(r8)
            java.util.Map r7 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.g(r6, r7)
            ch.icoaching.typewise.file_handling.b r8 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r2 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
            ch.icoaching.typewise.file_handling.FileIO r8 = r8.a(r2)
            java.lang.String r2 = "model_dir"
            java.lang.Object r2 = r7.get(r2)
            kotlin.jvm.internal.o.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.f8676a = r6
            r0.f8677b = r7
            r0.f8679d = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L_0x006a
            return r1
        L_0x006a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0096
            ch.icoaching.typewise.file_handling.b r6 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r8 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
            ch.icoaching.typewise.file_handling.FileIO r6 = r6.a(r8)
            java.lang.String r8 = "checkpoint_folder"
            java.lang.Object r7 = r7.get(r8)
            kotlin.jvm.internal.o.b(r7)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r0.f8676a = r8
            r0.f8677b = r8
            r0.f8679d = r3
            java.lang.Object r6 = r6.b(r7, r4, r4, r0)
            if (r6 != r1) goto L_0x0093
            return r1
        L_0x0093:
            l2.q r6 = l2.q.f14567a
            return r6
        L_0x0096:
            ch.icoaching.typewise.misc.TypewiseFileNotFoundException r7 = new ch.icoaching.typewise.misc.TypewiseFileNotFoundException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "No model found with name '"
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = "'."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt.b(java.lang.String, D0.Q, kotlin.coroutines.c):java.lang.Object");
    }
}
