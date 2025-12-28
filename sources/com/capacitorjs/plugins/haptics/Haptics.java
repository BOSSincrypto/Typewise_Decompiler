package com.capacitorjs.plugins.haptics;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.capacitorjs.plugins.haptics.arguments.HapticsSelectionType;
import com.capacitorjs.plugins.haptics.arguments.HapticsVibrationType;

public class Haptics {
    private Context context;
    private boolean selectionStarted = false;
    private final Vibrator vibrator;

    Haptics(Context context2) {
        this.context = context2;
        if (Build.VERSION.SDK_INT >= 31) {
            this.vibrator = c.a(context2.getSystemService("vibrator_manager")).getDefaultVibrator();
        } else {
            this.vibrator = getDeprecatedVibrator(context2);
        }
    }

    private Vibrator getDeprecatedVibrator(Context context2) {
        return (Vibrator) context2.getSystemService("vibrator");
    }

    private void vibratePre26(int i4) {
        this.vibrator.vibrate((long) i4);
    }

    public void performHaptics(HapticsVibrationType hapticsVibrationType) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createWaveform(hapticsVibrationType.getTimings(), hapticsVibrationType.getAmplitudes(), -1));
        } else {
            vibratePre26(hapticsVibrationType.getOldSDKPattern(), -1);
        }
    }

    public void selectionChanged() {
        if (this.selectionStarted) {
            performHaptics(new HapticsSelectionType());
        }
    }

    public void selectionEnd() {
        this.selectionStarted = false;
    }

    public void selectionStart() {
        this.selectionStarted = true;
    }

    public void vibrate(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createOneShot((long) i4, -1));
        } else {
            vibratePre26(i4);
        }
    }

    private void vibratePre26(long[] jArr, int i4) {
        this.vibrator.vibrate(jArr, i4);
    }
}
