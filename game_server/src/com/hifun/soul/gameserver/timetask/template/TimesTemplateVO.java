package com.hifun.soul.gameserver.timetask.template;

import com.hifun.soul.core.annotation.ExcelRowBinding;
import com.hifun.soul.common.exception.TemplateConfigException;
import com.hifun.soul.core.annotation.ExcelCellBinding;
import com.hifun.soul.core.template.TemplateObject;
import com.hifun.soul.core.util.StringUtils;

/**
 * 时间点模版
 * 
 * @author SevenSoul
 */

@ExcelRowBinding
public abstract class TimesTemplateVO extends TemplateObject {

	/**  触发时间 HH:mm:ss */
	@ExcelCellBinding(offset = 1)
	protected String triggerTime;


	public String getTriggerTime() {
		return this.triggerTime;
	}

	public void setTriggerTime(String triggerTime) {
		if (StringUtils.isEmpty(triggerTime)) {
			throw new TemplateConfigException(this.getSheetName(), this.getId(),
					2, "[ 触发时间 HH:mm:ss]triggerTime不可以为空");
		}
		this.triggerTime = triggerTime;
	}
	

	@Override
	public String toString() {
		return "TimesTemplateVO[triggerTime=" + triggerTime + ",]";

	}
}