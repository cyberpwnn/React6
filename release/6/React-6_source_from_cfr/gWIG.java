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

public class gWIG
implements Cloneable,
Iterable<Block>,
ConfigurationSerializable {
    protected final String NODf;
    protected int yCMw;
    protected int WsPy;
    protected int JmKw;
    protected int VMiy;
    protected int pRFH;
    protected int vcvn;
    private static /* synthetic */ int[] mrno;
    private static /* synthetic */ int[] EKyi;

    public gWIG(Location location, Location location2) {
        if (gWIG.hK(gWIG.hK(location), gWIG.hK(location2)) == false) {
            throw new IllegalArgumentException(rgig$AWxc.r("\uc9b2\u893d\ufcc3\u4c0d\u0e8a\u6271\u852b\u3dc4\u4584\u3586\u8b62\ue959\uebe0\u1986\u2307\u6b3b\u4f4d\u169a\u9759\u3a29\uc099\u4dd8\u19c2\uf41b\ue532\u7aeb\ua983\u50d6\ud6d5\u56d3\u6d7f\u7e40\u3b6b\uea2c\ud01c"));
        }
        this.NODf = gWIG.hK(location).getName();
        this.yCMw = gWIG.hK(gWIG.hK(location), gWIG.hK(location2));
        this.WsPy = gWIG.hK(gWIG.hK(location), gWIG.hK(location2));
        this.JmKw = gWIG.hK(gWIG.hK(location), gWIG.hK(location2));
        this.VMiy = gWIG.hK(gWIG.hK(location), gWIG.hK(location2));
        this.pRFH = gWIG.hK(gWIG.hK(location), gWIG.hK(location2));
        this.vcvn = gWIG.hK(gWIG.hK(location), gWIG.hK(location2));
    }

    public int ssNb(mrKm mrKm2) {
        switch (gWIG.ydSf()[gWIG.hK(mrKm2)]) {
            case 1: {
                return (Integer)cv.b(this, 1977873916) - (Integer)cv.b(this, 915404287);
            }
            case 2: {
                return (Integer)cv.b(this, -2090404354) - (Integer)cv.b(this, 104855033);
            }
            case 3: {
                return (Integer)cv.b(this, 731444920) - (Integer)cv.b(this, -1821116741);
            }
        }
        return -1;
    }

    public void IWSm(Location location, Location location2) {
        cv.e(this, 915404287, (int)gWIG.hK(gWIG.hK(location), gWIG.hK(location2)));
        cv.e(this, 104855033, (int)gWIG.hK(gWIG.hK(location), gWIG.hK(location2)));
        cv.e(this, -1821116741, (int)gWIG.hK(gWIG.hK(location), gWIG.hK(location2)));
        cv.e(this, 1977873916, (int)gWIG.hK(gWIG.hK(location), gWIG.hK(location2)));
        cv.e(this, -2090404354, (int)gWIG.hK(gWIG.hK(location), gWIG.hK(location2)));
        cv.e(this, 731444920, (int)gWIG.hK(gWIG.hK(location), gWIG.hK(location2)));
    }

    public boolean FFKt() {
        if (gWIG.hK(this.kQhu()) != false) {
            return false;
        }
        return true;
    }

    public wfPa<Player> kQhu() {
        return new wfPa<Player>((List<Player>)gWIG.hK(new gWIG$1(this), this.ObHd()));
    }

    public wfPa<Entity> ObHd() {
        wfPa<Entity> wfPa2 = new wfPa<Entity>();
        try {
            for (Chunk chunk : this.vlLH()) {
                Entity[] arrentity = chunk.getEntities();
                int n = arrentity.length;
                int n2 = 0;
                while (n2 < n) {
                    Entity entity = arrentity[n2];
                    if (this.nJLQ(entity.getLocation())) {
                        gWIG.hK(wfPa2, entity);
                    } else if (this.nJLQ((Location)gWIG.hK(entity.getLocation(), gWIG.hK(gWIG.hK(entity.getVelocity()), 0.87)))) {
                        gWIG.hK(wfPa2, entity);
                    } else if (this.nJLQ((Location)gWIG.hK(entity.getLocation(), gWIG.hK(gWIG.hK(entity.getVelocity()), 0.75)))) {
                        gWIG.hK(wfPa2, entity);
                    } else if (this.nJLQ((Location)gWIG.hK(entity.getLocation(), gWIG.hK(gWIG.hK(entity.getVelocity()), 0.5)))) {
                        gWIG.hK(wfPa2, entity);
                    } else if (this.nJLQ((Location)gWIG.hK(entity.getLocation(), gWIG.hK(gWIG.hK(entity.getVelocity()), 0.25)))) {
                        gWIG.hK(wfPa2, entity);
                    } else if (this.nJLQ((Location)gWIG.hK(entity.getLocation(), gWIG.hK(gWIG.hK(entity.getVelocity()), 0.15)))) {
                        gWIG.hK(wfPa2, entity);
                    } else if (this.nJLQ((Location)gWIG.hK(entity.getLocation(), gWIG.hK(gWIG.hK(entity.getVelocity()), 0.05)))) {
                        gWIG.hK(wfPa2, entity);
                    }
                    ++n2;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return wfPa2;
    }

    public gWIG(Location location) {
        this(location, location);
    }

    public gWIG(gWIG gWIG2) {
        this(gWIG2.getWorld().getName(), (int)((Integer)cv.b(gWIG2, 915404287)), (int)((Integer)cv.b(gWIG2, 104855033)), (int)((Integer)cv.b(gWIG2, -1821116741)), (int)((Integer)cv.b(gWIG2, 1977873916)), (int)((Integer)cv.b(gWIG2, -2090404354)), (int)((Integer)cv.b(gWIG2, 731444920)));
    }

    public gWIG(World world, int n, int n2, int n3, int n4, int n5, int n6) {
        this.NODf = world.getName();
        this.yCMw = gWIG.hK(n, n4);
        this.VMiy = gWIG.hK(n, n4);
        this.WsPy = gWIG.hK(n2, n5);
        this.pRFH = gWIG.hK(n2, n5);
        this.JmKw = gWIG.hK(n3, n6);
        this.vcvn = gWIG.hK(n3, n6);
    }

    private gWIG(String string, int n, int n2, int n3, int n4, int n5, int n6) {
        this.NODf = string;
        this.yCMw = gWIG.hK(n, n4);
        this.VMiy = gWIG.hK(n, n4);
        this.WsPy = gWIG.hK(n2, n5);
        this.pRFH = gWIG.hK(n2, n5);
        this.JmKw = gWIG.hK(n3, n6);
        this.vcvn = gWIG.hK(n3, n6);
    }

    public gWIG(Map<String, Object> map) {
        this.NODf = (String)map.get(rgig$AWxc.r("\uc9a9\u893d\ufcd2\u4c00\u0e9a\u6256\u8525\u3dc7\u4592"));
        this.yCMw = gWIG.hK((Integer)map.get(rgig$AWxc.r("\uc9a6\u8963")));
        this.VMiy = gWIG.hK((Integer)map.get(rgig$AWxc.r("\uc9a6\u8960")));
        this.WsPy = gWIG.hK((Integer)map.get(rgig$AWxc.r("\uc9a7\u8963")));
        this.pRFH = gWIG.hK((Integer)map.get(rgig$AWxc.r("\uc9a7\u8960")));
        this.JmKw = gWIG.hK((Integer)map.get(rgig$AWxc.r("\uc9a4\u8963")));
        this.vcvn = gWIG.hK((Integer)map.get(rgig$AWxc.r("\uc9a4\u8960")));
    }

    public Map<String, Object> serialize() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(YEBy$TyVf.W("\u951b\uedb0\ue857\uee3a\u52d7\ub244\u91d2\u1ee7\u554f"), (String)cv.b(this, 1412691620));
        hashMap.put(YEBy$TyVf.W("\u9514\uedee"), gWIG.hK((Integer)cv.b(this, 915404287)));
        hashMap.put(YEBy$TyVf.W("\u9515\uedee"), gWIG.hK((Integer)cv.b(this, 104855033)));
        hashMap.put(YEBy$TyVf.W("\u9516\uedee"), gWIG.hK((Integer)cv.b(this, -1821116741)));
        hashMap.put(YEBy$TyVf.W("\u9514\ueded"), gWIG.hK((Integer)cv.b(this, 1977873916)));
        hashMap.put(YEBy$TyVf.W("\u9515\ueded"), gWIG.hK((Integer)cv.b(this, -2090404354)));
        hashMap.put(YEBy$TyVf.W("\u9516\ueded"), gWIG.hK((Integer)cv.b(this, 731444920)));
        return hashMap;
    }

    public gWIG KCiG(int n) {
        return new gWIG(this.getWorld(), (int)((Integer)cv.b(this, 915404287)), n, (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), n, (int)((Integer)cv.b(this, 731444920)));
    }

    public Location RsbV() {
        return new Location(this.getWorld(), (double)((Integer)cv.b(this, 915404287)).intValue(), (double)((Integer)cv.b(this, 104855033)).intValue(), (double)((Integer)cv.b(this, -1821116741)).intValue());
    }

    public Location hHko() {
        return new Location(this.getWorld(), (double)((Integer)cv.b(this, 1977873916)).intValue(), (double)((Integer)cv.b(this, -2090404354)).intValue(), (double)((Integer)cv.b(this, 731444920)).intValue());
    }

    public Location getCenter() {
        int n = this.qlxe() + 1;
        int n2 = this.OjYY() + 1;
        int n3 = this.URWs() + 1;
        return new Location(this.getWorld(), (double)this.UlKG() + (double)(n - this.UlKG()) / 2.0, (double)this.tnSF() + (double)(n2 - this.tnSF()) / 2.0, (double)this.SfEN() + (double)(n3 - this.SfEN()) / 2.0);
    }

    public World getWorld() {
        Object object = gWIG.hK((String)cv.b(this, 1412691620));
        if (object == null) {
            throw new IllegalStateException((String)gWIG.hK(gWIG.hK(gWIG.hK(new StringBuilder(KUXS$dwji.S("\u5088\ufcdb\ubbc7\u3ca2\u5276\u2765\ud942")), (String)cv.b(this, 1412691620)), KUXS$dwji.S("\u50d8\ufc94\ubbdc\u3cbd\u5232\u272b\ud90a\uc37a\ud065\u3a73\u1658\u3911\u7588\u91af\ub49a"))));
        }
        return object;
    }

    public int JRXe() {
        return (Integer)cv.b(this, 1977873916) - (Integer)cv.b(this, 915404287) + 1;
    }

    public int kcXK() {
        return (Integer)cv.b(this, -2090404354) - (Integer)cv.b(this, 104855033) + 1;
    }

    public int Eult() {
        return (Integer)cv.b(this, 731444920) - (Integer)cv.b(this, -1821116741) + 1;
    }

    public int UlKG() {
        return (Integer)cv.b(this, 915404287);
    }

    public int tnSF() {
        return (Integer)cv.b(this, 104855033);
    }

    public int SfEN() {
        return (Integer)cv.b(this, -1821116741);
    }

    public int qlxe() {
        return (Integer)cv.b(this, 1977873916);
    }

    public int OjYY() {
        return (Integer)cv.b(this, -2090404354);
    }

    public int URWs() {
        return (Integer)cv.b(this, 731444920);
    }

    public Block[] oxTu() {
        Block[] arrblock = new Block[8];
        World world = this.getWorld();
        arrblock[0] = world.getBlockAt(((Integer)cv.b(this, 915404287)).intValue(), ((Integer)cv.b(this, 104855033)).intValue(), ((Integer)cv.b(this, -1821116741)).intValue());
        arrblock[1] = world.getBlockAt(((Integer)cv.b(this, 915404287)).intValue(), ((Integer)cv.b(this, 104855033)).intValue(), ((Integer)cv.b(this, 731444920)).intValue());
        arrblock[2] = world.getBlockAt(((Integer)cv.b(this, 915404287)).intValue(), ((Integer)cv.b(this, -2090404354)).intValue(), ((Integer)cv.b(this, -1821116741)).intValue());
        arrblock[3] = world.getBlockAt(((Integer)cv.b(this, 915404287)).intValue(), ((Integer)cv.b(this, -2090404354)).intValue(), ((Integer)cv.b(this, 731444920)).intValue());
        arrblock[4] = world.getBlockAt(((Integer)cv.b(this, 1977873916)).intValue(), ((Integer)cv.b(this, 104855033)).intValue(), ((Integer)cv.b(this, -1821116741)).intValue());
        arrblock[5] = world.getBlockAt(((Integer)cv.b(this, 1977873916)).intValue(), ((Integer)cv.b(this, 104855033)).intValue(), ((Integer)cv.b(this, 731444920)).intValue());
        arrblock[6] = world.getBlockAt(((Integer)cv.b(this, 1977873916)).intValue(), ((Integer)cv.b(this, -2090404354)).intValue(), ((Integer)cv.b(this, -1821116741)).intValue());
        arrblock[7] = world.getBlockAt(((Integer)cv.b(this, 1977873916)).intValue(), ((Integer)cv.b(this, -2090404354)).intValue(), ((Integer)cv.b(this, 731444920)).intValue());
        return arrblock;
    }

    public gWIG ssNb(gWIG$ssNb gWIG$ssNb, int n) {
        switch (gWIG.cSRj()[gWIG.hK(gWIG$ssNb)]) {
            case 4: {
                return new gWIG((String)cv.b(this, 1412691620), (Integer)cv.b(this, 915404287) - n, (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 2: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (Integer)cv.b(this, 1977873916) + n, (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 1: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (Integer)cv.b(this, -1821116741) - n, (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 3: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (Integer)cv.b(this, 731444920) + n);
            }
            case 6: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (Integer)cv.b(this, 104855033) - n, (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 5: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (Integer)cv.b(this, -2090404354) + n, (int)((Integer)cv.b(this, 731444920)));
            }
        }
        throw new IllegalArgumentException((String)gWIG.hK(gWIG.hK(new StringBuilder(KUXS$dwji.S("\u0594\ub7c6\u5ffa\ue8d6\u0eac\u7841\u05a2\u0b2c\u995a\u6e49\ub566\ua6ed\u02ae\ue089\u0b09\u3143\u899b\ucb81")), gWIG$ssNb)));
    }

    public gWIG DYFV(gWIG$ssNb gWIG$ssNb, int n) {
        return this.ssNb(gWIG$ssNb, n).ssNb((gWIG$ssNb)((Object)gWIG.hK(gWIG$ssNb)), - n);
    }

    public gWIG IWSm(gWIG$ssNb gWIG$ssNb, int n) {
        gWIG gWIG2;
        switch (gWIG.cSRj()[gWIG.hK(gWIG$ssNb)]) {
            case 7: {
                gWIG2 = this.ssNb((gWIG$ssNb)((Object)cv.e(-1984433145)), n).ssNb((gWIG$ssNb)((Object)cv.e(-285543423)), n).ssNb((gWIG$ssNb)((Object)cv.e(1237775366)), n).ssNb((gWIG$ssNb)((Object)cv.e(-1350634496)), n);
                break;
            }
            case 8: {
                gWIG2 = this.ssNb((gWIG$ssNb)((Object)cv.e(-714542078)), n).ssNb((gWIG$ssNb)((Object)cv.e(196670467)), n);
                break;
            }
            case 9: {
                gWIG2 = this.IWSm((gWIG$ssNb)((Object)cv.e(-1717963763)), n).IWSm((gWIG$ssNb)((Object)cv.e(159380492)), n);
                break;
            }
            default: {
                throw new IllegalArgumentException((String)gWIG.hK(gWIG.hK(new StringBuilder(YEBy$TyVf.W("\u1044\u6f9b\ud879\ubf44\ua16d\u73cf\u7301\u534a\ue5a1\udf7f\uabe7\uef00\ud055\ud8b9\uf1d3\ufdd6\u164d\uddda")), gWIG$ssNb)));
            }
        }
        return gWIG2;
    }

    public gWIG OXeK(gWIG$ssNb gWIG$ssNb, int n) {
        return this.IWSm(gWIG$ssNb, - n);
    }

    public boolean OXeK(int n, int n2, int n3) {
        if (n >= (Integer)cv.b(this, 915404287) && n <= (Integer)cv.b(this, 1977873916) && n2 >= (Integer)cv.b(this, 104855033) && n2 <= (Integer)cv.b(this, -2090404354) && n3 >= (Integer)cv.b(this, -1821116741) && n3 <= (Integer)cv.b(this, 731444920)) {
            return true;
        }
        return false;
    }

    public boolean YoSa(Block block) {
        return this.OXeK(block.getX(), block.getY(), block.getZ());
    }

    public boolean nJLQ(Location location) {
        if (gWIG.hK((String)cv.b(this, 1412691620), gWIG.hK(location).getName()) != false) {
            if (this.OXeK((int)gWIG.hK(location), (int)gWIG.hK(location), (int)gWIG.hK(location))) {
                return true;
            }
        }
        return false;
    }

    public int xOnL() {
        return this.JRXe() * this.kcXK() * this.Eult();
    }

    public byte SCcW() {
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

    public gWIG VoQC() {
        return this.ssNb((gWIG$ssNb)((Object)cv.e(-714542078))).ssNb((gWIG$ssNb)((Object)cv.e(-285543423))).ssNb((gWIG$ssNb)((Object)cv.e(1237775366))).ssNb((gWIG$ssNb)((Object)cv.e(196670467))).ssNb((gWIG$ssNb)((Object)cv.e(-1984433145))).ssNb((gWIG$ssNb)((Object)cv.e(-1350634496)));
    }

    public gWIG ssNb(gWIG$ssNb gWIG$ssNb) {
        gWIG gWIG2 = this.DYFV((gWIG$ssNb)((Object)gWIG.hK(gWIG$ssNb)));
        switch (gWIG.cSRj()[gWIG.hK(gWIG$ssNb)]) {
            case 6: {
                while (gWIG2.DYFV((Material)cv.e(-493219437)) && gWIG2.tnSF() > this.tnSF()) {
                    gWIG2 = gWIG2.DYFV((gWIG$ssNb)((Object)cv.e(-714542078)), 1);
                }
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), gWIG2.OjYY(), (int)((Integer)cv.b(this, 731444920)));
            }
            case 5: {
                while (gWIG2.DYFV((Material)cv.e(-493219437)) && gWIG2.OjYY() < this.OjYY()) {
                    gWIG2 = gWIG2.DYFV((gWIG$ssNb)((Object)cv.e(196670467)), 1);
                }
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), gWIG2.tnSF(), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 1: {
                while (gWIG2.DYFV((Material)cv.e(-493219437)) && gWIG2.UlKG() > this.UlKG()) {
                    gWIG2 = gWIG2.DYFV((gWIG$ssNb)((Object)cv.e(-1984433145)), 1);
                }
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), gWIG2.qlxe(), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 3: {
                while (gWIG2.DYFV((Material)cv.e(-493219437)) && gWIG2.qlxe() < this.qlxe()) {
                    gWIG2 = gWIG2.DYFV((gWIG$ssNb)((Object)cv.e(-285543423)), 1);
                }
                return new gWIG((String)cv.b(this, 1412691620), gWIG2.UlKG(), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 2: {
                while (gWIG2.DYFV((Material)cv.e(-493219437)) && gWIG2.SfEN() > this.SfEN()) {
                    gWIG2 = gWIG2.DYFV((gWIG$ssNb)((Object)cv.e(1237775366)), 1);
                }
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), gWIG2.URWs());
            }
            case 4: {
                while (gWIG2.DYFV((Material)cv.e(-493219437)) && gWIG2.URWs() < this.URWs()) {
                    gWIG2 = gWIG2.DYFV((gWIG$ssNb)((Object)cv.e(-1350634496)), 1);
                }
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), gWIG2.SfEN(), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
        }
        throw new IllegalArgumentException((String)gWIG.hK(gWIG.hK(new StringBuilder(KUXS$dwji.S("\u05b4\ub7c6\u5ffa\ue8d6\u0eac\u7841\u05a2\u0b2c\u995a\u6e49\ub566\ua6ed\u02ae\ue089\u0b09\u3143\u899b\ucb81")), gWIG$ssNb)));
    }

    public gWIG DYFV(gWIG$ssNb gWIG$ssNb) {
        switch (gWIG.cSRj()[gWIG.hK(gWIG$ssNb)]) {
            case 6: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 5: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 1: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, -1821116741)));
            }
            case 3: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, 731444920)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 2: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 1977873916)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
            case 4: {
                return new gWIG((String)cv.b(this, 1412691620), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, 104855033)), (int)((Integer)cv.b(this, -1821116741)), (int)((Integer)cv.b(this, 915404287)), (int)((Integer)cv.b(this, -2090404354)), (int)((Integer)cv.b(this, 731444920)));
            }
        }
        throw new IllegalArgumentException((String)gWIG.hK(gWIG.hK(new StringBuilder(KUXS$dwji.S("\u1316\u30fd\uc25e\udd83\ua775\u7982\u17f5\ue51a\ue2f0\ue94a\u8002\u54dc\u0f4f\u7333\ua24a\u2f1d\uba0b\u4559")), gWIG$ssNb)));
    }

    public boolean DYFV(Material material) {
        for (Block block : this) {
            if (block.getType() == material) continue;
            return false;
        }
        return true;
    }

    public gWIG ssNb(gWIG gWIG2) {
        if (gWIG2 == null) {
            return this;
        }
        Object object = gWIG.hK(this.UlKG(), gWIG2.UlKG());
        Object object2 = gWIG.hK(this.tnSF(), gWIG2.tnSF());
        Object object3 = gWIG.hK(this.SfEN(), gWIG2.SfEN());
        Object object4 = gWIG.hK(this.qlxe(), gWIG2.qlxe());
        Object object5 = gWIG.hK(this.OjYY(), gWIG2.OjYY());
        Object object6 = gWIG.hK(this.URWs(), gWIG2.URWs());
        return new gWIG((String)cv.b(this, 1412691620), (int)object, (int)object2, (int)object3, (int)object4, (int)object5, (int)object6);
    }

    public Block YoSa(int n, int n2, int n3) {
        return this.getWorld().getBlockAt((Integer)cv.b(this, 915404287) + n, (Integer)cv.b(this, 104855033) + n2, (Integer)cv.b(this, -1821116741) + n3);
    }

    public Block ssNb(World world, int n, int n2, int n3) {
        return world.getBlockAt((Integer)cv.b(this, 915404287) + n, (Integer)cv.b(this, 104855033) + n2, (Integer)cv.b(this, -1821116741) + n3);
    }

    public List<Chunk> vlLH() {
        ArrayList<Chunk> arrayList = new ArrayList<Chunk>();
        World world = this.getWorld();
        int n = this.UlKG() & -16;
        int n2 = this.qlxe() & -16;
        int n3 = this.SfEN() & -16;
        int n4 = this.URWs() & -16;
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
    public void ssNb(int n, byte by) {
        for (Block block : this) {
            block.setTypeIdAndData(n, by, false);
        }
    }

    @Override
    public Iterator<Block> iterator() {
        return new gWIG$DYFV(this, this.getWorld(), (Integer)cv.b(this, 915404287), (Integer)cv.b(this, 104855033), (Integer)cv.b(this, -1821116741), (Integer)cv.b(this, 1977873916), (Integer)cv.b(this, -2090404354), (Integer)cv.b(this, 731444920));
    }

    public gWIG Tyjs() throws CloneNotSupportedException {
        return new gWIG(this);
    }

    public String toString() {
        return gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(gWIG.hK(new StringBuilder(KUXS$dwji.S("\u9389\u92ff\u153e\ub63c\uae53\u309c\u1888\u7be0")), (String)cv.b(this, 1412691620)), KUXS$dwji.S("\u93e6")), (Integer)cv.b(this, 915404287)), KUXS$dwji.S("\u93e6")), (Integer)cv.b(this, 104855033)), KUXS$dwji.S("\u93e6")), (Integer)cv.b(this, -1821116741)), KUXS$dwji.S("\u93f7\u92b4")), (Integer)cv.b(this, 1977873916)), KUXS$dwji.S("\u93e6")), (Integer)cv.b(this, -2090404354)), KUXS$dwji.S("\u93e6")), (Integer)cv.b(this, 731444920)));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((String)cv.b(this, 1412691620) == null ? 0 : (Object)gWIG.hK((String)cv.b(this, 1412691620)));
        n2 = n2 * 31 + (Integer)cv.b(this, 915404287);
        n2 = n2 * 31 + (Integer)cv.b(this, 1977873916);
        n2 = n2 * 31 + (Integer)cv.b(this, 104855033);
        n2 = n2 * 31 + (Integer)cv.b(this, -2090404354);
        n2 = n2 * 31 + (Integer)cv.b(this, -1821116741);
        n2 = n2 * 31 + (Integer)cv.b(this, 731444920);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (gWIG.hK(this) != gWIG.hK(object)) {
            return false;
        }
        gWIG gWIG2 = (gWIG)object;
        if ((String)cv.b(this, 1412691620) == null) {
            if ((String)cv.b(gWIG2, 1412691620) != null) {
                return false;
            }
        } else if (gWIG.hK((String)cv.b(this, 1412691620), (String)cv.b(gWIG2, 1412691620)) == false) {
            return false;
        }
        if (((Integer)cv.b(this, 915404287)).intValue() != ((Integer)cv.b(gWIG2, 915404287)).intValue()) {
            return false;
        }
        if (((Integer)cv.b(this, 1977873916)).intValue() != ((Integer)cv.b(gWIG2, 1977873916)).intValue()) {
            return false;
        }
        if (((Integer)cv.b(this, 104855033)).intValue() != ((Integer)cv.b(gWIG2, 104855033)).intValue()) {
            return false;
        }
        if (((Integer)cv.b(this, -2090404354)).intValue() != ((Integer)cv.b(gWIG2, -2090404354)).intValue()) {
            return false;
        }
        if (((Integer)cv.b(this, -1821116741)).intValue() != ((Integer)cv.b(gWIG2, -1821116741)).intValue()) {
            return false;
        }
        if (((Integer)cv.b(this, 731444920)).intValue() != ((Integer)cv.b(gWIG2, 731444920)).intValue()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.Tyjs();
    }

    static /* synthetic */ int[] ydSf() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(1129969313);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((mrKm[])gWIG.hK()).length];
        try {
            arrn[gWIG.hK((mrKm)cv.e((int)-1515981579))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((mrKm)cv.e((int)681309428))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((mrKm)cv.e((int)1817572599))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(1129969313, arrn3);
        return arrn3;
    }

    static /* synthetic */ int[] cSRj() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(-276040029);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((gWIG$ssNb[])gWIG.hK()).length];
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)1610609679))] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)-714542078))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)1237775366))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)-1717963763))] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)-1984433145))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)-285543423))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)1267594254))] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)196670467))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)159380492))] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[gWIG.hK((gWIG$ssNb)cv.e((int)-1350634496))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(-276040029, arrn3);
        return arrn3;
    }

    private static Object hK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

