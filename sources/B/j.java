package b;

import ch.icoaching.wrio.onboarding.state.OnBoardingState;
import kotlin.jvm.internal.o;

public abstract class j {
    public static final OnBoardingState a(String str) {
        o.e(str, "<this>");
        return OnBoardingState.valueOf(str);
    }
}
