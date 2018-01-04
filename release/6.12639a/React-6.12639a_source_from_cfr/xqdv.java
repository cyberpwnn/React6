/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class xqdv {
    private UQqm FiLR;
    private TNku<EBcM, UQqm> fwIT;
    private TNku<EBcM, xyxr> SxCG;
    private double GknX;
    private double riHu;
    private int CxtQ = 0;
    private int KEVr = 0;

    public xqdv() {
        this.clear();
    }

    public void clear() {
        o.v(this, -489335132, new TNku());
        o.v(this, -535210333, new TNku());
        o.v(this, -2107025774, new UQqm(128, 128));
        o.v(this, 1875531409, 0.0);
        o.v(this, 634345104, 0.0);
    }

    public void bFxK() {
        Object object = xqdv.Kk(xqdv.Kk((TNku)o.a(this, -489335132)));
        while (object.hasNext()) {
            EBcM eBcM;
            block4 : {
                block3 : {
                    eBcM = (EBcM)object.next();
                    if ((Double)o.a(this, 1875531409) < (double)((Integer)o.a(eBcM, 402019983)).intValue()) break block3;
                    if ((Double)o.a(this, 1875531409) < (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) break block4;
                }
                if ((Double)o.a(this, 1875531409) + 128.0 <= (double)((Integer)o.a(eBcM, 402019983)).intValue()) continue;
                if ((Double)o.a(this, 1875531409) >= (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) continue;
            }
            if (!(xqdv.Kk((TNku)o.a(this, -535210333), eBcM) instanceof MAfd)) continue;
            o.v((MAfd)xqdv.Kk((TNku)o.a(this, -535210333), eBcM), -1818863987, 20);
            o.v((MAfd)xqdv.Kk((TNku)o.a(this, -535210333), eBcM), -672639348, 0);
        }
    }

    public void UtWk() {
        MRfD mRfD = new MRfD();
        xqdv.Kk(mRfD);
        xqdv.Kk((UQqm)o.a(this, -2107025774), 44);
        if (xqdv.Kk((Double)o.a(this, 1875531409) - (Double)o.a(this, 634345104)) > 0.001) {
            if ((Double)o.a(this, 1875531409) > (Double)o.a(this, 634345104)) {
                xqdv xqdv2 = this;
                o.v(xqdv2, 1875531409, (Double)o.a(xqdv2, 1875531409) - xqdv.Kk((Double)o.a(this, 1875531409) - (Double)o.a(this, 634345104)) / 3.2);
            }
            if ((Double)o.a(this, 1875531409) < (Double)o.a(this, 634345104)) {
                xqdv xqdv3 = this;
                o.v(xqdv3, 1875531409, (Double)o.a(xqdv3, 1875531409) + xqdv.Kk((Double)o.a(this, 1875531409) - (Double)o.a(this, 634345104)) / 3.2);
            }
        }
        Object object = xqdv.Kk(xqdv.Kk((TNku)o.a(this, -489335132)));
        while (object.hasNext()) {
            EBcM eBcM;
            block8 : {
                block7 : {
                    eBcM = (EBcM)object.next();
                    if ((Double)o.a(this, 1875531409) < (double)((Integer)o.a(eBcM, 402019983)).intValue()) break block7;
                    if ((Double)o.a(this, 1875531409) < (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) break block8;
                }
                if ((Double)o.a(this, 1875531409) + 128.0 <= (double)((Integer)o.a(eBcM, 402019983)).intValue()) continue;
                if ((Double)o.a(this, 1875531409) >= (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) continue;
            }
            ((xyxr)xqdv.Kk((TNku)o.a(this, -535210333), eBcM)).biLo((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM));
            xqdv.Kk((UQqm)o.a(this, -2107025774), (UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM), (Integer)o.a(eBcM, -1229760871), (int)((double)((Integer)o.a(eBcM, 402019983)).intValue() - (Double)o.a(this, 1875531409)));
        }
        xqdv.Kk(mRfD);
    }

    public void Ywen(int n) {
        double d = (Double)o.a(this, 634345104);
        xqdv xqdv2 = this;
        o.v(xqdv2, 634345104, (Double)o.a(xqdv2, 634345104) - (double)n);
        o.v(this, 634345104, (Double)o.a(this, 634345104) > (double)((Integer)o.a(this, 640177814)).intValue() ? (double)((Integer)o.a(this, 640177814)).intValue() : (Double)o.a(this, 634345104));
        o.v(this, 634345104, (Double)o.a(this, 634345104) < 0.0 ? 0.0 : (Double)o.a(this, 634345104));
        Object object = xqdv.Kk(xqdv.Kk((TNku)o.a(this, -489335132)));
        while (object.hasNext()) {
            EBcM eBcM;
            xyxr xyxr2;
            block7 : {
                block6 : {
                    eBcM = (EBcM)object.next();
                    if (d >= (double)((Integer)o.a(eBcM, 402019983)).intValue()) {
                        if (d < (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) continue;
                    }
                    if (d + 128.0 > (double)((Integer)o.a(eBcM, 402019983)).intValue()) {
                        if (d < (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) continue;
                    }
                    if ((Double)o.a(this, 634345104) < (double)((Integer)o.a(eBcM, 402019983)).intValue()) break block6;
                    if ((Double)o.a(this, 634345104) < (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) break block7;
                }
                if ((Double)o.a(this, 634345104) + 128.0 <= (double)((Integer)o.a(eBcM, 402019983)).intValue()) continue;
                if ((Double)o.a(this, 634345104) >= (double)((Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)))) continue;
            }
            if (!((xyxr2 = (xyxr)xqdv.Kk((TNku)o.a(this, -535210333), eBcM)) instanceof MAfd)) continue;
            o.v((MAfd)xyxr2, -1818863987, 20);
        }
    }

    public void bWyU() {
        o.v(this, -1425189227, 0);
        o.v(this, 640177814, 0);
        Object object = xqdv.Kk(xqdv.Kk((TNku)o.a(this, -489335132)));
        while (object.hasNext()) {
            EBcM eBcM = (EBcM)object.next();
            o.v(this, -1425189227, (Integer)o.a(eBcM, -1229760871) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)) > (Integer)o.a(this, -1425189227) ? (Integer)o.a(eBcM, -1229760871) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)) : (Integer)o.a(this, -1425189227));
            o.v(this, 640177814, (Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)) > (Integer)o.a(this, 640177814) ? (Integer)o.a(eBcM, 402019983) + xqdv.Kk((UQqm)xqdv.Kk((TNku)o.a(this, -489335132), eBcM)) : (Integer)o.a(this, 640177814));
        }
        o.v(this, 1875531409, 0.0);
    }

    public void yJLS(EBcM eBcM, EBcM eBcM2, xyxr xyxr2) {
        xqdv.Kk((TNku)o.a(this, -489335132), eBcM, new UQqm((Integer)o.a(eBcM2, -1229760871), (Integer)o.a(eBcM2, 402019983)));
        xqdv.Kk((TNku)o.a(this, -535210333), eBcM, xyxr2);
    }

    public UQqm XRmI() {
        return (UQqm)o.a(this, -2107025774);
    }

    public TNku<EBcM, UQqm> mOgX() {
        return (TNku)o.a(this, -489335132);
    }

    public TNku<EBcM, xyxr> QgiW() {
        return (TNku)o.a(this, -535210333);
    }

    public double PvHf() {
        return (Double)o.a(this, 1875531409);
    }

    public double Drdy() {
        return (Double)o.a(this, 634345104);
    }

    public int ejSW() {
        return (Integer)o.a(this, -1425189227);
    }

    public int xGWE() {
        return (Integer)o.a(this, 640177814);
    }

    private static Object Kk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

