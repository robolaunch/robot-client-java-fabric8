package io.roboscale.robot.v1alpha1.buildmanagerspec.steps;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"name","value","valueFrom"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Env implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the environment variable. Must be a C_IDENTIFIER.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded
     * using the previously defined environment variables in the container and
     * any service environment variables. If a variable cannot be resolved,
     * the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e.
     * "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)".
     * Escaped references will never be expanded, regardless of whether the variable
     * exists or not.
     * Defaults to "".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Variable references $(VAR_NAME) are expanded\nusing the previously defined environment variables in the container and\nany service environment variables. If a variable cannot be resolved,\nthe reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e.\n\"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\".\nEscaped references will never be expanded, regardless of whether the variable\nexists or not.\nDefaults to \"\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Source for the environment variable's value. Cannot be used if value is not empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source for the environment variable's value. Cannot be used if value is not empty.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.buildmanagerspec.steps.env.ValueFrom valueFrom;

    public io.roboscale.robot.v1alpha1.buildmanagerspec.steps.env.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(io.roboscale.robot.v1alpha1.buildmanagerspec.steps.env.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }
}

