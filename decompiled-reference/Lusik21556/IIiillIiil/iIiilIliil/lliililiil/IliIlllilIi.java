/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.entity.Player
 */
package Lusik21556.IIiillIiil.iIiilIliil.lliililiil;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;

public final class IliIlllilIi {
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    public static int[] IilliliilIIi;
    private static MiniMessage IliIlllilIi;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Exception decompiling
     */
    public static String IIlllIlliIll(String var0) {
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
    private IliIlllilIi() {
        if (iliIiiliiiii) {
            int n = (0xBAA3F2B2 | 0x480898D7) - (0xBAA3F2B2 & 0x480898D7);
        }
        Object[] objectArray = new Object[26];
        objectArray[20] = IilliliilIIi[0];
        objectArray[1] = IilliliilIIi[1];
        objectArray[9] = (int)((Integer)objectArray[20]);
        objectArray[20] = 2 * ((Integer)objectArray[9] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[9] ^ (Integer)objectArray[1]);
        objectArray[1] = IilliliilIIi[2];
        objectArray[9] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[9] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[9]).intValue() & (Integer)objectArray[1];
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[15] = IilliliilIIi[3];
        objectArray[1] = IilliliilIIi[4];
        objectArray[9] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[9] | (Integer)objectArray[1]) & ~((Integer)objectArray[9] & (Integer)objectArray[1]);
        objectArray[1] = IilliliilIIi[5];
        objectArray[9] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[9] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[9]).intValue() & (Integer)objectArray[1];
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("3d923140-8c8c-4db2-a3db-60ce2293bcbb", (long)-3508377771960683040L, (Object[])objectArray2, (String)"aW93", (int)IilliliilIIi[6], (String)"M1JCUn1Ha0E8eEx4QDlaSEFPSno8Dy1IUkZcD0tfS1MUNVtcWiVVDw==", (String)"MkVKdFJK", (int)IilliliilIIi[7], (String)"V29qfXw2MDU2Nj8lJkdARkcjTE1DAkgpSktJNUtXUFYVUFFdXlxYXlpbWRgGJCABJyAhLSMPKA==", (String)"ZUtWbXJW", (String)"dn83cmp1eH8xMzAxMTp6fX9AVH9EQ0EMSk5BUU1KWFYVNFElTltXBiJQLA==", (String)"V25saDNq", (int)IilliliilIIi[8]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void iIlIlllllill(Player player, int n) {
        if (iliIiiliiiii) {
            throw new ClassNotFoundException();
        }
        Object[] objectArray = new Object[31];
        objectArray[19] = IilliliilIIi[27];
        objectArray[10] = IilliliilIIi[28];
        objectArray[13] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[13] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray[10] = IilliliilIIi[29];
        objectArray[13] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[13] | (Integer)objectArray[10]) & (~((Integer)objectArray[13]).intValue() | ~((Integer)objectArray[10]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[19]).intValue()];
        objectArray[16] = IilliliilIIi[30];
        objectArray[10] = IilliliilIIi[31];
        objectArray[13] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[10]);
        objectArray[10] = IilliliilIIi[32];
        objectArray[13] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[13] | (Integer)objectArray[10]) - ((Integer)objectArray[13] & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[16]).intValue()] = player;
        objectArray[29] = IilliliilIIi[33];
        objectArray[10] = IilliliilIIi[34];
        objectArray[13] = (int)((Integer)objectArray[29]);
        objectArray[29] = 2 * ((Integer)objectArray[13] | (Integer)objectArray[10]) - ((Integer)objectArray[13] ^ (Integer)objectArray[10]);
        objectArray[10] = IilliliilIIi[35];
        objectArray[13] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[13] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[29]).intValue()] = Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("dddd4239-8b1b-4dec-9a07-b4487ebcc094", (int)n, (String)"bnhyanlSeA==", (int)IilliliilIIi[36], (String)"MFA/UX5EaEI/e097QzojR3xMTUpGPg==", (String)"ODZsWmNv", (int)IilliliilIIi[37], (String)"VGxpfn81MzY1NTwmJURDRUQgT05AAUsqSUhKNkhUU1UWU1JeXV9bXVlYWhsFJyMCJCMiLiAMKw==", (String)"SlczNHF1", (String)"cnhsRjJ/Q39HPSd7cEBBTno=", (String)"ZEIwVnpS", (int)IilliliilIIi[38]);
        Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("a23c554b-7b10-4d73-ba2a-cba6ce39b6d3", (long)8786338678278607650L, (Object[])objectArray2, (String)"bWtz", (int)IilliliilIIi[39], (String)"N1ZGVnlDb0U4fEh8RD1eTEVLTn44CylMVkJYC09bT1cQMV9YXiFRCw==", (String)"bHEwRUZC", (int)IilliliilIIi[40], (String)"U2tueXgyNDEyMjshIkNEQkMnSElHBkwtTk9NMU9TVFIRVFVZWlhcWl5fXRwCICQFIyQlKScLLA==", (String)"SE5SYUNI", (String)"cnszdm5xfHs1NzQ1NT5+eXtEUHtAR0UITkpFVUlOXFIRMFUhSl9TAiZUKA==", (String)"TDA0MnVt", (int)IilliliilIIi[41]);
    }

    /*
     * Exception decompiling
     */
    public static void Ililllililil() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 11[CASE]
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
    public static MethodHandle Iilllilliill(String var0, int var1_1, String var2_2, String var3_3, int var4_4, String var5_5, String var6_6, String var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 0[TRYBLOCK]], but top level block is 15[SWITCH]
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        if (Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.iliIiiliiiii) {
            throw null;
        }
        var20_5 = new Object[17];
        try {
            var20_5[2] = MethodHandles.lookup();
            var20_5[12] = ((MethodHandles.Lookup)var20_5[2]).findStatic(IliIlllilIi.class, "Iilllilliill", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
            var20_5[6] = var2_2.parameterCount();
            var20_5[13] = Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[51];
            var20_5[15] = (int)((Integer)var20_5[6]);
            var16_3 = (-557507895 | 2014904566) - (-557507895 & 2014904566);
        }
        catch (CloneNotSupportedException v0) {
            throw v0;
        }
        catch (UnknownError v1) {
            throw v1;
        }
lbl17:
        // 1 sources

        while (true) {
            continue;
            break;
        }
        var16_3 + 2014904566;
        var20_5[5] = (Integer)var20_5[15] + ~((Integer)var20_5[13]).intValue() + 1;
        var17_4 = (-1730509802 | -1792086889) - (-1730509802 & -1792086889);
        ** while (true)
        var17_4 + -1792086889;
        var20_5[3] = var2_2.dropParameterTypes((Integer)var20_5[5], (Integer)var20_5[6]);
        var20_5[8] = MethodHandles.invoker((MethodType)var20_5[3]);
        v2 = new Class[Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[52]];
        v2[Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[53]] = MethodHandle.class;
        var20_5[11] = ((MethodType)var20_5[3]).appendParameterTypes(v2);
        var20_5[13] = Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[54];
        var20_5[15] = (int)((Integer)var20_5[5]);
        var20_5[7] = new int[2 * ((Integer)var20_5[15] | (Integer)var20_5[13]) - ((Integer)var20_5[15] ^ (Integer)var20_5[13])];
        ((int[])var20_5[7])[Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[55]] = (Integer)var20_5[5];
        var20_5[9] = Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[56];
        while (true) {
            var20_5[13] = Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[57];
            var20_5[15] = (int)((Integer)var20_5[5]);
            if ((Integer)var20_5[9] >= ((Integer)var20_5[15] ^ (Integer)var20_5[13]) + 2 * ((Integer)var20_5[15] & (Integer)var20_5[13])) {
                var18_6 = (2055366890 | 1884295870) - (2055366890 & 1884295870);
                var18_6 + 1884295870;
                var20_5[14] = MethodHandles.permuteArguments((MethodHandle)var20_5[8], (MethodType)var20_5[11], (int[])var20_5[7]);
                var19_7 = (1601933562 | -182145840) - (1601933562 & -182145840);
                var19_7 + -182145840;
                var20_5[1] = MethodHandles.collectArguments((MethodHandle)var20_5[14], (Integer)var20_5[5], (MethodHandle)var20_5[12]);
                return new ConstantCallSite((MethodHandle)var20_5[1]);
            }
            var20_5[13] = Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.IilliliilIIi[58];
            var20_5[15] = (int)((Integer)var20_5[9]);
            ((int[])var20_5[7])[((Integer)var20_5[9]).intValue()] = (Integer)var20_5[15] + ~((Integer)var20_5[13]).intValue() + 1;
            var20_5[9] = (Integer)var20_5[9] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIillIiliIil(String string, int n, int n2) {
        if (iliIiiliiiii) {
            int n3 = (0x41BDD1D5 | 0xC426E0F6) - (0x41BDD1D5 & 0xC426E0F6);
        }
        Object[] objectArray = new Object[7];
        objectArray[4] = Base64.getDecoder().decode(string);
        objectArray[1] = IilliliilIIi[82];
        block4: while ((Integer)objectArray[1] < ((byte[])objectArray[4]).length) {
            int n4 = (0x3C9716F6 | 0xBC76F7AA) - (0x3C9716F6 & 0xBC76F7AA);
            int n5 = n4;
            switch (n5 + -1133054038 - (n5 & 0xBC76F7AA) * 2) {
                default: {
                    continue block4;
                }
                case 1016534774: 
            }
            byte[] byArray = (byte[])objectArray[4];
            int n6 = (Integer)objectArray[1];
            objectArray[2] = n;
            objectArray[0] = (int)byArray[n6];
            objectArray[2] = n2;
            objectArray[0] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = (int)((Integer)objectArray[1]);
            objectArray[0] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            byArray[n6] = (byte)((Integer)objectArray[0] - ~((Integer)objectArray[2]).intValue() - 1);
            objectArray[1] = (Integer)objectArray[1] + 1;
            int n7 = (0xD042D43E | 0x1C367740) - (0xD042D43E & 0x1C367740);
            int cfr_ignored_0 = n7 + 473331520;
        }
        return new String((byte[])objectArray[4], StandardCharsets.UTF_8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (iliIiiliiiii) {
            int cfr_ignored_0 = 0x31 & 1;
        }
        Object[] objectArray = new Object[24];
        Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Ililllililil();
        Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("951477ba-bb0f-4241-a232-9abb68dff209", IliIlllilIi.class, (String)"cnBBf0x2", (int)IilliliilIIi[42], (String)"NlV2QGxCN3tHe0M6KUFNen00CV0=", (String)"cVR1MjNW", (int)IilliliilIIi[43], (String)"UmpveHkzNTAzMzogI0JFQ0ImSUhGB00sT05MME5SVVMQVVRYW1ldW19eXB0DISUEIiUkKCYKLQ==", (String)"VDhueFg1", (String)"c3oyd29wfXo0NjU0ND9/eHpFUXpBRkQJT0tEVEhPXVMQMVQgS15SAydVKQ==", (String)"YzdaU0J3", (int)IilliliilIIi[44]);
        objectArray[21] = IilliliilIIi[45];
        objectArray[5] = IilliliilIIi[46];
        objectArray[4] = (int)((Integer)objectArray[21]);
        objectArray[21] = 2 * ((Integer)objectArray[4] | (Integer)objectArray[5]) - ((Integer)objectArray[4] ^ (Integer)objectArray[5]);
        objectArray[5] = IilliliilIIi[47];
        objectArray[4] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[4] | (Integer)objectArray[5]) & ~((Integer)objectArray[4] & (Integer)objectArray[5]);
        Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("6183dd6c-f4c2-4e13-b15f-72bde1f77feb", (long)6412508797376763497L, (Object[])new Object[((Integer)objectArray[21]).intValue()], (String)"b2lx", (int)IilliliilIIi[48], (String)"NVREVHtBbUc6fkp+Rj9cTkdJTHw6CStOVEBaCU1ZTVUSM11aXCNTCQ==", (String)"M2N3ZW9a", (int)IilliliilIIi[49], (String)"UWlse3owNjMwMDkjIEFGQEElSktFBE4vTE1PM01RVlATVldbWFpeWFxdXx4AIiYHISYnKyUJLg==", (String)"M0NHRk8y", (String)"cHkxdGxzfnk3NTY3Nzx8e3lGUnlCRUcKTEhHV0tMXlATMlcjSF1RACRWKg==", (String)"engwaklW", (int)IilliliilIIi[50]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String IliIlllilIi(Player player) {
        int n;
        int n2 = n = (0x151E1B69 | 0xB6474751) - (0x151E1B69 & 0xB6474751);
        lIiiIiIlilli = n2 + -1236842671 - (n2 & 0xB6474751) * 2;
        if (819762897 <= lIiiIiIlilli) {
            int n3 = n = (0x15343986 | 0xB6474751) - (0x15343986 & 0xB6474751);
            lIiiIiIlilli = n3 + -1236842671 - (n3 & 0xB6474751) * 2;
        }
        Object[] objectArray = new Object[27];
        objectArray[9] = IilliliilIIi[9];
        objectArray[15] = IilliliilIIi[10];
        objectArray[26] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[26] | (Integer)objectArray[15]) - ((Integer)objectArray[26] & (Integer)objectArray[15]);
        objectArray[15] = IilliliilIIi[11];
        objectArray[26] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[26] & ~((Integer)objectArray[15]).intValue()) - (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[22] = IilliliilIIi[12];
        objectArray[15] = IilliliilIIi[13];
        objectArray[26] = (int)((Integer)objectArray[22]);
        objectArray[22] = 2 * ((Integer)objectArray[26] | (Integer)objectArray[15]) - ((Integer)objectArray[26] ^ (Integer)objectArray[15]);
        objectArray[15] = IilliliilIIi[14];
        objectArray[26] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[26] - ~((Integer)objectArray[15]).intValue() - 1;
        objectArray2[((Integer)objectArray[22]).intValue()] = player;
        return (String)((Object)Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("66cef46c-6c4c-4386-813a-225391a2e79d", (long)-6697081139701578344L, (Object[])objectArray2, (String)"aG52", (int)IilliliilIIi[15], (String)"MlNDU3xGakA9eU15QThbSUBOS3s9DixJU0ddDkpeSlIVNFpdWyRUDg==", (String)"U1dBUk9q", (int)IilliliilIIi[16], (String)"Vm5rfH03MTQ3Nz4kJ0ZBR0YiTUxCA0koS0pINEpWUVcUUVBcX11ZX1taWBkHJSEAJiEgLCIOKQ==", (String)"M084TlBj", (String)"d342c2t0eX4wMjEwMDt7fH5BVX5FQkANS09AUExLWVcUNVAkT1pWByNRLQ==", (String)"Yng5NUdQ", (int)IilliliilIIi[17]));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void liiiIIllIl(Player player) {
        int n;
        int n2 = n = (0x535AAFB | 0x5A1B584A) - (0x535AAFB & 0x5A1B584A);
        if (37096098 >= n2 + 1511741514 - (n2 & 0x5A1B584A) * 2) {
            int cfr_ignored_0 = 7 + 89;
        }
        Object[] objectArray = new Object[30];
        objectArray[26] = IilliliilIIi[18];
        objectArray[8] = IilliliilIIi[19];
        objectArray[27] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[27] ^ (Integer)objectArray[8]) - 2 * (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[8]);
        objectArray[8] = IilliliilIIi[20];
        objectArray[27] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[27] | (Integer)objectArray[8]) - ((Integer)objectArray[27] & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[16] = IilliliilIIi[21];
        objectArray[8] = IilliliilIIi[22];
        objectArray[27] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[27] | (Integer)objectArray[8]) + ((Integer)objectArray[27] & (Integer)objectArray[8]);
        objectArray[8] = IilliliilIIi[23];
        objectArray[27] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[27] | (Integer)objectArray[8]) & ~((Integer)objectArray[27] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[16]).intValue()] = player;
        Lusik21556.IIiillIiil.iIiilIliil.lliililiil.IliIlllilIi.Illlllllilll("edbd7212-d4c9-4fba-ac24-c26b74cb378a", (long)-6627999954060298430L, (Object[])objectArray2, (String)"a211", (int)IilliliilIIi[24], (String)"MVBAUH9FaUM+ek56QjtYSkNNSHg+DS9KUEReDUldSVEWN1leWCdXDQ==", (String)"dzg0NDZh", (int)IilliliilIIi[25], (String)"VW1of340Mjc0ND0nJEVCREUhTk9BAEorSElLN0lVUlQXUlNfXF5aXFhZWxoEJiIDJSIjLyENKg==", (String)"cEJFOUR6", (String)"dH01cGh3en0zMTIzMzh4f31CVn1GQUMOSExDU09IWlQXNlMnTFlVBCBSLg==", (String)"SGVsdzBV", (int)IilliliilIIi[26]);
        int n3 = (0xCECCEADC | 0xA5FC0AA6) - (0xCECCEADC & 0xA5FC0AA6);
        int cfr_ignored_1 = n3 + -1510208858;
    }

    /*
     * Exception decompiling
     */
    public static Class IiIlliIliiIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE], 39[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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

