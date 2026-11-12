/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 *  org.bukkit.event.entity.PlayerDeathEvent
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.inventory.InventoryDragEvent
 *  org.bukkit.event.player.PlayerDropItemEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.event.player.PlayerRespawnEvent
 *  org.bukkit.inventory.ItemStack
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public final class Iliilliiilii
implements Listener {
    private Set<UUID> IilliliilIIi;
    public static int[] IIIllIIliIIl;
    private static MiniMessage IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> iliIiiliiiii;
    private static int liiiIIllIl;
    private IliIlllilIi iIlIlllllill;
    public static int IlIlllIlilIl;
    public static boolean IiIlliIliiIl;

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onHit(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        int n;
        int n2 = n = (0xAD137B2 | 0x1E2F580B) - (0xAD137B2 & 0x1E2F580B);
        IlIlllIlilIl = n2 + 506419211 - (n2 & 0x1E2F580B) * 2;
        if (2057880937 < IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[31];
        objectArray[30] = IIIllIIliIIl[98];
        objectArray[29] = IIIllIIliIIl[99];
        objectArray[13] = (int)((Integer)objectArray[30]);
        objectArray[30] = (Integer)objectArray[13] & ~((Integer)objectArray[29]).intValue() | ~((Integer)objectArray[13]).intValue() & (Integer)objectArray[29];
        objectArray[29] = IIIllIIliIIl[100];
        objectArray[13] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[13] ^ (Integer)objectArray[29]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[29]);
        Object[] objectArray2 = new Object[((Integer)objectArray[30]).intValue()];
        objectArray[21] = IIIllIIliIIl[101];
        objectArray[29] = IIIllIIliIIl[102];
        objectArray[13] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[13] | (Integer)objectArray[29]) + ((Integer)objectArray[13] & (Integer)objectArray[29]);
        objectArray[29] = IIIllIIliIIl[103];
        objectArray[13] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[13] ^ (Integer)objectArray[29]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[29]);
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[22] = IIIllIIliIIl[104];
        objectArray[29] = IIIllIIliIIl[105];
        objectArray[13] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[13] | (Integer)objectArray[29]) & (~((Integer)objectArray[13]).intValue() | ~((Integer)objectArray[29]).intValue());
        objectArray[29] = IIIllIIliIIl[106];
        objectArray[13] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[13] | (Integer)objectArray[29]) + ((Integer)objectArray[13] & (Integer)objectArray[29]);
        objectArray2[((Integer)objectArray[22]).intValue()] = entityDamageByEntityEvent;
        Iliilliiilii.IIIIllIIIl("3d9daa39-510c-474d-893e-ceef8cef59c7", (long)8147622424525401030L, (Object[])objectArray2, (String)"WYF+d3xERD9KTDFPbXFUcImKiIxqiUWIfn2AX2J+f2NZHFh3VXlXWFFSU09NTg1zZmprZ2VpbGh+fWAiXYFkYxY1GDw6Njc7cy0zLxIxNDBGRUhHSogsSD49Q0RCQURAFhU=", (String)"ajl1blA1", (int)IIIllIIliIIl[107], (String)"enE5fH6DfHlHRUxLRzBuh3GKgHF0hXNGfoR7i3uAjIAbfltPak1hcFZqWA==", (int)IIIllIIliIIl[108], (String)"NVhmXHtxfXM0cnhyeC9OeoeBfnQ8SWeKhnyIQX2JfYUce01WTlNfKQ==", (String)"f4F5", (int)IIIllIIliIIl[109], (int)IIIllIIliIIl[110], (int)IIIllIIliIIl[111]);
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent playerDropItemEvent) {
        Object[] objectArray = new Object[28];
        objectArray[4] = IIIllIIliIIl[70];
        objectArray[1] = IIIllIIliIIl[71];
        objectArray[13] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[13] | (Integer)objectArray[1]) & ~((Integer)objectArray[13] & (Integer)objectArray[1]);
        objectArray[1] = IIIllIIliIIl[72];
        objectArray[13] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[13] + ~((Integer)objectArray[1]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[24] = IIIllIIliIIl[73];
        objectArray[1] = IIIllIIliIIl[74];
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[13] | (Integer)objectArray[1]) & ~((Integer)objectArray[13] & (Integer)objectArray[1]);
        objectArray[1] = IIIllIIliIIl[75];
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[13] | (Integer)objectArray[1]) - ((Integer)objectArray[13] ^ (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        objectArray[7] = IIIllIIliIIl[76];
        objectArray[1] = IIIllIIliIIl[77];
        objectArray[13] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[13] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[13]).intValue() & (Integer)objectArray[1];
        objectArray[1] = IIIllIIliIIl[78];
        objectArray[13] = (int)((Integer)objectArray[7]);
        objectArray[7] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[7]).intValue()] = playerDropItemEvent;
        Iliilliiilii.IIIIllIIIl("0ea48027-0aa8-46c0-97c2-fd9dfafdf552", (long)3565210200663529085L, (Object[])objectArray2, (String)"W4OAeX5GRkFMTjNRb3NWcouMio5si0eKgH+CYWSAgWVbHlp5V3tZWlNUVVFPUA91aGxtaWdrbmqAf2IkX4NmZRg3Gj48ODk9dS81MRQzNjJIR0pJTIouSkA/RUZEQ0ZCGBc=", (String)"VEdieUVw", (int)IIIllIIliIIl[79], (String)"fHM7foCFfntJR05NSTJwiXOMgnN2h3VIgIZ9jX2CjoIdgF1RbE9jclhsWg==", (int)IIIllIIliIIl[80], (String)"N1poXn1zf3U2dHp0ejFQfImDgHY+S2mMiH6KQ3+Lf4cefU9YUFVhKw==", (String)"gYN7", (int)IIIllIIliIIl[81], (int)IIIllIIliIIl[82], (int)IIIllIIliIIl[83]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0xE1516F | 0xB08A1CC) - (0xE1516F & 0xB08A1CC);
        if (2622791 >= n2 + 185115084 - (n2 & 0xB08A1CC) * 2) {
            int n3 = n = (0x20 | 0xB08A1CC) - (0x20 & 0xB08A1CC);
            int cfr_ignored_0 = n3 + 185115084 - (n3 & 0xB08A1CC) * 2;
        }
        Object[] objectArray = new Object[27];
        Iliilliiilii.IiIIlliIIl();
        objectArray[20] = IIIllIIliIIl[320];
        objectArray[12] = IIIllIIliIIl[321];
        objectArray[5] = (int)((Integer)objectArray[20]);
        objectArray[20] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[12]);
        objectArray[12] = IIIllIIliIIl[322];
        objectArray[5] = (int)((Integer)objectArray[20]);
        int n4 = (0xAC927B8D | 0x963AC9D7) - (0xAC927B8D & 0x963AC9D7);
        block3: while (true) {
            int n5 = n4;
            switch (n5 + -1774532137 - (n5 & 0x963AC9D7) * 2) {
                default: {
                    objectArray[20] = ((Integer)objectArray[5] & ~((Integer)objectArray[12]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[12]);
                    Iliilliiilii.IIIIllIIIl("a53f2fde-a717-49cc-ab6b-d20f7b2d0cf3", (int)((Integer)objectArray[20]), (String)"YIiFfoNLS0ZRUzhWdHhbd5CRj5NxkEyPhYSHZmmFhmpgI19+XIBeX1hZWlZUVRR6bXFybmxwc2+FhGcpZIhrah08H0NBPT5CejQ6Nhk4OzdNTE9OUY8zT0VESktJSEtHHRw=", (String)"Q3lOTWlx", (int)IIIllIIliIIl[323], (String)"YIiFfoNLS0ZRUzhWdHhbd5CRj5NxkEyPhYSHZmmFhmpgI19+XIBeX1hZWlZUVRR6bXFybmxwc2+FhGcpZIhrah08H0NBPT5CejQ6Nhk4OzdNTE9OUY8zT0VESktJSEtHHRw=", (int)IIIllIIliIIl[324], (String)"XQ==", (String)"gHx/fmFgfn9VeQ==", (int)IIIllIIliIIl[325], (int)IIIllIIliIIl[326], (int)IIIllIIliIIl[327]);
                    n4 = (0x3E431666 | 0x963AC9D7) - (0x3E431666 & 0x963AC9D7);
                    continue block3;
                }
                case 1044584038: 
            }
            break;
        }
        Iliilliiilii.IIIIllIIIl("edf58c8b-cc0c-4b0f-b28d-a407f354830f", Iliilliiilii.class, (String)"YoqHgIVNTUhTVTpYdnpdeZKTkZVzkk6Rh4aJaGuHiGxiJWGAXoJgYVpbXFhWVxZ8b3N0cG5ydXGHhmkrZoptbB8+IUVDP0BEfDY8OBs6PTlPTlFQU5E1UUdGTE1LSk1JHx4=", (String)"VFpkazVw", (int)IIIllIIliIIl[328], (String)"g3pChYeMhYJQTlVUUDl3kHqTiXp9jnxPh42ElISJlYkkh2RYc1ZqeV9zYQ==", (int)IIIllIIliIIl[329], (String)"PmN+eIh6P4F/fYM6ZXeFknlAUVs=", (String)"goR5fWh+", (int)IIIllIIliIIl[330], (int)IIIllIIliIIl[331], (int)IIIllIIliIIl[332]);
        objectArray[2] = IIIllIIliIIl[333];
        objectArray[12] = IIIllIIliIIl[334];
        objectArray[5] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[5] | (Integer)objectArray[12]) & ~((Integer)objectArray[5] & (Integer)objectArray[12]);
        objectArray[12] = IIIllIIliIIl[335];
        objectArray[5] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[5] | (Integer)objectArray[12]) + ((Integer)objectArray[5] & (Integer)objectArray[12]);
        Iliilliiilii.IIIIllIIIl("cc1ae4c7-2f79-460e-8642-bb37529e472d", (long)-8096879898946507158L, (Object[])new Object[((Integer)objectArray[2]).intValue()], (String)"Y4uIgYZOTklUVjtZd3teepOUkpZ0k0+SiIeKaWyIiW1jJmKBX4NhYltcXVlXWBd9cHR1cW9zdnKIh2osZ4tubSA/IkZEQEFFfTc9ORw7PjpQT1JRVJI2UkhHTU5MS05KIB8=", (String)"azJNcDJ6", (int)IIIllIIliIIl[336], (String)"hHtDhoiNhoNRT1ZVUTp4kXuUint+j31QiI6FlYWKlooliGVZdFdremB0Yg==", (int)IIIllIIliIIl[337], (String)"P2JwZoV7h30+fIJ8gjlYhJGLiH5GU3GUkIaSS4eTh48mhVdgWF1pMw==", (String)"iYuD", (int)IIIllIIliIIl[338], (int)IIIllIIliIIl[339], (int)IIIllIIliIIl[340]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean isEnabled() {
        if (IiIlliIliiIl) {
        }
        Object[] objectArray = new Object[27];
        int n = (0xB663B4A0 | 0x7544B499) - (0xB663B4A0 & 0x7544B499);
        int cfr_ignored_0 = n + 1967436953;
        objectArray[17] = IIIllIIliIIl[204];
        objectArray[16] = IIIllIIliIIl[205];
        objectArray[12] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[12] + ~((Integer)objectArray[16]).intValue() + 1;
        objectArray[16] = IIIllIIliIIl[206];
        objectArray[12] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[16]) - ((Integer)objectArray[12] ^ (Integer)objectArray[16]);
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[25] = IIIllIIliIIl[207];
        objectArray[16] = IIIllIIliIIl[208];
        objectArray[12] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[12] & ~((Integer)objectArray[16]).intValue()) - ((Integer)objectArray[12] ^ (Integer)objectArray[16]);
        objectArray[16] = IIIllIIliIIl[209];
        objectArray[12] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[12] ^ (Integer)objectArray[16]) + 2 * ((Integer)objectArray[12] & (Integer)objectArray[16]);
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        return (boolean)Iliilliiilii.IIIIllIIIl("e523cb1a-8cca-4bb0-8359-f83f646c1c89", (Object)Iliilliiilii.IIIIllIIIl("d18bbf13-443a-481c-b6db-062eeed4d7b0", (long)4216984330386223493L, (Object[])objectArray2, (String)"UXl2b3Q8PDdCRClHZWlMaIGCgIRigT2AdnV4V1p2d1tRFFBvTXFPUElKS0dFRgVrXmJjX11hZGB2dVgaVXlcWw4tEDQyLi8zayUrJwopLCg+PUA/QoAkQDY1Ozw6OTw4Dg0=", (String)"R21UNlMw", (int)IIIllIIliIIl[210], (String)"cmkxdHZ7dHE/PURDPyhmf2mCeGlsfWs+dnxzg3N4hHgTdlNHYkVZaE5iUA==", (int)IIIllIIliIIl[211], (String)"LVBeVHNpdWssanBqcCdGcn95dmw0QV+CfnSAOXWBdX0Uc0VORktXIQ==", (String)"d3lx", (int)IIIllIIliIIl[212], (int)IIIllIIliIIl[213], (int)IIIllIIliIIl[214]), (String)"Zo6LhIlRUUxXWT5cen5hfZaXlZl3llKVi4qNbG+LjHBmKWWEYoZkZV5fYFxaWxqAc3d4dHJ2eXWLim0vao5xcCNCJUlHQ0RIgDpAPB8+QT1TUlVUV5U5VUtKUFFPTlFNIyI=", (String)"OEZRazNh", (int)IIIllIIliIIl[215], (String)"h35GiYuQiYZUUllYVD17lH6XjX6BkoBTi5GImIiNmY0oi2hcd1pufWN3ZQ==", (int)IIIllIIliIIl[216], (String)"QmeCfIx+Q4WDgYc+XYl+hI1/Q1R3", (String)"johlh4o=", (int)IIIllIIliIIl[217], (int)IIIllIIliIIl[218], (int)IIIllIIliIIl[219]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void tickTracking() {
        if (IiIlliIliiIl) {
            int n;
            int n2 = n = (0x51 | 0x50D92913) - (0x51 & 0x50D92913);
            int cfr_ignored_0 = n2 + 1356409107 - (n2 & 0x50D92913) * 2;
        }
        Object[] objectArray = new Object[37];
        objectArray[18] = IIIllIIliIIl[157];
        objectArray[19] = IIIllIIliIIl[158];
        objectArray[9] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[9] & ~((Integer)objectArray[19]).intValue()) - ((Integer)objectArray[9] ^ (Integer)objectArray[19]);
        objectArray[19] = IIIllIIliIIl[159];
        objectArray[9] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[9] | (Integer)objectArray[19]) + ((Integer)objectArray[9] & (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[25] = IIIllIIliIIl[160];
        objectArray[19] = IIIllIIliIIl[161];
        objectArray[9] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[9] | (Integer)objectArray[19]) & (~((Integer)objectArray[9]).intValue() | ~((Integer)objectArray[19]).intValue());
        objectArray[19] = IIIllIIliIIl[162];
        objectArray[9] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[9] + ~((Integer)objectArray[19]).intValue() + 1;
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        Iliilliiilii.IIIIllIIIl("b29b7a74-cd1a-4d81-bb45-d6c89ebf07f7", (long)3916018322619836708L, (Object[])objectArray2, (String)"TXVya3A4ODM+QCVDYWVIZH1+fIBefTl8cnF0U1Zyc1dNEExrSW1LTEVGR0NBQgFnWl5fW1ldYFxycVQWUXVYVwopDDAuKisvZyEnIwYlKCQ6OTw7PnwgPDIxNzg2NTg0Cgk=", (String)"U1NJMmU5", (int)IIIllIIliIIl[163], (String)"bmUtcHJ3cG07OUA/OyRie2V+dGVoeWc6cnhvf290gHQPck9DXkFVZEpeTA==", (int)IIIllIIliIIl[164], (String)"KUxaUG9lcWcoZmxmbCNCbnt1cmgwPVt+enB8NXF9cXkQb0FKQkdTHQ==", (String)"c3Vt", (int)IIIllIIliIIl[165], (int)IIIllIIliIIl[166], (int)IIIllIIliIIl[167]);
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent inventoryDragEvent) {
        Object[] objectArray = new Object[31];
        objectArray[8] = IIIllIIliIIl[126];
        objectArray[9] = IIIllIIliIIl[127];
        objectArray[7] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[7] & ~((Integer)objectArray[9]).intValue() | ~((Integer)objectArray[7]).intValue() & (Integer)objectArray[9];
        objectArray[9] = IIIllIIliIIl[128];
        objectArray[7] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[7] | (Integer)objectArray[9]) & ~((Integer)objectArray[7] & (Integer)objectArray[9]);
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[29] = IIIllIIliIIl[129];
        objectArray[9] = IIIllIIliIIl[130];
        objectArray[7] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[7] - ~((Integer)objectArray[9]).intValue() - 1;
        objectArray[9] = IIIllIIliIIl[131];
        objectArray[7] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[7] ^ (Integer)objectArray[9]) - 2 * (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[9]);
        objectArray2[((Integer)objectArray[29]).intValue()] = this;
        objectArray[14] = IIIllIIliIIl[132];
        objectArray[9] = IIIllIIliIIl[133];
        objectArray[7] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[7] | (Integer)objectArray[9]) & (~((Integer)objectArray[7]).intValue() | ~((Integer)objectArray[9]).intValue());
        objectArray[9] = IIIllIIliIIl[134];
        objectArray[7] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[7] + ~((Integer)objectArray[9]).intValue() + 1;
        objectArray2[((Integer)objectArray[14]).intValue()] = inventoryDragEvent;
        Iliilliiilii.IIIIllIIIl("9191412f-4994-4de1-aff3-d992beb38dd5", (long)3030071199400461444L, (Object[])objectArray2, (String)"T3d0bXI6OjVAQidFY2dKZn+AfoJgfzt+dHN2VVh0dVlPEk5tS29NTkdISUVDRANpXGBhXVtfYl50c1YYU3daWQwrDjIwLC0xaSMpJQgnKiY8Oz49QH4iPjQzOTo4Nzo2DAs=", (String)"Q3BvQkNp", (int)IIIllIIliIIl[135], (String)"cGcvcnR5cm89O0JBPSZkfWeAdmdqe2k8dHpxgXF2gnYRdFFFYENXZkxgTg==", (int)IIIllIIliIIl[136], (String)"K05cUnFnc2kqaG5obiVEcH13dGoyP12AfHJ+N3N/c3sScUNMRElVHw==", (String)"dXdv", (int)IIIllIIliIIl[137], (int)IIIllIIliIIl[138], (int)IIIllIIliIIl[139]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onInteract(PlayerInteractEvent playerInteractEvent) {
        if (IiIlliIliiIl) {
            int cfr_ignored_0 = 0x63 & 1;
        }
        Object[] objectArray = new Object[29];
        objectArray[4] = IIIllIIliIIl[56];
        objectArray[12] = IIIllIIliIIl[57];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[22] & ~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[12];
        objectArray[12] = IIIllIIliIIl[58];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[22] | (Integer)objectArray[12]) & ~((Integer)objectArray[22] & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[19] = IIIllIIliIIl[59];
        objectArray[12] = IIIllIIliIIl[60];
        objectArray[22] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[22] | (Integer)objectArray[12]) - ((Integer)objectArray[22] ^ (Integer)objectArray[12]);
        objectArray[12] = IIIllIIliIIl[61];
        objectArray[22] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[22] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray2[((Integer)objectArray[19]).intValue()] = this;
        objectArray[17] = IIIllIIliIIl[62];
        objectArray[12] = IIIllIIliIIl[63];
        objectArray[22] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[22] + ~((Integer)objectArray[12]).intValue() + 1;
        objectArray[12] = IIIllIIliIIl[64];
        objectArray[22] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[22] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray2[((Integer)objectArray[17]).intValue()] = playerInteractEvent;
        Iliilliiilii.IIIIllIIIl("abfb0928-6c43-4732-a2e1-004d31041e27", (long)755149774608975735L, (Object[])objectArray2, (String)"WoJ/eH1FRUBLTTJQbnJVcYqLiY1rikaJf36BYGN/gGRaHVl4VnpYWVJTVFBOTw50Z2tsaGZqbWl/fmEjXoJlZBc2GT07Nzg8dC40MBMyNTFHRklIS4ktST8+REVDQkVBFxY=", (String)"N0J3c3ht", (int)IIIllIIliIIl[65], (String)"e3I6fX+EfXpIRk1MSDFviHKLgXJ1hnRHf4V8jHyBjYEcf1xQa05icVdrWQ==", (int)IIIllIIliIIl[66], (String)"NllnXXxyfnQ1c3lzeTBPe4iCf3U9SmiLh32JQn6KfoYdfE5XT1RgKg==", (String)"gIJ6", (int)IIIllIIliIIl[67], (int)IIIllIIliIIl[68], (int)IIIllIIliIIl[69]);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        Object[] objectArray = new Object[30];
        objectArray[22] = IIIllIIliIIl[112];
        objectArray[3] = IIIllIIliIIl[113];
        objectArray[19] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[19] - ~((Integer)objectArray[3]).intValue() - 1;
        objectArray[3] = IIIllIIliIIl[114];
        objectArray[19] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[19] & ~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[3];
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[9] = IIIllIIliIIl[115];
        objectArray[3] = IIIllIIliIIl[116];
        objectArray[19] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[19] | (Integer)objectArray[3]) - ((Integer)objectArray[19] ^ (Integer)objectArray[3]);
        objectArray[3] = IIIllIIliIIl[117];
        objectArray[19] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[19] | (Integer)objectArray[3]) & ~((Integer)objectArray[19] & (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[9]).intValue()] = this;
        objectArray[1] = IIIllIIliIIl[118];
        objectArray[3] = IIIllIIliIIl[119];
        objectArray[19] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[19] & ~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[3];
        objectArray[3] = IIIllIIliIIl[120];
        objectArray[19] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[19] & ~((Integer)objectArray[3]).intValue()) - (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[1]).intValue()] = inventoryClickEvent;
        Iliilliiilii.IIIIllIIIl("da1ef866-41ee-418f-9595-c48bd85d02b1", (long)7723293632848567461L, (Object[])objectArray2, (String)"TnZzbHE5OTQ/QSZEYmZJZX5/fYFffjp9c3J1VFdzdFhOEU1sSm5MTUZHSERCQwJoW19gXFpeYV1zclUXUnZZWAsqDTEvKywwaCIoJAcmKSU7Oj08P30hPTMyODk3Njk1Cwo=", (String)"SkRZVWhy", (int)IIIllIIliIIl[121], (String)"b2YucXN4cW48OkFAPCVjfGZ/dWZpemg7c3lwgHB1gXUQc1BEX0JWZUtfTQ==", (int)IIIllIIliIIl[122], (String)"Kk1bUXBmcmgpZ21nbSRDb3x2c2kxPlx/e3F9NnJ+cnoRcEJLQ0hUHg==", (String)"dHZu", (int)IIIllIIliIIl[123], (int)IIIllIIliIIl[124], (int)IIIllIIliIIl[125]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Iliilliiilii(IliIlllilIi iliIlllilIi) {
        if (IiIlliIliiIl) {
            throw null;
        }
        Object[] objectArray = new Object[28];
        objectArray[25] = IIIllIIliIIl[0];
        objectArray[14] = IIIllIIliIIl[1];
        objectArray[9] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[9] | (Integer)objectArray[14]) - ((Integer)objectArray[9] ^ (Integer)objectArray[14]);
        objectArray[14] = IIIllIIliIIl[2];
        objectArray[9] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[9] - ~((Integer)objectArray[14]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[25]).intValue()];
        objectArray[11] = IIIllIIliIIl[3];
        objectArray[14] = IIIllIIliIIl[4];
        objectArray[9] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[9] | (Integer)objectArray[14]) & ~((Integer)objectArray[9] & (Integer)objectArray[14]);
        objectArray[14] = IIIllIIliIIl[5];
        objectArray[9] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[9] | (Integer)objectArray[14]) & ~((Integer)objectArray[9] & (Integer)objectArray[14]);
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        objectArray[7] = IIIllIIliIIl[6];
        objectArray[14] = IIIllIIliIIl[7];
        objectArray[9] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[9] & ~((Integer)objectArray[14]).intValue()) - (~((Integer)objectArray[9]).intValue() & (Integer)objectArray[14]);
        objectArray[14] = IIIllIIliIIl[8];
        objectArray[9] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[9] | (Integer)objectArray[14]) - ((Integer)objectArray[9] & (Integer)objectArray[14]);
        objectArray2[((Integer)objectArray[7]).intValue()] = iliIlllilIi;
        Iliilliiilii.IIIIllIIIl("7b5fa314-48ea-4354-8aa0-38a8ad6844d6", (long)1835869716554001215L, (Object[])objectArray2, (String)"Vn57dHlBQTxHSS5Mam5RbYaHhYlnhkKFe3p9XF97fGBWGVV0UnZUVU5PUExKSwpwY2doZGJmaWV7el0fWn5hYBMyFTk3MzQ4cCowLA8uMS1DQkVER4UpRTs6QEE/PkE9ExI=", (String)"eXBQaVNm", (int)IIIllIIliIIl[9], (String)"d242eXuAeXZEQklIRC1rhG6HfW5xgnBDe4F4iHh9iX0Ye1hMZ0pebVNnVQ==", (int)IIIllIIliIIl[10], (String)"MlVjWXhuenAxb3VvdSxLd4R+e3E5RmSHg3mFPnqGeoIZeEpTS1BcJg==", (String)"fH52", (int)IIIllIIliIIl[11], (int)IIIllIIliIIl[12], (int)IIIllIIliIIl[13]);
    }

    /*
     * Exception decompiling
     */
    public static String Iiiiliiiiiii(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [57[UNCONDITIONALDOLOOP], 25[CASE]], but top level block is 1[TRYBLOCK]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler
    public void onDeath(PlayerDeathEvent playerDeathEvent) {
        Object[] objectArray = new Object[29];
        objectArray[18] = IIIllIIliIIl[84];
        objectArray[19] = IIIllIIliIIl[85];
        objectArray[25] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[25] | (Integer)objectArray[19]) - ((Integer)objectArray[25] & (Integer)objectArray[19]);
        objectArray[19] = IIIllIIliIIl[86];
        objectArray[25] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[25] ^ (Integer)objectArray[19]) + 2 * ((Integer)objectArray[25] & (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[4] = IIIllIIliIIl[87];
        objectArray[19] = IIIllIIliIIl[88];
        objectArray[25] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[25] ^ (Integer)objectArray[19]) + 2 * ((Integer)objectArray[25] & (Integer)objectArray[19]);
        objectArray[19] = IIIllIIliIIl[89];
        objectArray[25] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[25] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[25]).intValue() & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        objectArray[9] = IIIllIIliIIl[90];
        objectArray[19] = IIIllIIliIIl[91];
        objectArray[25] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[25] | (Integer)objectArray[19]) & ~((Integer)objectArray[25] & (Integer)objectArray[19]);
        objectArray[19] = IIIllIIliIIl[92];
        objectArray[25] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[25] | (Integer)objectArray[19]) - ((Integer)objectArray[25] & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[9]).intValue()] = playerDeathEvent;
        Iliilliiilii.IIIIllIIIl("8ea6a4c5-75c7-4949-850c-f38aa6412dbe", (long)3844725095752788805L, (Object[])objectArray2, (String)"WIB9dntDQz5JSzBObHBTb4iJh4tpiESHfXx/XmF9fmJYG1d2VHhWV1BRUk5MTQxyZWlqZmRoa2d9fF8hXIBjYhU0Fzs5NTY6ciwyLhEwMy9FREdGSYcrRz08QkNBQEM/FRQ=", (String)"d01ZQm1i", (int)IIIllIIliIIl[93], (String)"eXA4e32Ce3hGREtKRi9thnCJf3BzhHJFfYN6inp/i38afVpOaUxgb1VpVw==", (int)IIIllIIliIIl[94], (String)"NFdlW3pwfHIzcXdxdy5NeYaAfXM7SGaJhXuHQHyIfIQbekxVTVJeKA==", (String)"foB4", (int)IIIllIIliIIl[95], (int)IIIllIIliIIl[96], (int)IIIllIIliIIl[97]);
        int n = (0xCDFD57B7 | 0xA586B952) - (0xCDFD57B7 & 0xA586B952);
        int cfr_ignored_0 = n + -1517897390;
    }

    private boolean giveOnJoin() {
        Object[] objectArray = new Object[26];
        objectArray[0] = IIIllIIliIIl[220];
        objectArray[15] = IIIllIIliIIl[221];
        objectArray[21] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[21] & ~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[21]).intValue() & (Integer)objectArray[15];
        objectArray[15] = IIIllIIliIIl[222];
        objectArray[21] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[21] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[21] ^ (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[1] = IIIllIIliIIl[223];
        objectArray[15] = IIIllIIliIIl[224];
        objectArray[21] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[21] ^ (Integer)objectArray[15]) + 2 * ((Integer)objectArray[21] & (Integer)objectArray[15]);
        objectArray[15] = IIIllIIliIIl[225];
        objectArray[21] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[21] & ~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[21]).intValue() & (Integer)objectArray[15];
        objectArray2[((Integer)objectArray[1]).intValue()] = this;
        return (boolean)Iliilliiilii.IIIIllIIIl("403e5d32-587b-42cc-a1c6-5a94263943ea", (Object)Iliilliiilii.IIIIllIIIl("363b9a52-e76f-46bb-b31a-d108b03a6ba6", (long)6082836446206167498L, (Object[])objectArray2, (String)"Z4+MhYpSUk1YWj9de39ifpeYlpp4l1OWjIuObXCMjXFnKmaFY4dlZl9gYV1bXBuBdHh5dXN3enaMi24wa49ycSRDJkpIREVJgTtBPSA/Qj5UU1ZVWJY6VkxLUVJQT1JOJCM=", (String)"M2YzNnRF", (int)IIIllIIliIIl[226], (String)"iH9HioyRiodVU1pZVT58lX+Yjn+Ck4FUjJKJmYmOmo4pjGldeFtvfmR4Zg==", (int)IIIllIIliIIl[227], (String)"Q2Z0aol/i4FCgIaAhj1ciJWPjIJKV3WYlIqWT4uXi5MqiVtkXGFtNw==", (String)"jY+H", (int)IIIllIIliIIl[228], (int)IIIllIIliIIl[229], (int)IIIllIIliIIl[230]), (String)"ZIyJgodPT0pVVzxaeHxfe5SVk5d1lFCTiYiLam2Jim5kJ2OCYIRiY1xdXlpYWRh+cXV2cnB0d3OJiGstaIxvbiFAI0dFQUJGfjg+Oh08PztRUFNSVZM3U0lITk9NTE9LISA=", (String)"c29XaGlZ", (int)IIIllIIliIIl[231], (String)"hXxEh4mOh4RSUFdWUjt5knyVi3x/kH5RiY+GloaLl4smiWZadVhse2F1Yw==", (int)IIIllIIliIIl[232], (String)"QGWAeop8QYOBf4U8W4d8got9QVJ1", (String)"jIZjhYg=", (int)IIIllIIliIIl[233], (int)IIIllIIliIIl[234], (int)IIIllIIliIIl[235]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        if (IiIlliIliiIl) {
            int n;
            int n2 = n = (0xE1A89724 | 0x789709C6) - (0xE1A89724 & 0x789709C6);
            IlIlllIlilIl = n2 + 2023164358 - (n2 & 0x789709C6) * 2;
        }
        Object[] objectArray = new Object[33];
        objectArray[10] = IIIllIIliIIl[28];
        objectArray[22] = IIIllIIliIIl[29];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[22]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[22]);
        objectArray[22] = IIIllIIliIIl[30];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[4] | (Integer)objectArray[22]) - ((Integer)objectArray[4] & (Integer)objectArray[22]);
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[21] = IIIllIIliIIl[31];
        objectArray[22] = IIIllIIliIIl[32];
        objectArray[4] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[4] ^ (Integer)objectArray[22]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[22]);
        objectArray[22] = IIIllIIliIIl[33];
        objectArray[4] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[4] + ~((Integer)objectArray[22]).intValue() + 1;
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[32] = IIIllIIliIIl[34];
        objectArray[22] = IIIllIIliIIl[35];
        objectArray[4] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[4] - ~((Integer)objectArray[22]).intValue() - 1;
        objectArray[22] = IIIllIIliIIl[36];
        objectArray[4] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[4] & ~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[22];
        objectArray2[((Integer)objectArray[32]).intValue()] = playerQuitEvent;
        Iliilliiilii.IIIIllIIIl("2c8503f1-eb40-4955-99ca-a652ae9c9146", (long)7283313743634861301L, (Object[])objectArray2, (String)"VHx5cnc/PzpFRyxKaGxPa4SFg4dlhECDeXh7Wl15el5UF1NyUHRSU0xNTkpISQhuYWVmYmBkZ2N5eFsdWHxfXhEwEzc1MTI2biguKg0sLytBQENCRYMnQzk4Pj89PD87ERA=", (String)"cTcwVjdV", (int)IIIllIIliIIl[37], (String)"dWw0d3l+d3RCQEdGQitpgmyFe2xvgG5BeX92hnZ7h3sWeVZKZUhca1FlUw==", (int)IIIllIIliIIl[38], (String)"MFNhV3ZseG4vbXNtcypJdYJ8eW83RGKFgXeDPHiEeIAXdkhRSU5aJA==", (String)"enx0", (int)IIIllIIliIIl[39], (int)IIIllIIliIIl[40], (int)IIIllIIliIIl[41]);
        int n = (0x4E1FFFC0 | 0x2F9926BF) - (0x4E1FFFC0 & 0x2F9926BF);
        int cfr_ignored_0 = n + 798566079;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String llIIlilIIl(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x226432FE | 0xE2946D6A) - (0x226432FE & 0xE2946D6A);
        IlIlllIlilIl = n4 + -493589142 - (n4 & 0xE2946D6A) * 2;
        if (1305735937 <= IlIlllIlilIl) {
            int n5 = n3 = (0x46 | 0xE2946D6A) - (0x46 & 0xE2946D6A);
            int cfr_ignored_0 = n5 + -493589142 - (n5 & 0xE2946D6A) * 2;
        }
        Object[] objectArray = new Object[6];
        objectArray[1] = Base64.getDecoder().decode(string);
        objectArray[0] = IIIllIIliIIl[372];
        while ((Integer)objectArray[0] < ((byte[])objectArray[1]).length) {
            int n6 = (0xB2F45558 | 0x7E29777B) - (0xB2F45558 & 0x7E29777B);
            int cfr_ignored_1 = n6 + 2116646779;
            byte[] byArray = (byte[])objectArray[1];
            int n7 = (Integer)objectArray[0];
            objectArray[3] = n2;
            objectArray[2] = n;
            objectArray[3] = ((Integer)objectArray[2] | (Integer)objectArray[3]) & ~((Integer)objectArray[2] & (Integer)objectArray[3]);
            objectArray[2] = (int)byArray[n7];
            objectArray[3] = (int)((Integer)objectArray[0]);
            objectArray[2] = ((Integer)objectArray[2] ^ (Integer)objectArray[3]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[3]);
            byArray[n7] = (byte)(((Integer)objectArray[2] | (Integer)objectArray[3]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[3]).intValue()));
            objectArray[0] = (Integer)objectArray[0] + 1;
        }
        try {
            return new String((byte[])objectArray[1], StandardCharsets.UTF_8);
        }
        catch (SyncFailedException syncFailedException) {
            throw syncFailedException;
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
    }

    private /* synthetic */ void lambda$onRespawn$1(PlayerRespawnEvent playerRespawnEvent, boolean bl) {
        Object[] objectArray = new Object[30];
        objectArray[17] = IIIllIIliIIl[284];
        objectArray[28] = IIIllIIliIIl[285];
        objectArray[12] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[12] | (Integer)objectArray[28]) - ((Integer)objectArray[12] & (Integer)objectArray[28]);
        objectArray[28] = IIIllIIliIIl[286];
        objectArray[12] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[12] + ~((Integer)objectArray[28]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[24] = IIIllIIliIIl[287];
        objectArray[28] = IIIllIIliIIl[288];
        objectArray[12] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[12] ^ (Integer)objectArray[28]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[28]);
        objectArray[28] = IIIllIIliIIl[289];
        objectArray[12] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[12] | (Integer)objectArray[28]) & (~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[28]).intValue());
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        objectArray[11] = IIIllIIliIIl[290];
        objectArray[28] = IIIllIIliIIl[291];
        objectArray[12] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[12] ^ (Integer)objectArray[28]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[28]);
        objectArray[28] = IIIllIIliIIl[292];
        objectArray[12] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[12] & ~((Integer)objectArray[28]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[11]).intValue()] = playerRespawnEvent;
        objectArray[18] = IIIllIIliIIl[293];
        objectArray[28] = IIIllIIliIIl[294];
        objectArray[12] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[12] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[28];
        objectArray[28] = IIIllIIliIIl[295];
        objectArray[12] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[12] | (Integer)objectArray[28]) - ((Integer)objectArray[12] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[18]).intValue()] = Iliilliiilii.IIIIllIIIl("4ec8f0be-438a-4b7f-836f-77056e239453", (boolean)bl, (String)"X4eEfYJKSkVQUjdVc3dado+QjpJwj0uOhIOGZWiEhWlfIl59W39dXldYWVVTVBN5bHBxbWtvcm6Eg2YoY4dqaRw7HkJAPD1BeTM5NRg3OjZMS05NUI4yTkRDSUpIR0pGHBs=", (String)"OXdCdWE2", (int)IIIllIIliIIl[296], (String)"fXOHdT18enyCOlt3dnR+gZE=", (int)IIIllIIliIIl[297], (String)"O24+YoF3g3k6eH54fjVfc5KQioWNQQ==", (String)"iXOBiXRdcw==", (int)IIIllIIliIIl[298], (int)IIIllIIliIIl[299], (int)IIIllIIliIIl[300]);
        Iliilliiilii.IIIIllIIIl("d6149205-1553-4d21-bcf5-b57db1da950b", (long)-3553728827994702580L, (Object[])objectArray2, (String)"XISBen9HR0JNTzRScHRXc4yNi49tjEiLgYCDYmWBgmZcH1t6WHxaW1RVVlJQURB2aW1uamhsb2uBgGMlYIRnZhk4Gz89OTo+djA2MhU0NzNJSEtKTYsvS0FARkdFREdDGRg=", (String)"OFFaRlRI", (int)IIIllIIliIIl[301], (String)"fXQ8f4GGf3xKSE9OSjNxinSNg3R3iHZJgYd+jn6Dj4MegV5SbVBkc1ltWw==", (int)IIIllIIliIIl[302], (String)"OFtpX350gHY3dXt1ezJRfYqEgXc/TGqNiX+LRICMgIgfflBZUVZiLA==", (String)"goR8", (int)IIIllIIliIIl[303], (int)IIIllIIliIIl[304], (int)IIIllIIliIIl[305]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Player resolveAttacker(Entity entity) {
        int n;
        int n2 = n = (0x3A30F6A4 | 0x411AF5E9) - (0x3A30F6A4 & 0x411AF5E9);
        IlIlllIlilIl = n2 + 1092285929 - (n2 & 0x411AF5E9) * 2;
        if (1813310240 < IlIlllIlilIl) {
            int cfr_ignored_0 = 0x35 & 1;
        }
        Object[] objectArray = new Object[31];
        objectArray[15] = IIIllIIliIIl[190];
        objectArray[23] = IIIllIIliIIl[191];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[12] & ~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[23];
        objectArray[23] = IIIllIIliIIl[192];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[23]) - ((Integer)objectArray[12] ^ (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[25] = IIIllIIliIIl[193];
        objectArray[23] = IIIllIIliIIl[194];
        objectArray[12] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[23]) - ((Integer)objectArray[12] ^ (Integer)objectArray[23]);
        objectArray[23] = IIIllIIliIIl[195];
        objectArray[12] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[12] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        objectArray[5] = IIIllIIliIIl[196];
        objectArray[23] = IIIllIIliIIl[197];
        objectArray[12] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[12] | (Integer)objectArray[23]) - ((Integer)objectArray[12] & (Integer)objectArray[23]);
        objectArray[23] = IIIllIIliIIl[198];
        objectArray[12] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[12] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[5]).intValue()] = entity;
        return (Player)Iliilliiilii.IIIIllIIIl("f0c2318a-f845-4fef-b94d-ccbb777867d7", (long)431165203485093350L, (Object[])objectArray2, (String)"UHh1bnM7OzZBQyhGZGhLZ4CBf4NhgDx/dXR3Vll1dlpQE09uTHBOT0hJSkZERQRqXWFiXlxgY191dFcZVHhbWg0sDzMxLS4yaiQqJgkoKyc9PD8+QX8jPzU0Ojs5ODs3DQw=", (String)"WndnZUlF", (int)IIIllIIliIIl[199], (String)"cWgwc3V6c3A+PENCPidlfmiBd2hrfGo9dXtygnJ3g3cSdVJGYURYZ01hTw==", (int)IIIllIIliIIl[200], (String)"LE9dU3JodGoraW9pbyZFcX54dWszQF6BfXN/OHSAdHwTckRNRUpWIA==", (String)"dnhw", (int)IIIllIIliIIl[201], (int)IIIllIIliIIl[202], (int)IIIllIIliIIl[203]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void handleGuiClick(Player player, ItemStack itemStack) {
        if (IiIlliIliiIl) {
            int n;
            int n2 = n = (0x47 | 0xC141B6E2) - (0x47 & 0xC141B6E2);
            int cfr_ignored_0 = n2 + -1052657950 - (n2 & 0xC141B6E2) * 2;
        }
        Object[] objectArray = new Object[55];
        objectArray[9] = IIIllIIliIIl[140];
        objectArray[15] = IIIllIIliIIl[141];
        objectArray[14] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[14] | (Integer)objectArray[15]) & ~((Integer)objectArray[14] & (Integer)objectArray[15]);
        objectArray[15] = IIIllIIliIIl[142];
        objectArray[14] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[14] | (Integer)objectArray[15]) & ~((Integer)objectArray[14] & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[18] = IIIllIIliIIl[143];
        objectArray[15] = IIIllIIliIIl[144];
        objectArray[14] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[14] | (Integer)objectArray[15]) - ((Integer)objectArray[14] & (Integer)objectArray[15]);
        objectArray[15] = IIIllIIliIIl[145];
        objectArray[14] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[14] + ~((Integer)objectArray[15]).intValue() + 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[2] = IIIllIIliIIl[146];
        objectArray[15] = IIIllIIliIIl[147];
        objectArray[14] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[14] | (Integer)objectArray[15]) - ((Integer)objectArray[14] ^ (Integer)objectArray[15]);
        objectArray[15] = IIIllIIliIIl[148];
        objectArray[14] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[14] & ~((Integer)objectArray[15]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[2]).intValue()] = player;
        objectArray[52] = IIIllIIliIIl[149];
        objectArray[15] = IIIllIIliIIl[150];
        objectArray[14] = (int)((Integer)objectArray[52]);
        objectArray[52] = (Integer)objectArray[14] - ~((Integer)objectArray[15]).intValue() - 1;
        objectArray[15] = IIIllIIliIIl[151];
        objectArray[14] = (int)((Integer)objectArray[52]);
        objectArray[52] = (Integer)objectArray[14] - ~((Integer)objectArray[15]).intValue() - 1;
        objectArray2[((Integer)objectArray[52]).intValue()] = itemStack;
        Iliilliiilii.IIIIllIIIl("840d5481-2f09-4bfe-b461-b6b43877358f", (long)8545954725567001363L, (Object[])objectArray2, (String)"THRxam83NzI9PyRCYGRHY3x9e39dfDh7cXBzUlVxclZMD0tqSGxKS0RFRkJAQQBmWV1eWlhcX1txcFMVUHRXVgkoCy8tKSouZiAmIgUkJyM5ODs6PXsfOzEwNjc1NDczCQg=", (String)"T1FIaDU5", (int)IIIllIIliIIl[152], (String)"bWQsb3F2b2w6OD8+OiNhemR9c2RneGY5cXdufm5zf3MOcU5CXUBUY0ldSw==", (int)IIIllIIliIIl[153], (String)"KEtZT25kcGYnZWtlayJBbXp0cWcvPFp9eW97NHB8cHgPbkBJQUZSHA==", (String)"cnRs", (int)IIIllIIliIIl[154], (int)IIIllIIliIIl[155], (int)IIIllIIliIIl[156]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$onJoin$0(Player player) {
        Object[] objectArray = new Object[31];
        objectArray[20] = IIIllIIliIIl[306];
        objectArray[8] = IIIllIIliIIl[307];
        objectArray[18] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[18] | (Integer)objectArray[8]) & ~((Integer)objectArray[18] & (Integer)objectArray[8]);
        objectArray[8] = IIIllIIliIIl[308];
        objectArray[18] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[18] | (Integer)objectArray[8]) & (~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[8]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[26] = IIIllIIliIIl[309];
        objectArray[8] = IIIllIIliIIl[310];
        objectArray[18] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[18] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray[8] = IIIllIIliIIl[311];
        objectArray[18] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[18] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray2[((Integer)objectArray[26]).intValue()] = this;
        objectArray[4] = IIIllIIliIIl[312];
        objectArray[8] = IIIllIIliIIl[313];
        objectArray[18] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[18] | (Integer)objectArray[8]) & ~((Integer)objectArray[18] & (Integer)objectArray[8]);
        objectArray[8] = IIIllIIliIIl[314];
        objectArray[18] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[18] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray2[((Integer)objectArray[4]).intValue()] = player;
        Iliilliiilii.IIIIllIIIl("f2e90acd-eed0-4d54-813d-878e0779adf5", (long)-369223749988493621L, (Object[])objectArray2, (String)"XYWCe4BISENOUDVTcXVYdI2OjJBujUmMgoGEY2aCg2ddIFx7WX1bXFVWV1NRUhF3am5va2ltcGyCgWQmYYVoZxo5HEA+Ojs/dzE3MxY1ODRKSUxLTowwTEJBR0hGRUhEGhk=", (String)"OFIyMlpL", (int)IIIllIIliIIl[315], (String)"fnU9gIKHgH1LSVBPSzRyi3WOhHV4iXdKgoh/j3+EkIQfgl9TblFldFpuXA==", (int)IIIllIIliIIl[316], (String)"OVxqYH91gXc4dnx2fDNSfouFgnhATWuOioCMRYGNgYkgf1FaUldjLQ==", (String)"g4V9", (int)IIIllIIliIIl[317], (int)IIIllIIliIIl[318], (int)IIIllIIliIIl[319]);
        int n = (0x39F10748 | 0x5EA423D4) - (0x39F10748 & 0x5EA423D4);
        int cfr_ignored_0 = n + 1587815380;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int trackingFee() {
        Object[] objectArray = new Object[27];
        int n = (0xFE96519F | 0x6381F5F9) - (0xFE96519F & 0x6381F5F9);
        int cfr_ignored_0 = n + 1669461497;
        objectArray[20] = IIIllIIliIIl[268];
        objectArray[3] = IIIllIIliIIl[269];
        objectArray[15] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[15] | (Integer)objectArray[3]) & (~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[3]).intValue());
        objectArray[3] = IIIllIIliIIl[270];
        objectArray[15] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[15] | (Integer)objectArray[3]) - ((Integer)objectArray[15] & (Integer)objectArray[3]);
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[8] = IIIllIIliIIl[271];
        objectArray[3] = IIIllIIliIIl[272];
        objectArray[15] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[15] - ~((Integer)objectArray[3]).intValue() - 1;
        objectArray[3] = IIIllIIliIIl[273];
        objectArray[15] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[15] - ~((Integer)objectArray[3]).intValue() - 1;
        objectArray2[((Integer)objectArray[8]).intValue()] = this;
        return (int)Iliilliiilii.IIIIllIIIl("bcfe17f5-14fa-4103-a739-b589f81f3843", (Object)Iliilliiilii.IIIIllIIIl("59d273e7-1156-497b-94d2-13e29d2876d3", (long)-6707916357991627925L, (Object[])objectArray2, (String)"aZGOh4xUVE9aXEFffYFkgJmamJx6mVWYjo2Qb3KOj3NpLGiHZYlnaGFiY19dXh2Ddnp7d3V5fHiOjXAybZF0cyZFKExKRkdLgz1DPyJBREBWVVhXWpg8WE5NU1RSUVRQJiU=", (String)"M1FzQU5s", (int)IIIllIIliIIl[274], (String)"ioFJjI6TjIlXVVxbV0B+l4GakIGElYNWjpSLm4uQnJArjmtfel1xgGZ6aA==", (int)IIIllIIliIIl[275], (String)"RWh2bIuBjYNEgoiCiD9eipeRjoRMWXealoyYUY2ZjZUsi11mXmNvOQ==", (String)"j5GJ", (int)IIIllIIliIIl[276], (int)IIIllIIliIIl[277], (int)IIIllIIliIIl[278]), (String)"XoaDfIFJSURPUTZUcnZZdY6PjZFvjkqNg4KFZGeDhGheIV18Wn5cXVZXWFRSUxJ4a29wbGpucW2DgmUnYoZpaBs6HUE/OzxAeDI4NBc2OTVLSk1MT40xTUNCSElHRklFGxo=", (String)"emlhOWhi", (int)IIIllIIliIIl[279], (String)"f3Y+gYOIgX5MSlFQTDVzjHaPhXZ5inhLg4mAkICFkYUgg2BUb1JmdVtvXQ==", (int)IIIllIIliIIl[280], (String)"Ol96dIR2O317eX82VYF2fIV3O0xv", (String)"hoBdf4I=", (int)IIIllIIliIIl[281], (int)IIIllIIliIIl[282], (int)IIIllIIliIIl[283]);
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent playerRespawnEvent) {
        Object[] objectArray = new Object[29];
        objectArray[21] = IIIllIIliIIl[42];
        objectArray[5] = IIIllIIliIIl[43];
        objectArray[14] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[14] ^ (Integer)objectArray[5]) + 2 * ((Integer)objectArray[14] & (Integer)objectArray[5]);
        objectArray[5] = IIIllIIliIIl[44];
        objectArray[14] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[14] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[5]);
        Object[] objectArray2 = new Object[((Integer)objectArray[21]).intValue()];
        objectArray[16] = IIIllIIliIIl[45];
        objectArray[5] = IIIllIIliIIl[46];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[14] - ~((Integer)objectArray[5]).intValue() - 1;
        objectArray[5] = IIIllIIliIIl[47];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[14] + ~((Integer)objectArray[5]).intValue() + 1;
        objectArray2[((Integer)objectArray[16]).intValue()] = this;
        objectArray[26] = IIIllIIliIIl[48];
        objectArray[5] = IIIllIIliIIl[49];
        objectArray[14] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[14] | (Integer)objectArray[5]) & (~((Integer)objectArray[14]).intValue() | ~((Integer)objectArray[5]).intValue());
        objectArray[5] = IIIllIIliIIl[50];
        objectArray[14] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[14] & ~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[14]).intValue() & (Integer)objectArray[5];
        objectArray2[((Integer)objectArray[26]).intValue()] = playerRespawnEvent;
        Iliilliiilii.IIIIllIIIl("a342f73e-7886-4eb2-9720-9cdf8408718f", (long)-1695744113064769057L, (Object[])objectArray2, (String)"VX16c3hAQDtGSC1LaW1QbIWGhIhmhUGEenl8W156e19VGFRzUXVTVE1OT0tJSglvYmZnY2FlaGR6eVweWX1gXxIxFDg2MjM3bykvKw4tMCxCQURDRoQoRDo5P0A+PUA8EhE=", (String)"YVlvQzRV", (int)IIIllIIliIIl[51], (String)"dm01eHp/eHVDQUhHQyxqg22GfG1wgW9CeoB3h3d8iHwXeldLZkldbFJmVA==", (int)IIIllIIliIIl[52], (String)"MVRiWHdteW8wbnRudCtKdoN9enA4RWOGgniEPXmFeYEYd0lSSk9bJQ==", (String)"e311", (int)IIIllIIliIIl[53], (int)IIIllIIliIIl[54], (int)IIIllIIliIIl[55]);
    }

    public void syncTracker(Player player, boolean bl) {
        Object[] objectArray = new Object[30];
        objectArray[13] = IIIllIIliIIl[168];
        objectArray[24] = IIIllIIliIIl[169];
        objectArray[10] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[10] & ~((Integer)objectArray[24]).intValue()) - (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[24]);
        objectArray[24] = IIIllIIliIIl[170];
        objectArray[10] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[10] & ~((Integer)objectArray[24]).intValue()) - (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[24]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[18] = IIIllIIliIIl[171];
        objectArray[24] = IIIllIIliIIl[172];
        objectArray[10] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[10] | (Integer)objectArray[24]) & (~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[24]).intValue());
        objectArray[24] = IIIllIIliIIl[173];
        objectArray[10] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[10] + ~((Integer)objectArray[24]).intValue() + 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[11] = IIIllIIliIIl[174];
        objectArray[24] = IIIllIIliIIl[175];
        objectArray[10] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[10] & ~((Integer)objectArray[24]).intValue()) - (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[24]);
        objectArray[24] = IIIllIIliIIl[176];
        objectArray[10] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[10] & ~((Integer)objectArray[24]).intValue() | ~((Integer)objectArray[10]).intValue() & (Integer)objectArray[24];
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        objectArray[2] = IIIllIIliIIl[177];
        objectArray[24] = IIIllIIliIIl[178];
        objectArray[10] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[10] | (Integer)objectArray[24]) & ~((Integer)objectArray[10] & (Integer)objectArray[24]);
        objectArray[24] = IIIllIIliIIl[179];
        objectArray[10] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[10] | (Integer)objectArray[24]) - ((Integer)objectArray[10] ^ (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[2]).intValue()] = Iliilliiilii.IIIIllIIIl("92ea870e-3227-48c5-8373-29c0bbd0e653", (boolean)bl, (String)"Unp3cHU9PThDRSpIZmpNaYKDgYVjgj6Bd3Z5WFt3eFxSFVFwTnJQUUpLTEhGRwZsX2NkYF5iZWF3dlkbVnpdXA8uETUzLzA0bCYsKAsqLSk/PkFAQ4ElQTc2PD07Oj05Dw4=", (String)"eTdhaWhC", (int)IIIllIIliIIl[180], (String)"cGZ6aDBvbW91LU5qaWdxdIQ=", (int)IIIllIIliIIl[181], (String)"LmExVXRqdmwta3FrcShSZoWDfXiANA==", (String)"fGZ0fGdQZg==", (int)IIIllIIliIIl[182], (int)IIIllIIliIIl[183], (int)IIIllIIliIIl[184]);
        Iliilliiilii.IIIIllIIIl("7a2e3d82-995c-46fc-8393-89ae37c8e9be", (long)-1210853094975915419L, (Object[])objectArray2, (String)"U3t4cXY+PjlERitJZ2tOaoOEgoZkgz+CeHd6WVx4eV1TFlJxT3NRUktMTUlHSAdtYGRlYV9jZmJ4d1ocV3teXRAvEjY0MDE1bSctKQwrLipAP0JBRIImQjg3PT48Oz46EA8=", (String)"YXFQVEdX", (int)IIIllIIliIIl[185], (String)"dGszdnh9dnNBP0ZFQSpogWuEemtuf21AeH51hXV6hnoVeFVJZEdbalBkUg==", (int)IIIllIIliIIl[186], (String)"L1JgVnVrd20ubHJscilIdIF7eG42Q2GEgHaCO3eDd38WdUdQSE1ZIw==", (String)"eXtz", (int)IIIllIIliIIl[187], (int)IIIllIIliIIl[188], (int)IIIllIIliIIl[189]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onJoin(PlayerJoinEvent playerJoinEvent) {
        Object[] objectArray = new Object[38];
        int n = (0x7FAAC948 | 0x2B4501A1) - (0x7FAAC948 & 0x2B4501A1);
        int cfr_ignored_0 = n + 725942689;
        objectArray[3] = IIIllIIliIIl[14];
        objectArray[13] = IIIllIIliIIl[15];
        objectArray[24] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[24] | (Integer)objectArray[13]) + ((Integer)objectArray[24] & (Integer)objectArray[13]);
        objectArray[13] = IIIllIIliIIl[16];
        objectArray[24] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[24] & ~((Integer)objectArray[13]).intValue()) - ((Integer)objectArray[24] ^ (Integer)objectArray[13]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[29] = IIIllIIliIIl[17];
        objectArray[13] = IIIllIIliIIl[18];
        objectArray[24] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[24] | (Integer)objectArray[13]) + ((Integer)objectArray[24] & (Integer)objectArray[13]);
        objectArray[13] = IIIllIIliIIl[19];
        objectArray[24] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[24] & ~((Integer)objectArray[13]).intValue()) - (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[29]).intValue()] = this;
        objectArray[23] = IIIllIIliIIl[20];
        objectArray[13] = IIIllIIliIIl[21];
        objectArray[24] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[24] | (Integer)objectArray[13]) - ((Integer)objectArray[24] & (Integer)objectArray[13]);
        objectArray[13] = IIIllIIliIIl[22];
        objectArray[24] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[24] | (Integer)objectArray[13]) - ((Integer)objectArray[24] & (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[23]).intValue()] = playerJoinEvent;
        Iliilliiilii.IIIIllIIIl("f3a43682-7bc2-4907-905b-b191cbba532a", (long)-3516368357176723099L, (Object[])objectArray2, (String)"V398dXpCQj1ISi9Na29SboeIhopoh0OGfHt+XWB8fWFXGlZ1U3dVVk9QUU1LTAtxZGhpZWNnamZ8e14gW39iYRQzFjo4NDU5cSsxLRAvMi5EQ0ZFSIYqRjw7QUJAP0I+FBM=", (String)"ek5zbU5M", (int)IIIllIIliIIl[23], (String)"eG83enyBendFQ0pJRS5shW+Ifm9yg3FEfIJ5iXl+in4ZfFlNaEtfblRoVg==", (int)IIIllIIliIIl[24], (String)"M1ZkWnlve3EycHZwdi1MeIV/fHI6R2WIhHqGP3uHe4MaeUtUTFFdJw==", (String)"fX93", (int)IIIllIIliIIl[25], (int)IIIllIIliIIl[26], (int)IIIllIIliIIl[27]);
        int n2 = (0x18632C73 | 0xF2037462) - (0x18632C73 & 0xF2037462);
        int cfr_ignored_1 = n2 + -234654622;
    }

    /*
     * Exception decompiling
     */
    public static void IiIIlliIIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [75[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static MethodHandle iIIIlIlIIl(String var0, String var1_1, int var2_2, String var3_3, int var4_4, String var5_5, String var6_6, int var7_7, int var8_8, int var9_9) {
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
     * Exception decompiling
     */
    public static Class Iliilliiilii(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE]], but top level block is 1[TRYBLOCK]
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
    private boolean preventDrop() {
        int n;
        int n2 = n = (0x1F8C83EA | 0xBF31B768) - (0x1F8C83EA & 0xBF31B768);
        if (405689224 >= n2 + -1087260824 - (n2 & 0xBF31B768) * 2) {
        }
        Object[] objectArray = new Object[26];
        objectArray[6] = IIIllIIliIIl[236];
        objectArray[2] = IIIllIIliIIl[237];
        objectArray[15] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[15] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[15]).intValue() & (Integer)objectArray[2];
        objectArray[2] = IIIllIIliIIl[238];
        objectArray[15] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[15] | (Integer)objectArray[2]) + ((Integer)objectArray[15] & (Integer)objectArray[2]);
        Object[] objectArray2 = new Object[((Integer)objectArray[6]).intValue()];
        objectArray[11] = IIIllIIliIIl[239];
        objectArray[2] = IIIllIIliIIl[240];
        objectArray[15] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[15] - ~((Integer)objectArray[2]).intValue() - 1;
        objectArray[2] = IIIllIIliIIl[241];
        objectArray[15] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[15] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[15]).intValue() & (Integer)objectArray[2];
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        return (boolean)Iliilliiilii.IIIIllIIIl("33582ca9-e4d7-49e5-a976-bf2a38a462dc", (Object)Iliilliiilii.IIIIllIIIl("7fbecdcb-86f7-48b6-a9e3-39d845dbbd29", (long)-8506667080415031007L, (Object[])objectArray2, (String)"ZY2Kg4hQUEtWWD1beX1gfJWWlJh2lVGUiomMa26Ki29lKGSDYYVjZF1eX1tZWhl/cnZ3c3F1eHSKiWwuaY1wbyJBJEhGQkNHfzk/Ox49QDxSUVRTVpQ4VEpJT1BOTVBMIiE=", (String)"WFEwSW9O", (int)IIIllIIliIIl[242], (String)"hn1FiIqPiIVTUVhXUzx6k32WjH2AkX9SipCHl4eMmIwnimdbdlltfGJ2ZA==", (int)IIIllIIliIIl[243], (String)"QWRyaId9iX9AfoR+hDtahpONioBIVXOWkoiUTYmViZEoh1liWl9rNQ==", (String)"i42F", (int)IIIllIIliIIl[244], (int)IIIllIIliIIl[245], (int)IIIllIIliIIl[246]), (String)"apKPiI1VVVBbXUJgfoJlgZqbmZ17mlaZj46RcHOPkHRqLWmIZopoaWJjZGBeXx6Ed3t8eHZ6fXmPjnEzbpJ1dCdGKU1LR0hMhD5EQCNCRUFXVllYW5k9WU9OVFVTUlVRJyY=", (String)"dDZzNFRo", (int)IIIllIIliIIl[247], (String)"i4JKjY+UjYpYVl1cWEF/mIKbkYKFloRXj5WMnIyRnZEsj2xge15ygWd7aQ==", (int)IIIllIIliIIl[248], (String)"RmuGgJCCR4mHhYtCYY2CiJGDR1h7", (String)"koxpi44=", (int)IIIllIIliIIl[249], (int)IIIllIIliIIl[250], (int)IIIllIIliIIl[251]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IIIIllIIIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x6E3E23 | 0x79489E96) - (0x6E3E23 & 0x79489E96);
        IlIlllIlilIl = n2 + 2034802326 - (n2 & 0x79489E96) * 2;
        if (10253799 < IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[15];
        try {
            objectArray[7] = MethodHandles.lookup();
            objectArray[8] = ((MethodHandles.Lookup)objectArray[7]).findStatic(Iliilliiilii.class, "iIIIlIlIIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;III)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
            objectArray[11] = methodType.parameterCount();
            objectArray[13] = IIIllIIliIIl[341];
            objectArray[12] = (int)((Integer)objectArray[11]);
            objectArray[9] = (Integer)objectArray[12] + ~((Integer)objectArray[13]).intValue() + 1;
            objectArray[1] = methodType.dropParameterTypes((Integer)objectArray[9], (Integer)objectArray[11]);
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
        catch (UnknownError unknownError) {
            throw unknownError;
        }
        objectArray[14] = MethodHandles.invoker((MethodType)objectArray[1]);
        Class[] classArray = new Class[IIIllIIliIIl[342]];
        classArray[Iliilliiilii.IIIllIIliIIl[343]] = MethodHandle.class;
        objectArray[0] = ((MethodType)objectArray[1]).appendParameterTypes(classArray);
        objectArray[13] = IIIllIIliIIl[344];
        objectArray[12] = (int)((Integer)objectArray[9]);
        objectArray[10] = new int[2 * ((Integer)objectArray[12] | (Integer)objectArray[13]) - ((Integer)objectArray[12] ^ (Integer)objectArray[13])];
        int n3 = (0x28641CCD | 0x4DE49755) - (0x28641CCD & 0x4DE49755);
        int cfr_ignored_0 = n3 + 1306826581;
        ((int[])objectArray[10])[Iliilliiilii.IIIllIIliIIl[345]] = (Integer)objectArray[9];
        objectArray[6] = IIIllIIliIIl[346];
        block13: while (true) {
            objectArray[13] = IIIllIIliIIl[347];
            objectArray[12] = (int)((Integer)objectArray[9]);
            int n4 = (Integer)objectArray[6] < (Integer)objectArray[12] - ~((Integer)objectArray[13]).intValue() - 1 ? (0x88070FD | 0x686DEB37) - (0x88070FD & 0x686DEB37) : (0xA8BB7572 | 0x686DEB37) - (0xA8BB7572 & 0x686DEB37);
            while (true) {
                int n5 = n4;
                switch (n5 + 1752034103 - (n5 & 0x686DEB37) * 2) {
                    case -581267678: {
                        objectArray[13] = IIIllIIliIIl[348];
                        objectArray[12] = (int)((Integer)objectArray[6]);
                        ((int[])objectArray[10])[((Integer)objectArray[6]).intValue()] = (Integer)objectArray[12] + ~((Integer)objectArray[13]).intValue() + 1;
                        objectArray[6] = (Integer)objectArray[6] + 1;
                        continue block13;
                    }
                    case -1464109710: {
                        objectArray[5] = MethodHandles.permuteArguments((MethodHandle)objectArray[14], (MethodType)objectArray[0], (int[])objectArray[10]);
                        objectArray[3] = MethodHandles.collectArguments((MethodHandle)objectArray[5], (Integer)objectArray[9], (MethodHandle)objectArray[8]);
                        return new ConstantCallSite((MethodHandle)objectArray[3]);
                    }
                }
                n4 = (0xDD5A8F22 | 0x686DEB37) - (0xDD5A8F22 & 0x686DEB37);
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean preventStorage() {
        if (IiIlliIliiIl) {
        }
        Object[] objectArray = new Object[26];
        objectArray[19] = IIIllIIliIIl[252];
        objectArray[7] = IIIllIIliIIl[253];
        objectArray[4] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[4] - ~((Integer)objectArray[7]).intValue() - 1;
        objectArray[7] = IIIllIIliIIl[254];
        objectArray[4] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[4] ^ (Integer)objectArray[7]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[7]);
        Object[] objectArray2 = new Object[((Integer)objectArray[19]).intValue()];
        objectArray[10] = IIIllIIliIIl[255];
        objectArray[7] = IIIllIIliIIl[256];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[4] + ~((Integer)objectArray[7]).intValue() + 1;
        objectArray[7] = IIIllIIliIIl[257];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[4] | (Integer)objectArray[7]) & ~((Integer)objectArray[4] & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[10]).intValue()] = this;
        return (boolean)Iliilliiilii.IIIIllIIIl("1d701f45-bbf0-41ae-b3d3-1da2a39a2aa1", (Object)Iliilliiilii.IIIIllIIIl("d48feae6-dd20-4164-af57-c74141cca290", (long)-3928385589019168534L, (Object[])objectArray2, (String)"a5OQiY5WVlFcXkNhf4Nmgpucmp58m1eakI+ScXSQkXVrLmqJZ4tpamNkZWFfYB+FeHx9eXd7fnqQj3I0b5N2dShHKk5MSElNhT9FQSRDRkJYV1pZXJo+WlBPVVZUU1ZSKCc=", (String)"dHF3ZHdY", (int)IIIllIIliIIl[258], (String)"jINLjpCVjotZV15dWUKAmYOckoOGl4VYkJaNnY2SnpItkG1hfF9zgmh8ag==", (int)IIIllIIliIIl[259], (String)"R2p4bo2Dj4VGhIqEikFgjJmTkIZOW3mcmI6aU4+bj5cujV9oYGVxOw==", (String)"kZOL", (int)IIIllIIliIIl[260], (int)IIIllIIliIIl[261], (int)IIIllIIliIIl[262]), (String)"aJCNhotTU05ZW0BefIBjf5iZl5t5mFSXjYyPbnGNjnJoK2eGZIhmZ2BhYl5cXRyCdXl6dnR4e3eNjG8xbJBzciVEJ0tJRUZKgjxCPiFAQz9VVFdWWZc7V01MUlNRUFNPJSQ=", (String)"R2h6dkhD", (int)IIIllIIliIIl[263], (String)"iYBIi42Si4hWVFtaVj99loCZj4CDlIJVjZOKmoqPm48qjWpeeVxwf2V5Zw==", (int)IIIllIIliIIl[264], (String)"RGmEfo6ARYeFg4lAX4uAho+BRVZ5", (String)"kIpniYw=", (int)IIIllIIliIIl[265], (int)IIIllIIliIIl[266], (int)IIIllIIliIIl[267]);
    }
}

