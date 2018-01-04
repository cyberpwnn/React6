/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public final class hjqu
extends Enum<hjqu> {
    public static final /* enum */ hjqu HpSG;
    public static final /* enum */ hjqu YrAq;
    public static final /* enum */ hjqu apga;
    public static final /* enum */ hjqu SNLq;
    public static final /* enum */ hjqu eIoS;
    private String name;
    private static final /* synthetic */ hjqu[] wyXF;

    static {
        o.w(1112750888, (Object)new hjqu(FMkR$WjFM.a("\u343c\u3933\u38f0\u153e\ue13e"), 0, FMkR$WjFM.a("\u343c\u3913\u38d0\u151e\ue11e")));
        o.w(1627994919, (Object)new hjqu(FMkR$WjFM.a("\u342c\u3933\u38f2\u1537"), 1, FMkR$WjFM.a("\u342c\u3913\u38d6\u1506\ue12b\u813f\ue06a\u2780\u8e29\u72cc\u16c4\ua01a\ubcad\u4baa\ua38f\u88df\u6b9c\udae4")));
        o.w(558119718, (Object)new hjqu(FMkR$WjFM.a("\u343d\u393d\u38f7\u153e\ue12e\u8109\ue057\u27a7\u8e1e"), 2, FMkR$WjFM.a("\u343d\u391d\u38d7\u151e\ue10e\u8109\ue077\u2787\u8e3e")));
        o.w(-367838427, (Object)new hjqu(FMkR$WjFM.a("\u343a\u3920\u38ea\u1526\ue125\u8100\ue05a\u27ac"), 3, FMkR$WjFM.a("\u343a\u3900\u38ca\u1506\ue105\u812f\ue07c\u2782\u8e06\u72f2\u16c9")));
        o.w(656554788, (Object)new hjqu(FMkR$WjFM.a("\u3429\u393b\u38f1\u153b\ue130\u8109\ue05d\u27bd"), 4, FMkR$WjFM.a("\u3429\u391b\u38d1\u151b\ue110\u8129\ue07d\u279d")));
        o.w(-1882571997, new hjqu[]{(hjqu)((Object)o.k(1112750888)), (hjqu)((Object)o.k(1627994919)), (hjqu)((Object)o.k(558119718)), (hjqu)((Object)o.k(-367838427)), (hjqu)((Object)o.k(656554788))});
    }

    private hjqu(String string2, int n2, String string3) {
        this.name = string2;
    }

    public boolean exists() {
        if (hjqu.Lk().getPluginManager().getPlugin((String)o.a((Object)this, 1703951122)) != null) {
            return true;
        }
        return false;
    }

    public static hjqu[] values() {
        hjqu[] arrhjqu = (hjqu[])o.k(-1882571997);
        int n = arrhjqu.length;
        hjqu[] arrhjqu2 = new hjqu[n];
        hjqu.Lk(arrhjqu, false, arrhjqu2, false, n);
        return arrhjqu2;
    }

    public static hjqu valueOf(String string) {
        return (hjqu)((Object)hjqu.Lk(hjqu.class, string));
    }

    private static Object Lk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

