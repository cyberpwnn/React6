/**
 * This file is part of PacketWrapper.
 * Copyright (C) 2012-2015 Kristian S. Strangeland
 * Copyright (C) 2015 dmulloy2
 *
 * PacketWrapper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PacketWrapper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PacketWrapper.  If not, see <http://www.gnu.org/licenses/>.
 */
package react.protocol.wrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientFlying18 extends AbstractPacket18 {
    public static final PacketType TYPE = PacketType.Play.Client.FLYING;
    
    public WrapperPlayClientFlying18() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientFlying18(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve On Ground.
     * <p>
     * Notes: true if the client is on the ground, False otherwise
     * @return The current On Ground
     */
    public boolean getOnGround() {
        return handle.getSpecificModifier(boolean.class).read(0);
    }
    
    /**
     * Set On Ground.
     * @param value - new value.
     */
    public void setOnGround(boolean value) {
        handle.getSpecificModifier(boolean.class).write(0, value);
    }
    
}

