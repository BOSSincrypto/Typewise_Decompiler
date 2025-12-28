package H2;

import H2.n;
import J2.C0340z0;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import l2.q;

public abstract class l {
    public static final f b(String str, e eVar) {
        o.e(str, "serialName");
        o.e(eVar, "kind");
        if (!kotlin.text.o.X(str)) {
            return C0340z0.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final f c(String str, f[] fVarArr, u2.l lVar) {
        o.e(str, "serialName");
        o.e(fVarArr, "typeParameters");
        o.e(lVar, "builderAction");
        if (!kotlin.text.o.X(str)) {
            a aVar = new a(str);
            lVar.invoke(aVar);
            return new i(str, n.a.f575a, aVar.f().size(), C0713h.a0(fVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final f d(String str, m mVar, f[] fVarArr, u2.l lVar) {
        o.e(str, "serialName");
        o.e(mVar, "kind");
        o.e(fVarArr, "typeParameters");
        o.e(lVar, "builder");
        if (kotlin.text.o.X(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        } else if (!o.a(mVar, n.a.f575a)) {
            a aVar = new a(str);
            lVar.invoke(aVar);
            return new i(str, mVar, aVar.f().size(), C0713h.a0(fVarArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
    }

    public static /* synthetic */ f e(String str, m mVar, f[] fVarArr, u2.l lVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            new k
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r3v2 ? I:H2.k) =  call: H2.k.<init>():void type: CONSTRUCTOR in method: H2.l.e(java.lang.String, H2.m, H2.f[], u2.l, int, java.lang.Object):H2.f, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r4 = r4 & 8
                if (r4 == 0) goto L_0x0009
                H2.k r3 = new H2.k
                r3.<init>()
            L_0x0009:
                H2.f r0 = d(r0, r1, r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: H2.l.e(java.lang.String, H2.m, H2.f[], u2.l, int, java.lang.Object):H2.f");
        }

        /* access modifiers changed from: private */
        public static final q f(a aVar) {
            o.e(aVar, "<this>");
            return q.f14567a;
        }
    }
