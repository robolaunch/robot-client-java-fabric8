package io.roboscale.connection_hub.v1alpha1.physicalinstancestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"list","listInStr"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Subnets implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("list")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> list;

    public java.util.List<String> getList() {
        return list;
    }

    public void setList(java.util.List<String> list) {
        this.list = list;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("listInStr")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String listInStr;

    public String getListInStr() {
        return listInStr;
    }

    public void setListInStr(String listInStr) {
        this.listInStr = listInStr;
    }
}

