package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;

public class WavesAttachFeature
		extends Feature
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
