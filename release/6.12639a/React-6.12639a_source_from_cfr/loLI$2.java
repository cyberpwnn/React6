/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class loLI$2
extends Iyhh {
    final /* synthetic */ loLI rOfQ;

    loLI$2(loLI loLI2) {
        this.rOfQ = loLI2;
    }

    @Override
    public void tKvO() {
        loLI$2.fj((loLI)o.a(this, -630043209), this.EBnx());
        loLI$2.fj((loLI)o.a(this, -630043209), this.PBoS());
        loLI$2.fj(loLI$2.fj((loLI)o.a(this, -630043209)), loLI$2.fj((loLI)o.a(this, -630043209)));
        loLI$2.fj(loLI$2.fj((loLI)o.a(this, -630043209)), loLI$2.fj((loLI)o.a(this, -630043209)));
        loLI$2.fj((loLI)o.a(this, -630043209), loLI$2.fj(loLI$2.fj((loLI)o.a(this, -630043209))));
        loLI$2.fj((loLI)o.a(this, -630043209), loLI$2.fj(loLI$2.fj((loLI)o.a(this, -630043209))));
        loLI$2.fj((loLI)o.a(this, -630043209), loLI$2.fj((loLI)o.a(this, -630043209)) / 50.0);
        loLI$2.fj((loLI)o.a(this, -630043209), loLI$2.fj((loLI)o.a(this, -630043209)) / 50.0);
        loLI$2.fj((loLI)o.a(this, -630043209), 50.0 - loLI$2.fj((loLI)o.a(this, -630043209)) < 0.0 ? 0.0 : 50.0 - loLI$2.fj((loLI)o.a(this, -630043209)));
        loLI$2.fj((loLI)o.a(this, -630043209), this.isFrozen());
    }

    @Override
    public void GcIT() {
        loLI$2.fj(loLI$2.fj((loLI)o.a(this, -630043209)), loLI$2.fj(loLI$2.fj()), new feCR<StackTraceElement>(this.Hvlr()));
    }

    private static Object fj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

