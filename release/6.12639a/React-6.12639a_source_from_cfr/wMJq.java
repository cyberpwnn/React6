/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.potion.PotionEffect
 *  org.bukkit.potion.PotionEffectType
 */
import java.util.Map;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class wMJq
extends PotionEffect {
    public static wMJq Khet;
    public static wMJq btYf;
    public static wMJq VqVv;
    public static wMJq KXEm;
    public static wMJq rreg;
    public static wMJq PDpy;
    public static wMJq tyLt;
    public static wMJq Sglp;
    public static wMJq uIJm;
    public static wMJq Wbut;
    public static wMJq UKmy;
    public static wMJq Hgkv;
    public static wMJq SNYl;
    public static wMJq lhce;
    public static wMJq rYTE;
    public static wMJq lqUO;
    public static wMJq hKUT;
    public static wMJq ULOk;
    public static wMJq fxSf;
    public static wMJq EUqw;
    public static wMJq SEiV;
    public static wMJq yMEr;
    public static wMJq ARWj;
    public static wMJq pcnJ;
    public static wMJq BnmE;
    public static wMJq fwrn;
    public static wMJq tEgA;

    static {
        o.w(1499087102, (Object)wMJq.yJLS((PotionEffectType)o.k(350634239)));
        o.w(550191113, (Object)wMJq.yJLS((PotionEffectType)o.k(-1442103043)));
        o.w(1307066619, (Object)wMJq.yJLS((PotionEffectType)o.k(-1402322692)));
        o.w(1669087369, (Object)wMJq.yJLS((PotionEffectType)o.k(1574715530)));
        o.w(656687239, (Object)wMJq.yJLS((PotionEffectType)o.k(1699758216)));
        o.w(-612155259, (Object)wMJq.yJLS((PotionEffectType)o.k(2139635846)));
        o.w(2147434627, (Object)wMJq.yJLS((PotionEffectType)o.k(902185092)));
        o.w(-2114765967, (Object)wMJq.yJLS((PotionEffectType)o.k(-841729166)));
        o.w(1446591343, (Object)wMJq.yJLS((PotionEffectType)o.k(-1921827984)));
        o.w(1580481389, (Object)wMJq.yJLS((PotionEffectType)o.k(44383086)));
        o.w(-607569045, (Object)wMJq.yJLS((PotionEffectType)o.k(2009938796)));
        o.w(-1494795399, (Object)wMJq.yJLS((PotionEffectType)o.k(-2038285446)));
        o.w(1811037047, (Object)wMJq.yJLS((PotionEffectType)o.k(-730973320)));
        o.w(564870005, (Object)wMJq.yJLS((PotionEffectType)o.k(1609055094)));
        o.w(1760181107, (Object)wMJq.yJLS((PotionEffectType)o.k(-133743756)));
        o.w(1387740001, (Object)wMJq.yJLS((PotionEffectType)o.k(-713147550)));
        o.w(-374981793, (Object)wMJq.yJLS((PotionEffectType)o.k(-1134085280)));
        o.w(-960998607, (Object)wMJq.yJLS((PotionEffectType)o.k(649345886)));
        o.w(-1419953316, (Object)wMJq.yJLS((PotionEffectType)o.k(844446557)));
        o.w(442514282, (Object)wMJq.yJLS((PotionEffectType)o.k(-1051313317)));
        o.w(-263767192, (Object)wMJq.yJLS((PotionEffectType)o.k(67648361)));
        o.w(704396134, (Object)wMJq.yJLS((PotionEffectType)o.k(654654311)));
        o.w(-126534812, (Object)wMJq.yJLS((PotionEffectType)o.k(-154256539)));
    }

    public wMJq(Map<String, Object> map) {
        super(map);
    }

    public wMJq(PotionEffectType potionEffectType, int n, int n2, boolean bl, boolean bl2) {
        super(potionEffectType, n, n2, bl, bl2);
    }

    public wMJq(PotionEffectType potionEffectType, int n, int n2, boolean bl) {
        super(potionEffectType, n, n2, bl);
    }

    public wMJq(PotionEffectType potionEffectType, int n, int n2) {
        super(potionEffectType, n, n2);
    }

    public Map<String, Object> serialize() {
        return super.serialize();
    }

    public boolean apply(LivingEntity livingEntity) {
        livingEntity.removePotionEffect(this.getType());
        return super.apply(livingEntity);
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int getAmplifier() {
        return super.getAmplifier();
    }

    public int getDuration() {
        return super.getDuration();
    }

    public PotionEffectType getType() {
        return super.getType();
    }

    public boolean isAmbient() {
        return super.isAmbient();
    }

    public boolean hasParticles() {
        return super.hasParticles();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public static wMJq yJLS(PotionEffectType potionEffectType) {
        return new wMJq(potionEffectType, 1, 0, false, false);
    }

    public wMJq TFUi(int n) {
        return new wMJq(this.getType(), n, this.getAmplifier(), false, false);
    }

    public wMJq nJPf(int n) {
        return new wMJq(this.getType(), this.getDuration(), n, false, false);
    }

    public PotionEffect cKKR() {
        return new wMJq(this.getType(), this.getDuration(), this.getAmplifier(), false, false);
    }

    public void KTiK(LivingEntity livingEntity) {
        livingEntity.addPotionEffect(new wMJq(this.getType(), this.getDuration(), this.getAmplifier(), false, false).cKKR());
    }

    public void GPlk(LivingEntity livingEntity) {
        livingEntity.addPotionEffect(new wMJq(this.getType(), this.getDuration(), this.getAmplifier(), false, false).cKKR(), true);
    }

    public void ktHX(LivingEntity livingEntity) {
        livingEntity.removePotionEffect(this.getType());
    }
}

