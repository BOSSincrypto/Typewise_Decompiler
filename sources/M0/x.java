package m0;

import java.util.concurrent.Executor;

public class x implements Executor {
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
