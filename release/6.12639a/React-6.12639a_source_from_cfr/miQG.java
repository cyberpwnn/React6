/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class miQG
implements Surr {
    protected String command;
    protected String[] aliases;
    protected String[] Pdrw;
    protected String cJgR;
    protected String description;
    protected TNku<String, String> rpeR = new TNku();
    protected EJip vImB;

    @Override
    public String KTiK(String string) {
        return (String)miQG.Tn((TNku)o.a(this, 964838489), miQG.Tn(string));
    }

    @Override
    public void yJLS(String string, String string2) {
        miQG.Tn((TNku)o.a(this, 964838489), string, string2);
    }

    @Override
    public String getCommand() {
        return (String)o.a(this, -527285160);
    }

    @Override
    public String[] XRaB() {
        return (String[])o.a(this, 1223378007);
    }

    @Override
    public String[] hanW() {
        return (String[])o.a(this, -2472874);
    }

    @Override
    public String getUsage() {
        return (String)o.a(this, 1975010389);
    }

    @Override
    public String getDescription() {
        return (String)o.a(this, -1518517164);
    }

    @Override
    public EJip erXb() {
        return (EJip)((Object)o.a(this, 329991251));
    }

    private static Object Tn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

