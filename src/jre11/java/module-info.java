module com.jwebmp.plugins.waveseffect {
	exports com.jwebmp.plugins.waveseffect;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.waveseffect.implementations.WavesEffectsExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.waveseffect.implementations.WavesEffectsExclusionsModule;

	//opens com.jwebmp.plugins.waveseffect to com.fasterxml.jackson.databind, com.jwebmp.core;
}
