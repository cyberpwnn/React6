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

public class OHMP
implements xrET {
    @Override
    public JbpD mXJp(File file) {
        JbpD jbpD = new JbpD();
        try {
            YamlConfiguration yamlConfiguration = new YamlConfiguration();
            OHMP.Fj(yamlConfiguration, file);
            OHMP.Fj(jbpD, yamlConfiguration);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            OHMP.Fj(exception);
        }
        return jbpD;
    }

    private static Object Fj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

