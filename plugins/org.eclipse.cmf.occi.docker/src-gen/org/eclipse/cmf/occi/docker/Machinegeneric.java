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
 * A representation of the model object '<em><b>Machinegeneric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Create machines using an existing VM/Host with SSH
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegeneric#getEnginePort <em>Engine Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegeneric#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshUser <em>Ssh User</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshPort <em>Ssh Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegeneric()
 * @model
 * @generated
 */
public interface Machinegeneric extends Machine {
	/**
	 * Returns the value of the '<em><b>Engine Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Port</em>' attribute.
	 * @see #setEnginePort(Integer)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegeneric_EnginePort()
	 * @model dataType="org.eclipse.cmf.occi.docker.Int"
	 * @generated
	 */
	Integer getEnginePort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getEnginePort <em>Engine Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Port</em>' attribute.
	 * @see #getEnginePort()
	 * @generated
	 */
	void setEnginePort(Integer value);

	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegeneric_IpAddress()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Key</em>' attribute.
	 * @see #setSshKey(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegeneric_SshKey()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getSshKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshKey <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Key</em>' attribute.
	 * @see #getSshKey()
	 * @generated
	 */
	void setSshKey(String value);

	/**
	 * Returns the value of the '<em><b>Ssh User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh User</em>' attribute.
	 * @see #setSshUser(String)
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegeneric_SshUser()
	 * @model dataType="org.eclipse.cmf.occi.docker.String"
	 * @generated
	 */
	String getSshUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshUser <em>Ssh User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh User</em>' attribute.
	 * @see #getSshUser()
	 * @generated
	 */
	void setSshUser(String value);

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
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#getMachinegeneric_SshPort()
	 * @model default="22" dataType="org.eclipse.cmf.occi.docker.Int"
	 * @generated
	 */
	Integer getSshPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.docker.Machinegeneric#getSshPort <em>Ssh Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Port</em>' attribute.
	 * @see #getSshPort()
	 * @generated
	 */
	void setSshPort(Integer value);

} // Machinegeneric
