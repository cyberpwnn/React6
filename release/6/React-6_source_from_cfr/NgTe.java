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

public class NgTe {
    private QyFw<Chunk> Xvcj;

    public NgTe() {
        this.Xvcj = new QyFw();
    }

    public NgTe(Chunk chunk) {
        this();
        this.kQcX(chunk);
    }

    public NgTe(World world) {
        this.addWorld(world);
    }

    public void addWorld(World world) {
        NgTe.BP((QyFw)cv.b(this, -1813318143), NgTe.BP(world));
    }

    public void gEkj() {
        NgTe.BP((QyFw)cv.b(this, -1813318143), NgTe.BP());
    }

    public void kQcX(Chunk chunk) {
        NgTe.BP((QyFw)cv.b(this, -1813318143), chunk);
    }

    public QyFw<Chunk> qdiv() {
        return (QyFw)cv.b(this, -1813318143);
    }

    private static Object BP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

