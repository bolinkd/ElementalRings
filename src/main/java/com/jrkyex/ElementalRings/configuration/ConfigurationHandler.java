package com.jrkyex.ElementalRings.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * Created by Dustin on 13-Jul-2014.
 */
public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            configuration.load();

            configValue = configuration.get("Elemental Rings", "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            //log exception
        }
        finally
        {
            configuration.save();
        }

        System.out.println(configValue);
    }
}
