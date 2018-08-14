package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.base.ComponentHierarchyBase;

public class WavesEffects
{
	private static final WavesEffects instance = new WavesEffects();

	private WavesEffects()
	{
		//No config required
	}

	public static ComponentHierarchyBase applyEffect(ComponentHierarchyBase component, WavesTypes... effects)
	{

		return component;
	}
}
