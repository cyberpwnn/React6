/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class jVtl
implements NwfF {
    private double value;
    private String id;
    private String name;
    private String description;
    private psKX wUdq;
    private psKX xPWh;
    private int xPXI;

    public jVtl() {
        this.equl();
    }

    @Override
    public String getID() {
        return (String)o.a(this, -1291562296);
    }

    @Override
    public String getName() {
        return (String)o.a(this, 1551520455);
    }

    @Override
    public String getDescription() {
        return (String)o.a(this, -2044702010);
    }

    @Override
    public psKX aLXV() {
        return (psKX)((Object)o.a(this, 582439621));
    }

    @Override
    public psKX Surr() {
        return (psKX)((Object)o.a(this, 880956100));
    }

    @Override
    public int getInterval() {
        return (Integer)o.a(this, -1438756157);
    }

    @Override
    public abstract void IgvC();

    @Override
    public abstract void equl();

    @Override
    public abstract String get();

    @Override
    public void setValue(double d) {
        o.v(this, -1726393678, d);
    }

    @Override
    public double getValue() {
        return (Double)o.a(this, -1726393678);
    }

    @Override
    public void setID(String string) {
        o.v(this, -1291562296, string);
    }

    @Override
    public void setName(String string) {
        o.v(this, 1551520455, string);
    }

    @Override
    public void setDescription(String string) {
        o.v(this, -2044702010, string);
    }

    @Override
    public void yJLS(psKX psKX2, psKX psKX3) {
        o.v(this, 582439621, (Object)((Object)psKX2));
        o.v(this, 880956100, (Object)((Object)psKX3));
    }

    @Override
    public void UtIU(int n) {
        o.v(this, -1438756157, (int)jVtl.CG(n, 1.0, 1200.0));
    }

    private static Object CG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

