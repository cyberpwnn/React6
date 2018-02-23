package react.notification;

import react.React;

public enum Note
{
	RAI,
	VERBOSE,
	SPIKES,
	ACTION,
	GC;

	public void bake(String msg)
	{
		React.instance.messageController.queue(new Notification(this, msg));
	}
}
