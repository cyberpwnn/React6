/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class OirP
extends maKI {
    private String username;
    private String password;

    public OirP() {
        super((Cfqo)((Object)o.k(477187113)));
    }

    public OirP(String string, String string2) {
        super((Cfqo)((Object)o.k(477187113)));
        this.username = string;
        this.password = string2;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        OirP.tf(elru, (String)o.a(this, -2114630641));
        OirP.tf(elru, (String)o.a(this, 1773751310));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, -2114630641, OirP.tf(rFBK2));
        o.v(this, 1773751310, OirP.tf(rFBK2));
    }

    public String getUsername() {
        return (String)o.a(this, -2114630641);
    }

    public void setUsername(String string) {
        o.v(this, -2114630641, string);
    }

    public String getPassword() {
        return (String)o.a(this, 1773751310);
    }

    public void setPassword(String string) {
        o.v(this, 1773751310, string);
    }

    private static Object tf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

