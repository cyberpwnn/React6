/*
 * Decompiled with CFR 0_123.
 */
public class jXBg {
    private byte KNcS;

    public jXBg(byte by) {
        this.KNcS = by;
    }

    public byte aoQC() {
        if (((Byte)cv.b(this, 1661073543)).byteValue() > 7) {
            return 7;
        }
        if (((Byte)cv.b(this, 1661073543)).byteValue() < 0) {
            return 0;
        }
        return ((Byte)cv.b(this, 1661073543)).byteValue();
    }

    public void OXeK(byte by) {
        cv.e(this, 1661073543, Byte.valueOf(by));
    }
}

