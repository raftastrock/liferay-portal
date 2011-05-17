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

package com.liferay.portlet.journal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.ResourcedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the JournalArticle service. Represents a row in the &quot;JournalArticle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.journal.model.impl.JournalArticleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.journal.model.impl.JournalArticleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalArticle
 * @see com.liferay.portlet.journal.model.impl.JournalArticleImpl
 * @see com.liferay.portlet.journal.model.impl.JournalArticleModelImpl
 * @generated
 */
public interface JournalArticleModel extends BaseModel<JournalArticle>,
	GroupedModel, ResourcedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a journal article model instance should use the {@link JournalArticle} interface instead.
	 */

	/**
	 * Gets the primary key of this journal article.
	 *
	 * @return the primary key of this journal article
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this journal article
	 *
	 * @param pk the primary key of this journal article
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Gets the uuid of this journal article.
	 *
	 * @return the uuid of this journal article
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this journal article.
	 *
	 * @param uuid the uuid of this journal article
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the ID of this journal article.
	 *
	 * @return the ID of this journal article
	 */
	public long getId();

	/**
	 * Sets the ID of this journal article.
	 *
	 * @param id the ID of this journal article
	 */
	public void setId(long id);

	/**
	 * Gets the resource prim key of this journal article.
	 *
	 * @return the resource prim key of this journal article
	 */
	public long getResourcePrimKey();

	/**
	 * Sets the resource prim key of this journal article.
	 *
	 * @param resourcePrimKey the resource prim key of this journal article
	 */
	public void setResourcePrimKey(long resourcePrimKey);

	public boolean isResourceMain();

	/**
	 * Gets the group ID of this journal article.
	 *
	 * @return the group ID of this journal article
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this journal article.
	 *
	 * @param groupId the group ID of this journal article
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this journal article.
	 *
	 * @return the company ID of this journal article
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this journal article.
	 *
	 * @param companyId the company ID of this journal article
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this journal article.
	 *
	 * @return the user ID of this journal article
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this journal article.
	 *
	 * @param userId the user ID of this journal article
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this journal article.
	 *
	 * @return the user uuid of this journal article
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this journal article.
	 *
	 * @param userUuid the user uuid of this journal article
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this journal article.
	 *
	 * @return the user name of this journal article
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this journal article.
	 *
	 * @param userName the user name of this journal article
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this journal article.
	 *
	 * @return the create date of this journal article
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this journal article.
	 *
	 * @param createDate the create date of this journal article
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this journal article.
	 *
	 * @return the modified date of this journal article
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this journal article.
	 *
	 * @param modifiedDate the modified date of this journal article
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the class name of the model instance this journal article is polymorphically associated with.
	 *
	 * @return the class name of the model instance this journal article is polymorphically associated with
	 */
	public String getClassName();

	/**
	 * Gets the class name ID of this journal article.
	 *
	 * @return the class name ID of this journal article
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this journal article.
	 *
	 * @param classNameId the class name ID of this journal article
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Gets the class p k of this journal article.
	 *
	 * @return the class p k of this journal article
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this journal article.
	 *
	 * @param classPK the class p k of this journal article
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the article ID of this journal article.
	 *
	 * @return the article ID of this journal article
	 */
	public String getArticleId();

	/**
	 * Sets the article ID of this journal article.
	 *
	 * @param articleId the article ID of this journal article
	 */
	public void setArticleId(String articleId);

	/**
	 * Gets the version of this journal article.
	 *
	 * @return the version of this journal article
	 */
	public double getVersion();

	/**
	 * Sets the version of this journal article.
	 *
	 * @param version the version of this journal article
	 */
	public void setVersion(double version);

	/**
	 * Gets the title of this journal article.
	 *
	 * @return the title of this journal article
	 */
	public String getTitle();

	/**
	 * Gets the localized title of this journal article. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized title for
	 * @return the localized title of this journal article
	 */
	public String getTitle(Locale locale);

	/**
	 * Gets the localized title of this journal article, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this journal article. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Gets the localized title of this journal article. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @return the localized title of this journal article
	 */
	public String getTitle(String languageId);

	/**
	 * Gets the localized title of this journal article, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this journal article
	 */
	public String getTitle(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized title of this journal article.
	 *
	 * @return the locales and localized title
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this journal article.
	 *
	 * @param title the title of this journal article
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this journal article.
	 *
	 * @param title the localized title of this journal article
	 * @param locale the locale to set the localized title for
	 */
	public void setTitle(String title, Locale locale);

	public void setTitle(String title, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized titles of this journal article from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this journal article
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Gets the url title of this journal article.
	 *
	 * @return the url title of this journal article
	 */
	@AutoEscape
	public String getUrlTitle();

	/**
	 * Sets the url title of this journal article.
	 *
	 * @param urlTitle the url title of this journal article
	 */
	public void setUrlTitle(String urlTitle);

	/**
	 * Gets the description of this journal article.
	 *
	 * @return the description of this journal article
	 */
	public String getDescription();

	/**
	 * Gets the localized description of this journal article. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized description for
	 * @return the localized description of this journal article
	 */
	public String getDescription(Locale locale);

	/**
	 * Gets the localized description of this journal article, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this journal article. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Gets the localized description of this journal article. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @return the localized description of this journal article
	 */
	public String getDescription(String languageId);

	/**
	 * Gets the localized description of this journal article, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this journal article
	 */
	public String getDescription(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized description of this journal article.
	 *
	 * @return the locales and localized description
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this journal article.
	 *
	 * @param description the description of this journal article
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this journal article.
	 *
	 * @param description the localized description of this journal article
	 * @param locale the locale to set the localized description for
	 */
	public void setDescription(String description, Locale locale);

	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	/**
	 * Sets the localized descriptions of this journal article from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this journal article
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Gets the content of this journal article.
	 *
	 * @return the content of this journal article
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this journal article.
	 *
	 * @param content the content of this journal article
	 */
	public void setContent(String content);

	/**
	 * Gets the type of this journal article.
	 *
	 * @return the type of this journal article
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this journal article.
	 *
	 * @param type the type of this journal article
	 */
	public void setType(String type);

	/**
	 * Gets the structure ID of this journal article.
	 *
	 * @return the structure ID of this journal article
	 */
	public String getStructureId();

	/**
	 * Sets the structure ID of this journal article.
	 *
	 * @param structureId the structure ID of this journal article
	 */
	public void setStructureId(String structureId);

	/**
	 * Gets the template ID of this journal article.
	 *
	 * @return the template ID of this journal article
	 */
	public String getTemplateId();

	/**
	 * Sets the template ID of this journal article.
	 *
	 * @param templateId the template ID of this journal article
	 */
	public void setTemplateId(String templateId);

	/**
	 * Gets the layout uuid of this journal article.
	 *
	 * @return the layout uuid of this journal article
	 */
	@AutoEscape
	public String getLayoutUuid();

	/**
	 * Sets the layout uuid of this journal article.
	 *
	 * @param layoutUuid the layout uuid of this journal article
	 */
	public void setLayoutUuid(String layoutUuid);

	/**
	 * Gets the display date of this journal article.
	 *
	 * @return the display date of this journal article
	 */
	public Date getDisplayDate();

	/**
	 * Sets the display date of this journal article.
	 *
	 * @param displayDate the display date of this journal article
	 */
	public void setDisplayDate(Date displayDate);

	/**
	 * Gets the expiration date of this journal article.
	 *
	 * @return the expiration date of this journal article
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this journal article.
	 *
	 * @param expirationDate the expiration date of this journal article
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Gets the review date of this journal article.
	 *
	 * @return the review date of this journal article
	 */
	public Date getReviewDate();

	/**
	 * Sets the review date of this journal article.
	 *
	 * @param reviewDate the review date of this journal article
	 */
	public void setReviewDate(Date reviewDate);

	/**
	 * Gets the indexable of this journal article.
	 *
	 * @return the indexable of this journal article
	 */
	public boolean getIndexable();

	/**
	 * Determines if this journal article is indexable.
	 *
	 * @return <code>true</code> if this journal article is indexable; <code>false</code> otherwise
	 */
	public boolean isIndexable();

	/**
	 * Sets whether this journal article is indexable.
	 *
	 * @param indexable the indexable of this journal article
	 */
	public void setIndexable(boolean indexable);

	/**
	 * Gets the small image of this journal article.
	 *
	 * @return the small image of this journal article
	 */
	public boolean getSmallImage();

	/**
	 * Determines if this journal article is small image.
	 *
	 * @return <code>true</code> if this journal article is small image; <code>false</code> otherwise
	 */
	public boolean isSmallImage();

	/**
	 * Sets whether this journal article is small image.
	 *
	 * @param smallImage the small image of this journal article
	 */
	public void setSmallImage(boolean smallImage);

	/**
	 * Gets the small image ID of this journal article.
	 *
	 * @return the small image ID of this journal article
	 */
	public long getSmallImageId();

	/**
	 * Sets the small image ID of this journal article.
	 *
	 * @param smallImageId the small image ID of this journal article
	 */
	public void setSmallImageId(long smallImageId);

	/**
	 * Gets the small image u r l of this journal article.
	 *
	 * @return the small image u r l of this journal article
	 */
	@AutoEscape
	public String getSmallImageURL();

	/**
	 * Sets the small image u r l of this journal article.
	 *
	 * @param smallImageURL the small image u r l of this journal article
	 */
	public void setSmallImageURL(String smallImageURL);

	/**
	 * Gets the status of this journal article.
	 *
	 * @return the status of this journal article
	 */
	public int getStatus();

	/**
	 * Sets the status of this journal article.
	 *
	 * @param status the status of this journal article
	 */
	public void setStatus(int status);

	/**
	 * Gets the status by user ID of this journal article.
	 *
	 * @return the status by user ID of this journal article
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this journal article.
	 *
	 * @param statusByUserId the status by user ID of this journal article
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Gets the status by user uuid of this journal article.
	 *
	 * @return the status by user uuid of this journal article
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this journal article.
	 *
	 * @param statusByUserUuid the status by user uuid of this journal article
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Gets the status by user name of this journal article.
	 *
	 * @return the status by user name of this journal article
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this journal article.
	 *
	 * @param statusByUserName the status by user name of this journal article
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Gets the status date of this journal article.
	 *
	 * @return the status date of this journal article
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this journal article.
	 *
	 * @param statusDate the status date of this journal article
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated {@link #isApproved}
	 */
	public boolean getApproved();

	/**
	 * Determines if this journal article is approved.
	 *
	 * @return <code>true</code> if this journal article is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines if this journal article is a draft.
	 *
	 * @return <code>true</code> if this journal article is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines if this journal article is expired.
	 *
	 * @return <code>true</code> if this journal article is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines if this journal article is pending.
	 *
	 * @return <code>true</code> if this journal article is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

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

	public int compareTo(JournalArticle journalArticle);

	public int hashCode();

	public JournalArticle toEscapedModel();

	public String toString();

	public String toXmlString();
}