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

class Bcie$2
extends CxNA {
    final /* synthetic */ Bcie WQFh;
    private final /* synthetic */ TNku pHkU;

    Bcie$2(Bcie bcie, TNku tNku) {
        this.WQFh = bcie;
        this.pHkU = tNku;
    }

    @Override
    public void run() {
        Object object = Bcie$2.uQ(Bcie$2.uQ((TNku)o.a(this, -1899931931)));
        while (object.hasNext()) {
            Object object2;
            Object object3 = Bcie$2.uQ((Long)object.next());
            Lhwj lhwj = new Lhwj();
            Object object4 = Bcie$2.uQ((feCR)Bcie$2.uQ((TNku)o.a(this, -1899931931), Bcie$2.uQ(object3)));
            while (object4.hasNext()) {
                object2 = (StackTraceElement)object4.next();
                Object object5 = Bcie$2.uQ(Bcie$2.uQ(Bcie$2.uQ(object2)));
                while (object5.hasNext()) {
                    Plugin plugin = (Plugin)object5.next();
                    if (Bcie$2.uQ(lhwj, plugin.getName()) != false) continue;
                    Bcie$2.uQ(lhwj, plugin.getName());
                }
            }
            object4 = Bcie$2.uQ(lhwj);
            while (object4.hasNext()) {
                object2 = (String)object4.next();
                if (Bcie$2.uQ(Bcie$2.uQ((Bcie)o.a(this, -62761245)), object2) == false) {
                    Bcie$2.uQ(Bcie$2.uQ((Bcie)o.a(this, -62761245)), object2, Bcie$2.uQ(false));
                }
                Bcie$2.uQ(Bcie$2.uQ((Bcie)o.a(this, -62761245)), object2, Bcie$2.uQ(Bcie$2.uQ((Integer)Bcie$2.uQ(Bcie$2.uQ((Bcie)o.a(this, -62761245)), object2)) + true));
            }
        }
    }

    private static Object uQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

