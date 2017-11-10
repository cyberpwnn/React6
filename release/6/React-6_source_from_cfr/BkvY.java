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
public class BkvY
extends onuL {
    public BkvY() {
        this.command = (String)yy.p(-2016548636);
        this.aliases = new String[]{(String)yy.p(1493429273), (String)yy.p(1114761442)};
        String[] arrstring = new String[2];
        arrstring[0] = BkvY.lJ((nSBH)((Object)yy.p(1531250457)));
        arrstring[1] = BkvY.lJ((nSBH)((Object)yy.p(-271579341)));
        this.HUBV = arrstring;
        this.fKUx = (String)yy.p(500821015);
        this.description = (String)yy.p(-739513320);
        this.owtH = (xFjc)((Object)yy.p(936183650));
    }

    @Override
    public void mXJp(CommandSender commandSender, String[] arrstring) {
        BkvY.lJ(commandSender, BkvY.lJ(BkvY.lJ(BkvY.lJ(new StringBuilder(BkvY$LhxG.I("\ubde2\u36a0\u54ef\u971c\u0794\u4447")), BkvY.lJ(BkvY.lJ(BkvY.lJ(BkvY.lJ())))), BkvY$LhxG.I("\ubd90\u3697\u54eb\u9713\u078f\u4406\u1992\ub474\uafb8"))));
        BkvY.lJ();
    }

    private static Object lJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

