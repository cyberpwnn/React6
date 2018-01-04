/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class mrIy {
    private TNku<Long, Double> VEWi = new TNku();
    private int GlPs = 2000;

    public void clean() {
        if (mrIy.Zo((TNku)o.a(this, 1906465092)) > (Integer)o.a(this, 1873238339)) {
            this.uVol(this.OPax());
        }
    }

    public long PmXX() {
        return this.OPax() - this.ntqF();
    }

    public long wnfY() {
        return this.oUpd() - this.OPax();
    }

    public long TEqA(long l, long l2) {
        double d = 0.0;
        double d2 = 0.0;
        Object object = mrIy.Zo(mrIy.Zo((TNku)o.a(this, 1906465092)));
        while (object.hasNext()) {
            Long l3 = (Long)object.next();
            if (!this.yJLS(l, l2, (long)mrIy.Zo(l3))) continue;
            d += (Object)mrIy.Zo(l3);
            d2 += 1.0;
        }
        return (long)(d / d2);
    }

    public long OPax() {
        return this.TEqA(this.TEqA(this.ntqF(), this.oUpd()), this.oUpd());
    }

    public double BAkl() {
        Object object = Double.MIN_VALUE;
        Object object2 = mrIy.Zo(mrIy.Zo((TNku)o.a(this, 1906465092)));
        while (object2.hasNext()) {
            Object object3 = mrIy.Zo((Long)object2.next());
            if (mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3))) <= object) continue;
            object = mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3)));
        }
        return (double)object;
    }

    public double mXWy() {
        Object object = Double.MAX_VALUE;
        Object object2 = mrIy.Zo(mrIy.Zo((TNku)o.a(this, 1906465092)));
        while (object2.hasNext()) {
            Object object3 = mrIy.Zo((Long)object2.next());
            if (mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3))) >= object) continue;
            object = mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3)));
        }
        return (double)object;
    }

    public feCR<Double> UtIU(TNku<Long, Double> tNku) {
        return mrIy.Zo(tNku);
    }

    public long ntqF() {
        Object object = Long.MAX_VALUE;
        Object object2 = mrIy.Zo(mrIy.Zo((TNku)o.a(this, 1906465092)));
        while (object2.hasNext()) {
            Object object3 = mrIy.Zo((Long)object2.next());
            if (object3 >= object) continue;
            object = object3;
        }
        return (long)object;
    }

    public long oUpd() {
        Object object = Long.MIN_VALUE;
        Object object2 = mrIy.Zo(mrIy.Zo((TNku)o.a(this, 1906465092)));
        while (object2.hasNext()) {
            Object object3 = mrIy.Zo((Long)object2.next());
            if (object3 <= object) continue;
            object = object3;
        }
        return (long)object;
    }

    public void uVol(long l) {
        this.KTiK(this.ntqF(), l);
    }

    public void KTiK(long l, long l2) {
        boolean bl = false;
        Object object = 0.0;
        Object object2 = mrIy.Zo(mrIy.Zo(this.HeSD(l, l2)));
        while (object2.hasNext()) {
            Object object3 = mrIy.Zo((Long)object2.next());
            if (!(bl = !bl)) {
                if (mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3)) != false) {
                    object = mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3)));
                    mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3));
                    continue;
                }
            }
            mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3), mrIy.Zo((object + mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(object3)))) / 2.0));
        }
    }

    public boolean GPlk(long l, long l2) {
        return this.yJLS(0, l, l2);
    }

    public boolean ktHX(long l, long l2) {
        return this.yJLS(l, (long)mrIy.Zo(), l2);
    }

    public boolean yJLS(long l, long l2, long l3) {
        if (l3 >= l && l3 <= l2) {
            return true;
        }
        return false;
    }

    public TNku<Long, Double> HeSD(long l, long l2) {
        TNku<Long, Double> tNku = new TNku<Long, Double>();
        Object object = mrIy.Zo(mrIy.Zo((TNku)o.a(this, 1906465092)));
        while (object.hasNext()) {
            Long l3 = (Long)object.next();
            if (!this.yJLS(l, l2, (long)mrIy.Zo(l3))) continue;
            mrIy.Zo(tNku, l3, (Double)mrIy.Zo((TNku)o.a(this, 1906465092), l3));
        }
        return tNku;
    }

    public void yJLS(long l, double d) {
        mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(l), mrIy.Zo(d));
        this.clean();
    }

    public boolean dfaE(long l) {
        return (boolean)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(l));
    }

    public double sQJh(long l) {
        return (double)mrIy.Zo((Double)mrIy.Zo((TNku)o.a(this, 1906465092), mrIy.Zo(l)));
    }

    public int getSize() {
        return (int)mrIy.Zo((TNku)o.a(this, 1906465092));
    }

    private static Object Zo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

