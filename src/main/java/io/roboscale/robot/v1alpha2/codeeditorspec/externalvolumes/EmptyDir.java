package io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"medium","sizeLimit"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class EmptyDir implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * medium represents what type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("medium represents what type of storage medium should back this directory.\nThe default is \"\" which means to use the node's default medium.\nMust be an empty string (default) or Memory.\nMore info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String medium;

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     * sizeLimit is the total amount of local storage required for this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value between
     * the SizeLimit specified here and the sum of memory limits of all containers in a pod.
     * The default is nil which means that the limit is undefined.
     * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeLimit")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("sizeLimit is the total amount of local storage required for this EmptyDir volume.\nThe size limit is also applicable for memory medium.\nThe maximum usage on memory medium EmptyDir would be the minimum value between\nthe SizeLimit specified here and the sum of memory limits of all containers in a pod.\nThe default is nil which means that the limit is undefined.\nMore info: http://kubernetes.io/docs/user-guide/volumes#emptydir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString sizeLimit;

    public io.fabric8.kubernetes.api.model.IntOrString getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(io.fabric8.kubernetes.api.model.IntOrString sizeLimit) {
        this.sizeLimit = sizeLimit;
    }
}

