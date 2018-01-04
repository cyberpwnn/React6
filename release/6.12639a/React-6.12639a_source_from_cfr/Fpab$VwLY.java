/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Color;

public final class Fpab$VwLY
extends Fpab$TEqA {
    private final int red;
    private final int green;
    private final int blue;

    public Fpab$VwLY(int n, int n2, int n3) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u6f6c\u6c3e\uf49b\uefe6\u07b8\u4d42\udd01\uf8f9\u4f0a\u2a30\u9e7a\u0400\u78fd\ufe24\ud1af\u5a1d\ubaa8\ub7f0\uda9d\u186f\u2ed6\u2bfc\uca36\ue3c9\u25ac\uc0bf\ub0c4\ubc66\u1252"));
        }
        if (n > 255) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u6f6c\u6c3e\uf49b\uefe6\u07b8\u4d42\udd01\uf8f9\u4f0a\u2a30\u9e7a\u0400\u78fd\ufe24\ud1af\u5a1d\ubaa8\ub7f4\uda9b\u187f\u2edb\u2beb\uca64\ue39d\u25b0\uc0b6\ub0cb\ubc28\u1242\u87d6\u73ee\u2bcd"));
        }
        this.red = n;
        if (n2 < 0) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u6f6c\u6c3e\uf49b\uefe6\u07ad\u4d55\udd00\uf8bc\u4f12\u2a71\u9e60\u0414\u78f4\ufe71\ud1a3\u5a4e\ubae1\ub7ef\udad2\u1874\u2edc\u2bf9\uca73\ue3cf\u25e4\uc0aa\ub0c2\ubc27\u120c\u87c4\u73eb"));
        }
        if (n2 > 255) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u6f6c\u6c3e\uf49b\uefe6\u07ad\u4d55\udd00\uf8bc\u4f12\u2a71\u9e60\u0414\u78f4\ufe71\ud1a3\u5a4e\ubae1\ub7ef\udad2\u1870\u2eda\u2be9\uca7e\ue3d8\u25b6\uc0fe\ub0de\ubc2e\u1203\u878a\u73fb\u2bca\ue0e5\u7331"));
        }
        this.green = n2;
        if (n3 < 0) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u6f6c\u6c3e\uf49b\uefe6\u07a8\u4d4b\udd10\uf8bc\u4f5c\u2a27\u9e77\u0419\u78ed\ufe61\ud1e6\u5a07\ubafb\ub7bc\uda9e\u1877\u2ec4\u2beb\uca64\ue39d\u25b0\uc0b6\ub0cb\ubc28\u1242\u87d4"));
        }
        if (n3 > 255) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u6f6c\u6c3e\uf49b\uefe6\u07a8\u4d4b\udd10\uf8bc\u4f5c\u2a27\u9e77\u0419\u78ed\ufe61\ud1e6\u5a07\ubafb\ub7bc\uda9a\u1871\u2ed4\u2be6\uca73\ue3cf\u25e4\uc0aa\ub0c2\ubc27\u120c\u87c4\u73e9\u2bcd\ue0e5"));
        }
        this.blue = n3;
    }

    public Fpab$VwLY(Color color) {
        this((int)Fpab$VwLY.Qk(color), (int)Fpab$VwLY.Qk(color), (int)Fpab$VwLY.Qk(color));
    }

    public int getRed() {
        return (Integer)o.a(this, -492355335);
    }

    public int getGreen() {
        return (Integer)o.a(this, -978697992);
    }

    public int getBlue() {
        return (Integer)o.a(this, 592986359);
    }

    @Override
    public float bijP() {
        return (float)((Integer)o.a(this, -492355335)).intValue() / 255.0f;
    }

    @Override
    public float paqR() {
        return (float)((Integer)o.a(this, -978697992)).intValue() / 255.0f;
    }

    @Override
    public float xiiW() {
        return (float)((Integer)o.a(this, 592986359)).intValue() / 255.0f;
    }

    private static Object Qk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

