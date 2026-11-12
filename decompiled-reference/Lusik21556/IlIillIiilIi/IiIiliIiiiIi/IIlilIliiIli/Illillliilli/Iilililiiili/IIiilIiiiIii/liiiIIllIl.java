/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 */
package Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.BindException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class liiiIIllIl
implements CommandExecutor {
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    private IliIlllilIi IliIlllilIi;
    public static int[] IilliliilIIi;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void IlIlllIlilIl() {
        int n;
        int n2;
        int n3 = n2 = (0x4C4D3FE4 | 0x5ACFD035) - (0x4C4D3FE4 & 0x5ACFD035);
        if (60625554 >= n3 + 1523568693 - (n3 & 0x5ACFD035) * 2) {
            throw null;
        }
        Object[] objectArray = new Object[3];
        try {
            objectArray[1] = 30797;
            objectArray[0] = 30750;
            IilliliilIIi = new int[((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1])];
            objectArray[1] = 21360;
            objectArray[0] = 21334;
            objectArray[1] = 21360;
            objectArray[0] = 21292;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
            objectArray[1] = 68571;
            objectArray[0] = 68604;
            objectArray[1] = 68571;
            objectArray[0] = 68569;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
            objectArray[1] = 7428;
            objectArray[0] = 7482;
            objectArray[1] = 7428;
            objectArray[0] = 7512;
            liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
            objectArray[1] = 4379;
            objectArray[0] = 4395;
            objectArray[1] = 4379;
            objectArray[0] = -1179278262;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
            objectArray[1] = 56700;
            objectArray[0] = 56685;
            objectArray[1] = 56700;
            objectArray[0] = -56659;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
            n = (0x1FAB6173 | 0x4801B013) - (0x1FAB6173 & 0x4801B013);
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
        catch (InstantiationError instantiationError) {
            throw instantiationError;
        }
        block23: while (true) {
            int n4 = n;
            switch (n4 + 1208070163 - (n4 & 0x4801B013) * 2) {
                case -830508857: {
                    objectArray[1] = 63356;
                    objectArray[0] = 63310;
                    objectArray[1] = 63356;
                    objectArray[0] = 63264;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 7350;
                    objectArray[0] = 7330;
                    objectArray[1] = 7350;
                    objectArray[0] = -7410;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 64076;
                    objectArray[0] = 64092;
                    objectArray[1] = 64076;
                    objectArray[0] = 64028;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 11223;
                    objectArray[0] = 11244;
                    objectArray[1] = 11223;
                    objectArray[0] = 11219;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 26234;
                    objectArray[0] = 26154;
                    objectArray[1] = 26234;
                    objectArray[0] = 26197;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 26789;
                    objectArray[0] = 26800;
                    objectArray[1] = 26789;
                    objectArray[0] = -26765;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    n = (0xB1D3D0A4 | 0x4801B013) - (0xB1D3D0A4 & 0x4801B013);
                    continue block23;
                }
                case -1311518556: {
                    objectArray[1] = 737;
                    objectArray[0] = 681;
                    objectArray[1] = 737;
                    objectArray[0] = 743;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 19391;
                    objectArray[0] = 19336;
                    objectArray[1] = 19391;
                    objectArray[0] = 19391;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 62794;
                    objectArray[0] = 62731;
                    objectArray[1] = 62794;
                    objectArray[0] = -62795;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    n = (0xB6766142 | 0x4801B013) - (0xB6766142 & 0x4801B013);
                    continue block23;
                }
                case -1233755838: {
                    objectArray[1] = 17209;
                    objectArray[0] = 17200;
                    objectArray[1] = 17209;
                    objectArray[0] = 17209;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 19542;
                    objectArray[0] = 19575;
                    objectArray[1] = 19542;
                    objectArray[0] = 19543;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 62364;
                    objectArray[0] = 62427;
                    objectArray[1] = 62364;
                    objectArray[0] = 62361;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    n = (0x2E69A479 | 0x4801B013) - (0x2E69A479 & 0x4801B013);
                    continue block23;
                }
                case 778675321: {
                    objectArray[1] = 39723;
                    objectArray[0] = 39716;
                    objectArray[1] = 39723;
                    objectArray[0] = -39745;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 1556;
                    objectArray[0] = 1547;
                    objectArray[1] = 1556;
                    objectArray[0] = -1619;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 65226;
                    objectArray[0] = 65270;
                    objectArray[1] = 65226;
                    objectArray[0] = 65174;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 1518;
                    objectArray[0] = 1526;
                    objectArray[1] = 1518;
                    objectArray[0] = 1488;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 68956;
                    objectArray[0] = 68943;
                    objectArray[1] = 68956;
                    objectArray[0] = -68896;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 29894;
                    objectArray[0] = 29824;
                    objectArray[1] = 29894;
                    objectArray[0] = 29890;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    n = (0x8DE5062A | 0x4801B013) - (0x8DE5062A & 0x4801B013);
                    continue block23;
                }
                case -1914370518: {
                    objectArray[1] = 54501;
                    objectArray[0] = 54520;
                    objectArray[1] = 54501;
                    objectArray[0] = 54466;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 5283;
                    objectArray[0] = 5301;
                    objectArray[1] = 5283;
                    objectArray[0] = 5282;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 22159;
                    objectArray[0] = 22189;
                    objectArray[1] = 22159;
                    objectArray[0] = -1411197333;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 67840;
                    objectArray[0] = 67883;
                    objectArray[1] = 67840;
                    objectArray[0] = 196535269;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 36551;
                    objectArray[0] = 36572;
                    objectArray[1] = 36551;
                    objectArray[0] = 36529;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 47062;
                    objectArray[0] = 47093;
                    objectArray[1] = 47062;
                    objectArray[0] = 1657267062;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 25300;
                    objectArray[0] = 25311;
                    objectArray[1] = 25300;
                    objectArray[0] = -1307348451;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    n = (0x75B08679 | 0x4801B013) - (0x75B08679 & 0x4801B013);
                    continue block23;
                }
                case 1974503033: {
                    objectArray[1] = 27438;
                    objectArray[0] = 27442;
                    objectArray[1] = 27438;
                    objectArray[0] = -27520;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    n = (0x5A0E20EC | 0x4801B013) - (0x5A0E20EC & 0x4801B013);
                    continue block23;
                }
                case 1510875372: {
                    return;
                }
                default: {
                    objectArray[1] = 44061;
                    objectArray[0] = 44125;
                    objectArray[1] = 44061;
                    objectArray[0] = 44097;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 24097;
                    objectArray[0] = 24082;
                    objectArray[1] = 24097;
                    objectArray[0] = 24107;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 32382;
                    objectArray[0] = 32316;
                    objectArray[1] = 32382;
                    objectArray[0] = 32382;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 55266;
                    objectArray[0] = 55245;
                    objectArray[1] = 55266;
                    objectArray[0] = 831903263;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 45276;
                    objectArray[0] = 45207;
                    objectArray[1] = 45276;
                    objectArray[0] = 45299;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 5528;
                    objectArray[0] = 5553;
                    objectArray[1] = 5528;
                    objectArray[0] = -854429123;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 208;
                    objectArray[0] = 158;
                    objectArray[1] = 208;
                    objectArray[0] = 209;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    n = (0x20C7A7A | 0x4801B013) - (0x20C7A7A & 0x4801B013);
                    continue block23;
                }
                case 34372218: {
                    objectArray[1] = 37798;
                    objectArray[0] = 37795;
                    objectArray[1] = 37798;
                    objectArray[0] = 37883;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 30629;
                    objectArray[0] = 30642;
                    objectArray[1] = 30629;
                    objectArray[0] = -30605;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 26997;
                    objectArray[0] = 26971;
                    objectArray[1] = 26997;
                    objectArray[0] = -1411192431;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    n = (0x4412F36C | 0x4801B013) - (0x4412F36C & 0x4801B013);
                    continue block23;
                }
                case 1142092652: {
                    objectArray[1] = 67533;
                    objectArray[0] = 67580;
                    objectArray[1] = 67533;
                    objectArray[0] = 2127963344;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 37484;
                    objectArray[0] = 37440;
                    objectArray[1] = 37484;
                    objectArray[0] = 37424;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    n = (0x177914EA | 0x4801B013) - (0x177914EA & 0x4801B013);
                    continue block23;
                }
                case 393811178: {
                    objectArray[1] = 24121;
                    objectArray[0] = 24116;
                    objectArray[1] = 24121;
                    objectArray[0] = -1780861581;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 5286;
                    objectArray[0] = 5266;
                    objectArray[1] = 5286;
                    objectArray[0] = 5287;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 9670;
                    objectArray[0] = 9708;
                    objectArray[1] = 9670;
                    objectArray[0] = -1555568708;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 35406;
                    objectArray[0] = 35339;
                    objectArray[1] = 35406;
                    objectArray[0] = 35405;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 62653;
                    objectArray[0] = 62703;
                    objectArray[1] = 62653;
                    objectArray[0] = 62653;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 9900;
                    objectArray[0] = 9877;
                    objectArray[1] = 9900;
                    objectArray[0] = 9901;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 60397;
                    objectArray[0] = 60365;
                    objectArray[1] = 60397;
                    objectArray[0] = -60305;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 6666;
                    objectArray[0] = 6725;
                    objectArray[1] = 6666;
                    objectArray[0] = 6667;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 4280;
                    objectArray[0] = 4262;
                    objectArray[1] = 4280;
                    objectArray[0] = -4221;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 41113;
                    objectArray[0] = 41124;
                    objectArray[1] = 41113;
                    objectArray[0] = 41157;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    n = (0x68DD520A | 0x4801B013) - (0x68DD520A & 0x4801B013);
                    continue block23;
                }
                case 1759334922: {
                    objectArray[1] = 7829;
                    objectArray[0] = 7823;
                    objectArray[1] = 7829;
                    objectArray[0] = 7822;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 29364;
                    objectArray[0] = 29328;
                    objectArray[1] = 29364;
                    objectArray[0] = -1286256660;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 48806;
                    objectArray[0] = 48800;
                    objectArray[1] = 48806;
                    objectArray[0] = 48823;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 47352;
                    objectArray[0] = 47310;
                    objectArray[1] = 47352;
                    objectArray[0] = 47353;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 19910;
                    objectArray[0] = 19855;
                    objectArray[1] = 19910;
                    objectArray[0] = 19911;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 63838;
                    objectArray[0] = 63838;
                    objectArray[1] = 63838;
                    objectArray[0] = -63750;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    n = (0xAEC66058 | 0x4801B013) - (0xAEC66058 & 0x4801B013);
                    continue block23;
                }
                case -1362730920: {
                    objectArray[1] = 11699;
                    objectArray[0] = 11707;
                    objectArray[1] = 11699;
                    objectArray[0] = 11690;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 33664;
                    objectArray[0] = 33731;
                    objectArray[1] = 33664;
                    objectArray[0] = 33665;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    n = (0x5249A821 | 0x4801B013) - (0x5249A821 & 0x4801B013);
                    continue block23;
                }
                case 1380558881: {
                    objectArray[1] = 52240;
                    objectArray[0] = 52254;
                    objectArray[1] = 52240;
                    objectArray[0] = 52300;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 54523;
                    objectArray[0] = 54527;
                    objectArray[1] = 54523;
                    objectArray[0] = 54497;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 37994;
                    objectArray[0] = 37997;
                    objectArray[1] = 37994;
                    objectArray[0] = 37997;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 830;
                    objectArray[0] = 831;
                    objectArray[1] = 830;
                    objectArray[0] = 876;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 57180;
                    objectArray[0] = 57105;
                    objectArray[1] = 57180;
                    objectArray[0] = 57180;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 7726;
                    objectArray[0] = 7707;
                    objectArray[1] = 7726;
                    objectArray[0] = 7726;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 8639;
                    objectArray[0] = 8614;
                    objectArray[1] = 8639;
                    objectArray[0] = -8602;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 61777;
                    objectArray[0] = 61779;
                    objectArray[1] = 61777;
                    objectArray[0] = -61772;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 47740;
                    objectArray[0] = 47700;
                    objectArray[1] = 47740;
                    objectArray[0] = -1411237224;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 60341;
                    objectArray[0] = 60409;
                    objectArray[1] = 60341;
                    objectArray[0] = 60315;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 9239;
                    objectArray[0] = 9263;
                    objectArray[1] = 9239;
                    objectArray[0] = 9238;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 29589;
                    objectArray[0] = 29649;
                    objectArray[1] = 29589;
                    objectArray[0] = 29591;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 31521;
                    objectArray[0] = 31600;
                    objectArray[1] = 31521;
                    objectArray[0] = 31503;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 17793;
                    objectArray[0] = 17828;
                    objectArray[1] = 17793;
                    objectArray[0] = 187037630;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 4456;
                    objectArray[0] = 4434;
                    objectArray[1] = 4456;
                    objectArray[0] = 4457;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
                    objectArray[1] = 11744;
                    objectArray[0] = 11725;
                    objectArray[1] = 11744;
                    objectArray[0] = 11747;
                    liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    n = (0x476C0FA2 | 0x4801B013) - (0x476C0FA2 & 0x4801B013);
                    continue block23;
                }
                case 1198264226: {
                    objectArray[1] = 26490;
                    objectArray[0] = 26416;
                    objectArray[1] = 26490;
                    objectArray[0] = 26491;
                    liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
                    n = (0x76C7DD44 | 0x4801B013) - (0x76C7DD44 & 0x4801B013);
                    continue block23;
                }
                case 1992809796: 
            }
            objectArray[1] = 3637;
            objectArray[0] = 3638;
            objectArray[1] = 3637;
            objectArray[0] = -3652;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
            objectArray[1] = 61382;
            objectArray[0] = 61386;
            objectArray[1] = 61382;
            objectArray[0] = -1819773532;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[1]).intValue());
            objectArray[1] = 49505;
            objectArray[0] = 49523;
            objectArray[1] = 49505;
            objectArray[0] = 49509;
            liiiIIllIl.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[1]) - ((Integer)objectArray[0] & (Integer)objectArray[1]);
            objectArray[1] = 35048;
            objectArray[0] = 35031;
            objectArray[1] = 35048;
            objectArray[0] = 34996;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[1]) & ~((Integer)objectArray[0] & (Integer)objectArray[1]);
            objectArray[1] = 15848;
            objectArray[0] = 15842;
            objectArray[1] = 15848;
            objectArray[0] = -1411203828;
            liiiIIllIl.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[1];
            n = (0xCE7F70C7 | 0x4801B013) - (0xCE7F70C7 & 0x4801B013);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite lIiiIiIlilli(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (iliIiiliiiii) {
            int cfr_ignored_0 = 0x16 & 1;
        }
        Object[] objectArray = new Object[15];
        objectArray[13] = MethodHandles.lookup();
        objectArray[8] = ((MethodHandles.Lookup)objectArray[13]).findStatic(liiiIIllIl.class, "iliIiiliiiii", MethodType.fromMethodDescriptorString("(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[12] = methodType.parameterCount();
        objectArray[14] = IilliliilIIi[51];
        objectArray[7] = (int)((Integer)objectArray[12]);
        objectArray[11] = (Integer)objectArray[7] + ~((Integer)objectArray[14]).intValue() + 1;
        objectArray[10] = methodType.dropParameterTypes((Integer)objectArray[11], (Integer)objectArray[12]);
        objectArray[6] = MethodHandles.invoker((MethodType)objectArray[10]);
        Class[] classArray = new Class[IilliliilIIi[52]];
        classArray[liiiIIllIl.IilliliilIIi[53]] = MethodHandle.class;
        objectArray[3] = ((MethodType)objectArray[10]).appendParameterTypes(classArray);
        objectArray[14] = IilliliilIIi[54];
        objectArray[7] = (int)((Integer)objectArray[11]);
        objectArray[2] = new int[2 * ((Integer)objectArray[7] | (Integer)objectArray[14]) - ((Integer)objectArray[7] ^ (Integer)objectArray[14])];
        ((int[])objectArray[2])[liiiIIllIl.IilliliilIIi[55]] = (Integer)objectArray[11];
        objectArray[1] = IilliliilIIi[56];
        while (true) {
            objectArray[14] = IilliliilIIi[57];
            objectArray[7] = (int)((Integer)objectArray[11]);
            if ((Integer)objectArray[1] >= 2 * ((Integer)objectArray[7] | (Integer)objectArray[14]) - ((Integer)objectArray[7] ^ (Integer)objectArray[14])) {
                objectArray[9] = MethodHandles.permuteArguments((MethodHandle)objectArray[6], (MethodType)objectArray[3], (int[])objectArray[2]);
                int n = (0xB3C930B4 | 0x1FF2F5E6) - (0xB3C930B4 & 0x1FF2F5E6);
                int cfr_ignored_1 = n + 536016358;
                objectArray[5] = MethodHandles.collectArguments((MethodHandle)objectArray[9], (Integer)objectArray[11], (MethodHandle)objectArray[8]);
                return new ConstantCallSite((MethodHandle)objectArray[5]);
            }
            objectArray[14] = IilliliilIIi[58];
            objectArray[7] = (int)((Integer)objectArray[1]);
            ((int[])objectArray[2])[((Integer)objectArray[1]).intValue()] = (Integer)objectArray[7] + ~((Integer)objectArray[14]).intValue() + 1;
            objectArray[1] = (Integer)objectArray[1] + 1;
            int n = (0x3E93A77E | 0x4D8796E2) - (0x3E93A77E & 0x4D8796E2);
            int cfr_ignored_2 = n + 1300731618;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIllIIliIIl(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x30F44831 | 0x87915739) - (0x30F44831 & 0x87915739);
        if (729126374 >= n4 + -2020518087 - (n4 & 0x87915739) * 2) {
            int cfr_ignored_0 = 0x37 & 1;
        }
        Object[] objectArray = new Object[6];
        objectArray[1] = Base64.getDecoder().decode(string);
        int n5 = (0xDC798B3D | 0xC20A868E) - (0xDC798B3D & 0xC20A868E);
        int cfr_ignored_1 = n5 + -1039497586;
        objectArray[2] = IilliliilIIi[82];
        while ((Integer)objectArray[2] < ((byte[])objectArray[1]).length) {
            byte[] byArray = (byte[])objectArray[1];
            int n6 = (Integer)objectArray[2];
            objectArray[3] = (int)((Integer)objectArray[2]);
            objectArray[4] = n;
            objectArray[3] = (Integer)objectArray[4] - ~((Integer)objectArray[3]).intValue() - 1;
            objectArray[4] = (int)byArray[n6];
            objectArray[3] = n2;
            objectArray[4] = ((Integer)objectArray[4] | (Integer)objectArray[3]) + ((Integer)objectArray[4] & (Integer)objectArray[3]);
            byArray[n6] = (byte)(((Integer)objectArray[4] | (Integer)objectArray[3]) - ((Integer)objectArray[4] & (Integer)objectArray[3]));
            objectArray[2] = (Integer)objectArray[2] + 1;
        }
        return new String((byte[])objectArray[1], StandardCharsets.UTF_8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public liiiIIllIl(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x10765C6F | 0x141BEA56) - (0x10765C6F & 0x141BEA56);
        lIiiIiIlilli = n2 + 337373782 - (n2 & 0x141BEA56) * 2;
        if (595553739 < lIiiIiIlilli) {
            throw new BindException();
        }
        Object[] objectArray = new Object[28];
        objectArray[27] = IilliliilIIi[0];
        objectArray[15] = IilliliilIIi[1];
        objectArray[3] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[3] & ~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[3]).intValue() & (Integer)objectArray[15];
        objectArray[15] = IilliliilIIi[2];
        objectArray[3] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[3] & ~((Integer)objectArray[15]).intValue()) - (~((Integer)objectArray[3]).intValue() & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[24] = IilliliilIIi[3];
        objectArray[15] = IilliliilIIi[4];
        objectArray[3] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[3] ^ (Integer)objectArray[15]) + 2 * ((Integer)objectArray[3] & (Integer)objectArray[15]);
        objectArray[15] = IilliliilIIi[5];
        objectArray[3] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[3] | (Integer)objectArray[15]) - ((Integer)objectArray[3] ^ (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        objectArray[5] = IilliliilIIi[6];
        objectArray[15] = IilliliilIIi[7];
        objectArray[3] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[3] ^ (Integer)objectArray[15]) + 2 * ((Integer)objectArray[3] & (Integer)objectArray[15]);
        objectArray[15] = IilliliilIIi[8];
        objectArray[3] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[3] | (Integer)objectArray[15]) & ~((Integer)objectArray[3] & (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[5]).intValue()] = iliIlllilIi;
        liiiIIllIl.lIiiIiIlilli("3694a6d9-e875-42c2-82fd-7f7bd52736b6", (long)-3022329247510648508L, (Object[])objectArray2, (int)IilliliilIIi[9], (int)IilliliilIIi[10], (int)IilliliilIIi[11], (String)"dBUFDTI4JDZrJzMnL2YFLyYoLRVTYPofJREjWBQgFBxT8hwTFRoCQA==", (String)"MThwLSUqLzBmZF9eXmUlGhgfKxgbHBZbHRkOHhIVHxFS6w4aARQI8RX/Ew==", (String)"ECgtMjNpZ2JhYWgKJAgnISAEIyIcAB9b/Rz7GhQY9xYVFPMSTvDvCQ0H6wUJCOcBBUHj/fwA+vn4/Pv19Pg01vXv8+3x6+/u7efrJ8nI5+bgxOPi4cDf3hrX29rZuLfR0LTO", (String)"Ligw", (int)IilliliilIIi[12], (int)IilliliilIIi[13], (int)IilliliilIIi[14]);
    }

    /*
     * Exception decompiling
     */
    public static Class iIlIlllllill(String var0) {
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
        int n;
        int n2 = n = (0x4067653 | 0xD01ECED4) - (0x4067653 & 0xD01ECED4);
        lIiiIiIlilli = n2 + -803287340 - (n2 & 0xD01ECED4) * 2;
        if (611271838 <= lIiiIiIlilli) {
        }
        int n3 = (0x79FFA023 | 0xE203E4AF) - (0x79FFA023 & 0xE203E4AF);
        int cfr_ignored_0 = n3 + -503061329;
        liiiIIllIl.IlIlllIlilIl();
        liiiIIllIl.lIiiIiIlilli("9161711f-bfd2-4b29-a272-7b4f6df95075", liiiIIllIl.class, (int)IilliliilIIi[45], (int)IilliliilIIi[46], (int)IilliliilIIi[47], (String)"cQwxNyM1aiYyJi5lECAsHRxTYPQ=", (String)"LjVtKiInLC1jYVxbW2IiFxUcKBUYGRNYGhYLGw8SHA5P6AsX/hEF7hL8EA==", (String)"DSUqLzBmZF9eXmUHIQUkHh0BIB8Z/RxY+hn4FxEV9BMSEfAPS+3sBgoE6AIGBeT+Aj7g+vn99/b1+fjy8fUx0/Ls8Oru6Ozr6uToJMbF5OPdweDf3r3c2xfU2NfWtbTOzbHL", (String)"LS84MgMp", (int)IilliliilIIi[48], (int)IilliliilIIi[49], (int)IilliliilIIi[50]);
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle iliIiiliiiii(int var0, int var1_1, int var2_2, String var3_3, String var4_4, String var5_5, String var6_6, int var7_7, int var8_8, int var9_9) {
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String IilliliilIIi(String var0) {
        block52: {
            v0 = var8_1 = (713054855 | -698684619) - (713054855 & -698684619);
            if (494954215 >= v0 + -698684619 - (v0 & -698684619) * 2) {
                throw new StackOverflowError();
            }
            v1 = var8_1 = (1176382184 | -698684619) - (1176382184 & -698684619);
            liiiIIllIl.lIiiIiIlilli = v1 + -698684619 - (v1 & -698684619) * 2;
            if (1819038837 < liiiIIllIl.lIiiIiIlilli) {
                throw new TypeNotPresentException();
            }
            v2 = var8_1 = (572973310 | -698684619) - (572973310 & -698684619);
            liiiIIllIl.lIiiIiIlilli = v2 + -698684619 - (v2 & -698684619) * 2;
            if (613145408 < liiiIIllIl.lIiiIiIlilli) {
                v3 = var8_1 = (383469019 | -698684619) - (383469019 & -698684619);
                liiiIIllIl.lIiiIiIlilli = v3 + -698684619 - (v3 & -698684619) * 2;
            }
            if (liiiIIllIl.iliIiiliiiii) {
                v4 = var8_1 = (-185980821 | -698684619) - (-185980821 & -698684619);
                liiiIIllIl.lIiiIiIlilli = v4 + -698684619 - (v4 & -698684619) * 2;
            }
            if (liiiIIllIl.iliIiiliiiii) {
            }
            var6_2 = new Object[5];
            var6_2[1] = var0;
            var6_2[4] = liiiIIllIl.IilliliilIIi[65];
            block33 : switch (((String)var6_2[1]).hashCode()) {
                case 70: {
                    if (((String)var6_2[1]).equals("F")) {
                        var6_2[4] = liiiIIllIl.IilliliilIIi[70];
                    }
lbl35:
                    // 16 sources

                    while (true) {
                        switch ((Integer)var6_2[4]) {
                            case 0: {
                                var5_3 = (443686074 | -208758899) - (443686074 & -208758899);
                                break block33;
                            }
                            case 1: {
                                return "java.lang.Short";
                            }
                            case 2: {
                                return "java.lang.Byte";
                            }
                            case 3: {
                                return "java.lang.Character";
                            }
                            case 4: {
                                var5_3 = (1533900261 | -208758899) - (1533900261 & -208758899);
                                break block33;
                            }
                            case 5: {
                                return "java.lang.Long";
                            }
                            case 6: {
                                var5_3 = (642023490 | -208758899) - (642023490 & -208758899);
                                break block33;
                            }
                        }
                        if (var0.startsWith("L") == false) return var0;
                        var5_3 = (-2008579481 | -208758899) - (-2008579481 & -208758899);
                        break block33;
                        break;
                    }
                }
                case 74: {
                    if (!((String)var6_2[1]).equals("J")) ** GOTO lbl35
                    var6_2[4] = liiiIIllIl.IilliliilIIi[71];
                    ** GOTO lbl35
                }
                case 68: {
                    if (!((String)var6_2[1]).equals("D")) ** GOTO lbl35
                    var6_2[4] = liiiIIllIl.IilliliilIIi[72];
                    ** GOTO lbl35
                }
                default: {
                    ** GOTO lbl35
                }
                case 73: {
                    if (!((String)var6_2[1]).equals("I")) ** GOTO lbl35
                    var6_2[4] = liiiIIllIl.IilliliilIIi[66];
                    ** GOTO lbl35
                }
                case 83: {
                    if (!((String)var6_2[1]).equals("S")) ** GOTO lbl35
                    var6_2[4] = liiiIIllIl.IilliliilIIi[67];
                    ** GOTO lbl35
                }
                case 66: {
                    if (!((String)var6_2[1]).equals("B")) ** GOTO lbl35
                    var6_2[4] = liiiIIllIl.IilliliilIIi[68];
                    ** GOTO lbl35
                }
                case 67: {
                    if (!((String)var6_2[1]).equals("C")) ** GOTO lbl35
                    var5_3 = (2051682718 | -208758899) - (2051682718 & -208758899);
                    break;
                }
            }
            break block52;
            catch (UnsupportedClassVersionError v5) {
                throw v5;
            }
            catch (SyncFailedException v6) {
                throw v6;
            }
lbl-1000:
            // 1 sources

            {
                while (true) {
                    var6_2[2] = liiiIIllIl.IilliliilIIi[74];
                    var6_2[3] = var0.length();
                    return var0.substring(liiiIIllIl.IilliliilIIi[73], ((Integer)var6_2[3] ^ (Integer)var6_2[2]) - 2 * (~((Integer)var6_2[3]).intValue() & (Integer)var6_2[2])).replace(liiiIIllIl.IilliliilIIi[75], liiiIIllIl.IilliliilIIi[76]);
                }
            }
        }
        v7 = var5_3;
        switch (v7 + -208758899 - (v7 & -208758899) * 2) {
            default: {
                var6_2[4] = liiiIIllIl.IilliliilIIi[69];
                ** continue;
            }
            case 443686074: {
                return "java.lang.Integer";
            }
            case -1158992811: {
                return "java.lang.Character";
            }
            case 1533900261: {
                return "java.lang.Float";
            }
            case 642023490: {
                return "java.lang.Double";
            }
            case -2008579481: 
        }
        if (var0.endsWith(";") == false) return var0;
        ** while (true)
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        Object[] objectArray = new Object[35];
        objectArray[17] = IilliliilIIi[15];
        objectArray[18] = IilliliilIIi[16];
        objectArray[2] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[2] | (Integer)objectArray[18]) & ~((Integer)objectArray[2] & (Integer)objectArray[18]);
        objectArray[18] = IilliliilIIi[17];
        objectArray[2] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[2] & ~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[18];
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[19] = IilliliilIIi[18];
        objectArray[18] = IilliliilIIi[19];
        objectArray[2] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[2] | (Integer)objectArray[18]) - ((Integer)objectArray[2] & (Integer)objectArray[18]);
        objectArray[18] = IilliliilIIi[20];
        objectArray[2] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[2] | (Integer)objectArray[18]) & ~((Integer)objectArray[2] & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[19]).intValue()] = this;
        objectArray[12] = IilliliilIIi[21];
        objectArray[18] = IilliliilIIi[22];
        objectArray[2] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[2] | (Integer)objectArray[18]) & ~((Integer)objectArray[2] & (Integer)objectArray[18]);
        objectArray[18] = IilliliilIIi[23];
        objectArray[2] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[2] & ~((Integer)objectArray[18]).intValue()) - (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[12]).intValue()] = commandSender;
        objectArray[29] = IilliliilIIi[24];
        objectArray[18] = IilliliilIIi[25];
        objectArray[2] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[2] | (Integer)objectArray[18]) - ((Integer)objectArray[2] & (Integer)objectArray[18]);
        objectArray[18] = IilliliilIIi[26];
        objectArray[2] = (int)((Integer)objectArray[29]);
        objectArray[29] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[18]) - ((Integer)objectArray[2] ^ (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[29]).intValue()] = command;
        objectArray[11] = IilliliilIIi[27];
        objectArray[18] = IilliliilIIi[28];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[18]) - ((Integer)objectArray[2] ^ (Integer)objectArray[18]);
        objectArray[18] = IilliliilIIi[29];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] | (Integer)objectArray[18]) & ~((Integer)objectArray[2] & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[11]).intValue()] = string;
        objectArray[3] = IilliliilIIi[30];
        objectArray[18] = IilliliilIIi[31];
        objectArray[2] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[2] | (Integer)objectArray[18]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[18]).intValue());
        objectArray[18] = IilliliilIIi[32];
        objectArray[2] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[2] - ~((Integer)objectArray[18]).intValue() - 1;
        objectArray2[((Integer)objectArray[3]).intValue()] = stringArray;
        return (boolean)liiiIIllIl.lIiiIiIlilli("34b79a42-7326-491a-a99d-d578cdd1c6dd", (Object)liiiIIllIl.lIiiIiIlilli("52740ec8-0ac1-447c-aaee-c7655da9d1b6", (long)-3965916760176465772L, (Object[])objectArray2, (int)IilliliilIIi[33], (int)IilliliilIIi[34], (int)IilliliilIIi[35], (String)"cxQEDDE3IzVqJjImLmUELiUnLBRSX/keJBAiVxMfExtS8RsSFBkBPw==", (String)"MDdvLCQpLi9lY15dXWQkGRceKhcaGxVaHBgNHREUHhBR6g0ZABMH8BT+Eg==", (String)"DycsMTJoZmFgYGcJIwcmIB8DIiEb/x5a/Bv6GRMX9hUUE/IRTe/uCAwG6gQIB+YABEDi/Pv/+fj3+/r08/cz1fTu8uzw6u7t7ObqJsjH5uXfw+Lh4L/e3RnW2tnYt7bQz7PN", (String)"LScv", (int)IilliliilIIi[36], (int)IilliliilIIi[37], (int)IilliliilIIi[38]), (int)IilliliilIIi[39], (int)IilliliilIIi[40], (int)IilliliilIIi[41], (String)"cg0yOCQ2ayczJy9mBS8mKC0VU2D/", (String)"LzZuKyMoLS5kYl1cXGMjGBYdKRYZGhRZGxcMHBATHQ9Q6QwY/xIG7xP9EQ==", (String)"DiYrMDFnZWBfX2YIIgYlHx4CISAa/h1Z+xr5GBIW9RQTEvEQTO7tBwsF6QMHBuX/Az/h+/r++Pf2+vnz8vYy1PPt8evv6e3s6+XpJcfG5eTewuHg377d3BjV2djXtrXPzrLM", (String)"JjARLSI=", (int)IilliliilIIi[42], (int)IilliliilIIi[43], (int)IilliliilIIi[44]);
    }
}

