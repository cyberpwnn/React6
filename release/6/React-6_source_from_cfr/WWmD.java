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

public class WWmD {
    private aKuV<EntityType, Integer> wUTr = new aKuV();
    private aKuV<EntityType, hGxw<Entity>> APKn = new aKuV();

    public WWmD() {
    }

    public WWmD(Chunk chunk) {
        this();
        for (Entity entity : chunk.getEntities()) {
            this.JRFt(entity);
        }
    }

    public PBUD<Entity> AFpD() {
        PBUD<Entity> pBUD = new PBUD<Entity>();
        Object object = WWmD.rJ(WWmD.rJ((aKuV)yy.h(this, 1598089663)));
        while (object.hasNext()) {
            EntityType entityType = (EntityType)object.next();
            WWmD.rJ(pBUD, (Collection)WWmD.rJ((aKuV)yy.h(this, 1598089663), entityType));
        }
        return pBUD;
    }

    public PBUD<EntityType> DijM() {
        return WWmD.rJ((aKuV)yy.h(this, 593495829));
    }

    public int fJhK() {
        int n = 0;
        Object object = WWmD.rJ(this.DijM());
        while (object.hasNext()) {
            EntityType entityType = (EntityType)object.next();
            n += this.mXJp(entityType);
        }
        return n;
    }

    public int mXJp(EntityType entityType) {
        if (WWmD.rJ((aKuV)yy.h(this, 593495829), entityType) != false) {
            return (int)WWmD.rJ((Integer)WWmD.rJ((aKuV)yy.h(this, 593495829), entityType));
        }
        return 0;
    }

    public hGxw<Entity> ksfs(EntityType entityType) {
        hGxw<Entity> hGxw2 = new hGxw<Entity>();
        if (WWmD.rJ((aKuV)yy.h(this, 1598089663), entityType) != false) {
            WWmD.rJ(hGxw2, (Collection)WWmD.rJ((aKuV)yy.h(this, 1598089663), entityType));
        }
        return hGxw2;
    }

    public void JRFt(Entity entity) {
        if (WWmD.rJ((aKuV)yy.h(this, 593495829), entity.getType()) == false) {
            WWmD.rJ((aKuV)yy.h(this, 593495829), entity.getType(), WWmD.rJ(false));
        }
        if (WWmD.rJ((aKuV)yy.h(this, 1598089663), entity.getType()) == false) {
            WWmD.rJ((aKuV)yy.h(this, 1598089663), entity.getType(), new hGxw());
        }
        WWmD.rJ((hGxw)WWmD.rJ((aKuV)yy.h(this, 1598089663), entity.getType()), entity);
        WWmD.rJ((aKuV)yy.h(this, 593495829), entity.getType(), WWmD.rJ(WWmD.rJ((Integer)WWmD.rJ((aKuV)yy.h(this, 593495829), entity.getType())) + true));
    }

    private static Object rJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

