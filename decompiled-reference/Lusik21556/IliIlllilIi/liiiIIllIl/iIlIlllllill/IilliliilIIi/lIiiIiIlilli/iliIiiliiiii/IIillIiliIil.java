/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityPickupItemEvent
 *  org.bukkit.event.entity.ItemDespawnEvent
 *  org.bukkit.event.player.PlayerDropItemEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.inventory.ItemStack
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
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public final class IIillIiliIil
implements Listener {
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static int[] lIiiIiIlilli;
    private IliIlllilIi IliIlllilIi;
    private static MiniMessage liiiIIllIl;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onInteract(PlayerInteractEvent playerInteractEvent) {
        int n;
        int n2 = n = (0x1634D3CD | 0xB890D3DC) - (0x1634D3CD & 0xB890D3DC);
        iliIiiliiiii = n2 + -1198468132 - (n2 & 0xB890D3DC) * 2;
        if (830217495 < iliIiiliiiii) {
        }
        Object[] objectArray = new Object[44];
        objectArray[24] = lIiiIiIlilli[14];
        objectArray[41] = lIiiIiIlilli[15];
        objectArray[9] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[9] + ~((Integer)objectArray[41]).intValue() + 1;
        objectArray[41] = lIiiIiIlilli[16];
        objectArray[9] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[9] & ~((Integer)objectArray[41]).intValue() | ~((Integer)objectArray[9]).intValue() & (Integer)objectArray[41];
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[15] = lIiiIiIlilli[17];
        objectArray[41] = lIiiIiIlilli[18];
        objectArray[9] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[9] | (Integer)objectArray[41]) & (~((Integer)objectArray[9]).intValue() | ~((Integer)objectArray[41]).intValue());
        objectArray[41] = lIiiIiIlilli[19];
        objectArray[9] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[9] | (Integer)objectArray[41]) - ((Integer)objectArray[9] ^ (Integer)objectArray[41]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[37] = lIiiIiIlilli[20];
        objectArray[41] = lIiiIiIlilli[21];
        objectArray[9] = (int)((Integer)objectArray[37]);
        objectArray[37] = (Integer)objectArray[9] - ~((Integer)objectArray[41]).intValue() - 1;
        objectArray[41] = lIiiIiIlilli[22];
        objectArray[9] = (int)((Integer)objectArray[37]);
        objectArray[37] = ((Integer)objectArray[9] | (Integer)objectArray[41]) & (~((Integer)objectArray[9]).intValue() | ~((Integer)objectArray[41]).intValue());
        objectArray2[((Integer)objectArray[37]).intValue()] = playerInteractEvent;
        IIillIiliIil.IIlllIlliIll("0b6b0721-5230-47b4-a58e-90292e5bc9e9", (long)-4726225823878013463L, (Object[])objectArray2, (int)lIiiIiIlilli[23], (String)"TXRyHR4zMDQ0QltIbWhIGBltaG1IHVttaGhoPTxtbUhtWhxIbUhtGBltbWhtGFtIaG1tHRloaG1IPRwvbUhoHTxoSG1oGBloL2htHTxoaG1oHRxoaC9IPRxtbUhoGBxIaG0=", (int)lIiiIiIlilli[24], (String)"MVVIZHFG", (String)"bGQvGAByaGozRUA0Ny9uAQFtYHZyGQUvaG91EQdvYG0vJBlgeGRzMBR1YA==", (int)lIiiIiIlilli[25], (int)lIiiIiIlilli[26], (String)"KUtaOB9gd2AuGBRvZi5OFh9kYnU6XTlrYHdgWxlgb2YuOxdrZGJ1Tw==", (String)"c3Rv", (int)lIiiIiIlilli[27]);
        int n3 = (0x2977BB51 | 0x5875F4AF) - (0x2977BB51 & 0x5875F4AF);
        int cfr_ignored_0 = n3 + 1484125359;
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDrop(PlayerDropItemEvent playerDropItemEvent) {
        if (IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[30];
        objectArray[0] = lIiiIiIlilli[56];
        objectArray[26] = lIiiIiIlilli[57];
        objectArray[12] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[12] | (Integer)objectArray[26]) - ((Integer)objectArray[12] & (Integer)objectArray[26]);
        objectArray[26] = lIiiIiIlilli[58];
        objectArray[12] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[12] ^ (Integer)objectArray[26]) + 2 * ((Integer)objectArray[12] & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[20] = lIiiIiIlilli[59];
        objectArray[26] = lIiiIiIlilli[60];
        objectArray[12] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[12] | (Integer)objectArray[26]) & (~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[26]).intValue());
        objectArray[26] = lIiiIiIlilli[61];
        objectArray[12] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[12] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = this;
        objectArray[10] = lIiiIiIlilli[62];
        objectArray[26] = lIiiIiIlilli[63];
        objectArray[12] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[12] ^ (Integer)objectArray[26]) + 2 * ((Integer)objectArray[12] & (Integer)objectArray[26]);
        objectArray[26] = lIiiIiIlilli[64];
        objectArray[12] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[12] & ~((Integer)objectArray[26]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[26];
        objectArray2[((Integer)objectArray[10]).intValue()] = playerDropItemEvent;
        IIillIiliIil.IIlllIlliIll("de5f94f7-2854-4f6c-9dc1-ad72dcb092d5", (long)-5892126053051984853L, (Object[])objectArray2, (int)lIiiIiIlilli[65], (String)"SHF3HRs2NTExQl5NaG1NGBxobWhNHV5obW1tPTloaE1oWhlNaE1oGBxoaG1oGF5NbWhoHRxtbWhNPRkqaE1tHTltTWhtGBxtKm1oHTltbWhtHRltbSpNPRloaE1tGBlNbWg=", (int)lIiiIiIlilli[66], (String)"RGZzMTY5", (String)"aWEqGAV3bW82RUUxMiprAQRoZXN3GQAqbWpwEQJqZWgqJBxlfWF2MBFwZQ==", (int)lIiiIiIlilli[67], (int)lIiiIiIlilli[68], (String)"LE5fOBplcmUrGBFqYytLFhphZ3A/XTxuZXJlWxxlamMrOxJuYWdwTw==", (String)"dnFq", (int)lIiiIiIlilli[69]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void removeDisplay(ItemStack itemStack) {
        int n;
        int n2 = n = (0x15A5C1AC | 0x21CEE6C8) - (0x15A5C1AC & 0x21CEE6C8);
        iliIiiliiiii = n2 + 567207624 - (n2 & 0x21CEE6C8) * 2;
        if (1144130308 < iliIiiliiiii) {
            int cfr_ignored_0 = 1 + 90;
        }
        Object[] objectArray = new Object[28];
        objectArray[0] = lIiiIiIlilli[70];
        objectArray[1] = lIiiIiIlilli[71];
        objectArray[9] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[9] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[9] & (Integer)objectArray[1]);
        objectArray[1] = lIiiIiIlilli[72];
        objectArray[9] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[9] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[9]).intValue() & (Integer)objectArray[1];
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[10] = lIiiIiIlilli[73];
        objectArray[1] = lIiiIiIlilli[74];
        objectArray[9] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[9] - ~((Integer)objectArray[1]).intValue() - 1;
        objectArray[1] = lIiiIiIlilli[75];
        objectArray[9] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[9] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[9]).intValue() & (Integer)objectArray[1];
        objectArray2[((Integer)objectArray[10]).intValue()] = itemStack;
        IIillIiliIil.IIlllIlliIll("a8ca34af-920b-44d9-bcdb-82882d49296c", (long)-7053068521783644543L, (Object[])objectArray2, (int)lIiiIiIlilli[76], (String)"SXB2HRo3NDAwQl9MaWxMGB1pbGlMHV9pbGxsPThpaUxpWhhMaUxpGB1paWxpGF9MbGlpHR1sbGlMPRgraUxsHThsTGlsGB1sK2xpHThsbGlsHRhsbCtMPRhpaUxsGBhMbGk=", (int)lIiiIiIlilli[77], (String)"RHY0Y1kz", (String)"aGArGAR2bG43RUQwMytqAQVpZHJ2GQErbGtxEQNrZGkrJB1kfGB3MBBxZA==", (int)lIiiIiIlilli[78], (int)lIiiIiIlilli[79], (String)"LU9eOBtkc2QqGBBrYipKFhtgZnE+XT1vZHNkWx1ka2IqOxNvYGZxTw==", (String)"d3Br", (int)lIiiIiIlilli[80]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIillIiliIil(IliIlllilIi iliIlllilIi) {
        if (IIIllIIliIIl) {
            int n = (0x2D81B3BE | 0xDE777D2C) - (0x2D81B3BE & 0xDE777D2C);
        }
        Object[] objectArray = new Object[28];
        objectArray[22] = lIiiIiIlilli[0];
        objectArray[19] = lIiiIiIlilli[1];
        objectArray[6] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[6] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = lIiiIiIlilli[2];
        objectArray[6] = (int)((Integer)objectArray[22]);
        objectArray[22] = 2 * ((Integer)objectArray[6] | (Integer)objectArray[19]) - ((Integer)objectArray[6] ^ (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[21] = lIiiIiIlilli[3];
        objectArray[19] = lIiiIiIlilli[4];
        objectArray[6] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[6] + ~((Integer)objectArray[19]).intValue() + 1;
        objectArray[19] = lIiiIiIlilli[5];
        objectArray[6] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[6] & ~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[6]).intValue() & (Integer)objectArray[19];
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[13] = lIiiIiIlilli[6];
        objectArray[19] = lIiiIiIlilli[7];
        objectArray[6] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[6] & ~((Integer)objectArray[19]).intValue()) - (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = lIiiIiIlilli[8];
        objectArray[6] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[6] + ~((Integer)objectArray[19]).intValue() + 1;
        objectArray2[((Integer)objectArray[13]).intValue()] = iliIlllilIi;
        IIillIiliIil.IIlllIlliIll("f526355a-3b4f-4343-a289-3cd3723e70e9", (long)-5780702885047636541L, (Object[])objectArray2, (int)lIiiIiIlilli[9], (String)"THVzHR8yMTU1QlpJbGlJGBhsaWxJHVpsaWlpPT1sbElsWh1JbElsGBhsbGlsGFpJaWxsHRhpaWxJPR0ubElpHT1pSWxpGBhpLmlsHT1paWxpHR1paS5JPR1sbElpGB1JaWw=", (int)lIiiIiIlilli[10], (String)"VDJhc0VQ", (String)"bWUuGAFzaWsyRUE1Ni5vAQBsYXdzGQQuaW50EQZuYWwuJBhheWVyMBV0YQ==", (int)lIiiIiIlilli[11], (int)lIiiIiIlilli[12], (String)"KEpbOB5hdmEvGBVuZy9PFh5lY3Q7XThqYXZhWxhhbmcvOxZqZWN0Tw==", (String)"cnVu", (int)lIiiIiIlilli[13]);
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle Illlllllilll(int var0, String var1_1, int var2_2, String var3_3, String var4_4, int var5_5, int var6_6, String var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String Iilllilliill(String var0, int var1_1, int var2_2) {
        if (IIillIiliIil.IIIllIIliIIl) {
            v0 = var11_3 = (-98762106 | 201944865) - (-98762106 & 201944865);
            IIillIiliIil.iliIiiliiiii = v0 + 201944865 - (v0 & 201944865) * 2;
        }
        if (IIillIiliIil.IIIllIIliIIl) {
            47 + 77;
        }
        var9_5 = new Object[6];
        try {
            var9_5[0] = Base64.getDecoder().decode(var0);
        }
        catch (InstantiationError v1) {
            throw v1;
        }
        catch (ThreadDeath v2) {
            throw v2;
        }
        var9_5[4] = IIillIiliIil.lIiiIiIlilli[125];
        if (true) ** GOTO lbl21
        block16: while (true) {
            var9_5[4] = (Integer)var9_5[4] + 1;
lbl21:
            // 2 sources

            if ((Integer)var9_5[4] >= ((byte[])var9_5[0]).length) {
                return new String((byte[])var9_5[0], StandardCharsets.UTF_8);
            }
            switch ((Integer)var9_5[4] % IIillIiliIil.lIiiIiIlilli[126]) {
                case 4: {
                    v3 = (byte[])var9_5[0];
                    v4 = (Integer)var9_5[4];
                    var9_5[5] = var1_1;
                    var9_5[1] = var2_2;
                    var9_5[5] = ((Integer)var9_5[1] | (Integer)var9_5[5]) - ((Integer)var9_5[1] & (Integer)var9_5[5]);
                    var9_5[1] = (int)v3[v4];
                    v3[v4] = (byte)(((Integer)var9_5[1] | (Integer)var9_5[5]) - ((Integer)var9_5[1] & (Integer)var9_5[5]));
                    continue block16;
                }
                default: {
                    continue block16;
                }
                case 0: 
                case 1: 
                case 2: 
                case 5: {
                    v5 = (byte[])var9_5[0];
                    v6 = (Integer)var9_5[4];
                    var9_5[5] = var1_1;
                    var9_5[1] = (int)v5[v6];
                    v5[v6] = (byte)(((Integer)var9_5[1] | (Integer)var9_5[5]) & (~((Integer)var9_5[1]).intValue() | ~((Integer)var9_5[5]).intValue()));
                    var8_4 = (-2064389490 | 528568831) - (-2064389490 & 528568831);
                    var8_4 + 528568831;
                    continue block16;
                }
                case 3: 
            }
            v7 = (byte[])var9_5[0];
            v8 = (Integer)var9_5[4];
            var9_5[5] = var2_2;
            var9_5[1] = (int)v7[v8];
            v7[v8] = (byte)(((Integer)var9_5[1] | (Integer)var9_5[5]) & (~((Integer)var9_5[1]).intValue() | ~((Integer)var9_5[5]).intValue()));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler
    public void onItemDespawn(ItemDespawnEvent itemDespawnEvent) {
        int n;
        int n2 = n = (0x286D67D0 | 0xCE040C50) - (0x286D67D0 & 0xCE040C50);
        if (93023011 >= n2 + -838595504 - (n2 & 0xCE040C50) * 2) {
            int cfr_ignored_0 = 72 + 47;
        }
        Object[] objectArray = new Object[29];
        objectArray[5] = lIiiIiIlilli[42];
        objectArray[23] = lIiiIiIlilli[43];
        objectArray[18] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[18] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = lIiiIiIlilli[44];
        objectArray[18] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[18] | (Integer)objectArray[23]) + ((Integer)objectArray[18] & (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[24] = lIiiIiIlilli[45];
        objectArray[23] = lIiiIiIlilli[46];
        objectArray[18] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[18] | (Integer)objectArray[23]) - ((Integer)objectArray[18] & (Integer)objectArray[23]);
        objectArray[23] = lIiiIiIlilli[47];
        objectArray[18] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[18] | (Integer)objectArray[23]) - ((Integer)objectArray[18] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        objectArray[28] = lIiiIiIlilli[48];
        objectArray[23] = lIiiIiIlilli[49];
        objectArray[18] = (int)((Integer)objectArray[28]);
        objectArray[28] = (Integer)objectArray[18] & ~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[18]).intValue() & (Integer)objectArray[23];
        objectArray[23] = lIiiIiIlilli[50];
        objectArray[18] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[18] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[28]).intValue()] = itemDespawnEvent;
        IIillIiliIil.IIlllIlliIll("62f3de00-cc7d-4d6e-8da3-0fa0011c73ea", (long)1197712453749496019L, (Object[])objectArray2, (int)lIiiIiIlilli[51], (String)"T3ZwHRwxMjY2QllKb2pKGBtvam9KHVlvampqPT5vb0pvWh5Kb0pvGBtvb2pvGFlKam9vHRtqam9KPR4tb0pqHT5qSm9qGBtqLWpvHT5qam9qHR5qai1KPR5vb0pqGB5Kam8=", (int)lIiiIiIlilli[52], (String)"Ukh2Q3Rk", (String)"bmYtGAJwamgxRUI2NS1sAQNvYnRwGQctam13EQVtYm8tJBtiemZxMBZ3Yg==", (int)lIiiIiIlilli[53], (int)lIiiIiIlilli[54], (String)"K0lYOB1idWIsGBZtZCxMFh1mYHc4XTtpYnViWxtibWQsOxVpZmB3Tw==", (String)"cXZt", (int)lIiiIiIlilli[55]);
    }

    /*
     * Exception decompiling
     */
    public static void IIillIiliIil() {
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
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x18A1627E | 0xE4E18CE3) - (0x18A1627E & 0xE4E18CE3);
        iliIiiliiiii = n2 + -454980381 - (n2 & 0xE4E18CE3) * 2;
        if (532736511 <= iliIiiliiiii) {
            n = (0x81F2608A | 0xE4E18CE3) - (0x81F2608A & 0xE4E18CE3);
        }
        Object[] objectArray = new Object[25];
        IIillIiliIil.IIillIiliIil();
        int n3 = (0x3566A4A1 | 0xE736832A) - (0x3566A4A1 & 0xE736832A);
        int cfr_ignored_0 = n3 + -415857878;
        IIillIiliIil.IIlllIlliIll("697f625a-25d0-487d-b17d-d8473872f7f3", IIillIiliIil.class, (int)lIiiIiIlilli[81], (String)"SnN1HRk0NzMzQlxPam9PGB5qb2pPHVxqb29vPTtqak9qWhtPak9qGB5qam9qGFxPb2pqHR5vb2pPPRsoak9vHTtvT2pvGB5vKG9qHTtvb2pvHRtvbyhPPRtqak9vGBtPb2o=", (int)lIiiIiIlilli[82], (String)"bFlPWUww", (String)"a2MoGAd1b200RUczMChpAQZqZ3F1GQIob2hyEQBoZ2ooJB5nf2N0MBNyZw==", (int)lIiiIiIlilli[83], (int)lIiiIiIlilli[84], (String)"LkpsFQRnKWpnGhUpRWpnBwE9L1A=", (String)"amlnECRr", (int)lIiiIiIlilli[85]);
        objectArray[23] = lIiiIiIlilli[86];
        objectArray[24] = lIiiIiIlilli[87];
        objectArray[12] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[12] ^ (Integer)objectArray[24]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[24]);
        objectArray[24] = lIiiIiIlilli[88];
        objectArray[12] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[12] - ~((Integer)objectArray[24]).intValue() - 1;
        IIillIiliIil.IIlllIlliIll("e3f67a5e-b88a-4d8c-91fd-cd17c3dffda7", (long)-6933273370218585943L, (Object[])new Object[((Integer)objectArray[23]).intValue()], (int)lIiiIiIlilli[89], (String)"S3J0HRg1NjIyQl1Oa25OGB9rbmtOHV1rbm5uPTpra05rWhpOa05rGB9ra25rGF1ObmtrHR9ubmtOPRopa05uHTpuTmtuGB9uKW5rHTpubmtuHRpubilOPRpra05uGBpObms=", (int)lIiiIiIlilli[90], (String)"YkZ4dFlo", (String)"amIpGAZ0bmw1RUYyMSloAQdrZnB0GQMpbmlzEQFpZmspJB9mfmJ1MBJzZg==", (int)lIiiIiIlilli[91], (int)lIiiIiIlilli[92], (String)"L01cOBlmcWYoGBJpYChIFhliZHM8XT9tZnFmWx9maWAoOxFtYmRzTw==", (String)"dXJp", (int)lIiiIiIlilli[93]);
    }

    /*
     * Exception decompiling
     */
    public static String IiIlliIliiIl(String var0) {
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
    public static CallSite IIlllIlliIll(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        Object[] objectArray = new Object[16];
        objectArray[9] = MethodHandles.lookup();
        objectArray[15] = ((MethodHandles.Lookup)objectArray[9]).findStatic(IIillIiliIil.class, "Illlllllilll", MethodType.fromMethodDescriptorString("(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[6] = methodType.parameterCount();
        int n = (0xEC1D908 | 0x3DDF9A83) - (0xEC1D908 & 0x3DDF9A83);
        int cfr_ignored_0 = n + 1038064259;
        objectArray[12] = lIiiIiIlilli[94];
        objectArray[5] = (int)((Integer)objectArray[6]);
        objectArray[2] = ((Integer)objectArray[5] ^ (Integer)objectArray[12]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[12]);
        try {
            objectArray[13] = methodType.dropParameterTypes((Integer)objectArray[2], (Integer)objectArray[6]);
            objectArray[7] = MethodHandles.invoker((MethodType)objectArray[13]);
            Class[] classArray = new Class[lIiiIiIlilli[95]];
            classArray[IIillIiliIil.lIiiIiIlilli[96]] = MethodHandle.class;
            objectArray[8] = ((MethodType)objectArray[13]).appendParameterTypes(classArray);
            objectArray[12] = lIiiIiIlilli[97];
            objectArray[5] = (int)((Integer)objectArray[2]);
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
        objectArray[3] = new int[2 * ((Integer)objectArray[5] | (Integer)objectArray[12]) - ((Integer)objectArray[5] ^ (Integer)objectArray[12])];
        ((int[])objectArray[3])[IIillIiliIil.lIiiIiIlilli[98]] = (Integer)objectArray[2];
        objectArray[11] = lIiiIiIlilli[99];
        block12: while (true) {
            int n2 = (0xB34207B3 | 0xC7AB6B03) - (0xB34207B3 & 0xC7AB6B03);
            int n3 = n2;
            switch (n3 + -945067261 - (n3 & 0xC7AB6B03) * 2) {
                default: {
                    objectArray[12] = lIiiIiIlilli[100];
                    objectArray[5] = (int)((Integer)objectArray[2]);
                    if ((Integer)objectArray[11] >= (Integer)objectArray[5] - ~((Integer)objectArray[12]).intValue() - 1) break block12;
                    objectArray[12] = lIiiIiIlilli[101];
                    objectArray[5] = (int)((Integer)objectArray[11]);
                    ((int[])objectArray[3])[((Integer)objectArray[11]).intValue()] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[12]);
                    objectArray[11] = (Integer)objectArray[11] + 1;
                    continue block12;
                }
                case 1909554250: 
            }
            break;
        }
        objectArray[0] = MethodHandles.permuteArguments((MethodHandle)objectArray[7], (MethodType)objectArray[8], (int[])objectArray[3]);
        int n4 = (0x8CEEC2B3 | 0x6F8CC65) - (0x8CEEC2B3 & 0x6F8CC65);
        int cfr_ignored_1 = n4 + 116968549;
        objectArray[14] = MethodHandles.collectArguments((MethodHandle)objectArray[0], (Integer)objectArray[2], (MethodHandle)objectArray[15]);
        return new ConstantCallSite((MethodHandle)objectArray[14]);
    }

    /*
     * Exception decompiling
     */
    public static Class IlIlllIlilIl(String var0) {
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
    @EventHandler
    public void onPickup(EntityPickupItemEvent entityPickupItemEvent) {
        if (IIIllIIliIIl) {
            int n;
            int n2 = n = (0x8B224C74 | 0xE2D27B15) - (0x8B224C74 & 0xE2D27B15);
            iliIiiliiiii = n2 + -489522411 - (n2 & 0xE2D27B15) * 2;
        }
        Object[] objectArray = new Object[31];
        objectArray[28] = lIiiIiIlilli[28];
        objectArray[1] = lIiiIiIlilli[29];
        objectArray[29] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[29] | (Integer)objectArray[1]) & ~((Integer)objectArray[29] & (Integer)objectArray[1]);
        objectArray[1] = lIiiIiIlilli[30];
        objectArray[29] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[29] | (Integer)objectArray[1]) & ~((Integer)objectArray[29] & (Integer)objectArray[1]);
        Object[] objectArray2 = new Object[((Integer)objectArray[28]).intValue()];
        objectArray[4] = lIiiIiIlilli[31];
        objectArray[1] = lIiiIiIlilli[32];
        objectArray[29] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[29] | (Integer)objectArray[1]) & ~((Integer)objectArray[29] & (Integer)objectArray[1]);
        objectArray[1] = lIiiIiIlilli[33];
        objectArray[29] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[29] | (Integer)objectArray[1]) - ((Integer)objectArray[29] & (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        objectArray[26] = lIiiIiIlilli[34];
        objectArray[1] = lIiiIiIlilli[35];
        objectArray[29] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[29] ^ (Integer)objectArray[1]) - 2 * (~((Integer)objectArray[29]).intValue() & (Integer)objectArray[1]);
        objectArray[1] = lIiiIiIlilli[36];
        objectArray[29] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[29] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[29]).intValue() & (Integer)objectArray[1];
        objectArray2[((Integer)objectArray[26]).intValue()] = entityPickupItemEvent;
        IIillIiliIil.IIlllIlliIll("187ec73f-6672-40fc-9a3c-7bb3c06c319b", (long)720208746366698489L, (Object[])objectArray2, (int)lIiiIiIlilli[37], (String)"TndxHR0wMzc3QlhLbmtLGBpua25LHVhua2trPT9ubktuWh9LbktuGBpubmtuGFhLa25uHRpra25LPR8sbktrHT9rS25rGBprLGtuHT9ra25rHR9rayxLPR9ubktrGB9La24=", (int)lIiiIiIlilli[38], (String)"UUJpd2x6", (String)"b2csGANxa2kwRUM3NCxtAQJuY3VxGQYsa2x2EQRsY24sJBpje2dwMBd2Yw==", (int)lIiiIiIlilli[39], (int)lIiiIiIlilli[40], (String)"KkhZOBxjdGMtGBdsZS1NFhxnYXY5XTpoY3RjWxpjbGUtOxRoZ2F2Tw==", (String)"cHds", (int)lIiiIiIlilli[41]);
        int n = (0xCA6DB0A5 | 0x35AF1FF7) - (0xCA6DB0A5 & 0x35AF1FF7);
        int cfr_ignored_0 = n + 900669431;
    }
}

