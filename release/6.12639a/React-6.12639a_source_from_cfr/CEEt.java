/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Random;

public class CEEt
extends OihG {
    protected static final double SQRT_3;
    protected static final double SQRT_5;
    protected static final double F2;
    protected static final double G2;
    protected static final double G22;
    protected static final double F3 = 0.3333333333333333;
    protected static final double G3 = 0.16666666666666666;
    protected static final double F4;
    protected static final double G4;
    protected static final double G42;
    protected static final double G43;
    protected static final double G44;
    protected static final int[][] grad4;
    protected static final int[][] simplex;
    protected static double offsetW;
    private static final CEEt OIGE;

    static {
        o.w(-518827366, (double)CEEt.vJ(3.0));
        o.w(2136101529, (double)CEEt.vJ(5.0));
        o.w(-1456450920, 0.5 * ((Double)o.k(-518827366) - 1.0));
        double d = (3.0 - (Double)o.k(-518827366)) / 6.0;
        o.w(935219863, d);
        o.w(1950765718, d * 2.0 - 1.0);
        o.w(-1571466603, ((Double)o.k(2136101529) - 1.0) / 4.0);
        double d2 = (5.0 - (Double)o.k(2136101529)) / 20.0;
        o.w(-26062188, d2);
        o.w(-1952689517, d2 * 2.0);
        o.w(1260933890, (Double)o.k(-26062188) * 3.0);
        o.w(-125021439, (Double)o.k(-26062188) * 4.0 - 1.0);
        int[][] arrarrn = new int[32][];
        int[] arrn = new int[4];
        arrn[1] = 1;
        arrn[2] = 1;
        arrn[3] = 1;
        arrarrn[0] = arrn;
        int[] arrn2 = new int[4];
        arrn2[1] = 1;
        arrn2[2] = 1;
        arrn2[3] = -1;
        arrarrn[1] = arrn2;
        int[] arrn3 = new int[4];
        arrn3[1] = 1;
        arrn3[2] = -1;
        arrn3[3] = 1;
        arrarrn[2] = arrn3;
        int[] arrn4 = new int[4];
        arrn4[1] = 1;
        arrn4[2] = -1;
        arrn4[3] = -1;
        arrarrn[3] = arrn4;
        int[] arrn5 = new int[4];
        arrn5[1] = -1;
        arrn5[2] = 1;
        arrn5[3] = 1;
        arrarrn[4] = arrn5;
        int[] arrn6 = new int[4];
        arrn6[1] = -1;
        arrn6[2] = 1;
        arrn6[3] = -1;
        arrarrn[5] = arrn6;
        int[] arrn7 = new int[4];
        arrn7[1] = -1;
        arrn7[2] = -1;
        arrn7[3] = 1;
        arrarrn[6] = arrn7;
        int[] arrn8 = new int[4];
        arrn8[1] = -1;
        arrn8[2] = -1;
        arrn8[3] = -1;
        arrarrn[7] = arrn8;
        int[] arrn9 = new int[4];
        arrn9[0] = 1;
        arrn9[2] = 1;
        arrn9[3] = 1;
        arrarrn[8] = arrn9;
        int[] arrn10 = new int[4];
        arrn10[0] = 1;
        arrn10[2] = 1;
        arrn10[3] = -1;
        arrarrn[9] = arrn10;
        int[] arrn11 = new int[4];
        arrn11[0] = 1;
        arrn11[2] = -1;
        arrn11[3] = 1;
        arrarrn[10] = arrn11;
        int[] arrn12 = new int[4];
        arrn12[0] = 1;
        arrn12[2] = -1;
        arrn12[3] = -1;
        arrarrn[11] = arrn12;
        int[] arrn13 = new int[4];
        arrn13[0] = -1;
        arrn13[2] = 1;
        arrn13[3] = 1;
        arrarrn[12] = arrn13;
        int[] arrn14 = new int[4];
        arrn14[0] = -1;
        arrn14[2] = 1;
        arrn14[3] = -1;
        arrarrn[13] = arrn14;
        int[] arrn15 = new int[4];
        arrn15[0] = -1;
        arrn15[2] = -1;
        arrn15[3] = 1;
        arrarrn[14] = arrn15;
        int[] arrn16 = new int[4];
        arrn16[0] = -1;
        arrn16[2] = -1;
        arrn16[3] = -1;
        arrarrn[15] = arrn16;
        int[] arrn17 = new int[4];
        arrn17[0] = 1;
        arrn17[1] = 1;
        arrn17[3] = 1;
        arrarrn[16] = arrn17;
        int[] arrn18 = new int[4];
        arrn18[0] = 1;
        arrn18[1] = 1;
        arrn18[3] = -1;
        arrarrn[17] = arrn18;
        int[] arrn19 = new int[4];
        arrn19[0] = 1;
        arrn19[1] = -1;
        arrn19[3] = 1;
        arrarrn[18] = arrn19;
        int[] arrn20 = new int[4];
        arrn20[0] = 1;
        arrn20[1] = -1;
        arrn20[3] = -1;
        arrarrn[19] = arrn20;
        int[] arrn21 = new int[4];
        arrn21[0] = -1;
        arrn21[1] = 1;
        arrn21[3] = 1;
        arrarrn[20] = arrn21;
        int[] arrn22 = new int[4];
        arrn22[0] = -1;
        arrn22[1] = 1;
        arrn22[3] = -1;
        arrarrn[21] = arrn22;
        int[] arrn23 = new int[4];
        arrn23[0] = -1;
        arrn23[1] = -1;
        arrn23[3] = 1;
        arrarrn[22] = arrn23;
        int[] arrn24 = new int[4];
        arrn24[0] = -1;
        arrn24[1] = -1;
        arrn24[3] = -1;
        arrarrn[23] = arrn24;
        int[] arrn25 = new int[4];
        arrn25[0] = 1;
        arrn25[1] = 1;
        arrn25[2] = 1;
        arrarrn[24] = arrn25;
        int[] arrn26 = new int[4];
        arrn26[0] = 1;
        arrn26[1] = 1;
        arrn26[2] = -1;
        arrarrn[25] = arrn26;
        int[] arrn27 = new int[4];
        arrn27[0] = 1;
        arrn27[1] = -1;
        arrn27[2] = 1;
        arrarrn[26] = arrn27;
        int[] arrn28 = new int[4];
        arrn28[0] = 1;
        arrn28[1] = -1;
        arrn28[2] = -1;
        arrarrn[27] = arrn28;
        int[] arrn29 = new int[4];
        arrn29[0] = -1;
        arrn29[1] = 1;
        arrn29[2] = 1;
        arrarrn[28] = arrn29;
        int[] arrn30 = new int[4];
        arrn30[0] = -1;
        arrn30[1] = 1;
        arrn30[2] = -1;
        arrarrn[29] = arrn30;
        int[] arrn31 = new int[4];
        arrn31[0] = -1;
        arrn31[1] = -1;
        arrn31[2] = 1;
        arrarrn[30] = arrn31;
        int[] arrn32 = new int[4];
        arrn32[0] = -1;
        arrn32[1] = -1;
        arrn32[2] = -1;
        arrarrn[31] = arrn32;
        o.w(-1765846272, arrarrn);
        int[][] arrarrn2 = new int[64][];
        int[] arrn33 = new int[4];
        arrn33[1] = 1;
        arrn33[2] = 2;
        arrn33[3] = 3;
        arrarrn2[0] = arrn33;
        int[] arrn34 = new int[4];
        arrn34[1] = 1;
        arrn34[2] = 3;
        arrn34[3] = 2;
        arrarrn2[1] = arrn34;
        arrarrn2[2] = new int[4];
        int[] arrn35 = new int[4];
        arrn35[1] = 2;
        arrn35[2] = 3;
        arrn35[3] = 1;
        arrarrn2[3] = arrn35;
        arrarrn2[4] = new int[4];
        arrarrn2[5] = new int[4];
        arrarrn2[6] = new int[4];
        int[] arrn36 = new int[4];
        arrn36[0] = 1;
        arrn36[1] = 2;
        arrn36[2] = 3;
        arrarrn2[7] = arrn36;
        int[] arrn37 = new int[4];
        arrn37[1] = 2;
        arrn37[2] = 1;
        arrn37[3] = 3;
        arrarrn2[8] = arrn37;
        arrarrn2[9] = new int[4];
        int[] arrn38 = new int[4];
        arrn38[1] = 3;
        arrn38[2] = 1;
        arrn38[3] = 2;
        arrarrn2[10] = arrn38;
        int[] arrn39 = new int[4];
        arrn39[1] = 3;
        arrn39[2] = 2;
        arrn39[3] = 1;
        arrarrn2[11] = arrn39;
        arrarrn2[12] = new int[4];
        arrarrn2[13] = new int[4];
        arrarrn2[14] = new int[4];
        int[] arrn40 = new int[4];
        arrn40[0] = 1;
        arrn40[1] = 3;
        arrn40[2] = 2;
        arrarrn2[15] = arrn40;
        arrarrn2[16] = new int[4];
        arrarrn2[17] = new int[4];
        arrarrn2[18] = new int[4];
        arrarrn2[19] = new int[4];
        arrarrn2[20] = new int[4];
        arrarrn2[21] = new int[4];
        arrarrn2[22] = new int[4];
        arrarrn2[23] = new int[4];
        int[] arrn41 = new int[4];
        arrn41[0] = 1;
        arrn41[1] = 2;
        arrn41[3] = 3;
        arrarrn2[24] = arrn41;
        arrarrn2[25] = new int[4];
        int[] arrn42 = new int[4];
        arrn42[0] = 1;
        arrn42[1] = 3;
        arrn42[3] = 2;
        arrarrn2[26] = arrn42;
        arrarrn2[27] = new int[4];
        arrarrn2[28] = new int[4];
        arrarrn2[29] = new int[4];
        int[] arrn43 = new int[4];
        arrn43[0] = 2;
        arrn43[1] = 3;
        arrn43[3] = 1;
        arrarrn2[30] = arrn43;
        int[] arrn44 = new int[4];
        arrn44[0] = 2;
        arrn44[1] = 3;
        arrn44[2] = 1;
        arrarrn2[31] = arrn44;
        int[] arrn45 = new int[4];
        arrn45[0] = 1;
        arrn45[2] = 2;
        arrn45[3] = 3;
        arrarrn2[32] = arrn45;
        int[] arrn46 = new int[4];
        arrn46[0] = 1;
        arrn46[2] = 3;
        arrn46[3] = 2;
        arrarrn2[33] = arrn46;
        arrarrn2[34] = new int[4];
        arrarrn2[35] = new int[4];
        arrarrn2[36] = new int[4];
        int[] arrn47 = new int[4];
        arrn47[0] = 2;
        arrn47[2] = 3;
        arrn47[3] = 1;
        arrarrn2[37] = arrn47;
        arrarrn2[38] = new int[4];
        int[] arrn48 = new int[4];
        arrn48[0] = 2;
        arrn48[1] = 1;
        arrn48[2] = 3;
        arrarrn2[39] = arrn48;
        arrarrn2[40] = new int[4];
        arrarrn2[41] = new int[4];
        arrarrn2[42] = new int[4];
        arrarrn2[43] = new int[4];
        arrarrn2[44] = new int[4];
        arrarrn2[45] = new int[4];
        arrarrn2[46] = new int[4];
        arrarrn2[47] = new int[4];
        int[] arrn49 = new int[4];
        arrn49[0] = 2;
        arrn49[2] = 1;
        arrn49[3] = 3;
        arrarrn2[48] = arrn49;
        arrarrn2[49] = new int[4];
        arrarrn2[50] = new int[4];
        arrarrn2[51] = new int[4];
        int[] arrn50 = new int[4];
        arrn50[0] = 3;
        arrn50[2] = 1;
        arrn50[3] = 2;
        arrarrn2[52] = arrn50;
        int[] arrn51 = new int[4];
        arrn51[0] = 3;
        arrn51[2] = 2;
        arrn51[3] = 1;
        arrarrn2[53] = arrn51;
        arrarrn2[54] = new int[4];
        int[] arrn52 = new int[4];
        arrn52[0] = 3;
        arrn52[1] = 1;
        arrn52[2] = 2;
        arrarrn2[55] = arrn52;
        int[] arrn53 = new int[4];
        arrn53[0] = 2;
        arrn53[1] = 1;
        arrn53[3] = 3;
        arrarrn2[56] = arrn53;
        arrarrn2[57] = new int[4];
        arrarrn2[58] = new int[4];
        arrarrn2[59] = new int[4];
        int[] arrn54 = new int[4];
        arrn54[0] = 3;
        arrn54[1] = 1;
        arrn54[3] = 2;
        arrarrn2[60] = arrn54;
        arrarrn2[61] = new int[4];
        int[] arrn55 = new int[4];
        arrn55[0] = 3;
        arrn55[1] = 2;
        arrn55[3] = 1;
        arrarrn2[62] = arrn55;
        int[] arrn56 = new int[4];
        arrn56[0] = 3;
        arrn56[1] = 2;
        arrn56[2] = 1;
        arrarrn2[63] = arrn56;
        o.w(501961471, arrarrn2);
        o.w(49369854, new CEEt());
    }

    protected CEEt() {
    }

    public CEEt(long l) {
        this(new Random(l));
    }

    public CEEt(Random random) {
        super(random);
        o.w(-795258115, (double)(CEEt.vJ(random) * 256.0));
    }

    protected static double dot(int[] arrn, double d, double d2) {
        return (double)arrn[0] * d + (double)arrn[1] * d2;
    }

    protected static double dot(int[] arrn, double d, double d2, double d3) {
        return (double)arrn[0] * d + (double)arrn[1] * d2 + (double)arrn[2] * d3;
    }

    protected static double dot(int[] arrn, double d, double d2, double d3, double d4) {
        return (double)arrn[0] * d + (double)arrn[1] * d2 + (double)arrn[2] * d3 + (double)arrn[3] * d4;
    }

    public static double getNoise(double d) {
        return ((CEEt)o.k(49369854)).noise(d);
    }

    public static double getNoise(double d, double d2) {
        return ((CEEt)o.k(49369854)).noise(d, d2);
    }

    public static double getNoise(double d, double d2, double d3) {
        return ((CEEt)o.k(49369854)).noise(d, d2, d3);
    }

    public static double getNoise(double d, double d2, double d3, double d4) {
        return ((CEEt)o.k(49369854)).noise(d, d2, d3, d4);
    }

    @Override
    public double noise(double d, double d2, double d3) {
        int n;
        double d4;
        int n2;
        int n3;
        double d5;
        double d6;
        int n4;
        int n5;
        double d7;
        int n6;
        double d8 = ((d += ((Double)o.a(this, 754537212)).doubleValue()) + (d2 += ((Double)o.a(this, -1807592709)).doubleValue()) + (d3 += ((Double)o.a(this, 1901154954)).doubleValue())) * 0.3333333333333333;
        int n7 = CEEt.floor(d + d8);
        int n8 = CEEt.floor(d2 + d8);
        int n9 = CEEt.floor(d3 + d8);
        double d9 = (double)(n7 + n8 + n9) * 0.16666666666666666;
        double d10 = (double)n7 - d9;
        double d11 = (double)n8 - d9;
        double d12 = (double)n9 - d9;
        double d13 = d - d10;
        double d14 = d2 - d11;
        double d15 = d3 - d12;
        if (d13 >= d14) {
            if (d14 >= d15) {
                n3 = 1;
                n6 = 0;
                n = 0;
                n4 = 1;
                n5 = 1;
                n2 = 0;
            } else if (d13 >= d15) {
                n3 = 1;
                n6 = 0;
                n = 0;
                n4 = 1;
                n5 = 0;
                n2 = 1;
            } else {
                n3 = 0;
                n6 = 0;
                n = 1;
                n4 = 1;
                n5 = 0;
                n2 = 1;
            }
        } else if (d14 < d15) {
            n3 = 0;
            n6 = 0;
            n = 1;
            n4 = 0;
            n5 = 1;
            n2 = 1;
        } else if (d13 < d15) {
            n3 = 0;
            n6 = 1;
            n = 0;
            n4 = 0;
            n5 = 1;
            n2 = 1;
        } else {
            n3 = 0;
            n6 = 1;
            n = 0;
            n4 = 1;
            n5 = 1;
            n2 = 0;
        }
        double d16 = d13 - (double)n3 + 0.16666666666666666;
        double d17 = d14 - (double)n6 + 0.16666666666666666;
        double d18 = d15 - (double)n + 0.16666666666666666;
        double d19 = d13 - (double)n4 + 0.3333333333333333;
        double d20 = d14 - (double)n5 + 0.3333333333333333;
        double d21 = d15 - (double)n2 + 0.3333333333333333;
        double d22 = d13 - 1.0 + 0.5;
        double d23 = d14 - 1.0 + 0.5;
        double d24 = d15 - 1.0 + 0.5;
        int n10 = n7 & 255;
        int n11 = n8 & 255;
        int n12 = n9 & 255;
        int n13 = ((int[])o.a(this, 385176201))[n10 + ((int[])o.a(this, 385176201))[n11 + ((int[])o.a(this, 385176201))[n12]]] % 12;
        int n14 = ((int[])o.a(this, 385176201))[n10 + n3 + ((int[])o.a(this, 385176201))[n11 + n6 + ((int[])o.a(this, 385176201))[n12 + n]]] % 12;
        int n15 = ((int[])o.a(this, 385176201))[n10 + n4 + ((int[])o.a(this, 385176201))[n11 + n5 + ((int[])o.a(this, 385176201))[n12 + n2]]] % 12;
        int n16 = ((int[])o.a(this, 385176201))[n10 + 1 + ((int[])o.a(this, 385176201))[n11 + 1 + ((int[])o.a(this, 385176201))[n12 + 1]]] % 12;
        double d25 = 0.6 - d13 * d13 - d14 * d14 - d15 * d15;
        if (d25 < 0.0) {
            d7 = 0.0;
        } else {
            d25 *= d25;
            d7 = d25 * d25 * CEEt.dot(((int[][])o.k(1137857160))[n13], d13, d14, d15);
        }
        double d26 = 0.6 - d16 * d16 - d17 * d17 - d18 * d18;
        if (d26 < 0.0) {
            d4 = 0.0;
        } else {
            d26 *= d26;
            d4 = d26 * d26 * CEEt.dot(((int[][])o.k(1137857160))[n14], d16, d17, d18);
        }
        double d27 = 0.6 - d19 * d19 - d20 * d20 - d21 * d21;
        if (d27 < 0.0) {
            d6 = 0.0;
        } else {
            d27 *= d27;
            d6 = d27 * d27 * CEEt.dot(((int[][])o.k(1137857160))[n15], d19, d20, d21);
        }
        double d28 = 0.6 - d22 * d22 - d23 * d23 - d24 * d24;
        if (d28 < 0.0) {
            d5 = 0.0;
        } else {
            d28 *= d28;
            d5 = d28 * d28 * CEEt.dot(((int[][])o.k(1137857160))[n16], d22, d23, d24);
        }
        return 32.0 * (d7 + d4 + d6 + d5);
    }

    @Override
    public double noise(double d, double d2) {
        double d3;
        double d4;
        int n;
        double d5;
        double d6;
        double d7;
        double d8;
        int n2;
        double d9;
        double d10;
        double d11;
        int n3;
        int n4;
        if ((d6 = (d += ((Double)o.a(this, 754537212)).doubleValue()) - (d10 = (double)(n4 = CEEt.floor(d + (d9 = (d + (d2 += ((Double)o.a(this, -1807592709)).doubleValue())) * (Double)o.k(-1456450920)))) - (d8 = (double)(n4 + (n2 = CEEt.floor(d2 + d9))) * (Double)o.k(935219863)))) > (d4 = d2 - (d5 = (double)n2 - d8))) {
            n3 = 1;
            n = 0;
        } else {
            n3 = 0;
            n = 1;
        }
        double d12 = d6 - (double)n3 + (Double)o.k(935219863);
        double d13 = d4 - (double)n + (Double)o.k(935219863);
        double d14 = d6 + (Double)o.k(1950765718);
        double d15 = d4 + (Double)o.k(1950765718);
        int n5 = n4 & 255;
        int n6 = n2 & 255;
        int n7 = ((int[])o.a(this, 385176201))[n5 + ((int[])o.a(this, 385176201))[n6]] % 12;
        int n8 = ((int[])o.a(this, 385176201))[n5 + n3 + ((int[])o.a(this, 385176201))[n6 + n]] % 12;
        int n9 = ((int[])o.a(this, 385176201))[n5 + 1 + ((int[])o.a(this, 385176201))[n6 + 1]] % 12;
        double d16 = 0.5 - d6 * d6 - d4 * d4;
        if (d16 < 0.0) {
            d3 = 0.0;
        } else {
            d16 *= d16;
            d3 = d16 * d16 * CEEt.dot(((int[][])o.k(1137857160))[n7], d6, d4);
        }
        double d17 = 0.5 - d12 * d12 - d13 * d13;
        if (d17 < 0.0) {
            d7 = 0.0;
        } else {
            d17 *= d17;
            d7 = d17 * d17 * CEEt.dot(((int[][])o.k(1137857160))[n8], d12, d13);
        }
        double d18 = 0.5 - d14 * d14 - d15 * d15;
        if (d18 < 0.0) {
            d11 = 0.0;
        } else {
            d18 *= d18;
            d11 = d18 * d18 * CEEt.dot(((int[][])o.k(1137857160))[n9], d14, d15);
        }
        return 70.0 * (d3 + d7 + d11);
    }

    public double noise(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10 = ((d += ((Double)o.a(this, 754537212)).doubleValue()) + (d2 += ((Double)o.a(this, -1807592709)).doubleValue()) + (d3 += ((Double)o.a(this, 1901154954)).doubleValue()) + (d4 += ((Double)o.k(-795258115)).doubleValue())) * (Double)o.k(-1571466603);
        int n = CEEt.floor(d + d10);
        int n2 = CEEt.floor(d2 + d10);
        int n3 = CEEt.floor(d3 + d10);
        int n4 = CEEt.floor(d4 + d10);
        double d11 = (double)(n + n2 + n3 + n4) * (Double)o.k(-26062188);
        double d12 = (double)n - d11;
        double d13 = (double)n2 - d11;
        double d14 = (double)n3 - d11;
        double d15 = (double)n4 - d11;
        double d16 = d - d12;
        double d17 = d2 - d13;
        double d18 = d3 - d14;
        double d19 = d4 - d15;
        int n5 = d16 > d17 ? 32 : 0;
        int n6 = d16 > d18 ? 16 : 0;
        int n7 = d17 > d18 ? 8 : 0;
        int n8 = d16 > d19 ? 4 : 0;
        int n9 = d17 > d19 ? 2 : 0;
        int n10 = d18 > d19 ? 1 : 0;
        int n11 = n5 + n6 + n7 + n8 + n9 + n10;
        int n12 = ((int[][])o.k(501961471))[n11][0] >= 3 ? 1 : 0;
        int n13 = ((int[][])o.k(501961471))[n11][1] >= 3 ? 1 : 0;
        int n14 = ((int[][])o.k(501961471))[n11][2] >= 3 ? 1 : 0;
        int n15 = ((int[][])o.k(501961471))[n11][3] >= 3 ? 1 : 0;
        int n16 = ((int[][])o.k(501961471))[n11][0] >= 2 ? 1 : 0;
        int n17 = ((int[][])o.k(501961471))[n11][1] >= 2 ? 1 : 0;
        int n18 = ((int[][])o.k(501961471))[n11][2] >= 2 ? 1 : 0;
        int n19 = ((int[][])o.k(501961471))[n11][3] >= 2 ? 1 : 0;
        int n20 = ((int[][])o.k(501961471))[n11][0] > 0 ? 1 : 0;
        int n21 = ((int[][])o.k(501961471))[n11][1] > 0 ? 1 : 0;
        int n22 = ((int[][])o.k(501961471))[n11][2] > 0 ? 1 : 0;
        int n23 = ((int[][])o.k(501961471))[n11][3] > 0 ? 1 : 0;
        double d20 = d16 - (double)n12 + (Double)o.k(-26062188);
        double d21 = d17 - (double)n13 + (Double)o.k(-26062188);
        double d22 = d18 - (double)n14 + (Double)o.k(-26062188);
        double d23 = d19 - (double)n15 + (Double)o.k(-26062188);
        double d24 = d16 - (double)n16 + (Double)o.k(-1952689517);
        double d25 = d17 - (double)n17 + (Double)o.k(-1952689517);
        double d26 = d18 - (double)n18 + (Double)o.k(-1952689517);
        double d27 = d19 - (double)n19 + (Double)o.k(-1952689517);
        double d28 = d16 - (double)n20 + (Double)o.k(1260933890);
        double d29 = d17 - (double)n21 + (Double)o.k(1260933890);
        double d30 = d18 - (double)n22 + (Double)o.k(1260933890);
        double d31 = d19 - (double)n23 + (Double)o.k(1260933890);
        double d32 = d16 + (Double)o.k(-125021439);
        double d33 = d17 + (Double)o.k(-125021439);
        double d34 = d18 + (Double)o.k(-125021439);
        double d35 = d19 + (Double)o.k(-125021439);
        int n24 = n & 255;
        int n25 = n2 & 255;
        int n26 = n3 & 255;
        int n27 = n4 & 255;
        int n28 = ((int[])o.a(this, 385176201))[n24 + ((int[])o.a(this, 385176201))[n25 + ((int[])o.a(this, 385176201))[n26 + ((int[])o.a(this, 385176201))[n27]]]] % 32;
        int n29 = ((int[])o.a(this, 385176201))[n24 + n12 + ((int[])o.a(this, 385176201))[n25 + n13 + ((int[])o.a(this, 385176201))[n26 + n14 + ((int[])o.a(this, 385176201))[n27 + n15]]]] % 32;
        int n30 = ((int[])o.a(this, 385176201))[n24 + n16 + ((int[])o.a(this, 385176201))[n25 + n17 + ((int[])o.a(this, 385176201))[n26 + n18 + ((int[])o.a(this, 385176201))[n27 + n19]]]] % 32;
        int n31 = ((int[])o.a(this, 385176201))[n24 + n20 + ((int[])o.a(this, 385176201))[n25 + n21 + ((int[])o.a(this, 385176201))[n26 + n22 + ((int[])o.a(this, 385176201))[n27 + n23]]]] % 32;
        int n32 = ((int[])o.a(this, 385176201))[n24 + 1 + ((int[])o.a(this, 385176201))[n25 + 1 + ((int[])o.a(this, 385176201))[n26 + 1 + ((int[])o.a(this, 385176201))[n27 + 1]]]] % 32;
        double d36 = 0.6 - d16 * d16 - d17 * d17 - d18 * d18 - d19 * d19;
        if (d36 < 0.0) {
            d8 = 0.0;
        } else {
            d36 *= d36;
            d8 = d36 * d36 * CEEt.dot(((int[][])o.k(-1765846272))[n28], d16, d17, d18, d19);
        }
        double d37 = 0.6 - d20 * d20 - d21 * d21 - d22 * d22 - d23 * d23;
        if (d37 < 0.0) {
            d9 = 0.0;
        } else {
            d37 *= d37;
            d9 = d37 * d37 * CEEt.dot(((int[][])o.k(-1765846272))[n29], d20, d21, d22, d23);
        }
        double d38 = 0.6 - d24 * d24 - d25 * d25 - d26 * d26 - d27 * d27;
        if (d38 < 0.0) {
            d5 = 0.0;
        } else {
            d38 *= d38;
            d5 = d38 * d38 * CEEt.dot(((int[][])o.k(-1765846272))[n30], d24, d25, d26, d27);
        }
        double d39 = 0.6 - d28 * d28 - d29 * d29 - d30 * d30 - d31 * d31;
        if (d39 < 0.0) {
            d6 = 0.0;
        } else {
            d39 *= d39;
            d6 = d39 * d39 * CEEt.dot(((int[][])o.k(-1765846272))[n31], d28, d29, d30, d31);
        }
        double d40 = 0.6 - d32 * d32 - d33 * d33 - d34 * d34 - d35 * d35;
        if (d40 < 0.0) {
            d7 = 0.0;
        } else {
            d40 *= d40;
            d7 = d40 * d40 * CEEt.dot(((int[][])o.k(-1765846272))[n32], d32, d33, d34, d35);
        }
        return 27.0 * (d8 + d9 + d5 + d6 + d7);
    }

    public static CEEt ofcq() {
        return (CEEt)o.k(49369854);
    }

    private static Object vJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

