package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f4958k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f4959a;

    /* renamed from: b  reason: collision with root package name */
    Object f4960b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4961c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f4962d;

    /* renamed from: e  reason: collision with root package name */
    public int f4963e;

    /* renamed from: f  reason: collision with root package name */
    public int f4964f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4965g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f4966h;

    /* renamed from: i  reason: collision with root package name */
    public String f4967i;

    /* renamed from: j  reason: collision with root package name */
    public String f4968j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                return -1;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f4959a) {
                case -1:
                    return (Icon) iconCompat.f4960b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f4960b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.e(), iconCompat.f4963e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f4960b, iconCompat.f4963e, iconCompat.f4964f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f4960b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f4960b, false));
                        break;
                    } else {
                        icon = b.b((Bitmap) iconCompat.f4960b);
                        break;
                    }
                case 6:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        icon = d.a(iconCompat.g());
                        break;
                    } else if (context != null) {
                        InputStream h4 = iconCompat.h(context);
                        if (h4 != null) {
                            if (i4 < 26) {
                                icon = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(h4), false));
                                break;
                            } else {
                                icon = b.b(BitmapFactory.decodeStream(h4));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.g());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.g());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f4965g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4966h;
            if (mode != IconCompat.f4958k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f4959a = -1;
        this.f4961c = null;
        this.f4962d = null;
        this.f4963e = 0;
        this.f4964f = 0;
        this.f4965g = null;
        this.f4966h = f4958k;
        this.f4967i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = (float) min;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z3) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4960b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i4) {
        androidx.core.util.c.c(str);
        if (i4 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4963e = i4;
            if (resources != null) {
                try {
                    iconCompat.f4960b = resources.getResourceName(i4);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f4960b = str;
            }
            iconCompat.f4968j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String m(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int d() {
        int i4 = this.f4959a;
        if (i4 == -1) {
            return a.a(this.f4960b);
        }
        if (i4 == 2) {
            return this.f4963e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        int i4 = this.f4959a;
        if (i4 == -1) {
            return a.b(this.f4960b);
        }
        if (i4 == 2) {
            String str = this.f4968j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f4960b).split(":", -1)[0];
            }
            return this.f4968j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int f() {
        int i4 = this.f4959a;
        if (i4 == -1) {
            return a.c(this.f4960b);
        }
        return i4;
    }

    public Uri g() {
        int i4 = this.f4959a;
        if (i4 == -1) {
            return a.d(this.f4960b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f4960b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream h(Context context) {
        Uri g4 = g();
        String scheme = g4.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(g4);
            } catch (Exception e4) {
                Log.w("IconCompat", "Unable to load image from URI: " + g4, e4);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f4960b));
            } catch (FileNotFoundException e5) {
                Log.w("IconCompat", "Unable to load image from path: " + g4, e5);
                return null;
            }
        }
    }

    public void i() {
        this.f4966h = PorterDuff.Mode.valueOf(this.f4967i);
        switch (this.f4959a) {
            case -1:
                Parcelable parcelable = this.f4962d;
                if (parcelable != null) {
                    this.f4960b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f4962d;
                if (parcelable2 != null) {
                    this.f4960b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4961c;
                this.f4960b = bArr;
                this.f4959a = 3;
                this.f4963e = 0;
                this.f4964f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4961c, Charset.forName("UTF-16"));
                this.f4960b = str;
                if (this.f4959a == 2 && this.f4968j == null) {
                    this.f4968j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4960b = this.f4961c;
                return;
            default:
                return;
        }
    }

    public void j(boolean z3) {
        this.f4967i = this.f4966h.name();
        switch (this.f4959a) {
            case -1:
                if (!z3) {
                    this.f4962d = (Parcelable) this.f4960b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z3) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f4960b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f4961c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f4962d = (Parcelable) this.f4960b;
                return;
            case 2:
                this.f4961c = ((String) this.f4960b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4961c = (byte[]) this.f4960b;
                return;
            case 4:
            case 6:
                this.f4961c = this.f4960b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public Icon k() {
        return l((Context) null);
    }

    public Icon l(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f4959a == -1) {
            return String.valueOf(this.f4960b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m(this.f4959a));
        switch (this.f4959a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4960b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4960b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4968j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(d())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4963e);
                if (this.f4964f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4964f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4960b);
                break;
        }
        if (this.f4965g != null) {
            sb.append(" tint=");
            sb.append(this.f4965g);
        }
        if (this.f4966h != f4958k) {
            sb.append(" mode=");
            sb.append(this.f4966h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i4) {
        this.f4961c = null;
        this.f4962d = null;
        this.f4963e = 0;
        this.f4964f = 0;
        this.f4965g = null;
        this.f4966h = f4958k;
        this.f4967i = null;
        this.f4959a = i4;
    }
}
