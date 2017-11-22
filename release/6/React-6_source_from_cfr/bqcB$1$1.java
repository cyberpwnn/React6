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

class bqcB$1$1
extends vIXT {
    final /* synthetic */ bqcB$1 fmaU;

    bqcB$1$1(bqcB$1 var1_1) {
        this.fmaU = var1_1;
    }

    @Override
    public void run() {
        Object object = bqcB$1$1.Do(bqcB$1$1.Do((bqcB)cv.b((bqcB$1)cv.b(this, 1573974749), 244380380)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            bqcB$1$1.Do((bqcB)cv.b((bqcB$1)cv.b(this, 1573974749), 244380380), location);
        }
        bqcB$1$1.Do((bqcB)cv.b((bqcB$1)cv.b(this, 1573974749), 244380380));
    }

    private static Object Do(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

