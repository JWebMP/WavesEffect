package com.jwebmp.plugins.waveseffect.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.Set;

public class WavesEffectsInclusionModule implements IGuiceScanModuleInclusions<WavesEffectsInclusionModule>
{
    @Override
    public Set<String> includeModules()
    {
        return Set.of("com.jwebmp.plugins.waveseffect");
    }
}