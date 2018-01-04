/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.YamlConfiguration
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.configuration.file.YamlConfiguration;

public class owua
implements XRnR {
    @Override
    public Mtpq biLo(File file) {
        Mtpq mtpq = new Mtpq();
        try {
            YamlConfiguration yamlConfiguration = new YamlConfiguration();
            owua.nM(yamlConfiguration, file);
            owua.nM(mtpq, yamlConfiguration);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            owua.nM(exception);
        }
        return mtpq;
    }

    private static Object nM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

