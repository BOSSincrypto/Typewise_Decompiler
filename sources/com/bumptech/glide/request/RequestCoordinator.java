package com.bumptech.glide.request;

public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private RequestState(boolean z3) {
            this.isComplete = z3;
        }

        /* access modifiers changed from: package-private */
        public boolean isComplete() {
            return this.isComplete;
        }
    }

    void a(c cVar);

    boolean b();

    boolean c(c cVar);

    boolean f(c cVar);

    RequestCoordinator g();

    void j(c cVar);

    boolean l(c cVar);
}
