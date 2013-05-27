/*******************************************************************************
 * @author Reika
 * 
 * This code is the property of and owned and copyrighted by Reika.
 * Unless given explicit written permission - electronic writing is acceptable - no user may
 * copy, edit, or redistribute this source code nor any derivative works.
 * Failure to comply with these restrictions is a violation of
 * copyright law and will be dealt with accordingly.
 ******************************************************************************/
package Reika.DragonAPI.Libraries;

import net.minecraft.world.World;
import Reika.DragonAPI.DragonAPICore;

public final class ReikaMediaHelper extends DragonAPICore {

	public static void playSoundVarying(World world, int x, int y, int z, String name) {
		world.playSoundEffect(x+0.5, y+0.5, z+0.5, name, rand.nextFloat(), rand.nextFloat());
	}

}