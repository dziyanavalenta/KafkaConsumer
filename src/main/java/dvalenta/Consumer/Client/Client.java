package dvalenta.Consumer.Client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
public class Client {
   private Long clientId;
   private String email;

   public Client(
           @JsonProperty("clientId") Long clientId,
           @JsonProperty("email") String email
   ) {
      this.clientId = clientId;
      this.email = email;
   }

}