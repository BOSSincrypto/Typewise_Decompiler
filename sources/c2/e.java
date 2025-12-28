package C2;

import kotlin.jvm.internal.o;
import kotlin.time.DurationUnit;

abstract class e extends d {
    public static final DurationUnit d(char c4, boolean z3) {
        if (!z3) {
            if (c4 == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c4);
        } else if (c4 == 'H') {
            return DurationUnit.HOURS;
        } else {
            if (c4 == 'M') {
                return DurationUnit.MINUTES;
            }
            if (c4 == 'S') {
                return DurationUnit.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c4);
        }
    }

    public static final DurationUnit e(String str) {
        o.e(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return DurationUnit.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (str.equals("h")) {
                return DurationUnit.HOURS;
            }
        } else if (str.equals("d")) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
