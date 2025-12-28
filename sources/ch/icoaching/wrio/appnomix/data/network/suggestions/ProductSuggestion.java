package ch.icoaching.wrio.appnomix.data.network.suggestions;

import F2.m;
import H2.f;
import I2.d;
import J2.C0;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.E;
import J2.F;
import J2.G0;
import androidx.work.c;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010\"R \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b>\u00101\u001a\u0004\b\u000b\u0010%¨\u0006B"}, d2 = {"Lch/icoaching/wrio/appnomix/data/network/suggestions/ProductSuggestion;", "", "", "productUrl", "currencyCode", "imageUrl", "name", "", "price", "originalPrice", "", "isPrimeEligible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Z)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;ZLJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease", "(Lch/icoaching/wrio/appnomix/data/network/suggestions/ProductSuggestion;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Float;", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Z)Lch/icoaching/wrio/appnomix/data/network/suggestions/ProductSuggestion;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductUrl", "getProductUrl$annotations", "()V", "getCurrencyCode", "getCurrencyCode$annotations", "getImageUrl", "getImageUrl$annotations", "getName", "getName$annotations", "Ljava/lang/Float;", "getPrice", "getPrice$annotations", "getOriginalPrice", "getOriginalPrice$annotations", "Z", "isPrimeEligible$annotations", "Companion", "b", "a", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class ProductSuggestion {
    public static final a Companion = new a((i) null);
    private final String currencyCode;
    private final String imageUrl;
    private final boolean isPrimeEligible;
    private final String name;
    private final Float originalPrice;
    private final Float price;
    private final String productUrl;

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f9260a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9260a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9261b;

        static {
            b bVar = new b();
            f9260a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion", bVar, 7);
            s0Var.p("click_url", false);
            s0Var.p("currency", false);
            s0Var.p("image_url", false);
            s0Var.p("name", false);
            s0Var.p("price", false);
            s0Var.p("original_price", false);
            s0Var.p("is_prime_eligible", false);
            f9261b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f9261b;
        }

        public final F2.b[] c() {
            G0 g02 = G0.f622a;
            F2.b u3 = G2.a.u(g02);
            E e4 = E.f616a;
            return new F2.b[]{g02, u3, g02, g02, G2.a.u(e4), G2.a.u(e4), C0306i.f706a};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Float} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Float} */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a8, code lost:
            r8 = r3;
            r3 = 6;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion b(I2.e r28) {
            /*
                r27 = this;
                r0 = r28
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f9261b
                I2.c r0 = r0.d(r1)
                boolean r2 = r0.p()
                r3 = 6
                r4 = 5
                r5 = 3
                r6 = 4
                r7 = 2
                r8 = 1
                r9 = 0
                r10 = 0
                if (r2 == 0) goto L_0x0055
                java.lang.String r2 = r0.z(r1, r9)
                J2.G0 r9 = J2.G0.f622a
                java.lang.Object r8 = r0.m(r1, r8, r9, r10)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r7 = r0.z(r1, r7)
                java.lang.String r5 = r0.z(r1, r5)
                J2.E r9 = J2.E.f616a
                java.lang.Object r6 = r0.m(r1, r6, r9, r10)
                java.lang.Float r6 = (java.lang.Float) r6
                java.lang.Object r4 = r0.m(r1, r4, r9, r10)
                java.lang.Float r4 = (java.lang.Float) r4
                boolean r3 = r0.n(r1, r3)
                r9 = 127(0x7f, float:1.78E-43)
                r19 = r2
                r25 = r3
                r24 = r4
                r22 = r5
                r23 = r6
                r21 = r7
                r20 = r8
                r18 = r9
                goto L_0x00c8
            L_0x0055:
                r16 = r8
                r2 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r9 = r15
                r10 = r2
            L_0x005f:
                if (r16 == 0) goto L_0x00b8
                int r8 = r0.e(r1)
                switch(r8) {
                    case -1: goto L_0x00b4;
                    case 0: goto L_0x00ab;
                    case 1: goto L_0x009c;
                    case 2: goto L_0x0095;
                    case 3: goto L_0x008e;
                    case 4: goto L_0x0082;
                    case 5: goto L_0x0076;
                    case 6: goto L_0x006e;
                    default: goto L_0x0068;
                }
            L_0x0068:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r8)
                throw r0
            L_0x006e:
                boolean r2 = r0.n(r1, r3)
                r10 = r10 | 64
            L_0x0074:
                r8 = 1
                goto L_0x005f
            L_0x0076:
                J2.E r8 = J2.E.f616a
                java.lang.Object r8 = r0.m(r1, r4, r8, r9)
                r9 = r8
                java.lang.Float r9 = (java.lang.Float) r9
                r10 = r10 | 32
                goto L_0x0074
            L_0x0082:
                J2.E r8 = J2.E.f616a
                java.lang.Object r8 = r0.m(r1, r6, r8, r15)
                r15 = r8
                java.lang.Float r15 = (java.lang.Float) r15
                r10 = r10 | 16
                goto L_0x0074
            L_0x008e:
                java.lang.String r14 = r0.z(r1, r5)
                r10 = r10 | 8
                goto L_0x0074
            L_0x0095:
                java.lang.String r13 = r0.z(r1, r7)
                r10 = r10 | 4
                goto L_0x0074
            L_0x009c:
                J2.G0 r8 = J2.G0.f622a
                r3 = 1
                java.lang.Object r8 = r0.m(r1, r3, r8, r12)
                r12 = r8
                java.lang.String r12 = (java.lang.String) r12
                r10 = r10 | 2
            L_0x00a8:
                r8 = r3
                r3 = 6
                goto L_0x005f
            L_0x00ab:
                r3 = 1
                r8 = 0
                java.lang.String r11 = r0.z(r1, r8)
                r10 = r10 | 1
                goto L_0x00a8
            L_0x00b4:
                r8 = 0
                r16 = r8
                goto L_0x0074
            L_0x00b8:
                r25 = r2
                r24 = r9
                r18 = r10
                r19 = r11
                r20 = r12
                r21 = r13
                r22 = r14
                r23 = r15
            L_0x00c8:
                r0.c(r1)
                ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion r0 = new ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion
                r26 = 0
                r17 = r0
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion.b.b(I2.e):ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, ProductSuggestion productSuggestion) {
            o.e(fVar, "encoder");
            o.e(productSuggestion, "value");
            f fVar2 = f9261b;
            d d4 = fVar.d(fVar2);
            ProductSuggestion.write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease(productSuggestion, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ ProductSuggestion(int i4, String str, String str2, String str3, String str4, Float f4, Float f5, boolean z3, C0 c02) {
        if (127 != (i4 & 127)) {
            C0317n0.a(i4, 127, b.f9260a.a());
        }
        this.productUrl = str;
        this.currencyCode = str2;
        this.imageUrl = str3;
        this.name = str4;
        this.price = f4;
        this.originalPrice = f5;
        this.isPrimeEligible = z3;
    }

    public static /* synthetic */ ProductSuggestion copy$default(ProductSuggestion productSuggestion, String str, String str2, String str3, String str4, Float f4, Float f5, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = productSuggestion.productUrl;
        }
        if ((i4 & 2) != 0) {
            str2 = productSuggestion.currencyCode;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            str3 = productSuggestion.imageUrl;
        }
        String str6 = str3;
        if ((i4 & 8) != 0) {
            str4 = productSuggestion.name;
        }
        String str7 = str4;
        if ((i4 & 16) != 0) {
            f4 = productSuggestion.price;
        }
        Float f6 = f4;
        if ((i4 & 32) != 0) {
            f5 = productSuggestion.originalPrice;
        }
        Float f7 = f5;
        if ((i4 & 64) != 0) {
            z3 = productSuggestion.isPrimeEligible;
        }
        return productSuggestion.copy(str, str5, str6, str7, f6, f7, z3);
    }

    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOriginalPrice$annotations() {
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getProductUrl$annotations() {
    }

    public static /* synthetic */ void isPrimeEligible$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease(ProductSuggestion productSuggestion, d dVar, f fVar) {
        dVar.p(fVar, 0, productSuggestion.productUrl);
        dVar.o(fVar, 1, G0.f622a, productSuggestion.currencyCode);
        dVar.p(fVar, 2, productSuggestion.imageUrl);
        dVar.p(fVar, 3, productSuggestion.name);
        E e4 = E.f616a;
        dVar.o(fVar, 4, e4, productSuggestion.price);
        dVar.o(fVar, 5, e4, productSuggestion.originalPrice);
        dVar.j(fVar, 6, productSuggestion.isPrimeEligible);
    }

    public final String component1() {
        return this.productUrl;
    }

    public final String component2() {
        return this.currencyCode;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.name;
    }

    public final Float component5() {
        return this.price;
    }

    public final Float component6() {
        return this.originalPrice;
    }

    public final boolean component7() {
        return this.isPrimeEligible;
    }

    public final ProductSuggestion copy(String str, String str2, String str3, String str4, Float f4, Float f5, boolean z3) {
        o.e(str, "productUrl");
        o.e(str3, "imageUrl");
        o.e(str4, "name");
        return new ProductSuggestion(str, str2, str3, str4, f4, f5, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSuggestion)) {
            return false;
        }
        ProductSuggestion productSuggestion = (ProductSuggestion) obj;
        return o.a(this.productUrl, productSuggestion.productUrl) && o.a(this.currencyCode, productSuggestion.currencyCode) && o.a(this.imageUrl, productSuggestion.imageUrl) && o.a(this.name, productSuggestion.name) && o.a(this.price, productSuggestion.price) && o.a(this.originalPrice, productSuggestion.originalPrice) && this.isPrimeEligible == productSuggestion.isPrimeEligible;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Float getOriginalPrice() {
        return this.originalPrice;
    }

    public final Float getPrice() {
        return this.price;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public int hashCode() {
        int hashCode = this.productUrl.hashCode() * 31;
        String str = this.currencyCode;
        int i4 = 0;
        int hashCode2 = (this.name.hashCode() + ((this.imageUrl.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        Float f4 = this.price;
        int hashCode3 = (hashCode2 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.originalPrice;
        if (f5 != null) {
            i4 = f5.hashCode();
        }
        return c.a(this.isPrimeEligible) + ((hashCode3 + i4) * 31);
    }

    public final boolean isPrimeEligible() {
        return this.isPrimeEligible;
    }

    public String toString() {
        return "ProductSuggestion(productUrl=" + this.productUrl + ", currencyCode=" + this.currencyCode + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", price=" + this.price + ", originalPrice=" + this.originalPrice + ", isPrimeEligible=" + this.isPrimeEligible + ')';
    }

    public ProductSuggestion(String str, String str2, String str3, String str4, Float f4, Float f5, boolean z3) {
        o.e(str, "productUrl");
        o.e(str3, "imageUrl");
        o.e(str4, "name");
        this.productUrl = str;
        this.currencyCode = str2;
        this.imageUrl = str3;
        this.name = str4;
        this.price = f4;
        this.originalPrice = f5;
        this.isPrimeEligible = z3;
    }
}
