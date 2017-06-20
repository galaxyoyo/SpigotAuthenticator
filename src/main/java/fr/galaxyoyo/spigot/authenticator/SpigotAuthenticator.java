package fr.galaxyoyo.spigot.authenticator;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotAuthenticator extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("Hello world!");
	}

	@Override
	public void onDisable()
	{
	}
}
