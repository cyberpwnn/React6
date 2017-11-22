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

public class hQYY
extends PotionEffect {
    public static hQYY aVhD;
    public static hQYY SEOX;
    public static hQYY rFuU;
    public static hQYY wowT;
    public static hQYY Obsm;
    public static hQYY Wayp;
    public static hQYY mPwo;
    public static hQYY mjkF;
    public static hQYY FrLl;
    public static hQYY CGBN;
    public static hQYY UCDM;
    public static hQYY TYSB;
    public static hQYY TrdY;
    public static hQYY GAkE;
    public static hQYY rWvQ;
    public static hQYY KVgq;
    public static hQYY Jdfg;
    public static hQYY IbDe;
    public static hQYY QqlK;
    public static hQYY gXWp;
    public static hQYY PTup;
    public static hQYY COQi;
    public static hQYY CWbQ;
    public static hQYY qUSw;
    public static hQYY eRQv;
    public static hQYY OlFa;
    public static hQYY FrNA;

    static {
        cv.V(1313470024, (Object)hQYY.ssNb((PotionEffectType)cv.e(2141386313)));
        cv.V(-289867829, (Object)hQYY.ssNb((PotionEffectType)cv.e(1157101131)));
        cv.V(-507447755, (Object)hQYY.ssNb((PotionEffectType)cv.e(-32770486)));
        cv.V(362608183, (Object)hQYY.ssNb((PotionEffectType)cv.e(1588262452)));
        cv.V(1732113969, (Object)hQYY.ssNb((PotionEffectType)cv.e(654964278)));
        cv.V(-739969485, (Object)hQYY.ssNb((PotionEffectType)cv.e(-417728976)));
        cv.V(1580267069, (Object)hQYY.ssNb((PotionEffectType)cv.e(-980421070)));
        cv.V(-2113210817, (Object)hQYY.ssNb((PotionEffectType)cv.e(1272706620)));
        cv.V(-1725041095, (Object)hQYY.ssNb((PotionEffectType)cv.e(-1033112002)));
        cv.V(1407711227, (Object)hQYY.ssNb((PotionEffectType)cv.e(-675481608)));
        cv.V(-459409435, (Object)hQYY.ssNb((PotionEffectType)cv.e(-94636038)));
        cv.V(-1899169817, (Object)hQYY.ssNb((PotionEffectType)cv.e(1513158628)));
        cv.V(-1343817759, (Object)hQYY.ssNb((PotionEffectType)cv.e(1279981542)));
        cv.V(-2074150941, (Object)hQYY.ssNb((PotionEffectType)cv.e(-27527200)));
        cv.V(1744435181, (Object)hQYY.ssNb((PotionEffectType)cv.e(394262498)));
        cv.V(-1172047889, (Object)hQYY.ssNb((PotionEffectType)cv.e(645265388)));
        cv.V(-276826135, (Object)hQYY.ssNb((PotionEffectType)cv.e(-1448347666)));
        cv.V(-195299349, (Object)hQYY.ssNb((PotionEffectType)cv.e(481818600)));
        cv.V(-1527318571, (Object)hQYY.ssNb((PotionEffectType)cv.e(930281450)));
        cv.V(1979119575, (Object)hQYY.ssNb((PotionEffectType)cv.e(-2029848620)));
        cv.V(-420218927, (Object)hQYY.ssNb((PotionEffectType)cv.e(-1553729578)));
        cv.V(53540819, (Object)hQYY.ssNb((PotionEffectType)cv.e(869464016)));
        cv.V(1370879965, (Object)hQYY.ssNb((PotionEffectType)cv.e(-529729582)));
    }

    public hQYY(Map<String, Object> map) {
        super(map);
    }

    public hQYY(PotionEffectType potionEffectType, int n, int n2, boolean bl, boolean bl2) {
        super(potionEffectType, n, n2, bl, bl2);
    }

    public hQYY(PotionEffectType potionEffectType, int n, int n2, boolean bl) {
        super(potionEffectType, n, n2, bl);
    }

    public hQYY(PotionEffectType potionEffectType, int n, int n2) {
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

    public static hQYY ssNb(PotionEffectType potionEffectType) {
        return new hQYY(potionEffectType, 1, 0, false, false);
    }

    public hQYY tdpC(int n) {
        return new hQYY(this.getType(), n, this.getAmplifier(), false, false);
    }

    public hQYY PBWX(int n) {
        return new hQYY(this.getType(), this.getDuration(), n, false, false);
    }

    public PotionEffect ndRm() {
        return new hQYY(this.getType(), this.getDuration(), this.getAmplifier(), false, false);
    }

    public void YoSa(LivingEntity livingEntity) {
        livingEntity.addPotionEffect(new hQYY(this.getType(), this.getDuration(), this.getAmplifier(), false, false).ndRm());
    }

    public void jhSt(LivingEntity livingEntity) {
        livingEntity.addPotionEffect(new hQYY(this.getType(), this.getDuration(), this.getAmplifier(), false, false).ndRm(), true);
    }

    public void BkpW(LivingEntity livingEntity) {
        livingEntity.removePotionEffect(this.getType());
    }
}

