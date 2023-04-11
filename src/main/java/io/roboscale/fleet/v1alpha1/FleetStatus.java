package io.roboscale.fleet.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"attachedRobots","discoveryServerStatus","namespaceStatus","phase"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FleetStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Attached launch object information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedRobots")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached launch object information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.fleet.v1alpha1.fleetstatus.AttachedRobots> attachedRobots;

    public java.util.List<io.roboscale.fleet.v1alpha1.fleetstatus.AttachedRobots> getAttachedRobots() {
        return attachedRobots;
    }

    public void setAttachedRobots(java.util.List<io.roboscale.fleet.v1alpha1.fleetstatus.AttachedRobots> attachedRobots) {
        this.attachedRobots = attachedRobots;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetstatus.DiscoveryServerStatus discoveryServerStatus;

    public io.roboscale.fleet.v1alpha1.fleetstatus.DiscoveryServerStatus getDiscoveryServerStatus() {
        return discoveryServerStatus;
    }

    public void setDiscoveryServerStatus(io.roboscale.fleet.v1alpha1.fleetstatus.DiscoveryServerStatus discoveryServerStatus) {
        this.discoveryServerStatus = discoveryServerStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaceStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetstatus.NamespaceStatus namespaceStatus;

    public io.roboscale.fleet.v1alpha1.fleetstatus.NamespaceStatus getNamespaceStatus() {
        return namespaceStatus;
    }

    public void setNamespaceStatus(io.roboscale.fleet.v1alpha1.fleetstatus.NamespaceStatus namespaceStatus) {
        this.namespaceStatus = namespaceStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }
}

