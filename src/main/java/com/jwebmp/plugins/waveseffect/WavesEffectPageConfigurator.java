package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.Page;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Waves Effects ",
        pluginUniqueName = "waves",
        pluginDescription = "Waves Effects",
        pluginVersion = "1.0",
        pluginDependancyUniqueIDs = "jquery",
        pluginCategories = "effects",
        pluginSubtitle = "the https://json.geoiplookup.io/ ip locator service ",
        pluginGitUrl = "https://github.com/GedMarc/JWebMP-WavesEffect",
        pluginSourceUrl = "https://mdbootstrap.com/docs/standard/methods/ripple/",
        pluginWikiUrl = "https://github.com/GedMarc/JWebMP-WavesEffect/wiki",
        pluginOriginalHomepage = "https://mdbootstrap.com/docs/standard/methods/ripple/",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.effects/jwebmp-waveseffect",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginLastUpdatedDate = "2020/12/14",
        pluginGroupId = "com.jwebmp.plugins.effects",
        pluginArtifactId = "jwebmp-waveseffect",
        pluginModuleName = "com.jwebmp.plugins.waveseffect",
        pluginStatus = PluginStatus.Released
)
@TsDependency(value = "node-waves", version = "*")
@NgScript("node_modules/node-waves/src/js/waves.js")
@NgStyleSheet("node_modules/node-waves/src/scss/waves.scss")
public class WavesEffectPageConfigurator
        implements IPageConfigurator<WavesEffectPageConfigurator>
{
    @Override
    public @NotNull IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}
