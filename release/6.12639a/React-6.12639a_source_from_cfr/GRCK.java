/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.World;

public class GRCK {
    private Lhwj<Chunk> ENFb;

    public GRCK() {
        this.ENFb = new Lhwj();
    }

    public GRCK(Chunk chunk) {
        this();
        this.wKtV(chunk);
    }

    public GRCK(World world) {
        this.addWorld(world);
    }

    public void addWorld(World world) {
        GRCK.Hs((Lhwj)o.a(this, 980892505), GRCK.Hs(world));
    }

    public void ghWw() {
        GRCK.Hs((Lhwj)o.a(this, 980892505), GRCK.Hs());
    }

    public void wKtV(Chunk chunk) {
        GRCK.Hs((Lhwj)o.a(this, 980892505), chunk);
    }

    public Lhwj<Chunk> xYGl() {
        return (Lhwj)o.a(this, 980892505);
    }

    private static Object Hs(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

