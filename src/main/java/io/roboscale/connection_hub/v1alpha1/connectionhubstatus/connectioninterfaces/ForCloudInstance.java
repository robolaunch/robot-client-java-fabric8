package io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"credentials","isHost","server"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ForCloudInstance implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forcloudinstance.Credentials credentials;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forcloudinstance.Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forcloudinstance.Credentials credentials) {
        this.credentials = credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("isHost")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean isHost;

    public Boolean getIsHost() {
        return isHost;
    }

    public void setIsHost(Boolean isHost) {
        this.isHost = isHost;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String server;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}

