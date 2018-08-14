import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;

module com.jwebmp.plugins.waveseffect {
	exports com.jwebmp.plugins.waveseffect;

	requires com.jwebmp.core;
	requires java.validation;

	provides IPageConfigurator with WavesEffectPageConfigurator;

}
