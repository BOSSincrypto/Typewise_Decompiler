package ch.icoaching.wrio.keyboard;

import android.graphics.Bitmap;
import ch.icoaching.wrio.logging.Log;
import j2.C0690c;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1 extends SuspendLambda implements p {
    final /* synthetic */ C0690c.b $imageComposer;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1(C0690c.b bVar, c<? super DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1> cVar) {
        super(2, cVar);
        this.$imageComposer = bVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1(this.$imageComposer, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            try {
                return this.$imageComposer.a();
            } catch (RuntimeException e4) {
                Log.f10572a.o("DefaultKeyboardController", "Error blurring the background images for symbols and emojis", e4);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object invoke(D d4, c<? super Bitmap> cVar) {
        return ((DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
