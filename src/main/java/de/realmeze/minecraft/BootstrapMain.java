package de.realmeze.minecraft;

import de.realmeze.spring.McspringbootdemoApplication;
import org.bukkit.plugin.java.JavaPlugin;

public class BootstrapMain extends JavaPlugin {

    private ClassLoader defaultClassLoader;

    @Override
    public void onEnable() {
        defaultClassLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClassLoader());
        McspringbootdemoApplication.main(new String[0]);

    }


}
