/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

@tLIK(value=0)
public class JtPF
extends onuL {
    public JtPF() {
        this.command = (String)yy.p(20907723);
        this.aliases = new String[]{(String)yy.p(819267276), (String)yy.p(68814529)};
        String[] arrstring = new String[1];
        arrstring[0] = JtPF.ZA((nSBH)((Object)yy.p(1531250457)));
        this.HUBV = arrstring;
        this.fKUx = (String)yy.p(-768866614);
        this.description = (String)yy.p(1698039487);
        this.owtH = (xFjc)((Object)yy.p(936183650));
    }

    @Override
    public void mXJp(CommandSender commandSender, String[] arrstring) {
        JtPF.ZA(commandSender, BkvY$LhxG.I("\u1c0e\ubeee\udf72\u1ff3\ua1fe\u9b00\ub725\u4e1d\u51e4\u505d\u262a\u1752\ufada\u1405\uc6d2\ue2bd\ufff7\u7bfa\u5a01\ub328\ucabb\uf499\u73a6\u534e\u6a36"));
        JtPF.ZA(new MIoJ(commandSender));
    }

    private static Object ZA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

