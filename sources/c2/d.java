package C2;

import kotlin.jvm.internal.o;
import kotlin.time.DurationUnit;

abstract class d {
    public static final double a(double d4, DurationUnit durationUnit, DurationUnit durationUnit2) {
        o.e(durationUnit, "sourceUnit");
        o.e(durationUnit2, "targetUnit");
        long convert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(1, durationUnit.getTimeUnit$kotlin_stdlib());
        if (convert > 0) {
            return d4 * ((double) convert);
        }
        return d4 / ((double) durationUnit.getTimeUnit$kotlin_stdlib().convert(1, durationUnit2.getTimeUnit$kotlin_stdlib()));
    }

    public static final long b(long j4, DurationUnit durationUnit, DurationUnit durationUnit2) {
        o.e(durationUnit, "sourceUnit");
        o.e(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j4, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long c(long j4, DurationUnit durationUnit, DurationUnit durationUnit2) {
        o.e(durationUnit, "sourceUnit");
        o.e(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j4, durationUnit.getTimeUnit$kotlin_stdlib());
    }
}
