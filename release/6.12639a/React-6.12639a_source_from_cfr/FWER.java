/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

@tvby
public class FWER
extends ggmf
implements qSgW {
    private TNku<String, NwfF> VMbL = new TNku();
    private loLI GQwU = new loLI();
    private int vuQo;

    public FWER() {
        this.nBGQ();
        this.vuQo = 4;
    }

    public boolean Oram() {
        feCR feCR2 = new feCR();
        for (Thread thread : FWER.DR().keySet()) {
            if (FWER.DR(FWER.DR(thread), FMkR$WjFM.a("\u6e87\u3530\u3d7c\ua067\uf1d8\u1eb0\uc609\u402c\u97a0\u8f7c\u92f7\u99f4\u41fd\udbe5\uf6cb\ucdfc\ufa04\u9c61\ub31e\u187b")) == false) continue;
            if (FWER.DR(thread) == false) continue;
            return false;
        }
        for (Thread thread : FWER.DR().keySet()) {
            if (FWER.DR(FWER.DR(thread), FMkR$WjFM.a("\u6e87\u3530\u3d7c\ua067\uf1d8\u1eb0")) == false) continue;
            if (FWER.DR(thread) == false) continue;
            if (FWER.DR(feCR2, FWER.DR(thread)) == false) {
                FWER.DR(feCR2, FWER.DR(thread));
                continue;
            }
            return true;
        }
        return false;
    }

    public void Lhwj() {
        this.stop();
        o.v((TEqA)o.k(911295720), 1286751627, new FWER());
        ((FWER)o.a((TEqA)o.k(911295720), 1286751627)).start();
        FWER.DR(FMkR$WjFM.a("\u3d11\u24a3\ue92f\ue453\u6776\ufe73\u030c\u5765\u8509\u8e13\u9623\u1723\u7d35\ufeec\ucc05\ub7d5\u6539\uff91\ue5bb\u61cd\u4c73\u8bf1\u8e36\u08fc\u5f37\uf1f9\u7a1f"));
        FWER.DR();
    }

    public void biLo(NwfF nwfF) {
        FWER.DR((TNku)o.a(this, 848778991), nwfF.getID(), nwfF);
    }

    public NwfF wKtV(String string) {
        return (NwfF)FWER.DR((TNku)o.a(this, 848778991), string);
    }

    private void nBGQ() {
        Object object;
        Object object2 = FWER.DR((feCR)FWER.DR((TNku)o.k(278287122), FWER.DR(2)));
        while (object2.hasNext()) {
            object = (Class)object2.next();
            try {
                this.biLo((NwfF)FWER.DR(FWER.DR(object, new Class[0]), new Object[0]));
            }
            catch (InstantiationException instantiationException) {
                InstantiationException instantiationException2 = instantiationException;
                FWER.DR(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                FWER.DR(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                FWER.DR(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                InvocationTargetException invocationTargetException2 = invocationTargetException;
                FWER.DR(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
                FWER.DR(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                SecurityException securityException2 = securityException;
                FWER.DR(securityException);
            }
        }
        object2 = FWER.DR(FWER.DR((TNku)o.a(this, 848778991)));
        while (object2.hasNext()) {
            object = (NwfF)object2.next();
            FWER.DR(FWER.DR(FWER.DR(FWER.DR(FWER.DR(FWER.DR(FWER.DR(new StringBuilder(FMkR$WjFM.a("\u983a\u2665\ue96b\uab2a\uc7f9\u15dc\u93f3\ub7a0\u535d")), object.getID()), FMkR$WjFM.a("\u9849\u262c")), object.getName()), FMkR$WjFM.a("\u9840\u2624\ue946\uab7a")), object.getInterval())));
            object.equl();
        }
    }

    @Override
    public void start() {
        FWER.DR((loLI)o.a(this, -1030727954));
        FWER.DR(this);
        FWER.DR(this);
        new FWER$1(this, nJPf$sILv.G("\u5962\u1e61\uf975\ua32e\u2fbe\ud457\ue545\ub8ef\u318e\ud6d7\ud5db\u5897\u5f6a\u13e5\u55cd\uca72\ue6d0\u5e97\u9f87\ub926\u42dc\ue72b\ubbbc\ud6fe\u4518"), 250);
        new FWER$2(this, nJPf$sILv.G("\u5962\u1e61\uf975\ua32e\u2fbe\ud457\ue545\ub8ef\u318e\ud6d7\ud5db\u5897\u5f6a\u13e5\u55cd\uca72\ue6d0\u5e97\u9f87\ub926\u42dc\ue72b\ubbbc\ud6fe\u4518"), 100);
    }

    @Override
    public void stop() {
        FWER.DR((loLI)o.a(this, -1030727954));
        FWER.DR(this);
        FWER.DR(this);
    }

    @Override
    public void tick() {
    }

    public loLI OXoN() {
        return (loLI)o.a(this, -1030727954);
    }

    @Override
    public void owir() {
        if ((Integer)o.a(this, 2074957547) > 0) {
            FWER fWER = this;
            o.v(fWER, 2074957547, (Integer)o.a(fWER, 2074957547) - 1);
            return;
        }
        Object object = FWER.DR(FWER.DR((TNku)o.a(this, 848778991)));
        while (object.hasNext()) {
            NwfF nwfF = (NwfF)object.next();
            try {
                if ((Long)o.k(-619556004) % (long)nwfF.getInterval() != 0) continue;
                nwfF.IgvC();
            }
            catch (Exception exception) {
                FWER.DR(FWER.DR(FWER.DR(new StringBuilder((String)FWER.DR(FWER.DR(FMkR$WjFM.a("\uf5ab\u92d6\u625b\ue135\uc7d2\u166a\ubb1a\ud81b\u43e7\u2532\u8338\u1c91\u7a17\u2f78\u9f4b\u4b6a\u2673\uede6\ua3eb\ub50b\u4fd5\u38b8\u18ea\u6d3d\ud6e1\u49b2\u2ae0\u786a\u8257\u7b4d\ub051\u4abc\u355c\ue468\u8e2e")))), nwfF.getName())));
                FWER.DR(exception);
            }
        }
    }

    @Override
    public String YMWq() {
        return FMkR$WjFM.a("\ub5f7\u6de8\u9e7f\u6317\udfdf\ub469\u5142");
    }

    public TNku<String, NwfF> FpWy() {
        return (TNku)o.a(this, 848778991);
    }

    public loLI INlt() {
        return (loLI)o.a(this, -1030727954);
    }

    public int JAPK() {
        return (Integer)o.a(this, 2074957547);
    }

    public feCR<String> Lqhy() {
        feCR<String> feCR2 = new feCR<String>();
        Object object = FWER.DR(FWER.DR(this.FpWy()));
        while (object.hasNext()) {
            String string = (String)object.next();
            FWER.DR(feCR2, string);
        }
        return feCR2;
    }

    static /* synthetic */ loLI yJLS(FWER fWER) {
        return (loLI)o.a(fWER, -1030727954);
    }

    private static Object DR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

