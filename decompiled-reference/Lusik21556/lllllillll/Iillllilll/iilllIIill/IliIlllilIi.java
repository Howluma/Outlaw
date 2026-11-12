/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  org.bukkit.Location
 *  org.bukkit.scheduler.BukkitRunnable
 */
package Lusik21556.lllllillll.Iillllilll.iilllIIill;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.minecraft.server.level.ServerPlayer;
import org.bukkit.Location;
import org.bukkit.scheduler.BukkitRunnable;

public final class IliIlllilIi
extends BukkitRunnable {
    private static double liiiIIllIl;
    private Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static int[] lIiiIiIlilli;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IIIllIIliIIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (IIIllIIliIIl) {
            int n;
            int n2 = n = (0x30 | 0xDCA1D8CA) - (0x30 & 0xDCA1D8CA);
            int cfr_ignored_0 = n2 + -593372982 - (n2 & 0xDCA1D8CA) * 2;
        }
        Object[] objectArray = new Object[17];
        objectArray[5] = MethodHandles.lookup();
        objectArray[15] = ((MethodHandles.Lookup)objectArray[5]).findStatic(IliIlllilIi.class, "IlIlllIlilIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        try {
            objectArray[10] = methodType.parameterCount();
            objectArray[13] = lIiiIiIlilli[60];
            objectArray[12] = (int)((Integer)objectArray[10]);
            int n = (0x7E0895CC | 0xBF5F43B) - (0x7E0895CC & 0xBF5F43B);
            int cfr_ignored_1 = n + 200668219;
            objectArray[6] = (Integer)objectArray[12] + ~((Integer)objectArray[13]).intValue() + 1;
            int n3 = (0x6E1475A0 | 0x51C9C8C8) - (0x6E1475A0 & 0x51C9C8C8);
            int cfr_ignored_2 = n3 + 1372178632;
            objectArray[16] = methodType.dropParameterTypes((Integer)objectArray[6], (Integer)objectArray[10]);
            objectArray[3] = MethodHandles.invoker((MethodType)objectArray[16]);
            Class[] classArray = new Class[lIiiIiIlilli[61]];
            classArray[Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.lIiiIiIlilli[62]] = MethodHandle.class;
            objectArray[0] = ((MethodType)objectArray[16]).appendParameterTypes(classArray);
            objectArray[13] = lIiiIiIlilli[63];
            objectArray[12] = (int)((Integer)objectArray[6]);
            objectArray[9] = new int[(Integer)objectArray[12] - ~((Integer)objectArray[13]).intValue() - 1];
            ((int[])objectArray[9])[Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.lIiiIiIlilli[64]] = (Integer)objectArray[6];
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw cloneNotSupportedException;
        }
        objectArray[8] = lIiiIiIlilli[65];
        block13: while (true) {
            objectArray[13] = lIiiIiIlilli[66];
            objectArray[12] = (int)((Integer)objectArray[6]);
            if ((Integer)objectArray[8] >= ((Integer)objectArray[12] | (Integer)objectArray[13]) + ((Integer)objectArray[12] & (Integer)objectArray[13])) break;
            objectArray[13] = lIiiIiIlilli[67];
            objectArray[12] = (int)((Integer)objectArray[8]);
            ((int[])objectArray[9])[((Integer)objectArray[8]).intValue()] = ((Integer)objectArray[12] ^ (Integer)objectArray[13]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[13]);
            objectArray[8] = (Integer)objectArray[8] + 1;
            int n = (0x2C289B7A | 0xC9049D5) - (0x2C289B7A & 0xC9049D5);
            int n4 = n;
            switch (n4 + 210782677 - (n4 & 0xC9049D5) * 2) {
                default: {
                    continue block13;
                }
                case 262368995: 
            }
            break;
        }
        objectArray[4] = MethodHandles.permuteArguments((MethodHandle)objectArray[3], (MethodType)objectArray[0], (int[])objectArray[9]);
        objectArray[7] = MethodHandles.collectArguments((MethodHandle)objectArray[4], (Integer)objectArray[6], (MethodHandle)objectArray[15]);
        int n = (0x301C9B80 | 0xF2750836) - (0x301C9B80 & 0xF2750836);
        int cfr_ignored_3 = n + -227211210;
        return new ConstantCallSite((MethodHandle)objectArray[7]);
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IlIlllIlilIl(String var0, String var1_1, String var2_2, String var3_3, int var4_4, String var5_5, String var6_6, int var7_7, int var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void run() {
        Object[] objectArray = new Object[54];
        objectArray[24] = lIiiIiIlilli[12];
        objectArray[48] = lIiiIiIlilli[13];
        objectArray[37] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[37] | (Integer)objectArray[48]) & ~((Integer)objectArray[37] & (Integer)objectArray[48]);
        objectArray[48] = lIiiIiIlilli[14];
        objectArray[37] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[37] & ~((Integer)objectArray[48]).intValue()) - ((Integer)objectArray[37] ^ (Integer)objectArray[48]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[12] = lIiiIiIlilli[15];
        objectArray[48] = lIiiIiIlilli[16];
        objectArray[37] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[37] ^ (Integer)objectArray[48]) - 2 * (~((Integer)objectArray[37]).intValue() & (Integer)objectArray[48]);
        objectArray[48] = lIiiIiIlilli[17];
        objectArray[37] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[37] ^ (Integer)objectArray[48]) - 2 * (~((Integer)objectArray[37]).intValue() & (Integer)objectArray[48]);
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("1b202f18-d594-4bd4-b4df-401f2f193d81", (long)-7670857782415771216L, (Object[])objectArray2, (String)"cHdkMGZq", (String)"bGQvNCxyaGozaWw0Ny9uLS1tYHZyNSkvaG91PStvYG0vCDVgeGRzHDh1YA==", (String)"c3Rv", (String)"TXRyMTIzMDQ0bndtbW1tNDBtbW1tdhBobW1tNDBtbW0vMTBtbW1IETBtbS9INDBIbW1tMTVIaA==", (int)lIiiIiIlilli[18], (String)"KUtaFDNgd2AuNDhvZi5OOjNkYnU6cRVrYHdgdzVgb2YuFztrZGJ1Yw==", (String)"amYzbDB2", (int)lIiiIiIlilli[19], (int)lIiiIiIlilli[20], (String)"QzRlVVk4");
    }

    /*
     * Exception decompiling
     */
    public static String iliIiiliiiii(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private float[] calcRotation(Location location, Location location2) {
        if (IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[41];
        int n = (0x4265F9D7 | 0x38CB5D) - (0x4265F9D7 & 0x38CB5D);
        int cfr_ignored_0 = n + 3722077;
        objectArray[35] = lIiiIiIlilli[36];
        objectArray[18] = lIiiIiIlilli[37];
        objectArray[34] = (int)((Integer)objectArray[35]);
        objectArray[35] = ((Integer)objectArray[34] | (Integer)objectArray[18]) + ((Integer)objectArray[34] & (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[38];
        objectArray[34] = (int)((Integer)objectArray[35]);
        objectArray[35] = ((Integer)objectArray[34] | (Integer)objectArray[18]) - ((Integer)objectArray[34] & (Integer)objectArray[18]);
        Object[] objectArray2 = new Object[((Integer)objectArray[35]).intValue()];
        objectArray[26] = lIiiIiIlilli[39];
        objectArray[18] = lIiiIiIlilli[40];
        objectArray[34] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[34] ^ (Integer)objectArray[18]) + 2 * ((Integer)objectArray[34] & (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[41];
        objectArray[34] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[34] - ~((Integer)objectArray[18]).intValue() - 1;
        objectArray2[((Integer)objectArray[26]).intValue()] = this;
        objectArray[17] = lIiiIiIlilli[42];
        objectArray[18] = lIiiIiIlilli[43];
        objectArray[34] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[34] | (Integer)objectArray[18]) & ~((Integer)objectArray[34] & (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[44];
        objectArray[34] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[34] | (Integer)objectArray[18]) - ((Integer)objectArray[34] ^ (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[17]).intValue()] = location;
        objectArray[21] = lIiiIiIlilli[45];
        objectArray[18] = lIiiIiIlilli[46];
        objectArray[34] = (int)((Integer)objectArray[21]);
        objectArray[21] = 2 * ((Integer)objectArray[34] | (Integer)objectArray[18]) - ((Integer)objectArray[34] ^ (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[47];
        objectArray[34] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[34] | (Integer)objectArray[18]) & (~((Integer)objectArray[34]).intValue() | ~((Integer)objectArray[18]).intValue());
        objectArray2[((Integer)objectArray[21]).intValue()] = location2;
        return (float[])Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("45e3701e-51a0-4e37-9540-20efee63a303", (long)8275079425256207406L, (Object[])objectArray2, (String)"Z0taRnFZ", (String)"bmYtNC5wamgxaW42NS1sLS9vYnRwNSstam13PSltYm8tCDdiemZxHDp3Yg==", (String)"cXZt", (String)"T3ZwMTAxMjY2bnVvb29vNDJvb29vdhJqb29vNDJvb28tMTJvb29KETJvby1KNDJKb29vMTdKag==", (int)lIiiIiIlilli[48], (String)"K0lYFDFidWIsNDptZCxMOjFmYHc4cRdpYnVidzdibWQsFzlpZmB3Yw==", (String)"cld6OXla", (int)lIiiIiIlilli[49], (int)lIiiIiIlilli[50], (String)"OUZQclZl");
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IIIllIIliIIl) {
        }
        int n = (0x97D8469F | 0x4035AA5C) - (0x97D8469F & 0x4035AA5C);
        int cfr_ignored_0 = n + 1077258844;
        Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIlllIlliIll();
        Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("384fb2ee-beed-45f0-a314-379c3dfb3185", (double)Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("14699e98-7c99-478a-91f6-68fb276a4ac8", (long)(0xA209C93C5200A144L ^ 0xE259C93C5200A144L), (String)"ZGEyRmRL", (String)"bmVyOXJoZWpjdhhrcWZoPQ==", (String)"aGtqPx5tcHdQNxhrcWZoPQ==", (String)"SHF3MTc2NTExbnJoaGhoNDVoaGhodhVtaGhoNDVoaGgqMTVoaGhNETVoaCpNNDVNaGhoMTBNbQ==", (int)lIiiIiIlilli[51], (String)"LE4tHA==", (String)"bXdKZUZP", (int)lIiiIiIlilli[52], (int)lIiiIiIlilli[53], (String)"UWZBTzlH"), (String)"RTJJb2JN", (String)"SnN1MTU0NzMzbnBqampqNDdqampqdhdvampqNDdqamooMTdqampPETdqaihPNDdPampqMTJPbw==", (String)"am9vMRdPampPNA==", (String)"SnN1MTU0NzMzbnBqampqNDdqampqdhdvampqNDdqamooMTdqampPETdqaihPNDdPampqMTJPbw==", (int)lIiiIiIlilli[54], (String)"Qg==", (String)"VnpHV0pl", (int)lIiiIiIlilli[55], (int)lIiiIiIlilli[56], (String)"MzdWTGZ6");
        Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("42272cc7-0448-4323-a7aa-5be7445c4638", IliIlllilIi.class, (String)"ZGVidXN5", (String)"aGArNCh2bG43aWgwMytqLSlpZHJ2NS0rbGtxPS9rZGkrCDFkfGB3HDxxZA==", (String)"aWpkPAto", (String)"SXB2MTY3NDAwbnNpaWlpNDRpaWlpdhRsaWlpNDRpaWkrMTRpaWlMETRpaStMNDRMaWlpMTFMbA==", (int)lIiiIiIlilli[57], (String)"LUlvOStkKmlkNjoqRmlkKy4+LFM=", (String)"VDA0Nm5s", (int)lIiiIiIlilli[58], (int)lIiiIiIlilli[59], (String)"akVXaVd5");
    }

    /*
     * Exception decompiling
     */
    private static String IiIlliIliiIl(String var0, int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void rotateTowardNearest(ServerPlayer serverPlayer, Location location) {
        if (IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[40];
        objectArray[2] = lIiiIiIlilli[21];
        objectArray[23] = lIiiIiIlilli[22];
        objectArray[17] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[17] & ~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[23];
        objectArray[23] = lIiiIiIlilli[23];
        objectArray[17] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[17] + ~((Integer)objectArray[23]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[2]).intValue()];
        objectArray[1] = lIiiIiIlilli[24];
        objectArray[23] = lIiiIiIlilli[25];
        objectArray[17] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[17] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = lIiiIiIlilli[26];
        objectArray[17] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[17] ^ (Integer)objectArray[23]) + 2 * ((Integer)objectArray[17] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[1]).intValue()] = this;
        objectArray[10] = lIiiIiIlilli[27];
        objectArray[23] = lIiiIiIlilli[28];
        objectArray[17] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[17] | (Integer)objectArray[23]) & (~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[23]).intValue());
        objectArray[23] = lIiiIiIlilli[29];
        objectArray[17] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[17] & ~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[23];
        objectArray2[((Integer)objectArray[10]).intValue()] = serverPlayer;
        objectArray[7] = lIiiIiIlilli[30];
        objectArray[23] = lIiiIiIlilli[31];
        objectArray[17] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[17] - ~((Integer)objectArray[23]).intValue() - 1;
        objectArray[23] = lIiiIiIlilli[32];
        objectArray[17] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[17] | (Integer)objectArray[23]) & (~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[23]).intValue());
        objectArray2[((Integer)objectArray[7]).intValue()] = location;
        Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("9941958a-17f1-4842-a1e8-a8a71e1ef628", (long)-7285936296781545560L, (Object[])objectArray2, (String)"TEswRm9V", (String)"b2csNC9xa2kwaW83NCxtLS5uY3VxNSosa2x2PShsY24sCDZje2dwHDt2Yw==", (String)"cHds", (String)"TndxMTEwMzc3bnRubm5uNDNubm5udhNrbm5uNDNubm4sMTNubm5LETNubixLNDNLbm5uMTZLaw==", (int)lIiiIiIlilli[33], (String)"KkhZFDBjdGMtNDtsZS1NOjBnYXY5cRZoY3RjdzZjbGUtFzhoZ2F2Yw==", (String)"cndrNE91", (int)lIiiIiIlilli[34], (int)lIiiIiIlilli[35], (String)"UXl4NktC");
        int n = (0xC4AE7BEA | 0x90B0347D) - (0xC4AE7BEA & 0x90B0347D);
        int cfr_ignored_0 = n + -1867500419;
    }

    /*
     * Enabled aggressive block sorting
     */
    public IliIlllilIi(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi) {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 24 + 60;
        }
        Object[] objectArray = new Object[28];
        objectArray[14] = lIiiIiIlilli[0];
        objectArray[26] = lIiiIiIlilli[1];
        objectArray[10] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[10] | (Integer)objectArray[26]) - ((Integer)objectArray[10] ^ (Integer)objectArray[26]);
        objectArray[26] = lIiiIiIlilli[2];
        objectArray[10] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[10] | (Integer)objectArray[26]) & ~((Integer)objectArray[10] & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[4] = lIiiIiIlilli[3];
        objectArray[26] = lIiiIiIlilli[4];
        objectArray[10] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[10] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray[26] = lIiiIiIlilli[5];
        objectArray[10] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[10] | (Integer)objectArray[26]) & ~((Integer)objectArray[10] & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        objectArray[22] = lIiiIiIlilli[6];
        objectArray[26] = lIiiIiIlilli[7];
        objectArray[10] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[10] | (Integer)objectArray[26]) + ((Integer)objectArray[10] & (Integer)objectArray[26]);
        objectArray[26] = lIiiIiIlilli[8];
        objectArray[10] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[10] | (Integer)objectArray[26]) & (~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[26]).intValue());
        objectArray2[((Integer)objectArray[22]).intValue()] = iliIlllilIi;
        Lusik21556.lllllillll.Iillllilll.iilllIIill.IliIlllilIi.IIIllIIliIIl("704344f3-98dd-480d-93d9-8a7e74fee26f", (long)-5737387491960363216L, (Object[])objectArray2, (String)"YUd2RWo2", (String)"bWUuNC1zaWsyaW01Ni5vLSxsYXdzNSguaW50PSpuYWwuCDRheWVyHDl0YQ==", (String)"cnVu", (String)"THVzMTMyMTU1bnZsbGxsNDFsbGxsdhFpbGxsNDFsbGwuMTFsbGxJETFsbC5JNDFJbGxsMTRJaQ==", (int)lIiiIiIlilli[9], (String)"KEpbFDJhdmEvNDluZy9POjJlY3Q7cRRqYXZhdzRhbmcvFzpqZWN0Yw==", (String)"bkR2eEtM", (int)lIiiIiIlilli[10], (int)lIiiIiIlilli[11], (String)"WmVldjJ4");
    }

    /*
     * Exception decompiling
     */
    public static void IIlllIlliIll() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public static Class lIiiIiIlilli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

