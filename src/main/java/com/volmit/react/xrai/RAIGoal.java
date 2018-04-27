package com.volmit.react.xrai;

import com.volmit.react.api.ActionType;
import com.volmit.react.api.SelectorParseException;
import com.volmit.react.api.SelectorTime;
import com.volmit.react.util.JSONException;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.M;

public class RAIGoal
{
	private ConditionSet conditions;
	private VirtualAction action;
	private long interval;
	private String sv;
	private String name;
	private String description;
	private String author;
	private boolean enabled;
	private long last = M.ms();

	public RAIGoal()
	{
		conditions = new ConditionSet();
		action = new VirtualAction(ActionType.PURGE_CHUNKS);
		interval = -1;
		sv = null;
		description = "no description";
		author = "React";
		name = "goal";
		enabled = true;
	}

	public long getLast()
	{
		return last;
	}

	public void setLast(long last)
	{
		this.last = last;
	}

	public RAIGoal(JSONObject j)
	{
		this();

		conditions = new ConditionSet(j.getJSONArray("conditions"));
		action = new VirtualAction(j.getJSONObject("reaction"));

		if(j.has("enabled"))
		{
			enabled = j.getBoolean("enabled");
		}

		if(j.has("name"))
		{
			name = j.getString("name");
		}

		if(j.has("author"))
		{
			author = j.getString("author");
		}

		if(j.has("description"))
		{
			description = j.getString("description");
		}

		if(j.has("interval"))
		{
			try
			{
				interval = new SelectorTime().parse(null, sv = j.getString("interval"));
				System.out.println("Parsed " + sv + " -> " + interval);
			}

			catch(SelectorParseException e)
			{
				e.printStackTrace();
			}

			catch(JSONException e)
			{
				e.printStackTrace();
			}
		}
	}

	public JSONObject toJSON()
	{
		JSONObject j = new JSONObject();

		j.put("conditions", conditions.toJSON());
		j.put("reaction", action.toJSON());

		if(interval >= 0)
		{
			j.put("interval", sv);
		}

		j.put("name", name);
		j.put("author", author);
		j.put("description", description);
		j.put("enabled", enabled);

		return j;
	}

	public ConditionSet getConditions()
	{
		return conditions;
	}

	public void setConditions(ConditionSet conditions)
	{
		this.conditions = conditions;
	}

	public VirtualAction getAction()
	{
		return action;
	}

	public void setAction(VirtualAction action)
	{
		this.action = action;
	}

	public long getInterval()
	{
		return interval;
	}

	public void setInterval(long interval)
	{
		this.interval = interval;
	}

	public String getSv()
	{
		return sv;
	}

	public void setSv(String sv)
	{
		this.sv = sv;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}
}
