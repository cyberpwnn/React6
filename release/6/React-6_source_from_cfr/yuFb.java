/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class yuFb
extends jqQR {
    private static int qdiv;
    private ktOu<cIji, CoXE> YgWf;
    public ktOu<Integer, Iplh<cIji, ftyu, wfPa<EmKi>>> fCIb;

    @Override
    public void start() {
        cv.e(this, -1075441609, new ktOu());
        cv.e(this, 2088702006, new ktOu());
        Object object = yuFb.Gb((wfPa)yuFb.Gb((ktOu)cv.e(-1326510031), yuFb.Gb(true)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                this.ssNb((CoXE)yuFb.Gb(yuFb.Gb(class_, new Class[0]), new Object[0]));
            }
            catch (InstantiationException instantiationException) {
                InstantiationException instantiationException2 = instantiationException;
                yuFb.Gb(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                yuFb.Gb(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                yuFb.Gb(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                InvocationTargetException invocationTargetException2 = invocationTargetException;
                yuFb.Gb(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
                yuFb.Gb(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                SecurityException securityException2 = securityException;
                yuFb.Gb(securityException);
            }
        }
    }

    public /* varargs */ void ssNb(cIji cIji2, ftyu ftyu2, EmKi ... arremKi) {
        int n = (Integer)cv.e(203165753);
        cv.V(203165753, n + 1);
        yuFb.Gb((ktOu)cv.b(this, -1075441609), yuFb.Gb(n), new Iplh<cIji, ftyu, wfPa<EmKi>>(cIji2, ftyu2, new wfPa<EmKi>(arremKi)));
    }

    private /* varargs */ boolean DYFV(cIji cIji2, ftyu ftyu2, EmKi ... arremKi) {
        CoXE coXE = this.ssNb(cIji2);
        boolean bl = false;
        if (yuFb.Gb(coXE.lCdp(), (kQcX)((Object)cv.e(-838922497))) != false) {
            try {
                coXE.DYFV(ftyu2, arremKi);
            }
            catch (LGKl lGKl) {
                bl = true;
            }
        } else {
            bl = true;
        }
        if (!bl) {
            return true;
        }
        return false;
    }

    public CoXE ssNb(cIji cIji2) {
        return (CoXE)yuFb.Gb((ktOu)cv.b(this, 2088702006), cIji2);
    }

    public void ssNb(CoXE coXE) {
        yuFb.Gb((ktOu)cv.b(this, 2088702006), coXE.vtFs(), coXE);
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
        Object object = yuFb.Gb(yuFb.Gb((ktOu)cv.b(this, -1075441609)));
        while (object.hasNext()) {
            boolean bl;
            Object object2 = yuFb.Gb((Integer)object.next());
            Iplh iplh = (Iplh)yuFb.Gb((ktOu)cv.b(this, -1075441609), yuFb.Gb(object2));
            CoXE coXE = this.ssNb((cIji)((Object)yuFb.Gb(iplh)));
            ftyu ftyu2 = (ftyu)yuFb.Gb(iplh);
            EmKi[] arremKi = (EmKi[])((Object[])yuFb.Gb((wfPa)yuFb.Gb(iplh), new EmKi[yuFb.Gb((wfPa)yuFb.Gb(iplh))]));
            Object object3 = yuFb.Gb(coXE.lCdp(), (kQcX)((Object)cv.e(-838922497)));
            boolean bl2 = object3 != false ? this.DYFV((cIji)((Object)yuFb.Gb(iplh)), ftyu2, arremKi) : (bl = false);
            if (!bl2) continue;
            yuFb.Gb((ktOu)cv.b(this, -1075441609), yuFb.Gb(object2));
        }
    }

    public wfPa<CoXE> oxGX() {
        return yuFb.Gb((ktOu)cv.b(this, 2088702006));
    }

    static {
        cv.V(203165753, 0);
    }

    private static Object Gb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

