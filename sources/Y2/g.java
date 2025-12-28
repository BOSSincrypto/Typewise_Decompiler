package Y2;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public abstract class g {
    /* access modifiers changed from: private */
    public static final int b(LogRecord logRecord) {
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == level.intValue()) {
            return 4;
        }
        return 3;
    }
}
