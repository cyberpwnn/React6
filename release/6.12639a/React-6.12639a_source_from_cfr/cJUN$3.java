/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.player.PlayerJoinEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.event.player.PlayerJoinEvent;

class cJUN$3
extends vbvg {
    final /* synthetic */ cJUN dhJl;
    private final /* synthetic */ PlayerJoinEvent AQEJ;

    cJUN$3(cJUN cJUN2, String string, PlayerJoinEvent playerJoinEvent) {
        this.dhJl = cJUN2;
        this.AQEJ = playerJoinEvent;
        super(string);
    }

    @Override
    public void run() {
        if (cJUN$3.dh((JkaV)o.a((TEqA)o.k(911295720), 1104499257), cJUN$3.dh((PlayerJoinEvent)o.a(this, 1605327318))) != false) {
            if (cJUN$3.dh(cJUN$3.dh((JkaV)o.a((TEqA)o.k(911295720), 1104499257), cJUN$3.dh((PlayerJoinEvent)o.a(this, 1605327318)))) != false) {
                if (cJUN$3.dh(cJUN$3.dh((cJUN)o.a(this, 5069269)), cJUN$3.dh((PlayerJoinEvent)o.a(this, 1605327318))) == false) {
                    cJUN$3.dh((cJUN)o.a(this, 5069269), cJUN$3.dh((PlayerJoinEvent)o.a(this, 1605327318)));
                }
            }
        }
    }

    private static Object dh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

