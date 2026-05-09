package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Waves Effect page configurator — registers Waves.js click-ripple effect
 * scripts and styles for material-design-style button/element feedback.
 */
@PluginInformation(pluginName = "Waves Effect",
        pluginUniqueName = "waves",
        pluginDescription = "Click-effect inspired by Google Material Design — adds ripple animations to any element on click/tap.",
        pluginVersion = "0.7.6",
        pluginDependancyUniqueIDs = "",
        pluginCategories = "effects, animation, material",
        pluginSubtitle = "Material-design inspired click/tap ripple effect for buttons and interactive elements.",
        pluginGitUrl = "https://github.com/JWebMP/JWebMP",
        pluginSourceUrl = "https://github.com/fians/Waves",
        pluginWikiUrl = "https://github.com/fians/Waves/wiki",
        pluginOriginalHomepage = "https://fians.github.io/Waves/",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/waveseffect",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginLastUpdatedDate = "2026/05/04",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "waveseffect",
        pluginModuleName = "com.jwebmp.plugins.waveseffect",
        pluginStatus = PluginStatus.Released
)
@TsDependency(value = "node-waves", version = "^0.7.6")
@NgScript("node_modules/node-waves/src/js/waves.js")
@NgStyleSheet("node_modules/node-waves/src/scss/waves.scss")
public class WavesEffectPageConfigurator
        implements IPageConfigurator<WavesEffectPageConfigurator>
{
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}
