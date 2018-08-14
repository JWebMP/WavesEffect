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
}
