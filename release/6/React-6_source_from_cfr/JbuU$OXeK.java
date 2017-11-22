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

public final class JbuU$OXeK
extends JbuU$YoSa {
    private final int red;
    private final int green;
    private final int blue;

    public JbuU$OXeK(int n, int n2, int n3) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u7db6\u0f6a\u26f1\uff69\ua4f2\uf5ab\u49fe\u9e53\uf937\u9838\u6d43\u149d\u273f\u8b90\u49bf\u9d94\u3095\uddc7\u476a\u4e30\u2d14\u9410\uc7b4\u8fe9\u0096\u762c\u8d8d\ud327\uda56"));
        }
        if (n > 255) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u7db6\u0f6a\u26f1\uff69\ua4f2\uf5ab\u49fe\u9e53\uf937\u9838\u6d43\u149d\u273f\u8b90\u49bf\u9d94\u3095\uddc3\u476c\u4e20\u2d19\u9407\uc7e6\u8fbd\u008a\u7625\u8d82\ud369\uda46\ufa7a\u5d12\ub5de"));
        }
        this.red = n;
        if (n2 < 0) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u7db6\u0f6a\u26f1\uff69\ua4e7\uf5bc\u49ff\u9e16\uf92f\u9879\u6d59\u1489\u2736\u8bc5\u49b3\u9dc7\u30dc\uddd8\u4725\u4e2b\u2d1e\u9415\uc7f1\u8fef\u00de\u7639\u8d8b\ud366\uda08\ufa68\u5d17"));
        }
        if (n2 > 255) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u7db6\u0f6a\u26f1\uff69\ua4e7\uf5bc\u49ff\u9e16\uf92f\u9879\u6d59\u1489\u2736\u8bc5\u49b3\u9dc7\u30dc\uddd8\u4725\u4e2f\u2d18\u9405\uc7fc\u8ff8\u008c\u766d\u8d97\ud36f\uda07\ufa26\u5d07\ub5d9\u3c45\ua8f4"));
        }
        this.green = n2;
        if (n3 < 0) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u7db6\u0f6a\u26f1\uff69\ua4e2\uf5a2\u49ef\u9e16\uf961\u982f\u6d4e\u1484\u272f\u8bd5\u49f6\u9d8e\u30c6\udd8b\u4769\u4e28\u2d06\u9407\uc7e6\u8fbd\u008a\u7625\u8d82\ud369\uda46\ufa78"));
        }
        if (n3 > 255) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u7db6\u0f6a\u26f1\uff69\ua4e2\uf5a2\u49ef\u9e16\uf961\u982f\u6d4e\u1484\u272f\u8bd5\u49f6\u9d8e\u30c6\udd8b\u476d\u4e2e\u2d16\u940a\uc7f1\u8fef\u00de\u7639\u8d8b\ud366\uda08\ufa68\u5d15\ub5de\u3c45"));
        }
        this.blue = n3;
    }

    public JbuU$OXeK(Color color) {
        this((int)JbuU$OXeK.Vz(color), (int)JbuU$OXeK.Vz(color), (int)JbuU$OXeK.Vz(color));
    }

    public int getRed() {
        return (Integer)cv.b(this, 1023997797);
    }

    public int getGreen() {
        return (Integer)cv.b(this, 1388181348);
    }

    public int getBlue() {
        return (Integer)cv.b(this, -735905945);
    }

    @Override
    public float uOTo() {
        return (float)((Integer)cv.b(this, 1023997797)).intValue() / 255.0f;
    }

    @Override
    public float ogUp() {
        return (float)((Integer)cv.b(this, 1388181348)).intValue() / 255.0f;
    }

    @Override
    public float jGEc() {
        return (float)((Integer)cv.b(this, -735905945)).intValue() / 255.0f;
    }

    private static Object Vz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

