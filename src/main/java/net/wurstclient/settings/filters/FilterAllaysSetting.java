/*
 * Copyright (c) 2014-2025 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.settings.filters;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AllayEntity;

public final class FilterAllaysSetting extends EntityFilterCheckbox
{
	public FilterAllaysSetting(String description, boolean checked)
	{
		super("过滤悦灵", description, checked);
	}
	
	@Override
	public boolean test(Entity e)
	{
		return !(e instanceof AllayEntity);
	}
	
	public static FilterAllaysSetting genericCombat(boolean checked)
	{
		return new FilterAllaysSetting(
			"description.wurst.setting.generic.filter_allays_combat", checked);
	}
	
	public static FilterAllaysSetting genericVision(boolean checked)
	{
		return new FilterAllaysSetting(
			"description.wurst.setting.generic.filter_allays_vision", checked);
	}
}
