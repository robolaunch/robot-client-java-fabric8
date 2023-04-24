package io.roboscale.fleet.v1alpha1.fleetstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"federated","ready","resource"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NamespaceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Sets to `true` if the owned namespace is federated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("federated")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets to `true` if the owned namespace is federated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean federated;

    public Boolean getFederated() {
        return federated;
    }

    public void setFederated(Boolean federated) {
        this.federated = federated;
    }

    /**
     * Sets to `true` if the namespace is ready for the resources to be deployed such as robot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ready")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets to `true` if the namespace is ready for the resources to be deployed such as robot.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ready;

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    /**
     * Generic structure of the most recent status of an owned object. For detailed information, refer the document for the API group `robot.roboscale.io`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic structure of the most recent status of an owned object. For detailed information, refer the document for the API group `robot.roboscale.io`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetstatus.namespacestatus.Resource resource;

    public io.roboscale.fleet.v1alpha1.fleetstatus.namespacestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.fleet.v1alpha1.fleetstatus.namespacestatus.Resource resource) {
        this.resource = resource;
    }
}

