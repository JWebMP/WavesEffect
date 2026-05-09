import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.waveseffect.WavesEffectPageConfigurator;
import com.jwebmp.plugins.waveseffect.implementations.WavesEffectsInclusionModule;

module com.jwebmp.plugins.waveseffect {
    exports com.jwebmp.plugins.waveseffect;

    requires com.jwebmp.client;
    requires com.jwebmp.core;
    requires transitive com.jwebmp.core.base.angular.client;
    requires com.guicedee.jsonrepresentation;

    provides IPageConfigurator with WavesEffectPageConfigurator;
    provides IGuiceScanModuleInclusions with WavesEffectsInclusionModule;

    opens com.jwebmp.plugins.waveseffect to com.google.guice, com.jwebmp.core.angular, com.fasterxml.jackson.databind;
    opens com.jwebmp.plugins.waveseffect.implementations to com.google.guice;
}
