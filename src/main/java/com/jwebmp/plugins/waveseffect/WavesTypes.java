package com.jwebmp.plugins.waveseffect;

import static com.jwebmp.core.utilities.StaticStrings.*;

public enum WavesTypes
{
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
