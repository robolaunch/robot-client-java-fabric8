package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"launches"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LaunchManagerSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Launch descriptions.
     * Every object defined here generates a launching command in the specified workspace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launches")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch descriptions.\nEvery object defined here generates a launching command in the specified workspace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Launches> launches;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Launches> getLaunches() {
        return launches;
    }

    public void setLaunches(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Launches> launches) {
        this.launches = launches;
    }
}

