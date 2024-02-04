package com.jwebmp.plugins.waveseffect;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.CHAR_DASH;
import static com.guicedee.services.jsonrepresentation.json.StaticStrings.CHAR_UNDERSCORE;
import static com.jwebmp.core.utilities.StaticStrings.*;

@SuppressWarnings("unused")
public enum WavesEffects
{
	Waves_Effect,
	Waves_Light,
	Waves_Circle,
	Waves_Button,
	Waves_Float,
	Waves_Block;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
