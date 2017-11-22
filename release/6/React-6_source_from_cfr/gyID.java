/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class gyID
implements aMCk,
kkap {
    private int id;
    private String name;
    private boolean kIxq;
    private double dEdk;
    private double GtWO;
    private double VpAh;
    private boolean completed;
    private KeoU AbCx;
    private KeoU clto;
    protected int skdK;

    public gyID(String string) {
        this.OXeK(string, false);
        gyID.vg((KeoU)cv.b(this, 198636652));
        this.id = gyID.vg(gyID.vg(), false, new gyID$1(this));
    }

    public gyID(String string, int n) {
        this.OXeK(string, true);
        gyID.vg((KeoU)cv.b(this, 198636652));
        this.id = gyID.vg(gyID.vg(), false, n, new gyID$2(this));
    }

    public gyID(String string, int n, int n2) {
        this.OXeK(string, true);
        gyID.vg((KeoU)cv.b(this, 198636652));
        this.id = gyID.vg(gyID.vg(), false, n, new gyID$3(this, n2));
    }

    private void OXeK(String string, boolean bl) {
        cv.e(this, 198636652, new KeoU());
        cv.e(this, -1889143703, new KeoU());
        cv.e(this, -1874725784, bl);
        cv.e(this, -962399125, string);
        cv.e(this, 959050858, false);
        cv.e(this, 1517745237, 0.0);
        cv.e(this, -239078316, 0.0);
        cv.e(this, -985729961, 0.0);
        cv.e(this, -1951599514, 0);
    }

    @Override
    public void cancel() {
        gyID.vg(gyID.vg(), (Integer)cv.b(this, -1528761258));
        cv.e(this, 959050858, true);
        gyID.vg((KeoU)cv.b(this, 198636652));
        gyID gyID2 = this;
        cv.e(gyID2, -239078316, (Double)cv.b(gyID2, -239078316) + gyID.vg((KeoU)cv.b(this, 198636652)));
        gyID.vg((KeoU)cv.b(this, 198636652));
        gyID.vg((KeoU)cv.b(this, -1889143703));
    }

    @Override
    public int getId() {
        return (Integer)cv.b(this, -1528761258);
    }

    @Override
    public boolean lnfu() {
        return (Boolean)cv.b(this, -1874725784);
    }

    @Override
    public String getName() {
        return (String)cv.b(this, -962399125);
    }

    @Override
    public double vJAb() {
        return (Double)cv.b(this, 1517745237);
    }

    @Override
    public boolean pbBn() {
        return (Boolean)cv.b(this, 959050858);
    }

    @Override
    public double GHjQ() {
        return (Double)cv.b(this, -985729961);
    }

    @Override
    public double maJO() {
        return (Double)cv.b(this, -239078316);
    }

    static /* synthetic */ KeoU ssNb(gyID gyID2) {
        return (KeoU)cv.b(gyID2, -1889143703);
    }

    static /* synthetic */ void ssNb(gyID gyID2, boolean bl) {
        cv.e(gyID2, 959050858, bl);
    }

    static /* synthetic */ KeoU DYFV(gyID gyID2) {
        return (KeoU)cv.b(gyID2, 198636652);
    }

    static /* synthetic */ void ssNb(gyID gyID2, double d) {
        cv.e(gyID2, -239078316, d);
    }

    static /* synthetic */ void DYFV(gyID gyID2, double d) {
        cv.e(gyID2, 1517745237, d);
    }

    static /* synthetic */ double IWSm(gyID gyID2) {
        return (Double)cv.b(gyID2, -239078316);
    }

    static /* synthetic */ void IWSm(gyID gyID2, double d) {
        cv.e(gyID2, -985729961, d);
    }

    static /* synthetic */ double OXeK(gyID gyID2) {
        return (Double)cv.b(gyID2, -985729961);
    }

    static /* synthetic */ double YoSa(gyID gyID2) {
        return (Double)cv.b(gyID2, 1517745237);
    }

    private static Object vg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

