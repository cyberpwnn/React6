/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.world.WorldLoadEvent
 *  org.bukkit.event.world.WorldUnloadEvent
 *  org.spigotmc.TickLimiter
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.spigotmc.TickLimiter;

public class aoCB
extends ggmf {
    private TNku<World, UcJv> nCFR;
    private TNku<World, UcJv> oEhR;

    @Override
    public void start() {
        block6 : {
            block5 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block5;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block6;
            }
            return;
        }
        aoCB.Hr(this);
        o.v(this, 1383356129, new TNku());
        o.v(this, 1019303648, new TNku());
        Iterator iterator = aoCB.Hr().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            try {
                this.UQfI(world);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                aoCB.Hr(exception);
            }
        }
    }

    @Override
    public void stop() {
        block6 : {
            block5 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block5;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block6;
            }
            return;
        }
        aoCB.Hr(this);
        Iterator iterator = aoCB.Hr().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            try {
                this.Mkpo(world);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                aoCB.Hr(exception);
            }
        }
    }

    @EventHandler
    public void yJLS(WorldLoadEvent worldLoadEvent) {
        block5 : {
            block4 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block4;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block5;
            }
            return;
        }
        try {
            this.UQfI((World)aoCB.Hr(worldLoadEvent));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            aoCB.Hr(exception);
            return;
        }
    }

    @EventHandler
    public void yJLS(WorldUnloadEvent worldUnloadEvent) {
        block5 : {
            block4 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block4;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block5;
            }
            return;
        }
        try {
            this.Mkpo((World)aoCB.Hr(worldUnloadEvent));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            aoCB.Hr(exception);
            return;
        }
    }

    @Override
    public void tick() {
    }

    public void UQfI(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return;
        }
        Object object = aoCB.Hr(nJPf$sILv.G("\u215e\u5679\u2510\ued89\u9606\ud0ac\uc884\u703d\u2d1e\u9496"));
        Object object2 = aoCB.Hr(aoCB.Hr(object, nJPf$sILv.G("\u217a\u566e\u2505\ueda7\u9613\ud095\uc88f\u7023\u2d17"), new Class[0]), world, new Object[0]);
        Field field = aoCB.yJLS(object2, nJPf$sILv.G("\u2178\u5665\u2505\ued86\u9606\ud082\uc8a7\u7026\u2d1f\u949b\u6097\u4d98\u42fa"));
        Field field2 = aoCB.yJLS(object2, nJPf$sILv.G("\u2169\u5662\u251d\ued8a\u963e\ud092\uc886\u7026\u2d06\u9497\u6091"));
        UcJv ucJv = new UcJv(50.0, true);
        UcJv ucJv2 = new UcJv(50.0, false);
        aoCB.Hr(field, true);
        aoCB.Hr(field2, true);
        aoCB.Hr(field, object2, ucJv);
        aoCB.Hr(field2, object2, ucJv2);
        aoCB.Hr((TNku)o.a(this, 1383356129), world, ucJv);
        aoCB.Hr((TNku)o.a(this, 1019303648), world, ucJv2);
    }

    public void Mkpo(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return;
        }
        Object object = aoCB.Hr(mrFx$WjFM.d("\uf2f8\u775e\u9edf\ubb5a\uba24\u5ab4\u89d6\u35f1\ua5eb\u5aa2"));
        Object object2 = aoCB.Hr(aoCB.Hr(object, mrFx$WjFM.d("\uf2dc\u7749\u9eca\ubb74\uba31\u5a8d\u89dd\u35ef\ua5e2"), new Class[0]), world, new Object[0]);
        Field field = aoCB.yJLS(object2, mrFx$WjFM.d("\uf2de\u7742\u9eca\ubb55\uba24\u5a9a\u89f5\u35ea\ua5ea\u5aaf\uf063\ueb26\u8ebd"));
        Field field2 = aoCB.yJLS(object2, mrFx$WjFM.d("\uf2cf\u7745\u9ed2\ubb59\uba1c\u5a8a\u89d4\u35ea\ua5f3\u5aa3\uf065"));
        TickLimiter tickLimiter = new TickLimiter((int)aoCB.Hr(world));
        TickLimiter tickLimiter2 = new TickLimiter((int)aoCB.Hr(world));
        aoCB.Hr(field, true);
        aoCB.Hr(field2, true);
        aoCB.Hr(field, object2, tickLimiter);
        aoCB.Hr(field2, object2, tickLimiter2);
        aoCB.Hr((TNku)o.a(this, 1383356129), world);
        aoCB.Hr((TNku)o.a(this, 1019303648), world);
    }

    public double oVJh() {
        block4 : {
            block3 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block3;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block4;
            }
            return -1.0;
        }
        double d = 0.0;
        Object object = aoCB.Hr(aoCB.Hr((TNku)o.a(this, 1383356129)));
        while (object.hasNext()) {
            World world = (World)object.next();
            if (this.xykf(world) < 0.0) continue;
            d += this.xykf(world);
        }
        return d;
    }

    public double mrHN() {
        block4 : {
            block3 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block3;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block4;
            }
            return -1.0;
        }
        double d = 0.0;
        Object object = aoCB.Hr(aoCB.Hr((TNku)o.a(this, 1383356129)));
        while (object.hasNext()) {
            World world = (World)object.next();
            if (this.CoVI(world) < 0.0) continue;
            d += this.CoVI(world);
        }
        return d;
    }

    public double QEdN() {
        block4 : {
            block3 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block3;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block4;
            }
            return -1.0;
        }
        double d = 0.0;
        Object object = aoCB.Hr(aoCB.Hr((TNku)o.a(this, 1383356129)));
        while (object.hasNext()) {
            World world = (World)object.next();
            if (this.wKtV(world) < 0.0) continue;
            d += this.wKtV(world);
        }
        return d;
    }

    public double ktRX() {
        block4 : {
            block3 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block3;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block4;
            }
            return -1.0;
        }
        double d = 0.0;
        Object object = aoCB.Hr(aoCB.Hr((TNku)o.a(this, 1019303648)));
        while (object.hasNext()) {
            World world = (World)object.next();
            if (this.IFQY(world) < 0.0) continue;
            d += this.IFQY(world);
        }
        return d;
    }

    public double JROj() {
        block4 : {
            block3 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block3;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block4;
            }
            return -1.0;
        }
        double d = 0.0;
        Object object = aoCB.Hr(aoCB.Hr((TNku)o.a(this, 1019303648)));
        while (object.hasNext()) {
            World world = (World)object.next();
            d += this.uVol(world);
        }
        return d;
    }

    public double Nwmj() {
        block4 : {
            block3 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block3;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block4;
            }
            return -1.0;
        }
        double d = 0.0;
        Object object = aoCB.Hr(aoCB.Hr((TNku)o.a(this, 1019303648)));
        while (object.hasNext()) {
            World world = (World)object.next();
            d += this.dfaE(world);
        }
        return d;
    }

    public void yJLS(World world, double d) {
        block5 : {
            block4 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block4;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block5;
            }
            return;
        }
        if (!((Boolean)o.a(aoCB.Hr(world), 623924970)).booleanValue()) {
            return;
        }
        o.v((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1383356129), world))), 1251628386, d);
    }

    public void UtIU(World world, double d) {
        block5 : {
            block4 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block4;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block5;
            }
            return;
        }
        if (!((Boolean)o.a(aoCB.Hr(world), 2067224297)).booleanValue()) {
            return;
        }
        o.v((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1019303648), world))), 1251628386, d);
    }

    public double CoVI(World world) {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return -1.0;
        }
        return (Double)o.a((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1383356129), world))), 1251628386);
    }

    public double wKtV(World world) {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return -1.0;
        }
        return (Double)o.a((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1019303648), world))), 1251628386);
    }

    public double xykf(World world) {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return -1.0;
        }
        return (double)aoCB.Hr((OXoN)o.a((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1383356129), world))), -1567795859));
    }

    public double IFQY(World world) {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return -1.0;
        }
        return (double)aoCB.Hr((OXoN)o.a((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1019303648), world))), -1567795859));
    }

    public double uVol(World world) {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return -1.0;
        }
        return (double)aoCB.Hr((OXoN)o.a((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1383356129), world))), -2126490261));
    }

    public double dfaE(World world) {
        block3 : {
            block2 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block2;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block3;
            }
            return -1.0;
        }
        return (double)aoCB.Hr((OXoN)o.a((Object)((UcJv)((Object)aoCB.Hr((TNku)o.a(this, 1019303648), world))), -2126490261));
    }

    public static Field yJLS(Object object, String string) {
        Object object2;
        block6 : {
            block5 : {
                if (aoCB.Hr((JIWX)o.k(670385532)) == false) break block5;
                if (aoCB.Hr((JIWX)o.k(668091771)) != false) break block6;
            }
            return null;
        }
        Object object3 = object2 = aoCB.Hr(object);
        while (object3 != null) {
            try {
                Object object4 = aoCB.Hr(object3, string);
                return object4;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                object3 = aoCB.Hr(object3);
            }
        }
        return null;
    }

    private static Object Hr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

