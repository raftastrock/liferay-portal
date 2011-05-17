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

package com.liferay.portlet.dynamicdatamapping.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructureModel;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructureSoap;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the DDMStructure service. Represents a row in the &quot;DDMStructure&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.dynamicdatamapping.model.DDMStructureModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DDMStructureImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.DDMStructure
 * @see com.liferay.portlet.dynamicdatamapping.model.DDMStructureModel
 * @generated
 */
public class DDMStructureModelImpl extends BaseModelImpl<DDMStructure>
	implements DDMStructureModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d d m structure model instance should use the {@link com.liferay.portlet.dynamicdatamapping.model.DDMStructure} interface instead.
	 */
	public static final String TABLE_NAME = "DDMStructure";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "structureId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "classNameId", Types.BIGINT },
			{ "structureKey", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "xsd", Types.CLOB },
			{ "storageType", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DDMStructure (uuid_ VARCHAR(75) null,structureId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,classNameId LONG,structureKey VARCHAR(75) null,name VARCHAR(75) null,description STRING null,xsd TEXT null,storageType VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DDMStructure";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.dynamicdatamapping.model.DDMStructure"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.dynamicdatamapping.model.DDMStructure"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DDMStructure toModel(DDMStructureSoap soapModel) {
		DDMStructure model = new DDMStructureImpl();

		model.setUuid(soapModel.getUuid());
		model.setStructureId(soapModel.getStructureId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setClassNameId(soapModel.getClassNameId());
		model.setStructureKey(soapModel.getStructureKey());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setXsd(soapModel.getXsd());
		model.setStorageType(soapModel.getStorageType());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DDMStructure> toModels(DDMStructureSoap[] soapModels) {
		List<DDMStructure> models = new ArrayList<DDMStructure>(soapModels.length);

		for (DDMStructureSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return DDMStructure.class;
	}

	public String getModelClassName() {
		return DDMStructure.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.dynamicdatamapping.model.DDMStructure"));

	public DDMStructureModelImpl() {
	}

	public long getPrimaryKey() {
		return _structureId;
	}

	public void setPrimaryKey(long primaryKey) {
		setStructureId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_structureId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getStructureId() {
		return _structureId;
	}

	public void setStructureId(long structureId) {
		_structureId = structureId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public String getStructureKey() {
		if (_structureKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _structureKey;
		}
	}

	public void setStructureKey(String structureKey) {
		if (_originalStructureKey == null) {
			_originalStructureKey = _structureKey;
		}

		_structureKey = structureKey;
	}

	public String getOriginalStructureKey() {
		return GetterUtil.getString(_originalStructureKey);
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getXsd() {
		if (_xsd == null) {
			return StringPool.BLANK;
		}
		else {
			return _xsd;
		}
	}

	public void setXsd(String xsd) {
		_xsd = xsd;
	}

	public String getStorageType() {
		if (_storageType == null) {
			return StringPool.BLANK;
		}
		else {
			return _storageType;
		}
	}

	public void setStorageType(String storageType) {
		_storageType = storageType;
	}

	public DDMStructure toEscapedModel() {
		if (isEscapedModel()) {
			return (DDMStructure)this;
		}
		else {
			return (DDMStructure)Proxy.newProxyInstance(DDMStructure.class.getClassLoader(),
				new Class[] { DDMStructure.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					DDMStructure.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DDMStructureImpl ddmStructureImpl = new DDMStructureImpl();

		ddmStructureImpl.setUuid(getUuid());
		ddmStructureImpl.setStructureId(getStructureId());
		ddmStructureImpl.setGroupId(getGroupId());
		ddmStructureImpl.setCompanyId(getCompanyId());
		ddmStructureImpl.setUserId(getUserId());
		ddmStructureImpl.setUserName(getUserName());
		ddmStructureImpl.setCreateDate(getCreateDate());
		ddmStructureImpl.setModifiedDate(getModifiedDate());
		ddmStructureImpl.setClassNameId(getClassNameId());
		ddmStructureImpl.setStructureKey(getStructureKey());
		ddmStructureImpl.setName(getName());
		ddmStructureImpl.setDescription(getDescription());
		ddmStructureImpl.setXsd(getXsd());
		ddmStructureImpl.setStorageType(getStorageType());

		ddmStructureImpl.resetOriginalValues();

		return ddmStructureImpl;
	}

	public int compareTo(DDMStructure ddmStructure) {
		long primaryKey = ddmStructure.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DDMStructure ddmStructure = null;

		try {
			ddmStructure = (DDMStructure)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = ddmStructure.getPrimaryKey();

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
		DDMStructureModelImpl ddmStructureModelImpl = this;

		ddmStructureModelImpl._originalUuid = ddmStructureModelImpl._uuid;

		ddmStructureModelImpl._originalGroupId = ddmStructureModelImpl._groupId;

		ddmStructureModelImpl._setOriginalGroupId = false;

		ddmStructureModelImpl._originalStructureKey = ddmStructureModelImpl._structureKey;
	}

	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", structureId=");
		sb.append(getStructureId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", structureKey=");
		sb.append(getStructureKey());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", xsd=");
		sb.append(getXsd());
		sb.append(", storageType=");
		sb.append(getStorageType());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.dynamicdatamapping.model.DDMStructure");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>structureId</column-name><column-value><![CDATA[");
		sb.append(getStructureId());
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
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>structureKey</column-name><column-value><![CDATA[");
		sb.append(getStructureKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xsd</column-name><column-value><![CDATA[");
		sb.append(getXsd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>storageType</column-name><column-value><![CDATA[");
		sb.append(getStorageType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private String _originalUuid;
	private long _structureId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private String _structureKey;
	private String _originalStructureKey;
	private String _name;
	private String _description;
	private String _xsd;
	private String _storageType;
	private transient ExpandoBridge _expandoBridge;
}