package kotlin.text;

final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f13977a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static final Regex f13978b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f13978b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private n() {
    }
}
