package ch.icoaching.wrio.ai_assistant;

import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import u2.l;

public final /* synthetic */ class c implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultAiAssistantController f9142a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PromptItemType f9143b;

    public /* synthetic */ c(DefaultAiAssistantController defaultAiAssistantController, PromptItemType promptItemType) {
        this.f9142a = defaultAiAssistantController;
        this.f9143b = promptItemType;
    }

    public final Object invoke(Object obj) {
        return DefaultAiAssistantController.q(this.f9142a, this.f9143b, (String) obj);
    }
}
