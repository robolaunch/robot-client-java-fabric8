package io.roboscale.robot.v1alpha2.codeeditorstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resource","urls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ServiceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorstatus.servicestatus.Resource resource;

    public io.roboscale.robot.v1alpha2.codeeditorstatus.servicestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha2.codeeditorstatus.servicestatus.Resource resource) {
        this.resource = resource;
    }

    /**
     * Connection URL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("urls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Connection URL.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> urls;

    public java.util.Map<java.lang.String, String> getUrls() {
        return urls;
    }

    public void setUrls(java.util.Map<java.lang.String, String> urls) {
        this.urls = urls;
    }
}

