/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.inventory.ItemStack
 */
package Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll;

import Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IIIllIIliIIl;
import Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.iIlIlllllill;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.ConnectException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.inventory.ItemStack;

public final class IilliliilIIi {
    public static Map<String, iIlIlllllill> liiiIIllIl;
    public static Map<String, iIlIlllllill> iIlIlllllill;
    public static int[] iliIiiliiiii;
    private static MiniMessage IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IIillIiliIil(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x1F7F83D4 | 0x854A2285) - (0x1F7F83D4 & 0x854A2285);
        IIIllIIliIIl = n2 + -2058739067 - (n2 & 0x854A2285) * 2;
        if (1071357250 < IIIllIIliIIl) {
            int cfr_ignored_0 = 67 + 87;
        }
        Object[] objectArray = new Object[15];
        try {
            objectArray[12] = MethodHandles.lookup();
            objectArray[10] = ((MethodHandles.Lookup)objectArray[12]).findStatic(IilliliilIIi.class, "Ililllililil", MethodType.fromMethodDescriptorString("(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        }
        catch (VerifyError verifyError) {
            throw verifyError;
        }
        catch (UnknownError unknownError) {
            throw unknownError;
        }
        objectArray[11] = methodType.parameterCount();
        int n3 = (0xA7DB3E3B | 0x74B9A77D) - (0xA7DB3E3B & 0x74B9A77D);
        int cfr_ignored_1 = n3 + 1958324093;
        objectArray[1] = iliIiiliiiii[91];
        objectArray[14] = (int)((Integer)objectArray[11]);
        objectArray[9] = (Integer)objectArray[14] + ~((Integer)objectArray[1]).intValue() + 1;
        objectArray[0] = methodType.dropParameterTypes((Integer)objectArray[9], (Integer)objectArray[11]);
        objectArray[7] = MethodHandles.invoker((MethodType)objectArray[0]);
        Class[] classArray = new Class[iliIiiliiiii[92]];
        classArray[IilliliilIIi.iliIiiliiiii[93]] = MethodHandle.class;
        objectArray[5] = ((MethodType)objectArray[0]).appendParameterTypes(classArray);
        objectArray[1] = iliIiiliiiii[94];
        objectArray[14] = (int)((Integer)objectArray[9]);
        objectArray[13] = new int[2 * ((Integer)objectArray[14] | (Integer)objectArray[1]) - ((Integer)objectArray[14] ^ (Integer)objectArray[1])];
        ((int[])objectArray[13])[IilliliilIIi.iliIiiliiiii[95]] = (Integer)objectArray[9];
        objectArray[8] = iliIiiliiiii[96];
        block13: while (true) {
            objectArray[1] = iliIiiliiiii[97];
            objectArray[14] = (int)((Integer)objectArray[9]);
            if ((Integer)objectArray[8] >= 2 * ((Integer)objectArray[14] | (Integer)objectArray[1]) - ((Integer)objectArray[14] ^ (Integer)objectArray[1])) break;
            int n4 = (0x6631E09F | 0xC06277A0) - (0x6631E09F & 0xC06277A0);
            block14: while (true) {
                int n5 = n4;
                switch (n5 + -1067288672 - (n5 & 0xC06277A0) * 2) {
                    default: {
                        objectArray[1] = iliIiiliiiii[98];
                        objectArray[14] = (int)((Integer)objectArray[8]);
                        ((int[])objectArray[13])[((Integer)objectArray[8]).intValue()] = 2 * ((Integer)objectArray[14] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[14] ^ (Integer)objectArray[1]);
                        objectArray[8] = (Integer)objectArray[8] + 1;
                        n4 = (0x77A6480C | 0xC06277A0) - (0x77A6480C & 0xC06277A0);
                        continue block14;
                    }
                    case 2007386124: {
                        continue block13;
                    }
                    case 1468678562: 
                }
                break;
            }
            break;
        }
        objectArray[4] = MethodHandles.permuteArguments((MethodHandle)objectArray[7], (MethodType)objectArray[5], (int[])objectArray[13]);
        objectArray[2] = MethodHandles.collectArguments((MethodHandle)objectArray[4], (Integer)objectArray[9], (MethodHandle)objectArray[10]);
        return new ConstantCallSite((MethodHandle)objectArray[2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IilliliilIIi(String string, String string2, String ... stringArray) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 0x12 & 1;
        }
        Object[] objectArray = new Object[30];
        objectArray[8] = iliIiiliiiii[61];
        objectArray[4] = iliIiiliiiii[62];
        objectArray[11] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[11] & ~((Integer)objectArray[4]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[63];
        objectArray[11] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[11] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[4]);
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[3] = iliIiiliiiii[64];
        objectArray[4] = iliIiiliiiii[65];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[11] - ~((Integer)objectArray[4]).intValue() - 1;
        objectArray[4] = iliIiiliiiii[66];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[11] - ~((Integer)objectArray[4]).intValue() - 1;
        objectArray2[((Integer)objectArray[3]).intValue()] = string;
        objectArray[0] = iliIiiliiiii[67];
        objectArray[4] = iliIiiliiiii[68];
        objectArray[11] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[11] | (Integer)objectArray[4]) - ((Integer)objectArray[11] & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[69];
        objectArray[11] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[11] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[0]).intValue()] = string2;
        objectArray[27] = iliIiiliiiii[70];
        objectArray[4] = iliIiiliiiii[71];
        objectArray[11] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[11] | (Integer)objectArray[4]) - ((Integer)objectArray[11] ^ (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[72];
        objectArray[11] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[11] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[11]).intValue() & (Integer)objectArray[4];
        objectArray2[((Integer)objectArray[27]).intValue()] = stringArray;
        IilliliilIIi.IIillIiliIil("be338293-1f1a-47cd-ae4b-f5f37a91934b", (long)7946809119398230521L, (Object[])objectArray2, (int)iliIiiliiiii[73], (int)iliIiiliiiii[74], (int)iliIiiliiiii[75], (String)"Nm1VRUg5", (String)"eHMlemxtemcvLypVVy5okZFoZp+Sl5NQlJKblZueap5bZJuRiJ+NfpyIng==", (String)"PV5IWntzaX0iYH5sZilIZG9jYJJaK3eUbJpuX51rmZNaZZGYnJ2Pdw==", (String)"WWNgeXoiIikoKi1BQENvbkxPa2lIS5dQdJB2kp2ccp6cmH6aR3uaZYGAhmGNg4JtiUpuabW0t5WxsLaRvbx5nby4u7mlu7qmhIem", (int)iliIiiliiiii[76], (String)"Z2Nl", (int)iliIiiliiiii[77]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IilliliilIIi() {
        int n;
        int n2 = n = (0x1253B28C | 0xA6EC783D) - (0x1253B28C & 0xA6EC783D);
        IIIllIIliIIl = n2 + -1494452163 - (n2 & 0xA6EC783D) * 2;
        if (535552950 < IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[26];
        objectArray[16] = iliIiiliiiii[0];
        objectArray[19] = iliIiiliiiii[1];
        objectArray[17] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[17] - ~((Integer)objectArray[19]).intValue() - 1;
        objectArray[19] = iliIiiliiiii[2];
        objectArray[17] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[17] & ~((Integer)objectArray[19]).intValue()) - ((Integer)objectArray[17] ^ (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[16]).intValue()];
        objectArray[4] = iliIiiliiiii[3];
        objectArray[19] = iliIiiliiiii[4];
        objectArray[17] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[17] | (Integer)objectArray[19]) - ((Integer)objectArray[17] ^ (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[5];
        objectArray[17] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[17] - ~((Integer)objectArray[19]).intValue() - 1;
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        IilliliilIIi.IIillIiliIil("f5ec98eb-6331-437a-98b9-8bb2bd9c342f", (long)-5170354085038978661L, (Object[])objectArray2, (int)iliIiiliiiii[6], (int)iliIiiliiiii[7], (int)iliIiiliiiii[8], (String)"bXVnajJK", (String)"fXYgf2lof2IqKi9QUittlJRtY5qXkpZVkZeekJ6bb5teYZ6UjZqIe5mNmw==", (String)"OFtNX352bHgnZXtpYyxNYWpmZZdfLnKRaZ9rWphunJZfYJSdmZiKcg==", (String)"XGZlfH8nJywtLyhERUZqa0lKbmxNTpJVcZVzl5iZd5uZnXufQn6fYISFg2SIhodojE9rbLCxspC0tbOUuLl8mLm9vrygvr+jgYKj", (int)iliIiiliiiii[9], (String)"YmZg", (int)iliIiiliiiii[10]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String Iiilliiliiil(String string, int n, int n2) {
        if (IlIlllIlilIl) {
            throw null;
        }
        Object[] objectArray = new Object[6];
        objectArray[0] = Base64.getDecoder().decode(string);
        objectArray[2] = iliIiiliiiii[122];
        while ((Integer)objectArray[2] < ((byte[])objectArray[0]).length) {
            byte[] byArray = (byte[])objectArray[0];
            int n3 = (Integer)objectArray[2];
            objectArray[5] = n;
            objectArray[3] = (int)byArray[n3];
            objectArray[5] = n2;
            objectArray[3] = ((Integer)objectArray[3] | (Integer)objectArray[5]) & ~((Integer)objectArray[3] & (Integer)objectArray[5]);
            objectArray[5] = (int)((Integer)objectArray[2]);
            objectArray[3] = ((Integer)objectArray[3] | (Integer)objectArray[5]) & ~((Integer)objectArray[3] & (Integer)objectArray[5]);
            byArray[n3] = (byte)(((Integer)objectArray[3] & ~((Integer)objectArray[5]).intValue()) - (~((Integer)objectArray[3]).intValue() & (Integer)objectArray[5]));
            objectArray[2] = (Integer)objectArray[2] + 1;
        }
        try {
            return new String((byte[])objectArray[0], StandardCharsets.UTF_8);
        }
        catch (IllegalAccessError illegalAccessError) {
            throw illegalAccessError;
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle Ililllililil(int var0, int var1_1, int var2_2, String var3_3, String var4_4, String var5_5, String var6_6, int var7_7, String var8_8, int var9_9) {
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
     * Exception decompiling
     */
    public static String Iilllilliill(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 0[TRYBLOCK]
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
    public static void IIIilIIiiIIi() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [33[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Enabled aggressive block sorting
     */
    public static ItemStack IliIlllilIi(String string, IIIllIIliIIl iIIllIIliIIl) {
        int n;
        int n2 = n = (0x23104025 | 0x2162F825) - (0x23104025 & 0x2162F825);
        IIIllIIliIIl = n2 + 560134181 - (n2 & 0x2162F825) * 2;
        if (597627606 < IIIllIIliIIl) {
            throw new ConnectException();
        }
        Object[] objectArray = new Object[30];
        int n3 = (0x2427AE87 | 0x576975CA) - (0x2427AE87 & 0x576975CA);
        int cfr_ignored_0 = n3 + 1466529226;
        objectArray[8] = iliIiiliiiii[11];
        objectArray[26] = iliIiiliiiii[12];
        objectArray[17] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[17] | (Integer)objectArray[26]) & ~((Integer)objectArray[17] & (Integer)objectArray[26]);
        objectArray[26] = iliIiiliiiii[13];
        objectArray[17] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[17] ^ (Integer)objectArray[26]) - 2 * (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[16] = iliIiiliiiii[14];
        objectArray[26] = iliIiiliiiii[15];
        objectArray[17] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[17] | (Integer)objectArray[26]) & ~((Integer)objectArray[17] & (Integer)objectArray[26]);
        objectArray[26] = iliIiiliiiii[16];
        objectArray[17] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[17] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[16]).intValue()] = string;
        objectArray[29] = iliIiiliiiii[17];
        objectArray[26] = iliIiiliiiii[18];
        objectArray[17] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[17] & ~((Integer)objectArray[26]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[26];
        objectArray[26] = iliIiiliiiii[19];
        objectArray[17] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[17] | (Integer)objectArray[26]) - ((Integer)objectArray[17] & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[29]).intValue()] = iIIllIIliIIl;
        return (ItemStack)IilliliilIIi.IIillIiliIil("50b33343-4991-45af-b3bc-32c43d1d256d", (long)-8369618329838889999L, (Object[])objectArray2, (int)iliIiiliiiii[20], (int)iliIiiliiiii[21], (int)iliIiiliiiii[22], (String)"aVpTRHBV", (String)"fHchfmhpfmMrKy5RUypslZVsYpuWk5dUkJafkZ+abppfYJ+VjJuJepiMmg==", (String)"OVpMXn93bXkmZHpoYi1MYGtnZJZeL3OQaJ5qW5lvnZdeYZWcmJmLcw==", (String)"XWdkfX4mJi0sLilFREdrakhLb21MT5NUcJRylpmYdpqYnHqeQ3+eYYWEgmWJh4ZpjU5qbbGws5G1tLKVubh9mbi8v72hv76igIOi", (int)iliIiiliiiii[23], (String)"Y2dh", (int)iliIiiliiiii[24]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IlIlllIlilIl) {
            int n;
            int n2 = n = (0x62 | 0xBED7A3C) - (0x62 & 0xBED7A3C);
            int cfr_ignored_0 = n2 + 200112700 - (n2 & 0xBED7A3C) * 2;
        }
        Object[] objectArray = new Object[24];
        IilliliilIIi.IIIilIIiiIIi();
        IilliliilIIi.IIillIiliIil("f5b74e7b-3f8f-446b-8293-1519b4c6aabb", IilliliilIIi.class, (int)iliIiiliiiii[78], (int)iliIiiliiiii[79], (int)iliIiiliiiii[80], (String)"NDE5a3kx", (String)"e3AmeW9ueWQsLClWVC1rkpJrZZyRlJBTl5GYlpidaZ1YZ5iSi5yOfZ+LnQ==", (String)"Plt6cmxwI2V/YWcsWW95lJVaLX8=", (String)"WmBjenkhISorKS5CQ0BsbU9MaGpLSJRTd5N1kZ6fcZ2fm32ZRHiZZoKDhWKOgIFuikltara3tJays7WSvr96nr+7uLqmuLmlh4Sl", (int)iliIiiliiiii[81], (String)"emZ1cUxk", (int)iliIiiliiiii[82]);
        objectArray[9] = iliIiiliiiii[83];
        objectArray[13] = iliIiiliiiii[84];
        objectArray[23] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[23] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = iliIiiliiiii[85];
        objectArray[23] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[23] + ~((Integer)objectArray[13]).intValue() + 1;
        IilliliilIIi.IIillIiliIil("9be725b8-71d4-4b0f-8752-3ac612a244bc", (long)-4231278870123056640L, (Object[])new Object[((Integer)objectArray[9]).intValue()], (int)iliIiiliiiii[86], (int)iliIiiliiiii[87], (int)iliIiiliiiii[88], (String)"MnIydVgy", (String)"enEneG5veGUtLShXVSxqk5NqZJ2QlZFSlpCZl5mcaJxZZpmTip2PfJ6KnA==", (String)"P1xKWHlxa38gYnxuZCtKZm1hYpBYKXWWbphsXZ9pm5FYZ5Oanp+NdQ==", (String)"W2Fie3ggICsqKC9DQkFtbE5NaWtKSZVSdpJ0kJ+ecJyemnyYRXmYZ4OChGOPgYBvi0hsa7e2tZezsrSTv757n766ubunubikhoWk", (int)iliIiiliiiii[89], (String)"ZWFn", (int)iliIiiliiiii[90]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class Illlllllilll(String var0) {
        if (IilliliilIIi.IlIlllIlilIl) {
            v0 = var8_1 = (-1956883779 | -1586857191) - (-1956883779 & -1586857191);
            IilliliilIIi.IIIllIIliIIl = v0 + -1586857191 - (v0 & -1586857191) * 2;
        }
        v1 = var8_1 = (1245960445 | -1586857191) - (1245960445 & -1586857191);
        if (576103926 >= v1 + -1586857191 - (v1 & -1586857191) * 2) {
            throw null;
        }
        v2 = var8_1 = (281548466 | -1586857191) - (281548466 & -1586857191);
        IilliliilIIi.IIIllIIliIIl = v2 + -1586857191 - (v2 & -1586857191) * 2;
        if (1144348233 <= IilliliilIIi.IIIllIIliIIl) {
            v3 = var8_1 = (-1843479353 | -1586857191) - (-1843479353 & -1586857191);
            IilliliilIIi.IIIllIIliIIl = v3 + -1586857191 - (v3 & -1586857191) * 2;
        }
        if (IilliliilIIi.IlIlllIlilIl) {
            var8_1 = (467857253 | -1586857191) - (467857253 & -1586857191);
        }
        var6_3 = new Object[5];
        var4_2 = (504922080 | -1547992769) - (504922080 & -1547992769);
        ** GOTO lbl36
lbl-1000:
        // 1 sources

        {
            while (true) {
                if (((String)var6_3[1]).endsWith(";")) {
                    var6_3[3] = IilliliilIIi.iliIiiliiiii[119];
                    var6_3[0] = ((String)var6_3[1]).length();
                    var6_3[1] = ((String)var6_3[1]).substring(IilliliilIIi.iliIiiliiiii[118], 2 * ((Integer)var6_3[0] & ~((Integer)var6_3[3]).intValue()) - ((Integer)var6_3[0] ^ (Integer)var6_3[3])).replace(IilliliilIIi.iliIiiliiiii[120], IilliliilIIi.iliIiiliiiii[121]);
                }
                while (true) {
                    return Class.forName((String)var6_3[1]);
                    break;
                }
                break;
            }
lbl36:
            // 1 sources

            block34: while (true) {
                block35: while (true) {
                    v4 = var4_2;
                    switch (v4 + -1547992769 - (v4 & -1547992769) * 2) {
                        case 1578619322: {
                            return Double.TYPE;
                        }
                        case -1774138899: {
                            return Long.TYPE;
                        }
                        case 345612381: {
                            return Short.TYPE;
                        }
                        default: {
                            ** if (var0 != null && !var0.isEmpty()) goto lbl-1000
                        }
lbl-1000:
                        // 1 sources

                        {
                            var4_2 = (-224569962 | -1547992769) - (-224569962 & -1547992769);
                            continue block35;
                        }
lbl-1000:
                        // 1 sources

                        {
                            break block35;
                        }
                        case -224569962: {
                            throw new IllegalArgumentException("Input string cannot be null or empty");
                        }
                        case 1741044225: {
                            ** break;
                        }
                        case 1537666376: {
                            return Byte.TYPE;
lbl59:
                            // 1 sources

                            break block35;
                        }
                    }
                    break;
                }
                switch (var0.charAt(IilliliilIIi.iliIiiliiiii[117])) {
                    case 'D': {
                        var4_2 = (1578619322 | -1547992769) - (1578619322 & -1547992769);
                        continue block34;
                    }
                    case 'F': {
                        return Float.TYPE;
                    }
                    case 'I': {
                        return Integer.TYPE;
                    }
                    case 'J': {
                        var4_2 = (-1774138899 | -1547992769) - (-1774138899 & -1547992769);
                        continue block34;
                    }
                    case 'S': {
                        return Short.TYPE;
                    }
                    default: {
                        var6_3[1] = var0;
                        if (!((String)var6_3[1]).startsWith("L")) ** continue;
                        ** continue;
                    }
                    case 'B': {
                        return Byte.TYPE;
                    }
                    case 'C': 
                }
                break;
            }
            return Character.TYPE;
        }
        catch (ThreadDeath v5) {
            throw v5;
        }
        catch (InstantiationError v6) {
            throw v6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean liiiIIllIl(String string, IIIllIIliIIl iIIllIIliIIl) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 3 + 44;
        }
        Object[] objectArray = new Object[28];
        objectArray[20] = iliIiiliiiii[25];
        objectArray[12] = iliIiiliiiii[26];
        objectArray[23] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[23] | (Integer)objectArray[12]) & (~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[12]).intValue());
        objectArray[12] = iliIiiliiiii[27];
        objectArray[23] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[23] - ~((Integer)objectArray[12]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[26] = iliIiiliiiii[28];
        objectArray[12] = iliIiiliiiii[29];
        objectArray[23] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[23] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray[12] = iliIiiliiiii[30];
        objectArray[23] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[23] | (Integer)objectArray[12]) - ((Integer)objectArray[23] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[26]).intValue()] = string;
        objectArray[24] = iliIiiliiiii[31];
        objectArray[12] = iliIiiliiiii[32];
        objectArray[23] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[23] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[23] ^ (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[33];
        objectArray[23] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[23] | (Integer)objectArray[12]) - ((Integer)objectArray[23] ^ (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[24]).intValue()] = iIIllIIliIIl;
        return (boolean)IilliliilIIi.IIillIiliIil("193cc45a-ba89-4d44-b07c-f2035a1d5e1e", (Object)IilliliilIIi.IIillIiliIil("5b41c6d2-5253-4ef7-9fd6-106028f4d661", (long)4195988379997767897L, (Object[])objectArray2, (int)iliIiiliiiii[34], (int)iliIiiliiiii[35], (int)iliIiiliiiii[36], (String)"MjRiOGI2", (String)"f3QifWtqfWAoKC1SUClvlpZvYZiVkJRXk5WckpyZbZlcY5yWj5iKeZuPmQ==", (String)"OllPXXx0bnolZ3lrYS5PY2hkZ5VdLHCTa51pWJpsnpRdYpafm5qIcA==", (String)"XmRnfn0lJS4vLSpGR0RoaUtIbG5PTJBXc5dxlZqbdZmbn3mdQHydYoaHgWaKhIVqjk1pbrKzsJK2t7GWurt+mru/vL6ivL2hg4Ch", (int)iliIiiliiiii[37], (String)"YGRi", (int)iliIiiliiiii[38]), (int)iliIiiliiiii[39], (int)iliIiiliiiii[40], (int)iliIiiliiiii[41], (String)"Rk44THFt", (String)"fnUjfGprfGEpKSxTUShul5duYJmUkZVWkpSdk52YbJhdYp2XjpmLeJqOmA==", (String)"O15/d2l1JmB6ZGIpSHxrZ2CWXi9O", (String)"X2Vmf3wkJC8uLCtHRkVpaEpJbW9OTZFWcpZwlJuadJiannicQX2cY4eGgGeLhYRrj0xob7OysZO3trCXu7p/m7q+vb+jvbyggoGg", (int)iliIiiliiiii[42], (String)"Z2NYYms=", (int)iliIiiliiiii[43]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void iIlIlllllill(String string, String string2, String ... stringArray) {
        Object[] objectArray = new Object[32];
        int n = (0x2136F643 | 0xA841AD6) - (0x2136F643 & 0xA841AD6);
        int cfr_ignored_0 = n + 176429782;
        objectArray[15] = iliIiiliiiii[44];
        objectArray[28] = iliIiiliiiii[45];
        objectArray[4] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[4] & ~((Integer)objectArray[28]).intValue()) - (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[46];
        objectArray[4] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[4] ^ (Integer)objectArray[28]) - 2 * (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[28]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[10] = iliIiiliiiii[47];
        objectArray[28] = iliIiiliiiii[48];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[4] ^ (Integer)objectArray[28]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[49];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[4] ^ (Integer)objectArray[28]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[10]).intValue()] = string;
        objectArray[0] = iliIiiliiiii[50];
        objectArray[28] = iliIiiliiiii[51];
        objectArray[4] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[4] | (Integer)objectArray[28]) + ((Integer)objectArray[4] & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[52];
        objectArray[4] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[4] | (Integer)objectArray[28]) + ((Integer)objectArray[4] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[0]).intValue()] = string2;
        objectArray[6] = iliIiiliiiii[53];
        objectArray[28] = iliIiiliiiii[54];
        objectArray[4] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[4] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[28];
        objectArray[28] = iliIiiliiiii[55];
        objectArray[4] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[4] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[28];
        objectArray2[((Integer)objectArray[6]).intValue()] = stringArray;
        IilliliilIIi.IIillIiliIil("9c2f3123-ff3a-497c-bb34-27ca2ee96bae", (long)-8425668897089064846L, (Object[])objectArray2, (int)iliIiiliiiii[56], (int)iliIiiliiiii[57], (int)iliIiiliiiii[58], (String)"VWJYZ2N1", (String)"eXIke21se2YuLitUVi9pkJBpZ56TlpJRlZOalJqfa59aZZqQiZ6Mf52Jnw==", (String)"PF9JW3pyaHwjYX9tZyhJZW5iYZNbKnaVbZtvXpxqmJJbZJCZnZyOdg==", (String)"WGJheHsjIygpKyxAQUJub01OamhJSpZRdZF3k5ydc5+dmX+bRnqbZICBh2CMgoNsiEtvaLS1tpSwsbeQvL14nL25urikurunhYan", (int)iliIiiliiiii[59], (String)"ZmJk", (int)iliIiiliiiii[60]);
        int n2 = (0xF83C7F4D | 0x385722A7) - (0xF83C7F4D & 0x385722A7);
        int cfr_ignored_1 = n2 + 945234599;
    }
}

