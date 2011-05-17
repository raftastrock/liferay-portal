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

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.VirtualHost;
import com.liferay.portal.model.VirtualHostModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the VirtualHost service. Represents a row in the &quot;VirtualHost&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.VirtualHostModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VirtualHostImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VirtualHostImpl
 * @see com.liferay.portal.model.VirtualHost
 * @see com.liferay.portal.model.VirtualHostModel
 * @generated
 */
public class VirtualHostModelImpl extends BaseModelImpl<VirtualHost>
	implements VirtualHostModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a virtual host model instance should use the {@link com.liferay.portal.model.VirtualHost} interface instead.
	 */
	public static final String TABLE_NAME = "VirtualHost";
	public static final Object[][] TABLE_COLUMNS = {
			{ "virtualHostId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "layoutSetId", Types.BIGINT },
			{ "hostname", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table VirtualHost (virtualHostId LONG not null primary key,companyId LONG,layoutSetId LONG,hostname VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table VirtualHost";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.VirtualHost"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.VirtualHost"),
			true);

	public Class<?> getModelClass() {
		return VirtualHost.class;
	}

	public String getModelClassName() {
		return VirtualHost.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.VirtualHost"));

	public VirtualHostModelImpl() {
	}

	public long getPrimaryKey() {
		return _virtualHostId;
	}

	public void setPrimaryKey(long primaryKey) {
		setVirtualHostId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_virtualHostId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getVirtualHostId() {
		return _virtualHostId;
	}

	public void setVirtualHostId(long virtualHostId) {
		_virtualHostId = virtualHostId;
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

	public long getLayoutSetId() {
		return _layoutSetId;
	}

	public void setLayoutSetId(long layoutSetId) {
		if (!_setOriginalLayoutSetId) {
			_setOriginalLayoutSetId = true;

			_originalLayoutSetId = _layoutSetId;
		}

		_layoutSetId = layoutSetId;
	}

	public long getOriginalLayoutSetId() {
		return _originalLayoutSetId;
	}

	public String getHostname() {
		if (_hostname == null) {
			return StringPool.BLANK;
		}
		else {
			return _hostname;
		}
	}

	public void setHostname(String hostname) {
		if (_originalHostname == null) {
			_originalHostname = _hostname;
		}

		_hostname = hostname;
	}

	public String getOriginalHostname() {
		return GetterUtil.getString(_originalHostname);
	}

	public VirtualHost toEscapedModel() {
		if (isEscapedModel()) {
			return (VirtualHost)this;
		}
		else {
			return (VirtualHost)Proxy.newProxyInstance(VirtualHost.class.getClassLoader(),
				new Class[] { VirtualHost.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					VirtualHost.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		VirtualHostImpl virtualHostImpl = new VirtualHostImpl();

		virtualHostImpl.setVirtualHostId(getVirtualHostId());
		virtualHostImpl.setCompanyId(getCompanyId());
		virtualHostImpl.setLayoutSetId(getLayoutSetId());
		virtualHostImpl.setHostname(getHostname());

		virtualHostImpl.resetOriginalValues();

		return virtualHostImpl;
	}

	public int compareTo(VirtualHost virtualHost) {
		long primaryKey = virtualHost.getPrimaryKey();

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

		VirtualHost virtualHost = null;

		try {
			virtualHost = (VirtualHost)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = virtualHost.getPrimaryKey();

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
		VirtualHostModelImpl virtualHostModelImpl = this;

		virtualHostModelImpl._originalCompanyId = virtualHostModelImpl._companyId;

		virtualHostModelImpl._setOriginalCompanyId = false;

		virtualHostModelImpl._originalLayoutSetId = virtualHostModelImpl._layoutSetId;

		virtualHostModelImpl._setOriginalLayoutSetId = false;

		virtualHostModelImpl._originalHostname = virtualHostModelImpl._hostname;
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{virtualHostId=");
		sb.append(getVirtualHostId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", layoutSetId=");
		sb.append(getLayoutSetId());
		sb.append(", hostname=");
		sb.append(getHostname());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.VirtualHost");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>virtualHostId</column-name><column-value><![CDATA[");
		sb.append(getVirtualHostId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>layoutSetId</column-name><column-value><![CDATA[");
		sb.append(getLayoutSetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hostname</column-name><column-value><![CDATA[");
		sb.append(getHostname());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _virtualHostId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _layoutSetId;
	private long _originalLayoutSetId;
	private boolean _setOriginalLayoutSetId;
	private String _hostname;
	private String _originalHostname;
	private transient ExpandoBridge _expandoBridge;
}