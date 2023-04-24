package io.roboscale.fleet.v1alpha1.fleetspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cluster","hostname","reference","subdomain","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DiscoveryServerTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Cloud instance name that holds DiscoveryServer instance with `Server` type. Should be empty if the type is `Server` since it takes cloud instance's name automatically. Should be set if the type is `Client`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cloud instance name that holds DiscoveryServer instance with `Server` type. Should be empty if the type is `Server` since it takes cloud instance's name automatically. Should be set if the type is `Client`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cluster;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * If instance type is `Server`, it can be an arbitrary value. If instance type is `Client`, it should be the same with Server's hostname. Used for getting Server's IP over DNS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If instance type is `Server`, it can be an arbitrary value. If instance type is `Client`, it should be the same with Server's hostname. Used for getting Server's IP over DNS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Reference to the `Server` instance. It is used if `.spec.type` is `Client`. Referenced object can be previously provisioned in another cluster. In that case, cluster's name can be specified in `.spec.cluster` field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the `Server` instance. It is used if `.spec.type` is `Client`. Referenced object can be previously provisioned in another cluster. In that case, cluster's name can be specified in `.spec.cluster` field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.fleet.v1alpha1.fleetspec.discoveryservertemplate.Reference reference;

    public io.roboscale.fleet.v1alpha1.fleetspec.discoveryservertemplate.Reference getReference() {
        return reference;
    }

    public void setReference(io.roboscale.fleet.v1alpha1.fleetspec.discoveryservertemplate.Reference reference) {
        this.reference = reference;
    }

    /**
     * If instance type is `Server`, it can be an arbitrary value. If instance type is `Client`, it should be the same with Server's subdomain. Used for getting Server's IP over DNS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subdomain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If instance type is `Server`, it can be an arbitrary value. If instance type is `Client`, it should be the same with Server's subdomain. Used for getting Server's IP over DNS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subdomain;

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * Instance type can be either `Server` or `Client`. If `Server`, instance creates discovery server resources and workloads. Other `Client` instances can connect to the `Server` instance. If `Client`, instance tries to connect a `Server` instance and hold `Server` configuration in a ConfigMap.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Instance type can be either `Server` or `Client`. If `Server`, instance creates discovery server resources and workloads. Other `Client` instances can connect to the `Server` instance. If `Client`, instance tries to connect a `Server` instance and hold `Server` configuration in a ConfigMap.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

