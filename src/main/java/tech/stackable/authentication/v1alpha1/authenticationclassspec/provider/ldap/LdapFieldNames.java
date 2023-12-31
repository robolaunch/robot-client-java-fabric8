package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"email","givenName","group","surname","uid"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LdapFieldNames implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The name of the email field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the email field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String email = "mail";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The name of the firstname field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("givenName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the firstname field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String givenName = "givenName";

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * The name of the group field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the group field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String group = "memberof";

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * The name of the lastname field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("surname")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the lastname field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String surname = "sn";

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * The name of the username field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the username field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uid = "uid";

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

