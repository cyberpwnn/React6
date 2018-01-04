/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class goyd
implements mGQw {
    private String name;
    private String version;
    private String author;

    public goyd() {
    }

    public goyd(String string, String string2, String string3) {
        this.name = string;
        this.version = string2;
        this.author = string3;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        goyd.mX(elru, (String)o.a(this, 1293962466));
        goyd.mX(elru, (String)o.a(this, -1914483487));
        goyd.mX(elru, (String)o.a(this, 1093815520));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, 1293962466, goyd.mX(rFBK2));
        o.v(this, -1914483487, goyd.mX(rFBK2));
        o.v(this, 1093815520, goyd.mX(rFBK2));
    }

    public String getName() {
        return (String)o.a(this, 1293962466);
    }

    public void setName(String string) {
        o.v(this, 1293962466, string);
    }

    public String getVersion() {
        return (String)o.a(this, -1914483487);
    }

    public void setVersion(String string) {
        o.v(this, -1914483487, string);
    }

    public String getAuthor() {
        return (String)o.a(this, 1093815520);
    }

    public void setAuthor(String string) {
        o.v(this, 1093815520, string);
    }

    private static Object mX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

