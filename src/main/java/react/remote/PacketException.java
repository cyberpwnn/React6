package react.remote;

public class PacketException extends Exception
{
	private static final long serialVersionUID = 1L;

	public PacketException()
	{
		super();
	}

	public PacketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PacketException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public PacketException(String message)
	{
		super(message);
	}

	public PacketException(Throwable cause)
	{
		super(cause);
	}
}
