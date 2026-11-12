/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.event.player.PlayerPurchaseEvent
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.NamespacedKey
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 *  org.bukkit.event.entity.EntityDamageEvent
 *  org.bukkit.event.entity.EntityShootBowEvent
 *  org.bukkit.event.player.PlayerExpChangeEvent
 *  org.bukkit.event.player.PlayerItemDamageEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.inventory.MerchantRecipe
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import io.papermc.paper.event.player.PlayerPurchaseEvent;
import java.io.UncheckedIOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.BindException;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.MerchantRecipe;

public final class lIiiIiIlilli
implements Listener {
    public static int[] IIlllIlliIll;
    private static MiniMessage IliIlllilIi;
    private Map<UUID, Long> iliIiiliiiii;
    private Set<UUID> IIIllIIliIIl;
    private static NamespacedKey liiiIIllIl;
    private IliIlllilIi IilliliilIIi;
    private Map<UUID, Integer> lIiiIiIlilli;
    static AtomicReferenceArray<MethodHandle> IiIlliIliiIl;
    private static int iIlIlllllill;
    public static int Illlllllilll;
    public static boolean Iilllilliill;

    /*
     * Enabled aggressive block sorting
     */
    private Player resolveAttacker(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        int n;
        int n2 = n = (0x5DB7AA1F | 0x5F0B152F) - (0x5DB7AA1F & 0x5F0B152F);
        if (1223494434 >= n2 + 1594561839 - (n2 & 0x5F0B152F) * 2) {
        }
        Object[] objectArray = new Object[31];
        objectArray[10] = IIlllIlliIll[216];
        objectArray[5] = IIlllIlliIll[217];
        objectArray[28] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[28] | (Integer)objectArray[5]) + ((Integer)objectArray[28] & (Integer)objectArray[5]);
        objectArray[5] = IIlllIlliIll[218];
        objectArray[28] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[28] & ~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[28]).intValue() & (Integer)objectArray[5];
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[8] = IIlllIlliIll[219];
        objectArray[5] = IIlllIlliIll[220];
        objectArray[28] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[28] | (Integer)objectArray[5]) - ((Integer)objectArray[28] & (Integer)objectArray[5]);
        objectArray[5] = IIlllIlliIll[221];
        objectArray[28] = (int)((Integer)objectArray[8]);
        objectArray[8] = 2 * ((Integer)objectArray[28] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[28] ^ (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[8]).intValue()] = this;
        objectArray[30] = IIlllIlliIll[222];
        objectArray[5] = IIlllIlliIll[223];
        objectArray[28] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[28] & ~((Integer)objectArray[5]).intValue()) - (~((Integer)objectArray[28]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = IIlllIlliIll[224];
        objectArray[28] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[28] ^ (Integer)objectArray[5]) + 2 * ((Integer)objectArray[28] & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[30]).intValue()] = entityDamageByEntityEvent;
        return (Player)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("b52908af-f091-4bc6-93b3-72df5a3f68a9", (long)3095375336944104724L, (Object[])objectArray2, (int)IIlllIlliIll[225], (String)"YGd8", (String)"OlhJFiJzZHM9Nil8dT1dOCJ3cWYpcwR4c2RzdSRzfHU9FSp4d3FmYQ==", (int)IIlllIlliIll[226], (String)"f3c8Nj1he3kga30nJDx9Lzx+c2VhNzg8e3xmPzp8c348CiRza3dgHilmcw==", (int)IIlllIlliIll[227], (int)IIlllIlliIll[228], (String)"eFRFVElk", (String)"XmdhMyMgIycnbGZbfntbNiR+e35bM2Z+e3t7EwF+flt+dCFbflt+NiR+fnt+NmZbe35+MyR7e35bEyE8flt7MwF7W357NiR7PHt+MwF7e357MyF7ezx+EyF7W3tbNiF+fns=", (String)"UXZhUmZE");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onExpGain(PlayerExpChangeEvent playerExpChangeEvent) {
        int n;
        int n2 = n = (0x1456DC2F | 0x4ED3651) - (0x1456DC2F & 0x4ED3651);
        Illlllllilll = n2 + 82654801 - (n2 & 0x4ED3651) * 2;
        if (457024203 <= Illlllllilll) {
            int n3 = n = (0x49 | 0x4ED3651) - (0x49 & 0x4ED3651);
            int cfr_ignored_0 = n3 + 82654801 - (n3 & 0x4ED3651) * 2;
        }
        Object[] objectArray = new Object[33];
        int n4 = (0x74FEE1B8 | 0x73F4A104) - (0x74FEE1B8 & 0x73F4A104);
        int cfr_ignored_1 = n4 + 1945411844;
        objectArray[3] = IIlllIlliIll[65];
        objectArray[18] = IIlllIlliIll[66];
        objectArray[5] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        objectArray[18] = IIlllIlliIll[67];
        objectArray[5] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[14] = IIlllIlliIll[68];
        objectArray[18] = IIlllIlliIll[69];
        objectArray[5] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        objectArray[18] = IIlllIlliIll[70];
        objectArray[5] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[18]) - ((Integer)objectArray[5] ^ (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[14]).intValue()] = this;
        objectArray[16] = IIlllIlliIll[71];
        objectArray[18] = IIlllIlliIll[72];
        objectArray[5] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[5] | (Integer)objectArray[18]) & (~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[18]).intValue());
        objectArray[18] = IIlllIlliIll[73];
        objectArray[5] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[5] ^ (Integer)objectArray[18]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[16]).intValue()] = playerExpChangeEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("d7566f2f-fe64-4a00-b8e0-e593162b7423", (long)4927776186041318183L, (Object[])objectArray2, (int)IIlllIlliIll[74], (String)"d3Br", (String)"LU9eFjVkc2QqNj5rYipKODVgZnE+cxNvZHNkdTNka2IqFT1vYGZxYQ==", (int)IIlllIlliIll[75], (String)"aGArNip2bG43a2owMytqLytpZHJ2Ny8rbGtxPy1rZGkrCjNkfGB3Hj5xZA==", (int)IIlllIlliIll[76], (int)IIlllIlliIll[77], (String)"enFFY1U3", (String)"SXB2MzQ3NDAwbHFMaWxMNjNpbGlMM3FpbGxsExZpaUxpdDZMaUxpNjNpaWxpNnFMbGlpMzNsbGlMEzYraUxsMxZsTGlsNjNsK2xpMxZsbGlsMzZsbCtpEzZsTGxMNjZpaWw=", (String)"MVBMcWRK");
    }

    /*
     * Exception decompiling
     */
    public static Class IIlilIliiIli(String var0) {
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

    /*
     * Enabled aggressive block sorting
     */
    public Component getMomentumComponent(Player player) {
        int n;
        int n2 = n = (0x54335E48 | 0xE8280D45) - (0x54335E48 & 0xE8280D45);
        Illlllllilll = n2 + -400028347 - (n2 & 0xE8280D45) * 2;
        if (1749792981 < Illlllllilll) {
            int cfr_ignored_0 = 68 + 93;
        }
        Object[] objectArray = new Object[57];
        objectArray[53] = IIlllIlliIll[13];
        objectArray[42] = IIlllIlliIll[14];
        objectArray[27] = (int)((Integer)objectArray[53]);
        objectArray[53] = ((Integer)objectArray[27] ^ (Integer)objectArray[42]) + 2 * ((Integer)objectArray[27] & (Integer)objectArray[42]);
        objectArray[42] = IIlllIlliIll[15];
        objectArray[27] = (int)((Integer)objectArray[53]);
        objectArray[53] = (Integer)objectArray[27] - ~((Integer)objectArray[42]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[53]).intValue()];
        objectArray[48] = IIlllIlliIll[16];
        objectArray[42] = IIlllIlliIll[17];
        objectArray[27] = (int)((Integer)objectArray[48]);
        objectArray[48] = (Integer)objectArray[27] + ~((Integer)objectArray[42]).intValue() + 1;
        objectArray[42] = IIlllIlliIll[18];
        objectArray[27] = (int)((Integer)objectArray[48]);
        objectArray[48] = (Integer)objectArray[27] - ~((Integer)objectArray[42]).intValue() - 1;
        objectArray2[((Integer)objectArray[48]).intValue()] = this;
        objectArray[43] = IIlllIlliIll[19];
        objectArray[42] = IIlllIlliIll[20];
        objectArray[27] = (int)((Integer)objectArray[43]);
        objectArray[43] = 2 * ((Integer)objectArray[27] & ~((Integer)objectArray[42]).intValue()) - ((Integer)objectArray[27] ^ (Integer)objectArray[42]);
        objectArray[42] = IIlllIlliIll[21];
        objectArray[27] = (int)((Integer)objectArray[43]);
        objectArray[43] = (Integer)objectArray[27] - ~((Integer)objectArray[42]).intValue() - 1;
        objectArray2[((Integer)objectArray[43]).intValue()] = player;
        return (Component)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("b0a157ea-4884-4104-b6bf-68c8bd736804", (long)-8397660491653452489L, (Object[])objectArray2, (int)IIlllIlliIll[22], (String)"c3Rv", (String)"KUtaFjFgd2AuNjpvZi5OODFkYnU6cxdrYHdgdTdgb2YuFTlrZGJ1YQ==", (int)IIlllIlliIll[23], (String)"bGQvNi5yaGoza240Ny9uLy9tYHZyNysvaG91PylvYG0vCjdgeGRzHjp1YA==", (int)IIlllIlliIll[24], (int)IIlllIlliIll[25], (String)"VzQ2RmVB", (String)"TXRyMzAzMDQ0bHVIbWhINjdtaG1IM3VtaGhoExJtbUhtdDJIbUhtNjdtbWhtNnVIaG1tMzdoaG1IEzIvbUhoMxJoSG1oNjdoL2htMxJoaG1oMzJoaC9tEzJoSGhINjJtbWg=", (String)"Tm5yT2ow");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onShieldDamage(PlayerItemDamageEvent playerItemDamageEvent) {
        if (Iilllilliill) {
        }
        Object[] objectArray = new Object[35];
        objectArray[15] = IIlllIlliIll[124];
        objectArray[4] = IIlllIlliIll[125];
        objectArray[33] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[33] | (Integer)objectArray[4]) - ((Integer)objectArray[33] & (Integer)objectArray[4]);
        objectArray[4] = IIlllIlliIll[126];
        objectArray[33] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[33] | (Integer)objectArray[4]) + ((Integer)objectArray[33] & (Integer)objectArray[4]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[21] = IIlllIlliIll[127];
        objectArray[4] = IIlllIlliIll[128];
        objectArray[33] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[33] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[33]).intValue() & (Integer)objectArray[4]);
        objectArray[4] = IIlllIlliIll[129];
        objectArray[33] = (int)((Integer)objectArray[21]);
        objectArray[21] = 2 * ((Integer)objectArray[33] | (Integer)objectArray[4]) - ((Integer)objectArray[33] ^ (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[9] = IIlllIlliIll[130];
        objectArray[4] = IIlllIlliIll[131];
        objectArray[33] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[33] | (Integer)objectArray[4]) - ((Integer)objectArray[33] ^ (Integer)objectArray[4]);
        objectArray[4] = IIlllIlliIll[132];
        objectArray[33] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[33] | (Integer)objectArray[4]) & ~((Integer)objectArray[33] & (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[9]).intValue()] = playerItemDamageEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("1b065d11-67bc-474f-ae4b-8031f94527c6", (long)-4857338818680492330L, (Object[])objectArray2, (int)IIlllIlliIll[133], (String)"eH9k", (String)"IkBRFjprfGslNjFkbSVFODpvaX4xcxxga3xrdTxrZG0lFTJgb2l+YQ==", (int)IIlllIlliIll[134], (String)"Z28kNiV5Y2E4a2U/PCRlLyRma315NyAkY2R+PyJka2YkCjxrc294HjF+aw==", (int)IIlllIlliIll[135], (int)IIlllIlliIll[136], (String)"SUJ2TElX", (String)"Rn95Mzs4Oz8/bH5DZmNDNjxmY2ZDM35mY2NjExlmZkNmdDlDZkNmNjxmZmNmNn5DY2ZmMzxjY2ZDEzkkZkNjMxljQ2ZjNjxjJGNmMxljY2ZjMzljYyRmEzljQ2NDNjlmZmM=", (String)"dGhPUkVa");
    }

    private MerchantRecipe cheapenRecipe(MerchantRecipe merchantRecipe, double d) {
        Object[] objectArray = new Object[34];
        objectArray[8] = IIlllIlliIll[91];
        objectArray[13] = IIlllIlliIll[92];
        objectArray[28] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[28] ^ (Integer)objectArray[13]) + 2 * ((Integer)objectArray[28] & (Integer)objectArray[13]);
        objectArray[13] = IIlllIlliIll[93];
        objectArray[28] = (int)((Integer)objectArray[8]);
        objectArray[8] = 2 * ((Integer)objectArray[28] & ~((Integer)objectArray[13]).intValue()) - ((Integer)objectArray[28] ^ (Integer)objectArray[13]);
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[18] = IIlllIlliIll[94];
        objectArray[13] = IIlllIlliIll[95];
        objectArray[28] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[28] | (Integer)objectArray[13]) - ((Integer)objectArray[28] & (Integer)objectArray[13]);
        objectArray[13] = IIlllIlliIll[96];
        objectArray[28] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[28] | (Integer)objectArray[13]) - ((Integer)objectArray[28] ^ (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[29] = IIlllIlliIll[97];
        objectArray[13] = IIlllIlliIll[98];
        objectArray[28] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[28] | (Integer)objectArray[13]) & ~((Integer)objectArray[28] & (Integer)objectArray[13]);
        objectArray[13] = IIlllIlliIll[99];
        objectArray[28] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[28] | (Integer)objectArray[13]) + ((Integer)objectArray[28] & (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[29]).intValue()] = merchantRecipe;
        objectArray[26] = IIlllIlliIll[100];
        objectArray[13] = IIlllIlliIll[101];
        objectArray[28] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[28] & ~((Integer)objectArray[13]).intValue()) - ((Integer)objectArray[28] ^ (Integer)objectArray[13]);
        objectArray[13] = IIlllIlliIll[102];
        objectArray[28] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[28] ^ (Integer)objectArray[13]) - 2 * (~((Integer)objectArray[28]).intValue() & (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[26]).intValue()] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("b4c8db91-db10-4630-bbbb-c889a719a2be", (double)d, (int)IIlllIlliIll[103], (String)"cWZrLzhIYQ==", (String)"L0MuFjdmcWYoNjxpYChDNShla2I8", (int)IIlllIlliIll[104], (String)"bWZxO3NrZmlgdBlocmVrPw==", (int)IIlllIlliIll[105], (int)IIlllIlliIll[106], (String)"elB5cEpX", (String)"S3J0MzY1NjIybHNOa25ONjFrbmtOM3Nrbm5uExRra05rdDROa05rNjFra25rNnNObmtrMzFubmtOEzQpa05uMxRuTmtuNjFuKW5rMxRubmtuMzRubilrEzRuTm5ONjRra24=", (String)"dllWNlcx");
        return (MerchantRecipe)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("6743c266-5285-4e7e-9ca7-e96b6eac4e11", (long)3257597322779085848L, (Object[])objectArray2, (int)IIlllIlliIll[107], (String)"en1m", (String)"IEJTFjhpfmknNjNmbydHODhta3wzcx5iaX5pdT5pZm8nFTBibWt8YQ==", (int)IIlllIlliIll[108], (String)"ZW0mNid7YWM6a2c9PiZnLyZkaX97NyImYWZ8PyBmaWQmCj5pcW16HjN8aQ==", (int)IIlllIlliIll[109], (int)IIlllIlliIll[110], (String)"YUhjbVFs", (String)"RH17Mzk6OT09bHxBZGFBNj5kYWRBM3xkYWFhExtkZEFkdDtBZEFkNj5kZGFkNnxBYWRkMz5hYWRBEzsmZEFhMxthQWRhNj5hJmFkMxthYWRhMzthYSZkEzthQWFBNjtkZGE=", (String)"TEJJT0lB");
    }

    private /* synthetic */ void lambda$onShieldCooldownCheck$0(Player player) {
        Object[] objectArray = new Object[39];
        objectArray[21] = IIlllIlliIll[229];
        objectArray[24] = IIlllIlliIll[230];
        objectArray[20] = (int)((Integer)objectArray[21]);
        objectArray[21] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[24]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[24]);
        objectArray[24] = IIlllIlliIll[231];
        objectArray[20] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[20] + ~((Integer)objectArray[24]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[21]).intValue()];
        objectArray[14] = IIlllIlliIll[232];
        objectArray[24] = IIlllIlliIll[233];
        objectArray[20] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[24]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[24]);
        objectArray[24] = IIlllIlliIll[234];
        objectArray[20] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[20] & ~((Integer)objectArray[24]).intValue()) - (~((Integer)objectArray[20]).intValue() & (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[14]).intValue()] = this;
        objectArray[38] = IIlllIlliIll[235];
        objectArray[24] = IIlllIlliIll[236];
        objectArray[20] = (int)((Integer)objectArray[38]);
        objectArray[38] = 2 * ((Integer)objectArray[20] | (Integer)objectArray[24]) - ((Integer)objectArray[20] ^ (Integer)objectArray[24]);
        objectArray[24] = IIlllIlliIll[237];
        objectArray[20] = (int)((Integer)objectArray[38]);
        objectArray[38] = ((Integer)objectArray[20] ^ (Integer)objectArray[24]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[38]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("709898c2-9e3a-42eb-9a6f-5c915acf4b14", (long)1245471983539292691L, (Object[])objectArray2, (int)IIlllIlliIll[238], (String)"YWZ9", (String)"O1lIFiNyZXI8Nih9dDxcOCN2cGcocwV5cmVydSVyfXQ8FSt5dnBnYQ==", (int)IIlllIlliIll[239], (String)"fnY9Njxgengha3wmJT18Lz1/cmRgNzk9en1nPzt9cn89CiVyanZhHihncg==", (int)IIlllIlliIll[240], (int)IIlllIlliIll[241], (String)"dFVuajUw", (String)"X2ZgMyIhIiYmbGdaf3paNiV/en9aM2d/enp6EwB/f1p/dCBaf1p/NiV/f3p/Nmdaen9/MyV6en9aEyA9f1p6MwB6Wn96NiV6PXp/MwB6en96MyB6ej1/EyB6WnpaNiB/f3o=", (String)"MWl5R2dQ");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onPlayerAttack(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        if (Iilllilliill) {
            int cfr_ignored_0 = 0 & 1;
        }
        Object[] objectArray = new Object[43];
        int n = (0x4F768DFC | 0xE48C79A4) - (0x4F768DFC & 0xE48C79A4);
        int cfr_ignored_1 = n + -460555868;
        objectArray[7] = IIlllIlliIll[150];
        objectArray[10] = IIlllIlliIll[151];
        objectArray[22] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[22] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[10]);
        objectArray[10] = IIlllIlliIll[152];
        objectArray[22] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[22] | (Integer)objectArray[10]) & (~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[10]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[7]).intValue()];
        objectArray[36] = IIlllIlliIll[153];
        objectArray[10] = IIlllIlliIll[154];
        objectArray[22] = (int)((Integer)objectArray[36]);
        objectArray[36] = (Integer)objectArray[22] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray[10] = IIlllIlliIll[155];
        objectArray[22] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[22] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[36]).intValue()] = this;
        objectArray[27] = IIlllIlliIll[156];
        objectArray[10] = IIlllIlliIll[157];
        objectArray[22] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[22] | (Integer)objectArray[10]) + ((Integer)objectArray[22] & (Integer)objectArray[10]);
        objectArray[10] = IIlllIlliIll[158];
        objectArray[22] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[22] | (Integer)objectArray[10]) + ((Integer)objectArray[22] & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[27]).intValue()] = entityDamageByEntityEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("fc09131a-1f6c-4eb8-86ff-e453200df192", (long)-5653588284387398090L, (Object[])objectArray2, (int)IIlllIlliIll[159], (String)"fnli", (String)"JEZXFjxtem0jNjdiayNDODxpb3g3cxpmbXptdTptYmsjFTRmaW94YQ==", (int)IIlllIlliIll[160], (String)"YWkiNiN/ZWc+a2M5OiJjLyJgbXt/NyYiZWJ4PyRibWAiCjptdWl+Hjd4bQ==", (int)IIlllIlliIll[161], (int)IIlllIlliIll[162], (String)"SHpTRk9J", (String)"QHl/Mz0+PTk5bHhFYGVFNjpgZWBFM3hgZWVlEx9gYEVgdD9FYEVgNjpgYGVgNnhFZWBgMzplZWBFEz8iYEVlMx9lRWBlNjplImVgMx9lZWBlMz9lZSJgEz9lRWVFNj9gYGU=", (String)"M1JJcXlS");
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        v0 = var21_3 = (9596052 | -1386018158) - (9596052 & -1386018158);
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Illlllllilll = v0 + -1386018158 - (v0 & -1386018158) * 2;
        if (137452462 < Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Illlllllilll) {
            33 + 16;
        }
        var19_5 = new Object[16];
        var16_4 = (111435405 | -109633756) - (111435405 & -109633756);
        var16_4 + -109633756;
        var19_5[3] = MethodHandles.lookup();
        var19_5[10] = ((MethodHandles.Lookup)var19_5[3]).findStatic(lIiiIiIlilli.class, "IIiilIiiiIii", MethodType.fromMethodDescriptorString("(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
        var19_5[15] = var2_2.parameterCount();
        var19_5[2] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[260];
        var19_5[7] = (int)((Integer)var19_5[15]);
        var19_5[12] = ((Integer)var19_5[7] & ~((Integer)var19_5[2]).intValue()) - (~((Integer)var19_5[7]).intValue() & (Integer)var19_5[2]);
        var19_5[13] = var2_2.dropParameterTypes((Integer)var19_5[12], (Integer)var19_5[15]);
        var17_6 = (-1174533944 | 1811722865) - (-1174533944 & 1811722865);
        var17_6 + 1811722865;
        var19_5[9] = MethodHandles.invoker((MethodType)var19_5[13]);
        v1 = new Class[Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[261]];
        v1[Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[262]] = MethodHandle.class;
        var19_5[11] = ((MethodType)var19_5[13]).appendParameterTypes(v1);
        var19_5[2] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[263];
        var19_5[7] = (int)((Integer)var19_5[12]);
        var19_5[0] = new int[((Integer)var19_5[7] ^ (Integer)var19_5[2]) + 2 * ((Integer)var19_5[7] & (Integer)var19_5[2])];
        ((int[])var19_5[0])[Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[264]] = (Integer)var19_5[12];
        var19_5[6] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[265];
        if (true) ** GOTO lbl65
        block12: while (true) {
            v2 = var18_7;
            cfr_temp_0 = 0;
            do {
                switch (cfr_temp_0 == 0 ? v2 + 326116790 - (v2 & 326116790) * 2 : cfr_temp_0) {
                    default: {
                        var19_5[2] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[266];
                        var19_5[7] = (int)((Integer)var19_5[12]);
                        if ((Integer)var19_5[6] >= (Integer)var19_5[7] - ~((Integer)var19_5[2]).intValue() - 1) break block12;
                        var18_7 = (-353408439 | 326116790) - (-353408439 & 326116790);
                        continue block12;
                    }
                    cfr_temp_0 = 2145198192;
                    ** case -353408439:
                    case 2145198192: {
                        var18_7 = (830738940 | 326116790) - (830738940 & 326116790);
                        continue block12;
                    }
                    case 830738940: {
                        var19_5[2] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[267];
                        var19_5[7] = (int)((Integer)var19_5[6]);
                        ((int[])var19_5[0])[((Integer)var19_5[6]).intValue()] = ((Integer)var19_5[7] ^ (Integer)var19_5[2]) - 2 * (~((Integer)var19_5[7]).intValue() & (Integer)var19_5[2]);
                        var19_5[6] = (Integer)var19_5[6] + 1;
                        var18_7 = (-1743716430 | 326116790) - (-1743716430 & 326116790);
                        continue block12;
                    }
                    case -1743716430: {
                    }
                }
                break;
lbl64:
                // 1 sources

            } while (true);
lbl65:
            // 3 sources

            var18_7 = (1437597193 | 326116790) - (1437597193 & 326116790);
        }
        var19_5[1] = MethodHandles.permuteArguments((MethodHandle)var19_5[9], (MethodType)var19_5[11], (int[])var19_5[0]);
        var19_5[4] = MethodHandles.collectArguments((MethodHandle)var19_5[1], (Integer)var19_5[12], (MethodHandle)var19_5[10]);
        v3((MethodHandle)var19_5[4]);
        return v3;
    }

    /*
     * Exception decompiling
     */
    public static String Illillliilli(String var0) {
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
    static {
        if (Iilllilliill) {
            throw new BindException();
        }
        Object[] objectArray = new Object[28];
        int n = (0xA229FD84 | 0x97B9D0F1) - (0xA229FD84 & 0x97B9D0F1);
        block4: while (true) {
            int n2 = n;
            switch (n2 + -1749430031 - (n2 & 0x97B9D0F1) * 2) {
                default: {
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iiiiliiiiiii();
                    n = (0x61F035E3 | 0x97B9D0F1) - (0x61F035E3 & 0x97B9D0F1);
                    continue block4;
                }
                case 1643132387: 
            }
            break;
        }
        objectArray[15] = IIlllIlliIll[242];
        objectArray[22] = IIlllIlliIll[243];
        objectArray[7] = (int)((Integer)objectArray[15]);
        int n3 = (0x44A6D118 | 0x59602395) - (0x44A6D118 & 0x59602395);
        int cfr_ignored_0 = n3 + 1499472789;
        objectArray[15] = ((Integer)objectArray[7] ^ (Integer)objectArray[22]) - 2 * (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[22]);
        objectArray[22] = IIlllIlliIll[244];
        objectArray[7] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[7] | (Integer)objectArray[22]) - ((Integer)objectArray[7] & (Integer)objectArray[22]);
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("ea487564-bb3a-418f-b5cb-8254ac082747", (int)((Integer)objectArray[15]), (int)IIlllIlliIll[245], (String)"f196EyB6enp6MyB6", (String)"Xw==", (int)IIlllIlliIll[246], (String)"WmNlMyckJyMjbGJfen9fNiB6f3pfM2J6f39/EwV6el96dCVfel96NiB6en96NmJff3p6MyB/f3pfEyU4el9/MwV/X3p/NiB/OH96MwV/f3p/MyV/fzh6EyV/X39fNiV6en8=", (int)IIlllIlliIll[247], (int)IIlllIlliIll[248], (String)"SXZ1bjhH", (String)"WmNlMyckJyMjbGJfen9fNiB6f3pfM2J6f39/EwV6el96dCVfel96NiB6en96NmJff3p6MyB/f3pfEyU4el9/MwV/X3p/NiB/OH96MwV/f3p/MyV/fzh6EyV/X39fNiV6en8=", (String)"TmMxQ1Z1");
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("c859ec23-a929-4b9c-b5cd-729aa0e52d2d", lIiiIiIlilli.class, (int)IIlllIlliIll[249], (String)"eHt1Phh5", (String)"PFh+Ozh1O3h1NCk7V3h1KT0vPUI=", (int)IIlllIlliIll[250], (String)"eXE6NjtnfX8ma3shIjp7Lzp4dWNnNz46fXpgPzx6dXg6CiJ1bXFmHi9gdQ==", (int)IIlllIlliIll[251], (int)IIlllIlliIll[252], (String)"Wm81YWJ4", (String)"WGFnMyUmJSEhbGBdeH1dNiJ4fXhdM2B4fX19Ewd4eF14dCddeF14NiJ4eH14NmBdfXh4MyJ9fXhdEyc6eF19Mwd9XXh9NiJ9On14Mwd9fXh9Myd9fTp4Eyd9XX1dNid4eH0=", (String)"Q0J6QXRF");
        objectArray[14] = IIlllIlliIll[253];
        objectArray[22] = IIlllIlliIll[254];
        objectArray[7] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[7] | (Integer)objectArray[22]) - ((Integer)objectArray[7] ^ (Integer)objectArray[22]);
        objectArray[22] = IIlllIlliIll[255];
        objectArray[7] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[7] - ~((Integer)objectArray[22]).intValue() - 1;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("d51e7c9f-c3ba-45a8-a9e3-9e7fd7c611d7", (long)8082073462565303412L, (Object[])new Object[((Integer)objectArray[14]).intValue()], (int)IIlllIlliIll[256], (String)"Z2B7", (String)"PV9OFiV0Y3Q6Ni57cjpaOCVwdmEucwN/dGN0dSN0e3I6FS1/cHZhYQ==", (int)IIlllIlliIll[257], (String)"eHA7NjpmfH4na3ogIzt6Lzt5dGJmNz87fHthPz17dHk7CiN0bHBnHi5hdA==", (int)IIlllIlliIll[258], (int)IIlllIlliIll[259], (String)"YmJGc0Y2", (String)"WWBmMyQnJCAgbGFceXxcNiN5fHlcM2F5fHx8EwZ5eVx5dCZceVx5NiN5eXx5NmFcfHl5MyN8fHlcEyY7eVx8MwZ8XHl8NiN8O3x5MwZ8fHl8MyZ8fDt5EyZ8XHxcNiZ5eXw=", (String)"NnFDODBU");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onVillagerTradeXp(PlayerPurchaseEvent playerPurchaseEvent) {
        int n;
        int n2 = n = (0x51B7663 | 0x777ED65B) - (0x51B7663 & 0x777ED65B);
        if (75092664 >= n2 + 2004801115 - (n2 & 0x777ED65B) * 2) {
            throw new BindException();
        }
        Object[] objectArray = new Object[34];
        int n3 = (0x843A638E | 0x5BEB252B) - (0x843A638E & 0x5BEB252B);
        int cfr_ignored_0 = n3 + 1542137131;
        objectArray[24] = IIlllIlliIll[52];
        objectArray[2] = IIlllIlliIll[53];
        objectArray[5] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[5] | (Integer)objectArray[2]) & (~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[2]).intValue());
        objectArray[2] = IIlllIlliIll[54];
        objectArray[5] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[5] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[2]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[11] = IIlllIlliIll[55];
        objectArray[2] = IIlllIlliIll[56];
        objectArray[5] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[5] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[2];
        objectArray[2] = IIlllIlliIll[57];
        objectArray[5] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[5] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        objectArray[31] = IIlllIlliIll[58];
        objectArray[2] = IIlllIlliIll[59];
        objectArray[5] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[5] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[2]);
        objectArray[2] = IIlllIlliIll[60];
        objectArray[5] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[5] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[31]).intValue()] = playerPurchaseEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("8b0b496d-f726-42df-b67d-d4841889d7b4", (long)-1040983975651271223L, (Object[])objectArray2, (int)IIlllIlliIll[61], (String)"dnFq", (String)"LE5fFjRlcmUrNj9qYytLODRhZ3A/cxJuZXJldTJlamMrFTxuYWdwYQ==", (int)IIlllIlliIll[62], (String)"aWEqNit3bW82a2sxMiprLypoZXN3Ny4qbWpwPyxqZWgqCjJlfWF2Hj9wZQ==", (int)IIlllIlliIll[63], (int)IIlllIlliIll[64], (String)"bVRPdzVC", (String)"SHF3MzU2NTExbHBNaG1NNjJobWhNM3BobW1tExdoaE1odDdNaE1oNjJoaG1oNnBNbWhoMzJtbWhNEzcqaE1tMxdtTWhtNjJtKm1oMxdtbWhtMzdtbSpoEzdtTW1NNjdoaG0=", (String)"ZHIybjhi");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        Object[] objectArray = new Object[30];
        int n = (0x76E79FEC | 0x12141AD3) - (0x76E79FEC & 0x12141AD3);
        int cfr_ignored_0 = n + 303307475;
        objectArray[26] = IIlllIlliIll[203];
        objectArray[13] = IIlllIlliIll[204];
        objectArray[9] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[9] | (Integer)objectArray[13]) & ~((Integer)objectArray[9] & (Integer)objectArray[13]);
        objectArray[13] = IIlllIlliIll[205];
        objectArray[9] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[9] ^ (Integer)objectArray[13]) + 2 * ((Integer)objectArray[9] & (Integer)objectArray[13]);
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[7] = IIlllIlliIll[206];
        objectArray[13] = IIlllIlliIll[207];
        objectArray[9] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[9] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = IIlllIlliIll[208];
        objectArray[9] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[9] | (Integer)objectArray[13]) & (~((Integer)objectArray[9]).intValue() | ~((Integer)objectArray[13]).intValue());
        objectArray2[((Integer)objectArray[7]).intValue()] = this;
        objectArray[18] = IIlllIlliIll[209];
        objectArray[13] = IIlllIlliIll[210];
        objectArray[9] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[9] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = IIlllIlliIll[211];
        objectArray[9] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[9] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = playerQuitEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("0b962611-dd70-4376-b3d1-488ea078bb95", (long)-5406374881828403169L, (Object[])objectArray2, (int)IIlllIlliIll[212], (String)"Y2R/", (String)"OVtKFiFwZ3A+Nip/dj5eOCF0cmUqcwd7cGdwdSdwf3Y+FSl7dHJlYQ==", (int)IIlllIlliIll[213], (String)"fHQ/Nj5ieHoja34kJz9+Lz99cGZiNzs/eH9lPzl/cH0/CidwaHRjHiplcA==", (int)IIlllIlliIll[214], (int)IIlllIlliIll[215], (String)"Q1Y3VmJp", (String)"XWRiMyAjICQkbGVYfXhYNid9eH1YM2V9eHh4EwJ9fVh9dCJYfVh9Nid9fXh9NmVYeH19Myd4eH1YEyI/fVh4MwJ4WH14Nid4P3h9MwJ4eH14MyJ4eD99EyJ4WHhYNiJ9fXg=", (String)"Wk5XcUlx");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onEnvironmentDamage(EntityDamageEvent entityDamageEvent) {
        if (Iilllilliill) {
            int n;
            int n2 = n = (0xB79F571D | 0x376EC4EA) - (0xB79F571D & 0x376EC4EA);
            Illlllllilll = n2 + 930006250 - (n2 & 0x376EC4EA) * 2;
        }
        Object[] objectArray = new Object[39];
        objectArray[9] = IIlllIlliIll[39];
        objectArray[20] = IIlllIlliIll[40];
        objectArray[30] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[30] | (Integer)objectArray[20]) - ((Integer)objectArray[30] ^ (Integer)objectArray[20]);
        objectArray[20] = IIlllIlliIll[41];
        objectArray[30] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[30] ^ (Integer)objectArray[20]) - 2 * (~((Integer)objectArray[30]).intValue() & (Integer)objectArray[20]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[35] = IIlllIlliIll[42];
        objectArray[20] = IIlllIlliIll[43];
        objectArray[30] = (int)((Integer)objectArray[35]);
        objectArray[35] = ((Integer)objectArray[30] | (Integer)objectArray[20]) - ((Integer)objectArray[30] & (Integer)objectArray[20]);
        objectArray[20] = IIlllIlliIll[44];
        objectArray[30] = (int)((Integer)objectArray[35]);
        objectArray[35] = ((Integer)objectArray[30] | (Integer)objectArray[20]) - ((Integer)objectArray[30] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[35]).intValue()] = this;
        objectArray[12] = IIlllIlliIll[45];
        objectArray[20] = IIlllIlliIll[46];
        objectArray[30] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[30] & ~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[30]).intValue() & (Integer)objectArray[20];
        objectArray[20] = IIlllIlliIll[47];
        objectArray[30] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[30] ^ (Integer)objectArray[20]) + 2 * ((Integer)objectArray[30] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[12]).intValue()] = entityDamageEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("704ccd02-8b3b-4827-98e0-f6ee06ed2246", (long)-4567576261731525951L, (Object[])objectArray2, (int)IIlllIlliIll[48], (String)"cXZt", (String)"K0lYFjNidWIsNjhtZCxMODNmYHc4cxVpYnVidTVibWQsFTtpZmB3YQ==", (int)IIlllIlliIll[49], (String)"bmYtNixwamgxa2w2NS1sLy1vYnRwNyktam13PyttYm8tCjViemZxHjh3Yg==", (int)IIlllIlliIll[50], (int)IIlllIlliIll[51], (String)"OU01T1NK", (String)"T3ZwMzIxMjY2bHdKb2pKNjVvam9KM3dvampqExBvb0pvdDBKb0pvNjVvb2pvNndKam9vMzVqam9KEzAtb0pqMxBqSm9qNjVqLWpvMxBqam9qMzBqai1vEzBqSmpKNjBvb2o=", (String)"WUpaUGtL");
    }

    /*
     * Exception decompiling
     */
    private static String Iliilliiilii(String var0, int var1_1, int var2_2) {
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
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onMomentumReset(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        int n;
        int n2 = n = (0x4509303 | 0xE9F2F511) - (0x4509303 & 0xE9F2F511);
        Illlllllilll = n2 + -369953519 - (n2 & 0xE9F2F511) * 2;
        if (802687171 <= Illlllllilll) {
            int cfr_ignored_0 = 11 + 32;
        }
        Object[] objectArray = new Object[36];
        objectArray[10] = IIlllIlliIll[163];
        objectArray[2] = IIlllIlliIll[164];
        objectArray[26] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[26] ^ (Integer)objectArray[2]) - 2 * (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[2]);
        objectArray[2] = IIlllIlliIll[165];
        objectArray[26] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[26] | (Integer)objectArray[2]) & ~((Integer)objectArray[26] & (Integer)objectArray[2]);
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[16] = IIlllIlliIll[166];
        objectArray[2] = IIlllIlliIll[167];
        objectArray[26] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[26] | (Integer)objectArray[2]) & (~((Integer)objectArray[26]).intValue() | ~((Integer)objectArray[2]).intValue());
        objectArray[2] = IIlllIlliIll[168];
        objectArray[26] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[26] ^ (Integer)objectArray[2]) + 2 * ((Integer)objectArray[26] & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[33] = IIlllIlliIll[169];
        objectArray[2] = IIlllIlliIll[170];
        objectArray[26] = (int)((Integer)objectArray[33]);
        objectArray[33] = (Integer)objectArray[26] - ~((Integer)objectArray[2]).intValue() - 1;
        objectArray[2] = IIlllIlliIll[171];
        objectArray[26] = (int)((Integer)objectArray[33]);
        objectArray[33] = ((Integer)objectArray[26] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[33]).intValue()] = entityDamageByEntityEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("f8210f7a-a27f-4904-b015-d086073d219f", (long)-1434735829812220289L, (Object[])objectArray2, (int)IIlllIlliIll[172], (String)"f3hj", (String)"JUdWFj1se2wiNjZjaiJCOD1obnk2cxtnbHtsdTtsY2oiFTVnaG55YQ==", (int)IIlllIlliIll[173], (String)"YGgjNiJ+ZGY/a2I4OyNiLyNhbHp+NycjZGN5PyVjbGEjCjtsdGh/HjZ5bA==", (int)IIlllIlliIll[174], (int)IIlllIlliIll[175], (String)"VGNhSFNR", (String)"QXh+Mzw/PDg4bHlEYWRENjthZGFEM3lhZGRkEx5hYURhdD5EYURhNjthYWRhNnlEZGFhMztkZGFEEz4jYURkMx5kRGFkNjtkI2RhMx5kZGFkMz5kZCNhEz5kRGRENj5hYWQ=", (String)"Mno4V3pz");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IIiilIiiiIii(int var0, String var1_1, String var2_2, int var3_3, String var4_4, int var5_5, int var6_6, String var7_7, String var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Opcode count of 23699 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Iiiiliiiiiii() {
        if (Iilllilliill) {
            int cfr_ignored_0 = (0xFD9BDF65 | 0x8163D7B1) - (0xFD9BDF65 & 0x8163D7B1);
        }
        int n = 26855;
        int n2 = (0x69C2 | 0x531649F0) - (0x69C2 & 0x531649F0);
        int n3 = (0x597A7241 | 0x94BA72B2) - (0x597A7241 & 0x94BA72B2);
        block56: while (true) {
            int n4 = n3;
            switch (n4 + -1799720270 - (n4 & 0x94BA72B2) * 2) {
                case 1908611093: {
                    n = 55354;
                    int n5 = n2 = (0xD890 | 0x531649F0) - (0xD890 & 0x531649F0);
                    int n6 = n2;
                    int n7 = (n5 + 1393969648 - (n5 & 0x531649F0) * 2 | n) - (n6 + 1393969648 - (n6 & 0x531649F0) * 2 & n);
                    n = 55354;
                    int n8 = n2 = (0xD80B | 0x531649F0) - (0xD80B & 0x531649F0);
                    int n9 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n7] = (n8 + 1393969648 - (n8 & 0x531649F0) * 2 | n) - (n9 + 1393969648 - (n9 & 0x531649F0) * 2 & n);
                    n3 = (0xDCAA4EEE | 0x94BA72B2) - (0xDCAA4EEE & 0x94BA72B2);
                    continue block56;
                }
                case -592818450: {
                    n = 40601;
                    int n10 = n2 = (0x9E74 | 0x531649F0) - (0x9E74 & 0x531649F0);
                    int n11 = n2;
                    int n12 = n10 + 1393969648 - (n10 & 0x531649F0) * 2 & ~n | ~(n11 + 1393969648 - (n11 & 0x531649F0) * 2) & n;
                    n = 40601;
                    int n13 = n2 = (0x9E81 | 0x531649F0) - (0x9E81 & 0x531649F0);
                    int n14 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n12] = n13 + 1393969648 - (n13 & 0x531649F0) * 2 & ~n | ~(n14 + 1393969648 - (n14 & 0x531649F0) * 2) & n;
                    n = 67008;
                    int n15 = n2 = (0x104D0 | 0x531649F0) - (0x104D0 & 0x531649F0);
                    int n16 = n2;
                    int n17 = n15 + 1393969648 - (n15 & 0x531649F0) * 2 & ~n | ~(n16 + 1393969648 - (n16 & 0x531649F0) * 2) & n;
                    n = 67008;
                    int n18 = n2 = (0x1059A | 0x531649F0) - (0x1059A & 0x531649F0);
                    int n19 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n17] = n18 + 1393969648 - (n18 & 0x531649F0) * 2 & ~n | ~(n19 + 1393969648 - (n19 & 0x531649F0) * 2) & n;
                    n = 56069;
                    int n20 = n2 = (0xDA0A | 0x531649F0) - (0xDA0A & 0x531649F0);
                    int n21 = n2;
                    int n22 = (n20 + 1393969648 - (n20 & 0x531649F0) * 2 | n) & (~(n21 + 1393969648 - (n21 & 0x531649F0) * 2) | ~n);
                    n = 56069;
                    int n23 = n2 = (0xDB5F | 0x531649F0) - (0xDB5F & 0x531649F0);
                    int n24 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n22] = (n23 + 1393969648 - (n23 & 0x531649F0) * 2 | n) & ~(n24 + 1393969648 - (n24 & 0x531649F0) * 2 & n);
                    n = 14906;
                    int n25 = n2 = (0x3AAF | 0x531649F0) - (0x3AAF & 0x531649F0);
                    int n26 = n2;
                    int n27 = (n25 + 1393969648 - (n25 & 0x531649F0) * 2 | n) & ~(n26 + 1393969648 - (n26 & 0x531649F0) * 2 & n);
                    n = 14906;
                    int n28 = n2 = (0xDC559667 | 0x531649F0) - (0xDC559667 & 0x531649F0);
                    int n29 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n27] = (n28 + 1393969648 - (n28 & 0x531649F0) * 2 | n) & ~(n29 + 1393969648 - (n29 & 0x531649F0) * 2 & n);
                    n3 = (0xB20503D9 | 0x94BA72B2) - (0xB20503D9 & 0x94BA72B2);
                    continue block56;
                }
                case -1308294183: {
                    n = 20572;
                    int n30 = n2 = (0x5146 | 0x531649F0) - (0x5146 & 0x531649F0);
                    int n31 = n2;
                    int n32 = (n30 + 1393969648 - (n30 & 0x531649F0) * 2 | n) & ~(n31 + 1393969648 - (n31 & 0x531649F0) * 2 & n);
                    n = 20572;
                    int n33 = n2 = (0x505D | 0x531649F0) - (0x505D & 0x531649F0);
                    int n34 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n32] = (n33 + 1393969648 - (n33 & 0x531649F0) * 2 | n) & (~(n34 + 1393969648 - (n34 & 0x531649F0) * 2) | ~n);
                    n = 43448;
                    int n35 = n2 = (0xA989 | 0x531649F0) - (0xA989 & 0x531649F0);
                    int n36 = n2;
                    int n37 = n35 + 1393969648 - (n35 & 0x531649F0) * 2 & ~n | ~(n36 + 1393969648 - (n36 & 0x531649F0) * 2) & n;
                    n = 43448;
                    int n38 = n2 = (0xA9E2 | 0x531649F0) - (0xA9E2 & 0x531649F0);
                    int n39 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n37] = (n38 + 1393969648 - (n38 & 0x531649F0) * 2 | n) - (n39 + 1393969648 - (n39 & 0x531649F0) * 2 & n);
                    n = 60880;
                    int n40 = n2 = (0xECCD | 0x531649F0) - (0xECCD & 0x531649F0);
                    int n41 = n2;
                    int n42 = (n40 + 1393969648 - (n40 & 0x531649F0) * 2 | n) & ~(n41 + 1393969648 - (n41 & 0x531649F0) * 2 & n);
                    n = 60880;
                    int n43 = n2 = (0xEDFE | 0x531649F0) - (0xEDFE & 0x531649F0);
                    int n44 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n42] = n43 + 1393969648 - (n43 & 0x531649F0) * 2 & ~n | ~(n44 + 1393969648 - (n44 & 0x531649F0) * 2) & n;
                    n = 4613;
                    int n45 = n2 = (0x1277 | 0x531649F0) - (0x1277 & 0x531649F0);
                    int n46 = n2;
                    int n47 = (n45 + 1393969648 - (n45 & 0x531649F0) * 2 | n) & ~(n46 + 1393969648 - (n46 & 0x531649F0) * 2 & n);
                    n = 4613;
                    int n48 = n2 = (0x1295 | 0x531649F0) - (0x1295 & 0x531649F0);
                    int n49 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n47] = (n48 + 1393969648 - (n48 & 0x531649F0) * 2 | n) & (~(n49 + 1393969648 - (n49 & 0x531649F0) * 2) | ~n);
                    n = 10212;
                    int n50 = n2 = (0x278D | 0x531649F0) - (0x278D & 0x531649F0);
                    int n51 = n2;
                    int n52 = (n50 + 1393969648 - (n50 & 0x531649F0) * 2 | n) & ~(n51 + 1393969648 - (n51 & 0x531649F0) * 2 & n);
                    n = 10212;
                    int n53 = n2 = (0x27E3 | 0x531649F0) - (0x27E3 & 0x531649F0);
                    int n54 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n52] = (n53 + 1393969648 - (n53 & 0x531649F0) * 2 | n) & ~(n54 + 1393969648 - (n54 & 0x531649F0) * 2 & n);
                    n = 18030;
                    int n55 = n2 = (0x4663 | 0x531649F0) - (0x4663 & 0x531649F0);
                    int n56 = n2;
                    int n57 = (n55 + 1393969648 - (n55 & 0x531649F0) * 2 | n) & ~(n56 + 1393969648 - (n56 & 0x531649F0) * 2 & n);
                    n = 18030;
                    int n58 = n2 = (0xFFFFB9C1 | 0x531649F0) - (0xFFFFB9C1 & 0x531649F0);
                    int n59 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n57] = (n58 + 1393969648 - (n58 & 0x531649F0) * 2 | n) & ~(n59 + 1393969648 - (n59 & 0x531649F0) * 2 & n);
                    n = 20729;
                    int n60 = n2 = (0x5023 | 0x531649F0) - (0x5023 & 0x531649F0);
                    int n61 = n2;
                    int n62 = (n60 + 1393969648 - (n60 & 0x531649F0) * 2 | n) & ~(n61 + 1393969648 - (n61 & 0x531649F0) * 2 & n);
                    n = 20729;
                    int n63 = n2 = (0xFFFFAF5C | 0x531649F0) - (0xFFFFAF5C & 0x531649F0);
                    int n64 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n62] = (n63 + 1393969648 - (n63 & 0x531649F0) * 2 | n) - (n64 + 1393969648 - (n64 & 0x531649F0) * 2 & n);
                    n = 38463;
                    int n65 = n2 = (0x96CE | 0x531649F0) - (0x96CE & 0x531649F0);
                    int n66 = n2;
                    int n67 = (n65 + 1393969648 - (n65 & 0x531649F0) * 2 | n) & ~(n66 + 1393969648 - (n66 & 0x531649F0) * 2 & n);
                    n = 38463;
                    int n68 = n2 = (0xB954926D | 0x531649F0) - (0xB954926D & 0x531649F0);
                    int n69 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n67] = (n68 + 1393969648 - (n68 & 0x531649F0) * 2 | n) & ~(n69 + 1393969648 - (n69 & 0x531649F0) * 2 & n);
                    n = 20835;
                    int n70 = n2 = (0x515C | 0x531649F0) - (0x515C & 0x531649F0);
                    int n71 = n2;
                    int n72 = (n70 + 1393969648 - (n70 & 0x531649F0) * 2 | n) & ~(n71 + 1393969648 - (n71 & 0x531649F0) * 2 & n);
                    n = 20835;
                    int n73 = n2 = (0x5167 | 0x531649F0) - (0x5167 & 0x531649F0);
                    int n74 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n72] = (n73 + 1393969648 - (n73 & 0x531649F0) * 2 | n) & (~(n74 + 1393969648 - (n74 & 0x531649F0) * 2) | ~n);
                    n = 68592;
                    int n75 = n2 = (0x10B5C | 0x531649F0) - (0x10B5C & 0x531649F0);
                    int n76 = n2;
                    int n77 = (n75 + 1393969648 - (n75 & 0x531649F0) * 2 | n) & ~(n76 + 1393969648 - (n76 & 0x531649F0) * 2 & n);
                    n = 68592;
                    int n78 = n2 = (0xA544E955 | 0x531649F0) - (0xA544E955 & 0x531649F0);
                    int n79 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n77] = (n78 + 1393969648 - (n78 & 0x531649F0) * 2 | n) & ~(n79 + 1393969648 - (n79 & 0x531649F0) * 2 & n);
                    n = 11509;
                    int n80 = n2 = (0x2C2A | 0x531649F0) - (0x2C2A & 0x531649F0);
                    int n81 = n2;
                    int n82 = (n80 + 1393969648 - (n80 & 0x531649F0) * 2 | n) - (n81 + 1393969648 - (n81 & 0x531649F0) * 2 & n);
                    n = 11509;
                    int n83 = n2 = (0x2CBE | 0x531649F0) - (0x2CBE & 0x531649F0);
                    int n84 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n82] = (n83 + 1393969648 - (n83 & 0x531649F0) * 2 | n) & ~(n84 + 1393969648 - (n84 & 0x531649F0) * 2 & n);
                    n3 = (0xF985CCA8 | 0x94BA72B2) - (0xF985CCA8 & 0x94BA72B2);
                    continue block56;
                }
                case -108671832: {
                    n = 18496;
                    int n85 = n2 = (0x48AA | 0x531649F0) - (0x48AA & 0x531649F0);
                    int n86 = n2;
                    int n87 = (n85 + 1393969648 - (n85 & 0x531649F0) * 2 | n) & (~(n86 + 1393969648 - (n86 & 0x531649F0) * 2) | ~n);
                    n = 18496;
                    int n88 = n2 = (0x4854 | 0x531649F0) - (0x4854 & 0x531649F0);
                    int n89 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n87] = n88 + 1393969648 - (n88 & 0x531649F0) * 2 & ~n | ~(n89 + 1393969648 - (n89 & 0x531649F0) * 2) & n;
                    n = 40263;
                    int n90 = n2 = (0x9D7C | 0x531649F0) - (0x9D7C & 0x531649F0);
                    int n91 = n2;
                    int n92 = (n90 + 1393969648 - (n90 & 0x531649F0) * 2 | n) - (n91 + 1393969648 - (n91 & 0x531649F0) * 2 & n);
                    n = 40263;
                    int n93 = n2 = (0x9D1E | 0x531649F0) - (0x9D1E & 0x531649F0);
                    int n94 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n92] = (n93 + 1393969648 - (n93 & 0x531649F0) * 2 | n) & (~(n94 + 1393969648 - (n94 & 0x531649F0) * 2) | ~n);
                    n = 46829;
                    int n95 = n2 = (0xB63E | 0x531649F0) - (0xB63E & 0x531649F0);
                    int n96 = n2;
                    int n97 = (n95 + 1393969648 - (n95 & 0x531649F0) * 2 | n) & (~(n96 + 1393969648 - (n96 & 0x531649F0) * 2) | ~n);
                    n = 46829;
                    int n98 = n2 = (0xFFFF493A | 0x531649F0) - (0xFFFF493A & 0x531649F0);
                    int n99 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n97] = (n98 + 1393969648 - (n98 & 0x531649F0) * 2 | n) & ~(n99 + 1393969648 - (n99 & 0x531649F0) * 2 & n);
                    n = 16508;
                    int n100 = n2 = (0x407F | 0x531649F0) - (0x407F & 0x531649F0);
                    int n101 = n2;
                    int n102 = (n100 + 1393969648 - (n100 & 0x531649F0) * 2 | n) - (n101 + 1393969648 - (n101 & 0x531649F0) * 2 & n);
                    n = 16508;
                    int n103 = n2 = (0x4007 | 0x531649F0) - (0x4007 & 0x531649F0);
                    int n104 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n102] = n103 + 1393969648 - (n103 & 0x531649F0) * 2 & ~n | ~(n104 + 1393969648 - (n104 & 0x531649F0) * 2) & n;
                    n = 3091;
                    int n105 = n2 = (0xC24 | 0x531649F0) - (0xC24 & 0x531649F0);
                    int n106 = n2;
                    int n107 = (n105 + 1393969648 - (n105 & 0x531649F0) * 2 | n) & (~(n106 + 1393969648 - (n106 & 0x531649F0) * 2) | ~n);
                    n = 3091;
                    int n108 = n2 = (0xC38 | 0x531649F0) - (0xC38 & 0x531649F0);
                    int n109 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n107] = n108 + 1393969648 - (n108 & 0x531649F0) * 2 & ~n | ~(n109 + 1393969648 - (n109 & 0x531649F0) * 2) & n;
                    n = 31127;
                    int n110 = n2 = (0x7928 | 0x531649F0) - (0x7928 & 0x531649F0);
                    int n111 = n2;
                    int n112 = (n110 + 1393969648 - (n110 & 0x531649F0) * 2 | n) & (~(n111 + 1393969648 - (n111 & 0x531649F0) * 2) | ~n);
                    n = 31127;
                    int n113 = n2 = (0x26060F04 | 0x531649F0) - (0x26060F04 & 0x531649F0);
                    int n114 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n112] = (n113 + 1393969648 - (n113 & 0x531649F0) * 2 | n) & ~(n114 + 1393969648 - (n114 & 0x531649F0) * 2 & n);
                    n = 8339;
                    int n115 = n2 = (0x2038 | 0x531649F0) - (0x2038 & 0x531649F0);
                    int n116 = n2;
                    int n117 = (n115 + 1393969648 - (n115 & 0x531649F0) * 2 | n) & ~(n116 + 1393969648 - (n116 & 0x531649F0) * 2 & n);
                    n = 8339;
                    int n118 = n2 = (0xFFFFDF08 | 0x531649F0) - (0xFFFFDF08 & 0x531649F0);
                    int n119 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n117] = (n118 + 1393969648 - (n118 & 0x531649F0) * 2 | n) & ~(n119 + 1393969648 - (n119 & 0x531649F0) * 2 & n);
                    n = 4350;
                    int n120 = n2 = (0x10F8 | 0x531649F0) - (0x10F8 & 0x531649F0);
                    int n121 = n2;
                    int n122 = (n120 + 1393969648 - (n120 & 0x531649F0) * 2 | n) & ~(n121 + 1393969648 - (n121 & 0x531649F0) * 2 & n);
                    n = 4350;
                    int n123 = n2 = (0x10D7 | 0x531649F0) - (0x10D7 & 0x531649F0);
                    int n124 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n122] = n123 + 1393969648 - (n123 & 0x531649F0) * 2 & ~n | ~(n124 + 1393969648 - (n124 & 0x531649F0) * 2) & n;
                    n = 13641;
                    int n125 = n2 = (0x359E | 0x531649F0) - (0x359E & 0x531649F0);
                    int n126 = n2;
                    int n127 = (n125 + 1393969648 - (n125 & 0x531649F0) * 2 | n) - (n126 + 1393969648 - (n126 & 0x531649F0) * 2 & n);
                    n = 13641;
                    int n128 = n2 = (0x2020747F | 0x531649F0) - (0x2020747F & 0x531649F0);
                    int n129 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n127] = (n128 + 1393969648 - (n128 & 0x531649F0) * 2 | n) & (~(n129 + 1393969648 - (n129 & 0x531649F0) * 2) | ~n);
                    n = 34741;
                    int n130 = n2 = (0x8795 | 0x531649F0) - (0x8795 & 0x531649F0);
                    int n131 = n2;
                    int n132 = (n130 + 1393969648 - (n130 & 0x531649F0) * 2 | n) & ~(n131 + 1393969648 - (n131 & 0x531649F0) * 2 & n);
                    n = 34741;
                    int n133 = n2 = (0xFFFF7831 | 0x531649F0) - (0xFFFF7831 & 0x531649F0);
                    int n134 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n132] = (n133 + 1393969648 - (n133 & 0x531649F0) * 2 | n) - (n134 + 1393969648 - (n134 & 0x531649F0) * 2 & n);
                    n = 16674;
                    int n135 = n2 = (0x4175 | 0x531649F0) - (0x4175 & 0x531649F0);
                    int n136 = n2;
                    int n137 = (n135 + 1393969648 - (n135 & 0x531649F0) * 2 | n) - (n136 + 1393969648 - (n136 & 0x531649F0) * 2 & n);
                    n = 16674;
                    int n138 = n2 = (0xA545A387 | 0x531649F0) - (0xA545A387 & 0x531649F0);
                    int n139 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n137] = (n138 + 1393969648 - (n138 & 0x531649F0) * 2 | n) & (~(n139 + 1393969648 - (n139 & 0x531649F0) * 2) | ~n);
                    n = 28093;
                    int n140 = n2 = (0x6D25 | 0x531649F0) - (0x6D25 & 0x531649F0);
                    int n141 = n2;
                    int n142 = (n140 + 1393969648 - (n140 & 0x531649F0) * 2 | n) - (n141 + 1393969648 - (n141 & 0x531649F0) * 2 & n);
                    n = 28093;
                    int n143 = n2 = (0x6DC1 | 0x531649F0) - (0x6DC1 & 0x531649F0);
                    int n144 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n142] = (n143 + 1393969648 - (n143 & 0x531649F0) * 2 | n) & ~(n144 + 1393969648 - (n144 & 0x531649F0) * 2 & n);
                    n = 59877;
                    int n145 = n2 = (0xE919 | 0x531649F0) - (0xE919 & 0x531649F0);
                    int n146 = n2;
                    int n147 = (n145 + 1393969648 - (n145 & 0x531649F0) * 2 | n) - (n146 + 1393969648 - (n146 & 0x531649F0) * 2 & n);
                    n = 59877;
                    int n148 = n2 = (0xF925616B | 0x531649F0) - (0xF925616B & 0x531649F0);
                    int n149 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n147] = (n148 + 1393969648 - (n148 & 0x531649F0) * 2 | n) & ~(n149 + 1393969648 - (n149 & 0x531649F0) * 2 & n);
                    n = 52211;
                    int n150 = n2 = (0xCB2E | 0x531649F0) - (0xCB2E & 0x531649F0);
                    int n151 = n2;
                    int n152 = (n150 + 1393969648 - (n150 & 0x531649F0) * 2 | n) & ~(n151 + 1393969648 - (n151 & 0x531649F0) * 2 & n);
                    n = 52211;
                    int n153 = n2 = (0xFFFF3404 | 0x531649F0) - (0xFFFF3404 & 0x531649F0);
                    int n154 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n152] = n153 + 1393969648 - (n153 & 0x531649F0) * 2 & ~n | ~(n154 + 1393969648 - (n154 & 0x531649F0) * 2) & n;
                    n = 57064;
                    int n155 = n2 = (0xDEF7 | 0x531649F0) - (0xDEF7 & 0x531649F0);
                    int n156 = n2;
                    int n157 = (n155 + 1393969648 - (n155 & 0x531649F0) * 2 | n) & (~(n156 + 1393969648 - (n156 & 0x531649F0) * 2) | ~n);
                    n = 57064;
                    int n158 = n2 = (0xDEB6 | 0x531649F0) - (0xDEB6 & 0x531649F0);
                    int n159 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n157] = (n158 + 1393969648 - (n158 & 0x531649F0) * 2 | n) - (n159 + 1393969648 - (n159 & 0x531649F0) * 2 & n);
                    n = 7921;
                    int n160 = n2 = (0x1FE2 | 0x531649F0) - (0x1FE2 & 0x531649F0);
                    int n161 = n2;
                    int n162 = (n160 + 1393969648 - (n160 & 0x531649F0) * 2 | n) & (~(n161 + 1393969648 - (n161 & 0x531649F0) * 2) | ~n);
                    n = 7921;
                    int n163 = n2 = (0x1EF1 | 0x531649F0) - (0x1EF1 & 0x531649F0);
                    int n164 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n162] = (n163 + 1393969648 - (n163 & 0x531649F0) * 2 | n) - (n164 + 1393969648 - (n164 & 0x531649F0) * 2 & n);
                    n = 23777;
                    int n165 = n2 = (0x5C18 | 0x531649F0) - (0x5C18 & 0x531649F0);
                    int n166 = n2;
                    int n167 = n165 + 1393969648 - (n165 & 0x531649F0) * 2 & ~n | ~(n166 + 1393969648 - (n166 & 0x531649F0) * 2) & n;
                    n = 23777;
                    int n168 = n2 = (0xA545BE44 | 0x531649F0) - (0xA545BE44 & 0x531649F0);
                    int n169 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n167] = (n168 + 1393969648 - (n168 & 0x531649F0) * 2 | n) - (n169 + 1393969648 - (n169 & 0x531649F0) * 2 & n);
                    n = 62579;
                    int n170 = n2 = (0xF464 | 0x531649F0) - (0xF464 & 0x531649F0);
                    int n171 = n2;
                    int n172 = (n170 + 1393969648 - (n170 & 0x531649F0) * 2 | n) & (~(n171 + 1393969648 - (n171 & 0x531649F0) * 2) | ~n);
                    n = 62579;
                    int n173 = n2 = (0xF429 | 0x531649F0) - (0xF429 & 0x531649F0);
                    int n174 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n172] = (n173 + 1393969648 - (n173 & 0x531649F0) * 2 | n) & ~(n174 + 1393969648 - (n174 & 0x531649F0) * 2 & n);
                    n = 62925;
                    int n175 = n2 = (0xF5E6 | 0x531649F0) - (0xF5E6 & 0x531649F0);
                    int n176 = n2;
                    int n177 = (n175 + 1393969648 - (n175 & 0x531649F0) * 2 | n) & ~(n176 + 1393969648 - (n176 & 0x531649F0) * 2 & n);
                    n = 62925;
                    int n178 = n2 = (0xF5DB | 0x531649F0) - (0xF5DB & 0x531649F0);
                    int n179 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n177] = (n178 + 1393969648 - (n178 & 0x531649F0) * 2 | n) & ~(n179 + 1393969648 - (n179 & 0x531649F0) * 2 & n);
                    n = 23085;
                    int n180 = n2 = (0x5AE1 | 0x531649F0) - (0x5AE1 & 0x531649F0);
                    int n181 = n2;
                    int n182 = (n180 + 1393969648 - (n180 & 0x531649F0) * 2 | n) - (n181 + 1393969648 - (n181 & 0x531649F0) * 2 & n);
                    n = 23085;
                    int n183 = n2 = (0x5A1A | 0x531649F0) - (0x5A1A & 0x531649F0);
                    int n184 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n182] = (n183 + 1393969648 - (n183 & 0x531649F0) * 2 | n) & ~(n184 + 1393969648 - (n184 & 0x531649F0) * 2 & n);
                    n3 = (0x517DCE5 | 0x94BA72B2) - (0x517DCE5 & 0x94BA72B2);
                    continue block56;
                }
                case 85449957: {
                    n = 36424;
                    int n185 = n2 = (0x8E01 | 0x531649F0) - (0x8E01 & 0x531649F0);
                    int n186 = n2;
                    int n187 = n185 + 1393969648 - (n185 & 0x531649F0) * 2 & ~n | ~(n186 + 1393969648 - (n186 & 0x531649F0) * 2) & n;
                    n = 36424;
                    int n188 = n2 = (0xFFFF71A2 | 0x531649F0) - (0xFFFF71A2 & 0x531649F0);
                    int n189 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n187] = (n188 + 1393969648 - (n188 & 0x531649F0) * 2 | n) & ~(n189 + 1393969648 - (n189 & 0x531649F0) * 2 & n);
                    n3 = (0x832AEE2D | 0x94BA72B2) - (0x832AEE2D & 0x94BA72B2);
                    continue block56;
                }
                case -2094338515: {
                    n = 7991;
                    int n190 = n2 = (0x1F69 | 0x531649F0) - (0x1F69 & 0x531649F0);
                    int n191 = n2;
                    int n192 = (n190 + 1393969648 - (n190 & 0x531649F0) * 2 | n) & (~(n191 + 1393969648 - (n191 & 0x531649F0) * 2) | ~n);
                    n = 7991;
                    int n193 = n2 = (0xFFFFE0B2 | 0x531649F0) - (0xFFFFE0B2 & 0x531649F0);
                    int n194 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n192] = n193 + 1393969648 - (n193 & 0x531649F0) * 2 & ~n | ~(n194 + 1393969648 - (n194 & 0x531649F0) * 2) & n;
                    n = 41892;
                    int n195 = n2 = (0xA382 | 0x531649F0) - (0xA382 & 0x531649F0);
                    int n196 = n2;
                    int n197 = (n195 + 1393969648 - (n195 & 0x531649F0) * 2 | n) & (~(n196 + 1393969648 - (n196 & 0x531649F0) * 2) | ~n);
                    n = 41892;
                    int n198 = n2 = (0xECED2E7D | 0x531649F0) - (0xECED2E7D & 0x531649F0);
                    int n199 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n197] = (n198 + 1393969648 - (n198 & 0x531649F0) * 2 | n) - (n199 + 1393969648 - (n199 & 0x531649F0) * 2 & n);
                    n3 = (0x909D5678 | 0x94BA72B2) - (0x909D5678 & 0x94BA72B2);
                    continue block56;
                }
                case -1868736904: {
                    n = 7098;
                    int n200 = n2 = (0x1BC5 | 0x531649F0) - (0x1BC5 & 0x531649F0);
                    int n201 = n2;
                    int n202 = (n200 + 1393969648 - (n200 & 0x531649F0) * 2 | n) - (n201 + 1393969648 - (n201 & 0x531649F0) * 2 & n);
                    n = 7098;
                    int n203 = n2 = (0x1B99 | 0x531649F0) - (0x1B99 & 0x531649F0);
                    int n204 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n202] = n203 + 1393969648 - (n203 & 0x531649F0) * 2 & ~n | ~(n204 + 1393969648 - (n204 & 0x531649F0) * 2) & n;
                    n = 63941;
                    int n205 = n2 = (0xF9D0 | 0x531649F0) - (0xF9D0 & 0x531649F0);
                    int n206 = n2;
                    int n207 = n205 + 1393969648 - (n205 & 0x531649F0) * 2 & ~n | ~(n206 + 1393969648 - (n206 & 0x531649F0) * 2) & n;
                    n = 63941;
                    int n208 = n2 = (0xFFFF0637 | 0x531649F0) - (0xFFFF0637 & 0x531649F0);
                    int n209 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n207] = (n208 + 1393969648 - (n208 & 0x531649F0) * 2 | n) & ~(n209 + 1393969648 - (n209 & 0x531649F0) * 2 & n);
                    n = 23356;
                    int n210 = n2 = (0x5B74 | 0x531649F0) - (0x5B74 & 0x531649F0);
                    int n211 = n2;
                    int n212 = (n210 + 1393969648 - (n210 & 0x531649F0) * 2 | n) - (n211 + 1393969648 - (n211 & 0x531649F0) * 2 & n);
                    n = 23356;
                    int n213 = n2 = (0x5B5D | 0x531649F0) - (0x5B5D & 0x531649F0);
                    int n214 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n212] = (n213 + 1393969648 - (n213 & 0x531649F0) * 2 | n) & ~(n214 + 1393969648 - (n214 & 0x531649F0) * 2 & n);
                    n = 35513;
                    int n215 = n2 = (0x8AFA | 0x531649F0) - (0x8AFA & 0x531649F0);
                    int n216 = n2;
                    int n217 = (n215 + 1393969648 - (n215 & 0x531649F0) * 2 | n) & (~(n216 + 1393969648 - (n216 & 0x531649F0) * 2) | ~n);
                    n = 35513;
                    int n218 = n2 = (0xFFFF7568 | 0x531649F0) - (0xFFFF7568 & 0x531649F0);
                    int n219 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n217] = n218 + 1393969648 - (n218 & 0x531649F0) * 2 & ~n | ~(n219 + 1393969648 - (n219 & 0x531649F0) * 2) & n;
                    n = 53203;
                    int n220 = n2 = (0xCECF | 0x531649F0) - (0xCECF & 0x531649F0);
                    int n221 = n2;
                    int n222 = n220 + 1393969648 - (n220 & 0x531649F0) * 2 & ~n | ~(n221 + 1393969648 - (n221 & 0x531649F0) * 2) & n;
                    n = 53203;
                    int n223 = n2 = (0xCFFC | 0x531649F0) - (0xCFFC & 0x531649F0);
                    int n224 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n222] = (n223 + 1393969648 - (n223 & 0x531649F0) * 2 | n) & ~(n224 + 1393969648 - (n224 & 0x531649F0) * 2 & n);
                    n = 66073;
                    int n225 = n2 = (0x102A7 | 0x531649F0) - (0x102A7 & 0x531649F0);
                    int n226 = n2;
                    int n227 = n225 + 1393969648 - (n225 & 0x531649F0) * 2 & ~n | ~(n226 + 1393969648 - (n226 & 0x531649F0) * 2) & n;
                    n = 66073;
                    int n228 = n2 = (0x10217 | 0x531649F0) - (0x10217 & 0x531649F0);
                    int n229 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n227] = (n228 + 1393969648 - (n228 & 0x531649F0) * 2 | n) & (~(n229 + 1393969648 - (n229 & 0x531649F0) * 2) | ~n);
                    n3 = (0x86794423 | 0x94BA72B2) - (0x86794423 & 0x94BA72B2);
                    continue block56;
                }
                case -2038873053: {
                    n = 23472;
                    int n230 = n2 = (0x5BE9 | 0x531649F0) - (0x5BE9 & 0x531649F0);
                    int n231 = n2;
                    int n232 = (n230 + 1393969648 - (n230 & 0x531649F0) * 2 | n) - (n231 + 1393969648 - (n231 & 0x531649F0) * 2 & n);
                    n = 23472;
                    int n233 = n2 = (0x5BB6 | 0x531649F0) - (0x5BB6 & 0x531649F0);
                    int n234 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n232] = (n233 + 1393969648 - (n233 & 0x531649F0) * 2 | n) - (n234 + 1393969648 - (n234 & 0x531649F0) * 2 & n);
                    n = 49796;
                    int n235 = n2 = (0xC249 | 0x531649F0) - (0xC249 & 0x531649F0);
                    int n236 = n2;
                    int n237 = n235 + 1393969648 - (n235 & 0x531649F0) * 2 & ~n | ~(n236 + 1393969648 - (n236 & 0x531649F0) * 2) & n;
                    n = 49796;
                    int n238 = n2 = (0xC2C8 | 0x531649F0) - (0xC2C8 & 0x531649F0);
                    int n239 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n237] = (n238 + 1393969648 - (n238 & 0x531649F0) * 2 | n) - (n239 + 1393969648 - (n239 & 0x531649F0) * 2 & n);
                    n = 59920;
                    int n240 = n2 = (0xEA6A | 0x531649F0) - (0xEA6A & 0x531649F0);
                    int n241 = n2;
                    int n242 = (n240 + 1393969648 - (n240 & 0x531649F0) * 2 | n) & ~(n241 + 1393969648 - (n241 & 0x531649F0) * 2 & n);
                    n = 59920;
                    int n243 = n2 = (0xEA19 | 0x531649F0) - (0xEA19 & 0x531649F0);
                    int n244 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n242] = (n243 + 1393969648 - (n243 & 0x531649F0) * 2 | n) & (~(n244 + 1393969648 - (n244 & 0x531649F0) * 2) | ~n);
                    n3 = (0xDE53CCF7 | 0x94BA72B2) - (0xDE53CCF7 & 0x94BA72B2);
                    continue block56;
                }
                case -564933385: {
                    n = 52538;
                    int n245 = n2 = (0xCD9B | 0x531649F0) - (0xCD9B & 0x531649F0);
                    int n246 = n2;
                    int n247 = n245 + 1393969648 - (n245 & 0x531649F0) * 2 & ~n | ~(n246 + 1393969648 - (n246 & 0x531649F0) * 2) & n;
                    n = 52538;
                    int n248 = n2 = (0xCD36 | 0x531649F0) - (0xCD36 & 0x531649F0);
                    int n249 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n247] = n248 + 1393969648 - (n248 & 0x531649F0) * 2 & ~n | ~(n249 + 1393969648 - (n249 & 0x531649F0) * 2) & n;
                    n3 = (0xD6F26CDC | 0x94BA72B2) - (0xD6F26CDC & 0x94BA72B2);
                    continue block56;
                }
                case -688755492: {
                    n = 6136;
                    int n250 = n2 = (0x17BD | 0x531649F0) - (0x17BD & 0x531649F0);
                    int n251 = n2;
                    int n252 = n250 + 1393969648 - (n250 & 0x531649F0) * 2 & ~n | ~(n251 + 1393969648 - (n251 & 0x531649F0) * 2) & n;
                    n = 6136;
                    int n253 = n2 = (0x17D2 | 0x531649F0) - (0x17D2 & 0x531649F0);
                    int n254 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n252] = (n253 + 1393969648 - (n253 & 0x531649F0) * 2 | n) & ~(n254 + 1393969648 - (n254 & 0x531649F0) * 2 & n);
                    n = 27451;
                    int n255 = n2 = (0x6BA6 | 0x531649F0) - (0x6BA6 & 0x531649F0);
                    int n256 = n2;
                    int n257 = n255 + 1393969648 - (n255 & 0x531649F0) * 2 & ~n | ~(n256 + 1393969648 - (n256 & 0x531649F0) * 2) & n;
                    n = 27451;
                    int n258 = n2 = (0x6B0F | 0x531649F0) - (0x6B0F & 0x531649F0);
                    int n259 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n257] = n258 + 1393969648 - (n258 & 0x531649F0) * 2 & ~n | ~(n259 + 1393969648 - (n259 & 0x531649F0) * 2) & n;
                    n = 56417;
                    int n260 = n2 = (0xDC5B | 0x531649F0) - (0xDC5B & 0x531649F0);
                    int n261 = n2;
                    int n262 = (n260 + 1393969648 - (n260 & 0x531649F0) * 2 | n) & (~(n261 + 1393969648 - (n261 & 0x531649F0) * 2) | ~n);
                    n = 56417;
                    int n263 = n2 = (0xDCF4 | 0x531649F0) - (0xDCF4 & 0x531649F0);
                    int n264 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n262] = (n263 + 1393969648 - (n263 & 0x531649F0) * 2 | n) - (n264 + 1393969648 - (n264 & 0x531649F0) * 2 & n);
                    n = 60592;
                    int n265 = n2 = (0xEC58 | 0x531649F0) - (0xEC58 & 0x531649F0);
                    int n266 = n2;
                    int n267 = (n265 + 1393969648 - (n265 & 0x531649F0) * 2 | n) & (~(n266 + 1393969648 - (n266 & 0x531649F0) * 2) | ~n);
                    n = 60592;
                    int n268 = n2 = (0xEC94 | 0x531649F0) - (0xEC94 & 0x531649F0);
                    int n269 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n267] = (n268 + 1393969648 - (n268 & 0x531649F0) * 2 | n) & (~(n269 + 1393969648 - (n269 & 0x531649F0) * 2) | ~n);
                    n = 47040;
                    int n270 = n2 = (0xB7A6 | 0x531649F0) - (0xB7A6 & 0x531649F0);
                    int n271 = n2;
                    int n272 = n270 + 1393969648 - (n270 & 0x531649F0) * 2 & ~n | ~(n271 + 1393969648 - (n271 & 0x531649F0) * 2) & n;
                    n = 47040;
                    int n273 = n2 = (0xFFFF4824 | 0x531649F0) - (0xFFFF4824 & 0x531649F0);
                    int n274 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n272] = (n273 + 1393969648 - (n273 & 0x531649F0) * 2 | n) & ~(n274 + 1393969648 - (n274 & 0x531649F0) * 2 & n);
                    n = 21659;
                    int n275 = n2 = (0x5434 | 0x531649F0) - (0x5434 & 0x531649F0);
                    int n276 = n2;
                    int n277 = n275 + 1393969648 - (n275 & 0x531649F0) * 2 & ~n | ~(n276 + 1393969648 - (n276 & 0x531649F0) * 2) & n;
                    n = 21659;
                    int n278 = n2 = (0x4F420BF9 | 0x531649F0) - (0x4F420BF9 & 0x531649F0);
                    int n279 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n277] = n278 + 1393969648 - (n278 & 0x531649F0) * 2 & ~n | ~(n279 + 1393969648 - (n279 & 0x531649F0) * 2) & n;
                    n = 9132;
                    int n280 = n2 = (0x22A6 | 0x531649F0) - (0x22A6 & 0x531649F0);
                    int n281 = n2;
                    int n282 = n280 + 1393969648 - (n280 & 0x531649F0) * 2 & ~n | ~(n281 + 1393969648 - (n281 & 0x531649F0) * 2) & n;
                    n = 9132;
                    int n283 = n2 = (0x23AD | 0x531649F0) - (0x23AD & 0x531649F0);
                    int n284 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n282] = (n283 + 1393969648 - (n283 & 0x531649F0) * 2 | n) & (~(n284 + 1393969648 - (n284 & 0x531649F0) * 2) | ~n);
                    n = 18356;
                    int n285 = n2 = (0x46AD | 0x531649F0) - (0x46AD & 0x531649F0);
                    int n286 = n2;
                    int n287 = (n285 + 1393969648 - (n285 & 0x531649F0) * 2 | n) - (n286 + 1393969648 - (n286 & 0x531649F0) * 2 & n);
                    n = 18356;
                    int n288 = n2 = (0x47B2 | 0x531649F0) - (0x47B2 & 0x531649F0);
                    int n289 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n287] = (n288 + 1393969648 - (n288 & 0x531649F0) * 2 | n) - (n289 + 1393969648 - (n289 & 0x531649F0) * 2 & n);
                    n = 30549;
                    int n290 = n2 = (0x773A | 0x531649F0) - (0x773A & 0x531649F0);
                    int n291 = n2;
                    int n292 = (n290 + 1393969648 - (n290 & 0x531649F0) * 2 | n) - (n291 + 1393969648 - (n291 & 0x531649F0) * 2 & n);
                    n = 30549;
                    int n293 = n2 = (0xFFFF88AB | 0x531649F0) - (0xFFFF88AB & 0x531649F0);
                    int n294 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n292] = (n293 + 1393969648 - (n293 & 0x531649F0) * 2 | n) & (~(n294 + 1393969648 - (n294 & 0x531649F0) * 2) | ~n);
                    n3 = (0x8C82AF2D | 0x94BA72B2) - (0x8C82AF2D & 0x94BA72B2);
                    continue block56;
                }
                case -1937592531: {
                    n = 35589;
                    int n295 = n2 = (0x8B00 | 0x531649F0) - (0x8B00 & 0x531649F0);
                    int n296 = n2;
                    int n297 = n295 + 1393969648 - (n295 & 0x531649F0) * 2 & ~n | ~(n296 + 1393969648 - (n296 & 0x531649F0) * 2) & n;
                    n = 35589;
                    int n298 = n2 = (0xFFFF74A3 | 0x531649F0) - (0xFFFF74A3 & 0x531649F0);
                    int n299 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n297] = n298 + 1393969648 - (n298 & 0x531649F0) * 2 & ~n | ~(n299 + 1393969648 - (n299 & 0x531649F0) * 2) & n;
                    n = 50042;
                    int n300 = n2 = (0xC3C9 | 0x531649F0) - (0xC3C9 & 0x531649F0);
                    int n301 = n2;
                    int n302 = (n300 + 1393969648 - (n300 & 0x531649F0) * 2 | n) - (n301 + 1393969648 - (n301 & 0x531649F0) * 2 & n);
                    n = 50042;
                    int n303 = n2 = (0xC3DE | 0x531649F0) - (0xC3DE & 0x531649F0);
                    int n304 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n302] = n303 + 1393969648 - (n303 & 0x531649F0) * 2 & ~n | ~(n304 + 1393969648 - (n304 & 0x531649F0) * 2) & n;
                    n = 41630;
                    int n305 = n2 = (0xA23A | 0x531649F0) - (0xA23A & 0x531649F0);
                    int n306 = n2;
                    int n307 = n305 + 1393969648 - (n305 & 0x531649F0) * 2 & ~n | ~(n306 + 1393969648 - (n306 & 0x531649F0) * 2) & n;
                    n = 41630;
                    int n308 = n2 = (0xFFFF5D31 | 0x531649F0) - (0xFFFF5D31 & 0x531649F0);
                    int n309 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n307] = (n308 + 1393969648 - (n308 & 0x531649F0) * 2 | n) & (~(n309 + 1393969648 - (n309 & 0x531649F0) * 2) | ~n);
                    n = 62762;
                    int n310 = n2 = (0xF572 | 0x531649F0) - (0xF572 & 0x531649F0);
                    int n311 = n2;
                    int n312 = (n310 + 1393969648 - (n310 & 0x531649F0) * 2 | n) & ~(n311 + 1393969648 - (n311 & 0x531649F0) * 2 & n);
                    n = 62762;
                    int n313 = n2 = (0xF570 | 0x531649F0) - (0xF570 & 0x531649F0);
                    int n314 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n312] = (n313 + 1393969648 - (n313 & 0x531649F0) * 2 | n) & (~(n314 + 1393969648 - (n314 & 0x531649F0) * 2) | ~n);
                    n = 58322;
                    int n315 = n2 = (0xE3A4 | 0x531649F0) - (0xE3A4 & 0x531649F0);
                    int n316 = n2;
                    int n317 = (n315 + 1393969648 - (n315 & 0x531649F0) * 2 | n) & ~(n316 + 1393969648 - (n316 & 0x531649F0) * 2 & n);
                    n = 58322;
                    int n318 = n2 = (0xE3E1 | 0x531649F0) - (0xE3E1 & 0x531649F0);
                    int n319 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n317] = (n318 + 1393969648 - (n318 & 0x531649F0) * 2 | n) - (n319 + 1393969648 - (n319 & 0x531649F0) * 2 & n);
                    n3 = (0xCA6B909E | 0x94BA72B2) - (0xCA6B909E & 0x94BA72B2);
                    continue block56;
                }
                case -898920290: {
                    n = 40903;
                    int n320 = n2 = (0x9F67 | 0x531649F0) - (0x9F67 & 0x531649F0);
                    int n321 = n2;
                    int n322 = (n320 + 1393969648 - (n320 & 0x531649F0) * 2 | n) - (n321 + 1393969648 - (n321 & 0x531649F0) * 2 & n);
                    n = 40903;
                    int n323 = n2 = (0x9F9D | 0x531649F0) - (0x9F9D & 0x531649F0);
                    int n324 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n322] = (n323 + 1393969648 - (n323 & 0x531649F0) * 2 | n) - (n324 + 1393969648 - (n324 & 0x531649F0) * 2 & n);
                    n = 20480;
                    int n325 = n2 = (0x5062 | 0x531649F0) - (0x5062 & 0x531649F0);
                    int n326 = n2;
                    int n327 = n325 + 1393969648 - (n325 & 0x531649F0) * 2 & ~n | ~(n326 + 1393969648 - (n326 & 0x531649F0) * 2) & n;
                    n = 20480;
                    int n328 = n2 = (0xFFFFAFD9 | 0x531649F0) - (0xFFFFAFD9 & 0x531649F0);
                    int n329 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n327] = (n328 + 1393969648 - (n328 & 0x531649F0) * 2 | n) - (n329 + 1393969648 - (n329 & 0x531649F0) * 2 & n);
                    n = 30837;
                    int n330 = n2 = (0x785D | 0x531649F0) - (0x785D & 0x531649F0);
                    int n331 = n2;
                    int n332 = n330 + 1393969648 - (n330 & 0x531649F0) * 2 & ~n | ~(n331 + 1393969648 - (n331 & 0x531649F0) * 2) & n;
                    n = 30837;
                    int n333 = n2 = (0xFFFF878A | 0x531649F0) - (0xFFFF878A & 0x531649F0);
                    int n334 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n332] = n333 + 1393969648 - (n333 & 0x531649F0) * 2 & ~n | ~(n334 + 1393969648 - (n334 & 0x531649F0) * 2) & n;
                    n = 19297;
                    int n335 = n2 = (0x4B59 | 0x531649F0) - (0x4B59 & 0x531649F0);
                    int n336 = n2;
                    int n337 = n335 + 1393969648 - (n335 & 0x531649F0) * 2 & ~n | ~(n336 + 1393969648 - (n336 & 0x531649F0) * 2) & n;
                    n = 19297;
                    int n338 = n2 = (0xFFFFB4DA | 0x531649F0) - (0xFFFFB4DA & 0x531649F0);
                    int n339 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n337] = (n338 + 1393969648 - (n338 & 0x531649F0) * 2 | n) & ~(n339 + 1393969648 - (n339 & 0x531649F0) * 2 & n);
                    n3 = (0xB46BF902 | 0x94BA72B2) - (0xB46BF902 & 0x94BA72B2);
                    continue block56;
                }
                case -1267992318: {
                    n = 26378;
                    int n340 = n2 = (0x6782 | 0x531649F0) - (0x6782 & 0x531649F0);
                    int n341 = n2;
                    int n342 = n340 + 1393969648 - (n340 & 0x531649F0) * 2 & ~n | ~(n341 + 1393969648 - (n341 & 0x531649F0) * 2) & n;
                    n = 26378;
                    int n343 = n2 = (0xE74C5A7D | 0x531649F0) - (0xE74C5A7D & 0x531649F0);
                    int n344 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n342] = (n343 + 1393969648 - (n343 & 0x531649F0) * 2 | n) - (n344 + 1393969648 - (n344 & 0x531649F0) * 2 & n);
                    n = 43709;
                    int n345 = n2 = (0xAAA9 | 0x531649F0) - (0xAAA9 & 0x531649F0);
                    int n346 = n2;
                    int n347 = n345 + 1393969648 - (n345 & 0x531649F0) * 2 & ~n | ~(n346 + 1393969648 - (n346 & 0x531649F0) * 2) & n;
                    n = 43709;
                    int n348 = n2 = (0xAAFD | 0x531649F0) - (0xAAFD & 0x531649F0);
                    int n349 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n347] = (n348 + 1393969648 - (n348 & 0x531649F0) * 2 | n) - (n349 + 1393969648 - (n349 & 0x531649F0) * 2 & n);
                    n = 55317;
                    int n350 = n2 = (0xD917 | 0x531649F0) - (0xD917 & 0x531649F0);
                    int n351 = n2;
                    int n352 = (n350 + 1393969648 - (n350 & 0x531649F0) * 2 | n) - (n351 + 1393969648 - (n351 & 0x531649F0) * 2 & n);
                    n = 55317;
                    int n353 = n2 = (0xD800 | 0x531649F0) - (0xD800 & 0x531649F0);
                    int n354 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n352] = (n353 + 1393969648 - (n353 & 0x531649F0) * 2 | n) - (n354 + 1393969648 - (n354 & 0x531649F0) * 2 & n);
                    n = 47322;
                    int n355 = n2 = (0xB880 | 0x531649F0) - (0xB880 & 0x531649F0);
                    int n356 = n2;
                    int n357 = (n355 + 1393969648 - (n355 & 0x531649F0) * 2 | n) & (~(n356 + 1393969648 - (n356 & 0x531649F0) * 2) | ~n);
                    n = 47322;
                    int n358 = n2 = (0x31981905 | 0x531649F0) - (0x31981905 & 0x531649F0);
                    int n359 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n357] = (n358 + 1393969648 - (n358 & 0x531649F0) * 2 | n) & (~(n359 + 1393969648 - (n359 & 0x531649F0) * 2) | ~n);
                    n = 5305;
                    int n360 = n2 = (0x147C | 0x531649F0) - (0x147C & 0x531649F0);
                    int n361 = n2;
                    int n362 = n360 + 1393969648 - (n360 & 0x531649F0) * 2 & ~n | ~(n361 + 1393969648 - (n361 & 0x531649F0) * 2) & n;
                    n = 5305;
                    int n363 = n2 = (0x14B6 | 0x531649F0) - (0x14B6 & 0x531649F0);
                    int n364 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n362] = (n363 + 1393969648 - (n363 & 0x531649F0) * 2 | n) - (n364 + 1393969648 - (n364 & 0x531649F0) * 2 & n);
                    n = 40040;
                    int n365 = n2 = (0x9CDD | 0x531649F0) - (0x9CDD & 0x531649F0);
                    int n366 = n2;
                    int n367 = (n365 + 1393969648 - (n365 & 0x531649F0) * 2 | n) & (~(n366 + 1393969648 - (n366 & 0x531649F0) * 2) | ~n);
                    n = 40040;
                    int n368 = n2 = (0xFFFF63AC | 0x531649F0) - (0xFFFF63AC & 0x531649F0);
                    int n369 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n367] = (n368 + 1393969648 - (n368 & 0x531649F0) * 2 | n) & ~(n369 + 1393969648 - (n369 & 0x531649F0) * 2 & n);
                    n = 2599;
                    int n370 = n2 = (0xAA8 | 0x531649F0) - (0xAA8 & 0x531649F0);
                    int n371 = n2;
                    int n372 = (n370 + 1393969648 - (n370 & 0x531649F0) * 2 | n) - (n371 + 1393969648 - (n371 & 0x531649F0) * 2 & n);
                    n = 2599;
                    int n373 = n2 = (0xA2A | 0x531649F0) - (0xA2A & 0x531649F0);
                    int n374 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n372] = (n373 + 1393969648 - (n373 & 0x531649F0) * 2 | n) & ~(n374 + 1393969648 - (n374 & 0x531649F0) * 2 & n);
                    n = 52812;
                    int n375 = n2 = (0xCF58 | 0x531649F0) - (0xCF58 & 0x531649F0);
                    int n376 = n2;
                    int n377 = (n375 + 1393969648 - (n375 & 0x531649F0) * 2 | n) & (~(n376 + 1393969648 - (n376 & 0x531649F0) * 2) | ~n);
                    n = 52812;
                    int n378 = n2 = (0xCE4D | 0x531649F0) - (0xCE4D & 0x531649F0);
                    int n379 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n377] = n378 + 1393969648 - (n378 & 0x531649F0) * 2 & ~n | ~(n379 + 1393969648 - (n379 & 0x531649F0) * 2) & n;
                    n3 = (0x5789D0C6 | 0x94BA72B2) - (0x5789D0C6 & 0x94BA72B2);
                    continue block56;
                }
                case 1468649670: {
                    n = 52544;
                    int n380 = n2 = (0xCD9E | 0x531649F0) - (0xCD9E & 0x531649F0);
                    int n381 = n2;
                    int n382 = (n380 + 1393969648 - (n380 & 0x531649F0) * 2 | n) - (n381 + 1393969648 - (n381 & 0x531649F0) * 2 & n);
                    n = 52544;
                    int n383 = n2 = (0xCDCA | 0x531649F0) - (0xCDCA & 0x531649F0);
                    int n384 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n382] = n383 + 1393969648 - (n383 & 0x531649F0) * 2 & ~n | ~(n384 + 1393969648 - (n384 & 0x531649F0) * 2) & n;
                    n = 47568;
                    int n385 = n2 = (0xB923 | 0x531649F0) - (0xB923 & 0x531649F0);
                    int n386 = n2;
                    int n387 = (n385 + 1393969648 - (n385 & 0x531649F0) * 2 | n) & (~(n386 + 1393969648 - (n386 & 0x531649F0) * 2) | ~n);
                    n = 47568;
                    int n388 = n2 = (0xFFFF464E | 0x531649F0) - (0xFFFF464E & 0x531649F0);
                    int n389 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n387] = (n388 + 1393969648 - (n388 & 0x531649F0) * 2 | n) & ~(n389 + 1393969648 - (n389 & 0x531649F0) * 2 & n);
                    n = 15131;
                    int n390 = n2 = (0x3B66 | 0x531649F0) - (0x3B66 & 0x531649F0);
                    int n391 = n2;
                    int n392 = n390 + 1393969648 - (n390 & 0x531649F0) * 2 & ~n | ~(n391 + 1393969648 - (n391 & 0x531649F0) * 2) & n;
                    n = 15131;
                    int n393 = n2 = (0xFFFFC49A | 0x531649F0) - (0xFFFFC49A & 0x531649F0);
                    int n394 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n392] = (n393 + 1393969648 - (n393 & 0x531649F0) * 2 | n) & (~(n394 + 1393969648 - (n394 & 0x531649F0) * 2) | ~n);
                    n = 41459;
                    int n395 = n2 = (0xA161 | 0x531649F0) - (0xA161 & 0x531649F0);
                    int n396 = n2;
                    int n397 = n395 + 1393969648 - (n395 & 0x531649F0) * 2 & ~n | ~(n396 + 1393969648 - (n396 & 0x531649F0) * 2) & n;
                    n = 41459;
                    int n398 = n2 = (0xA5454356 | 0x531649F0) - (0xA5454356 & 0x531649F0);
                    int n399 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n397] = (n398 + 1393969648 - (n398 & 0x531649F0) * 2 | n) - (n399 + 1393969648 - (n399 & 0x531649F0) * 2 & n);
                    n = 58690;
                    int n400 = n2 = (0xE459 | 0x531649F0) - (0xE459 & 0x531649F0);
                    int n401 = n2;
                    int n402 = (n400 + 1393969648 - (n400 & 0x531649F0) * 2 | n) - (n401 + 1393969648 - (n401 & 0x531649F0) * 2 & n);
                    n = 58690;
                    int n403 = n2 = (0xE543 | 0x531649F0) - (0xE543 & 0x531649F0);
                    int n404 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n402] = (n403 + 1393969648 - (n403 & 0x531649F0) * 2 | n) - (n404 + 1393969648 - (n404 & 0x531649F0) * 2 & n);
                    n = 23092;
                    int n405 = n2 = (0x5A7F | 0x531649F0) - (0x5A7F & 0x531649F0);
                    int n406 = n2;
                    int n407 = (n405 + 1393969648 - (n405 & 0x531649F0) * 2 | n) - (n406 + 1393969648 - (n406 & 0x531649F0) * 2 & n);
                    n = 23092;
                    int n408 = n2 = (0x5A6E | 0x531649F0) - (0x5A6E & 0x531649F0);
                    int n409 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n407] = (n408 + 1393969648 - (n408 & 0x531649F0) * 2 | n) & ~(n409 + 1393969648 - (n409 & 0x531649F0) * 2 & n);
                    n = 23321;
                    int n410 = n2 = (0x5B37 | 0x531649F0) - (0x5B37 & 0x531649F0);
                    int n411 = n2;
                    int n412 = (n410 + 1393969648 - (n410 & 0x531649F0) * 2 | n) - (n411 + 1393969648 - (n411 & 0x531649F0) * 2 & n);
                    n = 23321;
                    int n413 = n2 = (0xFFFFA4F5 | 0x531649F0) - (0xFFFFA4F5 & 0x531649F0);
                    int n414 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n412] = (n413 + 1393969648 - (n413 & 0x531649F0) * 2 | n) - (n414 + 1393969648 - (n414 & 0x531649F0) * 2 & n);
                    n3 = (0x852087FA | 0x94BA72B2) - (0x852087FA & 0x94BA72B2);
                    continue block56;
                }
                case -2061465606: {
                    n = 20338;
                    int n415 = n2 = (0x4FC6 | 0x531649F0) - (0x4FC6 & 0x531649F0);
                    int n416 = n2;
                    int n417 = (n415 + 1393969648 - (n415 & 0x531649F0) * 2 | n) & (~(n416 + 1393969648 - (n416 & 0x531649F0) * 2) | ~n);
                    n = 20338;
                    int n418 = n2 = (0xFFFFB0EA | 0x531649F0) - (0xFFFFB0EA & 0x531649F0);
                    int n419 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n417] = (n418 + 1393969648 - (n418 & 0x531649F0) * 2 | n) & ~(n419 + 1393969648 - (n419 & 0x531649F0) * 2 & n);
                    n = 32051;
                    int n420 = n2 = (0x7D88 | 0x531649F0) - (0x7D88 & 0x531649F0);
                    int n421 = n2;
                    int n422 = n420 + 1393969648 - (n420 & 0x531649F0) * 2 & ~n | ~(n421 + 1393969648 - (n421 & 0x531649F0) * 2) & n;
                    n = 32051;
                    int n423 = n2 = (0xFFFF82C4 | 0x531649F0) - (0xFFFF82C4 & 0x531649F0);
                    int n424 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n422] = (n423 + 1393969648 - (n423 & 0x531649F0) * 2 | n) & ~(n424 + 1393969648 - (n424 & 0x531649F0) * 2 & n);
                    n = 65818;
                    int n425 = n2 = (0x1012A | 0x531649F0) - (0x1012A & 0x531649F0);
                    int n426 = n2;
                    int n427 = n425 + 1393969648 - (n425 & 0x531649F0) * 2 & ~n | ~(n426 + 1393969648 - (n426 & 0x531649F0) * 2) & n;
                    n = 65818;
                    int n428 = n2 = (0xA544E3BF | 0x531649F0) - (0xA544E3BF & 0x531649F0);
                    int n429 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n427] = (n428 + 1393969648 - (n428 & 0x531649F0) * 2 | n) - (n429 + 1393969648 - (n429 & 0x531649F0) * 2 & n);
                    n = 42029;
                    int n430 = n2 = (0xA52A | 0x531649F0) - (0xA52A & 0x531649F0);
                    int n431 = n2;
                    int n432 = (n430 + 1393969648 - (n430 & 0x531649F0) * 2 | n) - (n431 + 1393969648 - (n431 & 0x531649F0) * 2 & n);
                    n = 42029;
                    int n433 = n2 = (0xA42C | 0x531649F0) - (0xA42C & 0x531649F0);
                    int n434 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n432] = n433 + 1393969648 - (n433 & 0x531649F0) * 2 & ~n | ~(n434 + 1393969648 - (n434 & 0x531649F0) * 2) & n;
                    n = 19115;
                    int n435 = n2 = (0x4A59 | 0x531649F0) - (0x4A59 & 0x531649F0);
                    int n436 = n2;
                    int n437 = (n435 + 1393969648 - (n435 & 0x531649F0) * 2 | n) & ~(n436 + 1393969648 - (n436 & 0x531649F0) * 2 & n);
                    n = 19115;
                    int n438 = n2 = (0x4AB2 | 0x531649F0) - (0x4AB2 & 0x531649F0);
                    int n439 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n437] = (n438 + 1393969648 - (n438 & 0x531649F0) * 2 | n) - (n439 + 1393969648 - (n439 & 0x531649F0) * 2 & n);
                    n = 41130;
                    int n440 = n2 = (0xA0B6 | 0x531649F0) - (0xA0B6 & 0x531649F0);
                    int n441 = n2;
                    int n442 = (n440 + 1393969648 - (n440 & 0x531649F0) * 2 | n) - (n441 + 1393969648 - (n441 & 0x531649F0) * 2 & n);
                    n = 41130;
                    int n443 = n2 = (0xA0E4 | 0x531649F0) - (0xA0E4 & 0x531649F0);
                    int n444 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n442] = n443 + 1393969648 - (n443 & 0x531649F0) * 2 & ~n | ~(n444 + 1393969648 - (n444 & 0x531649F0) * 2) & n;
                    n3 = (0x8F0285F | 0x94BA72B2) - (0x8F0285F & 0x94BA72B2);
                    continue block56;
                }
                case 149956703: {
                    n = 58364;
                    int n445 = n2 = (0xE368 | 0x531649F0) - (0xE368 & 0x531649F0);
                    int n446 = n2;
                    int n447 = (n445 + 1393969648 - (n445 & 0x531649F0) * 2 | n) & ~(n446 + 1393969648 - (n446 & 0x531649F0) * 2 & n);
                    n = 58364;
                    int n448 = n2 = (0xE3F7 | 0x531649F0) - (0xE3F7 & 0x531649F0);
                    int n449 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n447] = n448 + 1393969648 - (n448 & 0x531649F0) * 2 & ~n | ~(n449 + 1393969648 - (n449 & 0x531649F0) * 2) & n;
                    n3 = (0x4393CA23 | 0x94BA72B2) - (0x4393CA23 & 0x94BA72B2);
                    continue block56;
                }
                case 1133759011: {
                    n = 50721;
                    int n450 = n2 = (0xC6C2 | 0x531649F0) - (0xC6C2 & 0x531649F0);
                    int n451 = n2;
                    int n452 = (n450 + 1393969648 - (n450 & 0x531649F0) * 2 | n) & (~(n451 + 1393969648 - (n451 & 0x531649F0) * 2) | ~n);
                    n = 50721;
                    int n453 = n2 = (0xC633 | 0x531649F0) - (0xC633 & 0x531649F0);
                    int n454 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n452] = (n453 + 1393969648 - (n453 & 0x531649F0) * 2 | n) - (n454 + 1393969648 - (n454 & 0x531649F0) * 2 & n);
                    n = 67012;
                    int n455 = n2 = (0x10507 | 0x531649F0) - (0x10507 & 0x531649F0);
                    int n456 = n2;
                    int n457 = (n455 + 1393969648 - (n455 & 0x531649F0) * 2 | n) & (~(n456 + 1393969648 - (n456 & 0x531649F0) * 2) | ~n);
                    n = 67012;
                    int n458 = n2 = (0xA544E761 | 0x531649F0) - (0xA544E761 & 0x531649F0);
                    int n459 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n457] = (n458 + 1393969648 - (n458 & 0x531649F0) * 2 | n) - (n459 + 1393969648 - (n459 & 0x531649F0) * 2 & n);
                    n = 69354;
                    int n460 = n2 = (0x10EE0 | 0x531649F0) - (0x10EE0 & 0x531649F0);
                    int n461 = n2;
                    int n462 = (n460 + 1393969648 - (n460 & 0x531649F0) * 2 | n) & ~(n461 + 1393969648 - (n461 & 0x531649F0) * 2 & n);
                    n = 69354;
                    int n463 = n2 = (0x10EB0 | 0x531649F0) - (0x10EB0 & 0x531649F0);
                    int n464 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n462] = (n463 + 1393969648 - (n463 & 0x531649F0) * 2 | n) - (n464 + 1393969648 - (n464 & 0x531649F0) * 2 & n);
                    n = 20463;
                    int n465 = n2 = (0x4F5F | 0x531649F0) - (0x4F5F & 0x531649F0);
                    int n466 = n2;
                    int n467 = (n465 + 1393969648 - (n465 & 0x531649F0) * 2 | n) & (~(n466 + 1393969648 - (n466 & 0x531649F0) * 2) | ~n);
                    n = 20463;
                    int n468 = n2 = (0xFFFFB008 | 0x531649F0) - (0xFFFFB008 & 0x531649F0);
                    int n469 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n467] = (n468 + 1393969648 - (n468 & 0x531649F0) * 2 | n) & ~(n469 + 1393969648 - (n469 & 0x531649F0) * 2 & n);
                    n3 = (0xA39AE0A3 | 0x94BA72B2) - (0xA39AE0A3 & 0x94BA72B2);
                    continue block56;
                }
                case -1550131037: {
                    n = 13854;
                    int n470 = n2 = (0x3706 | 0x531649F0) - (0x3706 & 0x531649F0);
                    int n471 = n2;
                    int n472 = (n470 + 1393969648 - (n470 & 0x531649F0) * 2 | n) - (n471 + 1393969648 - (n471 & 0x531649F0) * 2 & n);
                    n = 13854;
                    int n473 = n2 = (0x361B | 0x531649F0) - (0x361B & 0x531649F0);
                    int n474 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n472] = (n473 + 1393969648 - (n473 & 0x531649F0) * 2 | n) - (n474 + 1393969648 - (n474 & 0x531649F0) * 2 & n);
                    n3 = (0xE1D6807 | 0x94BA72B2) - (0xE1D6807 & 0x94BA72B2);
                    continue block56;
                }
                case 236808199: {
                    n = 20528;
                    int n475 = n2 = (0x5095 | 0x531649F0) - (0x5095 & 0x531649F0);
                    int n476 = n2;
                    int n477 = (n475 + 1393969648 - (n475 & 0x531649F0) * 2 | n) & ~(n476 + 1393969648 - (n476 & 0x531649F0) * 2 & n);
                    n = 20528;
                    int n478 = n2 = (0xFFFFAF8A | 0x531649F0) - (0xFFFFAF8A & 0x531649F0);
                    int n479 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n477] = (n478 + 1393969648 - (n478 & 0x531649F0) * 2 | n) - (n479 + 1393969648 - (n479 & 0x531649F0) * 2 & n);
                    n = 14712;
                    int n480 = n2 = (0x3977 | 0x531649F0) - (0x3977 & 0x531649F0);
                    int n481 = n2;
                    int n482 = (n480 + 1393969648 - (n480 & 0x531649F0) * 2 | n) & ~(n481 + 1393969648 - (n481 & 0x531649F0) * 2 & n);
                    n = 14712;
                    int n483 = n2 = (0x3945 | 0x531649F0) - (0x3945 & 0x531649F0);
                    int n484 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n482] = (n483 + 1393969648 - (n483 & 0x531649F0) * 2 | n) & (~(n484 + 1393969648 - (n484 & 0x531649F0) * 2) | ~n);
                    n = 29125;
                    int n485 = n2 = (0x714E | 0x531649F0) - (0x714E & 0x531649F0);
                    int n486 = n2;
                    int n487 = (n485 + 1393969648 - (n485 & 0x531649F0) * 2 | n) - (n486 + 1393969648 - (n486 & 0x531649F0) * 2 & n);
                    n = 29125;
                    int n488 = n2 = (0x71F0 | 0x531649F0) - (0x71F0 & 0x531649F0);
                    int n489 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n487] = (n488 + 1393969648 - (n488 & 0x531649F0) * 2 | n) - (n489 + 1393969648 - (n489 & 0x531649F0) * 2 & n);
                    n3 = (0x5F8C09B | 0x94BA72B2) - (0x5F8C09B & 0x94BA72B2);
                    continue block56;
                }
                case 100188315: {
                    n = 43360;
                    int n490 = n2 = (0xA99E | 0x531649F0) - (0xA99E & 0x531649F0);
                    int n491 = n2;
                    int n492 = n490 + 1393969648 - (n490 & 0x531649F0) * 2 & ~n | ~(n491 + 1393969648 - (n491 & 0x531649F0) * 2) & n;
                    n = 43360;
                    int n493 = n2 = (0xFFFF56D8 | 0x531649F0) - (0xFFFF56D8 & 0x531649F0);
                    int n494 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n492] = (n493 + 1393969648 - (n493 & 0x531649F0) * 2 | n) - (n494 + 1393969648 - (n494 & 0x531649F0) * 2 & n);
                    n = 17385;
                    int n495 = n2 = (0x43AF | 0x531649F0) - (0x43AF & 0x531649F0);
                    int n496 = n2;
                    int n497 = (n495 + 1393969648 - (n495 & 0x531649F0) * 2 | n) & (~(n496 + 1393969648 - (n496 & 0x531649F0) * 2) | ~n);
                    n = 17385;
                    int n498 = n2 = (0xFFFFBC5D | 0x531649F0) - (0xFFFFBC5D & 0x531649F0);
                    int n499 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n497] = (n498 + 1393969648 - (n498 & 0x531649F0) * 2 | n) - (n499 + 1393969648 - (n499 & 0x531649F0) * 2 & n);
                    n = 49524;
                    int n500 = n2 = (0xC1A1 | 0x531649F0) - (0xC1A1 & 0x531649F0);
                    int n501 = n2;
                    int n502 = (n500 + 1393969648 - (n500 & 0x531649F0) * 2 | n) & ~(n501 + 1393969648 - (n501 & 0x531649F0) * 2 & n);
                    n = 49524;
                    int n503 = n2 = (0xC12E | 0x531649F0) - (0xC12E & 0x531649F0);
                    int n504 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n502] = n503 + 1393969648 - (n503 & 0x531649F0) * 2 & ~n | ~(n504 + 1393969648 - (n504 & 0x531649F0) * 2) & n;
                    n3 = (0xF0F8D634 | 0x94BA72B2) - (0xF0F8D634 & 0x94BA72B2);
                    continue block56;
                }
                case -252127692: {
                    n = 42932;
                    int n505 = n2 = (0xA75D | 0x531649F0) - (0xA75D & 0x531649F0);
                    int n506 = n2;
                    int n507 = (n505 + 1393969648 - (n505 & 0x531649F0) * 2 | n) & ~(n506 + 1393969648 - (n506 & 0x531649F0) * 2 & n);
                    n = 42932;
                    int n508 = n2 = (0xA7A4 | 0x531649F0) - (0xA7A4 & 0x531649F0);
                    int n509 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n507] = (n508 + 1393969648 - (n508 & 0x531649F0) * 2 | n) & ~(n509 + 1393969648 - (n509 & 0x531649F0) * 2 & n);
                    n = 21010;
                    int n510 = n2 = (0x5202 | 0x531649F0) - (0x5202 & 0x531649F0);
                    int n511 = n2;
                    int n512 = n510 + 1393969648 - (n510 & 0x531649F0) * 2 & ~n | ~(n511 + 1393969648 - (n511 & 0x531649F0) * 2) & n;
                    n = 21010;
                    int n513 = n2 = (0x5222 | 0x531649F0) - (0x5222 & 0x531649F0);
                    int n514 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n512] = n513 + 1393969648 - (n513 & 0x531649F0) * 2 & ~n | ~(n514 + 1393969648 - (n514 & 0x531649F0) * 2) & n;
                    n = 38841;
                    int n515 = n2 = (0x97D4 | 0x531649F0) - (0x97D4 & 0x531649F0);
                    int n516 = n2;
                    int n517 = n515 + 1393969648 - (n515 & 0x531649F0) * 2 & ~n | ~(n516 + 1393969648 - (n516 & 0x531649F0) * 2) & n;
                    n = 38841;
                    int n518 = n2 = (0x97B1 | 0x531649F0) - (0x97B1 & 0x531649F0);
                    int n519 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n517] = (n518 + 1393969648 - (n518 & 0x531649F0) * 2 | n) - (n519 + 1393969648 - (n519 & 0x531649F0) * 2 & n);
                    n = 68698;
                    int n520 = n2 = (0x10C64 | 0x531649F0) - (0x10C64 & 0x531649F0);
                    int n521 = n2;
                    int n522 = (n520 + 1393969648 - (n520 & 0x531649F0) * 2 | n) & ~(n521 + 1393969648 - (n521 & 0x531649F0) * 2 & n);
                    n = 68698;
                    int n523 = n2 = (0x10C00 | 0x531649F0) - (0x10C00 & 0x531649F0);
                    int n524 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n522] = n523 + 1393969648 - (n523 & 0x531649F0) * 2 & ~n | ~(n524 + 1393969648 - (n524 & 0x531649F0) * 2) & n;
                    n3 = (0x3B976C61 | 0x94BA72B2) - (0x3B976C61 & 0x94BA72B2);
                    continue block56;
                }
                case 999779425: {
                    n = 66244;
                    int n525 = n2 = (0x1025E | 0x531649F0) - (0x1025E & 0x531649F0);
                    int n526 = n2;
                    int n527 = (n525 + 1393969648 - (n525 & 0x531649F0) * 2 | n) & (~(n526 + 1393969648 - (n526 & 0x531649F0) * 2) | ~n);
                    n = 66244;
                    int n528 = n2 = (0xFFFEFD48 | 0x531649F0) - (0xFFFEFD48 & 0x531649F0);
                    int n529 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n527] = (n528 + 1393969648 - (n528 & 0x531649F0) * 2 | n) & (~(n529 + 1393969648 - (n529 & 0x531649F0) * 2) | ~n);
                    n = 59093;
                    int n530 = n2 = (0xE694 | 0x531649F0) - (0xE694 & 0x531649F0);
                    int n531 = n2;
                    int n532 = (n530 + 1393969648 - (n530 & 0x531649F0) * 2 | n) - (n531 + 1393969648 - (n531 & 0x531649F0) * 2 & n);
                    n = 59093;
                    int n533 = n2 = (0xE6F2 | 0x531649F0) - (0xE6F2 & 0x531649F0);
                    int n534 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n532] = (n533 + 1393969648 - (n533 & 0x531649F0) * 2 | n) - (n534 + 1393969648 - (n534 & 0x531649F0) * 2 & n);
                    n3 = (0xE69A5282 | 0x94BA72B2) - (0xE69A5282 & 0x94BA72B2);
                    continue block56;
                }
                case -426093950: {
                    n = 14467;
                    int n535 = n2 = (0x3842 | 0x531649F0) - (0x3842 & 0x531649F0);
                    int n536 = n2;
                    int n537 = (n535 + 1393969648 - (n535 & 0x531649F0) * 2 | n) & ~(n536 + 1393969648 - (n536 & 0x531649F0) * 2 & n);
                    n = 14467;
                    int n538 = n2 = (0x38D4 | 0x531649F0) - (0x38D4 & 0x531649F0);
                    int n539 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n537] = (n538 + 1393969648 - (n538 & 0x531649F0) * 2 | n) - (n539 + 1393969648 - (n539 & 0x531649F0) * 2 & n);
                    n = 53099;
                    int n540 = n2 = (0xCF8D | 0x531649F0) - (0xCF8D & 0x531649F0);
                    int n541 = n2;
                    int n542 = (n540 + 1393969648 - (n540 & 0x531649F0) * 2 | n) & (~(n541 + 1393969648 - (n541 & 0x531649F0) * 2) | ~n);
                    n = 53099;
                    int n543 = n2 = (0xCF7A | 0x531649F0) - (0xCF7A & 0x531649F0);
                    int n544 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n542] = (n543 + 1393969648 - (n543 & 0x531649F0) * 2 | n) & ~(n544 + 1393969648 - (n544 & 0x531649F0) * 2 & n);
                    n = 13016;
                    int n545 = n2 = (0x3259 | 0x531649F0) - (0x3259 & 0x531649F0);
                    int n546 = n2;
                    int n547 = (n545 + 1393969648 - (n545 & 0x531649F0) * 2 | n) & (~(n546 + 1393969648 - (n546 & 0x531649F0) * 2) | ~n);
                    n = 13016;
                    int n548 = n2 = (0xFFFFCD2A | 0x531649F0) - (0xFFFFCD2A & 0x531649F0);
                    int n549 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n547] = (n548 + 1393969648 - (n548 & 0x531649F0) * 2 | n) & (~(n549 + 1393969648 - (n549 & 0x531649F0) * 2) | ~n);
                    n = 15268;
                    int n550 = n2 = (0x3BAA | 0x531649F0) - (0x3BAA & 0x531649F0);
                    int n551 = n2;
                    int n552 = (n550 + 1393969648 - (n550 & 0x531649F0) * 2 | n) & (~(n551 + 1393969648 - (n551 & 0x531649F0) * 2) | ~n);
                    n = 15268;
                    int n553 = n2 = (0x3BE6 | 0x531649F0) - (0x3BE6 & 0x531649F0);
                    int n554 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n552] = (n553 + 1393969648 - (n553 & 0x531649F0) * 2 | n) & (~(n554 + 1393969648 - (n554 & 0x531649F0) * 2) | ~n);
                    n = 14981;
                    int n555 = n2 = (0x3A06 | 0x531649F0) - (0x3A06 & 0x531649F0);
                    int n556 = n2;
                    int n557 = (n555 + 1393969648 - (n555 & 0x531649F0) * 2 | n) & (~(n556 + 1393969648 - (n556 & 0x531649F0) * 2) | ~n);
                    n = 14981;
                    int n558 = n2 = (0xFFFFC510 | 0x531649F0) - (0xFFFFC510 & 0x531649F0);
                    int n559 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n557] = (n558 + 1393969648 - (n558 & 0x531649F0) * 2 | n) & (~(n559 + 1393969648 - (n559 & 0x531649F0) * 2) | ~n);
                    n = 49651;
                    int n560 = n2 = (0xC18A | 0x531649F0) - (0xC18A & 0x531649F0);
                    int n561 = n2;
                    int n562 = (n560 + 1393969648 - (n560 & 0x531649F0) * 2 | n) & ~(n561 + 1393969648 - (n561 & 0x531649F0) * 2 & n);
                    n = 49651;
                    int n563 = n2 = (0xC1A9 | 0x531649F0) - (0xC1A9 & 0x531649F0);
                    int n564 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n562] = n563 + 1393969648 - (n563 & 0x531649F0) * 2 & ~n | ~(n564 + 1393969648 - (n564 & 0x531649F0) * 2) & n;
                    n = 11595;
                    int n565 = n2 = (0x2D49 | 0x531649F0) - (0x2D49 & 0x531649F0);
                    int n566 = n2;
                    int n567 = (n565 + 1393969648 - (n565 & 0x531649F0) * 2 | n) & (~(n566 + 1393969648 - (n566 & 0x531649F0) * 2) | ~n);
                    n = 11595;
                    int n568 = n2 = (0x2D78 | 0x531649F0) - (0x2D78 & 0x531649F0);
                    int n569 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n567] = (n568 + 1393969648 - (n568 & 0x531649F0) * 2 | n) & (~(n569 + 1393969648 - (n569 & 0x531649F0) * 2) | ~n);
                    n = 2842;
                    int n570 = n2 = (0xBD1 | 0x531649F0) - (0xBD1 & 0x531649F0);
                    int n571 = n2;
                    int n572 = (n570 + 1393969648 - (n570 & 0x531649F0) * 2 | n) & (~(n571 + 1393969648 - (n571 & 0x531649F0) * 2) | ~n);
                    n = 2842;
                    int n573 = n2 = (0xFFFFF4EB | 0x531649F0) - (0xFFFFF4EB & 0x531649F0);
                    int n574 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n572] = (n573 + 1393969648 - (n573 & 0x531649F0) * 2 | n) - (n574 + 1393969648 - (n574 & 0x531649F0) * 2 & n);
                    n = 16751;
                    int n575 = n2 = (0x4195 | 0x531649F0) - (0x4195 & 0x531649F0);
                    int n576 = n2;
                    int n577 = (n575 + 1393969648 - (n575 & 0x531649F0) * 2 | n) & (~(n576 + 1393969648 - (n576 & 0x531649F0) * 2) | ~n);
                    n = 16751;
                    int n578 = n2 = (0x4135 | 0x531649F0) - (0x4135 & 0x531649F0);
                    int n579 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n577] = (n578 + 1393969648 - (n578 & 0x531649F0) * 2 | n) & ~(n579 + 1393969648 - (n579 & 0x531649F0) * 2 & n);
                    n = 14982;
                    int n580 = n2 = (0x3AB2 | 0x531649F0) - (0x3AB2 & 0x531649F0);
                    int n581 = n2;
                    int n582 = (n580 + 1393969648 - (n580 & 0x531649F0) * 2 | n) & ~(n581 + 1393969648 - (n581 & 0x531649F0) * 2 & n);
                    n = 14982;
                    int n583 = n2 = (0x3ACC | 0x531649F0) - (0x3ACC & 0x531649F0);
                    int n584 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n582] = (n583 + 1393969648 - (n583 & 0x531649F0) * 2 | n) & ~(n584 + 1393969648 - (n584 & 0x531649F0) * 2 & n);
                    n = 42653;
                    int n585 = n2 = (0xA68C | 0x531649F0) - (0xA68C & 0x531649F0);
                    int n586 = n2;
                    int n587 = (n585 + 1393969648 - (n585 & 0x531649F0) * 2 | n) & ~(n586 + 1393969648 - (n586 & 0x531649F0) * 2 & n);
                    n = 42653;
                    int n588 = n2 = (0xFFFF5961 | 0x531649F0) - (0xFFFF5961 & 0x531649F0);
                    int n589 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n587] = (n588 + 1393969648 - (n588 & 0x531649F0) * 2 | n) & (~(n589 + 1393969648 - (n589 & 0x531649F0) * 2) | ~n);
                    n = 59534;
                    int n590 = n2 = (0xE991 | 0x531649F0) - (0xE991 & 0x531649F0);
                    int n591 = n2;
                    int n592 = (n590 + 1393969648 - (n590 & 0x531649F0) * 2 | n) & (~(n591 + 1393969648 - (n591 & 0x531649F0) * 2) | ~n);
                    n = 59534;
                    int n593 = n2 = (0xE88F | 0x531649F0) - (0xE88F & 0x531649F0);
                    int n594 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n592] = (n593 + 1393969648 - (n593 & 0x531649F0) * 2 | n) & ~(n594 + 1393969648 - (n594 & 0x531649F0) * 2 & n);
                    n = 8050;
                    int n595 = n2 = (0x1F6C | 0x531649F0) - (0x1F6C & 0x531649F0);
                    int n596 = n2;
                    int n597 = n595 + 1393969648 - (n595 & 0x531649F0) * 2 & ~n | ~(n596 + 1393969648 - (n596 & 0x531649F0) * 2) & n;
                    n = 8050;
                    int n598 = n2 = (0xFFFFE0E6 | 0x531649F0) - (0xFFFFE0E6 & 0x531649F0);
                    int n599 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n597] = (n598 + 1393969648 - (n598 & 0x531649F0) * 2 | n) & (~(n599 + 1393969648 - (n599 & 0x531649F0) * 2) | ~n);
                    n = 32880;
                    int n600 = n2 = (0x8154 | 0x531649F0) - (0x8154 & 0x531649F0);
                    int n601 = n2;
                    int n602 = (n600 + 1393969648 - (n600 & 0x531649F0) * 2 | n) & (~(n601 + 1393969648 - (n601 & 0x531649F0) * 2) | ~n);
                    n = 32880;
                    int n603 = n2 = (0x8076 | 0x531649F0) - (0x8076 & 0x531649F0);
                    int n604 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n602] = (n603 + 1393969648 - (n603 & 0x531649F0) * 2 | n) - (n604 + 1393969648 - (n604 & 0x531649F0) * 2 & n);
                    n = 60185;
                    int n605 = n2 = (0xEA3B | 0x531649F0) - (0xEA3B & 0x531649F0);
                    int n606 = n2;
                    int n607 = (n605 + 1393969648 - (n605 & 0x531649F0) * 2 | n) - (n606 + 1393969648 - (n606 & 0x531649F0) * 2 & n);
                    n = 60185;
                    int n608 = n2 = (0xEB37 | 0x531649F0) - (0xEB37 & 0x531649F0);
                    int n609 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n607] = (n608 + 1393969648 - (n608 & 0x531649F0) * 2 | n) & ~(n609 + 1393969648 - (n609 & 0x531649F0) * 2 & n);
                    n = 33999;
                    int n610 = n2 = (0x84FA | 0x531649F0) - (0x84FA & 0x531649F0);
                    int n611 = n2;
                    int n612 = (n610 + 1393969648 - (n610 & 0x531649F0) * 2 | n) & (~(n611 + 1393969648 - (n611 & 0x531649F0) * 2) | ~n);
                    n = 33999;
                    int n613 = n2 = (0x84CF | 0x531649F0) - (0x84CF & 0x531649F0);
                    int n614 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n612] = (n613 + 1393969648 - (n613 & 0x531649F0) * 2 | n) & ~(n614 + 1393969648 - (n614 & 0x531649F0) * 2 & n);
                    n3 = (0xEDD956F8 | 0x94BA72B2) - (0xEDD956F8 & 0x94BA72B2);
                    continue block56;
                }
                case -304523528: {
                    n = 33695;
                    int n615 = n2 = (0x83C2 | 0x531649F0) - (0x83C2 & 0x531649F0);
                    int n616 = n2;
                    int n617 = (n615 + 1393969648 - (n615 & 0x531649F0) * 2 | n) & (~(n616 + 1393969648 - (n616 & 0x531649F0) * 2) | ~n);
                    n = 33695;
                    int n618 = n2 = (0x8381 | 0x531649F0) - (0x8381 & 0x531649F0);
                    int n619 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n617] = (n618 + 1393969648 - (n618 & 0x531649F0) * 2 | n) - (n619 + 1393969648 - (n619 & 0x531649F0) * 2 & n);
                    n = 65632;
                    int n620 = n2 = (0x10095 | 0x531649F0) - (0x10095 & 0x531649F0);
                    int n621 = n2;
                    int n622 = (n620 + 1393969648 - (n620 & 0x531649F0) * 2 | n) & ~(n621 + 1393969648 - (n621 & 0x531649F0) * 2 & n);
                    n = 65632;
                    int n623 = n2 = (0x604B036C | 0x531649F0) - (0x604B036C & 0x531649F0);
                    int n624 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n622] = (n623 + 1393969648 - (n623 & 0x531649F0) * 2 | n) & (~(n624 + 1393969648 - (n624 & 0x531649F0) * 2) | ~n);
                    n = 55425;
                    int n625 = n2 = (0xD8D4 | 0x531649F0) - (0xD8D4 & 0x531649F0);
                    int n626 = n2;
                    int n627 = n625 + 1393969648 - (n625 & 0x531649F0) * 2 & ~n | ~(n626 + 1393969648 - (n626 & 0x531649F0) * 2) & n;
                    n = 55425;
                    int n628 = n2 = (0xFFFF277E | 0x531649F0) - (0xFFFF277E & 0x531649F0);
                    int n629 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n627] = (n628 + 1393969648 - (n628 & 0x531649F0) * 2 | n) & ~(n629 + 1393969648 - (n629 & 0x531649F0) * 2 & n);
                    n = 33868;
                    int n630 = n2 = (0x854A | 0x531649F0) - (0x854A & 0x531649F0);
                    int n631 = n2;
                    int n632 = (n630 + 1393969648 - (n630 & 0x531649F0) * 2 | n) & ~(n631 + 1393969648 - (n631 & 0x531649F0) * 2 & n);
                    n = 33868;
                    int n633 = n2 = (0x844C | 0x531649F0) - (0x844C & 0x531649F0);
                    int n634 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n632] = (n633 + 1393969648 - (n633 & 0x531649F0) * 2 | n) & (~(n634 + 1393969648 - (n634 & 0x531649F0) * 2) | ~n);
                    n = 7549;
                    int n635 = n2 = (0x1D52 | 0x531649F0) - (0x1D52 & 0x531649F0);
                    int n636 = n2;
                    int n637 = (n635 + 1393969648 - (n635 & 0x531649F0) * 2 | n) - (n636 + 1393969648 - (n636 & 0x531649F0) * 2 & n);
                    n = 7549;
                    int n638 = n2 = (0xFFFFE28C | 0x531649F0) - (0xFFFFE28C & 0x531649F0);
                    int n639 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n637] = (n638 + 1393969648 - (n638 & 0x531649F0) * 2 | n) - (n639 + 1393969648 - (n639 & 0x531649F0) * 2 & n);
                    n = 44387;
                    int n640 = n2 = (0xADF2 | 0x531649F0) - (0xADF2 & 0x531649F0);
                    int n641 = n2;
                    int n642 = (n640 + 1393969648 - (n640 & 0x531649F0) * 2 | n) & ~(n641 + 1393969648 - (n641 & 0x531649F0) * 2 & n);
                    n = 44387;
                    int n643 = n2 = (0xAD0C | 0x531649F0) - (0xAD0C & 0x531649F0);
                    int n644 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n642] = (n643 + 1393969648 - (n643 & 0x531649F0) * 2 | n) & ~(n644 + 1393969648 - (n644 & 0x531649F0) * 2 & n);
                    n = 43691;
                    int n645 = n2 = (0xAA62 | 0x531649F0) - (0xAA62 & 0x531649F0);
                    int n646 = n2;
                    int n647 = (n645 + 1393969648 - (n645 & 0x531649F0) * 2 | n) & ~(n646 + 1393969648 - (n646 & 0x531649F0) * 2 & n);
                    n = 43691;
                    int n648 = n2 = (0xAABB | 0x531649F0) - (0xAABB & 0x531649F0);
                    int n649 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n647] = (n648 + 1393969648 - (n648 & 0x531649F0) * 2 | n) - (n649 + 1393969648 - (n649 & 0x531649F0) * 2 & n);
                    n = 30959;
                    int n650 = n2 = (0x7848 | 0x531649F0) - (0x7848 & 0x531649F0);
                    int n651 = n2;
                    int n652 = (n650 + 1393969648 - (n650 & 0x531649F0) * 2 | n) - (n651 + 1393969648 - (n651 & 0x531649F0) * 2 & n);
                    n = 30959;
                    int n653 = n2 = (0xFFFF8731 | 0x531649F0) - (0xFFFF8731 & 0x531649F0);
                    int n654 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n652] = (n653 + 1393969648 - (n653 & 0x531649F0) * 2 | n) & (~(n654 + 1393969648 - (n654 & 0x531649F0) * 2) | ~n);
                    n = 42854;
                    int n655 = n2 = (0xA717 | 0x531649F0) - (0xA717 & 0x531649F0);
                    int n656 = n2;
                    int n657 = (n655 + 1393969648 - (n655 & 0x531649F0) * 2 | n) & ~(n656 + 1393969648 - (n656 & 0x531649F0) * 2 & n);
                    n = 42854;
                    int n658 = n2 = (0xFFFF58F0 | 0x531649F0) - (0xFFFF58F0 & 0x531649F0);
                    int n659 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n657] = (n658 + 1393969648 - (n658 & 0x531649F0) * 2 | n) & ~(n659 + 1393969648 - (n659 & 0x531649F0) * 2 & n);
                    n = 48183;
                    int n660 = n2 = (0xBC40 | 0x531649F0) - (0xBC40 & 0x531649F0);
                    int n661 = n2;
                    int n662 = (n660 + 1393969648 - (n660 & 0x531649F0) * 2 | n) & (~(n661 + 1393969648 - (n661 & 0x531649F0) * 2) | ~n);
                    n = 48183;
                    int n663 = n2 = (0xBC2D | 0x531649F0) - (0xBC2D & 0x531649F0);
                    int n664 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n662] = (n663 + 1393969648 - (n663 & 0x531649F0) * 2 | n) & (~(n664 + 1393969648 - (n664 & 0x531649F0) * 2) | ~n);
                    n3 = (0x99AC0F33 | 0x94BA72B2) - (0x99AC0F33 & 0x94BA72B2);
                    continue block56;
                }
                case -1716777165: {
                    n = 25264;
                    int n665 = n2 = (0x629C | 0x531649F0) - (0x629C & 0x531649F0);
                    int n666 = n2;
                    int n667 = (n665 + 1393969648 - (n665 & 0x531649F0) * 2 | n) - (n666 + 1393969648 - (n666 & 0x531649F0) * 2 & n);
                    n = 25264;
                    int n668 = n2 = (0x62BE | 0x531649F0) - (0x62BE & 0x531649F0);
                    int n669 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n667] = (n668 + 1393969648 - (n668 & 0x531649F0) * 2 | n) - (n669 + 1393969648 - (n669 & 0x531649F0) * 2 & n);
                    n = 13001;
                    int n670 = n2 = (0x33DB | 0x531649F0) - (0x33DB & 0x531649F0);
                    int n671 = n2;
                    int n672 = (n670 + 1393969648 - (n670 & 0x531649F0) * 2 | n) & ~(n671 + 1393969648 - (n671 & 0x531649F0) * 2 & n);
                    n = 13001;
                    int n673 = n2 = (0xFFFFCD36 | 0x531649F0) - (0xFFFFCD36 & 0x531649F0);
                    int n674 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n672] = (n673 + 1393969648 - (n673 & 0x531649F0) * 2 | n) & (~(n674 + 1393969648 - (n674 & 0x531649F0) * 2) | ~n);
                    n3 = (0x733BFE8B | 0x94BA72B2) - (0x733BFE8B & 0x94BA72B2);
                    continue block56;
                }
                case 1933311627: {
                    n = 9057;
                    int n675 = n2 = (0x237C | 0x531649F0) - (0x237C & 0x531649F0);
                    int n676 = n2;
                    int n677 = (n675 + 1393969648 - (n675 & 0x531649F0) * 2 | n) & (~(n676 + 1393969648 - (n676 & 0x531649F0) * 2) | ~n);
                    n = 9057;
                    int n678 = n2 = (0xFFFFDC93 | 0x531649F0) - (0xFFFFDC93 & 0x531649F0);
                    int n679 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n677] = (n678 + 1393969648 - (n678 & 0x531649F0) * 2 | n) - (n679 + 1393969648 - (n679 & 0x531649F0) * 2 & n);
                    n = 67923;
                    int n680 = n2 = (0x109A4 | 0x531649F0) - (0x109A4 & 0x531649F0);
                    int n681 = n2;
                    int n682 = n680 + 1393969648 - (n680 & 0x531649F0) * 2 & ~n | ~(n681 + 1393969648 - (n681 & 0x531649F0) * 2) & n;
                    n = 67923;
                    int n683 = n2 = (0x10945 | 0x531649F0) - (0x10945 & 0x531649F0);
                    int n684 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n682] = (n683 + 1393969648 - (n683 & 0x531649F0) * 2 | n) & (~(n684 + 1393969648 - (n684 & 0x531649F0) * 2) | ~n);
                    n = 4983;
                    int n685 = n2 = (0x137F | 0x531649F0) - (0x137F & 0x531649F0);
                    int n686 = n2;
                    int n687 = n685 + 1393969648 - (n685 & 0x531649F0) * 2 & ~n | ~(n686 + 1393969648 - (n686 & 0x531649F0) * 2) & n;
                    n = 4983;
                    int n688 = n2 = (0x1350 | 0x531649F0) - (0x1350 & 0x531649F0);
                    int n689 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n687] = (n688 + 1393969648 - (n688 & 0x531649F0) * 2 | n) & (~(n689 + 1393969648 - (n689 & 0x531649F0) * 2) | ~n);
                    n = 3433;
                    int n690 = n2 = (0xD2D | 0x531649F0) - (0xD2D & 0x531649F0);
                    int n691 = n2;
                    int n692 = (n690 + 1393969648 - (n690 & 0x531649F0) * 2 | n) - (n691 + 1393969648 - (n691 & 0x531649F0) * 2 & n);
                    n = 3433;
                    int n693 = n2 = (0xD4B | 0x531649F0) - (0xD4B & 0x531649F0);
                    int n694 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n692] = (n693 + 1393969648 - (n693 & 0x531649F0) * 2 | n) & ~(n694 + 1393969648 - (n694 & 0x531649F0) * 2 & n);
                    n = 13516;
                    int n695 = n2 = (0x35C8 | 0x531649F0) - (0x35C8 & 0x531649F0);
                    int n696 = n2;
                    int n697 = (n695 + 1393969648 - (n695 & 0x531649F0) * 2 | n) & (~(n696 + 1393969648 - (n696 & 0x531649F0) * 2) | ~n);
                    n = 13516;
                    int n698 = n2 = (0x34C6 | 0x531649F0) - (0x34C6 & 0x531649F0);
                    int n699 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n697] = n698 + 1393969648 - (n698 & 0x531649F0) * 2 & ~n | ~(n699 + 1393969648 - (n699 & 0x531649F0) * 2) & n;
                    n = 63959;
                    int n700 = n2 = (0xF91D | 0x531649F0) - (0xF91D & 0x531649F0);
                    int n701 = n2;
                    int n702 = (n700 + 1393969648 - (n700 & 0x531649F0) * 2 | n) & (~(n701 + 1393969648 - (n701 & 0x531649F0) * 2) | ~n);
                    n = 63959;
                    int n703 = n2 = (0x4E4EAB8A | 0x531649F0) - (0x4E4EAB8A & 0x531649F0);
                    int n704 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n702] = (n703 + 1393969648 - (n703 & 0x531649F0) * 2 | n) - (n704 + 1393969648 - (n704 & 0x531649F0) * 2 & n);
                    n = 3125;
                    int n705 = n2 = (0xCAC | 0x531649F0) - (0xCAC & 0x531649F0);
                    int n706 = n2;
                    int n707 = (n705 + 1393969648 - (n705 & 0x531649F0) * 2 | n) - (n706 + 1393969648 - (n706 & 0x531649F0) * 2 & n);
                    n = 3125;
                    int n708 = n2 = (0xFFFFF323 | 0x531649F0) - (0xFFFFF323 & 0x531649F0);
                    int n709 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n707] = (n708 + 1393969648 - (n708 & 0x531649F0) * 2 | n) - (n709 + 1393969648 - (n709 & 0x531649F0) * 2 & n);
                    n = 24402;
                    int n710 = n2 = (0x5F2E | 0x531649F0) - (0x5F2E & 0x531649F0);
                    int n711 = n2;
                    int n712 = n710 + 1393969648 - (n710 & 0x531649F0) * 2 & ~n | ~(n711 + 1393969648 - (n711 & 0x531649F0) * 2) & n;
                    n = 24402;
                    int n713 = n2 = (0xFFFFA0E4 | 0x531649F0) - (0xFFFFA0E4 & 0x531649F0);
                    int n714 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n712] = (n713 + 1393969648 - (n713 & 0x531649F0) * 2 | n) & (~(n714 + 1393969648 - (n714 & 0x531649F0) * 2) | ~n);
                    n = 2584;
                    int n715 = n2 = (0xAA1 | 0x531649F0) - (0xAA1 & 0x531649F0);
                    int n716 = n2;
                    int n717 = n715 + 1393969648 - (n715 & 0x531649F0) * 2 & ~n | ~(n716 + 1393969648 - (n716 & 0x531649F0) * 2) & n;
                    n = 2584;
                    int n718 = n2 = (0xA55 | 0x531649F0) - (0xA55 & 0x531649F0);
                    int n719 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n717] = (n718 + 1393969648 - (n718 & 0x531649F0) * 2 | n) & ~(n719 + 1393969648 - (n719 & 0x531649F0) * 2 & n);
                    n = 41466;
                    int n720 = n2 = (0xA184 | 0x531649F0) - (0xA184 & 0x531649F0);
                    int n721 = n2;
                    int n722 = (n720 + 1393969648 - (n720 & 0x531649F0) * 2 | n) & ~(n721 + 1393969648 - (n721 & 0x531649F0) * 2 & n);
                    n = 41466;
                    int n723 = n2 = (0xFFFF5E1B | 0x531649F0) - (0xFFFF5E1B & 0x531649F0);
                    int n724 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n722] = n723 + 1393969648 - (n723 & 0x531649F0) * 2 & ~n | ~(n724 + 1393969648 - (n724 & 0x531649F0) * 2) & n;
                    n3 = (0x90C1BDDB | 0x94BA72B2) - (0x90C1BDDB & 0x94BA72B2);
                    continue block56;
                }
                case -1866351141: {
                    n = 20986;
                    int n725 = n2 = (0x51A6 | 0x531649F0) - (0x51A6 & 0x531649F0);
                    int n726 = n2;
                    int n727 = (n725 + 1393969648 - (n725 & 0x531649F0) * 2 | n) & ~(n726 + 1393969648 - (n726 & 0x531649F0) * 2 & n);
                    n = 20986;
                    int n728 = n2 = (0x51EB | 0x531649F0) - (0x51EB & 0x531649F0);
                    int n729 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n727] = (n728 + 1393969648 - (n728 & 0x531649F0) * 2 | n) - (n729 + 1393969648 - (n729 & 0x531649F0) * 2 & n);
                    n = 17516;
                    int n730 = n2 = (0x449A | 0x531649F0) - (0x449A & 0x531649F0);
                    int n731 = n2;
                    int n732 = (n730 + 1393969648 - (n730 & 0x531649F0) * 2 | n) & (~(n731 + 1393969648 - (n731 & 0x531649F0) * 2) | ~n);
                    n = 17516;
                    int n733 = n2 = (0x4436 | 0x531649F0) - (0x4436 & 0x531649F0);
                    int n734 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n732] = (n733 + 1393969648 - (n733 & 0x531649F0) * 2 | n) & (~(n734 + 1393969648 - (n734 & 0x531649F0) * 2) | ~n);
                    n3 = (0x5869E114 | 0x94BA72B2) - (0x5869E114 & 0x94BA72B2);
                    continue block56;
                }
                case 1483333908: {
                    n = 52610;
                    int n735 = n2 = (0xCD90 | 0x531649F0) - (0xCD90 & 0x531649F0);
                    int n736 = n2;
                    int n737 = (n735 + 1393969648 - (n735 & 0x531649F0) * 2 | n) & ~(n736 + 1393969648 - (n736 & 0x531649F0) * 2 & n);
                    n = 52610;
                    int n738 = n2 = (0xFFFF324E | 0x531649F0) - (0xFFFF324E & 0x531649F0);
                    int n739 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n737] = (n738 + 1393969648 - (n738 & 0x531649F0) * 2 | n) & (~(n739 + 1393969648 - (n739 & 0x531649F0) * 2) | ~n);
                    n = 5518;
                    int n740 = n2 = (0x156A | 0x531649F0) - (0x156A & 0x531649F0);
                    int n741 = n2;
                    int n742 = (n740 + 1393969648 - (n740 & 0x531649F0) * 2 | n) & (~(n741 + 1393969648 - (n741 & 0x531649F0) * 2) | ~n);
                    n = 5518;
                    int n743 = n2 = (0x12F9D56B | 0x531649F0) - (0x12F9D56B & 0x531649F0);
                    int n744 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n742] = (n743 + 1393969648 - (n743 & 0x531649F0) * 2 | n) - (n744 + 1393969648 - (n744 & 0x531649F0) * 2 & n);
                    n = 12177;
                    int n745 = n2 = (0x2E8F | 0x531649F0) - (0x2E8F & 0x531649F0);
                    int n746 = n2;
                    int n747 = (n745 + 1393969648 - (n745 & 0x531649F0) * 2 | n) & (~(n746 + 1393969648 - (n746 & 0x531649F0) * 2) | ~n);
                    n = 12177;
                    int n748 = n2 = (0x2F91 | 0x531649F0) - (0x2F91 & 0x531649F0);
                    int n749 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n747] = (n748 + 1393969648 - (n748 & 0x531649F0) * 2 | n) & (~(n749 + 1393969648 - (n749 & 0x531649F0) * 2) | ~n);
                    n = 54928;
                    int n750 = n2 = (0xD62C | 0x531649F0) - (0xD62C & 0x531649F0);
                    int n751 = n2;
                    int n752 = (n750 + 1393969648 - (n750 & 0x531649F0) * 2 | n) & ~(n751 + 1393969648 - (n751 & 0x531649F0) * 2 & n);
                    n = 54928;
                    int n753 = n2 = (0xA5453435 | 0x531649F0) - (0xA5453435 & 0x531649F0);
                    int n754 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n752] = (n753 + 1393969648 - (n753 & 0x531649F0) * 2 | n) & (~(n754 + 1393969648 - (n754 & 0x531649F0) * 2) | ~n);
                    n = 38318;
                    int n755 = n2 = (0x954F | 0x531649F0) - (0x954F & 0x531649F0);
                    int n756 = n2;
                    int n757 = (n755 + 1393969648 - (n755 & 0x531649F0) * 2 | n) - (n756 + 1393969648 - (n756 & 0x531649F0) * 2 & n);
                    n = 38318;
                    int n758 = n2 = (0xA545770B | 0x531649F0) - (0xA545770B & 0x531649F0);
                    int n759 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n757] = n758 + 1393969648 - (n758 & 0x531649F0) * 2 & ~n | ~(n759 + 1393969648 - (n759 & 0x531649F0) * 2) & n;
                    n3 = (0x98D53970 | 0x94BA72B2) - (0x98D53970 & 0x94BA72B2);
                    continue block56;
                }
                case -1730856592: {
                    n = 32649;
                    int n760 = n2 = (0x7F1A | 0x531649F0) - (0x7F1A & 0x531649F0);
                    int n761 = n2;
                    int n762 = n760 + 1393969648 - (n760 & 0x531649F0) * 2 & ~n | ~(n761 + 1393969648 - (n761 & 0x531649F0) * 2) & n;
                    n = 32649;
                    int n763 = n2 = (0x7FD3 | 0x531649F0) - (0x7FD3 & 0x531649F0);
                    int n764 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n762] = (n763 + 1393969648 - (n763 & 0x531649F0) * 2 | n) & ~(n764 + 1393969648 - (n764 & 0x531649F0) * 2 & n);
                    n = 58536;
                    int n765 = n2 = (0xE4A4 | 0x531649F0) - (0xE4A4 & 0x531649F0);
                    int n766 = n2;
                    int n767 = (n765 + 1393969648 - (n765 & 0x531649F0) * 2 | n) & ~(n766 + 1393969648 - (n766 & 0x531649F0) * 2 & n);
                    n = 58536;
                    int n768 = n2 = (0x472DE774 | 0x531649F0) - (0x472DE774 & 0x531649F0);
                    int n769 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n767] = (n768 + 1393969648 - (n768 & 0x531649F0) * 2 | n) & (~(n769 + 1393969648 - (n769 & 0x531649F0) * 2) | ~n);
                    n = 58657;
                    int n770 = n2 = (0xE542 | 0x531649F0) - (0xE542 & 0x531649F0);
                    int n771 = n2;
                    int n772 = (n770 + 1393969648 - (n770 & 0x531649F0) * 2 | n) - (n771 + 1393969648 - (n771 & 0x531649F0) * 2 & n);
                    n = 58657;
                    int n773 = n2 = (0xE57F | 0x531649F0) - (0xE57F & 0x531649F0);
                    int n774 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n772] = (n773 + 1393969648 - (n773 & 0x531649F0) * 2 | n) & ~(n774 + 1393969648 - (n774 & 0x531649F0) * 2 & n);
                    n = 2454;
                    int n775 = n2 = (0x9B4 | 0x531649F0) - (0x9B4 & 0x531649F0);
                    int n776 = n2;
                    int n777 = n775 + 1393969648 - (n775 & 0x531649F0) * 2 & ~n | ~(n776 + 1393969648 - (n776 & 0x531649F0) * 2) & n;
                    n = 2454;
                    int n778 = n2 = (0xFFFFF623 | 0x531649F0) - (0xFFFFF623 & 0x531649F0);
                    int n779 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n777] = (n778 + 1393969648 - (n778 & 0x531649F0) * 2 | n) - (n779 + 1393969648 - (n779 & 0x531649F0) * 2 & n);
                    n3 = (0xAE19745B | 0x94BA72B2) - (0xAE19745B & 0x94BA72B2);
                    continue block56;
                }
                case -1374063525: {
                    n = 6304;
                    int n780 = n2 = (0x1826 | 0x531649F0) - (0x1826 & 0x531649F0);
                    int n781 = n2;
                    int n782 = n780 + 1393969648 - (n780 & 0x531649F0) * 2 & ~n | ~(n781 + 1393969648 - (n781 & 0x531649F0) * 2) & n;
                    n = 6304;
                    int n783 = n2 = (0x18FA | 0x531649F0) - (0x18FA & 0x531649F0);
                    int n784 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n782] = (n783 + 1393969648 - (n783 & 0x531649F0) * 2 | n) & ~(n784 + 1393969648 - (n784 & 0x531649F0) * 2 & n);
                    n = 33271;
                    int n785 = n2 = (0x817E | 0x531649F0) - (0x817E & 0x531649F0);
                    int n786 = n2;
                    int n787 = (n785 + 1393969648 - (n785 & 0x531649F0) * 2 | n) - (n786 + 1393969648 - (n786 & 0x531649F0) * 2 & n);
                    n = 33271;
                    int n788 = n2 = (0xFFFF7E52 | 0x531649F0) - (0xFFFF7E52 & 0x531649F0);
                    int n789 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n787] = (n788 + 1393969648 - (n788 & 0x531649F0) * 2 | n) - (n789 + 1393969648 - (n789 & 0x531649F0) * 2 & n);
                    n = 36326;
                    int n790 = n2 = (0x8DB5 | 0x531649F0) - (0x8DB5 & 0x531649F0);
                    int n791 = n2;
                    int n792 = (n790 + 1393969648 - (n790 & 0x531649F0) * 2 | n) & (~(n791 + 1393969648 - (n791 & 0x531649F0) * 2) | ~n);
                    n = 36326;
                    int n793 = n2 = (0x8DE2 | 0x531649F0) - (0x8DE2 & 0x531649F0);
                    int n794 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n792] = (n793 + 1393969648 - (n793 & 0x531649F0) * 2 | n) & ~(n794 + 1393969648 - (n794 & 0x531649F0) * 2 & n);
                    n = 25857;
                    int n795 = n2 = (0x6400 | 0x531649F0) - (0x6400 & 0x531649F0);
                    int n796 = n2;
                    int n797 = (n795 + 1393969648 - (n795 & 0x531649F0) * 2 | n) - (n796 + 1393969648 - (n796 & 0x531649F0) * 2 & n);
                    n = 25857;
                    int n798 = n2 = (0x655B | 0x531649F0) - (0x655B & 0x531649F0);
                    int n799 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n797] = (n798 + 1393969648 - (n798 & 0x531649F0) * 2 | n) & (~(n799 + 1393969648 - (n799 & 0x531649F0) * 2) | ~n);
                    n = 63235;
                    int n800 = n2 = (0xF773 | 0x531649F0) - (0xF773 & 0x531649F0);
                    int n801 = n2;
                    int n802 = n800 + 1393969648 - (n800 & 0x531649F0) * 2 & ~n | ~(n801 + 1393969648 - (n801 & 0x531649F0) * 2) & n;
                    n = 63235;
                    int n803 = n2 = (0xFFFF0884 | 0x531649F0) - (0xFFFF0884 & 0x531649F0);
                    int n804 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n802] = (n803 + 1393969648 - (n803 & 0x531649F0) * 2 | n) & (~(n804 + 1393969648 - (n804 & 0x531649F0) * 2) | ~n);
                    n3 = (0xE6BA81A | 0x94BA72B2) - (0xE6BA81A & 0x94BA72B2);
                    continue block56;
                }
                case 241936410: {
                    n = 35515;
                    int n805 = n2 = (0x8A13 | 0x531649F0) - (0x8A13 & 0x531649F0);
                    int n806 = n2;
                    int n807 = (n805 + 1393969648 - (n805 & 0x531649F0) * 2 | n) & (~(n806 + 1393969648 - (n806 & 0x531649F0) * 2) | ~n);
                    n = 35515;
                    int n808 = n2 = (0xFFFF753D | 0x531649F0) - (0xFFFF753D & 0x531649F0);
                    int n809 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n807] = (n808 + 1393969648 - (n808 & 0x531649F0) * 2 | n) & (~(n809 + 1393969648 - (n809 & 0x531649F0) * 2) | ~n);
                    n = 30837;
                    int n810 = n2 = (0x7954 | 0x531649F0) - (0x7954 & 0x531649F0);
                    int n811 = n2;
                    int n812 = (n810 + 1393969648 - (n810 & 0x531649F0) * 2 | n) & (~(n811 + 1393969648 - (n811 & 0x531649F0) * 2) | ~n);
                    n = 30837;
                    int n813 = n2 = (0x785A | 0x531649F0) - (0x785A & 0x531649F0);
                    int n814 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n812] = (n813 + 1393969648 - (n813 & 0x531649F0) * 2 | n) - (n814 + 1393969648 - (n814 & 0x531649F0) * 2 & n);
                    n = 44345;
                    int n815 = n2 = (0xAD52 | 0x531649F0) - (0xAD52 & 0x531649F0);
                    int n816 = n2;
                    int n817 = (n815 + 1393969648 - (n815 & 0x531649F0) * 2 | n) & ~(n816 + 1393969648 - (n816 & 0x531649F0) * 2 & n);
                    n = 44345;
                    int n818 = n2 = (0xA5454F9C | 0x531649F0) - (0xA5454F9C & 0x531649F0);
                    int n819 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n817] = (n818 + 1393969648 - (n818 & 0x531649F0) * 2 | n) & (~(n819 + 1393969648 - (n819 & 0x531649F0) * 2) | ~n);
                    n = 6038;
                    int n820 = n2 = (0x1716 | 0x531649F0) - (0x1716 & 0x531649F0);
                    int n821 = n2;
                    int n822 = (n820 + 1393969648 - (n820 & 0x531649F0) * 2 | n) & (~(n821 + 1393969648 - (n821 & 0x531649F0) * 2) | ~n);
                    n = 6038;
                    int n823 = n2 = (0x1783 | 0x531649F0) - (0x1783 & 0x531649F0);
                    int n824 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n822] = (n823 + 1393969648 - (n823 & 0x531649F0) * 2 | n) & ~(n824 + 1393969648 - (n824 & 0x531649F0) * 2 & n);
                    n = 4169;
                    int n825 = n2 = (0x1029 | 0x531649F0) - (0x1029 & 0x531649F0);
                    int n826 = n2;
                    int n827 = (n825 + 1393969648 - (n825 & 0x531649F0) * 2 | n) & (~(n826 + 1393969648 - (n826 & 0x531649F0) * 2) | ~n);
                    n = 4169;
                    int n828 = n2 = (0xFFFFEFEB | 0x531649F0) - (0xFFFFEFEB & 0x531649F0);
                    int n829 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n827] = (n828 + 1393969648 - (n828 & 0x531649F0) * 2 | n) & ~(n829 + 1393969648 - (n829 & 0x531649F0) * 2 & n);
                    n = 3232;
                    int n830 = n2 = (0xC12 | 0x531649F0) - (0xC12 & 0x531649F0);
                    int n831 = n2;
                    int n832 = (n830 + 1393969648 - (n830 & 0x531649F0) * 2 | n) & (~(n831 + 1393969648 - (n831 & 0x531649F0) * 2) | ~n);
                    n = 3232;
                    int n833 = n2 = (0xFFFFF371 | 0x531649F0) - (0xFFFFF371 & 0x531649F0);
                    int n834 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n832] = (n833 + 1393969648 - (n833 & 0x531649F0) * 2 | n) & ~(n834 + 1393969648 - (n834 & 0x531649F0) * 2 & n);
                    n = 52027;
                    int n835 = n2 = (0xCB83 | 0x531649F0) - (0xCB83 & 0x531649F0);
                    int n836 = n2;
                    int n837 = (n835 + 1393969648 - (n835 & 0x531649F0) * 2 | n) & (~(n836 + 1393969648 - (n836 & 0x531649F0) * 2) | ~n);
                    n = 52027;
                    int n838 = n2 = (0xFFFF34AA | 0x531649F0) - (0xFFFF34AA & 0x531649F0);
                    int n839 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n837] = n838 + 1393969648 - (n838 & 0x531649F0) * 2 & ~n | ~(n839 + 1393969648 - (n839 & 0x531649F0) * 2) & n;
                    n = 9145;
                    int n840 = n2 = (0x236D | 0x531649F0) - (0x236D & 0x531649F0);
                    int n841 = n2;
                    int n842 = (n840 + 1393969648 - (n840 & 0x531649F0) * 2 | n) & (~(n841 + 1393969648 - (n841 & 0x531649F0) * 2) | ~n);
                    n = 9145;
                    int n843 = n2 = (0xA545C11C | 0x531649F0) - (0xA545C11C & 0x531649F0);
                    int n844 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n842] = (n843 + 1393969648 - (n843 & 0x531649F0) * 2 | n) & ~(n844 + 1393969648 - (n844 & 0x531649F0) * 2 & n);
                    n = 5854;
                    int n845 = n2 = (0x16AD | 0x531649F0) - (0x16AD & 0x531649F0);
                    int n846 = n2;
                    int n847 = (n845 + 1393969648 - (n845 & 0x531649F0) * 2 | n) & (~(n846 + 1393969648 - (n846 & 0x531649F0) * 2) | ~n);
                    n = 5854;
                    int n848 = n2 = (0xFFFFE973 | 0x531649F0) - (0xFFFFE973 & 0x531649F0);
                    int n849 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n847] = (n848 + 1393969648 - (n848 & 0x531649F0) * 2 | n) - (n849 + 1393969648 - (n849 & 0x531649F0) * 2 & n);
                    n = 4067;
                    int n850 = n2 = (0xFE4 | 0x531649F0) - (0xFE4 & 0x531649F0);
                    int n851 = n2;
                    int n852 = (n850 + 1393969648 - (n850 & 0x531649F0) * 2 | n) - (n851 + 1393969648 - (n851 & 0x531649F0) * 2 & n);
                    n = 4067;
                    int n853 = n2 = (0xFFFFF01E | 0x531649F0) - (0xFFFFF01E & 0x531649F0);
                    int n854 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n852] = (n853 + 1393969648 - (n853 & 0x531649F0) * 2 | n) & ~(n854 + 1393969648 - (n854 & 0x531649F0) * 2 & n);
                    n = 37143;
                    int n855 = n2 = (0x9012 | 0x531649F0) - (0x9012 & 0x531649F0);
                    int n856 = n2;
                    int n857 = (n855 + 1393969648 - (n855 & 0x531649F0) * 2 | n) & ~(n856 + 1393969648 - (n856 & 0x531649F0) * 2 & n);
                    n = 37143;
                    int n858 = n2 = (0x9116 | 0x531649F0) - (0x9116 & 0x531649F0);
                    int n859 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n857] = (n858 + 1393969648 - (n858 & 0x531649F0) * 2 | n) & ~(n859 + 1393969648 - (n859 & 0x531649F0) * 2 & n);
                    n = 5421;
                    int n860 = n2 = (0x143C | 0x531649F0) - (0x143C & 0x531649F0);
                    int n861 = n2;
                    int n862 = (n860 + 1393969648 - (n860 & 0x531649F0) * 2 | n) - (n861 + 1393969648 - (n861 & 0x531649F0) * 2 & n);
                    n = 5421;
                    int n863 = n2 = (0x1577 | 0x531649F0) - (0x1577 & 0x531649F0);
                    int n864 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n862] = (n863 + 1393969648 - (n863 & 0x531649F0) * 2 | n) & ~(n864 + 1393969648 - (n864 & 0x531649F0) * 2 & n);
                    n = 56833;
                    int n865 = n2 = (0xDF01 | 0x531649F0) - (0xDF01 & 0x531649F0);
                    int n866 = n2;
                    int n867 = (n865 + 1393969648 - (n865 & 0x531649F0) * 2 | n) & (~(n866 + 1393969648 - (n866 & 0x531649F0) * 2) | ~n);
                    n = 56833;
                    int n868 = n2 = (0xA5453CA4 | 0x531649F0) - (0xA5453CA4 & 0x531649F0);
                    int n869 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n867] = (n868 + 1393969648 - (n868 & 0x531649F0) * 2 | n) & (~(n869 + 1393969648 - (n869 & 0x531649F0) * 2) | ~n);
                    n = 3174;
                    int n870 = n2 = (0xCA1 | 0x531649F0) - (0xCA1 & 0x531649F0);
                    int n871 = n2;
                    int n872 = (n870 + 1393969648 - (n870 & 0x531649F0) * 2 | n) & (~(n871 + 1393969648 - (n871 & 0x531649F0) * 2) | ~n);
                    n = 3174;
                    int n873 = n2 = (0xA545EEC3 | 0x531649F0) - (0xA545EEC3 & 0x531649F0);
                    int n874 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n872] = (n873 + 1393969648 - (n873 & 0x531649F0) * 2 | n) - (n874 + 1393969648 - (n874 & 0x531649F0) * 2 & n);
                    n = 9005;
                    int n875 = n2 = (0x238E | 0x531649F0) - (0x238E & 0x531649F0);
                    int n876 = n2;
                    int n877 = (n875 + 1393969648 - (n875 & 0x531649F0) * 2 | n) & ~(n876 + 1393969648 - (n876 & 0x531649F0) * 2 & n);
                    n = 9005;
                    int n878 = n2 = (0xFFFFDC7F | 0x531649F0) - (0xFFFFDC7F & 0x531649F0);
                    int n879 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n877] = (n878 + 1393969648 - (n878 & 0x531649F0) * 2 | n) & (~(n879 + 1393969648 - (n879 & 0x531649F0) * 2) | ~n);
                    n = 8971;
                    int n880 = n2 = (0x23EB | 0x531649F0) - (0x23EB & 0x531649F0);
                    int n881 = n2;
                    int n882 = (n880 + 1393969648 - (n880 & 0x531649F0) * 2 | n) & (~(n881 + 1393969648 - (n881 & 0x531649F0) * 2) | ~n);
                    n = 8971;
                    int n883 = n2 = (0xFFFFDCC9 | 0x531649F0) - (0xFFFFDCC9 & 0x531649F0);
                    int n884 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n882] = (n883 + 1393969648 - (n883 & 0x531649F0) * 2 | n) & (~(n884 + 1393969648 - (n884 & 0x531649F0) * 2) | ~n);
                    n = 49820;
                    int n885 = n2 = (0xC263 | 0x531649F0) - (0xC263 & 0x531649F0);
                    int n886 = n2;
                    int n887 = (n885 + 1393969648 - (n885 & 0x531649F0) * 2 | n) & ~(n886 + 1393969648 - (n886 & 0x531649F0) * 2 & n);
                    n = 49820;
                    int n888 = n2 = (0xC2F6 | 0x531649F0) - (0xC2F6 & 0x531649F0);
                    int n889 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n887] = n888 + 1393969648 - (n888 & 0x531649F0) * 2 & ~n | ~(n889 + 1393969648 - (n889 & 0x531649F0) * 2) & n;
                    n = 2074;
                    int n890 = n2 = (0x914 | 0x531649F0) - (0x914 & 0x531649F0);
                    int n891 = n2;
                    int n892 = n890 + 1393969648 - (n890 & 0x531649F0) * 2 & ~n | ~(n891 + 1393969648 - (n891 & 0x531649F0) * 2) & n;
                    n = 2074;
                    int n893 = n2 = (0x840 | 0x531649F0) - (0x840 & 0x531649F0);
                    int n894 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n892] = (n893 + 1393969648 - (n893 & 0x531649F0) * 2 | n) & ~(n894 + 1393969648 - (n894 & 0x531649F0) * 2 & n);
                    n = 48428;
                    int n895 = n2 = (0xBD42 | 0x531649F0) - (0xBD42 & 0x531649F0);
                    int n896 = n2;
                    int n897 = (n895 + 1393969648 - (n895 & 0x531649F0) * 2 | n) & ~(n896 + 1393969648 - (n896 & 0x531649F0) * 2 & n);
                    n = 48428;
                    int n898 = n2 = (0xF7DC2CE0 | 0x531649F0) - (0xF7DC2CE0 & 0x531649F0);
                    int n899 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n897] = n898 + 1393969648 - (n898 & 0x531649F0) * 2 & ~n | ~(n899 + 1393969648 - (n899 & 0x531649F0) * 2) & n;
                    n = 19356;
                    int n900 = n2 = (0x4BBD | 0x531649F0) - (0x4BBD & 0x531649F0);
                    int n901 = n2;
                    int n902 = n900 + 1393969648 - (n900 & 0x531649F0) * 2 & ~n | ~(n901 + 1393969648 - (n901 & 0x531649F0) * 2) & n;
                    n = 19356;
                    int n903 = n2 = (0xFFFFB452 | 0x531649F0) - (0xFFFFB452 & 0x531649F0);
                    int n904 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n902] = (n903 + 1393969648 - (n903 & 0x531649F0) * 2 | n) & (~(n904 + 1393969648 - (n904 & 0x531649F0) * 2) | ~n);
                    n = 19985;
                    int n905 = n2 = (0x4E5B | 0x531649F0) - (0x4E5B & 0x531649F0);
                    int n906 = n2;
                    int n907 = (n905 + 1393969648 - (n905 & 0x531649F0) * 2 | n) - (n906 + 1393969648 - (n906 & 0x531649F0) * 2 & n);
                    n = 19985;
                    int n908 = n2 = (0xA545ACB4 | 0x531649F0) - (0xA545ACB4 & 0x531649F0);
                    int n909 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n907] = (n908 + 1393969648 - (n908 & 0x531649F0) * 2 | n) - (n909 + 1393969648 - (n909 & 0x531649F0) * 2 & n);
                    n = 36596;
                    int n910 = n2 = (0x8EC6 | 0x531649F0) - (0x8EC6 & 0x531649F0);
                    int n911 = n2;
                    int n912 = (n910 + 1393969648 - (n910 & 0x531649F0) * 2 | n) & (~(n911 + 1393969648 - (n911 & 0x531649F0) * 2) | ~n);
                    n = 36596;
                    int n913 = n2 = (0x8EF7 | 0x531649F0) - (0x8EF7 & 0x531649F0);
                    int n914 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n912] = (n913 + 1393969648 - (n913 & 0x531649F0) * 2 | n) & ~(n914 + 1393969648 - (n914 & 0x531649F0) * 2 & n);
                    n = 67213;
                    int n915 = n2 = (0x10613 | 0x531649F0) - (0x10613 & 0x531649F0);
                    int n916 = n2;
                    int n917 = n915 + 1393969648 - (n915 & 0x531649F0) * 2 & ~n | ~(n916 + 1393969648 - (n916 & 0x531649F0) * 2) & n;
                    n = 67213;
                    int n918 = n2 = (0x106F9 | 0x531649F0) - (0x106F9 & 0x531649F0);
                    int n919 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n917] = (n918 + 1393969648 - (n918 & 0x531649F0) * 2 | n) & (~(n919 + 1393969648 - (n919 & 0x531649F0) * 2) | ~n);
                    n = 22791;
                    int n920 = n2 = (0x5997 | 0x531649F0) - (0x5997 & 0x531649F0);
                    int n921 = n2;
                    int n922 = (n920 + 1393969648 - (n920 & 0x531649F0) * 2 | n) - (n921 + 1393969648 - (n921 & 0x531649F0) * 2 & n);
                    n = 22791;
                    int n923 = n2 = (0x5964 | 0x531649F0) - (0x5964 & 0x531649F0);
                    int n924 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n922] = (n923 + 1393969648 - (n923 & 0x531649F0) * 2 | n) & (~(n924 + 1393969648 - (n924 & 0x531649F0) * 2) | ~n);
                    n3 = (0x5A5FE75E | 0x94BA72B2) - (0x5A5FE75E & 0x94BA72B2);
                    continue block56;
                }
                case 1516234590: {
                    n = 54495;
                    int n925 = n2 = (0xD4C5 | 0x531649F0) - (0xD4C5 & 0x531649F0);
                    int n926 = n2;
                    int n927 = (n925 + 1393969648 - (n925 & 0x531649F0) * 2 | n) & ~(n926 + 1393969648 - (n926 & 0x531649F0) * 2 & n);
                    n = 54495;
                    int n928 = n2 = (0xD43B | 0x531649F0) - (0xD43B & 0x531649F0);
                    int n929 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n927] = n928 + 1393969648 - (n928 & 0x531649F0) * 2 & ~n | ~(n929 + 1393969648 - (n929 & 0x531649F0) * 2) & n;
                    n = 53331;
                    int n930 = n2 = (0xD001 | 0x531649F0) - (0xD001 & 0x531649F0);
                    int n931 = n2;
                    int n932 = (n930 + 1393969648 - (n930 & 0x531649F0) * 2 | n) & ~(n931 + 1393969648 - (n931 & 0x531649F0) * 2 & n);
                    n = 53331;
                    int n933 = n2 = (0xFFFF2F8E | 0x531649F0) - (0xFFFF2F8E & 0x531649F0);
                    int n934 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n932] = (n933 + 1393969648 - (n933 & 0x531649F0) * 2 | n) - (n934 + 1393969648 - (n934 & 0x531649F0) * 2 & n);
                    n = 44618;
                    int n935 = n2 = (0xAE43 | 0x531649F0) - (0xAE43 & 0x531649F0);
                    int n936 = n2;
                    int n937 = (n935 + 1393969648 - (n935 & 0x531649F0) * 2 | n) & ~(n936 + 1393969648 - (n936 & 0x531649F0) * 2 & n);
                    n = 44618;
                    int n938 = n2 = (0xA5454CEF | 0x531649F0) - (0xA5454CEF & 0x531649F0);
                    int n939 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n937] = (n938 + 1393969648 - (n938 & 0x531649F0) * 2 | n) - (n939 + 1393969648 - (n939 & 0x531649F0) * 2 & n);
                    n3 = (0xF19E0306 | 0x94BA72B2) - (0xF19E0306 & 0x94BA72B2);
                    continue block56;
                }
                case -241302778: {
                    n = 43537;
                    int n940 = n2 = (0xAA41 | 0x531649F0) - (0xAA41 & 0x531649F0);
                    int n941 = n2;
                    int n942 = (n940 + 1393969648 - (n940 & 0x531649F0) * 2 | n) & ~(n941 + 1393969648 - (n941 & 0x531649F0) * 2 & n);
                    n = 43537;
                    int n943 = n2 = (0xFFFF55A4 | 0x531649F0) - (0xFFFF55A4 & 0x531649F0);
                    int n944 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n942] = (n943 + 1393969648 - (n943 & 0x531649F0) * 2 | n) - (n944 + 1393969648 - (n944 & 0x531649F0) * 2 & n);
                    n = 19972;
                    int n945 = n2 = (0x4EA9 | 0x531649F0) - (0x4EA9 & 0x531649F0);
                    int n946 = n2;
                    int n947 = (n945 + 1393969648 - (n945 & 0x531649F0) * 2 | n) & ~(n946 + 1393969648 - (n946 & 0x531649F0) * 2 & n);
                    n = 19972;
                    int n948 = n2 = (0x4E5E | 0x531649F0) - (0x4E5E & 0x531649F0);
                    int n949 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n947] = n948 + 1393969648 - (n948 & 0x531649F0) * 2 & ~n | ~(n949 + 1393969648 - (n949 & 0x531649F0) * 2) & n;
                    n = 7814;
                    int n950 = n2 = (0x1F85 | 0x531649F0) - (0x1F85 & 0x531649F0);
                    int n951 = n2;
                    int n952 = (n950 + 1393969648 - (n950 & 0x531649F0) * 2 | n) - (n951 + 1393969648 - (n951 & 0x531649F0) * 2 & n);
                    n = 7814;
                    int n953 = n2 = (0x9C49DB24 | 0x531649F0) - (0x9C49DB24 & 0x531649F0);
                    int n954 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n952] = (n953 + 1393969648 - (n953 & 0x531649F0) * 2 | n) & ~(n954 + 1393969648 - (n954 & 0x531649F0) * 2 & n);
                    n = 48837;
                    int n955 = n2 = (0xBEC1 | 0x531649F0) - (0xBEC1 & 0x531649F0);
                    int n956 = n2;
                    int n957 = n955 + 1393969648 - (n955 & 0x531649F0) * 2 & ~n | ~(n956 + 1393969648 - (n956 & 0x531649F0) * 2) & n;
                    n = 48837;
                    int n958 = n2 = (0xBEE4 | 0x531649F0) - (0xBEE4 & 0x531649F0);
                    int n959 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n957] = (n958 + 1393969648 - (n958 & 0x531649F0) * 2 | n) - (n959 + 1393969648 - (n959 & 0x531649F0) * 2 & n);
                    n = 18103;
                    int n960 = n2 = (0x4673 | 0x531649F0) - (0x4673 & 0x531649F0);
                    int n961 = n2;
                    int n962 = (n960 + 1393969648 - (n960 & 0x531649F0) * 2 | n) - (n961 + 1393969648 - (n961 & 0x531649F0) * 2 & n);
                    n = 18103;
                    int n963 = n2 = (0x46ED | 0x531649F0) - (0x46ED & 0x531649F0);
                    int n964 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n962] = (n963 + 1393969648 - (n963 & 0x531649F0) * 2 | n) - (n964 + 1393969648 - (n964 & 0x531649F0) * 2 & n);
                    n = 58781;
                    int n965 = n2 = (0xE5D1 | 0x531649F0) - (0xE5D1 & 0x531649F0);
                    int n966 = n2;
                    int n967 = (n965 + 1393969648 - (n965 & 0x531649F0) * 2 | n) & (~(n966 + 1393969648 - (n966 & 0x531649F0) * 2) | ~n);
                    n = 58781;
                    int n968 = n2 = (0xE598 | 0x531649F0) - (0xE598 & 0x531649F0);
                    int n969 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n967] = (n968 + 1393969648 - (n968 & 0x531649F0) * 2 | n) - (n969 + 1393969648 - (n969 & 0x531649F0) * 2 & n);
                    n = 10502;
                    int n970 = n2 = (0x2907 | 0x531649F0) - (0x2907 & 0x531649F0);
                    int n971 = n2;
                    int n972 = (n970 + 1393969648 - (n970 & 0x531649F0) * 2 | n) & (~(n971 + 1393969648 - (n971 & 0x531649F0) * 2) | ~n);
                    n = 10502;
                    int n973 = n2 = (0xFFFFD69B | 0x531649F0) - (0xFFFFD69B & 0x531649F0);
                    int n974 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n972] = (n973 + 1393969648 - (n973 & 0x531649F0) * 2 | n) & ~(n974 + 1393969648 - (n974 & 0x531649F0) * 2 & n);
                    n = 20199;
                    int n975 = n2 = (0x4E49 | 0x531649F0) - (0x4E49 & 0x531649F0);
                    int n976 = n2;
                    int n977 = n975 + 1393969648 - (n975 & 0x531649F0) * 2 & ~n | ~(n976 + 1393969648 - (n976 & 0x531649F0) * 2) & n;
                    n = 20199;
                    int n978 = n2 = (0x4EEA | 0x531649F0) - (0x4EEA & 0x531649F0);
                    int n979 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n977] = (n978 + 1393969648 - (n978 & 0x531649F0) * 2 | n) - (n979 + 1393969648 - (n979 & 0x531649F0) * 2 & n);
                    n = 6802;
                    int n980 = n2 = (0x1ADD | 0x531649F0) - (0x1ADD & 0x531649F0);
                    int n981 = n2;
                    int n982 = (n980 + 1393969648 - (n980 & 0x531649F0) * 2 | n) & ~(n981 + 1393969648 - (n981 & 0x531649F0) * 2 & n);
                    n = 6802;
                    int n983 = n2 = (0x1AC4 | 0x531649F0) - (0x1AC4 & 0x531649F0);
                    int n984 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n982] = (n983 + 1393969648 - (n983 & 0x531649F0) * 2 | n) & (~(n984 + 1393969648 - (n984 & 0x531649F0) * 2) | ~n);
                    n = 40580;
                    int n985 = n2 = (0x9EEE | 0x531649F0) - (0x9EEE & 0x531649F0);
                    int n986 = n2;
                    int n987 = (n985 + 1393969648 - (n985 & 0x531649F0) * 2 | n) & (~(n986 + 1393969648 - (n986 & 0x531649F0) * 2) | ~n);
                    n = 40580;
                    int n988 = n2 = (0x992D1BC9 | 0x531649F0) - (0x992D1BC9 & 0x531649F0);
                    int n989 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n987] = (n988 + 1393969648 - (n988 & 0x531649F0) * 2 | n) - (n989 + 1393969648 - (n989 & 0x531649F0) * 2 & n);
                    n = 67179;
                    int n990 = n2 = (0x10687 | 0x531649F0) - (0x10687 & 0x531649F0);
                    int n991 = n2;
                    int n992 = (n990 + 1393969648 - (n990 & 0x531649F0) * 2 | n) & (~(n991 + 1393969648 - (n991 & 0x531649F0) * 2) | ~n);
                    n = 67179;
                    int n993 = n2 = (0x1065E | 0x531649F0) - (0x1065E & 0x531649F0);
                    int n994 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n992] = n993 + 1393969648 - (n993 & 0x531649F0) * 2 & ~n | ~(n994 + 1393969648 - (n994 & 0x531649F0) * 2) & n;
                    n3 = (0x557515B2 | 0x94BA72B2) - (0x557515B2 & 0x94BA72B2);
                    continue block56;
                }
                case 1433736626: {
                    n = 34444;
                    int n995 = n2 = (0x862E | 0x531649F0) - (0x862E & 0x531649F0);
                    int n996 = n2;
                    int n997 = (n995 + 1393969648 - (n995 & 0x531649F0) * 2 | n) & ~(n996 + 1393969648 - (n996 & 0x531649F0) * 2 & n);
                    n = 34444;
                    int n998 = n2 = (0x73DF96F5 | 0x531649F0) - (0x73DF96F5 & 0x531649F0);
                    int n999 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n997] = n998 + 1393969648 - (n998 & 0x531649F0) * 2 & ~n | ~(n999 + 1393969648 - (n999 & 0x531649F0) * 2) & n;
                    n = 47660;
                    int n1000 = n2 = (0xBA9A | 0x531649F0) - (0xBA9A & 0x531649F0);
                    int n1001 = n2;
                    int n1002 = n1000 + 1393969648 - (n1000 & 0x531649F0) * 2 & ~n | ~(n1001 + 1393969648 - (n1001 & 0x531649F0) * 2) & n;
                    n = 47660;
                    int n1003 = n2 = (0xBA4D | 0x531649F0) - (0xBA4D & 0x531649F0);
                    int n1004 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1002] = (n1003 + 1393969648 - (n1003 & 0x531649F0) * 2 | n) - (n1004 + 1393969648 - (n1004 & 0x531649F0) * 2 & n);
                    n = 29633;
                    int n1005 = n2 = (0x7318 | 0x531649F0) - (0x7318 & 0x531649F0);
                    int n1006 = n2;
                    int n1007 = (n1005 + 1393969648 - (n1005 & 0x531649F0) * 2 | n) - (n1006 + 1393969648 - (n1006 & 0x531649F0) * 2 & n);
                    n = 29633;
                    int n1008 = n2 = (0x7386 | 0x531649F0) - (0x7386 & 0x531649F0);
                    int n1009 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1007] = (n1008 + 1393969648 - (n1008 & 0x531649F0) * 2 | n) - (n1009 + 1393969648 - (n1009 & 0x531649F0) * 2 & n);
                    n = 34290;
                    int n1010 = n2 = (0x854F | 0x531649F0) - (0x854F & 0x531649F0);
                    int n1011 = n2;
                    int n1012 = (n1010 + 1393969648 - (n1010 & 0x531649F0) * 2 | n) - (n1011 + 1393969648 - (n1011 & 0x531649F0) * 2 & n);
                    n = 34290;
                    int n1013 = n2 = (0x85A8 | 0x531649F0) - (0x85A8 & 0x531649F0);
                    int n1014 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1012] = (n1013 + 1393969648 - (n1013 & 0x531649F0) * 2 | n) & ~(n1014 + 1393969648 - (n1014 & 0x531649F0) * 2 & n);
                    n3 = (0x6504325A | 0x94BA72B2) - (0x6504325A & 0x94BA72B2);
                    continue block56;
                }
                case 1694773850: {
                    n = 22076;
                    int n1015 = n2 = (0x560A | 0x531649F0) - (0x560A & 0x531649F0);
                    int n1016 = n2;
                    int n1017 = n1015 + 1393969648 - (n1015 & 0x531649F0) * 2 & ~n | ~(n1016 + 1393969648 - (n1016 & 0x531649F0) * 2) & n;
                    n = 22076;
                    int n1018 = n2 = (0x5608 | 0x531649F0) - (0x5608 & 0x531649F0);
                    int n1019 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1017] = (n1018 + 1393969648 - (n1018 & 0x531649F0) * 2 | n) & (~(n1019 + 1393969648 - (n1019 & 0x531649F0) * 2) | ~n);
                    n = 7177;
                    int n1020 = n2 = (0x1D02 | 0x531649F0) - (0x1D02 & 0x531649F0);
                    int n1021 = n2;
                    int n1022 = n1020 + 1393969648 - (n1020 & 0x531649F0) * 2 & ~n | ~(n1021 + 1393969648 - (n1021 & 0x531649F0) * 2) & n;
                    n = 7177;
                    int n1023 = n2 = (0x1C08 | 0x531649F0) - (0x1C08 & 0x531649F0);
                    int n1024 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1022] = (n1023 + 1393969648 - (n1023 & 0x531649F0) * 2 | n) - (n1024 + 1393969648 - (n1024 & 0x531649F0) * 2 & n);
                    n = 37451;
                    int n1025 = n2 = (0x92A5 | 0x531649F0) - (0x92A5 & 0x531649F0);
                    int n1026 = n2;
                    int n1027 = (n1025 + 1393969648 - (n1025 & 0x531649F0) * 2 | n) & ~(n1026 + 1393969648 - (n1026 & 0x531649F0) * 2 & n);
                    n = 37451;
                    int n1028 = n2 = (0xA54570EE | 0x531649F0) - (0xA54570EE & 0x531649F0);
                    int n1029 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1027] = (n1028 + 1393969648 - (n1028 & 0x531649F0) * 2 | n) & (~(n1029 + 1393969648 - (n1029 & 0x531649F0) * 2) | ~n);
                    n = 30975;
                    int n1030 = n2 = (0x7860 | 0x531649F0) - (0x7860 & 0x531649F0);
                    int n1031 = n2;
                    int n1032 = (n1030 + 1393969648 - (n1030 & 0x531649F0) * 2 | n) - (n1031 + 1393969648 - (n1031 & 0x531649F0) * 2 & n);
                    n = 30975;
                    int n1033 = n2 = (0xA5459A5A | 0x531649F0) - (0xA5459A5A & 0x531649F0);
                    int n1034 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1032] = (n1033 + 1393969648 - (n1033 & 0x531649F0) * 2 | n) & ~(n1034 + 1393969648 - (n1034 & 0x531649F0) * 2 & n);
                    n = 63885;
                    int n1035 = n2 = (0xF93C | 0x531649F0) - (0xF93C & 0x531649F0);
                    int n1036 = n2;
                    int n1037 = (n1035 + 1393969648 - (n1035 & 0x531649F0) * 2 | n) - (n1036 + 1393969648 - (n1036 & 0x531649F0) * 2 & n);
                    n = 63885;
                    int n1038 = n2 = (0xFFFF066B | 0x531649F0) - (0xFFFF066B & 0x531649F0);
                    int n1039 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1037] = (n1038 + 1393969648 - (n1038 & 0x531649F0) * 2 | n) - (n1039 + 1393969648 - (n1039 & 0x531649F0) * 2 & n);
                    n = 20500;
                    int n1040 = n2 = (0x50D4 | 0x531649F0) - (0x50D4 & 0x531649F0);
                    int n1041 = n2;
                    int n1042 = n1040 + 1393969648 - (n1040 & 0x531649F0) * 2 & ~n | ~(n1041 + 1393969648 - (n1041 & 0x531649F0) * 2) & n;
                    n = 20500;
                    int n1043 = n2 = (0xFFFFAF80 | 0x531649F0) - (0xFFFFAF80 & 0x531649F0);
                    int n1044 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1042] = n1043 + 1393969648 - (n1043 & 0x531649F0) * 2 & ~n | ~(n1044 + 1393969648 - (n1044 & 0x531649F0) * 2) & n;
                    n = 9246;
                    int n1045 = n2 = (0x249A | 0x531649F0) - (0x249A & 0x531649F0);
                    int n1046 = n2;
                    int n1047 = n1045 + 1393969648 - (n1045 & 0x531649F0) * 2 & ~n | ~(n1046 + 1393969648 - (n1046 & 0x531649F0) * 2) & n;
                    n = 9246;
                    int n1048 = n2 = (0xFFFFDBDD | 0x531649F0) - (0xFFFFDBDD & 0x531649F0);
                    int n1049 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1047] = (n1048 + 1393969648 - (n1048 & 0x531649F0) * 2 | n) & (~(n1049 + 1393969648 - (n1049 & 0x531649F0) * 2) | ~n);
                    n = 4567;
                    int n1050 = n2 = (0x114C | 0x531649F0) - (0x114C & 0x531649F0);
                    int n1051 = n2;
                    int n1052 = (n1050 + 1393969648 - (n1050 & 0x531649F0) * 2 | n) - (n1051 + 1393969648 - (n1051 & 0x531649F0) * 2 & n);
                    n = 4567;
                    int n1053 = n2 = (0xFFFFEE5D | 0x531649F0) - (0xFFFFEE5D & 0x531649F0);
                    int n1054 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1052] = n1053 + 1393969648 - (n1053 & 0x531649F0) * 2 & ~n | ~(n1054 + 1393969648 - (n1054 & 0x531649F0) * 2) & n;
                    n = 25699;
                    int n1055 = n2 = (0x64FF | 0x531649F0) - (0x64FF & 0x531649F0);
                    int n1056 = n2;
                    int n1057 = (n1055 + 1393969648 - (n1055 & 0x531649F0) * 2 | n) & ~(n1056 + 1393969648 - (n1056 & 0x531649F0) * 2 & n);
                    n = 25699;
                    int n1058 = n2 = (0xFFFF9B3A | 0x531649F0) - (0xFFFF9B3A & 0x531649F0);
                    int n1059 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1057] = (n1058 + 1393969648 - (n1058 & 0x531649F0) * 2 | n) & (~(n1059 + 1393969648 - (n1059 & 0x531649F0) * 2) | ~n);
                    n3 = (0x951D9B21 | 0x94BA72B2) - (0x951D9B21 & 0x94BA72B2);
                    continue block56;
                }
                case -1793221855: {
                    n = 12717;
                    int n1060 = n2 = (0x314F | 0x531649F0) - (0x314F & 0x531649F0);
                    int n1061 = n2;
                    int n1062 = n1060 + 1393969648 - (n1060 & 0x531649F0) * 2 & ~n | ~(n1061 + 1393969648 - (n1061 & 0x531649F0) * 2) & n;
                    n = 12717;
                    int n1063 = n2 = (0x31F7 | 0x531649F0) - (0x31F7 & 0x531649F0);
                    int n1064 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1062] = (n1063 + 1393969648 - (n1063 & 0x531649F0) * 2 | n) & (~(n1064 + 1393969648 - (n1064 & 0x531649F0) * 2) | ~n);
                    n3 = (0xD1A0BFA | 0x94BA72B2) - (0xD1A0BFA & 0x94BA72B2);
                    continue block56;
                }
                case 219810810: {
                    n = 38777;
                    int n1065 = n2 = (0x9740 | 0x531649F0) - (0x9740 & 0x531649F0);
                    int n1066 = n2;
                    int n1067 = n1065 + 1393969648 - (n1065 & 0x531649F0) * 2 & ~n | ~(n1066 + 1393969648 - (n1066 & 0x531649F0) * 2) & n;
                    n = 38777;
                    int n1068 = n2 = (0xFFFF68E9 | 0x531649F0) - (0xFFFF68E9 & 0x531649F0);
                    int n1069 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1067] = (n1068 + 1393969648 - (n1068 & 0x531649F0) * 2 | n) - (n1069 + 1393969648 - (n1069 & 0x531649F0) * 2 & n);
                    n = 52862;
                    int n1070 = n2 = (0xCE85 | 0x531649F0) - (0xCE85 & 0x531649F0);
                    int n1071 = n2;
                    int n1072 = (n1070 + 1393969648 - (n1070 & 0x531649F0) * 2 | n) & ~(n1071 + 1393969648 - (n1071 & 0x531649F0) * 2 & n);
                    n = 52862;
                    int n1073 = n2 = (0xCE6A | 0x531649F0) - (0xCE6A & 0x531649F0);
                    int n1074 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1072] = (n1073 + 1393969648 - (n1073 & 0x531649F0) * 2 | n) & (~(n1074 + 1393969648 - (n1074 & 0x531649F0) * 2) | ~n);
                    n = 30895;
                    int n1075 = n2 = (0x78B9 | 0x531649F0) - (0x78B9 & 0x531649F0);
                    int n1076 = n2;
                    int n1077 = n1075 + 1393969648 - (n1075 & 0x531649F0) * 2 & ~n | ~(n1076 + 1393969648 - (n1076 & 0x531649F0) * 2) & n;
                    n = 30895;
                    int n1078 = n2 = (0xA5459A0A | 0x531649F0) - (0xA5459A0A & 0x531649F0);
                    int n1079 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1077] = n1078 + 1393969648 - (n1078 & 0x531649F0) * 2 & ~n | ~(n1079 + 1393969648 - (n1079 & 0x531649F0) * 2) & n;
                    n3 = (0xD111923 | 0x94BA72B2) - (0xD111923 & 0x94BA72B2);
                    continue block56;
                }
                case 219224355: {
                    n = 18897;
                    int n1080 = n2 = (0x4903 | 0x531649F0) - (0x4903 & 0x531649F0);
                    int n1081 = n2;
                    int n1082 = (n1080 + 1393969648 - (n1080 & 0x531649F0) * 2 | n) - (n1081 + 1393969648 - (n1081 & 0x531649F0) * 2 & n);
                    n = 18897;
                    int n1083 = n2 = (0xFFFFB61F | 0x531649F0) - (0xFFFFB61F & 0x531649F0);
                    int n1084 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1082] = (n1083 + 1393969648 - (n1083 & 0x531649F0) * 2 | n) - (n1084 + 1393969648 - (n1084 & 0x531649F0) * 2 & n);
                    n = 3732;
                    int n1085 = n2 = (0xED4 | 0x531649F0) - (0xED4 & 0x531649F0);
                    int n1086 = n2;
                    int n1087 = (n1085 + 1393969648 - (n1085 & 0x531649F0) * 2 | n) & (~(n1086 + 1393969648 - (n1086 & 0x531649F0) * 2) | ~n);
                    n = 3732;
                    int n1088 = n2 = (0xC09230FA | 0x531649F0) - (0xC09230FA & 0x531649F0);
                    int n1089 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1087] = (n1088 + 1393969648 - (n1088 & 0x531649F0) * 2 | n) & (~(n1089 + 1393969648 - (n1089 & 0x531649F0) * 2) | ~n);
                    n3 = (0xF1BC878A | 0x94BA72B2) - (0xF1BC878A & 0x94BA72B2);
                    continue block56;
                }
                case -239302774: {
                    n = 34939;
                    int n1090 = n2 = (0x88FC | 0x531649F0) - (0x88FC & 0x531649F0);
                    int n1091 = n2;
                    int n1092 = (n1090 + 1393969648 - (n1090 & 0x531649F0) * 2 | n) & (~(n1091 + 1393969648 - (n1091 & 0x531649F0) * 2) | ~n);
                    n = 34939;
                    int n1093 = n2 = (0x8871 | 0x531649F0) - (0x8871 & 0x531649F0);
                    int n1094 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1092] = n1093 + 1393969648 - (n1093 & 0x531649F0) * 2 & ~n | ~(n1094 + 1393969648 - (n1094 & 0x531649F0) * 2) & n;
                    n = 17782;
                    int n1095 = n2 = (0x45E0 | 0x531649F0) - (0x45E0 & 0x531649F0);
                    int n1096 = n2;
                    int n1097 = n1095 + 1393969648 - (n1095 & 0x531649F0) * 2 & ~n | ~(n1096 + 1393969648 - (n1096 & 0x531649F0) * 2) & n;
                    n = 17782;
                    int n1098 = n2 = (0x45A0 | 0x531649F0) - (0x45A0 & 0x531649F0);
                    int n1099 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1097] = (n1098 + 1393969648 - (n1098 & 0x531649F0) * 2 | n) - (n1099 + 1393969648 - (n1099 & 0x531649F0) * 2 & n);
                    n = 18967;
                    int n1100 = n2 = (0x4AD8 | 0x531649F0) - (0x4AD8 & 0x531649F0);
                    int n1101 = n2;
                    int n1102 = n1100 + 1393969648 - (n1100 & 0x531649F0) * 2 & ~n | ~(n1101 + 1393969648 - (n1101 & 0x531649F0) * 2) & n;
                    n = 18967;
                    int n1103 = n2 = (0xFFFFB5EB | 0x531649F0) - (0xFFFFB5EB & 0x531649F0);
                    int n1104 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1102] = (n1103 + 1393969648 - (n1103 & 0x531649F0) * 2 | n) & (~(n1104 + 1393969648 - (n1104 & 0x531649F0) * 2) | ~n);
                    n = 22155;
                    int n1105 = n2 = (0x5664 | 0x531649F0) - (0x5664 & 0x531649F0);
                    int n1106 = n2;
                    int n1107 = (n1105 + 1393969648 - (n1105 & 0x531649F0) * 2 | n) & (~(n1106 + 1393969648 - (n1106 & 0x531649F0) * 2) | ~n);
                    n = 22155;
                    int n1108 = n2 = (0x56D1 | 0x531649F0) - (0x56D1 & 0x531649F0);
                    int n1109 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1107] = (n1108 + 1393969648 - (n1108 & 0x531649F0) * 2 | n) & (~(n1109 + 1393969648 - (n1109 & 0x531649F0) * 2) | ~n);
                    n = 25378;
                    int n1110 = n2 = (0x636F | 0x531649F0) - (0x636F & 0x531649F0);
                    int n1111 = n2;
                    int n1112 = (n1110 + 1393969648 - (n1110 & 0x531649F0) * 2 | n) & (~(n1111 + 1393969648 - (n1111 & 0x531649F0) * 2) | ~n);
                    n = 25378;
                    int n1113 = n2 = (0x5F17ADC0 | 0x531649F0) - (0x5F17ADC0 & 0x531649F0);
                    int n1114 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1112] = (n1113 + 1393969648 - (n1113 & 0x531649F0) * 2 | n) & ~(n1114 + 1393969648 - (n1114 & 0x531649F0) * 2 & n);
                    n3 = (0x669EE976 | 0x94BA72B2) - (0x669EE976 & 0x94BA72B2);
                    continue block56;
                }
                case 1721690486: {
                    n = 25422;
                    int n1115 = n2 = (0x6318 | 0x531649F0) - (0x6318 & 0x531649F0);
                    int n1116 = n2;
                    int n1117 = (n1115 + 1393969648 - (n1115 & 0x531649F0) * 2 | n) & ~(n1116 + 1393969648 - (n1116 & 0x531649F0) * 2 & n);
                    n = 25422;
                    int n1118 = n2 = (0x6344 | 0x531649F0) - (0x6344 & 0x531649F0);
                    int n1119 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1117] = (n1118 + 1393969648 - (n1118 & 0x531649F0) * 2 | n) & (~(n1119 + 1393969648 - (n1119 & 0x531649F0) * 2) | ~n);
                    n = 67415;
                    int n1120 = n2 = (0x1078C | 0x531649F0) - (0x1078C & 0x531649F0);
                    int n1121 = n2;
                    int n1122 = (n1120 + 1393969648 - (n1120 & 0x531649F0) * 2 | n) & ~(n1121 + 1393969648 - (n1121 & 0x531649F0) * 2 & n);
                    n = 67415;
                    int n1123 = n2 = (0xFFFEF885 | 0x531649F0) - (0xFFFEF885 & 0x531649F0);
                    int n1124 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1122] = (n1123 + 1393969648 - (n1123 & 0x531649F0) * 2 | n) & (~(n1124 + 1393969648 - (n1124 & 0x531649F0) * 2) | ~n);
                    n = 50690;
                    int n1125 = n2 = (0xC70A | 0x531649F0) - (0xC70A & 0x531649F0);
                    int n1126 = n2;
                    int n1127 = (n1125 + 1393969648 - (n1125 & 0x531649F0) * 2 | n) & ~(n1126 + 1393969648 - (n1126 & 0x531649F0) * 2 & n);
                    n = 50690;
                    int n1128 = n2 = (0xC602 | 0x531649F0) - (0xC602 & 0x531649F0);
                    int n1129 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1127] = n1128 + 1393969648 - (n1128 & 0x531649F0) * 2 & ~n | ~(n1129 + 1393969648 - (n1129 & 0x531649F0) * 2) & n;
                    n = 32704;
                    int n1130 = n2 = (0x7FA1 | 0x531649F0) - (0x7FA1 & 0x531649F0);
                    int n1131 = n2;
                    int n1132 = (n1130 + 1393969648 - (n1130 & 0x531649F0) * 2 | n) - (n1131 + 1393969648 - (n1131 & 0x531649F0) * 2 & n);
                    n = 32704;
                    int n1133 = n2 = (0x7FBA | 0x531649F0) - (0x7FBA & 0x531649F0);
                    int n1134 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1132] = (n1133 + 1393969648 - (n1133 & 0x531649F0) * 2 | n) & ~(n1134 + 1393969648 - (n1134 & 0x531649F0) * 2 & n);
                    n3 = (0x40D6E8F6 | 0x94BA72B2) - (0x40D6E8F6 & 0x94BA72B2);
                    continue block56;
                }
                case 1087826166: {
                    n = 25797;
                    int n1135 = n2 = (0x6487 | 0x531649F0) - (0x6487 & 0x531649F0);
                    int n1136 = n2;
                    int n1137 = (n1135 + 1393969648 - (n1135 & 0x531649F0) * 2 | n) - (n1136 + 1393969648 - (n1136 & 0x531649F0) * 2 & n);
                    n = 25797;
                    int n1138 = n2 = (0x64D8 | 0x531649F0) - (0x64D8 & 0x531649F0);
                    int n1139 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1137] = (n1138 + 1393969648 - (n1138 & 0x531649F0) * 2 | n) & ~(n1139 + 1393969648 - (n1139 & 0x531649F0) * 2 & n);
                    n = 19938;
                    int n1140 = n2 = (0x4DDF | 0x531649F0) - (0x4DDF & 0x531649F0);
                    int n1141 = n2;
                    int n1142 = (n1140 + 1393969648 - (n1140 & 0x531649F0) * 2 | n) - (n1141 + 1393969648 - (n1141 & 0x531649F0) * 2 & n);
                    n = 19938;
                    int n1143 = n2 = (0xA545AF47 | 0x531649F0) - (0xA545AF47 & 0x531649F0);
                    int n1144 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1142] = n1143 + 1393969648 - (n1143 & 0x531649F0) * 2 & ~n | ~(n1144 + 1393969648 - (n1144 & 0x531649F0) * 2) & n;
                    n = 32731;
                    int n1145 = n2 = (0x7FF8 | 0x531649F0) - (0x7FF8 & 0x531649F0);
                    int n1146 = n2;
                    int n1147 = n1145 + 1393969648 - (n1145 & 0x531649F0) * 2 & ~n | ~(n1146 + 1393969648 - (n1146 & 0x531649F0) * 2) & n;
                    n = 32731;
                    int n1148 = n2 = (0xA5459D7E | 0x531649F0) - (0xA5459D7E & 0x531649F0);
                    int n1149 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1147] = n1148 + 1393969648 - (n1148 & 0x531649F0) * 2 & ~n | ~(n1149 + 1393969648 - (n1149 & 0x531649F0) * 2) & n;
                    n = 53835;
                    int n1150 = n2 = (0xD2A0 | 0x531649F0) - (0xD2A0 & 0x531649F0);
                    int n1151 = n2;
                    int n1152 = n1150 + 1393969648 - (n1150 & 0x531649F0) * 2 & ~n | ~(n1151 + 1393969648 - (n1151 & 0x531649F0) * 2) & n;
                    n = 53835;
                    int n1153 = n2 = (0xFFFF2DFF | 0x531649F0) - (0xFFFF2DFF & 0x531649F0);
                    int n1154 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1152] = (n1153 + 1393969648 - (n1153 & 0x531649F0) * 2 | n) - (n1154 + 1393969648 - (n1154 & 0x531649F0) * 2 & n);
                    n = 39843;
                    int n1155 = n2 = (0x9BD6 | 0x531649F0) - (0x9BD6 & 0x531649F0);
                    int n1156 = n2;
                    int n1157 = n1155 + 1393969648 - (n1155 & 0x531649F0) * 2 & ~n | ~(n1156 + 1393969648 - (n1156 & 0x531649F0) * 2) & n;
                    n = 39843;
                    int n1158 = n2 = (0xFFFF644B | 0x531649F0) - (0xFFFF644B & 0x531649F0);
                    int n1159 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1157] = n1158 + 1393969648 - (n1158 & 0x531649F0) * 2 & ~n | ~(n1159 + 1393969648 - (n1159 & 0x531649F0) * 2) & n;
                    n = 40975;
                    int n1160 = n2 = (0xA081 | 0x531649F0) - (0xA081 & 0x531649F0);
                    int n1161 = n2;
                    int n1162 = (n1160 + 1393969648 - (n1160 & 0x531649F0) * 2 | n) & (~(n1161 + 1393969648 - (n1161 & 0x531649F0) * 2) | ~n);
                    n = 40975;
                    int n1163 = n2 = (0xFFFF5FBF | 0x531649F0) - (0xFFFF5FBF & 0x531649F0);
                    int n1164 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1162] = (n1163 + 1393969648 - (n1163 & 0x531649F0) * 2 | n) - (n1164 + 1393969648 - (n1164 & 0x531649F0) * 2 & n);
                    n = 55034;
                    int n1165 = n2 = (0xD6D7 | 0x531649F0) - (0xD6D7 & 0x531649F0);
                    int n1166 = n2;
                    int n1167 = n1165 + 1393969648 - (n1165 & 0x531649F0) * 2 & ~n | ~(n1166 + 1393969648 - (n1166 & 0x531649F0) * 2) & n;
                    n = 55034;
                    int n1168 = n2 = (0xFFFF2906 | 0x531649F0) - (0xFFFF2906 & 0x531649F0);
                    int n1169 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1167] = (n1168 + 1393969648 - (n1168 & 0x531649F0) * 2 | n) - (n1169 + 1393969648 - (n1169 & 0x531649F0) * 2 & n);
                    n = 9619;
                    int n1170 = n2 = (0x2486 | 0x531649F0) - (0x2486 & 0x531649F0);
                    int n1171 = n2;
                    int n1172 = n1170 + 1393969648 - (n1170 & 0x531649F0) * 2 & ~n | ~(n1171 + 1393969648 - (n1171 & 0x531649F0) * 2) & n;
                    n = 9619;
                    int n1173 = n2 = (0x2591 | 0x531649F0) - (0x2591 & 0x531649F0);
                    int n1174 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1172] = (n1173 + 1393969648 - (n1173 & 0x531649F0) * 2 | n) - (n1174 + 1393969648 - (n1174 & 0x531649F0) * 2 & n);
                    n3 = (0x85C948E0 | 0x94BA72B2) - (0x85C948E0 & 0x94BA72B2);
                    continue block56;
                }
                case -2050406176: {
                    n = 16453;
                    int n1175 = n2 = (0x4166 | 0x531649F0) - (0x4166 & 0x531649F0);
                    int n1176 = n2;
                    int n1177 = (n1175 + 1393969648 - (n1175 & 0x531649F0) * 2 | n) & (~(n1176 + 1393969648 - (n1176 & 0x531649F0) * 2) | ~n);
                    n = 16453;
                    int n1178 = n2 = (0x4045 | 0x531649F0) - (0x4045 & 0x531649F0);
                    int n1179 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1177] = (n1178 + 1393969648 - (n1178 & 0x531649F0) * 2 | n) - (n1179 + 1393969648 - (n1179 & 0x531649F0) * 2 & n);
                    n = 19432;
                    int n1180 = n2 = (0x4B84 | 0x531649F0) - (0x4B84 & 0x531649F0);
                    int n1181 = n2;
                    int n1182 = (n1180 + 1393969648 - (n1180 & 0x531649F0) * 2 | n) & (~(n1181 + 1393969648 - (n1181 & 0x531649F0) * 2) | ~n);
                    n = 19432;
                    int n1183 = n2 = (0x4BB2 | 0x531649F0) - (0x4BB2 & 0x531649F0);
                    int n1184 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1182] = (n1183 + 1393969648 - (n1183 & 0x531649F0) * 2 | n) & ~(n1184 + 1393969648 - (n1184 & 0x531649F0) * 2 & n);
                    n3 = (0x24CE10E9 | 0x94BA72B2) - (0x24CE10E9 & 0x94BA72B2);
                    continue block56;
                }
                case 617484521: {
                    n = 36152;
                    int n1185 = n2 = (0x8DC5 | 0x531649F0) - (0x8DC5 & 0x531649F0);
                    int n1186 = n2;
                    int n1187 = n1185 + 1393969648 - (n1185 & 0x531649F0) * 2 & ~n | ~(n1186 + 1393969648 - (n1186 & 0x531649F0) * 2) & n;
                    n = 36152;
                    int n1188 = n2 = (0xFFFF72D5 | 0x531649F0) - (0xFFFF72D5 & 0x531649F0);
                    int n1189 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1187] = (n1188 + 1393969648 - (n1188 & 0x531649F0) * 2 | n) - (n1189 + 1393969648 - (n1189 & 0x531649F0) * 2 & n);
                    n = 65932;
                    int n1190 = n2 = (0x101CB | 0x531649F0) - (0x101CB & 0x531649F0);
                    int n1191 = n2;
                    int n1192 = (n1190 + 1393969648 - (n1190 & 0x531649F0) * 2 | n) & (~(n1191 + 1393969648 - (n1191 & 0x531649F0) * 2) | ~n);
                    n = 65932;
                    int n1193 = n2 = (0xFFFEFE06 | 0x531649F0) - (0xFFFEFE06 & 0x531649F0);
                    int n1194 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1192] = (n1193 + 1393969648 - (n1193 & 0x531649F0) * 2 | n) & ~(n1194 + 1393969648 - (n1194 & 0x531649F0) * 2 & n);
                    n = 27279;
                    int n1195 = n2 = (0x6ADB | 0x531649F0) - (0x6ADB & 0x531649F0);
                    int n1196 = n2;
                    int n1197 = (n1195 + 1393969648 - (n1195 & 0x531649F0) * 2 | n) - (n1196 + 1393969648 - (n1196 & 0x531649F0) * 2 & n);
                    n = 27279;
                    int n1198 = n2 = (0x6A85 | 0x531649F0) - (0x6A85 & 0x531649F0);
                    int n1199 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1197] = (n1198 + 1393969648 - (n1198 & 0x531649F0) * 2 | n) - (n1199 + 1393969648 - (n1199 & 0x531649F0) * 2 & n);
                    n = 50948;
                    int n1200 = n2 = (0xC7CC | 0x531649F0) - (0xC7CC & 0x531649F0);
                    int n1201 = n2;
                    int n1202 = n1200 + 1393969648 - (n1200 & 0x531649F0) * 2 & ~n | ~(n1201 + 1393969648 - (n1201 & 0x531649F0) * 2) & n;
                    n = 50948;
                    int n1203 = n2 = (0xC75E | 0x531649F0) - (0xC75E & 0x531649F0);
                    int n1204 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1202] = (n1203 + 1393969648 - (n1203 & 0x531649F0) * 2 | n) - (n1204 + 1393969648 - (n1204 & 0x531649F0) * 2 & n);
                    n = 661;
                    int n1205 = n2 = (0x2CE | 0x531649F0) - (0x2CE & 0x531649F0);
                    int n1206 = n2;
                    int n1207 = (n1205 + 1393969648 - (n1205 & 0x531649F0) * 2 | n) & (~(n1206 + 1393969648 - (n1206 & 0x531649F0) * 2) | ~n);
                    n = 661;
                    int n1208 = n2 = (0x2B1 | 0x531649F0) - (0x2B1 & 0x531649F0);
                    int n1209 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1207] = n1208 + 1393969648 - (n1208 & 0x531649F0) * 2 & ~n | ~(n1209 + 1393969648 - (n1209 & 0x531649F0) * 2) & n;
                    n = 37624;
                    int n1210 = n2 = (0x923E | 0x531649F0) - (0x923E & 0x531649F0);
                    int n1211 = n2;
                    int n1212 = (n1210 + 1393969648 - (n1210 & 0x531649F0) * 2 | n) - (n1211 + 1393969648 - (n1211 & 0x531649F0) * 2 & n);
                    n = 37624;
                    int n1213 = n2 = (0xDAFD502E | 0x531649F0) - (0xDAFD502E & 0x531649F0);
                    int n1214 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1212] = (n1213 + 1393969648 - (n1213 & 0x531649F0) * 2 | n) & ~(n1214 + 1393969648 - (n1214 & 0x531649F0) * 2 & n);
                    n = 5092;
                    int n1215 = n2 = (0x1332 | 0x531649F0) - (0x1332 & 0x531649F0);
                    int n1216 = n2;
                    int n1217 = (n1215 + 1393969648 - (n1215 & 0x531649F0) * 2 | n) - (n1216 + 1393969648 - (n1216 & 0x531649F0) * 2 & n);
                    n = 5092;
                    int n1218 = n2 = (0x13F5 | 0x531649F0) - (0x13F5 & 0x531649F0);
                    int n1219 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1217] = (n1218 + 1393969648 - (n1218 & 0x531649F0) * 2 | n) & ~(n1219 + 1393969648 - (n1219 & 0x531649F0) * 2 & n);
                    n = 22801;
                    int n1220 = n2 = (0x59E9 | 0x531649F0) - (0x59E9 & 0x531649F0);
                    int n1221 = n2;
                    int n1222 = (n1220 + 1393969648 - (n1220 & 0x531649F0) * 2 | n) & (~(n1221 + 1393969648 - (n1221 & 0x531649F0) * 2) | ~n);
                    n = 22801;
                    int n1223 = n2 = (0xB25B9E03 | 0x531649F0) - (0xB25B9E03 & 0x531649F0);
                    int n1224 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1222] = (n1223 + 1393969648 - (n1223 & 0x531649F0) * 2 | n) & (~(n1224 + 1393969648 - (n1224 & 0x531649F0) * 2) | ~n);
                    n3 = (0x30C20A3C | 0x94BA72B2) - (0x30C20A3C & 0x94BA72B2);
                    continue block56;
                }
                case 818022972: {
                    n = 35077;
                    int n1225 = n2 = (0x8960 | 0x531649F0) - (0x8960 & 0x531649F0);
                    int n1226 = n2;
                    int n1227 = (n1225 + 1393969648 - (n1225 & 0x531649F0) * 2 | n) & ~(n1226 + 1393969648 - (n1226 & 0x531649F0) * 2 & n);
                    n = 35077;
                    int n1228 = n2 = (0xFFFF76A0 | 0x531649F0) - (0xFFFF76A0 & 0x531649F0);
                    int n1229 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1227] = (n1228 + 1393969648 - (n1228 & 0x531649F0) * 2 | n) - (n1229 + 1393969648 - (n1229 & 0x531649F0) * 2 & n);
                    n = 54057;
                    int n1230 = n2 = (0xD225 | 0x531649F0) - (0xD225 & 0x531649F0);
                    int n1231 = n2;
                    int n1232 = (n1230 + 1393969648 - (n1230 & 0x531649F0) * 2 | n) - (n1231 + 1393969648 - (n1231 & 0x531649F0) * 2 & n);
                    n = 54057;
                    int n1233 = n2 = (0xD33E | 0x531649F0) - (0xD33E & 0x531649F0);
                    int n1234 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1232] = n1233 + 1393969648 - (n1233 & 0x531649F0) * 2 & ~n | ~(n1234 + 1393969648 - (n1234 & 0x531649F0) * 2) & n;
                    n = 24384;
                    int n1235 = n2 = (0x5F73 | 0x531649F0) - (0x5F73 & 0x531649F0);
                    int n1236 = n2;
                    int n1237 = (n1235 + 1393969648 - (n1235 & 0x531649F0) * 2 | n) & (~(n1236 + 1393969648 - (n1236 & 0x531649F0) * 2) | ~n);
                    n = 24384;
                    int n1238 = n2 = (0x706E1893 | 0x531649F0) - (0x706E1893 & 0x531649F0);
                    int n1239 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1237] = (n1238 + 1393969648 - (n1238 & 0x531649F0) * 2 | n) & ~(n1239 + 1393969648 - (n1239 & 0x531649F0) * 2 & n);
                    n = 16344;
                    int n1240 = n2 = (0x3ED5 | 0x531649F0) - (0x3ED5 & 0x531649F0);
                    int n1241 = n2;
                    int n1242 = (n1240 + 1393969648 - (n1240 & 0x531649F0) * 2 | n) - (n1241 + 1393969648 - (n1241 & 0x531649F0) * 2 & n);
                    n = 16344;
                    int n1243 = n2 = (0x3F82 | 0x531649F0) - (0x3F82 & 0x531649F0);
                    int n1244 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1242] = n1243 + 1393969648 - (n1243 & 0x531649F0) * 2 & ~n | ~(n1244 + 1393969648 - (n1244 & 0x531649F0) * 2) & n;
                    n3 = (0xB97AE053 | 0x94BA72B2) - (0xB97AE053 & 0x94BA72B2);
                    continue block56;
                }
                case -1183129517: {
                    n = 24976;
                    int n1245 = n2 = (0x6190 | 0x531649F0) - (0x6190 & 0x531649F0);
                    int n1246 = n2;
                    int n1247 = (n1245 + 1393969648 - (n1245 & 0x531649F0) * 2 | n) - (n1246 + 1393969648 - (n1246 & 0x531649F0) * 2 & n);
                    n = 24976;
                    int n1248 = n2 = (0x6137 | 0x531649F0) - (0x6137 & 0x531649F0);
                    int n1249 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1247] = n1248 + 1393969648 - (n1248 & 0x531649F0) * 2 & ~n | ~(n1249 + 1393969648 - (n1249 & 0x531649F0) * 2) & n;
                    n = 522;
                    int n1250 = n2 = (0x2C4 | 0x531649F0) - (0x2C4 & 0x531649F0);
                    int n1251 = n2;
                    int n1252 = n1250 + 1393969648 - (n1250 & 0x531649F0) * 2 & ~n | ~(n1251 + 1393969648 - (n1251 & 0x531649F0) * 2) & n;
                    n = 522;
                    int n1253 = n2 = (0x223 | 0x531649F0) - (0x223 & 0x531649F0);
                    int n1254 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1252] = (n1253 + 1393969648 - (n1253 & 0x531649F0) * 2 | n) & ~(n1254 + 1393969648 - (n1254 & 0x531649F0) * 2 & n);
                    n = 21777;
                    int n1255 = n2 = (0x551A | 0x531649F0) - (0x551A & 0x531649F0);
                    int n1256 = n2;
                    int n1257 = (n1255 + 1393969648 - (n1255 & 0x531649F0) * 2 | n) - (n1256 + 1393969648 - (n1256 & 0x531649F0) * 2 & n);
                    n = 21777;
                    int n1258 = n2 = (0x5511 | 0x531649F0) - (0x5511 & 0x531649F0);
                    int n1259 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1257] = n1258 + 1393969648 - (n1258 & 0x531649F0) * 2 & ~n | ~(n1259 + 1393969648 - (n1259 & 0x531649F0) * 2) & n;
                    n = 47016;
                    int n1260 = n2 = (0xB7B3 | 0x531649F0) - (0xB7B3 & 0x531649F0);
                    int n1261 = n2;
                    int n1262 = n1260 + 1393969648 - (n1260 & 0x531649F0) * 2 & ~n | ~(n1261 + 1393969648 - (n1261 & 0x531649F0) * 2) & n;
                    n = 47016;
                    int n1263 = n2 = (0xFFFF482D | 0x531649F0) - (0xFFFF482D & 0x531649F0);
                    int n1264 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1262] = n1263 + 1393969648 - (n1263 & 0x531649F0) * 2 & ~n | ~(n1264 + 1393969648 - (n1264 & 0x531649F0) * 2) & n;
                    n = 28008;
                    int n1265 = n2 = (0x6DB0 | 0x531649F0) - (0x6DB0 & 0x531649F0);
                    int n1266 = n2;
                    int n1267 = (n1265 + 1393969648 - (n1265 & 0x531649F0) * 2 | n) - (n1266 + 1393969648 - (n1266 & 0x531649F0) * 2 & n);
                    n = 28008;
                    int n1268 = n2 = (0xFFFF9202 | 0x531649F0) - (0xFFFF9202 & 0x531649F0);
                    int n1269 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1267] = (n1268 + 1393969648 - (n1268 & 0x531649F0) * 2 | n) & ~(n1269 + 1393969648 - (n1269 & 0x531649F0) * 2 & n);
                    n3 = (0xFEEB482E | 0x94BA72B2) - (0xFEEB482E & 0x94BA72B2);
                    continue block56;
                }
                case -18134994: {
                    n = 2548;
                    int n1270 = n2 = (0x9E7 | 0x531649F0) - (0x9E7 & 0x531649F0);
                    int n1271 = n2;
                    int n1272 = n1270 + 1393969648 - (n1270 & 0x531649F0) * 2 & ~n | ~(n1271 + 1393969648 - (n1271 & 0x531649F0) * 2) & n;
                    n = 2548;
                    int n1273 = n2 = (0x9BB | 0x531649F0) - (0x9BB & 0x531649F0);
                    int n1274 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1272] = (n1273 + 1393969648 - (n1273 & 0x531649F0) * 2 | n) & ~(n1274 + 1393969648 - (n1274 & 0x531649F0) * 2 & n);
                    n = 8117;
                    int n1275 = n2 = (0x1FD2 | 0x531649F0) - (0x1FD2 & 0x531649F0);
                    int n1276 = n2;
                    int n1277 = (n1275 + 1393969648 - (n1275 & 0x531649F0) * 2 | n) & ~(n1276 + 1393969648 - (n1276 & 0x531649F0) * 2 & n);
                    n = 8117;
                    int n1278 = n2 = (0xA545FD10 | 0x531649F0) - (0xA545FD10 & 0x531649F0);
                    int n1279 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1277] = (n1278 + 1393969648 - (n1278 & 0x531649F0) * 2 | n) - (n1279 + 1393969648 - (n1279 & 0x531649F0) * 2 & n);
                    n = 45071;
                    int n1280 = n2 = (0xB0B5 | 0x531649F0) - (0xB0B5 & 0x531649F0);
                    int n1281 = n2;
                    int n1282 = (n1280 + 1393969648 - (n1280 & 0x531649F0) * 2 | n) & ~(n1281 + 1393969648 - (n1281 & 0x531649F0) * 2 & n);
                    n = 45071;
                    int n1283 = n2 = (0xB049 | 0x531649F0) - (0xB049 & 0x531649F0);
                    int n1284 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1282] = (n1283 + 1393969648 - (n1283 & 0x531649F0) * 2 | n) & ~(n1284 + 1393969648 - (n1284 & 0x531649F0) * 2 & n);
                    n = 22647;
                    int n1285 = n2 = (0x58FA | 0x531649F0) - (0x58FA & 0x531649F0);
                    int n1286 = n2;
                    int n1287 = (n1285 + 1393969648 - (n1285 & 0x531649F0) * 2 | n) & ~(n1286 + 1393969648 - (n1286 & 0x531649F0) * 2 & n);
                    n = 22647;
                    int n1288 = n2 = (0x5844 | 0x531649F0) - (0x5844 & 0x531649F0);
                    int n1289 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1287] = (n1288 + 1393969648 - (n1288 & 0x531649F0) * 2 | n) - (n1289 + 1393969648 - (n1289 & 0x531649F0) * 2 & n);
                    n3 = (0x9CE2CE0 | 0x94BA72B2) - (0x9CE2CE0 & 0x94BA72B2);
                    continue block56;
                }
                case 164506848: {
                    n = 13027;
                    int n1290 = n2 = (0x3217 | 0x531649F0) - (0x3217 & 0x531649F0);
                    int n1291 = n2;
                    int n1292 = n1290 + 1393969648 - (n1290 & 0x531649F0) * 2 & ~n | ~(n1291 + 1393969648 - (n1291 & 0x531649F0) * 2) & n;
                    n = 13027;
                    int n1293 = n2 = (0x329E | 0x531649F0) - (0x329E & 0x531649F0);
                    int n1294 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1292] = n1293 + 1393969648 - (n1293 & 0x531649F0) * 2 & ~n | ~(n1294 + 1393969648 - (n1294 & 0x531649F0) * 2) & n;
                    n = 12714;
                    int n1295 = n2 = (0x31F5 | 0x531649F0) - (0x31F5 & 0x531649F0);
                    int n1296 = n2;
                    int n1297 = (n1295 + 1393969648 - (n1295 & 0x531649F0) * 2 | n) - (n1296 + 1393969648 - (n1296 & 0x531649F0) * 2 & n);
                    n = 12714;
                    int n1298 = n2 = (0xFFFFCE71 | 0x531649F0) - (0xFFFFCE71 & 0x531649F0);
                    int n1299 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1297] = (n1298 + 1393969648 - (n1298 & 0x531649F0) * 2 | n) & ~(n1299 + 1393969648 - (n1299 & 0x531649F0) * 2 & n);
                    n = 32360;
                    int n1300 = n2 = (0x7E13 | 0x531649F0) - (0x7E13 & 0x531649F0);
                    int n1301 = n2;
                    int n1302 = n1300 + 1393969648 - (n1300 & 0x531649F0) * 2 & ~n | ~(n1301 + 1393969648 - (n1301 & 0x531649F0) * 2) & n;
                    n = 32360;
                    int n1303 = n2 = (0x955ED5A | 0x531649F0) - (0x955ED5A & 0x531649F0);
                    int n1304 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1302] = n1303 + 1393969648 - (n1303 & 0x531649F0) * 2 & ~n | ~(n1304 + 1393969648 - (n1304 & 0x531649F0) * 2) & n;
                    return;
                }
                default: {
                    int n1305 = n2;
                    int n1306 = n2;
                    IIlllIlliIll = new int[(n1305 + 1393969648 - (n1305 & 0x531649F0) * 2 | n) & ~(n1306 + 1393969648 - (n1306 & 0x531649F0) * 2 & n)];
                    n3 = (0xA515BD9A | 0x94BA72B2) - (0xA515BD9A & 0x94BA72B2);
                    continue block56;
                }
                case -1525301862: {
                    n = 6825;
                    int n1307 = n2 = (0x1AC1 | 0x531649F0) - (0x1AC1 & 0x531649F0);
                    int n1308 = n2;
                    int n1309 = (n1307 + 1393969648 - (n1307 & 0x531649F0) * 2 | n) & ~(n1308 + 1393969648 - (n1308 & 0x531649F0) * 2 & n);
                    n = 6825;
                    int n1310 = n2 = (0x1AF3 | 0x531649F0) - (0x1AF3 & 0x531649F0);
                    int n1311 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1309] = (n1310 + 1393969648 - (n1310 & 0x531649F0) * 2 | n) & ~(n1311 + 1393969648 - (n1311 & 0x531649F0) * 2 & n);
                    n = 65666;
                    int n1312 = n2 = (0x10053 | 0x531649F0) - (0x10053 & 0x531649F0);
                    int n1313 = n2;
                    int n1314 = (n1312 + 1393969648 - (n1312 & 0x531649F0) * 2 | n) & (~(n1313 + 1393969648 - (n1313 & 0x531649F0) * 2) | ~n);
                    n = 65666;
                    int n1315 = n2 = (0xFFFEFF24 | 0x531649F0) - (0xFFFEFF24 & 0x531649F0);
                    int n1316 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1314] = (n1315 + 1393969648 - (n1315 & 0x531649F0) * 2 | n) & ~(n1316 + 1393969648 - (n1316 & 0x531649F0) * 2 & n);
                    n = 22098;
                    int n1317 = n2 = (0x5690 | 0x531649F0) - (0x5690 & 0x531649F0);
                    int n1318 = n2;
                    int n1319 = (n1317 + 1393969648 - (n1317 & 0x531649F0) * 2 | n) & (~(n1318 + 1393969648 - (n1318 & 0x531649F0) * 2) | ~n);
                    n = 22098;
                    int n1320 = n2 = (0xFFFFA995 | 0x531649F0) - (0xFFFFA995 & 0x531649F0);
                    int n1321 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1319] = n1320 + 1393969648 - (n1320 & 0x531649F0) * 2 & ~n | ~(n1321 + 1393969648 - (n1321 & 0x531649F0) * 2) & n;
                    n = 57904;
                    int n1322 = n2 = (0xE217 | 0x531649F0) - (0xE217 & 0x531649F0);
                    int n1323 = n2;
                    int n1324 = (n1322 + 1393969648 - (n1322 & 0x531649F0) * 2 | n) & ~(n1323 + 1393969648 - (n1323 & 0x531649F0) * 2 & n);
                    n = 57904;
                    int n1325 = n2 = (0xE25B | 0x531649F0) - (0xE25B & 0x531649F0);
                    int n1326 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1324] = n1325 + 1393969648 - (n1325 & 0x531649F0) * 2 & ~n | ~(n1326 + 1393969648 - (n1326 & 0x531649F0) * 2) & n;
                    n = 52612;
                    int n1327 = n2 = (0xCCA4 | 0x531649F0) - (0xCCA4 & 0x531649F0);
                    int n1328 = n2;
                    int n1329 = (n1327 + 1393969648 - (n1327 & 0x531649F0) * 2 | n) - (n1328 + 1393969648 - (n1328 & 0x531649F0) * 2 & n);
                    n = 52612;
                    int n1330 = n2 = (0xCD85 | 0x531649F0) - (0xCD85 & 0x531649F0);
                    int n1331 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1329] = (n1330 + 1393969648 - (n1330 & 0x531649F0) * 2 | n) - (n1331 + 1393969648 - (n1331 & 0x531649F0) * 2 & n);
                    n = 39476;
                    int n1332 = n2 = (0x9AC4 | 0x531649F0) - (0x9AC4 & 0x531649F0);
                    int n1333 = n2;
                    int n1334 = n1332 + 1393969648 - (n1332 & 0x531649F0) * 2 & ~n | ~(n1333 + 1393969648 - (n1333 & 0x531649F0) * 2) & n;
                    n = 39476;
                    int n1335 = n2 = (0x9A27 | 0x531649F0) - (0x9A27 & 0x531649F0);
                    int n1336 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1334] = n1335 + 1393969648 - (n1335 & 0x531649F0) * 2 & ~n | ~(n1336 + 1393969648 - (n1336 & 0x531649F0) * 2) & n;
                    n = 24748;
                    int n1337 = n2 = (0x60E2 | 0x531649F0) - (0x60E2 & 0x531649F0);
                    int n1338 = n2;
                    int n1339 = (n1337 + 1393969648 - (n1337 & 0x531649F0) * 2 | n) & ~(n1338 + 1393969648 - (n1338 & 0x531649F0) * 2 & n);
                    n = 24748;
                    int n1340 = n2 = (0x60A3 | 0x531649F0) - (0x60A3 & 0x531649F0);
                    int n1341 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1339] = (n1340 + 1393969648 - (n1340 & 0x531649F0) * 2 | n) & ~(n1341 + 1393969648 - (n1341 & 0x531649F0) * 2 & n);
                    n = 38996;
                    int n1342 = n2 = (0x987D | 0x531649F0) - (0x987D & 0x531649F0);
                    int n1343 = n2;
                    int n1344 = (n1342 + 1393969648 - (n1342 & 0x531649F0) * 2 | n) & ~(n1343 + 1393969648 - (n1343 & 0x531649F0) * 2 & n);
                    n = 38996;
                    int n1345 = n2 = (0x981A | 0x531649F0) - (0x981A & 0x531649F0);
                    int n1346 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1344] = (n1345 + 1393969648 - (n1345 & 0x531649F0) * 2 | n) & (~(n1346 + 1393969648 - (n1346 & 0x531649F0) * 2) | ~n);
                    n = 51786;
                    int n1347 = n2 = (0xCA52 | 0x531649F0) - (0xCA52 & 0x531649F0);
                    int n1348 = n2;
                    int n1349 = (n1347 + 1393969648 - (n1347 & 0x531649F0) * 2 | n) & ~(n1348 + 1393969648 - (n1348 & 0x531649F0) * 2 & n);
                    n = 51786;
                    int n1350 = n2 = (0xCA4B | 0x531649F0) - (0xCA4B & 0x531649F0);
                    int n1351 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1349] = (n1350 + 1393969648 - (n1350 & 0x531649F0) * 2 | n) & ~(n1351 + 1393969648 - (n1351 & 0x531649F0) * 2 & n);
                    n = 58987;
                    int n1352 = n2 = (0xE641 | 0x531649F0) - (0xE641 & 0x531649F0);
                    int n1353 = n2;
                    int n1354 = (n1352 + 1393969648 - (n1352 & 0x531649F0) * 2 | n) & (~(n1353 + 1393969648 - (n1353 & 0x531649F0) * 2) | ~n);
                    n = 58987;
                    int n1355 = n2 = (0xE673 | 0x531649F0) - (0xE673 & 0x531649F0);
                    int n1356 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1354] = (n1355 + 1393969648 - (n1355 & 0x531649F0) * 2 | n) & (~(n1356 + 1393969648 - (n1356 & 0x531649F0) * 2) | ~n);
                    n3 = (0x127E0067 | 0x94BA72B2) - (0x127E0067 & 0x94BA72B2);
                    continue block56;
                }
                case 310247527: {
                    n = 49389;
                    int n1357 = n2 = (0xC0C9 | 0x531649F0) - (0xC0C9 & 0x531649F0);
                    int n1358 = n2;
                    int n1359 = (n1357 + 1393969648 - (n1357 & 0x531649F0) * 2 | n) & ~(n1358 + 1393969648 - (n1358 & 0x531649F0) * 2 & n);
                    n = 49389;
                    int n1360 = n2 = (0xC0B7 | 0x531649F0) - (0xC0B7 & 0x531649F0);
                    int n1361 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1359] = n1360 + 1393969648 - (n1360 & 0x531649F0) * 2 & ~n | ~(n1361 + 1393969648 - (n1361 & 0x531649F0) * 2) & n;
                    n = 9023;
                    int n1362 = n2 = (0x23B3 | 0x531649F0) - (0x23B3 & 0x531649F0);
                    int n1363 = n2;
                    int n1364 = (n1362 + 1393969648 - (n1362 & 0x531649F0) * 2 | n) & (~(n1363 + 1393969648 - (n1363 & 0x531649F0) * 2) | ~n);
                    n = 9023;
                    int n1365 = n2 = (0x235C | 0x531649F0) - (0x235C & 0x531649F0);
                    int n1366 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1364] = (n1365 + 1393969648 - (n1365 & 0x531649F0) * 2 | n) & ~(n1366 + 1393969648 - (n1366 & 0x531649F0) * 2 & n);
                    n = 2381;
                    int n1367 = n2 = (0x991 | 0x531649F0) - (0x991 & 0x531649F0);
                    int n1368 = n2;
                    int n1369 = (n1367 + 1393969648 - (n1367 & 0x531649F0) * 2 | n) & (~(n1368 + 1393969648 - (n1368 & 0x531649F0) * 2) | ~n);
                    n = 2381;
                    int n1370 = n2 = (0x968 | 0x531649F0) - (0x968 & 0x531649F0);
                    int n1371 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1369] = n1370 + 1393969648 - (n1370 & 0x531649F0) * 2 & ~n | ~(n1371 + 1393969648 - (n1371 & 0x531649F0) * 2) & n;
                    n = 23768;
                    int n1372 = n2 = (0x5C5A | 0x531649F0) - (0x5C5A & 0x531649F0);
                    int n1373 = n2;
                    int n1374 = (n1372 + 1393969648 - (n1372 & 0x531649F0) * 2 | n) - (n1373 + 1393969648 - (n1373 & 0x531649F0) * 2 & n);
                    n = 23768;
                    int n1375 = n2 = (0x5CF5 | 0x531649F0) - (0x5CF5 & 0x531649F0);
                    int n1376 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1374] = n1375 + 1393969648 - (n1375 & 0x531649F0) * 2 & ~n | ~(n1376 + 1393969648 - (n1376 & 0x531649F0) * 2) & n;
                    n3 = (0xF09E3370 | 0x94BA72B2) - (0xF09E3370 & 0x94BA72B2);
                    continue block56;
                }
                case -258067600: {
                    n = 26911;
                    int n1377 = n2 = (0x6816 | 0x531649F0) - (0x6816 & 0x531649F0);
                    int n1378 = n2;
                    int n1379 = (n1377 + 1393969648 - (n1377 & 0x531649F0) * 2 | n) & ~(n1378 + 1393969648 - (n1378 & 0x531649F0) * 2 & n);
                    n = 26911;
                    int n1380 = n2 = (0x691E | 0x531649F0) - (0x691E & 0x531649F0);
                    int n1381 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1379] = (n1380 + 1393969648 - (n1380 & 0x531649F0) * 2 | n) - (n1381 + 1393969648 - (n1381 & 0x531649F0) * 2 & n);
                    n = 10185;
                    int n1382 = n2 = (0x27EC | 0x531649F0) - (0x27EC & 0x531649F0);
                    int n1383 = n2;
                    int n1384 = (n1382 + 1393969648 - (n1382 & 0x531649F0) * 2 | n) & ~(n1383 + 1393969648 - (n1383 & 0x531649F0) * 2 & n);
                    n = 10185;
                    int n1385 = n2 = (0x27CB | 0x531649F0) - (0x27CB & 0x531649F0);
                    int n1386 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1384] = (n1385 + 1393969648 - (n1385 & 0x531649F0) * 2 | n) - (n1386 + 1393969648 - (n1386 & 0x531649F0) * 2 & n);
                    n = 2380;
                    int n1387 = n2 = (0x9AB | 0x531649F0) - (0x9AB & 0x531649F0);
                    int n1388 = n2;
                    int n1389 = n1387 + 1393969648 - (n1387 & 0x531649F0) * 2 & ~n | ~(n1388 + 1393969648 - (n1388 & 0x531649F0) * 2) & n;
                    n = 2380;
                    int n1390 = n2 = (0x939 | 0x531649F0) - (0x939 & 0x531649F0);
                    int n1391 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1389] = (n1390 + 1393969648 - (n1390 & 0x531649F0) * 2 | n) & (~(n1391 + 1393969648 - (n1391 & 0x531649F0) * 2) | ~n);
                    n = 61994;
                    int n1392 = n2 = (0xF233 | 0x531649F0) - (0xF233 & 0x531649F0);
                    int n1393 = n2;
                    int n1394 = (n1392 + 1393969648 - (n1392 & 0x531649F0) * 2 | n) - (n1393 + 1393969648 - (n1393 & 0x531649F0) * 2 & n);
                    n = 61994;
                    int n1395 = n2 = (0xA8ABF527 | 0x531649F0) - (0xA8ABF527 & 0x531649F0);
                    int n1396 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1394] = (n1395 + 1393969648 - (n1395 & 0x531649F0) * 2 | n) - (n1396 + 1393969648 - (n1396 & 0x531649F0) * 2 & n);
                    n = 59899;
                    int n1397 = n2 = (0xE91E | 0x531649F0) - (0xE91E & 0x531649F0);
                    int n1398 = n2;
                    int n1399 = n1397 + 1393969648 - (n1397 & 0x531649F0) * 2 & ~n | ~(n1398 + 1393969648 - (n1398 & 0x531649F0) * 2) & n;
                    n = 59899;
                    int n1400 = n2 = (0xE959 | 0x531649F0) - (0xE959 & 0x531649F0);
                    int n1401 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1399] = (n1400 + 1393969648 - (n1400 & 0x531649F0) * 2 | n) & ~(n1401 + 1393969648 - (n1401 & 0x531649F0) * 2 & n);
                    n = 43395;
                    int n1402 = n2 = (0xA925 | 0x531649F0) - (0xA925 & 0x531649F0);
                    int n1403 = n2;
                    int n1404 = (n1402 + 1393969648 - (n1402 & 0x531649F0) * 2 | n) & ~(n1403 + 1393969648 - (n1403 & 0x531649F0) * 2 & n);
                    n = 43395;
                    int n1405 = n2 = (0xFFFF5627 | 0x531649F0) - (0xFFFF5627 & 0x531649F0);
                    int n1406 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1404] = (n1405 + 1393969648 - (n1405 & 0x531649F0) * 2 | n) & (~(n1406 + 1393969648 - (n1406 & 0x531649F0) * 2) | ~n);
                    n = 59227;
                    int n1407 = n2 = (0xE7DE | 0x531649F0) - (0xE7DE & 0x531649F0);
                    int n1408 = n2;
                    int n1409 = (n1407 + 1393969648 - (n1407 & 0x531649F0) * 2 | n) - (n1408 + 1393969648 - (n1408 & 0x531649F0) * 2 & n);
                    n = 59227;
                    int n1410 = n2 = (0xA54505FE | 0x531649F0) - (0xA54505FE & 0x531649F0);
                    int n1411 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1409] = (n1410 + 1393969648 - (n1410 & 0x531649F0) * 2 | n) & ~(n1411 + 1393969648 - (n1411 & 0x531649F0) * 2 & n);
                    n = 67314;
                    int n1412 = n2 = (0x10686 | 0x531649F0) - (0x10686 & 0x531649F0);
                    int n1413 = n2;
                    int n1414 = (n1412 + 1393969648 - (n1412 & 0x531649F0) * 2 | n) & (~(n1413 + 1393969648 - (n1413 & 0x531649F0) * 2) | ~n);
                    n = 67314;
                    int n1415 = n2 = (0xFFFEF931 | 0x531649F0) - (0xFFFEF931 & 0x531649F0);
                    int n1416 = n2;
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1414] = (n1415 + 1393969648 - (n1415 & 0x531649F0) * 2 | n) & (~(n1416 + 1393969648 - (n1416 & 0x531649F0) * 2) | ~n);
                    n3 = (0x727AD832 | 0x94BA72B2) - (0x727AD832 & 0x94BA72B2);
                    continue block56;
                }
                case 1920653362: 
            }
            n = 18593;
            int n1417 = n2 = (0x48F0 | 0x531649F0) - (0x48F0 & 0x531649F0);
            int n1418 = n2;
            int n1419 = (n1417 + 1393969648 - (n1417 & 0x531649F0) * 2 | n) & (~(n1418 + 1393969648 - (n1418 & 0x531649F0) * 2) | ~n);
            n = 18593;
            int n1420 = n2 = (0xFFFFB778 | 0x531649F0) - (0xFFFFB778 & 0x531649F0);
            int n1421 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1419] = (n1420 + 1393969648 - (n1420 & 0x531649F0) * 2 | n) & (~(n1421 + 1393969648 - (n1421 & 0x531649F0) * 2) | ~n);
            n = 12693;
            int n1422 = n2 = (0x31A9 | 0x531649F0) - (0x31A9 & 0x531649F0);
            int n1423 = n2;
            int n1424 = (n1422 + 1393969648 - (n1422 & 0x531649F0) * 2 | n) & ~(n1423 + 1393969648 - (n1423 & 0x531649F0) * 2 & n);
            n = 12693;
            int n1425 = n2 = (0x31AE | 0x531649F0) - (0x31AE & 0x531649F0);
            int n1426 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1424] = (n1425 + 1393969648 - (n1425 & 0x531649F0) * 2 | n) & (~(n1426 + 1393969648 - (n1426 & 0x531649F0) * 2) | ~n);
            n = 39669;
            int n1427 = n2 = (0x9A91 | 0x531649F0) - (0x9A91 & 0x531649F0);
            int n1428 = n2;
            int n1429 = n1427 + 1393969648 - (n1427 & 0x531649F0) * 2 & ~n | ~(n1428 + 1393969648 - (n1428 & 0x531649F0) * 2) & n;
            n = 39669;
            int n1430 = n2 = (0xFFFF657E | 0x531649F0) - (0xFFFF657E & 0x531649F0);
            int n1431 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1429] = (n1430 + 1393969648 - (n1430 & 0x531649F0) * 2 | n) - (n1431 + 1393969648 - (n1431 & 0x531649F0) * 2 & n);
            n = 17679;
            int n1432 = n2 = (0x45A6 | 0x531649F0) - (0x45A6 & 0x531649F0);
            int n1433 = n2;
            int n1434 = (n1432 + 1393969648 - (n1432 & 0x531649F0) * 2 | n) & ~(n1433 + 1393969648 - (n1433 & 0x531649F0) * 2 & n);
            n = 17679;
            int n1435 = n2 = (0xFFFFBA64 | 0x531649F0) - (0xFFFFBA64 & 0x531649F0);
            int n1436 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1434] = (n1435 + 1393969648 - (n1435 & 0x531649F0) * 2 | n) - (n1436 + 1393969648 - (n1436 & 0x531649F0) * 2 & n);
            n = 39921;
            int n1437 = n2 = (0x9AE7 | 0x531649F0) - (0x9AE7 & 0x531649F0);
            int n1438 = n2;
            int n1439 = (n1437 + 1393969648 - (n1437 & 0x531649F0) * 2 | n) & (~(n1438 + 1393969648 - (n1438 & 0x531649F0) * 2) | ~n);
            n = 39921;
            int n1440 = n2 = (0x9BF2 | 0x531649F0) - (0x9BF2 & 0x531649F0);
            int n1441 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1439] = (n1440 + 1393969648 - (n1440 & 0x531649F0) * 2 | n) & ~(n1441 + 1393969648 - (n1441 & 0x531649F0) * 2 & n);
            n = 12766;
            int n1442 = n2 = (0x30C9 | 0x531649F0) - (0x30C9 & 0x531649F0);
            int n1443 = n2;
            int n1444 = (n1442 + 1393969648 - (n1442 & 0x531649F0) * 2 | n) - (n1443 + 1393969648 - (n1443 & 0x531649F0) * 2 & n);
            n = 12766;
            int n1445 = n2 = (0x31DA | 0x531649F0) - (0x31DA & 0x531649F0);
            int n1446 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1444] = (n1445 + 1393969648 - (n1445 & 0x531649F0) * 2 | n) & ~(n1446 + 1393969648 - (n1446 & 0x531649F0) * 2 & n);
            n = 5954;
            int n1447 = n2 = (0x17D5 | 0x531649F0) - (0x17D5 & 0x531649F0);
            int n1448 = n2;
            int n1449 = (n1447 + 1393969648 - (n1447 & 0x531649F0) * 2 | n) - (n1448 + 1393969648 - (n1448 & 0x531649F0) * 2 & n);
            n = 5954;
            int n1450 = n2 = (0x1731 | 0x531649F0) - (0x1731 & 0x531649F0);
            int n1451 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1449] = n1450 + 1393969648 - (n1450 & 0x531649F0) * 2 & ~n | ~(n1451 + 1393969648 - (n1451 & 0x531649F0) * 2) & n;
            n = 9429;
            int n1452 = n2 = (0x24AD | 0x531649F0) - (0x24AD & 0x531649F0);
            int n1453 = n2;
            int n1454 = (n1452 + 1393969648 - (n1452 & 0x531649F0) * 2 | n) - (n1453 + 1393969648 - (n1453 & 0x531649F0) * 2 & n);
            n = 9429;
            int n1455 = n2 = (0xA545C670 | 0x531649F0) - (0xA545C670 & 0x531649F0);
            int n1456 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1454] = (n1455 + 1393969648 - (n1455 & 0x531649F0) * 2 | n) & (~(n1456 + 1393969648 - (n1456 & 0x531649F0) * 2) | ~n);
            n = 24301;
            int n1457 = n2 = (0x5E67 | 0x531649F0) - (0x5E67 & 0x531649F0);
            int n1458 = n2;
            int n1459 = (n1457 + 1393969648 - (n1457 & 0x531649F0) * 2 | n) & (~(n1458 + 1393969648 - (n1458 & 0x531649F0) * 2) | ~n);
            n = 24301;
            int n1460 = n2 = (0x5EAC | 0x531649F0) - (0x5EAC & 0x531649F0);
            int n1461 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1459] = (n1460 + 1393969648 - (n1460 & 0x531649F0) * 2 | n) & (~(n1461 + 1393969648 - (n1461 & 0x531649F0) * 2) | ~n);
            n = 54577;
            int n1462 = n2 = (0xD586 | 0x531649F0) - (0xD586 & 0x531649F0);
            int n1463 = n2;
            int n1464 = (n1462 + 1393969648 - (n1462 & 0x531649F0) * 2 | n) & (~(n1463 + 1393969648 - (n1463 & 0x531649F0) * 2) | ~n);
            n = 54577;
            int n1465 = n2 = (0xD520 | 0x531649F0) - (0xD520 & 0x531649F0);
            int n1466 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1464] = n1465 + 1393969648 - (n1465 & 0x531649F0) * 2 & ~n | ~(n1466 + 1393969648 - (n1466 & 0x531649F0) * 2) & n;
            n = 57108;
            int n1467 = n2 = (0xDFC4 | 0x531649F0) - (0xDFC4 & 0x531649F0);
            int n1468 = n2;
            int n1469 = n1467 + 1393969648 - (n1467 & 0x531649F0) * 2 & ~n | ~(n1468 + 1393969648 - (n1468 & 0x531649F0) * 2) & n;
            n = 57108;
            int n1470 = n2 = (0xDF39 | 0x531649F0) - (0xDF39 & 0x531649F0);
            int n1471 = n2;
            Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.IIlllIlliIll[n1469] = n1470 + 1393969648 - (n1470 & 0x531649F0) * 2 & ~n | ~(n1471 + 1393969648 - (n1471 & 0x531649F0) * 2) & n;
            n3 = (0x71C31815 | 0x94BA72B2) - (0x71C31815 & 0x94BA72B2);
        }
    }

    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onVillagerPurchase(PlayerPurchaseEvent playerPurchaseEvent) {
        Object[] objectArray = new Object[37];
        objectArray[32] = IIlllIlliIll[78];
        objectArray[22] = IIlllIlliIll[79];
        objectArray[2] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[2] - ~((Integer)objectArray[22]).intValue() - 1;
        objectArray[22] = IIlllIlliIll[80];
        objectArray[2] = (int)((Integer)objectArray[32]);
        objectArray[32] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[22]) - ((Integer)objectArray[2] ^ (Integer)objectArray[22]);
        Object[] objectArray2 = new Object[((Integer)objectArray[32]).intValue()];
        objectArray[36] = IIlllIlliIll[81];
        objectArray[22] = IIlllIlliIll[82];
        objectArray[2] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[2] | (Integer)objectArray[22]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[22]).intValue());
        objectArray[22] = IIlllIlliIll[83];
        objectArray[2] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[2] | (Integer)objectArray[22]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[22]).intValue());
        objectArray2[((Integer)objectArray[36]).intValue()] = this;
        objectArray[26] = IIlllIlliIll[84];
        objectArray[22] = IIlllIlliIll[85];
        objectArray[2] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[2] ^ (Integer)objectArray[22]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[22]);
        objectArray[22] = IIlllIlliIll[86];
        objectArray[2] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[2] & ~((Integer)objectArray[22]).intValue()) - ((Integer)objectArray[2] ^ (Integer)objectArray[22]);
        objectArray2[((Integer)objectArray[26]).intValue()] = playerPurchaseEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("6eb95375-f5f1-4dae-89c1-9a6983aae65e", (long)-7952318941087767009L, (Object[])objectArray2, (int)IIlllIlliIll[87], (String)"dHNo", (String)"LkxdFjZncGcpNj1oYSlJODZjZXI9cxBsZ3BndTBnaGEpFT5sY2VyYQ==", (int)IIlllIlliIll[88], (String)"a2MoNil1b200a2kzMChpLyhqZ3F1Nywob2hyPy5oZ2ooCjBnf2N0Hj1yZw==", (int)IIlllIlliIll[89], (int)IIlllIlliIll[90], (String)"WUR3eWFk", (String)"SnN1Mzc0NzMzbHJPam9PNjBqb2pPM3Jqb29vExVqak9qdDVPak9qNjBqam9qNnJPb2pqMzBvb2pPEzUoak9vMxVvT2pvNjBvKG9qMxVvb2pvMzVvbyhqEzVvT29PNjVqam8=", (String)"VDl1QjFL");
    }

    /*
     * Enabled aggressive block sorting
     */
    private double applyMomentum(UUID uUID, double d, Lusik21556.Iiiilliiil.IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x517C409 | 0xDC968DE7) - (0x517C409 & 0xDC968DE7);
        Illlllllilll = n2 + -594113049 - (n2 & 0xDC968DE7) * 2;
        if (422784780 <= Illlllllilll) {
            int n3 = n = (0x5F | 0xDC968DE7) - (0x5F & 0xDC968DE7);
            int cfr_ignored_0 = n3 + -594113049 - (n3 & 0xDC968DE7) * 2;
        }
        Object[] objectArray = new Object[40];
        objectArray[37] = IIlllIlliIll[176];
        objectArray[28] = IIlllIlliIll[177];
        objectArray[31] = (int)((Integer)objectArray[37]);
        objectArray[37] = (Integer)objectArray[31] - ~((Integer)objectArray[28]).intValue() - 1;
        objectArray[28] = IIlllIlliIll[178];
        objectArray[31] = (int)((Integer)objectArray[37]);
        objectArray[37] = ((Integer)objectArray[31] | (Integer)objectArray[28]) & (~((Integer)objectArray[31]).intValue() | ~((Integer)objectArray[28]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[37]).intValue()];
        objectArray[39] = IIlllIlliIll[179];
        objectArray[28] = IIlllIlliIll[180];
        objectArray[31] = (int)((Integer)objectArray[39]);
        objectArray[39] = (Integer)objectArray[31] - ~((Integer)objectArray[28]).intValue() - 1;
        objectArray[28] = IIlllIlliIll[181];
        objectArray[31] = (int)((Integer)objectArray[39]);
        objectArray[39] = ((Integer)objectArray[31] ^ (Integer)objectArray[28]) + 2 * ((Integer)objectArray[31] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[39]).intValue()] = this;
        objectArray[1] = IIlllIlliIll[182];
        objectArray[28] = IIlllIlliIll[183];
        objectArray[31] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[31] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[31]).intValue() & (Integer)objectArray[28];
        objectArray[28] = IIlllIlliIll[184];
        objectArray[31] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[31] ^ (Integer)objectArray[28]) + 2 * ((Integer)objectArray[31] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[1]).intValue()] = uUID;
        objectArray[20] = IIlllIlliIll[185];
        objectArray[28] = IIlllIlliIll[186];
        objectArray[31] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[31] | (Integer)objectArray[28]) - ((Integer)objectArray[31] & (Integer)objectArray[28]);
        objectArray[28] = IIlllIlliIll[187];
        objectArray[31] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[31] - ~((Integer)objectArray[28]).intValue() - 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("79446346-f846-4a6c-a1a3-3d8ccda003e1", (double)d, (int)IIlllIlliIll[188], (String)"eG9iLzFBaA==", (String)"JkonFj5veG8hNjVgaSFKNSFsYms1", (int)IIlllIlliIll[189], (String)"ZG94O3pib2BpdBBhe2xiPw==", (int)IIlllIlliIll[190], (int)IIlllIlliIll[191], (String)"YktrMnQz", (String)"Qnt9Mz88Pzs7bHpHYmdHNjhiZ2JHM3piZ2dnEx1iYkdidD1HYkdiNjhiYmdiNnpHZ2JiMzhnZ2JHEz0gYkdnMx1nR2JnNjhnIGdiMx1nZ2JnMz1nZyBiEz1nR2dHNj1iYmc=", (String)"UlQ1MmFC");
        objectArray[29] = IIlllIlliIll[192];
        objectArray[28] = IIlllIlliIll[193];
        objectArray[31] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[31] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[31]).intValue() & (Integer)objectArray[28];
        objectArray[28] = IIlllIlliIll[194];
        objectArray[31] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[31] | (Integer)objectArray[28]) - ((Integer)objectArray[31] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[29]).intValue()] = iliIlllilIi;
        return (double)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("7d874b43-15fb-42d1-81d5-395c274ade94", (Object)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("5ae31d35-e982-41cc-97b1-faada2dfdf5a", (long)-7472689529890158088L, (Object[])objectArray2, (int)IIlllIlliIll[195], (String)"fXph", (String)"J0VUFj9ueW4gNjRhaCBAOD9qbHs0cxllbnludTluYWggFTdlamx7YQ==", (int)IIlllIlliIll[196], (String)"YmohNiB8ZmQ9a2A6OSFgLyFjbnh8NyUhZmF7PydhbmMhCjludmp9HjR7bg==", (int)IIlllIlliIll[197], (int)IIlllIlliIll[198], (String)"QWJwUDVB", (String)"Q3p8Mz49Pjo6bHtGY2ZGNjljZmNGM3tjZmZmExxjY0ZjdDxGY0ZjNjljY2ZjNntGZmNjMzlmZmNGEzwhY0ZmMxxmRmNmNjlmIWZjMxxmZmNmMzxmZiFjEzxmRmZGNjxjY2Y=", (String)"alp2RFRr"), (int)IIlllIlliIll[199], (String)"ZH9UNT9yfHU=", (String)"OFx6OzxxP3xxNC0/X3J6PylkKzlU", (int)IIlllIlliIll[200], (String)"fXU+Nj9jeXsia38lJj5/Lz58cWdjNzo+eX5kPzh+cXw+CiZxaXViHitkcQ==", (int)IIlllIlliIll[201], (int)IIlllIlliIll[202], (String)"MVIyZ1Rp", (String)"XGVjMyEiISUlbGRZfHlZNiZ8eXxZM2R8eXl5EwN8fFl8dCNZfFl8NiZ8fHl8NmRZeXx8MyZ5eXxZEyM+fFl5MwN5WXx5NiZ5Pnl8MwN5eXx5MyN5eT58EyN5WXlZNiN8fHk=", (String)"cGxSS3E4");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void onCrossbowShoot(EntityShootBowEvent entityShootBowEvent) {
        Object[] objectArray = new Object[38];
        int n = (0x66EF38EE | 0x414D5B50) - (0x66EF38EE & 0x414D5B50);
        int cfr_ignored_0 = n + 1095588688;
        objectArray[36] = IIlllIlliIll[137];
        objectArray[0] = IIlllIlliIll[138];
        objectArray[7] = (int)((Integer)objectArray[36]);
        objectArray[36] = (Integer)objectArray[7] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[7]).intValue() & (Integer)objectArray[0];
        objectArray[0] = IIlllIlliIll[139];
        objectArray[7] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[7] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[7] & (Integer)objectArray[0]);
        Object[] objectArray2 = new Object[((Integer)objectArray[36]).intValue()];
        objectArray[16] = IIlllIlliIll[140];
        objectArray[0] = IIlllIlliIll[141];
        objectArray[7] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[7] | (Integer)objectArray[0]) & ~((Integer)objectArray[7] & (Integer)objectArray[0]);
        objectArray[0] = IIlllIlliIll[142];
        objectArray[7] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[7] - ~((Integer)objectArray[0]).intValue() - 1;
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[11] = IIlllIlliIll[143];
        objectArray[0] = IIlllIlliIll[144];
        objectArray[7] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[7] | (Integer)objectArray[0]) + ((Integer)objectArray[7] & (Integer)objectArray[0]);
        objectArray[0] = IIlllIlliIll[145];
        objectArray[7] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[7] ^ (Integer)objectArray[0]) - 2 * (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[11]).intValue()] = entityShootBowEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("9835bc66-5dc7-4dd0-851f-2a3fe0895f7b", (long)6796625875428211349L, (Object[])objectArray2, (int)IIlllIlliIll[146], (String)"eX5l", (String)"I0FQFjtqfWokNjBlbCREODtuaH8wcx1han1qdT1qZWwkFTNhbmh/YQ==", (int)IIlllIlliIll[147], (String)"Zm4lNiR4YmA5a2Q+PSVkLyVnanx4NyElYmV/PyNlamclCj1qcm55HjB/ag==", (int)IIlllIlliIll[148], (int)IIlllIlliIll[149], (String)"ZDl4RjU4", (String)"R354Mzo5Oj4+bH9CZ2JCNj1nYmdCM39nYmJiExhnZ0JndDhCZ0JnNj1nZ2JnNn9CYmdnMz1iYmdCEzglZ0JiMxhiQmdiNj1iJWJnMxhiYmdiMzhiYiVnEzhiQmJCNjhnZ2I=", (String)"c1poTUVX");
        int n2 = (0x37714D34 | 0x9D5559DF) - (0x37714D34 & 0x9D5559DF);
        int cfr_ignored_1 = n2 + -1655350817;
    }

    public void tickPassive(Player player) {
        Object[] objectArray = new Object[38];
        objectArray[0] = IIlllIlliIll[26];
        objectArray[23] = IIlllIlliIll[27];
        objectArray[13] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[13] - ~((Integer)objectArray[23]).intValue() - 1;
        objectArray[23] = IIlllIlliIll[28];
        objectArray[13] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[13] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[29] = IIlllIlliIll[29];
        objectArray[23] = IIlllIlliIll[30];
        objectArray[13] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[13] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = IIlllIlliIll[31];
        objectArray[13] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[13] + ~((Integer)objectArray[23]).intValue() + 1;
        objectArray2[((Integer)objectArray[29]).intValue()] = this;
        objectArray[30] = IIlllIlliIll[32];
        objectArray[23] = IIlllIlliIll[33];
        objectArray[13] = (int)((Integer)objectArray[30]);
        objectArray[30] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[23]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[23]);
        objectArray[23] = IIlllIlliIll[34];
        objectArray[13] = (int)((Integer)objectArray[30]);
        objectArray[30] = (Integer)objectArray[13] + ~((Integer)objectArray[23]).intValue() + 1;
        objectArray2[((Integer)objectArray[30]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("b63235fe-e817-45d1-8e98-d47bfa49c338", (long)7198408353534970351L, (Object[])objectArray2, (int)IIlllIlliIll[35], (String)"cHds", (String)"KkhZFjJjdGMtNjlsZS1NODJnYXY5cxRoY3RjdTRjbGUtFTpoZ2F2YQ==", (int)IIlllIlliIll[36], (String)"b2csNi1xa2kwa203NCxtLyxuY3VxNygsa2x2PypsY24sCjRje2dwHjl2Yw==", (int)IIlllIlliIll[37], (int)IIlllIlliIll[38], (String)"dk8yMm1j", (String)"TndxMzMwMzc3bHZLbmtLNjRua25LM3Zua2trExFubktudDFLbktuNjRubmtuNnZLa25uMzRra25LEzEsbktrMxFrS25rNjRrLGtuMxFra25rMzFrayxuEzFrS2tLNjFubms=", (String)"bDBLSFZP");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void onShieldCooldownCheck(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        if (Iilllilliill) {
            throw new UncheckedIOException();
        }
        Object[] objectArray = new Object[30];
        objectArray[0] = IIlllIlliIll[111];
        objectArray[17] = IIlllIlliIll[112];
        objectArray[7] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[7] | (Integer)objectArray[17]) + ((Integer)objectArray[7] & (Integer)objectArray[17]);
        objectArray[17] = IIlllIlliIll[113];
        objectArray[7] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[7] & ~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[7]).intValue() & (Integer)objectArray[17];
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[18] = IIlllIlliIll[114];
        objectArray[17] = IIlllIlliIll[115];
        objectArray[7] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[7] | (Integer)objectArray[17]) - ((Integer)objectArray[7] ^ (Integer)objectArray[17]);
        objectArray[17] = IIlllIlliIll[116];
        objectArray[7] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[7] - ~((Integer)objectArray[17]).intValue() - 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[13] = IIlllIlliIll[117];
        objectArray[17] = IIlllIlliIll[118];
        objectArray[7] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[7] - ~((Integer)objectArray[17]).intValue() - 1;
        objectArray[17] = IIlllIlliIll[119];
        objectArray[7] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[7] | (Integer)objectArray[17]) & (~((Integer)objectArray[7]).intValue() | ~((Integer)objectArray[17]).intValue());
        objectArray2[((Integer)objectArray[13]).intValue()] = entityDamageByEntityEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("ab4a16e5-9541-4087-ae7c-5174f336cdb6", (long)-182182075203977473L, (Object[])objectArray2, (int)IIlllIlliIll[120], (String)"e3xn", (String)"IUNSFjlof2gmNjJnbiZGODlsan0ycx9jaH9odT9oZ24mFTFjbGp9YQ==", (int)IIlllIlliIll[121], (String)"ZGwnNiZ6YGI7a2Y8PydmLydlaH56NyMnYGd9PyFnaGUnCj9ocGx7HjJ9aA==", (int)IIlllIlliIll[122], (int)IIlllIlliIll[123], (String)"bU55Q3hC", (String)"RXx6Mzg7ODw8bH1AZWBANj9lYGVAM31lYGBgExplZUBldDpAZUBlNj9lZWBlNn1AYGVlMz9gYGVAEzonZUBgMxpgQGVgNj9gJ2BlMxpgYGVgMzpgYCdlEzpgQGBANjplZWA=", (String)"QVhXZGNZ");
    }

    public lIiiIiIlilli(IliIlllilIi iliIlllilIi) {
        Object[] objectArray = new Object[28];
        objectArray[13] = IIlllIlliIll[0];
        objectArray[0] = IIlllIlliIll[1];
        objectArray[12] = (int)((Integer)objectArray[13]);
        objectArray[13] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[0]) - ((Integer)objectArray[12] ^ (Integer)objectArray[0]);
        objectArray[0] = IIlllIlliIll[2];
        objectArray[12] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[12] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[0]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[20] = IIlllIlliIll[3];
        objectArray[0] = IIlllIlliIll[4];
        objectArray[12] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[12] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[0];
        objectArray[0] = IIlllIlliIll[5];
        objectArray[12] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[12] - ~((Integer)objectArray[0]).intValue() - 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = this;
        objectArray[23] = IIlllIlliIll[6];
        objectArray[0] = IIlllIlliIll[7];
        objectArray[12] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[0]) - ((Integer)objectArray[12] ^ (Integer)objectArray[0]);
        objectArray[0] = IIlllIlliIll[8];
        objectArray[12] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[12] | (Integer)objectArray[0]) & ~((Integer)objectArray[12] & (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[23]).intValue()] = iliIlllilIi;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.lIiiIiIlilli.Iilililiiili("2ebfbeea-30ca-493b-bd3f-3a8a70aa3c62", (long)-5386356120681944955L, (Object[])objectArray2, (int)IIlllIlliIll[9], (String)"cnVu", (String)"KEpbFjBhdmEvNjtuZy9PODBlY3Q7cxZqYXZhdTZhbmcvFThqZWN0YQ==", (int)IIlllIlliIll[10], (String)"bWUuNi9zaWsya281Ni5vLy5sYXdzNyouaW50PyhuYWwuCjZheWVyHjt0YQ==", (int)IIlllIlliIll[11], (int)IIlllIlliIll[12], (String)"S3o0ZDFS", (String)"THVzMzEyMTU1bHRJbGlJNjZsaWxJM3RsaWlpExNsbElsdDNJbElsNjZsbGlsNnRJaWxsMzZpaWxJEzMubElpMxNpSWxpNjZpLmlsMxNpaWxpMzNpaS5sEzNpSWlJNjNsbGk=", (String)"RUFPNUtx");
    }
}

