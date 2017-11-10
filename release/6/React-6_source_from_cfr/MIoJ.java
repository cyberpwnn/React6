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

public class MIoJ
extends Thread {
    private CommandSender sender;
    private int LWxB;
    private dMNe wDPq;

    public MIoJ(CommandSender commandSender) {
        this.sender = commandSender;
        this.LWxB = 0;
        this.setPriority(10);
        this.wDPq = new dMNe(100);
    }

    @Override
    public void run() {
        Object object = MIoJ.cQ();
        do {
            if (MIoJ.cQ() - object >= 10000) break;
            mXJp mXJp2 = new mXJp();
            MIoJ.cQ(mXJp2);
            for (int i = 0; i < 1000; ++i) {
                double d = (double)(i + 10000 - 401) + 3.141592653589793 + 147.15177646857694;
                Object object2 = MIoJ.cQ(d * 4.0 - 2.0);
                Object object3 = MIoJ.cQ(object2 + d - 4.0);
                double d2 = 3.141592653589793 / object3;
                double d3 = d * 2.718281828459045;
                reference var15_9 = MIoJ.cQ(d, object2) + MIoJ.cQ(d3 - d2);
                Object object4 = MIoJ.cQ(d + object2 - object3 + d2 - d3 + var15_9, 0.02521);
                Object object5 = MIoJ.cQ(d + object4 - object3 / d2 + var15_9 - d3, 0.116342);
                reference var21_12 = MIoJ.cQ(MIoJ.cQ(MIoJ.cQ(object5 - object4 + d + object2) + d2 + d3) - var15_9) + object4;
                Object object6 = MIoJ.cQ(MIoJ.cQ(d - var15_9 + var21_12) + d2 + MIoJ.cQ(object4 + 4.0));
                Object object7 = MIoJ.cQ(object6 + object4 - var21_12 + object6 / 4.0 * d2 + MIoJ.cQ(object3));
                Object object8 = MIoJ.cQ(object6, 3.0);
                MIoJ.cQ(object8 + object7 - object6 + var15_9 * d3);
            }
            MIoJ mIoJ = this;
            yy.E(mIoJ, 2055137780, (Integer)yy.h(mIoJ, 2055137780) + 1);
            MIoJ.cQ(mXJp2);
            MIoJ.cQ((dMNe)yy.h(this, -12391950), MIoJ.cQ(mXJp2));
        } while (true);
        new MIoJ$1(this);
    }

    static /* synthetic */ CommandSender mXJp(MIoJ mIoJ) {
        return (CommandSender)yy.h(mIoJ, 2070604285);
    }

    static /* synthetic */ int ksfs(MIoJ mIoJ) {
        return (Integer)yy.h(mIoJ, 2055137780);
    }

    static /* synthetic */ dMNe yJLL(MIoJ mIoJ) {
        return (dMNe)yy.h(mIoJ, -12391950);
    }

    private static Object cQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

