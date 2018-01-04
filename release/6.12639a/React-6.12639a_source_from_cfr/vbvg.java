/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class vbvg
implements XcqT,
wMIF {
    private int id;
    private String name;
    private boolean plCA;
    private double tVJn;
    private double ghvX;
    private double TiqN;
    private boolean completed;
    private MRfD bjiX;
    private MRfD XKjJ;
    protected int GRjY;

    public vbvg(String string) {
        this(string, 0);
    }

    public vbvg(String string, int n) {
        this.VwLY(string, true);
        vbvg.Bj((MRfD)o.a(this, -247837212));
        this.id = vbvg.Bj(vbvg.Bj(), n, new vbvg$1(this));
    }

    private void VwLY(String string, boolean bl) {
        o.v(this, -247837212, new MRfD());
        o.v(this, 1108364771, new MRfD());
        o.v(this, 1055935954, bl);
        o.v(this, -412463663, string);
        o.v(this, -418820656, false);
        o.v(this, 436817359, 0.0);
        o.v(this, 270028238, 0.0);
        o.v(this, -604877363, 0.0);
        o.v(this, 169496028, 0);
    }

    @Override
    public void cancel() {
        vbvg.Bj(vbvg.Bj(), (Integer)o.a(this, -1900196404));
        o.v(this, -418820656, true);
        vbvg.Bj((MRfD)o.a(this, -247837212));
        vbvg vbvg2 = this;
        o.v(vbvg2, 270028238, (Double)o.a(vbvg2, 270028238) + vbvg.Bj((MRfD)o.a(this, -247837212)));
        vbvg.Bj((MRfD)o.a(this, -247837212));
        vbvg.Bj((MRfD)o.a(this, 1108364771));
    }

    @Override
    public int getId() {
        return (Integer)o.a(this, -1900196404);
    }

    @Override
    public boolean XKDx() {
        return (Boolean)o.a(this, 1055935954);
    }

    @Override
    public String getName() {
        return (String)o.a(this, -412463663);
    }

    @Override
    public double FNbH() {
        return (Double)o.a(this, 436817359);
    }

    @Override
    public boolean VfbL() {
        return (Boolean)o.a(this, -418820656);
    }

    @Override
    public double lnpk() {
        return (Double)o.a(this, -604877363);
    }

    @Override
    public double iLTq() {
        return (Double)o.a(this, 270028238);
    }

    static /* synthetic */ MRfD yJLS(vbvg vbvg2) {
        return (MRfD)o.a(vbvg2, 1108364771);
    }

    static /* synthetic */ void yJLS(vbvg vbvg2, double d) {
        o.v(vbvg2, 436817359, d);
    }

    static /* synthetic */ double UtIU(vbvg vbvg2) {
        return (Double)o.a(vbvg2, -604877363);
    }

    static /* synthetic */ double biLo(vbvg vbvg2) {
        return (Double)o.a(vbvg2, 436817359);
    }

    static /* synthetic */ void UtIU(vbvg vbvg2, double d) {
        o.v(vbvg2, -604877363, d);
    }

    static /* synthetic */ MRfD VwLY(vbvg vbvg2) {
        return (MRfD)o.a(vbvg2, -247837212);
    }

    static /* synthetic */ double TEqA(vbvg vbvg2) {
        return (Double)o.a(vbvg2, 270028238);
    }

    static /* synthetic */ void biLo(vbvg vbvg2, double d) {
        o.v(vbvg2, 270028238, d);
    }

    private static Object Bj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

