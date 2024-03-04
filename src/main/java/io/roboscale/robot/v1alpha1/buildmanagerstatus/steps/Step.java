package io.roboscale.robot.v1alpha1.buildmanagerstatus.steps;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"command","env","instances","name","scope","script"})
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
    private java.util.List<io.roboscale.robot.v1alpha1.buildmanagerstatus.steps.step.Env> env;

    public java.util.List<io.roboscale.robot.v1alpha1.buildmanagerstatus.steps.step.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.roboscale.robot.v1alpha1.buildmanagerstatus.steps.step.Env> env) {
        this.env = env;
    }

    /**
     * Cluster selector. If the current instance name is on the list, BuildManager creates building jobs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cluster selector. If the current instance name is on the list, BuildManager creates building jobs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> instances;

    public java.util.List<String> getInstances() {
        return instances;
    }

    public void setInstances(java.util.List<String> instances) {
        this.instances = instances;
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
     * Selects the scope for BuildManager step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects the scope for BuildManager step.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.buildmanagerstatus.steps.step.Scope scope;

    public io.roboscale.robot.v1alpha1.buildmanagerstatus.steps.step.Scope getScope() {
        return scope;
    }

    public void setScope(io.roboscale.robot.v1alpha1.buildmanagerstatus.steps.step.Scope scope) {
        this.scope = scope;
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
}

