/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.block.BlockBreakEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;

public class WFpH
extends jqQR {
    @Override
    public void start() {
        WFpH.kM(this);
    }

    @Override
    public void stop() {
        WFpH.kM(this);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void ssNb(BlockBreakEvent blockBreakEvent) {
        if (!((Boolean)cv.e(114168160)).booleanValue()) {
            return;
        }
        this.DYFV((Block)WFpH.kM(blockBreakEvent));
    }

    public void DYFV(Block block) {
        block5 : {
            block4 : {
                if (!((Boolean)cv.e(114168160)).booleanValue()) {
                    return;
                }
                if (WFpH.kM(block.getType(), (Material)cv.e(-679480637)) != false) break block4;
                if (WFpH.kM(block.getType(), (Material)cv.e(1236202178)) != false) break block4;
                if (WFpH.kM(block.getType(), (Material)cv.e(-355667263)) != false) break block4;
                if (WFpH.kM(block.getType(), (Material)cv.e(-1942359360)) == false) break block5;
            }
            ktOu ktOu2 = new ktOu();
            new WFpH$1(this, 5, 5, block.getLocation(), ktOu2);
        }
    }

    @Override
    public void tick() {
    }

    private static Object kM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

