package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"phase","podStatus","roleBindingStatus","roleStatus","saStatus","usage"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class MetricsExporterStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Phase of MetricsExporter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of MetricsExporter.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Status of MetricsExporter pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of MetricsExporter pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.PodStatus podStatus;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(io.roboscale.robot.v1alpha1.metricsexporterstatus.PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    /**
     * Status of role binding created for main and sidecar applications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roleBindingStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of role binding created for main and sidecar applications.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.RoleBindingStatus roleBindingStatus;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.RoleBindingStatus getRoleBindingStatus() {
        return roleBindingStatus;
    }

    public void setRoleBindingStatus(io.roboscale.robot.v1alpha1.metricsexporterstatus.RoleBindingStatus roleBindingStatus) {
        this.roleBindingStatus = roleBindingStatus;
    }

    /**
     * Status of role created for main and sidecar applications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roleStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of role created for main and sidecar applications.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.RoleStatus roleStatus;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.RoleStatus getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(io.roboscale.robot.v1alpha1.metricsexporterstatus.RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * Status of service account created for main and sidecar applications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("saStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of service account created for main and sidecar applications.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.SaStatus saStatus;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.SaStatus getSaStatus() {
        return saStatus;
    }

    public void setSaStatus(io.roboscale.robot.v1alpha1.metricsexporterstatus.SaStatus saStatus) {
        this.saStatus = saStatus;
    }

    /**
     * Usage metrics.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Usage metrics.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.Usage usage;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.Usage getUsage() {
        return usage;
    }

    public void setUsage(io.roboscale.robot.v1alpha1.metricsexporterstatus.Usage usage) {
        this.usage = usage;
    }
}

