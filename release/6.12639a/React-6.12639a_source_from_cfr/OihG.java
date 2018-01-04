/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Random;

public class OihG
extends qlgl {
    protected static final int[][] grad3;
    private static final OihG lVCL;

    static {
        int[][] arrarrn = new int[12][];
        int[] arrn = new int[3];
        arrn[0] = 1;
        arrn[1] = 1;
        arrarrn[0] = arrn;
        int[] arrn2 = new int[3];
        arrn2[0] = -1;
        arrn2[1] = 1;
        arrarrn[1] = arrn2;
        int[] arrn3 = new int[3];
        arrn3[0] = 1;
        arrn3[1] = -1;
        arrarrn[2] = arrn3;
        int[] arrn4 = new int[3];
        arrn4[0] = -1;
        arrn4[1] = -1;
        arrarrn[3] = arrn4;
        int[] arrn5 = new int[3];
        arrn5[0] = 1;
        arrn5[2] = 1;
        arrarrn[4] = arrn5;
        int[] arrn6 = new int[3];
        arrn6[0] = -1;
        arrn6[2] = 1;
        arrarrn[5] = arrn6;
        int[] arrn7 = new int[3];
        arrn7[0] = 1;
        arrn7[2] = -1;
        arrarrn[6] = arrn7;
        int[] arrn8 = new int[3];
        arrn8[0] = -1;
        arrn8[2] = -1;
        arrarrn[7] = arrn8;
        int[] arrn9 = new int[3];
        arrn9[1] = 1;
        arrn9[2] = 1;
        arrarrn[8] = arrn9;
        int[] arrn10 = new int[3];
        arrn10[1] = -1;
        arrn10[2] = 1;
        arrarrn[9] = arrn10;
        int[] arrn11 = new int[3];
        arrn11[1] = 1;
        arrn11[2] = -1;
        arrarrn[10] = arrn11;
        int[] arrn12 = new int[3];
        arrn12[1] = -1;
        arrn12[2] = -1;
        arrarrn[11] = arrn12;
        o.w(-1341897324, arrarrn);
        o.w(-393656941, new OihG());
    }

    protected OihG() {
        int[] arrn = new int[256];
        arrn[0] = 151;
        arrn[1] = 160;
        arrn[2] = 137;
        arrn[3] = 91;
        arrn[4] = 90;
        arrn[5] = 15;
        arrn[6] = 131;
        arrn[7] = 13;
        arrn[8] = 201;
        arrn[9] = 95;
        arrn[10] = 96;
        arrn[11] = 53;
        arrn[12] = 194;
        arrn[13] = 233;
        arrn[14] = 7;
        arrn[15] = 225;
        arrn[16] = 140;
        arrn[17] = 36;
        arrn[18] = 103;
        arrn[19] = 30;
        arrn[20] = 69;
        arrn[21] = 142;
        arrn[22] = 8;
        arrn[23] = 99;
        arrn[24] = 37;
        arrn[25] = 240;
        arrn[26] = 21;
        arrn[27] = 10;
        arrn[28] = 23;
        arrn[29] = 190;
        arrn[30] = 6;
        arrn[31] = 148;
        arrn[32] = 247;
        arrn[33] = 120;
        arrn[34] = 234;
        arrn[35] = 75;
        arrn[37] = 26;
        arrn[38] = 197;
        arrn[39] = 62;
        arrn[40] = 94;
        arrn[41] = 252;
        arrn[42] = 219;
        arrn[43] = 203;
        arrn[44] = 117;
        arrn[45] = 35;
        arrn[46] = 11;
        arrn[47] = 32;
        arrn[48] = 57;
        arrn[49] = 177;
        arrn[50] = 33;
        arrn[51] = 88;
        arrn[52] = 237;
        arrn[53] = 149;
        arrn[54] = 56;
        arrn[55] = 87;
        arrn[56] = 174;
        arrn[57] = 20;
        arrn[58] = 125;
        arrn[59] = 136;
        arrn[60] = 171;
        arrn[61] = 168;
        arrn[62] = 68;
        arrn[63] = 175;
        arrn[64] = 74;
        arrn[65] = 165;
        arrn[66] = 71;
        arrn[67] = 134;
        arrn[68] = 139;
        arrn[69] = 48;
        arrn[70] = 27;
        arrn[71] = 166;
        arrn[72] = 77;
        arrn[73] = 146;
        arrn[74] = 158;
        arrn[75] = 231;
        arrn[76] = 83;
        arrn[77] = 111;
        arrn[78] = 229;
        arrn[79] = 122;
        arrn[80] = 60;
        arrn[81] = 211;
        arrn[82] = 133;
        arrn[83] = 230;
        arrn[84] = 220;
        arrn[85] = 105;
        arrn[86] = 92;
        arrn[87] = 41;
        arrn[88] = 55;
        arrn[89] = 46;
        arrn[90] = 245;
        arrn[91] = 40;
        arrn[92] = 244;
        arrn[93] = 102;
        arrn[94] = 143;
        arrn[95] = 54;
        arrn[96] = 65;
        arrn[97] = 25;
        arrn[98] = 63;
        arrn[99] = 161;
        arrn[100] = 1;
        arrn[101] = 216;
        arrn[102] = 80;
        arrn[103] = 73;
        arrn[104] = 209;
        arrn[105] = 76;
        arrn[106] = 132;
        arrn[107] = 187;
        arrn[108] = 208;
        arrn[109] = 89;
        arrn[110] = 18;
        arrn[111] = 169;
        arrn[112] = 200;
        arrn[113] = 196;
        arrn[114] = 135;
        arrn[115] = 130;
        arrn[116] = 116;
        arrn[117] = 188;
        arrn[118] = 159;
        arrn[119] = 86;
        arrn[120] = 164;
        arrn[121] = 100;
        arrn[122] = 109;
        arrn[123] = 198;
        arrn[124] = 173;
        arrn[125] = 186;
        arrn[126] = 3;
        arrn[127] = 64;
        arrn[128] = 52;
        arrn[129] = 217;
        arrn[130] = 226;
        arrn[131] = 250;
        arrn[132] = 124;
        arrn[133] = 123;
        arrn[134] = 5;
        arrn[135] = 202;
        arrn[136] = 38;
        arrn[137] = 147;
        arrn[138] = 118;
        arrn[139] = 126;
        arrn[140] = 255;
        arrn[141] = 82;
        arrn[142] = 85;
        arrn[143] = 212;
        arrn[144] = 207;
        arrn[145] = 206;
        arrn[146] = 59;
        arrn[147] = 227;
        arrn[148] = 47;
        arrn[149] = 16;
        arrn[150] = 58;
        arrn[151] = 17;
        arrn[152] = 182;
        arrn[153] = 189;
        arrn[154] = 28;
        arrn[155] = 42;
        arrn[156] = 223;
        arrn[157] = 183;
        arrn[158] = 170;
        arrn[159] = 213;
        arrn[160] = 119;
        arrn[161] = 248;
        arrn[162] = 152;
        arrn[163] = 2;
        arrn[164] = 44;
        arrn[165] = 154;
        arrn[166] = 163;
        arrn[167] = 70;
        arrn[168] = 221;
        arrn[169] = 153;
        arrn[170] = 101;
        arrn[171] = 155;
        arrn[172] = 167;
        arrn[173] = 43;
        arrn[174] = 172;
        arrn[175] = 9;
        arrn[176] = 129;
        arrn[177] = 22;
        arrn[178] = 39;
        arrn[179] = 253;
        arrn[180] = 19;
        arrn[181] = 98;
        arrn[182] = 108;
        arrn[183] = 110;
        arrn[184] = 79;
        arrn[185] = 113;
        arrn[186] = 224;
        arrn[187] = 232;
        arrn[188] = 178;
        arrn[189] = 185;
        arrn[190] = 112;
        arrn[191] = 104;
        arrn[192] = 218;
        arrn[193] = 246;
        arrn[194] = 97;
        arrn[195] = 228;
        arrn[196] = 251;
        arrn[197] = 34;
        arrn[198] = 242;
        arrn[199] = 193;
        arrn[200] = 238;
        arrn[201] = 210;
        arrn[202] = 144;
        arrn[203] = 12;
        arrn[204] = 191;
        arrn[205] = 179;
        arrn[206] = 162;
        arrn[207] = 241;
        arrn[208] = 81;
        arrn[209] = 51;
        arrn[210] = 145;
        arrn[211] = 235;
        arrn[212] = 249;
        arrn[213] = 14;
        arrn[214] = 239;
        arrn[215] = 107;
        arrn[216] = 49;
        arrn[217] = 192;
        arrn[218] = 214;
        arrn[219] = 31;
        arrn[220] = 181;
        arrn[221] = 199;
        arrn[222] = 106;
        arrn[223] = 157;
        arrn[224] = 184;
        arrn[225] = 84;
        arrn[226] = 204;
        arrn[227] = 176;
        arrn[228] = 115;
        arrn[229] = 121;
        arrn[230] = 50;
        arrn[231] = 45;
        arrn[232] = 127;
        arrn[233] = 4;
        arrn[234] = 150;
        arrn[235] = 254;
        arrn[236] = 138;
        arrn[237] = 236;
        arrn[238] = 205;
        arrn[239] = 93;
        arrn[240] = 222;
        arrn[241] = 114;
        arrn[242] = 67;
        arrn[243] = 29;
        arrn[244] = 24;
        arrn[245] = 72;
        arrn[246] = 243;
        arrn[247] = 141;
        arrn[248] = 128;
        arrn[249] = 195;
        arrn[250] = 78;
        arrn[251] = 66;
        arrn[252] = 215;
        arrn[253] = 61;
        arrn[254] = 156;
        arrn[255] = 180;
        int[] arrn2 = arrn;
        int n = 0;
        while (n < 512) {
            ((int[])o.a((Object)this, (int)-585284094))[n] = arrn2[n & 255];
            ++n;
        }
    }

    public OihG(long l) {
        this(new Random(l));
    }

    public OihG(Random random) {
        this.offsetX = OihG.vp(random) * 256.0;
        this.offsetY = OihG.vp(random) * 256.0;
        this.offsetZ = OihG.vp(random) * 256.0;
        int n = 0;
        while (n < 256) {
            ((int[])o.a((Object)this, (int)-585284094))[n] = OihG.vp(random, 256);
            ++n;
        }
        n = 0;
        while (n < 256) {
            reference var3_3 = OihG.vp(random, 256 - n) + n;
            int n2 = ((int[])o.a(this, -585284094))[n];
            ((int[])o.a((Object)this, (int)-585284094))[n] = ((int[])o.a(this, -585284094))[var3_3];
            ((int[])o.a((Object)this, (int)-585284094))[var3_3] = n2;
            ((int[])o.a((Object)this, (int)-585284094))[n + 256] = ((int[])o.a(this, -585284094))[n];
            ++n;
        }
    }

    public static double getNoise(double d) {
        return ((OihG)o.k(-393656941)).noise(d);
    }

    public static double getNoise(double d, double d2) {
        return ((OihG)o.k(-393656941)).noise(d, d2);
    }

    public static double getNoise(double d, double d2, double d3) {
        return ((OihG)o.k(-393656941)).noise(d, d2, d3);
    }

    public static OihG uWRY() {
        return (OihG)o.k(-393656941);
    }

    @Override
    public double noise(double d, double d2, double d3) {
        int n = OihG.floor(d += ((Double)o.a(this, 1645757951)).doubleValue());
        int n2 = OihG.floor(d2 += ((Double)o.a(this, 424691198)).doubleValue());
        int n3 = OihG.floor(d3 += ((Double)o.a(this, -284736003)).doubleValue());
        int n4 = n & 255;
        int n5 = n2 & 255;
        int n6 = n3 & 255;
        double d4 = OihG.fade(d -= (double)n);
        double d5 = OihG.fade(d2 -= (double)n2);
        double d6 = OihG.fade(d3 -= (double)n3);
        int n7 = ((int[])o.a(this, -585284094))[n4] + n5;
        int n8 = ((int[])o.a(this, -585284094))[n7] + n6;
        int n9 = ((int[])o.a(this, -585284094))[n7 + 1] + n6;
        int n10 = ((int[])o.a(this, -585284094))[n4 + 1] + n5;
        int n11 = ((int[])o.a(this, -585284094))[n10] + n6;
        int n12 = ((int[])o.a(this, -585284094))[n10 + 1] + n6;
        return OihG.lerp(d6, OihG.lerp(d5, OihG.lerp(d4, OihG.grad(((int[])o.a(this, -585284094))[n8], d, d2, d3), OihG.grad(((int[])o.a(this, -585284094))[n11], d - 1.0, d2, d3)), OihG.lerp(d4, OihG.grad(((int[])o.a(this, -585284094))[n9], d, d2 - 1.0, d3), OihG.grad(((int[])o.a(this, -585284094))[n12], d - 1.0, d2 - 1.0, d3))), OihG.lerp(d5, OihG.lerp(d4, OihG.grad(((int[])o.a(this, -585284094))[n8 + 1], d, d2, d3 - 1.0), OihG.grad(((int[])o.a(this, -585284094))[n11 + 1], d - 1.0, d2, d3 - 1.0)), OihG.lerp(d4, OihG.grad(((int[])o.a(this, -585284094))[n9 + 1], d, d2 - 1.0, d3 - 1.0), OihG.grad(((int[])o.a(this, -585284094))[n12 + 1], d - 1.0, d2 - 1.0, d3 - 1.0))));
    }

    public static double getNoise(double d, int n, double d2, double d3) {
        return ((OihG)o.k(-393656941)).noise(d, n, d2, d3);
    }

    public static double getNoise(double d, double d2, int n, double d3, double d4) {
        return ((OihG)o.k(-393656941)).noise(d, d2, n, d3, d4);
    }

    public static double getNoise(double d, double d2, double d3, int n, double d4, double d5) {
        return ((OihG)o.k(-393656941)).noise(d, d2, d3, n, d4, d5);
    }

    private static Object vp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

