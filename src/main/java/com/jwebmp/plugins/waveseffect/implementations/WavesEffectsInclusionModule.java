package com.jwebmp.plugins.waveseffect.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class WavesEffectsInclusionModule implements IGuiceScanModuleInclusions<WavesEffectsInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.waveseffect");
		return set;
	}
}