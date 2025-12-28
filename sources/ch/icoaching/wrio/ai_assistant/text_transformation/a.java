package ch.icoaching.wrio.ai_assistant.text_transformation;

import ch.icoaching.wrio.C0561z;
import ch.icoaching.wrio.ai_assistant.text_transformation.TonalityTextTransformation;
import kotlin.jvm.internal.o;

public abstract class a {
    public static final int a(String str) {
        o.e(str, "<this>");
        if (o.a(str, TonalityTextTransformation.Tonality.FORMAL.getValue())) {
            return C0561z.formal;
        }
        if (o.a(str, TonalityTextTransformation.Tonality.FRIENDLY.getValue())) {
            return C0561z.friendly;
        }
        if (o.a(str, TonalityTextTransformation.Tonality.ACADEMIC.getValue())) {
            return C0561z.academic;
        }
        if (o.a(str, TonalityTextTransformation.Tonality.CASUAL.getValue())) {
            return C0561z.casual;
        }
        if (o.a(str, TonalityTextTransformation.Tonality.ROMANTIC.getValue())) {
            return C0561z.romantic;
        }
        if (o.a(str, TonalityTextTransformation.Tonality.FUNNY.getValue())) {
            return C0561z.funny;
        }
        throw new IllegalArgumentException("Unknown tonality value");
    }

    public static final TonalityTextTransformation.Tonality b(String str) {
        o.e(str, "<this>");
        TonalityTextTransformation.Tonality tonality = TonalityTextTransformation.Tonality.FORMAL;
        if (!o.a(str, tonality.getValue())) {
            tonality = TonalityTextTransformation.Tonality.FRIENDLY;
            if (!o.a(str, tonality.getValue())) {
                tonality = TonalityTextTransformation.Tonality.ACADEMIC;
                if (!o.a(str, tonality.getValue())) {
                    tonality = TonalityTextTransformation.Tonality.CASUAL;
                    if (!o.a(str, tonality.getValue())) {
                        tonality = TonalityTextTransformation.Tonality.ROMANTIC;
                        if (!o.a(str, tonality.getValue())) {
                            tonality = TonalityTextTransformation.Tonality.FUNNY;
                            if (!o.a(str, tonality.getValue())) {
                                throw new IllegalArgumentException("Unknown tonality value");
                            }
                        }
                    }
                }
            }
        }
        return tonality;
    }
}
