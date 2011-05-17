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

package com.liferay.portlet.documentlibrary.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.documentlibrary.model.DLFileRank;
import com.liferay.portlet.documentlibrary.model.DLFileRankModel;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DLFileRank service. Represents a row in the &quot;DLFileRank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.documentlibrary.model.DLFileRankModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DLFileRankImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLFileRankImpl
 * @see com.liferay.portlet.documentlibrary.model.DLFileRank
 * @see com.liferay.portlet.documentlibrary.model.DLFileRankModel
 * @generated
 */
public class DLFileRankModelImpl extends BaseModelImpl<DLFileRank>
	implements DLFileRankModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d l file rank model instance should use the {@link com.liferay.portlet.documentlibrary.model.DLFileRank} interface instead.
	 */
	public static final String TABLE_NAME = "DLFileRank";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fileRankId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "fileEntryId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table DLFileRank (fileRankId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createDate DATE null,fileEntryId LONG)";
	public static final String TABLE_SQL_DROP = "drop table DLFileRank";
	public static final String ORDER_BY_JPQL = " ORDER BY dlFileRank.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY DLFileRank.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.documentlibrary.model.DLFileRank"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.documentlibrary.model.DLFileRank"),
			true);

	public Class<?> getModelClass() {
		return DLFileRank.class;
	}

	public String getModelClassName() {
		return DLFileRank.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.documentlibrary.model.DLFileRank"));

	public DLFileRankModelImpl() {
	}

	public long getPrimaryKey() {
		return _fileRankId;
	}

	public void setPrimaryKey(long primaryKey) {
		setFileRankId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_fileRankId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getFileRankId() {
		return _fileRankId;
	}

	public void setFileRankId(long fileRankId) {
		_fileRankId = fileRankId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		if (!_setOriginalFileEntryId) {
			_setOriginalFileEntryId = true;

			_originalFileEntryId = _fileEntryId;
		}

		_fileEntryId = fileEntryId;
	}

	public long getOriginalFileEntryId() {
		return _originalFileEntryId;
	}

	public DLFileRank toEscapedModel() {
		if (isEscapedModel()) {
			return (DLFileRank)this;
		}
		else {
			return (DLFileRank)Proxy.newProxyInstance(DLFileRank.class.getClassLoader(),
				new Class[] { DLFileRank.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					DLFileRank.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DLFileRankImpl dlFileRankImpl = new DLFileRankImpl();

		dlFileRankImpl.setFileRankId(getFileRankId());
		dlFileRankImpl.setGroupId(getGroupId());
		dlFileRankImpl.setCompanyId(getCompanyId());
		dlFileRankImpl.setUserId(getUserId());
		dlFileRankImpl.setCreateDate(getCreateDate());
		dlFileRankImpl.setFileEntryId(getFileEntryId());

		dlFileRankImpl.resetOriginalValues();

		return dlFileRankImpl;
	}

	public int compareTo(DLFileRank dlFileRank) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), dlFileRank.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DLFileRank dlFileRank = null;

		try {
			dlFileRank = (DLFileRank)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dlFileRank.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
		DLFileRankModelImpl dlFileRankModelImpl = this;

		dlFileRankModelImpl._originalCompanyId = dlFileRankModelImpl._companyId;

		dlFileRankModelImpl._setOriginalCompanyId = false;

		dlFileRankModelImpl._originalUserId = dlFileRankModelImpl._userId;

		dlFileRankModelImpl._setOriginalUserId = false;

		dlFileRankModelImpl._originalFileEntryId = dlFileRankModelImpl._fileEntryId;

		dlFileRankModelImpl._setOriginalFileEntryId = false;
	}

	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{fileRankId=");
		sb.append(getFileRankId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.documentlibrary.model.DLFileRank");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fileRankId</column-name><column-value><![CDATA[");
		sb.append(getFileRankId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _fileRankId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private Date _createDate;
	private long _fileEntryId;
	private long _originalFileEntryId;
	private boolean _setOriginalFileEntryId;
	private transient ExpandoBridge _expandoBridge;
}