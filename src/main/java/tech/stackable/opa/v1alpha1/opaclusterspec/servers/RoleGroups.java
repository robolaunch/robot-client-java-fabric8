package tech.stackable.opa.v1alpha1.opaclusterspec.servers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cliOverrides","config","configOverrides","envOverrides","podOverrides","replicas","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RoleGroups implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cliOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> cliOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getCliOverrides() {
        return cliOverrides;
    }

    public void setCliOverrides(java.util.Map<java.lang.String, String> cliOverrides) {
        this.cliOverrides = cliOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Config config = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Config.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Config getConfig() {
        return config;
    }

    public void setConfig(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Config config) {
        this.config = config;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> configOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> getConfigOverrides() {
        return configOverrides;
    }

    public void setConfigOverrides(java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> configOverrides) {
        this.configOverrides = configOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("envOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> envOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getEnvOverrides() {
        return envOverrides;
    }

    public void setEnvOverrides(java.util.Map<java.lang.String, String> envOverrides) {
        this.envOverrides = envOverrides;
    }

    /**
     * See PodTemplateSpec (https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.27/#podtemplatespec-v1-core) for more details
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podOverrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("See PodTemplateSpec (https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.27/#podtemplatespec-v1-core) for more details")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.PodOverrides podOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.PodOverrides.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.PodOverrides getPodOverrides() {
        return podOverrides;
    }

    public void setPodOverrides(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.PodOverrides podOverrides) {
        this.podOverrides = podOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long replicas;

    public Long getReplicas() {
        return replicas;
    }

    public void setReplicas(Long replicas) {
        this.replicas = replicas;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Selector selector;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Selector getSelector() {
        return selector;
    }

    public void setSelector(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.Selector selector) {
        this.selector = selector;
    }
}
