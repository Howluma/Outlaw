/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.PlayerDeathEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.Illlllllilll.Iilllilliill.IIillIiliIil.Ililllililil.Iiilliiliiil.IIIilIIiiIIi.IliIlllilIi;
import java.io.InterruptedIOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class IiIiliIiiiIi
implements Listener {
    public static int[] iliIiiliiiii;
    private static MiniMessage liiiIIllIl;
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    private Map<UUID, UUID> iIlIlllllill;
    private Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi IliIlllilIi;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Exception decompiling
     */
    public static MethodHandle IIlllIlliIll(String var0, int var1_1, String var2_2, int var3_3, String var4_4, String var5_5, int var6_6, String var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [43[DOLOOP], 44[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IiIlliIliiIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0xEAD0982 | 0x5B4CD26D) - (0xEAD0982 & 0x5B4CD26D);
        IIIllIIliIIl = n2 + 1531761261 - (n2 & 0x5B4CD26D) * 2;
        if (729984285 <= IIIllIIliIIl) {
            throw null;
        }
        Object[] objectArray = new Object[17];
        objectArray[9] = MethodHandles.lookup();
        objectArray[0] = ((MethodHandles.Lookup)objectArray[9]).findStatic(IiIiliIiiiIi.class, "IIlllIlliIll", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[8] = methodType.parameterCount();
        objectArray[16] = iliIiiliiiii[92];
        objectArray[1] = (int)((Integer)objectArray[8]);
        objectArray[12] = ((Integer)objectArray[1] ^ (Integer)objectArray[16]) - 2 * (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[16]);
        objectArray[5] = methodType.dropParameterTypes((Integer)objectArray[12], (Integer)objectArray[8]);
        objectArray[7] = MethodHandles.invoker((MethodType)objectArray[5]);
        Class[] classArray = new Class[iliIiiliiiii[93]];
        classArray[IiIiliIiiiIi.iliIiiliiiii[94]] = MethodHandle.class;
        objectArray[15] = ((MethodType)objectArray[5]).appendParameterTypes(classArray);
        objectArray[16] = iliIiiliiiii[95];
        objectArray[1] = (int)((Integer)objectArray[12]);
        objectArray[10] = new int[((Integer)objectArray[1] ^ (Integer)objectArray[16]) + 2 * ((Integer)objectArray[1] & (Integer)objectArray[16])];
        ((int[])objectArray[10])[IiIiliIiiiIi.iliIiiliiiii[96]] = (Integer)objectArray[12];
        int n3 = (0xB70FEA25 | 0x5FC006AA) - (0xB70FEA25 & 0x5FC006AA);
        int cfr_ignored_0 = n3 + 1606420138;
        objectArray[4] = iliIiiliiiii[97];
        block12: while (true) {
            objectArray[16] = iliIiiliiiii[98];
            objectArray[1] = (int)((Integer)objectArray[12]);
            if ((Integer)objectArray[4] >= 2 * ((Integer)objectArray[1] | (Integer)objectArray[16]) - ((Integer)objectArray[1] ^ (Integer)objectArray[16])) break;
            int n4 = (0xAAF8272C | 0xE52BB863) - (0xAAF8272C & 0xE52BB863);
            int n5 = n4;
            switch (n5 + -450119581 - (n5 & 0xE52BB863) * 2) {
                default: {
                    objectArray[16] = iliIiiliiiii[99];
                    objectArray[1] = (int)((Integer)objectArray[4]);
                    ((int[])objectArray[10])[((Integer)objectArray[4]).intValue()] = ((Integer)objectArray[1] & ~((Integer)objectArray[16]).intValue()) - (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[16]);
                    objectArray[4] = (Integer)objectArray[4] + 1;
                    continue block12;
                }
                case 1607994145: 
            }
            break;
        }
        objectArray[6] = MethodHandles.permuteArguments((MethodHandle)objectArray[7], (MethodType)objectArray[15], (int[])objectArray[10]);
        int n6 = (0x4DE6DECF | 0xCE2B6412) - (0x4DE6DECF & 0xCE2B6412);
        int cfr_ignored_1 = n6 + -836017134;
        objectArray[3] = MethodHandles.collectArguments((MethodHandle)objectArray[6], (Integer)objectArray[12], (MethodHandle)objectArray[0]);
        int n7 = (0x952D0775 | 0xB516F011) - (0x952D0775 & 0xB516F011);
        int cfr_ignored_2 = n7 + -1256787951;
        return new ConstantCallSite((MethodHandle)objectArray[3]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDeath(PlayerDeathEvent playerDeathEvent) {
        Object[] objectArray = new Object[46];
        int n = (0x7D03BD94 | 0x972E677D) - (0x7D03BD94 & 0x972E677D);
        int cfr_ignored_0 = n + -1758566531;
        objectArray[19] = iliIiiliiiii[13];
        objectArray[9] = iliIiiliiiii[14];
        objectArray[20] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[20] | (Integer)objectArray[9]) - ((Integer)objectArray[20] ^ (Integer)objectArray[9]);
        objectArray[9] = iliIiiliiiii[15];
        objectArray[20] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[20] ^ (Integer)objectArray[9]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[9]);
        Object[] objectArray2 = new Object[((Integer)objectArray[19]).intValue()];
        objectArray[44] = iliIiiliiiii[16];
        objectArray[9] = iliIiiliiiii[17];
        objectArray[20] = (int)((Integer)objectArray[44]);
        objectArray[44] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[9]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[9]);
        objectArray[9] = iliIiiliiiii[18];
        objectArray[20] = (int)((Integer)objectArray[44]);
        objectArray[44] = (Integer)objectArray[20] + ~((Integer)objectArray[9]).intValue() + 1;
        objectArray2[((Integer)objectArray[44]).intValue()] = this;
        objectArray[42] = iliIiiliiiii[19];
        objectArray[9] = iliIiiliiiii[20];
        objectArray[20] = (int)((Integer)objectArray[42]);
        objectArray[42] = ((Integer)objectArray[20] ^ (Integer)objectArray[9]) - 2 * (~((Integer)objectArray[20]).intValue() & (Integer)objectArray[9]);
        objectArray[9] = iliIiiliiiii[21];
        objectArray[20] = (int)((Integer)objectArray[42]);
        objectArray[42] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[9]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[9]);
        objectArray2[((Integer)objectArray[42]).intValue()] = playerDeathEvent;
        IiIiliIiiiIi.IiIlliIliiIl("bf40ebba-476f-496d-9976-7bcb6679b5c8", (long)-223671487836005244L, (Object[])objectArray2, (String)"BQ5YBxEQBxpSUlcoKlMV7OwVG+Lv6u4t6e/m6ObjF+MmGebs9eLwA+H14w==", (int)iliIiiliiiii[22], (String)"QCM1JwYOFABfHQMRG1Q1GRIeHe8nVgrpEecTIuAW5O4nGOzl4eDyCg==", (int)iliIiiliiiii[23], (String)"dmY4T3o1", (String)"Gh4Y", (int)iliIiiliiiii[24], (String)"JB4dBAdfX1RVV1A8EB4/ExQVExc1Fizr6errDA3h4gDkJ+ME+Ab6+/z9/vzw8TQQ8fX29Mj298vp6ssBwO7PwOHC48fF2drYHtre3P3e39PR0tPU1ev3qMmqrqzNrq+gwaI=", (String)"cEVPT1Nj", (int)iliIiiliiiii[25]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        int n;
        int n2 = n = (0x4C16ECD1 | 0x42676EC4) - (0x4C16ECD1 & 0x42676EC4);
        IIIllIIliIIl = n2 + 1114074820 - (n2 & 0x42676EC4) * 2;
        if (2095214858 < IIIllIIliIIl) {
            n = (0xE2B008A | 0x42676EC4) - (0xE2B008A & 0x42676EC4);
        }
        Object[] objectArray = new Object[29];
        objectArray[13] = iliIiiliiiii[26];
        objectArray[25] = iliIiiliiiii[27];
        objectArray[1] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[1] | (Integer)objectArray[25]) & (~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[25]).intValue());
        objectArray[25] = iliIiiliiiii[28];
        objectArray[1] = (int)((Integer)objectArray[13]);
        objectArray[13] = 2 * ((Integer)objectArray[1] | (Integer)objectArray[25]) - ((Integer)objectArray[1] ^ (Integer)objectArray[25]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[15] = iliIiiliiiii[29];
        objectArray[25] = iliIiiliiiii[30];
        objectArray[1] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[1] + ~((Integer)objectArray[25]).intValue() + 1;
        objectArray[25] = iliIiiliiiii[31];
        objectArray[1] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[1] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[1] ^ (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[19] = iliIiiliiiii[32];
        objectArray[25] = iliIiiliiiii[33];
        objectArray[1] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[1] | (Integer)objectArray[25]) - ((Integer)objectArray[1] & (Integer)objectArray[25]);
        objectArray[25] = iliIiiliiiii[34];
        objectArray[1] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[1] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[1] ^ (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[19]).intValue()] = playerQuitEvent;
        IiIiliIiiiIi.IiIlliIliiIl("063aa6fc-69df-483f-abb9-2ffa52130662", (long)-56372567405755716L, (Object[])objectArray2, (String)"Bg1bBBITBBlRUVQrKVAW7+8WGOHs6e0u6uzl6+XgFOAlGuXv9uHzAOL24A==", (int)iliIiiliiiii[35], (String)"QyA2JAUNFwNcHgASGFc2GhEdHuwkVQnqEuQQIeMV5+0kG+/m4uPxCQ==", (int)iliIiiliiiii[36], (String)"bmx2S0ZL", (String)"GR0b", (int)iliIiiliiiii[37], (String)"Jx0eBwRcXFdWVFM/Ex08EBcWEBQ2FS/o6unoDw7i4QPnJOAH+wX5+P/+/f/z8jcT8vb198v19Mjq6cgCw+3Mw+LB4MTG2tnbHdnd3/7d3NDS0dDX1uj0q8qpra/OrayjwqE=", (String)"VmJTSE1H", (int)iliIiiliiiii[38]);
    }

    /*
     * Exception decompiling
     */
    public static Class IIIllIIliIIl(String var0) {
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
    public static void Iilllilliill() {
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
     * Enabled aggressive block sorting
     */
    private boolean isDupeBlocked(UUID uUID, UUID uUID2) {
        if (IlIlllIlilIl) {
            int n = (0x1F38258 | 0xBB4B214D) - (0x1F38258 & 0xBB4B214D);
        }
        Object[] objectArray = new Object[31];
        objectArray[10] = iliIiiliiiii[61];
        objectArray[28] = iliIiiliiiii[62];
        objectArray[8] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[8] ^ (Integer)objectArray[28]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[63];
        objectArray[8] = (int)((Integer)objectArray[10]);
        objectArray[10] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[28]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[28]);
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[20] = iliIiiliiiii[64];
        objectArray[28] = iliIiiliiiii[65];
        objectArray[8] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[8] - ~((Integer)objectArray[28]).intValue() - 1;
        objectArray[28] = iliIiiliiiii[66];
        objectArray[8] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[8] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[8]).intValue() & (Integer)objectArray[28];
        objectArray2[((Integer)objectArray[20]).intValue()] = this;
        objectArray[15] = iliIiiliiiii[67];
        objectArray[28] = iliIiiliiiii[68];
        objectArray[8] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[28]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[69];
        objectArray[8] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[8] | (Integer)objectArray[28]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[28]).intValue());
        objectArray2[((Integer)objectArray[15]).intValue()] = uUID;
        objectArray[18] = iliIiiliiiii[70];
        objectArray[28] = iliIiiliiiii[71];
        objectArray[8] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[8] ^ (Integer)objectArray[28]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[72];
        objectArray[8] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[8] - ~((Integer)objectArray[28]).intValue() - 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = uUID2;
        return (boolean)IiIiliIiiiIi.IiIlliIliiIl("1d817940-8feb-411d-a875-72b26ef836df", (Object)IiIiliIiiiIi.IiIlliIliiIl("2cb95388-3f02-49f9-b787-7d581522205c", (long)256799383427946874L, (Object[])objectArray2, (String)"AAtdAhQVAh9XV1ItL1YQ6ekQHufq7+so7Orj7ePmEuYjHOPp8Of1BuTw5g==", (int)iliIiiliiiii[73], (String)"RSYwIgMLEQVaGAYUHlEwHBcbGOoiUw/sFOIWJ+UT4esiHeng5OX3Dw==", (int)iliIiiliiiii[74], (String)"bGRvZWhn", (String)"Hxsd", (int)iliIiiliiiii[75], (String)"IRsYAQJaWlFQUlU5FRs6FhEQFhIwEynu7O/uCQjk5wXhIuYB/QP//vn4+/n19DEV9PDz8c3z8s7s784ExevKxeTH5sLA3N/dG9/b2fjb2tbU19bR0O7yrcyvq6nIq6qlxKc=", (String)"WmNHdGVt", (int)iliIiiliiiii[76]), (String)"AQpcAxUUAx5WVlMsLlcR6OgRH+br7uop7evi7OLnE+ciHeLo8eb0B+Xx5w==", (int)iliIiiliiiii[77], (String)"RCEACBYKWR8FGx1WNwMUGB/pIVAx", (int)iliIiiliiiii[78], (String)"TnlENmJh", (String)"GBwnHRQ=", (int)iliIiiliiiii[79], (String)"IBoZAANbW1BRU1Q4FBo7FxARFxMxEijv7e7vCAnl5gTgI+cA/AL+//j5+vj09TAU9fHy8Mzy88/t7s8FxOrLxOXG58PB3d7cGt7a2Pna29fV1tfQ0e/zrM2uqqjJqqukxaY=", (String)"Yk81Q3BZ", (int)iliIiiliiiii[80]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IiIiliIiiiIi(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi) {
        if (IlIlllIlilIl) {
            int n;
            int n2 = n = (0x5A | 0x993EC573) - (0x5A & 0x993EC573);
            int cfr_ignored_0 = n2 + -1723939469 - (n2 & 0x993EC573) * 2;
        }
        Object[] objectArray = new Object[28];
        objectArray[25] = iliIiiliiiii[0];
        objectArray[7] = iliIiiliiiii[1];
        objectArray[1] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[1] ^ (Integer)objectArray[7]) + 2 * ((Integer)objectArray[1] & (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[2];
        objectArray[1] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[1] | (Integer)objectArray[7]) - ((Integer)objectArray[1] ^ (Integer)objectArray[7]);
        Object[] objectArray2 = new Object[((Integer)objectArray[25]).intValue()];
        objectArray[23] = iliIiiliiiii[3];
        objectArray[7] = iliIiiliiiii[4];
        objectArray[1] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[1] | (Integer)objectArray[7]) - ((Integer)objectArray[1] & (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[5];
        objectArray[1] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[1] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        objectArray[20] = iliIiiliiiii[6];
        objectArray[7] = iliIiiliiiii[7];
        objectArray[1] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[1] + ~((Integer)objectArray[7]).intValue() + 1;
        objectArray[7] = iliIiiliiiii[8];
        objectArray[1] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[1] & ~((Integer)objectArray[7]).intValue()) - (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[20]).intValue()] = iliIlllilIi;
        IiIiliIiiiIi.IiIlliIliiIl("22284728-b88b-4fc8-963f-94f5a018a19c", (long)8118043624712629460L, (Object[])objectArray2, (String)"BA9ZBhARBhtTU1YpK1IU7e0UGuPu6+8s6O7n6efiFuInGOft9OPxAuD04g==", (int)iliIiiliiiii[9], (String)"QSI0JgcPFQFeHAIQGlU0GBMfHO4mVwvoEOYSI+EX5e8mGe3k4OHzCw==", (int)iliIiiliiiii[10], (String)"eWZPZWRo", (String)"Gx8Z", (int)iliIiiliiiii[11], (String)"JR8cBQZeXlVUVlE9ER8+EhUUEhY0Fy3q6OvqDQzg4wHlJuIF+Qf7+v38//3x8DUR8PT39cn39sro68oAwe/OweDD4sbE2NvZH9vf3fzf3tLQ09LV1Or2qcirr63Mr66hwKM=", (String)"OG5lM1Zu", (int)iliIiiliiiii[12]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x5D3DA9B7 | 0x11D070C8) - (0x5D3DA9B7 & 0x11D070C8);
        if (1224963365 >= n2 + 298873032 - (n2 & 0x11D070C8) * 2) {
            throw new InterruptedIOException();
        }
        Object[] objectArray = new Object[26];
        IiIiliIiiiIi.Iilllilliill();
        IiIiliIiiiIi.IiIlliIliiIl("6c735389-8160-44eb-a267-1690a021fe25", IiIiliIiiiIi.class, (String)"AglfABYXAB1VVVAvLVQS6+sSHOXo7ekq7ujh7+HkEOQhHuHr8uX3BOby5A==", (int)iliIiiliiiii[81], (String)"RyIDCxUJWhwGGB5VIBYA7ewjVAY=", (int)iliIiiliiiii[82], (String)"RWZWRU42", (String)"Ax8MCDUd", (int)iliIiiliiiii[83], (String)"IxkaAwBYWFNSUFc7Fxk4FBMSFBAyESvs7u3sCwrm5QfjIOQD/wH9/Pv6+fv39jMX9vLx88/x8Mzu7cwGx+nIx+bF5MDC3t3fGd3Z2/rZ2NTW1dTT0uzwr86tqavKqainxqU=", (String)"TDFDQzJP", (int)iliIiiliiiii[84]);
        int n3 = (0xD9B26B3E | 0xB68F53AD) - (0xD9B26B3E & 0xB68F53AD);
        int cfr_ignored_0 = n3 + -1232120915;
        objectArray[16] = iliIiiliiiii[85];
        objectArray[7] = iliIiiliiiii[86];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[14] & ~((Integer)objectArray[7]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[87];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[14] + ~((Integer)objectArray[7]).intValue() + 1;
        IiIiliIiiiIi.IiIlliIliiIl("c4faca11-2e35-4d20-ba00-533365ae3cc1", (long)-6132448798355574700L, (Object[])new Object[((Integer)objectArray[16]).intValue()], (String)"AwheARcWARxUVFEuLFUT6uoTHeTp7Ogr7+ng7uDlEeUgH+Dq8+T2Befz5Q==", (int)iliIiiliiiii[88], (String)"RiUzIQAIEgZZGwUXHVIzHxQYG+khUAzvF+EVJOYQ4ughHurj5+b0DA==", (int)iliIiiliiiii[89], (String)"aDNTQmxi", (String)"HBge", (int)iliIiiliiiii[90], (String)"IhgbAgFZWVJTUVY6Fhg5FRITFREzECrt7+ztCgvn5AbiIeUC/gD8/fr7+Pr29zIW9/Pw8s7w8c3v7M0HxujJxufE5cHD39zeGNzY2vvY2dXX1NXS0+3xrs+sqKrLqKmmx6Q=", (String)"UjJLRDZz", (int)iliIiiliiiii[91]);
        int n4 = (0x3FA6879F | 0xC749AB9C) - (0x3FA6879F & 0xC749AB9C);
        int cfr_ignored_1 = n4 + -951473252;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String Illlllllilll(String string, int n, int n2) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 0x34 & 1;
        }
        Object[] objectArray = new Object[6];
        objectArray[1] = Base64.getDecoder().decode(string);
        objectArray[5] = iliIiiliiiii[123];
        while ((Integer)objectArray[5] < ((byte[])objectArray[1]).length) {
            byte[] byArray = (byte[])objectArray[1];
            int n3 = (Integer)objectArray[5];
            objectArray[3] = n;
            objectArray[4] = (int)byArray[n3];
            objectArray[3] = n2;
            objectArray[4] = (Integer)objectArray[4] & ~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[3];
            objectArray[3] = (int)((Integer)objectArray[5]);
            objectArray[4] = ((Integer)objectArray[4] | (Integer)objectArray[3]) - ((Integer)objectArray[4] & (Integer)objectArray[3]);
            byArray[n3] = (byte)((Integer)objectArray[4] + ~((Integer)objectArray[3]).intValue() + 1);
            objectArray[5] = (Integer)objectArray[5] + 1;
            int n4 = (0x84C79C41 | 0x21AFEBEA) - (0x84C79C41 & 0x21AFEBEA);
            int cfr_ignored_1 = n4 + 565177322;
        }
        try {
            return new String((byte[])objectArray[1], StandardCharsets.UTF_8);
        }
        catch (IllegalAccessError illegalAccessError) {
            throw illegalAccessError;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void applyBillCollectorTax(Player player, Player player2, IliIlllilIi iliIlllilIi, IliIlllilIi iliIlllilIi2) {
        Object[] objectArray = new Object[50];
        int n = (0x45FBBD9B | 0xD25C7CCA) - (0x45FBBD9B & 0xD25C7CCA);
        int cfr_ignored_0 = n + -765690678;
        objectArray[17] = iliIiiliiiii[39];
        objectArray[47] = iliIiiliiiii[40];
        objectArray[43] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[43] | (Integer)objectArray[47]) & ~((Integer)objectArray[43] & (Integer)objectArray[47]);
        objectArray[47] = iliIiiliiiii[41];
        objectArray[43] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[43] - ~((Integer)objectArray[47]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[15] = iliIiiliiiii[42];
        objectArray[47] = iliIiiliiiii[43];
        objectArray[43] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[43] & ~((Integer)objectArray[47]).intValue()) - ((Integer)objectArray[43] ^ (Integer)objectArray[47]);
        objectArray[47] = iliIiiliiiii[44];
        objectArray[43] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[43] | (Integer)objectArray[47]) + ((Integer)objectArray[43] & (Integer)objectArray[47]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[1] = iliIiiliiiii[45];
        objectArray[47] = iliIiiliiiii[46];
        objectArray[43] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[43] | (Integer)objectArray[47]) & (~((Integer)objectArray[43]).intValue() | ~((Integer)objectArray[47]).intValue());
        objectArray[47] = iliIiiliiiii[47];
        objectArray[43] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[43] ^ (Integer)objectArray[47]) + 2 * ((Integer)objectArray[43] & (Integer)objectArray[47]);
        objectArray2[((Integer)objectArray[1]).intValue()] = player;
        objectArray[8] = iliIiiliiiii[48];
        objectArray[47] = iliIiiliiiii[49];
        objectArray[43] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[43] | (Integer)objectArray[47]) - ((Integer)objectArray[43] & (Integer)objectArray[47]);
        objectArray[47] = iliIiiliiiii[50];
        objectArray[43] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[43] | (Integer)objectArray[47]) & (~((Integer)objectArray[43]).intValue() | ~((Integer)objectArray[47]).intValue());
        objectArray2[((Integer)objectArray[8]).intValue()] = player2;
        objectArray[39] = iliIiiliiiii[51];
        objectArray[47] = iliIiiliiiii[52];
        objectArray[43] = (int)((Integer)objectArray[39]);
        objectArray[39] = ((Integer)objectArray[43] | (Integer)objectArray[47]) & (~((Integer)objectArray[43]).intValue() | ~((Integer)objectArray[47]).intValue());
        objectArray[47] = iliIiiliiiii[53];
        objectArray[43] = (int)((Integer)objectArray[39]);
        objectArray[39] = ((Integer)objectArray[43] | (Integer)objectArray[47]) + ((Integer)objectArray[43] & (Integer)objectArray[47]);
        objectArray2[((Integer)objectArray[39]).intValue()] = iliIlllilIi;
        objectArray[32] = iliIiiliiiii[54];
        objectArray[47] = iliIiiliiiii[55];
        objectArray[43] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[43] & ~((Integer)objectArray[47]).intValue() | ~((Integer)objectArray[43]).intValue() & (Integer)objectArray[47];
        objectArray[47] = iliIiiliiiii[56];
        objectArray[43] = (int)((Integer)objectArray[32]);
        objectArray[32] = ((Integer)objectArray[43] | (Integer)objectArray[47]) & (~((Integer)objectArray[43]).intValue() | ~((Integer)objectArray[47]).intValue());
        objectArray2[((Integer)objectArray[32]).intValue()] = iliIlllilIi2;
        IiIiliIiiiIi.IiIlliIliiIl("c61f2ebe-2a84-413c-a341-420c78e66472", (long)6000438715862083090L, (Object[])objectArray2, (String)"BwxaBRMSBRhQUFUqKFEX7u4XGeDt6Owv6+3k6uThFeEkG+Tu9+DyAeP34Q==", (int)iliIiiliiiii[57], (String)"QiE3JQQMFgJdHwETGVY3GxAcH+0lVAjrE+URIOIU5uwlGu7n4+LwCA==", (int)iliIiiliiiii[58], (String)"OURCeXh3", (String)"GBwa", (int)iliIiiliiiii[59], (String)"JhwfBgVdXVZXVVI+Ehw9ERYXERU3FC7p6+jpDg/j4ALmJeEG+gT4+f7//P7y8zYS8/f09sr09cnr6MkDwuzNwuPA4cXH29jaHNjc3v/c3dHT0NHW1+n1qsuorK7PrK2iw6A=", (String)"elBaTWlX", (int)iliIiiliiiii[60]);
    }

    /*
     * Exception decompiling
     */
    public static String IlIlllIlilIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [24[CASE], 58[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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

