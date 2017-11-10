/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

class Mkul$1
extends QFCu {
    final /* synthetic */ Mkul PvQs;

    Mkul$1(Mkul mkul, String string, int n) {
        this.PvQs = mkul;
        super(string, n);
    }

    @Override
    public void run() {
        if (Mkul$1.uj(Mkul$1.uj((Mkul)yy.h(this, 405465418)).VfRi()) == false) {
            Mkul$1.uj((Mkul)yy.h(this, 405465418)).yIkI((Chunk)Mkul$1.uj(Mkul$1.uj((Mkul)yy.h(this, 405465418)).VfRi()));
        }
    }

    private static Object uj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

