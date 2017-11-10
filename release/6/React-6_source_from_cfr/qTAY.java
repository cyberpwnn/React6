/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class qTAY {
    private String[] twQP;
    private int index = 0;
    public static final qTAY Yorx;
    public static final qTAY vuFg;
    public static final qTAY psUU;
    public static final qTAY pjdW;
    public static final qTAY ejeU;

    static {
        yy.K(1947403230, new qTAY());
        yy.K(899482595, new qTAY(NVIs$JbpD.H("\u4534"), NVIs$JbpD.H("\u4535"), NVIs$JbpD.H("\u4536"), NVIs$JbpD.H("\u4537"), NVIs$JbpD.H("\u4530"), NVIs$JbpD.H("\u4531"), NVIs$JbpD.H("\u4532"), NVIs$JbpD.H("\u4533")));
        yy.K(-572980252, new qTAY(NVIs$JbpD.H("\u46f0"), NVIs$JbpD.H("\u46f1"), NVIs$JbpD.H("\u46f2"), NVIs$JbpD.H("\u46f3")));
        yy.K(1155859225, new qTAY(NVIs$JbpD.H("\u4584"), NVIs$JbpD.H("\u4585"), NVIs$JbpD.H("\u4586"), NVIs$JbpD.H("\u4587"), NVIs$JbpD.H("\u4580"), NVIs$JbpD.H("\u4581")));
        yy.K(-1758329886, new qTAY(NVIs$JbpD.H("\u45a8"), NVIs$JbpD.H("\u45a9"), NVIs$JbpD.H("\u45aa"), NVIs$JbpD.H("\u45ab"), NVIs$JbpD.H("\u45aa"), NVIs$JbpD.H("\u45a9")));
    }

    public /* varargs */ qTAY(String ... arrstring) {
        this.twQP = arrstring;
    }

    public qTAY() {
        this(BkvY$LhxG.I("\u87ca"), BkvY$LhxG.I("\u87c9"), BkvY$LhxG.I("\u87ce"), BkvY$LhxG.I("\u87cb"), BkvY$LhxG.I("\u87cf"), BkvY$LhxG.I("\u87c8"));
    }

    public String toString() {
        if (((String[])yy.h(this, -1384250601)).length > (Integer)yy.h(this, -1222638824) + 1) {
            qTAY qTAY2 = this;
            yy.E(qTAY2, -1222638824, (Integer)yy.h(qTAY2, -1222638824) + 1);
        } else {
            yy.E(this, -1222638824, 0);
        }
        return qTAY.po(new StringBuilder((String)qTAY.po(((String[])yy.h(this, -1384250601))[(Integer)yy.h(this, -1222638824)])));
    }

    public String[] Wyys() {
        return (String[])yy.h(this, -1384250601);
    }

    public int getIndex() {
        return (Integer)yy.h(this, -1222638824);
    }

    private static Object po(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

