/*
 * Decompiled with CFR 0_123.
 */
import java.math.BigInteger;

public class mrFx$WjFM
extends Thread {
    private static volatile Object[] C;
    private final int i;
    private static final BigInteger[] e;

    mrFx$WjFM(int n) {
        this.i = n;
    }

    static {
        e = new BigInteger[1];
    }

    public void run() {
        mrFx$WjFM.O(this.i, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static final void O(int var0, Object var1_1) {
        switch (var0) {
            case 0: {
                var2_2 = new byte[256];
                var3_11 = new int[256];
                var4_21 = new int[256];
                var5_32 = new int[256];
                var6_41 = new int[256];
                v0 = new Object[8];
                v0[0] = var2_2;
                v0[1] = var3_11;
                v0[2] = var4_21;
                v0[3] = var5_32;
                v0[4] = var6_41;
                v0[5] = null;
                v0[6] = null;
                mrFx$WjFM.C = v0;
                return;
            }
            case 1: {
                var2_3 = new int[256];
                var3_12 = 0;
                var4_22 = 1;
                do {
                    if (var3_12 >= 256) {
                        mrFx$WjFM.O(2, var2_3);
                        return;
                    }
                    var2_3[var3_12] = var4_22;
                    var4_22 ^= var4_22 << 1 ^ (var4_22 >>> 7) * 283;
                    ++var3_12;
                } while (true);
            }
            case 2: {
                var2_4 = (byte[])mrFx$WjFM.C[0];
                var2_4[0] = 99;
                var3_13 = (int[])var1_1;
                for (var4_23 = 0; var4_23 < 255; var5_33 ^= var5_33 >> 4 ^ var5_33 >> 5 ^ var5_33 >> 6 ^ var5_33 >> 7, ++var4_23) {
                    var5_33 = var3_13[255 - var4_23];
                    var5_33 |= var5_33 << 8;
                    var2_4[var3_13[var4_23]] = (byte)(var5_33 ^ 99);
                }
                var4_24 = (int[])mrFx$WjFM.C[1];
                var5_34 = (int[])mrFx$WjFM.C[2];
                var6_42 = (int[])mrFx$WjFM.C[3];
                var7_48 = (int[])mrFx$WjFM.C[4];
                var8_53 = 0;
                while (var8_53 < 256) {
                    var9_57 = var2_4[var8_53] & 255;
                    var10_62 = var9_57 << 1 ^ (var9_57 >>> 7) * 283;
                    var11_63 = (var9_57 ^ var10_62) << 24 ^ var9_57 << 16 ^ var9_57 << 8 ^ var10_62;
                    var4_24[var8_53] = var11_63 &= -1;
                    var5_34[var8_53] = var11_63 << 8 | var11_63 >>> -8;
                    var6_42[var8_53] = var11_63 << 16 | var11_63 >>> -16;
                    var7_48[var8_53] = var11_63 << 24 | var11_63 >>> -24;
                    ++var8_53;
                }
                return;
            }
            case 3: {
                var2_5 = "\ub01d\uf559\ue045\ub132\u9f24\u2259\udd70\ueada\u5a2e\u9e18\u82aa\u44f1\uaf3c\u8102\ub346\ub9a2\u5e39\udc46\u247f\u05ee\u575c\u54c1\u89f3\u1eb9\u1546\ud1c5\u76b2\u8310\u5763\u6e44\ub7cc\u4f55\udb08\uaf66\u5a36\uccdd\u2b4b\u5183\uc900\u201f\u223b\udf40\u7bb6\u7359\u28ef\u552d\u0192\u1324\ua27e\u8a73\ucde3\u11de\u4ffa\ue2a7\uc2f5\u367b\ue904\u5665\u16cd\uafaf\ube7d\u75e5\u4472\uf9d2\ua11c\ub0a6\u10c2\u569e\u1743\u21ac\u54aa\u9135\ue0ed\udd5c\uc29f\ubf2b\u8d0b\u0b36\u7fd6\u481b\u933b\ufb9c\u6b44\u07fe\u05da\ua38f\u25fe\u2404\u891e\u9119\ue37d\uc39f\ua200\u9592\u622f\u0af4\u070c\ue07f\ud938\u201b\u0dce\ue4a6\u8ca6\u1b7f\uc695\u200e\ud9df\u0fff\u417b\u4214\u232f\u515d\u6a09\u5b21\uded6\u2c05\u1a84\u8d46\ua0c5\u6b2a\ua8cc\u40cd\ubf09\u701b\u03ed\ud3ab\u3e3e\uc5e9".toCharArray();
                var3_14 = new byte[var2_5.length * 2];
                for (var4_25 = 0; var4_25 < var2_5.length; ++var4_25) {
                    var3_14[var4_25 * 2] = (byte)(var2_5[var4_25] & 255);
                    var3_14[var4_25 * 2 + 1] = (byte)((var2_5[var4_25] & 65280) >> 8);
                }
                var2_5 = "\u7894\ue952\uc644\u8293\ud15d\u21c6\u3893\u3e68\u9c3a\u925c\u28ea\uab09\u4dad\u4bc2\u774c\u8ca8\u41be\u0f30\u25b6\u9ae2\uc728\uc52e\ud04c\ufbe7\uff37\uda88\u6b64\ud2d5\u9bbc\u7f4d\u8629\u10f8\u703a\u1576\ua68e\u15a2\u41ce\u3ac7\udf26\ubba7\ube8e\u182f\u01fe\u1b57\ub749\uacda\uf730\u207b\u1e51\ub813\ueb6c\u9076\u6166\u4ab9\udd0b\ue5f2\uaf13\uaa5d\u1d3b\u9281\ubd4d\ucf19\u6cfc\u9524\u6036\u7bc6\u7ac7\u0c8f\u8b0c\ue923\ubdcb\u80d2\u159b\u93ba\u9f25\u4c49\u74ac\u3634\u0c2b\ud205\u524d\u1f1c\u84aa\ub1cf\u4a99\uf35b\u1fb8\u9cfb\ua4b3\ub019\u550b\uc677\u1fd1\u751b\u92be\ub038\ue0f1\u8bc1\ub60a\ue35e\uac46\ud0a8\ufdd5\u48fb\u35c0\u2460\u83c7\u069a\u2788\ue166\u7823\u9ddc\u1a06\uee28\u02b8\u97f6\u3c8d\ub1bb\u8d45\ud6cc\u1934\u2acf\ud2c8\u2669\ufa15\ubad0\u276b\u3430".toCharArray();
                var4_26 = new byte[var2_5.length * 2];
                for (var5_35 = 0; var5_35 < var2_5.length; ++var5_35) {
                    var4_26[var5_35 * 2] = (byte)(var2_5[var5_35] & 255);
                    var4_26[var5_35 * 2 + 1] = (byte)((var2_5[var5_35] & 65280) >> 8);
                }
                var5_36 = new byte[16];
                try {
                    var5_36[0] = var3_14[var4_26[149] & 255];
                    var5_36[1] = var3_14[var4_26[49] & 255];
                    var5_36[2] = var3_14[var4_26[84] & 255];
                    var5_36[3] = var3_14[var4_26[223] & 255];
                    var5_36[4] = var3_14[var4_26[39] & 255];
                    var5_36[5] = var3_14[var4_26[218] & 255];
                    var5_36[6] = var3_14[var4_26[62] & 255];
                    var5_36[7] = var3_14[var4_26[40] & 255];
                    ** GOTO lbl91
                }
                catch (Exception var6_43) {}
                ** GOTO lbl91
                finally {
                    var5_36[8] = var3_14[var4_26[150] & 255];
                    var5_36[9] = var3_14[var4_26[189] & 255];
                    var5_36[10] = var3_14[var4_26[159] & 255];
                    var5_36[11] = var3_14[var4_26[113] & 255];
                    var5_36[12] = var3_14[var4_26[92] & 255];
                    var5_36[13] = var3_14[var4_26[102] & 255];
                    var5_36[14] = var3_14[var4_26[202] & 255];
                    var5_36[15] = var3_14[var4_26[46] & 255];
                }
lbl91: // 2 sources:
                mrFx$WjFM.O(5, var5_36);
                return;
            }
            case 4: {
                var2_6 = new int[]{-208698395, -1351384870, -1299587556, -1853138638};
                var3_15 = 0 ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1;
                var2_6[2] = var2_6[2] ^ (int)var3_15;
                mrFx$WjFM.C[6] = var2_6;
                return;
            }
            case 5: {
                var2_7 = (byte[])var1_1;
                var3_16 = 4;
                var5_37 = var3_16 + 6;
                var6_44 = new int[(var5_37 + 1) * 4];
                var4_27 = 0;
                try {
                    for (var7_49 = 0; var7_49 < 16; var7_49 += 4, ++var4_27) {
                        var6_44[(var4_27 >> 2) * 4 + var4_27 & 3] = var2_7[var7_49] & 255 | (var2_7[var7_49 + 1] & 255) << 8 | (var2_7[var7_49 + 2] & 255) << 16 | var2_7[var7_49 + 3] << 24;
                    }
                }
                catch (Exception var8_54) {
                    // empty catch block
                }
                mrFx$WjFM.C[5] = var6_44;
                mrFx$WjFM.O(6, null);
                return;
            }
            case 6: {
                var2_8 = new int[30];
                var4_28 = 1;
                for (var3_17 = 0; var3_17 < 30; ++var3_17) {
                    var2_8[var3_17] = var4_28;
                    var4_28 = var4_28 << 1 ^ (var4_28 >>> 7) * 283;
                }
                var3_18 = (int[])mrFx$WjFM.C[5];
                var4_29 = (byte[])mrFx$WjFM.C[0];
                var5_38 = 44;
                var6_45 = 4;
                while (var6_45 < var5_38) {
                    var7_50 = var3_18[(var6_45 - 1 >> 2) * 4 + (var6_45 - 1 & 3)];
                    if (var6_45 % 4 == 0) {
                        var7_50 = mrFx$WjFM.t(var4_29, mrFx$WjFM.T(var7_50, 8)) ^ var2_8[var6_45 / 4 - 1];
                    }
                    var3_18[(var6_45 >> 2) * 4 + (var6_45 & 3)] = var3_18[(var6_45 - 4 >> 2) * 4 + (var6_45 - 4 & 3)] ^ var7_50;
                    ++var6_45;
                }
                return;
            }
            case 7: {
                var2_9 = mrFx$WjFM.e;
                var3_19 = new BigInteger("10001", 16);
                var4_30 = new BigInteger("c0ncd2oesorc", 36);
                var5_39 = new BigInteger("1jufx7dj5g167", 36);
                var6_46 = new BigInteger("c3i45hto3e4h", 36);
                var7_51 = new BigInteger("huansx5pn8v7", 36);
                var8_55 = 0;
                do {
                    if (var8_55 >= 4) {
                        v1 = (int[])mrFx$WjFM.C[6];
                        v1[0] = v1[0] ^ var7_51.intValue();
                        return;
                    }
                    for (var9_59 = 0; var9_59 < 8; ++var9_59) {
                        var7_51 = var7_51.add(var5_39).xor(var6_46).modPow(var3_19, var4_30);
                    }
                    var9_58 = var2_9;
                    // MONITORENTER : var9_58
                    while (var2_9[0] == null) {
                        var2_9.wait(5000);
                    }
                    var5_39 = var5_39.xor(var2_9[0]);
                    var2_9[0] = null;
                    // MONITOREXIT : var9_58
                    ++var8_55;
                } while (true);
            }
            case 8: {
                var2_10 = mrFx$WjFM.e;
                var3_20 = new BigInteger("10001", 16);
                var4_31 = new BigInteger("fhxhfwuhmuig", 36);
                var5_40 = new BigInteger("18dsphpf9ii8j", 36);
                var6_47 = new BigInteger("1mxq69dwlygvy", 36);
                var7_52 = new BigInteger("iepf2w1sor55", 36);
                for (var8_56 = 0; var8_56 < 4; ++var8_56) {
                    for (var9_61 = 0; var9_61 < 8; ++var9_61) {
                        var7_52 = var7_52.add(var5_40).xor(var6_47).modPow(var3_20, var4_31);
                    }
                    do {
                        Thread.yield();
                        var9_60 = var2_10;
                        // MONITORENTER : var9_60
                        if (var2_10[0] == null) break;
                        var2_10.notifyAll();
                        // MONITOREXIT : var9_60
                    } while (true);
                    var2_10[0] = var7_52;
                    var2_10.notifyAll();
                    // MONITOREXIT : var9_60
                }
                v2 = (int[])mrFx$WjFM.C[6];
                v2[1] = v2[1] ^ var7_52.intValue();
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final int T(int n, int n2) {
        int n3 = 0;
        int n4 = n;
        int n5 = n2;
        int n6 = n5 + n4 >> 24;
        n3 = 0;
        if (n3 == 0) {
            n3 = 3;
            return n >>> n2 | n << - n2;
        }
        Object var1_2 = null;
        n3 = 0;
        if (n3 != 0) return n5;
        ++n3;
        return n4 + n6;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final int t(byte[] arrby, int n) {
        int n2 = 0;
        int n3 = arrby[10] << 16;
        n2 = 0;
        if (n2 == 0) {
            n2 = 3;
            return arrby[n & 255] & 255 | (arrby[n >> 8 & 255] & 255) << 8 | (arrby[n >> 16 & 255] & 255) << 16 | arrby[n >> 24 & 255] << 24;
        }
        Object var3_4 = null;
        n2 = 0;
        if (n2 != 0) return n3;
        n2 = 2;
        return arrby[n & 127] >> 8;
    }

    private static final void X21756() {
        mrFx$WjFM.O(0, null);
        mrFx$WjFM.Y();
        mrFx$WjFM mrFx$WjFM = new mrFx$WjFM(1);
        mrFx$WjFM.start();
        mrFx$WjFM.join();
        mrFx$WjFM mrFx$WjFM2 = new mrFx$WjFM(3);
        mrFx$WjFM2.start();
        mrFx$WjFM mrFx$WjFM3 = new mrFx$WjFM(4);
        mrFx$WjFM3.start();
        mrFx$WjFM2.join();
        mrFx$WjFM3.join();
        mrFx$WjFM mrFx$WjFM4 = new mrFx$WjFM(7);
        mrFx$WjFM mrFx$WjFM5 = new mrFx$WjFM(8);
        mrFx$WjFM4.start();
        mrFx$WjFM5.start();
        mrFx$WjFM4.join();
        mrFx$WjFM5.join();
    }

    /*
     * Exception decompiling
     */
    private static final void Y() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Backjump on non jumping statement [3] lbl27 : TryStatement: try { 2[TRYBLOCK]

        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
        // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:35)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static final String d(Object arrc) {
        boolean bl = false;
        int n = 0;
        if (C == null) {
            mrFx$WjFM.X21756();
        }
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        String string = arrstackTraceElement[(Integer)C[7]].getClassName();
        stringBuilder = stringBuilder.append(string);
        string = arrstackTraceElement[(Integer)C[7]].getMethodName();
        int n2 = stringBuilder.append(string).toString().hashCode();
        int[] arrn = (int[])C[6];
        int n3 = n2 ^ arrn[0];
        int n4 = n2 ^ arrn[1];
        int n5 = n2 ^ arrn[2];
        int n6 = n2 ^ arrn[3];
        int[] arrn2 = (int[])C[5];
        int[] arrn3 = (int[])C[1];
        int[] arrn4 = (int[])C[2];
        int[] arrn5 = (int[])C[3];
        int[] arrn6 = (int[])C[4];
        byte[] arrby = (byte[])C[0];
        arrc = ((String)arrc).toCharArray();
        n = 0;
        if (n != 0) {
            return new String(arrc);
        }
        ++n;
        int n7 = arrc.length;
        int n8 = 0;
        while (n8 < n7) {
            if (n8 % 8 == 0) {
                int n9;
                int n10;
                int n11;
                int n12 = 0;
                n12 = 0;
                n12 = 0;
                n12 = 0;
                int n13 = n3 ^ arrn2[0];
                int n14 = n4 ^ arrn2[1];
                int n15 = n5 ^ arrn2[2];
                int n16 = n6 ^ arrn2[3];
                for (n12 = 4; n12 < 36; n12 += 4) {
                    n10 = arrn3[n13 & 255] ^ arrn4[n14 >> 8 & 255] ^ arrn5[n15 >> 16 & 255] ^ arrn6[n16 >>> 24] ^ arrn2[n12];
                    n11 = arrn3[n14 & 255] ^ arrn4[n15 >> 8 & 255] ^ arrn5[n16 >> 16 & 255] ^ arrn6[n13 >>> 24] ^ arrn2[n12 + 1];
                    n9 = arrn3[n15 & 255] ^ arrn4[n16 >> 8 & 255] ^ arrn5[n13 >> 16 & 255] ^ arrn6[n14 >>> 24] ^ arrn2[n12 + 2];
                    n16 = arrn3[n16 & 255] ^ arrn4[n13 >> 8 & 255] ^ arrn5[n14 >> 16 & 255] ^ arrn6[n15 >>> 24] ^ arrn2[n12 + 3];
                    n13 = arrn3[n10 & 255] ^ arrn4[n11 >> 8 & 255] ^ arrn5[n9 >> 16 & 255] ^ arrn6[n16 >>> 24] ^ arrn2[n12 += 4];
                    n14 = arrn3[n11 & 255] ^ arrn4[n9 >> 8 & 255] ^ arrn5[n16 >> 16 & 255] ^ arrn6[n10 >>> 24] ^ arrn2[n12 + 1];
                    n15 = arrn3[n9 & 255] ^ arrn4[n16 >> 8 & 255] ^ arrn5[n10 >> 16 & 255] ^ arrn6[n11 >>> 24] ^ arrn2[n12 + 2];
                    n16 = arrn3[n16 & 255] ^ arrn4[n10 >> 8 & 255] ^ arrn5[n11 >> 16 & 255] ^ arrn6[n9 >>> 24] ^ arrn2[n12 + 3];
                }
                n9 = arrn3[n13 & 255] ^ arrn4[n14 >> 8 & 255] ^ arrn5[n15 >> 16 & 255] ^ arrn6[n16 >>> 24] ^ arrn2[n12];
                n11 = arrn3[n14 & 255] ^ arrn4[n15 >> 8 & 255] ^ arrn5[n16 >> 16 & 255] ^ arrn6[n13 >>> 24] ^ arrn2[n12 + 1];
                n10 = arrn3[n15 & 255] ^ arrn4[n16 >> 8 & 255] ^ arrn5[n13 >> 16 & 255] ^ arrn6[n14 >>> 24] ^ arrn2[n12 + 2];
                n16 = arrn3[n16 & 255] ^ arrn4[n13 >> 8 & 255] ^ arrn5[n14 >> 16 & 255] ^ arrn6[n15 >>> 24] ^ arrn2[n12 + 3];
                n15 = n12 + 4;
                n3 = arrby[n9 & 255] & 255 ^ (arrby[n11 >> 8 & 255] & 255) << 8 ^ (arrby[n10 >> 16 & 255] & 255) << 16 ^ arrby[n16 >>> 24] << 24 ^ arrn2[n15 + 0];
                n4 = arrby[n11 & 255] & 255 ^ (arrby[n10 >> 8 & 255] & 255) << 8 ^ (arrby[n16 >> 16 & 255] & 255) << 16 ^ arrby[n9 >>> 24] << 24 ^ arrn2[n15 + 1];
                n5 = arrby[n10 & 255] & 255 ^ (arrby[n16 >> 8 & 255] & 255) << 8 ^ (arrby[n9 >> 16 & 255] & 255) << 16 ^ arrby[n11 >>> 24] << 24 ^ arrn2[n15 + 2];
                n6 = arrby[n16 & 255] & 255 ^ (arrby[n9 >> 8 & 255] & 255) << 8 ^ (arrby[n11 >> 16 & 255] & 255) << 16 ^ arrby[n10 >>> 24] << 24 ^ arrn2[n15 + 3];
            }
            if (!(bl = false)) {
                bl = true;
                switch (n8 % 8) {
                    case 0: {
                        arrc[n8] = (char)(n3 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 1: {
                        arrc[n8] = (char)(n3 ^ arrc[n8]);
                        break;
                    }
                    case 2: {
                        arrc[n8] = (char)(n4 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 3: {
                        arrc[n8] = (char)(n4 ^ arrc[n8]);
                        break;
                    }
                    case 4: {
                        arrc[n8] = (char)(n5 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 5: {
                        arrc[n8] = (char)(n5 ^ arrc[n8]);
                        break;
                    }
                    case 6: {
                        arrc[n8] = (char)(n6 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 7: {
                        arrc[n8] = (char)(n6 ^ arrc[n8]);
                    }
                }
            } else {
                Object var13_5 = null;
            }
            ++n8;
        }
        return new String(arrc);
    }
}

