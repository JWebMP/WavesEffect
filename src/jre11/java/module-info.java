import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;
import com.jwebmp.plugins.waveseffect.implementations.WavesEffectsExclusionsModule;

module com.jwebmp.plugins.waveseffect {
	exports com.jwebmp.plugins.waveseffect;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with WavesEffectPageConfigurator;

	provides IGuiceScanJarExclusions with WavesEffectsExclusionsModule;
	provides IGuiceScanModuleExclusions with WavesEffectsExclusionsModule;

	//opens com.jwebmp.plugins.waveseffect to com.fasterxml.jackson.databind, com.jwebmp.core;
}
