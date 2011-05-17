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

import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.UserGroupGroupRolePK;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the UserGroupGroupRole service. Represents a row in the &quot;UserGroupGroupRole&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.UserGroupGroupRoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.UserGroupGroupRoleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupGroupRole
 * @see com.liferay.portal.model.impl.UserGroupGroupRoleImpl
 * @see com.liferay.portal.model.impl.UserGroupGroupRoleModelImpl
 * @generated
 */
public interface UserGroupGroupRoleModel extends BaseModel<UserGroupGroupRole> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user group group role model instance should use the {@link UserGroupGroupRole} interface instead.
	 */

	/**
	 * Gets the primary key of this user group group role.
	 *
	 * @return the primary key of this user group group role
	 */
	public UserGroupGroupRolePK getPrimaryKey();

	/**
	 * Sets the primary key of this user group group role
	 *
	 * @param pk the primary key of this user group group role
	 */
	public void setPrimaryKey(UserGroupGroupRolePK primaryKey);

	/**
	 * Gets the user group ID of this user group group role.
	 *
	 * @return the user group ID of this user group group role
	 */
	public long getUserGroupId();

	/**
	 * Sets the user group ID of this user group group role.
	 *
	 * @param userGroupId the user group ID of this user group group role
	 */
	public void setUserGroupId(long userGroupId);

	/**
	 * Gets the group ID of this user group group role.
	 *
	 * @return the group ID of this user group group role
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this user group group role.
	 *
	 * @param groupId the group ID of this user group group role
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the role ID of this user group group role.
	 *
	 * @return the role ID of this user group group role
	 */
	public long getRoleId();

	/**
	 * Sets the role ID of this user group group role.
	 *
	 * @param roleId the role ID of this user group group role
	 */
	public void setRoleId(long roleId);

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

	public int compareTo(UserGroupGroupRole userGroupGroupRole);

	public int hashCode();

	public UserGroupGroupRole toEscapedModel();

	public String toString();

	public String toXmlString();
}