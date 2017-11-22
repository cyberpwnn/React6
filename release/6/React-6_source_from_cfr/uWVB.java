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

public class uWVB
extends OPXm {
    public uWVB() {
        super(Long.class, (GHaL)((Object)cv.e(1197936249)));
    }

    public void set(Long l) {
        uWVB.vG(this.mXMK());
        uWVB.vG(this.mXMK(), l);
    }

    public long get() {
        if (uWVB.vG(this.mXMK()) != false) {
            return 10000;
        }
        return (long)uWVB.vG((Long)uWVB.vG(this.mXMK()).next());
    }

    @Override
    public int jhSt(CommandSender commandSender, String string) throws kYwm {
        Object object = 10000;
        double d = 1.0;
        String string2 = "";
        if (uWVB.vG(uWVB.vG(string), KUXS$dwji.S("\u3ae1\u6c5b")) != false) {
            d = 1.0;
            string2 = KUXS$dwji.S("\u3ae1\u6c5b");
        } else if (uWVB.vG(uWVB.vG(string), KUXS$dwji.S("\u3af8")) != false) {
            d = 50.0;
            string2 = KUXS$dwji.S("\u3af8");
        } else if (uWVB.vG(uWVB.vG(string), KUXS$dwji.S("\u3aff")) != false) {
            d = 1000.0;
            string2 = KUXS$dwji.S("\u3aff");
        } else if (uWVB.vG(uWVB.vG(string), KUXS$dwji.S("\u3ae1")) != false) {
            d = 60000.0;
            string2 = KUXS$dwji.S("\u3ae1");
        } else if (uWVB.vG(uWVB.vG(string), KUXS$dwji.S("\u3ae4")) != false) {
            d = 3600000.0;
            string2 = KUXS$dwji.S("\u3ae4");
        } else if (uWVB.vG(uWVB.vG(string), KUXS$dwji.S("\u3ae8")) != false) {
            d = 8.64E7;
            string2 = KUXS$dwji.S("\u3ae8");
        }
        Object object2 = uWVB.vG(uWVB.vG(uWVB.vG(string), false, uWVB.vG(string) - uWVB.vG(string2)));
        try {
            Object object3 = uWVB.vG(uWVB.vG(object2));
            object = object3 * d;
        }
        catch (NumberFormatException numberFormatException) {
            throw new kYwm((String)uWVB.vG(uWVB.vG(uWVB.vG(uWVB.vG(new StringBuilder(KUXS$dwji.S("\u3ad9\u6c46\u4846\u036e\u9e86\udcae\u1ec6\uae5f\u0682\ufde2\u5721\u7d42\u43bc\u986a\u3c48\u5afe\u47d6")), string), KUXS$dwji.S("\u3aac\u6c4e\u4848\u037e\u9eca\udca5\u1e93\uae46\u068f\ufda7\u5723\u7d03")), object2)));
        }
        this.set((Long)uWVB.vG(object));
        return 0;
    }

    @Override
    public String getName() {
        return KUXS$dwji.S("\u2a94\u2e51\u0e5e\ua0d2");
    }

    private static Object vG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

