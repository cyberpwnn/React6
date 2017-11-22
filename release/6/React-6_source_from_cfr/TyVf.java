/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class TyVf
implements CoXE {
    private String name;
    private String description;
    private String roui;
    private String[] Pdcq;
    private rwyd dfmS;
    private kQcX nBHO;
    private rMgK WaHe;
    private cIji qdbP;
    private ftyu NUlw;
    private double lTrT;
    private ktOu<Class<?>, xqeH<EmKi>> GkMB;

    public TyVf(cIji cIji2) {
        this((String)TyVf.Pt(cIji2), (String)TyVf.Pt(cIji2), (rwyd)((Object)TyVf.Pt(cIji2)), (rMgK)((Object)TyVf.Pt(cIji2)), cIji2);
    }

    public TyVf(String string, String string2, rwyd rwyd2, rMgK rMgK2, cIji cIji2) {
        this.name = string;
        this.description = string2;
        this.dfmS = rwyd2;
        this.roui = "";
        this.lTrT = 0.0;
        this.nBHO = (kQcX)((Object)cv.e(-838922497));
        this.WaHe = rMgK2;
        this.qdbP = cIji2;
        this.GkMB = new ktOu();
        this.NUlw = null;
        this.Pdcq = new String[0];
    }

    @Override
    public /* varargs */ EmKi[] ssNb(EmKi ... arremKi) {
        wfPa<EmKi> wfPa2 = new wfPa<EmKi>(arremKi);
        Object object = TyVf.Pt(TyVf.Pt(this.EmLA()));
        block0 : while (object.hasNext()) {
            Class class_ = (Class)object.next();
            for (EmKi emKi : arremKi) {
                if (TyVf.Pt(emKi.getType(), class_) != false) continue block0;
            }
            TyVf.Pt(wfPa2, ((xqeH)TyVf.Pt(this.EmLA(), class_)).get());
        }
        return (EmKi[])((Object[])TyVf.Pt(wfPa2, new EmKi[TyVf.Pt(wfPa2)]));
    }

    @Override
    public void ssNb(Class<?> class_, xqeH<EmKi> xqeH2) {
        TyVf.Pt((ktOu)cv.b(this, -593686620), class_, xqeH2);
    }

    @Override
    public String getName() {
        return (String)cv.b(this, -1434251354);
    }

    @Override
    public String getDescription() {
        return (String)cv.b(this, -2031087711);
    }

    @Override
    public rwyd BkpW() {
        return (rwyd)((Object)cv.b(this, -825225312));
    }

    @Override
    public kQcX lCdp() {
        return (kQcX)((Object)cv.b(this, 1359482787));
    }

    @Override
    public String getStatus() {
        return (String)cv.b(this, 470552482);
    }

    @Override
    public void ssNb(String string) {
        cv.e(this, 470552482, string);
    }

    @Override
    public double getProgress() {
        return (Double)cv.b(this, 2053771181);
    }

    @Override
    public void setProgress(double d) {
        cv.e(this, 2053771181, d);
    }

    @Override
    public rMgK nJLQ() {
        return (rMgK)((Object)cv.b(this, -2038558804));
    }

    @Override
    public cIji vtFs() {
        return (cIji)((Object)cv.b(this, 1519128495));
    }

    @Override
    public ktOu<Class<?>, xqeH<EmKi>> EmLA() {
        return (ktOu)cv.b(this, -593686620);
    }

    @Override
    public /* varargs */ void DYFV(ftyu ftyu2, EmKi ... arremKi) throws LGKl {
        if (TyVf.Pt(this.lCdp(), (kQcX)((Object)cv.e(-747106030))) != false) {
            throw new LGKl();
        }
        cv.e(this, 1359482787, (Object)((kQcX)((Object)cv.e(-747106030))));
        cv.e(this, 752422830, ftyu2);
        this.ssNb(ftyu2, this.ssNb(arremKi));
    }

    @Override
    public void WGJn() {
        cv.e(this, 1359482787, (Object)((kQcX)((Object)cv.e(-838922497))));
    }

    @Override
    public ftyu TyVf() {
        return (ftyu)cv.b(this, 752422830);
    }

    @Override
    public String[] LGKl() {
        return (String[])cv.b(this, -294842455);
    }

    @Override
    public /* varargs */ void ssNb(String ... arrstring) {
        cv.e(this, -294842455, arrstring);
    }

    @Override
    public /* varargs */ abstract void ssNb(ftyu var1, EmKi ... var2);

    private static Object Pt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

