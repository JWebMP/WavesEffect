package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class WavesAttachFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,WavesAttachFeature>
{
	private static final String query = "Waves.init();";

	public WavesAttachFeature(ComponentHierarchyBase component)
	{
		super("WavesAttachTypeFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(WavesAttachFeature.query);
	}
}
