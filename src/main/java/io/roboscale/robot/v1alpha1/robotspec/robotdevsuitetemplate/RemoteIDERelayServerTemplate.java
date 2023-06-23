package io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"hostname","instanceName","remoteNamespace","remotePort","rootDNSConfig","subdomain","tlsSecretRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RemoteIDERelayServerTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Hostname of the remote pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname of the remote pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Remote instance name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Remote instance name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String instanceName;

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * Remote namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Remote namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String remoteNamespace;

    public String getRemoteNamespace() {
        return remoteNamespace;
    }

    public void setRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
    }

    /**
     * Remote port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remotePort")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Remote port.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long remotePort;

    public Long getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Long remotePort) {
        this.remotePort = remotePort;
    }

    /**
     * [*alpha*] Root DNS configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootDNSConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Root DNS configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.remoteiderelayservertemplate.RootDNSConfig rootDNSConfig;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.remoteiderelayservertemplate.RootDNSConfig getRootDNSConfig() {
        return rootDNSConfig;
    }

    public void setRootDNSConfig(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.remoteiderelayservertemplate.RootDNSConfig rootDNSConfig) {
        this.rootDNSConfig = rootDNSConfig;
    }

    /**
     * Subdomain of the remote pod. It's also same with remote service's name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subdomain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Subdomain of the remote pod. It's also same with remote service's name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subdomain;

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * [*alpha*] TLS secret reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] TLS secret reference.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.remoteiderelayservertemplate.TlsSecretRef tlsSecretRef;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.remoteiderelayservertemplate.TlsSecretRef getTlsSecretRef() {
        return tlsSecretRef;
    }

    public void setTlsSecretRef(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.remoteiderelayservertemplate.TlsSecretRef tlsSecretRef) {
        this.tlsSecretRef = tlsSecretRef;
    }
}

