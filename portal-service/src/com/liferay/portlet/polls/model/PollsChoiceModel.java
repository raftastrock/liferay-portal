/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.polls.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the PollsChoice service. Represents a row in the &quot;PollsChoice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.polls.model.impl.PollsChoiceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.polls.model.impl.PollsChoiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoice
 * @see com.liferay.portlet.polls.model.impl.PollsChoiceImpl
 * @see com.liferay.portlet.polls.model.impl.PollsChoiceModelImpl
 * @generated
 */
public interface PollsChoiceModel extends BaseModel<PollsChoice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a polls choice model instance should use the {@link PollsChoice} interface instead.
	 */

	/**
	 * Gets the primary key of this polls choice.
	 *
	 * @return the primary key of this polls choice
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this polls choice
	 *
	 * @param pk the primary key of this polls choice
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Gets the uuid of this polls choice.
	 *
	 * @return the uuid of this polls choice
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this polls choice.
	 *
	 * @param uuid the uuid of this polls choice
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the choice ID of this polls choice.
	 *
	 * @return the choice ID of this polls choice
	 */
	public long getChoiceId();

	/**
	 * Sets the choice ID of this polls choice.
	 *
	 * @param choiceId the choice ID of this polls choice
	 */
	public void setChoiceId(long choiceId);

	/**
	 * Gets the question ID of this polls choice.
	 *
	 * @return the question ID of this polls choice
	 */
	public long getQuestionId();

	/**
	 * Sets the question ID of this polls choice.
	 *
	 * @param questionId the question ID of this polls choice
	 */
	public void setQuestionId(long questionId);

	/**
	 * Gets the name of this polls choice.
	 *
	 * @return the name of this polls choice
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this polls choice.
	 *
	 * @param name the name of this polls choice
	 */
	public void setName(String name);

	/**
	 * Gets the description of this polls choice.
	 *
	 * @return the description of this polls choice
	 */
	public String getDescription();

	/**
	 * Gets the localized description of this polls choice. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized description for
	 * @return the localized description of this polls choice
	 */
	public String getDescription(Locale locale);

	/**
	 * Gets the localized description of this polls choice, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this polls choice. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Gets the localized description of this polls choice. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @return the localized description of this polls choice
	 */
	public String getDescription(String languageId);

	/**
	 * Gets the localized description of this polls choice, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this polls choice
	 */
	public String getDescription(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized description of this polls choice.
	 *
	 * @return the locales and localized description
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this polls choice.
	 *
	 * @param description the description of this polls choice
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this polls choice.
	 *
	 * @param description the localized description of this polls choice
	 * @param locale the locale to set the localized description for
	 */
	public void setDescription(String description, Locale locale);

	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	/**
	 * Sets the localized descriptions of this polls choice from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this polls choice
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(PollsChoice pollsChoice);

	public int hashCode();

	public PollsChoice toEscapedModel();

	public String toString();

	public String toXmlString();
}