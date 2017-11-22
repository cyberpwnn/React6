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

public class YoaF
implements byyi {
    @Override
    public QFEs IWSm(File file) {
        QFEs qFEs = new QFEs();
        try {
            YamlConfiguration yamlConfiguration = new YamlConfiguration();
            YoaF.VM(yamlConfiguration, file);
            YoaF.VM(qFEs, yamlConfiguration);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            YoaF.VM(exception);
        }
        return qFEs;
    }

    private static Object VM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

