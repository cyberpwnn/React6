/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

public class jOKx
implements WqhV {
    private wfPa<fTAa> vlUx = new wfPa();
    private wfPa<OsCE> IqfK = new wfPa();
    private wfPa<OsCE> ifOs = new wfPa();
    private wfPa<CommandSender> WjNV = new wfPa();
    public long bOyg;
    public static jOKx Nxdw;

    public jOKx() {
        cv.V(-1547234860, this);
        jOKx.Qx(this.Vvwe(), jOKx.Qx());
        this.bOyg = jOKx.Qx();
    }

    @Override
    public wfPa<fTAa> GHiL() {
        return (wfPa)cv.b(this, 1417737137);
    }

    @Override
    public void ssNb(fTAa fTAa2) {
        jOKx.Qx(this.GHiL(), fTAa2);
    }

    @Override
    public void tick() {
        Object object;
        Object object2 = jOKx.Qx(this.GHiL());
        while (object2.hasNext()) {
            object = (fTAa)object2.next();
            object.update();
        }
        object2 = jOKx.Qx((wfPa)cv.b(this, 1147466672));
        while (object2.hasNext()) {
            object = (OsCE)object2.next();
            Object object3 = jOKx.Qx(this.Vvwe());
            while (object3.hasNext()) {
                CommandSender commandSender = (CommandSender)object3.next();
                jOKx.Qx(commandSender, jOKx.Qx(object));
            }
        }
        jOKx.Qx((wfPa)cv.b(this, 1147466672));
    }

    @Override
    public wfPa<OsCE> FEfL() {
        return (wfPa)cv.b(this, -149556302);
    }

    @Override
    public void ssNb(OsCE osCE) {
        if (jOKx.Qx((wfPa)cv.b(this, -149556302)) > true) {
            if (jOKx.Qx(jOKx.Qx((OsCE)jOKx.Qx((wfPa)cv.b(this, -149556302), jOKx.Qx((wfPa)cv.b(this, -149556302)) - true)), jOKx.Qx(osCE)) != false) {
                if (jOKx.Qx((String[])jOKx.Qx((OsCE)jOKx.Qx((wfPa)cv.b(this, -149556302), jOKx.Qx((wfPa)cv.b(this, -149556302)) - true)), (String[])jOKx.Qx(osCE)) != false) {
                    return;
                }
            }
        }
        jOKx.Qx((wfPa)cv.b(this, -149556302), osCE);
        jOKx.Qx((wfPa)cv.b(this, 1147466672), osCE);
    }

    @Override
    public wfPa<CommandSender> Vvwe() {
        return (wfPa)cv.b(this, 1540289470);
    }

    private static Object Qx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

