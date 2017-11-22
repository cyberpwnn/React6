/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class FMwy {
    private String[] ydeV;
    private int index = 0;
    public static final FMwy ymWA;
    public static final FMwy vcko;
    public static final FMwy QOQT;
    public static final FMwy WPbI;
    public static final FMwy cBcK;

    static {
        cv.V(1474295558, new FMwy());
        cv.V(1511454465, new FMwy(KUXS$dwji.S("\u46d6"), KUXS$dwji.S("\u46d7"), KUXS$dwji.S("\u46d4"), KUXS$dwji.S("\u46d5"), KUXS$dwji.S("\u46d2"), KUXS$dwji.S("\u46d3"), KUXS$dwji.S("\u46d0"), KUXS$dwji.S("\u46d1")));
        cv.V(2121791232, new FMwy(KUXS$dwji.S("\u4512"), KUXS$dwji.S("\u4513"), KUXS$dwji.S("\u4510"), KUXS$dwji.S("\u4511")));
        cv.V(-1348012285, new FMwy(KUXS$dwji.S("\u4666"), KUXS$dwji.S("\u4667"), KUXS$dwji.S("\u4664"), KUXS$dwji.S("\u4665"), KUXS$dwji.S("\u4662"), KUXS$dwji.S("\u4663")));
        cv.V(1129838338, new FMwy(KUXS$dwji.S("\u464a"), KUXS$dwji.S("\u464b"), KUXS$dwji.S("\u4648"), KUXS$dwji.S("\u4649"), KUXS$dwji.S("\u4648"), KUXS$dwji.S("\u464b")));
    }

    public /* varargs */ FMwy(String ... arrstring) {
        this.ydeV = arrstring;
    }

    public FMwy() {
        this(rgig$AWxc.r("\ub176"), rgig$AWxc.r("\ub175"), rgig$AWxc.r("\ub172"), rgig$AWxc.r("\ub177"), rgig$AWxc.r("\ub173"), rgig$AWxc.r("\ub174"));
    }

    public String toString() {
        if (((String[])cv.b(this, 597882637)).length > (Integer)cv.b(this, 1980167948) + 1) {
            FMwy fMwy = this;
            cv.e(fMwy, 1980167948, (Integer)cv.b(fMwy, 1980167948) + 1);
        } else {
            cv.e(this, 1980167948, 0);
        }
        return FMwy.Dh(new StringBuilder((String)FMwy.Dh(((String[])cv.b(this, 597882637))[(Integer)cv.b(this, 1980167948)])));
    }

    public String[] OrjV() {
        return (String[])cv.b(this, 597882637);
    }

    public int getIndex() {
        return (Integer)cv.b(this, 1980167948);
    }

    private static Object Dh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

