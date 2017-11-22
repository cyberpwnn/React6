/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Random;

public class iSqp
extends RbOr {
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
    private static final iSqp MBST;

    protected iSqp() {
    }

    public iSqp(long l) {
        this(new Random(l));
    }

    public iSqp(Random random) {
        super(random);
        cv.V(150605907, (double)(iSqp.xX(random) * 256.0));
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
        return ((iSqp)cv.e(22089810)).noise(d);
    }

    public static double getNoise(double d, double d2) {
        return ((iSqp)cv.e(22089810)).noise(d, d2);
    }

    public static double getNoise(double d, double d2, double d3) {
        return ((iSqp)cv.e(22089810)).noise(d, d2, d3);
    }

    public static double getNoise(double d, double d2, double d3, double d4) {
        return ((iSqp)cv.e(22089810)).noise(d, d2, d3, d4);
    }

    @Override
    public double noise(double d, double d2, double d3) {
        double d4;
        int n;
        int n2;
        int n3;
        int n4;
        double d5;
        int n5;
        double d6;
        double d7;
        int n6;
        double d8 = ((d += ((Double)cv.b(this, -482602915)).doubleValue()) + (d2 += ((Double)cv.b(this, 89591900)).doubleValue()) + (d3 += ((Double)cv.b(this, -179433377)).doubleValue())) * 0.3333333333333333;
        int n7 = iSqp.floor(d + d8);
        int n8 = iSqp.floor(d2 + d8);
        int n9 = iSqp.floor(d3 + d8);
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
                n5 = 0;
                n = 0;
                n2 = 1;
                n6 = 1;
                n4 = 0;
            } else if (d13 >= d15) {
                n3 = 1;
                n5 = 0;
                n = 0;
                n2 = 1;
                n6 = 0;
                n4 = 1;
            } else {
                n3 = 0;
                n5 = 0;
                n = 1;
                n2 = 1;
                n6 = 0;
                n4 = 1;
            }
        } else if (d14 < d15) {
            n3 = 0;
            n5 = 0;
            n = 1;
            n2 = 0;
            n6 = 1;
            n4 = 1;
        } else if (d13 < d15) {
            n3 = 0;
            n5 = 1;
            n = 0;
            n2 = 0;
            n6 = 1;
            n4 = 1;
        } else {
            n3 = 0;
            n5 = 1;
            n = 0;
            n2 = 1;
            n6 = 1;
            n4 = 0;
        }
        double d16 = d13 - (double)n3 + 0.16666666666666666;
        double d17 = d14 - (double)n5 + 0.16666666666666666;
        double d18 = d15 - (double)n + 0.16666666666666666;
        double d19 = d13 - (double)n2 + 0.3333333333333333;
        double d20 = d14 - (double)n6 + 0.3333333333333333;
        double d21 = d15 - (double)n4 + 0.3333333333333333;
        double d22 = d13 - 1.0 + 0.5;
        double d23 = d14 - 1.0 + 0.5;
        double d24 = d15 - 1.0 + 0.5;
        int n10 = n7 & 255;
        int n11 = n8 & 255;
        int n12 = n9 & 255;
        int n13 = ((int[])cv.b(this, 753012830))[n10 + ((int[])cv.b(this, 753012830))[n11 + ((int[])cv.b(this, 753012830))[n12]]] % 12;
        int n14 = ((int[])cv.b(this, 753012830))[n10 + n3 + ((int[])cv.b(this, 753012830))[n11 + n5 + ((int[])cv.b(this, 753012830))[n12 + n]]] % 12;
        int n15 = ((int[])cv.b(this, 753012830))[n10 + n2 + ((int[])cv.b(this, 753012830))[n11 + n6 + ((int[])cv.b(this, 753012830))[n12 + n4]]] % 12;
        int n16 = ((int[])cv.b(this, 753012830))[n10 + 1 + ((int[])cv.b(this, 753012830))[n11 + 1 + ((int[])cv.b(this, 753012830))[n12 + 1]]] % 12;
        double d25 = 0.6 - d13 * d13 - d14 * d14 - d15 * d15;
        if (d25 < 0.0) {
            d4 = 0.0;
        } else {
            d25 *= d25;
            d4 = d25 * d25 * iSqp.dot(((int[][])cv.e(-1256583079))[n13], d13, d14, d15);
        }
        double d26 = 0.6 - d16 * d16 - d17 * d17 - d18 * d18;
        if (d26 < 0.0) {
            d7 = 0.0;
        } else {
            d26 *= d26;
            d7 = d26 * d26 * iSqp.dot(((int[][])cv.e(-1256583079))[n14], d16, d17, d18);
        }
        double d27 = 0.6 - d19 * d19 - d20 * d20 - d21 * d21;
        if (d27 < 0.0) {
            d6 = 0.0;
        } else {
            d27 *= d27;
            d6 = d27 * d27 * iSqp.dot(((int[][])cv.e(-1256583079))[n15], d19, d20, d21);
        }
        double d28 = 0.6 - d22 * d22 - d23 * d23 - d24 * d24;
        if (d28 < 0.0) {
            d5 = 0.0;
        } else {
            d28 *= d28;
            d5 = d28 * d28 * iSqp.dot(((int[][])cv.e(-1256583079))[n16], d22, d23, d24);
        }
        return 32.0 * (d4 + d7 + d6 + d5);
    }

    @Override
    public double noise(double d, double d2) {
        int n;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        int n2;
        int n3;
        double d11;
        int n4;
        if ((d6 = (d += ((Double)cv.b(this, -482602915)).doubleValue()) - (d4 = (double)(n4 = iSqp.floor(d + (d5 = (d + (d2 += ((Double)cv.b(this, 89591900)).doubleValue())) * (Double)cv.e(545263768)))) - (d10 = (double)(n4 + (n2 = iSqp.floor(d2 + d5))) * (Double)cv.e(1586434203)))) > (d9 = d2 - (d8 = (double)n2 - d10))) {
            n3 = 1;
            n = 0;
        } else {
            n3 = 0;
            n = 1;
        }
        double d12 = d6 - (double)n3 + (Double)cv.e(1586434203);
        double d13 = d9 - (double)n + (Double)cv.e(1586434203);
        double d14 = d6 + (Double)cv.e(-185003878);
        double d15 = d9 + (Double)cv.e(-185003878);
        int n5 = n4 & 255;
        int n6 = n2 & 255;
        int n7 = ((int[])cv.b(this, 753012830))[n5 + ((int[])cv.b(this, 753012830))[n6]] % 12;
        int n8 = ((int[])cv.b(this, 753012830))[n5 + n3 + ((int[])cv.b(this, 753012830))[n6 + n]] % 12;
        int n9 = ((int[])cv.b(this, 753012830))[n5 + 1 + ((int[])cv.b(this, 753012830))[n6 + 1]] % 12;
        double d16 = 0.5 - d6 * d6 - d9 * d9;
        if (d16 < 0.0) {
            d11 = 0.0;
        } else {
            d16 *= d16;
            d11 = d16 * d16 * iSqp.dot(((int[][])cv.e(-1256583079))[n7], d6, d9);
        }
        double d17 = 0.5 - d12 * d12 - d13 * d13;
        if (d17 < 0.0) {
            d3 = 0.0;
        } else {
            d17 *= d17;
            d3 = d17 * d17 * iSqp.dot(((int[][])cv.e(-1256583079))[n8], d12, d13);
        }
        double d18 = 0.5 - d14 * d14 - d15 * d15;
        if (d18 < 0.0) {
            d7 = 0.0;
        } else {
            d18 *= d18;
            d7 = d18 * d18 * iSqp.dot(((int[][])cv.e(-1256583079))[n9], d14, d15);
        }
        return 70.0 * (d11 + d3 + d7);
    }

    public double noise(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10 = ((d += ((Double)cv.b(this, -482602915)).doubleValue()) + (d2 += ((Double)cv.b(this, 89591900)).doubleValue()) + (d3 += ((Double)cv.b(this, -179433377)).doubleValue()) + (d4 += ((Double)cv.e(150605907)).doubleValue())) * (Double)cv.e(-693956475);
        int n = iSqp.floor(d + d10);
        int n2 = iSqp.floor(d2 + d10);
        int n3 = iSqp.floor(d3 + d10);
        int n4 = iSqp.floor(d4 + d10);
        double d11 = (double)(n + n2 + n3 + n4) * (Double)cv.e(1609502852);
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
        int n12 = ((int[][])cv.e(1929711751))[n11][0] >= 3 ? 1 : 0;
        int n13 = ((int[][])cv.e(1929711751))[n11][1] >= 3 ? 1 : 0;
        int n14 = ((int[][])cv.e(1929711751))[n11][2] >= 3 ? 1 : 0;
        int n15 = ((int[][])cv.e(1929711751))[n11][3] >= 3 ? 1 : 0;
        int n16 = ((int[][])cv.e(1929711751))[n11][0] >= 2 ? 1 : 0;
        int n17 = ((int[][])cv.e(1929711751))[n11][1] >= 2 ? 1 : 0;
        int n18 = ((int[][])cv.e(1929711751))[n11][2] >= 2 ? 1 : 0;
        int n19 = ((int[][])cv.e(1929711751))[n11][3] >= 2 ? 1 : 0;
        int n20 = ((int[][])cv.e(1929711751))[n11][0] > 0 ? 1 : 0;
        int n21 = ((int[][])cv.e(1929711751))[n11][1] > 0 ? 1 : 0;
        int n22 = ((int[][])cv.e(1929711751))[n11][2] > 0 ? 1 : 0;
        int n23 = ((int[][])cv.e(1929711751))[n11][3] > 0 ? 1 : 0;
        double d20 = d16 - (double)n12 + (Double)cv.e(1609502852);
        double d21 = d17 - (double)n13 + (Double)cv.e(1609502852);
        double d22 = d18 - (double)n14 + (Double)cv.e(1609502852);
        double d23 = d19 - (double)n15 + (Double)cv.e(1609502852);
        double d24 = d16 - (double)n16 + (Double)cv.e(1746866310);
        double d25 = d17 - (double)n17 + (Double)cv.e(1746866310);
        double d26 = d18 - (double)n18 + (Double)cv.e(1746866310);
        double d27 = d19 - (double)n19 + (Double)cv.e(1746866310);
        double d28 = d16 - (double)n20 + (Double)cv.e(-1973809023);
        double d29 = d17 - (double)n21 + (Double)cv.e(-1973809023);
        double d30 = d18 - (double)n22 + (Double)cv.e(-1973809023);
        double d31 = d19 - (double)n23 + (Double)cv.e(-1973809023);
        double d32 = d16 + (Double)cv.e(-1833889664);
        double d33 = d17 + (Double)cv.e(-1833889664);
        double d34 = d18 + (Double)cv.e(-1833889664);
        double d35 = d19 + (Double)cv.e(-1833889664);
        int n24 = n & 255;
        int n25 = n2 & 255;
        int n26 = n3 & 255;
        int n27 = n4 & 255;
        int n28 = ((int[])cv.b(this, 753012830))[n24 + ((int[])cv.b(this, 753012830))[n25 + ((int[])cv.b(this, 753012830))[n26 + ((int[])cv.b(this, 753012830))[n27]]]] % 32;
        int n29 = ((int[])cv.b(this, 753012830))[n24 + n12 + ((int[])cv.b(this, 753012830))[n25 + n13 + ((int[])cv.b(this, 753012830))[n26 + n14 + ((int[])cv.b(this, 753012830))[n27 + n15]]]] % 32;
        int n30 = ((int[])cv.b(this, 753012830))[n24 + n16 + ((int[])cv.b(this, 753012830))[n25 + n17 + ((int[])cv.b(this, 753012830))[n26 + n18 + ((int[])cv.b(this, 753012830))[n27 + n19]]]] % 32;
        int n31 = ((int[])cv.b(this, 753012830))[n24 + n20 + ((int[])cv.b(this, 753012830))[n25 + n21 + ((int[])cv.b(this, 753012830))[n26 + n22 + ((int[])cv.b(this, 753012830))[n27 + n23]]]] % 32;
        int n32 = ((int[])cv.b(this, 753012830))[n24 + 1 + ((int[])cv.b(this, 753012830))[n25 + 1 + ((int[])cv.b(this, 753012830))[n26 + 1 + ((int[])cv.b(this, 753012830))[n27 + 1]]]] % 32;
        double d36 = 0.6 - d16 * d16 - d17 * d17 - d18 * d18 - d19 * d19;
        if (d36 < 0.0) {
            d8 = 0.0;
        } else {
            d36 *= d36;
            d8 = d36 * d36 * iSqp.dot(((int[][])cv.e(1283330179))[n28], d16, d17, d18, d19);
        }
        double d37 = 0.6 - d20 * d20 - d21 * d21 - d22 * d22 - d23 * d23;
        if (d37 < 0.0) {
            d6 = 0.0;
        } else {
            d37 *= d37;
            d6 = d37 * d37 * iSqp.dot(((int[][])cv.e(1283330179))[n29], d20, d21, d22, d23);
        }
        double d38 = 0.6 - d24 * d24 - d25 * d25 - d26 * d26 - d27 * d27;
        if (d38 < 0.0) {
            d7 = 0.0;
        } else {
            d38 *= d38;
            d7 = d38 * d38 * iSqp.dot(((int[][])cv.e(1283330179))[n30], d24, d25, d26, d27);
        }
        double d39 = 0.6 - d28 * d28 - d29 * d29 - d30 * d30 - d31 * d31;
        if (d39 < 0.0) {
            d9 = 0.0;
        } else {
            d39 *= d39;
            d9 = d39 * d39 * iSqp.dot(((int[][])cv.e(1283330179))[n31], d28, d29, d30, d31);
        }
        double d40 = 0.6 - d32 * d32 - d33 * d33 - d34 * d34 - d35 * d35;
        if (d40 < 0.0) {
            d5 = 0.0;
        } else {
            d40 *= d40;
            d5 = d40 * d40 * iSqp.dot(((int[][])cv.e(1283330179))[n32], d32, d33, d34, d35);
        }
        return 27.0 * (d8 + d6 + d7 + d9 + d5);
    }

    public static iSqp GHaL() {
        return (iSqp)cv.e(22089810);
    }

    static {
        cv.V(2036142210, (double)iSqp.xX(3.0));
        cv.V(1405816973, (double)iSqp.xX(5.0));
        cv.V(545263768, 0.5 * ((Double)cv.e(2036142210) - 1.0));
        double d = (3.0 - (Double)cv.e(2036142210)) / 6.0;
        cv.V(1586434203, d);
        cv.V(-185003878, d * 2.0 - 1.0);
        cv.V(-693956475, ((Double)cv.e(1405816973) - 1.0) / 4.0);
        double d2 = (5.0 - (Double)cv.e(1405816973)) / 20.0;
        cv.V(1609502852, d2);
        cv.V(1746866310, d2 * 2.0);
        cv.V(-1973809023, (Double)cv.e(1609502852) * 3.0);
        cv.V(-1833889664, (Double)cv.e(1609502852) * 4.0 - 1.0);
        cv.V(1283330179, new int[][]{{0, 1, 1, 1}, {0, 1, 1, -1}, {0, 1, -1, 1}, {0, 1, -1, -1}, {0, -1, 1, 1}, {0, -1, 1, -1}, {0, -1, -1, 1}, {0, -1, -1, -1}, {1, 0, 1, 1}, {1, 0, 1, -1}, {1, 0, -1, 1}, {1, 0, -1, -1}, {-1, 0, 1, 1}, {-1, 0, 1, -1}, {-1, 0, -1, 1}, {-1, 0, -1, -1}, {1, 1, 0, 1}, {1, 1, 0, -1}, {1, -1, 0, 1}, {1, -1, 0, -1}, {-1, 1, 0, 1}, {-1, 1, 0, -1}, {-1, -1, 0, 1}, {-1, -1, 0, -1}, {1, 1, 1, 0}, {1, 1, -1, 0}, {1, -1, 1, 0}, {1, -1, -1, 0}, {-1, 1, 1, 0}, {-1, 1, -1, 0}, {-1, -1, 1, 0}, {-1, -1, -1, 0}});
        cv.V(1929711751, new int[][]{{0, 1, 2, 3}, {0, 1, 3, 2}, {0, 0, 0, 0}, {0, 2, 3, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 2, 3, 0}, {0, 2, 1, 3}, {0, 0, 0, 0}, {0, 3, 1, 2}, {0, 3, 2, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 3, 2, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 2, 0, 3}, {0, 0, 0, 0}, {1, 3, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 3, 0, 1}, {2, 3, 1, 0}, {1, 0, 2, 3}, {1, 0, 3, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 3, 1}, {0, 0, 0, 0}, {2, 1, 3, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 1, 3}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0, 1, 2}, {3, 0, 2, 1}, {0, 0, 0, 0}, {3, 1, 2, 0}, {2, 1, 0, 3}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 1, 0, 2}, {0, 0, 0, 0}, {3, 2, 0, 1}, {3, 2, 1, 0}});
        cv.V(22089810, new iSqp());
    }

    private static Object xX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

