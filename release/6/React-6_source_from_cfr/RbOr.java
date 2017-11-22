/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Random;

public class RbOr
extends tvRU {
    protected static final int[][] grad3;
    private static final RbOr NgTe;

    protected RbOr() {
        int[] arrn = new int[]{151, 160, 137, 91, 90, 15, 131, 13, 201, 95, 96, 53, 194, 233, 7, 225, 140, 36, 103, 30, 69, 142, 8, 99, 37, 240, 21, 10, 23, 190, 6, 148, 247, 120, 234, 75, 0, 26, 197, 62, 94, 252, 219, 203, 117, 35, 11, 32, 57, 177, 33, 88, 237, 149, 56, 87, 174, 20, 125, 136, 171, 168, 68, 175, 74, 165, 71, 134, 139, 48, 27, 166, 77, 146, 158, 231, 83, 111, 229, 122, 60, 211, 133, 230, 220, 105, 92, 41, 55, 46, 245, 40, 244, 102, 143, 54, 65, 25, 63, 161, 1, 216, 80, 73, 209, 76, 132, 187, 208, 89, 18, 169, 200, 196, 135, 130, 116, 188, 159, 86, 164, 100, 109, 198, 173, 186, 3, 64, 52, 217, 226, 250, 124, 123, 5, 202, 38, 147, 118, 126, 255, 82, 85, 212, 207, 206, 59, 227, 47, 16, 58, 17, 182, 189, 28, 42, 223, 183, 170, 213, 119, 248, 152, 2, 44, 154, 163, 70, 221, 153, 101, 155, 167, 43, 172, 9, 129, 22, 39, 253, 19, 98, 108, 110, 79, 113, 224, 232, 178, 185, 112, 104, 218, 246, 97, 228, 251, 34, 242, 193, 238, 210, 144, 12, 191, 179, 162, 241, 81, 51, 145, 235, 249, 14, 239, 107, 49, 192, 214, 31, 181, 199, 106, 157, 184, 84, 204, 176, 115, 121, 50, 45, 127, 4, 150, 254, 138, 236, 205, 93, 222, 114, 67, 29, 24, 72, 243, 141, 128, 195, 78, 66, 215, 61, 156, 180};
        for (int i = 0; i < 512; ++i) {
            ((int[])cv.b((Object)this, (int)953814587))[i] = arrn[i & 255];
        }
    }

    public RbOr(long l) {
        this(new Random(l));
    }

    public RbOr(Random random) {
        int n;
        this.offsetX = RbOr.pV(random) * 256.0;
        this.offsetY = RbOr.pV(random) * 256.0;
        this.offsetZ = RbOr.pV(random) * 256.0;
        for (n = 0; n < 256; ++n) {
            ((int[])cv.b((Object)this, (int)953814587))[n] = RbOr.pV(random, 256);
        }
        for (n = 0; n < 256; ++n) {
            reference var3_3 = RbOr.pV(random, 256 - n) + n;
            int n2 = ((int[])cv.b(this, 953814587))[n];
            ((int[])cv.b((Object)this, (int)953814587))[n] = ((int[])cv.b(this, 953814587))[var3_3];
            ((int[])cv.b((Object)this, (int)953814587))[var3_3] = n2;
            ((int[])cv.b((Object)this, (int)953814587))[n + 256] = ((int[])cv.b(this, 953814587))[n];
        }
    }

    public static double getNoise(double d) {
        return ((RbOr)cv.e(-192541148)).noise(d);
    }

    public static double getNoise(double d, double d2) {
        return ((RbOr)cv.e(-192541148)).noise(d, d2);
    }

    public static double getNoise(double d, double d2, double d3) {
        return ((RbOr)cv.e(-192541148)).noise(d, d2, d3);
    }

    public static RbOr INcj() {
        return (RbOr)cv.e(-192541148);
    }

    @Override
    public double noise(double d, double d2, double d3) {
        int n = RbOr.floor(d += ((Double)cv.b(this, -1140847065)).doubleValue());
        int n2 = RbOr.floor(d2 += ((Double)cv.b(this, 731385382)).doubleValue());
        int n3 = RbOr.floor(d3 += ((Double)cv.b(this, -1934946783)).doubleValue());
        int n4 = n & 255;
        int n5 = n2 & 255;
        int n6 = n3 & 255;
        double d4 = RbOr.fade(d -= (double)n);
        double d5 = RbOr.fade(d2 -= (double)n2);
        double d6 = RbOr.fade(d3 -= (double)n3);
        int n7 = ((int[])cv.b(this, 953814587))[n4] + n5;
        int n8 = ((int[])cv.b(this, 953814587))[n7] + n6;
        int n9 = ((int[])cv.b(this, 953814587))[n7 + 1] + n6;
        int n10 = ((int[])cv.b(this, 953814587))[n4 + 1] + n5;
        int n11 = ((int[])cv.b(this, 953814587))[n10] + n6;
        int n12 = ((int[])cv.b(this, 953814587))[n10 + 1] + n6;
        return RbOr.lerp(d6, RbOr.lerp(d5, RbOr.lerp(d4, RbOr.grad(((int[])cv.b(this, 953814587))[n8], d, d2, d3), RbOr.grad(((int[])cv.b(this, 953814587))[n11], d - 1.0, d2, d3)), RbOr.lerp(d4, RbOr.grad(((int[])cv.b(this, 953814587))[n9], d, d2 - 1.0, d3), RbOr.grad(((int[])cv.b(this, 953814587))[n12], d - 1.0, d2 - 1.0, d3))), RbOr.lerp(d5, RbOr.lerp(d4, RbOr.grad(((int[])cv.b(this, 953814587))[n8 + 1], d, d2, d3 - 1.0), RbOr.grad(((int[])cv.b(this, 953814587))[n11 + 1], d - 1.0, d2, d3 - 1.0)), RbOr.lerp(d4, RbOr.grad(((int[])cv.b(this, 953814587))[n9 + 1], d, d2 - 1.0, d3 - 1.0), RbOr.grad(((int[])cv.b(this, 953814587))[n12 + 1], d - 1.0, d2 - 1.0, d3 - 1.0))));
    }

    public static double getNoise(double d, int n, double d2, double d3) {
        return ((RbOr)cv.e(-192541148)).noise(d, n, d2, d3);
    }

    public static double getNoise(double d, double d2, int n, double d3, double d4) {
        return ((RbOr)cv.e(-192541148)).noise(d, d2, n, d3, d4);
    }

    public static double getNoise(double d, double d2, double d3, int n, double d4, double d5) {
        return ((RbOr)cv.e(-192541148)).noise(d, d2, d3, n, d4, d5);
    }

    static {
        cv.V(1548750368, new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}});
        cv.V(-192541148, new RbOr());
    }

    private static Object pV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

