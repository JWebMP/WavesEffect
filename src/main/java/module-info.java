import com.jwebmp.plugins.waveseffect.implementations.WavesEffectsInclusionModule;

module com.jwebmp.plugins.waveseffect {
	exports com.jwebmp.plugins.waveseffect;

	requires transitive com.jwebmp.core.angular;
	requires com.guicedee.jsonrepresentation;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with WavesEffectsInclusionModule;
}
