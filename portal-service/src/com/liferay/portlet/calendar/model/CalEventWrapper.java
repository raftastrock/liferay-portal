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

package com.liferay.portlet.calendar.model;

/**
 * <p>
 * This class is a wrapper for {@link CalEvent}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       CalEvent
 * @generated
 */
public class CalEventWrapper implements CalEvent {
	public CalEventWrapper(CalEvent calEvent) {
		_calEvent = calEvent;
	}

	public Class<?> getModelClass() {
		return CalEvent.class;
	}

	public String getModelClassName() {
		return CalEvent.class.getName();
	}

	/**
	* Gets the primary key of this cal event.
	*
	* @return the primary key of this cal event
	*/
	public long getPrimaryKey() {
		return _calEvent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cal event
	*
	* @param pk the primary key of this cal event
	*/
	public void setPrimaryKey(long primaryKey) {
		_calEvent.setPrimaryKey(primaryKey);
	}

	/**
	* Gets the uuid of this cal event.
	*
	* @return the uuid of this cal event
	*/
	public java.lang.String getUuid() {
		return _calEvent.getUuid();
	}

	/**
	* Sets the uuid of this cal event.
	*
	* @param uuid the uuid of this cal event
	*/
	public void setUuid(java.lang.String uuid) {
		_calEvent.setUuid(uuid);
	}

	/**
	* Gets the event ID of this cal event.
	*
	* @return the event ID of this cal event
	*/
	public long getEventId() {
		return _calEvent.getEventId();
	}

	/**
	* Sets the event ID of this cal event.
	*
	* @param eventId the event ID of this cal event
	*/
	public void setEventId(long eventId) {
		_calEvent.setEventId(eventId);
	}

	/**
	* Gets the group ID of this cal event.
	*
	* @return the group ID of this cal event
	*/
	public long getGroupId() {
		return _calEvent.getGroupId();
	}

	/**
	* Sets the group ID of this cal event.
	*
	* @param groupId the group ID of this cal event
	*/
	public void setGroupId(long groupId) {
		_calEvent.setGroupId(groupId);
	}

	/**
	* Gets the company ID of this cal event.
	*
	* @return the company ID of this cal event
	*/
	public long getCompanyId() {
		return _calEvent.getCompanyId();
	}

	/**
	* Sets the company ID of this cal event.
	*
	* @param companyId the company ID of this cal event
	*/
	public void setCompanyId(long companyId) {
		_calEvent.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this cal event.
	*
	* @return the user ID of this cal event
	*/
	public long getUserId() {
		return _calEvent.getUserId();
	}

	/**
	* Sets the user ID of this cal event.
	*
	* @param userId the user ID of this cal event
	*/
	public void setUserId(long userId) {
		_calEvent.setUserId(userId);
	}

	/**
	* Gets the user uuid of this cal event.
	*
	* @return the user uuid of this cal event
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calEvent.getUserUuid();
	}

	/**
	* Sets the user uuid of this cal event.
	*
	* @param userUuid the user uuid of this cal event
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_calEvent.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this cal event.
	*
	* @return the user name of this cal event
	*/
	public java.lang.String getUserName() {
		return _calEvent.getUserName();
	}

	/**
	* Sets the user name of this cal event.
	*
	* @param userName the user name of this cal event
	*/
	public void setUserName(java.lang.String userName) {
		_calEvent.setUserName(userName);
	}

	/**
	* Gets the create date of this cal event.
	*
	* @return the create date of this cal event
	*/
	public java.util.Date getCreateDate() {
		return _calEvent.getCreateDate();
	}

	/**
	* Sets the create date of this cal event.
	*
	* @param createDate the create date of this cal event
	*/
	public void setCreateDate(java.util.Date createDate) {
		_calEvent.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this cal event.
	*
	* @return the modified date of this cal event
	*/
	public java.util.Date getModifiedDate() {
		return _calEvent.getModifiedDate();
	}

	/**
	* Sets the modified date of this cal event.
	*
	* @param modifiedDate the modified date of this cal event
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_calEvent.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the title of this cal event.
	*
	* @return the title of this cal event
	*/
	public java.lang.String getTitle() {
		return _calEvent.getTitle();
	}

	/**
	* Sets the title of this cal event.
	*
	* @param title the title of this cal event
	*/
	public void setTitle(java.lang.String title) {
		_calEvent.setTitle(title);
	}

	/**
	* Gets the description of this cal event.
	*
	* @return the description of this cal event
	*/
	public java.lang.String getDescription() {
		return _calEvent.getDescription();
	}

	/**
	* Sets the description of this cal event.
	*
	* @param description the description of this cal event
	*/
	public void setDescription(java.lang.String description) {
		_calEvent.setDescription(description);
	}

	/**
	* Gets the location of this cal event.
	*
	* @return the location of this cal event
	*/
	public java.lang.String getLocation() {
		return _calEvent.getLocation();
	}

	/**
	* Sets the location of this cal event.
	*
	* @param location the location of this cal event
	*/
	public void setLocation(java.lang.String location) {
		_calEvent.setLocation(location);
	}

	/**
	* Gets the start date of this cal event.
	*
	* @return the start date of this cal event
	*/
	public java.util.Date getStartDate() {
		return _calEvent.getStartDate();
	}

	/**
	* Sets the start date of this cal event.
	*
	* @param startDate the start date of this cal event
	*/
	public void setStartDate(java.util.Date startDate) {
		_calEvent.setStartDate(startDate);
	}

	/**
	* Gets the end date of this cal event.
	*
	* @return the end date of this cal event
	*/
	public java.util.Date getEndDate() {
		return _calEvent.getEndDate();
	}

	/**
	* Sets the end date of this cal event.
	*
	* @param endDate the end date of this cal event
	*/
	public void setEndDate(java.util.Date endDate) {
		_calEvent.setEndDate(endDate);
	}

	/**
	* Gets the duration hour of this cal event.
	*
	* @return the duration hour of this cal event
	*/
	public int getDurationHour() {
		return _calEvent.getDurationHour();
	}

	/**
	* Sets the duration hour of this cal event.
	*
	* @param durationHour the duration hour of this cal event
	*/
	public void setDurationHour(int durationHour) {
		_calEvent.setDurationHour(durationHour);
	}

	/**
	* Gets the duration minute of this cal event.
	*
	* @return the duration minute of this cal event
	*/
	public int getDurationMinute() {
		return _calEvent.getDurationMinute();
	}

	/**
	* Sets the duration minute of this cal event.
	*
	* @param durationMinute the duration minute of this cal event
	*/
	public void setDurationMinute(int durationMinute) {
		_calEvent.setDurationMinute(durationMinute);
	}

	/**
	* Gets the all day of this cal event.
	*
	* @return the all day of this cal event
	*/
	public boolean getAllDay() {
		return _calEvent.getAllDay();
	}

	/**
	* Determines if this cal event is all day.
	*
	* @return <code>true</code> if this cal event is all day; <code>false</code> otherwise
	*/
	public boolean isAllDay() {
		return _calEvent.isAllDay();
	}

	/**
	* Sets whether this cal event is all day.
	*
	* @param allDay the all day of this cal event
	*/
	public void setAllDay(boolean allDay) {
		_calEvent.setAllDay(allDay);
	}

	/**
	* Gets the time zone sensitive of this cal event.
	*
	* @return the time zone sensitive of this cal event
	*/
	public boolean getTimeZoneSensitive() {
		return _calEvent.getTimeZoneSensitive();
	}

	/**
	* Determines if this cal event is time zone sensitive.
	*
	* @return <code>true</code> if this cal event is time zone sensitive; <code>false</code> otherwise
	*/
	public boolean isTimeZoneSensitive() {
		return _calEvent.isTimeZoneSensitive();
	}

	/**
	* Sets whether this cal event is time zone sensitive.
	*
	* @param timeZoneSensitive the time zone sensitive of this cal event
	*/
	public void setTimeZoneSensitive(boolean timeZoneSensitive) {
		_calEvent.setTimeZoneSensitive(timeZoneSensitive);
	}

	/**
	* Gets the type of this cal event.
	*
	* @return the type of this cal event
	*/
	public java.lang.String getType() {
		return _calEvent.getType();
	}

	/**
	* Sets the type of this cal event.
	*
	* @param type the type of this cal event
	*/
	public void setType(java.lang.String type) {
		_calEvent.setType(type);
	}

	/**
	* Gets the repeating of this cal event.
	*
	* @return the repeating of this cal event
	*/
	public boolean getRepeating() {
		return _calEvent.getRepeating();
	}

	/**
	* Determines if this cal event is repeating.
	*
	* @return <code>true</code> if this cal event is repeating; <code>false</code> otherwise
	*/
	public boolean isRepeating() {
		return _calEvent.isRepeating();
	}

	/**
	* Sets whether this cal event is repeating.
	*
	* @param repeating the repeating of this cal event
	*/
	public void setRepeating(boolean repeating) {
		_calEvent.setRepeating(repeating);
	}

	/**
	* Gets the recurrence of this cal event.
	*
	* @return the recurrence of this cal event
	*/
	public java.lang.String getRecurrence() {
		return _calEvent.getRecurrence();
	}

	/**
	* Sets the recurrence of this cal event.
	*
	* @param recurrence the recurrence of this cal event
	*/
	public void setRecurrence(java.lang.String recurrence) {
		_calEvent.setRecurrence(recurrence);
	}

	/**
	* Gets the remind by of this cal event.
	*
	* @return the remind by of this cal event
	*/
	public int getRemindBy() {
		return _calEvent.getRemindBy();
	}

	/**
	* Sets the remind by of this cal event.
	*
	* @param remindBy the remind by of this cal event
	*/
	public void setRemindBy(int remindBy) {
		_calEvent.setRemindBy(remindBy);
	}

	/**
	* Gets the first reminder of this cal event.
	*
	* @return the first reminder of this cal event
	*/
	public int getFirstReminder() {
		return _calEvent.getFirstReminder();
	}

	/**
	* Sets the first reminder of this cal event.
	*
	* @param firstReminder the first reminder of this cal event
	*/
	public void setFirstReminder(int firstReminder) {
		_calEvent.setFirstReminder(firstReminder);
	}

	/**
	* Gets the second reminder of this cal event.
	*
	* @return the second reminder of this cal event
	*/
	public int getSecondReminder() {
		return _calEvent.getSecondReminder();
	}

	/**
	* Sets the second reminder of this cal event.
	*
	* @param secondReminder the second reminder of this cal event
	*/
	public void setSecondReminder(int secondReminder) {
		_calEvent.setSecondReminder(secondReminder);
	}

	public boolean isNew() {
		return _calEvent.isNew();
	}

	public void setNew(boolean n) {
		_calEvent.setNew(n);
	}

	public boolean isCachedModel() {
		return _calEvent.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_calEvent.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _calEvent.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_calEvent.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _calEvent.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_calEvent.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _calEvent.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_calEvent.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new CalEventWrapper((CalEvent)_calEvent.clone());
	}

	public int compareTo(com.liferay.portlet.calendar.model.CalEvent calEvent) {
		return _calEvent.compareTo(calEvent);
	}

	public int hashCode() {
		return _calEvent.hashCode();
	}

	public com.liferay.portlet.calendar.model.CalEvent toEscapedModel() {
		return new CalEventWrapper(_calEvent.toEscapedModel());
	}

	public java.lang.String toString() {
		return _calEvent.toString();
	}

	public java.lang.String toXmlString() {
		return _calEvent.toXmlString();
	}

	public com.liferay.portal.kernel.cal.TZSRecurrence getRecurrenceObj() {
		return _calEvent.getRecurrenceObj();
	}

	public void setRecurrenceObj(
		com.liferay.portal.kernel.cal.TZSRecurrence recurrenceObj) {
		_calEvent.setRecurrenceObj(recurrenceObj);
	}

	public CalEvent getWrappedCalEvent() {
		return _calEvent;
	}

	public void resetOriginalValues() {
		_calEvent.resetOriginalValues();
	}

	private CalEvent _calEvent;
}