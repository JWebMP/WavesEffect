package com.jwebmp.plugins.waveseffect;

import com.jwebmp.core.Feature;

import java.util.Set;

public class WavesApplyToSelectorFeature
		extends Feature
{
	private String selector;
	private Set<WavesEffects> classes;

	public WavesApplyToSelectorFeature(String selector, WavesEffects... classes)
	{
		super("WavesApplyToSelectorFeature");
		this.selector = selector;
		this.classes = Set.of(classes);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Waves.attach(");
		sb.append(selector);
		if (classes != null && !classes.isEmpty())
		{
			sb.append(",[");
			for (WavesEffects aClass : classes)
			{
				sb.append(aClass.toString())
				  .append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("]");
		}
		sb.append(");");
		addQuery(sb);
	}
}
