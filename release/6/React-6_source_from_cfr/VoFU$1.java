/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.map.MapCanvas
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.map.MapCanvas;

class VoFU$1
extends dDce {
    final /* synthetic */ MapCanvas jqdS;
    final /* synthetic */ VoFU gWYa;

    VoFU$1(VoFU voFU, MapCanvas mapCanvas) {
        this.gWYa = voFU;
        this.jqdS = mapCanvas;
    }

    @Override
    public void run() {
        VoFU$1.fU(VoFU$1.fU((VoFU)cv.b(this, 1600910225)), false);
        Object object = VoFU$1.fU(VoFU$1.fU((VoFU)cv.b(this, 1600910225)));
        while (object.hasNext()) {
            ogMI ogMI2 = (ogMI)object.next();
            ogMI2.DYFV((YDfo)VoFU$1.fU((VoFU)cv.b(this, 1600910225)));
        }
        byte[][] arrby = (byte[][])VoFU$1.fU(VoFU$1.fU((VoFU)cv.b(this, 1600910225)));
        byte[][] arrby2 = (byte[][])VoFU$1.fU(VoFU$1.fU((VoFU)cv.b(this, 1600910225)));
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                if (arrby[i][j] == arrby2[i][j]) continue;
                ((MapCanvas)cv.b(this, 1921708959)).setPixel(i, j, arrby[i][j]);
            }
        }
    }

    private static Object fU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

