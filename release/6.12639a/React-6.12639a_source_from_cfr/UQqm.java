/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.map.MapFont
 */
import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.map.MapFont;

public class UQqm {
    private byte[][] CyYL;
    private int width;
    private int height;

    public UQqm() {
        this(128, 128);
    }

    public UQqm(int n, int n2) {
        this.width = n;
        this.height = n2;
        this.CyYL = new byte[n][n2];
        this.KTiK(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void yJLS(int n, int n2, MapFont mapFont, byte by, String string) {
        int n3 = n;
        Object object = by;
        if (UQqm.sI(mapFont, string) == false) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u8950\uafbc\ubf77\u77d3\ufaa4\ue792\u57c0\ub2ca\u9d4a\ue40f\ud4fb\u7313\ucf87\u64f0\u2e21\u6b43\u1baa\u812b\u0963\uf85f\u7627\u0a53\ubd3e\uc7e7\u86c3\ude72\u508a\ub270\u8e74\u77ae\u32dd\ubc6f"));
        }
        Object object2 = 0;
        while (object2 < UQqm.sI(string)) {
            block11 : {
                Object object3 = UQqm.sI(string, object2);
                if (object3 == 10) {
                    n = n3;
                    n2 += UQqm.sI(mapFont) + true;
                } else {
                    if (object3 == 167) {
                        Object object4 = UQqm.sI(string, 59, object2);
                        if (object4 >= 0) {
                            try {
                                object = UQqm.sI(UQqm.sI(string, object2 + 1, object4));
                                object2 = object4;
                                break block11;
                            }
                            catch (NumberFormatException numberFormatException) {
                                // empty catch block
                            }
                        }
                    }
                    Object object5 = UQqm.sI(mapFont, UQqm.sI(string, object2));
                    int n4 = 0;
                    while (n4 < UQqm.sI(mapFont)) {
                        int n5 = 0;
                        while (n5 < UQqm.sI(object5)) {
                            if (UQqm.sI(object5, n4, n5) != false) {
                                this.yJLS(n + n5, n2 + n4, (byte)object);
                            }
                            ++n5;
                        }
                        ++n4;
                    }
                    n += UQqm.sI(object5) + true;
                }
            }
            ++object2;
        }
    }

    public void KTiK(byte by) {
        int n = 0;
        while (n < (Integer)o.a(this, -1915136239)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, 1789155090)) {
                this.yJLS(n, n2, by);
                ++n2;
            }
            ++n;
        }
    }

    public UQqm yJLS(double d, double d2, int n) {
        BufferedImage bufferedImage = this.WaLc();
        Object object = UQqm.sI(bufferedImage);
        Object object2 = UQqm.sI(bufferedImage);
        Object object3 = new BufferedImage((int)((Object)object * d), (int)((Object)object2 * d2), 2);
        AffineTransform affineTransform = new AffineTransform();
        UQqm.sI(affineTransform, d, d2);
        AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, n);
        object3 = UQqm.sI(affineTransformOp, bufferedImage, object3);
        UQqm uQqm = new UQqm((int)UQqm.sI(object3), (int)UQqm.sI(object3));
        uQqm.yJLS((BufferedImage)object3);
        return uQqm;
    }

    public void yJLS(BufferedImage bufferedImage) {
        int n = 0;
        while (n < (Integer)o.a(this, -1915136239)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, 1789155090)) {
                this.yJLS(n, n2, (byte)UQqm.sI(new Color((int)UQqm.sI(bufferedImage, n, n2), true)));
                ++n2;
            }
            ++n;
        }
    }

    public BufferedImage WaLc() {
        BufferedImage bufferedImage = new BufferedImage(this.getWidth(), this.getHeight(), 2);
        int n = 0;
        while (n < (Integer)o.a(this, -1915136239)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, 1789155090)) {
                Object object = UQqm.sI(((byte[][])o.a(this, 969955083))[n][n2]);
                UQqm.sI(bufferedImage, n, n2, UQqm.sI(new Color((int)UQqm.sI(object), (int)UQqm.sI(object), (int)UQqm.sI(object), (int)UQqm.sI(object))));
                ++n2;
            }
            ++n;
        }
        return bufferedImage;
    }

    public void EShD() {
        int n = 0;
        while (n < (Integer)o.a(this, -1915136239)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, 1789155090)) {
                this.yJLS(n, n2, (byte)UQqm.sI(UQqm.sI((float)(n * n2) / (float)((Integer)o.a(this, -1915136239) * (Integer)o.a(this, 1789155090)), 1.0f, 1.0f)));
                ++n2;
            }
            ++n;
        }
    }

    public void ncmw() {
        int n = 0;
        while (n < (Integer)o.a(this, -1915136239)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, 1789155090)) {
                this.yJLS(n, n2, (byte)UQqm.sI(UQqm.sI((float)(n + n2) / (float)((Integer)o.a(this, -1915136239) + (Integer)o.a(this, 1789155090)), 1.0f, 1.0f)));
                ++n2;
            }
            ++n;
        }
    }

    public void Mtpq() {
        int n = 0;
        while (n < (Integer)o.a(this, -1915136239)) {
            int n2 = 0;
            while (n2 < (Integer)o.a(this, 1789155090)) {
                if (UQqm.sI(UQqm.sI(0.05)) != false) {
                    this.yJLS(n, n2, 32);
                }
                ++n2;
            }
            ++n;
        }
    }

    public boolean yJLS(int n, int n2, byte by) {
        block3 : {
            block2 : {
                if ((Object)UQqm.sI(n, 0.0, (Integer)o.a(this, -1915136239) - 1) != n) break block2;
                if ((Object)UQqm.sI(n2, 0.0, (Integer)o.a(this, 1789155090) - 1) == n2) break block3;
            }
            return false;
        }
        ((byte[][])o.a((Object)this, (int)969955083))[(Object)UQqm.sI((double)n, 0.0, (double)(((Integer)o.a((Object)this, (int)-1915136239)).intValue() - 1))][(Object)UQqm.sI((double)n2, 0.0, (double)(((Integer)o.a((Object)this, (int)1789155090)).intValue() - 1))] = by;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int yJLS(UQqm var1_1, int var2_2, int var3_3) {
        var4_4 = 0;
        var5_5 = var1_1.NVRU();
        var6_6 = 0;
        ** GOTO lbl16
lbl-1000: // 1 sources:
        {
            var7_7 = 0;
            ** GOTO lbl12
lbl-1000: // 1 sources:
            {
                if (var5_5[var6_6][var7_7] != 0 && this.yJLS(var6_6 + var2_2, var7_7 + var3_3, var5_5[var6_6][var7_7])) {
                    ++var4_4;
                }
                ++var7_7;
lbl12: // 2 sources:
                ** while (var7_7 < UQqm.sI(new int[]{var1_1.getHeight(), this.getHeight()}))
            }
lbl13: // 1 sources:
            ++var6_6;
lbl16: // 2 sources:
            ** while (var6_6 < UQqm.sI(new int[]{var1_1.getWidth(), this.getWidth()}))
        }
lbl17: // 1 sources:
        return var4_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void VwLY(UQqm var1_1) {
        var2_2 = var1_1.NVRU();
        var3_3 = 0;
        ** GOTO lbl15
lbl-1000: // 1 sources:
        {
            var4_4 = 0;
            ** GOTO lbl11
lbl-1000: // 1 sources:
            {
                if (var2_2[var3_3][var4_4] != 0) {
                    this.yJLS(var3_3, var4_4, var2_2[var3_3][var4_4]);
                }
                ++var4_4;
lbl11: // 2 sources:
                ** while (var4_4 < UQqm.sI(new int[]{var1_1.getHeight(), this.getHeight()}))
            }
lbl12: // 1 sources:
            ++var3_3;
lbl15: // 2 sources:
            ** while (var3_3 < UQqm.sI(new int[]{var1_1.getWidth(), this.getWidth()}))
        }
lbl16: // 1 sources:
    }

    public byte[][] NVRU() {
        return (byte[][])o.a(this, 969955083);
    }

    public int getWidth() {
        return (Integer)o.a(this, -1915136239);
    }

    public int getHeight() {
        return (Integer)o.a(this, 1789155090);
    }

    private static Object sI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

