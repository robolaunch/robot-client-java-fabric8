package io.roboscale.robot.v1alpha2.ros2bridgestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapName","ip","uri"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConnectionInfo implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the config map that holds discovery server configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the config map that holds discovery server configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String configMapName;

    public String getConfigMapName() {
        return configMapName;
    }

    public void setConfigMapName(String configMapName) {
        this.configMapName = configMapName;
    }

    /**
     * IP of the discovery server. IP is being obtained from the DNS name, which is being built according to the discovery server configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IP of the discovery server. IP is being obtained from the DNS name, which is being built according to the discovery server configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * URI of the discovery server. Discovery server instance tries to ping this address to see if it's reachable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI of the discovery server. Discovery server instance tries to ping this address to see if it's reachable.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}

