package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.Feature;
import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
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
public class WavesEffectPageConfigurator
		implements IPageConfigurator<WavesEffectPageConfigurator>
{
	private static final JavascriptReference reference = new JavascriptReference("WavesEffectJSReference", 0.76, "bower_components/waves/dist/waves.min.js")
			.setPriority(RequirementsPriority.Fourth);
	private static final CSSReference cssReference = new CSSReference("WavesEffectCSSSReference", 0.76, "bower_components/waves/dist/waves.min.css").setPriority(RequirementsPriority.Third);
	private static final CSSReference cssOverridesReference = new CSSReference("WavesEffectCSSSOverideReference", 0.76, "waves_overrides/waves_colours.min.css").setPriority(RequirementsPriority.Third);
	private static final WavesAttachFeature initFeature = new WavesAttachFeature(null);
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return WavesEffectPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		WavesEffectPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Returns the current script reference
	 *
	 * @return The associated reference
	 */
	public static JavascriptReference getReference()
	{
		return WavesEffectPageConfigurator.reference;
	}

	public static CSSReference getCssReference()
	{
		return WavesEffectPageConfigurator.cssReference;
	}

	public static CSSReference getCssOverridesReference()
	{
		return WavesEffectPageConfigurator.cssOverridesReference;
	}

	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.addJavaScriptReference(WavesEffectPageConfigurator.reference);
			page.addCssReference(WavesEffectPageConfigurator.cssReference);
			page.addCssReference(WavesEffectPageConfigurator.cssOverridesReference);

			page.addFeature(WavesEffectPageConfigurator.initFeature);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return WavesEffectPageConfigurator.enabled;
	}
}
