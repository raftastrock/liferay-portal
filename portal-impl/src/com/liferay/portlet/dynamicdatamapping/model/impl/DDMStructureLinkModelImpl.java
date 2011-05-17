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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructureLinkModel;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructureLinkSoap;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the DDMStructureLink service. Represents a row in the &quot;DDMStructureLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.dynamicdatamapping.model.DDMStructureLinkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DDMStructureLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureLinkImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink
 * @see com.liferay.portlet.dynamicdatamapping.model.DDMStructureLinkModel
 * @generated
 */
public class DDMStructureLinkModelImpl extends BaseModelImpl<DDMStructureLink>
	implements DDMStructureLinkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d d m structure link model instance should use the {@link com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink} interface instead.
	 */
	public static final String TABLE_NAME = "DDMStructureLink";
	public static final Object[][] TABLE_COLUMNS = {
			{ "structureLinkId", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "structureId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table DDMStructureLink (structureLinkId LONG not null primary key,classNameId LONG,classPK LONG,structureId LONG)";
	public static final String TABLE_SQL_DROP = "drop table DDMStructureLink";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DDMStructureLink toModel(DDMStructureLinkSoap soapModel) {
		DDMStructureLink model = new DDMStructureLinkImpl();

		model.setStructureLinkId(soapModel.getStructureLinkId());
		model.setClassNameId(soapModel.getClassNameId());
		model.setClassPK(soapModel.getClassPK());
		model.setStructureId(soapModel.getStructureId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DDMStructureLink> toModels(
		DDMStructureLinkSoap[] soapModels) {
		List<DDMStructureLink> models = new ArrayList<DDMStructureLink>(soapModels.length);

		for (DDMStructureLinkSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return DDMStructureLink.class;
	}

	public String getModelClassName() {
		return DDMStructureLink.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink"));

	public DDMStructureLinkModelImpl() {
	}

	public long getPrimaryKey() {
		return _structureLinkId;
	}

	public void setPrimaryKey(long primaryKey) {
		setStructureLinkId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_structureLinkId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getStructureLinkId() {
		return _structureLinkId;
	}

	public void setStructureLinkId(long structureLinkId) {
		_structureLinkId = structureLinkId;
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

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		if (!_setOriginalClassPK) {
			_setOriginalClassPK = true;

			_originalClassPK = _classPK;
		}

		_classPK = classPK;
	}

	public long getOriginalClassPK() {
		return _originalClassPK;
	}

	public long getStructureId() {
		return _structureId;
	}

	public void setStructureId(long structureId) {
		_structureId = structureId;
	}

	public DDMStructureLink toEscapedModel() {
		if (isEscapedModel()) {
			return (DDMStructureLink)this;
		}
		else {
			return (DDMStructureLink)Proxy.newProxyInstance(DDMStructureLink.class.getClassLoader(),
				new Class[] { DDMStructureLink.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					DDMStructureLink.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DDMStructureLinkImpl ddmStructureLinkImpl = new DDMStructureLinkImpl();

		ddmStructureLinkImpl.setStructureLinkId(getStructureLinkId());
		ddmStructureLinkImpl.setClassNameId(getClassNameId());
		ddmStructureLinkImpl.setClassPK(getClassPK());
		ddmStructureLinkImpl.setStructureId(getStructureId());

		ddmStructureLinkImpl.resetOriginalValues();

		return ddmStructureLinkImpl;
	}

	public int compareTo(DDMStructureLink ddmStructureLink) {
		long primaryKey = ddmStructureLink.getPrimaryKey();

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

		DDMStructureLink ddmStructureLink = null;

		try {
			ddmStructureLink = (DDMStructureLink)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = ddmStructureLink.getPrimaryKey();

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
		DDMStructureLinkModelImpl ddmStructureLinkModelImpl = this;

		ddmStructureLinkModelImpl._originalClassPK = ddmStructureLinkModelImpl._classPK;

		ddmStructureLinkModelImpl._setOriginalClassPK = false;
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{structureLinkId=");
		sb.append(getStructureLinkId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", structureId=");
		sb.append(getStructureId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>structureLinkId</column-name><column-value><![CDATA[");
		sb.append(getStructureLinkId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>structureId</column-name><column-value><![CDATA[");
		sb.append(getStructureId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _structureLinkId;
	private long _classNameId;
	private long _classPK;
	private long _originalClassPK;
	private boolean _setOriginalClassPK;
	private long _structureId;
	private transient ExpandoBridge _expandoBridge;
}