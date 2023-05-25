package io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resource","url"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ServiceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.servicestatus.Resource resource;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.servicestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.servicestatus.Resource resource) {
        this.resource = resource;
    }

    /**
     * Connection URL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Connection URL.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

