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

public class vbqV {
    private hGxw<Chunk> JeGI;

    public vbqV() {
        this.JeGI = new hGxw();
    }

    public vbqV(Chunk chunk) {
        this();
        this.gUxV(chunk);
    }

    public vbqV(World world) {
        this.addWorld(world);
    }

    public void addWorld(World world) {
        vbqV.Dg((hGxw)yy.h(this, 1855717948), vbqV.Dg(world));
    }

    public void UcVo() {
        vbqV.Dg((hGxw)yy.h(this, 1855717948), vbqV.Dg());
    }

    public void gUxV(Chunk chunk) {
        vbqV.Dg((hGxw)yy.h(this, 1855717948), chunk);
    }

    public hGxw<Chunk> ccoN() {
        return (hGxw)yy.h(this, 1855717948);
    }

    private static Object Dg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

