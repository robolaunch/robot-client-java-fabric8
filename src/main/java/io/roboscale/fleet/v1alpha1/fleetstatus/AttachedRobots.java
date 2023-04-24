package io.roboscale.fleet.v1alpha1.fleetstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fleetCompatibility","phase","reference"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AttachedRobots implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Compatibility status of attached robot with the fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetCompatibility")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Compatibility status of attached robot with the fleet.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetstatus.attachedrobots.FleetCompatibility fleetCompatibility;

    public io.roboscale.fleet.v1alpha1.fleetstatus.attachedrobots.FleetCompatibility getFleetCompatibility() {
        return fleetCompatibility;
    }

    public void setFleetCompatibility(io.roboscale.fleet.v1alpha1.fleetstatus.attachedrobots.FleetCompatibility fleetCompatibility) {
        this.fleetCompatibility = fleetCompatibility;
    }

    /**
     * Attached robot phase. For detailed information, refer the document for the API group `robot.roboscale.io`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached robot phase. For detailed information, refer the document for the API group `robot.roboscale.io`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Resource reference for attached robot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resource reference for attached robot.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetstatus.attachedrobots.Reference reference;

    public io.roboscale.fleet.v1alpha1.fleetstatus.attachedrobots.Reference getReference() {
        return reference;
    }

    public void setReference(io.roboscale.fleet.v1alpha1.fleetstatus.attachedrobots.Reference reference) {
        this.reference = reference;
    }
}

