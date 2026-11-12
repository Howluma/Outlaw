/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class IIlllIlliIll
implements Listener {
    public static int[] lIiiIiIlilli;
    private static int IliIlllilIi;
    public IliIlllilIi liiiIIllIl;
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    private void consumeOneFromHand(ItemStack itemStack, Player player) {
        Object[] objectArray = new Object[30];
        objectArray[1] = lIiiIiIlilli[39];
        objectArray[6] = lIiiIiIlilli[40];
        objectArray[18] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[18] | (Integer)objectArray[6]) & ~((Integer)objectArray[18] & (Integer)objectArray[6]);
        objectArray[6] = lIiiIiIlilli[41];
        objectArray[18] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[18] + ~((Integer)objectArray[6]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[1]).intValue()];
        objectArray[8] = lIiiIiIlilli[42];
        objectArray[6] = lIiiIiIlilli[43];
        objectArray[18] = (int)((Integer)objectArray[8]);
        objectArray[8] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[6]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[6]);
        objectArray[6] = lIiiIiIlilli[44];
        objectArray[18] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[18] & ~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[18]).intValue() & (Integer)objectArray[6];
        objectArray2[((Integer)objectArray[8]).intValue()] = this;
        objectArray[5] = lIiiIiIlilli[45];
        objectArray[6] = lIiiIiIlilli[46];
        objectArray[18] = (int)((Integer)objectArray[5]);
        objectArray[5] = 2 * ((Integer)objectArray[18] | (Integer)objectArray[6]) - ((Integer)objectArray[18] ^ (Integer)objectArray[6]);
        objectArray[6] = lIiiIiIlilli[47];
        objectArray[18] = (int)((Integer)objectArray[5]);
        objectArray[5] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[6]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[5]).intValue()] = itemStack;
        objectArray[11] = lIiiIiIlilli[48];
        objectArray[6] = lIiiIiIlilli[49];
        objectArray[18] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[18] - ~((Integer)objectArray[6]).intValue() - 1;
        objectArray[6] = lIiiIiIlilli[50];
        objectArray[18] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[18] ^ (Integer)objectArray[6]) + 2 * ((Integer)objectArray[18] & (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        IIlllIlliIll.IlIlllIlilIl("b6b43b5d-d161-4a2f-9aa6-2eecbc01e32e", (long)-1834692844390709184L, (Object[])objectArray2, (String)"UmtmNFhT", (String)"bmYtEghwamgxT0g2NS1sCwlvYnRwEw0tam13Gw9tYm8tLhFiemZxOhx3Yg==", (int)lIiiIiIlilli[51], (int)lIiiIiIlilli[52], (int)lIiiIiIlilli[53], (String)"K0lYMhdidWIsEhxtZCxMHBdmYHc4VzFpYnViURFibWQsMR9pZmB3RQ==", (String)"VjV0SzVo", (String)"T3ZwFxYxMjY2SFNKb2pKEhFvam9KF1NvampqNzRvb0pvUBRKb0pvEhFvb2pvElNKam9vFxFqam9KNxQtb0pqFzRqSm9qEhFqLWpvFzRqam9qFxRqai1KNxFvb0pvEhRKb28=", (String)"WFUxdlQ0", (String)"cXZt");
    }

    /*
     * Exception decompiling
     */
    public static Class iliIiiliiiii(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [34[UNCONDITIONALDOLOOP], 10[CASE]], but top level block is 0[TRYBLOCK]
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
    public void onInteract(PlayerInteractEvent playerInteractEvent) {
        if (IIIllIIliIIl) {
            throw new IllegalArgumentException();
        }
        Object[] objectArray = new Object[62];
        objectArray[46] = lIiiIiIlilli[12];
        objectArray[5] = lIiiIiIlilli[13];
        objectArray[19] = (int)((Integer)objectArray[46]);
        objectArray[46] = ((Integer)objectArray[19] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = lIiiIiIlilli[14];
        objectArray[19] = (int)((Integer)objectArray[46]);
        objectArray[46] = (Integer)objectArray[19] + ~((Integer)objectArray[5]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[46]).intValue()];
        objectArray[20] = lIiiIiIlilli[15];
        objectArray[5] = lIiiIiIlilli[16];
        objectArray[19] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[19] & ~((Integer)objectArray[5]).intValue()) - (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = lIiiIiIlilli[17];
        objectArray[19] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[19] | (Integer)objectArray[5]) & (~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[5]).intValue());
        objectArray2[((Integer)objectArray[20]).intValue()] = this;
        objectArray[39] = lIiiIiIlilli[18];
        objectArray[5] = lIiiIiIlilli[19];
        objectArray[19] = (int)((Integer)objectArray[39]);
        objectArray[39] = (Integer)objectArray[19] - ~((Integer)objectArray[5]).intValue() - 1;
        objectArray[5] = lIiiIiIlilli[20];
        objectArray[19] = (int)((Integer)objectArray[39]);
        objectArray[39] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[39]).intValue()] = playerInteractEvent;
        IIlllIlliIll.IlIlllIlilIl("e9ededcc-bef1-4cc6-b01b-22c56d170a5e", (long)8160443414924982418L, (Object[])objectArray2, (String)"UG9WS1lJ", (String)"bGQvEgpyaGozT0o0Ny9uCwttYHZyEw8vaG91Gw1vYG0vLhNgeGRzOh51YA==", (int)lIiiIiIlilli[21], (int)lIiiIiIlilli[22], (int)lIiiIiIlilli[23], (String)"KUtaMhVgd2AuEh5vZi5OHBVkYnU6VzNrYHdgURNgb2YuMR1rZGJ1RQ==", (String)"WjBrQ3hy", (String)"TXRyFxQzMDQ0SFFIbWhIEhNtaG1IF1FtaGhoNzZtbUhtUBZIbUhtEhNtbWhtElFIaG1tFxNoaG1INxYvbUhoFzZoSG1oEhNoL2htFzZoaG1oFxZoaC9INxNtbUhtEhZIbW0=", (String)"d3ZsMUNr", (String)"c3Rv");
        int n = (0x3E965421 | 0x32D5D40F) - (0x3E965421 & 0x32D5D40F);
        int cfr_ignored_0 = n + 852874255;
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IiIlliIliiIl(String var0, String var1_1, int var2_2, int var3_3, int var4_4, String var5_5, String var6_6, String var7_7, String var8_8, String var9_9) {
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IlIlllIlilIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 0x5A & 1;
        }
        Object[] objectArray = new Object[17];
        objectArray[11] = MethodHandles.lookup();
        objectArray[2] = ((MethodHandles.Lookup)objectArray[11]).findStatic(IIlllIlliIll.class, "IiIlliIliiIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[0] = methodType.parameterCount();
        objectArray[13] = lIiiIiIlilli[75];
        objectArray[6] = (int)((Integer)objectArray[0]);
        objectArray[14] = (Integer)objectArray[6] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[5] = methodType.dropParameterTypes((Integer)objectArray[14], (Integer)objectArray[0]);
        int n = (0xF3A97BC3 | 0x8AA2234D) - (0xF3A97BC3 & 0x8AA2234D);
        int cfr_ignored_1 = n + -1969085619;
        objectArray[16] = MethodHandles.invoker((MethodType)objectArray[5]);
        Class[] classArray = new Class[lIiiIiIlilli[76]];
        classArray[IIlllIlliIll.lIiiIiIlilli[77]] = MethodHandle.class;
        objectArray[9] = ((MethodType)objectArray[5]).appendParameterTypes(classArray);
        objectArray[13] = lIiiIiIlilli[78];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[8] = new int[((Integer)objectArray[6] | (Integer)objectArray[13]) + ((Integer)objectArray[6] & (Integer)objectArray[13])];
        ((int[])objectArray[8])[IIlllIlliIll.lIiiIiIlilli[79]] = (Integer)objectArray[14];
        int n2 = (0xBE383C72 | 0xCF1F2A46) - (0xBE383C72 & 0xCF1F2A46);
        int cfr_ignored_2 = n2 + -820041146;
        objectArray[7] = lIiiIiIlilli[80];
        while (true) {
            objectArray[13] = lIiiIiIlilli[81];
            objectArray[6] = (int)((Integer)objectArray[14]);
            if ((Integer)objectArray[7] >= ((Integer)objectArray[6] ^ (Integer)objectArray[13]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[13])) {
                objectArray[3] = MethodHandles.permuteArguments((MethodHandle)objectArray[16], (MethodType)objectArray[9], (int[])objectArray[8]);
                objectArray[4] = MethodHandles.collectArguments((MethodHandle)objectArray[3], (Integer)objectArray[14], (MethodHandle)objectArray[2]);
                int n3 = (0x9910E182 | 0xC23FDF37) - (0x9910E182 & 0xC23FDF37);
                int cfr_ignored_3 = n3 + -1036001481;
                return new ConstantCallSite((MethodHandle)objectArray[4]);
            }
            int n4 = (0x5B83916C | 0x8428BD63) - (0x5B83916C & 0x8428BD63);
            int cfr_ignored_4 = n4 + -2077704861;
            objectArray[13] = lIiiIiIlilli[82];
            objectArray[6] = (int)((Integer)objectArray[7]);
            ((int[])objectArray[8])[((Integer)objectArray[7]).intValue()] = (Integer)objectArray[6] + ~((Integer)objectArray[13]).intValue() + 1;
            objectArray[7] = (Integer)objectArray[7] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$playEquipEffect$0(Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IIlllIlliIll iIlllIlliIll, ItemMeta itemMeta) {
        int n;
        int n2 = n = (0x6C84DD2D | 0xBD71D24) - (0x6C84DD2D & 0xBD71D24);
        if (1307982667 >= n2 + 198647076 - (n2 & 0xBD71D24) * 2) {
            int n3 = n = (0xC8B5C1F1 | 0xBD71D24) - (0xC8B5C1F1 & 0xBD71D24);
            iliIiiliiiii = n3 + 198647076 - (n3 & 0xBD71D24) * 2;
        }
        Object[] objectArray = new Object[29];
        objectArray[26] = lIiiIiIlilli[54];
        objectArray[24] = lIiiIiIlilli[55];
        objectArray[20] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[24]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[24]);
        objectArray[24] = lIiiIiIlilli[56];
        objectArray[20] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[20] | (Integer)objectArray[24]) & (~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[24]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[14] = lIiiIiIlilli[57];
        objectArray[24] = lIiiIiIlilli[58];
        objectArray[20] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[20] | (Integer)objectArray[24]) & ~((Integer)objectArray[20] & (Integer)objectArray[24]);
        objectArray[24] = lIiiIiIlilli[59];
        objectArray[20] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[24]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[14]).intValue()] = iIlllIlliIll;
        objectArray[12] = lIiiIiIlilli[60];
        objectArray[24] = lIiiIiIlilli[61];
        objectArray[20] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[20] - ~((Integer)objectArray[24]).intValue() - 1;
        objectArray[24] = lIiiIiIlilli[62];
        objectArray[20] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[20] & ~((Integer)objectArray[24]).intValue()) - (~((Integer)objectArray[20]).intValue() & (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[12]).intValue()] = itemMeta;
        IIlllIlliIll.IlIlllIlilIl("225295cf-6271-4cb6-a07f-f085be073c3a", (long)6059945992053657208L, (Object[])objectArray2, (String)"eEEyWXRY", (String)"aWEqEg93bW82T08xMiprCw5oZXN3EwoqbWpwGwhqZWgqLhZlfWF2OhtwZQ==", (int)lIiiIiIlilli[63], (int)lIiiIiIlilli[64], (int)lIiiIiIlilli[65], (String)"LE5fMhBlcmUrEhtqYytLHBBhZ3A/VzZuZXJlURZlamMrMRhuYWdwRQ==", (String)"aEZRV0RU", (String)"SHF3FxE2NTExSFRNaG1NEhZobWhNF1RobW1tNzNoaE1oUBNNaE1oEhZoaG1oElRNbWhoFxZtbWhNNxMqaE1tFzNtTWhtEhZtKm1oFzNtbWhtFxNtbSpNNxZoaE1oEhNNaGg=", (String)"ZXl5d3Az", (String)"dnFq");
    }

    public IIlllIlliIll(IliIlllilIi iliIlllilIi) {
        Object[] objectArray = new Object[28];
        objectArray[12] = lIiiIiIlilli[0];
        objectArray[18] = lIiiIiIlilli[1];
        objectArray[5] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[2];
        objectArray[5] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[5] | (Integer)objectArray[18]) + ((Integer)objectArray[5] & (Integer)objectArray[18]);
        Object[] objectArray2 = new Object[((Integer)objectArray[12]).intValue()];
        objectArray[1] = lIiiIiIlilli[3];
        objectArray[18] = lIiiIiIlilli[4];
        objectArray[5] = (int)((Integer)objectArray[1]);
        objectArray[1] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[18]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[5];
        objectArray[5] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[1]).intValue()] = this;
        objectArray[7] = lIiiIiIlilli[6];
        objectArray[18] = lIiiIiIlilli[7];
        objectArray[5] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[5] | (Integer)objectArray[18]) + ((Integer)objectArray[5] & (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[8];
        objectArray[5] = (int)((Integer)objectArray[7]);
        objectArray[7] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[7]).intValue()] = iliIlllilIi;
        IIlllIlliIll.IlIlllIlilIl("fc81f0cf-2344-49c1-be6d-551fbd52c914", (long)-5731534030787597642L, (Object[])objectArray2, (String)"czc4N2Ft", (String)"bWUuEgtzaWsyT0s1Ni5vCwpsYXdzEw4uaW50GwxuYWwuLhJheWVyOh90YQ==", (int)lIiiIiIlilli[9], (int)lIiiIiIlilli[10], (int)lIiiIiIlilli[11], (String)"KEpbMhRhdmEvEh9uZy9PHBRlY3Q7VzJqYXZhURJhbmcvMRxqZWN0RQ==", (String)"N0ZnbWNw", (String)"THVzFxUyMTU1SFBJbGlJEhJsaWxJF1BsaWlpNzdsbElsUBdJbElsEhJsbGlsElBJaWxsFxJpaWxJNxcubElpFzdpSWxpEhJpLmlsFzdpaWxpFxdpaS5JNxJsbElsEhdJbGw=", (String)"eFpmUkxU", (String)"cnVu");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void playEquipEffect(Player player, Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IIlllIlliIll iIlllIlliIll) {
        int n;
        int n2 = n = (0x75DF7BEC | 0xCBEEBE09) - (0x75DF7BEC & 0xCBEEBE09);
        if (1969227979 >= n2 + -873546231 - (n2 & 0xCBEEBE09) * 2) {
            int cfr_ignored_0 = 87 + 3;
        }
        Object[] objectArray = new Object[33];
        objectArray[22] = lIiiIiIlilli[24];
        objectArray[31] = lIiiIiIlilli[25];
        objectArray[0] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[0] & ~((Integer)objectArray[31]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[31];
        objectArray[31] = lIiiIiIlilli[26];
        objectArray[0] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[0] & ~((Integer)objectArray[31]).intValue()) - (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[31]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[1] = lIiiIiIlilli[27];
        objectArray[31] = lIiiIiIlilli[28];
        objectArray[0] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[0] & ~((Integer)objectArray[31]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[31];
        objectArray[31] = lIiiIiIlilli[29];
        objectArray[0] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[0] - ~((Integer)objectArray[31]).intValue() - 1;
        objectArray2[((Integer)objectArray[1]).intValue()] = this;
        objectArray[29] = lIiiIiIlilli[30];
        objectArray[31] = lIiiIiIlilli[31];
        objectArray[0] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[0] & ~((Integer)objectArray[31]).intValue()) - (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[31]);
        objectArray[31] = lIiiIiIlilli[32];
        objectArray[0] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[0] & ~((Integer)objectArray[31]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[31];
        objectArray2[((Integer)objectArray[29]).intValue()] = player;
        objectArray[28] = lIiiIiIlilli[33];
        objectArray[31] = lIiiIiIlilli[34];
        objectArray[0] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[0] ^ (Integer)objectArray[31]) + 2 * ((Integer)objectArray[0] & (Integer)objectArray[31]);
        objectArray[31] = lIiiIiIlilli[35];
        objectArray[0] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[0] | (Integer)objectArray[31]) + ((Integer)objectArray[0] & (Integer)objectArray[31]);
        objectArray2[((Integer)objectArray[28]).intValue()] = iIlllIlliIll;
        IIlllIlliIll.IlIlllIlilIl("79d11ab2-2493-4f44-a5cf-c8a0efc98d70", (long)341029729142973402L, (Object[])objectArray2, (String)"S2Y1eG11", (String)"b2csEglxa2kwT0k3NCxtCwhuY3VxEwwsa2x2Gw5sY24sLhBje2dwOh12Yw==", (int)lIiiIiIlilli[36], (int)lIiiIiIlilli[37], (int)lIiiIiIlilli[38], (String)"KkhZMhZjdGMtEh1sZS1NHBZnYXY5VzBoY3RjURBjbGUtMR5oZ2F2RQ==", (String)"NnZZSWpt", (String)"TndxFxcwMzc3SFJLbmtLEhBua25LF1Jua2trNzVubktuUBVLbktuEhBubmtuElJLa25uFxBra25LNxUsbktrFzVrS25rEhBrLGtuFzVra25rFxVrayxLNxBubktuEhVLbm4=", (String)"MzF0clpF", (String)"cHds");
    }

    /*
     * Exception decompiling
     */
    public static void Illlllllilll() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static String IIIllIIliIIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[CASE]], but top level block is 0[TRYBLOCK]
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
    static {
        if (IIIllIIliIIl) {
            int n;
            int n2 = n = (0xFE17974A | 0xE768B926) - (0xFE17974A & 0xE768B926);
            iliIiiliiiii = n2 + -412567258 - (n2 & 0xE768B926) * 2;
        }
        Object[] objectArray = new Object[11];
        int n = (0x7AFCC7AE | 0x28FD94F6) - (0x7AFCC7AE & 0x28FD94F6);
        block4: while (true) {
            int n3 = n;
            switch (n3 + 687707382 - (n3 & 0x28FD94F6) * 2) {
                default: {
                    IIlllIlliIll.Illlllllilll();
                    n = (0x11C41421 | 0x28FD94F6) - (0x11C41421 & 0x28FD94F6);
                    continue block4;
                }
                case 298062881: 
            }
            break;
        }
        objectArray[4] = lIiiIiIlilli[66];
        objectArray[10] = lIiiIiIlilli[67];
        objectArray[0] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[0] | (Integer)objectArray[10]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[10]).intValue());
        objectArray[10] = lIiiIiIlilli[68];
        objectArray[0] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[0] | (Integer)objectArray[10]) - ((Integer)objectArray[0] & (Integer)objectArray[10]);
        int n4 = (0x2770294F | 0xA87884BA) - (0x2770294F & 0xA87884BA);
        int cfr_ignored_0 = n4 + -1468496710;
        IIlllIlliIll.IlIlllIlilIl("ee3b9ebb-1cfe-4f4f-8dcf-8eba5c3ea72d", (int)((Integer)objectArray[4]), (String)"S09Obnhv", (String)"SnN1FxM0NzMzSFZPam9PEhRqb2pPF1Zqb29vNzFqak9qUBFPak9qEhRqam9qElZPb2pqFxRvb2pPNxEoak9vFzFvT2pvEhRvKG9qFzFvb2pvFxFvbyhPNxRqak9qEhFPamo=", (int)lIiiIiIlilli[69], (int)lIiiIiIlilli[70], (int)lIiiIiIlilli[71], (String)"Tw==", (String)"S0w2bEg1", (String)"SnN1FxM0NzMzSFZPam9PEhRqb2pPF1Zqb29vNzFqak9qUBFPak9qEhRqam9qElZPb2pqFxRvb2pPNxEoak9vFzFvT2pvEhRvKG9qFzFvb2pvFxFvbyhPNxRqak9qEhFPamo=", (String)"Z09DN21n", (String)"T2pvNxRqam9qNxE=");
        IIlllIlliIll.IlIlllIlilIl("f210511b-d93b-4413-802d-8292faf568d7", IIlllIlliIll.class, (String)"bDRlN3NI", (String)"aGArEg52bG43T04wMytqCw9pZHJ2EwsrbGtxGwlrZGkrLhdkfGB3OhpxZA==", (int)lIiiIiIlilli[72], (int)lIiiIiIlilli[73], (int)lIiiIiIlilli[74], (String)"LUlvHw1kKmlkEBwqRmlkDQg+LFM=", (String)"RlE5aGoy", (String)"SXB2FxA3NDAwSFVMaWxMEhdpbGlMF1VpbGxsNzJpaUxpUBJMaUxpEhdpaWxpElVMbGlpFxdsbGlMNxIraUxsFzJsTGlsEhdsK2xpFzJsbGlsFxJsbCtMNxdpaUxpEhJMaWk=", (String)"NUZubm92", (String)"aWpkGi1o");
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIlllIlliIll(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x17C2A9D5 | 0x1E104148) - (0x17C2A9D5 & 0x1E104148);
        if (11546206 >= n4 + 504381768 - (n4 & 0x1E104148) * 2) {
            int n5 = n3 = (0x21 | 0x1E104148) - (0x21 & 0x1E104148);
            int cfr_ignored_1 = n5 + 504381768 - (n5 & 0x1E104148) * 2;
        }
        int n6 = n3 = (0x1D3CD260 | 0x1E104148) - (0x1D3CD260 & 0x1E104148);
        iliIiiliiiii = n6 + 504381768 - (n6 & 0x1E104148) * 2;
        if (771390395 <= iliIiiliiiii) {
            int cfr_ignored_2 = 0x32 & 1;
        }
        Object[] objectArray = new Object[7];
        objectArray[6] = Base64.getDecoder().decode(string);
        int n7 = (0xBB762D1E | 0x10F37228) - (0xBB762D1E & 0x10F37228);
        int cfr_ignored_3 = n7 + 284389928;
        objectArray[5] = lIiiIiIlilli[106];
        boolean bl = true;
        block15: while (true) {
            if (!bl || (bl = false) || !true) {
                objectArray[5] = (Integer)objectArray[5] + 1;
            }
            if ((Integer)objectArray[5] >= ((byte[])objectArray[6]).length) {
                return new String((byte[])objectArray[6], StandardCharsets.UTF_8);
            }
            int n8 = (0x657FAA0A | 0x6D5A7E87) - (0x657FAA0A & 0x6D5A7E87);
            block16: while (true) {
                int n9 = n8;
                switch (n9 + 1834647175 - (n9 & 0x6D5A7E87) * 2) {
                    default: {
                        switch ((Integer)objectArray[5] % lIiiIiIlilli[107]) {
                            case 3: {
                                byte[] byArray = (byte[])objectArray[6];
                                int n10 = (Integer)objectArray[5];
                                objectArray[2] = n2;
                                objectArray[1] = (int)byArray[n10];
                                byArray[n10] = (byte)(((Integer)objectArray[1] | (Integer)objectArray[2]) - ((Integer)objectArray[1] & (Integer)objectArray[2]));
                                continue block15;
                            }
                            case 4: {
                                byte[] byArray = (byte[])objectArray[6];
                                int n11 = (Integer)objectArray[5];
                                objectArray[2] = n;
                                objectArray[1] = n2;
                                objectArray[2] = ((Integer)objectArray[1] | (Integer)objectArray[2]) - ((Integer)objectArray[1] & (Integer)objectArray[2]);
                                objectArray[1] = (int)byArray[n11];
                                byArray[n11] = (byte)(((Integer)objectArray[1] | (Integer)objectArray[2]) & ~((Integer)objectArray[1] & (Integer)objectArray[2]));
                                continue block15;
                            }
                            default: {
                                continue block15;
                            }
                            case 0: 
                            case 1: 
                            case 2: 
                            case 5: 
                        }
                        n8 = (0x322EE0DA | 0x6D5A7E87) - (0x322EE0DA & 0x6D5A7E87);
                        continue block16;
                    }
                    case 841933018: 
                }
                break;
            }
            byte[] byArray = (byte[])objectArray[6];
            int n12 = (Integer)objectArray[5];
            objectArray[2] = n;
            objectArray[1] = (int)byArray[n12];
            byArray[n12] = (byte)((Integer)objectArray[1] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue() & (Integer)objectArray[2]);
        }
    }
}

