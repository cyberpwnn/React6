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

public class WrapperPlayClientHeldItemSlot18 extends AbstractPacket18 {
    public static final PacketType TYPE = PacketType.Play.Client.HELD_ITEM_SLOT;
    
    public WrapperPlayClientHeldItemSlot18() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientHeldItemSlot18(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Slot.
     * <p>
     * Notes: the slot which the player has selected (0-8)
     * @return The current Slot
     */
    public int getSlot() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Slot.
     * @param value - new value.
     */
    public void setSlot(int value) {
        handle.getIntegers().write(0, value);
    }
    
}

