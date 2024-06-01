import com.jwebmp.plugins.waveseffect.implementations.WavesEffectsInclusionModule;

module com.jwebmp.plugins.waveseffect {
    exports com.jwebmp.plugins.waveseffect;

    requires com.jwebmp.client;
    requires com.jwebmp.core;
    
    requires transitive com.jwebmp.core.base.angular.client;
    requires com.guicedee.jsonrepresentation;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;
    provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with WavesEffectsInclusionModule;
}
