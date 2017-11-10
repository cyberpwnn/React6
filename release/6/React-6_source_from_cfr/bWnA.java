/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class bWnA
implements FpQi {
    private double value;
    private String id;
    private String name;
    private String description;
    private ydHl qKUH;
    private ydHl hjls;
    private int rhKA;

    public bWnA() {
        this.pOsy();
    }

    @Override
    public String getID() {
        return (String)yy.h(this, 2002585457);
    }

    @Override
    public String getName() {
        return (String)yy.h(this, 1135937402);
    }

    @Override
    public String getDescription() {
        return (String)yy.h(this, -1368258705);
    }

    @Override
    public ydHl UtMF() {
        return (ydHl)((Object)yy.h(this, -2001729680));
    }

    @Override
    public ydHl xFjc() {
        return (ydHl)((Object)yy.h(this, 242681669));
    }

    @Override
    public int getInterval() {
        return (Integer)yy.h(this, -523827394);
    }

    @Override
    public abstract void qKGr();

    @Override
    public abstract void pOsy();

    @Override
    public abstract String get();

    @Override
    public void setValue(double d) {
        yy.E(this, -881129661, d);
    }

    @Override
    public double getValue() {
        return (Double)yy.h(this, -881129661);
    }

    @Override
    public void setID(String string) {
        yy.E(this, 2002585457, string);
    }

    @Override
    public void setName(String string) {
        yy.E(this, 1135937402, string);
    }

    @Override
    public void setDescription(String string) {
        yy.E(this, -1368258705, string);
    }

    @Override
    public void mXJp(ydHl ydHl2, ydHl ydHl3) {
        yy.E(this, -2001729680, (Object)((Object)ydHl2));
        yy.E(this, 242681669, (Object)((Object)ydHl3));
    }

    @Override
    public void dMNe(int n) {
        yy.E(this, -523827394, (int)bWnA.Kj(n, 1.0, 1200.0));
    }

    private static Object Kj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

