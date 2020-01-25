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
package org.eclipse.cmf.occi.docker.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.cmf.occi.docker.util.DockerAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerItemProviderAdapterFactory extends DockerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.ArrayOfString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayOfStringItemProvider arrayOfStringItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.ArrayOfString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayOfStringAdapter() {
		if (arrayOfStringItemProvider == null) {
			arrayOfStringItemProvider = new ArrayOfStringItemProvider(this);
		}

		return arrayOfStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Networklink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworklinkItemProvider networklinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Networklink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworklinkAdapter() {
		if (networklinkItemProvider == null) {
			networklinkItemProvider = new NetworklinkItemProvider(this);
		}

		return networklinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Volumesfrom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumesfromItemProvider volumesfromItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Volumesfrom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumesfromAdapter() {
		if (volumesfromItemProvider == null) {
			volumesfromItemProvider = new VolumesfromItemProvider(this);
		}

		return volumesfromItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Contains} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsItemProvider containsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Contains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainsAdapter() {
		if (containsItemProvider == null) {
			containsItemProvider = new ContainsItemProvider(this);
		}

		return containsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineItemProvider machineItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineAdapter() {
		if (machineItemProvider == null) {
			machineItemProvider = new MachineItemProvider(this);
		}

		return machineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Volume} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeItemProvider volumeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeAdapter() {
		if (volumeItemProvider == null) {
			volumeItemProvider = new VolumeItemProvider(this);
		}

		return volumeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Network} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkItemProvider networkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkAdapter() {
		if (networkItemProvider == null) {
			networkItemProvider = new NetworkItemProvider(this);
		}

		return networkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinegeneric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinegenericItemProvider machinegenericItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinegeneric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinegenericAdapter() {
		if (machinegenericItemProvider == null) {
			machinegenericItemProvider = new MachinegenericItemProvider(this);
		}

		return machinegenericItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machineamazonec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machineamazonec2ItemProvider machineamazonec2ItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machineamazonec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineamazonec2Adapter() {
		if (machineamazonec2ItemProvider == null) {
			machineamazonec2ItemProvider = new Machineamazonec2ItemProvider(this);
		}

		return machineamazonec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinedigitalocean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinedigitaloceanItemProvider machinedigitaloceanItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinedigitalocean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinedigitaloceanAdapter() {
		if (machinedigitaloceanItemProvider == null) {
			machinedigitaloceanItemProvider = new MachinedigitaloceanItemProvider(this);
		}

		return machinedigitaloceanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinegooglecomputeengineItemProvider machinegooglecomputeengineItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinegooglecomputeengine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinegooglecomputeengineAdapter() {
		if (machinegooglecomputeengineItemProvider == null) {
			machinegooglecomputeengineItemProvider = new MachinegooglecomputeengineItemProvider(this);
		}

		return machinegooglecomputeengineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineibmsoftlayerItemProvider machineibmsoftlayerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machineibmsoftlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineibmsoftlayerAdapter() {
		if (machineibmsoftlayerItemProvider == null) {
			machineibmsoftlayerItemProvider = new MachineibmsoftlayerItemProvider(this);
		}

		return machineibmsoftlayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinemicrosoftazureItemProvider machinemicrosoftazureItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinemicrosoftazure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinemicrosoftazureAdapter() {
		if (machinemicrosoftazureItemProvider == null) {
			machinemicrosoftazureItemProvider = new MachinemicrosoftazureItemProvider(this);
		}

		return machinemicrosoftazureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinemicrosofthypervItemProvider machinemicrosofthypervItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinemicrosofthyperv}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinemicrosofthypervAdapter() {
		if (machinemicrosofthypervItemProvider == null) {
			machinemicrosofthypervItemProvider = new MachinemicrosofthypervItemProvider(this);
		}

		return machinemicrosofthypervItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machineopenstack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineopenstackItemProvider machineopenstackItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machineopenstack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineopenstackAdapter() {
		if (machineopenstackItemProvider == null) {
			machineopenstackItemProvider = new MachineopenstackItemProvider(this);
		}

		return machineopenstackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinerackspace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinerackspaceItemProvider machinerackspaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinerackspace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinerackspaceAdapter() {
		if (machinerackspaceItemProvider == null) {
			machinerackspaceItemProvider = new MachinerackspaceItemProvider(this);
		}

		return machinerackspaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinevirtualbox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevirtualboxItemProvider machinevirtualboxItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinevirtualbox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinevirtualboxAdapter() {
		if (machinevirtualboxItemProvider == null) {
			machinevirtualboxItemProvider = new MachinevirtualboxItemProvider(this);
		}

		return machinevirtualboxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinevmwarefusion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevmwarefusionItemProvider machinevmwarefusionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinevmwarefusion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinevmwarefusionAdapter() {
		if (machinevmwarefusionItemProvider == null) {
			machinevmwarefusionItemProvider = new MachinevmwarefusionItemProvider(this);
		}

		return machinevmwarefusionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevmwarevcloudairItemProvider machinevmwarevcloudairItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinevmwarevcloudair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinevmwarevcloudairAdapter() {
		if (machinevmwarevcloudairItemProvider == null) {
			machinevmwarevcloudairItemProvider = new MachinevmwarevcloudairItemProvider(this);
		}

		return machinevmwarevcloudairItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachinevmwarevsphereItemProvider machinevmwarevsphereItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinevmwarevsphere}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinevmwarevsphereAdapter() {
		if (machinevmwarevsphereItemProvider == null) {
			machinevmwarevsphereItemProvider = new MachinevmwarevsphereItemProvider(this);
		}

		return machinevmwarevsphereItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machineexoscale} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineexoscaleItemProvider machineexoscaleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machineexoscale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineexoscaleAdapter() {
		if (machineexoscaleItemProvider == null) {
			machineexoscaleItemProvider = new MachineexoscaleItemProvider(this);
		}

		return machineexoscaleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Machinegrid5000} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machinegrid5000ItemProvider machinegrid5000ItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Machinegrid5000}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachinegrid5000Adapter() {
		if (machinegrid5000ItemProvider == null) {
			machinegrid5000ItemProvider = new Machinegrid5000ItemProvider(this);
		}

		return machinegrid5000ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.docker.Cluster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterItemProvider clusterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.docker.Cluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClusterAdapter() {
		if (clusterItemProvider == null) {
			clusterItemProvider = new ClusterItemProvider(this);
		}

		return clusterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (arrayOfStringItemProvider != null) arrayOfStringItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (networklinkItemProvider != null) networklinkItemProvider.dispose();
		if (volumesfromItemProvider != null) volumesfromItemProvider.dispose();
		if (containsItemProvider != null) containsItemProvider.dispose();
		if (machineItemProvider != null) machineItemProvider.dispose();
		if (volumeItemProvider != null) volumeItemProvider.dispose();
		if (networkItemProvider != null) networkItemProvider.dispose();
		if (machinegenericItemProvider != null) machinegenericItemProvider.dispose();
		if (machineamazonec2ItemProvider != null) machineamazonec2ItemProvider.dispose();
		if (machinedigitaloceanItemProvider != null) machinedigitaloceanItemProvider.dispose();
		if (machinegooglecomputeengineItemProvider != null) machinegooglecomputeengineItemProvider.dispose();
		if (machineibmsoftlayerItemProvider != null) machineibmsoftlayerItemProvider.dispose();
		if (machinemicrosoftazureItemProvider != null) machinemicrosoftazureItemProvider.dispose();
		if (machinemicrosofthypervItemProvider != null) machinemicrosofthypervItemProvider.dispose();
		if (machineopenstackItemProvider != null) machineopenstackItemProvider.dispose();
		if (machinerackspaceItemProvider != null) machinerackspaceItemProvider.dispose();
		if (machinevirtualboxItemProvider != null) machinevirtualboxItemProvider.dispose();
		if (machinevmwarefusionItemProvider != null) machinevmwarefusionItemProvider.dispose();
		if (machinevmwarevcloudairItemProvider != null) machinevmwarevcloudairItemProvider.dispose();
		if (machinevmwarevsphereItemProvider != null) machinevmwarevsphereItemProvider.dispose();
		if (machineexoscaleItemProvider != null) machineexoscaleItemProvider.dispose();
		if (machinegrid5000ItemProvider != null) machinegrid5000ItemProvider.dispose();
		if (clusterItemProvider != null) clusterItemProvider.dispose();
	}

}
