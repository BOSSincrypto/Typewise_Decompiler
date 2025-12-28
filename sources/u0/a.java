package U0;

import com.appfeel.cordova.annotated.android.plugin.ExecutionThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    String actionName() default "";

    boolean isAutofinish() default true;

    ExecutionThread thread() default ExecutionThread.MAIN;
}
