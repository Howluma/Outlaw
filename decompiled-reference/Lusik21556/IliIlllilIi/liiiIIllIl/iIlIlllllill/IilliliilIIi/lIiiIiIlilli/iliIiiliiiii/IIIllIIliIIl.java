/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.Location
 *  org.bukkit.block.data.BlockData
 *  org.bukkit.entity.BlockDisplay
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 *  org.bukkit.event.entity.EntityDamageEvent
 *  org.bukkit.event.entity.PlayerDeathEvent
 *  org.bukkit.event.entity.ProjectileHitEvent
 *  org.bukkit.event.player.PlayerFishEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.iliIiiliiiii;
import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class IIIllIIliIIl
implements Listener {
    static AtomicReferenceArray<MethodHandle> IIIilIIiiIIi;
    public Map<UUID, BlockDisplay> IIIllIIliIIl;
    public Map<UUID, Integer> IIlllIlliIll;
    public Map<UUID, UUID> lIiiIiIlilli;
    private static MiniMessage IliIlllilIi;
    public Map<UUID, Integer> IiIlliIliiIl;
    public Map<UUID, Integer> iliIiiliiiii;
    public Map<UUID, iliIiiliiiii> iIlIlllllill;
    private IliIlllilIi Ililllililil;
    private static BlockData liiiIIllIl;
    public Map<UUID, Long> IlIlllIlilIl;
    public Map<UUID, UUID> IilliliilIIi;
    public Map<UUID, Integer> Iilllilliill;
    public Map<UUID, float[]> Illlllllilll;
    private Set<UUID> IIillIiliIil;
    public static int[] IlIillIiilIi;
    public static int IiIiliIiiiIi;
    public static boolean IIlilIliiIli;

    /*
     * Enabled aggressive block sorting
     */
    private void startCooldown(Player player) {
        if (IIlilIliiIli) {
            int n = (0x3FA87031 | 0xEE48DC52) - (0x3FA87031 & 0xEE48DC52);
        }
        Object[] objectArray = new Object[29];
        objectArray[9] = IlIillIiilIi[294];
        objectArray[17] = IlIillIiilIi[295];
        objectArray[16] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[16] | (Integer)objectArray[17]) & (~((Integer)objectArray[16]).intValue() | ~((Integer)objectArray[17]).intValue());
        objectArray[17] = IlIillIiilIi[296];
        objectArray[16] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[16] | (Integer)objectArray[17]) + ((Integer)objectArray[16] & (Integer)objectArray[17]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[23] = IlIillIiilIi[297];
        objectArray[17] = IlIillIiilIi[298];
        objectArray[16] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[16] - ~((Integer)objectArray[17]).intValue() - 1;
        objectArray[17] = IlIillIiilIi[299];
        objectArray[16] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[16] | (Integer)objectArray[17]) & ~((Integer)objectArray[16] & (Integer)objectArray[17]);
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        objectArray[10] = IlIillIiilIi[300];
        objectArray[17] = IlIillIiilIi[301];
        objectArray[16] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[16] & ~((Integer)objectArray[17]).intValue()) - (~((Integer)objectArray[16]).intValue() & (Integer)objectArray[17]);
        objectArray[17] = IlIillIiilIi[302];
        objectArray[16] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[16] | (Integer)objectArray[17]) & ~((Integer)objectArray[16] & (Integer)objectArray[17]);
        objectArray2[((Integer)objectArray[10]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("695be8a8-e13c-49b0-a443-fa2f2110059a", (long)-8795475940317093745L, (Object[])objectArray2, (String)"eWxid2s3", (int)IlIillIiilIi[303], (String)"jKHRrcLe8NyL18PX35Cxx97WyeWjlrrXzR0zZiQ2ICpjTDgjJTwSVg==", (int)IlIillIiilIi[304], (String)"xvbM", (int)IlIillIiilIi[305], (int)IlIillIiilIi[306], (int)IlIillIiilIi[307], (String)"oPbJwMONj7CxrZS41N6/0dDf092x1pjZ1SorSEkjIkwgbSNALEYqKSg3Njg0M3BcPT8+MDw2NzlVagtHBG4PDG0CYw0BCwoEShoWGHkeHxEdEhMQEVl3dHVnZggJY28MDW8=", (String)"wcaMzfXMx8aOkq+srpHR6Ojfy+bb2t6b1SUeLCIhNyFiSy44ESIsQT0PIw==");
    }

    public void cancelTask(Integer n) {
        Object[] objectArray = new Object[28];
        objectArray[20] = IlIillIiilIi[364];
        objectArray[11] = IlIillIiilIi[365];
        objectArray[17] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[17] + ~((Integer)objectArray[11]).intValue() + 1;
        objectArray[11] = IlIillIiilIi[366];
        objectArray[17] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[17] ^ (Integer)objectArray[11]) - 2 * (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[11]);
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[6] = IlIillIiilIi[367];
        objectArray[11] = IlIillIiilIi[368];
        objectArray[17] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[17] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[11]);
        objectArray[11] = IlIillIiilIi[369];
        objectArray[17] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[17] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[6]).intValue()] = this;
        objectArray[8] = IlIillIiilIi[370];
        objectArray[11] = IlIillIiilIi[371];
        objectArray[17] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[17] | (Integer)objectArray[11]) - ((Integer)objectArray[17] & (Integer)objectArray[11]);
        objectArray[11] = IlIillIiilIi[372];
        objectArray[17] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[17] | (Integer)objectArray[11]) + ((Integer)objectArray[17] & (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[8]).intValue()] = n;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("e00b21cb-24b4-41b7-b34f-f3960c6e6485", (long)-6215786669463861610L, (Object[])objectArray2, (String)"ck1GZ1VR", (int)IlIillIiilIi[373], (String)"iarcos/V9duOzN7Iwou0wNvdxOqunb/QyObOmdnNJS1mRzUsKDcXUQ==", (int)IlIillIiilIi[374], (String)"w/3B", (int)IlIillIiilIi[375], (int)IlIillIiilIi[376], (int)IlIillIiilIi[377], (String)"pf3Ez86Gire0tomnycW61tXU3tK83Z3e0NHWt7TYJ0slZi5PIU0vLi0sKycpKHVbODQzPzE9Mj5QUTZ4OVUKC2gJbgIMAA8DTwELB2QFGhYYGR4fHFJyc3AcG3d0GGoLCGQ=", (String)"xM2BwvjHwsGLibKzs4rU7+3UxunW0duc0N7j09/aMiZnQCM3HCkpRjgUPg==");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.HIGH)
    public void onFish(PlayerFishEvent playerFishEvent) {
        if (IIlilIliiIli) {
            int cfr_ignored_0 = 0x54 & 1;
        }
        Object[] objectArray = new Object[39];
        int n = (0x6855253A | 0x25102742) - (0x6855253A & 0x25102742);
        int cfr_ignored_1 = n + 621815618;
        objectArray[23] = IlIillIiilIi[92];
        objectArray[21] = IlIillIiilIi[93];
        objectArray[14] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[14] | (Integer)objectArray[21]) & (~((Integer)objectArray[14]).intValue() | ~((Integer)objectArray[21]).intValue());
        objectArray[21] = IlIillIiilIi[94];
        objectArray[14] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[14] + ~((Integer)objectArray[21]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[23]).intValue()];
        objectArray[16] = IlIillIiilIi[95];
        objectArray[21] = IlIillIiilIi[96];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[14] | (Integer)objectArray[21]) & ~((Integer)objectArray[14] & (Integer)objectArray[21]);
        objectArray[21] = IlIillIiilIi[97];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[14] ^ (Integer)objectArray[21]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[28] = IlIillIiilIi[98];
        objectArray[21] = IlIillIiilIi[99];
        objectArray[14] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[14] & ~((Integer)objectArray[21]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[21]);
        objectArray[21] = IlIillIiilIi[100];
        objectArray[14] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[14] | (Integer)objectArray[21]) - ((Integer)objectArray[14] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[28]).intValue()] = playerFishEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("6fddfc47-b6dc-4c87-b810-5567d73f0f71", (long)-8049881079003982071L, (Object[])objectArray2, (String)"RWFER0Ez", (int)IlIillIiilIi[101], (String)"nr/Pv9DI5s6Z2c0lLWZHNSwoNxdRYEwlPxM9dDYgNjhxUiYxNyoERA==", (int)IlIillIiilIi[102], (String)"1OjS", (int)IlIillIiilIi[103], (int)IlIillIiilIi[104], (int)IlIillIiilIi[105], (String)"sujX0tGbmaKjo5pKJihJIyIhLS9DIG4rJyQlWls1NF4ycz1SPlA8Ozo5OAoGBUZuDwEAAg4AAQtnZAVVFngZHn8cfR8THRwWWBQYagtoaWNvbG1iYy8BBgdpaBobdXkeH3E=", (String)"09iS3+fa0dScnKFeXGcnGhohNRQpLChpJysQPjA3ITNwVTAqAzQ6Uy8BLQ==");
        int n2 = (0x1D152115 | 0x858B000D) - (0x1D152115 & 0x858B000D);
        int cfr_ignored_2 = n2 + -2054488051;
    }

    private void sendCooldownMessage(Player player) {
        Object[] objectArray = new Object[35];
        objectArray[15] = IlIillIiilIi[308];
        objectArray[12] = IlIillIiilIi[309];
        objectArray[33] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[33] | (Integer)objectArray[12]) & ~((Integer)objectArray[33] & (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[310];
        objectArray[33] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[33] & ~((Integer)objectArray[12]).intValue()) - (~((Integer)objectArray[33]).intValue() & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[32] = IlIillIiilIi[311];
        objectArray[12] = IlIillIiilIi[312];
        objectArray[33] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[33] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray[12] = IlIillIiilIi[313];
        objectArray[33] = (int)((Integer)objectArray[32]);
        objectArray[32] = ((Integer)objectArray[33] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[33] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[32]).intValue()] = this;
        objectArray[4] = IlIillIiilIi[314];
        objectArray[12] = IlIillIiilIi[315];
        objectArray[33] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[33] | (Integer)objectArray[12]) & ~((Integer)objectArray[33] & (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[316];
        objectArray[33] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[33] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray2[((Integer)objectArray[4]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("7b110064-e39c-4e31-88e1-47cb75d2ba54", (long)-6494362684534420794L, (Object[])objectArray2, (String)"S1V1MnE1", (int)IlIillIiilIi[317], (String)"ja7QrsPZ8d+KyMLU3pewxN/ZyOaikbvUzOIyZSUxISliQzkgJDsTVQ==", (int)IlIillIiilIi[318], (String)"x/nN", (int)IlIillIiilIi[319], (int)IlIillIiilIi[320], (int)IlIillIiilIi[321], (String)"ofnIw8KKjrOwspW71dm+0tHQ0t6w0Zna1NUqS0gkI08hYiJDLUErKikoNzs1NHFfPDA/Mz0xNjpUVQpEBWkOD2wNYg4ADAsHSwUXG3gZHhIcHRITEF52d3QYZwsIZG4PDGA=", (String)"wMmNzvTLxsWPja6vr5bQ6+nQyuXa3d+Y1NofLyMmNiJjRC87ECUtQjwQIg==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void handleLeftClick(Player player) {
        Object[] objectArray = new Object[34];
        int n = (0x653883DF | 0xE200FA) - (0x653883DF & 0xE200FA);
        int cfr_ignored_0 = n + 14811386;
        objectArray[31] = IlIillIiilIi[134];
        objectArray[23] = IlIillIiilIi[135];
        objectArray[8] = (int)((Integer)objectArray[31]);
        objectArray[31] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[23]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[23]);
        objectArray[23] = IlIillIiilIi[136];
        objectArray[8] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[8] | (Integer)objectArray[23]) - ((Integer)objectArray[8] & (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[31]).intValue()];
        objectArray[11] = IlIillIiilIi[137];
        objectArray[23] = IlIillIiilIi[138];
        objectArray[8] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[8] ^ (Integer)objectArray[23]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[23]);
        objectArray[23] = IlIillIiilIi[139];
        objectArray[8] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[8] | (Integer)objectArray[23]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[23]).intValue());
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        objectArray[19] = IlIillIiilIi[140];
        objectArray[23] = IlIillIiilIi[141];
        objectArray[8] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[8] | (Integer)objectArray[23]) + ((Integer)objectArray[8] & (Integer)objectArray[23]);
        objectArray[23] = IlIillIiilIi[142];
        objectArray[8] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[8] | (Integer)objectArray[23]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[23]).intValue());
        objectArray2[((Integer)objectArray[19]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("8276c065-e37a-45e9-9037-e24e090250ce", (long)-3424605262046704528L, (Object[])objectArray2, (String)"SXp5OXBy", (int)IlIillIiilIi[143], (String)"mbrMst/F5cue3M7Y0ptEMCstNBpebU8gOBY+aSk9NT12VyU8OCcHQQ==", (int)IlIillIiilIi[144], (String)"0+3R", (int)IlIillIiilIi[145], (int)IlIillIiilIi[146], (int)IlIillIiilIi[147], (String)"te3U396Wmqekppm32dVKJiUkLiJMLW0uICEmR0QoN1s1dj5fMV0/Pj08Ozc5OEVrCAQDDwENAg5gYQZICWUaG3gZfhIcEB8TXxEbF3QVamZoaW5vbCICAwBsawcEaHobGHQ=", (String)"1N2R0ujX0tGbmaKjo5okHx0kNhkmIStsIC4TIy8qIjZ3UDMnDDk5VigELg==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$spawnWool$3(BlockDisplay blockDisplay) {
        if (IIlilIliiIli) {
        }
        Object[] objectArray = new Object[27];
        int n = (0x19348AF | 0x29ECEF05) - (0x19348AF & 0x29ECEF05);
        int cfr_ignored_0 = n + 703393541;
        objectArray[5] = IlIillIiilIi[378];
        objectArray[4] = IlIillIiilIi[379];
        objectArray[22] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[22] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[4];
        objectArray[4] = IlIillIiilIi[380];
        objectArray[22] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[22] - ~((Integer)objectArray[4]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[6] = IlIillIiilIi[381];
        objectArray[4] = IlIillIiilIi[382];
        objectArray[22] = (int)((Integer)objectArray[6]);
        objectArray[6] = 2 * ((Integer)objectArray[22] | (Integer)objectArray[4]) - ((Integer)objectArray[22] ^ (Integer)objectArray[4]);
        objectArray[4] = IlIillIiilIi[383];
        objectArray[22] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[22] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[4];
        objectArray2[((Integer)objectArray[6]).intValue()] = blockDisplay;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("ff4ed6fa-6cd3-4bcd-bf19-15a266bbf79c", (long)2290243460655377812L, (Object[])objectArray2, (String)"S0hrYTho", (int)IlIillIiilIi[384], (String)"iqvbo8zU+tqNzdnJwYqrwdjcw+utnLDRy+fJmNrM2ixlRjItKzYYUA==", (int)IlIillIiilIi[385], (String)"wPzG", (int)IlIillIiilIi[386], (int)IlIillIiilIi[387], (int)IlIillIiilIi[388], (String)"pvzDzs2Hhba3t46mysSl19bV2dO/3JLf09DRtrfZ2EomZylOIkwgLy4tLCYqKWpaOzU0PjI8PT9TUDF5OlQ1CmsIaQMPAQACTAAMBmcEBRcbGBkeH1N9cnMdHHZ3GRUKC2U=", (String)"x8yGw/vGzcCIiLWysIvL7u7VwejV0NSd09/k0tzbzSdkQSQ2HygmRzsVOQ==");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IIiIllIiIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2;
        int n3 = n2 = (0x79FDC7EA | 0xB58B0202) - (0x79FDC7EA & 0xB58B0202);
        if (1078921706 >= n3 + -1249181182 - (n3 & 0xB58B0202) * 2) {
            int n4 = n2 = (0x91EC4C38 | 0xB58B0202) - (0x91EC4C38 & 0xB58B0202);
            IiIiliIiiiIi = n4 + -1249181182 - (n4 & 0xB58B0202) * 2;
        }
        Object[] objectArray = new Object[15];
        int n5 = (0x4A9CD47B | 0x3671DEB5) - (0x4A9CD47B & 0x3671DEB5);
        int cfr_ignored_0 = n5 + 913432245;
        try {
            objectArray[9] = MethodHandles.lookup();
            objectArray[11] = ((MethodHandles.Lookup)objectArray[9]).findStatic(IIIllIIliIIl.class, "iIiIlIliIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
            objectArray[3] = methodType.parameterCount();
            objectArray[0] = 10;
            objectArray[14] = (int)((Integer)objectArray[3]);
            objectArray[12] = ((Integer)objectArray[14] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[0]);
            n = (0xF94046F8 | 0x6C8F5EB0) - (0xF94046F8 & 0x6C8F5EB0);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw cloneNotSupportedException;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
        int cfr_ignored_1 = n + 1821335216;
        objectArray[7] = methodType.dropParameterTypes((Integer)objectArray[12], (Integer)objectArray[3]);
        objectArray[13] = MethodHandles.invoker((MethodType)objectArray[7]);
        objectArray[4] = ((MethodType)objectArray[7]).appendParameterTypes(MethodHandle.class);
        objectArray[0] = 1;
        objectArray[14] = (int)((Integer)objectArray[12]);
        objectArray[8] = new int[((Integer)objectArray[14] | (Integer)objectArray[0]) + ((Integer)objectArray[14] & (Integer)objectArray[0])];
        ((int[])objectArray[8])[0] = (Integer)objectArray[12];
        objectArray[10] = 1;
        while (true) {
            objectArray[0] = 1;
            objectArray[14] = (int)((Integer)objectArray[12]);
            if ((Integer)objectArray[10] >= 2 * ((Integer)objectArray[14] | (Integer)objectArray[0]) - ((Integer)objectArray[14] ^ (Integer)objectArray[0])) {
                objectArray[2] = MethodHandles.permuteArguments((MethodHandle)objectArray[13], (MethodType)objectArray[4], (int[])objectArray[8]);
                objectArray[6] = MethodHandles.collectArguments((MethodHandle)objectArray[2], (Integer)objectArray[12], (MethodHandle)objectArray[11]);
                return new ConstantCallSite((MethodHandle)objectArray[6]);
            }
            objectArray[0] = 1;
            objectArray[14] = (int)((Integer)objectArray[10]);
            ((int[])objectArray[8])[((Integer)objectArray[10]).intValue()] = ((Integer)objectArray[14] ^ (Integer)objectArray[0]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[0]);
            objectArray[10] = (Integer)objectArray[10] + 1;
        }
    }

    private /* synthetic */ void lambda$onFish$0(UUID uUID) {
        Object[] objectArray = new Object[28];
        objectArray[10] = 184;
        objectArray[21] = -89;
        objectArray[24] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[24] - ~((Integer)objectArray[21]).intValue() - 1;
        objectArray[21] = 78;
        objectArray[24] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[24] | (Integer)objectArray[21]) - ((Integer)objectArray[24] & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[18] = -23;
        objectArray[21] = 85;
        objectArray[24] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[24] & ~((Integer)objectArray[21]).intValue()) - (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[21]);
        objectArray[21] = 108;
        objectArray[24] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[24] | (Integer)objectArray[21]) - ((Integer)objectArray[24] ^ (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[26] = 0;
        objectArray[21] = -53;
        objectArray[24] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[24] | (Integer)objectArray[21]) + ((Integer)objectArray[24] & (Integer)objectArray[21]);
        objectArray[21] = -54;
        objectArray[24] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[24] & ~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[24]).intValue() & (Integer)objectArray[21];
        objectArray2[((Integer)objectArray[26]).intValue()] = uUID;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("92b85c51-d24a-4f40-87fa-54775379c863", (long)-9089076850694235960L, (Object[])objectArray2, (String)"NDE4WXl1", (int)33, (String)"tZbYpsvR+deCwNrMxo+o3MfBwO6qmbPcxOrKnd3J2dGauzEoLDMbXQ==", (int)2055158808, (String)"/8HF", (int)572810930, (int)108, (int)-1505330977, (String)"mcHAy8qChru4uo2jzcGmysnI2ta42ZHS3N3Ss7Dc27fZmipLJUkjIiEgLyMtLGlHJCg3OzU5PjJcXTJ8PVE2N1Q1agYIBAMPQw0PA2ABBgoEBRobGFZ+f3wQH3NwHBZ3dBg=", (String)"+PGFxvzDzs2Hhba3t47I8/HIwu3S1deQ3NLn19veztqbvCczGC0lSjQYOg==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void spawnLassoBreakParticles(Location location) {
        int n;
        int n2 = n = (0x9DF8E69 | 0xAD14E2F2) - (0x9DF8E69 & 0xAD14E2F2);
        IiIiliIiiiIi = n2 + -1391140110 - (n2 & 0xAD14E2F2) * 2;
        if (612415848 <= IiIiliIiiiIi) {
        }
        Object[] objectArray = new Object[34];
        int n3 = (0x1D1BEB79 | 0x973A6C98) - (0x1D1BEB79 & 0x973A6C98);
        int cfr_ignored_0 = n3 + -1757778792;
        objectArray[29] = IlIillIiilIi[280];
        objectArray[0] = IlIillIiilIi[281];
        objectArray[33] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[33] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[33]).intValue() & (Integer)objectArray[0]);
        objectArray[0] = IlIillIiilIi[282];
        objectArray[33] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[33] + ~((Integer)objectArray[0]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[29]).intValue()];
        objectArray[11] = IlIillIiilIi[283];
        objectArray[0] = IlIillIiilIi[284];
        objectArray[33] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[33] - ~((Integer)objectArray[0]).intValue() - 1;
        objectArray[0] = IlIillIiilIi[285];
        objectArray[33] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[33] - ~((Integer)objectArray[0]).intValue() - 1;
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        objectArray[26] = IlIillIiilIi[286];
        objectArray[0] = IlIillIiilIi[287];
        objectArray[33] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[33] | (Integer)objectArray[0]) & (~((Integer)objectArray[33]).intValue() | ~((Integer)objectArray[0]).intValue());
        objectArray[0] = IlIillIiilIi[288];
        objectArray[33] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[33] - ~((Integer)objectArray[0]).intValue() - 1;
        objectArray2[((Integer)objectArray[26]).intValue()] = location;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("08aba639-1038-4179-9078-fedf704ac04b", (long)4785876902181783288L, (Object[])objectArray2, (String)"M0hhNUxu", (int)IlIillIiilIi[289], (String)"g6DSrMXf892U1sDW2JGyxtHXyuSkl7nWMhwwZyM3IytsTTsiIj0RVw==", (int)IlIillIiilIi[290], (String)"yffP", (int)IlIillIiilIi[291], (int)IlIillIiilIi[292], (int)IlIillIiilIi[293], (String)"r/fKwcSMjLGurJe509+80N/e0Ny215vYKisoSU4iIU0vbCBBK0cpKDc2NTkzMnNdMj49MTs3NDhqawhGA28MDWIDYAwGCgkFVRsVGX4fHBASExARFlh0dQpmZQkOYmwNAm4=", (String)"zsePzPLNxMeRk6ytqZDS6efeyOfc292aKiQdLSUgNCBtSi05FiMvQCIOIA==");
        int n4 = (0xD774F4E1 | 0x49462D38) - (0xD774F4E1 & 0x49462D38);
        int cfr_ignored_1 = n4 + 1229335864;
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.HIGH)
    public void onProjectileHit(ProjectileHitEvent projectileHitEvent) {
        Object[] objectArray = new Object[37];
        int n = (0x6D799D4C | 0x848D4940) - (0x6D799D4C & 0x848D4940);
        int cfr_ignored_0 = n + -2071115456;
        objectArray[34] = IlIillIiilIi[78];
        objectArray[15] = IlIillIiilIi[79];
        objectArray[1] = (int)((Integer)objectArray[34]);
        objectArray[34] = 2 * ((Integer)objectArray[1] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[1] ^ (Integer)objectArray[15]);
        objectArray[15] = IlIillIiilIi[80];
        objectArray[1] = (int)((Integer)objectArray[34]);
        objectArray[34] = ((Integer)objectArray[1] & ~((Integer)objectArray[15]).intValue()) - (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[34]).intValue()];
        objectArray[26] = IlIillIiilIi[81];
        objectArray[15] = IlIillIiilIi[82];
        objectArray[1] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[1] | (Integer)objectArray[15]) & ~((Integer)objectArray[1] & (Integer)objectArray[15]);
        objectArray[15] = IlIillIiilIi[83];
        objectArray[1] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[1] | (Integer)objectArray[15]) - ((Integer)objectArray[1] ^ (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[26]).intValue()] = this;
        objectArray[8] = IlIillIiilIi[84];
        objectArray[15] = IlIillIiilIi[85];
        objectArray[1] = (int)((Integer)objectArray[8]);
        objectArray[8] = 2 * ((Integer)objectArray[1] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[1] ^ (Integer)objectArray[15]);
        objectArray[15] = IlIillIiilIi[86];
        objectArray[1] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[1] | (Integer)objectArray[15]) + ((Integer)objectArray[1] & (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[8]).intValue()] = projectileHitEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("bcfacc12-0bca-4a23-973a-15edcd616355", (long)2967836959123190497L, (Object[])objectArray2, (String)"T05QUlJB", (int)IlIillIiilIi[87], (String)"nb7AvtPJ4c+a2DIkLmdANC8pOBZSYUskPBIidTUhMTlyUykwNCsDRQ==", (int)IlIillIiilIi[88], (String)"1+nd", (int)IlIillIiilIi[89], (int)IlIillIiilIi[90], (int)IlIillIiilIi[91], (String)"senY09KanqOgomVLJSlOIiEgIi5AIWkqJCU6W1g0M18xcjJTPVE7Ojk4BwsFBEFvDAAPAw0BBgpkZRpUFXkeH3wdch4QHBsXWxVnawhpbmJsbWJjYC4GBwRodxsYdH4fHHA=", (String)"0Nmd3uTb1tWfnV5fX2YgGxkgOhUqLS9oJCoPPzM2JjJzVD8rADU9UiwAEg==");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long cooldownSeconds() {
        if (IIlilIliiIli) {
            throw null;
        }
        Object[] objectArray = new Object[26];
        objectArray[0] = IlIillIiilIi[14];
        objectArray[22] = IlIillIiilIi[15];
        objectArray[18] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[18] ^ (Integer)objectArray[22]) - 2 * (~((Integer)objectArray[18]).intValue() & (Integer)objectArray[22]);
        objectArray[22] = IlIillIiilIi[16];
        objectArray[18] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[22]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[22]);
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[25] = IlIillIiilIi[17];
        objectArray[22] = IlIillIiilIi[18];
        objectArray[18] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[18] & ~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[18]).intValue() & (Integer)objectArray[22];
        objectArray[22] = IlIillIiilIi[19];
        objectArray[18] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[18] - ~((Integer)objectArray[22]).intValue() - 1;
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        return (long)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("077f4acc-08b4-406b-bc4a-98b5a258ad8b", (Object)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("d31830e2-71dc-4630-96c9-b95d2d69e93c", (long)-8540072678290557879L, (Object[])objectArray2, (String)"QXREa2pu", (int)IlIillIiilIi[20], (String)"lbY4RisxGTdiIDosJm9IPCchIA5KeVM8JAoqfT0pOTF6WxEIDBM7fQ==", (int)IlIillIiilIi[21], (String)"3+El", (int)IlIillIiilIi[22], (int)IlIillIiilIi[23], (int)IlIillIiilIi[24], (String)"ueEgKypiZltYWm1DLSFGKikoOjZYOXEyPD0yU1A8O1c5egprBWkDAgEADwMNDElnBAgXGxUZHhJ8fRJcHXEWF3QVCmZoZGNvI21vYwBhZmpkZXp7eDYeHxxwfxMQfHYXFHg=", (String)"2NFlJhwjLi1nZVZXV24oExEoIg0yNTdwPDIHNzs+Ljp7XAcTOA0FahQ4Gg=="), (String)"TnJ6Ulhv", (int)IlIillIiilIi[25], (String)"lrnWMhwwZyM3IytsTTsiIj0RV3pY", (int)IlIillIiilIi[26], (String)"4tq4JCQu", (int)IlIillIiilIi[27], (int)IlIillIiilIi[28], (int)IlIillIiilIi[29], (String)"uuDfKiljYVpbW2JCLiBBKyopJTdbOHYzPzw9UlM9PFY6ezVqBmgEAwIBAAIODU5mBwkIGhYYGRN/fB1dHnARFncUdWdrZWRuIGxgYgNgYWtnZGV6ezcZHh9xcBITfXEWF3k=", (String)"29CaJx8iKSxkZFlWVG8vEhIpPQwxNDBxPzMINjg/KTt4XTgSOwwCaxc5FQ==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void lambda$startGrab$1(UUID uUID, Player player) {
        int n;
        int n2 = n = (0x1982C169 | 0x553AF8DB) - (0x1982C169 & 0x553AF8DB);
        IiIiliIiiiIi = n2 + 1429928155 - (n2 & 0x553AF8DB) * 2;
        if (1055174101 < IiIiliIiiiIi) {
            int n3 = n = (0 | 0x553AF8DB) - (0 & 0x553AF8DB);
            int cfr_ignored_0 = n3 + 1429928155 - (n3 & 0x553AF8DB) * 2;
        }
        Object[] objectArray = new Object[30];
        objectArray[12] = 2;
        objectArray[8] = -41;
        objectArray[3] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[3] + ~((Integer)objectArray[8]).intValue() + 1;
        objectArray[8] = 57;
        objectArray[3] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[3] | (Integer)objectArray[8]) - ((Integer)objectArray[3] & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[12]).intValue()];
        objectArray[2] = 50;
        objectArray[8] = 74;
        objectArray[3] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[3] ^ (Integer)objectArray[8]) + 2 * ((Integer)objectArray[3] & (Integer)objectArray[8]);
        objectArray[8] = -124;
        objectArray[3] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[3] | (Integer)objectArray[8]) - ((Integer)objectArray[3] ^ (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[2]).intValue()] = this;
        objectArray[17] = -24;
        objectArray[8] = 8;
        objectArray[3] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[3] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray[8] = -15;
        objectArray[3] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[3] & ~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[3]).intValue() & (Integer)objectArray[8];
        objectArray2[((Integer)objectArray[17]).intValue()] = uUID;
        objectArray[29] = 94;
        objectArray[8] = -99;
        objectArray[3] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[3] | (Integer)objectArray[8]) + ((Integer)objectArray[3] & (Integer)objectArray[8]);
        objectArray[8] = 7;
        objectArray[3] = (int)((Integer)objectArray[29]);
        objectArray[29] = 2 * ((Integer)objectArray[3] | (Integer)objectArray[8]) - ((Integer)objectArray[3] ^ (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[29]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("2efe3695-f16a-4b4b-ac90-4b34f6a2ff97", (long)5024735677886161468L, (Object[])objectArray2, (String)"NWZaQlJX", (int)32, (String)"tKnZpcrW+NSDz9vPx4ip38bewe2rnrLfxeXLntzO2NKbRDArLTQaXg==", (int)975501396, (String)"/v7E", (int)-321941499, (int)108, (int)-1505330977, (String)"mP7ByMuFh7i5tYygzManycjX29W53pDR3dLTsLHb2rTYZStIJE4iISAvLiAsK2hEJTc2ODQ+PzFdUjN/PFY3NFUKawUJAwIMQgIOAGEGBwkFGhsYGVF/fH0fHnBxGxd0dWc=", (String)"+c6Exf3Ez86Gire0tonJ8PDXw+7T0taT3d3m1NrZz9maQyYwGSokSTUXOw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void removeWool(BlockDisplay blockDisplay) {
        if (IIlilIliiIli) {
            int n;
            int n2 = n = (0x62 | 0x99ACDF89) - (0x62 & 0x99ACDF89);
            int cfr_ignored_0 = n2 + -1716723831 - (n2 & 0x99ACDF89) * 2;
        }
        Object[] objectArray = new Object[29];
        objectArray[5] = IlIillIiilIi[336];
        objectArray[7] = IlIillIiilIi[337];
        objectArray[0] = (int)((Integer)objectArray[5]);
        objectArray[5] = 2 * ((Integer)objectArray[0] | (Integer)objectArray[7]) - ((Integer)objectArray[0] ^ (Integer)objectArray[7]);
        objectArray[7] = IlIillIiilIi[338];
        objectArray[0] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[0] | (Integer)objectArray[7]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[7]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[12] = IlIillIiilIi[339];
        objectArray[7] = IlIillIiilIi[340];
        objectArray[0] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[0] - ~((Integer)objectArray[7]).intValue() - 1;
        objectArray[7] = IlIillIiilIi[341];
        objectArray[0] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[0] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        objectArray[19] = IlIillIiilIi[342];
        objectArray[7] = IlIillIiilIi[343];
        objectArray[0] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[0] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[7]);
        objectArray[7] = IlIillIiilIi[344];
        objectArray[0] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[0] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[19]).intValue()] = blockDisplay;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("59520947-c28e-4d41-81dc-c27c37ecc3f4", (long)-5378510687899330778L, (Object[])objectArray2, (String)"ZlE4THBw", (int)IlIillIiilIi[345], (String)"j6zeoMHb99mIytzK3JW2wt3bxuigk73SzuDMmyczJy9gQTcuJjkVUw==", (int)IlIillIiilIi[346], (String)"xfvD", (int)IlIillIiilIi[347], (int)IlIillIiilIi[348], (int)IlIillIiilIi[349], (String)"o/vGzcCIiLWysIul19u41NPS3NCy05/c1tfUtUomJUkjYCxNL0MtLCsqKSU3NndZPjIxPT8zMDxWVzR6B2sICW4PbAACDg0BSQcJBXobGBQeHxwdElxwcXYaGXUKZmgJDmI=", (String)"wsuDwPbJwMONj7CxrZTW7evSxOvY39me1tjh0SEkMCRhRiE1EicrRD4SPA==");
        int n = (0x36209498 | 0xA4DDE10B) - (0x36209498 & 0xA4DDE10B);
        int cfr_ignored_1 = n + -1528962805;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void applySlownessAndWiggle(Player player, UUID uUID) {
        Object[] objectArray = new Object[33];
        objectArray[14] = IlIillIiilIi[246];
        objectArray[12] = IlIillIiilIi[247];
        objectArray[25] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[25] & ~((Integer)objectArray[12]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[248];
        objectArray[25] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[25] & ~((Integer)objectArray[12]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[26] = IlIillIiilIi[249];
        objectArray[12] = IlIillIiilIi[250];
        objectArray[25] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[25] | (Integer)objectArray[12]) & ~((Integer)objectArray[25] & (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[251];
        objectArray[25] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[25] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[25] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[26]).intValue()] = this;
        objectArray[7] = IlIillIiilIi[252];
        objectArray[12] = IlIillIiilIi[253];
        objectArray[25] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[25] + ~((Integer)objectArray[12]).intValue() + 1;
        objectArray[12] = IlIillIiilIi[254];
        objectArray[25] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[25] & ~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[12];
        objectArray2[((Integer)objectArray[7]).intValue()] = player;
        objectArray[30] = IlIillIiilIi[255];
        objectArray[12] = IlIillIiilIi[256];
        objectArray[25] = (int)((Integer)objectArray[30]);
        objectArray[30] = (Integer)objectArray[25] & ~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[12];
        objectArray[12] = IlIillIiilIi[257];
        objectArray[25] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[25] | (Integer)objectArray[12]) - ((Integer)objectArray[25] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[30]).intValue()] = uUID;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("c74fec21-0af8-4498-9c58-b57069f30156", (long)5351776164769913158L, (Object[])objectArray2, (String)"SGFLSFdl", (int)IlIillIiilIi[258], (String)"gaLUqsfd7cOW1MbQ2pO8yNPVzOKmlUcoMB42YSE1LSVuTz0kID8PSQ==", (int)IlIillIiilIi[259], (String)"y/XJ", (int)IlIillIiilIi[260], (int)IlIillIiilIi[261], (int)IlIillIiilIi[262], (String)"rfXMx8aOkq+srpG/0d2y3t3c1tq01WUmKCkuT0wgL0MtbiZHKUU3NjU0Mz8xMH1TMDw7Nzk1CgZoaQ5AAW0CA2ABZgoECBcbVxkTH3wdEh4QERYXFFoKCwhkYw8MYGIDAGw=", (String)"zMWJyvDP2tmTkaqrq5Lc5+XczuHe2SNkKCYbKyciOi5vSCs/FCExXiAMJg==");
        int n = (0x5C179F4C | 0x26703720) - (0x5C179F4C & 0x26703720);
        int cfr_ignored_0 = n + 644888352;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockDisplay spawnWool(Player player) {
        if (IIlilIliiIli) {
            int cfr_ignored_0 = 14 + 79;
        }
        Object[] objectArray = new Object[30];
        objectArray[11] = IlIillIiilIi[322];
        objectArray[20] = IlIillIiilIi[323];
        objectArray[17] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[17] ^ (Integer)objectArray[20]) - 2 * (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[20]);
        objectArray[20] = IlIillIiilIi[324];
        objectArray[17] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[17] | (Integer)objectArray[20]) - ((Integer)objectArray[17] & (Integer)objectArray[20]);
        Object[] objectArray2 = new Object[((Integer)objectArray[11]).intValue()];
        objectArray[15] = IlIillIiilIi[325];
        objectArray[20] = IlIillIiilIi[326];
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[17] | (Integer)objectArray[20]) & (~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray[20] = IlIillIiilIi[327];
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[17] | (Integer)objectArray[20]) - ((Integer)objectArray[17] ^ (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[14] = IlIillIiilIi[328];
        objectArray[20] = IlIillIiilIi[329];
        objectArray[17] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[17] | (Integer)objectArray[20]) & (~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray[20] = IlIillIiilIi[330];
        objectArray[17] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[17] ^ (Integer)objectArray[20]) + 2 * ((Integer)objectArray[17] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[14]).intValue()] = player;
        return (BlockDisplay)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("4ac23102-d026-4c02-94c0-da564780c775", (long)-7622180312156613643L, (Object[])objectArray2, (String)"RmkyakRv", (int)IlIillIiilIi[331], (String)"jq/fr8DY9t6Jyd3V3Za3xdzYx+ehkLzVz+PNZCYwJihhQjYhJzoUVA==", (int)IlIillIiilIi[332], (String)"xPjC", (int)IlIillIiilIi[333], (int)IlIillIiilIi[334], (int)IlIillIiilIi[335], (String)"ovjHwsGLibKzs4q61ti509LR3d+z0J7b19TVSkslJE4iYy1CLkAsKyopKDo2NXZePzEwMj4wMTtXVDVFBmgJDm8MbQ8DDQwGSAQIGnsYGRMfHB0SE19xdncZGAoLZWkOD2E=", (String)"w8iCz/fKwcSMjLGurJfX6urRxeTZ3NiZ19vgLiAnMSNgRSA6EyQqQz8RPQ==");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        int n;
        int n2 = n = (0x24B6962 | 0x8E1ACC8) - (0x24B6962 & 0x8E1ACC8);
        IiIiliIiiiIi = n2 + 149007560 - (n2 & 0x8E1ACC8) * 2;
        if (70403874 < IiIiliIiiiIi) {
            throw null;
        }
        Object[] objectArray = new Object[33];
        objectArray[32] = IlIillIiilIi[176];
        objectArray[30] = IlIillIiilIi[177];
        objectArray[10] = (int)((Integer)objectArray[32]);
        objectArray[32] = ((Integer)objectArray[10] | (Integer)objectArray[30]) + ((Integer)objectArray[10] & (Integer)objectArray[30]);
        objectArray[30] = IlIillIiilIi[178];
        objectArray[10] = (int)((Integer)objectArray[32]);
        objectArray[32] = 2 * ((Integer)objectArray[10] | (Integer)objectArray[30]) - ((Integer)objectArray[10] ^ (Integer)objectArray[30]);
        Object[] objectArray2 = new Object[((Integer)objectArray[32]).intValue()];
        objectArray[27] = IlIillIiilIi[179];
        objectArray[30] = IlIillIiilIi[180];
        objectArray[10] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[10] | (Integer)objectArray[30]) & ~((Integer)objectArray[10] & (Integer)objectArray[30]);
        objectArray[30] = IlIillIiilIi[181];
        objectArray[10] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[10] & ~((Integer)objectArray[30]).intValue()) - ((Integer)objectArray[10] ^ (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[27]).intValue()] = this;
        objectArray[12] = IlIillIiilIi[182];
        objectArray[30] = IlIillIiilIi[183];
        objectArray[10] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[10] | (Integer)objectArray[30]) - ((Integer)objectArray[10] & (Integer)objectArray[30]);
        objectArray[30] = IlIillIiilIi[184];
        objectArray[10] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[10] | (Integer)objectArray[30]) & ~((Integer)objectArray[10] & (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[12]).intValue()] = playerQuitEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("a5b78b07-e9f9-427c-a8ce-416b6f3bd2c2", (long)5095929536748225513L, (Object[])objectArray2, (String)"SjJVcW1u", (int)IlIillIiilIi[185], (String)"hLnJtdrG6MST38vf15i5z9YuMR1bbkIvNRU7biw+KCJrVCA7PSQKTg==", (int)IlIillIiilIi[186], (String)"zu7U", (int)IlIillIiilIi[187], (int)IlIillIiilIi[188], (int)IlIillIiilIi[189], (String)"qO7R2NuVl6ippZyw3Na32dgnKyVJLmAhLSIjQEErKkQodTtYNF4yMTA/PjA8O3hUNQcGCAQODwFtYgNPDGYHBGUaexUZExIcUhIeEHEWFxkVamtoaSEPDA1vbgABa2cEBXc=", (String)"yd6U1e3U396WmqekppnZ4OAnMx4jIiZjLS0WJCopPylqUzYgCTo0WSUHKw==");
        int n3 = (0x1993085C | 0xB5487F96) - (0x1993085C & 0xB5487F96);
        int cfr_ignored_0 = n3 + -1253539946;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int wiggleFlipsRequired() {
        int n;
        int n2 = n = (0x4247E398 | 0x2072DC46) - (0x4247E398 & 0x2072DC46);
        IiIiliIiiiIi = n2 + 544398406 - (n2 & 0x2072DC46) * 2;
        if (1644674896 < IiIiliIiiiIi) {
            throw null;
        }
        Object[] objectArray = new Object[27];
        int n3 = (0xE6C97318 | 0x4B621DC3) - (0xE6C97318 & 0x4B621DC3);
        int cfr_ignored_0 = n3 + 1264721347;
        objectArray[14] = IlIillIiilIi[62];
        objectArray[17] = IlIillIiilIi[63];
        objectArray[0] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[0] ^ (Integer)objectArray[17]) - 2 * (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[17]);
        objectArray[17] = IlIillIiilIi[64];
        objectArray[0] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[0] | (Integer)objectArray[17]) - ((Integer)objectArray[0] & (Integer)objectArray[17]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[2] = IlIillIiilIi[65];
        objectArray[17] = IlIillIiilIi[66];
        objectArray[0] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[0] | (Integer)objectArray[17]) + ((Integer)objectArray[0] & (Integer)objectArray[17]);
        objectArray[17] = IlIillIiilIi[67];
        objectArray[0] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[0] | (Integer)objectArray[17]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[17]).intValue());
        objectArray2[((Integer)objectArray[2]).intValue()] = this;
        return (int)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("0dad17b5-6cab-4695-9a95-9fdbb67b38f2", (Object)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("435e147b-3177-4191-9c4e-4db3cd418167", (long)-6210247597818798965L, (Object[])objectArray2, (String)"ejlNQWJs", (int)IlIillIiilIi[68], (String)"k7DCvNXP481kJjAmKGFCNiEnOhRUZ0kmIgwgdzMnMzt8XSsyMi0BRw==", (int)IlIillIiilIi[69], (String)"2eff", (int)IlIillIiilIi[70], (int)IlIillIiilIi[71], (int)IlIillIiilIi[72], (String)"v+fa0dScnKFeXGdJIy9MIC8uICxGJ2soOjs4WV4yMV0/fDBRO1c5OAcGBQkDAkNtAg4NAQsHBAh6exhWE38cHXITcBwWGhkVJWtlaQ5vbGBiY2BhZigEBRp2dRkecnwdEn4=", (String)"3tef3OLd1NdhY1xdWWAiGRcuOBcsKy1qOjQNPTUwJDB9Wj0pBjM/UBI+EA=="), (String)"eGxwYURi", (int)IlIillIiilIi[73], (String)"nL/QyObOmdnNJS1mRzUsKDcXUWBB", (int)IlIillIiilIi[74], (String)"6Nyz3+Q=", (int)IlIillIiilIi[75], (int)IlIillIiilIi[76], (int)IlIillIiilIi[77], (String)"sObZ0NOdn6ChXWRIJC5PISAvIy1BJmgpJTo7WFkzMlwwfTNQPFY6OTgHBggEA0BsDQ8OAAwGBwllehtXFH4fHH0Scx0RGxoUWmpmaAlub2FtYmNgYSkHBAV3dhgZc38cHX8=", (String)"0dac3eXc19aeYl9cXmEhGBgvOxYrKi5rJTUOPDIxJzFyWz4oATI8US0/Ew==");
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x75A4A51F | 0xE24D1649) - (0x75A4A51F & 0xE24D1649);
        if (1687401652 >= n2 + -498264503 - (n2 & 0xE24D1649) * 2) {
            n = (0x447E4189 | 0xE24D1649) - (0x447E4189 & 0xE24D1649);
        }
        Object[] objectArray = new Object[26];
        int n3 = (0xCCEF6D4C | 0x7E387F35) - (0xCCEF6D4C & 0x7E387F35);
        block4: while (true) {
            int n4 = n3;
            switch (n4 + 2117631797 - (n4 & 0x7E387F35) * 2) {
                default: {
                    Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IiiIlliiIl();
                    n3 = (0xCE1FE19C | 0x7E387F35) - (0xCE1FE19C & 0x7E387F35);
                    continue block4;
                }
                case -836771428: 
            }
            break;
        }
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("69d1b7ff-bed0-4bc3-9135-f9fda6f2c6a2", IIIllIIliIIl.class, (String)"TU5FNGdo", (int)34, (String)"tpn20vzQh8PXw8uMuc3ZzM22hc0=", (int)1814321805, (String)"+vrtz9zE", (int)983173418, (int)108, (int)-1505330977, (String)"msD/ysmDgbq7u4KizsChy8rJxde72JbT39zdsrPd3Lbam9VKJkgkIyIhICIuLW5GJykoOjY4OTNfXD19PlAxNlc0VQcLBQQOQAwAAmMAAQsHBAUaG1d5fn8REHJzHRF2dxk=", (String)"+/C6x//CycyEhLm2tI/P8vLJ3ezR1NCR39Po1tjfyduYvdgyGywiSzcZNQ==");
        objectArray[15] = 205;
        objectArray[21] = 70;
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[12] & ~((Integer)objectArray[21]).intValue()) - ((Integer)objectArray[12] ^ (Integer)objectArray[21]);
        objectArray[21] = -120;
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[21]) - ((Integer)objectArray[12] ^ (Integer)objectArray[21]);
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("e0fe0859-eba8-4d2c-8124-59be782c8f80", (long)2941070245464897076L, (Object[])new Object[((Integer)objectArray[15]).intValue()], (String)"c09wWWZ2", (int)35, (String)"t5TmmMnT/9GAwtTCxI2u2sXD3vCom7XaxujEk9/L39eYuc/WLjEdWw==", (int)-1294179676, (String)"/cP7", (int)312886065, (int)108, (int)-1505330977, (String)"m8P+9ciAgL26uIOtz8OgzMvKxMi625fU3t/cvbLe3bHbmNS1J0slJCMiIS0vLm9BJiopJTc7ODReXzxyP1MwMVY3VDgKBgUJQQ8BDWIDAAwGBwQFGlR4eX4SEX1yHhBxdho=", (String)"+vO7+P7ByMuFh7i5tYzO9fPK3PPQ19GW3tDp2dncyNyZvtnNGi8jTDYaNA==");
        int n5 = (0x5F2B504A | 0x68EE7E89) - (0x5F2B504A & 0x68EE7E89);
        int cfr_ignored_0 = n5 + 1760460425;
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.HIGH)
    public void onInteract(PlayerInteractEvent playerInteractEvent) {
        if (IIlilIliiIli) {
        }
        Object[] objectArray = new Object[31];
        int n = (0xE038D6B2 | 0x431109DD) - (0xE038D6B2 & 0x431109DD);
        int cfr_ignored_0 = n + 1125190109;
        objectArray[11] = IlIillIiilIi[106];
        objectArray[20] = IlIillIiilIi[107];
        objectArray[12] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[12] & ~((Integer)objectArray[20]).intValue()) - ((Integer)objectArray[12] ^ (Integer)objectArray[20]);
        objectArray[20] = IlIillIiilIi[108];
        objectArray[12] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[12] | (Integer)objectArray[20]) - ((Integer)objectArray[12] & (Integer)objectArray[20]);
        Object[] objectArray2 = new Object[((Integer)objectArray[11]).intValue()];
        objectArray[15] = IlIillIiilIi[109];
        objectArray[20] = IlIillIiilIi[110];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[12] & ~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[20];
        objectArray[20] = IlIillIiilIi[111];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[12] ^ (Integer)objectArray[20]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[8] = IlIillIiilIi[112];
        objectArray[20] = IlIillIiilIi[113];
        objectArray[12] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[12] & ~((Integer)objectArray[20]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[20]);
        objectArray[20] = IlIillIiilIi[114];
        objectArray[12] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[12] ^ (Integer)objectArray[20]) + 2 * ((Integer)objectArray[12] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[8]).intValue()] = playerInteractEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("a2ea5370-a7c4-4612-a0bc-f7ad5077cbef", (long)7835599408262362978L, (Object[])objectArray2, (String)"UGdEWlly", (int)IlIillIiilIi[115], (String)"n7zOsNHL58mY2szaLGVGMi0rNhhQY00iPhA8azcjNz9wUSc+NikFQw==", (int)IlIillIiilIi[116], (String)"1evT", (int)IlIillIiilIi[117], (int)IlIillIiilIi[118], (int)IlIillIiilIi[119], (String)"s+vW3dCYmKWioJu1JytIJCMiLCBCI28sJickRVo2NVkzcDxdP1M9PDs6OTUHBkdpDgIBDQ8DAAxmZwRKF3sYGX4ffBASHh0RWRcZFQpraGRub2xtYiwAAQZqaQUadngZHnI=", (String)"0tuT0ObZ0NOdn6ChXWQmHRsiNBsoLyluJigRITE0IDRxVjElAjc7VC4CLA==");
    }

    /*
     * Exception decompiling
     */
    public static void IiiIlliiIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [110[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private double pullForce() {
        if (IIlilIliiIli) {
            int n = (0x1D21748F | 0xE7643F93) - (0x1D21748F & 0xE7643F93);
        }
        Object[] objectArray = new Object[26];
        objectArray[5] = IlIillIiilIi[46];
        objectArray[18] = IlIillIiilIi[47];
        objectArray[24] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[24] | (Integer)objectArray[18]) - ((Integer)objectArray[24] & (Integer)objectArray[18]);
        objectArray[18] = IlIillIiilIi[48];
        objectArray[24] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[24] | (Integer)objectArray[18]) - ((Integer)objectArray[24] & (Integer)objectArray[18]);
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[23] = IlIillIiilIi[49];
        objectArray[18] = IlIillIiilIi[50];
        objectArray[24] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[24] | (Integer)objectArray[18]) & ~((Integer)objectArray[24] & (Integer)objectArray[18]);
        objectArray[18] = IlIillIiilIi[51];
        objectArray[24] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[24] - ~((Integer)objectArray[18]).intValue() - 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        return (double)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("aa0cb383-8ff0-4483-9b1d-0165edb78bba", (Object)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("d80519f7-b79f-4e6f-a2d1-3c8536dcc7f5", (long)3415265294644395059L, (Object[])objectArray2, (String)"QnFlSURR", (int)IlIillIiilIi[52], (String)"kbLEutfNHTNmJDYgKmNMOCMlPBJWZVc4IA4mcTElPTV+Xy00MC8/eQ==", (int)IlIillIiilIi[53], (String)"2+XZ", (int)IlIillIiilIi[54], (int)IlIillIiilIi[55], (int)IlIillIiilIi[56], (String)"veXc19aeYl9cXmFPIS1CLi0sJipEJXU2ODk+X1wwP1M9fjZXOVUHBgUEAw8BAE1jAAwLBwkFGhZ4eR5QEX0SE3ARdhoUGGdrJ2ljbwxtYm5gYWZnZCoaGxh0cx8ccHITEHw=", (String)"3NWZ2uDfKiljYVpbW2IsFxUsPhEuKTN0ODYLOzcyKj5/WDsvBDEBbhA8Fg=="), (String)"M0xSN09B", (int)IlIillIiilIi[57], (String)"kr3SzuDMmyczJy9gQTcuJjkVU2ZC", (int)IlIillIiilIi[58], (String)"5t602OPP2C4=", (int)IlIillIiilIi[59], (int)IlIillIiilIi[60], (int)IlIillIiilIi[61], (String)"vuTb1tWfnV5fX2ZOIixNLy4tIStHJGo3Ozg5Xl8xMFI+fzFWOlQ4BwYFBA4CAUJiAw0MBgoEBRd7eBlREnwdEnMQcRsXGRhqJGhkbg9sbW9jYGFmZysFGht1dB4fcX0SE30=", (String)"39Se2+Pe1ShgYF1aWGMjFhYtORAtKCx1OzcMOjQzJT98WTwuBzA+bxM9EQ==");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void startGrab(Player player) {
        Object[] objectArray = new Object[34];
        objectArray[27] = IlIillIiilIi[204];
        objectArray[32] = IlIillIiilIi[205];
        objectArray[26] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[26] & ~((Integer)objectArray[32]).intValue()) - ((Integer)objectArray[26] ^ (Integer)objectArray[32]);
        objectArray[32] = IlIillIiilIi[206];
        objectArray[26] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[26] & ~((Integer)objectArray[32]).intValue() | ~((Integer)objectArray[26]).intValue() & (Integer)objectArray[32];
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[9] = IlIillIiilIi[207];
        objectArray[32] = IlIillIiilIi[208];
        objectArray[26] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[26] - ~((Integer)objectArray[32]).intValue() - 1;
        objectArray[32] = IlIillIiilIi[209];
        objectArray[26] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[26] & ~((Integer)objectArray[32]).intValue()) - (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[9]).intValue()] = this;
        objectArray[25] = IlIillIiilIi[210];
        objectArray[32] = IlIillIiilIi[211];
        objectArray[26] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[26] | (Integer)objectArray[32]) - ((Integer)objectArray[26] ^ (Integer)objectArray[32]);
        objectArray[32] = IlIillIiilIi[212];
        objectArray[26] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[26] | (Integer)objectArray[32]) - ((Integer)objectArray[26] ^ (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[25]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("115a7622-d15e-44a2-ba4d-6994a66f5d36", (long)-1787584392074961143L, (Object[])objectArray2, (String)"dWhjOXhJ", (int)IlIillIiilIi[213], (String)"hqfXt9jA7saR0cXd1Z6/zdTQzx9ZaEQtNxs1bC44LiBpSj45PyIMTA==", (int)IlIillIiilIi[214], (String)"zPDK", (int)IlIillIiilIi[215], (int)IlIillIiilIi[216], (int)IlIillIiilIi[217], (String)"qvDP2tmTkaqrq5Ky3tCx29rZ1SdLKGYjLywtQkMtLEYqayVaNlg0MzIxMDI+PX5WNzk4CgYICQNvbA1NDmABBmcEZRcbFRQeUBwQEnMQERsXFBVqaycJDg9hYAIDbWEGB2k=", (String)"y8CK1+/S2dyUlKmmpJ/f4uLZzRwhJCBhLyMYJigvOStoTSgiCzwyWycJJQ==");
        int n = (0x89621EF | 0xD0333111) - (0x89621EF & 0xD0333111);
        int cfr_ignored_0 = n + -801951471;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void lambda$startCooldown$2(UUID uUID) {
        Object[] objectArray = new Object[34];
        int n = (0xF3EAFF83 | 0xE361E086) - (0xF3EAFF83 & 0xE361E086);
        int cfr_ignored_0 = n + -480124794;
        objectArray[0] = IlIillIiilIi[389];
        objectArray[33] = IlIillIiilIi[390];
        objectArray[4] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[4] & ~((Integer)objectArray[33]).intValue()) - (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[33]);
        objectArray[33] = IlIillIiilIi[391];
        objectArray[4] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[4] & ~((Integer)objectArray[33]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[33];
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[24] = IlIillIiilIi[392];
        objectArray[33] = IlIillIiilIi[393];
        objectArray[4] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[4] & ~((Integer)objectArray[33]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[33];
        objectArray[33] = IlIillIiilIi[394];
        objectArray[4] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[4] ^ (Integer)objectArray[33]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[33]);
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        objectArray[5] = IlIillIiilIi[395];
        objectArray[33] = IlIillIiilIi[396];
        objectArray[4] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[4] - ~((Integer)objectArray[33]).intValue() - 1;
        objectArray[33] = IlIillIiilIi[397];
        objectArray[4] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[4] + ~((Integer)objectArray[33]).intValue() + 1;
        objectArray2[((Integer)objectArray[5]).intValue()] = uUID;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("8ec9c59a-405d-4411-8729-6e0643a1af94", (long)-2708449134462986224L, (Object[])objectArray2, (String)"M3ZXTkp2", (int)IlIillIiilIi[398], (String)"i6japM3X+9WMztjOwImq3tnfwuysn7HeyuTIn9vP29NkRTMqKjUZXw==", (int)IlIillIiilIi[399], (String)"wf/H", (int)31991970, (int)108, (int)-1505330977, (String)"p//CycyEhLm2tI+hy8ekyNfW2NS+35PQ0tPQsbba2bUnZChJI08hIC8uLSErKmtFOjY1OTM/PDBSUzB+O1c0NWoLaAQOAgENTQMNAWYHBAgaGxgZHlB8fXIeHXF2GhR1CmY=", (String)"xs+HxPrFzM+Ji7S1sYjK8e/WwO/U09WS0tzl1d3YzNhlQiUxHisnSDoWOA==");
        int n2 = (0x3D475BB6 | 0xB52AF25) - (0x3D475BB6 & 0xB52AF25);
        int cfr_ignored_1 = n2 + 189968165;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double throwForce() {
        if (IIlilIliiIli) {
            int n = (0x3380C123 | 0xEE2B7ABB) - (0x3380C123 & 0xEE2B7ABB);
        }
        Object[] objectArray = new Object[26];
        objectArray[5] = IlIillIiilIi[30];
        objectArray[9] = IlIillIiilIi[31];
        objectArray[16] = (int)((Integer)objectArray[5]);
        objectArray[5] = 2 * ((Integer)objectArray[16] | (Integer)objectArray[9]) - ((Integer)objectArray[16] ^ (Integer)objectArray[9]);
        objectArray[9] = IlIillIiilIi[32];
        objectArray[16] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[16] & ~((Integer)objectArray[9]).intValue()) - (~((Integer)objectArray[16]).intValue() & (Integer)objectArray[9]);
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[18] = IlIillIiilIi[33];
        objectArray[9] = IlIillIiilIi[34];
        objectArray[16] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[16] & ~((Integer)objectArray[9]).intValue()) - (~((Integer)objectArray[16]).intValue() & (Integer)objectArray[9]);
        objectArray[9] = IlIillIiilIi[35];
        objectArray[16] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[16] ^ (Integer)objectArray[9]) - 2 * (~((Integer)objectArray[16]).intValue() & (Integer)objectArray[9]);
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        return (double)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("6b8678aa-e29a-48f9-89e5-1f3b6d48a5e7", (Object)Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("9b8439ed-5b98-450a-8815-d789d11a4736", (long)3931717649166162201L, (Object[])objectArray2, (String)"MHhISTk1", (int)IlIillIiilIi[36], (String)"l7TGuCkzHzFgIjQiJG1OOiUjPhBIe1U6Jggkcz8rPzd4WS82DhE9ew==", (int)IlIillIiilIi[37], (String)"3ePb", (int)IlIillIiilIi[38], (int)IlIillIiilIi[39], (int)IlIillIiilIi[40], (String)"u+Pe1ShgYF1aWGNNLyNALCsqJChaO3c0Pj88XVI+PVE7eDRVB2sFBAMCAQ0PDk9hBgoJBRcbGBR+fxxSH3MQEXYXdBhqZmVpIW9hbQJjYGxmZ2RlejQYGR5ycR0SfnARFno=", (String)"2tOb2B4hKCtlZ1hZVWwuFRMqPBMwNzF2PjAJOTk8KDx5XjktOg8DbBY6FA=="), (String)"OVByS3lw", (int)IlIillIiilIi[41], (String)"kLvUzOIyZSUxISliQzkgJDsTVWRA", (int)IlIillIiilIi[42], (String)"5Niy2uExJiw=", (int)IlIillIiilIi[43], (int)IlIillIiilIi[44], (int)IlIillIiilIi[45], (String)"vOLd1NdhY1xdWWBMICJDLSwrJylFOnQ1OT4/XF0/PlA8eTdUOGoGBQQDAgwAD0xgAQsKBAgaGxV5fh9TEHITEHEWdxkVZ2ZoJm5ibA1iY21hZmdkZTUbGBlzchwdf3MQEXs=", (String)"3dKY2eEgKypiZltYWm0tFBQrPxIvNjJ3OTEKODY9Kz1+XzosBQ4AbRE7Fw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void startPull(Player player) {
        if (IIlilIliiIli) {
            int n;
            int n2 = n = (0x4D19BA3A | 0x806C8F1B) - (0x4D19BA3A & 0x806C8F1B);
            IiIiliIiiiIi = n2 + -2140369125 - (n2 & 0x806C8F1B) * 2;
        }
        Object[] objectArray = new Object[33];
        int n = (0x8643F253 | 0xBC277DF8) - (0x8643F253 & 0xBC277DF8);
        int cfr_ignored_0 = n + -1138262536;
        objectArray[5] = IlIillIiilIi[232];
        objectArray[26] = IlIillIiilIi[233];
        objectArray[22] = (int)((Integer)objectArray[5]);
        objectArray[5] = 2 * ((Integer)objectArray[22] & ~((Integer)objectArray[26]).intValue()) - ((Integer)objectArray[22] ^ (Integer)objectArray[26]);
        objectArray[26] = IlIillIiilIi[234];
        objectArray[22] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[22] | (Integer)objectArray[26]) + ((Integer)objectArray[22] & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[25] = IlIillIiilIi[235];
        objectArray[26] = IlIillIiilIi[236];
        objectArray[22] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[22] | (Integer)objectArray[26]) - ((Integer)objectArray[22] & (Integer)objectArray[26]);
        objectArray[26] = IlIillIiilIi[237];
        objectArray[22] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[22] - ~((Integer)objectArray[26]).intValue() - 1;
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        objectArray[23] = IlIillIiilIi[238];
        objectArray[26] = IlIillIiilIi[239];
        objectArray[22] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[22] | (Integer)objectArray[26]) & ~((Integer)objectArray[22] & (Integer)objectArray[26]);
        objectArray[26] = IlIillIiilIi[240];
        objectArray[22] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[22] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("8d25e330-b78a-427b-a5f3-019485af9022", (long)1675261008881596245L, (Object[])objectArray2, (String)"NmhyWTRk", (int)IlIillIiilIi[241], (String)"gKXVqcbC7MCX08fT25y9y9LSzeGnakYrMRk3YiA6LCZvSDwnISAOSg==", (int)IlIillIiilIi[242], (String)"yvLI", (int)IlIillIiilIi[243], (int)IlIillIiilIi[244], (int)IlIillIiilIi[245], (String)"rPLNxMeRk6ytqZC80NKz3dzb19m1KmQlKS4vTE0vLkAsaSdEKFo2NTQzMjwwP3xQMTs6NDgKCwVpbg9DAGIDAGEGZwkFFxYYVh4SHH0SEx0RFhcUFSULCAljYgwNb2MAAWs=", (String)"zcKIyfHQ29qSlquoqp3d5OTbz+LfJiJnKSEaKCYtOy1uTyo8FT4wXSELJw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIllIIliIIl(IliIlllilIi iliIlllilIi) {
        if (IIlilIliiIli) {
            int n = (0xA63CE268 | 0xFB5DDEE7) - (0xA63CE268 & 0xFB5DDEE7);
        }
        Object[] objectArray = new Object[28];
        objectArray[3] = IlIillIiilIi[0];
        objectArray[23] = IlIillIiilIi[1];
        objectArray[24] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[24] | (Integer)objectArray[23]) - ((Integer)objectArray[24] ^ (Integer)objectArray[23]);
        objectArray[23] = IlIillIiilIi[2];
        objectArray[24] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[24] | (Integer)objectArray[23]) - ((Integer)objectArray[24] & (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[0] = IlIillIiilIi[3];
        objectArray[23] = IlIillIiilIi[4];
        objectArray[24] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[24] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = IlIillIiilIi[5];
        objectArray[24] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[24] | (Integer)objectArray[23]) & ~((Integer)objectArray[24] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[0]).intValue()] = this;
        objectArray[26] = IlIillIiilIi[6];
        objectArray[23] = IlIillIiilIi[7];
        objectArray[24] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[24] | (Integer)objectArray[23]) - ((Integer)objectArray[24] & (Integer)objectArray[23]);
        objectArray[23] = IlIillIiilIi[8];
        objectArray[24] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[24] ^ (Integer)objectArray[23]) + 2 * ((Integer)objectArray[24] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[26]).intValue()] = iliIlllilIi;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("c84e80ae-ca3a-4e02-bade-2e00f0e9872e", (long)-6462513717883213917L, (Object[])objectArray2, (String)"TzAxV3lH", (int)IlIillIiilIi[9], (String)"lEk5RSo2GDRjLzsvJ2hJPyY+IQ1LflI/JQUrfjwuODJ7ZBALDRQ6fg==", (int)IlIillIiilIi[10], (String)"3h4k", (int)IlIillIiilIi[11], (int)IlIillIiilIi[12], (int)IlIillIiilIi[13], (String)"uB4hKCtlZ1hZVWxALCZHKSg3OzVZPnAxPTIzUFE7OlQ4RQtoBG4CAQAPDgAMC0hkBRcWGBQeHxF9chNfHHYXFHVqC2VpY2JsImJuYAFmZ2llent4eTEfHB1/fhARe3cUFUc=", (String)"2S5kJR0kLy5maldUVmkpEBA3Iw4zMjZzPT0GNDo5Lzl6YwYQOQoEaRU3Gw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDeath(PlayerDeathEvent playerDeathEvent) {
        if (IIlilIliiIli) {
            throw null;
        }
        Object[] objectArray = new Object[32];
        objectArray[29] = IlIillIiilIi[190];
        objectArray[12] = IlIillIiilIi[191];
        objectArray[11] = (int)((Integer)objectArray[29]);
        objectArray[29] = 2 * ((Integer)objectArray[11] | (Integer)objectArray[12]) - ((Integer)objectArray[11] ^ (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[192];
        objectArray[11] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[11] | (Integer)objectArray[12]) + ((Integer)objectArray[11] & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[29]).intValue()];
        objectArray[31] = IlIillIiilIi[193];
        objectArray[12] = IlIillIiilIi[194];
        objectArray[11] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[11] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[11] & (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[195];
        objectArray[11] = (int)((Integer)objectArray[31]);
        objectArray[31] = (Integer)objectArray[11] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray2[((Integer)objectArray[31]).intValue()] = this;
        objectArray[3] = IlIillIiilIi[196];
        objectArray[12] = IlIillIiilIi[197];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[11] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[11] ^ (Integer)objectArray[12]);
        objectArray[12] = IlIillIiilIi[198];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[11] | (Integer)objectArray[12]) - ((Integer)objectArray[11] ^ (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[3]).intValue()] = playerDeathEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("1b0586e8-c902-45b3-b484-3ab51de87faa", (long)556825833450355778L, (Object[])objectArray2, (String)"bWFBV0RZ", (int)IlIillIiilIi[199], (String)"habIttvB6ceS0Mrc1p+4zNfRMB5aaUMsNBo6bS05KSFqSyE4PCMLTQ==", (int)IlIillIiilIi[200], (String)"z/HV", (int)IlIillIiilIi[201], (int)IlIillIiilIi[202], (int)IlIillIiilIi[203], (String)"qfHQ29qSlquoqp2z3dG22tnYKiZIKWEiLC0iQ0AsK0cpajpbNVkzMjEwPzM9PHlXNDgHCwUJDgJsbQJMDWEGB2QFehYYFBMfUx0fE3ARFhoUFWpraCYODwxgbwMAbGYHBGg=", (String)"yMGV1uzT3t2Xlaanp57Y4+HYMh0iJSdgLCIXJysuPiprTDcjCD01WiQIKg==");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String lliIliliIl(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x55576C7 | 0x6E619635) - (0x55576C7 & 0x6E619635);
        IiIiliIiiiIi = n4 + 1851889205 - (n4 & 0x6E619635) * 2;
        if (355445317 <= IiIiliIiiiIi) {
            int n5 = n3 = (0x60 | 0x6E619635) - (0x60 & 0x6E619635);
            int cfr_ignored_0 = n5 + 1851889205 - (n5 & 0x6E619635) * 2;
        }
        Object[] objectArray = new Object[6];
        objectArray[1] = Base64.getDecoder().decode(string);
        int n6 = (0x88A400B8 | 0xD10A415C) - (0x88A400B8 & 0xD10A415C);
        int cfr_ignored_1 = n6 + -787857060;
        objectArray[4] = 0;
        while ((Integer)objectArray[4] < ((byte[])objectArray[1]).length) {
            byte[] byArray = (byte[])objectArray[1];
            int n7 = (Integer)objectArray[4];
            objectArray[2] = (int)((Integer)objectArray[4]);
            objectArray[5] = n;
            objectArray[2] = ((Integer)objectArray[5] ^ (Integer)objectArray[2]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[2]);
            objectArray[5] = (int)byArray[n7];
            objectArray[2] = n2;
            objectArray[5] = ((Integer)objectArray[5] | (Integer)objectArray[2]) - ((Integer)objectArray[5] & (Integer)objectArray[2]);
            byArray[n7] = (byte)((Integer)objectArray[5] + ~((Integer)objectArray[2]).intValue() + 1);
            objectArray[4] = (Integer)objectArray[4] + 1;
        }
        try {
            return new String((byte[])objectArray[1], StandardCharsets.UTF_8);
        }
        catch (InstantiationError instantiationError) {
            throw instantiationError;
        }
        catch (UnknownError unknownError) {
            throw unknownError;
        }
    }

    /*
     * Exception decompiling
     */
    public static String lilIliilIl(String var0) {
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
    private void cleanupGrabber(UUID uUID) {
        int n;
        int n2 = n = (0x1B47801 | 0x28A8B1F0) - (0x1B47801 & 0x28A8B1F0);
        IiIiliIiiiIi = n2 + 682144240 - (n2 & 0x28A8B1F0) * 2;
        if (131614282 <= IiIiliIiiiIi) {
            int cfr_ignored_0 = 31 + 25;
        }
        Object[] objectArray = new Object[30];
        objectArray[16] = IlIillIiilIi[350];
        objectArray[22] = IlIillIiilIi[351];
        objectArray[6] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[6] + ~((Integer)objectArray[22]).intValue() + 1;
        objectArray[22] = IlIillIiilIi[352];
        objectArray[6] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[6] | (Integer)objectArray[22]) + ((Integer)objectArray[6] & (Integer)objectArray[22]);
        Object[] objectArray2 = new Object[((Integer)objectArray[16]).intValue()];
        objectArray[3] = IlIillIiilIi[353];
        objectArray[22] = IlIillIiilIi[354];
        objectArray[6] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[6] ^ (Integer)objectArray[22]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray[22] = IlIillIiilIi[355];
        objectArray[6] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[6] - ~((Integer)objectArray[22]).intValue() - 1;
        objectArray2[((Integer)objectArray[3]).intValue()] = this;
        objectArray[15] = IlIillIiilIi[356];
        objectArray[22] = IlIillIiilIi[357];
        objectArray[6] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[6] | (Integer)objectArray[22]) & ~((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray[22] = IlIillIiilIi[358];
        objectArray[6] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[6] | (Integer)objectArray[22]) - ((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray2[((Integer)objectArray[15]).intValue()] = uUID;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("9aeca625-f64a-46cc-881d-739be0b9241e", (long)-1991861339130714096L, (Object[])objectArray2, (String)"VGFrQ1kz", (int)IlIillIiilIi[359], (String)"iK3doc7a9NiPy9/Lw5S1w9raxemvkr7TyeHPmtgyJC5nQDQvKTgWUg==", (int)IlIillIiilIi[360], (String)"wvrA", (int)IlIillIiilIi[361], (int)IlIillIiilIi[362], (int)IlIillIiilIi[363], (String)"pPrFzM+Ji7S1sYikyNq71dTT39G90pzd0dbXtLUnJkgkYS9MIEIuLSwrKiQoN3RYOTMyPDAyMz1RVjd7OGoLCGkObwENDw4ATgYKBGUaGxUZHh8cHV1zcHEbGnR1Z2sICWM=", (String)"xcqAwfnIw8KKjrOwspXV7OzTx+rX3tqf0dni0N4lMyVmRyI0HSYoRTkTPw==");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent playerJoinEvent) {
        Object[] objectArray = new Object[32];
        objectArray[26] = IlIillIiilIi[162];
        objectArray[7] = IlIillIiilIi[163];
        objectArray[5] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[5] ^ (Integer)objectArray[7]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[7]);
        objectArray[7] = IlIillIiilIi[164];
        objectArray[5] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[5] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[7]);
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[15] = IlIillIiilIi[165];
        objectArray[7] = IlIillIiilIi[166];
        objectArray[5] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[5] + ~((Integer)objectArray[7]).intValue() + 1;
        objectArray[7] = IlIillIiilIi[167];
        objectArray[5] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[5] | (Integer)objectArray[7]) & ~((Integer)objectArray[5] & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[18] = IlIillIiilIi[168];
        objectArray[7] = IlIillIiilIi[169];
        objectArray[5] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[5] | (Integer)objectArray[7]) & ~((Integer)objectArray[5] & (Integer)objectArray[7]);
        objectArray[7] = IlIillIiilIi[170];
        objectArray[5] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[5] | (Integer)objectArray[7]) - ((Integer)objectArray[5] & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[18]).intValue()] = playerJoinEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("8cda8da0-db41-481e-b3dd-0231923a28cd", (long)4502269763969874960L, (Object[])objectArray2, (String)"UmVTMERa", (int)IlIillIiilIi[171], (String)"m7jKtN3H68Wc3sje0Jm6zikvMhxcb0EuOhQ4bys/KyN0VSM6OiUJTw==", (int)IlIillIiilIi[172], (String)"0e/X", (int)IlIillIiilIi[173], (int)IlIillIiilIi[174], (int)IlIillIiilIi[175], (String)"t+/S2dyUlKmmpJ+x29e02CcmKCROL2MgIiMgQUYqKUU3dDhZM18xMD8+PTE7OntVCgYFCQMPDABiYwBOC2cEBXobeBQeEhEdXRMdEXYXFBhqa2hpbiAMDQJubQEGamQFGnY=", (String)"1t+X1OrV3N+Zm6SloZja4R8mMB8kIyViIiwVJS0oPCh1UjUhDjs3WCoGKA==");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void onCapturedDamage(EntityDamageEvent entityDamageEvent) {
        if (IIlilIliiIli) {
            throw null;
        }
        Object[] objectArray = new Object[30];
        objectArray[13] = IlIillIiilIi[148];
        objectArray[26] = IlIillIiilIi[149];
        objectArray[25] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[25] | (Integer)objectArray[26]) & ~((Integer)objectArray[25] & (Integer)objectArray[26]);
        objectArray[26] = IlIillIiilIi[150];
        objectArray[25] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[28] = IlIillIiilIi[151];
        objectArray[26] = IlIillIiilIi[152];
        objectArray[25] = (int)((Integer)objectArray[28]);
        objectArray[28] = (Integer)objectArray[25] - ~((Integer)objectArray[26]).intValue() - 1;
        objectArray[26] = IlIillIiilIi[153];
        objectArray[25] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[25] ^ (Integer)objectArray[26]) - 2 * (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[28]).intValue()] = this;
        objectArray[6] = IlIillIiilIi[154];
        objectArray[26] = IlIillIiilIi[155];
        objectArray[25] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[25] | (Integer)objectArray[26]) & (~((Integer)objectArray[25]).intValue() | ~((Integer)objectArray[26]).intValue());
        objectArray[26] = IlIillIiilIi[156];
        objectArray[25] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[25] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[6]).intValue()] = entityDamageEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("a0b45229-49c8-46c1-9ec1-ca90fbf58735", (long)7896683636928755671L, (Object[])objectArray2, (String)"S0dLTGJy", (int)IlIillIiilIi[157], (String)"mrvLs9zE6sqd3cnZ0Zq7MSgsMxtdbEAhOxc5aCo8Kjx1ViI9OyYIQA==", (int)IlIillIiilIi[158], (String)"0OzW", (int)IlIillIiilIi[159], (int)IlIillIiilIi[160], (int)IlIillIiilIi[161], (String)"tuzT3t2Xlaanp5622tS1JyYlKSNPLGIvIyAhRkcpKFo2dzleMlwwPz49PDY6OXpqCwUEDgIMDQ9jYAFJCmQFGnsYeRMfERASXBAcFncUFWdraGlubyMNAgNtbAYHaWUaG3U=", (String)"19yW0+vW3dCYmKWioJvbHh4lMRglICRtIy8UIiwrPTd0UTQmDzg2VysFKQ==");
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void onAttack(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        Object[] objectArray = new Object[31];
        objectArray[23] = IlIillIiilIi[120];
        objectArray[4] = IlIillIiilIi[121];
        objectArray[15] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[15] + ~((Integer)objectArray[4]).intValue() + 1;
        objectArray[4] = IlIillIiilIi[122];
        objectArray[15] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[15] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[15]).intValue() & (Integer)objectArray[4];
        Object[] objectArray2 = new Object[((Integer)objectArray[23]).intValue()];
        objectArray[12] = IlIillIiilIi[123];
        objectArray[4] = IlIillIiilIi[124];
        objectArray[15] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[15] | (Integer)objectArray[4]) - ((Integer)objectArray[15] & (Integer)objectArray[4]);
        objectArray[4] = IlIillIiilIi[125];
        objectArray[15] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[15] - ~((Integer)objectArray[4]).intValue() - 1;
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        objectArray[2] = IlIillIiilIi[126];
        objectArray[4] = IlIillIiilIi[127];
        objectArray[15] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[15] | (Integer)objectArray[4]) + ((Integer)objectArray[15] & (Integer)objectArray[4]);
        objectArray[4] = IlIillIiilIi[128];
        objectArray[15] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[15] | (Integer)objectArray[4]) - ((Integer)objectArray[15] ^ (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[2]).intValue()] = entityDamageByEntityEvent;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("0290b2d4-d3d3-4881-b238-e723386b6af5", (long)9004064005529371881L, (Object[])objectArray2, (String)"OVU0OVVZ", (int)IlIillIiilIi[129], (String)"mL3Nsd7K5Mif28/b02RFMyoqNRlfYk4jORE/aigiND53UCQ/OSgGQg==", (int)IlIillIiilIi[130], (String)"0urQ", (int)IlIillIiilIi[131], (int)IlIillIiilIi[132], (int)IlIillIiilIi[133], (String)"tOrV3N+Zm6SloZi02CpLJSQjLyFNImwtISYnREU3Nlg0cT9cMFI+PTw7OjQ4B0RoCQMCDAACAw1hZgdLCHobGHkefxEdHx4QXhYaFHVqa2Vpbm9sbS0DAAFragQFd3sYGXM=", (String)"1dqQ0enY09KanqOgomUlHBwjNxonLipvISkSIC41IzV2VzIkDTY4VSkDLw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void freeVictim(Player player, UUID uUID) {
        if (IIlilIliiIli) {
            int n;
            int n2 = n = (0x818A472E | 0x4D77C6FF) - (0x818A472E & 0x4D77C6FF);
            IiIiliIiiiIi = n2 + 1299695359 - (n2 & 0x4D77C6FF) * 2;
        }
        Object[] objectArray = new Object[33];
        objectArray[25] = IlIillIiilIi[263];
        objectArray[21] = IlIillIiilIi[264];
        objectArray[8] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[8] ^ (Integer)objectArray[21]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[21]);
        objectArray[21] = IlIillIiilIi[265];
        objectArray[8] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[8] ^ (Integer)objectArray[21]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[25]).intValue()];
        objectArray[31] = IlIillIiilIi[266];
        objectArray[21] = IlIillIiilIi[267];
        objectArray[8] = (int)((Integer)objectArray[31]);
        objectArray[31] = (Integer)objectArray[8] & ~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[8]).intValue() & (Integer)objectArray[21];
        objectArray[21] = IlIillIiilIi[268];
        objectArray[8] = (int)((Integer)objectArray[31]);
        objectArray[31] = (Integer)objectArray[8] + ~((Integer)objectArray[21]).intValue() + 1;
        objectArray2[((Integer)objectArray[31]).intValue()] = this;
        objectArray[28] = IlIillIiilIi[269];
        objectArray[21] = IlIillIiilIi[270];
        objectArray[8] = (int)((Integer)objectArray[28]);
        objectArray[28] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[21]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[21]);
        objectArray[21] = IlIillIiilIi[271];
        objectArray[8] = (int)((Integer)objectArray[28]);
        objectArray[28] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[21]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[28]).intValue()] = player;
        objectArray[26] = IlIillIiilIi[272];
        objectArray[21] = IlIillIiilIi[273];
        objectArray[8] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[8] ^ (Integer)objectArray[21]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[21]);
        objectArray[21] = IlIillIiilIi[274];
        objectArray[8] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[8] ^ (Integer)objectArray[21]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[26]).intValue()] = uUID;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("a1e39265-03e6-40e4-b7ce-59b4244afc79", (long)1724393107375878383L, (Object[])objectArray2, (String)"MjJtclVp", (int)IlIillIiilIi[275], (String)"gqPTq8Tc8sKV1cHR2ZKzydDUy+OllLgpMx8xYCI0IiRtTjolIz4QSA==", (int)IlIillIiilIi[276], (String)"yPTO", (int)IlIillIiilIi[277], (int)IlIillIiilIi[278], (int)IlIillIiilIi[279], (String)"rvTLxsWPja6vr5a+0ty9397d0du31JonKygpTk8hIEIubyFGKkQoNzY1ND4yMXJSMz08Njo0NQdraAlBAmwNAmMAYQsHCQgaVBgUHn8cHR8TEBEWF1t1CgtlZA4PYW0CA20=", (String)"z8SOy/POxdiQkK2qqJPT5ubdyeDd2NxlKyccKiQjNS9sSSw+FyAuXyMNIQ==");
        int n = (0xA4B0D645 | 0x11B00A3F) - (0xA4B0D645 & 0x11B00A3F);
        int cfr_ignored_0 = n + 296749631;
    }

    /*
     * Exception decompiling
     */
    public static Class illIlIilIl(String var0) {
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
    public static MethodHandle iIiIlIliIl(String var0, int var1_1, String var2_2, int var3_3, String var4_4, int var5_5, int var6_6, int var7_7, String var8_8, String var9_9) {
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

    private void throwVictim(Player player) {
        Object[] objectArray = new Object[31];
        objectArray[30] = IlIillIiilIi[218];
        objectArray[22] = IlIillIiilIi[219];
        objectArray[7] = (int)((Integer)objectArray[30]);
        objectArray[30] = 2 * ((Integer)objectArray[7] | (Integer)objectArray[22]) - ((Integer)objectArray[7] ^ (Integer)objectArray[22]);
        objectArray[22] = IlIillIiilIi[220];
        objectArray[7] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[7] & ~((Integer)objectArray[22]).intValue()) - (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[22]);
        Object[] objectArray2 = new Object[((Integer)objectArray[30]).intValue()];
        objectArray[13] = IlIillIiilIi[221];
        objectArray[22] = IlIillIiilIi[222];
        objectArray[7] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[7] | (Integer)objectArray[22]) & (~((Integer)objectArray[7]).intValue() | ~((Integer)objectArray[22]).intValue());
        objectArray[22] = IlIillIiilIi[223];
        objectArray[7] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[7] & ~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[7]).intValue() & (Integer)objectArray[22];
        objectArray2[((Integer)objectArray[13]).intValue()] = this;
        objectArray[11] = IlIillIiilIi[224];
        objectArray[22] = IlIillIiilIi[225];
        objectArray[7] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[7] | (Integer)objectArray[22]) & ~((Integer)objectArray[7] & (Integer)objectArray[22]);
        objectArray[22] = IlIillIiilIi[226];
        objectArray[7] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[7] | (Integer)objectArray[22]) & (~((Integer)objectArray[7]).intValue() | ~((Integer)objectArray[22]).intValue());
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii.IIIllIIliIIl.IIiIllIiIl("7fceb7ef-e830-48fa-a2d4-42c36465836e", (long)-755745580348776282L, (Object[])objectArray2, (String)"OFNJYUVr", (int)IlIillIiilIi[227], (String)"h6TWqNnD78GQ0sTS1J2+ytXTzuBYa0UqNhg0Yy87LydoST8mPiENSw==", (int)IlIillIiilIi[228], (String)"zfPL", (int)IlIillIiilIi[229], (int)IlIillIiilIi[230], (int)IlIillIiilIi[231], (String)"q/POxdiQkK2qqJO939Ow3Nva1NhKK2ckLi8sTUIuLUEraCRFN1s1NDMyMT0/Pn9RNjo5NQcLCARubwxCD2MAAWYHZAgaFhUZUR8RHXITEBwWFxQVaiQICQ5iYQ0CbmABBmo=", (String)"ysOLyO7R2NuVl6ippZze5ePazOMgJyFmLiAZKSksOCxpTik9Cj8zXCYKJA==");
    }
}

