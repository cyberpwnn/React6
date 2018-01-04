/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.world.ChunkLoadEvent
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.Plugin;

class YLuU$1
extends XAcv<Plugin> {
    final /* synthetic */ YLuU mHOF;
    private final /* synthetic */ ChunkLoadEvent LjRx;

    YLuU$1(YLuU yLuU, ChunkLoadEvent chunkLoadEvent) {
        this.mHOF = yLuU;
        this.LjRx = chunkLoadEvent;
    }

    public void biLo(Plugin plugin) {
        if (plugin == null) {
            Object object = YLuU$1.oP(YLuU$1.oP((ChunkLoadEvent)o.a(this, -1301195923)));
            if (object != null) {
                if (YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), object) == false) {
                    YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), object, YLuU$1.oP(false));
                }
                YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), object, YLuU$1.oP(YLuU$1.oP((Integer)YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), object)) + true));
                return;
            }
            YLuU yLuU = (YLuU)o.a(this, -1069198470);
            YLuU$1.oP(yLuU, YLuU$1.oP(yLuU) + true);
            return;
        }
        if (YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), plugin) == false) {
            YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), plugin, YLuU$1.oP(false));
        }
        YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), plugin, YLuU$1.oP(YLuU$1.oP((Integer)YLuU$1.oP(YLuU$1.oP((YLuU)o.a(this, -1069198470)), plugin)) + true));
    }

    @Override
    public /* synthetic */ void yJLS(Object object) {
        this.biLo((Plugin)object);
    }

    private static Object oP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

