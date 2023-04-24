package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"display","launch","run"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LaunchManagerTemplates implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Launch processes connects an X11 socket if it's set to `true` and a target RobotVDI resource is set in labels with key `robolaunch.io/target-vdi`. Applications that requires GUI can be executed such as rViz.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch processes connects an X11 socket if it's set to `true` and a target RobotVDI resource is set in labels with key `robolaunch.io/target-vdi`. Applications that requires GUI can be executed such as rViz.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean display;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    /**
     * Launch descriptions. Every object defined here generates a `ros2 launch` command in the specified workspace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch descriptions. Every object defined here generates a `ros2 launch` command in the specified workspace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.Launch> launch;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.Launch> getLaunch() {
        return launch;
    }

    public void setLaunch(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.Launch> launch) {
        this.launch = launch;
    }

    /**
     * Every object defined here generates a `ros2 run` command in the specified workspace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("run")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Every object defined here generates a `ros2 run` command in the specified workspace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.Run> run;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.Run> getRun() {
        return run;
    }

    public void setRun(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.Run> run) {
        this.run = run;
    }
}

