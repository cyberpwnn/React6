/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class avmQ {
    private ktOu<EntityType, Integer> UIbl = new ktOu();
    private ktOu<EntityType, QyFw<Entity>> hQYY = new ktOu();

    public avmQ() {
    }

    public avmQ(Chunk chunk) {
        this();
        for (Entity entity : chunk.getEntities()) {
            this.jhSt(entity);
        }
    }

    public wfPa<Entity> cIji() {
        wfPa<Entity> wfPa2 = new wfPa<Entity>();
        Object object = avmQ.VC(avmQ.VC((ktOu)cv.b(this, 257691522)));
        while (object.hasNext()) {
            EntityType entityType = (EntityType)object.next();
            avmQ.VC(wfPa2, (Collection)avmQ.VC((ktOu)cv.b(this, 257691522), entityType));
        }
        return wfPa2;
    }

    public wfPa<EntityType> Cnru() {
        return avmQ.VC((ktOu)cv.b(this, 926945164));
    }

    public int LWjo() {
        int n = 0;
        Object object = avmQ.VC(this.Cnru());
        while (object.hasNext()) {
            EntityType entityType = (EntityType)object.next();
            n += this.ssNb(entityType);
        }
        return n;
    }

    public int ssNb(EntityType entityType) {
        if (avmQ.VC((ktOu)cv.b(this, 926945164), entityType) != false) {
            return (int)avmQ.VC((Integer)avmQ.VC((ktOu)cv.b(this, 926945164), entityType));
        }
        return 0;
    }

    public QyFw<Entity> DYFV(EntityType entityType) {
        QyFw<Entity> qyFw = new QyFw<Entity>();
        if (avmQ.VC((ktOu)cv.b(this, 257691522), entityType) != false) {
            avmQ.VC(qyFw, (Collection)avmQ.VC((ktOu)cv.b(this, 257691522), entityType));
        }
        return qyFw;
    }

    public void jhSt(Entity entity) {
        if (avmQ.VC((ktOu)cv.b(this, 926945164), entity.getType()) == false) {
            avmQ.VC((ktOu)cv.b(this, 926945164), entity.getType(), avmQ.VC(false));
        }
        if (avmQ.VC((ktOu)cv.b(this, 257691522), entity.getType()) == false) {
            avmQ.VC((ktOu)cv.b(this, 257691522), entity.getType(), new QyFw());
        }
        avmQ.VC((QyFw)avmQ.VC((ktOu)cv.b(this, 257691522), entity.getType()), entity);
        avmQ.VC((ktOu)cv.b(this, 926945164), entity.getType(), avmQ.VC(avmQ.VC((Integer)avmQ.VC((ktOu)cv.b(this, 926945164), entity.getType())) + true));
    }

    private static Object VC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

