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
package org.eclipse.cmf.occi.docker.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.docker.ArrayOfString;
import org.eclipse.cmf.occi.docker.Cluster;
import org.eclipse.cmf.occi.docker.Contains;
import org.eclipse.cmf.occi.docker.DockerFactory;
import org.eclipse.cmf.occi.docker.DockerPackage;
import org.eclipse.cmf.occi.docker.Link;
import org.eclipse.cmf.occi.docker.Machine;
import org.eclipse.cmf.occi.docker.Machineamazonec2;
import org.eclipse.cmf.occi.docker.Machinedigitalocean;
import org.eclipse.cmf.occi.docker.Machineexoscale;
import org.eclipse.cmf.occi.docker.Machinegeneric;
import org.eclipse.cmf.occi.docker.Machinegooglecomputeengine;
import org.eclipse.cmf.occi.docker.Machinegrid5000;
import org.eclipse.cmf.occi.docker.Machineibmsoftlayer;
import org.eclipse.cmf.occi.docker.Machinemicrosoftazure;
import org.eclipse.cmf.occi.docker.Machinemicrosofthyperv;
import org.eclipse.cmf.occi.docker.Machineopenstack;
import org.eclipse.cmf.occi.docker.Machinerackspace;
import org.eclipse.cmf.occi.docker.Machinevirtualbox;
import org.eclipse.cmf.occi.docker.Machinevmwarefusion;
import org.eclipse.cmf.occi.docker.Machinevmwarevcloudair;
import org.eclipse.cmf.occi.docker.Machinevmwarevsphere;
import org.eclipse.cmf.occi.docker.Mode;
import org.eclipse.cmf.occi.docker.Network;
import org.eclipse.cmf.occi.docker.Networklink;
import org.eclipse.cmf.occi.docker.Volume;
import org.eclipse.cmf.occi.docker.Volumesfrom;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerPackageImpl extends EPackageImpl implements DockerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayOfStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumesfromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinegenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineamazonec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinedigitaloceanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinegooglecomputeengineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineibmsoftlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinemicrosoftazureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinemicrosofthypervEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineopenstackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinerackspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinevirtualboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinevmwarefusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinevmwarevcloudairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinevmwarevsphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineexoscaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machinegrid5000EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.docker.DockerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerPackageImpl() {
		super(eNS_URI, DockerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DockerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerPackage init() {
		if (isInited) return (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);

		// Obtain or create and register package
		DockerPackageImpl theDockerPackage = (DockerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDockerPackage.createPackageContents();

		// Initialize created meta-data
		theDockerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerPackage.eNS_URI, theDockerPackage);
		return theDockerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayOfString() {
		return arrayOfStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayOfString_Values() {
		return (EAttribute)arrayOfStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Containerid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Image() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Build() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Command() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ports() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Expose() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Volumes() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Environment() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_EnvFile() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Net() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Dns() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_DnsSearch() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CapAdd() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CapDrop() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_WorkingDir() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Entrypoint() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_User() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_DomainName() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Privileged() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Restart() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_StdinOpen() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Interactive() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CpuShares() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Pid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ipc() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_AddHost() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MacAddress() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_PublishAll() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_ReadOnly() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Monitored() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CpuPercent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MemoryPercent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CoreMax() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CpuSetCpus() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CpuSetMems() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Tty() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Rm() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_SecurityOpt() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Device() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_LxcConf() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MemLimit() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MemorySwap() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CpuUsed() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MemoryUsed() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_DiskUsed() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_DiskPercent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_BandwidthUsed() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_BandwidthPercent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MonitoringInterval() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_CpuMaxValue() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_MemoryMaxValue() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Create() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Stop() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Run() {
		return containerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Pause() {
		return containerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Unpause() {
		return containerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Kill() {
		return containerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Alias() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworklink() {
		return networklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumesfrom() {
		return volumesfromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumesfrom_Mode() {
		return (EAttribute)volumesfromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Name() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineInstallURL() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineOpt() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineInsecureRegistry() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineRegistryMirror() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineLabel() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineStorageDriver() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_EngineEnv() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Swarm() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmImage() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmMaster() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmDiscovery() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmStrategy() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmOpt() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmHost() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmAddr() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_SwarmExperimental() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_TlsSan() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMachine__Startall() {
		return machineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Driver() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Labels() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Options() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Source() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Destination() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Mode() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Rw() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Propagation() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_NetworkId() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_AuxAddress() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Driver() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Gateway() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Internal() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_IpRange() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_IpamDriver() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_IpamOpt() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Ipv6() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Opt() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Subnet() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinegeneric() {
		return machinegenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegeneric_EnginePort() {
		return (EAttribute)machinegenericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegeneric_IpAddress() {
		return (EAttribute)machinegenericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegeneric_SshKey() {
		return (EAttribute)machinegenericEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegeneric_SshUser() {
		return (EAttribute)machinegenericEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegeneric_SshPort() {
		return (EAttribute)machinegenericEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineamazonec2() {
		return machineamazonec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_AccessKey() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_Ami() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_InstanceType() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_Region() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_RootSize() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_SecretKey() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_SecurityGroup() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_SessionToken() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_SubnetId() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_VpcId() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineamazonec2_Zone() {
		return (EAttribute)machineamazonec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinedigitalocean() {
		return machinedigitaloceanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinedigitalocean_AccessToken() {
		return (EAttribute)machinedigitaloceanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinedigitalocean_Image() {
		return (EAttribute)machinedigitaloceanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinedigitalocean_Region() {
		return (EAttribute)machinedigitaloceanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinedigitalocean_Size() {
		return (EAttribute)machinedigitaloceanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinegooglecomputeengine() {
		return machinegooglecomputeengineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegooglecomputeengine_Zone() {
		return (EAttribute)machinegooglecomputeengineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegooglecomputeengine_MachineType() {
		return (EAttribute)machinegooglecomputeengineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegooglecomputeengine_Username() {
		return (EAttribute)machinegooglecomputeengineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegooglecomputeengine_InstanceName() {
		return (EAttribute)machinegooglecomputeengineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegooglecomputeengine_Project() {
		return (EAttribute)machinegooglecomputeengineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineibmsoftlayer() {
		return machineibmsoftlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_ApiEndpoint() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_User() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_ApiKey() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_Cpu() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_DiskSize() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_Domain() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_HourlyBilling() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_Image() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_LocalDisk() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_PrivateNetOnly() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_Region() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_PublicVlanId() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineibmsoftlayer_PrivateVlanId() {
		return (EAttribute)machineibmsoftlayerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinemicrosoftazure() {
		return machinemicrosoftazureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_SubscriptionId() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_SubscriptionCert() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_Environment() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_MachineLocation() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_ResourceGroup() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_Size() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_SshUser() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_Vnet() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_Subnet() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_SubnetPrefix() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_AvailabilitySet() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_OpenPort() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_PrivateIpAddress() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_NoPublicIp() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_StaticPublicIp() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_DockerPort() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_UsePrivateIp() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosoftazure_Image() {
		return (EAttribute)machinemicrosoftazureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinemicrosofthyperv() {
		return machinemicrosofthypervEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosofthyperv_VirtualSwitch() {
		return (EAttribute)machinemicrosofthypervEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosofthyperv_Boot2dockerURL() {
		return (EAttribute)machinemicrosofthypervEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosofthyperv_DiskSize() {
		return (EAttribute)machinemicrosofthypervEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosofthyperv_StaticMacAddress() {
		return (EAttribute)machinemicrosofthypervEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinemicrosofthyperv_VlanId() {
		return (EAttribute)machinemicrosofthypervEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineopenstack() {
		return machineopenstackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_FlavorId() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_FlavorName() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_ImageId() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_ImageName() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_AuthUrl() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_Username() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_Password() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_TenantName() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_TenantId() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_Region() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_EndpointType() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_NetId() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_NetName() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_SecGroups() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_FloatingIpPool() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_ActiveTimeOut() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_AvailabilityZone() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_DomainId() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_DomainName() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_Insecure() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_IpVersion() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_KeypairName() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_PrivateKeyFile() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_SshPort() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineopenstack_SshUser() {
		return (EAttribute)machineopenstackEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinerackspace() {
		return machinerackspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_Username() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_ApiKey() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_Region() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_EndPointType() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_ImageId() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_FlavorId() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_SshUser() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_SshPort() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinerackspace_DockerInstall() {
		return (EAttribute)machinerackspaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinevirtualbox() {
		return machinevirtualboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_Boot2dockerURL() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_DiskSize() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_HostDNSResolver() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_ImportBoot2DockerVM() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_HostOnlyCIDR() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_HostOnlyNICType() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_HostOnlyNICPromisc() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_NoShare() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_NoDNSProxy() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_NoVTXCheck() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevirtualbox_ShareFolder() {
		return (EAttribute)machinevirtualboxEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinevmwarefusion() {
		return machinevmwarefusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarefusion_Boot2dockerURL() {
		return (EAttribute)machinevmwarefusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarefusion_DiskSize() {
		return (EAttribute)machinevmwarefusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarefusion_MemorySize() {
		return (EAttribute)machinevmwarefusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarefusion_NoShare() {
		return (EAttribute)machinevmwarefusionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinevmwarevcloudair() {
		return machinevmwarevcloudairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_Username() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_Password() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_Catalog() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_CatalogItem() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_ComputeId() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_CpuCount() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_DockerPort() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_Edgegateway() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_MemorySize() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_VappName() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_Orgvdcnetwork() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_Provision() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_PublicIp() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_SshPort() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevcloudair_VdcId() {
		return (EAttribute)machinevmwarevcloudairEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinevmwarevsphere() {
		return machinevmwarevsphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Username() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Password() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Boot2dockerURL() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_ComputeIp() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_CpuCount() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Datacenter() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Datastore() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_DiskSize() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_MemorySize() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Network() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Pool() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinevmwarevsphere_Vcenter() {
		return (EAttribute)machinevmwarevsphereEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineexoscale() {
		return machineexoscaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_Url() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_ApiKey() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_ApiSecretKey() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_InstanceProfile() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_Image() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_SecurityGroup() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_AvailabilityZone() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_SshUser() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_UserData() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineexoscale_AffinityGroup() {
		return (EAttribute)machineexoscaleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachinegrid5000() {
		return machinegrid5000EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_Username() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_Password() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_Site() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_Walltime() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_SshPrivateKey() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_SshPublicKey() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_Image() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_ResourceProperties() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_UseJobReservation() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachinegrid5000_HostToProvision() {
		return (EAttribute)machinegrid5000EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCluster_Name() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBool() {
		return boolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInt() {
		return intEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerFactory getDockerFactory() {
		return (DockerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		arrayOfStringEClass = createEClass(ARRAY_OF_STRING);
		createEAttribute(arrayOfStringEClass, ARRAY_OF_STRING__VALUES);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEAttribute(containerEClass, CONTAINER__CONTAINERID);
		createEAttribute(containerEClass, CONTAINER__IMAGE);
		createEAttribute(containerEClass, CONTAINER__BUILD);
		createEAttribute(containerEClass, CONTAINER__COMMAND);
		createEAttribute(containerEClass, CONTAINER__PORTS);
		createEAttribute(containerEClass, CONTAINER__EXPOSE);
		createEAttribute(containerEClass, CONTAINER__VOLUMES);
		createEAttribute(containerEClass, CONTAINER__ENVIRONMENT);
		createEAttribute(containerEClass, CONTAINER__ENV_FILE);
		createEAttribute(containerEClass, CONTAINER__NET);
		createEAttribute(containerEClass, CONTAINER__DNS);
		createEAttribute(containerEClass, CONTAINER__DNS_SEARCH);
		createEAttribute(containerEClass, CONTAINER__CAP_ADD);
		createEAttribute(containerEClass, CONTAINER__CAP_DROP);
		createEAttribute(containerEClass, CONTAINER__WORKING_DIR);
		createEAttribute(containerEClass, CONTAINER__ENTRYPOINT);
		createEAttribute(containerEClass, CONTAINER__USER);
		createEAttribute(containerEClass, CONTAINER__DOMAIN_NAME);
		createEAttribute(containerEClass, CONTAINER__MEM_LIMIT);
		createEAttribute(containerEClass, CONTAINER__MEMORY_SWAP);
		createEAttribute(containerEClass, CONTAINER__PRIVILEGED);
		createEAttribute(containerEClass, CONTAINER__RESTART);
		createEAttribute(containerEClass, CONTAINER__STDIN_OPEN);
		createEAttribute(containerEClass, CONTAINER__INTERACTIVE);
		createEAttribute(containerEClass, CONTAINER__CPU_SHARES);
		createEAttribute(containerEClass, CONTAINER__PID);
		createEAttribute(containerEClass, CONTAINER__IPC);
		createEAttribute(containerEClass, CONTAINER__ADD_HOST);
		createEAttribute(containerEClass, CONTAINER__MAC_ADDRESS);
		createEAttribute(containerEClass, CONTAINER__RM);
		createEAttribute(containerEClass, CONTAINER__SECURITY_OPT);
		createEAttribute(containerEClass, CONTAINER__DEVICE);
		createEAttribute(containerEClass, CONTAINER__LXC_CONF);
		createEAttribute(containerEClass, CONTAINER__PUBLISH_ALL);
		createEAttribute(containerEClass, CONTAINER__READ_ONLY);
		createEAttribute(containerEClass, CONTAINER__MONITORED);
		createEAttribute(containerEClass, CONTAINER__CPU_USED);
		createEAttribute(containerEClass, CONTAINER__MEMORY_USED);
		createEAttribute(containerEClass, CONTAINER__CPU_PERCENT);
		createEAttribute(containerEClass, CONTAINER__MEMORY_PERCENT);
		createEAttribute(containerEClass, CONTAINER__DISK_USED);
		createEAttribute(containerEClass, CONTAINER__DISK_PERCENT);
		createEAttribute(containerEClass, CONTAINER__BANDWIDTH_USED);
		createEAttribute(containerEClass, CONTAINER__BANDWIDTH_PERCENT);
		createEAttribute(containerEClass, CONTAINER__MONITORING_INTERVAL);
		createEAttribute(containerEClass, CONTAINER__CPU_MAX_VALUE);
		createEAttribute(containerEClass, CONTAINER__MEMORY_MAX_VALUE);
		createEAttribute(containerEClass, CONTAINER__CORE_MAX);
		createEAttribute(containerEClass, CONTAINER__CPU_SET_CPUS);
		createEAttribute(containerEClass, CONTAINER__CPU_SET_MEMS);
		createEAttribute(containerEClass, CONTAINER__TTY);
		createEOperation(containerEClass, CONTAINER___CREATE);
		createEOperation(containerEClass, CONTAINER___STOP);
		createEOperation(containerEClass, CONTAINER___RUN);
		createEOperation(containerEClass, CONTAINER___PAUSE);
		createEOperation(containerEClass, CONTAINER___UNPAUSE);
		createEOperation(containerEClass, CONTAINER___KILL);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__ALIAS);

		networklinkEClass = createEClass(NETWORKLINK);

		volumesfromEClass = createEClass(VOLUMESFROM);
		createEAttribute(volumesfromEClass, VOLUMESFROM__MODE);

		containsEClass = createEClass(CONTAINS);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);
		createEAttribute(machineEClass, MACHINE__ENGINE_INSTALL_URL);
		createEAttribute(machineEClass, MACHINE__ENGINE_OPT);
		createEAttribute(machineEClass, MACHINE__ENGINE_INSECURE_REGISTRY);
		createEAttribute(machineEClass, MACHINE__ENGINE_REGISTRY_MIRROR);
		createEAttribute(machineEClass, MACHINE__ENGINE_LABEL);
		createEAttribute(machineEClass, MACHINE__ENGINE_STORAGE_DRIVER);
		createEAttribute(machineEClass, MACHINE__ENGINE_ENV);
		createEAttribute(machineEClass, MACHINE__SWARM);
		createEAttribute(machineEClass, MACHINE__SWARM_IMAGE);
		createEAttribute(machineEClass, MACHINE__SWARM_MASTER);
		createEAttribute(machineEClass, MACHINE__SWARM_DISCOVERY);
		createEAttribute(machineEClass, MACHINE__SWARM_STRATEGY);
		createEAttribute(machineEClass, MACHINE__SWARM_OPT);
		createEAttribute(machineEClass, MACHINE__SWARM_HOST);
		createEAttribute(machineEClass, MACHINE__SWARM_ADDR);
		createEAttribute(machineEClass, MACHINE__SWARM_EXPERIMENTAL);
		createEAttribute(machineEClass, MACHINE__TLS_SAN);
		createEOperation(machineEClass, MACHINE___STARTALL);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__DRIVER);
		createEAttribute(volumeEClass, VOLUME__LABELS);
		createEAttribute(volumeEClass, VOLUME__OPTIONS);
		createEAttribute(volumeEClass, VOLUME__SOURCE);
		createEAttribute(volumeEClass, VOLUME__DESTINATION);
		createEAttribute(volumeEClass, VOLUME__MODE);
		createEAttribute(volumeEClass, VOLUME__RW);
		createEAttribute(volumeEClass, VOLUME__PROPAGATION);
		createEAttribute(volumeEClass, VOLUME__NAME);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NETWORK_ID);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__AUX_ADDRESS);
		createEAttribute(networkEClass, NETWORK__DRIVER);
		createEAttribute(networkEClass, NETWORK__GATEWAY);
		createEAttribute(networkEClass, NETWORK__INTERNAL);
		createEAttribute(networkEClass, NETWORK__IP_RANGE);
		createEAttribute(networkEClass, NETWORK__IPAM_DRIVER);
		createEAttribute(networkEClass, NETWORK__IPAM_OPT);
		createEAttribute(networkEClass, NETWORK__IPV6);
		createEAttribute(networkEClass, NETWORK__OPT);
		createEAttribute(networkEClass, NETWORK__SUBNET);

		machinegenericEClass = createEClass(MACHINEGENERIC);
		createEAttribute(machinegenericEClass, MACHINEGENERIC__ENGINE_PORT);
		createEAttribute(machinegenericEClass, MACHINEGENERIC__IP_ADDRESS);
		createEAttribute(machinegenericEClass, MACHINEGENERIC__SSH_KEY);
		createEAttribute(machinegenericEClass, MACHINEGENERIC__SSH_USER);
		createEAttribute(machinegenericEClass, MACHINEGENERIC__SSH_PORT);

		machineamazonec2EClass = createEClass(MACHINEAMAZONEC2);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__ACCESS_KEY);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__AMI);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__INSTANCE_TYPE);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__REGION);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__ROOT_SIZE);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__SECRET_KEY);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__SECURITY_GROUP);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__SESSION_TOKEN);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__SUBNET_ID);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__VPC_ID);
		createEAttribute(machineamazonec2EClass, MACHINEAMAZONEC2__ZONE);

		machinedigitaloceanEClass = createEClass(MACHINEDIGITALOCEAN);
		createEAttribute(machinedigitaloceanEClass, MACHINEDIGITALOCEAN__ACCESS_TOKEN);
		createEAttribute(machinedigitaloceanEClass, MACHINEDIGITALOCEAN__IMAGE);
		createEAttribute(machinedigitaloceanEClass, MACHINEDIGITALOCEAN__REGION);
		createEAttribute(machinedigitaloceanEClass, MACHINEDIGITALOCEAN__SIZE);

		machinegooglecomputeengineEClass = createEClass(MACHINEGOOGLECOMPUTEENGINE);
		createEAttribute(machinegooglecomputeengineEClass, MACHINEGOOGLECOMPUTEENGINE__ZONE);
		createEAttribute(machinegooglecomputeengineEClass, MACHINEGOOGLECOMPUTEENGINE__MACHINE_TYPE);
		createEAttribute(machinegooglecomputeengineEClass, MACHINEGOOGLECOMPUTEENGINE__USERNAME);
		createEAttribute(machinegooglecomputeengineEClass, MACHINEGOOGLECOMPUTEENGINE__INSTANCE_NAME);
		createEAttribute(machinegooglecomputeengineEClass, MACHINEGOOGLECOMPUTEENGINE__PROJECT);

		machineibmsoftlayerEClass = createEClass(MACHINEIBMSOFTLAYER);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__API_ENDPOINT);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__USER);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__API_KEY);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__CPU);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__DISK_SIZE);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__DOMAIN);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__HOURLY_BILLING);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__IMAGE);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__LOCAL_DISK);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__PRIVATE_NET_ONLY);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__REGION);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__PUBLIC_VLAN_ID);
		createEAttribute(machineibmsoftlayerEClass, MACHINEIBMSOFTLAYER__PRIVATE_VLAN_ID);

		machinemicrosoftazureEClass = createEClass(MACHINEMICROSOFTAZURE);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__SUBSCRIPTION_ID);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__SUBSCRIPTION_CERT);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__ENVIRONMENT);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__MACHINE_LOCATION);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__RESOURCE_GROUP);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__SIZE);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__SSH_USER);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__VNET);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__SUBNET);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__SUBNET_PREFIX);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__AVAILABILITY_SET);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__OPEN_PORT);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__PRIVATE_IP_ADDRESS);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__NO_PUBLIC_IP);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__STATIC_PUBLIC_IP);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__DOCKER_PORT);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__USE_PRIVATE_IP);
		createEAttribute(machinemicrosoftazureEClass, MACHINEMICROSOFTAZURE__IMAGE);

		machinemicrosofthypervEClass = createEClass(MACHINEMICROSOFTHYPERV);
		createEAttribute(machinemicrosofthypervEClass, MACHINEMICROSOFTHYPERV__VIRTUAL_SWITCH);
		createEAttribute(machinemicrosofthypervEClass, MACHINEMICROSOFTHYPERV__BOOT2DOCKER_URL);
		createEAttribute(machinemicrosofthypervEClass, MACHINEMICROSOFTHYPERV__DISK_SIZE);
		createEAttribute(machinemicrosofthypervEClass, MACHINEMICROSOFTHYPERV__STATIC_MAC_ADDRESS);
		createEAttribute(machinemicrosofthypervEClass, MACHINEMICROSOFTHYPERV__VLAN_ID);

		machineopenstackEClass = createEClass(MACHINEOPENSTACK);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__FLAVOR_ID);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__FLAVOR_NAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__IMAGE_ID);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__IMAGE_NAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__AUTH_URL);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__USERNAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__PASSWORD);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__TENANT_NAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__TENANT_ID);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__REGION);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__ENDPOINT_TYPE);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__NET_ID);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__NET_NAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__SEC_GROUPS);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__FLOATING_IP_POOL);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__ACTIVE_TIME_OUT);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__AVAILABILITY_ZONE);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__DOMAIN_ID);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__DOMAIN_NAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__INSECURE);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__IP_VERSION);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__KEYPAIR_NAME);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__PRIVATE_KEY_FILE);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__SSH_PORT);
		createEAttribute(machineopenstackEClass, MACHINEOPENSTACK__SSH_USER);

		machinerackspaceEClass = createEClass(MACHINERACKSPACE);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__USERNAME);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__API_KEY);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__REGION);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__END_POINT_TYPE);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__IMAGE_ID);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__FLAVOR_ID);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__SSH_USER);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__SSH_PORT);
		createEAttribute(machinerackspaceEClass, MACHINERACKSPACE__DOCKER_INSTALL);

		machinevirtualboxEClass = createEClass(MACHINEVIRTUALBOX);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__BOOT2DOCKER_URL);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__DISK_SIZE);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__HOST_DNS_RESOLVER);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__IMPORT_BOOT2_DOCKER_VM);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__HOST_ONLY_CIDR);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__HOST_ONLY_NIC_TYPE);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__HOST_ONLY_NIC_PROMISC);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__NO_SHARE);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__NO_DNS_PROXY);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__NO_VTX_CHECK);
		createEAttribute(machinevirtualboxEClass, MACHINEVIRTUALBOX__SHARE_FOLDER);

		machinevmwarefusionEClass = createEClass(MACHINEVMWAREFUSION);
		createEAttribute(machinevmwarefusionEClass, MACHINEVMWAREFUSION__BOOT2DOCKER_URL);
		createEAttribute(machinevmwarefusionEClass, MACHINEVMWAREFUSION__DISK_SIZE);
		createEAttribute(machinevmwarefusionEClass, MACHINEVMWAREFUSION__MEMORY_SIZE);
		createEAttribute(machinevmwarefusionEClass, MACHINEVMWAREFUSION__NO_SHARE);

		machinevmwarevcloudairEClass = createEClass(MACHINEVMWAREVCLOUDAIR);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__USERNAME);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__PASSWORD);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__CATALOG);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__CATALOG_ITEM);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__COMPUTE_ID);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__CPU_COUNT);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__DOCKER_PORT);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__EDGEGATEWAY);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__MEMORY_SIZE);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__VAPP_NAME);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__ORGVDCNETWORK);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__PROVISION);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__PUBLIC_IP);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__SSH_PORT);
		createEAttribute(machinevmwarevcloudairEClass, MACHINEVMWAREVCLOUDAIR__VDC_ID);

		machinevmwarevsphereEClass = createEClass(MACHINEVMWAREVSPHERE);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__USERNAME);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__PASSWORD);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__BOOT2DOCKER_URL);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__COMPUTE_IP);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__CPU_COUNT);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__DATACENTER);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__DATASTORE);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__DISK_SIZE);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__MEMORY_SIZE);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__NETWORK);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__POOL);
		createEAttribute(machinevmwarevsphereEClass, MACHINEVMWAREVSPHERE__VCENTER);

		machineexoscaleEClass = createEClass(MACHINEEXOSCALE);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__URL);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__API_KEY);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__API_SECRET_KEY);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__INSTANCE_PROFILE);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__IMAGE);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__SECURITY_GROUP);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__AVAILABILITY_ZONE);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__SSH_USER);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__USER_DATA);
		createEAttribute(machineexoscaleEClass, MACHINEEXOSCALE__AFFINITY_GROUP);

		machinegrid5000EClass = createEClass(MACHINEGRID5000);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__USERNAME);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__PASSWORD);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__SITE);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__WALLTIME);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__SSH_PRIVATE_KEY);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__SSH_PUBLIC_KEY);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__IMAGE);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__RESOURCE_PROPERTIES);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__USE_JOB_RESERVATION);
		createEAttribute(machinegrid5000EClass, MACHINEGRID5000__HOST_TO_PROVISION);

		clusterEClass = createEClass(CLUSTER);
		createEAttribute(clusterEClass, CLUSTER__NAME);

		// Create enums
		modeEEnum = createEEnum(MODE);

		// Create data types
		stringEDataType = createEDataType(STRING);
		boolEDataType = createEDataType(BOOL);
		intEDataType = createEDataType(INT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		linkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		networklinkEClass.getESuperTypes().add(this.getLink());
		volumesfromEClass.getESuperTypes().add(theOCCIPackage.getLink());
		containsEClass.getESuperTypes().add(theOCCIPackage.getLink());
		machineEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		volumeEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		networkEClass.getESuperTypes().add(theInfrastructurePackage.getNetwork());
		machinegenericEClass.getESuperTypes().add(this.getMachine());
		machineamazonec2EClass.getESuperTypes().add(this.getMachine());
		machinedigitaloceanEClass.getESuperTypes().add(this.getMachine());
		machinegooglecomputeengineEClass.getESuperTypes().add(this.getMachine());
		machineibmsoftlayerEClass.getESuperTypes().add(this.getMachine());
		machinemicrosoftazureEClass.getESuperTypes().add(this.getMachine());
		machinemicrosofthypervEClass.getESuperTypes().add(this.getMachine());
		machineopenstackEClass.getESuperTypes().add(this.getMachine());
		machinerackspaceEClass.getESuperTypes().add(this.getMachine());
		machinevirtualboxEClass.getESuperTypes().add(this.getMachine());
		machinevmwarefusionEClass.getESuperTypes().add(this.getMachine());
		machinevmwarevcloudairEClass.getESuperTypes().add(this.getMachine());
		machinevmwarevsphereEClass.getESuperTypes().add(this.getMachine());
		machineexoscaleEClass.getESuperTypes().add(this.getMachine());
		machinegrid5000EClass.getESuperTypes().add(this.getMachine());
		clusterEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayOfStringEClass, ArrayOfString.class, "ArrayOfString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayOfString_Values(), this.getString(), "values", null, 0, -1, ArrayOfString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.eclipse.cmf.occi.docker.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Name(), this.getString(), "name", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Containerid(), this.getString(), "containerid", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Image(), this.getString(), "image", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Build(), this.getString(), "build", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Command(), this.getString(), "command", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ports(), this.getString(), "ports", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Expose(), this.getString(), "expose", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Volumes(), this.getString(), "volumes", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Environment(), this.getString(), "environment", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_EnvFile(), this.getString(), "envFile", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Net(), this.getString(), "net", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Dns(), this.getString(), "dns", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_DnsSearch(), this.getString(), "dnsSearch", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CapAdd(), this.getString(), "capAdd", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CapDrop(), this.getString(), "capDrop", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_WorkingDir(), this.getString(), "workingDir", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Entrypoint(), this.getString(), "entrypoint", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_User(), this.getString(), "user", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_DomainName(), this.getString(), "domainName", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MemLimit(), this.getInt(), "memLimit", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MemorySwap(), this.getInt(), "memorySwap", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Privileged(), this.getBool(), "privileged", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Restart(), this.getString(), "restart", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_StdinOpen(), this.getBool(), "stdinOpen", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Interactive(), this.getBool(), "interactive", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CpuShares(), this.getInt(), "cpuShares", "0", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Pid(), this.getString(), "pid", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ipc(), this.getString(), "ipc", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_AddHost(), this.getString(), "addHost", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MacAddress(), this.getString(), "macAddress", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Rm(), this.getBool(), "rm", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_SecurityOpt(), this.getString(), "securityOpt", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Device(), this.getString(), "device", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_LxcConf(), this.getString(), "lxcConf", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_PublishAll(), this.getBool(), "publishAll", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_ReadOnly(), this.getBool(), "readOnly", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Monitored(), this.getBool(), "monitored", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CpuUsed(), this.getInt(), "cpuUsed", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MemoryUsed(), this.getInt(), "memoryUsed", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CpuPercent(), this.getString(), "cpuPercent", "0", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MemoryPercent(), this.getString(), "memoryPercent", "0", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_DiskUsed(), this.getInt(), "diskUsed", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_DiskPercent(), this.getString(), "diskPercent", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_BandwidthUsed(), this.getInt(), "bandwidthUsed", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_BandwidthPercent(), this.getString(), "bandwidthPercent", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MonitoringInterval(), this.getInt(), "monitoringInterval", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CpuMaxValue(), this.getInt(), "cpuMaxValue", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MemoryMaxValue(), this.getInt(), "memoryMaxValue", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CoreMax(), this.getInt(), "coreMax", "1", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CpuSetCpus(), this.getString(), "cpuSetCpus", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_CpuSetMems(), this.getString(), "cpuSetMems", null, 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Tty(), this.getBool(), "tty", "false", 0, 1, org.eclipse.cmf.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContainer__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Pause(), null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Unpause(), null, "unpause", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Kill(), null, "kill", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Alias(), this.getString(), "alias", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networklinkEClass, Networklink.class, "Networklink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volumesfromEClass, Volumesfrom.class, "Volumesfrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumesfrom_Mode(), this.getMode(), "mode", "readWrite", 0, 1, Volumesfrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), this.getString(), "name", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineInstallURL(), this.getString(), "engineInstallURL", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineOpt(), this.getString(), "engineOpt", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineInsecureRegistry(), this.getString(), "engineInsecureRegistry", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineRegistryMirror(), this.getString(), "engineRegistryMirror", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineLabel(), this.getString(), "engineLabel", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineStorageDriver(), this.getString(), "engineStorageDriver", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_EngineEnv(), this.getString(), "engineEnv", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm(), this.getBool(), "swarm", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmImage(), this.getString(), "swarmImage", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmMaster(), this.getBool(), "swarmMaster", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmDiscovery(), this.getString(), "swarmDiscovery", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmStrategy(), this.getString(), "swarmStrategy", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmOpt(), this.getString(), "swarmOpt", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmHost(), this.getString(), "swarmHost", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmAddr(), this.getString(), "swarmAddr", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SwarmExperimental(), this.getString(), "swarmExperimental", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_TlsSan(), this.getString(), "tlsSan", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMachine__Startall(), null, "startall", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Driver(), this.getString(), "driver", "local", 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Labels(), this.getString(), "labels", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Options(), this.getString(), "options", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Source(), this.getString(), "source", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Destination(), this.getString(), "destination", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Mode(), this.getString(), "mode", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Rw(), this.getString(), "rw", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Propagation(), this.getString(), "propagation", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Name(), this.getString(), "name", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_NetworkId(), this.getString(), "networkId", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Name(), this.getString(), "name", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_AuxAddress(), this.getString(), "auxAddress", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Driver(), this.getString(), "driver", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Gateway(), this.getString(), "gateway", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Internal(), this.getBool(), "internal", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_IpRange(), this.getString(), "ipRange", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_IpamDriver(), this.getString(), "ipamDriver", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_IpamOpt(), this.getString(), "ipamOpt", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Ipv6(), this.getBool(), "ipv6", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Opt(), this.getString(), "opt", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Subnet(), this.getString(), "subnet", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinegenericEClass, Machinegeneric.class, "Machinegeneric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinegeneric_EnginePort(), this.getInt(), "enginePort", null, 0, 1, Machinegeneric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegeneric_IpAddress(), this.getString(), "ipAddress", null, 0, 1, Machinegeneric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegeneric_SshKey(), this.getString(), "sshKey", null, 0, 1, Machinegeneric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegeneric_SshUser(), this.getString(), "sshUser", null, 0, 1, Machinegeneric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegeneric_SshPort(), this.getInt(), "sshPort", "22", 0, 1, Machinegeneric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineamazonec2EClass, Machineamazonec2.class, "Machineamazonec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineamazonec2_AccessKey(), this.getString(), "accessKey", null, 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_Ami(), this.getString(), "ami", "ami-4ae27e22", 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_InstanceType(), this.getString(), "instanceType", "t2.micro", 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_Region(), this.getString(), "region", "us-east-1", 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_RootSize(), this.getInt(), "rootSize", "16", 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_SecretKey(), this.getString(), "secretKey", null, 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_SecurityGroup(), this.getString(), "securityGroup", "docker-machine", 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_SessionToken(), this.getString(), "sessionToken", null, 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_SubnetId(), this.getString(), "subnetId", null, 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_VpcId(), this.getString(), "vpcId", null, 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineamazonec2_Zone(), this.getString(), "zone", "a", 0, 1, Machineamazonec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinedigitaloceanEClass, Machinedigitalocean.class, "Machinedigitalocean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinedigitalocean_AccessToken(), this.getString(), "accessToken", null, 0, 1, Machinedigitalocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinedigitalocean_Image(), this.getString(), "image", "docker", 0, 1, Machinedigitalocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinedigitalocean_Region(), this.getString(), "region", "nyc3", 0, 1, Machinedigitalocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinedigitalocean_Size(), this.getString(), "size", "512mb", 0, 1, Machinedigitalocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinegooglecomputeengineEClass, Machinegooglecomputeengine.class, "Machinegooglecomputeengine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinegooglecomputeengine_Zone(), this.getString(), "zone", "us-central1-a", 0, 1, Machinegooglecomputeengine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegooglecomputeengine_MachineType(), this.getString(), "machineType", "f1-micro", 0, 1, Machinegooglecomputeengine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegooglecomputeengine_Username(), this.getString(), "username", "docker-user", 0, 1, Machinegooglecomputeengine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegooglecomputeengine_InstanceName(), this.getString(), "instanceName", "docker-machine", 0, 1, Machinegooglecomputeengine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegooglecomputeengine_Project(), this.getString(), "project", null, 0, 1, Machinegooglecomputeengine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineibmsoftlayerEClass, Machineibmsoftlayer.class, "Machineibmsoftlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineibmsoftlayer_ApiEndpoint(), this.getString(), "apiEndpoint", "api.softlayer.com/rest/v3", 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_User(), this.getString(), "user", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_ApiKey(), this.getString(), "apiKey", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_Cpu(), this.getInt(), "cpu", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_DiskSize(), this.getInt(), "diskSize", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_Domain(), this.getString(), "domain", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_HourlyBilling(), this.getBool(), "hourlyBilling", "false", 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_Image(), this.getString(), "image", "UBUNTU_LATEST", 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_LocalDisk(), this.getBool(), "localDisk", "false", 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_PrivateNetOnly(), this.getBool(), "privateNetOnly", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_Region(), this.getString(), "region", null, 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_PublicVlanId(), this.getString(), "publicVlanId", "0", 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineibmsoftlayer_PrivateVlanId(), this.getString(), "privateVlanId", "0", 0, 1, Machineibmsoftlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinemicrosoftazureEClass, Machinemicrosoftazure.class, "Machinemicrosoftazure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinemicrosoftazure_SubscriptionId(), this.getString(), "subscriptionId", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_SubscriptionCert(), this.getString(), "subscriptionCert", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_Environment(), this.getString(), "environment", "AzurePublicCloud", 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_MachineLocation(), this.getString(), "machineLocation", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_ResourceGroup(), this.getString(), "resourceGroup", "docker-machine", 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_Size(), this.getString(), "size", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_SshUser(), this.getString(), "sshUser", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_Vnet(), this.getString(), "vnet", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_Subnet(), this.getString(), "subnet", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_SubnetPrefix(), this.getString(), "subnetPrefix", "192.168.0.0/16", 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_AvailabilitySet(), this.getString(), "availabilitySet", "docker-machine", 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_OpenPort(), this.getInt(), "openPort", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_PrivateIpAddress(), this.getString(), "privateIpAddress", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_NoPublicIp(), this.getString(), "noPublicIp", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_StaticPublicIp(), this.getString(), "staticPublicIp", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_DockerPort(), this.getString(), "dockerPort", "2376", 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_UsePrivateIp(), this.getString(), "usePrivateIp", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosoftazure_Image(), this.getString(), "image", null, 0, 1, Machinemicrosoftazure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinemicrosofthypervEClass, Machinemicrosofthyperv.class, "Machinemicrosofthyperv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinemicrosofthyperv_VirtualSwitch(), this.getString(), "virtualSwitch", null, 0, 1, Machinemicrosofthyperv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosofthyperv_Boot2dockerURL(), this.getString(), "boot2dockerURL", null, 0, 1, Machinemicrosofthyperv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosofthyperv_DiskSize(), this.getInt(), "diskSize", null, 0, 1, Machinemicrosofthyperv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosofthyperv_StaticMacAddress(), this.getString(), "staticMacAddress", null, 0, 1, Machinemicrosofthyperv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinemicrosofthyperv_VlanId(), this.getString(), "vlanId", null, 0, 1, Machinemicrosofthyperv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineopenstackEClass, Machineopenstack.class, "Machineopenstack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineopenstack_FlavorId(), this.getString(), "flavorId", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_FlavorName(), this.getString(), "flavorName", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_ImageId(), this.getString(), "imageId", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_ImageName(), this.getString(), "imageName", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_AuthUrl(), this.getString(), "authUrl", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_Username(), this.getString(), "username", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_Password(), this.getString(), "password", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_TenantName(), this.getString(), "tenantName", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_TenantId(), this.getString(), "tenantId", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_Region(), this.getString(), "region", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_EndpointType(), this.getString(), "endpointType", "publicURL", 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_NetId(), this.getString(), "netId", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_NetName(), this.getString(), "netName", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_SecGroups(), this.getString(), "secGroups", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_FloatingIpPool(), this.getString(), "floatingIpPool", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_ActiveTimeOut(), this.getInt(), "activeTimeOut", "200", 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_AvailabilityZone(), this.getString(), "availabilityZone", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_DomainId(), this.getString(), "domainId", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_DomainName(), this.getString(), "domainName", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_Insecure(), this.getBool(), "insecure", "false", 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_IpVersion(), this.getInt(), "ipVersion", "4", 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_KeypairName(), this.getString(), "keypairName", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_PrivateKeyFile(), this.getString(), "privateKeyFile", null, 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_SshPort(), this.getInt(), "sshPort", "22", 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineopenstack_SshUser(), this.getString(), "sshUser", "root", 0, 1, Machineopenstack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinerackspaceEClass, Machinerackspace.class, "Machinerackspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinerackspace_Username(), this.getString(), "username", null, 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_ApiKey(), this.getString(), "apiKey", null, 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_Region(), this.getString(), "region", null, 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_EndPointType(), this.getString(), "endPointType", "publicURL", 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_ImageId(), this.getString(), "imageId", "59a3fadd-93e7-4674-886a-64883e17115f", 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_FlavorId(), this.getString(), "flavorId", "general1-1", 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_SshUser(), this.getString(), "sshUser", "root", 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_SshPort(), this.getInt(), "sshPort", "22", 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinerackspace_DockerInstall(), this.getBool(), "dockerInstall", "true", 0, 1, Machinerackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinevirtualboxEClass, Machinevirtualbox.class, "Machinevirtualbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinevirtualbox_Boot2dockerURL(), this.getString(), "boot2dockerURL", null, 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_DiskSize(), this.getInt(), "diskSize", "20000", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_HostDNSResolver(), this.getBool(), "hostDNSResolver", "false", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_ImportBoot2DockerVM(), this.getString(), "importBoot2DockerVM", null, 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_HostOnlyCIDR(), this.getString(), "hostOnlyCIDR", "192.168.99.1/24", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_HostOnlyNICType(), this.getString(), "hostOnlyNICType", "82540EM", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_HostOnlyNICPromisc(), this.getString(), "hostOnlyNICPromisc", "deny", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_NoShare(), this.getBool(), "noShare", "false", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_NoDNSProxy(), this.getBool(), "noDNSProxy", "false", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_NoVTXCheck(), this.getBool(), "noVTXCheck", "false", 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevirtualbox_ShareFolder(), this.getString(), "shareFolder", null, 0, 1, Machinevirtualbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinevmwarefusionEClass, Machinevmwarefusion.class, "Machinevmwarefusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinevmwarefusion_Boot2dockerURL(), this.getString(), "boot2dockerURL", null, 0, 1, Machinevmwarefusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarefusion_DiskSize(), this.getInt(), "diskSize", "20000", 0, 1, Machinevmwarefusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarefusion_MemorySize(), this.getInt(), "memorySize", "1024", 0, 1, Machinevmwarefusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarefusion_NoShare(), this.getBool(), "noShare", "false", 0, 1, Machinevmwarefusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinevmwarevcloudairEClass, Machinevmwarevcloudair.class, "Machinevmwarevcloudair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinevmwarevcloudair_Username(), this.getString(), "username", null, 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_Password(), this.getString(), "password", null, 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_Catalog(), this.getString(), "catalog", "Public Catalog", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_CatalogItem(), this.getString(), "catalogItem", "Ubuntu Server 12.04 LTS (amd64 20140927)", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_ComputeId(), this.getString(), "computeId", null, 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_CpuCount(), this.getInt(), "cpuCount", "1", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_DockerPort(), this.getInt(), "dockerPort", "2376", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_Edgegateway(), this.getString(), "edgegateway", "&lt;vdcid>", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_MemorySize(), this.getInt(), "memorySize", "2048", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_VappName(), this.getString(), "vappName", "&lt;autogenerated>", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_Orgvdcnetwork(), this.getString(), "orgvdcnetwork", "&lt;vdcid>-default-routed", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_Provision(), this.getBool(), "provision", "true", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_PublicIp(), this.getString(), "publicIp", null, 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_SshPort(), this.getInt(), "sshPort", "22", 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevcloudair_VdcId(), this.getString(), "vdcId", null, 0, 1, Machinevmwarevcloudair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinevmwarevsphereEClass, Machinevmwarevsphere.class, "Machinevmwarevsphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinevmwarevsphere_Username(), this.getString(), "username", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Password(), this.getString(), "password", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Boot2dockerURL(), this.getString(), "boot2dockerURL", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_ComputeIp(), this.getString(), "computeIp", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_CpuCount(), this.getInt(), "cpuCount", "2", 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Datacenter(), this.getString(), "datacenter", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Datastore(), this.getString(), "datastore", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_DiskSize(), this.getInt(), "diskSize", "20000", 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_MemorySize(), this.getInt(), "memorySize", "2048", 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Network(), this.getString(), "network", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Pool(), this.getString(), "pool", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinevmwarevsphere_Vcenter(), this.getString(), "vcenter", null, 0, 1, Machinevmwarevsphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineexoscaleEClass, Machineexoscale.class, "Machineexoscale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineexoscale_Url(), this.getString(), "url", "https://api.exoscale.ch/compute", 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_ApiKey(), this.getString(), "apiKey", null, 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_ApiSecretKey(), this.getString(), "apiSecretKey", null, 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_InstanceProfile(), this.getString(), "instanceProfile", "small", 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_Image(), this.getString(), "image", "ubuntu-16.04", 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_SecurityGroup(), this.getString(), "securityGroup", null, 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_AvailabilityZone(), this.getString(), "availabilityZone", null, 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_SshUser(), this.getString(), "sshUser", "ubuntu", 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_UserData(), this.getString(), "userData", null, 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineexoscale_AffinityGroup(), this.getString(), "affinityGroup", "docker-machine", 0, 1, Machineexoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machinegrid5000EClass, Machinegrid5000.class, "Machinegrid5000", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachinegrid5000_Username(), this.getString(), "username", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_Password(), this.getString(), "password", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_Site(), this.getString(), "site", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_Walltime(), this.getString(), "walltime", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_SshPrivateKey(), this.getString(), "sshPrivateKey", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_SshPublicKey(), this.getString(), "sshPublicKey", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_Image(), this.getString(), "image", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_ResourceProperties(), this.getString(), "resourceProperties", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_UseJobReservation(), this.getString(), "useJobReservation", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachinegrid5000_HostToProvision(), this.getString(), "hostToProvision", null, 0, 1, Machinegrid5000.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCluster_Name(), this.getString(), "name", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.READ_WRITE);
		addEEnumLiteral(modeEEnum, Mode.READ);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(boolEDataType, Boolean.class, "Bool", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intEDataType, Integer.class, "Int", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore",
			 "infrastructure", "http://schemas.ogf.org/occi/infrastructure/ecore"
		   });
	}

} //DockerPackageImpl
