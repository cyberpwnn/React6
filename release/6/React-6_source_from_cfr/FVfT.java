/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.configuration.serialization.ConfigurationSerializable
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class FVfT
implements Cloneable,
Iterable<Block>,
ConfigurationSerializable {
    protected final String CElH;
    protected int lNAV;
    protected int cJtv;
    protected int XKVq;
    protected int AYWx;
    protected int BSjN;
    protected int iMGi;
    private static /* synthetic */ int[] afrc;
    private static /* synthetic */ int[] pYkk;

    public FVfT(Location location, Location location2) {
        if (FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)) == false) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u5473\u899c\u76f0\u0576\ue519\uf283\u22e2\ua81d\ubbb0\u998f\u7a97\u0b26\ub3cb\uf0b0\u18d2\uc1ae\u606c\u393a\ua255\u19cb\u593a\u73b5\ue23e\u108d\u6a99\uc96e\u46fa\u7435\u41f6\u1784\ub9c4\uf6aa\udbbf\uec0c\uda4b"));
        }
        this.CElH = FVfT.oJ(location).getName();
        this.lNAV = FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2));
        this.cJtv = FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2));
        this.XKVq = FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2));
        this.AYWx = FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2));
        this.BSjN = FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2));
        this.iMGi = FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2));
    }

    public int mXJp(AWvK aWvK) {
        switch (FVfT.pirH()[FVfT.oJ(aWvK)]) {
            case 1: {
                return (Integer)yy.h(this, -145225679) - (Integer)yy.h(this, 1087047738);
            }
            case 2: {
                return (Integer)yy.h(this, 1488455727) - (Integer)yy.h(this, 1269041200);
            }
            case 3: {
                return (Integer)yy.h(this, -671283195) - (Integer)yy.h(this, -1866659842);
            }
        }
        return -1;
    }

    public void yJLL(Location location, Location location2) {
        yy.E(this, 1087047738, (int)FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)));
        yy.E(this, 1269041200, (int)FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)));
        yy.E(this, -1866659842, (int)FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)));
        yy.E(this, -145225679, (int)FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)));
        yy.E(this, 1488455727, (int)FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)));
        yy.E(this, -671283195, (int)FVfT.oJ(FVfT.oJ(location), FVfT.oJ(location2)));
    }

    public boolean gghu() {
        if (FVfT.oJ(this.XSFr()) != false) {
            return false;
        }
        return true;
    }

    public PBUD<Player> XSFr() {
        return new PBUD<Player>((List<Player>)FVfT.oJ(new FVfT$1(this), this.yIxn()));
    }

    public PBUD<Entity> yIxn() {
        PBUD<Entity> pBUD = new PBUD<Entity>();
        try {
            for (Chunk chunk : this.DrfS()) {
                Entity[] arrentity = chunk.getEntities();
                int n = arrentity.length;
                int n2 = 0;
                while (n2 < n) {
                    Entity entity = arrentity[n2];
                    if (this.yIkI(entity.getLocation())) {
                        FVfT.oJ(pBUD, entity);
                    } else if (this.yIkI((Location)FVfT.oJ(entity.getLocation(), FVfT.oJ(FVfT.oJ(entity.getVelocity()), 0.87)))) {
                        FVfT.oJ(pBUD, entity);
                    } else if (this.yIkI((Location)FVfT.oJ(entity.getLocation(), FVfT.oJ(FVfT.oJ(entity.getVelocity()), 0.75)))) {
                        FVfT.oJ(pBUD, entity);
                    } else if (this.yIkI((Location)FVfT.oJ(entity.getLocation(), FVfT.oJ(FVfT.oJ(entity.getVelocity()), 0.5)))) {
                        FVfT.oJ(pBUD, entity);
                    } else if (this.yIkI((Location)FVfT.oJ(entity.getLocation(), FVfT.oJ(FVfT.oJ(entity.getVelocity()), 0.25)))) {
                        FVfT.oJ(pBUD, entity);
                    } else if (this.yIkI((Location)FVfT.oJ(entity.getLocation(), FVfT.oJ(FVfT.oJ(entity.getVelocity()), 0.15)))) {
                        FVfT.oJ(pBUD, entity);
                    } else if (this.yIkI((Location)FVfT.oJ(entity.getLocation(), FVfT.oJ(FVfT.oJ(entity.getVelocity()), 0.05)))) {
                        FVfT.oJ(pBUD, entity);
                    }
                    ++n2;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return pBUD;
    }

    public FVfT(Location location) {
        this(location, location);
    }

    public FVfT(FVfT fVfT) {
        this(fVfT.getWorld().getName(), (int)((Integer)yy.h(fVfT, 1087047738)), (int)((Integer)yy.h(fVfT, 1269041200)), (int)((Integer)yy.h(fVfT, -1866659842)), (int)((Integer)yy.h(fVfT, -145225679)), (int)((Integer)yy.h(fVfT, 1488455727)), (int)((Integer)yy.h(fVfT, -671283195)));
    }

    public FVfT(World world, int n, int n2, int n3, int n4, int n5, int n6) {
        this.CElH = world.getName();
        this.lNAV = FVfT.oJ(n, n4);
        this.AYWx = FVfT.oJ(n, n4);
        this.cJtv = FVfT.oJ(n2, n5);
        this.BSjN = FVfT.oJ(n2, n5);
        this.XKVq = FVfT.oJ(n3, n6);
        this.iMGi = FVfT.oJ(n3, n6);
    }

    private FVfT(String string, int n, int n2, int n3, int n4, int n5, int n6) {
        this.CElH = string;
        this.lNAV = FVfT.oJ(n, n4);
        this.AYWx = FVfT.oJ(n, n4);
        this.cJtv = FVfT.oJ(n2, n5);
        this.BSjN = FVfT.oJ(n2, n5);
        this.XKVq = FVfT.oJ(n3, n6);
        this.iMGi = FVfT.oJ(n3, n6);
    }

    public FVfT(Map<String, Object> map) {
        this.CElH = (String)map.get(BkvY$LhxG.I("\u2073\u57b8\uef78\ue337\u668d\u22bd\u0928\u6be0\ue922"));
        this.lNAV = FVfT.oJ((Integer)map.get(BkvY$LhxG.I("\u207c\u57e6")));
        this.AYWx = FVfT.oJ((Integer)map.get(BkvY$LhxG.I("\u207c\u57e5")));
        this.cJtv = FVfT.oJ((Integer)map.get(BkvY$LhxG.I("\u207d\u57e6")));
        this.BSjN = FVfT.oJ((Integer)map.get(BkvY$LhxG.I("\u207d\u57e5")));
        this.XKVq = FVfT.oJ((Integer)map.get(BkvY$LhxG.I("\u207e\u57e6")));
        this.iMGi = FVfT.oJ((Integer)map.get(BkvY$LhxG.I("\u207e\u57e5")));
    }

    public Map<String, Object> serialize() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(NVIs$JbpD.H("\u5e30\uda04\u0fea\u9f62\u1b58\ude47\u2b64\u8727\udb48"), (String)yy.h(this, -2060515271));
        hashMap.put(NVIs$JbpD.H("\u5e3f\uda5a"), FVfT.oJ((Integer)yy.h(this, 1087047738)));
        hashMap.put(NVIs$JbpD.H("\u5e3e\uda5a"), FVfT.oJ((Integer)yy.h(this, 1269041200)));
        hashMap.put(NVIs$JbpD.H("\u5e3d\uda5a"), FVfT.oJ((Integer)yy.h(this, -1866659842)));
        hashMap.put(NVIs$JbpD.H("\u5e3f\uda59"), FVfT.oJ((Integer)yy.h(this, -145225679)));
        hashMap.put(NVIs$JbpD.H("\u5e3e\uda59"), FVfT.oJ((Integer)yy.h(this, 1488455727)));
        hashMap.put(NVIs$JbpD.H("\u5e3d\uda59"), FVfT.oJ((Integer)yy.h(this, -671283195)));
        return hashMap;
    }

    public FVfT Lhol(int n) {
        return new FVfT(this.getWorld(), (int)((Integer)yy.h(this, 1087047738)), n, (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), n, (int)((Integer)yy.h(this, -671283195)));
    }

    public Location FVjY() {
        return new Location(this.getWorld(), (double)((Integer)yy.h(this, 1087047738)).intValue(), (double)((Integer)yy.h(this, 1269041200)).intValue(), (double)((Integer)yy.h(this, -1866659842)).intValue());
    }

    public Location EeJI() {
        return new Location(this.getWorld(), (double)((Integer)yy.h(this, -145225679)).intValue(), (double)((Integer)yy.h(this, 1488455727)).intValue(), (double)((Integer)yy.h(this, -671283195)).intValue());
    }

    public Location getCenter() {
        int n = this.ejSm() + 1;
        int n2 = this.owol() + 1;
        int n3 = this.eGpJ() + 1;
        return new Location(this.getWorld(), (double)this.APKn() + (double)(n - this.APKn()) / 2.0, (double)this.hQYl() + (double)(n2 - this.hQYl()) / 2.0, (double)this.XSKv() + (double)(n3 - this.XSKv()) / 2.0);
    }

    public World getWorld() {
        Object object = FVfT.oJ((String)yy.h(this, -2060515271));
        if (object == null) {
            throw new IllegalStateException((String)FVfT.oJ(FVfT.oJ(FVfT.oJ(new StringBuilder(BkvY$LhxG.I("\u4d1e\u324a\u3c61\u2a36\uc3f4\u1fe4\u395b")), (String)yy.h(this, -2060515271)), BkvY$LhxG.I("\u4d4e\u3205\u3c7a\u2a29\uc3b0\u1faa\u3913\ucf21\ud363\u973f\ue8e3\uae89\u5ea9\u4cec\u8e16"))));
        }
        return object;
    }

    public int UkeY() {
        return (Integer)yy.h(this, -145225679) - (Integer)yy.h(this, 1087047738) + 1;
    }

    public int XAia() {
        return (Integer)yy.h(this, 1488455727) - (Integer)yy.h(this, 1269041200) + 1;
    }

    public int wUTr() {
        return (Integer)yy.h(this, -671283195) - (Integer)yy.h(this, -1866659842) + 1;
    }

    public int APKn() {
        return (Integer)yy.h(this, 1087047738);
    }

    public int hQYl() {
        return (Integer)yy.h(this, 1269041200);
    }

    public int XSKv() {
        return (Integer)yy.h(this, -1866659842);
    }

    public int ejSm() {
        return (Integer)yy.h(this, -145225679);
    }

    public int owol() {
        return (Integer)yy.h(this, 1488455727);
    }

    public int eGpJ() {
        return (Integer)yy.h(this, -671283195);
    }

    public Block[] MRlW() {
        Block[] arrblock = new Block[8];
        World world = this.getWorld();
        arrblock[0] = world.getBlockAt(((Integer)yy.h(this, 1087047738)).intValue(), ((Integer)yy.h(this, 1269041200)).intValue(), ((Integer)yy.h(this, -1866659842)).intValue());
        arrblock[1] = world.getBlockAt(((Integer)yy.h(this, 1087047738)).intValue(), ((Integer)yy.h(this, 1269041200)).intValue(), ((Integer)yy.h(this, -671283195)).intValue());
        arrblock[2] = world.getBlockAt(((Integer)yy.h(this, 1087047738)).intValue(), ((Integer)yy.h(this, 1488455727)).intValue(), ((Integer)yy.h(this, -1866659842)).intValue());
        arrblock[3] = world.getBlockAt(((Integer)yy.h(this, 1087047738)).intValue(), ((Integer)yy.h(this, 1488455727)).intValue(), ((Integer)yy.h(this, -671283195)).intValue());
        arrblock[4] = world.getBlockAt(((Integer)yy.h(this, -145225679)).intValue(), ((Integer)yy.h(this, 1269041200)).intValue(), ((Integer)yy.h(this, -1866659842)).intValue());
        arrblock[5] = world.getBlockAt(((Integer)yy.h(this, -145225679)).intValue(), ((Integer)yy.h(this, 1269041200)).intValue(), ((Integer)yy.h(this, -671283195)).intValue());
        arrblock[6] = world.getBlockAt(((Integer)yy.h(this, -145225679)).intValue(), ((Integer)yy.h(this, 1488455727)).intValue(), ((Integer)yy.h(this, -1866659842)).intValue());
        arrblock[7] = world.getBlockAt(((Integer)yy.h(this, -145225679)).intValue(), ((Integer)yy.h(this, 1488455727)).intValue(), ((Integer)yy.h(this, -671283195)).intValue());
        return arrblock;
    }

    public FVfT mXJp(FVfT$mXJp fVfT$mXJp, int n) {
        switch (FVfT.GHjf()[FVfT.oJ(fVfT$mXJp)]) {
            case 4: {
                return new FVfT((String)yy.h(this, -2060515271), (Integer)yy.h(this, 1087047738) - n, (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 2: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (Integer)yy.h(this, -145225679) + n, (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 1: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (Integer)yy.h(this, -1866659842) - n, (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 3: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (Integer)yy.h(this, -671283195) + n);
            }
            case 6: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (Integer)yy.h(this, 1269041200) - n, (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 5: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (Integer)yy.h(this, 1488455727) + n, (int)((Integer)yy.h(this, -671283195)));
            }
        }
        throw new IllegalArgumentException((String)FVfT.oJ(FVfT.oJ(new StringBuilder(KDGY$JAHk.Y("\u816d\u3b27\ud4c0\ucb15\u9677\u9771\u1621\u3e50\ua7f0\u5dbf\u6846\u9666\u22a8\uf9d7\u9c36\uffa0\u164d\u9019")), fVfT$mXJp)));
    }

    public FVfT ksfs(FVfT$mXJp fVfT$mXJp, int n) {
        return this.mXJp(fVfT$mXJp, n).mXJp((FVfT$mXJp)((Object)FVfT.oJ(fVfT$mXJp)), - n);
    }

    public FVfT yJLL(FVfT$mXJp fVfT$mXJp, int n) {
        FVfT fVfT;
        switch (FVfT.GHjf()[FVfT.oJ(fVfT$mXJp)]) {
            case 7: {
                fVfT = this.mXJp((FVfT$mXJp)((Object)yy.p(-627768094)), n).mXJp((FVfT$mXJp)((Object)yy.p(552732696)), n).mXJp((FVfT$mXJp)((Object)yy.p(1948911639)), n).mXJp((FVfT$mXJp)((Object)yy.p(789120237)), n);
                break;
            }
            case 8: {
                fVfT = this.mXJp((FVfT$mXJp)((Object)yy.p(-1776352021)), n).mXJp((FVfT$mXJp)((Object)yy.p(1790248166)), n);
                break;
            }
            case 9: {
                fVfT = this.yJLL((FVfT$mXJp)((Object)yy.p(-827063060)), n).yJLL((FVfT$mXJp)((Object)yy.p(-1613888287)), n);
                break;
            }
            default: {
                throw new IllegalArgumentException((String)FVfT.oJ(FVfT.oJ(new StringBuilder(NVIs$JbpD.H("\u5300\u8366\u3b2c\u95a4\u6d50\ucc7a\ua2a3\u1c06\ud4b9\uaa2d\udfcf\ua879\u769a\u6ee9\ua78d\u477c\u62d3\u37a6")), fVfT$mXJp)));
            }
        }
        return fVfT;
    }

    public FVfT SnBs(FVfT$mXJp fVfT$mXJp, int n) {
        return this.yJLL(fVfT$mXJp, - n);
    }

    public boolean yJLL(int n, int n2, int n3) {
        if (n >= (Integer)yy.h(this, 1087047738) && n <= (Integer)yy.h(this, -145225679) && n2 >= (Integer)yy.h(this, 1269041200) && n2 <= (Integer)yy.h(this, 1488455727) && n3 >= (Integer)yy.h(this, -1866659842) && n3 <= (Integer)yy.h(this, -671283195)) {
            return true;
        }
        return false;
    }

    public boolean yJLL(Block block) {
        return this.yJLL(block.getX(), block.getY(), block.getZ());
    }

    public boolean yIkI(Location location) {
        if (FVfT.oJ((String)yy.h(this, -2060515271), FVfT.oJ(location).getName()) != false) {
            if (this.yJLL((int)FVfT.oJ(location), (int)FVfT.oJ(location), (int)FVfT.oJ(location))) {
                return true;
            }
        }
        return false;
    }

    public int gowt() {
        return this.UkeY() * this.XAia() * this.wUTr();
    }

    public byte TOQG() {
        long l = 0;
        int n = 0;
        for (Block block : this) {
            if (!block.isEmpty()) continue;
            l += (long)block.getLightLevel();
            ++n;
        }
        if (n > 0) {
            return (byte)(l / (long)n);
        }
        return 0;
    }

    public FVfT DPcO() {
        return this.mXJp((FVfT$mXJp)((Object)yy.p(-1776352021))).mXJp((FVfT$mXJp)((Object)yy.p(552732696))).mXJp((FVfT$mXJp)((Object)yy.p(1948911639))).mXJp((FVfT$mXJp)((Object)yy.p(1790248166))).mXJp((FVfT$mXJp)((Object)yy.p(-627768094))).mXJp((FVfT$mXJp)((Object)yy.p(789120237)));
    }

    public FVfT mXJp(FVfT$mXJp fVfT$mXJp) {
        FVfT fVfT = this.ksfs((FVfT$mXJp)((Object)FVfT.oJ(fVfT$mXJp)));
        switch (FVfT.GHjf()[FVfT.oJ(fVfT$mXJp)]) {
            case 6: {
                while (fVfT.ksfs((Material)yy.p(1934035000)) && fVfT.hQYl() > this.hQYl()) {
                    fVfT = fVfT.ksfs((FVfT$mXJp)((Object)yy.p(-1776352021)), 1);
                }
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), fVfT.owol(), (int)((Integer)yy.h(this, -671283195)));
            }
            case 5: {
                while (fVfT.ksfs((Material)yy.p(1934035000)) && fVfT.owol() < this.owol()) {
                    fVfT = fVfT.ksfs((FVfT$mXJp)((Object)yy.p(1790248166)), 1);
                }
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), fVfT.hQYl(), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 1: {
                while (fVfT.ksfs((Material)yy.p(1934035000)) && fVfT.APKn() > this.APKn()) {
                    fVfT = fVfT.ksfs((FVfT$mXJp)((Object)yy.p(-627768094)), 1);
                }
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), fVfT.ejSm(), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 3: {
                while (fVfT.ksfs((Material)yy.p(1934035000)) && fVfT.ejSm() < this.ejSm()) {
                    fVfT = fVfT.ksfs((FVfT$mXJp)((Object)yy.p(552732696)), 1);
                }
                return new FVfT((String)yy.h(this, -2060515271), fVfT.APKn(), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 2: {
                while (fVfT.ksfs((Material)yy.p(1934035000)) && fVfT.XSKv() > this.XSKv()) {
                    fVfT = fVfT.ksfs((FVfT$mXJp)((Object)yy.p(1948911639)), 1);
                }
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), fVfT.eGpJ());
            }
            case 4: {
                while (fVfT.ksfs((Material)yy.p(1934035000)) && fVfT.eGpJ() < this.eGpJ()) {
                    fVfT = fVfT.ksfs((FVfT$mXJp)((Object)yy.p(789120237)), 1);
                }
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), fVfT.XSKv(), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
        }
        throw new IllegalArgumentException((String)FVfT.oJ(FVfT.oJ(new StringBuilder(BkvY$LhxG.I("\u45f2\ua4ba\u6007\ue562\u5fc8\u0e5f\u67ca\u5f4b\u8bd3\ub03b\u17bf\uacba\u7b6b\u14b6\u182c\ua1b6\u0d94\ua921")), fVfT$mXJp)));
    }

    public FVfT ksfs(FVfT$mXJp fVfT$mXJp) {
        switch (FVfT.GHjf()[FVfT.oJ(fVfT$mXJp)]) {
            case 6: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 5: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 1: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -1866659842)));
            }
            case 3: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -671283195)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 2: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, -145225679)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
            case 4: {
                return new FVfT((String)yy.h(this, -2060515271), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1269041200)), (int)((Integer)yy.h(this, -1866659842)), (int)((Integer)yy.h(this, 1087047738)), (int)((Integer)yy.h(this, 1488455727)), (int)((Integer)yy.h(this, -671283195)));
            }
        }
        throw new IllegalArgumentException((String)FVfT.oJ(FVfT.oJ(new StringBuilder(KDGY$JAHk.Y("\u966c\u4b40\u78c8\ue4a9\uc10c\u377f\uf24c\u46bb\ub18b\uece1\u9f9e\u1b7e\u2260\ufe97\ua32a\u037c\u2299\ufaf9")), fVfT$mXJp)));
    }

    public boolean ksfs(Material material) {
        for (Block block : this) {
            if (block.getType() == material) continue;
            return false;
        }
        return true;
    }

    public FVfT mXJp(FVfT fVfT) {
        if (fVfT == null) {
            return this;
        }
        Object object = FVfT.oJ(this.APKn(), fVfT.APKn());
        Object object2 = FVfT.oJ(this.hQYl(), fVfT.hQYl());
        Object object3 = FVfT.oJ(this.XSKv(), fVfT.XSKv());
        Object object4 = FVfT.oJ(this.ejSm(), fVfT.ejSm());
        Object object5 = FVfT.oJ(this.owol(), fVfT.owol());
        Object object6 = FVfT.oJ(this.eGpJ(), fVfT.eGpJ());
        return new FVfT((String)yy.h(this, -2060515271), (int)object, (int)object2, (int)object3, (int)object4, (int)object5, (int)object6);
    }

    public Block SnBs(int n, int n2, int n3) {
        return this.getWorld().getBlockAt((Integer)yy.h(this, 1087047738) + n, (Integer)yy.h(this, 1269041200) + n2, (Integer)yy.h(this, -1866659842) + n3);
    }

    public Block mXJp(World world, int n, int n2, int n3) {
        return world.getBlockAt((Integer)yy.h(this, 1087047738) + n, (Integer)yy.h(this, 1269041200) + n2, (Integer)yy.h(this, -1866659842) + n3);
    }

    public List<Chunk> DrfS() {
        ArrayList<Chunk> arrayList = new ArrayList<Chunk>();
        World world = this.getWorld();
        int n = this.APKn() & -16;
        int n2 = this.ejSm() & -16;
        int n3 = this.XSKv() & -16;
        int n4 = this.eGpJ() & -16;
        int n5 = n;
        while (n5 <= n2) {
            int n6 = n3;
            while (n6 <= n4) {
                arrayList.add(world.getChunkAt(n5 >> 4, n6 >> 4));
                n6 += 16;
            }
            n5 += 16;
        }
        return arrayList;
    }

    @Deprecated
    public void mXJp(int n, byte by) {
        for (Block block : this) {
            block.setTypeIdAndData(n, by, false);
        }
    }

    @Override
    public Iterator<Block> iterator() {
        return new FVfT$ksfs(this, this.getWorld(), (Integer)yy.h(this, 1087047738), (Integer)yy.h(this, 1269041200), (Integer)yy.h(this, -1866659842), (Integer)yy.h(this, -145225679), (Integer)yy.h(this, 1488455727), (Integer)yy.h(this, -671283195));
    }

    public FVfT dDmB() throws CloneNotSupportedException {
        return new FVfT(this);
    }

    public String toString() {
        return FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(FVfT.oJ(new StringBuilder(NVIs$JbpD.H("\uc76a\u514c\u5da9\ua49f\u6e35\ud0fe\ub045\ud8ec")), (String)yy.h(this, -2060515271)), NVIs$JbpD.H("\uc705")), (Integer)yy.h(this, 1087047738)), NVIs$JbpD.H("\uc705")), (Integer)yy.h(this, 1269041200)), NVIs$JbpD.H("\uc705")), (Integer)yy.h(this, -1866659842)), NVIs$JbpD.H("\uc714\u5107")), (Integer)yy.h(this, -145225679)), NVIs$JbpD.H("\uc705")), (Integer)yy.h(this, 1488455727)), NVIs$JbpD.H("\uc705")), (Integer)yy.h(this, -671283195)));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((String)yy.h(this, -2060515271) == null ? 0 : (Object)FVfT.oJ((String)yy.h(this, -2060515271)));
        n2 = n2 * 31 + (Integer)yy.h(this, 1087047738);
        n2 = n2 * 31 + (Integer)yy.h(this, -145225679);
        n2 = n2 * 31 + (Integer)yy.h(this, 1269041200);
        n2 = n2 * 31 + (Integer)yy.h(this, 1488455727);
        n2 = n2 * 31 + (Integer)yy.h(this, -1866659842);
        n2 = n2 * 31 + (Integer)yy.h(this, -671283195);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (FVfT.oJ(this) != FVfT.oJ(object)) {
            return false;
        }
        FVfT fVfT = (FVfT)object;
        if ((String)yy.h(this, -2060515271) == null) {
            if ((String)yy.h(fVfT, -2060515271) != null) {
                return false;
            }
        } else if (FVfT.oJ((String)yy.h(this, -2060515271), (String)yy.h(fVfT, -2060515271)) == false) {
            return false;
        }
        if (((Integer)yy.h(this, 1087047738)).intValue() != ((Integer)yy.h(fVfT, 1087047738)).intValue()) {
            return false;
        }
        if (((Integer)yy.h(this, -145225679)).intValue() != ((Integer)yy.h(fVfT, -145225679)).intValue()) {
            return false;
        }
        if (((Integer)yy.h(this, 1269041200)).intValue() != ((Integer)yy.h(fVfT, 1269041200)).intValue()) {
            return false;
        }
        if (((Integer)yy.h(this, 1488455727)).intValue() != ((Integer)yy.h(fVfT, 1488455727)).intValue()) {
            return false;
        }
        if (((Integer)yy.h(this, -1866659842)).intValue() != ((Integer)yy.h(fVfT, -1866659842)).intValue()) {
            return false;
        }
        if (((Integer)yy.h(this, -671283195)).intValue() != ((Integer)yy.h(fVfT, -671283195)).intValue()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.dDmB();
    }

    static /* synthetic */ int[] pirH() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(537331725);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((AWvK[])FVfT.oJ()).length];
        try {
            arrn[FVfT.oJ((AWvK)yy.p((int)-1284373536))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((AWvK)yy.p((int)-1811152075))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((AWvK)yy.p((int)-719125714))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(537331725, arrn3);
        return arrn3;
    }

    static /* synthetic */ int[] GHjf() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(-1140193269);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((FVfT$mXJp[])FVfT.oJ()).length];
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)-627374870))] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)-1776352021))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)1948911639))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)-827063060))] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)-627768094))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)552732696))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)-1886714657))] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)1790248166))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)-1613888287))] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FVfT.oJ((FVfT$mXJp)yy.p((int)789120237))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(-1140193269, arrn3);
        return arrn3;
    }

    private static Object oJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

