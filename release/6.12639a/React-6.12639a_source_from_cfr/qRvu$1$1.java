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

class qRvu$1$1
extends xGOy {
    final /* synthetic */ qRvu$1 rFXL;

    qRvu$1$1(qRvu$1 var1_1) {
        this.rFXL = var1_1;
    }

    @Override
    public void run() {
        Object object = qRvu$1$1.bI(qRvu$1$1.bI(qRvu$1$1.bI((qRvu$1)o.a(this, -1943841442))));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            qRvu$1$1.bI(qRvu$1$1.bI((qRvu$1)o.a(this, -1943841442)), location);
        }
        qRvu$1$1.bI(qRvu$1$1.bI((qRvu$1)o.a(this, -1943841442)));
    }

    private static Object bI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

