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

public class uqWq {
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final char DIR_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX;
    public static final String LINE_SEPARATOR_WINDOWS;
    public static final String LINE_SEPARATOR;
    private static final int DEFAULT_BUFFER_SIZE = 4096;

    static {
        LINE_SEPARATOR_UNIX = nJPf$sILv.G("\u485f");
        LINE_SEPARATOR_WINDOWS = nJPf$sILv.G("\u4858\u9105");
        o.w(576797684, Character.valueOf(((Character)o.k(60177155)).charValue()));
        StringWriter stringWriter = new StringWriter(4);
        PrintWriter printWriter = new PrintWriter(stringWriter);
        uqWq.ir(printWriter);
        o.w(786447329, uqWq.ir(stringWriter));
    }

    public static void closeQuietly(Reader reader) {
        try {
            if (reader != null) {
                uqWq.ir(reader);
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
                uqWq.ir(writer);
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
                uqWq.ir(inputStream);
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
                uqWq.ir(outputStream);
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uqWq.copy(inputStream, (OutputStream)byteArrayOutputStream);
        return (byte[])uqWq.ir(byteArrayOutputStream);
    }

    public static byte[] toByteArray(Reader reader) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uqWq.copy(reader, (OutputStream)byteArrayOutputStream);
        return (byte[])uqWq.ir(byteArrayOutputStream);
    }

    public static byte[] toByteArray(Reader reader, String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uqWq.copy(reader, byteArrayOutputStream, string);
        return (byte[])uqWq.ir(byteArrayOutputStream);
    }

    public static byte[] toByteArray(String string) throws IOException {
        return (byte[])uqWq.ir(string);
    }

    public static char[] toCharArray(InputStream inputStream) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        uqWq.copy(inputStream, (Writer)charArrayWriter);
        return (char[])uqWq.ir(charArrayWriter);
    }

    public static char[] toCharArray(InputStream inputStream, String string) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        uqWq.copy(inputStream, charArrayWriter, string);
        return (char[])uqWq.ir(charArrayWriter);
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        uqWq.copy(reader, (Writer)charArrayWriter);
        return (char[])uqWq.ir(charArrayWriter);
    }

    public static String toString(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        uqWq.copy(inputStream, (Writer)stringWriter);
        return uqWq.ir(stringWriter);
    }

    public static String toString(InputStream inputStream, String string) throws IOException {
        StringWriter stringWriter = new StringWriter();
        uqWq.copy(inputStream, stringWriter, string);
        return uqWq.ir(stringWriter);
    }

    public static String toString(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        uqWq.copy(reader, (Writer)stringWriter);
        return uqWq.ir(stringWriter);
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
        return uqWq.readLines(inputStreamReader);
    }

    public static List<String> readLines(InputStream inputStream, String string) throws IOException {
        if (string == null) {
            return uqWq.readLines(inputStream);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        return uqWq.readLines(inputStreamReader);
    }

    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = uqWq.ir(bufferedReader);
        while (object != null) {
            arrayList.add((String)object);
            object = uqWq.ir(bufferedReader);
        }
        return arrayList;
    }

    public static InputStream toInputStream(String string) {
        byte[] arrby = (byte[])uqWq.ir(string);
        return new ByteArrayInputStream(arrby);
    }

    public static InputStream toInputStream(String string, String string2) throws IOException {
        byte[] arrby = string2 != null ? (byte[])uqWq.ir(string, string2) : (byte[])uqWq.ir(string);
        return new ByteArrayInputStream(arrby);
    }

    public static void write(byte[] arrby, OutputStream outputStream) throws IOException {
        if (arrby != null) {
            uqWq.ir(outputStream, arrby);
        }
    }

    public static void write(byte[] arrby, Writer writer) throws IOException {
        if (arrby != null) {
            uqWq.ir(writer, new String(arrby));
        }
    }

    public static void write(byte[] arrby, Writer writer, String string) throws IOException {
        if (arrby != null) {
            if (string == null) {
                uqWq.write(arrby, writer);
                return;
            }
            uqWq.ir(writer, new String(arrby, string));
        }
    }

    public static void write(char[] arrc, Writer writer) throws IOException {
        if (arrc != null) {
            uqWq.ir(writer, arrc);
        }
    }

    public static void write(char[] arrc, OutputStream outputStream) throws IOException {
        if (arrc != null) {
            uqWq.ir(outputStream, (byte[])uqWq.ir(new String(arrc)));
        }
    }

    public static void write(char[] arrc, OutputStream outputStream, String string) throws IOException {
        if (arrc != null) {
            if (string == null) {
                uqWq.write(arrc, outputStream);
                return;
            }
            uqWq.ir(outputStream, (byte[])uqWq.ir(new String(arrc), string));
        }
    }

    public static void write(String string, Writer writer) throws IOException {
        if (string != null) {
            uqWq.ir(writer, string);
        }
    }

    public static void write(String string, OutputStream outputStream) throws IOException {
        if (string != null) {
            uqWq.ir(outputStream, (byte[])uqWq.ir(string));
        }
    }

    public static void write(String string, OutputStream outputStream, String string2) throws IOException {
        if (string != null) {
            if (string2 == null) {
                uqWq.write(string, outputStream);
                return;
            }
            uqWq.ir(outputStream, (byte[])uqWq.ir(string, string2));
        }
    }

    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            uqWq.ir(writer, uqWq.ir(stringBuffer));
        }
    }

    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        if (stringBuffer != null) {
            uqWq.ir(outputStream, (byte[])uqWq.ir(uqWq.ir(stringBuffer)));
        }
    }

    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String string) throws IOException {
        if (stringBuffer != null) {
            if (string == null) {
                uqWq.write(stringBuffer, outputStream);
                return;
            }
            uqWq.ir(outputStream, (byte[])uqWq.ir(uqWq.ir(stringBuffer), string));
        }
    }

    public static void writeLines(Collection<String> collection, String string, OutputStream outputStream) throws IOException {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = (String)o.k(786447329);
        }
        for (String string2 : collection) {
            if (string2 != null) {
                uqWq.ir(outputStream, (byte[])uqWq.ir(uqWq.ir(string2)));
            }
            uqWq.ir(outputStream, (byte[])uqWq.ir(string));
        }
    }

    public static void writeLines(Collection<String> collection, String string, OutputStream outputStream, String string2) throws IOException {
        if (string2 == null) {
            uqWq.writeLines(collection, string, outputStream);
            return;
        }
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = (String)o.k(786447329);
        }
        for (String string3 : collection) {
            if (string3 != null) {
                uqWq.ir(outputStream, (byte[])uqWq.ir(uqWq.ir(string3), string2));
            }
            uqWq.ir(outputStream, (byte[])uqWq.ir(string, string2));
        }
    }

    public static void writeLines(Collection<String> collection, String string, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = (String)o.k(786447329);
        }
        for (String string2 : collection) {
            if (string2 != null) {
                uqWq.ir(writer, uqWq.ir(string2));
            }
            uqWq.ir(writer, string);
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long l = uqWq.copyLarge(inputStream, outputStream);
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
            uqWq.ir(var1_1, var2_2, false, var5_4);
            var3_3 += (Object)var5_4;
lbl9: // 2 sources:
            v0 = uqWq.ir(var0, var2_2);
            var5_4 = v0;
            ** while (-1 != v0)
        }
lbl14: // 1 sources:
        return var3_3;
    }

    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        uqWq.copy((Reader)inputStreamReader, writer);
    }

    public static void copy(InputStream inputStream, Writer writer, String string) throws IOException {
        if (string == null) {
            uqWq.copy(inputStream, writer);
            return;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        uqWq.copy((Reader)inputStreamReader, writer);
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long l = uqWq.copyLarge(reader, writer);
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
            uqWq.ir(var1_1, var2_2, false, var5_4);
            var3_3 += (Object)var5_4;
lbl9: // 2 sources:
            v0 = uqWq.ir(var0, var2_2);
            var5_4 = v0;
            ** while (-1 != v0)
        }
lbl14: // 1 sources:
        return var3_3;
    }

    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        uqWq.copy(reader, (Writer)outputStreamWriter);
        uqWq.ir(outputStreamWriter);
    }

    public static void copy(Reader reader, OutputStream outputStream, String string) throws IOException {
        if (string == null) {
            uqWq.copy(reader, outputStream);
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, string);
        uqWq.copy(reader, (Writer)outputStreamWriter);
        uqWq.ir(outputStreamWriter);
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        Object object;
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        Object object2 = uqWq.ir(inputStream);
        while (-1 != object2) {
            object = uqWq.ir(inputStream2);
            if (object2 != object) {
                return false;
            }
            object2 = uqWq.ir(inputStream);
        }
        object = uqWq.ir(inputStream2);
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
        Object object2 = uqWq.ir(reader);
        while (-1 != object2) {
            object = uqWq.ir(reader2);
            if (object2 != object) {
                return false;
            }
            object2 = uqWq.ir(reader);
        }
        object = uqWq.ir(reader2);
        if (object == -1) {
            return true;
        }
        return false;
    }

    private static Object ir(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

