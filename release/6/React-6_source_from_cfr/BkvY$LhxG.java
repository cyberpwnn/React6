/*
 * Decompiled with CFR 0_123.
 */
import java.math.BigInteger;

public class BkvY$LhxG
extends Thread {
    private static volatile Object[] W;
    private final int k;
    private static final BigInteger[] B;

    BkvY$LhxG(int n) {
        this.k = n;
    }

    static {
        B = new BigInteger[1];
    }

    public void run() {
        BkvY$LhxG.n(this.k, null);
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
    private static final void n(int var0, Object var1_1) {
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
                BkvY$LhxG.W = v0;
                return;
            }
            case 1: {
                var2_3 = new int[256];
                var3_12 = 0;
                var4_22 = 1;
                do {
                    if (var3_12 >= 256) {
                        BkvY$LhxG.n(2, var2_3);
                        return;
                    }
                    var2_3[var3_12] = var4_22;
                    var4_22 ^= var4_22 << 1 ^ (var4_22 >>> 7) * 283;
                    ++var3_12;
                } while (true);
            }
            case 2: {
                var2_4 = (byte[])BkvY$LhxG.W[0];
                var2_4[0] = 99;
                var3_13 = (int[])var1_1;
                for (var4_23 = 0; var4_23 < 255; var5_33 ^= var5_33 >> 4 ^ var5_33 >> 5 ^ var5_33 >> 6 ^ var5_33 >> 7, ++var4_23) {
                    var5_33 = var3_13[255 - var4_23];
                    var5_33 |= var5_33 << 8;
                    var2_4[var3_13[var4_23]] = (byte)(var5_33 ^ 99);
                }
                var4_24 = (int[])BkvY$LhxG.W[1];
                var5_34 = (int[])BkvY$LhxG.W[2];
                var6_42 = (int[])BkvY$LhxG.W[3];
                var7_48 = (int[])BkvY$LhxG.W[4];
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
                var2_5 = "\uc742\u8206\u971a\uc66d\ub941\u92df\u0f8b\u73c5\u2fa2\u2a6e\ud40f\uf480\uce89\u4589\ubc3d\ub77f\ufd1d\u6487\u3a3b\uf497\u5d3a\uc204\u47bd\u58a0\uf3cb\ucc1b\u50d7\u3396\u8598\uf75b\uc240\ufb23\u8dad\u1f17\u3b83\u0856\u8c6d\ua1f9\u1841\u6b5f\u8978\u27ab\ud9c9\u076e\u9999\u8d26\ue5c1\u0fc4\uf4f6\u8518\ube65\u9b0c\u160e\ue8b0\u048f\uc305\ubcd9|\u2a9a\ufe64\ua62b\ueb7b\u1e17\u4878\uea23\u2a67\u9a3d\u2215\u1477\uf850\u0b1d\uf4b2\u878a\u86c6\u8a46\u8229\u92f6\u1ddb\uad50\ub6fc\ub26a\uf48b\u14ea\u34eb\u1705\u5fbf\ucc87\u54d9\u9d54\ueb0e\udfdf\u8713\ue2df\ua2a6\ubcc1\u55de\u54fa\uc258\u8b3e\u672b\u59c9\u4e77\u4010\uaa3d\u82d3\u38dd\u8f4d\uf73f\ud064\ua89a\u08cf\u454e\u011c\uc9cf\u8ca6\uc5be\ud2b4\uc7b5\u27b9\u1279\ue0ff\udb1f\u8c46\u9b00\u66cb\u1365\u340d\uaa29".toCharArray();
                var3_14 = new byte[var2_5.length * 2];
                for (var4_25 = 0; var4_25 < var2_5.length; ++var4_25) {
                    var3_14[var4_25 * 2] = (byte)(var2_5[var4_25] & 255);
                    var3_14[var4_25 * 2 + 1] = (byte)((var2_5[var4_25] & 65280) >> 8);
                }
                var2_5 = "\u3e11\u79b0\u6bca\ub810\u1937\u4fe4\ud81b\u8633\u113e\u2d94\u692d\u74a6\u1655\ue947\u7151\u6ba3\udb69\u05c8\u4215\ua21b\u87cd\uf13f\ub0ca\uc018\u24b5\u6298\u28ac\u8ecc\ud2bb\u7d35\u6376\u9790\ue200\ue3aa\udd2f\uca2e\u494a\u8fb1\ubf86\uea98\u7ea4\u1433\u0f3e\uedc1\ucb96\u5c7a\ub21d\uc493\ueb04\u8040\uefc6\u077e\ub385\u7d89\ue44e\u3539e\u0897\ufcea\u2cd2\u5ffd\ub6c7\u6c6f\u2772\uf089\ua6a7\u0c2d\u5223\u9fc4\u77fd\u1c96\u0981\u4897\uf1b7\ufd91\ue0bf\u1bb1\u3068\u2e01\u2b48\u09d7\u3691\u6de0\u7b62\u7c11\u5db9\uab22\u6f04\u8fc3\u9158\u1ff0\ufca3\ufbe7\u6947\uda60\uf965\u50a3\u26c3\u26c1\ucb2f>\u61f7\u7bea\u5e79\u97c2\u6d41\u3c2d\uf3ea\u9c6b\u4cc5\u7f3a\ua5fa\u8bc8\ufc99\u4d5b\u4f41\u4903\u67bf\u07b9\ub487\u0125\ua209\u2f25\ue776\u50d6\ua319\u931b\u6c52".toCharArray();
                var4_26 = new byte[var2_5.length * 2];
                for (var5_35 = 0; var5_35 < var2_5.length; ++var5_35) {
                    var4_26[var5_35 * 2] = (byte)(var2_5[var5_35] & 255);
                    var4_26[var5_35 * 2 + 1] = (byte)((var2_5[var5_35] & 65280) >> 8);
                }
                var5_36 = new byte[16];
                try {
                    var5_36[0] = var3_14[var4_26[203] & 255];
                    var5_36[1] = var3_14[var4_26[170] & 255];
                    var5_36[2] = var3_14[var4_26[161] & 255];
                    var5_36[3] = var3_14[var4_26[212] & 255];
                    var5_36[4] = var3_14[var4_26[129] & 255];
                    var5_36[5] = var3_14[var4_26[14] & 255];
                    var5_36[6] = var3_14[var4_26[83] & 255];
                    var5_36[7] = var3_14[var4_26[66] & 255];
                    ** GOTO lbl91
                }
                catch (Exception var6_43) {}
                ** GOTO lbl91
                finally {
                    var5_36[8] = var3_14[var4_26[246] & 255];
                    var5_36[9] = var3_14[var4_26[106] & 255];
                    var5_36[10] = var3_14[var4_26[34] & 255];
                    var5_36[11] = var3_14[var4_26[220] & 255];
                    var5_36[12] = var3_14[var4_26[153] & 255];
                    var5_36[13] = var3_14[var4_26[10] & 255];
                    var5_36[14] = var3_14[var4_26[142] & 255];
                    var5_36[15] = var3_14[var4_26[16] & 255];
                }
lbl91: // 2 sources:
                BkvY$LhxG.n(5, var5_36);
                return;
            }
            case 4: {
                var2_6 = new int[]{-2102326616, -1906052250, 1692891207, 2862638};
                var3_15 = 0 ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1;
                var2_6[2] = var2_6[2] ^ (int)var3_15;
                BkvY$LhxG.W[6] = var2_6;
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
                BkvY$LhxG.W[5] = var6_44;
                BkvY$LhxG.n(6, null);
                return;
            }
            case 6: {
                var2_8 = new int[30];
                var4_28 = 1;
                for (var3_17 = 0; var3_17 < 30; ++var3_17) {
                    var2_8[var3_17] = var4_28;
                    var4_28 = var4_28 << 1 ^ (var4_28 >>> 7) * 283;
                }
                var3_18 = (int[])BkvY$LhxG.W[5];
                var4_29 = (byte[])BkvY$LhxG.W[0];
                var5_38 = 44;
                var6_45 = 4;
                while (var6_45 < var5_38) {
                    var7_50 = var3_18[(var6_45 - 1 >> 2) * 4 + (var6_45 - 1 & 3)];
                    if (var6_45 % 4 == 0) {
                        var7_50 = BkvY$LhxG.U(var4_29, BkvY$LhxG.x(var7_50, 8)) ^ var2_8[var6_45 / 4 - 1];
                    }
                    var3_18[(var6_45 >> 2) * 4 + (var6_45 & 3)] = var3_18[(var6_45 - 4 >> 2) * 4 + (var6_45 - 4 & 3)] ^ var7_50;
                    ++var6_45;
                }
                return;
            }
            case 7: {
                var2_9 = BkvY$LhxG.B;
                var3_19 = new BigInteger("10001", 16);
                var4_30 = new BigInteger("60fcs75hfr8s", 36);
                var5_39 = new BigInteger("1tktoxg6kzsap", 36);
                var6_46 = new BigInteger("1fo73at6e1ue8", 36);
                var7_51 = new BigInteger("1n3kaw61dsabb", 36);
                var8_55 = 0;
                do {
                    if (var8_55 >= 4) {
                        v1 = (int[])BkvY$LhxG.W[6];
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
                var2_10 = BkvY$LhxG.B;
                var3_20 = new BigInteger("10001", 16);
                var4_31 = new BigInteger("9b74ixfcz1sq", 36);
                var5_40 = new BigInteger("1eo2mnqlj61ws", 36);
                var6_47 = new BigInteger("rqnwsy5s3au0", 36);
                var7_52 = new BigInteger("tmkzneutec9g", 36);
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
                v2 = (int[])BkvY$LhxG.W[6];
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
    private static final int x(int n, int n2) {
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
    private static final int U(byte[] arrby, int n) {
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

    private static final void v31164() {
        BkvY$LhxG.n(0, null);
        BkvY$LhxG.o();
        BkvY$LhxG bkvY$LhxG = new BkvY$LhxG(1);
        bkvY$LhxG.start();
        bkvY$LhxG.join();
        BkvY$LhxG bkvY$LhxG2 = new BkvY$LhxG(3);
        bkvY$LhxG2.start();
        BkvY$LhxG bkvY$LhxG3 = new BkvY$LhxG(4);
        bkvY$LhxG3.start();
        bkvY$LhxG2.join();
        bkvY$LhxG3.join();
        BkvY$LhxG bkvY$LhxG4 = new BkvY$LhxG(7);
        BkvY$LhxG bkvY$LhxG5 = new BkvY$LhxG(8);
        bkvY$LhxG4.start();
        bkvY$LhxG5.start();
        bkvY$LhxG4.join();
        bkvY$LhxG5.join();
    }

    /*
     * Exception decompiling
     */
    private static final void o() {
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
    static final String I(Object arrc) {
        boolean bl = false;
        int n = 0;
        if (W == null) {
            BkvY$LhxG.v31164();
        }
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        String string = arrstackTraceElement[(Integer)W[7]].getClassName();
        stringBuilder = stringBuilder.append(string);
        string = arrstackTraceElement[(Integer)W[7]].getMethodName();
        int n2 = stringBuilder.append(string).toString().hashCode();
        int[] arrn = (int[])W[6];
        int n3 = n2 ^ arrn[0];
        int n4 = n2 ^ arrn[1];
        int n5 = n2 ^ arrn[2];
        int n6 = n2 ^ arrn[3];
        int[] arrn2 = (int[])W[5];
        int[] arrn3 = (int[])W[1];
        int[] arrn4 = (int[])W[2];
        int[] arrn5 = (int[])W[3];
        int[] arrn6 = (int[])W[4];
        byte[] arrby = (byte[])W[0];
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

