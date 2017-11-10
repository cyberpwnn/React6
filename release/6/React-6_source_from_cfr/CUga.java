/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CUga
extends qloI {
    private static int rVil;
    private aKuV<vsgc, Ahqh> MmCy;
    public aKuV<Integer, eYCP<vsgc, WFnH, PBUD<NxIh>>> rVis;

    @Override
    public void start() {
        yy.E(this, -170660799, new aKuV());
        yy.E(this, -1278940086, new aKuV());
        Object object = CUga.EQ((PBUD)CUga.EQ((aKuV)yy.p(2038819903), CUga.EQ(true)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                this.mXJp((Ahqh)CUga.EQ(CUga.EQ(class_, new Class[0]), new Object[0]));
            }
            catch (InstantiationException instantiationException) {
                InstantiationException instantiationException2 = instantiationException;
                CUga.EQ(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                CUga.EQ(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                CUga.EQ(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                InvocationTargetException invocationTargetException2 = invocationTargetException;
                CUga.EQ(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
                CUga.EQ(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                SecurityException securityException2 = securityException;
                CUga.EQ(securityException);
            }
        }
    }

    public /* varargs */ void mXJp(vsgc vsgc2, WFnH wFnH, NxIh ... arrnxIh) {
        int n = (Integer)yy.p(240184200);
        yy.K(240184200, n + 1);
        CUga.EQ((aKuV)yy.h(this, -170660799), CUga.EQ(n), new eYCP<vsgc, WFnH, PBUD<NxIh>>(vsgc2, wFnH, new PBUD<NxIh>(arrnxIh)));
    }

    private /* varargs */ boolean ksfs(vsgc vsgc2, WFnH wFnH, NxIh ... arrnxIh) {
        Ahqh ahqh = this.mXJp(vsgc2);
        boolean bl = false;
        if (CUga.EQ(ahqh.DGgy(), (SCOk)((Object)yy.p(-1801459103))) != false) {
            try {
                ahqh.ksfs(wFnH, arrnxIh);
            }
            catch (Ynto ynto) {
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

    public Ahqh mXJp(vsgc vsgc2) {
        return (Ahqh)CUga.EQ((aKuV)yy.h(this, -1278940086), vsgc2);
    }

    public void mXJp(Ahqh ahqh) {
        CUga.EQ((aKuV)yy.h(this, -1278940086), ahqh.wUJy(), ahqh);
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
        Object object = CUga.EQ(CUga.EQ((aKuV)yy.h(this, -170660799)));
        while (object.hasNext()) {
            boolean bl;
            Object object2 = CUga.EQ((Integer)object.next());
            eYCP eYCP2 = (eYCP)CUga.EQ((aKuV)yy.h(this, -170660799), CUga.EQ(object2));
            Ahqh ahqh = this.mXJp((vsgc)((Object)CUga.EQ(eYCP2)));
            WFnH wFnH = (WFnH)CUga.EQ(eYCP2);
            NxIh[] arrnxIh = (NxIh[])((Object[])CUga.EQ((PBUD)CUga.EQ(eYCP2), new NxIh[CUga.EQ((PBUD)CUga.EQ(eYCP2))]));
            Object object3 = CUga.EQ(ahqh.DGgy(), (SCOk)((Object)yy.p(-1801459103)));
            boolean bl2 = object3 != false ? this.ksfs((vsgc)((Object)CUga.EQ(eYCP2)), wFnH, arrnxIh) : (bl = false);
            if (!bl2) continue;
            CUga.EQ((aKuV)yy.h(this, -170660799), CUga.EQ(object2));
        }
    }

    public PBUD<Ahqh> FyDo() {
        return CUga.EQ((aKuV)yy.h(this, -1278940086));
    }

    static {
        yy.K(240184200, 0);
    }

    private static Object EQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

