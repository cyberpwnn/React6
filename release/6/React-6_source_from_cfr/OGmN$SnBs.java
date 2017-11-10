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

public final class OGmN$SnBs
extends OGmN$qdWJ {
    private final int red;
    private final int green;
    private final int blue;

    public OGmN$SnBs(int n, int n2, int n3) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0377\u5d86\u63c1\u7b1e\u469e\u4d79\uc82b\u444d\ucacb\u9edc\uea10\ucbc7\u4c9d\ub39ae\u373a\u83ab\uf5c3\u22dc\ub2e8\ucfb7\uec28\u55bc\ua720\u7e34\u281d\u7552\ua569\ua1e0"));
        }
        if (n > 255) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0377\u5d86\u63c1\u7b1e\u469e\u4d79\uc82b\u444d\ucacb\u9edc\uea10\ucbc7\u4c9d\ub39ae\u373a\u83ab\uf5c7\u22da\ub2f8\ucfba\uec3f\u55ee\ua774\u7e28\u2814\u755d\ua527\ua1f0\u5018\u49f4\u78bd"));
        }
        this.red = n;
        if (n2 < 0) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0377\u5d86\u63c1\u7b1e\u468b\u4d6e\uc82a\u4408\ucad3\u9e9d\uea0a\ucbd3\u4c94\ub3cfi\u3769\u83e2\uf5dc\u2293\ub2f3\ucfbd\uec2d\u55f9\ua726\u7e7c\u2808\u7554\ua528\ua1be\u500a\u49f1"));
        }
        if (n2 > 255) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0377\u5d86\u63c1\u7b1e\u468b\u4d6e\uc82a\u4408\ucad3\u9e9d\uea0a\ucbd3\u4c94\ub3cfi\u3769\u83e2\uf5dc\u2293\ub2f7\ucfbb\uec3d\u55f4\ua731\u7e2e\u285c\u7548\ua521\ua1b1\u5044\u49e1\u78ba\ufec1\ua538"));
        }
        this.green = n2;
        if (n3 < 0) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0377\u5d86\u63c1\u7b1e\u468e\u4d70\uc83a\u4408\uca9d\u9ecb\uea1d\ucbde\u4c8d\ub3df,\u3720\u83f8\uf58f\u22df\ub2f0\ucfa5\uec3f\u55ee\ua774\u7e28\u2814\u755d\ua527\ua1f0\u501a"));
        }
        if (n3 > 255) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0377\u5d86\u63c1\u7b1e\u468e\u4d70\uc83a\u4408\uca9d\u9ecb\uea1d\ucbde\u4c8d\ub3df,\u3720\u83f8\uf58f\u22db\ub2f6\ucfb5\uec32\u55f9\ua726\u7e7c\u2808\u7554\ua528\ua1be\u500a\u49f3\u78bd\ufec1"));
        }
        this.blue = n3;
    }

    public OGmN$SnBs(Color color) {
        this((int)OGmN$SnBs.Zr(color), (int)OGmN$SnBs.Zr(color), (int)OGmN$SnBs.Zr(color));
    }

    public int getRed() {
        return (Integer)yy.h(this, 1041630528);
    }

    public int getGreen() {
        return (Integer)yy.h(this, 880215189);
    }

    public int getBlue() {
        return (Integer)yy.h(this, -1043200882);
    }

    @Override
    public float rVgx() {
        return (float)((Integer)yy.h(this, 1041630528)).intValue() / 255.0f;
    }

    @Override
    public float qCDb() {
        return (float)((Integer)yy.h(this, 880215189)).intValue() / 255.0f;
    }

    @Override
    public float cAju() {
        return (float)((Integer)yy.h(this, -1043200882)).intValue() / 255.0f;
    }

    private static Object Zr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

