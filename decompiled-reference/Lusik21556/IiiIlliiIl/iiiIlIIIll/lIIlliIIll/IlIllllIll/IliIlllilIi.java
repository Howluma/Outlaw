/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.bossbar.BossBar
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.Location
 *  org.bukkit.NamespacedKey
 *  org.bukkit.attribute.AttributeModifier
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.scheduler.BukkitTask
 */
package Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll;

import Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iliIiiliiiii;
import Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IlIillIiilIi;
import java.io.InterruptedIOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Base64;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Consumer;
import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitTask;

public final class IliIlllilIi
implements Listener {
    public Map<UUID, String> IilliliilIIi;
    private Map<UUID, BukkitTask> iliIiiliiiii;
    private iliIiiliiiii iIlIlllllill;
    public static int[] Ililllililil;
    private static MiniMessage IliIlllilIi;
    private Map<UUID, BossBar> IIIllIIliIIl;
    static AtomicReferenceArray<MethodHandle> IIillIiliIil;
    private Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi liiiIIllIl;
    private NamespacedKey IIlllIlliIll;
    public IlIillIiilIi Illlllllilll;
    private Map<UUID, Integer> IiIlliIliiIl;
    private Map<UUID, BukkitTask> lIiiIiIlilli;
    public Set<UUID> IlIlllIlilIl;
    public static int Iiilliiliiil;
    public static boolean IIIilIIiiIIi;

    /*
     * Enabled aggressive block sorting
     */
    public boolean isActive(UUID uUID, String string) {
        int n;
        int n2 = n = (0x6C685F52 | 0x4485728A) - (0x6C685F52 & 0x4485728A);
        if (1733925744 >= n2 + 1149596298 - (n2 & 0x4485728A) * 2) {
            throw new InterruptedIOException();
        }
        Object[] objectArray = new Object[30];
        objectArray[9] = Ililllililil[81];
        objectArray[2] = Ililllililil[82];
        objectArray[25] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[25] | (Integer)objectArray[2]) - ((Integer)objectArray[25] ^ (Integer)objectArray[2]);
        objectArray[2] = Ililllililil[83];
        objectArray[25] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[25] | (Integer)objectArray[2]) & ~((Integer)objectArray[25] & (Integer)objectArray[2]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[3] = Ililllililil[84];
        objectArray[2] = Ililllililil[85];
        objectArray[25] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[25] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[2];
        objectArray[2] = Ililllililil[86];
        objectArray[25] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[25] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[3]).intValue()] = this;
        objectArray[19] = Ililllililil[87];
        objectArray[2] = Ililllililil[88];
        objectArray[25] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[25] ^ (Integer)objectArray[2]) - 2 * (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[2]);
        objectArray[2] = Ililllililil[89];
        objectArray[25] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[25] + ~((Integer)objectArray[2]).intValue() + 1;
        objectArray2[((Integer)objectArray[19]).intValue()] = uUID;
        objectArray[29] = Ililllililil[90];
        objectArray[2] = Ililllililil[91];
        objectArray[25] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[25] | (Integer)objectArray[2]) + ((Integer)objectArray[25] & (Integer)objectArray[2]);
        objectArray[2] = Ililllililil[92];
        objectArray[25] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[25] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[2];
        objectArray2[((Integer)objectArray[29]).intValue()] = string;
        return (boolean)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("fd8e3ccd-f213-4c44-b0c2-bf5745fdef75", (Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("66f2b106-c035-4045-ba87-114f1f5fd1d4", (long)8615135297133395187L, (Object[])objectArray2, (int)Ililllililil[93], (String)"sahsrbW2r6xydG9uamGhqqifm6SnnKZXnZWejp6Rj5FOe46KoYSUYYWPgw==", (String)"uris", (String)"dJGhja6osKZnp6Ojm2KBm6KYmaVvYHqblZ2TVJSQkIhPboiPhYaSXA==", (int)Ililllililil[94], (String)"kLi5sq91d3JxbWSKqaiHoaCko4KcWZ+enXyWenl4kpFOj3NyjIuPbm2HhkNpg2eBgH9+Ynx7OF54fFt1dHN3cVV0", (int)Ililllililil[95], (String)"WmJvUW1H", (int)Ililllililil[96], (String)"U2tSU1g4"), (int)Ililllililil[97], (String)"sKdtrrS1rqtzc25ta2KgqamgmqOmm6dYnJafjZ+SjpJPfI+JoIOVYoSQgg==", (String)"ua2SrLU=", (String)"dZCxqbOnaKqkppxjgp6lmZqocGGA", (int)Ililllililil[98], (String)"kbe4sa52dnFwbmWJqKeGoqGjooGdWp6dnHuXeXh3k5JPkHJxjYyObWyIh0RohGaCgYB/YX18OV15e1p2dXR2clRz", (int)Ililllililil[99], (String)"OHhVRWlM", (int)Ililllililil[100], (String)"a0ZHeWNY");
    }

    /*
     * Enabled aggressive block sorting
     */
    private Location findMirageDestination(Location location) {
        int n;
        int n2 = n = (0x4CE8C076 | 0xC82A0522) - (0x4CE8C076 & 0xC82A0522);
        Iiilliiliiil = n2 + -936770270 - (n2 & 0xC82A0522) * 2;
        if (1709953044 <= Iiilliiliiil) {
        }
        Object[] objectArray = new Object[30];
        objectArray[9] = Ililllililil[201];
        objectArray[10] = Ililllililil[202];
        objectArray[0] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[0] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[203];
        objectArray[0] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[0] - ~((Integer)objectArray[10]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[25] = Ililllililil[204];
        objectArray[10] = Ililllililil[205];
        objectArray[0] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[0] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[206];
        objectArray[0] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[0] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[0] ^ (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        objectArray[27] = Ililllililil[207];
        objectArray[10] = Ililllililil[208];
        objectArray[0] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[0] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[0] ^ (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[209];
        objectArray[0] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[0] & ~((Integer)objectArray[10]).intValue()) - (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[27]).intValue()] = location;
        return (Location)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("735911ec-74cf-4e84-939c-6861d3a14335", (long)-6967116879965224909L, (Object[])objectArray2, (int)Ililllililil[210], (String)"w7qCv6ekubpgXmFgYHe3nJqxpZqVrpBtp6uQoIynmaNkZaCUi5aCc4+BjQ==", (String)"qKrC", (String)"fp+Pn7yyprB9ua25sXiXqbCqp5ddaoypn5Odaqaapp5lhJadl5SESg==", (int)Ililllililil[211], (String)"oqqnvL1jYWRjY3qUs7KRs7KurYyub6mop4aohIOCpKNkoX18np2ZeHeZmFlzlXGTkpGQbI6NTmiKhmWHhoWBg19+", (int)Ililllililil[212], (String)"bDU1MGlt", (int)Ililllililil[213], (String)"emFJV1Za");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void activateLifestealer(Player player) {
        if (IIIilIIiiIIi) {
            throw null;
        }
        Object[] objectArray = new Object[30];
        objectArray[14] = Ililllililil[266];
        objectArray[27] = Ililllililil[267];
        objectArray[13] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[13] & ~((Integer)objectArray[27]).intValue()) - (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[27]);
        objectArray[27] = Ililllililil[268];
        objectArray[13] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[13] | (Integer)objectArray[27]) + ((Integer)objectArray[13] & (Integer)objectArray[27]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[15] = Ililllililil[269];
        objectArray[27] = Ililllililil[270];
        objectArray[13] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[27]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[27]);
        objectArray[27] = Ililllililil[271];
        objectArray[13] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[13] - ~((Integer)objectArray[27]).intValue() - 1;
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[5] = Ililllililil[272];
        objectArray[27] = Ililllililil[273];
        objectArray[13] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[13] + ~((Integer)objectArray[27]).intValue() + 1;
        objectArray[27] = Ililllililil[274];
        objectArray[13] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[13] | (Integer)objectArray[27]) & (~((Integer)objectArray[13]).intValue() | ~((Integer)objectArray[27]).intValue());
        objectArray2[((Integer)objectArray[5]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("cde74f63-20f2-46c9-9437-54614b4bfa7e", (long)-678950745742672862L, (Object[])objectArray2, (int)Ililllililil[275], (String)"vrV/vKKnvL1lYVxbXXSyl5euqJWYqZVqqqiNm5GknKBhap2XjpGHcJJ+kA==", (String)"raW/", (String)"g6SSnMG1o7N4trC2rHOSrrWlqpRgbYmuopCgZaOdo5lgf5uikpeBTQ==", (int)Ililllililil[276], (String)"n6Wqv8BoZF9eYHeXtrWUsK+xsI+rbKyrqomlh4aFoaBhnoB/m5qce3qWlVZ2knSQj46Nb4uKS2uHiWiEg4KEgGKB", (int)Ililllililil[277], (String)"NkE3U2s2", (int)Ililllililil[278], (String)"T2J4SDds");
        int n = (0x7D44CDBE | 0xD4E519E6) - (0x7D44CDBE & 0xD4E519E6);
        int cfr_ignored_0 = n + -723183130;
    }

    /*
     * Exception decompiling
     */
    public static String iIiIlIliIl(String var0) {
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
    public static void lIIlliIIll() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [89[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public void consumeWaitingHit(Player player) {
        Object[] objectArray = new Object[32];
        int n = (0xC7C5D6C | 0x367FED7B) - (0xC7C5D6C & 0x367FED7B);
        int cfr_ignored_0 = n + 914353531;
        objectArray[29] = Ililllililil[131];
        objectArray[19] = Ililllililil[132];
        objectArray[2] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[2] | (Integer)objectArray[19]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[19]).intValue());
        objectArray[19] = Ililllililil[133];
        objectArray[2] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[2] | (Integer)objectArray[19]) & ~((Integer)objectArray[2] & (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[29]).intValue()];
        objectArray[26] = Ililllililil[134];
        objectArray[19] = Ililllililil[135];
        objectArray[2] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[2] | (Integer)objectArray[19]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[19]).intValue());
        objectArray[19] = Ililllililil[136];
        objectArray[2] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[2] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[26]).intValue()] = this;
        objectArray[11] = Ililllililil[137];
        objectArray[19] = Ililllililil[138];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = Ililllililil[139];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("342106a6-9dab-41ae-8236-5c486ca30cb6", (long)2931730891509006802L, (Object[])objectArray2, (int)Ililllililil[140], (String)"rLNpqsC5op93d3p5d16ctbWcnq+ql6tUkJKrmaOOko5LgIuNlI+Zboichg==", (String)"v8Op", (String)"aYaUiqOrvalipKagpl18oJejnLJiU3eQmKqWT5GTjZNKaY2EkImfTw==", (int)Ililllililil[141], (String)"jcO8paJ6en18emF9nJt6np2XlnWZVpKRkG+TbWxrj45LjGZliYiCYWCEg0BcgFp+fXx7VXl4NVF1b05ycXBqbkhn", (int)Ililllililil[142], (String)"MTc5SzhP", (int)Ililllililil[143], (String)"SGNFQ2Zy");
        int n2 = (0xC527E3F7 | 0x7055E5FD) - (0xC527E3F7 & 0x7055E5FD);
        int cfr_ignored_1 = n2 + 1884677629;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String getActiveSkill(UUID uUID) {
        int n;
        int n2 = n = (0x29B881ED | 0x3F358B78) - (0x29B881ED & 0x3F358B78);
        Iiilliiliiil = n2 + 1060473720 - (n2 & 0x3F358B78) * 2;
        if (1847381910 < Iiilliiliiil) {
            int cfr_ignored_0 = 47 + 78;
        }
        Object[] objectArray = new Object[28];
        objectArray[13] = Ililllililil[101];
        objectArray[8] = Ililllililil[102];
        objectArray[26] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[26] | (Integer)objectArray[8]) & ~((Integer)objectArray[26] & (Integer)objectArray[8]);
        objectArray[8] = Ililllililil[103];
        objectArray[26] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[26] | (Integer)objectArray[8]) + ((Integer)objectArray[26] & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[23] = Ililllililil[104];
        objectArray[8] = Ililllililil[105];
        objectArray[26] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[26] | (Integer)objectArray[8]) - ((Integer)objectArray[26] & (Integer)objectArray[8]);
        objectArray[8] = Ililllililil[106];
        objectArray[26] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[26] | (Integer)objectArray[8]) - ((Integer)objectArray[26] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        objectArray[1] = Ililllililil[107];
        objectArray[8] = Ililllililil[108];
        objectArray[26] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[26] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray[8] = Ililllililil[109];
        objectArray[26] = (int)((Integer)objectArray[1]);
        objectArray[1] = 2 * ((Integer)objectArray[26] | (Integer)objectArray[8]) - ((Integer)objectArray[26] ^ (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[1]).intValue()] = uUID;
        return (String)((Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("edc7af38-5d37-4175-911a-2abe8cd1f7c9", (long)7093498643497315428L, (Object[])objectArray2, (int)Ililllililil[110], (String)"q7Jqp7+8oaJ4dnl4eF+ftLKZnbKtlqhVj5OomKSPkYtMfYiMk46aa4eZhQ==", (String)"wMKq", (String)"ZoeXh6SqvqhloaWhqWB/oZiin69lUnSRl6uVUo6SjpZNbI6Fj4ycUg==", (int)Ililllililil[111], (String)"isK/pKV7eXx7e2J8m5p5m5qWlXSWV5GQj26QbGtqjItMiWVkhoWBYF+BgEFbfVl7enl4VHZ1NlBybk1vbm1pa0dm", (int)Ililllililil[112], (String)"Snp3cElV", (int)Ililllililil[113], (String)"MmRFUk5H"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cleanWagerModifier(Player player) {
        if (IIIilIIiiIIi) {
            int cfr_ignored_0 = 0x42 & 1;
        }
        Object[] objectArray = new Object[30];
        objectArray[27] = Ililllililil[42];
        objectArray[6] = Ililllililil[43];
        objectArray[19] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[19] & ~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[6];
        objectArray[6] = Ililllililil[44];
        objectArray[19] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[19] | (Integer)objectArray[6]) - ((Integer)objectArray[19] ^ (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[0] = Ililllililil[45];
        objectArray[6] = Ililllililil[46];
        objectArray[19] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[19] | (Integer)objectArray[6]) + ((Integer)objectArray[19] & (Integer)objectArray[6]);
        objectArray[6] = Ililllililil[47];
        objectArray[19] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[19] ^ (Integer)objectArray[6]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[0]).intValue()] = this;
        objectArray[16] = Ililllililil[48];
        objectArray[6] = Ililllililil[49];
        objectArray[19] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[19] ^ (Integer)objectArray[6]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[6]);
        objectArray[6] = Ililllililil[50];
        objectArray[19] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[19] ^ (Integer)objectArray[6]) - 2 * (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[16]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("7e2330e0-8093-40b2-8708-787bb02f3694", (long)-6315870256796862539L, (Object[])objectArray2, (int)Ililllililil[51], (String)"tKtxsrixqqdvb3Jxb2akra2klqein6NcmJqjkZuWipZTeJOFnIeRZoCUfg==", (String)"t7ux", (String)"cY6ckqujtaFqrJ6onmWEmJ+blKpqW3+YkKKOV5mLlYtScYWMiIGXVw==", (int)Ililllililil[52], (String)"lbu0rapycnV0cmmFpKOCpqWfnn2hXpqZmHebdXRzl5ZTlG5tkZCKaWiMi0hkiGKGhYSDXYGAPVl9d1Z6eXhydlBv", (int)Ililllililil[53], (String)"UUh1WUp5", (int)Ililllililil[54], (String)"VmhFWEIy");
        int n = (0xE7E923A4 | 0xF44FF48C) - (0xE7E923A4 & 0xF44FF48C);
        int cfr_ignored_1 = n + -196086644;
    }

    private void awaitHit(Player player, String string, Consumer<Location> consumer) {
        Object[] objectArray = new Object[34];
        objectArray[31] = Ililllililil[170];
        objectArray[15] = Ililllililil[171];
        objectArray[25] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[25] | (Integer)objectArray[15]) & (~((Integer)objectArray[25]).intValue() | ~((Integer)objectArray[15]).intValue());
        objectArray[15] = Ililllililil[172];
        objectArray[25] = (int)((Integer)objectArray[31]);
        objectArray[31] = 2 * ((Integer)objectArray[25] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[25] ^ (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[31]).intValue()];
        objectArray[6] = Ililllililil[173];
        objectArray[15] = Ililllililil[174];
        objectArray[25] = (int)((Integer)objectArray[6]);
        objectArray[6] = 2 * ((Integer)objectArray[25] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[25] ^ (Integer)objectArray[15]);
        objectArray[15] = Ililllililil[175];
        objectArray[25] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[25] & ~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[15];
        objectArray2[((Integer)objectArray[6]).intValue()] = this;
        objectArray[32] = Ililllililil[176];
        objectArray[15] = Ililllililil[177];
        objectArray[25] = (int)((Integer)objectArray[32]);
        objectArray[32] = 2 * ((Integer)objectArray[25] | (Integer)objectArray[15]) - ((Integer)objectArray[25] ^ (Integer)objectArray[15]);
        objectArray[15] = Ililllililil[178];
        objectArray[25] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[25] & ~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[15];
        objectArray2[((Integer)objectArray[32]).intValue()] = player;
        objectArray[11] = Ililllililil[179];
        objectArray[15] = Ililllililil[180];
        objectArray[25] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[25] | (Integer)objectArray[15]) & ~((Integer)objectArray[25] & (Integer)objectArray[15]);
        objectArray[15] = Ililllililil[181];
        objectArray[25] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[25] ^ (Integer)objectArray[15]) - 2 * (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[11]).intValue()] = string;
        objectArray[17] = Ililllililil[182];
        objectArray[15] = Ililllililil[183];
        objectArray[25] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[25] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[25] ^ (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[17]).intValue()] = consumer;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("549dabf0-9004-4bf1-a1f6-ba9c0f6c42d1", (long)5322954020889391507L, (Object[])objectArray2, (int)Ililllililil[184], (String)"qbBkpb2+p6R6fHd2clmZsrCXo6yvlK5PlY2mlqaJl4lGg4aSmYycaY2Xiw==", (String)"wsCk", (String)"bImZhaawuK5fn6ubo1p5o5qgoa1nWHKTnaWbTIyYiJBHZpCHjY6aVA==", (int)Ililllililil[185], (String)"iMDBqqd9f3p5dVyCoaB/mZicm3qUUZeWlXSOcnFwiolGh2tqhIOHZmV/fjthe195eHd2WnRzMFZwdFNtbGtvaU1s", (int)Ililllililil[186], (String)"ZUR1b1Js", (int)Ililllililil[187], (String)"b1oxQlFm");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void activateSwift(Player player) {
        if (IIIilIIiiIIi) {
            throw new UnsupportedClassVersionError();
        }
        Object[] objectArray = new Object[31];
        objectArray[13] = Ililllililil[214];
        objectArray[2] = Ililllililil[215];
        objectArray[4] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[4] - ~((Integer)objectArray[2]).intValue() - 1;
        objectArray[2] = Ililllililil[216];
        objectArray[4] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[4] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[2];
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[16] = Ililllililil[217];
        objectArray[2] = Ililllililil[218];
        objectArray[4] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[4] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[2];
        objectArray[2] = Ililllililil[219];
        objectArray[4] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[2]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[28] = Ililllililil[220];
        objectArray[2] = Ililllililil[221];
        objectArray[4] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[4] ^ (Integer)objectArray[2]) - 2 * (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[2]);
        objectArray[2] = Ililllililil[222];
        objectArray[4] = (int)((Integer)objectArray[28]);
        objectArray[28] = (Integer)objectArray[4] - ~((Integer)objectArray[2]).intValue() - 1;
        objectArray2[((Integer)objectArray[28]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("4ca238e7-fbb5-4a3c-9145-535e3277f78c", (long)6462885575825651552L, (Object[])objectArray2, (int)Ililllililil[223], (String)"wrmDwKajuLlhXWBfYXi2m5uypJmUrZFupqyRn42omKRlZqGTipWDdI6CjA==", (String)"qanD", (String)"f6COoL2xp698uqy6sHeWqrGppphcaY2qnpScaaeZp51kg5eelpOFSQ==", (int)Ililllililil[224], (String)"o6mmu7xkYGNiZHuTsrGQtLOtrIuvcKinpoWpg4KBpaRlonx7n56Yd3aamVpylnCUk5KRa4+OT2eLhWSIh4aAhF59", (int)Ililllililil[225], (String)"R2M4REtW", (int)Ililllililil[226], (String)"UlJ6bmFO");
        int n = (0x86F9B0B8 | 0xC6AA1E3C) - (0x86F9B0B8 & 0xC6AA1E3C);
        int cfr_ignored_0 = n + -961929668;
    }

    public IliIlllilIi(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi, iliIiiliiiii iliIiiliiiii2) {
        Object[] objectArray = new Object[30];
        objectArray[18] = Ililllililil[0];
        objectArray[28] = Ililllililil[1];
        objectArray[4] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[28]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[28]);
        objectArray[28] = Ililllililil[2];
        objectArray[4] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[4] ^ (Integer)objectArray[28]) - 2 * (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[28]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[11] = Ililllililil[3];
        objectArray[28] = Ililllililil[4];
        objectArray[4] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[28]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[28]);
        objectArray[28] = Ililllililil[5];
        objectArray[4] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[4] ^ (Integer)objectArray[28]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        objectArray[2] = Ililllililil[6];
        objectArray[28] = Ililllililil[7];
        objectArray[4] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[4] | (Integer)objectArray[28]) - ((Integer)objectArray[4] ^ (Integer)objectArray[28]);
        objectArray[28] = Ililllililil[8];
        objectArray[4] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[4] & ~((Integer)objectArray[28]).intValue()) - (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[2]).intValue()] = iliIlllilIi;
        objectArray[6] = Ililllililil[9];
        objectArray[28] = Ililllililil[10];
        objectArray[4] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[4] | (Integer)objectArray[28]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[28]).intValue());
        objectArray[28] = Ililllililil[11];
        objectArray[4] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[4] | (Integer)objectArray[28]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[28]).intValue());
        objectArray2[((Integer)objectArray[6]).intValue()] = iliIiiliiiii2;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("de174818-1708-47ae-969d-5d4a2cbf1d8e", (long)6718830756608697657L, (Object[])objectArray2, (int)Ililllililil[12], (String)"s6pyr7e0qapwbnFwcGenrKqhlaqlnqBdl5ugkJyXiZNUdZCEm4aSY3+RfQ==", (String)"uLqy", (String)"bo+fj6yitqBtqZ2poWiHmaCal6dtWnyZj6ONWpaKlo5VdIaNh4SUWg==", (int)Ililllililil[13], (String)"krq3rK1zcXRzc2qEo6KBo6KenXyeX5mYl3aYdHNylJNUkW1sjo2JaGeJiEljhWGDgoGAXH59Plh6dlV3dnVxc09u", (int)Ililllililil[14], (String)"YVdIWlJC", (int)Ililllililil[15], (String)"UXdXUFU5");
    }

    /*
     * Exception decompiling
     */
    public static Class IIiIllIiIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[UNCONDITIONALDOLOOP], 13[CASE]], but top level block is 1[TRYBLOCK]
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
    private void activateShockwave(Player player) {
        Object[] objectArray = new Object[35];
        int n = (0x92AFDC2B | 0x79711F6D) - (0x92AFDC2B & 0x79711F6D);
        int cfr_ignored_0 = n + 2037456749;
        objectArray[17] = Ililllililil[253];
        objectArray[10] = Ililllililil[254];
        objectArray[5] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[5] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10];
        objectArray[10] = Ililllililil[255];
        objectArray[5] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[5] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10]);
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[2] = Ililllililil[256];
        objectArray[10] = Ililllililil[257];
        objectArray[5] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[5] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[258];
        objectArray[5] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[5] | (Integer)objectArray[10]) & ~((Integer)objectArray[5] & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[2]).intValue()] = this;
        objectArray[25] = Ililllililil[259];
        objectArray[10] = Ililllililil[260];
        objectArray[5] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[5] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10];
        objectArray[10] = Ililllililil[261];
        objectArray[5] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[5] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[25]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("23826567-6454-4bf1-a28b-17f9fedb443c", (long)7640723641659085977L, (Object[])objectArray2, (int)Ililllililil[262], (String)"v7Z+u6Oovb5kYl1cXHOzmJatqZaZqpRpq6eMnJCjnZ9gaZyYj5KGb5N9kQ==", (String)"rKa+", (String)"gqOTm8C2orR5tbG1rXSTrbSmq5Nhboito4+hZqKeopphgJqhk5iATg==", (int)Ililllililil[263], (String)"nqarwMFnZWBfX3aYt7aVr66ysZCqa62sq4qkiIeGoJ9gnYGAmpmdfHuVlFV3kXWPjo2McIqJSmyGimmDgoGFf2OC", (int)Ililllililil[264], (String)"UzJnVXQx", (int)Ililllililil[265], (String)"NEhoZFJl");
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isTankActive(UUID uUID) {
        if (IIIilIIiiIIi) {
        }
        Object[] objectArray = new Object[28];
        objectArray[27] = Ililllililil[114];
        objectArray[5] = Ililllililil[115];
        objectArray[14] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[14] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = Ililllililil[116];
        objectArray[14] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[14] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[5]);
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[16] = Ililllililil[117];
        objectArray[5] = Ililllililil[118];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[14] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[5]);
        objectArray[5] = Ililllililil[119];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[14] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[14] ^ (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[9] = Ililllililil[120];
        objectArray[5] = Ililllililil[121];
        objectArray[14] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[14] | (Integer)objectArray[5]) - ((Integer)objectArray[14] ^ (Integer)objectArray[5]);
        objectArray[5] = Ililllililil[122];
        objectArray[14] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[14] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[9]).intValue()] = uUID;
        return (boolean)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("7db535a6-c6f4-4485-8eed-b2b996af8a8b", (Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("d4229d75-c9dc-44a0-a2ff-f3504f19b37d", (long)-863926560287327789L, (Object[])objectArray2, (int)Ililllililil[123], (String)"qrFrqL67oKF5dXh3eWCes7OanLGslalWjpSpl6WQkIxNfomLko2bbIaahA==", (String)"wcGr", (String)"Z4iWiKWpv6dkoqSiqF9+opmhnrBkUXWSlqyUUY+Rj5VMa4+GjoudUQ==", (int)Ililllililil[124], (String)"i8G+o6R8eHt6fGN7mpl4nJuVlHOXWJCPjm2Ra2ppjYxNimRjh4aAX16CgUJaflh8e3p5U3d2N09zbUxwb25obEZl", (int)Ililllililil[125], (String)"OVpYSk5N", (int)Ililllililil[126], (String)"SkU2YXdJ"), (int)Ililllililil[127], (String)"rbRoqcG6o6B2eHt6dl2dtrSbn7CrmKpTkZGqmqKNk41Kf4qOlZCYbYmbhw==", (String)"xKqHp8A=", (String)"aIukrr6sZaWpoalgf6GYpp+zZVZ1", (int)Ililllililil[128], (String)"jMS9pqN5e359eWB+nZx7nZyYl3aYVZOSkXCSbm1sjo1Ki2dmiIeDYmGDgj9df1t9fHt6Vnh3NFJ0cE9xcG9rbUlo", (int)Ililllililil[129], (String)"MDNETmdn", (int)Ililllililil[130], (String)"QlN5M2E0");
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lambda$cleanWagerModifier$0(AttributeModifier attributeModifier) {
        int n;
        int n2 = n = (0x17D31F01 | 0xC1EDC455) - (0x17D31F01 & 0xC1EDC455);
        Iiilliiliiil = n2 + -1041382315 - (n2 & 0xC1EDC455) * 2;
        if (465941156 < Iiilliiliiil) {
        }
        Object[] objectArray = new Object[28];
        objectArray[10] = 215;
        objectArray[21] = 72;
        objectArray[18] = (int)((Integer)objectArray[10]);
        objectArray[10] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[21]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[21]);
        objectArray[21] = 126;
        objectArray[18] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[18] + ~((Integer)objectArray[21]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[15] = -2;
        objectArray[21] = 102;
        objectArray[18] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[21]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[21]);
        objectArray[21] = 104;
        objectArray[18] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[18] - ~((Integer)objectArray[21]).intValue() - 1;
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[3] = 92;
        objectArray[21] = 12;
        objectArray[18] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[18] | (Integer)objectArray[21]) - ((Integer)objectArray[18] & (Integer)objectArray[21]);
        objectArray[21] = -79;
        objectArray[18] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[18] ^ (Integer)objectArray[21]) + 2 * ((Integer)objectArray[18] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[3]).intValue()] = attributeModifier;
        return (boolean)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("cfc8971a-d8de-4e7b-9278-31fdebf1974c", (Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("b6e8970c-a553-449c-939a-f6b440ce46ca", (long)7192232927208254404L, (Object[])objectArray2, (int)-382356364, (String)"kYhMjZWWj4xSVE9OSkGBioh/e4SHfIY3fXV+bn5xb3Eum25qgWR0gWVvYw==", (String)"mpiM", (String)"VLHBrY6IkIZHh4ODe0Khe4J4eYVPQJp7dX1zNHRwcGgvjmhvZWZyPA==", (int)38, (String)"sJiZko9VV1JRTUSqiYingYCEg6J8OX9+fZx2mpmYcnEub5OSbGtvjo1nZiOJY4dhYF9eglxbGH5YXHtVVFNXUXVU", (int)70, (String)"NWpNTmlD", (int)-1503500480, (String)"Mktrbmhq"), (int)25912257, (String)"kIdNjpSVjotTU05NS0KAiYmAeoOGe4c4fHZ/bX9ybnIvnG9pgGN1gmRwYg==", (String)"mY2yjJU=", (String)"VbCRiZOHSIqEhnxDon6FeXqIUEGg", (int)39, (String)"sZeYkY5WVlFQTkWpiIemgoGDgqF9On59fJt3mZiXc3IvcJKRbWxujYxoZySIZIZiYWBfgV1cGX1ZW3pWVVRWUnRT", (int)70, (String)"U2s5dGJ2", (int)-1503500480, (String)"dHFlMUk0");
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x1FE64F00 | 0x19DDF37E) - (0x1FE64F00 & 0x19DDF37E);
        Iiilliiliiil = n2 + 433976190 - (n2 & 0x19DDF37E) * 2;
        if (1506488152 <= Iiilliiliiil) {
        }
        Object[] objectArray = new Object[25];
        int n3 = (0xAB69EB19 | 0x37D2ADF8) - (0xAB69EB19 & 0x37D2ADF8);
        int cfr_ignored_0 = n3 + 936553976;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lIIlliIIll();
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("b1ed51fc-9907-4c8e-9c8a-482aabe13f61", IliIlllilIi.class, (int)2084305809, (String)"i5JKh5+cgYJYVllYWD9/lJJ5fZKNdog1b3OIeIRvcWssnWhsc256i2d5ZQ==", (String)"ioyNj8CG", (String)"RqmGjKCKR4OHg4tCpX2BkpFINbE=", (int)40, (String)"qqKfhIVbWVxbW0Kce3qZe3p2dZR2N3Fwb45wjIuKbGssaYWEZmVhgH9hYCF7XXlbWllYdFZVFnBSTm1PTk1JS2dG", (int)70, (String)"azhSYnVI", (int)-1503500480, (String)"bkxPV1g1");
        objectArray[23] = -84;
        objectArray[0] = -83;
        objectArray[4] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[4] | (Integer)objectArray[0]) - ((Integer)objectArray[4] & (Integer)objectArray[0]);
        objectArray[0] = 14;
        objectArray[4] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[4] | (Integer)objectArray[0]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[0]).intValue());
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("9ab02f32-2a66-4f8a-aae8-4cad10d7b02e", (long)-7923176375584557902L, (Object[])new Object[((Integer)objectArray[23]).intValue()], (int)1074396056, (String)"ipFLiJ6bgIFZVVhXWUB+k5N6fJGMdYk2bnSJd4VwcGwtnmlrcm17jGZ6ZA==", (String)"oaGL", (String)"R6i2qIWJn4dEgoSCiD+egnmBfpBEMZVydox0MW9xb3Usi29mbmt9MQ==", (int)41, (String)"q6Geg4RcWFtaXEObenmYfHt1dJN3OHBvbo1xi4qJbWwtaoSDZ2Zgf35iYSJ6XnhcW1pZc1dWF29TTWxQT05ITGZF", (int)70, (String)"UFRPblhE", (int)-1503500480, (String)"WllRRmtU");
    }

    /*
     * Enabled aggressive block sorting
     */
    private Collection<LivingEntity> nearbyLiving(Location location, double d, Player player) {
        int n;
        int n2 = n = (0x354FC516 | 0xA4A0C74F) - (0x354FC516 & 0xA4A0C74F);
        Iiilliiliiil = n2 + -1532967089 - (n2 & 0xA4A0C74F) * 2;
        if (1324403845 < Iiilliiliiil) {
            int n3 = n = (1 | 0xA4A0C74F) - (1 & 0xA4A0C74F);
            int cfr_ignored_0 = n3 + -1532967089 - (n3 & 0xA4A0C74F) * 2;
        }
        Object[] objectArray = new Object[32];
        objectArray[6] = Ililllililil[354];
        objectArray[1] = Ililllililil[355];
        objectArray[19] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[19] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[1];
        objectArray[1] = Ililllililil[356];
        objectArray[19] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[19] ^ (Integer)objectArray[1]) - 2 * (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[1]);
        Object[] objectArray2 = new Object[((Integer)objectArray[6]).intValue()];
        objectArray[9] = Ililllililil[357];
        objectArray[1] = Ililllililil[358];
        objectArray[19] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[1]);
        objectArray[1] = Ililllililil[359];
        objectArray[19] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[19] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[9]).intValue()] = this;
        objectArray[8] = Ililllililil[360];
        objectArray[1] = Ililllililil[361];
        objectArray[19] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[19] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[1]);
        objectArray[1] = Ililllililil[362];
        objectArray[19] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[19] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[8]).intValue()] = location;
        objectArray[3] = Ililllililil[363];
        objectArray[1] = Ililllililil[364];
        objectArray[19] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[19] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[1]);
        objectArray[1] = Ililllililil[365];
        objectArray[19] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[19] | (Integer)objectArray[1]) - ((Integer)objectArray[19] & (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[3]).intValue()] = Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("86e306d5-128f-4307-9d61-979c5dc9e1c8", (double)d, (int)Ililllililil[366], (String)"vMKuwHSxvbG5b5Suo7eosA==", (String)"sMK0rLuUug==", (String)"ep15k7i+qrxxrbmttWyQqp+zpKxZ", (int)Ililllililil[367], (String)"lq6zuLlvbWhnZ26Qr66Np6aqqYiiY6Wko4KcgH9+mJdYlXl4kpGVdHONjE1viW2HhoWEaIKBQmR+gmF7enl9d1t6", (int)Ililllililil[368], (String)"MFdxZk1Y", (int)Ililllililil[369], (String)"UTloMkN3");
        objectArray[11] = Ililllililil[370];
        objectArray[1] = Ililllililil[371];
        objectArray[19] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[1]);
        objectArray[1] = Ililllililil[372];
        objectArray[19] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[19] - ~((Integer)objectArray[1]).intValue() - 1;
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        return (Collection)((Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("7453e405-aece-4411-bc69-e3030860cc57", (long)5174610655407690506L, (Object[])objectArray2, (int)Ililllililil[373], (String)"tr13tKqvtLVtaWRjZWyqn5+msJ2goZ1ioqCVo5mcpJhZcpWfhpmPeJqGmA==", (String)"ta23", (String)"e5yKlLm9q7twrriutGuKtq2tspxYZYGmqpioXZulm6FYd6Oamp+JRQ==", (int)Ililllililil[374], (String)"l62yt7hwbGdmaG+Prq2MqKepqIejZKSjooGdf359mZhZlnh3k5KUc3KOjU5uimyIh4aFZ4OCQ2N/gWB8e3p8eFp5", (int)Ililllililil[375], (String)"SlpUcHFO", (int)Ililllililil[376], (String)"MldWRlhN"));
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IiiIlliiIl(int var0, String var1_1, String var2_2, String var3_3, int var4_4, String var5_5, int var6_6, String var7_7, int var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        if (IIIilIIiiIIi) {
            throw new UnsupportedClassVersionError();
        }
        Object[] objectArray = new Object[34];
        objectArray[31] = Ililllililil[144];
        objectArray[21] = Ililllililil[145];
        objectArray[3] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[3] & ~((Integer)objectArray[21]).intValue()) - (~((Integer)objectArray[3]).intValue() & (Integer)objectArray[21]);
        objectArray[21] = Ililllililil[146];
        objectArray[3] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[3] & ~((Integer)objectArray[21]).intValue()) - (~((Integer)objectArray[3]).intValue() & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[31]).intValue()];
        objectArray[19] = Ililllililil[147];
        objectArray[21] = Ililllililil[148];
        objectArray[3] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[3] | (Integer)objectArray[21]) & (~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[21]).intValue());
        objectArray[21] = Ililllililil[149];
        objectArray[3] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[3] | (Integer)objectArray[21]) & (~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[21]).intValue());
        objectArray2[((Integer)objectArray[19]).intValue()] = this;
        objectArray[20] = Ililllililil[150];
        objectArray[21] = Ililllililil[151];
        objectArray[3] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[3] - ~((Integer)objectArray[21]).intValue() - 1;
        objectArray[21] = Ililllililil[152];
        objectArray[3] = (int)((Integer)objectArray[20]);
        objectArray[20] = 2 * ((Integer)objectArray[3] | (Integer)objectArray[21]) - ((Integer)objectArray[3] ^ (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[20]).intValue()] = playerQuitEvent;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("14b09dba-1e0c-461a-8b9e-3e9b05c6ff82", (long)1777973698557961817L, (Object[])objectArray2, (int)Ililllililil[153], (String)"p65mo7vApaZ8enV0dFubsK6Voa6xkqxRk4+klKiLlYdIgYSQl4qeZ4uViQ==", (String)"xL6m", (String)"aoubg6iuuqxhnamdpVx7pZyeo6tpVnCVm6eZToqWipJJaJKJi5CYVg==", (int)Ililllililil[154], (String)"hr7DqKl/fXh3d16An559l5aamXiSU5WUk3KMcG9uiIdIhWlogoGFZGN9fD1feV13dnV0WHJxMlRuclFramltZ0tq", (int)Ililllililil[155], (String)"OU9TZU1Q", (int)Ililllililil[156], (String)"T3JDdHla");
    }

    private void clearWaitingState(Player player) {
        Object[] objectArray = new Object[30];
        objectArray[27] = Ililllililil[157];
        objectArray[14] = Ililllililil[158];
        objectArray[5] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[5] & ~((Integer)objectArray[14]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[14]);
        objectArray[14] = Ililllililil[159];
        objectArray[5] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[5] ^ (Integer)objectArray[14]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[14]);
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[23] = Ililllililil[160];
        objectArray[14] = Ililllililil[161];
        objectArray[5] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[14]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[14]);
        objectArray[14] = Ililllililil[162];
        objectArray[5] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[5] & ~((Integer)objectArray[14]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[14];
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        objectArray[3] = Ililllililil[163];
        objectArray[14] = Ililllililil[164];
        objectArray[5] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[5] | (Integer)objectArray[14]) & (~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[14]).intValue());
        objectArray[14] = Ililllililil[165];
        objectArray[5] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[5] ^ (Integer)objectArray[14]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[14]);
        objectArray2[((Integer)objectArray[3]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("8c279a60-968d-40c0-9829-853380dc76bb", (long)2290385523099521842L, (Object[])objectArray2, (int)Ililllililil[166], (String)"pq1npLq/pKV9eXRzdVyar6+WoK2wka1SkpClk6mMlIhJgoWPlomfaIqWiA==", (String)"xb2n", (String)"a4yahKmtu6tgnqiepFt6pp2doqxoVXGWmqiYTYuVi5FIZ5OKio+ZVQ==", (int)Ililllililil[167], (String)"h73Cp6iAfHd2eF9/np18mJeZmHeTVJSTknGNb25tiYhJhmhng4KEY2J+fT5eelx4d3Z1V3NyM1NvcVBsa2psaEpp", (int)Ililllililil[168], (String)"NFNzN1Q5", (int)Ililllililil[169], (String)"c1QzbjJF");
    }

    private void spawnMirageTrail(Location location, Location location2) {
        Object[] objectArray = new Object[40];
        objectArray[26] = Ililllililil[338];
        objectArray[38] = Ililllililil[339];
        objectArray[12] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[12] + ~((Integer)objectArray[38]).intValue() + 1;
        objectArray[38] = Ililllililil[340];
        objectArray[12] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[12] | (Integer)objectArray[38]) & ~((Integer)objectArray[12] & (Integer)objectArray[38]);
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[15] = Ililllililil[341];
        objectArray[38] = Ililllililil[342];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[12] + ~((Integer)objectArray[38]).intValue() + 1;
        objectArray[38] = Ililllililil[343];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[12] ^ (Integer)objectArray[38]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[38]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[9] = Ililllililil[344];
        objectArray[38] = Ililllililil[345];
        objectArray[12] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[12] | (Integer)objectArray[38]) - ((Integer)objectArray[12] & (Integer)objectArray[38]);
        objectArray[38] = Ililllililil[346];
        objectArray[12] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[12] & ~((Integer)objectArray[38]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[38]);
        objectArray2[((Integer)objectArray[9]).intValue()] = location;
        objectArray[17] = Ililllililil[347];
        objectArray[38] = Ililllililil[348];
        objectArray[12] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[12] | (Integer)objectArray[38]) + ((Integer)objectArray[12] & (Integer)objectArray[38]);
        objectArray[38] = Ililllililil[349];
        objectArray[12] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[12] | (Integer)objectArray[38]) & (~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[38]).intValue());
        objectArray2[((Integer)objectArray[17]).intValue()] = location2;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("4caa74ca-8175-49e9-b2f4-4a88f0220b11", (long)6151987886127305952L, (Object[])objectArray2, (int)Ililllililil[350], (String)"vMN5urCpsq9nZ2ppZ26spaWsrp+ap5tkoKKbqZOeop5bcJudhJ+JfpiMlg==", (String)"r7O5", (String)"eZaEmrO7rblytLawtm2MsKezrKJSY4egqJqmX6GjnaNaeZ2UoJmPPw==", (int)Ililllililil[351], (String)"nbOstbJqam1sanGNrKuKrq2npoWpZqKhoH+jfXx7n55bnHZ1mZiScXCUk1BskGqOjYyLZYmIRWGFf16CgYB6flh3", (int)Ililllililil[352], (String)"d080aDVS", (int)Ililllililil[353], (String)"U1JBcTJm");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cleanupEffects(Player player, String string) {
        int n;
        int n2 = n = (0x3A227A10 | 0x892ABC8F) - (0x3A227A10 & 0x892ABC8F);
        Iiilliiliiil = n2 + -1993687921 - (n2 & 0x892ABC8F) * 2;
        if (1903549344 <= Iiilliiliiil) {
            int n3 = n = (0xFC2538B5 | 0x892ABC8F) - (0xFC2538B5 & 0x892ABC8F);
            Iiilliiliiil = n3 + -1993687921 - (n3 & 0x892ABC8F) * 2;
        }
        Object[] objectArray = new Object[40];
        objectArray[27] = Ililllililil[322];
        objectArray[10] = Ililllililil[323];
        objectArray[25] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[25] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray[10] = Ililllililil[324];
        objectArray[25] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[25] ^ (Integer)objectArray[10]) + 2 * ((Integer)objectArray[25] & (Integer)objectArray[10]);
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[22] = Ililllililil[325];
        objectArray[10] = Ililllililil[326];
        objectArray[25] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[25] ^ (Integer)objectArray[10]) + 2 * ((Integer)objectArray[25] & (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[327];
        objectArray[25] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[25] & ~((Integer)objectArray[10]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[22]).intValue()] = this;
        objectArray[11] = Ililllililil[328];
        objectArray[10] = Ililllililil[329];
        objectArray[25] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[25] | (Integer)objectArray[10]) - ((Integer)objectArray[25] & (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[330];
        objectArray[25] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[25] & ~((Integer)objectArray[10]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        objectArray[5] = Ililllililil[331];
        objectArray[10] = Ililllililil[332];
        objectArray[25] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[25] | (Integer)objectArray[10]) + ((Integer)objectArray[25] & (Integer)objectArray[10]);
        objectArray[10] = Ililllililil[333];
        objectArray[25] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[25] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[10];
        objectArray2[((Integer)objectArray[5]).intValue()] = string;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("9492adce-e325-41b2-8ec8-02e55bf9accf", (long)3289784529202053783L, (Object[])objectArray2, (int)Ililllililil[334], (String)"vcR4ubGqs7BmaGtqZm2tpqSrr6CbqJpjoaGaqpKdo51ab5qehaCIfZmLlw==", (String)"rrS4", (String)"eJWFmbK8rLpzs7evt26Nr6a0raFTZIafqZmnYKCknKRbepyToZqOQA==", (int)Ililllililil[335], (String)"nLSttrNpa25taXCOrayLrayop4aoZaOioYCifn18np1am3d2mJeTcnGTkk9tj2uNjIuKZoiHRGKEgF+BgH97fVl4", (int)Ililllililil[336], (String)"OUptODVk", (int)Ililllililil[337], (String)"RWdFdHk1");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setHitListener(IlIillIiilIi ilIillIiilIi) {
        int n;
        int n2 = n = (0x629C875C | 0x2A750A7D) - (0x629C875C & 0x2A750A7D);
        if (401079344 >= n2 + 712313469 - (n2 & 0x2A750A7D) * 2) {
            n = (0x7453406F | 0x2A750A7D) - (0x7453406F & 0x2A750A7D);
        }
        Object[] objectArray = new Object[29];
        objectArray[5] = Ililllililil[16];
        objectArray[19] = Ililllililil[17];
        objectArray[17] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[17] - ~((Integer)objectArray[19]).intValue() - 1;
        objectArray[19] = Ililllililil[18];
        objectArray[17] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[17] | (Integer)objectArray[19]) & ~((Integer)objectArray[17] & (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[23] = Ililllililil[19];
        objectArray[19] = Ililllililil[20];
        objectArray[17] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[17] | (Integer)objectArray[19]) & (~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[19]).intValue());
        objectArray[19] = Ililllililil[21];
        objectArray[17] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[17] | (Integer)objectArray[19]) - ((Integer)objectArray[17] ^ (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        objectArray[15] = Ililllililil[22];
        objectArray[19] = Ililllililil[23];
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[17] & ~((Integer)objectArray[19]).intValue()) - (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = Ililllililil[24];
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[17] | (Integer)objectArray[19]) & ~((Integer)objectArray[17] & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[15]).intValue()] = ilIillIiilIi;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("5c3dd49c-c739-4f9b-948f-9fb14555b53b", (long)5960846628016497419L, (Object[])objectArray2, (int)Ililllililil[25], (String)"sqlzsLazqKlxbXBvcWimq6uilKmknaFelpyhj52YiJRVdpGDmoWTZH6SfA==", (String)"ubmz", (String)"b5CekK2ht59sqpyqoGeGmqGZlqhsWX2ajqSMWZeJl41Uc4eOhoOVWQ==", (int)Ililllililil[26], (String)"k7m2q6x0cHNydGuDoqGApKOdnHufYJiXlnWZc3JxlZRVkmxrj46IZ2aKiUpihmCEg4KBW39+P1d7dVR4d3ZwdE5t", (int)Ililllililil[27], (String)"RzYyMGo2", (int)Ililllililil[28], (String)"UUpqTzdx");
        int n3 = (0x3F548E8B | 0x984C99B1) - (0x3F548E8B & 0x984C99B1);
        int cfr_ignored_0 = n3 + -1739810383;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite lliIliliIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        Object[] objectArray = new Object[16];
        objectArray[2] = MethodHandles.lookup();
        int n = (0x2FB4A0A0 | 0x8D5A9962) - (0x2FB4A0A0 & 0x8D5A9962);
        int cfr_ignored_0 = n + -1923442334;
        objectArray[9] = ((MethodHandles.Lookup)objectArray[2]).findStatic(IliIlllilIi.class, "IiiIlliiIl", MethodType.fromMethodDescriptorString("(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[1] = methodType.parameterCount();
        objectArray[5] = 10;
        objectArray[10] = (int)((Integer)objectArray[1]);
        objectArray[8] = (Integer)objectArray[10] + ~((Integer)objectArray[5]).intValue() + 1;
        try {
            objectArray[14] = methodType.dropParameterTypes((Integer)objectArray[8], (Integer)objectArray[1]);
            objectArray[13] = MethodHandles.invoker((MethodType)objectArray[14]);
            objectArray[7] = ((MethodType)objectArray[14]).appendParameterTypes(MethodHandle.class);
            int n2 = (0xB88B4934 | 0x171DEEB6) - (0xB88B4934 & 0x171DEEB6);
            int cfr_ignored_1 = n2 + 387837622;
            objectArray[5] = 1;
            objectArray[10] = (int)((Integer)objectArray[8]);
        }
        catch (InstantiationError instantiationError) {
            throw instantiationError;
        }
        catch (UnknownError unknownError) {
            throw unknownError;
        }
        objectArray[12] = new int[2 * ((Integer)objectArray[10] | (Integer)objectArray[5]) - ((Integer)objectArray[10] ^ (Integer)objectArray[5])];
        ((int[])objectArray[12])[0] = (Integer)objectArray[8];
        objectArray[15] = 1;
        block12: while (true) {
            int n3;
            objectArray[5] = 1;
            objectArray[10] = (int)((Integer)objectArray[8]);
            if ((Integer)objectArray[15] < (Integer)objectArray[10] - ~((Integer)objectArray[5]).intValue() - 1) {
                objectArray[5] = 1;
                objectArray[10] = (int)((Integer)objectArray[15]);
                ((int[])objectArray[12])[((Integer)objectArray[15]).intValue()] = ((Integer)objectArray[10] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[5]);
                objectArray[15] = (Integer)objectArray[15] + 1;
                n3 = (0x5E40667E | 0x935AEE86) - (0x5E40667E & 0x935AEE86);
            } else {
                n3 = (0x12F8416A | 0x935AEE86) - (0x12F8416A & 0x935AEE86);
            }
            int n4 = n3;
            switch (n4 + -1822757242 - (n4 & 0x935AEE86) * 2) {
                default: {
                    continue block12;
                }
                case 318259562: 
            }
            break;
        }
        objectArray[4] = MethodHandles.permuteArguments((MethodHandle)objectArray[13], (MethodType)objectArray[7], (int[])objectArray[12]);
        objectArray[3] = MethodHandles.collectArguments((MethodHandle)objectArray[4], (Integer)objectArray[8], (MethodHandle)objectArray[9]);
        return new ConstantCallSite((MethodHandle)objectArray[3]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void activateMirage(Player player) {
        Object[] objectArray = new Object[40];
        objectArray[37] = Ililllililil[188];
        objectArray[6] = Ililllililil[189];
        objectArray[27] = (int)((Integer)objectArray[37]);
        objectArray[37] = ((Integer)objectArray[27] & ~((Integer)objectArray[6]).intValue()) - (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[6]);
        objectArray[6] = Ililllililil[190];
        objectArray[27] = (int)((Integer)objectArray[37]);
        objectArray[37] = 2 * ((Integer)objectArray[27] | (Integer)objectArray[6]) - ((Integer)objectArray[27] ^ (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[37]).intValue()];
        objectArray[4] = Ililllililil[191];
        objectArray[6] = Ililllililil[192];
        objectArray[27] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[27] & ~((Integer)objectArray[6]).intValue()) - (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[6]);
        objectArray[6] = Ililllililil[193];
        objectArray[27] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[27] | (Integer)objectArray[6]) & (~((Integer)objectArray[27]).intValue() | ~((Integer)objectArray[6]).intValue());
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        objectArray[24] = Ililllililil[194];
        objectArray[6] = Ililllililil[195];
        objectArray[27] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[27] & ~((Integer)objectArray[6]).intValue()) - (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[6]);
        objectArray[6] = Ililllililil[196];
        objectArray[27] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[27] & ~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[27]).intValue() & (Integer)objectArray[6];
        objectArray2[((Integer)objectArray[24]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("77ac5325-e72b-4306-b5bb-83242f120cf9", (long)-8284810336443298172L, (Object[])objectArray2, (int)Ililllililil[197], (String)"qK9lpry9pqN7e3Z1c1qYsbGYoquuk69QlI6nlaeKlopHhIeRmIudaoyYig==", (String)"w7+l", (String)"bYqYhqevua1eoKqcoll4pJufoK5mV3OUnKaaS42XiY9GZZGIjI2bUw==", (int)Ililllililil[198], (String)"ib/AqaZ+fnl4dl2BoJ9+mpmbmnmVUpaVlHOPcXBvi4pHiGpphYSGZWSAfzxgfF56eXh3WXV0MVVxc1JubWxuakxr", (int)Ililllililil[199], (String)"V25KbFJl", (int)Ililllililil[200], (String)"MU1JWVEw");
        int n = (0xC3024D90 | 0x9333B102) - (0xC3024D90 & 0x9333B102);
        int cfr_ignored_0 = n + -1825328894;
    }

    private /* synthetic */ boolean lambda$cleanupEffects$2(AttributeModifier attributeModifier) {
        Object[] objectArray = new Object[28];
        objectArray[18] = 43;
        objectArray[8] = 0;
        objectArray[13] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[13] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray[8] = 26;
        objectArray[13] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[8]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[26] = 50;
        objectArray[8] = -19;
        objectArray[13] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[13] & ~((Integer)objectArray[8]).intValue()) - (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[8]);
        objectArray[8] = -69;
        objectArray[13] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[13] ^ (Integer)objectArray[8]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[26]).intValue()] = this;
        objectArray[24] = -10;
        objectArray[8] = 70;
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[13] | (Integer)objectArray[8]) + ((Integer)objectArray[13] & (Integer)objectArray[8]);
        objectArray[8] = 59;
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[13] & ~((Integer)objectArray[8]).intValue()) - (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[24]).intValue()] = attributeModifier;
        return (boolean)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("785d9d25-3dd8-49f0-bffb-0b6e6fa37c0c", (Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("ed5afc29-1e9f-4eb3-b404-dfdf74063003", (long)-4001237336608803598L, (Object[])objectArray2, (int)626676457, (String)"lItRkpiRiodPT1JRT0aEjY2EdoeCf4M8eHqDcXt2anYzmHNlfGdxhmB0Xg==", (String)"l5uR", (String)"Ua68souDlYFKjH6IfkWkeH97dIpKO594cIJuN3lrdWsykWVsaGF3Nw==", (int)35, (String)"tZuUjYpSUlVUUkmlhIOihoV/fp2BPnp5eJd7lZSTd3YzdI6NcXBqiYhsayiEaIJmZWRjfWFgHXldV3ZaWVhSVnBP", (int)70, (String)"WDRKaGJY", (int)-1503500480, (String)"Y3ZxemQx"), (int)-1055625023, (String)"j4ZOi5OYjY5UUk1MTEODiIZ9eYaJeoQ5e3d8bIBzbW8wmWxof2J2f2NtYQ==", (String)"lpCxjZI=", (String)"Uq2SiJSGS4eDh39GpX+GeH2FU0Cf", (int)36, (String)"rpabkJFXVVBPT0aoh4alf36CgaB6O318e5p0mJeWcG8wbZGQamltjItlZCWHYYVfXl1cgFpZGnxWWnlTUlFVT3NS", (int)70, (String)"ZEp5UTdW", (int)-1503500480, (String)"QTNRTFB0");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void startDuration(Player player, String string, int n, boolean bl) {
        int n2;
        int n3 = n2 = (0x5F512127 | 0xE6C48293) - (0x5F512127 & 0xE6C48293);
        if (70032820 >= n3 + -423329133 - (n3 & 0xE6C48293) * 2) {
        }
        Object[] objectArray = new Object[37];
        objectArray[22] = Ililllililil[292];
        objectArray[25] = Ililllililil[293];
        objectArray[27] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[27] ^ (Integer)objectArray[25]) - 2 * (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[25]);
        objectArray[25] = Ililllililil[294];
        objectArray[27] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[27] & ~((Integer)objectArray[25]).intValue() | ~((Integer)objectArray[27]).intValue() & (Integer)objectArray[25];
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[14] = Ililllililil[295];
        objectArray[25] = Ililllililil[296];
        objectArray[27] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[27] | (Integer)objectArray[25]) + ((Integer)objectArray[27] & (Integer)objectArray[25]);
        objectArray[25] = Ililllililil[297];
        objectArray[27] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[27] & ~((Integer)objectArray[25]).intValue()) - (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[14]).intValue()] = this;
        objectArray[0] = Ililllililil[298];
        objectArray[25] = Ililllililil[299];
        objectArray[27] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[27] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[27] ^ (Integer)objectArray[25]);
        objectArray[25] = Ililllililil[300];
        objectArray[27] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[27] & ~((Integer)objectArray[25]).intValue() | ~((Integer)objectArray[27]).intValue() & (Integer)objectArray[25];
        objectArray2[((Integer)objectArray[0]).intValue()] = player;
        objectArray[24] = Ililllililil[301];
        objectArray[25] = Ililllililil[302];
        objectArray[27] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[27] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[27] ^ (Integer)objectArray[25]);
        objectArray[25] = Ililllililil[303];
        objectArray[27] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[27] - ~((Integer)objectArray[25]).intValue() - 1;
        objectArray2[((Integer)objectArray[24]).intValue()] = string;
        objectArray[20] = Ililllililil[304];
        objectArray[25] = Ililllililil[305];
        objectArray[27] = (int)((Integer)objectArray[20]);
        objectArray[20] = 2 * ((Integer)objectArray[27] | (Integer)objectArray[25]) - ((Integer)objectArray[27] ^ (Integer)objectArray[25]);
        objectArray[25] = Ililllililil[306];
        objectArray[27] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[27] + ~((Integer)objectArray[25]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("a0306af1-06b3-48bc-8796-89a6e45bfc6d", (int)n, (int)Ililllililil[307], (String)"w7uluXu8triudpq0nauoqZs=", (String)"p7u/pbSZsQ==", (String)"haOCnr+3obV2uLK0qnGWsJmnpKWXXQ==", (int)Ililllililil[308], (String)"oaeowb5mZmFgXnWZuLeWsrGzspGtaq6trIuniYiHo6JfoIKBnZyefXyYl1R4lHaSkZCPcY2MSW2Ji2qGhYSGgmSD", (int)Ililllililil[309], (String)"cldSVklI", (int)Ililllililil[310], (String)"OFQ3Y1A1");
        objectArray[35] = Ililllililil[311];
        objectArray[25] = Ililllililil[312];
        objectArray[27] = (int)((Integer)objectArray[35]);
        objectArray[35] = 2 * ((Integer)objectArray[27] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[27] ^ (Integer)objectArray[25]);
        objectArray[25] = Ililllililil[313];
        objectArray[27] = (int)((Integer)objectArray[35]);
        objectArray[35] = ((Integer)objectArray[27] | (Integer)objectArray[25]) + ((Integer)objectArray[27] & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[35]).intValue()] = Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("eb188944-8baf-41d3-a161-997dadfbdcd2", (boolean)bl, (int)Ililllililil[314], (String)"uL6yvHi1ubW9c5aysa21sKw=", (String)"tL64sL+Yvg==", (String)"dod1l7S6rrh1sbWxuXCSrq2psayoVA==", (int)Ililllililil[315], (String)"mrKvtLVraWxra3KMq6qJq6qmpYSmZ6Ggn36gfHt6nJtcmXV0lpWRcG+RkFFrjWmLiomIZIaFRmCCfl1/fn15e1d2", (int)Ililllililil[316], (String)"WWVoZVJo", (int)Ililllililil[317], (String)"Q0V0WGFX");
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("44e1f70e-edf9-4cce-b407-3b593275802c", (long)9055640216031104256L, (Object[])objectArray2, (int)Ililllililil[318], (String)"usF7uK6rsLFpZWhnaXCuo6OqrKGcpZlmnqSZp5WgoJxdbpmbgp2LfJaKlA==", (String)"sbG7", (String)"d5iGmLW5r7d0srSyuG+OsqmxrqBUYYWippykYZ+hn6Vce5+WnpuNQQ==", (int)Ililllililil[319], (String)"m7Gus7RsaGtqbHOLqqmIrKulpIOnaKCfnn2he3p5nZxdmnRzl5aQb26SkVJqjmiMi4qJY4eGR1+DfVyAf354fFZ1", (int)Ililllililil[320], (String)"Q1A5S0Rs", (int)Ililllililil[321], (String)"bFNXN1B3");
        int n4 = (0xFD7C9DE | 0x9D928DEF) - (0xFD7C9DE & 0x9D928DEF);
        int cfr_ignored_0 = n4 + -1651339793;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String equippedSkill(Lusik21556.Illlllllilll.Iilllilliill.IIillIiliIil.Ililllililil.Iiilliiliiil.IIIilIIiiIIi.IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x79C6494E | 0xF3939FA7) - (0x79C6494E & 0xF3939FA7);
        if (1449599434 >= n2 + -208429145 - (n2 & 0xF3939FA7) * 2) {
            throw new SQLIntegrityConstraintViolationException();
        }
        Object[] objectArray = new Object[39];
        int n3 = (0xCC4976EB | 0xEF7B6A15) - (0xCC4976EB & 0xEF7B6A15);
        int cfr_ignored_0 = n3 + -277124587;
        objectArray[26] = Ililllililil[377];
        objectArray[34] = Ililllililil[378];
        objectArray[0] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[0] | (Integer)objectArray[34]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[34]).intValue());
        objectArray[34] = Ililllililil[379];
        objectArray[0] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[0] | (Integer)objectArray[34]) + ((Integer)objectArray[0] & (Integer)objectArray[34]);
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[31] = Ililllililil[380];
        objectArray[34] = Ililllililil[381];
        objectArray[0] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[0] | (Integer)objectArray[34]) & ~((Integer)objectArray[0] & (Integer)objectArray[34]);
        objectArray[34] = Ililllililil[382];
        objectArray[0] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[0] | (Integer)objectArray[34]) + ((Integer)objectArray[0] & (Integer)objectArray[34]);
        objectArray2[((Integer)objectArray[31]).intValue()] = this;
        objectArray[30] = Ililllililil[383];
        objectArray[34] = Ililllililil[384];
        objectArray[0] = (int)((Integer)objectArray[30]);
        objectArray[30] = 2 * ((Integer)objectArray[0] | (Integer)objectArray[34]) - ((Integer)objectArray[0] ^ (Integer)objectArray[34]);
        objectArray[34] = Ililllililil[385];
        objectArray[0] = (int)((Integer)objectArray[30]);
        objectArray[30] = 2 * ((Integer)objectArray[0] | (Integer)objectArray[34]) - ((Integer)objectArray[0] ^ (Integer)objectArray[34]);
        objectArray2[((Integer)objectArray[30]).intValue()] = iliIlllilIi;
        return (String)((Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("a4534b9f-490b-4d84-9cfc-5a5024f23779", (long)-3771235033836772624L, (Object[])objectArray2, (int)Ililllililil[386], (String)"ucB0ta2ut7RqbGdmYmmpoqCns5yfpJ5fpZ2WppaZp5lWc5aiiZyMeZ2Hmw==", (String)"srC0", (String)"fJmJlbbAqL5vr7urs2qJs6qwsZ1XaIKjrZWrXJyomKBXdqCXnZ6KRA==", (int)Ililllililil[387], (String)"mLCxurdtb2ppZWySsbCPqaisq4qkYaempYSegoGAmplWl3t6lJOXdnWPjktxi2+JiIeGaoSDQGaAhGN9fHt/eV18", (int)Ililllililil[388], (String)"V2pmcFlD", (int)Ililllililil[389], (String)"dzB3djFo"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$nearbyLiving$3(Player player, Entity entity) {
        int n;
        int n2 = n = (0x57EA3CFF | 0x7557729D) - (0x57EA3CFF & 0x7557729D);
        if (454584911 >= n2 + 1968665245 - (n2 & 0x7557729D) * 2) {
            throw null;
        }
        Object[] objectArray = new Object[28];
        objectArray[18] = 31;
        objectArray[0] = -55;
        objectArray[17] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[17] ^ (Integer)objectArray[0]) - 2 * (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[0]);
        objectArray[0] = 71;
        objectArray[17] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[17] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[0];
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[9] = 22;
        objectArray[0] = -11;
        objectArray[17] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[17] | (Integer)objectArray[0]) - ((Integer)objectArray[17] & (Integer)objectArray[0]);
        objectArray[0] = 29;
        objectArray[17] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[17] - ~((Integer)objectArray[0]).intValue() - 1;
        objectArray2[((Integer)objectArray[9]).intValue()] = player;
        objectArray[13] = 102;
        objectArray[0] = 40;
        objectArray[17] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[17] | (Integer)objectArray[0]) - ((Integer)objectArray[17] & (Integer)objectArray[0]);
        objectArray[0] = 77;
        objectArray[17] = (int)((Integer)objectArray[13]);
        objectArray[13] = 2 * ((Integer)objectArray[17] & ~((Integer)objectArray[0]).intValue()) - ((Integer)objectArray[17] ^ (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[13]).intValue()] = entity;
        return (boolean)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("7dd68e30-a4a8-4900-ac9b-b0e52b7b2768", (Object)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("429cf7f2-aedc-4ad0-aaf1-935722ceba05", (long)6038732975652985598L, (Object[])objectArray2, (int)26709219, (String)"kolTkJaTiIlRTVBPUUiGi4uCdImEfYE+dnyBb314aHQ1lnFjemVzhF5yXA==", (String)"mZmT", (String)"T7C+sI2Bl39MinyKgEemeoF5dohMOZ16boRsOXdpd200k2duZmN1OQ==", (int)33, (String)"s5mWi4xUUFNSVEujgoGghIN9fJt/QHh3dpV5k5KRdXQ1coyLb25oh4ZqaSqCZoBkY2Jhe19eH3dbVXRYV1ZQVG5N", (int)70, (String)"OFpoY2pL", (int)-1503500480, (String)"cnVCYVdY"), (int)1572564618, (String)"lYxQkZmSi4hOUFNSTkWFjoyDd4iDgII7eXmCcnp1a3Uyl3JmfWhwhWFzXw==", (String)"nJKvj5g=", (String)"ULOMhpaETY2BiYFIp3mAfneLTT6d", (int)34, (String)"tJyVjotRU1ZVUUimhYSjhYSAf56APXt6eZh6lpWUdnUyc4+OcG9riolraieFZ4NlZGNifmBfHHpcWHdZWFdTVXFQ", (int)70, (String)"Q0lMRHhr", (int)-1503500480, (String)"Q0lYUnZN");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void activateTank(Player player) {
        if (IIIilIIiiIIi) {
            int n;
            int n2 = n = (0x52 | 0xCBA16E6F) - (0x52 & 0xCBA16E6F);
            int cfr_ignored_0 = n2 + -878612881 - (n2 & 0xCBA16E6F) * 2;
        }
        Object[] objectArray = new Object[30];
        objectArray[15] = Ililllililil[227];
        objectArray[1] = Ililllililil[228];
        objectArray[16] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[16] + ~((Integer)objectArray[1]).intValue() + 1;
        objectArray[1] = Ililllililil[229];
        objectArray[16] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[16] | (Integer)objectArray[1]) & (~((Integer)objectArray[16]).intValue() | ~((Integer)objectArray[1]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[17] = Ililllililil[230];
        objectArray[1] = Ililllililil[231];
        objectArray[16] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[16] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[16] & (Integer)objectArray[1]);
        objectArray[1] = Ililllililil[232];
        objectArray[16] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[16] | (Integer)objectArray[1]) & (~((Integer)objectArray[16]).intValue() | ~((Integer)objectArray[1]).intValue());
        objectArray2[((Integer)objectArray[17]).intValue()] = this;
        objectArray[8] = Ililllililil[233];
        objectArray[1] = Ililllililil[234];
        objectArray[16] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[16] ^ (Integer)objectArray[1]) + 2 * ((Integer)objectArray[16] & (Integer)objectArray[1]);
        objectArray[1] = Ililllililil[235];
        objectArray[16] = (int)((Integer)objectArray[8]);
        objectArray[8] = 2 * ((Integer)objectArray[16] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[16] ^ (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[8]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("5aaaa960-f66d-4b43-be83-a1a2619ade2e", (long)221630910409937783L, (Object[])objectArray2, (int)Ililllililil[236], (String)"xbyAwamiu7heYGNiXnW1npyzp5iTsJJrqamSooqlm6ViZ6KWjZiAdZGDjw==", (String)"pqzA", (String)"gJ2Nobq0pLJ7u6+3r3aVp66spZlbbI6noZGfaKicpJxjgpSbmZKGSA==", (int)Ililllililil[237], (String)"pKylvrthY2ZlYXiWtbSTtbSwr46wbauqqYiqhoWEpqVio39+oJ+benmbmld1l3OVlJOSbpCPTGqMiGeJiIeDhWGA", (int)Ililllililil[238], (String)"U2paVzdr", (int)Ililllililil[239], (String)"QkVZWlRW");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void activate(Player player) {
        int n;
        int n2 = n = (0x732BAED6 | 0x43DD22AB) - (0x732BAED6 & 0x43DD22AB);
        if (35953839 >= n2 + 1138565803 - (n2 & 0x43DD22AB) * 2) {
            int n3 = n = (0x1190E280 | 0x43DD22AB) - (0x1190E280 & 0x43DD22AB);
            Iiilliiliiil = n3 + 1138565803 - (n3 & 0x43DD22AB) * 2;
        }
        Object[] objectArray = new Object[45];
        objectArray[10] = Ililllililil[55];
        objectArray[32] = Ililllililil[56];
        objectArray[24] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[24] ^ (Integer)objectArray[32]) - 2 * (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[32]);
        objectArray[32] = Ililllililil[57];
        objectArray[24] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[24] & ~((Integer)objectArray[32]).intValue()) - (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[32]);
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[2] = Ililllililil[58];
        objectArray[32] = Ililllililil[59];
        objectArray[24] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[24] + ~((Integer)objectArray[32]).intValue() + 1;
        objectArray[32] = Ililllililil[60];
        objectArray[24] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[24] | (Integer)objectArray[32]) & (~((Integer)objectArray[24]).intValue() | ~((Integer)objectArray[32]).intValue());
        objectArray2[((Integer)objectArray[2]).intValue()] = this;
        objectArray[43] = Ililllililil[61];
        objectArray[32] = Ililllililil[62];
        objectArray[24] = (int)((Integer)objectArray[43]);
        objectArray[43] = (Integer)objectArray[24] + ~((Integer)objectArray[32]).intValue() + 1;
        objectArray[32] = Ililllililil[63];
        objectArray[24] = (int)((Integer)objectArray[43]);
        objectArray[43] = ((Integer)objectArray[24] | (Integer)objectArray[32]) & ~((Integer)objectArray[24] & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[43]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("a3fe5557-db05-4cc8-96d8-b89ece7fda04", (long)9206514516737409501L, (Object[])objectArray2, (int)Ililllililil[64], (String)"r6Zuq7O4ra50cm1sbGOjqKadmaapmqRZm5ecjKCTjY9QeYyIn4KWX4ONgQ==", (String)"vLau", (String)"cpOji7CmsqRppaGlnWSDnaSWm6NxXnidk5+RVpKOkopRcIqRg4iQXg==", (int)Ililllililil[65], (String)"jra7sLF3dXBvb2aIp6aFn56ioYCaW52cm3qUeHd2kI9QjXFwiomNbGuFhEVngWV/fn18YHp5Olx2ellzcnF1b1Ny", (int)Ililllililil[66], (String)"RlNCYWkz", (int)Ililllililil[67], (String)"UWhoN3lP");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ LivingEntity lambda$nearbyLiving$4(Entity entity) {
        if (IIIilIIiiIIi) {
            throw null;
        }
        Object[] objectArray = new Object[26];
        objectArray[20] = 196;
        objectArray[6] = 106;
        objectArray[5] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[5] + ~((Integer)objectArray[6]).intValue() + 1;
        objectArray[6] = 74;
        objectArray[5] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[5] | (Integer)objectArray[6]) & ~((Integer)objectArray[5] & (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[19] = -14;
        objectArray[6] = -68;
        objectArray[5] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[5] & ~((Integer)objectArray[6]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[6]);
        objectArray[6] = 54;
        objectArray[5] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[6]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[19]).intValue()] = entity;
        return (LivingEntity)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("fa0d5337-dbe5-430a-bc55-9262e51c685b", (long)2059368668556217418L, (Object[])objectArray2, (int)-1824814435, (String)"k4pSj5eUiYpQTlFQUEeHjIqBdYqFfoA9d3uAcHx3aXM0lXBke2Zyg19xXQ==", (String)"mJqS", (String)"Tq+/r4yCloBNiX2JgUineYB6d4dNOpx5b4NtOnZqdm41lGZtZ2R0Og==", (int)32, (String)"spqXjI1TUVRTU0qkg4Khg4J+fZx+P3l4d5Z4lJOSdHM0cY2Mbm1piIdpaCmDZYFjYmFgfF5dHnhaVnVXVlVRU29O", (int)70, (String)"T2pTc2ZO", (int)-1503500480, (String)"VFFRd2Vj");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void clearWaiting(Player player) {
        Object[] objectArray = new Object[34];
        int n = (0x98D8A0CD | 0xF52D988E) - (0x98D8A0CD & 0xF52D988E);
        int cfr_ignored_0 = n + -181561202;
        objectArray[9] = Ililllililil[29];
        objectArray[3] = Ililllililil[30];
        objectArray[12] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[3]) - ((Integer)objectArray[12] ^ (Integer)objectArray[3]);
        objectArray[3] = Ililllililil[31];
        objectArray[12] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[12] & ~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[3];
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[19] = Ililllililil[32];
        objectArray[3] = Ililllililil[33];
        objectArray[12] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[12] | (Integer)objectArray[3]) & (~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[3]).intValue());
        objectArray[3] = Ililllililil[34];
        objectArray[12] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[12] & ~((Integer)objectArray[3]).intValue()) - ((Integer)objectArray[12] ^ (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[19]).intValue()] = this;
        objectArray[23] = Ililllililil[35];
        objectArray[3] = Ililllililil[36];
        objectArray[12] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[12] + ~((Integer)objectArray[3]).intValue() + 1;
        objectArray[3] = Ililllililil[37];
        objectArray[12] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[12] | (Integer)objectArray[3]) - ((Integer)objectArray[12] & (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[23]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("4df85160-3575-456b-bc59-8db773631cfd", (long)1511128074559996739L, (Object[])objectArray2, (int)Ililllililil[38], (String)"taxwsbmyq6hucHNybmWlrqyjl6ijoKJbmZmikpqVi5VSd5KGnYiQZYGTfw==", (String)"tryw", (String)"cI2dkaqktKJrq5+nn2aFl56clalrXH6XkaGPWJiMlIxTcoSLiYKWWA==", (int)Ililllililil[39], (String)"lLy1rqtxc3Z1cWiGpaSDpaSgn36gXZuamXiadnV0lpVSk29ukI+LammLikdlh2OFhIOCXoB/PFp8eFd5eHdzdVFw", (int)Ililllililil[40], (String)"bGhiaW11", (int)Ililllililil[41], (String)"dkRwc2Jt");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void deactivate(Player player) {
        if (IIIilIIiiIIi) {
            int cfr_ignored_0 = 88 + 69;
        }
        Object[] objectArray = new Object[33];
        objectArray[21] = Ililllililil[68];
        objectArray[31] = Ililllililil[69];
        objectArray[23] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[23] | (Integer)objectArray[31]) & ~((Integer)objectArray[23] & (Integer)objectArray[31]);
        objectArray[31] = Ililllililil[70];
        objectArray[23] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[23] ^ (Integer)objectArray[31]) + 2 * ((Integer)objectArray[23] & (Integer)objectArray[31]);
        Object[] objectArray2 = new Object[((Integer)objectArray[21]).intValue()];
        objectArray[10] = Ililllililil[71];
        objectArray[31] = Ililllililil[72];
        objectArray[23] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[23] + ~((Integer)objectArray[31]).intValue() + 1;
        objectArray[31] = Ililllililil[73];
        objectArray[23] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[23] & ~((Integer)objectArray[31]).intValue()) - (~((Integer)objectArray[23]).intValue() & (Integer)objectArray[31]);
        objectArray2[((Integer)objectArray[10]).intValue()] = this;
        objectArray[22] = Ililllililil[74];
        objectArray[31] = Ililllililil[75];
        objectArray[23] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[23] - ~((Integer)objectArray[31]).intValue() - 1;
        objectArray[31] = Ililllililil[76];
        objectArray[23] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[23] | (Integer)objectArray[31]) & ~((Integer)objectArray[23] & (Integer)objectArray[31]);
        objectArray2[((Integer)objectArray[22]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("c6fc9ac6-6543-432c-8315-530a5ec27076", (long)-2530282943442952965L, (Object[])objectArray2, (int)Ililllililil[77], (String)"rqVvrLK3rK11cWxrbWSip6eemKWomaVampidi6GUjJBReo2HnoGXYIKOgA==", (String)"vbWv", (String)"c5SijLGls6NopqCmnGOCnqWVmqRwXXmekqCQVZONk4lQb4uSgoeRXQ==", (int)Ililllililil[78], (String)"j7W6r7B4dG9ucGeHpqWEoJ+hoH+bXJybmnmVd3Z1kZBRjnBvi4qMa2qGhUZmgmSAf359X3t6O1t3eVh0c3J0cFJx", (int)Ililllililil[79], (String)"dVZzSUR3", (int)Ililllililil[80], (String)"bG5ycFRE");
    }

    /*
     * Unable to fully structure code
     */
    private static String iiiIlIIIll(String var0, int var1_1, int var2_2) {
        block12: {
            block13: {
                v0 = var13_3 = (866784911 | -1903725079) - (866784911 & -1903725079);
                Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.Iiilliiliiil = v0 + -1903725079 - (v0 & -1903725079) * 2;
                if (1879162156 > Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.Iiilliiliiil) break block13;
                throw null;
lbl7:
                // 1 sources

                return new String((byte[])var11_5[1], StandardCharsets.UTF_8);
lbl9:
                // 1 sources

                while (true) {
                    var8_4 + 1496559458;
                    ** GOTO lbl29
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var9_6 + 204402227;
                    ** GOTO lbl35
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var10_7 + -1602598062;
                    ** GOTO lbl30
                    break;
                }
            }
            var11_5 = new Object[8];
            var11_5[1] = Base64.getDecoder().decode(var0);
            var8_4 = (-1469807917 | 1496559458) - (-1469807917 & 1496559458);
            ** continue;
lbl29:
            // 2 sources

            var11_5[2] = 0;
lbl30:
            // 2 sources

            if ((Integer)var11_5[2] >= ((byte[])var11_5[1]).length) break block12;
            var9_6 = (621951684 | 204402227) - (621951684 & 204402227);
            ** continue;
lbl35:
            // 1 sources

            v1 = (byte[])var11_5[1];
            v2 = (Integer)var11_5[2];
            var11_5[5] = (int)((Integer)var11_5[2]);
            var11_5[7] = (int)v1[v2];
            var11_5[5] = var2_2;
            var11_5[7] = ((Integer)var11_5[7] ^ (Integer)var11_5[5]) + 2 * ((Integer)var11_5[7] & (Integer)var11_5[5]);
            var11_5[5] = var1_1;
            var11_5[7] = (Integer)var11_5[7] + ~((Integer)var11_5[5]).intValue() + 1;
            v1[v2] = (byte)(((Integer)var11_5[7] | (Integer)var11_5[5]) - ((Integer)var11_5[7] & (Integer)var11_5[5]));
            var11_5[2] = (Integer)var11_5[2] + 1;
            var10_7 = (1578817774 | -1602598062) - (1578817774 & -1602598062);
            ** continue;
        }
        ** while (true)
        {
            catch (IllegalAccessError v4) {
                throw v4;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void msg(Player player, String string) {
        Object[] objectArray = new Object[31];
        int n = (0xFBFC2685 | 0x93ACF223) - (0xFBFC2685 & 0x93ACF223);
        int cfr_ignored_0 = n + -1817382365;
        objectArray[23] = Ililllililil[390];
        objectArray[3] = Ililllililil[391];
        objectArray[6] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[6] | (Integer)objectArray[3]) + ((Integer)objectArray[6] & (Integer)objectArray[3]);
        objectArray[3] = Ililllililil[392];
        objectArray[6] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[6] | (Integer)objectArray[3]) - ((Integer)objectArray[6] ^ (Integer)objectArray[3]);
        Object[] objectArray2 = new Object[((Integer)objectArray[23]).intValue()];
        objectArray[18] = Ililllililil[393];
        objectArray[3] = Ililllililil[394];
        objectArray[6] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[6] + ~((Integer)objectArray[3]).intValue() + 1;
        objectArray[3] = Ililllililil[395];
        objectArray[6] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[6] | (Integer)objectArray[3]) - ((Integer)objectArray[6] & (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[20] = Ililllililil[396];
        objectArray[3] = Ililllililil[397];
        objectArray[6] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[6] ^ (Integer)objectArray[3]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[3]);
        objectArray[3] = Ililllililil[398];
        objectArray[6] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[6] + ~((Integer)objectArray[3]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = player;
        objectArray[11] = Ililllililil[399];
        objectArray[3] = 21;
        objectArray[6] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[6] & ~((Integer)objectArray[3]).intValue()) - (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[3]);
        objectArray[3] = 63;
        objectArray[6] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[6] + ~((Integer)objectArray[3]).intValue() + 1;
        objectArray2[((Integer)objectArray[11]).intValue()] = string;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("4e4106a8-4588-4f25-972f-390a5144ebba", (long)-4765057467891628858L, (Object[])objectArray2, (int)-2042250319, (String)"uL91tqyttrNra2ZlY2qooaGospueo59gpJ6XpZeapppXdJehiJuNepyImg==", (String)"s6+1", (String)"fZqIlre/qb1usLqssmmItKuvsJ5WZ4OkrJaqW52nmZ9WdaGYnJ2LQw==", (int)31, (String)"ma+wubZubmloZm2RsK+OqqmrqomlYqalpIOfgYB/m5pXmHp5lZSWdXSQj0xwjG6KiYiHaYWEQWWBg2J+fXx+elx7", (int)70, (String)"ZGc3aDE0", (int)-1503500480, (String)"bFZQQUFx");
    }

    private void activateWager(Player player) {
        Object[] objectArray = new Object[34];
        objectArray[24] = Ililllililil[279];
        objectArray[29] = Ililllililil[280];
        objectArray[20] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[20] ^ (Integer)objectArray[29]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[29]);
        objectArray[29] = Ililllililil[281];
        objectArray[20] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[20] & ~((Integer)objectArray[29]).intValue() | ~((Integer)objectArray[20]).intValue() & (Integer)objectArray[29];
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[33] = Ililllililil[282];
        objectArray[29] = Ililllililil[283];
        objectArray[20] = (int)((Integer)objectArray[33]);
        objectArray[33] = ((Integer)objectArray[20] | (Integer)objectArray[29]) - ((Integer)objectArray[20] & (Integer)objectArray[29]);
        objectArray[29] = Ililllililil[284];
        objectArray[20] = (int)((Integer)objectArray[33]);
        objectArray[33] = ((Integer)objectArray[20] ^ (Integer)objectArray[29]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[29]);
        objectArray2[((Integer)objectArray[33]).intValue()] = this;
        objectArray[30] = Ililllililil[285];
        objectArray[29] = Ililllililil[286];
        objectArray[20] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[20] ^ (Integer)objectArray[29]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[29]);
        objectArray[29] = Ililllililil[287];
        objectArray[20] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[20] | (Integer)objectArray[29]) - ((Integer)objectArray[20] & (Integer)objectArray[29]);
        objectArray2[((Integer)objectArray[30]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("8002db82-3ff4-468e-8e36-27f060c723d4", (long)-1107709861949833351L, (Object[])objectArray2, (int)Ililllililil[288], (String)"wbh8vaWmv7xiZF9eWnGxmpivq5SXrJZnraWOno6hn6Fea56akZSEcZV/kw==", (String)"qqi8", (String)"hKGRnb64oLZ3t7Ozq3KRq7KoqZVfcIqrpY2jZKSgoJhffpiflZaCTA==", (int)Ililllililil[289], (String)"oKipwr9lZ2JhXXSaubiXsbC0s5Ksaa+urYymiomIoqFen4OCnJuffn2XllN5k3eRkI+OcoyLSG6IjGuFhIOHgWWE", (int)Ililllililil[290], (String)"SDZUTHFh", (int)Ililllililil[291], (String)"bnNHTjJY");
    }

    private /* synthetic */ void lambda$startDuration$1(Player player) {
        Object[] objectArray = new Object[28];
        objectArray[26] = 64;
        objectArray[21] = -77;
        objectArray[17] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[17] | (Integer)objectArray[21]) - ((Integer)objectArray[17] & (Integer)objectArray[21]);
        objectArray[21] = -30;
        objectArray[17] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[17] + ~((Integer)objectArray[21]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[15] = 145;
        objectArray[21] = -55;
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[17] ^ (Integer)objectArray[21]) + 2 * ((Integer)objectArray[17] & (Integer)objectArray[21]);
        objectArray[21] = 90;
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[17] + ~((Integer)objectArray[21]).intValue() + 1;
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[11] = -102;
        objectArray[21] = -76;
        objectArray[17] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[17] | (Integer)objectArray[21]) & ~((Integer)objectArray[17] & (Integer)objectArray[21]);
        objectArray[21] = 47;
        objectArray[17] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[17] | (Integer)objectArray[21]) - ((Integer)objectArray[17] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("050e290f-db44-427d-bb88-70f43f4577a9", (long)-418386238507178138L, (Object[])objectArray2, (int)1756731618, (String)"joVPjJKXjI1VUUxLTUSCh4d+eIWIeYU6enh9a4F0bHAxmm1nfmF3gGJuYA==", (String)"nZWP", (String)"U7TCrJGFk4NIhoCGfEOifoV1eoRQPZl+coBwNXNtc2kwj2tyYmdxPQ==", (int)37, (String)"r5Waj5BYVE9OUEenhoWkgH+BgJ97PHx7epl1l5aVcXAxbpCPa2psi4pmZSaGYoRgX15df1taG3tXWXhUU1JUUHJR", (int)70, (String)"S0hmaFFU", (int)-1503500480, (String)"cnBGUUZv");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void activateInferno(Player player) {
        if (IIIilIIiiIIi) {
            throw null;
        }
        Object[] objectArray = new Object[29];
        objectArray[17] = Ililllililil[240];
        objectArray[8] = Ililllililil[241];
        objectArray[13] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[13] | (Integer)objectArray[8]) + ((Integer)objectArray[13] & (Integer)objectArray[8]);
        objectArray[8] = Ililllililil[242];
        objectArray[13] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[13] ^ (Integer)objectArray[8]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[24] = Ililllililil[243];
        objectArray[8] = Ililllililil[244];
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[13] + ~((Integer)objectArray[8]).intValue() + 1;
        objectArray[8] = Ililllililil[245];
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[13] | (Integer)objectArray[8]) + ((Integer)objectArray[13] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        objectArray[0] = Ililllililil[246];
        objectArray[8] = Ililllililil[247];
        objectArray[13] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[13] & ~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[13]).intValue() & (Integer)objectArray[8];
        objectArray[8] = Ililllililil[248];
        objectArray[13] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[13] | (Integer)objectArray[8]) - ((Integer)objectArray[13] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[0]).intValue()] = player;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi.lliIliliIl("d1a8cb84-a493-4d8f-afbf-e90b54f11111", (long)-62028196645001856L, (Object[])objectArray2, (int)Ililllililil[249], (String)"xLuBwqihurdfX2JhX3a0nZ20ppeSr5NsqKqToYummqZjaKOVjJeBdpCEjg==", (String)"p6vB", (String)"gZ6MoruzpbF6vK64rnWUqK+rpJpaa4+ooJKeZ6mbpZtigZWcmJGHRw==", (int)Ililllililil[250], (String)"paukvbpiYmVkYnmVtLOStrWvro2xbqqpqIerhYSDp6ZjpH59oaCaeXicm1h0mHKWlZSTbZGQTWmNh2aKiYiChmB/", (int)Ililllililil[251], (String)"U0pSb1Zx", (int)Ililllililil[252], (String)"VHFIMlFP");
    }
}

