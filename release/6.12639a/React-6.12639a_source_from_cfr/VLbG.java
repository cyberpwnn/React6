/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class VLbG {
    private int[][] cBkB;
    private int BupC = 2;
    private int qvgQ = 64;

    public VLbG() {
        this.cBkB = new int[((Integer)o.a(this, 92165779)).intValue()][((Integer)o.a(this, -589146366)).intValue()];
        int n = 0;
        while (n < (Integer)o.a(this, 92165779)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, -589146366)) {
                ((int[][])o.a((Object)this, (int)2123650817))[n][n2] = -1;
                ++n2;
            }
            ++n;
        }
    }

    public EBcM UAGQ(int n) {
        if (n == -1) {
            return null;
        }
        int n2 = 0;
        while (n2 < (Integer)o.a(this, 92165779)) {
            int n3 = 0;
            while (n3 < (Integer)o.a(this, -589146366)) {
                if (((int[][])o.a(this, 2123650817))[n2][n3] == n) {
                    return new EBcM(n3 << 6, n2 << 6);
                }
                ++n3;
            }
            ++n2;
        }
        return null;
    }

    public void yJLS(JcRS jcRS, int n) {
        int n2;
        int n3;
        int n4;
        if (VLbG.SZ(jcRS, (JcRS)((Object)o.k(1895847680))) != false) {
            int n5;
            n4 = -1;
            n3 = (Integer)o.a(this, -589146366);
            n2 = 0;
            while (n2 < (Integer)o.a(this, 92165779)) {
                n5 = 1;
                int n6 = 0;
                while (n6 < (Integer)o.a(this, -589146366)) {
                    if (((int[][])o.a(this, 2123650817))[n2][n6] != -1) {
                        n5 = 0;
                        break;
                    }
                    ++n6;
                }
                if (n5 != 0 && --n3 <= 0) {
                    n4 = n2 - ((Integer)o.a(this, -589146366) - 1);
                    break;
                }
                ++n2;
            }
            if (n4 != -1) {
                n2 = n4;
                while (n2 < (Integer)o.a(this, -589146366) + n4) {
                    n5 = 0;
                    while (n5 < (Integer)o.a(this, -589146366)) {
                        ((int[][])o.a((Object)this, (int)2123650817))[n2][n5] = n;
                        ++n5;
                    }
                    ++n2;
                }
            }
        }
        if (VLbG.SZ(jcRS, (JcRS)((Object)o.k(-19506743))) != false) {
            n4 = 0;
            while (n4 < (Integer)o.a(this, 92165779)) {
                n3 = 1;
                n2 = 0;
                while (n2 < (Integer)o.a(this, -589146366)) {
                    if (((int[][])o.a(this, 2123650817))[n4][n2] != -1) {
                        n3 = 0;
                        break;
                    }
                    ++n2;
                }
                if (n3 != 0) {
                    n2 = 0;
                    while (n2 < (Integer)o.a(this, -589146366)) {
                        ((int[][])o.a((Object)this, (int)2123650817))[n4][n2] = n;
                        ++n2;
                    }
                    break;
                }
                ++n4;
            }
        }
        if (VLbG.SZ(jcRS, (JcRS)((Object)o.k(-1776330296))) != false) {
            n4 = 0;
            while (n4 < (Integer)o.a(this, 92165779)) {
                n3 = 0;
                while (n3 < (Integer)o.a(this, -589146366)) {
                    if (((int[][])o.a(this, 2123650817))[n4][n3] == -1) {
                        ((int[][])o.a((Object)this, (int)2123650817))[n4][n3] = n;
                        return;
                    }
                    ++n3;
                }
                ++n4;
            }
        }
    }

    public void print() {
        int n = 0;
        while (n < (Integer)o.a(this, 92165779)) {
            Object object = "";
            int n2 = 0;
            while (n2 < (Integer)o.a(this, -589146366)) {
                object = VLbG.SZ(VLbG.SZ(VLbG.SZ(VLbG.SZ(new StringBuilder((String)VLbG.SZ(object)), nJPf$sILv.G("\u7836")), this.UAGQ(((int[][])o.a(this, 2123650817))[n][n2])), nJPf$sILv.G("\u7830\u1d8f")));
                ++n2;
            }
            VLbG.SZ(object);
            ++n;
        }
    }

    private static Object SZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

