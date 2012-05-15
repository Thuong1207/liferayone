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

package org.xmlportletfactory.portal.example01.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.xmlportletfactory.portal.example01.model.PortletOne;
import org.xmlportletfactory.portal.example01.model.PortletOneModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the PortletOne service. Represents a row in the &quot;portletone_PortletOne&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.xmlportletfactory.portal.example01.model.PortletOneModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PortletOneImpl}.
 * </p>
 *
 * @author Jack A. Rider
 * @see PortletOneImpl
 * @see org.xmlportletfactory.portal.example01.model.PortletOne
 * @see org.xmlportletfactory.portal.example01.model.PortletOneModel
 * @generated
 */
public class PortletOneModelImpl extends BaseModelImpl<PortletOne>
	implements PortletOneModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a portlet one model instance should use the {@link org.xmlportletfactory.portal.example01.model.PortletOne} interface instead.
	 */
	public static final String TABLE_NAME = "portletone_PortletOne";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PortletOneId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "PortletOneDescription", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table portletone_PortletOne (PortletOneId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,PortletOneDescription VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table portletone_PortletOne";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.xmlportletfactory.portal.example01.model.PortletOne"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.xmlportletfactory.portal.example01.model.PortletOne"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.xmlportletfactory.portal.example01.model.PortletOne"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.xmlportletfactory.portal.example01.model.PortletOne"));

	public PortletOneModelImpl() {
	}

	public long getPrimaryKey() {
		return _PortletOneId;
	}

	public void setPrimaryKey(long primaryKey) {
		setPortletOneId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_PortletOneId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return PortletOne.class;
	}

	public String getModelClassName() {
		return PortletOne.class.getName();
	}

	public long getPortletOneId() {
		return _PortletOneId;
	}

	public void setPortletOneId(long PortletOneId) {
		_PortletOneId = PortletOneId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

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

	public String getPortletOneDescription() {
		if (_PortletOneDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _PortletOneDescription;
		}
	}

	public void setPortletOneDescription(String PortletOneDescription) {
		_PortletOneDescription = PortletOneDescription;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public PortletOne toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (PortletOne)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					PortletOne.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		PortletOneImpl portletOneImpl = new PortletOneImpl();

		portletOneImpl.setPortletOneId(getPortletOneId());
		portletOneImpl.setCompanyId(getCompanyId());
		portletOneImpl.setGroupId(getGroupId());
		portletOneImpl.setUserId(getUserId());
		portletOneImpl.setPortletOneDescription(getPortletOneDescription());

		portletOneImpl.resetOriginalValues();

		return portletOneImpl;
	}

	public int compareTo(PortletOne portletOne) {
		long primaryKey = portletOne.getPrimaryKey();

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

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PortletOne portletOne = null;

		try {
			portletOne = (PortletOne)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = portletOne.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		PortletOneModelImpl portletOneModelImpl = this;

		portletOneModelImpl._originalGroupId = portletOneModelImpl._groupId;

		portletOneModelImpl._setOriginalGroupId = false;

		portletOneModelImpl._originalUserId = portletOneModelImpl._userId;

		portletOneModelImpl._setOriginalUserId = false;

		portletOneModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PortletOne> toCacheModel() {
		PortletOneCacheModel portletOneCacheModel = new PortletOneCacheModel();

		portletOneCacheModel.PortletOneId = getPortletOneId();

		portletOneCacheModel.companyId = getCompanyId();

		portletOneCacheModel.groupId = getGroupId();

		portletOneCacheModel.userId = getUserId();

		portletOneCacheModel.PortletOneDescription = getPortletOneDescription();

		String PortletOneDescription = portletOneCacheModel.PortletOneDescription;

		if ((PortletOneDescription != null) &&
				(PortletOneDescription.length() == 0)) {
			portletOneCacheModel.PortletOneDescription = null;
		}

		return portletOneCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{PortletOneId=");
		sb.append(getPortletOneId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", PortletOneDescription=");
		sb.append(getPortletOneDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.xmlportletfactory.portal.example01.model.PortletOne");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PortletOneId</column-name><column-value><![CDATA[");
		sb.append(getPortletOneId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PortletOneDescription</column-name><column-value><![CDATA[");
		sb.append(getPortletOneDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = PortletOne.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			PortletOne.class
		};
	private long _PortletOneId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _PortletOneDescription;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private PortletOne _escapedModelProxy;
}