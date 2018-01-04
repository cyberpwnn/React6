/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.entity.Player;

class cJUN$1
extends vbvg {
    final /* synthetic */ cJUN dhJl;

    cJUN$1(cJUN cJUN2, String string) {
        this.dhJl = cJUN2;
        super(string);
    }

    @Override
    public void run() {
        Iterator iterator = cJUN$1.mO().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (cJUN$1.mO((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player) == false) continue;
            if (cJUN$1.mO(cJUN$1.mO((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player)) == false) continue;
            if (cJUN$1.mO(cJUN$1.mO((cJUN)o.a(this, -1010607669)), player) != false) continue;
            cJUN$1.mO((cJUN)o.a(this, -1010607669), player);
        }
    }

    private static Object mO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

