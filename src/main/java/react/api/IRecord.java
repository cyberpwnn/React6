package react.api;

import org.cyberpwn.json.JSONObject;

public interface IRecord<T>
{
	public String getRecordType();

	public long getRecordTime();

	public JSONObject toJSON();

	public T getRecordObject();

	public void fromJSON(JSONObject k);
}
