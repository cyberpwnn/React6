/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class QWNe
extends Enum<QWNe> {
    public static final /* enum */ QWNe oyaC;
    public static final /* enum */ QWNe MwAU;
    public static final /* enum */ QWNe rPEr;
    public static final /* enum */ QWNe JeDp;
    public static final /* enum */ QWNe rPDw;
    public static final /* enum */ QWNe uHLj;
    public static final /* enum */ QWNe mryO;
    private static final /* synthetic */ QWNe[] Qqhv;

    static {
        o.w(2017479951, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50c2"), 0));
        o.w(990072078, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50a0"), 1));
        o.w(2055556365, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50af"), 2));
        o.w(-1418703604, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50ae"), 3));
        o.w(189025547, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50a6\ud84d"), 4));
        o.w(1797016858, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50a6\ud84d\u726a"), 5));
        o.w(545213749, (Object)new QWNe(FMkR$WjFM.a("\ud9c2\u50a6\ud84d\u7269"), 6));
        o.w(-1151775463, new QWNe[]{(QWNe)((Object)o.k(2017479951)), (QWNe)((Object)o.k(990072078)), (QWNe)((Object)o.k(2055556365)), (QWNe)((Object)o.k(-1418703604)), (QWNe)((Object)o.k(189025547)), (QWNe)((Object)o.k(1797016858)), (QWNe)((Object)o.k(545213749))});
    }

    private QWNe(String string2, int n2) {
    }

    public static boolean ColC() {
        if (QWNe.BKFT().equals((Object)((QWNe)((Object)o.k(990072078))))) {
            return false;
        }
        return true;
    }

    public static boolean UJLY() {
        if (QWNe.BKFT().equals((Object)((QWNe)((Object)o.k(990072078)))) || QWNe.BKFT().equals((Object)((QWNe)((Object)o.k(2055556365))))) {
            return false;
        }
        return true;
    }

    public static QWNe BKFT() {
        if (QWNe.pb(QWNe.pb(), FMkR$WjFM.a("\ufbcd\ucd2e\u3de1")) != false) {
            return (QWNe)((Object)o.k(990072078));
        }
        if (QWNe.pb(QWNe.pb(), FMkR$WjFM.a("\ufbcd\ucd2e\u3dee")) != false) {
            return (QWNe)((Object)o.k(2055556365));
        }
        if (QWNe.pb(QWNe.pb(), FMkR$WjFM.a("\ufbcd\ucd2e\u3def")) != false) {
            return (QWNe)((Object)o.k(-1418703604));
        }
        if (QWNe.pb(QWNe.pb(), FMkR$WjFM.a("\ufbcd\ucd2e\u3de7\ufc9d")) != false) {
            return (QWNe)((Object)o.k(189025547));
        }
        if (QWNe.pb(QWNe.pb(), FMkR$WjFM.a("\ufbcd\ucd2e\u3de7\ufc9c")) != false) {
            return (QWNe)((Object)o.k(1797016858));
        }
        if (QWNe.pb(QWNe.pb(), FMkR$WjFM.a("\ufbcd\ucd2e\u3de7\ufc9f")) != false) {
            return (QWNe)((Object)o.k(545213749));
        }
        return (QWNe)((Object)o.k(2017479951));
    }

    public static QWNe[] values() {
        QWNe[] arrqWNe = (QWNe[])o.k(-1151775463);
        int n = arrqWNe.length;
        QWNe[] arrqWNe2 = new QWNe[n];
        QWNe.pb(arrqWNe, false, arrqWNe2, false, n);
        return arrqWNe2;
    }

    public static QWNe valueOf(String string) {
        return (QWNe)((Object)QWNe.pb(QWNe.class, string));
    }

    private static Object pb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

