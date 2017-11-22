/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class kRIL
extends LGOT<wfPa<StackTraceElement>> {
    public kRIL(long l, wfPa<StackTraceElement> wfPa2, String string) {
        super(l, wfPa2, string);
    }

    @Override
    public vslr aLYV() {
        vslr vslr2 = new vslr();
        HdyI hdyI = new HdyI();
        Object object = kRIL.CO((wfPa)this.Smci());
        while (object.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement)object.next();
            vslr vslr3 = new vslr();
            kRIL.CO(vslr3, rgig$AWxc.r("\u6f9e\u6f97\u52a3\u706c"), kRIL.CO(stackTraceElement));
            kRIL.CO(vslr3, rgig$AWxc.r("\u6f94\u6f97\u52a1\u706c"), kRIL.CO(stackTraceElement));
            kRIL.CO(vslr3, rgig$AWxc.r("\u6f91\u6f92\u52ac\u707a\uc3c7"), kRIL.CO(stackTraceElement));
            kRIL.CO(vslr3, rgig$AWxc.r("\u6f9f\u6f9b\u52b9\u7061\uc3db\u8cb6"), kRIL.CO(stackTraceElement));
            kRIL.CO(hdyI, vslr3);
        }
        kRIL.CO(vslr2, rgig$AWxc.r("\u6f86\u6f8c\u52ac\u706a\uc3d1"), hdyI);
        return vslr2;
    }

    @Override
    public void ssNb(vslr vslr2) {
        wfPa wfPa2 = new wfPa();
        Object object = kRIL.CO(vslr2, KUXS$dwji.S("\ub85c\ucae0\ud39b\u2135\ubb00"));
        int n = 0;
        do {
            if (n >= kRIL.CO(object)) break;
            Object object2 = kRIL.CO(object, n);
            StackTraceElement stackTraceElement = new StackTraceElement((String)kRIL.CO(object2, KUXS$dwji.S("\ub84b\ucafe\ud39b\u2125\ubb16")), (String)kRIL.CO(object2, KUXS$dwji.S("\ub845\ucaf7\ud38e\u213e\ubb0a\ue521")), (String)kRIL.CO(object2, KUXS$dwji.S("\ub84e\ucafb\ud396\u2133")), (int)kRIL.CO(object2, KUXS$dwji.S("\ub844\ucafb\ud394\u2133")));
            kRIL.CO(wfPa2, stackTraceElement);
            ++n;
        } while (true);
        cv.e(this, 329446188, wfPa2);
    }

    private static Object CO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

