import com.jwebmp.plugins.waveseffect.implementations.WavesEffectsInclusionModule;

module com.jwebmp.plugins.waveseffect {
	exports com.jwebmp.plugins.waveseffect;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.waveseffect.implementations.WavesEffectsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with WavesEffectsInclusionModule;
	
	//opens com.jwebmp.plugins.waveseffect to com.fasterxml.jackson.databind, com.jwebmp.core;
}
