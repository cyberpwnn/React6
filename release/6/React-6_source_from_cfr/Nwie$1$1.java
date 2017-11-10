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

class Nwie$1$1
extends halY {
    final /* synthetic */ Nwie$1 fBjy;

    Nwie$1$1(Nwie$1 var1_1) {
        this.fBjy = var1_1;
    }

    @Override
    public void run() {
        Object object = Nwie$1$1.cj(Nwie$1$1.cj((Nwie)yy.h((Nwie$1)yy.h(this, -1131353823), 1113254186)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            Nwie$1$1.cj((Nwie)yy.h((Nwie$1)yy.h(this, -1131353823), 1113254186), location);
        }
        Nwie$1$1.cj((Nwie)yy.h((Nwie$1)yy.h(this, -1131353823), 1113254186));
    }

    private static Object cj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

