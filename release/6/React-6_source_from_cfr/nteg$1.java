/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;

class nteg$1
extends Nwie {
    final /* synthetic */ aKuV BBRb;
    final /* synthetic */ nteg Thil;

    nteg$1(nteg nteg2, int n, int n2, Location location, aKuV aKuV2) {
        this.Thil = nteg2;
        this.BBRb = aKuV2;
        super(n, n2, location);
    }

    @Override
    public boolean mXJp(Location location) {
        block3 : {
            block2 : {
                if (nteg$1.oq(nteg$1.oq(location).getType(), (Material)yy.p(1547037685)) != false) break block2;
                if (nteg$1.oq(nteg$1.oq(location).getType(), (Material)yy.p(2136271859)) == false) break block3;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean ksfs(Location location) {
        block3 : {
            block2 : {
                if (nteg$1.oq(nteg$1.oq(location).getType(), (Material)yy.p(-908530700)) != false) break block2;
                if (nteg$1.oq(nteg$1.oq(location).getType(), (Material)yy.p(1316940777)) == false) break block3;
            }
            return true;
        }
        return false;
    }

    @Override
    public void yJLL(Location location) {
        if (((Boolean)yy.p(1232858181)).booleanValue()) {
            if (this.mXJp(location)) {
                nteg$1.oq(location).breakNaturally();
                return;
            }
        } else {
            Object object = nteg$1.oq(false, (Integer)yy.p(-395645890));
            if (nteg$1.oq((aKuV)yy.h(this, 1195502497), nteg$1.oq(object)) == false) {
                nteg$1.oq((aKuV)yy.h(this, 1195502497), nteg$1.oq(object), new PBUD());
            }
            nteg$1.oq((PBUD)nteg$1.oq((aKuV)yy.h(this, 1195502497), nteg$1.oq(object)), location);
        }
    }

    @Override
    public void finished() {
        if (!((Boolean)yy.p(1232858181)).booleanValue()) {
            Object object = nteg$1.oq(nteg$1.oq((aKuV)yy.h(this, 1195502497)));
            while (object.hasNext()) {
                Object object2 = nteg$1.oq((Integer)object.next());
                new nteg$1$1(this, BkvY$LhxG.I("\uc4d8\u8d06\u0363\ue072,\u2c2d\ubc98\uab0c\u1c07\u8246"), (int)object2, 2, (int)object2);
            }
        }
    }

    private static Object oq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

