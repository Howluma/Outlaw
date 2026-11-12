/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.ConfigurationSection
 */
package Lusik21556.Iiiilliiil;

import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.configuration.ConfigurationSection;

public final class IliIlllilIi {
    public double IilliliilIIi;
    public long IIillIiliIil;
    public double liiiIIllIl;
    public double Illlllllilll;
    public double Iiilliiliiil;
    public int IlIlllIlilIl;
    public List<Double> Iilllilliill;
    public double IIIllIIliIIl;
    public double IiIlliIliiIl;
    static AtomicReferenceArray<MethodHandle> IiIiliIiiiIi;
    public int IIlllIlliIll;
    public double Ililllililil;
    private Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi IliIlllilIi;
    public int lIiiIiIlilli;
    public double IIIilIIiiIIi;
    public static int[] IIlilIliiIli;
    public double iIlIlllllill;
    public double iliIiiliiiii;
    public static int Illillliilli;
    public static boolean Iilililiiili;

    /*
     * Exception decompiling
     */
    public static void IlIillIiilIi() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 41[UNCONDITIONALDOLOOP]
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

    private double iIlIlllllill(ConfigurationSection configurationSection, String string, double d) {
        Object[] objectArray = new Object[32];
        objectArray[5] = IIlilIliiIli[36];
        objectArray[0] = IIlilIliiIli[37];
        objectArray[29] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[29] + ~((Integer)objectArray[0]).intValue() + 1;
        objectArray[0] = IIlilIliiIli[38];
        objectArray[29] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[29] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[29]).intValue() & (Integer)objectArray[0];
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[25] = IIlilIliiIli[39];
        objectArray[0] = IIlilIliiIli[40];
        objectArray[29] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[29] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[29] & (Integer)objectArray[0]);
        objectArray[0] = IIlilIliiIli[41];
        objectArray[29] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[29] | (Integer)objectArray[0]) - ((Integer)objectArray[29] & (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        objectArray[14] = IIlilIliiIli[42];
        objectArray[0] = IIlilIliiIli[43];
        objectArray[29] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[29] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[29] & (Integer)objectArray[0]);
        objectArray[0] = IIlilIliiIli[44];
        objectArray[29] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[29] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[29]).intValue() & (Integer)objectArray[0];
        objectArray2[((Integer)objectArray[14]).intValue()] = configurationSection;
        objectArray[27] = IIlilIliiIli[45];
        objectArray[0] = IIlilIliiIli[46];
        objectArray[29] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[29] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[29] & (Integer)objectArray[0]);
        objectArray[0] = IIlilIliiIli[47];
        objectArray[29] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[29] & ~((Integer)objectArray[0]).intValue()) - ((Integer)objectArray[29] ^ (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[27]).intValue()] = string;
        objectArray[16] = IIlilIliiIli[48];
        objectArray[0] = IIlilIliiIli[49];
        objectArray[29] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[29] ^ (Integer)objectArray[0]) - 2 * (~((Integer)objectArray[29]).intValue() & (Integer)objectArray[0]);
        objectArray[0] = IIlilIliiIli[50];
        objectArray[29] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[29] | (Integer)objectArray[0]) + ((Integer)objectArray[29] & (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[16]).intValue()] = Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("c55cd858-4126-4339-809b-080fcc6a0a5f", (double)d, (String)"VUt6Wmx6", (String)"UVtPZRFcYFxkHgFfUm5lbQ==", (String)"E3gccl1nS2EcWGxYYBkNW15qYWkc", (int)IIlilIliiIli[51], (int)IIlilIliiIli[52], (String)"R0NxNGFY", (String)"TVtRSVpxWw==", (int)IIlilIliiIli[53], (int)IIlilIliiIli[54], (String)"d09KXVwWEBUWFh8FZmdgZmdjbG1jIghuagtpamt3dRFy");
        return (double)Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("3d2414ba-07b2-4c55-b08d-15de012b8cee", (Object)Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("c7b43a19-4f9c-4ec9-8f2c-321bc67c9e60", (long)4407679060282703570L, (Object[])objectArray2, (String)"dEJ6WTg5", (String)"UVgQVU1SX1gWFBcWFh1dWlhnc1hjZGYrbWlmdmptf3EyE3YCaXxwIQV3Cw==", (String)"FHVldVpgTGYbX2tfZx59b2ZobV0bKApvdWF7KGx4bHQzEnx7fQJyKA==", (int)IIlilIliiIli[55], (int)IIlilIliiIli[56], (String)"bXlacUQx", (String)"TkhQ", (int)IIlilIliiIli[57], (int)IIlilIliiIli[58], (String)"cEhNWlsRFxIRERgCYWBnYWBka2pkJQ9pbQxubWxwchZ1"), (String)"VUVTYmR2", (String)"UFkRVExTXlkXFRYXFxxcW1lmclliZWcqbGhnd2tsfnAzEncDaH1xIAR2Cg==", (String)"FXZVY09hFFhkWGAZfmhha25eFCsN", (int)IIlilIliiIli[59], (int)IIlilIliiIli[60], (String)"aHloMDVM", (String)"SVN/UUxgW2M=", (int)IIlilIliiIli[61], (int)IIlilIliiIli[62], (String)"cUlMW1oQFhMQEBkDYGFmYGFlamtlJA5obA1vbG1xcxd0");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite Ililllililil(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (Iilililiiili) {
            int n;
            int n2 = n = (6 | 0xEA340F48) - (6 & 0xEA340F48);
            int cfr_ignored_0 = n2 + -365686968 - (n2 & 0xEA340F48) * 2;
        }
        Object[] objectArray = new Object[15];
        try {
            objectArray[11] = MethodHandles.lookup();
            objectArray[5] = ((MethodHandles.Lookup)objectArray[11]).findStatic(IliIlllilIi.class, "Iiilliiliiil", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        }
        catch (SyncFailedException syncFailedException) {
            throw syncFailedException;
        }
        catch (UnknownError unknownError) {
            throw unknownError;
        }
        objectArray[14] = methodType.parameterCount();
        objectArray[3] = IIlilIliiIli[104];
        objectArray[13] = (int)((Integer)objectArray[14]);
        int n = (0xFF073D35 | 0xB956F531) - (0xFF073D35 & 0xB956F531);
        int cfr_ignored_1 = n + -1185483471;
        objectArray[12] = (Integer)objectArray[13] + ~((Integer)objectArray[3]).intValue() + 1;
        int n3 = (0xAADA62E8 | 0xCA1CACC2) - (0xAADA62E8 & 0xCA1CACC2);
        int cfr_ignored_2 = n3 + -904090430;
        objectArray[9] = methodType.dropParameterTypes((Integer)objectArray[12], (Integer)objectArray[14]);
        objectArray[1] = MethodHandles.invoker((MethodType)objectArray[9]);
        Class[] classArray = new Class[IIlilIliiIli[105]];
        classArray[Lusik21556.Iiiilliiil.IliIlllilIi.IIlilIliiIli[106]] = MethodHandle.class;
        objectArray[8] = ((MethodType)objectArray[9]).appendParameterTypes(classArray);
        objectArray[3] = IIlilIliiIli[107];
        objectArray[13] = (int)((Integer)objectArray[12]);
        objectArray[2] = new int[((Integer)objectArray[13] | (Integer)objectArray[3]) + ((Integer)objectArray[13] & (Integer)objectArray[3])];
        ((int[])objectArray[2])[Lusik21556.Iiiilliiil.IliIlllilIi.IIlilIliiIli[108]] = (Integer)objectArray[12];
        objectArray[0] = IIlilIliiIli[109];
        while (true) {
            objectArray[3] = IIlilIliiIli[110];
            objectArray[13] = (int)((Integer)objectArray[12]);
            if ((Integer)objectArray[0] >= 2 * ((Integer)objectArray[13] | (Integer)objectArray[3]) - ((Integer)objectArray[13] ^ (Integer)objectArray[3])) {
                objectArray[7] = MethodHandles.permuteArguments((MethodHandle)objectArray[1], (MethodType)objectArray[8], (int[])objectArray[2]);
                objectArray[4] = MethodHandles.collectArguments((MethodHandle)objectArray[7], (Integer)objectArray[12], (MethodHandle)objectArray[5]);
                return new ConstantCallSite((MethodHandle)objectArray[4]);
            }
            objectArray[3] = IIlilIliiIli[111];
            objectArray[13] = (int)((Integer)objectArray[0]);
            ((int[])objectArray[2])[((Integer)objectArray[0]).intValue()] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[3]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[3]);
            objectArray[0] = (Integer)objectArray[0] + 1;
        }
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle Iiilliiliiil(String var0, String var1_1, String var2_2, int var3_3, int var4_4, String var5_5, String var6_6, int var7_7, int var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [41[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int IilliliilIIi(ConfigurationSection configurationSection, String string, int n) {
        if (Iilililiiili) {
            int n2;
            int n3 = n2 = (0x45 | 0x29C6C465) - (0x45 & 0x29C6C465);
            int cfr_ignored_0 = n3 + 700892261 - (n3 & 0x29C6C465) * 2;
        }
        Object[] objectArray = new Object[32];
        objectArray[4] = IIlilIliiIli[63];
        objectArray[26] = IIlilIliiIli[64];
        objectArray[25] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        objectArray[26] = IIlilIliiIli[65];
        objectArray[25] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[29] = IIlilIliiIli[66];
        objectArray[26] = IIlilIliiIli[67];
        objectArray[25] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26];
        objectArray[26] = IIlilIliiIli[68];
        objectArray[25] = (int)((Integer)objectArray[29]);
        objectArray[29] = 2 * ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - ((Integer)objectArray[25] ^ (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[29]).intValue()] = this;
        objectArray[31] = IIlilIliiIli[69];
        objectArray[26] = IIlilIliiIli[70];
        objectArray[25] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        objectArray[26] = IIlilIliiIli[71];
        objectArray[25] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[31]).intValue()] = configurationSection;
        objectArray[9] = IIlilIliiIli[72];
        objectArray[26] = IIlilIliiIli[73];
        objectArray[25] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[25] ^ (Integer)objectArray[26]) + 2 * ((Integer)objectArray[25] & (Integer)objectArray[26]);
        objectArray[26] = IIlilIliiIli[74];
        objectArray[25] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[25] | (Integer)objectArray[26]) & (~((Integer)objectArray[25]).intValue() | ~((Integer)objectArray[26]).intValue());
        objectArray2[((Integer)objectArray[9]).intValue()] = string;
        objectArray[3] = IIlilIliiIli[75];
        objectArray[26] = IIlilIliiIli[76];
        objectArray[25] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[25] | (Integer)objectArray[26]) + ((Integer)objectArray[25] & (Integer)objectArray[26]);
        objectArray[26] = IIlilIliiIli[77];
        objectArray[25] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - ((Integer)objectArray[25] ^ (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[3]).intValue()] = Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("d5726e30-3cb3-4af1-b098-dd4142fef399", (int)n, (String)"TzM0VFVk", (String)"VF5KYBRZZVlhGwFdVmZnaFw=", (String)"FnYZd1hiTmQZXWldZRwFYVpqa2xgGA==", (int)IIlilIliiIli[78], (int)IIlilIliiIli[79], (String)"Q3pOWTdp", (String)"SF5UTF90Xg==", (int)IIlilIliiIli[80], (int)IIlilIliiIli[81], (String)"ckpPWFkTFRATExoAY2JlY2JmaWhmJw1rbw5sb25ycBR3");
        return (int)Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("2ea3df0a-aa11-48ec-a146-d36d18e2a4ff", (Object)Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("9199957a-6ce5-4464-9281-557ef8d7bb87", (long)8584800286849469203L, (Object[])objectArray2, (String)"bjMyWjlC", (String)"UlsTVk5RXFsVFxQVFR5eWVtkcFtgZ2UobmpldWlufHIxEHUBan9zIgZ0CA==", (String)"F3ZmdlljT2UYXGhcZB1+bGVrbl4YKwlsdmJ4K297b3cwEX94fgFxKw==", (int)IIlilIliiIli[82], (int)IIlilIliiIli[83], (String)"NkZSNlJ3", (String)"TUtT", (int)IIlilIliiIli[84], (int)IIlilIliiIli[85], (String)"c0tOWVgSFBESEhsBYmNkYmNnaGlnJgxqbg9tbm9zcRV2"), (String)"RXZEd0pE", (String)"XVQcWUFeU1QaGBsaGhFRVlRrf1RvaGonYWVqemZhc30+H3oOZXB8LQl7Bw==", (String)"GHtYbkJsGVVpVW0Uc2VsZmNTGSYF", (int)IIlilIliiIli[86], (int)IIlilIliiIli[87], (String)"VUcwcFh5", (String)"RF53W0A=", (int)IIlilIliiIli[88], (int)IIlilIliiIli[89], (String)"fERBVlcdGx4dHRQObWxrbWxoZ2ZoKQNlYQBiYWB8fhp5");
    }

    /*
     * Exception decompiling
     */
    public static Class Iilllilliill(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 0[TRYBLOCK]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ Double lIiiIiIlilli(Object object) {
        if (Iilililiiili) {
            int n = (0x7EC8BB34 | 0xD6E8862C) - (0x7EC8BB34 & 0xD6E8862C);
        }
        Object[] objectArray = new Object[27];
        objectArray[14] = IIlilIliiIli[90];
        objectArray[11] = IIlilIliiIli[91];
        objectArray[5] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[5] ^ (Integer)objectArray[11]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[11]);
        objectArray[11] = IIlilIliiIli[92];
        objectArray[5] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[5] | (Integer)objectArray[11]) & (~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[11]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[1] = IIlilIliiIli[93];
        objectArray[11] = IIlilIliiIli[94];
        objectArray[5] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[5] ^ (Integer)objectArray[11]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[11]);
        objectArray[11] = IIlilIliiIli[95];
        objectArray[5] = (int)((Integer)objectArray[1]);
        objectArray[1] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[11]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[1]).intValue()] = object;
        return (Double)((Object)Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("29b79520-b67c-44f0-9ede-4fd337c3072c", (long)3599132950036481476L, (Object[])objectArray2, (String)"ekZINTVP", (String)"XFUdWEBfUlUbGRobGxBQV1VqflVuaWsmYGRre2dgcnw/HnsPZHF9LAh6Bg==", (String)"GXhoeFdtQWsWUmZSahNwYmtlYFAWJQdieGx2JWF1YXk+H3F2cA9/JQ==", (int)IIlilIliiIli[96], (int)IIlilIliiIli[97], (String)"VE1OMnZM", (String)"Q0Vd", (int)IIlilIliiIli[98], (int)IIlilIliiIli[99], (String)"fUVAV1YcGh8cHBUPbG1qbG1pZmdpKAJkYAFjYGF9fxt4"));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x34C5E899 | 0x92443DB3) - (0x34C5E899 & 0x92443DB3);
        Illillliilli = n2 + -1841021517 - (n2 & 0x92443DB3) * 2;
        if (953193033 < Illillliilli) {
            n = (0x52D06CE8 | 0x92443DB3) - (0x52D06CE8 & 0x92443DB3);
        }
        Lusik21556.Iiiilliiil.IliIlllilIi.IlIillIiilIi();
        Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("e068e5cb-3c47-4c1d-89ca-9668abc4d3f9", IliIlllilIi.class, (String)"VFc3YVNa", (String)"X1YeW0NcUVYYGhkYGBNTVFZpfVZtamglY2doeGRjcX88HXgMZ3J+Lwt5BQ==", (String)"GnlabEBuG1drV28WBW1hVlEYJXE=", (int)IIlilIliiIli[100], (int)IIlilIliiIli[101], (String)"ZUJUUDhm", (String)"XlxtU2Ba", (int)IIlilIliiIli[102], (int)IIlilIliiIli[103], (String)"fkZDVFUfGRwfHxYMb25pb25qZWRqKwFnYwJgY2J+fBh7");
    }

    /*
     * Enabled aggressive block sorting
     */
    public IliIlllilIi(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x1901D21 | 0xCE87DE17) - (0x1901D21 & 0xCE87DE17);
        Illillliilli = n2 + -829956585 - (n2 & 0xCE87DE17) * 2;
        if (117338343 <= Illillliilli) {
            int n3 = n = (0x27 | 0xCE87DE17) - (0x27 & 0xCE87DE17);
            int cfr_ignored_0 = n3 + -829956585 - (n3 & 0xCE87DE17) * 2;
        }
        Object[] objectArray = new Object[28];
        objectArray[10] = IIlilIliiIli[0];
        objectArray[11] = IIlilIliiIli[1];
        objectArray[24] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[24] ^ (Integer)objectArray[11]) + 2 * ((Integer)objectArray[24] & (Integer)objectArray[11]);
        objectArray[11] = IIlilIliiIli[2];
        objectArray[24] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[24] - ~((Integer)objectArray[11]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[21] = IIlilIliiIli[3];
        objectArray[11] = IIlilIliiIli[4];
        objectArray[24] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[24] | (Integer)objectArray[11]) & (~((Integer)objectArray[24]).intValue() | ~((Integer)objectArray[11]).intValue());
        objectArray[11] = IIlilIliiIli[5];
        objectArray[24] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[24] - ~((Integer)objectArray[11]).intValue() - 1;
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[6] = IIlilIliiIli[6];
        objectArray[11] = IIlilIliiIli[7];
        objectArray[24] = (int)((Integer)objectArray[6]);
        objectArray[6] = 2 * ((Integer)objectArray[24] & ~((Integer)objectArray[11]).intValue()) - ((Integer)objectArray[24] ^ (Integer)objectArray[11]);
        objectArray[11] = IIlilIliiIli[8];
        objectArray[24] = (int)((Integer)objectArray[6]);
        objectArray[6] = 2 * ((Integer)objectArray[24] & ~((Integer)objectArray[11]).intValue()) - ((Integer)objectArray[24] ^ (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[6]).intValue()] = iliIlllilIi;
        Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("3d3cd920-1318-41a8-b434-b5e698e4b55b", (long)5599869437669344594L, (Object[])objectArray2, (String)"WFcyRkNE", (String)"VVwUUUlWW1wSEBMSEhlZXlxjd1xnYGIvaW1icm5pe3U2F3IGbXh0JQFzDw==", (String)"EHFhcV5kSGIfW29bYxp5a2JsaVkfLA5rcWV/LGh8aHA3Fnh/eQZ2LA==", (int)IIlilIliiIli[9], (int)IIlilIliiIli[10], (String)"ZnRLU3JP", (String)"SkxU", (int)IIlilIliiIli[11], (int)IIlilIliiIli[12], (String)"dExJXl8VExYVFRwGZWRjZWRgb25gIQttaQhqaWh0dhJx");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIIilIIiiIIi(String string, int n, int n2) {
        if (Iilililiiili) {
        }
        Object[] objectArray = new Object[7];
        int n3 = (0x621C395A | 0xE3387F58) - (0x621C395A & 0xE3387F58);
        int cfr_ignored_0 = n3 + -482836648;
        objectArray[2] = Base64.getDecoder().decode(string);
        objectArray[1] = IIlilIliiIli[135];
        while (true) {
            if ((Integer)objectArray[1] >= ((byte[])objectArray[2]).length) {
                int n4 = (0x61FDE2DA | 0x65BF9FDB) - (0x61FDE2DA & 0x65BF9FDB);
                int cfr_ignored_1 = n4 + 1707057115;
                return new String((byte[])objectArray[2], StandardCharsets.UTF_8);
            }
            byte[] byArray = (byte[])objectArray[2];
            int n5 = (Integer)objectArray[1];
            objectArray[5] = n;
            objectArray[3] = (int)byArray[n5];
            objectArray[5] = n2;
            objectArray[3] = ((Integer)objectArray[3] | (Integer)objectArray[5]) & (~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[5]).intValue());
            objectArray[5] = (int)((Integer)objectArray[1]);
            objectArray[3] = ((Integer)objectArray[3] | (Integer)objectArray[5]) & (~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[5]).intValue());
            byArray[n5] = (byte)(((Integer)objectArray[3] | (Integer)objectArray[5]) + ((Integer)objectArray[3] & (Integer)objectArray[5]));
            objectArray[1] = (Integer)objectArray[1] + 1;
        }
    }

    /*
     * Exception decompiling
     */
    public static String IIillIiliIil(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 64[UNCONDITIONALDOLOOP]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void IliIlllilIi() {
        Object[] objectArray = new Object[28];
        objectArray[1] = IIlilIliiIli[13];
        objectArray[27] = IIlilIliiIli[14];
        objectArray[5] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[5] ^ (Integer)objectArray[27]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[27]);
        objectArray[27] = IIlilIliiIli[15];
        objectArray[5] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[5] ^ (Integer)objectArray[27]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[27]);
        Object[] objectArray2 = new Object[((Integer)objectArray[1]).intValue()];
        objectArray[12] = IIlilIliiIli[16];
        objectArray[27] = IIlilIliiIli[17];
        objectArray[5] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[5] & ~((Integer)objectArray[27]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[27];
        objectArray[27] = IIlilIliiIli[18];
        objectArray[5] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[27]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[27]);
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("d33fb42f-25ce-446f-9a43-a43e89518f2a", (long)9144319041670749234L, (Object[])objectArray2, (String)"ZEdITDF1", (String)"VF0VUEhXWl0TERITExhYX11idl1mYWMuaGxjc29oenQ3FnMHbHl1JAByDg==", (String)"EXBgcF9lSWMeWm5aYht4amNtaFgeLQ9qcGR+LWl9aXE2F3l+eAd3LQ==", (int)IIlilIliiIli[19], (int)IIlilIliiIli[20], (String)"VWF6T21Z", (String)"S01V", (int)IIlilIliiIli[21], (int)IIlilIliiIli[22], (String)"dU1IX14UEhcUFB0HZGViZGVhbm9hIApsaAlraGl1dxNw");
        int n = (0x4027607D | 0xF2402637) - (0x4027607D & 0xF2402637);
        int cfr_ignored_0 = n + -230676937;
    }

    private List<Double> liiiIIllIl(ConfigurationSection configurationSection) {
        Object[] objectArray = new Object[30];
        objectArray[22] = IIlilIliiIli[23];
        objectArray[24] = IIlilIliiIli[24];
        objectArray[14] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[14] | (Integer)objectArray[24]) & ~((Integer)objectArray[14] & (Integer)objectArray[24]);
        objectArray[24] = IIlilIliiIli[25];
        objectArray[14] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[14] ^ (Integer)objectArray[24]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[24]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[16] = IIlilIliiIli[26];
        objectArray[24] = IIlilIliiIli[27];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[14] + ~((Integer)objectArray[24]).intValue() + 1;
        objectArray[24] = IIlilIliiIli[28];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[14] & ~((Integer)objectArray[24]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[2] = IIlilIliiIli[29];
        objectArray[24] = IIlilIliiIli[30];
        objectArray[14] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[14] | (Integer)objectArray[24]) - ((Integer)objectArray[14] & (Integer)objectArray[24]);
        objectArray[24] = IIlilIliiIli[31];
        objectArray[14] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[14] | (Integer)objectArray[24]) - ((Integer)objectArray[14] ^ (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[2]).intValue()] = configurationSection;
        return (List)((Object)Lusik21556.Iiiilliiil.IliIlllilIi.Ililllililil("48f27f06-2bfd-4e37-9087-3fac56c54ca1", (long)2751973166540543673L, (Object[])objectArray2, (String)"d0FnWlNL", (String)"V14WU0tUWV4QEhEQEBtbXF5hdV5lYmAta29gcGxreXc0FXAEb3p2JwNxDQ==", (String)"EnNjc1xmSmAdWW1ZYRh7aWBua1sdLgxpc2d9Lmp+anI1FHp9ewR0Lg==", (int)IIlilIliiIli[32], (int)IIlilIliiIli[33], (String)"TzBaYkVs", (String)"SE5W", (int)IIlilIliiIli[34], (int)IIlilIliiIli[35], (String)"dk5LXF0XERQXFx4EZ2ZhZ2ZibWxiIwlvawpoa2p2dBBz"));
    }
}

