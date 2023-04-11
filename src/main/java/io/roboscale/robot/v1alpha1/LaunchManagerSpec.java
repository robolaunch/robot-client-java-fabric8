package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"display","launch","run"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LaunchManagerSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Display connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Display connection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean display;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("launch")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Launch> launch;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Launch> getLaunch() {
        return launch;
    }

    public void setLaunch(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Launch> launch) {
        this.launch = launch;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("run")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Run> run;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Run> getRun() {
        return run;
    }

    public void setRun(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerspec.Run> run) {
        this.run = run;
    }
}

