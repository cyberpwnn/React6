/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.configuration.file.YamlConfiguration
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class JbpD {
    private aKuV<String, VfRi<?>> McyH = new aKuV();

    public PBUD<String> QFCu() {
        return JbpD.SQ((aKuV)yy.h(this, -483202932));
    }

    public void SnBs(jhSC jhSC2) {
        Iterator iterator = JbpD.SQ(jhSC2).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            this.JRFt(string, JbpD.SQ(jhSC2, string));
        }
    }

    public jhSC BIwj() {
        jhSC jhSC2 = new jhSC();
        Object object = JbpD.SQ(this.QFCu());
        while (object.hasNext()) {
            String string = (String)object.next();
            JbpD.SQ(jhSC2, string, this.get(string));
        }
        return jhSC2;
    }

    public FileConfiguration VetS() {
        YamlConfiguration yamlConfiguration = new YamlConfiguration();
        Object object = JbpD.SQ(this.QFCu());
        while (object.hasNext()) {
            String string = (String)object.next();
            JbpD.SQ(yamlConfiguration, string, this.get(string));
        }
        return yamlConfiguration;
    }

    public void mXJp(FileConfiguration fileConfiguration) {
        Iterator iterator = JbpD.SQ(fileConfiguration, true).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            nSEv nSEv2 = null;
            if (JbpD.SQ(fileConfiguration, string) != false) {
                nSEv2 = new VTqA((Boolean)JbpD.SQ(JbpD.SQ(fileConfiguration, string)));
            } else if (JbpD.SQ(fileConfiguration, string) != false) {
                nSEv2 = new rorh((Double)JbpD.SQ(JbpD.SQ(fileConfiguration, string)));
            } else if (JbpD.SQ(fileConfiguration, string) != false) {
                nSEv2 = new ssVr((Integer)JbpD.SQ(JbpD.SQ(fileConfiguration, string)));
            } else if (JbpD.SQ(fileConfiguration, string) != false) {
                nSEv2 = new LrGi((String)JbpD.SQ(fileConfiguration, string));
            } else if (JbpD.SQ(fileConfiguration, string) != false) {
                nSEv2 = new tLGH((List<String>)JbpD.SQ(fileConfiguration, string));
            } else if (JbpD.SQ(fileConfiguration, string) != false) {
                nSEv2 = new AWsr((Long)JbpD.SQ(JbpD.SQ(fileConfiguration, string)));
            }
            if (nSEv2 == null) continue;
            JbpD.SQ((aKuV)yy.h(this, -483202932), string, nSEv2);
        }
    }

    public boolean contains(String string) {
        return (boolean)JbpD.SQ((aKuV)yy.h(this, -483202932), string);
    }

    public XSFr jhSC(String string) {
        return ((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).wncc();
    }

    public int getInt(String string) {
        return (int)JbpD.SQ((Integer)((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get());
    }

    public Object get(String string) {
        return ((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get();
    }

    public long getLong(String string) {
        if (((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get() instanceof Integer) {
            return (long)JbpD.SQ((Integer)((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get());
        }
        return (long)JbpD.SQ((Long)((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get());
    }

    public String getString(String string) {
        return JbpD.SQ(((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get());
    }

    public double getDouble(String string) {
        return (double)JbpD.SQ((Double)((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get());
    }

    public boolean getBoolean(String string) {
        return (boolean)JbpD.SQ((Boolean)((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get());
    }

    public List<String> getStringList(String string) {
        return (List)((VfRi)JbpD.SQ((aKuV)yy.h(this, -483202932), string)).get();
    }

    public void JRFt(String string, Object object) {
        if (object instanceof Integer) {
            this.SnBs(string, (int)JbpD.SQ((Integer)object));
            return;
        }
        if (object instanceof Boolean) {
            this.yJLL(string, (boolean)JbpD.SQ((Boolean)object));
            return;
        }
        if (object instanceof Double) {
            this.yJLL(string, (double)JbpD.SQ((Double)object));
            return;
        }
        if (object instanceof String) {
            this.set(string, (String)object);
            return;
        }
        if (object instanceof Long) {
            this.yJLL(string, (long)JbpD.SQ((Long)object));
            return;
        }
        if (object instanceof List) {
            this.mXJp(string, (List)object);
            return;
        }
        JbpD.SQ(JbpD.SQ(JbpD.SQ(new StringBuilder(BkvY$LhxG.I("\u6995\ua4d2\ue420\u7aae\ub103\ua846\u5b50\ua042\u7205\u5962\u4e35\u44d4\u53d3\u2f65\u226f\u38a5\u9cc7\u4ff2\u5037\u20a6\ube73\u03fa\u31d7\u1985\u79d3\uab7c\ue2a7\ub7d5")), JbpD.SQ(JbpD.SQ(object)))));
    }

    public void SnBs(String string, int n) {
        JbpD.SQ((aKuV)yy.h(this, -483202932), string, new ssVr((Integer)JbpD.SQ(n)));
    }

    public void yJLL(String string, boolean bl) {
        JbpD.SQ((aKuV)yy.h(this, -483202932), string, new VTqA((Boolean)JbpD.SQ(bl)));
    }

    public void yJLL(String string, double d) {
        JbpD.SQ((aKuV)yy.h(this, -483202932), string, new rorh((Double)JbpD.SQ(d)));
    }

    public void yJLL(String string, long l) {
        JbpD.SQ((aKuV)yy.h(this, -483202932), string, new AWsr((Long)JbpD.SQ(l)));
    }

    public void set(String string, String string2) {
        JbpD.SQ((aKuV)yy.h(this, -483202932), string, new LrGi(string2));
    }

    public void mXJp(String string, List<String> list) {
        JbpD.SQ((aKuV)yy.h(this, -483202932), string, new tLGH(list));
    }

    private static Object SQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

