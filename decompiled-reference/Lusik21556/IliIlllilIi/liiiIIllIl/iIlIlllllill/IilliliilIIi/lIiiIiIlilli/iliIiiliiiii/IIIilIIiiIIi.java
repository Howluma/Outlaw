/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.inventory.InventoryDragEvent
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.net.ssl.SSLHandshakeException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public final class IIIilIIiiIIi
implements Listener {
    public static int[] iIlIlllllill;
    static AtomicReferenceArray<MethodHandle> liiiIIllIl;
    public static int IilliliilIIi;
    public static boolean lIiiIiIlilli;

    /*
     * Exception decompiling
     */
    public static String lIiiIiIlilli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [69[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    @EventHandler
    public void onClick(InventoryClickEvent inventoryClickEvent) {
        if (lIiiIiIlilli) {
            int cfr_ignored_0 = 96 + 97;
        }
        Object[] objectArray = new Object[28];
        objectArray[22] = iIlIlllllill[11];
        objectArray[10] = iIlIlllllill[12];
        objectArray[5] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[5] & ~((Integer)objectArray[10]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10]);
        objectArray[10] = iIlIlllllill[13];
        objectArray[5] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[5] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[13] = iIlIlllllill[14];
        objectArray[10] = iIlIlllllill[15];
        objectArray[5] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[5] - ~((Integer)objectArray[10]).intValue() - 1;
        objectArray[10] = iIlIlllllill[16];
        objectArray[5] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[5] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray2[((Integer)objectArray[13]).intValue()] = this;
        objectArray[16] = iIlIlllllill[17];
        objectArray[10] = iIlIlllllill[18];
        objectArray[5] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[10]);
        objectArray[10] = iIlIlllllill[19];
        objectArray[5] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[5] | (Integer)objectArray[10]) + ((Integer)objectArray[5] & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[16]).intValue()] = inventoryClickEvent;
        IIIilIIiiIIi.iliIiiliiiii("af0ad447-728d-44dc-8f0e-5db8a376e541", (long)9219371861072551716L, (Object[])objectArray2, (int)iIlIlllllill[20], (String)"ycvD", (int)iIlIlllllill[21], (String)"f6KwpsW7x71+vMK8wnmYxNHLyL6Gk7HU0MbSi8fTx89mxZegmJ2pcw==", (int)iIlIlllllill[22], (int)iIlIlllllill[23], (String)"o8vIwcaOjomUlnuZt7ueutPU0ta004/SyMfKqazIya2jZqLBn8OhopucnZmXmFe9sLS1sa+ztrLIx6psp8uurWB/YoaEgIGFvXd9eVx7fnqQj5KRlNJ2dWiHjWlsi45tgF8=", (int)iIlIlllllill[24], (String)"aHp2eFBz", (String)"xLuDxsjNxsORj5aVkXq40bvUyru+z72QyM7F1cXK1splyKWZtJeruqC0og==");
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIilIIiiIIi() {
        if (lIiiIiIlilli) {
            int cfr_ignored_0 = 0x54 & 1;
        }
        Object[] objectArray = new Object[26];
        objectArray[23] = iIlIlllllill[0];
        objectArray[1] = iIlIlllllill[1];
        objectArray[19] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[19] - ~((Integer)objectArray[1]).intValue() - 1;
        objectArray[1] = iIlIlllllill[2];
        objectArray[19] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[19] | (Integer)objectArray[1]) & ~((Integer)objectArray[19] & (Integer)objectArray[1]);
        Object[] objectArray2 = new Object[((Integer)objectArray[23]).intValue()];
        objectArray[15] = iIlIlllllill[3];
        objectArray[1] = iIlIlllllill[4];
        objectArray[19] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[1]);
        objectArray[1] = iIlIlllllill[5];
        objectArray[19] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[19] | (Integer)objectArray[1]) - ((Integer)objectArray[19] ^ (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        IIIilIIiiIIi.iliIiiliiiii("54cdd688-9cce-47d1-97b5-0f42cac5df5d", (long)-4726722597272065164L, (Object[])objectArray2, (int)iIlIlllllill[6], (String)"yMrC", (int)iIlIlllllill[7], (String)"fqGvpcS6xrx9u8G7wXiXw9DKx72FkrDTz8XRisbSxs5lxJafl5yocg==", (int)iIlIlllllill[8], (int)iIlIlllllill[9], (String)"osrHwMWNjYiTlXqYtrqdudLT0dWz0o7Rx8bJqKvHyKyiZaHAnsKgoZqbnJiWl1a8r7O0sK6ytbHHxqlrpsqtrF9+YYWDf4CEvHZ8eFt6fXmPjpGQk9F1dGeGjGhrio1sf14=", (int)iIlIlllllill[10], (String)"WEVtank1", (String)"w7qCxcfMxcKQjpWUkHm30LrTybq9zryPx83E1MTJ1clkx6SYs5aquZ+zoQ==");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDrag(InventoryDragEvent inventoryDragEvent) {
        Object[] objectArray = new Object[29];
        int n = (0xD9F97011 | 0xFBD0A7D1) - (0xD9F97011 & 0xFBD0A7D1);
        int cfr_ignored_0 = n + -70211631;
        objectArray[1] = iIlIlllllill[25];
        objectArray[5] = iIlIlllllill[26];
        objectArray[18] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[18] & ~((Integer)objectArray[5]).intValue()) - (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = iIlIlllllill[27];
        objectArray[18] = (int)((Integer)objectArray[1]);
        objectArray[1] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[5]);
        Object[] objectArray2 = new Object[((Integer)objectArray[1]).intValue()];
        objectArray[13] = iIlIlllllill[28];
        objectArray[5] = iIlIlllllill[29];
        objectArray[18] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[18] | (Integer)objectArray[5]) - ((Integer)objectArray[18] & (Integer)objectArray[5]);
        objectArray[5] = iIlIlllllill[30];
        objectArray[18] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[18] & ~((Integer)objectArray[5]).intValue()) - (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[13]).intValue()] = this;
        objectArray[12] = iIlIlllllill[31];
        objectArray[5] = iIlIlllllill[32];
        objectArray[18] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[18] & ~((Integer)objectArray[5]).intValue()) - (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = iIlIlllllill[33];
        objectArray[18] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[18] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[12]).intValue()] = inventoryDragEvent;
        IIIilIIiiIIi.iliIiiliiiii("ab50566b-12a2-4012-962c-2b8ffc5ace00", (long)-4057779986292333924L, (Object[])objectArray2, (int)iIlIlllllill[34], (String)"xsjA", (int)iIlIlllllill[35], (String)"fJ+to8K4xLp7ub+5v3aVwc7IxbuDkK7RzcPPiMTQxMxjwpSdlZqmcA==", (int)iIlIlllllill[36], (int)iIlIlllllill[37], (String)"oMjFvsOLi4aRk3iWtLibt9DRz9Ox0IzPxcTHpqnFxqqgY5++nMCen5iZmpaUlVS6rbGyrqyws6/FxKdppMirql18X4OBfX6CunR6dll4e3eNjI+Okc9zcmWEimZpiItqfVw=", (int)iIlIlllllill[38], (String)"SWp4THcx", (String)"wbiAw8XKw8COjJOSjne1zrjRx7i7zLqNxcvC0sLH08dixaKWsZSot52xnw==");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IIIllIIliIIl(int var0, String var1_1, int var2_2, String var3_3, int var4_4, int var5_5, String var6_6, int var7_7, String var8_8, String var9_9) {
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

    /*
     * Exception decompiling
     */
    public static Class IilliliilIIi(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentSimple
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
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
    private static String IlIlllIlilIl(String var0, int var1_1, int var2_2) {
        v0 = var11_3 = (243241971 | 360830964) - (243241971 & 360830964);
        IIIilIIiiIIi.IilliliilIIi = v0 + 360830964 - (v0 & 360830964) * 2;
        if (1559817184 <= IIIilIIiiIIi.IilliliilIIi) {
            55 + 89;
        }
        var9_5 = new Object[6];
        var9_5[0] = Base64.getDecoder().decode(var0);
        var9_5[3] = IIIilIIiiIIi.iIlIlllllill[75];
        if (true) ** GOTO lbl43
lbl12:
        // 2 sources

        while (true) {
            try {
                return new String((byte[])var9_5[0], StandardCharsets.UTF_8);
            }
            catch (IllegalAccessError v1) {
                throw v1;
            }
            catch (UnknownError v2) {
                throw v2;
            }
            break;
        }
        block11: while (true) {
            v3 = var8_4;
            switch (v3 + 1917206417 - (v3 & 1917206417) * 2) {
                case 848548380: {
                    ** GOTO lbl12
                }
                default: {
                    if ((Integer)var9_5[3] < ((byte[])var9_5[0]).length) ** break;
                    ** continue;
                    var8_4 = (-53244493 | 1917206417) - (-53244493 & 1917206417);
                    continue block11;
                }
                case -53244493: 
            }
            v4 = (byte[])var9_5[0];
            v5 = (Integer)var9_5[3];
            var9_5[1] = var2_2;
            var9_5[4] = var1_1;
            var9_5[1] = (Integer)var9_5[4] & ~((Integer)var9_5[1]).intValue() | ~((Integer)var9_5[4]).intValue() & (Integer)var9_5[1];
            var9_5[4] = (int)v4[v5];
            var9_5[1] = (int)((Integer)var9_5[3]);
            var9_5[4] = (Integer)var9_5[4] + ~((Integer)var9_5[1]).intValue() + 1;
            v4[v5] = (byte)((Integer)var9_5[4] & ~((Integer)var9_5[1]).intValue() | ~((Integer)var9_5[4]).intValue() & (Integer)var9_5[1]);
            var9_5[3] = (Integer)var9_5[3] + 1;
lbl43:
            // 2 sources

            var8_4 = (-994099187 | 1917206417) - (-994099187 & 1917206417);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0xC1B7CB7 | 0x26DA0AEE) - (0xC1B7CB7 & 0x26DA0AEE);
        IilliliilIIi = n2 + 651823854 - (n2 & 0x26DA0AEE) * 2;
        if (2127208699 <= IilliliilIIi) {
            throw new SSLHandshakeException();
        }
        IIIilIIiiIIi.IiIlliIliiIl();
        IIIilIIiiIIi.iliIiiliiiii("d090ebee-8f25-49a6-94f4-ce23bb4aefb7", IIIilIIiiIIi.class, (int)iIlIlllllill[39], (String)"wcO4vKe9", (int)iIlIlllllill[40], (String)"faK9t8e5fsC+vMJ5pLbE0bh/kJo=", (int)iIlIlllllill[41], (int)iIlIlllllill[42], (String)"ocnGv8SMjIeSlHmXtbmcuNHS0NSy0Y3QxsXIp6rGx6uhZKC/ncGfoJmam5eVllW7rrKzr62xtLDGxahqpcmsq159YISCfn+Du3V7d1p5fHiOjZCPktB0c2aFi2dqiYxrfl0=", (int)iIlIlllllill[43], (String)"TkEyN1J3", (String)"wrmBxMbLxMGPjZSTj3i2z7nSyLm8zbuOxszD08PI1MhjxqOXspWpuJ6yoA==");
    }

    /*
     * Exception decompiling
     */
    public static void IiIlliIliiIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
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
}

