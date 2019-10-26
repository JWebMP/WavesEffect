package com.jwebmp.plugins.waveseffect.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class WavesEffectsExclusionsModule
		implements IGuiceScanModuleExclusions<WavesEffectsExclusionsModule>,
				           IGuiceScanJarExclusions<WavesEffectsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-waveseffect-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.waveseffect");
		return strings;
	}
}
