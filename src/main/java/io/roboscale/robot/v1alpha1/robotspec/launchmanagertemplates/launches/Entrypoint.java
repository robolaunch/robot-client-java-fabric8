package io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launches;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cmd","disableSourcingWs","executable","launchfile","package","parameters","prelaunch","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Entrypoint implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Custom command to launch packages or start nodes. Required if the launch type is `Custom`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cmd")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom command to launch packages or start nodes. Required if the launch type is `Custom`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cmd;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    /**
     * If `true`, workspaces are not sourced by default. Used if the launch type is `Custom`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableSourcingWs")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, workspaces are not sourced by default. Used if the launch type is `Custom`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableSourcingWs;

    public Boolean getDisableSourcingWs() {
        return disableSourcingWs;
    }

    public void setDisableSourcingWs(Boolean disableSourcingWs) {
        this.disableSourcingWs = disableSourcingWs;
    }

    /**
     * Executable file name. (eg. `webcam_pub.py`) Required and used if the launch type is `Run`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executable")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Executable file name. (eg. `webcam_pub.py`) Required and used if the launch type is `Run`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String executable;

    public String getExecutable() {
        return executable;
    }

    public void setExecutable(String executable) {
        this.executable = executable;
    }

    /**
     * Launchfile. (eg. `nav_launch.py`) Required and used if the launch type is `Launch`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launchfile")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launchfile. (eg. `nav_launch.py`) Required and used if the launch type is `Launch`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String launchfile;

    public String getLaunchfile() {
        return launchfile;
    }

    public void setLaunchfile(String launchfile) {
        this.launchfile = launchfile;
    }

    /**
     * Package name. (eg. `robolaunch_cloudy_navigation`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("package")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Package name. (eg. `robolaunch_cloudy_navigation`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _package;

    public String get_package() {
        return _package;
    }

    public void set_package(String _package) {
        this._package = _package;
    }

    /**
     * Launch parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> parameters;

    public java.util.Map<java.lang.String, String> getParameters() {
        return parameters;
    }

    public void setParameters(java.util.Map<java.lang.String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Command or script to run just before node's execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prelaunch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Command or script to run just before node's execution.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launches.entrypoint.Prelaunch prelaunch;

    public io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launches.entrypoint.Prelaunch getPrelaunch() {
        return prelaunch;
    }

    public void setPrelaunch(io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launches.entrypoint.Prelaunch prelaunch) {
        this.prelaunch = prelaunch;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("Launch")
        LAUNCH("Launch"), @com.fasterxml.jackson.annotation.JsonProperty("Run")
        RUN("Run"), @com.fasterxml.jackson.annotation.JsonProperty("Custom")
        CUSTOM("Custom");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Launching type. Can be `Launch`, `Run` or `Custom`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launching type. Can be `Launch`, `Run` or `Custom`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

