package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;

abstract class b {

    static class a {
        static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        static long c(FileDescriptor fileDescriptor, long j4, int i4) {
            return Os.lseek(fileDescriptor, j4, i4);
        }
    }

    /* renamed from: androidx.exifinterface.media.b$b  reason: collision with other inner class name */
    static class C0093b {
        static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i4])}));
        }
        return sb.toString();
    }

    static long[] b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                jArr[i4] = (long) iArr[i4];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bArr2.length; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }
}
