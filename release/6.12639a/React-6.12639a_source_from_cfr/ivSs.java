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

public class ivSs {
    private TNku<EntityType, Integer> jhjy = new TNku();
    private TNku<EntityType, Lhwj<Entity>> AaVw = new TNku();

    public ivSs() {
    }

    public ivSs(Chunk chunk) {
        this();
        Entity[] arrentity = chunk.getEntities();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            this.TEqA(entity);
            ++n2;
        }
    }

    public feCR<Entity> JIWX() {
        feCR<Entity> feCR2 = new feCR<Entity>();
        Object object = ivSs.Fi(ivSs.Fi((TNku)o.a(this, 1846560186)));
        while (object.hasNext()) {
            EntityType entityType = (EntityType)object.next();
            ivSs.Fi(feCR2, (Collection)ivSs.Fi((TNku)o.a(this, 1846560186), entityType));
        }
        return feCR2;
    }

    public feCR<EntityType> jxvf() {
        return ivSs.Fi((TNku)o.a(this, -1065728584));
    }

    public int GkCK() {
        int n = 0;
        Object object = ivSs.Fi(this.jxvf());
        while (object.hasNext()) {
            EntityType entityType = (EntityType)object.next();
            n += this.yJLS(entityType);
        }
        return n;
    }

    public int yJLS(EntityType entityType) {
        if (ivSs.Fi((TNku)o.a(this, -1065728584), entityType) != false) {
            return (int)ivSs.Fi((Integer)ivSs.Fi((TNku)o.a(this, -1065728584), entityType));
        }
        return 0;
    }

    public Lhwj<Entity> UtIU(EntityType entityType) {
        Lhwj<Entity> lhwj = new Lhwj<Entity>();
        if (ivSs.Fi((TNku)o.a(this, 1846560186), entityType) != false) {
            ivSs.Fi(lhwj, (Collection)ivSs.Fi((TNku)o.a(this, 1846560186), entityType));
        }
        return lhwj;
    }

    public void TEqA(Entity entity) {
        if (ivSs.Fi((TNku)o.a(this, -1065728584), entity.getType()) == false) {
            ivSs.Fi((TNku)o.a(this, -1065728584), entity.getType(), ivSs.Fi(false));
        }
        if (ivSs.Fi((TNku)o.a(this, 1846560186), entity.getType()) == false) {
            ivSs.Fi((TNku)o.a(this, 1846560186), entity.getType(), new Lhwj());
        }
        ivSs.Fi((Lhwj)ivSs.Fi((TNku)o.a(this, 1846560186), entity.getType()), entity);
        ivSs.Fi((TNku)o.a(this, -1065728584), entity.getType(), ivSs.Fi(ivSs.Fi((Integer)ivSs.Fi((TNku)o.a(this, -1065728584), entity.getType())) + true));
    }

    private static Object Fi(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

