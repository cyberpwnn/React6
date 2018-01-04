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

public class Kwaa
implements Cloneable,
Iterable<Block>,
ConfigurationSerializable {
    protected final String foTk;
    protected int WcIw;
    protected int TapS;
    protected int Qqxi;
    protected int cKyC;
    protected int IsSe;
    protected int lFSE;
    private static /* synthetic */ int[] ywKj;
    private static /* synthetic */ int[] lxvA;

    public Kwaa(Location location, Location location2) {
        if (Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)) == false) {
            throw new IllegalArgumentException(FMkR$WjFM.a("\uba28\ub4ca\u3cee\uc18d\ueb6f\u4f75\u3705\u6c5d\uef9e\ubbbb\u2be5\u0b0a\u1eca\u45ed\u3c08\u09b7\ub036\ue049\u3541\uc1f7\ub709\u85b4\ub4a6\u70e0\u2731\u1688\ueac0\ue62a\ucea3\ueffb\ud787\ub689\u0e5d\u7424\u4e76"));
        }
        this.foTk = Kwaa.fK(location).getName();
        this.WcIw = Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2));
        this.TapS = Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2));
        this.Qqxi = Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2));
        this.cKyC = Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2));
        this.IsSe = Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2));
        this.lFSE = Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2));
    }

    public int yJLS(nuUa nuUa2) {
        switch (Kwaa.QFSb()[Kwaa.fK(nuUa2)]) {
            case 1: {
                return (Integer)o.a(this, 1363229484) - (Integer)o.a(this, -2064172245);
            }
            case 2: {
                return (Integer)o.a(this, 1303788346) - (Integer)o.a(this, -1326367943);
            }
            case 3: {
                return (Integer)o.a(this, -1893516488) - (Integer)o.a(this, 588921655);
            }
        }
        return -1;
    }

    public void biLo(Location location, Location location2) {
        o.v(this, -2064172245, (int)Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)));
        o.v(this, -1326367943, (int)Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)));
        o.v(this, 588921655, (int)Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)));
        o.v(this, 1363229484, (int)Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)));
        o.v(this, 1303788346, (int)Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)));
        o.v(this, -1893516488, (int)Kwaa.fK(Kwaa.fK(location), Kwaa.fK(location2)));
    }

    public boolean RIUW() {
        if (Kwaa.fK(this.CxNA()) != false) {
            return false;
        }
        return true;
    }

    public feCR<Player> CxNA() {
        return new feCR<Player>((List<Player>)Kwaa.fK(new Kwaa$1(this), this.psQb()));
    }

    public feCR<Entity> psQb() {
        feCR<Entity> feCR2 = new feCR<Entity>();
        try {
            for (Chunk chunk : this.xGca()) {
                Entity[] arrentity = chunk.getEntities();
                int n = arrentity.length;
                int n2 = 0;
                while (n2 < n) {
                    Entity entity = arrentity[n2];
                    if (this.Ipep(entity.getLocation())) {
                        Kwaa.fK(feCR2, entity);
                    } else if (this.Ipep((Location)Kwaa.fK(entity.getLocation(), Kwaa.fK(Kwaa.fK(entity.getVelocity()), 0.87)))) {
                        Kwaa.fK(feCR2, entity);
                    } else if (this.Ipep((Location)Kwaa.fK(entity.getLocation(), Kwaa.fK(Kwaa.fK(entity.getVelocity()), 0.75)))) {
                        Kwaa.fK(feCR2, entity);
                    } else if (this.Ipep((Location)Kwaa.fK(entity.getLocation(), Kwaa.fK(Kwaa.fK(entity.getVelocity()), 0.5)))) {
                        Kwaa.fK(feCR2, entity);
                    } else if (this.Ipep((Location)Kwaa.fK(entity.getLocation(), Kwaa.fK(Kwaa.fK(entity.getVelocity()), 0.25)))) {
                        Kwaa.fK(feCR2, entity);
                    } else if (this.Ipep((Location)Kwaa.fK(entity.getLocation(), Kwaa.fK(Kwaa.fK(entity.getVelocity()), 0.15)))) {
                        Kwaa.fK(feCR2, entity);
                    } else if (this.Ipep((Location)Kwaa.fK(entity.getLocation(), Kwaa.fK(Kwaa.fK(entity.getVelocity()), 0.05)))) {
                        Kwaa.fK(feCR2, entity);
                    }
                    ++n2;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return feCR2;
    }

    public Kwaa(Location location) {
        this(location, location);
    }

    public Kwaa(Kwaa kwaa) {
        this(kwaa.getWorld().getName(), (int)((Integer)o.a(kwaa, -2064172245)), (int)((Integer)o.a(kwaa, -1326367943)), (int)((Integer)o.a(kwaa, 588921655)), (int)((Integer)o.a(kwaa, 1363229484)), (int)((Integer)o.a(kwaa, 1303788346)), (int)((Integer)o.a(kwaa, -1893516488)));
    }

    public Kwaa(World world, int n, int n2, int n3, int n4, int n5, int n6) {
        this.foTk = world.getName();
        this.WcIw = Kwaa.fK(n, n4);
        this.cKyC = Kwaa.fK(n, n4);
        this.TapS = Kwaa.fK(n2, n5);
        this.IsSe = Kwaa.fK(n2, n5);
        this.Qqxi = Kwaa.fK(n3, n6);
        this.lFSE = Kwaa.fK(n3, n6);
    }

    private Kwaa(String string, int n, int n2, int n3, int n4, int n5, int n6) {
        this.foTk = string;
        this.WcIw = Kwaa.fK(n, n4);
        this.cKyC = Kwaa.fK(n, n4);
        this.TapS = Kwaa.fK(n2, n5);
        this.IsSe = Kwaa.fK(n2, n5);
        this.Qqxi = Kwaa.fK(n3, n6);
        this.lFSE = Kwaa.fK(n3, n6);
    }

    public Kwaa(Map<String, Object> map) {
        this.foTk = (String)map.get(mrFx$WjFM.d("\ud83f\u8bf0\uf1ad\u4759\u6ca1\u8072\u5f3c\ue071\ubfb7"));
        this.WcIw = Kwaa.fK((Integer)map.get(mrFx$WjFM.d("\ud830\u8bae")));
        this.cKyC = Kwaa.fK((Integer)map.get(mrFx$WjFM.d("\ud830\u8bad")));
        this.TapS = Kwaa.fK((Integer)map.get(mrFx$WjFM.d("\ud831\u8bae")));
        this.IsSe = Kwaa.fK((Integer)map.get(mrFx$WjFM.d("\ud831\u8bad")));
        this.Qqxi = Kwaa.fK((Integer)map.get(mrFx$WjFM.d("\ud832\u8bae")));
        this.lFSE = Kwaa.fK((Integer)map.get(mrFx$WjFM.d("\ud832\u8bad")));
    }

    public Map<String, Object> serialize() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(FMkR$WjFM.a("\u9655\u8c86\u41d5\u3831\u4753\u2837\ube0a\uffbe\u3b79"), (String)o.a(this, 162741043));
        hashMap.put(FMkR$WjFM.a("\u965a\u8cd8"), Kwaa.fK((Integer)o.a(this, -2064172245)));
        hashMap.put(FMkR$WjFM.a("\u965b\u8cd8"), Kwaa.fK((Integer)o.a(this, -1326367943)));
        hashMap.put(FMkR$WjFM.a("\u9658\u8cd8"), Kwaa.fK((Integer)o.a(this, 588921655)));
        hashMap.put(FMkR$WjFM.a("\u965a\u8cdb"), Kwaa.fK((Integer)o.a(this, 1363229484)));
        hashMap.put(FMkR$WjFM.a("\u965b\u8cdb"), Kwaa.fK((Integer)o.a(this, 1303788346)));
        hashMap.put(FMkR$WjFM.a("\u9658\u8cdb"), Kwaa.fK((Integer)o.a(this, -1893516488)));
        return hashMap;
    }

    public Kwaa TOGS(int n) {
        return new Kwaa(this.getWorld(), (int)((Integer)o.a(this, -2064172245)), n, (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), n, (int)((Integer)o.a(this, -1893516488)));
    }

    public Location scHl() {
        return new Location(this.getWorld(), (double)((Integer)o.a(this, -2064172245)).intValue(), (double)((Integer)o.a(this, -1326367943)).intValue(), (double)((Integer)o.a(this, 588921655)).intValue());
    }

    public Location VxHQ() {
        return new Location(this.getWorld(), (double)((Integer)o.a(this, 1363229484)).intValue(), (double)((Integer)o.a(this, 1303788346)).intValue(), (double)((Integer)o.a(this, -1893516488)).intValue());
    }

    public Location getCenter() {
        int n = this.OrsF() + 1;
        int n2 = this.IXOv() + 1;
        int n3 = this.oMiq() + 1;
        return new Location(this.getWorld(), (double)this.uiNt() + (double)(n - this.uiNt()) / 2.0, (double)this.KVFH() + (double)(n2 - this.KVFH()) / 2.0, (double)this.gVsd() + (double)(n3 - this.gVsd()) / 2.0);
    }

    public World getWorld() {
        Object object = Kwaa.fK((String)o.a(this, 162741043));
        if (object == null) {
            throw new IllegalStateException((String)Kwaa.fK(Kwaa.fK(Kwaa.fK(new StringBuilder(mrFx$WjFM.d("\ufeac\u867f\u93ee\uc29b\u731e\ud3e9\u88f1")), (String)o.a(this, 162741043)), mrFx$WjFM.d("\ufefc\u8630\u93f5\uc284\u735a\ud3a7\u88b9\u9fb4\u5fe3\ufcad\u8d9d\ub47d\u1334\ua8aa\uff06"))));
        }
        return object;
    }

    public int nRwg() {
        return (Integer)o.a(this, 1363229484) - (Integer)o.a(this, -2064172245) + 1;
    }

    public int jGMI() {
        return (Integer)o.a(this, 1303788346) - (Integer)o.a(this, -1326367943) + 1;
    }

    public int ekAa() {
        return (Integer)o.a(this, -1893516488) - (Integer)o.a(this, 588921655) + 1;
    }

    public int uiNt() {
        return (Integer)o.a(this, -2064172245);
    }

    public int KVFH() {
        return (Integer)o.a(this, -1326367943);
    }

    public int gVsd() {
        return (Integer)o.a(this, 588921655);
    }

    public int OrsF() {
        return (Integer)o.a(this, 1363229484);
    }

    public int IXOv() {
        return (Integer)o.a(this, 1303788346);
    }

    public int oMiq() {
        return (Integer)o.a(this, -1893516488);
    }

    public Block[] afeX() {
        Block[] arrblock = new Block[8];
        World world = this.getWorld();
        arrblock[0] = world.getBlockAt(((Integer)o.a(this, -2064172245)).intValue(), ((Integer)o.a(this, -1326367943)).intValue(), ((Integer)o.a(this, 588921655)).intValue());
        arrblock[1] = world.getBlockAt(((Integer)o.a(this, -2064172245)).intValue(), ((Integer)o.a(this, -1326367943)).intValue(), ((Integer)o.a(this, -1893516488)).intValue());
        arrblock[2] = world.getBlockAt(((Integer)o.a(this, -2064172245)).intValue(), ((Integer)o.a(this, 1303788346)).intValue(), ((Integer)o.a(this, 588921655)).intValue());
        arrblock[3] = world.getBlockAt(((Integer)o.a(this, -2064172245)).intValue(), ((Integer)o.a(this, 1303788346)).intValue(), ((Integer)o.a(this, -1893516488)).intValue());
        arrblock[4] = world.getBlockAt(((Integer)o.a(this, 1363229484)).intValue(), ((Integer)o.a(this, -1326367943)).intValue(), ((Integer)o.a(this, 588921655)).intValue());
        arrblock[5] = world.getBlockAt(((Integer)o.a(this, 1363229484)).intValue(), ((Integer)o.a(this, -1326367943)).intValue(), ((Integer)o.a(this, -1893516488)).intValue());
        arrblock[6] = world.getBlockAt(((Integer)o.a(this, 1363229484)).intValue(), ((Integer)o.a(this, 1303788346)).intValue(), ((Integer)o.a(this, 588921655)).intValue());
        arrblock[7] = world.getBlockAt(((Integer)o.a(this, 1363229484)).intValue(), ((Integer)o.a(this, 1303788346)).intValue(), ((Integer)o.a(this, -1893516488)).intValue());
        return arrblock;
    }

    public Kwaa yJLS(Kwaa$yJLS kwaa$yJLS, int n) {
        switch (Kwaa.JcbI()[Kwaa.fK(kwaa$yJLS)]) {
            case 4: {
                return new Kwaa((String)o.a(this, 162741043), (Integer)o.a(this, -2064172245) - n, (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 2: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (Integer)o.a(this, 1363229484) + n, (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 1: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (Integer)o.a(this, 588921655) - n, (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 3: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (Integer)o.a(this, -1893516488) + n);
            }
            case 6: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (Integer)o.a(this, -1326367943) - n, (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 5: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (Integer)o.a(this, 1303788346) + n, (int)((Integer)o.a(this, -1893516488)));
            }
        }
        throw new IllegalArgumentException((String)Kwaa.fK(Kwaa.fK(new StringBuilder(mrFx$WjFM.d("\u412a\uc1ec\uf3f3\udae6\u8391\u86e8\u4063\u0d19\uda3e\u8e15\u0283\ue06a\uf52e\ucdc4\u61b9\u1333\u3393\u444e")), kwaa$yJLS)));
    }

    public Kwaa UtIU(Kwaa$yJLS kwaa$yJLS, int n) {
        return this.yJLS(kwaa$yJLS, n).yJLS((Kwaa$yJLS)((Object)Kwaa.fK(kwaa$yJLS)), - n);
    }

    public Kwaa biLo(Kwaa$yJLS kwaa$yJLS, int n) {
        Kwaa kwaa;
        switch (Kwaa.JcbI()[Kwaa.fK(kwaa$yJLS)]) {
            case 7: {
                kwaa = this.yJLS((Kwaa$yJLS)((Object)o.k(1179139411)), n).yJLS((Kwaa$yJLS)((Object)o.k(1634220737)), n).yJLS((Kwaa$yJLS)((Object)o.k(1100757698)), n).yJLS((Kwaa$yJLS)((Object)o.k(164182720)), n);
                break;
            }
            case 8: {
                kwaa = this.yJLS((Kwaa$yJLS)((Object)o.k(-1832699202)), n).yJLS((Kwaa$yJLS)((Object)o.k(-901825857)), n);
                break;
            }
            case 9: {
                kwaa = this.biLo((Kwaa$yJLS)((Object)o.k(-727369027)), n).biLo((Kwaa$yJLS)((Object)o.k(806566588)), n);
                break;
            }
            default: {
                throw new IllegalArgumentException((String)Kwaa.fK(Kwaa.fK(new StringBuilder(mrFx$WjFM.d("\u1a7c\u82e5\u6049\u0e64\u3df3\u599b\u3053\uaf82\uf5e1\u6063\u5f6c\uafd2\u1620\u61bd\u901a\uc970\u07fe\u993f")), kwaa$yJLS)));
            }
        }
        return kwaa;
    }

    public Kwaa VwLY(Kwaa$yJLS kwaa$yJLS, int n) {
        return this.biLo(kwaa$yJLS, - n);
    }

    public boolean TEqA(int n, int n2, int n3) {
        if (n >= (Integer)o.a(this, -2064172245) && n <= (Integer)o.a(this, 1363229484) && n2 >= (Integer)o.a(this, -1326367943) && n2 <= (Integer)o.a(this, 1303788346) && n3 >= (Integer)o.a(this, 588921655) && n3 <= (Integer)o.a(this, -1893516488)) {
            return true;
        }
        return false;
    }

    public boolean GPlk(Block block) {
        return this.TEqA(block.getX(), block.getY(), block.getZ());
    }

    public boolean Ipep(Location location) {
        if (Kwaa.fK((String)o.a(this, 162741043), Kwaa.fK(location).getName()) != false) {
            if (this.TEqA((int)Kwaa.fK(location), (int)Kwaa.fK(location), (int)Kwaa.fK(location))) {
                return true;
            }
        }
        return false;
    }

    public int IWnu() {
        return this.nRwg() * this.jGMI() * this.ekAa();
    }

    public byte CyCE() {
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

    public Kwaa PSsL() {
        return this.yJLS((Kwaa$yJLS)((Object)o.k(-1832699202))).yJLS((Kwaa$yJLS)((Object)o.k(1634220737))).yJLS((Kwaa$yJLS)((Object)o.k(1100757698))).yJLS((Kwaa$yJLS)((Object)o.k(-901825857))).yJLS((Kwaa$yJLS)((Object)o.k(1179139411))).yJLS((Kwaa$yJLS)((Object)o.k(164182720)));
    }

    public Kwaa yJLS(Kwaa$yJLS kwaa$yJLS) {
        Kwaa kwaa = this.UtIU((Kwaa$yJLS)((Object)Kwaa.fK(kwaa$yJLS)));
        switch (Kwaa.JcbI()[Kwaa.fK(kwaa$yJLS)]) {
            case 6: {
                while (kwaa.UtIU((Material)o.k(-1236315249)) && kwaa.KVFH() > this.KVFH()) {
                    kwaa = kwaa.UtIU((Kwaa$yJLS)((Object)o.k(-1832699202)), 1);
                }
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), kwaa.IXOv(), (int)((Integer)o.a(this, -1893516488)));
            }
            case 5: {
                while (kwaa.UtIU((Material)o.k(-1236315249)) && kwaa.IXOv() < this.IXOv()) {
                    kwaa = kwaa.UtIU((Kwaa$yJLS)((Object)o.k(-901825857)), 1);
                }
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), kwaa.KVFH(), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 1: {
                while (kwaa.UtIU((Material)o.k(-1236315249)) && kwaa.uiNt() > this.uiNt()) {
                    kwaa = kwaa.UtIU((Kwaa$yJLS)((Object)o.k(1179139411)), 1);
                }
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), kwaa.OrsF(), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 3: {
                while (kwaa.UtIU((Material)o.k(-1236315249)) && kwaa.OrsF() < this.OrsF()) {
                    kwaa = kwaa.UtIU((Kwaa$yJLS)((Object)o.k(1634220737)), 1);
                }
                return new Kwaa((String)o.a(this, 162741043), kwaa.uiNt(), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 2: {
                while (kwaa.UtIU((Material)o.k(-1236315249)) && kwaa.gVsd() > this.gVsd()) {
                    kwaa = kwaa.UtIU((Kwaa$yJLS)((Object)o.k(1100757698)), 1);
                }
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), kwaa.oMiq());
            }
            case 4: {
                while (kwaa.UtIU((Material)o.k(-1236315249)) && kwaa.oMiq() < this.oMiq()) {
                    kwaa = kwaa.UtIU((Kwaa$yJLS)((Object)o.k(164182720)), 1);
                }
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), kwaa.gVsd(), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
        }
        throw new IllegalArgumentException((String)Kwaa.fK(Kwaa.fK(new StringBuilder(mrFx$WjFM.d("\u410a\uc1ec\uf3f3\udae6\u8391\u86e8\u4063\u0d19\uda3e\u8e15\u0283\ue06a\uf52e\ucdc4\u61b9\u1333\u3393\u444e")), kwaa$yJLS)));
    }

    public Kwaa UtIU(Kwaa$yJLS kwaa$yJLS) {
        switch (Kwaa.JcbI()[Kwaa.fK(kwaa$yJLS)]) {
            case 6: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 5: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 1: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, 588921655)));
            }
            case 3: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, -1893516488)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 2: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, 1363229484)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
            case 4: {
                return new Kwaa((String)o.a(this, 162741043), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, -1326367943)), (int)((Integer)o.a(this, 588921655)), (int)((Integer)o.a(this, -2064172245)), (int)((Integer)o.a(this, 1303788346)), (int)((Integer)o.a(this, -1893516488)));
            }
        }
        throw new IllegalArgumentException((String)Kwaa.fK(Kwaa.fK(new StringBuilder(FMkR$WjFM.a("\u3ff5\u99de\u2efd\ubd11\u4bfd\uaa93\u7b69\ua4dc\uc6e3\uc637\u279a\u6173\u0ec7\u748c\ub128\ud232\u2830\uc263")), kwaa$yJLS)));
    }

    public boolean UtIU(Material material) {
        for (Block block : this) {
            if (block.getType() == material) continue;
            return false;
        }
        return true;
    }

    public Kwaa yJLS(Kwaa kwaa) {
        if (kwaa == null) {
            return this;
        }
        Object object = Kwaa.fK(this.uiNt(), kwaa.uiNt());
        Object object2 = Kwaa.fK(this.KVFH(), kwaa.KVFH());
        Object object3 = Kwaa.fK(this.gVsd(), kwaa.gVsd());
        Object object4 = Kwaa.fK(this.OrsF(), kwaa.OrsF());
        Object object5 = Kwaa.fK(this.IXOv(), kwaa.IXOv());
        Object object6 = Kwaa.fK(this.oMiq(), kwaa.oMiq());
        return new Kwaa((String)o.a(this, 162741043), (int)object, (int)object2, (int)object3, (int)object4, (int)object5, (int)object6);
    }

    public Block KTiK(int n, int n2, int n3) {
        return this.getWorld().getBlockAt((Integer)o.a(this, -2064172245) + n, (Integer)o.a(this, -1326367943) + n2, (Integer)o.a(this, 588921655) + n3);
    }

    public Block yJLS(World world, int n, int n2, int n3) {
        return world.getBlockAt((Integer)o.a(this, -2064172245) + n, (Integer)o.a(this, -1326367943) + n2, (Integer)o.a(this, 588921655) + n3);
    }

    public List<Chunk> xGca() {
        ArrayList<Chunk> arrayList = new ArrayList<Chunk>();
        World world = this.getWorld();
        int n = this.uiNt() & -16;
        int n2 = this.OrsF() & -16;
        int n3 = this.gVsd() & -16;
        int n4 = this.oMiq() & -16;
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
    public void yJLS(int n, byte by) {
        for (Block block : this) {
            block.setTypeIdAndData(n, by, false);
        }
    }

    @Override
    public Iterator<Block> iterator() {
        return new Kwaa$UtIU(this, this.getWorld(), (Integer)o.a(this, -2064172245), (Integer)o.a(this, -1326367943), (Integer)o.a(this, 588921655), (Integer)o.a(this, 1363229484), (Integer)o.a(this, 1303788346), (Integer)o.a(this, -1893516488));
    }

    public Kwaa lVCL() throws CloneNotSupportedException {
        return new Kwaa(this);
    }

    public String toString() {
        return Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(Kwaa.fK(new StringBuilder(FMkR$WjFM.a("\ub0e2\u6d29\u1a6d\ud6c9\u4b57\u2dac\u4ccd\u3444")), (String)o.a(this, 162741043)), FMkR$WjFM.a("\ub08d")), (Integer)o.a(this, -2064172245)), FMkR$WjFM.a("\ub08d")), (Integer)o.a(this, -1326367943)), FMkR$WjFM.a("\ub08d")), (Integer)o.a(this, 588921655)), FMkR$WjFM.a("\ub09c\u6d62")), (Integer)o.a(this, 1363229484)), FMkR$WjFM.a("\ub08d")), (Integer)o.a(this, 1303788346)), FMkR$WjFM.a("\ub08d")), (Integer)o.a(this, -1893516488)));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((String)o.a(this, 162741043) == null ? 0 : (Object)Kwaa.fK((String)o.a(this, 162741043)));
        n2 = n2 * 31 + (Integer)o.a(this, -2064172245);
        n2 = n2 * 31 + (Integer)o.a(this, 1363229484);
        n2 = n2 * 31 + (Integer)o.a(this, -1326367943);
        n2 = n2 * 31 + (Integer)o.a(this, 1303788346);
        n2 = n2 * 31 + (Integer)o.a(this, 588921655);
        n2 = n2 * 31 + (Integer)o.a(this, -1893516488);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (Kwaa.fK(this) != Kwaa.fK(object)) {
            return false;
        }
        Kwaa kwaa = (Kwaa)object;
        if ((String)o.a(this, 162741043) == null) {
            if ((String)o.a(kwaa, 162741043) != null) {
                return false;
            }
        } else if (Kwaa.fK((String)o.a(this, 162741043), (String)o.a(kwaa, 162741043)) == false) {
            return false;
        }
        if (((Integer)o.a(this, -2064172245)).intValue() != ((Integer)o.a(kwaa, -2064172245)).intValue()) {
            return false;
        }
        if (((Integer)o.a(this, 1363229484)).intValue() != ((Integer)o.a(kwaa, 1363229484)).intValue()) {
            return false;
        }
        if (((Integer)o.a(this, -1326367943)).intValue() != ((Integer)o.a(kwaa, -1326367943)).intValue()) {
            return false;
        }
        if (((Integer)o.a(this, 1303788346)).intValue() != ((Integer)o.a(kwaa, 1303788346)).intValue()) {
            return false;
        }
        if (((Integer)o.a(this, 588921655)).intValue() != ((Integer)o.a(kwaa, 588921655)).intValue()) {
            return false;
        }
        if (((Integer)o.a(this, -1893516488)).intValue() != ((Integer)o.a(kwaa, -1893516488)).intValue()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.lVCL();
    }

    static /* synthetic */ int[] QFSb() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(1593588512);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((nuUa[])Kwaa.fK()).length];
        try {
            arrn[Kwaa.fK((nuUa)o.k((int)-1743766990))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((nuUa)o.k((int)2038774321))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((nuUa)o.k((int)-1500104144))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(1593588512, arrn3);
        return arrn3;
    }

    static /* synthetic */ int[] JcbI() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-1904002274);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((Kwaa$yJLS[])Kwaa.fK()).length];
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)-616482117))] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)-1832699202))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)1100757698))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)-727369027))] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)1179139411))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)1634220737))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)-1763885750))] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)-901825857))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)806566588))] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Kwaa.fK((Kwaa$yJLS)o.k((int)164182720))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-1904002274, arrn3);
        return arrn3;
    }

    private static Object fK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

