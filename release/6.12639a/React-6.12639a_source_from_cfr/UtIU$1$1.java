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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.World;

class UtIU$1$1
extends vbvg {
    final /* synthetic */ UtIU.1 dLuw;
    private final /* synthetic */ Object owir;
    private final /* synthetic */ Constructor wClQ;
    private final /* synthetic */ Constructor YMWq;
    private final /* synthetic */ Method MRfD;
    private final /* synthetic */ Integer[] CxNA;
    private final /* synthetic */ Integer[] mFpP;
    private final /* synthetic */ XAcv SnJT;
    private final /* synthetic */ Integer Lqeo;

    UtIU$1$1(UtIU.1 var1_1, String string, int n, Object object, Constructor constructor, Constructor constructor2, Method method, Integer[] arrinteger, Integer[] arrinteger2, XAcv xAcv, Integer n2) {
        this.dLuw = var1_1;
        this.owir = object;
        this.wClQ = constructor;
        this.YMWq = constructor2;
        this.MRfD = method;
        this.CxNA = arrinteger;
        this.mFpP = arrinteger2;
        this.SnJT = xAcv;
        this.Lqeo = n2;
        super(string, n);
    }

    @Override
    public void run() {
        try {
            Chunk chunk = (Chunk)o.a(this, 1345541697);
            if (((Boolean)o.a(UtIU$1$1.zY(chunk.getWorld()), 1391220288)).booleanValue()) {
                Object[] arrobject = new Object[3];
                arrobject[0] = UtIU$1$1.zY(chunk.getX() << 4);
                arrobject[1] = UtIU$1$1.zY(false);
                arrobject[2] = UtIU$1$1.zY(chunk.getZ() << 4);
                Object object = UtIU$1$1.zY((Constructor)o.a(this, -1103276481), arrobject);
                Object[] arrobject2 = new Object[3];
                arrobject2[0] = UtIU$1$1.zY(16 + (chunk.getX() << 4));
                arrobject2[1] = UtIU$1$1.zY(256);
                arrobject2[2] = UtIU$1$1.zY(16 + (chunk.getZ() << 4));
                Object object2 = UtIU$1$1.zY((Constructor)o.a(this, -1103276481), arrobject2);
                Object object3 = UtIU$1$1.zY((Constructor)o.a(this, 406279742), new Object[]{object, object2});
                Object object4 = UtIU$1$1.zY((Method)o.a(this, 93738557), null, new Object[]{chunk.getWorld().getName(), object3});
                Integer[] arrinteger = (Integer[])o.a(this, -1447471556);
                arrinteger[0] = UtIU$1$1.zY(UtIU$1$1.zY(arrinteger[0]) + UtIU$1$1.zY((Integer)object4));
                Integer[] arrinteger2 = (Integer[])o.a(this, 1298159163);
                arrinteger2[0] = UtIU$1$1.zY(UtIU$1$1.zY(arrinteger2[0]) + true);
                UtIU$1$1.zY((XAcv)o.a(this, 458577610), UtIU$1$1.zY(UtIU$1$1.zY(((Integer[])o.a(this, 1298159163))[0]) / UtIU$1$1.zY((Integer)o.a(this, 1833653960))));
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static Object zY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

