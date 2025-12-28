package com.getcapacitor;

import android.content.SharedPreferences;
import androidx.appcompat.app.C0370d;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public final class AppUUID {
    private static final String KEY = "CapacitorAppUUID";

    private static void assertAppUUID(C0370d dVar) {
        if (readUUID(dVar).equals("")) {
            regenerateAppUUID(dVar);
        }
    }

    private static String bytesToHex(byte[] bArr) {
        byte[] bytes = "0123456789ABCDEF".getBytes(StandardCharsets.US_ASCII);
        byte[] bArr2 = new byte[(bArr.length * 2)];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            int i5 = i4 * 2;
            bArr2[i5] = bytes[(b4 & 255) >>> 4];
            bArr2[i5 + 1] = bytes[b4 & 15];
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    private static String generateUUID() {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
        return bytesToHex(instance.digest());
    }

    public static String getAppUUID(C0370d dVar) {
        assertAppUUID(dVar);
        return readUUID(dVar);
    }

    private static String readUUID(C0370d dVar) {
        return dVar.getPreferences(0).getString(KEY, "");
    }

    public static void regenerateAppUUID(C0370d dVar) {
        try {
            writeUUID(dVar, generateUUID());
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("Capacitor App UUID could not be generated.");
        }
    }

    private static void writeUUID(C0370d dVar, String str) {
        SharedPreferences.Editor edit = dVar.getPreferences(0).edit();
        edit.putString(KEY, str);
        edit.apply();
    }
}
