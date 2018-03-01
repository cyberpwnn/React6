package surge.control;

public interface IController
{
	public void start();

	public void stop();

	public void tick();

	public void setTime(double ms);

	public double getTime();
}
