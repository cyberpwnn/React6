/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

class UQfI$2
extends JJHM {
    final /* synthetic */ UQfI oDqt;
    private final /* synthetic */ int Pums;
    private final /* synthetic */ Object wnlo;
    private final /* synthetic */ xynF gFNH;
    private final /* synthetic */ GjaJ[] bOmc;
    private final /* synthetic */ yJSB PJyi;
    private final /* synthetic */ yJSB GQbv;
    private final /* synthetic */ yJSB rxpT;
    private final /* synthetic */ yJSB uqWq;
    private final /* synthetic */ yJSB Ipxq;

    UQfI$2(UQfI uQfI, String string, int n, int n2, int n3, Object object, xynF xynF2, GjaJ[] arrgjaJ, yJSB yJSB2, yJSB yJSB3, yJSB yJSB4, yJSB yJSB5, yJSB yJSB6) {
        this.oDqt = uQfI;
        this.Pums = n3;
        this.wnlo = object;
        this.gFNH = xynF2;
        this.bOmc = arrgjaJ;
        this.PJyi = yJSB2;
        this.GQbv = yJSB3;
        this.rxpT = yJSB4;
        this.uqWq = yJSB5;
        this.Ipxq = yJSB6;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)o.a(this, -240302948) - 1 == (Integer)o.a(this, 2124563611)) {
            UQfI$2.GZ((UQfI)o.a(this, 274220202), (Chunk)o.a(this, 2074363049), new UQfI$2$1(this, (yJSB)o.a(this, -1369553752), (yJSB)o.a(this, 1755792551), (yJSB)o.a(this, 492979366), (yJSB)o.a(this, -1643690843), (yJSB)o.a(this, 674383012), (xynF)o.a(this, 329401507)), (xynF)o.a(this, 329401507), (GjaJ[])o.a(this, -1540340590));
            this.cancel();
        }
    }

    static /* synthetic */ UQfI yJLS(UQfI$2 uQfI$2) {
        return (UQfI)o.a(uQfI$2, 274220202);
    }

    private static Object GZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

