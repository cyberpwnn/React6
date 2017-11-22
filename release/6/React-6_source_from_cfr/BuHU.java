/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;

@lDTo
public class BuHU
extends jqQR
implements XSJd {
    private ktOu<String, Integer> oDvn = new ktOu();

    @Override
    public void start() {
        BuHU.BS(this);
        new BuHU$1(this, YEBy$TyVf.W("\u8f62\uc858\ueb4e\u66c5\u36e1\u4a96"));
    }

    @Override
    public void stop() {
        BuHU.BS(this);
    }

    @LWjo
    @Override
    public void FFBA() {
        Object object = BuHU.BS(BuHU.BS((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878)));
        Object object2 = BuHU.BS(BuHU.BS(object));
        while (object2.hasNext()) {
            Object object3;
            Object object4 = BuHU.BS((Long)object2.next());
            QyFw qyFw = new QyFw();
            Object object5 = BuHU.BS((wfPa)BuHU.BS(object, BuHU.BS(object4)));
            while (object5.hasNext()) {
                object3 = (StackTraceElement)object5.next();
                Object object6 = BuHU.BS(BuHU.BS(BuHU.BS(object3)));
                while (object6.hasNext()) {
                    Plugin plugin = (Plugin)object6.next();
                    if (BuHU.BS(qyFw, plugin.getName()) != false) continue;
                    BuHU.BS(qyFw, plugin.getName());
                }
            }
            object5 = BuHU.BS(qyFw);
            while (object5.hasNext()) {
                object3 = (String)object5.next();
                if (BuHU.BS((ktOu)cv.b(this, -1973095725), object3) == false) {
                    BuHU.BS((ktOu)cv.b(this, -1973095725), object3, BuHU.BS(false));
                }
                BuHU.BS((ktOu)cv.b(this, -1973095725), object3, BuHU.BS(BuHU.BS((Integer)BuHU.BS((ktOu)cv.b(this, -1973095725), object3)) + true));
            }
        }
        BuHU.BS(BuHU.BS(BuHU.BS((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878))));
    }

    @Override
    public String BuHU() {
        return KUXS$dwji.S("\u42d4\u322b\u678f\uf2d0\u564a\u59c8\u57ed\u068f\u72c3\u5e3c\u93ab\u9b99\u0087\u1473\u596f\u29e4");
    }

    @YffC
    @Override
    public void tick() {
    }

    public ktOu<String, Integer> QhBc() {
        return (ktOu)cv.b(this, -1973095725);
    }

    private static Object BS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

