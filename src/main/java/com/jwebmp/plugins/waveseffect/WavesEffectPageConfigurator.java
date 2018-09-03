package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.Feature;
import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

public class WavesEffectPageConfigurator
		implements IPageConfigurator
{
	private static final JavascriptReference reference = new JavascriptReference("WavesEffectJSReference", 0.76, "bower_components/waves/dist/waves.min.js");
	private static final CSSReference cssReference = new CSSReference("WavesEffectCSSSReference", 0.76, "bower_components/waves/dist/waves.min.css");
	private static final CSSReference cssOverridesReference = new CSSReference("WavesEffectCSSSOverideReference", 0.76, "waves_overrides/waves_colours.min.css");
	private static final Feature initFeature = new WavesAttachFeature(null);
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
		if (!page.isConfigured())
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
