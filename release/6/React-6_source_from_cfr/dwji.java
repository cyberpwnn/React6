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

public class dwji {
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

    private static Color IWSm(int n, int n2, int n3) {
        return new Color(n, n2, n3);
    }

    private static double ssNb(Color color, Color color2) {
        reference var2_2 = (Object)(dwji.xA(color) + dwji.xA(color2)) / 2.0;
        Object object = dwji.xA(color) - dwji.xA(color2);
        Object object2 = dwji.xA(color) - dwji.xA(color2);
        reference var8_5 = dwji.xA(color) - dwji.xA(color2);
        double d = 2.0 + var2_2 / 256.0;
        double d2 = 4.0;
        double d3 = 2.0 + (255.0 - var2_2) / 256.0;
        return d * object * object + object2 * 4.0 * object2 + d3 * (Object)var8_5 * (Object)var8_5;
    }

    public static BufferedImage resizeImage(Image image) {
        BufferedImage bufferedImage = new BufferedImage(128, 128, 2);
        Object object = dwji.xA(bufferedImage);
        dwji.xA(object, image, false, false, 128, 128, null);
        dwji.xA(object);
        return bufferedImage;
    }

    public static byte[] imageToBytes(Image image) {
        BufferedImage bufferedImage = new BufferedImage((int)dwji.xA(image, null), (int)dwji.xA(image, null), 2);
        Object object = dwji.xA(bufferedImage);
        dwji.xA(object, image, false, false, null);
        dwji.xA(object);
        int[] arrn = new int[dwji.xA(bufferedImage) * dwji.xA(bufferedImage)];
        (int[])dwji.xA(bufferedImage, false, false, dwji.xA(bufferedImage), dwji.xA(bufferedImage), arrn, false, dwji.xA(bufferedImage));
        byte[] arrby = new byte[dwji.xA(bufferedImage) * dwji.xA(bufferedImage)];
        for (int i = 0; i < arrn.length; ++i) {
            arrby[i] = dwji.matchColor(new Color(arrn[i], true));
        }
        return arrby;
    }

    public static byte matchColor(int n, int n2, int n3) {
        return dwji.matchColor(new Color(n, n2, n3));
    }

    public static byte matchColor(Color color) {
        if (dwji.xA(color) < 128) {
            return 0;
        }
        int n = 0;
        double d = -1.0;
        for (int i = 4; i < ((Color[])cv.e(-597232746)).length; ++i) {
            double d2 = dwji.ssNb(color, ((Color[])cv.e(-597232746))[i]);
            if (d2 >= d && d != -1.0) continue;
            d = d2;
            n = i;
        }
        return (byte)(n < 128 ? n : -129 + (n - 127));
    }

    public static Color getColor(byte n) {
        if ((n <= -49 || n >= 0) && n <= 127) {
            return ((Color[])cv.e(-597232746))[n >= 0 ? n : n + 256];
        }
        throw new IndexOutOfBoundsException();
    }

    static {
        cv.V(-597232746, new Color[]{dwji.IWSm(0, 0, 0), dwji.IWSm(0, 0, 0), dwji.IWSm(0, 0, 0), dwji.IWSm(0, 0, 0), dwji.IWSm(89, 125, 39), dwji.IWSm(109, 153, 48), dwji.IWSm(127, 178, 56), dwji.IWSm(67, 94, 29), dwji.IWSm(174, 164, 115), dwji.IWSm(213, 201, 140), dwji.IWSm(247, 233, 163), dwji.IWSm(130, 123, 86), dwji.IWSm(140, 140, 140), dwji.IWSm(171, 171, 171), dwji.IWSm(199, 199, 199), dwji.IWSm(105, 105, 105), dwji.IWSm(180, 0, 0), dwji.IWSm(220, 0, 0), dwji.IWSm(255, 0, 0), dwji.IWSm(135, 0, 0), dwji.IWSm(112, 112, 180), dwji.IWSm(138, 138, 220), dwji.IWSm(160, 160, 255), dwji.IWSm(84, 84, 135), dwji.IWSm(117, 117, 117), dwji.IWSm(144, 144, 144), dwji.IWSm(167, 167, 167), dwji.IWSm(88, 88, 88), dwji.IWSm(0, 87, 0), dwji.IWSm(0, 106, 0), dwji.IWSm(0, 124, 0), dwji.IWSm(0, 65, 0), dwji.IWSm(180, 180, 180), dwji.IWSm(220, 220, 220), dwji.IWSm(255, 255, 255), dwji.IWSm(135, 135, 135), dwji.IWSm(115, 118, 129), dwji.IWSm(141, 144, 158), dwji.IWSm(164, 168, 184), dwji.IWSm(86, 88, 97), dwji.IWSm(106, 76, 54), dwji.IWSm(130, 94, 66), dwji.IWSm(151, 109, 77), dwji.IWSm(79, 57, 40), dwji.IWSm(79, 79, 79), dwji.IWSm(96, 96, 96), dwji.IWSm(112, 112, 112), dwji.IWSm(59, 59, 59), dwji.IWSm(45, 45, 180), dwji.IWSm(55, 55, 220), dwji.IWSm(64, 64, 255), dwji.IWSm(33, 33, 135), dwji.IWSm(100, 84, 50), dwji.IWSm(123, 102, 62), dwji.IWSm(143, 119, 72), dwji.IWSm(75, 63, 38), dwji.IWSm(180, 177, 172), dwji.IWSm(220, 217, 211), dwji.IWSm(255, 252, 245), dwji.IWSm(135, 133, 129), dwji.IWSm(152, 89, 36), dwji.IWSm(186, 109, 44), dwji.IWSm(216, 127, 51), dwji.IWSm(114, 67, 27), dwji.IWSm(125, 53, 152), dwji.IWSm(153, 65, 186), dwji.IWSm(178, 76, 216), dwji.IWSm(94, 40, 114), dwji.IWSm(72, 108, 152), dwji.IWSm(88, 132, 186), dwji.IWSm(102, 153, 216), dwji.IWSm(54, 81, 114), dwji.IWSm(161, 161, 36), dwji.IWSm(197, 197, 44), dwji.IWSm(229, 229, 51), dwji.IWSm(121, 121, 27), dwji.IWSm(89, 144, 17), dwji.IWSm(109, 176, 21), dwji.IWSm(127, 204, 25), dwji.IWSm(67, 108, 13), dwji.IWSm(170, 89, 116), dwji.IWSm(208, 109, 142), dwji.IWSm(242, 127, 165), dwji.IWSm(128, 67, 87), dwji.IWSm(53, 53, 53), dwji.IWSm(65, 65, 65), dwji.IWSm(76, 76, 76), dwji.IWSm(40, 40, 40), dwji.IWSm(108, 108, 108), dwji.IWSm(132, 132, 132), dwji.IWSm(153, 153, 153), dwji.IWSm(81, 81, 81), dwji.IWSm(53, 89, 108), dwji.IWSm(65, 109, 132), dwji.IWSm(76, 127, 153), dwji.IWSm(40, 67, 81), dwji.IWSm(89, 44, 125), dwji.IWSm(109, 54, 153), dwji.IWSm(127, 63, 178), dwji.IWSm(67, 33, 94), dwji.IWSm(36, 53, 125), dwji.IWSm(44, 65, 153), dwji.IWSm(51, 76, 178), dwji.IWSm(27, 40, 94), dwji.IWSm(72, 53, 36), dwji.IWSm(88, 65, 44), dwji.IWSm(102, 76, 51), dwji.IWSm(54, 40, 27), dwji.IWSm(72, 89, 36), dwji.IWSm(88, 109, 44), dwji.IWSm(102, 127, 51), dwji.IWSm(54, 67, 27), dwji.IWSm(108, 36, 36), dwji.IWSm(132, 44, 44), dwji.IWSm(153, 51, 51), dwji.IWSm(81, 27, 27), dwji.IWSm(17, 17, 17), dwji.IWSm(21, 21, 21), dwji.IWSm(25, 25, 25), dwji.IWSm(13, 13, 13), dwji.IWSm(176, 168, 54), dwji.IWSm(215, 205, 66), dwji.IWSm(250, 238, 77), dwji.IWSm(132, 126, 40), dwji.IWSm(64, 154, 150), dwji.IWSm(79, 188, 183), dwji.IWSm(92, 219, 213), dwji.IWSm(48, 115, 112), dwji.IWSm(52, 90, 180), dwji.IWSm(63, 110, 220), dwji.IWSm(74, 128, 255), dwji.IWSm(39, 67, 135), dwji.IWSm(0, 153, 40), dwji.IWSm(0, 187, 50), dwji.IWSm(0, 217, 58), dwji.IWSm(0, 114, 30), dwji.IWSm(91, 60, 34), dwji.IWSm(111, 74, 42), dwji.IWSm(129, 86, 49), dwji.IWSm(68, 45, 25), dwji.IWSm(79, 1, 0), dwji.IWSm(96, 1, 0), dwji.IWSm(112, 2, 0), dwji.IWSm(59, 1, 0), dwji.IWSm(147, 124, 113), dwji.IWSm(180, 152, 138), dwji.IWSm(209, 177, 161), dwji.IWSm(110, 93, 85), dwji.IWSm(112, 57, 25), dwji.IWSm(137, 70, 31), dwji.IWSm(159, 82, 36), dwji.IWSm(84, 43, 19), dwji.IWSm(105, 61, 76), dwji.IWSm(128, 75, 93), dwji.IWSm(149, 87, 108), dwji.IWSm(78, 46, 57), dwji.IWSm(79, 76, 97), dwji.IWSm(96, 93, 119), dwji.IWSm(112, 108, 138), dwji.IWSm(59, 57, 73), dwji.IWSm(131, 93, 25), dwji.IWSm(160, 114, 31), dwji.IWSm(186, 133, 36), dwji.IWSm(98, 70, 19), dwji.IWSm(72, 82, 37), dwji.IWSm(88, 100, 45), dwji.IWSm(103, 117, 53), dwji.IWSm(54, 61, 28), dwji.IWSm(112, 54, 55), dwji.IWSm(138, 66, 67), dwji.IWSm(160, 77, 78), dwji.IWSm(84, 40, 41), dwji.IWSm(40, 28, 24), dwji.IWSm(49, 35, 30), dwji.IWSm(57, 41, 35), dwji.IWSm(30, 21, 18), dwji.IWSm(95, 75, 69), dwji.IWSm(116, 92, 84), dwji.IWSm(135, 107, 98), dwji.IWSm(71, 56, 51), dwji.IWSm(61, 64, 64), dwji.IWSm(75, 79, 79), dwji.IWSm(87, 92, 92), dwji.IWSm(46, 48, 48), dwji.IWSm(86, 51, 62), dwji.IWSm(105, 62, 75), dwji.IWSm(122, 73, 88), dwji.IWSm(64, 38, 46), dwji.IWSm(53, 43, 64), dwji.IWSm(65, 53, 79), dwji.IWSm(76, 62, 92), dwji.IWSm(40, 32, 48), dwji.IWSm(53, 35, 24), dwji.IWSm(65, 43, 30), dwji.IWSm(76, 50, 35), dwji.IWSm(40, 26, 18), dwji.IWSm(53, 57, 29), dwji.IWSm(65, 70, 36), dwji.IWSm(76, 82, 42), dwji.IWSm(40, 43, 22), dwji.IWSm(100, 42, 32), dwji.IWSm(122, 51, 39), dwji.IWSm(142, 60, 46), dwji.IWSm(75, 31, 24), dwji.IWSm(26, 15, 11), dwji.IWSm(31, 18, 13), dwji.IWSm(37, 22, 16), dwji.IWSm(19, 11, 8)});
    }

    private static Object xA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

