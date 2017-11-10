/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class xGQd {
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final char DIR_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX;
    public static final String LINE_SEPARATOR_WINDOWS;
    public static final String LINE_SEPARATOR;
    private static final int DEFAULT_BUFFER_SIZE = 4096;

    static {
        LINE_SEPARATOR_UNIX = NVIs$JbpD.H("\u71c5");
        LINE_SEPARATOR_WINDOWS = NVIs$JbpD.H("\u71c2\u815c");
        yy.K(-2019424192, Character.valueOf(((Character)yy.p(67045479)).charValue()));
        StringWriter stringWriter = new StringWriter(4);
        PrintWriter printWriter = new PrintWriter(stringWriter);
        xGQd.tM(printWriter);
        yy.K(833882003, xGQd.tM(stringWriter));
    }

    public static void closeQuietly(Reader reader) {
        try {
            if (reader != null) {
                xGQd.tM(reader);
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void closeQuietly(Writer writer) {
        try {
            if (writer != null) {
                xGQd.tM(writer);
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        try {
            if (inputStream != null) {
                xGQd.tM(inputStream);
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void closeQuietly(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                xGQd.tM(outputStream);
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xGQd.copy(inputStream, (OutputStream)byteArrayOutputStream);
        return (byte[])xGQd.tM(byteArrayOutputStream);
    }

    public static byte[] toByteArray(Reader reader) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xGQd.copy(reader, (OutputStream)byteArrayOutputStream);
        return (byte[])xGQd.tM(byteArrayOutputStream);
    }

    public static byte[] toByteArray(Reader reader, String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xGQd.copy(reader, byteArrayOutputStream, string);
        return (byte[])xGQd.tM(byteArrayOutputStream);
    }

    public static byte[] toByteArray(String string) throws IOException {
        return (byte[])xGQd.tM(string);
    }

    public static char[] toCharArray(InputStream inputStream) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        xGQd.copy(inputStream, (Writer)charArrayWriter);
        return (char[])xGQd.tM(charArrayWriter);
    }

    public static char[] toCharArray(InputStream inputStream, String string) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        xGQd.copy(inputStream, charArrayWriter, string);
        return (char[])xGQd.tM(charArrayWriter);
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        xGQd.copy(reader, (Writer)charArrayWriter);
        return (char[])xGQd.tM(charArrayWriter);
    }

    public static String toString(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        xGQd.copy(inputStream, (Writer)stringWriter);
        return xGQd.tM(stringWriter);
    }

    public static String toString(InputStream inputStream, String string) throws IOException {
        StringWriter stringWriter = new StringWriter();
        xGQd.copy(inputStream, stringWriter, string);
        return xGQd.tM(stringWriter);
    }

    public static String toString(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        xGQd.copy(reader, (Writer)stringWriter);
        return xGQd.tM(stringWriter);
    }

    public static String toString(byte[] arrby) throws IOException {
        return new String(arrby);
    }

    public static String toString(byte[] arrby, String string) throws IOException {
        if (string == null) {
            return new String(arrby);
        }
        return new String(arrby, string);
    }

    public static List<String> readLines(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        return xGQd.readLines(inputStreamReader);
    }

    public static List<String> readLines(InputStream inputStream, String string) throws IOException {
        if (string == null) {
            return xGQd.readLines(inputStream);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        return xGQd.readLines(inputStreamReader);
    }

    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = xGQd.tM(bufferedReader);
        while (object != null) {
            arrayList.add((String)object);
            object = xGQd.tM(bufferedReader);
        }
        return arrayList;
    }

    public static InputStream toInputStream(String string) {
        byte[] arrby = (byte[])xGQd.tM(string);
        return new ByteArrayInputStream(arrby);
    }

    public static InputStream toInputStream(String string, String string2) throws IOException {
        byte[] arrby = string2 != null ? (byte[])xGQd.tM(string, string2) : (byte[])xGQd.tM(string);
        return new ByteArrayInputStream(arrby);
    }

    public static void write(byte[] arrby, OutputStream outputStream) throws IOException {
        if (arrby != null) {
            xGQd.tM(outputStream, arrby);
        }
    }

    public static void write(byte[] arrby, Writer writer) throws IOException {
        if (arrby != null) {
            xGQd.tM(writer, new String(arrby));
        }
    }

    public static void write(byte[] arrby, Writer writer, String string) throws IOException {
        if (arrby != null) {
            if (string == null) {
                xGQd.write(arrby, writer);
                return;
            }
            xGQd.tM(writer, new String(arrby, string));
        }
    }

    public static void write(char[] arrc, Writer writer) throws IOException {
        if (arrc != null) {
            xGQd.tM(writer, arrc);
        }
    }

    public static void write(char[] arrc, OutputStream outputStream) throws IOException {
        if (arrc != null) {
            xGQd.tM(outputStream, (byte[])xGQd.tM(new String(arrc)));
        }
    }

    public static void write(char[] arrc, OutputStream outputStream, String string) throws IOException {
        if (arrc != null) {
            if (string == null) {
                xGQd.write(arrc, outputStream);
                return;
            }
            xGQd.tM(outputStream, (byte[])xGQd.tM(new String(arrc), string));
        }
    }

    public static void write(String string, Writer writer) throws IOException {
        if (string != null) {
            xGQd.tM(writer, string);
        }
    }

    public static void write(String string, OutputStream outputStream) throws IOException {
        if (string != null) {
            xGQd.tM(outputStream, (byte[])xGQd.tM(string));
        }
    }

    public static void write(String string, OutputStream outputStream, String string2) throws IOException {
        if (string != null) {
            if (string2 == null) {
                xGQd.write(string, outputStream);
                return;
            }
            xGQd.tM(outputStream, (byte[])xGQd.tM(string, string2));
        }
    }

    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            xGQd.tM(writer, xGQd.tM(stringBuffer));
        }
    }

    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        if (stringBuffer != null) {
            xGQd.tM(outputStream, (byte[])xGQd.tM(xGQd.tM(stringBuffer)));
        }
    }

    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String string) throws IOException {
        if (stringBuffer != null) {
            if (string == null) {
                xGQd.write(stringBuffer, outputStream);
                return;
            }
            xGQd.tM(outputStream, (byte[])xGQd.tM(xGQd.tM(stringBuffer), string));
        }
    }

    public static void writeLines(Collection<String> collection, String string, OutputStream outputStream) throws IOException {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = (String)yy.p(833882003);
        }
        for (String string2 : collection) {
            if (string2 != null) {
                xGQd.tM(outputStream, (byte[])xGQd.tM(xGQd.tM(string2)));
            }
            xGQd.tM(outputStream, (byte[])xGQd.tM(string));
        }
    }

    public static void writeLines(Collection<String> collection, String string, OutputStream outputStream, String string2) throws IOException {
        if (string2 == null) {
            xGQd.writeLines(collection, string, outputStream);
            return;
        }
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = (String)yy.p(833882003);
        }
        for (String string3 : collection) {
            if (string3 != null) {
                xGQd.tM(outputStream, (byte[])xGQd.tM(xGQd.tM(string3), string2));
            }
            xGQd.tM(outputStream, (byte[])xGQd.tM(string, string2));
        }
    }

    public static void writeLines(Collection<String> collection, String string, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = (String)yy.p(833882003);
        }
        for (String string2 : collection) {
            if (string2 != null) {
                xGQd.tM(writer, xGQd.tM(string2));
            }
            xGQd.tM(writer, string);
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long l = xGQd.copyLarge(inputStream, outputStream);
        if (l > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static long copyLarge(InputStream var0, OutputStream var1_1) throws IOException {
        var2_2 = new byte[4096];
        var3_3 = 0;
        var5_4 = false;
        ** GOTO lbl9
lbl-1000: // 1 sources:
        {
            xGQd.tM(var1_1, var2_2, false, var5_4);
            var3_3 += (Object)var5_4;
lbl9: // 2 sources:
            v0 = xGQd.tM(var0, var2_2);
            var5_4 = v0;
            ** while (-1 != v0)
        }
lbl14: // 1 sources:
        return var3_3;
    }

    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        xGQd.copy((Reader)inputStreamReader, writer);
    }

    public static void copy(InputStream inputStream, Writer writer, String string) throws IOException {
        if (string == null) {
            xGQd.copy(inputStream, writer);
            return;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        xGQd.copy((Reader)inputStreamReader, writer);
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long l = xGQd.copyLarge(reader, writer);
        if (l > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static long copyLarge(Reader var0, Writer var1_1) throws IOException {
        var2_2 = new char[4096];
        var3_3 = 0;
        var5_4 = false;
        ** GOTO lbl9
lbl-1000: // 1 sources:
        {
            xGQd.tM(var1_1, var2_2, false, var5_4);
            var3_3 += (Object)var5_4;
lbl9: // 2 sources:
            v0 = xGQd.tM(var0, var2_2);
            var5_4 = v0;
            ** while (-1 != v0)
        }
lbl14: // 1 sources:
        return var3_3;
    }

    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        xGQd.copy(reader, (Writer)outputStreamWriter);
        xGQd.tM(outputStreamWriter);
    }

    public static void copy(Reader reader, OutputStream outputStream, String string) throws IOException {
        if (string == null) {
            xGQd.copy(reader, outputStream);
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, string);
        xGQd.copy(reader, (Writer)outputStreamWriter);
        xGQd.tM(outputStreamWriter);
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        Object object;
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        Object object2 = xGQd.tM(inputStream);
        while (-1 != object2) {
            object = xGQd.tM(inputStream2);
            if (object2 != object) {
                return false;
            }
            object2 = xGQd.tM(inputStream);
        }
        object = xGQd.tM(inputStream2);
        if (object == -1) {
            return true;
        }
        return false;
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
        Object object;
        if (!(reader instanceof BufferedReader)) {
            reader = new BufferedReader(reader);
        }
        if (!(reader2 instanceof BufferedReader)) {
            reader2 = new BufferedReader(reader2);
        }
        Object object2 = xGQd.tM(reader);
        while (-1 != object2) {
            object = xGQd.tM(reader2);
            if (object2 != object) {
                return false;
            }
            object2 = xGQd.tM(reader);
        }
        object = xGQd.tM(reader2);
        if (object == -1) {
            return true;
        }
        return false;
    }

    private static Object tM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

