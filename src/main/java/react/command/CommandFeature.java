package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Config;
import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.feature.BasicBooleanOption;
import react.feature.BasicDoubleOption;
import react.feature.BasicIntegerOption;
import react.feature.BasicLongOption;
import react.feature.BasicStringOption;
import react.feature.IFeature;
import react.feature.IOption;
import surge.util.Anchor;
import surge.util.Query;

@Anchor(0)
public class CommandFeature extends ReactCommand
{
	public CommandFeature()
	{
		command = Info.COMMAND_FEATURE;
		aliases = new String[] {Info.COMMAND_FEATURE_ALIAS_1, Info.COMMAND_FEATURE_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.RELOAD.getNode()};
		usage = Info.COMMAND_FEATURE_USAGE;
		description = Info.COMMAND_FEATURE_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(args.length == 0)
		{
			React.instance.featureSetController.sendMain((Player) sender);
		}

		if(args.length == 1)
		{
			React.instance.featureSetController.sendPage((Player) sender, args[0]);
		}

		if(args.length == 2 && args[1].equalsIgnoreCase("-t"))
		{
			React.instance.featureSetController.toggle((Player) sender, args[0]);
		}

		else if(args.length == 2)
		{
			for(IFeature i : React.instance.featureSetController.getF().getFeatures())
			{
				if(i.getID().equals(args[0]))
				{
					for(IOption<?> j : i.getOptions())
					{
						if(j.getID().equals(args[1]))
						{
							if(j instanceof BasicBooleanOption)
							{
								React.instance.featureSetController.toggleElement((Player) sender, args[0], args[1]);
							}

							else if(j instanceof BasicStringOption)
							{
								Gate.msg(sender, "Enter the new value (STRING)");
								new Query((Player) sender)
								{
									@Override
									public void onMessage(String msg)
									{
										((BasicStringOption) j).setValue(msg);
										React.instance.featureSetController.sendPage((Player) sender, args[0]);
										Gate.msgSuccess(sender, i.getName() + " -> " + j.getName() + " SET: '" + msg + "'");
									}
								};
							}

							else if(j instanceof BasicIntegerOption)
							{
								Gate.msg(sender, "Enter the new value (INTEGER) i.e. 123");
								new Query((Player) sender)
								{
									@Override
									public void onMessage(String msg)
									{
										try
										{
											Integer ig = Integer.valueOf(msg);
											((BasicIntegerOption) j).setValue(ig);
											React.instance.featureSetController.sendPage((Player) sender, args[0]);
											Gate.msgSuccess(sender, i.getName() + " -> " + j.getName() + " SET: '" + ig + "'");
										}

										catch(Exception e)
										{
											Gate.msgError(sender, "Could not parse input '" + msg + "' as INTEGER");
										}
									}
								};
							}

							else if(j instanceof BasicDoubleOption)
							{
								Gate.msg(sender, "Enter the new value (DOUBLE) i.e. 3.154");
								new Query((Player) sender)
								{
									@Override
									public void onMessage(String msg)
									{
										try
										{
											Double ig = Double.valueOf(msg);
											((BasicDoubleOption) j).setValue(ig);
											React.instance.featureSetController.sendPage((Player) sender, args[0]);
											Gate.msgSuccess(sender, i.getName() + " -> " + j.getName() + " SET: '" + ig + "'");
										}

										catch(Exception e)
										{
											Gate.msgError(sender, "Could not parse input '" + msg + "' as DOUBLE");
										}
									}
								};
							}

							else if(j instanceof BasicLongOption)
							{
								Gate.msg(sender, "Enter the new value (LONG) i.e. 12345678");
								new Query((Player) sender)
								{
									@Override
									public void onMessage(String msg)
									{
										try
										{
											Long ig = Long.valueOf(msg);
											((BasicLongOption) j).setValue(ig);
											React.instance.featureSetController.sendPage((Player) sender, args[0]);
											Gate.msgSuccess(sender, i.getName() + " -> " + j.getName() + " SET: '" + ig + "'");
										}

										catch(Exception e)
										{
											Gate.msgError(sender, "Could not parse input '" + msg + "' as LONG");
										}
									}
								};
							}

							try
							{
								Config.doSave();
							}

							catch(IllegalArgumentException | IllegalAccessException e)
							{
								e.printStackTrace();
							}
						}
					}

					break;
				}
			}
		}
	}
}
