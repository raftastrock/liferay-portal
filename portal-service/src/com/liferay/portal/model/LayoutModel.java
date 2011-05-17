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

package com.liferay.portal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Layout service. Represents a row in the &quot;Layout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.LayoutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.LayoutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Layout
 * @see com.liferay.portal.model.impl.LayoutImpl
 * @see com.liferay.portal.model.impl.LayoutModelImpl
 * @generated
 */
public interface LayoutModel extends BaseModel<Layout> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a layout model instance should use the {@link Layout} interface instead.
	 */

	/**
	 * Gets the primary key of this layout.
	 *
	 * @return the primary key of this layout
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this layout
	 *
	 * @param pk the primary key of this layout
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Gets the uuid of this layout.
	 *
	 * @return the uuid of this layout
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this layout.
	 *
	 * @param uuid the uuid of this layout
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the plid of this layout.
	 *
	 * @return the plid of this layout
	 */
	public long getPlid();

	/**
	 * Sets the plid of this layout.
	 *
	 * @param plid the plid of this layout
	 */
	public void setPlid(long plid);

	/**
	 * Gets the group ID of this layout.
	 *
	 * @return the group ID of this layout
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this layout.
	 *
	 * @param groupId the group ID of this layout
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this layout.
	 *
	 * @return the company ID of this layout
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this layout.
	 *
	 * @param companyId the company ID of this layout
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the create date of this layout.
	 *
	 * @return the create date of this layout
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this layout.
	 *
	 * @param createDate the create date of this layout
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this layout.
	 *
	 * @return the modified date of this layout
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this layout.
	 *
	 * @param modifiedDate the modified date of this layout
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the private layout of this layout.
	 *
	 * @return the private layout of this layout
	 */
	public boolean getPrivateLayout();

	/**
	 * Determines if this layout is private layout.
	 *
	 * @return <code>true</code> if this layout is private layout; <code>false</code> otherwise
	 */
	public boolean isPrivateLayout();

	/**
	 * Sets whether this layout is private layout.
	 *
	 * @param privateLayout the private layout of this layout
	 */
	public void setPrivateLayout(boolean privateLayout);

	/**
	 * Gets the layout ID of this layout.
	 *
	 * @return the layout ID of this layout
	 */
	public long getLayoutId();

	/**
	 * Sets the layout ID of this layout.
	 *
	 * @param layoutId the layout ID of this layout
	 */
	public void setLayoutId(long layoutId);

	/**
	 * Gets the parent layout ID of this layout.
	 *
	 * @return the parent layout ID of this layout
	 */
	public long getParentLayoutId();

	/**
	 * Sets the parent layout ID of this layout.
	 *
	 * @param parentLayoutId the parent layout ID of this layout
	 */
	public void setParentLayoutId(long parentLayoutId);

	/**
	 * Gets the name of this layout.
	 *
	 * @return the name of this layout
	 */
	public String getName();

	/**
	 * Gets the localized name of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized name for
	 * @return the localized name of this layout
	 */
	public String getName(Locale locale);

	/**
	 * Gets the localized name of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized name for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this layout. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Gets the localized name of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized name for
	 * @return the localized name of this layout
	 */
	public String getName(String languageId);

	/**
	 * Gets the localized name of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized name for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this layout
	 */
	public String getName(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized name of this layout.
	 *
	 * @return the locales and localized name
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this layout.
	 *
	 * @param name the name of this layout
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this layout.
	 *
	 * @param name the localized name of this layout
	 * @param locale the locale to set the localized name for
	 */
	public void setName(String name, Locale locale);

	public void setName(String name, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized names of this layout from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this layout
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Gets the title of this layout.
	 *
	 * @return the title of this layout
	 */
	public String getTitle();

	/**
	 * Gets the localized title of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized title for
	 * @return the localized title of this layout
	 */
	public String getTitle(Locale locale);

	/**
	 * Gets the localized title of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this layout. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Gets the localized title of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @return the localized title of this layout
	 */
	public String getTitle(String languageId);

	/**
	 * Gets the localized title of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this layout
	 */
	public String getTitle(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized title of this layout.
	 *
	 * @return the locales and localized title
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this layout.
	 *
	 * @param title the title of this layout
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this layout.
	 *
	 * @param title the localized title of this layout
	 * @param locale the locale to set the localized title for
	 */
	public void setTitle(String title, Locale locale);

	public void setTitle(String title, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized titles of this layout from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this layout
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Gets the description of this layout.
	 *
	 * @return the description of this layout
	 */
	public String getDescription();

	/**
	 * Gets the localized description of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized description for
	 * @return the localized description of this layout
	 */
	public String getDescription(Locale locale);

	/**
	 * Gets the localized description of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this layout. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Gets the localized description of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @return the localized description of this layout
	 */
	public String getDescription(String languageId);

	/**
	 * Gets the localized description of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this layout
	 */
	public String getDescription(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized description of this layout.
	 *
	 * @return the locales and localized description
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this layout.
	 *
	 * @param description the description of this layout
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this layout.
	 *
	 * @param description the localized description of this layout
	 * @param locale the locale to set the localized description for
	 */
	public void setDescription(String description, Locale locale);

	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	/**
	 * Sets the localized descriptions of this layout from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this layout
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Gets the keywords of this layout.
	 *
	 * @return the keywords of this layout
	 */
	public String getKeywords();

	/**
	 * Gets the localized keywords of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized keywords for
	 * @return the localized keywords of this layout
	 */
	public String getKeywords(Locale locale);

	/**
	 * Gets the localized keywords of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized keywords for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized keywords of this layout. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getKeywords(Locale locale, boolean useDefault);

	/**
	 * Gets the localized keywords of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized keywords for
	 * @return the localized keywords of this layout
	 */
	public String getKeywords(String languageId);

	/**
	 * Gets the localized keywords of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized keywords for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized keywords of this layout
	 */
	public String getKeywords(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized keywords of this layout.
	 *
	 * @return the locales and localized keywords
	 */
	public Map<Locale, String> getKeywordsMap();

	/**
	 * Sets the keywords of this layout.
	 *
	 * @param keywords the keywords of this layout
	 */
	public void setKeywords(String keywords);

	/**
	 * Sets the localized keywords of this layout.
	 *
	 * @param keywords the localized keywords of this layout
	 * @param locale the locale to set the localized keywords for
	 */
	public void setKeywords(String keywords, Locale locale);

	public void setKeywords(String keywords, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized keywordses of this layout from the map of locales and localized keywordses.
	 *
	 * @param keywordsMap the locales and localized keywordses of this layout
	 */
	public void setKeywordsMap(Map<Locale, String> keywordsMap);

	public void setKeywordsMap(Map<Locale, String> keywordsMap,
		Locale defaultLocale);

	/**
	 * Gets the robots of this layout.
	 *
	 * @return the robots of this layout
	 */
	public String getRobots();

	/**
	 * Gets the localized robots of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized robots for
	 * @return the localized robots of this layout
	 */
	public String getRobots(Locale locale);

	/**
	 * Gets the localized robots of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized robots for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized robots of this layout. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getRobots(Locale locale, boolean useDefault);

	/**
	 * Gets the localized robots of this layout. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized robots for
	 * @return the localized robots of this layout
	 */
	public String getRobots(String languageId);

	/**
	 * Gets the localized robots of this layout, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized robots for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized robots of this layout
	 */
	public String getRobots(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized robots of this layout.
	 *
	 * @return the locales and localized robots
	 */
	public Map<Locale, String> getRobotsMap();

	/**
	 * Sets the robots of this layout.
	 *
	 * @param robots the robots of this layout
	 */
	public void setRobots(String robots);

	/**
	 * Sets the localized robots of this layout.
	 *
	 * @param robots the localized robots of this layout
	 * @param locale the locale to set the localized robots for
	 */
	public void setRobots(String robots, Locale locale);

	public void setRobots(String robots, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized robotses of this layout from the map of locales and localized robotses.
	 *
	 * @param robotsMap the locales and localized robotses of this layout
	 */
	public void setRobotsMap(Map<Locale, String> robotsMap);

	public void setRobotsMap(Map<Locale, String> robotsMap, Locale defaultLocale);

	/**
	 * Gets the type of this layout.
	 *
	 * @return the type of this layout
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this layout.
	 *
	 * @param type the type of this layout
	 */
	public void setType(String type);

	/**
	 * Gets the type settings of this layout.
	 *
	 * @return the type settings of this layout
	 */
	@AutoEscape
	public String getTypeSettings();

	/**
	 * Sets the type settings of this layout.
	 *
	 * @param typeSettings the type settings of this layout
	 */
	public void setTypeSettings(String typeSettings);

	/**
	 * Gets the hidden of this layout.
	 *
	 * @return the hidden of this layout
	 */
	public boolean getHidden();

	/**
	 * Determines if this layout is hidden.
	 *
	 * @return <code>true</code> if this layout is hidden; <code>false</code> otherwise
	 */
	public boolean isHidden();

	/**
	 * Sets whether this layout is hidden.
	 *
	 * @param hidden the hidden of this layout
	 */
	public void setHidden(boolean hidden);

	/**
	 * Gets the friendly u r l of this layout.
	 *
	 * @return the friendly u r l of this layout
	 */
	@AutoEscape
	public String getFriendlyURL();

	/**
	 * Sets the friendly u r l of this layout.
	 *
	 * @param friendlyURL the friendly u r l of this layout
	 */
	public void setFriendlyURL(String friendlyURL);

	/**
	 * Gets the icon image of this layout.
	 *
	 * @return the icon image of this layout
	 */
	public boolean getIconImage();

	/**
	 * Determines if this layout is icon image.
	 *
	 * @return <code>true</code> if this layout is icon image; <code>false</code> otherwise
	 */
	public boolean isIconImage();

	/**
	 * Sets whether this layout is icon image.
	 *
	 * @param iconImage the icon image of this layout
	 */
	public void setIconImage(boolean iconImage);

	/**
	 * Gets the icon image ID of this layout.
	 *
	 * @return the icon image ID of this layout
	 */
	public long getIconImageId();

	/**
	 * Sets the icon image ID of this layout.
	 *
	 * @param iconImageId the icon image ID of this layout
	 */
	public void setIconImageId(long iconImageId);

	/**
	 * Gets the theme ID of this layout.
	 *
	 * @return the theme ID of this layout
	 */
	@AutoEscape
	public String getThemeId();

	/**
	 * Sets the theme ID of this layout.
	 *
	 * @param themeId the theme ID of this layout
	 */
	public void setThemeId(String themeId);

	/**
	 * Gets the color scheme ID of this layout.
	 *
	 * @return the color scheme ID of this layout
	 */
	@AutoEscape
	public String getColorSchemeId();

	/**
	 * Sets the color scheme ID of this layout.
	 *
	 * @param colorSchemeId the color scheme ID of this layout
	 */
	public void setColorSchemeId(String colorSchemeId);

	/**
	 * Gets the wap theme ID of this layout.
	 *
	 * @return the wap theme ID of this layout
	 */
	@AutoEscape
	public String getWapThemeId();

	/**
	 * Sets the wap theme ID of this layout.
	 *
	 * @param wapThemeId the wap theme ID of this layout
	 */
	public void setWapThemeId(String wapThemeId);

	/**
	 * Gets the wap color scheme ID of this layout.
	 *
	 * @return the wap color scheme ID of this layout
	 */
	@AutoEscape
	public String getWapColorSchemeId();

	/**
	 * Sets the wap color scheme ID of this layout.
	 *
	 * @param wapColorSchemeId the wap color scheme ID of this layout
	 */
	public void setWapColorSchemeId(String wapColorSchemeId);

	/**
	 * Gets the css of this layout.
	 *
	 * @return the css of this layout
	 */
	@AutoEscape
	public String getCss();

	/**
	 * Sets the css of this layout.
	 *
	 * @param css the css of this layout
	 */
	public void setCss(String css);

	/**
	 * Gets the priority of this layout.
	 *
	 * @return the priority of this layout
	 */
	public int getPriority();

	/**
	 * Sets the priority of this layout.
	 *
	 * @param priority the priority of this layout
	 */
	public void setPriority(int priority);

	/**
	 * Gets the layout prototype ID of this layout.
	 *
	 * @return the layout prototype ID of this layout
	 */
	public long getLayoutPrototypeId();

	/**
	 * Sets the layout prototype ID of this layout.
	 *
	 * @param layoutPrototypeId the layout prototype ID of this layout
	 */
	public void setLayoutPrototypeId(long layoutPrototypeId);

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

	public int compareTo(Layout layout);

	public int hashCode();

	public Layout toEscapedModel();

	public String toString();

	public String toXmlString();
}