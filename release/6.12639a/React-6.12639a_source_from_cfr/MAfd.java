/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=127)
public class MAfd
extends FVgY
implements xyxr {
    private double yTKS;
    private double mbJd;
    private NwfF QNwt;
    private ntkx Fyjx;
    private byte CqCU;
    private byte gWfi;
    private byte MuoG;
    private byte oxow;
    public int QhiS;
    public int APjq;
    public double OHpd;

    public MAfd(NwfF nwfF, ntkx ntkx2, long l) {
        super(nwfF.getID(), l);
        this.QNwt = nwfF;
        this.Fyjx = ntkx2;
        this.CqCU = 16;
        this.gWfi = MAfd.cI(false, false, false);
        this.oxow = 32;
        this.MuoG = 44;
        this.OHpd = 0.0;
        this.yTKS = 0.0;
        this.mbJd = 0.0;
    }

    public void IgvC() {
        MAfd.cI(this.FViO(), MAfd.cI(), ((NwfF)o.a(this, 268392786)).getValue());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(UQqm uQqm) {
        Object object = MAfd.cI(MAfd.cI(MAfd.cI(MAfd.cI(MAfd.cI(((Byte)o.a(this, 237263184)).byteValue())))));
        Object object2 = MAfd.cI(MAfd.cI(MAfd.cI(MAfd.cI(MAfd.cI(((Byte)o.a(this, 1632000333)).byteValue())))));
        Object object3 = MAfd.cI(this.FViO(), MAfd.cI() - this.yIwi(), MAfd.cI());
        Object object4 = MAfd.cI(object3);
        MAfd.cI(object4);
        this.UQfI((feCR<Double>)MAfd.cI(object3));
        OXoN oXoN = new OXoN(2);
        Object object5 = -1;
        int n = -1;
        Object object6 = 0.0;
        double d = 0.0;
        MAfd.cI(uQqm, ((Byte)o.a(this, -440247989)).byteValue());
        Object object7 = -1.0;
        int n2 = -1;
        int n3 = 0;
        while (n3 < 12) {
            if (MAfd.cI(object4) == false) {
                MAfd.cI(oXoN, MAfd.cI((Long)MAfd.cI(object4, false)));
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < MAfd.cI(object4)) {
            reference var25_20;
            Object object8 = MAfd.cI((Double)MAfd.cI(object3, MAfd.cI(object4, n3)));
            Object object9 = MAfd.cI(1.0 - object8 / this.getMax(), 0.0, 1.0);
            MAfd.cI(oXoN, object9);
            reference var21_17 = (Object)MAfd.cI(uQqm) / (Object)MAfd.cI(object4);
            Object object10 = MAfd.cI(MAfd.cI(oXoN), 0.0, 1.0) * (Object)(MAfd.cI(uQqm) - true);
            int n4 = (int)((double)n3 * var21_17);
            object10 = MAfd.cI(object10, 2.0, MAfd.cI(uQqm) - 2);
            d = n4;
            object6 = object10;
            MAfd.cI(uQqm, n4 + 1, object10 + true, object);
            MAfd.cI(uQqm, n4, object10, ((Byte)o.a(this, 237263184)).byteValue());
            if (n3 == MAfd.cI(object4) - true) {
                n2 = n4;
                object7 = object8;
            }
            if (n >= 0) {
                if (n > n4) {
                    var25_20 = n;
                    while (var25_20 > n4) {
                        MAfd.cI(uQqm, var25_20 + true, object10 + true, object);
                        MAfd.cI(uQqm, var25_20, object10, ((Byte)o.a(this, 237263184)).byteValue());
                        --var25_20;
                    }
                }
                if (n < n4) {
                    var25_20 = (reference)n4;
                    while (var25_20 > n) {
                        MAfd.cI(uQqm, var25_20 + true, object10 + true, object);
                        MAfd.cI(uQqm, var25_20, object10, ((Byte)o.a(this, 237263184)).byteValue());
                        --var25_20;
                    }
                }
            }
            if (object5 >= 0) {
                if (object5 > object10) {
                    var25_20 = (reference)object5;
                    while (var25_20 > object10) {
                        MAfd.cI(uQqm, (int)((double)n3 * var21_17) + 1, var25_20 + true, object);
                        MAfd.cI(uQqm, (int)((double)n3 * var21_17), var25_20, ((Byte)o.a(this, 237263184)).byteValue());
                        --var25_20;
                    }
                }
                if (object5 < object10) {
                    var25_20 = object10;
                    while (var25_20 > object5) {
                        MAfd.cI(uQqm, (int)((double)n3 * var21_17) + 1, var25_20 + true, object);
                        MAfd.cI(uQqm, (int)((double)n3 * var21_17), var25_20, ((Byte)o.a(this, 237263184)).byteValue());
                        --var25_20;
                    }
                }
            }
            object5 = object10;
            n = (int)((double)n3 * var21_17);
            ++n3;
        }
        if (MAfd.cI(d - (Double)o.a(this, 1762548057)) > 0.01) {
            if ((Double)o.a(this, 1762548057) > d) {
                MAfd mAfd = this;
                o.v(mAfd, 1762548057, (Double)o.a(mAfd, 1762548057) - MAfd.cI(d - (Double)o.a(this, 1762548057)) / 10.0);
            }
            if ((Double)o.a(this, 1762548057) < d) {
                MAfd mAfd = this;
                o.v(mAfd, 1762548057, (Double)o.a(mAfd, 1762548057) + MAfd.cI(d - (Double)o.a(this, 1762548057)) / 10.0);
            }
        }
        if (MAfd.cI(object6 - (Double)o.a(this, 1826838872)) > 0.01) {
            if ((Double)o.a(this, 1826838872) > object6) {
                MAfd mAfd = this;
                o.v(mAfd, 1826838872, (Double)o.a(mAfd, 1826838872) - MAfd.cI(object6 - (Double)o.a(this, 1826838872)) / 10.0);
            }
            if ((Double)o.a(this, 1826838872) < object6) {
                MAfd mAfd = this;
                o.v(mAfd, 1826838872, (Double)o.a(mAfd, 1826838872) + MAfd.cI(object6 - (Double)o.a(this, 1826838872)) / 10.0);
            }
        }
        MAfd.cI(uQqm, n2 - MAfd.cI((pbAB)((Object)o.k(-366126761)), ((ntkx)o.a(this, -1384949418)).uVol((double)object7)) - 6, this.UtIU(uQqm) - 1, (pbAB)((Object)o.k(-366126761)), object2, ((ntkx)o.a(this, -1384949418)).uVol((double)object7));
        MAfd.cI(uQqm, n2 - MAfd.cI((pbAB)((Object)o.k(-366126761)), ((ntkx)o.a(this, -1384949418)).uVol((double)object7)) - 5, this.UtIU(uQqm), (pbAB)((Object)o.k(-366126761)), ((Byte)o.a(this, 1632000333)).byteValue(), ((ntkx)o.a(this, -1384949418)).uVol((double)object7));
        MAfd.cI(uQqm, 3, 3, (pbAB)((Object)o.k(-366126761)), object2, ((ntkx)o.a(this, -1384949418)).uVol(this.getMax()));
        MAfd.cI(uQqm, 4, 4, (pbAB)((Object)o.k(-366126761)), ((Byte)o.a(this, 1632000333)).byteValue(), ((ntkx)o.a(this, -1384949418)).uVol(this.getMax()));
        MAfd.cI(uQqm, 3, MAfd.cI(uQqm) - 9, (pbAB)((Object)o.k(-366126761)), object2, this.getName());
        MAfd.cI(uQqm, 4, MAfd.cI(uQqm) - 10, (pbAB)((Object)o.k(-366126761)), ((Byte)o.a(this, 1632000333)).byteValue(), this.getName());
        n3 = 0;
        while (n3 < MAfd.cI(uQqm)) {
            int n5 = 0;
            while (n5 < MAfd.cI(uQqm)) {
                block26 : {
                    block25 : {
                        if (n3 == 0 || n5 == 0) break block25;
                        if (n3 == MAfd.cI(uQqm) - true) break block25;
                        if (n5 != MAfd.cI(uQqm) - true) break block26;
                    }
                    MAfd.cI(uQqm, n3, n5, ((Byte)o.a(this, 247814483)).byteValue());
                }
                ++n5;
            }
            ++n3;
        }
    }

    public int UtIU(UQqm uQqm) {
        void var4_9;
        Object object = MAfd.cI(MAfd.cI(this.FViO(), MAfd.cI() - this.yIwi() / 4, MAfd.cI()));
        OXoN oXoN = new OXoN((int)MAfd.cI(object));
        Object object2 = MAfd.cI(object);
        while (object2.hasNext()) {
            Double d = (Double)object2.next();
            MAfd.cI(oXoN, MAfd.cI(d));
        }
        reference var4_6 = MAfd.cI(1.0 - MAfd.cI(oXoN) / this.getMax(), 0.0, 1.0) * (Object)MAfd.cI(uQqm);
        if (var4_6 > (Object)(MAfd.cI(uQqm) / 2)) {
            reference var4_7 = var4_6 - 24.0;
        } else {
            reference var4_8 = var4_6 + 24.0;
        }
        if (MAfd.cI(var4_9 - (Double)o.a(this, 1364481730)) > 0.1) {
            if (var4_9 < (Double)o.a(this, 1364481730)) {
                MAfd mAfd = this;
                o.v(mAfd, 1364481730, (Double)o.a(mAfd, 1364481730) - MAfd.cI(var4_9 - (Double)o.a(this, 1364481730)) / 10.0);
            } else {
                MAfd mAfd = this;
                o.v(mAfd, 1364481730, (Double)o.a(mAfd, 1364481730) + MAfd.cI(var4_9 - (Double)o.a(this, 1364481730)) / 10.0);
            }
        }
        return (int)((Double)o.a(this, 1364481730)).doubleValue();
    }

    public int biLo(int n, int n2, int n3) {
        Object object = MAfd.cI(MAfd.cI(n, n2), n3);
        Object object2 = MAfd.cI(MAfd.cI(n, n2), n3);
        float f = 0.0f;
        f = object2 == (float)n ? (float)(n2 - n3) / (object2 - object) : (object2 == (float)n2 ? 2.0f + (float)(n3 - n) / (object2 - object) : 4.0f + (float)(n - n2) / (object2 - object));
        if ((f *= 60.0f) < 0.0f) {
            f += 360.0f;
        }
        return (int)MAfd.cI(f);
    }

    public void UQfI(feCR<Double> feCR2) {
        Object object;
        Object object2 = Double.MIN_VALUE;
        Object object3 = MAfd.cI(feCR2);
        while (object3.hasNext()) {
            object = MAfd.cI((Double)object3.next());
            if (object <= object2) continue;
            object2 = object;
        }
        if (object2 < 0.0) {
            this.dfaE(1.0);
            return;
        }
        if (MAfd.cI(this.getMax() - object2) > 0.01) {
            object = MAfd.cI(this.getMax() - object2);
            reference var6_4 = object / 5.0;
            this.dfaE(this.getMax() > object2 ? this.getMax() - var6_4 : this.getMax() + var6_4);
        }
    }

    public ntkx xynF() {
        return (ntkx)o.a(this, -1384949418);
    }

    public void yJLS(ntkx ntkx2) {
        o.v(this, -1384949418, ntkx2);
    }

    public byte qltw() {
        return ((Byte)o.a(this, 237263184)).byteValue();
    }

    public void yJLS(byte by) {
        o.v(this, 237263184, Byte.valueOf(by));
    }

    public byte sjkR() {
        return ((Byte)o.a(this, -440247989)).byteValue();
    }

    public void UtIU(byte by) {
        o.v(this, -440247989, Byte.valueOf(by));
    }

    public byte nBJR() {
        return ((Byte)o.a(this, 247814483)).byteValue();
    }

    public void biLo(byte by) {
        o.v(this, 247814483, Byte.valueOf(by));
    }

    public byte lUVJ() {
        return ((Byte)o.a(this, 1632000333)).byteValue();
    }

    public void VwLY(byte by) {
        o.v(this, 1632000333, Byte.valueOf(by));
    }

    public NwfF eHPM() {
        return (NwfF)o.a(this, 268392786);
    }

    private static Object cI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

