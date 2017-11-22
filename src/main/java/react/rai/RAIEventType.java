package react.rai;

public enum RAIEventType
{
	FIRE_ACTION("I'll fire %1 to help with %2", "I'm Trying to fix %2 by running %1", "I'm Still Trying to fix %2 with %1"),
	NOTE_GOAL_FAILING("It seems like the server is failing to %1", "Looks like we cant %1", "It seems like the %2 is not stable."),
	NOTE_GOAL_FIXED("Looks like we are now %1", "The %2 looks good to me!");

	private String[] msgs;

	private RAIEventType(String... ss)
	{
		msgs = ss;
	}

	public int getSize()
	{
		return msgs.length;
	}

	public int pickRandom()
	{
		return (int) (Math.random() * (getSize() - 1));
	}

	public String formatFor(int f, String[] pars)
	{
		String sel = msgs[f];

		int l = 0;

		for(String i : pars)
		{
			l++;

			sel = sel.replaceAll("%" + l, i);
		}

		return sel;
	}
}
