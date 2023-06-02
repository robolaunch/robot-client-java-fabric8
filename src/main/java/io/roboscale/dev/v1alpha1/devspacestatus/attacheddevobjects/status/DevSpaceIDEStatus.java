package io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connection","resource"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DevSpaceIDEStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Address of the devspace service that can be reached from outside.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Address of the devspace service that can be reached from outside.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String connection;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.status.devspaceidestatus.Resource resource;

    public io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.status.devspaceidestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.status.devspaceidestatus.Resource resource) {
        this.resource = resource;
    }
}

