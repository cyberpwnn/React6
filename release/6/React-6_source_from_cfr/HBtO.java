/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class HBtO
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(KDGY$JAHk.Y("\u6e05\u5615\u0160\u7265\uaaf3"));
        this.setDescription(KDGY$JAHk.Y("\u6e15\u5608\u017b\u7274\uaaec\u9495\u52f5\u992c\u80a9\u69a0\u0c01"));
        this.setID((String)HBtO.uN((qSYN)((Object)yy.p(1479542646))));
        this.setValue(0.0);
        this.mXJp((ydHl)((Object)yy.p(-1388378419)), (ydHl)((Object)yy.p(-1388378419)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)HBtO.uN(this.JAHk()));
    }

    @Override
    public String get() {
        Object object = HBtO.uN((IFYW)yy.h((CLqw)yy.p(1998252577), 1617160327));
        return HBtO.uN(HBtO.uN(HBtO.uN(HBtO.uN(HBtO.uN(new StringBuilder(BkvY$LhxG.I("\u7e06")), HBtO.uN((int)this.getValue())), (ydHl)((Object)yy.p(2001267044))), BkvY$LhxG.I("\u7a0f")), HBtO.uN(object)));
    }

    private static Object uN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

