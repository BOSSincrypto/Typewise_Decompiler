package d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: d0.a  reason: case insensitive filesystem */
abstract class C0610a {
    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void b(Animator animator) {
        animator.pause();
    }

    static void c(Animator animator) {
        animator.resume();
    }
}
