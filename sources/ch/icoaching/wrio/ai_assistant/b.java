package ch.icoaching.wrio.ai_assistant;

import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import u2.l;

public final /* synthetic */ class b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultAiAssistantController f9140a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PromptItemType f9141b;

    public /* synthetic */ b(DefaultAiAssistantController defaultAiAssistantController, PromptItemType promptItemType) {
        this.f9140a = defaultAiAssistantController;
        this.f9141b = promptItemType;
    }

    public final Object invoke(Object obj) {
        return DefaultAiAssistantController.A(this.f9140a, this.f9141b, (String) obj);
    }
}
