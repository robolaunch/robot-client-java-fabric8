package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"userCredentialsSecret"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Static implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Secret providing the usernames and passwords. The Secret must contain an entry for every user, with the key being the username and the value the password in plain text. It must be located in the same namespace as the product using it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userCredentialsSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Secret providing the usernames and passwords. The Secret must contain an entry for every user, with the key being the username and the value the password in plain text. It must be located in the same namespace as the product using it.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.static.UserCredentialsSecret userCredentialsSecret;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.static.UserCredentialsSecret getUserCredentialsSecret() {
        return userCredentialsSecret;
    }

    public void setUserCredentialsSecret(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.static.UserCredentialsSecret userCredentialsSecret) {
        this.userCredentialsSecret = userCredentialsSecret;
    }
}

