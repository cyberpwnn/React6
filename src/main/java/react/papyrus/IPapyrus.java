package react.papyrus;

import org.bukkit.inventory.ItemStack;
import org.bukkit.map.MapView;

import com.volmit.react.util.GList;

public interface IPapyrus
{
	public MapView getView();

	public BufferedFrame getFrameBuffer();

	public void addRenderer(IRenderer renderer);

	public void clearRenderers();

	public GList<IRenderer> getRenderers();

	public void removeRenderer(IRenderer renderer);

	public void destroy();

	public ItemStack makeMapItem();
}
