package p0;

import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import kotlin.jvm.internal.o;

/* renamed from: p0.b  reason: case insensitive filesystem */
public final class C0849b {

    /* renamed from: a  reason: collision with root package name */
    private final PromptItemType f15826a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15827b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15828c;

    public C0849b(PromptItemType promptItemType, String str, int i4) {
        o.e(promptItemType, "promptItemType");
        o.e(str, "promptTitle");
        this.f15826a = promptItemType;
        this.f15827b = str;
        this.f15828c = i4;
    }

    public final int a() {
        return this.f15828c;
    }

    public final PromptItemType b() {
        return this.f15826a;
    }

    public final String c() {
        return this.f15827b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849b)) {
            return false;
        }
        C0849b bVar = (C0849b) obj;
        if (this.f15826a == bVar.f15826a && o.a(this.f15827b, bVar.f15827b) && this.f15828c == bVar.f15828c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15826a.hashCode() * 31) + this.f15827b.hashCode()) * 31) + this.f15828c;
    }

    public String toString() {
        return "AiAssistantPromptItem(promptItemType=" + this.f15826a + ", promptTitle=" + this.f15827b + ", promptImageResourceId=" + this.f15828c + ')';
    }
}
