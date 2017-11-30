package react.remote;

public class KnownUser
{
	private final String username;
	private final String password;

	public KnownUser(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}
}
