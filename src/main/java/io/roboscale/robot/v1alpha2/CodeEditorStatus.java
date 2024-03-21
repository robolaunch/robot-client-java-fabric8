package io.roboscale.robot.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"deploymentStatus","externalVolumeStatuses","ingressStatus","phase","pvcStatuses","serviceStatus","workloadUpdateNeeded"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CodeEditorStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Status of code editor deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of code editor deployment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorstatus.DeploymentStatus deploymentStatus;

    public io.roboscale.robot.v1alpha2.codeeditorstatus.DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(io.roboscale.robot.v1alpha2.codeeditorstatus.DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * Statuses of external volumes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalVolumeStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Statuses of external volumes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.ExternalVolumeStatuses> externalVolumeStatuses;

    public java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.ExternalVolumeStatuses> getExternalVolumeStatuses() {
        return externalVolumeStatuses;
    }

    public void setExternalVolumeStatuses(java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.ExternalVolumeStatuses> externalVolumeStatuses) {
        this.externalVolumeStatuses = externalVolumeStatuses;
    }

    /**
     * Status of CodeEditor Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of CodeEditor Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorstatus.IngressStatus ingressStatus;

    public io.roboscale.robot.v1alpha2.codeeditorstatus.IngressStatus getIngressStatus() {
        return ingressStatus;
    }

    public void setIngressStatus(io.roboscale.robot.v1alpha2.codeeditorstatus.IngressStatus ingressStatus) {
        this.ingressStatus = ingressStatus;
    }

    /**
     * Phase of CodeEditor. It sums the general status of code editor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of CodeEditor. It sums the general status of code editor.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Statuses of owned PersistentVolumeClaims.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvcStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Statuses of owned PersistentVolumeClaims.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.PvcStatuses> pvcStatuses;

    public java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.PvcStatuses> getPvcStatuses() {
        return pvcStatuses;
    }

    public void setPvcStatuses(java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.PvcStatuses> pvcStatuses) {
        this.pvcStatuses = pvcStatuses;
    }

    /**
     * Status of code editor service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of code editor service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorstatus.ServiceStatus serviceStatus;

    public io.roboscale.robot.v1alpha2.codeeditorstatus.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(io.roboscale.robot.v1alpha2.codeeditorstatus.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     * Field to indicate if the workload should be restarted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadUpdateNeeded")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Field to indicate if the workload should be restarted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean workloadUpdateNeeded;

    public Boolean getWorkloadUpdateNeeded() {
        return workloadUpdateNeeded;
    }

    public void setWorkloadUpdateNeeded(Boolean workloadUpdateNeeded) {
        this.workloadUpdateNeeded = workloadUpdateNeeded;
    }
}

