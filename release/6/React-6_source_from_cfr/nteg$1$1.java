/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;

class nteg$1$1
extends QFCu {
    final /* synthetic */ int FVoq;
    final /* synthetic */ nteg$1 mjBL;

    nteg$1$1(nteg$1 var1_1, String string, int n, int n2, int n3) {
        this.mjBL = var1_1;
        this.FVoq = n3;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)yy.h(this, 1731259307) == 1) {
            Object object = nteg$1$1.fC((PBUD)nteg$1$1.fC((aKuV)yy.h((nteg$1)yy.h(this, 1297935276), 1195502497), nteg$1$1.fC((Integer)yy.h(this, -12915798))));
            while (object.hasNext()) {
                Location location = (Location)object.next();
                if (nteg$1$1.fC((nteg$1)yy.h(this, 1297935276), location) == false) continue;
                nteg$1$1.fC(location).breakNaturally();
            }
        }
    }

    private static Object fC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

