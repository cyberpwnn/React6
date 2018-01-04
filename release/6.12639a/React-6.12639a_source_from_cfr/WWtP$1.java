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

class WWtP$1
extends vbvg {
    final /* synthetic */ WWtP eHiM;

    WWtP$1(WWtP wWtP, String string) {
        this.eHiM = wWtP;
        super(string);
    }

    @Override
    public void run() {
        WWtP$1.QD((WWtP)o.a(this, 110123519), WWtP$1.QD((WWtP)o.a(this, 110123519)));
        WWtP$1.QD((WWtP)o.a(this, 110123519), true);
        Iterator iterator = WWtP$1.QD().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (WWtP$1.QD((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player) == false) continue;
            if (WWtP$1.QD((WWtP)o.a(this, 110123519), player) == false) continue;
            if (WWtP$1.QD((WWtP)o.a(this, 110123519), player) == false) continue;
            WWtP$1.QD((WWtP)o.a(this, 110123519), player);
        }
    }

    private static Object QD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

