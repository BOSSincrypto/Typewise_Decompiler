package ch.icoaching.wrio.autocorrect;

public abstract class a {
    public static final AutoCapitalizationState a(int i4) {
        AutoCapitalizationState autoCapitalizationState = AutoCapitalizationState.OFF;
        if (i4 == autoCapitalizationState.getValue()) {
            return autoCapitalizationState;
        }
        AutoCapitalizationState autoCapitalizationState2 = AutoCapitalizationState.LIMITED;
        if (i4 == autoCapitalizationState2.getValue()) {
            return autoCapitalizationState2;
        }
        return AutoCapitalizationState.FULL;
    }
}
