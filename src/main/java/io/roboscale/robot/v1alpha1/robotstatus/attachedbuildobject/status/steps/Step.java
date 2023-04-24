package io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"command","env","name","script","selector","workspace"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Step implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Bash command to run. Assume that your command will be `/bin/bash -c <COMMAND>`. Use logical operators (eg. `&&`) and pipes if the multiple dependent commands will be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bash command to run. Assume that your command will be `/bin/bash -c <COMMAND>`. Use logical operators (eg. `&&`) and pipes if the multiple dependent commands will be executed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * Environment variables for step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Environment variables for step.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.step.Env> env;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.step.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.steps.step.Env> env) {
        this.env = env;
    }

    /**
     * Name of the step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the step.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Bash script to run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("script")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bash script to run.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String script;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    /**
     * Cluster selector. If empty, step will be executed. If `robolaunch.io/cloud-instance` is specified only, step will be running on the cloud instance. If `robolaunch.io/physical-instance` is specified only, step will be running on the physical instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cluster selector. If empty, step will be executed. If `robolaunch.io/cloud-instance` is specified only, step will be running on the cloud instance. If `robolaunch.io/physical-instance` is specified only, step will be running on the physical instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> selector;

    public java.util.Map<java.lang.String, String> getSelector() {
        return selector;
    }

    public void setSelector(java.util.Map<java.lang.String, String> selector) {
        this.selector = selector;
    }

    /**
     * Name of the workspace. Should be selected among the existing workspaces in WorkspaceManager's manifests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspace")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the workspace. Should be selected among the existing workspaces in WorkspaceManager's manifests.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workspace;

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
}

