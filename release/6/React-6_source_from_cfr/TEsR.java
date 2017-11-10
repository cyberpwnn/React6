/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class TEsR
implements Ahqh {
    private String name;
    private String description;
    private String IydG;
    private String[] tnMY;
    private Lhol myxn;
    private SCOk hjil;
    private GapC BclT;
    private vsgc VvxM;
    private WFnH qdcE;
    private double DrcY;
    private aKuV<Class<?>, qAsQ<NxIh>> jqQA;

    public TEsR(vsgc vsgc2) {
        this((String)TEsR.Tt(vsgc2), (String)TEsR.Tt(vsgc2), (Lhol)((Object)TEsR.Tt(vsgc2)), (GapC)((Object)TEsR.Tt(vsgc2)), vsgc2);
    }

    public TEsR(String string, String string2, Lhol lhol, GapC gapC, vsgc vsgc2) {
        this.name = string;
        this.description = string2;
        this.myxn = lhol;
        this.IydG = "";
        this.DrcY = 0.0;
        this.hjil = (SCOk)((Object)yy.p(-1801459103));
        this.BclT = gapC;
        this.VvxM = vsgc2;
        this.jqQA = new aKuV();
        this.qdcE = null;
        this.tnMY = new String[0];
    }

    @Override
    public /* varargs */ NxIh[] mXJp(NxIh ... arrnxIh) {
        PBUD<NxIh> pBUD = new PBUD<NxIh>(arrnxIh);
        Object object = TEsR.Tt(TEsR.Tt(this.cdDX()));
        block0 : while (object.hasNext()) {
            Class class_ = (Class)object.next();
            for (NxIh nxIh : arrnxIh) {
                if (TEsR.Tt(nxIh.getType(), class_) != false) continue block0;
            }
            TEsR.Tt(pBUD, ((qAsQ)TEsR.Tt(this.cdDX(), class_)).get());
        }
        return (NxIh[])((Object[])TEsR.Tt(pBUD, new NxIh[TEsR.Tt(pBUD)]));
    }

    @Override
    public void mXJp(Class<?> class_, qAsQ<NxIh> qAsQ2) {
        TEsR.Tt((aKuV)yy.h(this, -1669731916), class_, qAsQ2);
    }

    @Override
    public String getName() {
        return (String)yy.h(this, 1489562034);
    }

    @Override
    public String getDescription() {
        return (String)yy.h(this, -1280448089);
    }

    @Override
    public Lhol CLtX() {
        return (Lhol)((Object)yy.h(this, -1773606488));
    }

    @Override
    public SCOk DGgy() {
        return (SCOk)((Object)yy.h(this, -193795651));
    }

    @Override
    public String getStatus() {
        return (String)yy.h(this, 177596854);
    }

    @Override
    public void dMNe(String string) {
        yy.E(this, 177596854, string);
    }

    @Override
    public double getProgress() {
        return (Double)yy.h(this, -583669317);
    }

    @Override
    public void setProgress(double d) {
        yy.E(this, -583669317, d);
    }

    @Override
    public GapC nSBH() {
        return (GapC)((Object)yy.h(this, -1547507268));
    }

    @Override
    public vsgc wUJy() {
        return (vsgc)((Object)yy.h(this, -1547245135));
    }

    @Override
    public aKuV<Class<?>, qAsQ<NxIh>> cdDX() {
        return (aKuV)yy.h(this, -1669731916);
    }

    @Override
    public /* varargs */ void ksfs(WFnH wFnH, NxIh ... arrnxIh) throws Ynto {
        if (TEsR.Tt(this.DGgy(), (SCOk)((Object)yy.p(-1947211227))) != false) {
            throw new Ynto();
        }
        yy.E(this, -193795651, (Object)((SCOk)((Object)yy.p(-1947211227))));
        yy.E(this, 77785530, wFnH);
        this.mXJp(wFnH, this.mXJp(arrnxIh));
    }

    @Override
    public void onuL() {
        yy.E(this, -193795651, (Object)((SCOk)((Object)yy.p(-1801459103))));
    }

    @Override
    public WFnH aelV() {
        return (WFnH)yy.h(this, 77785530);
    }

    @Override
    public String[] Cnvn() {
        return (String[])yy.h(this, -1609832017);
    }

    @Override
    public /* varargs */ void mXJp(String ... arrstring) {
        yy.E(this, -1609832017, arrstring);
    }

    @Override
    public /* varargs */ abstract void mXJp(WFnH var1, NxIh ... var2);

    private static Object Tt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

