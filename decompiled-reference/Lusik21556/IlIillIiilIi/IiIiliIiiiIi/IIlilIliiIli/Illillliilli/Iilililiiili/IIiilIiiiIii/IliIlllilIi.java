/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.TabCompleter
 *  org.jetbrains.annotations.NotNull
 */
package Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;

public final class IliIlllilIi
implements CommandExecutor,
TabCompleter {
    public static int[] lIiiIiIlilli;
    public Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi liiiIIllIl;
    private static List<String> IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    /*
     * Enabled aggressive block sorting
     */
    public List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] stringArray) {
        if (IIIllIIliIIl) {
            int n;
            int n2 = n = (0x39 | 0x996AA8B3) - (0x39 & 0x996AA8B3);
            int cfr_ignored_0 = n2 + -1721063245 - (n2 & 0x996AA8B3) * 2;
        }
        Object[] objectArray = new Object[35];
        objectArray[13] = lIiiIiIlilli[42];
        objectArray[32] = lIiiIiIlilli[43];
        objectArray[14] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[14] | (Integer)objectArray[32]) & ~((Integer)objectArray[14] & (Integer)objectArray[32]);
        objectArray[32] = lIiiIiIlilli[44];
        objectArray[14] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[14] + ~((Integer)objectArray[32]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[15] = lIiiIiIlilli[45];
        objectArray[32] = lIiiIiIlilli[46];
        objectArray[14] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[14] & ~((Integer)objectArray[32]).intValue() | ~((Integer)objectArray[14]).intValue() & (Integer)objectArray[32];
        objectArray[32] = lIiiIiIlilli[47];
        objectArray[14] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[14] & ~((Integer)objectArray[32]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[26] = lIiiIiIlilli[48];
        objectArray[32] = lIiiIiIlilli[49];
        objectArray[14] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[14] ^ (Integer)objectArray[32]) + 2 * ((Integer)objectArray[14] & (Integer)objectArray[32]);
        objectArray[32] = lIiiIiIlilli[50];
        objectArray[14] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[14] | (Integer)objectArray[32]) - ((Integer)objectArray[14] ^ (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[26]).intValue()] = commandSender;
        objectArray[24] = lIiiIiIlilli[51];
        objectArray[32] = lIiiIiIlilli[52];
        objectArray[14] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[14] | (Integer)objectArray[32]) & ~((Integer)objectArray[14] & (Integer)objectArray[32]);
        objectArray[32] = lIiiIiIlilli[53];
        objectArray[14] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[14] | (Integer)objectArray[32]) & (~((Integer)objectArray[14]).intValue() | ~((Integer)objectArray[32]).intValue());
        objectArray2[((Integer)objectArray[24]).intValue()] = command;
        objectArray[16] = lIiiIiIlilli[54];
        objectArray[32] = lIiiIiIlilli[55];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[14] ^ (Integer)objectArray[32]) - 2 * (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[32]);
        objectArray[32] = lIiiIiIlilli[56];
        objectArray[14] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[14] & ~((Integer)objectArray[32]).intValue() | ~((Integer)objectArray[14]).intValue() & (Integer)objectArray[32];
        objectArray2[((Integer)objectArray[16]).intValue()] = string;
        objectArray[17] = lIiiIiIlilli[57];
        objectArray[32] = lIiiIiIlilli[58];
        objectArray[14] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[14] & ~((Integer)objectArray[32]).intValue()) - (~((Integer)objectArray[14]).intValue() & (Integer)objectArray[32]);
        objectArray[32] = lIiiIiIlilli[59];
        objectArray[14] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[14] | (Integer)objectArray[32]) + ((Integer)objectArray[14] & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[17]).intValue()] = stringArray;
        return (List)((Object)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("99349fcd-14dc-4e04-b48c-cd25473fa63c", (long)3353720267421245854L, (Object[])objectArray2, (String)"gntDgHZ5gIO9v7CxvbR2fXtyhHtob2mulmhhkWFkkGShhmGVUqdbhK5SrA==", (int)lIiiIiIlilli[60], (int)lIiiIiIlilli[61], (String)"P1xuYIGLd4m4eox6jLWWgo2Lhnig042SnmCcq2eTZ5+ggZeepqlVkw==", (int)lIiiIiIlilli[62], (String)"hYuD", (int)lIiiIiIlilli[63], (String)"TWhQRFFp", (String)"Y4uGfYC4uLWysLuld6uIdHOvjI1vs5Cutpe0lWebuJmen7ydnYOAXKZahFiqq4hUrpCMUE+zTUxLt7RIR7uHmb5CvEDCPsDBxjrE+urryMkz78zN0vPQ0en3KdX6JiUk3iL83Q==", (int)lIiiIiIlilli[64]));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIlllIlliIll(String var0, int var1_1, int var2_2) {
        v0 = var11_3 = (4506582 | -755007674) - (4506582 & -755007674);
        if (2818095 >= v0 + -755007674 - (v0 & -755007674) * 2) {
        }
        var9_5 = new Object[6];
        var9_5[3] = Base64.getDecoder().decode(var0);
        var9_5[0] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[128];
        if (true) ** GOTO lbl34
        block8: while (true) {
            v1 = var8_4;
            switch (v1 + 1467525663 - (v1 & 1467525663) * 2) {
                case -843463745: {
                    return new String((byte[])var9_5[3], StandardCharsets.UTF_8);
                }
                default: {
                    if ((Integer)var9_5[0] >= ((byte[])var9_5[3]).length) return new String((byte[])var9_5[3], StandardCharsets.UTF_8);
                    var8_4 = (876601757 | 1467525663) - (876601757 & 1467525663);
                    continue block8;
                }
                case 876601757: 
            }
            v2 = (byte[])var9_5[3];
            v3 = (Integer)var9_5[0];
            var9_5[1] = (int)((Integer)var9_5[0]);
            var9_5[2] = var1_1;
            var9_5[1] = (Integer)var9_5[2] + ~((Integer)var9_5[1]).intValue() + 1;
            var9_5[2] = (int)v2[v3];
            var9_5[1] = var2_2;
            var9_5[2] = ((Integer)var9_5[2] | (Integer)var9_5[1]) & (~((Integer)var9_5[2]).intValue() | ~((Integer)var9_5[1]).intValue());
            v2[v3] = (byte)(2 * ((Integer)var9_5[2] & ~((Integer)var9_5[1]).intValue()) - ((Integer)var9_5[2] ^ (Integer)var9_5[1]));
            var9_5[0] = (Integer)var9_5[0] + 1;
lbl34:
            // 2 sources

            var8_4 = (573809479 | 1467525663) - (573809479 & 1467525663);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public IliIlllilIi(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x610763FE | 0x12A53D4D) - (0x610763FE & 0x12A53D4D);
        if (1438916570 >= n2 + 312819021 - (n2 & 0x12A53D4D) * 2) {
            int n3 = n = (0x1565C474 | 0x12A53D4D) - (0x1565C474 & 0x12A53D4D);
            iliIiiliiiii = n3 + 312819021 - (n3 & 0x12A53D4D) * 2;
        }
        Object[] objectArray = new Object[28];
        objectArray[12] = lIiiIiIlilli[0];
        objectArray[18] = lIiiIiIlilli[1];
        objectArray[22] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[22] & ~((Integer)objectArray[18]).intValue()) - ((Integer)objectArray[22] ^ (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[2];
        objectArray[22] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[22] & ~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[18];
        Object[] objectArray2 = new Object[((Integer)objectArray[12]).intValue()];
        objectArray[4] = lIiiIiIlilli[3];
        objectArray[18] = lIiiIiIlilli[4];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[22] + ~((Integer)objectArray[18]).intValue() + 1;
        objectArray[18] = lIiiIiIlilli[5];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[22] & ~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[18];
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        objectArray[14] = lIiiIiIlilli[6];
        objectArray[18] = lIiiIiIlilli[7];
        objectArray[22] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[22] ^ (Integer)objectArray[18]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[18]);
        objectArray[18] = lIiiIiIlilli[8];
        objectArray[22] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[22] | (Integer)objectArray[18]) + ((Integer)objectArray[22] & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[14]).intValue()] = iliIlllilIi;
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("762b6e5a-f465-4cb3-af96-94a15b50a2f7", (long)6915187352688482922L, (Object[])objectArray2, (String)"gYa8fXV8h4a+sr+8vrFxeHhvm2Zram6rlWVunGJhl2Giu16oUaJcga1fow==", (int)lIiiIiIlilli[9], (int)lIiiIiIlilli[10], (String)"PKGRnYKOcIy7d4N3j7CRh46WmWWj1oqXnW2TpmSWYJqjvKijpaxSlg==", (int)lIiiIiIlilli[11], (String)"hnZ8", (int)lIiiIiIlilli[12], (String)"UnZEemps", (String)"YHZ5gIO9v7CxvbSodK6PcXCyk5BstpertZq7mGSev5ydooOgnoaHWaVXi1Wpro9RrY2TTUy2SklIurtFRL6AnL0/wz3BO8fExTfL9+nuz8ww8tPQ0fbX1Or6Jtj5IyIh3R/D4A==", (int)lIiiIiIlilli[13]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] stringArray) {
        int n;
        int n2 = n = (0x1759FD5F | 0x4E3211A5) - (0x1759FD5F & 0x4E3211A5);
        iliIiiliiiii = n2 + 1311904165 - (n2 & 0x4E3211A5) * 2;
        if (593380740 < iliIiiliiiii) {
            throw null;
        }
        Object[] objectArray = new Object[90];
        objectArray[47] = lIiiIiIlilli[14];
        objectArray[73] = lIiiIiIlilli[15];
        objectArray[22] = (int)((Integer)objectArray[47]);
        objectArray[47] = ((Integer)objectArray[22] | (Integer)objectArray[73]) & ~((Integer)objectArray[22] & (Integer)objectArray[73]);
        objectArray[73] = lIiiIiIlilli[16];
        objectArray[22] = (int)((Integer)objectArray[47]);
        objectArray[47] = ((Integer)objectArray[22] | (Integer)objectArray[73]) & (~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[73]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[47]).intValue()];
        objectArray[46] = lIiiIiIlilli[17];
        objectArray[73] = lIiiIiIlilli[18];
        objectArray[22] = (int)((Integer)objectArray[46]);
        objectArray[46] = (Integer)objectArray[22] - ~((Integer)objectArray[73]).intValue() - 1;
        objectArray[73] = lIiiIiIlilli[19];
        objectArray[22] = (int)((Integer)objectArray[46]);
        objectArray[46] = (Integer)objectArray[22] + ~((Integer)objectArray[73]).intValue() + 1;
        objectArray2[((Integer)objectArray[46]).intValue()] = this;
        objectArray[23] = lIiiIiIlilli[20];
        objectArray[73] = lIiiIiIlilli[21];
        objectArray[22] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[22] | (Integer)objectArray[73]) & (~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[73]).intValue());
        objectArray[73] = lIiiIiIlilli[22];
        objectArray[22] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[22] + ~((Integer)objectArray[73]).intValue() + 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = commandSender;
        objectArray[18] = lIiiIiIlilli[23];
        objectArray[73] = lIiiIiIlilli[24];
        objectArray[22] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[22] | (Integer)objectArray[73]) & (~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[73]).intValue());
        objectArray[73] = lIiiIiIlilli[25];
        objectArray[22] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[22] - ~((Integer)objectArray[73]).intValue() - 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = command;
        objectArray[71] = lIiiIiIlilli[26];
        objectArray[73] = lIiiIiIlilli[27];
        objectArray[22] = (int)((Integer)objectArray[71]);
        objectArray[71] = ((Integer)objectArray[22] | (Integer)objectArray[73]) - ((Integer)objectArray[22] & (Integer)objectArray[73]);
        objectArray[73] = lIiiIiIlilli[28];
        objectArray[22] = (int)((Integer)objectArray[71]);
        objectArray[71] = ((Integer)objectArray[22] ^ (Integer)objectArray[73]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[73]);
        objectArray2[((Integer)objectArray[71]).intValue()] = string;
        objectArray[2] = lIiiIiIlilli[29];
        objectArray[73] = lIiiIiIlilli[30];
        objectArray[22] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[22] | (Integer)objectArray[73]) + ((Integer)objectArray[22] & (Integer)objectArray[73]);
        objectArray[73] = lIiiIiIlilli[31];
        objectArray[22] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[22] & ~((Integer)objectArray[73]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[73];
        objectArray2[((Integer)objectArray[2]).intValue()] = stringArray;
        return (boolean)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("6a66892d-7772-4282-8c51-27808552c73c", (Object)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("7031996e-3098-4716-ada5-e886a9a21528", (long)-4371555522906806250L, (Object[])objectArray2, (String)"gHm9fnR7hoW/vb6/v7Zwe3lwmmVqbW+olGpvn2NmlmKjhF+rUKVdgqxQog==", (int)lIiiIiIlilli[32], (int)lIiiIiIlilli[33], (String)"PV6QnoOJcY+6eIJ0jreQhI+JmGai0YuUnGKSpWWRYZmig6mgpKtTlQ==", (int)lIiiIiIlilli[34], (String)"h4l9", (int)lIiiIiIlilli[35], (String)"NGZXZEdV", (String)"YYl4g4K6vrOwsrWrdamOcnGtkpNtsZaotJW6m2WZvp+cnYKjn4GGWqRYilaoqY5SrJKSTk2xS0pJtbpGRbmBn7xAwj7APMbHxDjK9Ojpzs8x7dLT0PHW1+v1J9v4JCMi3CDC4w==", (int)lIiiIiIlilli[36]), (String)"g3hCf3d6gYS8vLG+vLd3enpxhWRpbGipl2tgnmBnkWOghWCqU6Rag69RrQ==", (int)lIiiIiIlilli[37], (int)lIiiIiIlilli[38], (String)"PmF+inSIv3uPe4O0lYOKioV5v9Kz", (int)lIiiIiIlilli[39], (String)"ioJdfXY=", (int)lIiiIiIlilli[40], (String)"RWVJT0Q5", (String)"YoiHgoG7ubKzs7qqdqiJc3KsjZJusJGpt5S1mmaYuZ6fnL2inICBW6dZhVerqIlTr5ONT06wTEtKtLVHRriGnr9BvT/DPcHGxznF9evoyc4y7M3S0/DR1uj0KNr7JSQj3yH94g==", (int)lIiiIiIlilli[41]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$onTabComplete$0(String string, String string2) {
        if (IIIllIIliIIl) {
            int n = (0x3C3EF051 | 0xF184ADC3) - (0x3C3EF051 & 0xF184ADC3);
        }
        Object[] objectArray = new Object[28];
        objectArray[8] = lIiiIiIlilli[65];
        objectArray[4] = lIiiIiIlilli[66];
        objectArray[26] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[26] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[26]).intValue() & (Integer)objectArray[4];
        objectArray[4] = lIiiIiIlilli[67];
        objectArray[26] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[26] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[4]);
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[20] = lIiiIiIlilli[68];
        objectArray[4] = lIiiIiIlilli[69];
        objectArray[26] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[26] | (Integer)objectArray[4]) & (~((Integer)objectArray[26]).intValue() | ~((Integer)objectArray[4]).intValue());
        objectArray[4] = lIiiIiIlilli[70];
        objectArray[26] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[26] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[26]).intValue() & (Integer)objectArray[4];
        objectArray2[((Integer)objectArray[20]).intValue()] = string;
        objectArray[16] = lIiiIiIlilli[71];
        objectArray[4] = lIiiIiIlilli[72];
        objectArray[26] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[26] | (Integer)objectArray[4]) & ~((Integer)objectArray[26] & (Integer)objectArray[4]);
        objectArray[4] = lIiiIiIlilli[73];
        objectArray[26] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[26] + ~((Integer)objectArray[4]).intValue() + 1;
        objectArray2[((Integer)objectArray[16]).intValue()] = string2;
        return (boolean)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("189dd6ce-8fca-4acd-970a-06448dc11f99", (Object)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("babb0972-72cd-4afc-a4cc-b3bc1a9f2efc", (long)-6025099558523823404L, (Object[])objectArray2, (String)"hXpAgYl4g4K6vrOwsrV1fHxzh3p3bmqvkWlikG5lk2Wmh2KUbaZYhalTrw==", (int)lIiiIiIlilli[74], (int)lIiiIiIlilli[75], (String)"OF1tYX6KdIi/e497g7SVg4qKhXm/0o6TmWGfqmiSZJ6ngJSfmahWkg==", (int)lIiiIiIlilli[76], (String)"goqA", (int)lIiiIiIlilli[77], (String)"d0wyVTNS", (String)"ZIqFfH+5u7S1sbikeKqLdXSuj4xwspOvsZa3lGiau5iZnr+cooKDXaFbh1mlqotVqZGPUVCyTk1MtrdJSLqEmLlDv0G9P8PAwTvH++Xqy8g07s/MzfLT0O72KtT1JyYl2SP/3A==", (int)lIiiIiIlilli[78]), (String)"hH1BgoiHgoG7ubKzs7p0f310hnl2cWuskG5jk29qkmangGOXbJlZhqhUrg==", (int)lIiiIiIlilli[79], (int)lIiiIiIlilli[80], (String)"OWR9d4t1vH6IfoC5mo6Jj4J8vM+s", (int)lIiiIiIlilli[81], (String)"jYdegIk=", (int)lIiiIiIlilli[82], (String)"bVpTVHRW", (String)"ZY2Ef35Gure0trmneaWKdnWpjo9xrZKssJG2l2mVupuYmb6fo72CXqBchlqkpYpWqJaOUlGtT05NsbZKSbWFm7hEvkK8QMLDwDzG+OTlyss16c7PzO3S0+/xK9f0KCcm2CT+3w==", (int)lIiiIiIlilli[83]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 0x15 & 1;
        }
        Object[] objectArray = new Object[25];
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.Illlllllilll();
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("2b6022be-acca-429d-a2e5-85768e463524", IliIlllilIi.class, (String)"h3xGg4uGfYC4uLWysLt7fn51gXh1cHStk29kkmxrnWekgWSWb5hmh6tVqQ==", (int)lIiiIiIlilli[84], (int)lIiiIiIlilli[85], (String)"OmV6doh0Q3+Lf4e4rXmNcHG6yZk=", (int)lIiiIiIlilli[86], (String)"hoZxe2iA", (int)lIiiIiIlilli[87], (String)"WEg4a0s1", (String)"ZoyDfn1HRba3t76meqSFd3aoiY5yrI2ts5CxlmqUtZqbmLmeoLy9X6NdgVunpIVXq5eJU1KsUE9OsLFLSrSKmrtFuUO/Qb3Cwz3B+efkxco26MnOz+zN0uzwLNb3KSgn2yX53g==", (int)lIiiIiIlilli[88]);
        objectArray[20] = lIiiIiIlilli[89];
        objectArray[19] = lIiiIiIlilli[90];
        objectArray[2] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[2] & ~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[19];
        objectArray[19] = lIiiIiIlilli[91];
        objectArray[2] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[2] & ~((Integer)objectArray[19]).intValue()) - (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[19]);
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.IlIlllIlilIl("f600f5ec-2991-4984-9054-1c9e0cf05f08", (long)-383391888254501396L, (Object[])new Object[((Integer)objectArray[20]).intValue()], (String)"hn9HhIqFfH+5u7S1sbh6cX92gH90c3WykmxllW1onGilgmWRbptnuKpWqA==", (int)lIiiIiIlilli[92], (int)lIiiIiIlilli[93], (String)"O1hqZH13i3W8foh+gLmajomPgny8z5GOmmSYr2ufa5OkhZOampVprw==", (int)lIiiIiIlilli[94], (String)"gY+H", (int)lIiiIiIlilli[95], (String)"SVJlbmE4", (String)"Z4+CeXxEREm2tL+he6eEeHeriIlzr4yyspOwkWuXtJWam7iZob+8YKJegFymp4RYqpSIVFOvUVBPs7BMS7eLlbpGuES+Qry9wj7A/ubnxMU368jJzu/Mze3zLdH2Kiko2ib42Q==", (int)lIiiIiIlilli[96]);
        int n = (0x47C3F78A | 0xF6AA7776) - (0x47C3F78A & 0xF6AA7776);
        int cfr_ignored_1 = n + -156600458;
    }

    /*
     * Exception decompiling
     */
    public static void Illlllllilll() {
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
     * Exception decompiling
     */
    public static MethodHandle IiIlliIliiIl(String var0, int var1_1, int var2_2, String var3_3, int var4_4, String var5_5, int var6_6, String var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 3[TRYBLOCK], 2[TRYBLOCK]], but top level block is 22[SWITCH]
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
    public static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        v0 = var24_3 = (683491903 | -243061181) - (683491903 & -243061181);
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.iliIiiliiiii = v0 + -243061181 - (v0 & -243061181) * 2;
        if (1144735778 < Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.iliIiiliiiii) {
            71 + 79;
        }
        var22_5 = new Object[19];
        var22_5[11] = MethodHandles.lookup();
        var22_5[10] = ((MethodHandles.Lookup)var22_5[11]).findStatic(IliIlllilIi.class, "IiIlliIliiIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
        var22_5[7] = var2_2.parameterCount();
        var16_4 = (132468658 | 1046357033) - (132468658 & 1046357033);
        var16_4 + 1046357033;
        var22_5[8] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[97];
        var22_5[18] = (int)((Integer)var22_5[7]);
        var17_6 = (-1135139558 | -2026203798) - (-1135139558 & -2026203798);
        var17_6 + -2026203798;
        var22_5[9] = ((Integer)var22_5[18] ^ (Integer)var22_5[8]) - 2 * (~((Integer)var22_5[18]).intValue() & (Integer)var22_5[8]);
        var18_7 = (1356773656 | 39244709) - (1356773656 & 39244709);
        var18_7 + 39244709;
        var22_5[17] = var2_2.dropParameterTypes((Integer)var22_5[9], (Integer)var22_5[7]);
        var22_5[15] = MethodHandles.invoker((MethodType)var22_5[17]);
        v1 = new Class[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[98]];
        v1[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[99]] = MethodHandle.class;
        var22_5[13] = ((MethodType)var22_5[17]).appendParameterTypes(v1);
        var19_8 = (564503572 | -1289048944) - (564503572 & -1289048944);
        var19_8 + -1289048944;
        var22_5[8] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[100];
        var22_5[18] = (int)((Integer)var22_5[9]);
        var22_5[0] = new int[(Integer)var22_5[18] - ~((Integer)var22_5[8]).intValue() - 1];
        ((int[])var22_5[0])[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[101]] = (Integer)var22_5[9];
        var22_5[14] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[102];
        if (true) ** GOTO lbl60
        block12: while (true) {
            v2 = var20_9;
            switch (v2 + -1503754572 - (v2 & -1503754572) * 2) {
                default: {
                    var22_5[8] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[103];
                    var22_5[18] = (int)((Integer)var22_5[9]);
                    if ((Integer)var22_5[14] < (Integer)var22_5[18] - ~((Integer)var22_5[8]).intValue() - 1) {
                        var20_9 = (-1963743269 | -1503754572) - (-1963743269 & -1503754572);
                        continue block12;
                    }
                    ** GOTO lbl62
                }
                case -1963743269: {
                    var22_5[8] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IliIlllilIi.lIiiIiIlilli[104];
                    var22_5[18] = (int)((Integer)var22_5[14]);
                    ((int[])var22_5[0])[((Integer)var22_5[14]).intValue()] = (Integer)var22_5[18] + ~((Integer)var22_5[8]).intValue() + 1;
                    var22_5[14] = (Integer)var22_5[14] + 1;
lbl60:
                    // 2 sources

                    var20_9 = (-858493605 | -1503754572) - (-858493605 & -1503754572);
                    continue block12;
                }
lbl62:
                // 1 sources

                var20_9 = (-1054202563 | -1503754572) - (-1054202563 & -1503754572);
                continue block12;
                case -1054202563: 
            }
            break;
        }
        var22_5[16] = MethodHandles.permuteArguments((MethodHandle)var22_5[15], (MethodType)var22_5[13], (int[])var22_5[0]);
        var22_5[6] = MethodHandles.collectArguments((MethodHandle)var22_5[16], (Integer)var22_5[9], (MethodHandle)var22_5[10]);
        var21_10 = (-203953904 | 146318441) - (-203953904 & 146318441);
        var21_10 + 146318441;
        v3((MethodHandle)var22_5[6]);
        return v3;
    }

    /*
     * Exception decompiling
     */
    public static Class iliIiiliiiii(String var0) {
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
     * Exception decompiling
     */
    public static String IIIllIIliIIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 13[SWITCH]
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

