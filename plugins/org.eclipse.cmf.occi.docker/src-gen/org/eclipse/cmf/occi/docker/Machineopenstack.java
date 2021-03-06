/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machineopenstack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine on OpenStack
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorId <em>Flavor Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorName <em>Flavor Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getImageName <em>Image Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getAuthUrl <em>Auth Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getEndpointType <em>Endpoint Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getNetId <em>Net Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getNetName <em>Net Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSecGroups <em>Sec Groups</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFloatingIpPool <em>Floating Ip Pool</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getActiveTimeOut <em>Active Time Out</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getInsecure <em>Insecure</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getIpVersion <em>Ip Version</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getKeypairName <em>Keypair Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getPrivateKeyFile <em>Private Key File</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSshPort <em>Ssh Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSshUser <em>Ssh User</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack()
 * @model
 * @generated
 */
public interface Machineopenstack extends Machine {
	/**
	 * Returns the value of the '<em><b>Flavor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flavor Id</em>' attribute.
	 * @see #setFlavorId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_FlavorId()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getFlavorId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorId <em>Flavor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor Id</em>' attribute.
	 * @see #getFlavorId()
	 * @generated
	 */
	void setFlavorId(String value);

	/**
	 * Returns the value of the '<em><b>Flavor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flavor Name</em>' attribute.
	 * @see #setFlavorName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_FlavorName()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getFlavorName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFlavorName <em>Flavor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor Name</em>' attribute.
	 * @see #getFlavorName()
	 * @generated
	 */
	void setFlavorName(String value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_ImageId()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Name</em>' attribute.
	 * @see #setImageName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_ImageName()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getImageName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getImageName <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Name</em>' attribute.
	 * @see #getImageName()
	 * @generated
	 */
	void setImageName(String value);

	/**
	 * Returns the value of the '<em><b>Auth Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Url</em>' attribute.
	 * @see #setAuthUrl(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_AuthUrl()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getAuthUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getAuthUrl <em>Auth Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Url</em>' attribute.
	 * @see #getAuthUrl()
	 * @generated
	 */
	void setAuthUrl(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_Username()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_Password()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tenant Name</em>' attribute.
	 * @see #setTenantName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_TenantName()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getTenantName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getTenantName <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Name</em>' attribute.
	 * @see #getTenantName()
	 * @generated
	 */
	void setTenantName(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see #setTenantId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_TenantId()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getTenantId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getTenantId <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' attribute.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_Region()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Type</b></em>' attribute.
	 * The default value is <code>"publicURL"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Type</em>' attribute.
	 * @see #setEndpointType(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_EndpointType()
	 * @model default="publicURL" dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getEndpointType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getEndpointType <em>Endpoint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Type</em>' attribute.
	 * @see #getEndpointType()
	 * @generated
	 */
	void setEndpointType(String value);

	/**
	 * Returns the value of the '<em><b>Net Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Id</em>' attribute.
	 * @see #setNetId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_NetId()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getNetId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getNetId <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Id</em>' attribute.
	 * @see #getNetId()
	 * @generated
	 */
	void setNetId(String value);

	/**
	 * Returns the value of the '<em><b>Net Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Name</em>' attribute.
	 * @see #setNetName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_NetName()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getNetName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getNetName <em>Net Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Name</em>' attribute.
	 * @see #getNetName()
	 * @generated
	 */
	void setNetName(String value);

	/**
	 * Returns the value of the '<em><b>Sec Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sec Groups</em>' attribute.
	 * @see #setSecGroups(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_SecGroups()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getSecGroups();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSecGroups <em>Sec Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Groups</em>' attribute.
	 * @see #getSecGroups()
	 * @generated
	 */
	void setSecGroups(String value);

	/**
	 * Returns the value of the '<em><b>Floating Ip Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floating Ip Pool</em>' attribute.
	 * @see #setFloatingIpPool(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_FloatingIpPool()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getFloatingIpPool();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getFloatingIpPool <em>Floating Ip Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Ip Pool</em>' attribute.
	 * @see #getFloatingIpPool()
	 * @generated
	 */
	void setFloatingIpPool(String value);

	/**
	 * Returns the value of the '<em><b>Active Time Out</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Time Out</em>' attribute.
	 * @see #setActiveTimeOut(Integer)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_ActiveTimeOut()
	 * @model default="200" dataType="org.eclipse.cmf.occi.docker.Int"
	 * @generated
	 */
	Integer getActiveTimeOut();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getActiveTimeOut <em>Active Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Time Out</em>' attribute.
	 * @see #getActiveTimeOut()
	 * @generated
	 */
	void setActiveTimeOut(Integer value);

	/**
	 * Returns the value of the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Zone</em>' attribute.
	 * @see #setAvailabilityZone(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_AvailabilityZone()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getAvailabilityZone();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getAvailabilityZone <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone</em>' attribute.
	 * @see #getAvailabilityZone()
	 * @generated
	 */
	void setAvailabilityZone(String value);

	/**
	 * Returns the value of the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Id</em>' attribute.
	 * @see #setDomainId(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_DomainId()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getDomainId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getDomainId <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Id</em>' attribute.
	 * @see #getDomainId()
	 * @generated
	 */
	void setDomainId(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_DomainName()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Insecure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insecure</em>' attribute.
	 * @see #setInsecure(Boolean)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_Insecure()
	 * @model default="false" dataType="org.eclipse.cmf.occi.docker.Bool"
	 * @generated
	 */
	Boolean getInsecure();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getInsecure <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insecure</em>' attribute.
	 * @see #getInsecure()
	 * @generated
	 */
	void setInsecure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ip Version</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Version</em>' attribute.
	 * @see #setIpVersion(Integer)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_IpVersion()
	 * @model default="4" dataType="org.eclipse.cmf.occi.docker.Int"
	 * @generated
	 */
	Integer getIpVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getIpVersion <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Version</em>' attribute.
	 * @see #getIpVersion()
	 * @generated
	 */
	void setIpVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Keypair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keypair Name</em>' attribute.
	 * @see #setKeypairName(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_KeypairName()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getKeypairName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getKeypairName <em>Keypair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keypair Name</em>' attribute.
	 * @see #getKeypairName()
	 * @generated
	 */
	void setKeypairName(String value);

	/**
	 * Returns the value of the '<em><b>Private Key File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Key File</em>' attribute.
	 * @see #setPrivateKeyFile(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_PrivateKeyFile()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getPrivateKeyFile();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getPrivateKeyFile <em>Private Key File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key File</em>' attribute.
	 * @see #getPrivateKeyFile()
	 * @generated
	 */
	void setPrivateKeyFile(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Port</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Port</em>' attribute.
	 * @see #setSshPort(Integer)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_SshPort()
	 * @model default="22" dataType="org.eclipse.cmf.occi.docker.Int"
	 * @generated
	 */
	Integer getSshPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSshPort <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Port</em>' attribute.
	 * @see #getSshPort()
	 * @generated
	 */
	void setSshPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Ssh User</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh User</em>' attribute.
	 * @see #setSshUser(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachineopenstack_SshUser()
	 * @model default="root" dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getSshUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machineopenstack#getSshUser <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh User</em>' attribute.
	 * @see #getSshUser()
	 * @generated
	 */
	void setSshUser(String value);

} // Machineopenstack
