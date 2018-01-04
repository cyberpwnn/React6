/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class AWyb {
    static final Color[] colors;
    public static final byte TRANSPARENT = 0;
    public static final byte LIGHT_GREEN = 4;
    public static final byte LIGHT_BROWN = 8;
    public static final byte GRAY_1 = 12;
    public static final byte RED = 16;
    public static final byte PALE_BLUE = 20;
    public static final byte GRAY_2 = 24;
    public static final byte DARK_GREEN = 28;
    public static final byte WHITE = 32;
    public static final byte LIGHT_GRAY = 36;
    public static final byte BROWN = 40;
    public static final byte DARK_GRAY = 44;
    public static final byte BLUE = 48;
    public static final byte DARK_BROWN = 52;

    static {
        o.w(180443010, new Color[]{AWyb.VwLY(0, 0, 0), AWyb.VwLY(0, 0, 0), AWyb.VwLY(0, 0, 0), AWyb.VwLY(0, 0, 0), AWyb.VwLY(89, 125, 39), AWyb.VwLY(109, 153, 48), AWyb.VwLY(127, 178, 56), AWyb.VwLY(67, 94, 29), AWyb.VwLY(174, 164, 115), AWyb.VwLY(213, 201, 140), AWyb.VwLY(247, 233, 163), AWyb.VwLY(130, 123, 86), AWyb.VwLY(140, 140, 140), AWyb.VwLY(171, 171, 171), AWyb.VwLY(199, 199, 199), AWyb.VwLY(105, 105, 105), AWyb.VwLY(180, 0, 0), AWyb.VwLY(220, 0, 0), AWyb.VwLY(255, 0, 0), AWyb.VwLY(135, 0, 0), AWyb.VwLY(112, 112, 180), AWyb.VwLY(138, 138, 220), AWyb.VwLY(160, 160, 255), AWyb.VwLY(84, 84, 135), AWyb.VwLY(117, 117, 117), AWyb.VwLY(144, 144, 144), AWyb.VwLY(167, 167, 167), AWyb.VwLY(88, 88, 88), AWyb.VwLY(0, 87, 0), AWyb.VwLY(0, 106, 0), AWyb.VwLY(0, 124, 0), AWyb.VwLY(0, 65, 0), AWyb.VwLY(180, 180, 180), AWyb.VwLY(220, 220, 220), AWyb.VwLY(255, 255, 255), AWyb.VwLY(135, 135, 135), AWyb.VwLY(115, 118, 129), AWyb.VwLY(141, 144, 158), AWyb.VwLY(164, 168, 184), AWyb.VwLY(86, 88, 97), AWyb.VwLY(106, 76, 54), AWyb.VwLY(130, 94, 66), AWyb.VwLY(151, 109, 77), AWyb.VwLY(79, 57, 40), AWyb.VwLY(79, 79, 79), AWyb.VwLY(96, 96, 96), AWyb.VwLY(112, 112, 112), AWyb.VwLY(59, 59, 59), AWyb.VwLY(45, 45, 180), AWyb.VwLY(55, 55, 220), AWyb.VwLY(64, 64, 255), AWyb.VwLY(33, 33, 135), AWyb.VwLY(100, 84, 50), AWyb.VwLY(123, 102, 62), AWyb.VwLY(143, 119, 72), AWyb.VwLY(75, 63, 38), AWyb.VwLY(180, 177, 172), AWyb.VwLY(220, 217, 211), AWyb.VwLY(255, 252, 245), AWyb.VwLY(135, 133, 129), AWyb.VwLY(152, 89, 36), AWyb.VwLY(186, 109, 44), AWyb.VwLY(216, 127, 51), AWyb.VwLY(114, 67, 27), AWyb.VwLY(125, 53, 152), AWyb.VwLY(153, 65, 186), AWyb.VwLY(178, 76, 216), AWyb.VwLY(94, 40, 114), AWyb.VwLY(72, 108, 152), AWyb.VwLY(88, 132, 186), AWyb.VwLY(102, 153, 216), AWyb.VwLY(54, 81, 114), AWyb.VwLY(161, 161, 36), AWyb.VwLY(197, 197, 44), AWyb.VwLY(229, 229, 51), AWyb.VwLY(121, 121, 27), AWyb.VwLY(89, 144, 17), AWyb.VwLY(109, 176, 21), AWyb.VwLY(127, 204, 25), AWyb.VwLY(67, 108, 13), AWyb.VwLY(170, 89, 116), AWyb.VwLY(208, 109, 142), AWyb.VwLY(242, 127, 165), AWyb.VwLY(128, 67, 87), AWyb.VwLY(53, 53, 53), AWyb.VwLY(65, 65, 65), AWyb.VwLY(76, 76, 76), AWyb.VwLY(40, 40, 40), AWyb.VwLY(108, 108, 108), AWyb.VwLY(132, 132, 132), AWyb.VwLY(153, 153, 153), AWyb.VwLY(81, 81, 81), AWyb.VwLY(53, 89, 108), AWyb.VwLY(65, 109, 132), AWyb.VwLY(76, 127, 153), AWyb.VwLY(40, 67, 81), AWyb.VwLY(89, 44, 125), AWyb.VwLY(109, 54, 153), AWyb.VwLY(127, 63, 178), AWyb.VwLY(67, 33, 94), AWyb.VwLY(36, 53, 125), AWyb.VwLY(44, 65, 153), AWyb.VwLY(51, 76, 178), AWyb.VwLY(27, 40, 94), AWyb.VwLY(72, 53, 36), AWyb.VwLY(88, 65, 44), AWyb.VwLY(102, 76, 51), AWyb.VwLY(54, 40, 27), AWyb.VwLY(72, 89, 36), AWyb.VwLY(88, 109, 44), AWyb.VwLY(102, 127, 51), AWyb.VwLY(54, 67, 27), AWyb.VwLY(108, 36, 36), AWyb.VwLY(132, 44, 44), AWyb.VwLY(153, 51, 51), AWyb.VwLY(81, 27, 27), AWyb.VwLY(17, 17, 17), AWyb.VwLY(21, 21, 21), AWyb.VwLY(25, 25, 25), AWyb.VwLY(13, 13, 13), AWyb.VwLY(176, 168, 54), AWyb.VwLY(215, 205, 66), AWyb.VwLY(250, 238, 77), AWyb.VwLY(132, 126, 40), AWyb.VwLY(64, 154, 150), AWyb.VwLY(79, 188, 183), AWyb.VwLY(92, 219, 213), AWyb.VwLY(48, 115, 112), AWyb.VwLY(52, 90, 180), AWyb.VwLY(63, 110, 220), AWyb.VwLY(74, 128, 255), AWyb.VwLY(39, 67, 135), AWyb.VwLY(0, 153, 40), AWyb.VwLY(0, 187, 50), AWyb.VwLY(0, 217, 58), AWyb.VwLY(0, 114, 30), AWyb.VwLY(91, 60, 34), AWyb.VwLY(111, 74, 42), AWyb.VwLY(129, 86, 49), AWyb.VwLY(68, 45, 25), AWyb.VwLY(79, 1, 0), AWyb.VwLY(96, 1, 0), AWyb.VwLY(112, 2, 0), AWyb.VwLY(59, 1, 0), AWyb.VwLY(147, 124, 113), AWyb.VwLY(180, 152, 138), AWyb.VwLY(209, 177, 161), AWyb.VwLY(110, 93, 85), AWyb.VwLY(112, 57, 25), AWyb.VwLY(137, 70, 31), AWyb.VwLY(159, 82, 36), AWyb.VwLY(84, 43, 19), AWyb.VwLY(105, 61, 76), AWyb.VwLY(128, 75, 93), AWyb.VwLY(149, 87, 108), AWyb.VwLY(78, 46, 57), AWyb.VwLY(79, 76, 97), AWyb.VwLY(96, 93, 119), AWyb.VwLY(112, 108, 138), AWyb.VwLY(59, 57, 73), AWyb.VwLY(131, 93, 25), AWyb.VwLY(160, 114, 31), AWyb.VwLY(186, 133, 36), AWyb.VwLY(98, 70, 19), AWyb.VwLY(72, 82, 37), AWyb.VwLY(88, 100, 45), AWyb.VwLY(103, 117, 53), AWyb.VwLY(54, 61, 28), AWyb.VwLY(112, 54, 55), AWyb.VwLY(138, 66, 67), AWyb.VwLY(160, 77, 78), AWyb.VwLY(84, 40, 41), AWyb.VwLY(40, 28, 24), AWyb.VwLY(49, 35, 30), AWyb.VwLY(57, 41, 35), AWyb.VwLY(30, 21, 18), AWyb.VwLY(95, 75, 69), AWyb.VwLY(116, 92, 84), AWyb.VwLY(135, 107, 98), AWyb.VwLY(71, 56, 51), AWyb.VwLY(61, 64, 64), AWyb.VwLY(75, 79, 79), AWyb.VwLY(87, 92, 92), AWyb.VwLY(46, 48, 48), AWyb.VwLY(86, 51, 62), AWyb.VwLY(105, 62, 75), AWyb.VwLY(122, 73, 88), AWyb.VwLY(64, 38, 46), AWyb.VwLY(53, 43, 64), AWyb.VwLY(65, 53, 79), AWyb.VwLY(76, 62, 92), AWyb.VwLY(40, 32, 48), AWyb.VwLY(53, 35, 24), AWyb.VwLY(65, 43, 30), AWyb.VwLY(76, 50, 35), AWyb.VwLY(40, 26, 18), AWyb.VwLY(53, 57, 29), AWyb.VwLY(65, 70, 36), AWyb.VwLY(76, 82, 42), AWyb.VwLY(40, 43, 22), AWyb.VwLY(100, 42, 32), AWyb.VwLY(122, 51, 39), AWyb.VwLY(142, 60, 46), AWyb.VwLY(75, 31, 24), AWyb.VwLY(26, 15, 11), AWyb.VwLY(31, 18, 13), AWyb.VwLY(37, 22, 16), AWyb.VwLY(19, 11, 8)});
    }

    private static Color VwLY(int n, int n2, int n3) {
        return new Color(n, n2, n3);
    }

    private static double yJLS(Color color, Color color2) {
        reference var2_2 = (Object)(AWyb.Nw(color) + AWyb.Nw(color2)) / 2.0;
        Object object = AWyb.Nw(color) - AWyb.Nw(color2);
        Object object2 = AWyb.Nw(color) - AWyb.Nw(color2);
        reference var8_5 = AWyb.Nw(color) - AWyb.Nw(color2);
        double d = 2.0 + var2_2 / 256.0;
        double d2 = 4.0;
        double d3 = 2.0 + (255.0 - var2_2) / 256.0;
        return d * object * object + object2 * 4.0 * object2 + d3 * (Object)var8_5 * (Object)var8_5;
    }

    public static BufferedImage resizeImage(Image image) {
        BufferedImage bufferedImage = new BufferedImage(128, 128, 2);
        Object object = AWyb.Nw(bufferedImage);
        AWyb.Nw(object, image, false, false, 128, 128, null);
        AWyb.Nw(object);
        return bufferedImage;
    }

    public static byte[] imageToBytes(Image image) {
        BufferedImage bufferedImage = new BufferedImage((int)AWyb.Nw(image, null), (int)AWyb.Nw(image, null), 2);
        Object object = AWyb.Nw(bufferedImage);
        AWyb.Nw(object, image, false, false, null);
        AWyb.Nw(object);
        int[] arrn = new int[AWyb.Nw(bufferedImage) * AWyb.Nw(bufferedImage)];
        (int[])AWyb.Nw(bufferedImage, false, false, AWyb.Nw(bufferedImage), AWyb.Nw(bufferedImage), arrn, false, AWyb.Nw(bufferedImage));
        byte[] arrby = new byte[AWyb.Nw(bufferedImage) * AWyb.Nw(bufferedImage)];
        int n = 0;
        while (n < arrn.length) {
            arrby[n] = AWyb.matchColor(new Color(arrn[n], true));
            ++n;
        }
        return arrby;
    }

    public static byte matchColor(int n, int n2, int n3) {
        return AWyb.matchColor(new Color(n, n2, n3));
    }

    public static byte matchColor(Color color) {
        if (AWyb.Nw(color) < 128) {
            return 0;
        }
        int n = 0;
        double d = -1.0;
        int n2 = 4;
        while (n2 < ((Color[])o.k(180443010)).length) {
            double d2 = AWyb.yJLS(color, ((Color[])o.k(180443010))[n2]);
            if (d2 < d || d == -1.0) {
                d = d2;
                n = n2;
            }
            ++n2;
        }
        return (byte)(n < 128 ? n : -129 + (n - 127));
    }

    public static Color getColor(byte n) {
        if ((n <= -49 || n >= 0) && n <= 127) {
            return ((Color[])o.k(180443010))[n >= 0 ? n : n + 256];
        }
        throw new IndexOutOfBoundsException();
    }

    private static Object Nw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

