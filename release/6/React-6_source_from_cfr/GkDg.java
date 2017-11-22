/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class GkDg
implements DXfX {
    private double value;
    private String id;
    private String name;
    private String description;
    private APKB UlKG;
    private APKB tnSF;
    private int SfEN;

    public GkDg() {
        this.CMSR();
    }

    @Override
    public String getID() {
        return (String)cv.b(this, 1338118342);
    }

    @Override
    public String getName() {
        return (String)cv.b(this, 1761415361);
    }

    @Override
    public String getDescription() {
        return (String)cv.b(this, 840175808);
    }

    @Override
    public APKB KwOT() {
        return (APKB)((Object)cv.b(this, -1743384381));
    }

    @Override
    public APKB KUKx() {
        return (APKB)((Object)cv.b(this, 1062277314));
    }

    @Override
    public int getInterval() {
        return (Integer)cv.b(this, -652341043);
    }

    @Override
    public abstract void avmQ();

    @Override
    public abstract void CMSR();

    @Override
    public abstract String get();

    @Override
    public void setValue(double d) {
        cv.e(this, 646779084, d);
    }

    @Override
    public double getValue() {
        return (Double)cv.b(this, 646779084);
    }

    @Override
    public void setID(String string) {
        cv.e(this, 1338118342, string);
    }

    @Override
    public void setName(String string) {
        cv.e(this, 1761415361, string);
    }

    @Override
    public void setDescription(String string) {
        cv.e(this, 840175808, string);
    }

    @Override
    public void ssNb(APKB aPKB, APKB aPKB2) {
        cv.e(this, -1743384381, (Object)((Object)aPKB));
        cv.e(this, 1062277314, (Object)((Object)aPKB2));
    }

    @Override
    public void DYFV(int n) {
        cv.e(this, -652341043, (int)GkDg.bx(n, 1.0, 1200.0));
    }

    private static Object bx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

