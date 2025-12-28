package ch.icoaching.wrio.autocorrect;

public abstract class e {
    /* access modifiers changed from: private */
    public static final boolean b(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 10 ? str.equals("\n") : hashCode == 43 ? str.equals("+") : hashCode == 47 ? str.equals("/") : !(hashCode == 61 ? !str.equals("=") : !(hashCode == 92 && str.equals("\\")))) {
            return true;
        }
        return false;
    }
}
