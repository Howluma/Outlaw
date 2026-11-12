/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityPickupItemEvent
 *  org.bukkit.event.entity.ItemDespawnEvent
 *  org.bukkit.event.player.PlayerDropItemEvent
 *  org.bukkit.inventory.ItemStack
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

public final class Iilllilliill
implements Listener {
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    private IliIlllilIi IliIlllilIi;
    public static int[] IilliliilIIi;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDespawn(ItemDespawnEvent itemDespawnEvent) {
        int n;
        int n2 = n = (0xDBB7CC3 | 0x923BF4E9) - (0xDBB7CC3 & 0x923BF4E9);
        lIiiIiIlilli = n2 + -1841564439 - (n2 & 0x923BF4E9) * 2;
        if (507149105 < lIiiIiIlilli) {
            throw new IllegalMonitorStateException();
        }
        Object[] objectArray = new Object[29];
        objectArray[24] = IilliliilIIi[28];
        objectArray[10] = IilliliilIIi[29];
        objectArray[17] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[17] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[17] ^ (Integer)objectArray[10]);
        objectArray[10] = IilliliilIIi[30];
        objectArray[17] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[17] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[10];
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[12] = IilliliilIIi[31];
        objectArray[10] = IilliliilIIi[32];
        objectArray[17] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[17] | (Integer)objectArray[10]) & ~((Integer)objectArray[17] & (Integer)objectArray[10]);
        objectArray[10] = IilliliilIIi[33];
        objectArray[17] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[17] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        objectArray[11] = IilliliilIIi[34];
        objectArray[10] = IilliliilIIi[35];
        objectArray[17] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[17] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[10];
        objectArray[10] = IilliliilIIi[36];
        objectArray[17] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[17] | (Integer)objectArray[10]) - ((Integer)objectArray[17] & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[11]).intValue()] = itemDespawnEvent;
        Iilllilliill.IlIlllIlilIl("03095d1e-1426-431d-a7f5-5470a09a3880", (long)-2060127985152124806L, (Object[])objectArray2, (int)IilliliilIIi[37], (String)"3dagIRkYJyZeWl9QXlUVFBQvIwYLMg5LMQkOMAIFNz1CIz4MNQo4bQk/Cw==", (int)IilliliilIIi[38], (int)IilliliilIIi[39], (int)IilliliilIIi[40], (String)"mL3NQSIuFChbJysXL1Q1Jy4mJQlDdlI3OQE7Rjg2BDpDIDQDCQg6dg==", (String)"dW1pMmd3", (String)"5ubg", (String)"vOblJCNZX1xdUVhMKC5PLSwvKzFVNkw1MTIzXF07Olg8QTtkAGYCBQQHBgwIC3RoCQ8OFBAWFxVxchNnGH4fGHkae2FlY2JgGmJmbA1ub21pamt0dQ0XcHR3dnx4e394fH8=", (int)IilliliilIIi[41]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        if (Iilllilliill.iliIiiliiiii) {
            throw null;
        }
        var18_4 = new Object[15];
        var18_4[11] = MethodHandles.lookup();
        var18_4[0] = ((MethodHandles.Lookup)var18_4[11]).findStatic(Iilllilliill.class, "IiIlliIliiIl", MethodType.fromMethodDescriptorString("(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
        var18_4[8] = var2_2.parameterCount();
        var18_4[2] = Iilllilliill.IilliliilIIi[72];
        var18_4[14] = (int)((Integer)var18_4[8]);
        var18_4[9] = 2 * ((Integer)var18_4[14] & ~((Integer)var18_4[2]).intValue()) - ((Integer)var18_4[14] ^ (Integer)var18_4[2]);
        var18_4[1] = var2_2.dropParameterTypes((Integer)var18_4[9], (Integer)var18_4[8]);
        var18_4[7] = MethodHandles.invoker((MethodType)var18_4[1]);
        v0 = new Class[Iilllilliill.IilliliilIIi[73]];
        v0[Iilllilliill.IilliliilIIi[74]] = MethodHandle.class;
        var18_4[3] = ((MethodType)var18_4[1]).appendParameterTypes(v0);
        var18_4[2] = Iilllilliill.IilliliilIIi[75];
        var18_4[14] = (int)((Integer)var18_4[9]);
        var18_4[5] = new int[(Integer)var18_4[14] - ~((Integer)var18_4[2]).intValue() - 1];
        var16_3 = (2043694592 | -59958160) - (2043694592 & -59958160);
        var16_3 + -59958160;
        ((int[])var18_4[5])[Iilllilliill.IilliliilIIi[76]] = (Integer)var18_4[9];
        var18_4[6] = Iilllilliill.IilliliilIIi[77];
        if (true) ** GOTO lbl38
        block9: while (true) {
            v1 = var17_5;
            switch (v1 + -91703546 - (v1 & -91703546) * 2) {
                default: {
                    var18_4[2] = Iilllilliill.IilliliilIIi[79];
                    var18_4[14] = (int)((Integer)var18_4[6]);
                    ((int[])var18_4[5])[((Integer)var18_4[6]).intValue()] = 2 * ((Integer)var18_4[14] & ~((Integer)var18_4[2]).intValue()) - ((Integer)var18_4[14] ^ (Integer)var18_4[2]);
                    var17_5 = (1043686592 | -91703546) - (1043686592 & -91703546);
                    continue block9;
                }
                case 1043686592: {
                    var18_4[6] = (Integer)var18_4[6] + 1;
lbl38:
                    // 2 sources

                    var18_4[2] = Iilllilliill.IilliliilIIi[78];
                    var18_4[14] = (int)((Integer)var18_4[9]);
                    if ((Integer)var18_4[6] >= (Integer)var18_4[14] - ~((Integer)var18_4[2]).intValue() - 1) break block9;
                    var17_5 = (-1064662137 | -91703546) - (-1064662137 & -91703546);
                    continue block9;
                }
                case -1002585534: 
            }
            break;
        }
        var18_4[10] = MethodHandles.permuteArguments((MethodHandle)var18_4[7], (MethodType)var18_4[3], (int[])var18_4[5]);
        var18_4[12] = MethodHandles.collectArguments((MethodHandle)var18_4[10], (Integer)var18_4[9], (MethodHandle)var18_4[0]);
        v2((MethodHandle)var18_4[12]);
        return v2;
    }

    /*
     * Exception decompiling
     */
    public static Class iliIiiliiiii(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [37[UNCONDITIONALDOLOOP], 15[CASE]], but top level block is 2[TRYBLOCK]
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
    public Iilllilliill(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x13BBD5BC | 0x145973F3) - (0x13BBD5BC & 0x145973F3);
        lIiiIiIlilli = n2 + 341406707 - (n2 & 0x145973F3) * 2;
        if (1741300575 < lIiiIiIlilli) {
            int n3 = n = (0x5F | 0x145973F3) - (0x5F & 0x145973F3);
            int cfr_ignored_0 = n3 + 341406707 - (n3 & 0x145973F3) * 2;
        }
        Object[] objectArray = new Object[28];
        objectArray[2] = IilliliilIIi[0];
        objectArray[14] = IilliliilIIi[1];
        objectArray[0] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[0] | (Integer)objectArray[14]) & ~((Integer)objectArray[0] & (Integer)objectArray[14]);
        objectArray[14] = IilliliilIIi[2];
        objectArray[0] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[0] ^ (Integer)objectArray[14]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[14]);
        Object[] objectArray2 = new Object[((Integer)objectArray[2]).intValue()];
        objectArray[7] = IilliliilIIi[3];
        objectArray[14] = IilliliilIIi[4];
        objectArray[0] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[0] | (Integer)objectArray[14]) & ~((Integer)objectArray[0] & (Integer)objectArray[14]);
        objectArray[14] = IilliliilIIi[5];
        objectArray[0] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[0] | (Integer)objectArray[14]) & ~((Integer)objectArray[0] & (Integer)objectArray[14]);
        objectArray2[((Integer)objectArray[7]).intValue()] = this;
        objectArray[23] = IilliliilIIi[6];
        objectArray[14] = IilliliilIIi[7];
        objectArray[0] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[0] & ~((Integer)objectArray[14]).intValue()) - ((Integer)objectArray[0] ^ (Integer)objectArray[14]);
        objectArray[14] = IilliliilIIi[8];
        objectArray[0] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[0] & ~((Integer)objectArray[14]).intValue()) - ((Integer)objectArray[0] ^ (Integer)objectArray[14]);
        objectArray2[((Integer)objectArray[23]).intValue()] = iliIlllilIi;
        Iilllilliill.IlIlllIlilIl("af57ceec-cc35-45c6-8847-7ee7f5f6d379", (long)-810605237742286314L, (Object[])objectArray2, (int)IilliliilIIi[9], (String)"3yheIxseISRcVFFSXFMTFhYxPQQJNAhJMwcAMgADMT9AHQAONww+bwsxBQ==", (int)IilliliilIIi[10], (int)IilliliilIIi[11], (int)IilliliilIIi[12], (String)"mkMzQyAoEipZKSUVLVIzJSw4OwtBcFQ1Ow81RDowAjhBHgoBCw48dA==", (String)"S3NsbHpu", (String)"5Bge", (String)"vhgbJiFfWV5fX1ZOKihJLy4xNTNXMEo3Mzw9Xl89PFo+fwVmAmAEBwYJCA4KDXJqCxEQFhIQERdzfB1lGngZGntkBWNnZWRiGGxobg9oaW9rdHV2dwsRcnZ5eH56fXl6fkE=", (int)IilliliilIIi[13]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (iliIiiliiiii) {
            int n;
            int n2 = n = (0x5DF4455C | 0x2946DAD9) - (0x5DF4455C & 0x2946DAD9);
            lIiiIiIlilli = n2 + 692509401 - (n2 & 0x2946DAD9) * 2;
        }
        Iilllilliill.Illlllllilll();
        Iilllilliill.IlIlllIlilIl("7ab6d58a-c19c-4e88-9b03-6a6350cd0866", Iilllilliill.class, (int)IilliliilIIi[67], (String)"2tOj3OblJCNZX1xdUVgWERMqIBsULw1ONgwNPQ0INDhFJj0xCjc7aA46CA==", (int)IilliliilIIi[68], (int)IilliliilIIi[69], (int)IilliliilIIi[70], (String)"n7rf0enTXiAuHCJbTCYkExBZaDo=", (String)"cTA4b01B", (String)"2+XQ1Mnf", (String)"u+Pm2dykXFlaVFtBJyNMKCsqKCxKK08wNjcwUVI2OV07RDhZP1sBAAMCBQEHBndtDgoNCQ8LFBB2dxBqF3McHX4feBwaHmFlHWdlYQJjbGhub2hpahAUdXNydXF3dnx9e3o=", (int)IilliliilIIi[71]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDrop(PlayerDropItemEvent playerDropItemEvent) {
        int n;
        int n2 = n = (0xBBB432 | 0xD687440B) - (0xBBB432 & 0xD687440B);
        lIiiIiIlilli = n2 + -695778293 - (n2 & 0xD687440B) * 2;
        if (619413957 <= lIiiIiIlilli) {
            int cfr_ignored_0 = 53 + 93;
        }
        Object[] objectArray = new Object[29];
        objectArray[15] = IilliliilIIi[42];
        objectArray[13] = IilliliilIIi[43];
        objectArray[10] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[10] | (Integer)objectArray[13]) - ((Integer)objectArray[10] ^ (Integer)objectArray[13]);
        objectArray[13] = IilliliilIIi[44];
        objectArray[10] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[10] ^ (Integer)objectArray[13]) + 2 * ((Integer)objectArray[10] & (Integer)objectArray[13]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[3] = IilliliilIIi[45];
        objectArray[13] = IilliliilIIi[46];
        objectArray[10] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[10] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = IilliliilIIi[47];
        objectArray[10] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[10] ^ (Integer)objectArray[13]) + 2 * ((Integer)objectArray[10] & (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[3]).intValue()] = this;
        objectArray[2] = IilliliilIIi[48];
        objectArray[13] = IilliliilIIi[49];
        objectArray[10] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[10] & ~((Integer)objectArray[13]).intValue()) - (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[13]);
        objectArray[13] = IilliliilIIi[50];
        objectArray[10] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[10] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray2[((Integer)objectArray[2]).intValue()] = playerDropItemEvent;
        Iilllilliill.IlIlllIlilIl("a49dcfd8-8546-4ae0-9d8b-3eccc9b298b5", (long)8666564955169270048L, (Object[])objectArray2, (int)IilliliilIIi[51], (String)"3NWh3hgbJiFfWV5fX1YUExUsIhkKMQ9MMAoPPwMGNjpDID8zNAk5agg8Cg==", (int)IilliliilIIi[52], (int)IilliliilIIi[53], (int)IilliliilIIi[54], (String)"mb7MviMtFS9aJCoYLlc0IC8lJBZCdVMwOAI6STk1BT1CIzU8CAs7cQ==", (String)"TExpaWh2", (String)"5+Xh", (String)"veXk2yJaXltcUllDKS1OKi0sKi5UNU0yMDEyU1w4O189QjpbAWUDAgUEBwMJCHVvCAwPCxEVFhJwcRJoGX0eH3gZeh5kYGNnG2FnYwxtbmpoaWprdA4Wd3V0d3N5eH5/fXw=", (int)IilliliilIIi[55]);
    }

    /*
     * Exception decompiling
     */
    public static String IIIllIIliIIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [64[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static void Illlllllilll() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [34[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static MethodHandle IiIlliIliiIl(int var0, String var1_1, int var2_2, int var3_3, int var4_4, String var5_5, String var6_6, String var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK], 2[TRYBLOCK], 4[TRYBLOCK]], but top level block is 19[SWITCH]
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
    private static void removeDisplay(ItemStack itemStack) {
        int n;
        int n2 = n = (0x288E6DC4 | 0xE850D8C5) - (0x288E6DC4 & 0xE850D8C5);
        lIiiIiIlilli = n2 + -397354811 - (n2 & 0xE850D8C5) * 2;
        if (1649472766 < lIiiIiIlilli) {
            n = (0xDC38AE63 | 0xE850D8C5) - (0xDC38AE63 & 0xE850D8C5);
        }
        Object[] objectArray = new Object[28];
        objectArray[16] = IilliliilIIi[56];
        objectArray[26] = IilliliilIIi[57];
        objectArray[11] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[11] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray[26] = IilliliilIIi[58];
        objectArray[11] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[11] & ~((Integer)objectArray[26]).intValue() | ~((Integer)objectArray[11]).intValue() & (Integer)objectArray[26];
        Object[] objectArray2 = new Object[((Integer)objectArray[16]).intValue()];
        objectArray[20] = IilliliilIIi[59];
        objectArray[26] = IilliliilIIi[60];
        objectArray[11] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[11] | (Integer)objectArray[26]) + ((Integer)objectArray[11] & (Integer)objectArray[26]);
        objectArray[26] = IilliliilIIi[61];
        objectArray[11] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[11] | (Integer)objectArray[26]) & ~((Integer)objectArray[11] & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[20]).intValue()] = itemStack;
        Iilllilliill.IlIlllIlilIl("f07e54ce-ceee-45d9-8805-20e6189ef7a6", (long)-9093268960424143912L, (Object[])objectArray2, (int)IilliliilIIi[62], (String)"29Si3+caJSBYWF1eUFcXEhItIRgVMAxNNwsMPgwHNTtEITwyCwg6aw89CQ==", (int)IilliliilIIi[63], (int)IilliliilIIi[64], (int)IilliliilIIi[65], (String)"nr/Pv9wsFi5dJSkZIVY3ISgkJxdddFAxPwM5SDY0BjxFIjY9Nwo4cA==", (String)"WTQwenpD", (String)"4OTi", (String)"uuTn2t1bXVpbU1pCJixNKyotKS9LNE4zNzAxUlM5OF46QzlaPmQAAwIFBAIGCXZuDw0MCg4UFRN3cBFpFnwdHn8YeR8bYWBmHGBkYgNsbWtvaGlqaw8VdnJ1dHJ2eX1+en0=", (int)IilliliilIIi[66]);
    }

    @EventHandler
    public void onPickup(EntityPickupItemEvent entityPickupItemEvent) {
        Object[] objectArray = new Object[29];
        objectArray[3] = IilliliilIIi[14];
        objectArray[6] = IilliliilIIi[15];
        objectArray[13] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[13] | (Integer)objectArray[6]) - ((Integer)objectArray[13] ^ (Integer)objectArray[6]);
        objectArray[6] = IilliliilIIi[16];
        objectArray[13] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[13] ^ (Integer)objectArray[6]) - 2 * (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[16] = IilliliilIIi[17];
        objectArray[6] = IilliliilIIi[18];
        objectArray[13] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[13] ^ (Integer)objectArray[6]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[6]);
        objectArray[6] = IilliliilIIi[19];
        objectArray[13] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[13] ^ (Integer)objectArray[6]) - 2 * (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[10] = IilliliilIIi[20];
        objectArray[6] = IilliliilIIi[21];
        objectArray[13] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[13] + ~((Integer)objectArray[6]).intValue() + 1;
        objectArray[6] = IilliliilIIi[22];
        objectArray[13] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[13] ^ (Integer)objectArray[6]) - 2 * (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[10]).intValue()] = entityPickupItemEvent;
        Iilllilliill.IlIlllIlilIl("97af5178-eb58-4804-b393-621e92c7a576", (long)7198630220532006514L, (Object[])objectArray2, (int)IilliliilIIi[23], (String)"3tdfIBoZICddW1BRXVQSFRcuPAcIMwlKMggBMQEEMDxBIgENNgs/bAo+BA==", (int)IilliliilIIi[24], (int)IilliliilIIi[25], (int)IilliliilIIi[26], (String)"m7wyQCEvEylYJiQWLFUyJi0nOghAd1U2OgA0Rzs3AztAIQsCCgk9dw==", (String)"cDFSOUM3", (String)"5ecf", (String)"v+caJSBYWF1eUFdNKy9ILC8uNDBWN0s0MjM8XV46PVk/QARlA2cFBAcGCQ0LCnNpCg4RFRMXEBRycxxmG38YGXobBGBmYmVhGWNpbQ5vaGxqa3R1dgwQcXd2eX17enh5f34=", (int)IilliliilIIi[27]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIlllIlliIll(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x8DB9E46 | 0xB1FFA6E) - (0x8DB9E46 & 0xB1FFA6E);
        lIiiIiIlilli = n4 + 186645102 - (n4 & 0xB1FFA6E) * 2;
        if (1203626208 < lIiiIiIlilli) {
            n3 = (0xA1AEBEAF | 0xB1FFA6E) - (0xA1AEBEAF & 0xB1FFA6E);
        }
        Object[] objectArray = new Object[8];
        objectArray[4] = Base64.getDecoder().decode(string);
        int n5 = (0x8E97B80F | 0xF30B2022) - (0x8E97B80F & 0xF30B2022);
        int cfr_ignored_0 = n5 + -217374686;
        objectArray[6] = IilliliilIIi[103];
        while (true) {
            if ((Integer)objectArray[6] >= ((byte[])objectArray[4]).length) {
                do {
                    int n6 = (0x258850A8 | 0xC4976980) - (0x258850A8 & 0xC4976980);
                    int n7 = n6;
                    switch (n7 + -996710016 - (n7 & 0xC4976980) * 2) {
                        case 629690536: {
                            return new String((byte[])objectArray[4], StandardCharsets.UTF_8);
                        }
                    }
                } while ((Integer)objectArray[6] >= ((byte[])objectArray[4]).length);
            }
            byte[] byArray = (byte[])objectArray[4];
            int n8 = (Integer)objectArray[6];
            objectArray[5] = (int)((Integer)objectArray[6]);
            objectArray[0] = n;
            objectArray[5] = ((Integer)objectArray[0] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[5]);
            objectArray[0] = (int)byArray[n8];
            objectArray[5] = n2;
            objectArray[0] = ((Integer)objectArray[0] | (Integer)objectArray[5]) - ((Integer)objectArray[0] & (Integer)objectArray[5]);
            byArray[n8] = (byte)(2 * ((Integer)objectArray[0] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[0] ^ (Integer)objectArray[5]));
            int n9 = (0x4B29F2F | 0xC408C1D1) - (0x4B29F2F & 0xC408C1D1);
            int cfr_ignored_1 = n9 + -1006059055;
            objectArray[6] = (Integer)objectArray[6] + 1;
        }
    }
}

