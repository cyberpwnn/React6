/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.BlockState
 *  org.bukkit.block.Hopper
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.block.Hopper;

public class CgJH {
    private Hopper Yges;
    private feCR<Hopper> sRNR;
    private Hopper pavG;

    public CgJH(Hopper hopper, feCR<Hopper> feCR2, Hopper hopper2) {
        this.Yges = hopper;
        this.sRNR = feCR2;
        this.pavG = hopper2;
    }

    public Hopper ryAp() {
        return (Hopper)o.a(this, 584864668);
    }

    public feCR<Hopper> vAGm() {
        return (feCR)o.a(this, -1316269157);
    }

    public Hopper Bkwe() {
        return (Hopper)o.a(this, -646753366);
    }

    @jEtO
    @bhlC
    public static CgJH yJLS(Hopper hopper, int n, int n2) {
        int n3 = 0;
        boolean bl = true;
        feCR<Hopper> feCR2 = new feCR<Hopper>();
        Hopper hopper2 = hopper;
        while (bl) {
            CgJH.df(feCR2, hopper2);
            Object object = CgJH.df(hopper2);
            Location location = hopper2.getLocation();
            Object object2 = CgJH.df(object, location);
            if (CgJH.df(object2).getState() instanceof Hopper) {
                if (CgJH.df(object, (Gaty)((Object)o.k(-233679948))) == false) {
                    Object object3 = CgJH.df((Gaty)((Object)o.k(-233679948)), location);
                    if (CgJH.df(CgJH.df(object3).getType(), (Material)o.k(-123776091)) != false) {
                        if (CgJH.df(feCR2) > true) {
                            CgJH.df(feCR2);
                            hopper2 = (Hopper)CgJH.df(feCR2, CgJH.df(feCR2));
                            break;
                        }
                        return null;
                    }
                }
                ++n3;
                hopper2 = (Hopper)CgJH.df(object2).getState();
            } else {
                bl = false;
            }
            if (n3 < n) continue;
            bl = false;
        }
        CgJH.df(feCR2, hopper2);
        if (n3 < n2) {
            return null;
        }
        return new CgJH(hopper, feCR2, hopper2);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((Hopper)o.a(this, -646753366) == null ? 0 : (Object)CgJH.df((Hopper)o.a(this, -646753366)));
        n2 = n2 * 31 + (Object)((feCR)o.a(this, -1316269157) == null ? 0 : (Object)CgJH.df((feCR)o.a(this, -1316269157)));
        n2 = n2 * 31 + (Object)((Hopper)o.a(this, 584864668) == null ? 0 : (Object)CgJH.df((Hopper)o.a(this, 584864668)));
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (CgJH.df(this) != CgJH.df(object)) {
            return false;
        }
        CgJH cgJH = (CgJH)object;
        if ((Hopper)o.a(this, -646753366) == null) {
            if ((Hopper)o.a(cgJH, -646753366) != null) {
                return false;
            }
        } else if (CgJH.df((Hopper)o.a(this, -646753366), (Hopper)o.a(cgJH, -646753366)) == false) {
            return false;
        }
        if ((feCR)o.a(this, -1316269157) == null) {
            if ((feCR)o.a(cgJH, -1316269157) != null) {
                return false;
            }
        } else if (CgJH.df((feCR)o.a(this, -1316269157), (feCR)o.a(cgJH, -1316269157)) == false) {
            return false;
        }
        if ((Hopper)o.a(this, 584864668) == null) {
            if ((Hopper)o.a(cgJH, 584864668) != null) {
                return false;
            }
        } else if (CgJH.df((Hopper)o.a(this, 584864668), (Hopper)o.a(cgJH, 584864668)) == false) {
            return false;
        }
        return true;
    }

    private static Object df(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

