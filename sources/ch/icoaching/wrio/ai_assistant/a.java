package ch.icoaching.wrio.ai_assistant;

import android.content.Context;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import u2.l;

public final /* synthetic */ class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultAiAssistantController f9138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f9139b;

    public /* synthetic */ a(DefaultAiAssistantController defaultAiAssistantController, Context context) {
        this.f9138a = defaultAiAssistantController;
        this.f9139b = context;
    }

    public final Object invoke(Object obj) {
        return DefaultAiAssistantController.p(this.f9138a, this.f9139b, (PromptItemType) obj);
    }
}
