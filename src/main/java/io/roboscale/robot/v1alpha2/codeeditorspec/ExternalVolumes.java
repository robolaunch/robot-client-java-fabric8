package io.roboscale.robot.v1alpha2.codeeditorspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"awsElasticBlockStore","azureDisk","azureFile","cephfs","cinder","configMap","csi","downwardAPI","emptyDir","ephemeral","fc","flexVolume","flocker","gcePersistentDisk","gitRepo","glusterfs","hostPath","iscsi","name","nfs","persistentVolumeClaim","photonPersistentDisk","portworxVolume","projected","quobyte","rbd","scaleIO","secret","storageos","vsphereVolume"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ExternalVolumes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("awsElasticBlockStore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AwsElasticBlockStore awsElasticBlockStore;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AzureDisk azureDisk;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureFile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureFile represents an Azure File Service mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AzureFile azureFile;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cephfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Cephfs cephfs;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Cephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cinder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Cinder cinder;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Cinder getCinder() {
        return cinder;
    }

    public void setCinder(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Cinder cinder) {
        this.cinder = cinder;
    }

    /**
     * configMap represents a configMap that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configMap represents a configMap that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ConfigMap configMap;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Csi csi;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Csi getCsi() {
        return csi;
    }

    public void setCsi(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Csi csi) {
        this.csi = csi;
    }

    /**
     * downwardAPI represents downward API about the pod that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("downwardAPI represents downward API about the pod that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.DownwardAPI downwardAPI;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.EmptyDir emptyDir;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.EmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
     *  Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the connection between this volume type and PersistentVolumeClaim).
     *  Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
     *  Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
     *  A pod can use both types of ephemeral volumes and persistent volumes at the same time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed. \n Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the connection between this volume type and PersistentVolumeClaim). \n Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod. \n Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information. \n A pod can use both types of ephemeral volumes and persistent volumes at the same time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Ephemeral ephemeral;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Fc fc;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Fc getFc() {
        return fc;
    }

    public void setFc(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Fc fc) {
        this.fc = fc;
    }

    /**
     * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flexVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.FlexVolume flexVolume;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.FlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flocker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Flocker flocker;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Flocker getFlocker() {
        return flocker;
    }

    public void setFlocker(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Flocker flocker) {
        this.flocker = flocker;
    }

    /**
     * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gcePersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.GcePersistentDisk gcePersistentDisk;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gitRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.GitRepo gitRepo;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.GitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("glusterfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Glusterfs glusterfs;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Glusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.HostPath hostPath;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.HostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.HostPath hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Iscsi iscsi;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Iscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Iscsi iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Nfs nfs;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Nfs getNfs() {
        return nfs;
    }

    public void setNfs(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Nfs nfs) {
        this.nfs = nfs;
    }

    /**
     * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PersistentVolumeClaim persistentVolumeClaim;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photonPersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PhotonPersistentDisk photonPersistentDisk;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portworxVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("portworxVolume represents a portworx volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PortworxVolume portworxVolume;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * projected items for all in one resources secrets, configmaps, and downward API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projected")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("projected items for all in one resources secrets, configmaps, and downward API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Projected projected;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Projected getProjected() {
        return projected;
    }

    public void setProjected(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Projected projected) {
        this.projected = projected;
    }

    /**
     * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quobyte")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Quobyte quobyte;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Quobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rbd")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Rbd rbd;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Rbd getRbd() {
        return rbd;
    }

    public void setRbd(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Rbd rbd) {
        this.rbd = rbd;
    }

    /**
     * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scaleIO")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ScaleIO scaleIO;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Secret secret;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Secret secret) {
        this.secret = secret;
    }

    /**
     * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageos")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Storageos storageos;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Storageos getStorageos() {
        return storageos;
    }

    public void setStorageos(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.Storageos storageos) {
        this.storageos = storageos;
    }

    /**
     * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.VsphereVolume vsphereVolume;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }
}

