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

public class KTsB
extends PotionEffect {
    public static KTsB Hwik;
    public static KTsB ySrC;
    public static KTsB eskx;
    public static KTsB YOGo;
    public static KTsB YhXy;
    public static KTsB pIXN;
    public static KTsB vvAW;
    public static KTsB hReM;
    public static KTsB LPtW;
    public static KTsB tfiJ;
    public static KTsB xYbr;
    public static KTsB aWBV;
    public static KTsB xPqv;
    public static KTsB apSj;
    public static KTsB mPrm;
    public static KTsB VWBg;
    public static KTsB FiVa;
    public static KTsB cSwC;
    public static KTsB klnn;
    public static KTsB EvtX;
    public static KTsB KyGN;
    public static KTsB wpQy;
    public static KTsB gqeA;
    public static KTsB cKfT;
    public static KTsB TYMg;
    public static KTsB WPsl;
    public static KTsB esnu;

    static {
        yy.K(-1319697167, (Object)KTsB.mXJp((PotionEffectType)yy.p(-1232141060)));
        yy.K(-1370028678, (Object)KTsB.mXJp((PotionEffectType)yy.p(-978909958)));
        yy.K(718275824, (Object)KTsB.mXJp((PotionEffectType)yy.p(773915887)));
        yy.K(1428096190, (Object)KTsB.mXJp((PotionEffectType)yy.p(-1487403835)));
        yy.K(1555563716, (Object)KTsB.mXJp((PotionEffectType)yy.p(1434191043)));
        yy.K(-623573822, (Object)KTsB.mXJp((PotionEffectType)yy.p(-164690695)));
        yy.K(220792056, (Object)KTsB.mXJp((PotionEffectType)yy.p(-760216329)));
        yy.K(1313146054, (Object)KTsB.mXJp((PotionEffectType)yy.p(1383269581)));
        yy.K(-833944372, (Object)KTsB.mXJp((PotionEffectType)yy.p(1921189067)));
        yy.K(-588118838, (Object)KTsB.mXJp((PotionEffectType)yy.p(-1218181951)));
        yy.K(16778432, (Object)KTsB.mXJp((PotionEffectType)yy.p(-1633090369)));
        yy.K(474677774, (Object)KTsB.mXJp((PotionEffectType)yy.p(302580245)));
        yy.K(4325908, (Object)KTsB.mXJp((PotionEffectType)yy.p(1400701459)));
        yy.K(-1428225518, (Object)KTsB.mXJp((PotionEffectType)yy.p(-1093926391)));
        yy.K(1955267080, (Object)KTsB.mXJp((PotionEffectType)yy.p(1537475079)));
        yy.K(-1115225578, (Object)KTsB.mXJp((PotionEffectType)yy.p(-919862755)));
        yy.K(-1756757476, (Object)KTsB.mXJp((PotionEffectType)yy.p(-42270181)));
        yy.K(-194969062, (Object)KTsB.mXJp((PotionEffectType)yy.p(319160849)));
        yy.K(-1820261872, (Object)KTsB.mXJp((PotionEffectType)yy.p(240583183)));
        yy.K(-1390543138, (Object)KTsB.mXJp((PotionEffectType)yy.p(-1686372635)));
        yy.K(-1912537372, (Object)KTsB.mXJp((PotionEffectType)yy.p(-2144796957)));
        yy.K(410648290, (Object)KTsB.mXJp((PotionEffectType)yy.p(729350681)));
        yy.K(-604437992, (Object)KTsB.mXJp((PotionEffectType)yy.p(1740243479)));
    }

    public KTsB(Map<String, Object> map) {
        super(map);
    }

    public KTsB(PotionEffectType potionEffectType, int n, int n2, boolean bl, boolean bl2) {
        super(potionEffectType, n, n2, bl, bl2);
    }

    public KTsB(PotionEffectType potionEffectType, int n, int n2, boolean bl) {
        super(potionEffectType, n, n2, bl);
    }

    public KTsB(PotionEffectType potionEffectType, int n, int n2) {
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

    public static KTsB mXJp(PotionEffectType potionEffectType) {
        return new KTsB(potionEffectType, 1, 0, false, false);
    }

    public KTsB LFmP(int n) {
        return new KTsB(this.getType(), n, this.getAmplifier(), false, false);
    }

    public KTsB SCOk(int n) {
        return new KTsB(this.getType(), this.getDuration(), n, false, false);
    }

    public PotionEffect CVRb() {
        return new KTsB(this.getType(), this.getDuration(), this.getAmplifier(), false, false);
    }

    public void qdWJ(LivingEntity livingEntity) {
        livingEntity.addPotionEffect(new KTsB(this.getType(), this.getDuration(), this.getAmplifier(), false, false).CVRb());
    }

    public void JRFt(LivingEntity livingEntity) {
        livingEntity.addPotionEffect(new KTsB(this.getType(), this.getDuration(), this.getAmplifier(), false, false).CVRb(), true);
    }

    public void halY(LivingEntity livingEntity) {
        livingEntity.removePotionEffect(this.getType());
    }
}

