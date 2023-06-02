package io.roboscale.dev.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"attachedDevObjects","devSuiteStatus","image","loaderJobStatus","nodeName","phase","volumeStatuses","workspaceManagerStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DevSpaceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [*alpha*] Attached dev object information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedDevObjects")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Attached dev object information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.dev.v1alpha1.devspacestatus.AttachedDevObjects> attachedDevObjects;

    public java.util.List<io.roboscale.dev.v1alpha1.devspacestatus.AttachedDevObjects> getAttachedDevObjects() {
        return attachedDevObjects;
    }

    public void setAttachedDevObjects(java.util.List<io.roboscale.dev.v1alpha1.devspacestatus.AttachedDevObjects> attachedDevObjects) {
        this.attachedDevObjects = attachedDevObjects;
    }

    /**
     * DevSpace development suite instance status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devSuiteStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DevSpace development suite instance status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.DevSuiteStatus devSuiteStatus;

    public io.roboscale.dev.v1alpha1.devspacestatus.DevSuiteStatus getDevSuiteStatus() {
        return devSuiteStatus;
    }

    public void setDevSuiteStatus(io.roboscale.dev.v1alpha1.devspacestatus.DevSuiteStatus devSuiteStatus) {
        this.devSuiteStatus = devSuiteStatus;
    }

    /**
     * Main image of DevSpace. It is derived either from the specifications or determined directly over labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Main image of DevSpace. It is derived either from the specifications or determined directly over labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Status of loader job that configures environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loaderJobStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of loader job that configures environment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.LoaderJobStatus loaderJobStatus;

    public io.roboscale.dev.v1alpha1.devspacestatus.LoaderJobStatus getLoaderJobStatus() {
        return loaderJobStatus;
    }

    public void setLoaderJobStatus(io.roboscale.dev.v1alpha1.devspacestatus.LoaderJobStatus loaderJobStatus) {
        this.loaderJobStatus = loaderJobStatus;
    }

    /**
     * Node that DevSpace uses. It is selected via tenancy labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Node that DevSpace uses. It is selected via tenancy labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Phase of DevSpace. It sums the general status of DevSpace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of DevSpace. It sums the general status of DevSpace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * DevSpace persists some of the directories of underlying OS inside persistent volumes. This field exposes persistent volume claims that dynamically provision PVs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DevSpace persists some of the directories of underlying OS inside persistent volumes. This field exposes persistent volume claims that dynamically provision PVs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.VolumeStatuses volumeStatuses;

    public io.roboscale.dev.v1alpha1.devspacestatus.VolumeStatuses getVolumeStatuses() {
        return volumeStatuses;
    }

    public void setVolumeStatuses(io.roboscale.dev.v1alpha1.devspacestatus.VolumeStatuses volumeStatuses) {
        this.volumeStatuses = volumeStatuses;
    }

    /**
     * Workspace manager instance status if exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceManagerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace manager instance status if exists.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.WorkspaceManagerStatus workspaceManagerStatus;

    public io.roboscale.dev.v1alpha1.devspacestatus.WorkspaceManagerStatus getWorkspaceManagerStatus() {
        return workspaceManagerStatus;
    }

    public void setWorkspaceManagerStatus(io.roboscale.dev.v1alpha1.devspacestatus.WorkspaceManagerStatus workspaceManagerStatus) {
        this.workspaceManagerStatus = workspaceManagerStatus;
    }
}

